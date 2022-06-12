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
@fModel(registryname = "fvp:models/part/c11_hood")
public class C11Hood extends PartModel {

	public C11Hood(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup hood = new ModelGroup("hood");
		hood.add(new ModelRendererTurbo(hood, 362, 63, textureX, textureY).addBox(0, 0, 0, 14, 1, 30)
			.setRotationPoint(20, -11.5f, -15).setRotationAngle(0, 0, 0)
		);
		hood.add(new ModelRendererTurbo(hood, 0, 69, textureX, textureY)
			.addShapeBox(14, 0, 0, 12, 1, 30, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 0, 0)
			.setRotationPoint(20, -11.5f, -15).setRotationAngle(0, 0, 0)
		);
		hood.addProgram(DefaultPrograms.RGB_PRIMARY);
		hood.addProgram(new DefaultPrograms.AttributeRotator("c11_hood", true, -64, 0, -1, 2, 0f));
		this.groups.add(hood);
	}

}
