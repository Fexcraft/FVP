//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.t3;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.5.2 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/t3_rear_lights")
public class T3RearLights extends PartModel {

	public T3RearLights(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList lights_rear = new TurboList("lights_rear");
		lights_rear.add(new ModelRendererTurbo(lights_rear, 464, 91, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.2f, 1.2f, 3, null)
			.setRotationPoint(-132.2f, -8, 4.25f).setRotationAngle(0, 0, 0)
		);
		lights_rear.add(new ModelRendererTurbo(lights_rear, 53, 91, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.2f, 1.2f, 3, null)
			.setRotationPoint(-132.2f, -8, -4.25f).setRotationAngle(0, 0, 0)
		);
		lights_rear.addProgram(DefaultPrograms.BACK_LIGHTS);
		this.groups.add(lights_rear);
		//
		TurboList lights_reverse = new TurboList("lights_reverse");
		lights_reverse.add(new ModelRendererTurbo(lights_reverse, 404, 54, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.2f, 1.2f, 3, null)
			.setRotationPoint(-132.2f, -8, -1.75f).setRotationAngle(0, 0, 0)
		);
		lights_reverse.add(new ModelRendererTurbo(lights_reverse, 46, 45, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1.2f, 1.2f, 3, null)
			.setRotationPoint(-132.2f, -8, 1.75f).setRotationAngle(0, 0, 0)
		);
		lights_reverse.addProgram(DefaultPrograms.REVERSE_LIGHTS);
		this.groups.add(lights_reverse);
		//
		TurboList lights_turn_right_back = new TurboList("lights_turn_right_back");
		lights_turn_right_back.add(new ModelRendererTurbo(lights_turn_right_back, 319, 269, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-133, -9.25f, -10.5f).setRotationAngle(0, 0, -15)
		);
		lights_turn_right_back.addProgram(DefaultPrograms.TURN_SIGNAL_RIGHT);
		this.groups.add(lights_turn_right_back);
		//
		TurboList lights_turn_left_back = new TurboList("lights_turn_left_back");
		lights_turn_left_back.add(new ModelRendererTurbo(lights_turn_left_back, 353, 269, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-133, -9.25f, 7.5f).setRotationAngle(0, 0, -15)
		);
		lights_turn_left_back.addProgram(DefaultPrograms.TURN_SIGNAL_LEFT);
		this.groups.add(lights_turn_left_back);
	}

}
