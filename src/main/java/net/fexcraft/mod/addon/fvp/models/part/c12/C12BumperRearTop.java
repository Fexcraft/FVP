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
@fModel(registryname = "fvp:models/part/c12_bumper_rear_top")
public class C12BumperRearTop extends PartModel {

	public C12BumperRearTop(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup bumper_rear_top = new ModelGroup("bumper_rear_top");
		bumper_rear_top.add(new ModelRendererTurbo(bumper_rear_top, 472, 3, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-54, 0, -14).setRotationAngle(0, 0, 0)
		);
		bumper_rear_top.add(new ModelRendererTurbo(bumper_rear_top, 472, 0, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-54, 0, 12).setRotationAngle(0, 0, 0)
		);
		bumper_rear_top.add(new ModelRendererTurbo(bumper_rear_top, 100, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 46, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-54.5f, -1, -23).setRotationAngle(0, 0, 0)
		);
		bumper_rear_top.add(new ModelRendererTurbo(bumper_rear_top, 233, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.5f, -10, -23).setRotationAngle(0, 0, 0)
		);
		bumper_rear_top.add(new ModelRendererTurbo(bumper_rear_top, 453, 65, textureX, textureY).addBox(0, 0, 0, 1, 8, 1)
			.setRotationPoint(-54.5f, -9, -23).setRotationAngle(0, 0, 0)
		);
		bumper_rear_top.add(new ModelRendererTurbo(bumper_rear_top, 449, 65, textureX, textureY).addBox(0, 0, 0, 1, 8, 1)
			.setRotationPoint(-54.5f, -9, -17).setRotationAngle(0, 0, 0)
		);
		bumper_rear_top.add(new ModelRendererTurbo(bumper_rear_top, 232, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.5f, -10, 12).setRotationAngle(0, 0, 0)
		);
		bumper_rear_top.add(new ModelRendererTurbo(bumper_rear_top, 168, 64, textureX, textureY).addBox(0, 0, 0, 1, 8, 1)
			.setRotationPoint(-54.5f, -9, 22).setRotationAngle(0, 0, 0)
		);
		bumper_rear_top.add(new ModelRendererTurbo(bumper_rear_top, 164, 64, textureX, textureY).addBox(0, 0, 0, 1, 8, 1)
			.setRotationPoint(-54.5f, -9, 16).setRotationAngle(0, 0, 0)
		);
		bumper_rear_top.add(new ModelRendererTurbo(bumper_rear_top, 141, 63, textureX, textureY).addBox(0, 0, 0, 1, 8, 1)
			.setRotationPoint(-54.5f, -9, 12).setRotationAngle(0, 0, 0)
		);
		bumper_rear_top.add(new ModelRendererTurbo(bumper_rear_top, 16, 62, textureX, textureY).addBox(0, 0, 0, 1, 8, 1)
			.setRotationPoint(-54.5f, -9, -13).setRotationAngle(0, 0, 0)
		);
		bumper_rear_top.add(new ModelRendererTurbo(bumper_rear_top, 153, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0)
			.setRotationPoint(-54.5f, -7.5f, -16).setRotationAngle(0, 0, 0)
		);
		bumper_rear_top.add(new ModelRendererTurbo(bumper_rear_top, 145, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.5f, -7.5f, 13).setRotationAngle(0, 0, 0)
		);
		this.groups.add(bumper_rear_top);
		//
	}

}
