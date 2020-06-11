//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.t3;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.5.2 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/t3_interior_basic")
public class T3Interior extends PartModel {

	public T3Interior(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList interior_basic = new TurboList("interior_basic");
		interior_basic.add(new ModelRendererTurbo(interior_basic, 195, 300, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 20, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16, -39, 0).setRotationAngle(0, 0, 0)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 0, 284, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 14, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0)
			.setRotationPoint(14, -33, 0).setRotationAngle(0, 0, 0)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 142, 292, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 14, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0)
			.setRotationPoint(15, -33, -20).setRotationAngle(0, 0, 0)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 89, 292, textureX, textureY).addBox(0, 0, 0, 6, 4, 20)
			.setRotationPoint(15, -37, -20).setRotationAngle(0, 0, 0)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 0, 366, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 40, 0, 0, 0, 0, -0.7f, -0.5f, -3, -0.7f, -0.5f, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0)
			.setRotationPoint(21, -37, -20).setRotationAngle(0, 0, 0)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 291, 351, textureX, textureY)
			.addShapeBox(-2, 0, 0, 2, 7, 20, 0, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 99, 260, textureX, textureY)
			.addShapeBox(-2.1f, 5.5f, 0.5f, 1, 1, 3, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 93, 258, textureX, textureY)
			.addShapeBox(-2.1f, 4.5f, 0.5f, 1, 1, 3, 0, 0, -0.25f, 0, -0.9f, -0.25f, 0, -0.9f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.9f, -0.25f, 0, -0.9f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 95, 251, textureX, textureY)
			.addShapeBox(-2.1f, 3.75f, 0.5f, 1, 1, 3, 0, 0, -0.25f, 0, -0.9f, -0.25f, 0, -0.9f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.9f, -0.25f, 0, -0.9f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 207, 198, textureX, textureY)
			.addShapeBox(0, -1.5f, -1.5f, 2, 3, 3, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f)
			.setRotationPoint(13, -35.5f, 12).setRotationAngle(0, 0, 5)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 179, 88, textureX, textureY).addCylinder(-2.1f, 1.25f, 14.25f, 1, 1, 12, 1, 1, 2, null)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 174, 88, textureX, textureY).addCylinder(-2.1f, 1.25f, 9.75f, 1, 1, 12, 1, 1, 2, null)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 303, 73, textureX, textureY).addCylinder(-2.1f, 1.25f, 5.25f, 1, 1, 10, 0.75f, 0.75f, 2, null)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 303, 69, textureX, textureY).addCylinder(-2.1f, 1.25f, 3.25f, 1, 1, 10, 0.75f, 0.75f, 2, null)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 505, 65, textureX, textureY).addCylinder(-2.1f, 1.25f, 1.25f, 1, 1, 10, 0.75f, 0.75f, 2, null)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 86, 251, textureX, textureY)
			.addShapeBox(-2.1f, 2.5f, 0.5f, 1, 1, 3, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 149, 176, textureX, textureY)
			.addShapeBox(-2.1f, 2.375f, 3.75f, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 5, 176, textureX, textureY)
			.addShapeBox(-2.1f, 3.25f, 3.75f, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 0, 176, textureX, textureY)
			.addShapeBox(-2.1f, 4.125f, 3.75f, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 179, 172, textureX, textureY)
			.addShapeBox(-2.1f, 5, 3.75f, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 174, 172, textureX, textureY)
			.addShapeBox(-2.1f, 5.875f, 3.75f, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 169, 172, textureX, textureY)
			.addShapeBox(-2.1f, 2.375f, 4.625f, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 164, 172, textureX, textureY)
			.addShapeBox(-2.1f, 3.25f, 4.625f, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 308, 170, textureX, textureY)
			.addShapeBox(-2.1f, 4.125f, 4.625f, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 303, 170, textureX, textureY)
			.addShapeBox(-2.1f, 5, 4.625f, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 373, 169, textureX, textureY)
			.addShapeBox(-2.1f, 5.875f, 4.625f, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 374, 166, textureX, textureY)
			.addShapeBox(-2.1f, 2.375f, 5.5f, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 289, 162, textureX, textureY)
			.addShapeBox(-2.1f, 3.25f, 5.5f, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 68, 160, textureX, textureY)
			.addShapeBox(-2.1f, 4.125f, 5.5f, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 67, 153, textureX, textureY)
			.addShapeBox(-2.1f, 5, 5.5f, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 67, 150, textureX, textureY)
			.addShapeBox(-2.1f, 5.875f, 5.5f, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, -0.9f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 371, 185, textureX, textureY)
			.addShapeBox(-2.1f, 0.4f, 11, 1, 2, 2, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 0, 150, textureX, textureY)
			.addShapeBox(-2.1f, 4.5f, 18.5f, 1, 2, 1, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 138, 147, textureX, textureY)
			.addShapeBox(-2.1f, 0.5f, 18.5f, 1, 1, 1, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 138, 144, textureX, textureY)
			.addShapeBox(-2.1f, 1.75f, 18.5f, 1, 1, 1, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 375, 139, textureX, textureY)
			.addShapeBox(-2.1f, 3, 18.5f, 1, 1, 1, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0)
			.setRotationPoint(17, -39, 0).setRotationAngle(0, 0, 10)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 0, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 40, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(14, -54, -20).setRotationAngle(0, 0, 0)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 246, 364, textureX, textureY).addBox(0, 0, 0, 1, 4, 10)
			.setRotationPoint(14.9f, -32.6f, -16).setRotationAngle(0, 0, -16)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 77, 251, textureX, textureY).addBox(-0.1f, 0.2f, 3.5f, 1, 1, 3)
			.setRotationPoint(14.9f, -32.6f, -16).setRotationAngle(0, 0, -16)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 487, 54, textureX, textureY).addCylinder(-0.2f, 2.625f, 0.5f, 1, 1, 10, 0.5f, 0.5f, 3, null)
			.setRotationPoint(14, -54, 8).setRotationAngle(0, 0, -26)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 139, 219, textureX, textureY).addBox(-0.2f, 1, 36, 1, 1, 3)
			.setRotationPoint(14, -54, -20).setRotationAngle(0, 0, -26)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 67, 258, textureX, textureY).addBox(-0.2f, 1, 18, 1, 1, 4)
			.setRotationPoint(14, -54, -20).setRotationAngle(0, 0, -26)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 130, 219, textureX, textureY).addBox(-0.2f, 1, 1, 1, 1, 3)
			.setRotationPoint(14, -54, -20).setRotationAngle(0, 0, -26)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 296, 170, textureX, textureY).addBox(-0.2f, 1, 27, 1, 1, 2)
			.setRotationPoint(14, -54, -20).setRotationAngle(0, 0, -26)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 289, 170, textureX, textureY).addBox(-0.2f, 1, 27, 1, 1, 2)
			.setRotationPoint(14, -54, -17.875f).setRotationAngle(0, 0, -26)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 282, 170, textureX, textureY).addBox(-0.2f, 1, 27, 1, 1, 2)
			.setRotationPoint(14, -54, -15.875f).setRotationAngle(0, 0, -26)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 409, 54, textureX, textureY).addCylinder(-0.2f, 2.625f, -0.5f, 1, 1, 10, 0.5f, 0.5f, 3, null)
			.setRotationPoint(14, -54, 8).setRotationAngle(0, 0, -26)
		);
		interior_basic.add(new ModelRendererTurbo(interior_basic, 501, 255, textureX, textureY).addBox(-0.2f, 2.125f, 27, 1, 1, 4)
			.setRotationPoint(14, -54, -17.875f).setRotationAngle(0, 0, -26)
		);
		this.groups.add(interior_basic);
		//
	}

}
