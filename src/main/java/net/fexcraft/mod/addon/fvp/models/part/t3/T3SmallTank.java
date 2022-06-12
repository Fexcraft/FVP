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
@fModel(registryname = "fvp:models/part/t3_small_tank")
public class T3SmallTank extends PartModel {

	public T3SmallTank(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup small_tank_left = new ModelGroup("small_tank_left");
		small_tank_left.add(new ModelRendererTurbo(small_tank_left, 482, 180, textureX, textureY).addCylinder(0, 0, 0, 7, 16, 8, 1, 1, 3, null)
			.setRotationPoint(-63, -8, 19).setRotationAngle(22.5f, 0, 0)
		);
		small_tank_left.add(new ModelRendererTurbo(small_tank_left, 470, 91, textureX, textureY).addCylinder(0, 0, 0, 7, 2, 8, 0.7f, 1, 3, null)
			.setRotationPoint(-65, -8, 19).setRotationAngle(22.5f, 0, 0)
		);
		small_tank_left.add(new ModelRendererTurbo(small_tank_left, 0, 34, textureX, textureY).addCylinder(0, 0, 0, 7, 2, 8, 1, 0.7f, 3, null)
			.setRotationPoint(-47, -8, 19).setRotationAngle(22.5f, 0, 0)
		);
		small_tank_left.add(new ModelRendererTurbo(small_tank_left, 349, 341, textureX, textureY).addBox(0, 0, 0, 1, 10, 4)
			.setRotationPoint(-62, -13, 11).setRotationAngle(0, 0, 0)
		);
		small_tank_left.add(new ModelRendererTurbo(small_tank_left, 78, 336, textureX, textureY).addBox(0, 0, 0, 1, 10, 4)
			.setRotationPoint(-49, -13, 11).setRotationAngle(0, 0, 0)
		);
		small_tank_left.addProgram(new DefaultPrograms.IDSpecific("storage_left_s"));
		this.groups.add(small_tank_left);
		//
		ModelGroup small_tank_right = new ModelGroup("small_tank_right");
		small_tank_right.add(new ModelRendererTurbo(small_tank_right, 174, 54, textureX, textureY).addCylinder(0, 0, 0, 7, 16, 8, 1, 1, 3, null)
			.setRotationPoint(-63, -8, -19).setRotationAngle(22.5f, 0, 0)
		);
		small_tank_right.add(new ModelRendererTurbo(small_tank_right, 0, 17, textureX, textureY).addCylinder(0, 0, 0, 7, 2, 8, 0.7f, 1, 3, null)
			.setRotationPoint(-65, -8, -19).setRotationAngle(22.5f, 0, 0)
		);
		small_tank_right.add(new ModelRendererTurbo(small_tank_right, 0, 0, textureX, textureY).addCylinder(0, 0, 0, 7, 2, 8, 1, 0.7f, 3, null)
			.setRotationPoint(-47, -8, -19).setRotationAngle(22.5f, 0, 0)
		);
		small_tank_right.add(new ModelRendererTurbo(small_tank_right, 98, 331, textureX, textureY).addBox(0, 0, 0, 1, 10, 4)
			.setRotationPoint(-62, -13, -15).setRotationAngle(0, 0, 0)
		);
		small_tank_right.add(new ModelRendererTurbo(small_tank_right, 224, 327, textureX, textureY).addBox(0, 0, 0, 1, 10, 4)
			.setRotationPoint(-49, -13, -15).setRotationAngle(0, 0, 0)
		);
		small_tank_right.addProgram(new DefaultPrograms.IDSpecificArray("storage_right_s"));
		this.groups.add(small_tank_right);
	}

}
