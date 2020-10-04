//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.part.c12;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.6 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c12_spotlight_quad")
public class C12SpotlightQuad extends PartModel {

	public C12SpotlightQuad(){
		super(); textureX = 16; textureY = 32;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList body = new TurboList("body");
		body.add(new ModelRendererTurbo(body, 0, 19, textureX, textureY).addBox(0, -1.5f, 1.5f, 1, 3, 0.5f));
		body.add(new ModelRendererTurbo(body, 11, 9, textureX, textureY).addBox(0, -1.5f, -2, 1, 3, 0.5f));
		body.add(new ModelRendererTurbo(body, 7, 0, textureX, textureY).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1));
		body.add(new ModelRendererTurbo(body, 6, 16, textureX, textureY).addBox(0, -1.5f, -1.5f, 0.25f, 3, 3));
		body.add(new ModelRendererTurbo(body, 0, 6, textureX, textureY)
			.addShapeBox(0, 1.5f, -2, 1, 0.5f, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f)
		);
		body.add(new ModelRendererTurbo(body, 0, 0, textureX, textureY)
			.addShapeBox(0, -2, -2, 1, 0.5f, 4, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
		);
		this.groups.add(body);
		//
		TurboList inner = new TurboList("inner");
		inner.add(new ModelRendererTurbo(inner, 9, 4, textureX, textureY)
			.addShapeBox(0.25f, -1, -1, 0.5f, 2, 2, 0, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f)
		);
		this.groups.add(inner);
		//
		TurboList glow = new TurboList("glow");
		glow.add(new ModelRendererTurbo(glow, 0, 12, textureX, textureY)
			.addShapeBox(0.25f, -1.5f, -1.5f, 0.75f, 3, 3, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0)
		);
		glow.addProgram(DefaultPrograms.getCustomLights("lights_extra"));
		this.groups.add(glow);
	}

}
