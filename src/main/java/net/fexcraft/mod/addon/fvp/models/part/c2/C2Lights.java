//FMT-Marker FVTM-1.1
package net.fexcraft.mod.addon.fvp.models.part.c2;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.ModelGroup;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;

/** This file was exported via the FVTM Exporter V1.2 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.9 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c2_lights")
public class C2Lights extends PartModel {

	public C2Lights(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup back_lights = new ModelGroup("back_lights");
		back_lights.add(new ModelRendererTurbo(back_lights, 505, 17, textureX, textureY).addBox(0, 0, 0, 1, 7, 2)
			.setRotationPoint(-82.2f, -25, 20.5f).setRotationAngle(0, 0, 0).setName("Box 148")
		);
		back_lights.add(new ModelRendererTurbo(back_lights, 273, 33, textureX, textureY).addBox(0, 0, 0, 1, 7, 2)
			.setRotationPoint(-82.2f, -25, -22.5f).setRotationAngle(0, 0, 0).setName("Box 149")
		);
		back_lights.addProgram(DefaultPrograms.BACK_LIGHTS);
		this.groups.add(back_lights);
		//
		ModelGroup front_lights = new ModelGroup("front_lights");
		front_lights.add(new ModelRendererTurbo(front_lights, 1, 1, textureX, textureY).addBox(0, 0, 0, 4, 3, 6)
			.setRotationPoint(40.5f, -22, 16).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		front_lights.add(new ModelRendererTurbo(front_lights, 25, 1, textureX, textureY).addBox(0, 0, 0, 4, 3, 6)
			.setRotationPoint(40.5f, -22, -22).setRotationAngle(0, 0, 0).setName("Box 15")
		);
		front_lights.addProgram(DefaultPrograms.FRONT_LIGHTS);
		this.groups.add(front_lights);
		//
		ModelGroup indicator_light_left = new ModelGroup("indicator_light_left");
		indicator_light_left.add(new ModelRendererTurbo(indicator_light_left, 209, 1, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(42.5f, -21.5f, 23).setRotationAngle(0, 0, 0).setName("Box 30")
		);
		indicator_light_left.addProgram(DefaultPrograms.INDICATOR_LIGHT_LEFT);
		this.groups.add(indicator_light_left);
		//
		ModelGroup indicator_light_right = new ModelGroup("indicator_light_right");
		indicator_light_right.add(new ModelRendererTurbo(indicator_light_right, 41, 1, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(42.5f, -21.5f, -24).setRotationAngle(0, 0, 0).setName("Box 29")
		);
		indicator_light_right.addProgram(DefaultPrograms.INDICATOR_LIGHT_RIGHT);
		this.groups.add(indicator_light_right);
	}

}
