//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.c7;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.1 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c7_lights")
public class C7Lights extends PartModel {

	public C7Lights(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup lights_front = new ModelGroup("lights_front");
		lights_front.add(new ModelRendererTurbo(lights_front, 276, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6f, 3.6f, 3.6f, 0, 0, -0.24000001f, 0, -0.36f, -0.24000001f, 0, -0.36f, -0.24000001f, -0.96f, 0, -0.24000001f, 0, 0, -0.24000001f, 0, -0.36f, -0.24000001f, 0, -0.36f, -0.24000001f, -0.96f, 0, -0.24000001f, 0)
			.setRotationPoint(51.600002f, -7.4f, 16.800001f).setRotationAngle(0, 0, 0).setName("Box 75")
		);
		lights_front.add(new ModelRendererTurbo(lights_front, 259, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 3.6000001f, 3.6000001f, 0, 0, -0.24000001f, 0, -0.36f, -0.24000001f, -0.96f, -0.36f, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, -0.36f, -0.24000001f, -0.96f, -0.36f, -0.24000001f, 0, 0, -0.24000001f, 0)
			.setRotationPoint(51.600002f, -7.4f, -20.400002f).setRotationAngle(0, 0, 0).setName("Box 83")
		);
		lights_front.addProgram(DefaultPrograms.FRONT_LIGHTS);
		this.groups.add(lights_front);
		//
		ModelGroup lights_indicator_left = new ModelGroup("lights_indicator_left");
		lights_indicator_left.add(new ModelRendererTurbo(lights_indicator_left, 442, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2.4f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f)
			.setRotationPoint(25.4f, -1.4f, 21).setRotationAngle(0, 0, 0).setName("Box 42")
		);
		lights_indicator_left.add(new ModelRendererTurbo(lights_indicator_left, 178, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6f, 2.6f, 3.6f, 0, 0, -0.24000001f, 0, -0.36f, -0.24000001f, 0, -0.36f, -0.24000001f, -0.96f, 0, -0.24000001f, 0, 0, -0.24000001f, 0, -0.36f, -0.24000001f, 0, -0.36f, -0.24000001f, -0.96f, 0, -0.24000001f, 0)
			.setRotationPoint(51.600002f, -4, 16.800001f).setRotationAngle(0, 0, 0).setName("Box 75")
		);
		lights_indicator_left.add(new ModelRendererTurbo(lights_indicator_left, 168, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 2.3f, 2.4f, 0, 0.12f, 0, 0, 0, 0, 0, 0, 0, -0.26f, 0.12f, 0, -1.2f, 0.12f, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0.12f, 0, -1.1f)
			.setRotationPoint(-55.2f, -2.6f, 19.2f).setRotationAngle(0, 0, 0).setName("Box 106cp")
		);
		lights_indicator_left.addProgram(DefaultPrograms.INDICATOR_LIGHT_LEFT);
		this.groups.add(lights_indicator_left);
		//
		ModelGroup lights_indicator_right = new ModelGroup("lights_indicator_right");
		lights_indicator_right.add(new ModelRendererTurbo(lights_indicator_right, 505, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2.4f, 1.2f, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0, 0, -0.6f, -0.6f, 0, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.4f, -1.4f, -22.2f).setRotationAngle(0, 0, 0).setName("Box 43")
		);
		lights_indicator_right.add(new ModelRendererTurbo(lights_indicator_right, 378, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 2.6f, 3.6000001f, 0, 0, -0.24000001f, 0, -0.36f, -0.24000001f, -0.96f, -0.36f, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, -0.36f, -0.24000001f, -0.96f, -0.36f, -0.24000001f, 0, 0, -0.24000001f, 0)
			.setRotationPoint(51.600002f, -4, -20.400002f).setRotationAngle(0, 0, 0).setName("Box 83cp")
		);
		lights_indicator_right.add(new ModelRendererTurbo(lights_indicator_right, 83, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 2.3f, 2.4f, 0, 0.12f, 0, -1.2f, 0, 0, -0.26f, 0, 0, 0, 0.12f, 0, 0, 0.12f, 0, -1.1f, 0, 0, -0.1f, 0, 0, 0, 0.12f, 0, 0)
			.setRotationPoint(-55.2f, -2.6f, -21.6f).setRotationAngle(0, 0, 0).setName("Box 106cp")
		);
		lights_indicator_right.addProgram(DefaultPrograms.INDICATOR_LIGHT_RIGHT);
		this.groups.add(lights_indicator_right);
		//
		ModelGroup lights_rear = new ModelGroup("lights_rear");
		lights_rear.add(new ModelRendererTurbo(lights_rear, 66, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 4.8f, 2.4f, 0, 0.12f, 0, -1.46f, 0, 0, -0.68f, 0, 0, 0, 0.12f, 0, 0, 0.12f, 0, -1.22f, 0, 0, -0.26f, 0, 0, 0, 0.12f, 0, 0)
			.setRotationPoint(-55.2f, -7.4f, -21.6f).setRotationAngle(0, 0, 0).setName("Box 106")
		);
		lights_rear.add(new ModelRendererTurbo(lights_rear, 17, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 4.8f, 2.4f, 0, 0.120000005f, 0, 0, 0, 0, 0, 0, 0, -0.68f, 0.120000005f, 0, -1.46f, 0.120000005f, 0, 0, 0, 0, 0, 0, 0, -0.26f, 0.120000005f, 0, -1.22f)
			.setRotationPoint(-55.2f, -7.4f, 19.2f).setRotationAngle(0, 0, 0).setName("Box 107")
		);
		lights_rear.addProgram(DefaultPrograms.REAR_LIGHTS);
		this.groups.add(lights_rear);
	}

}
