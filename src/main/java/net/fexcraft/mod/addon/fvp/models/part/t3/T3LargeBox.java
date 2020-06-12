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
@fModel(registryname = "fvp:models/part/t3_large_box")
public class T3LargeBox extends PartModel {

	public T3LargeBox(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList large_box_left = new TurboList("large_box_left");
		large_box_left.add(new ModelRendererTurbo(large_box_left, 271, 317, textureX, textureY).addBox(0, 0, 0, 1, 10, 3)
			.setRotationPoint(-40, -13, 11).setRotationAngle(0, 0, 0)
		);
		large_box_left.add(new ModelRendererTurbo(large_box_left, 204, 306, textureX, textureY).addBox(0, 0, 0, 1, 10, 3)
			.setRotationPoint(-17, -13, 11).setRotationAngle(0, 0, 0)
		);
		large_box_left.add(new ModelRendererTurbo(large_box_left, 286, 193, textureX, textureY).addBox(0, 0, 0, 28, 12, 10)
			.setRotationPoint(-42, -14, 14).setRotationAngle(0, 0, 0)
		);
		large_box_left.add(new ModelRendererTurbo(large_box_left, 314, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 12, 2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0)
			.setRotationPoint(-42, -14, 24).setRotationAngle(0, 0, 0)
		);
		large_box_left.add(new ModelRendererTurbo(large_box_left, 360, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30, -7, 26).setRotationAngle(0, 0, 0)
		);
		large_box_left.add(new ModelRendererTurbo(large_box_left, 234, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f)
			.setRotationPoint(-31, -7, 26).setRotationAngle(0, 0, 0)
		);
		large_box_left.add(new ModelRendererTurbo(large_box_left, 141, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0)
			.setRotationPoint(-26, -7, 26).setRotationAngle(0, 0, 0)
		);
		large_box_left.addProgram(new DefaultPrograms.IDSpecific("storage_left_l"));
		this.groups.add(large_box_left);
		//
		TurboList large_box_right = new TurboList("large_box_right");
		large_box_right.add(new ModelRendererTurbo(large_box_right, 195, 306, textureX, textureY).addBox(0, 0, 0, 1, 10, 3)
			.setRotationPoint(-40, -13, -14).setRotationAngle(0, 0, 0)
		);
		large_box_right.add(new ModelRendererTurbo(large_box_right, 226, 300, textureX, textureY).addBox(0, 0, 0, 1, 10, 3)
			.setRotationPoint(-17, -13, -14).setRotationAngle(0, 0, 0)
		);
		large_box_right.add(new ModelRendererTurbo(large_box_right, 130, 188, textureX, textureY).addBox(0, 0, 0, 28, 12, 10)
			.setRotationPoint(-42, -14, -24).setRotationAngle(0, 0, 0)
		);
		large_box_right.add(new ModelRendererTurbo(large_box_right, 138, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 12, 2, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -14, -26).setRotationAngle(0, 0, 0)
		);
		large_box_right.add(new ModelRendererTurbo(large_box_right, 392, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-30, -7, -27).setRotationAngle(0, 0, 0)
		);
		large_box_right.add(new ModelRendererTurbo(large_box_right, 502, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31, -7, -27).setRotationAngle(0, 0, 0)
		);
		large_box_right.add(new ModelRendererTurbo(large_box_right, 501, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26, -7, -27).setRotationAngle(0, 0, 0)
		);
		large_box_right.addProgram(new DefaultPrograms.IDSpecific("storage_right_l"));
		this.groups.add(large_box_right);
		//
	}

}
