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
@fModel(registryname = "fvp:models/part/c12_cargo3")
public class C12Cargo3 extends PartModel {

	public C12Cargo3(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList cargo_3 = new TurboList("cargo_3");
		cargo_3.add(new ModelRendererTurbo(cargo_3, 381, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 1, 1.5f, 0, -1, 0, -1, 1, 0, -1, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1.5f, 0.5f, 0, -1)
			.setRotationPoint(-48, -21, -20).setRotationAngle(0, 0, 0)
		);
		cargo_3.add(new ModelRendererTurbo(cargo_3, 49, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 10, 1, 0, -4, 0, -2, 1.5f, 0, -2, 1.5f, 0, 2, -3.5f, 0, 2, -1, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -19, -23).setRotationAngle(0, 0, 0)
		);
		cargo_3.add(new ModelRendererTurbo(cargo_3, 100, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 10, 1, 0, -3.5f, 0, 2, 1.5f, 0, 2, 1.5f, 0, -2, -4, 0, -2, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1, 0, 0)
			.setRotationPoint(-53, -19, 22).setRotationAngle(0, 0, 0)
		);
		cargo_3.add(new ModelRendererTurbo(cargo_3, 0, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 1, 0, -1.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, -1, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.5f, -20, -21).setRotationAngle(0, 0, 0)
		);
		cargo_3.add(new ModelRendererTurbo(cargo_3, 265, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 1, 1.5f, 0, -0.5f, 0, 0, 1, 0, 0, 1, 0, -1, -1, 0, -1, 0.5f, 0, -1, 0, 0, -1.5f, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-48, -21, 18.5f).setRotationAngle(0, 0, 0)
		);
		cargo_3.add(new ModelRendererTurbo(cargo_3, 0, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 1, 0, -1, 0, 0.5f, 0.5f, 0, 0, 0.5f, 0, -0.5f, -1.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-49.5f, -20, 20).setRotationAngle(0, 0, 0)
		);
		cargo_3.add(new ModelRendererTurbo(cargo_3, 268, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 39, 0, -0.5f, 0, -1, 0, 0, -1, 0, 0, -1, -0.5f, 0, -1, 0.5f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0)
			.setRotationPoint(-48, -21, -19.5f).setRotationAngle(0, 0, 0)
		);
		cargo_3.add(new ModelRendererTurbo(cargo_3, 207, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 40, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0.5f, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0.5f, 0, 0)
			.setRotationPoint(-49, -20, -20).setRotationAngle(0, 0, 0)
		);
		cargo_3.add(new ModelRendererTurbo(cargo_3, 138, 95, textureX, textureY).addBox(0, 0, 0, 1, 19, 1)
			.setRotationPoint(-48.5f, -19, 20).setRotationAngle(0, 0, 0)
		);
		cargo_3.add(new ModelRendererTurbo(cargo_3, 134, 95, textureX, textureY).addBox(0, 0, 0, 1, 14, 1)
			.setRotationPoint(-33.5f, -19, 20).setRotationAngle(0, 0, 0)
		);
		cargo_3.add(new ModelRendererTurbo(cargo_3, 130, 95, textureX, textureY).addBox(0, 0, 0, 1, 19, 1)
			.setRotationPoint(-48.5f, -19, -21).setRotationAngle(0, 0, 0)
		);
		cargo_3.add(new ModelRendererTurbo(cargo_3, 126, 95, textureX, textureY).addBox(0, 0, 0, 1, 14, 1)
			.setRotationPoint(-33.5f, -19, -21).setRotationAngle(0, 0, 0)
		);
		cargo_3.addProgram(DefaultPrograms.getRGBChannel("cargo"));
		this.groups.add(cargo_3);
		//
		TurboList cargo3_closed = new TurboList("cargo3_closed");
		cargo3_closed.add(new ModelRendererTurbo(cargo3_closed, 96, 95, textureX, textureY).addBox(0, 0, 0, 1, 1, 24)
			.setRotationPoint(-52.9375f, -9, -12).setRotationAngle(0, 0, 0)
		);
		cargo3_closed.add(new ModelRendererTurbo(cargo3_closed, 145, 5, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-52.9375f, -9, -14).setRotationAngle(0, 0, 0)
		);
		cargo3_closed.add(new ModelRendererTurbo(cargo3_closed, 463, 4, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-52.9375f, -9, 12).setRotationAngle(0, 0, 0)
		);
		cargo3_closed.add(new ModelRendererTurbo(cargo3_closed, 317, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 44, 0, -3.5f, 0, -2, 3.5f, 0, -2, 3.5f, 0, -2, -3.5f, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -19, -22).setRotationAngle(0, 0, 0)
		);
		cargo3_closed.addPrograms(DefaultPrograms.getRGBChannel("cargo"), new DefaultPrograms.AttributeVisible("c12_boot", false));
		this.groups.add(cargo3_closed);
		//
		TurboList cargo3_open = new TurboList("cargo3_open");
		cargo3_open.add(new ModelRendererTurbo(cargo3_open, 363, 96, textureX, textureY).addBox(0, 0, 0, 2, 2, 40)
			.setRotationPoint(-49.5f, -19, -20).setRotationAngle(0, 0, 0)
		);
		cargo3_open.add(new ModelRendererTurbo(cargo3_open, 286, 57, textureX, textureY).addBox(0, 0, 0, 3, 3, 1)
			.setRotationPoint(-50, -19.5f, -19).setRotationAngle(0, 0, 0)
		);
		cargo3_open.add(new ModelRendererTurbo(cargo3_open, 267, 57, textureX, textureY).addBox(0, 0, 0, 3, 3, 1)
			.setRotationPoint(-50, -19.5f, 18).setRotationAngle(0, 0, 0)
		);
		cargo3_open.add(new ModelRendererTurbo(cargo3_open, 246, 57, textureX, textureY).addBox(0, 0, 0, 3, 3, 1)
			.setRotationPoint(-50, -19.5f, -8).setRotationAngle(0, 0, 0)
		);
		cargo3_open.add(new ModelRendererTurbo(cargo3_open, 501, 51, textureX, textureY).addBox(0, 0, 0, 3, 3, 1)
			.setRotationPoint(-50, -19.5f, 7).setRotationAngle(0, 0, 0)
		);
		cargo3_open.addPrograms(DefaultPrograms.getRGBChannel("cargo"), new DefaultPrograms.AttributeVisible("c12_boot", true));
		this.groups.add(cargo3_open);
		//
	}

}
