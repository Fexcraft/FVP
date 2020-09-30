//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.part.c12;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.data.root.Attribute;
import net.fexcraft.mod.fvtm.data.root.Colorable;
import net.fexcraft.mod.fvtm.data.root.RenderCache;
import net.fexcraft.mod.fvtm.data.vehicle.VehicleData;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.minecraft.entity.Entity;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c12_interior")
public class C12Interior extends PartModel {

	public C12Interior(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList interior = new TurboList("interior");
		interior.add(new ModelRendererTurbo(interior, 463, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0)
			.setRotationPoint(10.5f, -7, -2.5f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 407, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 42, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0)
			.setRotationPoint(9, -10, -21).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 248, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 42, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12, -10, -21).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 100, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0)
			.setRotationPoint(9, -10, -22).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 135, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12, -10, -22).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 347, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, -1, -1.5f, 0)
			.setRotationPoint(9, -10, 21).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 124, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12, -10, 21).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 173, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 2, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(6, -10, 10).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 316, 81, textureX, textureY).addBox(0, 0, 0, 27, 3, 5)
			.setRotationPoint(-13.5f, 3, -2.5f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 171, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3.5f, 2.5f, -2).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 0, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 4, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7, 2, -2).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 16, 43, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(8.875f, -9.5f, 15.25f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 12, 43, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(8.875f, -8, 15.25f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 8, 43, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(8.875f, -9.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 4, 43, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(8.875f, -8, 4.5f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 508, 41, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(8.875f, -8, 3).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 289, 43, textureX, textureY).addBox(0, 0, 0, 1, 1, 5)
			.setRotationPoint(8.875f, -9.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 267, 43, textureX, textureY).addBox(0, 0, 0, 1, 1, 5)
			.setRotationPoint(8.875f, -8, -2.5f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 395, 41, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(8.875f, -9.5f, -4).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 161, 40, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(8.875f, -8, -4).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 41, 43, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(8.875f, -9.5f, 16.75f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 37, 43, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(8.875f, -8, 16.75f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(interior);
		//
		TurboList interior_dash = new TurboList("interior_dash");
		interior_dash.add(new ModelRendererTurbo(interior_dash, 347, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 12, 0, 0, 0, -1, 0, -1, -1, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10, -12, 5).setRotationAngle(0, 0, 0)
		);
		interior_dash.add(new ModelRendererTurbo(interior_dash, 274, 43, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 3, new net.fexcraft.lib.common.math.Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(9.875f, -11, 14.5f).setRotationAngle(22.5f, 1, 0)
		);
		interior_dash.add(new ModelRendererTurbo(interior_dash, 415, 41, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 3, new net.fexcraft.lib.common.math.Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(9.875f, -11, 7.5f).setRotationAngle(22.5f, 1, 0)
		);
		this.groups.add(interior_dash);
		//
		TurboList interior_dash_left = new TurboList("interior_dash_left");
		interior_dash_left.add(new ModelRendererTurbo(interior_dash_left, 403, 41, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 3, new net.fexcraft.lib.common.math.Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(9.875f, -10.5f, 16).setRotationAngle(22.5f, 1, 0)
		);
		interior_dash_left.addProgram(DefaultPrograms.INDICATOR_LIGHT_LEFT);
		this.groups.add(interior_dash_left);
		//
		TurboList interior_dash_right = new TurboList("interior_dash_right");
		interior_dash_right.add(new ModelRendererTurbo(interior_dash_right, 26, 40, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 0.5f, 3, new net.fexcraft.lib.common.math.Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(9.875f, -10.5f, 6).setRotationAngle(22.5f, 1, 0)
		);
		interior_dash_right.addProgram(DefaultPrograms.INDICATOR_LIGHT_RIGHT);
		this.groups.add(interior_dash_right);
		//
		TurboList interior_dash_signal = new TurboList("interior_dash_signal");
		interior_dash_signal.add(new ModelRendererTurbo(interior_dash_signal, 19, 38, textureX, textureY).addBox(0, -0.25f, 0, 0.25f, 0.5f, 5)
			.setRotationPoint(8, -8, 11).setRotationAngle(20, 0, 8)
		);
		interior_dash_signal.add(new ModelRendererTurbo(interior_dash_signal, 508, 39, textureX, textureY).addBox(-0.125f, -0.375f, 5, 0.5f, 0.75f, 1)
			.setRotationPoint(8, -8, 11).setRotationAngle(20, 0, 8)
		);
		interior_dash_signal.add(new ModelRendererTurbo(interior_dash_signal, 166, 36, textureX, textureY).addBox(0, -0.25f, 0, 0.25f, 0.5f, 5)
			.setRotationPoint(8, -8, 11).setRotationAngle(160, 0, 8)
		);
		interior_dash_signal.add(new ModelRendererTurbo(interior_dash_signal, 285, 38, textureX, textureY).addBox(-0.125f, -0.375f, 5, 0.5f, 0.75f, 1)
			.setRotationPoint(8, -8, 11).setRotationAngle(160, 0, 8)
		);
		interior_dash_signal.addProgram(new TurboList.Program(){
			@Override
			public void preRender(TurboList list, Entity ent, VehicleData data, Colorable color, String part, RenderCache cache){
				if(ent == null) return; Attribute<?> attr = data.getAttribute("turn_lights");
				list.get(0).rotationAngleX = list.get(1).rotationAngleX = attr.getTriStateValue() == null ? 20f : attr.getTriStateValue() ? 25f : 15f;
			}
		});
		this.groups.add(interior_dash_signal);
		//
		TurboList interior_dash_glow = new TurboList("interior_dash_glow");
		interior_dash_glow.add(new ModelRendererTurbo(interior_dash_glow, 411, 41, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 12, 1, 1, 3, new net.fexcraft.lib.common.math.Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(9.875f, -11, 10).setRotationAngle(15, 1, 0)
		);
		interior_dash_glow.add(new ModelRendererTurbo(interior_dash_glow, 407, 41, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 12, 1, 1, 3, new net.fexcraft.lib.common.math.Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(9.875f, -11, 12).setRotationAngle(15, 1, 0)
		);
		interior_dash_glow.addProgram(DefaultPrograms.LIGHTS);
		this.groups.add(interior_dash_glow);
		//
		TurboList interior_lights_on = new TurboList("interior_lights_on");
		interior_lights_on.add(new ModelRendererTurbo(interior_lights_on, 281, 38, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(8.875f, -9.5f, 19.75f).setRotationAngle(0, 0, 0)
		);
		interior_lights_on.addProgram(DefaultPrograms.LIGHTS);
		this.groups.add(interior_lights_on);
		//
		TurboList interior_lights_long = new TurboList("interior_lights_long");
		interior_lights_long.add(new ModelRendererTurbo(interior_lights_long, 41, 38, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(8.875f, -8, 19.75f).setRotationAngle(0, 0, 0)
		);
		interior_lights_long.addProgram(DefaultPrograms.LONG_LIGHTS);
		this.groups.add(interior_lights_long);
		//
		TurboList interior_lights_warning = new TurboList("interior_lights_warning");
		interior_lights_warning.add(new ModelRendererTurbo(interior_lights_warning, 508, 37, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(8.875f, -9.5f, 3).setRotationAngle(0, 0, 0)
		);
		//interior_lights_warning.addProgram(DefaultPrograms.WARNING_LIGHTS);
		this.groups.add(interior_lights_warning);
		//
		TurboList interior_lights_extra = new TurboList("interior_lights_extra");
		interior_lights_extra.add(new ModelRendererTurbo(interior_lights_extra, 300, 37, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(8.875f, -8, 18.25f).setRotationAngle(0, 0, 0)
		);
		interior_lights_extra.addProgram(DefaultPrograms.getCustomLights("lights_extra"));
		this.groups.add(interior_lights_extra);
		//
		TurboList interior_lights_fog = new TurboList("interior_lights_fog");
		interior_lights_fog.add(new ModelRendererTurbo(interior_lights_fog, 0, 43, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(8.875f, -9.5f, 18.25f).setRotationAngle(0, 0, 0)
		);
		interior_lights_fog.addProgram(DefaultPrograms.FOG_LIGHTS);
		this.groups.add(interior_lights_fog);
		//
		TurboList interior_gear_lever = new TurboList("interior_gear_lever");
		interior_gear_lever.add(new ModelRendererTurbo(interior_gear_lever, 20, 38, textureX, textureY)
			.addShapeBox(-0.25f, -3, -0.25f, 0.5f, 3, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5.5f, 3, 0).setRotationAngle(0, 0, 0)
		);
		interior_gear_lever.add(new ModelRendererTurbo(interior_gear_lever, 301, 22, textureX, textureY)
			.addShapeBox(-0.5f, -4, -0.5f, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5.5f, 3, 0).setRotationAngle(0, 0, 0)
		);
		this.groups.add(interior_gear_lever);
		//
		TurboList interior_brake_lever = new TurboList("interior_brake_lever");
		interior_brake_lever.add(new ModelRendererTurbo(interior_brake_lever, 0, 38, textureX, textureY)
			.addShapeBox(-0.625f, -2, -0.25f, 0.5f, 2, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6, 2.5f, 0).setRotationAngle(0, 0, 80)
		);
		interior_brake_lever.add(new ModelRendererTurbo(interior_brake_lever, 267, 43, textureX, textureY)
			.addShapeBox(-0.75f, -6, -0.375f, 0.75f, 4, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6, 2.5f, 0).setRotationAngle(0, 0, 80)
		);
		this.groups.add(interior_brake_lever);
		//
		/*TurboList pass_storage_0 = new TurboList("pass_storage_0");
		pass_storage_0.add(new ModelRendererTurbo(pass_storage_0, 145, 5, textureX, textureY).addBox(-1, -3, 0, 1, 3, 7)
			.setRotationPoint(9.875f, -5.875f, -20).setRotationAngle(0, 0, 0)
		);
		pass_storage_0.add(new ModelRendererTurbo(pass_storage_0, 299, 54, textureX, textureY).addBox(-1.125f, -2.5f, 2, 1, 0.5f, 3)
			.setRotationPoint(9.875f, -5.875f, -20).setRotationAngle(0, 0, 0)
		);
		this.groups.add(pass_storage_0);
		//
		TurboList pass_storage_1 = new TurboList("pass_storage_1");
		pass_storage_1.add(new ModelRendererTurbo(pass_storage_1, 463, 0, textureX, textureY).addBox(-1, -3, 0, 1, 3, 7)
			.setRotationPoint(9.875f, -5.875f, -12).setRotationAngle(0, 0, 0)
		);
		pass_storage_1.add(new ModelRendererTurbo(pass_storage_1, 294, 51, textureX, textureY).addBox(-1.125f, -2.5f, 2, 1, 0.5f, 3)
			.setRotationPoint(9.875f, -5.875f, -12).setRotationAngle(0, 0, 0)
		);
		this.groups.add(pass_storage_1);*/
		//
	}

}
