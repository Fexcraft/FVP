//FMT-Marker FVTM-1.1
package net.fexcraft.mod.addon.fvp.models.part.c10;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.ModelGroup;
import net.fexcraft.mod.fvtm.model.PartModel;

/** This file was exported via the FVTM Exporter V1.2 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.9 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c10_th")
public class C10TH extends PartModel {

	public C10TH(){
		super(); textureX = 16; textureY = 16;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup hitch = new ModelGroup("hitch");
		hitch.add(new ModelRendererTurbo(hitch, 8, 4, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 1, 1, 0, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f)
			.setRotationPoint(-50.5f, 0, 0).setRotationAngle(0, 0, 0)
		);
		hitch.add(new ModelRendererTurbo(hitch, 12, 3, textureX, textureY).addBox(-0.5f, 0, -0.5f, 1, 1, 1)
			.setRotationPoint(-50.5f, 1, 0).setRotationAngle(0, 0, 0)
		);
		hitch.add(new ModelRendererTurbo(hitch, 10, 0, textureX, textureY)
			.addShapeBox(-0.5f, 0, -0.5f, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 1, -1, 0, 1, -1, 0, -2, 0, 0)
			.setRotationPoint(-50.5f, 2, 0).setRotationAngle(0, 0, 0)
		);
		hitch.add(new ModelRendererTurbo(hitch, 0, 10, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-49, 3, -3).setRotationAngle(0, 0, 0)
		);
		hitch.add(new ModelRendererTurbo(hitch, 0, 0, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 12, 1, 1, 3, null)
			.setRotationPoint(-49.75f, 3, 2).setRotationAngle(0, 0, 0)
		);
		hitch.add(new ModelRendererTurbo(hitch, 0, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49, 3, -5).setRotationAngle(0, 0, 0)
		);
		hitch.add(new ModelRendererTurbo(hitch, 0, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-49, 3, 3).setRotationAngle(0, 0, 0)
		);
		hitch.add(new ModelRendererTurbo(hitch, 1, 0, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-49, 3, 0).setRotationAngle(0, 0, 0)
		);
		this.groups.add(hitch);
	}

}
