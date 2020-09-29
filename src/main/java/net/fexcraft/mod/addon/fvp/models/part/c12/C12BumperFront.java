//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.part.c12;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c12_bumper_front")
public class C12BumperFront extends PartModel {

	public C12BumperFront(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList bumper_front = new TurboList("bumper_front");
		bumper_front.add(new ModelRendererTurbo(bumper_front, 347, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.5f, 4.5f, 11).setRotationAngle(0, 0, 0)
		);
		bumper_front.add(new ModelRendererTurbo(bumper_front, 299, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.5f, 4.5f, -13).setRotationAngle(0, 0, 0)
		);
		bumper_front.add(new ModelRendererTurbo(bumper_front, 265, 36, textureX, textureY)
			.addShapeBox(0, -1, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(34, 7, 11.5f).setRotationAngle(0, 0, 0)
		);
		bumper_front.add(new ModelRendererTurbo(bumper_front, 145, 36, textureX, textureY)
			.addShapeBox(0, -1, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(34, 7, -12.5f).setRotationAngle(0, 0, 0)
		);
		bumper_front.add(new ModelRendererTurbo(bumper_front, 122, 95, textureX, textureY).addBox(0, -15, 0, 1, 16, 1)
			.setRotationPoint(44.5f, 5, 11.5f).setRotationAngle(0, 0, 0)
		);
		bumper_front.add(new ModelRendererTurbo(bumper_front, 116, 95, textureX, textureY).addBox(0, -15, 0, 1, 16, 1)
			.setRotationPoint(44.5f, 5, -12.5f).setRotationAngle(0, 0, 0)
		);
		bumper_front.add(new ModelRendererTurbo(bumper_front, 112, 95, textureX, textureY)
			.addShapeBox(0, -15, 0, 0.5f, 16, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.5f, 5, 11.5f).setRotationAngle(0, 0, 0)
		);
		bumper_front.add(new ModelRendererTurbo(bumper_front, 108, 95, textureX, textureY)
			.addShapeBox(0, -15, 0, 0.5f, 16, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.5f, 5, -12.5f).setRotationAngle(0, 0, 0)
		);
		bumper_front.add(new ModelRendererTurbo(bumper_front, 104, 95, textureX, textureY)
			.addShapeBox(0, -15, 0, 0.5f, 16, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44, 5, 11.5f).setRotationAngle(0, 0, 0)
		);
		bumper_front.add(new ModelRendererTurbo(bumper_front, 100, 95, textureX, textureY)
			.addShapeBox(0, -15, 0, 0.5f, 16, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44, 5, -12.5f).setRotationAngle(0, 0, 0)
		);
		bumper_front.add(new ModelRendererTurbo(bumper_front, 102, 94, textureX, textureY).addBox(0, 0, 0, 1, 1, 45)
			.setRotationPoint(44.5f, -9, -22.5f).setRotationAngle(0, 0, 0)
		);
		bumper_front.add(new ModelRendererTurbo(bumper_front, 51, 47, textureX, textureY).addBox(0, 0, 0, 1, 1, 47)
			.setRotationPoint(44.5f, -1.5f, -23.5f).setRotationAngle(0, 0, 0)
		);
		bumper_front.add(new ModelRendererTurbo(bumper_front, 449, 65, textureX, textureY).addBox(0, 0, 0, 1, 1, 26)
			.setRotationPoint(44.5f, 3, -13).setRotationAngle(0, 0, 0)
		);
		bumper_front.add(new ModelRendererTurbo(bumper_front, 489, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -4.5f, 0, 0, -4.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 4.5f, 0, 0, 4.5f, 0)
			.setRotationPoint(44.5f, -1.5f, -23).setRotationAngle(0, 0, 0)
		);
		bumper_front.add(new ModelRendererTurbo(bumper_front, 469, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 1, 0, -0.5f, 1, 0, -0.5f, -1, 0, -0.5f, -1)
			.setRotationPoint(44.5f, -9, -22.5f).setRotationAngle(0, 0, 0)
		);
		bumper_front.add(new ModelRendererTurbo(bumper_front, 363, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, -4.5f, 0, 0, -4.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 4.5f, 0, 0, 4.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(44.5f, -1.5f, 13).setRotationAngle(0, 0, 0)
		);
		bumper_front.add(new ModelRendererTurbo(bumper_front, 465, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 1, 0, -0.5f, 1)
			.setRotationPoint(44.5f, -9, 21.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(bumper_front);
	}

}
