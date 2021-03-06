package net.fexcraft.mod.addon.fvp.models.part.t1;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.data.attribute.Attribute;
import net.fexcraft.mod.fvtm.data.root.RenderCache;
import net.fexcraft.mod.fvtm.data.vehicle.VehicleData;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.minecraft.entity.Entity;

@fModel(registryname = "fvp:models/part/t1_snow_plow")
public class T1SnowPlow extends PartModel {
	
	private TurboList body, snowplow;

    public T1SnowPlow(){
    	super(); textureX = 512; textureY = 128;
        addToCreators("Ferdinand (FEX___96)");
        ModelRendererTurbo[] body = new ModelRendererTurbo[1];
        body[0] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 9
        body[0].addShapeBox(0F, 0F, -24F, 4, 7, 48, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 9
        body[0].setRotationPoint(56F, -4.5F, 0F);
        this.add("body", body); this.body = this.get("body");
        //
        ModelRendererTurbo[] snowplow = new ModelRendererTurbo[13];
        snowplow[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
        snowplow[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 1
        snowplow[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 2
        snowplow[3] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 3
        snowplow[4] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 4
        snowplow[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
        snowplow[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
        snowplow[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 7
        snowplow[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 8
        snowplow[9] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 10
        snowplow[10] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 11
        snowplow[11] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 12
        snowplow[12] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 13
        snowplow[0].addShapeBox(5F, -3F, -27.5F, 2, 6, 56, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 0
        snowplow[0].setRotationPoint(58F, -5F, 0F);
        snowplow[1].addShapeBox(5F, 3F, -27.5F, 2, 6, 56, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F); // Box 1
        snowplow[1].setRotationPoint(58F, -5F, 0F);
        snowplow[2].addShapeBox(6F, 9F, -27.5F, 2, 6, 56, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F); // Box 2
        snowplow[2].setRotationPoint(58F, -5F, 0F);
        snowplow[3].addShapeBox(5F, -6F, -27.5F, 2, 3, 56, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 3
        snowplow[3].setRotationPoint(58F, -5F, 0F);
        snowplow[4].addShapeBox(10.5F, 14F, -28F, 1, 1, 57, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, 0F, 7F, 0F, 0F, -6F, 0F, -0.3F); // Box 4
        snowplow[4].setRotationPoint(58F, -5F, 0F);
        snowplow[5].addBox(-2F, 4F, -13.5F, 10, 2, 4, 0F); // Box 5
        snowplow[5].setRotationPoint(58F, -5F, 0F);
        snowplow[6].addBox(-2F, 4F, 10.5F, 12, 2, 4, 0F); // Box 6
        snowplow[6].setRotationPoint(58F, -5F, 0F);
        snowplow[7].addShapeBox(-2F, -2F, 17.5F, 12, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 7
        snowplow[7].setRotationPoint(58F, -5F, 0F);
        snowplow[8].addShapeBox(-2F, -3F, -20.5F, 9, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 8
        snowplow[8].setRotationPoint(58F, -5F, 0F);
        snowplow[9].addShapeBox(12F, -8F, 21.5F, 1, 2, 4, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
        snowplow[9].setRotationPoint(58F, -5F, 0F);
        snowplow[10].addShapeBox(8F, -8F, -24.5F, 1, 2, 4, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
        snowplow[10].setRotationPoint(58F, -5F, 0F);
        snowplow[11].addShapeBox(13F, -8F, 21.5F, 1, 2, 4, 0F, 0F, -0.2F, -0.2F, -0.8F, -0.45F, -0.45F, -0.8F, -0.45F, -0.45F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.8F, -0.45F, -0.45F, -0.8F, -0.45F, -0.45F, 0F, -0.2F, -0.2F); // Box 12
        snowplow[11].setRotationPoint(58F, -5F, 0F);
        snowplow[12].addShapeBox(9F, -8F, -24.5F, 1, 2, 4, 0F, 0F, -0.2F, -0.2F, -0.8F, -0.45F, -0.45F, -0.8F, -0.45F, -0.45F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.8F, -0.45F, -0.45F, -0.8F, -0.45F, -0.45F, 0F, -0.2F, -0.2F); // Box 13
        snowplow[12].setRotationPoint(58F, -5F, 0F);
        this.add("snowplow", snowplow); this.snowplow = this.get("snowplow");
    }

    @Override
    public void render(VehicleData data, String us){
        body.render(null, data, data, us, null);
        snowplow.rotate(0, 0, 20f, true);
        snowplow.render(null, data, data, us, null);
    }

    @Override
    public void render(VehicleData data, String us, Entity vehicle, RenderCache cache){
        body.render(null, data, data, us, cache);
        Attribute<?> attr = data.getAttribute("t1_snowplow_state");
        snowplow.rotate(0, 0, attr == null ? 0 : attr.conditional_boolean(0f, 20f), true);
        snowplow.render(null, data, data, us, cache);
    }

}
