//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.part.c12;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c12_pass_storage")
public class C12PassStorage extends PartModel {

	public C12PassStorage(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup pass_storage_1 = new ModelGroup("pass_storage_1");
		pass_storage_1.add(new ModelRendererTurbo(pass_storage_1, 463, 0, textureX, textureY).addBox(-1, -3, 0, 1, 3, 7)
			.setRotationPoint(9.875f, -5.875f, -12).setRotationAngle(0, 0, 0)
		);
		pass_storage_1.add(new ModelRendererTurbo(pass_storage_1, 294, 51, textureX, textureY).addBox(-1.125f, -2.5f, 2, 1, 0.5f, 3)
			.setRotationPoint(9.875f, -5.875f, -12).setRotationAngle(0, 0, 0)
		);
		this.groups.add(pass_storage_1);
	}

}
