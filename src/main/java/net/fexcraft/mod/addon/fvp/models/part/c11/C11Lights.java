//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.c11;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.3.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c11_lights")
public class C11Lights extends PartModel {

	public C11Lights(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList lights_off = new TurboList("lights_off");
		lights_off.add(new ModelRendererTurbo(lights_off, 421, 89, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(49, 4.25f, -17).setRotationAngle(0, 0, 0)
		);
		lights_off.add(new ModelRendererTurbo(lights_off, 375, 89, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(49, 4.25f, 15).setRotationAngle(0, 0, 0)
		);
		lights_off.add(new ModelRendererTurbo(lights_off, 29, 43, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 16, 1.25f, 1, 3, null)
			.setRotationPoint(48, -3, 14.5f).setRotationAngle(12.5f, 0, 0)
		);
		lights_off.add(new ModelRendererTurbo(lights_off, 132, 41, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 16, 1.25f, 1, 3, null)
			.setRotationPoint(48, -3, 17.25f).setRotationAngle(12.5f, 0, 0)
		);
		lights_off.add(new ModelRendererTurbo(lights_off, 29, 39, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 16, 0.75f, 0.5f, 3, null)
			.setRotationPoint(47.5f, -4, 20.25f).setRotationAngle(12.5f, 0, 0)
		);
		lights_off.add(new ModelRendererTurbo(lights_off, 29, 35, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 16, 0.75f, 0.5f, 3, null)
			.setRotationPoint(47.5f, -2, 20).setRotationAngle(12.5f, 0, 0)
		);
		lights_off.add(new ModelRendererTurbo(lights_off, 314, 33, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 16, 1.25f, 1, 3, null)
			.setRotationPoint(48, -3, -17).setRotationAngle(12.5f, 0, 0)
		);
		lights_off.add(new ModelRendererTurbo(lights_off, 29, 31, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 16, 1.25f, 1, 3, null)
			.setRotationPoint(48, -3, -14.25f).setRotationAngle(12.5f, 0, 0)
		);
		lights_off.add(new ModelRendererTurbo(lights_off, 29, 27, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 16, 0.75f, 0.5f, 3, null)
			.setRotationPoint(47.5f, -4, -20.25f).setRotationAngle(12.5f, 0, 0)
		);
		lights_off.add(new ModelRendererTurbo(lights_off, 29, 19, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 16, 0.75f, 0.5f, 3, null)
			.setRotationPoint(47.5f, -2, -20).setRotationAngle(12.5f, 0, 0)
		);
		lights_off.add(new ModelRendererTurbo(lights_off, 29, 15, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 16, 0.75f, 1, 3, null)
			.setRotationPoint(-49, -5.5f, -17.5f).setRotationAngle(12.5f, 0, 0)
		);
		lights_off.add(new ModelRendererTurbo(lights_off, 206, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 16, 0.375f, 0.5f, 3, null)
			.setRotationPoint(-48.5f, -6.25f, -19.75f).setRotationAngle(12.5f, 0, 0)
		);
		lights_off.add(new ModelRendererTurbo(lights_off, 108, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 16, 0.375f, 0.5f, 3, null)
			.setRotationPoint(-48.5f, -4.75f, -19.75f).setRotationAngle(12.5f, 0, 0)
		);
		lights_off.add(new ModelRendererTurbo(lights_off, 0, 8, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 16, 0.75f, 1, 3, null)
			.setRotationPoint(-49, -5.5f, 17.75f).setRotationAngle(12.5f, 0, 0)
		);
		lights_off.add(new ModelRendererTurbo(lights_off, 503, 7, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 16, 0.75f, 1, 3, null)
			.setRotationPoint(-49, -5.5f, 15.5f).setRotationAngle(12.5f, 0, 0)
		);
		lights_off.add(new ModelRendererTurbo(lights_off, 479, 5, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 16, 0.375f, 0.5f, 3, null)
			.setRotationPoint(-48.5f, -6.25f, 19.75f).setRotationAngle(12.5f, 0, 0)
		);
		lights_off.add(new ModelRendererTurbo(lights_off, 314, 5, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 16, 0.375f, 0.5f, 3, null)
			.setRotationPoint(-48.5f, -4.75f, 19.75f).setRotationAngle(12.5f, 0, 0)
		);
		lights_off.add(new ModelRendererTurbo(lights_off, 108, 5, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 16, 0.75f, 1, 3, null)
			.setRotationPoint(-49, -5.5f, -15.25f).setRotationAngle(12.5f, 0, 0)
		);
		this.groups.add(lights_off);
		//
		TurboList fog_lights = new TurboList("fog_lights");
		fog_lights.add(new ModelRendererTurbo(fog_lights, 225, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0)
			.setRotationPoint(50, 4.25f, -17).setRotationAngle(0, 0, 0)
		);
		fog_lights.add(new ModelRendererTurbo(fog_lights, 384, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0)
			.setRotationPoint(50, 4.25f, 15).setRotationAngle(0, 0, 0)
		);
		fog_lights.addProgram(DefaultPrograms.FOG_LIGHTS);
		this.groups.add(fog_lights);
		//
		TurboList front_lights = new TurboList("front_lights");
		front_lights.add(new ModelRendererTurbo(front_lights, 0, 101, textureX, textureY).addBox(0, 0, -0.25f, 2, 4, 7)
			.setRotationPoint(47.5f, -5, -18.75f).setRotationAngle(0, 0, 0)
		);
		front_lights.add(new ModelRendererTurbo(front_lights, 110, 97, textureX, textureY).addBox(0, 0, -0.25f, 2, 4, 7)
			.setRotationPoint(47.5f, -5, 12.25f).setRotationAngle(0, 0, 0)
		);
		front_lights.addProgram(DefaultPrograms.FRONT_LIGHTS);
		this.groups.add(front_lights);
		//
		TurboList reverse_lights = new TurboList("reverse_lights");
		reverse_lights.add(new ModelRendererTurbo(reverse_lights, 312, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -1, 0, -0.5f, 0.125f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-49.875f, -7, -20.5f).setRotationAngle(0, 0, 0)
		);
		reverse_lights.add(new ModelRendererTurbo(reverse_lights, 180, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, -1, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.125f, 0, -0.5f, -1)
			.setRotationPoint(-49.875f, -7, 19.5f).setRotationAngle(0, 0, 0)
		);
		reverse_lights.addProgram(DefaultPrograms.REVERSE_LIGHTS);
		this.groups.add(reverse_lights);
		//
		TurboList turn_left = new TurboList("turn_left");
		turn_left.add(new ModelRendererTurbo(turn_left, 303, 96, textureX, textureY)
			.addShapeBox(0, 0, -0.25f, 2, 4, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -2.75f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -2.75f, 0, 0, -0.5f)
			.setRotationPoint(48, -5, 19.25f).setRotationAngle(0, 0, 0)
		);
		turn_left.add(new ModelRendererTurbo(turn_left, 199, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.125f, 0, 0, -1, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.25f, 0, -0.5f, -1)
			.setRotationPoint(-49.875f, -5.5f, 19.5f).setRotationAngle(0, 0, 0)
		);
		turn_left.addProgram(DefaultPrograms.TURN_SIGNAL_LEFT);
		this.groups.add(turn_left);
		//
		TurboList turn_right = new TurboList("turn_right");
		turn_right.add(new ModelRendererTurbo(turn_right, 392, 95, textureX, textureY)
			.addShapeBox(0, 0, -0.25f, 2, 4, 3, 0, 0, 0, 0, -0.5f, 0, -2.25f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, -2.25f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(48, -5, -21.25f).setRotationAngle(0, 0, 0)
		);
		turn_right.add(new ModelRendererTurbo(turn_right, 458, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -1, 0, 0, 0.125f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, -1, 0, -0.5f, 0.25f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-49.875f, -5.5f, -20.5f).setRotationAngle(0, 0, 0)
		);
		turn_right.addProgram(DefaultPrograms.TURN_SIGNAL_RIGHT);
		this.groups.add(turn_right);
		//
		TurboList rear_lights = new TurboList("rear_lights");
		rear_lights.add(new ModelRendererTurbo(rear_lights, 429, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.875f, -7, -19).setRotationAngle(0, 0, 0)
		);
		rear_lights.add(new ModelRendererTurbo(rear_lights, 414, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.875f, -7, 14).setRotationAngle(0, 0, 0)
		);
		rear_lights.addProgram(DefaultPrograms.REAR_LIGHTS);
		this.groups.add(rear_lights);
	}

}
