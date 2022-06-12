//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.part.c12;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.6 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c12_spotlight")
public class C12Spotlight extends PartModel {

	public C12Spotlight(){
		super(); textureX = 16; textureY = 32;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup body = new ModelGroup("body");
		body.add(new ModelRendererTurbo(body, 0, 19, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.75f, 1, 3, new net.fexcraft.lib.common.math.Vec3f(-0.5, 0.0, 0.0)));
		body.add(new ModelRendererTurbo(body, 0, 12, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.75f).setLength(1).setSegments(10, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(new net.fexcraft.lib.common.math.Vec3f(-0.5, 0.0, 0.0)).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.0))
			.removePolygons(0).build()
			.setRotationPoint(0.5f, 0, 0).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 9, 0, textureX, textureY).addBox(-0.5f, -0.5f, -0.5f, 1, 1, 1));
		this.groups.add(body);
		//
		ModelGroup inner = new ModelGroup("inner");
		inner.add(new ModelRendererTurbo(inner, 0, 6, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.75f, 0.5f, 3, new net.fexcraft.lib.common.math.Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(0.5f, 0, 0).setRotationAngle(0, 0, 0)
		);
		this.groups.add(inner);
		//
		ModelGroup glow = new ModelGroup("glow");
		glow.add(new ModelRendererTurbo(glow, 0, 0, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.9f, 0.65f, 3, new net.fexcraft.lib.common.math.Vec3f(-0.3, 0.0, 0.0))
			.setRotationPoint(0.5f, 0, 0).setRotationAngle(0, 0, 0)
		);
		glow.addProgram(DefaultPrograms.getCustomLights("lights_extra"));
		this.groups.add(glow);
		//
	}

}
