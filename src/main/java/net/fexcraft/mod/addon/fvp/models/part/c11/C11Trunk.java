//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.c11;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.3.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c11_trunk")
public class C11Trunk extends PartModel {

	public C11Trunk(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList trunk = new TurboList("trunk");
		trunk.add(new ModelRendererTurbo(trunk, 392, 131, textureX, textureY)
			.addShapeBox(-18, 0, 0, 2, 4, 35, 0, -0.5f, -1.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, -11, -17.5f).setRotationAngle(0, 0, 0)
		);
		trunk.add(new ModelRendererTurbo(trunk, 277, 81, textureX, textureY)
			.addShapeBox(-10, 0, 0, 10, 1, 37, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-32, -11.5f, -18.5f).setRotationAngle(0, 0, 0)
		);
		trunk.add(new ModelRendererTurbo(trunk, 415, 93, textureX, textureY)
			.addShapeBox(-16, 0, 0, 6, 1, 36, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f)
			.setRotationPoint(-32, -11.5f, -18).setRotationAngle(0, 0, 0)
		);
		trunk.addProgram(DefaultPrograms.RGB_PRIMARY);
		trunk.addProgram(new DefaultPrograms.AttributeRotator("c11_trunk", true, 0, 72, 1, 2, 0f));
		this.groups.add(trunk);
	}

}
