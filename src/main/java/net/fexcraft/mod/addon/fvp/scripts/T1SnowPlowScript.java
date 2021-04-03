package net.fexcraft.mod.addon.fvp.scripts;

import net.fexcraft.lib.mc.utils.Pos;
import net.fexcraft.mod.fvtm.data.Seat;
import net.fexcraft.mod.fvtm.data.vehicle.VehicleData;
import net.fexcraft.mod.fvtm.data.vehicle.VehicleEntity;
import net.fexcraft.mod.fvtm.data.vehicle.VehicleScript;
import net.fexcraft.mod.fvtm.sys.uni.KeyPress;
import net.fexcraft.mod.fvtm.util.Axis3D;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.relauncher.Side;

public class T1SnowPlowScript extends VehicleScript {
	

	@Override
	public String getId(){
		return "t1_snowplow";
	}

	@Override
	public String getName(){
		return "T1 Snowplow Script";
	}

	@Override
	public void onUpdate(Entity entity, VehicleData data){
        VehicleEntity vehicle = (VehicleEntity) entity;
        if(!entity.world.isRemote){
            if(data.getAttribute("t1_snowplow_state").boolean_value()){
                Vec3d[] pos = new Vec3d[6];
                pos[0] = calculate(vehicle.getRotPoint().getAxes(), entity, 2);
                pos[1] = calculate(vehicle.getRotPoint().getAxes(), entity, 1);
                pos[2] = calculate(vehicle.getRotPoint().getAxes(), entity, 0);
                pos[3] = calculate(vehicle.getRotPoint().getAxes(), entity, -1);
                pos[4] = calculate(vehicle.getRotPoint().getAxes(), entity, -2);
                pos[5] = calculate(vehicle.getRotPoint().getAxes(), entity, 3);
                IBlockState[] states = new IBlockState[6];
                int j = 0;
                for(int i = 0; i < 6; i++){
                    BlockPos poss = new BlockPos(new Vec3d(pos[i].x, pos[i].y, pos[i].z));
                    states[i] = entity.world.getBlockState(poss);
                    if(i < 5){
                        if(states[i].getMaterial() == Material.SNOW){
                            entity.world.setBlockState(new BlockPos(poss), Blocks.AIR.getDefaultState(), 2);
                            j++;
                        }
                        else if(states[i].getMaterial().isReplaceable() || states[i].getMaterial() == Material.CACTUS || states[i].getMaterial() == Material.CIRCUITS){
                            entity.world.setBlockState(new BlockPos(poss), Blocks.AIR.getDefaultState(), 2);
                        }
                    }
                    if(i == 5 && j > 0 && states[i].getMaterial().isReplaceable()){
                        entity.world.setBlockState(poss, Blocks.SNOW_LAYER.getDefaultState().withProperty(BlockSnow.LAYERS, j), 2);
                    }
                }
            }
            else{
                //
            }
        }
	}

    private static final Vec3d calculate(Axis3D axes, Entity ent, int i){
        Pos pos = new Pos(70, 4, i * 16); Vec3d rel = axes.getRelativeVector(pos.to16Double());
        return new Vec3d(ent.posX + rel.x, ent.posY + rel.y, ent.posZ + rel.z);
    }

	@Override
	public VehicleScript read(VehicleData data, NBTTagCompound compound){
		return this;
	}

	@Override
	public NBTTagCompound write(VehicleData data, NBTTagCompound compound){
		return null;
	}

	@Override
	public void onSpawn(Entity entity, VehicleData data){
		//
	}

	@Override
	public void onRemove(Entity entity, VehicleData data){
		//
	}

	@Override
	public boolean onKeyPress(KeyPress key, Seat seat, EntityPlayer player){
		return false;
	}

	@Override
	public boolean onInteract(Entity entity, VehicleData data, EntityPlayer player, EnumHand hand){
		return false;
	}

	@Override
	public void onDataPacket(Entity entity, VehicleData data, NBTTagCompound compound, Side side){
		//
	}

}
