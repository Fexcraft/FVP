//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.part.c12;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c12_hood")
public class C12Hood extends PartModel {

	public C12Hood(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup hood = new ModelGroup("hood");
		hood.add(new ModelRendererTurbo(hood, 310, 151, textureX, textureY)
			.addShapeBox(0, -1, 0, 16, 1, 26, 0, -1, 0, -1, 0, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.5f, -8, -13).setRotationAngle(0, 0, 0)
		);
		hood.add(new ModelRendererTurbo(hood, 0, 195, textureX, textureY)
			.addShapeBox(16, -1, 0, 12, 1, 26, 0, 0, 0, -1, -4, 0, -1, -4, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.5f, -8, -13).setRotationAngle(0, 0, 0)
		);
		hood.add(new ModelRendererTurbo(hood, 249, 177, textureX, textureY)
			.addShapeBox(16, -1, 0, 12, 1, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.5f, 0)
			.setRotationPoint(14.5f, -7, -13).setRotationAngle(0, 0, 0)
		);
		hood.add(new ModelRendererTurbo(hood, 411, 143, textureX, textureY)
			.addShapeBox(0, -1, 0, 16, 1, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0)
			.setRotationPoint(14.5f, -7, -13).setRotationAngle(0, 0, 0)
		);
		hood.addPrograms(new DefaultPrograms.AttributeRotator("c12_hood", true, -45, 0, -1, 2, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(hood);
	}

}
