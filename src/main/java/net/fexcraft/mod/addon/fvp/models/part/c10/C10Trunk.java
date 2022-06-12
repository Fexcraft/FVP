//FMT-Marker FVTM-1
package net.fexcraft.mod.addon.fvp.models.part.c10;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter V1 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.8 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c10_trunk")
public class C10Trunk extends PartModel {

	public C10Trunk(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//

		ModelGroup trunk_glow = new ModelGroup("trunk_glow");
		trunk_glow.add(new ModelRendererTurbo(trunk_glow, 395, 59, textureX, textureY)
			.addShapeBox(-13.25f, 0.375f, -4.5f, 1, 1, 2, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, -0.2f, 0, -0.6f, -0.2f, 0, -0.6f, -0.2f, 0, 0, -0.2f, 0)
			.setRotationPoint(-36, -13, 0).setRotationAngle(0, 0, -15)
		);
		trunk_glow.add(new ModelRendererTurbo(trunk_glow, 338, 58, textureX, textureY)
			.addShapeBox(-13.25f, 0.375f, 2.5f, 1, 1, 2, 0, 0, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, -0.2f, 0, -0.6f, -0.2f, 0, -0.6f, -0.2f, 0, 0, -0.2f, 0)
			.setRotationPoint(-36, -13, 0).setRotationAngle(0, 0, -15)
		);
		trunk_glow.addProgram(DefaultPrograms.LIGHTS);
		this.groups.add(trunk_glow);
		//
		ModelGroup trunk_primary = new ModelGroup("trunk_primary");
		trunk_primary.add(new ModelRendererTurbo(trunk_primary, 144, 55, textureX, textureY)
			.addShapeBox(-10, -1, -14, 10, 1, 9, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -13, 0).setRotationAngle(0, 0, 0)
		);
		trunk_primary.add(new ModelRendererTurbo(trunk_primary, 46, 55, textureX, textureY)
			.addShapeBox(-10, -1, 5, 10, 1, 9, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -13, 0).setRotationAngle(0, 0, 0)
		);
		trunk_primary.add(new ModelRendererTurbo(trunk_primary, 466, 49, textureX, textureY)
			.addShapeBox(-10, -1, -5, 10, 1, 10, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -13, 0).setRotationAngle(0, 0, 0)
		);
		trunk_primary.add(new ModelRendererTurbo(trunk_primary, 336, 90, textureX, textureY)
			.addShapeBox(-13, 11, -14, 3, 1, 28, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1, 0, 0)
			.setRotationPoint(-36, -13, 0).setRotationAngle(0, 0, 0)
		);
		trunk_primary.add(new ModelRendererTurbo(trunk_primary, 133, 90, textureX, textureY)
			.addShapeBox(-13, 1, -14, 3, 3, 28, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -13, 0).setRotationAngle(0, 0, 0)
		);
		trunk_primary.add(new ModelRendererTurbo(trunk_primary, 0, 120, textureX, textureY)
			.addShapeBox(-12, 0, -14, 2, 1, 28, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -13, 0).setRotationAngle(0, 0, 0)
		);
		trunk_primary.add(new ModelRendererTurbo(trunk_primary, 245, 113, textureX, textureY)
			.addShapeBox(-11, -1, -14, 1, 1, 9, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -13, 0).setRotationAngle(0, 0, 0)
		);
		trunk_primary.add(new ModelRendererTurbo(trunk_primary, 336, 107, textureX, textureY)
			.addShapeBox(-11, -1, 5, 1, 1, 9, 0, -1, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -13, 0).setRotationAngle(0, 0, 0)
		);
		trunk_primary.add(new ModelRendererTurbo(trunk_primary, 186, 112, textureX, textureY)
			.addShapeBox(-11, -1, -5, 1, 1, 10, 0, -1, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -13, 0).setRotationAngle(0, 0, 0)
		);
		trunk_primary.add(new ModelRendererTurbo(trunk_primary, 133, 90, textureX, textureY)
			.addShapeBox(-13, 4, -14, 3, 4, 8, 0, 0, 0, 0, -2, 0, 0, -2, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2, 0, 0, -2, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-36, -13, 0).setRotationAngle(0, 0, 0)
		);
		trunk_primary.add(new ModelRendererTurbo(trunk_primary, 39, 90, textureX, textureY)
			.addShapeBox(-13, 4, 6, 3, 4, 8, 0, 0, 0, -0.5f, -2, 0, -0.5f, -2, 0, 0, 0, 0, 0, 0, 0, -0.5f, -2, 0, -0.5f, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -13, 0).setRotationAngle(0, 0, 0)
		);
		trunk_primary.add(new ModelRendererTurbo(trunk_primary, 473, 105, textureX, textureY)
			.addShapeBox(-12.5f, 4, -6, 2, 4, 12, 0, 0, 0, 0.5f, -1.5f, 0, 0.5f, -1.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -1.5f, 0, 0.5f, -1.5f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-36, -13, 0).setRotationAngle(0, 0, 0)
		);
		trunk_primary.add(new ModelRendererTurbo(trunk_primary, 41, 107, textureX, textureY)
			.addShapeBox(-13, 8, -14, 3, 3, 28, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -13, 0).setRotationAngle(0, 0, 0)
		);
		trunk_primary.addProgram(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(trunk_primary);
		translate(36, 13, 0);
	}

}
