//FMT-Marker FVTM-1
package net.fexcraft.mod.addon.fvp.models.part.c5;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter V1 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.0.1-test &copy; 2018 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c5_lights")
public class C5FrontLights extends PartModel {

	public C5FrontLights(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList lights_front = new TurboList("lights_front");
		lights_front.add(new ModelRendererTurbo(lights_front, 201, 25, textureX, textureY).addBox(0, 0, 0, 2, 3, 5)
			.setRotationPoint(59.9f, -6, -21.9f).setRotationAngle(0, 0, 0).setName("Box 85")
		);
		lights_front.add(new ModelRendererTurbo(lights_front, 89, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(59.9f, -6, -22.9f).setRotationAngle(0, 0, 0).setName("Box 87")
		);
		lights_front.add(new ModelRendererTurbo(lights_front, 129, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(59.9f, -6, 21.9f).setRotationAngle(0, 0, 0).setName("Box 89")
		);
		lights_front.add(new ModelRendererTurbo(lights_front, 281, 25, textureX, textureY).addBox(0, 0, 0, 2, 3, 5)
			.setRotationPoint(59.9f, -6, 16.9f).setRotationAngle(0, 0, 0).setName("Box 90")
		);
		lights_front.addProgram(DefaultPrograms.FRONT_LIGHTS);
		this.groups.add(lights_front);
		//
		TurboList lights_rear = new TurboList("lights_rear");
		lights_rear.add(new ModelRendererTurbo(lights_rear, 233, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-40.9f, -6, 21.9f).setRotationAngle(0, 0, 0).setName("Box 138")
		);
		lights_rear.add(new ModelRendererTurbo(lights_rear, 305, 81, textureX, textureY).addBox(0, 0, 0, 2, 3, 5)
			.setRotationPoint(-40.9f, -6, 16.9f).setRotationAngle(0, 0, 0).setName("Box 139")
		);
		lights_rear.add(new ModelRendererTurbo(lights_rear, 249, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.9f, -6, -22.9f).setRotationAngle(0, 0, 0).setName("Box 142")
		);
		lights_rear.add(new ModelRendererTurbo(lights_rear, 321, 81, textureX, textureY).addBox(0, 0, 0, 2, 3, 5)
			.setRotationPoint(-40.9f, -6, -21.9f).setRotationAngle(0, 0, 0).setName("Box 143")
		);
		lights_rear.addProgram(DefaultPrograms.BACK_LIGHTS);
		this.groups.add(lights_rear);
	}

}