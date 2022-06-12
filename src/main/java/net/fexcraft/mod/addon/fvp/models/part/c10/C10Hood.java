//FMT-Marker FVTM-1
package net.fexcraft.mod.addon.fvp.models.part.c10;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter V1 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.8 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c10_hood")
public class C10Hood extends PartModel {

	public C10Hood(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand");
		//
		ModelGroup hood = new ModelGroup("hood");
		hood.add(new ModelRendererTurbo(hood, 393, 124, textureX, textureY)
			.addShapeBox(20, 1, -5, 1, 1, 10, 0, 0, 0.75f, 0, 1, -1, 0, 1, -1, 0, 0, 0.75f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(26, -13, 0).setRotationAngle(0, 0, 0)
		);
		hood.add(new ModelRendererTurbo(hood, 36, 66, textureX, textureY)
			.addShapeBox(0, -1, -15, 10, 1, 10, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26, -13, 0).setRotationAngle(0, 0, 0)
		);
		hood.add(new ModelRendererTurbo(hood, 106, 65, textureX, textureY)
			.addShapeBox(10, -1, -15, 10, 1, 10, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, -1.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(26, -13, 0).setRotationAngle(0, 0, 0)
		);
		hood.add(new ModelRendererTurbo(hood, 429, 64, textureX, textureY)
			.addShapeBox(0, -1, 5, 10, 1, 10, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26, -13, 0).setRotationAngle(0, 0, 0)
		);
		hood.add(new ModelRendererTurbo(hood, 276, 64, textureX, textureY)
			.addShapeBox(10, -1, 5, 10, 1, 10, 0, 0, -0.25f, 0, 0, -1.25f, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(26, -13, 0).setRotationAngle(0, 0, 0)
		);
		hood.add(new ModelRendererTurbo(hood, 328, 62, textureX, textureY)
			.addShapeBox(0, -1, -5, 10, 1, 10, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26, -13, 0).setRotationAngle(0, 0, 0)
		);
		hood.add(new ModelRendererTurbo(hood, 75, 62, textureX, textureY)
			.addShapeBox(10, -1, -5, 10, 1, 10, 0, 0, -0.25f, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(26, -13, 0).setRotationAngle(0, 0, 0)
		);
		hood.add(new ModelRendererTurbo(hood, 46, 123, textureX, textureY)
			.addShapeBox(20, 1, 5, 1, 1, 10, 0, 0, 0.75f, 0, 1, -1, 0, 0.5f, -1, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0, 0, -0.5f, 0, 0, 0, -1, 0)
			.setRotationPoint(26, -13, 0).setRotationAngle(0, 0, 0)
		);
		hood.add(new ModelRendererTurbo(hood, 380, 122, textureX, textureY)
			.addShapeBox(20, 1, -15, 1, 1, 10, 0, 0, 0.5f, 0, 0.5f, -1, 0, 1, -1, 0, 0, 0.75f, 0, 0, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(26, -13, 0).setRotationAngle(0, 0, 0)
		);
		hood.addProgram(new DefaultPrograms.AttributeRotator("c10_hood", true, -72, 0, -1, 2, 0f));
		hood.addProgram("fvtm:rgb_primary");
		this.groups.add(hood);
	}

}
