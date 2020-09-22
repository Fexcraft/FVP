//FMT-Marker FVTM-1
package net.fexcraft.mod.addon.fvp.models.part.c10;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter V1 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.8 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c10_doors")
public class C10Doors extends PartModel {

	public C10Doors(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList door_front_left = new TurboList("door_front_left");
		door_front_left.add(new ModelRendererTurbo(door_front_left, 266, 34, textureX, textureY)
			.addShapeBox(-19, 2, 0, 19, 6, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 0, 34, textureX, textureY).addBox(-19, 0, 0.5f, 19, 2, 1)
			.setRotationPoint(18, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 402, 33, textureX, textureY)
			.addShapeBox(-19, -3, 0.5f, 19, 3, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 0, 29, textureX, textureY)
			.addShapeBox(-19, -6, 0, 19, 3, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 329, 25, textureX, textureY)
			.addShapeBox(-19, -8, -1, 19, 2, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 64, 120, textureX, textureY)
			.addShapeBox(-19, -18, -2, 1, 10, 1, 0, 0, 0, 3, 0, 0, 3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 59, 120, textureX, textureY)
			.addShapeBox(-12, -18, -2, 1, 10, 1, 0, 0, 0, 3, 0, 0, 3, 0, 0, -3, 0, 0, -3, -11, 0, 0, 11, 0, 0, 11, 0, 0, -11, 0, 0)
			.setRotationPoint(18, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 329, 29, textureX, textureY)
			.addShapeBox(-18, -18, -5, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0.125f, 0, -0.3125f, 0.125f, 0, 0.3125f, 0, 0, 0.3125f)
			.setRotationPoint(18, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 361, 30, textureX, textureY)
			.addShapeBox(-19, -8, -2, 19, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 2)
			.setRotationPoint(18, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 462, 28, textureX, textureY)
			.addShapeBox(-19, 3, -2, 19, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4.5f, 0, 0, -4.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 232, 8, textureX, textureY)
			.addShapeBox(-19, -2, -2, 11, 5, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 147, 70, textureX, textureY).addBox(-8, -2, -2, 8, 5, 2)
			.setRotationPoint(18, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 151, 41, textureX, textureY).addBox(-8, -6, -1, 3, 1, 1)
			.setRotationPoint(18, -6, 21).setRotationAngle(10, 0, 0)
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 142, 41, textureX, textureY).addBox(-17, -4, 1, 3, 1, 1)
			.setRotationPoint(18, -6, 21).setRotationAngle(16, 0, 0)
		);
		door_front_left.addPrograms(new DefaultPrograms.AttributeRotator("c10_doors_fl", true, 0, 60, 0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_front_left);
		//
		TurboList door_front_right = new TurboList("door_front_right");
		door_front_right.add(new ModelRendererTurbo(door_front_right, 421, 25, textureX, textureY)
			.addShapeBox(-19, 2, -1, 19, 6, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 0, 25, textureX, textureY).addBox(-19, 0, -1.5f, 19, 2, 1)
			.setRotationPoint(18, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 470, 23, textureX, textureY)
			.addShapeBox(-19, -3, -1.5f, 19, 3, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 0, 20, textureX, textureY)
			.addShapeBox(-19, -6, -1, 19, 3, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 0, 16, textureX, textureY)
			.addShapeBox(-19, -8, 0, 19, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 23, 120, textureX, textureY)
			.addShapeBox(-19, -18, 1, 1, 10, 1, 0, 0, 0, -3, 0, 0, -3, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 325, 119, textureX, textureY)
			.addShapeBox(-12, -18, 1, 1, 10, 1, 0, 0, 0, -3, 0, 0, -3, 0, 0, 3, 0, 0, 3, -11, 0, 0, 11, 0, 0, 11, 0, 0, -11, 0, 0)
			.setRotationPoint(18, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 232, 29, textureX, textureY)
			.addShapeBox(-18, -18, 4, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0.125f, 0, 0.3125f, 0.125f, 0, -0.3125f, 0, 0, -0.3125f)
			.setRotationPoint(18, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 470, 5, textureX, textureY)
			.addShapeBox(-19, -8, 1, 19, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, -2)
			.setRotationPoint(18, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 0, 8, textureX, textureY)
			.addShapeBox(-19, 3, 0, 19, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4.5f, 0, 0, -4.5f, 0)
			.setRotationPoint(18, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 232, 0, textureX, textureY)
			.addShapeBox(-19, -2, 0, 11, 5, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 19, 67, textureX, textureY).addBox(-8, -2, 0, 8, 5, 2)
			.setRotationPoint(18, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 133, 41, textureX, textureY).addBox(-8, -6, 0, 3, 1, 1)
			.setRotationPoint(18, -6, -21).setRotationAngle(-10, 0, 0)
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 452, 33, textureX, textureY).addBox(-17, -4, -2, 3, 1, 1)
			.setRotationPoint(18, -6, -21).setRotationAngle(-16, 0, 0)
		);
		door_front_right.addPrograms(new DefaultPrograms.AttributeRotator("c10_doors_fr", true, -60, 0, -0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_front_right);
		//
		TurboList door_rear_left = new TurboList("door_rear_left");
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 349, 48, textureX, textureY)
			.addShapeBox(-15, 2, 0, 15, 6, 1, 0, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 307, 39, textureX, textureY)
			.addShapeBox(-16, 0, 0.5f, 16, 2, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 0, 38, textureX, textureY)
			.addShapeBox(-17, -3, 0.5f, 17, 3, 1, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 1, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 211, 36, textureX, textureY)
			.addShapeBox(-18, -6, 0, 18, 3, 1, 0, 0.5f, 0, 1, 0, 0, 1, 0, 0, -1, 1, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 0, 4, textureX, textureY)
			.addShapeBox(-19, -8, -1, 19, 2, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 81, 119, textureX, textureY)
			.addShapeBox(-1, -18, -2, 1, 10, 1, 0, 0, 0, 3, 0, 0, 3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 76, 119, textureX, textureY)
			.addShapeBox(-17, -18, -2, 1, 10, 1, 0, 0, 0, 3, 0, 0, 3, 0, 0, -3, 0, 0, -3, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(-2, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 133, 29, textureX, textureY)
			.addShapeBox(-16, -18, -5, 15, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0.3125f, 0.25f, 0, 0.3125f)
			.setRotationPoint(-2, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 443, 33, textureX, textureY).addBox(-17, -4, 1, 3, 1, 1)
			.setRotationPoint(-2, -6, 21).setRotationAngle(16, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 411, 30, textureX, textureY).addBox(-16, -6, -1, 3, 1, 1)
			.setRotationPoint(-2, -6, 21).setRotationAngle(10, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 111, 47, textureX, textureY)
			.addShapeBox(-15, -8, -2, 15, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 2)
			.setRotationPoint(-2, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 213, 87, textureX, textureY)
			.addShapeBox(-19, -8, -2, 4, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, -1.25f, 0, 0, -1.25f, 0, 0, 2, -3, 0, 2)
			.setRotationPoint(-2, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 54, 90, textureX, textureY)
			.addShapeBox(-16, 2, -1, 1, 6, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0.5f, -1, 0, -1, 0.25f, 0, -1, 0.25f, 0, 1, -1, 0, 1)
			.setRotationPoint(-2, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 76, 47, textureX, textureY)
			.addShapeBox(-15, 3, -2, 15, 5, 2, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.875f, 0, 0, 0.625f, -4.5f, 0, 0, -4.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 493, 71, textureX, textureY)
			.addShapeBox(-17, -2, -2, 7, 5, 2, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, -1.375f, 0, 0, 0, 0, 0, 0, 0, 0, -1.125f, 0, 0)
			.setRotationPoint(-2, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 237, 65, textureX, textureY)
			.addShapeBox(-10, -2, -2, 10, 5, 2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -6, 21).setRotationAngle(0, 0, 0)
		);
		door_rear_left.addPrograms(new DefaultPrograms.AttributeRotator("c10_doors_bl", true, 0, 60, 0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_rear_left);
		//
		TurboList door_rear_right = new TurboList("door_rear_right");
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 43, 47, textureX, textureY)
			.addShapeBox(-15, 2, -1, 15, 6, 1, 0, 1, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 402, 38, textureX, textureY)
			.addShapeBox(-16, 0, -1.5f, 16, 2, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 443, 36, textureX, textureY)
			.addShapeBox(-17, -3, -1.5f, 17, 3, 1, 0, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-2, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 172, 36, textureX, textureY)
			.addShapeBox(-18, -6, -1, 18, 3, 1, 0, 1, 0, -1, 0, 0, -1, 0, 0, 1, 0.5f, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-2, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 0, 0, textureX, textureY)
			.addShapeBox(-19, -8, 0, 19, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-2, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 466, 117, textureX, textureY)
			.addShapeBox(-1, -18, 1, 1, 10, 1, 0, 0, 0, -3, 0, 0, -3, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 219, 105, textureX, textureY)
			.addShapeBox(-17, -18, 1, 1, 10, 1, 0, 0, 0, -3, 0, 0, -3, 0, 0, 3, 0, 0, 3, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(-2, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 478, 0, textureX, textureY)
			.addShapeBox(-16, -18, 4, 15, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, -0.3125f, 0.25f, 0, -0.3125f)
			.setRotationPoint(-2, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 402, 30, textureX, textureY).addBox(-17, -4, -2, 3, 1, 1)
			.setRotationPoint(-2, -6, -21).setRotationAngle(-16, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 346, 29, textureX, textureY).addBox(-16, -6, 0, 3, 1, 1)
			.setRotationPoint(-2, -6, -21).setRotationAngle(-10, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 133, 11, textureX, textureY)
			.addShapeBox(-15, -8, 1, 15, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, -2)
			.setRotationPoint(-2, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 202, 87, textureX, textureY)
			.addShapeBox(-19, -8, 1, 4, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 2, 0, 0, 2, 0, 0, -1.25f, -3, 0, -1.25f)
			.setRotationPoint(-2, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 133, 87, textureX, textureY)
			.addShapeBox(-16, 2, 0, 1, 6, 1, 0, 0, 0, 0.5f, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -1, 0, 1, 0.25f, 0, 1, 0.25f, 0, -1, -1, 0, -1)
			.setRotationPoint(-2, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 476, 41, textureX, textureY)
			.addShapeBox(-15, 3, 0, 15, 5, 2, 0, 0.875f, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4.5f, 0, 0.625f, -4.5f, 0)
			.setRotationPoint(-2, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 191, 70, textureX, textureY)
			.addShapeBox(-17, -2, 0, 7, 5, 2, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, -1.125f, 0, 0, 0, 0, 0, 0, 0, 0, -1.375f, 0, 0)
			.setRotationPoint(-2, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 313, 63, textureX, textureY)
			.addShapeBox(-10, -2, 0, 10, 5, 2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -6, -21).setRotationAngle(0, 0, 0)
		);
		door_rear_right.addPrograms(new DefaultPrograms.AttributeRotator("c10_doors_br", true, -60, 0, -0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_rear_right);
	}

}
