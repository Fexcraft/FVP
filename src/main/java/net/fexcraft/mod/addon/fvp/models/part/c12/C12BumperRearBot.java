//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.part.c12;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c12_bumper_rear_bot")
public class C12BumperRearBot extends PartModel {

	public C12BumperRearBot(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup bumper_rear_bot = new ModelGroup("bumper_rear_bot");
		bumper_rear_bot.add(new ModelRendererTurbo(bumper_rear_bot, 411, 211, textureX, textureY).addBox(0, 0, 0, 0.5f, 3.5f, 32)
			.setRotationPoint(-53.5f, 0, -16).setRotationAngle(0, 0, 0)
		);
		bumper_rear_bot.add(new ModelRendererTurbo(bumper_rear_bot, 289, 178, textureX, textureY).addBox(0, 0, 0, 1, 5, 38)
			.setRotationPoint(-54.5f, 1, -19).setRotationAngle(0, 0, 0)
		);
		bumper_rear_bot.add(new ModelRendererTurbo(bumper_rear_bot, 431, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.5f, 1, -22).setRotationAngle(0, 0, 0)
		);
		bumper_rear_bot.add(new ModelRendererTurbo(bumper_rear_bot, 412, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0)
			.setRotationPoint(-54.5f, 1, 19).setRotationAngle(0, 0, 0)
		);
		bumper_rear_bot.add(new ModelRendererTurbo(bumper_rear_bot, 295, 20, textureX, textureY).addBox(0, 0, 0, 1, 2, 4)
			.setRotationPoint(-54.625f, 1.5f, 16).setRotationAngle(0, 0, 0)
		);
		bumper_rear_bot.add(new ModelRendererTurbo(bumper_rear_bot, 411, 18, textureX, textureY).addBox(0, 0, 0, 1, 2, 4)
			.setRotationPoint(-54.625f, 1.5f, -20).setRotationAngle(0, 0, 0)
		);
		bumper_rear_bot.add(new ModelRendererTurbo(bumper_rear_bot, 183, 36, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-54.625f, 1.5f, 20.5f).setRotationAngle(0, 0, 0)
		);
		bumper_rear_bot.add(new ModelRendererTurbo(bumper_rear_bot, 41, 35, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-54.625f, 1.5f, -21.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(bumper_rear_bot);
		//
	}

}
