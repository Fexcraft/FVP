//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.part.ab1b;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/ab1b_lights")
public class AB1Lights extends PartModel {

	public AB1Lights(){
		super(); textureX = 1024; textureY = 1024;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList lights_front = new TurboList("lights_front");
		lights_front.add(new ModelRendererTurbo(lights_front, 81, 161, textureX, textureY).addBox(0, 0, 2, 1, 4, 6)
			.setRotationPoint(97.2f, -10, -31).setRotationAngle(0, 21, -2).setName("Box 307cp")
		);
		lights_front.add(new ModelRendererTurbo(lights_front, 57, 161, textureX, textureY).addBox(0, 0, -8, 1, 4, 6)
			.setRotationPoint(97.2f, -10, 31).setRotationAngle(0, -21, -2).setName("Box 306cp")
		);
		lights_front.addProgram(DefaultPrograms.FRONT_LIGHTS);
		this.groups.add(lights_front);
		//
		TurboList lights_back = new TurboList("lights_back");
		lights_back.add(new ModelRendererTurbo(lights_back, 33, 161, textureX, textureY).addBox(0, 0, -3, 1, 7, 3)
			.setRotationPoint(-108.2f, -21, 31).setRotationAngle(0, 21, 0).setName("Box 308cp")
		);
		lights_back.add(new ModelRendererTurbo(lights_back, 321, 161, textureX, textureY).addBox(0, 0, 0, 1, 7, 3)
			.setRotationPoint(-108.2f, -21, -31).setRotationAngle(0, -21, 0).setName("Box 309cp")
		);
		lights_back.addProgram(DefaultPrograms.BACK_LIGHTS);
		this.groups.add(lights_back);
		//
		TurboList lights_turn_left = new TurboList("lights_turn_left");
		lights_turn_left.add(new ModelRendererTurbo(lights_turn_left, 39, 171, textureX, textureY).addBox(0, 0, -3, 1, 2, 3)
			.setRotationPoint(-108.2f, -14, 31).setRotationAngle(0, 21, 0).setName("Box 308cp")
		);
		lights_turn_left.add(new ModelRendererTurbo(lights_turn_left, 57, 161, textureX, textureY).addBox(0, 0, -2, 1, 4, 2)
			.setRotationPoint(97.2f, -10, 31).setRotationAngle(0, -21, -2).setName("Box 306cp")
		);
		lights_turn_left.addProgram(DefaultPrograms.INDICATOR_LIGHT_LEFT);
		this.groups.add(lights_turn_left);
		//
		TurboList lights_turn_right = new TurboList("lights_turn_right");
		lights_turn_right.add(new ModelRendererTurbo(lights_turn_right, 327, 171, textureX, textureY).addBox(0, 0, 0, 1, 2, 3)
			.setRotationPoint(-108.2f, -14, -31).setRotationAngle(0, -21, 0).setName("Box 309cp")
		);
		lights_turn_right.add(new ModelRendererTurbo(lights_turn_right, 81, 161, textureX, textureY).addBox(0, 0, 0, 1, 4, 2)
			.setRotationPoint(97.2f, -10, -31).setRotationAngle(0, 21, -2).setName("Box 307cp")
		);
		lights_turn_right.addProgram(DefaultPrograms.INDICATOR_LIGHT_RIGHT);
		this.groups.add(lights_turn_right);
		//
		TurboList lights_reverse = new TurboList("lights_reverse");
		lights_reverse.add(new ModelRendererTurbo(lights_reverse, 319, 171, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-108.2f, -22, -31).setRotationAngle(0, -21, 0).setName("Box 309cp")
		);
		lights_reverse.add(new ModelRendererTurbo(lights_reverse, 31, 171, textureX, textureY).addBox(0, 0, -3, 1, 1, 3)
			.setRotationPoint(-108.2f, -22, 31).setRotationAngle(0, 21, 0).setName("Box 308cp")
		);
		lights_reverse.addProgram(DefaultPrograms.REVERSE_LIGHTS);
		this.groups.add(lights_reverse);
		//
		TurboList lights_brake = new TurboList("lights_brake");
		lights_brake.add(new ModelRendererTurbo(lights_brake, 319, 175, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-108.2f, -23, -31).setRotationAngle(0, -21, 0).setName("Box 309cp")
		);
		lights_brake.add(new ModelRendererTurbo(lights_brake, 31, 175, textureX, textureY).addBox(0, 0, -3, 1, 1, 3)
			.setRotationPoint(-108.2f, -23, 31).setRotationAngle(0, 21, 0).setName("Box 308cp")
		);
		lights_brake.add(new ModelRendererTurbo(lights_brake, 51, 172, textureX, textureY).addBox(0, 0, -4, 1, 1, 8)
			.setRotationPoint(-109.2f, -48, 0).setRotationAngle(0, 0, 0).setName("Box 308cp")
		);
		lights_brake.addProgram(DefaultPrograms.BRAKE_LIGHTS);
		this.groups.add(lights_brake);
	}

}
