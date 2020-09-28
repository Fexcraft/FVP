//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.part.c12;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c12_doors")
public class C12Doors extends PartModel {

	public C12Doors(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList door_front_left = new TurboList("door_front_left");
		door_front_left.add(new ModelRendererTurbo(door_front_left, 145, 20, textureX, textureY)
			.addShapeBox(-20, 0, 0, 20, 15, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.5f, -9, 22.5f).setRotationAngle(0, 0, 0)
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 16, 84, textureX, textureY)
			.addShapeBox(-6, 0, -2.5f, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, -2, 5, 0, -2, 5, 0, 2, -5, 0, 2)
			.setRotationPoint(12.5f, -19, 22.5f).setRotationAngle(0, 0, 0)
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 12, 84, textureX, textureY)
			.addShapeBox(-20, 0, -2.5f, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 2)
			.setRotationPoint(12.5f, -19, 22.5f).setRotationAngle(0, 0, 0)
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 0, 36, textureX, textureY)
			.addShapeBox(-19, 0, -2.5f, 14, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0.2f, 0, 0, 0.2f)
			.setRotationPoint(12.5f, -19, 22.5f).setRotationAngle(0, 0, 0)
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 273, 38, textureX, textureY).addBox(-18, 2, -0.25f, 3, 1, 1)
			.setRotationPoint(12.5f, -9, 22.5f).setRotationAngle(0, 0, 0)
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 265, 38, textureX, textureY).addBox(-8, 3, -0.75f, 3, 1, 1)
			.setRotationPoint(12.5f, -9, 22.75f).setRotationAngle(0, 0, 0)
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 8, 84, textureX, textureY)
			.addShapeBox(-6, 0, -2.5f, 1, 10, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -2.125f, 0, 0, -2.125f, 0, 0, 1.875f, 0, 0, 1.875f)
			.setRotationPoint(12.5f, -19, 22.5f).setRotationAngle(0, 0, 0)
		);
		door_front_left.addPrograms(new DefaultPrograms.AttributeRotator("c12_door_fl", true, 0, 75, 0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_front_left);
		//
		TurboList door_front_left_mirror = new TurboList("door_front_left_mirror");
		door_front_left_mirror.add(new ModelRendererTurbo(door_front_left_mirror, 291, 30, textureX, textureY)
			.addShapeBox(-6.25f, 0.25f, -0.5f, 1, 1, 6, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(12.5f, -19, 21.5f).setRotationAngle(0, 0, 0)
		);
		door_front_left_mirror.add(new ModelRendererTurbo(door_front_left_mirror, 27, 40, textureX, textureY)
			.addShapeBox(-6.25f, 11.25f, 0.5f, 1, 1, 4, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f)
			.setRotationPoint(12.5f, -19, 22.5f).setRotationAngle(0, 0, 0)
		);
		door_front_left_mirror.add(new ModelRendererTurbo(door_front_left_mirror, 249, 92, textureX, textureY)
			.addShapeBox(-6.25f, 0.75f, 3.5f, 1, 11, 1, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(12.5f, -19, 22.5f).setRotationAngle(0, 0, 0)
		);
		door_front_left_mirror.add(new ModelRendererTurbo(door_front_left_mirror, 396, 50, textureX, textureY)
			.addShapeBox(-4.625f, 1.5f, 4.5f, 1, 7, 4, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(12.5f, -19, 22.5f).setRotationAngle(0, -23, 0)
		);
		door_front_left_mirror.add(new ModelRendererTurbo(door_front_left_mirror, 363, 43, textureX, textureY)
			.addShapeBox(-4.625f, 8.125f, 4.0625f, 1, 3, 4, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(12.5f, -19, 22.5f).setRotationAngle(0, -20, 0)
		);
		door_front_left_mirror.addPrograms(new DefaultPrograms.AttributeRotator("c12_door_fl", true, 0, 75, 0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_front_left_mirror);
		//
		TurboList door_front_right = new TurboList("door_front_right");
		door_front_right.add(new ModelRendererTurbo(door_front_right, 0, 20, textureX, textureY)
			.addShapeBox(-20, 0, -1, 20, 15, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.5f, -9, -22.5f).setRotationAngle(0, 0, 0)
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 4, 84, textureX, textureY)
			.addShapeBox(-6, 0, 1.5f, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 2, 5, 0, 2, 5, 0, -2, -5, 0, -2)
			.setRotationPoint(12.5f, -19, -22.5f).setRotationAngle(0, 0, 0)
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 0, 84, textureX, textureY)
			.addShapeBox(-20, 0, 1.5f, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, -2)
			.setRotationPoint(12.5f, -19, -22.5f).setRotationAngle(0, 0, 0)
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 265, 34, textureX, textureY)
			.addShapeBox(-19, 0, 1.5f, 14, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(12.5f, -19, -22.5f).setRotationAngle(0, 0, 0)
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 158, 38, textureX, textureY).addBox(-18, 2, -0.75f, 3, 1, 1)
			.setRotationPoint(12.5f, -9, -22.5f).setRotationAngle(0, 0, 0)
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 290, 37, textureX, textureY).addBox(-8, 3, -0.75f, 3, 1, 1)
			.setRotationPoint(12.5f, -9, -22.25f).setRotationAngle(0, 0, 0)
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 94, 83, textureX, textureY)
			.addShapeBox(-6, 0, 1.5f, 1, 10, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 1.875f, 0, 0, 1.875f, 0, 0, -2.125f, 0, 0, -2.125f)
			.setRotationPoint(12.5f, -19, -22.5f).setRotationAngle(0, 0, 0)
		);
		door_front_right.addPrograms(new DefaultPrograms.AttributeRotator("c12_door_fr", true, -75, 0, -0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_front_right);
		//
		TurboList door_front_right_mirror = new TurboList("door_front_right_mirror");
		door_front_right_mirror.add(new ModelRendererTurbo(door_front_right_mirror, 403, 27, textureX, textureY)
			.addShapeBox(-6.25f, 0.25f, -5.5f, 1, 1, 6, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(12.5f, -19, -21.5f).setRotationAngle(0, 0, 0)
		);
		door_front_right_mirror.add(new ModelRendererTurbo(door_front_right_mirror, 411, 34, textureX, textureY)
			.addShapeBox(-6.25f, 11.25f, -4.5f, 1, 1, 4, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(12.5f, -19, -22.5f).setRotationAngle(0, 0, 0)
		);
		door_front_right_mirror.add(new ModelRendererTurbo(door_front_right_mirror, 245, 92, textureX, textureY)
			.addShapeBox(-6.25f, 0.75f, -4.5f, 1, 11, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f)
			.setRotationPoint(12.5f, -19, -22.5f).setRotationAngle(0, 0, 0)
		);
		door_front_right_mirror.add(new ModelRendererTurbo(door_front_right_mirror, 232, 45, textureX, textureY)
			.addShapeBox(-4.625f, 1.5f, -8.5f, 1, 7, 4, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(12.5f, -19, -22.5f).setRotationAngle(0, 23, 0)
		);
		door_front_right_mirror.add(new ModelRendererTurbo(door_front_right_mirror, 35, 36, textureX, textureY)
			.addShapeBox(-4.625f, 8.125f, -8.25f, 1, 3, 4, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(12.5f, -19, -22.5f).setRotationAngle(0, 20, 0)
		);
		door_front_right_mirror.addPrograms(new DefaultPrograms.AttributeRotator("c12_door_fr", true, -75, 0, -0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_front_right_mirror);
		//
		TurboList door_rear_left = new TurboList("door_rear_left");
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 381, 2, textureX, textureY)
			.addShapeBox(-18, 0, 0, 18, 15, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-8.5f, -9, 22.5f).setRotationAngle(0, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 140, 81, textureX, textureY)
			.addShapeBox(-16, 0, -2.5f, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, -2, -2, 0, -2, -2, 0, 2, 2, 0, 2)
			.setRotationPoint(-8.5f, -19, 22.5f).setRotationAngle(0, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 136, 81, textureX, textureY)
			.addShapeBox(-1, 0, -2.5f, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 2)
			.setRotationPoint(-8.5f, -19, 22.5f).setRotationAngle(0, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 265, 32, textureX, textureY)
			.addShapeBox(-16, 0, -2.5f, 15, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0.2f, 0, 0, 0.2f)
			.setRotationPoint(-8.5f, -19, 22.5f).setRotationAngle(0, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 381, 36, textureX, textureY).addBox(-15, 2, -0.25f, 3, 1, 1)
			.setRotationPoint(-8.5f, -9, 22.5f).setRotationAngle(0, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 411, 30, textureX, textureY).addBox(-7, 3, -0.75f, 3, 1, 1)
			.setRotationPoint(-8.5f, -9, 22.75f).setRotationAngle(0, 0, 0)
		);
		door_rear_left.addPrograms(new DefaultPrograms.AttributeRotator("c12_door_rl", true, 0, 75, 0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_rear_left);
		//
		TurboList door_rear_right = new TurboList("door_rear_right");
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 265, 2, textureX, textureY)
			.addShapeBox(-18, 0, -1, 18, 15, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-8.5f, -9, -22.5f).setRotationAngle(0, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 132, 81, textureX, textureY)
			.addShapeBox(-16, 0, 1.5f, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, -2, 0, 2, -2, 0, -2, 2, 0, -2)
			.setRotationPoint(-8.5f, -19, -22.5f).setRotationAngle(0, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 128, 81, textureX, textureY)
			.addShapeBox(-1, 0, 1.5f, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, -2)
			.setRotationPoint(-8.5f, -19, -22.5f).setRotationAngle(0, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 265, 30, textureX, textureY)
			.addShapeBox(-16, 0, 1.5f, 15, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(-8.5f, -19, -22.5f).setRotationAngle(0, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 411, 24, textureX, textureY).addBox(-15, 2, -0.75f, 3, 1, 1)
			.setRotationPoint(-8.5f, -9, -22.5f).setRotationAngle(0, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 381, 23, textureX, textureY).addBox(-7, 3, -0.75f, 3, 1, 1)
			.setRotationPoint(-8.5f, -9, -22.25f).setRotationAngle(0, 0, 0)
		);
		door_rear_right.addPrograms(new DefaultPrograms.AttributeRotator("c12_door_rr", true, -75, 0, -0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_rear_right);
		//
		TurboList door_boot = new TurboList("door_boot");
		door_boot.add(new ModelRendererTurbo(door_boot, 260, 218, textureX, textureY).addBox(-1, -8, 0, 1, 8, 24)
			.setRotationPoint(-51.9375f, 0, -12).setRotationAngle(0, 0, 0)
		);
		door_boot.addProgram(new DefaultPrograms.AttributeRotator("c12_boot", true, -88, 0, -1, 2, 0f));
		this.groups.add(door_boot);
	}

}
