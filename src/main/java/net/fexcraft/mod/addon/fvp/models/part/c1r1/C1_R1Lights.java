//FMT-Marker FVTM-1.1
package net.fexcraft.mod.addon.fvp.models.part.c1r1;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.ModelGroup;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;

/** This file was exported via the FVTM Exporter V1.2 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.9 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c1_r1_lights")
public class C1_R1Lights extends PartModel {

	public C1_R1Lights(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand");
		//
		ModelGroup lights_front = new ModelGroup("lights_front");
		lights_front.add(new ModelRendererTurbo(lights_front, 481, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 10, 0, 0, 0, 0, 0.7f, 0, 0, -0.1f, 0, -1, 0, 0, 0, 0, 0, 0, 0.9f, 0, 0, 0.1f, 0, -1, -0.2f, 0, 0)
			.setRotationPoint(54.5f, -6, 11).setRotationAngle(0, 0, 0).setName("Box 654")
		);
		lights_front.add(new ModelRendererTurbo(lights_front, 129, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 10, 0, 0, 0, 0, -0.1f, 0, -1, 0.7f, 0, 0, 0, 0, 0, -0.2f, 0, 0, 0.1f, 0, -1, 0.9f, 0, 0, 0, 0, 0)
			.setRotationPoint(54.5f, -6, -21).setRotationAngle(0, 0, 0).setName("Box 656")
		);
		lights_front.addProgram(DefaultPrograms.FRONT_LIGHTS);
		this.groups.add(lights_front);
		//
		ModelGroup lights_rear = new ModelGroup("lights_rear");
		lights_rear.add(new ModelRendererTurbo(lights_rear, 281, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 4, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, -0.1f, -0.6f, 0, -0.9f, 0.17500001f, 0, 0, 0, 0, 0, 0, 0, 0, -0.45f, 0, -0.8f)
			.setRotationPoint(-58, -8, 17).setRotationAngle(0, 0, 0).setName("Box 659")
		);
		lights_rear.add(new ModelRendererTurbo(lights_rear, 233, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 4, 0, -0.6f, 0, -0.9f, 0, 0, -0.1f, 0, 0, 0, -0.2f, 0, 0, -0.45f, 0, -0.925f, 0, 0, 0, 0, 0, 0, 0.17500001f, 0, 0)
			.setRotationPoint(-58, -8, -21).setRotationAngle(0, 0, 0).setName("Box 660")
		);
		lights_rear.addProgram(DefaultPrograms.REAR_LIGHTS);
		this.groups.add(lights_rear);
		//
		ModelGroup turn_light_left = new ModelGroup("turn_light_left");
		turn_light_left.add(new ModelRendererTurbo(turn_light_left, 281, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 4, 0, 0.175f, 0, 0, 0, 0, 0, 0, 0, 0.025000006f, -0.35000002f, 0, -0.775f, 0.3f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.2f, 0, -0.8f)
			.setRotationPoint(-58, -5, 17).setRotationAngle(0, 0, 0).setName("Box 659cp")
		);
		turn_light_left.add(new ModelRendererTurbo(turn_light_left, 193, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.1f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, 0, 0, 0)
			.setRotationPoint(57.4f, -1.5f, 16).setRotationAngle(0, 0, 0).setName("Box 657")
		);
		turn_light_left.add(new ModelRendererTurbo(turn_light_left, 473, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0, -0.7f, 0, 0, -0.7f)
			.setRotationPoint(29, -9, 20.9f).setRotationAngle(0, 0, 0).setName("Box 662")
		);
		turn_light_left.addProgram(DefaultPrograms.TURN_SIGNAL_LEFT);
		this.groups.add(turn_light_left);
		//
		ModelGroup turn_light_right = new ModelGroup("turn_light_right");
		turn_light_right.add(new ModelRendererTurbo(turn_light_right, 89, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.3f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(57.4f, -1.5f, -19).setRotationAngle(0, 0, 0).setName("Box 658")
		);
		turn_light_right.add(new ModelRendererTurbo(turn_light_right, 297, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0)
			.setRotationPoint(29, -9, -21.9f).setRotationAngle(0, 0, 0).setName("Box 663")
		);
		turn_light_right.add(new ModelRendererTurbo(turn_light_right, 233, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 4, 0, -0.35000002f, 0, -0.9f, 0, 0, 0.024999999f, 0, 0, 0, 0.175f, 0, 0, -0.2f, 0, -0.8f, 0, 0, 0.125f, 0, 0, 0, 0.3f, 0, 0)
			.setRotationPoint(-58, -5, -21).setRotationAngle(0, 0, 0).setName("Box 660cp")
		);
		turn_light_right.addProgram(DefaultPrograms.TURN_SIGNAL_RIGHT);
		this.groups.add(turn_light_right);
		//
	}

}
