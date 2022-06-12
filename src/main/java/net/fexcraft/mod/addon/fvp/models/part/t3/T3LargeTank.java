//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.t3;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.5.2 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/t3_large_tank")
public class T3LargeTank extends PartModel {

	public T3LargeTank(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup large_tank_left = new ModelGroup("large_tank_left");
		large_tank_left.add(new ModelRendererTurbo(large_tank_left, 363, 210, textureX, textureY).addCylinder(0, 0, 0, 7, 40, 8, 1, 1, 3, null)
			.setRotationPoint(-55, -8, 19).setRotationAngle(22.5f, 0, 0)
		);
		large_tank_left.add(new ModelRendererTurbo(large_tank_left, 450, 193, textureX, textureY).addCylinder(0, 0, 0, 7, 2, 8, 0.7f, 1, 3, null)
			.setRotationPoint(-57, -8, 19).setRotationAngle(22.5f, 0, 0)
		);
		large_tank_left.add(new ModelRendererTurbo(large_tank_left, 421, 193, textureX, textureY).addCylinder(0, 0, 0, 7, 2, 8, 1, 0.7f, 3, null)
			.setRotationPoint(-15, -8, 19).setRotationAngle(22.5f, 0, 0)
		);
		large_tank_left.add(new ModelRendererTurbo(large_tank_left, 219, 359, textureX, textureY).addBox(0, 0, 0, 1, 10, 4)
			.setRotationPoint(-30, -13, 11).setRotationAngle(0, 0, 0)
		);
		large_tank_left.add(new ModelRendererTurbo(large_tank_left, 136, 358, textureX, textureY).addBox(0, 0, 0, 1, 10, 4)
			.setRotationPoint(-17, -13, 11).setRotationAngle(0, 0, 0)
		);
		large_tank_left.add(new ModelRendererTurbo(large_tank_left, 440, 356, textureX, textureY).addBox(0, 0, 0, 1, 10, 4)
			.setRotationPoint(-54, -13, 11).setRotationAngle(0, 0, 0)
		);
		large_tank_left.add(new ModelRendererTurbo(large_tank_left, 429, 356, textureX, textureY).addBox(0, 0, 0, 1, 10, 4)
			.setRotationPoint(-41, -13, 11).setRotationAngle(0, 0, 0)
		);
		large_tank_left.addProgram(new DefaultPrograms.IDSpecific("storage_left_l"));
		this.groups.add(large_tank_left);
		//
		ModelGroup large_tank_right = new ModelGroup("large_tank_right");
		large_tank_right.add(new ModelRendererTurbo(large_tank_right, 392, 193, textureX, textureY).addCylinder(0, 0, 0, 7, 40, 8, 1, 1, 3, null)
			.setRotationPoint(-55, -8, -19).setRotationAngle(22.5f, 0, 0)
		);
		large_tank_right.add(new ModelRendererTurbo(large_tank_right, 363, 193, textureX, textureY).addCylinder(0, 0, 0, 7, 2, 8, 0.7f, 1, 3, null)
			.setRotationPoint(-57, -8, -19).setRotationAngle(22.5f, 0, 0)
		);
		large_tank_right.add(new ModelRendererTurbo(large_tank_right, 470, 108, textureX, textureY).addCylinder(0, 0, 0, 7, 2, 8, 1, 0.7f, 3, null)
			.setRotationPoint(-15, -8, -19).setRotationAngle(22.5f, 0, 0)
		);
		large_tank_right.add(new ModelRendererTurbo(large_tank_right, 291, 353, textureX, textureY).addBox(0, 0, 0, 1, 10, 4)
			.setRotationPoint(-30, -13, -15).setRotationAngle(0, 0, 0)
		);
		large_tank_right.add(new ModelRendererTurbo(large_tank_right, 407, 351, textureX, textureY).addBox(0, 0, 0, 1, 10, 4)
			.setRotationPoint(-17, -13, -15).setRotationAngle(0, 0, 0)
		);
		large_tank_right.add(new ModelRendererTurbo(large_tank_right, 396, 351, textureX, textureY).addBox(0, 0, 0, 1, 10, 4)
			.setRotationPoint(-54, -13, -15).setRotationAngle(0, 0, 0)
		);
		large_tank_right.add(new ModelRendererTurbo(large_tank_right, 136, 343, textureX, textureY).addBox(0, 0, 0, 1, 10, 4)
			.setRotationPoint(-41, -13, -15).setRotationAngle(0, 0, 0)
		);
		large_tank_right.addProgram(new DefaultPrograms.IDSpecific("storage_right_l"));
		this.groups.add(large_tank_right);
		//
	}

}
