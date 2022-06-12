//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.c11;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.3.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c11_doors")
public class C11Doors extends PartModel {

	public C11Doors(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup door_left_primary = new ModelGroup("door_left_primary");
		door_left_primary.add(new ModelRendererTurbo(door_left_primary, 85, 41, textureX, textureY)
			.addShapeBox(-21, 0, -1, 21, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -1, 20).setRotationAngle(0, 0, 0)
		);
		door_left_primary.add(new ModelRendererTurbo(door_left_primary, 442, 40, textureX, textureY)
			.addShapeBox(-21, 0, -1, 21, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(18, -7, 20).setRotationAngle(0, 0, 0)
		);
		door_left_primary.add(new ModelRendererTurbo(door_left_primary, 227, 39, textureX, textureY)
			.addShapeBox(-21, 0, -1, 21, 4, 2, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(18, -11, 20).setRotationAngle(0, 0, 0)
		);
		door_left_primary.addPrograms(new DefaultPrograms.AttributeRotator("c11_door_left", true, 0, 60, 0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_left_primary);
		//
		ModelGroup door_right_primary = new ModelGroup("door_right_primary");
		door_right_primary.add(new ModelRendererTurbo(door_right_primary, 404, 31, textureX, textureY)
			.addShapeBox(-21, 0, -1, 21, 6, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -7, -20).setRotationAngle(0, 0, 0)
		);
		door_right_primary.add(new ModelRendererTurbo(door_right_primary, 203, 31, textureX, textureY)
			.addShapeBox(-21, 0, -1, 21, 4, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -11, -20).setRotationAngle(0, 0, 0)
		);
		door_right_primary.add(new ModelRendererTurbo(door_right_primary, 248, 25, textureX, textureY)
			.addShapeBox(-21, 0, -1, 21, 5, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -1, -20).setRotationAngle(0, 0, 0)
		);
		door_right_primary.addPrograms(new DefaultPrograms.AttributeRotator("c11_door_right", true, -60, 0, -0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_right_primary);
		//
		ModelGroup door_left = new ModelGroup("door_left");
		door_left.add(new ModelRendererTurbo(door_left, 415, 40, textureX, textureY).addBox(-19, 0, 1, 4, 1, 1)
			.setRotationPoint(18, -7, 20).setRotationAngle(0, 0, 0)
		);
		door_left.add(new ModelRendererTurbo(door_left, 182, 38, textureX, textureY)
			.addShapeBox(-21, 0, -2, 21, 4, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -7, 20).setRotationAngle(0, 0, 0)
		);
		door_left.add(new ModelRendererTurbo(door_left, 250, 33, textureX, textureY)
			.addShapeBox(-21, 0, -2, 21, 4, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -11, 20).setRotationAngle(0, 0, 0)
		);
		door_left.add(new ModelRendererTurbo(door_left, 451, 31, textureX, textureY)
			.addShapeBox(-21, -4, -2, 21, 7, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, 1, 20).setRotationAngle(0, 0, 0)
		);
		door_left.add(new ModelRendererTurbo(door_left, 86, 53, textureX, textureY).addBox(-8, -1, -2, 3, 1, 1)
			.setRotationPoint(18, -7, 20).setRotationAngle(0, 0, 0)
		);
		door_left.addProgram(new DefaultPrograms.AttributeRotator("c11_door_left", true, 0, 60, 0.5f, 1, 0f));
		this.groups.add(door_left);
		//
		ModelGroup door_right = new ModelGroup("door_right");
		door_right.add(new ModelRendererTurbo(door_right, 203, 25, textureX, textureY)
			.addShapeBox(-21, 0, 1, 21, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(18, -7, -20).setRotationAngle(0, 0, 0)
		);
		door_right.add(new ModelRendererTurbo(door_right, 158, 15, textureX, textureY)
			.addShapeBox(-21, 0, 1, 21, 4, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(18, -11, -20).setRotationAngle(0, 0, 0)
		);
		door_right.add(new ModelRendererTurbo(door_right, 158, 25, textureX, textureY)
			.addShapeBox(-21, -4, 1, 21, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, 1, -20).setRotationAngle(0, 0, 0)
		);
		door_right.add(new ModelRendererTurbo(door_right, 404, 40, textureX, textureY).addBox(-19, 0, -2, 4, 1, 1)
			.setRotationPoint(18, -7, -20).setRotationAngle(0, 0, 0)
		);
		door_right.add(new ModelRendererTurbo(door_right, 426, 40, textureX, textureY).addBox(-8, -1, 1, 3, 1, 1)
			.setRotationPoint(18, -7, -20).setRotationAngle(0, 0, 0)
		);
		door_right.addProgram(new DefaultPrograms.AttributeRotator("c11_door_right", true, -60, 0, -0.5f, 1, 0f));
		this.groups.add(door_right);
	}

}
