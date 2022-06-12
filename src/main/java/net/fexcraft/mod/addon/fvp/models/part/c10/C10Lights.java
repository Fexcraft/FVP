//FMT-Marker FVTM-1
package net.fexcraft.mod.addon.fvp.models.part.c10;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter V1 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.8 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c10_lights")
public class C10Lights extends PartModel {

	public C10Lights(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand");
		//
		ModelGroup indicator_left = new ModelGroup("indicator_left");
		indicator_left.add(new ModelRendererTurbo(indicator_left, 187, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 3, 0, 0, 0, 0, -2, 0, 0, -2.5f, 0, -2, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -1, 0, -2, 0, 0, 0)
			.setRotationPoint(45.9f, -9, 19).setRotationAngle(0, 0, 0)
		);
		indicator_left.add(new ModelRendererTurbo(indicator_left, 107, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(-48.9f, -9, 19).setRotationAngle(0, 0, 0)
		);
		indicator_left.addProgram(DefaultPrograms.INDICATOR_LIGHT_LEFT);
		this.groups.add(indicator_left);
		//
		ModelGroup indicator_right = new ModelGroup("indicator_right");
		indicator_right.add(new ModelRendererTurbo(indicator_right, 94, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 3, 0, 0, 0, -2.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.9f, -9, -22).setRotationAngle(0, 0, 0)
		);
		indicator_right.add(new ModelRendererTurbo(indicator_right, 109, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 3, 0, 0, 0, -0.5f, -2.5f, 0, -2, -2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.9f, -9, -22).setRotationAngle(0, 0, 0)
		);
		indicator_right.addProgram(DefaultPrograms.INDICATOR_LIGHT_RIGHT);
		this.groups.add(indicator_right);
		//
		ModelGroup lights_fog = new ModelGroup("lights_fog");
		lights_fog.add(new ModelRendererTurbo(lights_fog, 259, 9, textureX, textureY).addCylinder(0, 0, 0, 1, 1.5f, 12, 1.5f, 1.5f, 3, null)
			.setRotationPoint(49.125f, 1.5f, 15).setRotationAngle(0, 0, 0)
		);
		lights_fog.add(new ModelRendererTurbo(lights_fog, 259, 4, textureX, textureY).addCylinder(0, 0, 0, 1, 1.5f, 12, 1.5f, 1.5f, 3, null)
			.setRotationPoint(49.125f, 1.5f, -15).setRotationAngle(0, 0, 0)
		);
		lights_fog.addProgram(DefaultPrograms.FOG_LIGHTS);
		this.groups.add(lights_fog);
		//
		ModelGroup lights_front = new ModelGroup("lights_front");
		lights_front.add(new ModelRendererTurbo(lights_front, 212, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 1, 0, 0, -1, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(48.9f, -9, 15).setRotationAngle(0, 0, 0)
		);
		lights_front.add(new ModelRendererTurbo(lights_front, 257, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 2, 0, 0, -2, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(48.9f, -9, -19).setRotationAngle(0, 0, 0)
		);
		lights_front.addProgram(DefaultPrograms.FRONT_LIGHTS);
		this.groups.add(lights_front);
		//
		ModelGroup lights_rear = new ModelGroup("lights_rear");
		lights_rear.add(new ModelRendererTurbo(lights_rear, 286, 92, textureX, textureY).addBox(0, 0, 0, 3, 3, 4)
			.setRotationPoint(-48.9f, -9, 15).setRotationAngle(0, 0, 0)
		);
		lights_rear.add(new ModelRendererTurbo(lights_rear, 15, 91, textureX, textureY).addBox(0, 0, 0, 3, 3, 4)
			.setRotationPoint(-48.9f, -9, -19).setRotationAngle(0, 0, 0)
		);
		lights_rear.addProgram(DefaultPrograms.BACK_LIGHTS);
		this.groups.add(lights_rear);
		//
		ModelGroup lights_reverse = new ModelGroup("lights_reverse");
		lights_reverse.add(new ModelRendererTurbo(lights_reverse, 480, 77, textureX, textureY).addBox(0, 0, 0, 0.5f, 1, 2)
			.setRotationPoint(-48.95f, -6.5f, 15.5f).setRotationAngle(0, 0, 0)
		);
		lights_reverse.add(new ModelRendererTurbo(lights_reverse, 142, 77, textureX, textureY).addBox(0, 0, 0, 0.5f, 1, 2)
			.setRotationPoint(-48.95f, -6.5f, -17.5f).setRotationAngle(0, 0, 0)
		);
		lights_reverse.addProgram(DefaultPrograms.REVERSE_LIGHTS);
		this.groups.add(lights_reverse);
	}

}
