//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.part.c12;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c12_cargo1")
public class C12Cargo1 extends PartModel {

	public C12Cargo1(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList cargo_1 = new TurboList("cargo_1");
		cargo_1.add(new ModelRendererTurbo(cargo_1, 0, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -1, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-53, -10, 22).setRotationAngle(0, 0, 0)
		);
		cargo_1.add(new ModelRendererTurbo(cargo_1, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, -1, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -10, -23).setRotationAngle(0, 0, 0)
		);
		cargo_1.add(new ModelRendererTurbo(cargo_1, 377, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 44, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -10, -22).setRotationAngle(0, 0, 0)
		);
		cargo_1.add(new ModelRendererTurbo(cargo_1, 208, 218, textureX, textureY).addBox(0, 0, 0, 1, 1, 24)
			.setRotationPoint(-52.9375f, -9, -12).setRotationAngle(0, 0, 0)
		);
		cargo_1.add(new ModelRendererTurbo(cargo_1, 299, 33, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-52.9375f, -9, -14).setRotationAngle(0, 0, 0)
		);
		cargo_1.add(new ModelRendererTurbo(cargo_1, 145, 8, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-52.9375f, -9, 12).setRotationAngle(0, 0, 0)
		);
		cargo_1.addProgram(DefaultPrograms.getRGBChannel("cargo"));
		this.groups.add(cargo_1);
		//
	}

}
