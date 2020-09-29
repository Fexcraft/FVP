//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.part.c12;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c12_cargo2")
public class C12Cargo2 extends PartModel {

	public C12Cargo2(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList cargo_2 = new TurboList("cargo_2");
		cargo_2.add(new ModelRendererTurbo(cargo_2, 173, 94, textureX, textureY).addBox(0, 0, 0, 1, 12, 2)
			.setRotationPoint(-34.5f, -17, 18.5f).setRotationAngle(0, 0, 0)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 332, 196, textureX, textureY).addBox(0, 0, 0, 2, 1, 35)
			.setRotationPoint(-35, -19.5f, -17.5f).setRotationAngle(0, 0, 0)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 112, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, -2, 1, 0, -2, 1, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.5f, -20, 18.5f).setRotationAngle(0, 0, 0)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 167, 94, textureX, textureY).addBox(0, 0, 0, 1, 12, 2)
			.setRotationPoint(-34.5f, -17, -20.5f).setRotationAngle(0, 0, 0)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 363, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -3, 0, 0, -3, 0, -2, 1, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.5f, -20, -20.5f).setRotationAngle(0, 0, 0)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 139, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0.5f, 35, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35, -20, -17.5f).setRotationAngle(0, 0, 0)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 47, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0.5f, 35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-35, -18.5f, -17.5f).setRotationAngle(0, 0, 0)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 161, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 2, 0, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-35, -17, -20.5f).setRotationAngle(0, 0, 0)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 155, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 2, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0)
			.setRotationPoint(-34, -17, 18.5f).setRotationAngle(0, 0, 0)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 149, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 2, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0)
			.setRotationPoint(-34, -17, -20.5f).setRotationAngle(0, 0, 0)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 300, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, -0.5f, -1.5f, 1, 0, -2, 1, 0, 0, -3, -0.5f, -0.5f, -3, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f)
			.setRotationPoint(-35.5f, -20, 18.5f).setRotationAngle(0, 0, 0)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 299, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, -2, 1, -0.5f, -1.5f, 1, -0.5f, -0.5f, -3, 0, 0, -3, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(-33.5f, -20, 18.5f).setRotationAngle(0, 0, 0)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 403, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, -0.5f, -0.5f, -3, 0, 0, -3, 0, -2, 1, -0.5f, -1.5f, 1, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f)
			.setRotationPoint(-35.5f, -20, -20.5f).setRotationAngle(0, 0, 0)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 154, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -3, -0.5f, -0.5f, -3, -0.5f, -1.5f, 1, 0, -2, 1, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(-33.5f, -20, -20.5f).setRotationAngle(0, 0, 0)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 502, 29, textureX, textureY).addBox(0, 0, 0, 3, 1, 2)
			.setRotationPoint(-51, -0.5f, -20.5f).setRotationAngle(0, 0, 0)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 396, 48, textureX, textureY).addBox(0, 0, 0, 22, 1, 0.5f)
			.setRotationPoint(-50.5f, -0.5f, -19.75f).setRotationAngle(0, 0, -42)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 216, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-50.5f, -0.5f, -19.25f).setRotationAngle(0, 0, -42)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 463, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.5f, -0.5f, -20).setRotationAngle(0, 0, -42)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 411, 27, textureX, textureY).addBox(0, 0, 0, 3, 1, 2)
			.setRotationPoint(-51, -0.5f, 18.5f).setRotationAngle(0, 0, 0)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 347, 41, textureX, textureY).addBox(0, 0, 0, 22, 1, 0.5f)
			.setRotationPoint(-50.5f, -0.5f, 19.25f).setRotationAngle(0, 0, -42)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 463, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-50.5f, -0.5f, 19.75f).setRotationAngle(0, 0, -42)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 463, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.5f, -0.5f, 19).setRotationAngle(0, 0, -42)
		);
		cargo_2.add(new ModelRendererTurbo(cargo_2, 505, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 2, 0, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-35, -17, 18.5f).setRotationAngle(0, 0, 0)
		);
		cargo_2.addProgram(DefaultPrograms.getRGBChannel("cargo"));
		this.groups.add(cargo_2);
		//
	}

}
