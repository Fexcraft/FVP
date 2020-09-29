//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.part.c12;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c12_roof_lightbar")
public class C12RoofLightbar extends PartModel {

	public C12RoofLightbar(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList roof_lightbar = new TurboList("roof_lightbar");
		roof_lightbar.add(new ModelRendererTurbo(roof_lightbar, 88, 208, textureX, textureY).addBox(0, 0, 0, 1, 1, 33)
			.setRotationPoint(3.5f, -24, -16.5f).setRotationAngle(0, 0, 0)
		);
		roof_lightbar.add(new ModelRendererTurbo(roof_lightbar, 389, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3.5f, -24, -17.5f).setRotationAngle(0, 0, 0)
		);
		roof_lightbar.add(new ModelRendererTurbo(roof_lightbar, 381, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3.5f, -24, 16.5f).setRotationAngle(0, 0, 0)
		);
		roof_lightbar.add(new ModelRendererTurbo(roof_lightbar, 295, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 0.5f, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0)
			.setRotationPoint(-0.5f, -21, -14.25f).setRotationAngle(0, 0, 0)
		);
		roof_lightbar.add(new ModelRendererTurbo(roof_lightbar, 463, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 0.5f, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0)
			.setRotationPoint(-0.5f, -21, 14.25f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(roof_lightbar);
		//
	}

}
