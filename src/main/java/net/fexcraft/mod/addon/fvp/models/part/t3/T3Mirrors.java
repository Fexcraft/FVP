//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.t3;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.5.2 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/t3_mirrors")
public class T3Mirrors extends PartModel {

	public T3Mirrors(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup mirror_left = new ModelGroup("mirror_left");
		mirror_left.add(new ModelRendererTurbo(mirror_left, 187, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(18, -35, 21.875f).setRotationAngle(0, -8, 0)
		);
		mirror_left.add(new ModelRendererTurbo(mirror_left, 338, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(18, -41, 21.875f).setRotationAngle(0, -8, 0)
		);
		mirror_left.add(new ModelRendererTurbo(mirror_left, 263, 284, textureX, textureY)
			.addShapeBox(0.125f, 0, 3, 1, 8, 3, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(18, -43, 21.875f).setRotationAngle(0, -16, 0)
		);
		mirror_left.add(new ModelRendererTurbo(mirror_left, 27, 238, textureX, textureY)
			.addShapeBox(0, 0, 4, 1, 8, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f)
			.setRotationPoint(18, -41.5f, 21.875f).setRotationAngle(0, -8, 0)
		);
		mirror_left.add(new ModelRendererTurbo(mirror_left, 503, 86, textureX, textureY).addCylinder(-0.125f, 5.25f, 4.5f, 2, 1, 12, 0.75f, 0.75f, 2, new net.fexcraft.lib.common.math.Vec3f(0.5, 0.0, 0.0))
			.setRotationPoint(18, -39, 21.875f).setRotationAngle(0, -16, 0)
		);
		this.groups.add(mirror_left);
		//
		ModelGroup mirror_right = new ModelGroup("mirror_right");
		mirror_right.add(new ModelRendererTurbo(mirror_right, 230, 274, textureX, textureY)
			.addShapeBox(0, 0, -4, 1, 1, 5, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(18, -35, -21.875f).setRotationAngle(0, 36, 0)
		);
		mirror_right.add(new ModelRendererTurbo(mirror_right, 39, 258, textureX, textureY)
			.addShapeBox(0, 0, -4, 1, 1, 5, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(18, -41, -21.875f).setRotationAngle(0, 36, 0)
		);
		mirror_right.add(new ModelRendererTurbo(mirror_right, 221, 274, textureX, textureY)
			.addShapeBox(0.125f, 0, -6, 1, 8, 3, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(18, -43, -21.875f).setRotationAngle(0, 44, 0)
		);
		mirror_right.add(new ModelRendererTurbo(mirror_right, 507, 232, textureX, textureY)
			.addShapeBox(0, 0, -5, 1, 8, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(18, -41.5f, -21.875f).setRotationAngle(0, 36, 0)
		);
		mirror_right.add(new ModelRendererTurbo(mirror_right, 499, 80, textureX, textureY).addCylinder(-0.125f, 5.25f, -4.5f, 2, 1, 12, 0.75f, 0.75f, 2, new net.fexcraft.lib.common.math.Vec3f(0.5, 0.0, 0.0))
			.setRotationPoint(18, -39, -21.875f).setRotationAngle(0, 44, 0)
		);
		this.groups.add(mirror_right);
		//
	}

}
