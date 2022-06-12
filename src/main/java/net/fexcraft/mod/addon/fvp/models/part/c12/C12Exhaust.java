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
@fModel(registryname = "fvp:models/part/c12_exhaust")
public class C12Exhaust extends PartModel {

	public C12Exhaust(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup exhaust = new ModelGroup("exhaust");
		exhaust.add(new ModelRendererTurbo(exhaust, 267, 43, textureX, textureY).addBox(0, 0, 0, 5, 2, 12)
			.setRotationPoint(-48.5f, 1, -6).setRotationAngle(0, 0, 0)
		);
		exhaust.add(new ModelRendererTurbo(exhaust, 381, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-48.5f, 3, -6).setRotationAngle(0, 0, 0)
		);
		exhaust.add(new ModelRendererTurbo(exhaust, 381, 27, textureX, textureY).addBox(0, 0, 0, 2, 1, 4)
			.setRotationPoint(-46.5f, 1, -10).setRotationAngle(0, 0, 0)
		);
		exhaust.add(new ModelRendererTurbo(exhaust, 265, 27, textureX, textureY).addBox(0, 0, 0, 16, 1, 2)
			.setRotationPoint(-44.5f, 1, -12).setRotationAngle(0, 0, 0)
		);
		exhaust.add(new ModelRendererTurbo(exhaust, 265, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.5f, 1, -12).setRotationAngle(0, 0, 0)
		);
		exhaust.add(new ModelRendererTurbo(exhaust, 96, 95, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.875f).setLength(8).setSegments(16, 0).setScale(0.75f, 0.75f).setDirection(1)
			.setTopOffset(null).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-50, 2, 14).setRotationAngle(0, 0, 0)
		);
		exhaust.add(new ModelRendererTurbo(exhaust, 436, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 5, 16, 0.75f, 0.75f, 1, null)
			.setRotationPoint(-47, 2, 6).setRotationAngle(0, 0, 0)
		);
		exhaust.add(new ModelRendererTurbo(exhaust, 417, 32, textureX, textureY).addCylinder(0, 0, 0, 1, 3, 16, 0.75f, 0.75f, 1, new net.fexcraft.lib.common.math.Vec3f(3.0, 0.0, 0.0))
			.setRotationPoint(-50, 2, 11).setRotationAngle(0, 0, 0)
		);
		exhaust.add(new ModelRendererTurbo(exhaust, 145, 0, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.875f).setLength(1).setSegments(16, 0).setScale(0.75f, 0.75f).setDirection(0)
			.setTopOffset(null).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(34.0, 0.0, 0.0)).build()
			.setRotationPoint(-50, 2, 22).setRotationAngle(0, 0, 0)
		);
		this.groups.add(exhaust);
		//
	}

}
