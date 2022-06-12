//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.c11;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.3.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c11_roof")
public class C11Roof extends PartModel {

	public C11Roof(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup roof_open = new ModelGroup("roof_open");
		roof_open.add(new ModelRendererTurbo(roof_open, 274, 39, textureX, textureY).addBox(0, 0, 0, 19, 1, 1)
			.setRotationPoint(-22, -11.5f, 18).setRotationAngle(0, 0, 20)
		);
		roof_open.add(new ModelRendererTurbo(roof_open, 158, 34, textureX, textureY).addBox(0, 0, 0, 19, 1, 1)
			.setRotationPoint(-22, -11.5f, -19).setRotationAngle(0, 0, 20)
		);
		roof_open.add(new ModelRendererTurbo(roof_open, 496, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3)
			.setRotationPoint(-28, -11.875f, 18).setRotationAngle(0, 0, 3.5f)
		);
		roof_open.add(new ModelRendererTurbo(roof_open, 496, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3)
			.setRotationPoint(-28, -11.875f, -19).setRotationAngle(0, 0, 3.5f)
		);
		roof_open.add(new ModelRendererTurbo(roof_open, 104, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3)
			.setRotationPoint(-31, -12.125f, 15).setRotationAngle(0, 0, 3.5f)
		);
		roof_open.add(new ModelRendererTurbo(roof_open, 95, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3)
			.setRotationPoint(-31, -12.125f, -16).setRotationAngle(0, 0, 3.5f)
		);
		roof_open.add(new ModelRendererTurbo(roof_open, 213, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 26, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(-32, -12.1875f, -13).setRotationAngle(0, 0, 0)
		);
		roof_open.addProgram(new DefaultPrograms.AttributeVisible("c11_roof", false));
		this.groups.add(roof_open);
		//
		ModelGroup roof_close = new ModelGroup("roof_close");
		roof_close.add(new ModelRendererTurbo(roof_close, 385, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -22.5f, 18).setRotationAngle(0, 0, 0)
		);
		roof_close.add(new ModelRendererTurbo(roof_close, 335, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -22.5f, -19).setRotationAngle(0, 0, 0)
		);
		roof_close.add(new ModelRendererTurbo(roof_close, 0, 15, textureX, textureY).addBox(0, 0, 0, 24, 1, 36)
			.setRotationPoint(-15.5f, -23.5f, -18).setRotationAngle(0, 0, 0)
		);
		roof_close.add(new ModelRendererTurbo(roof_close, 108, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 36, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-19.5f, -23.5f, -18).setRotationAngle(0, 0, 0)
		);
		roof_close.add(new ModelRendererTurbo(roof_close, 0, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 36, 0, 0.5f, -3, 0, 0, 0, 0, 0, 0, 0, 0.5f, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0)
			.setRotationPoint(-24.5f, -22.5f, -18).setRotationAngle(0, 0, 0)
		);
		roof_close.add(new ModelRendererTurbo(roof_close, 436, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 36, 0, -0.5f, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 1, 0, 6, 0, 0, -6, 0, 0, -6, 0, 0, 6, 0, 0)
			.setRotationPoint(-25.5f, -18.5f, -18).setRotationAngle(0, 0, 0)
		);
		roof_close.add(new ModelRendererTurbo(roof_close, 106, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 12, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.875f, 0, 0, 0.875f, 0, 0, -1.75f, 0, 0, -1.75f)
			.setRotationPoint(-19.5f, -22.5f, -18).setRotationAngle(0, 0, 0)
		);
		roof_close.add(new ModelRendererTurbo(roof_close, 243, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 12, 1, 0, 0, -3, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -3, -0.25f, 0, 0, 0.875f, 0, 0, 0.875f, 0, 0, -1.75f, 0, 0, -1.75f)
			.setRotationPoint(-24.5f, -22.5f, -18).setRotationAngle(0, 0, 0)
		);
		roof_close.add(new ModelRendererTurbo(roof_close, 374, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 7, 1, 0, 0, -6, -0.25f, 0, 0, -0.125f, 0, 0, -0.5f, 0, -6, -0.25f, 0, 0, -0.125f, 0, 0, 0.75f, 0, 0, -1.625f, 0, 0, -0.75f)
			.setRotationPoint(-30.5f, -18.5f, -18).setRotationAngle(0, 0, 0)
		);
		roof_close.add(new ModelRendererTurbo(roof_close, 232, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 12, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.75f, 0, 0, -1.75f, 0, 0, 0.875f, 0, 0, 0.875f)
			.setRotationPoint(-15.5f, -22.5f, 17.125f).setRotationAngle(0, 0, 0)
		);
		roof_close.add(new ModelRendererTurbo(roof_close, 421, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 12, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.75f, 0, 0, -1.75f, 0, 0, 0.875f, 0, 0, 0.875f)
			.setRotationPoint(-19.5f, -22.5f, 17.125f).setRotationAngle(0, 0, 0)
		);
		roof_close.add(new ModelRendererTurbo(roof_close, 17, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 12, 1, 0, 0, -3, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -3, -0.25f, 0, 0, -1.75f, 0, 0, -1.75f, 0, 0, 0.875f, 0, 0, 0.875f)
			.setRotationPoint(-24.5f, -22.5f, 17.125f).setRotationAngle(0, 0, 0)
		);
		roof_close.add(new ModelRendererTurbo(roof_close, 113, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 7, 1, 0, 0, -6, -0.25f, 0, 0, -0.5f, 0, 0, -0.125f, 0, -6, -0.25f, 0, 0, -0.75f, 0, 0, -1.625f, 0, 0, 0.75f, 0, 0, -0.125f)
			.setRotationPoint(-30.5f, -18.5f, 17.125f).setRotationAngle(0, 0, 0)
		);
		roof_close.add(new ModelRendererTurbo(roof_close, 31, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 24, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19.5f, -21.5f, 17.75f).setRotationAngle(0, 0, -40)
		);
		roof_close.add(new ModelRendererTurbo(roof_close, 26, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 24, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19.5f, -21.5f, -18.75f).setRotationAngle(0, 0, -40)
		);
		roof_close.add(new ModelRendererTurbo(roof_close, 487, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 12, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.875f, 0, 0, 0.875f, 0, 0, -1.75f, 0, 0, -1.75f)
			.setRotationPoint(-15.5f, -22.5f, -18).setRotationAngle(0, 0, 0)
		);
		roof_close.addProgram(new DefaultPrograms.AttributeVisible("c11_roof", true));
		this.groups.add(roof_close);
	}

}
