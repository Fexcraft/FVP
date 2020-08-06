//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.c7;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.1 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c7_interior")
public class C7Interior extends PartModel {

	public C7Interior(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList interior = new TurboList("interior");
		interior.add(new ModelRendererTurbo(interior, 413, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 4.8f, 5.8f, 12, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, 0, 0)
			.setRotationPoint(18, -13.2f, 4.8f).setRotationAngle(0, 0, 0).setName("Box 259")
		);
		interior.add(new ModelRendererTurbo(interior, 83, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 2.4f, 2.4f, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, 0, 0)
			.setRotationPoint(15.6f, -12.2f, 9.6f).setRotationAngle(0, 0, 0).setName("Box 260")
		);
		interior.add(new ModelRendererTurbo(interior, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 5, 11, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, -0.5f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -0.5f, 0)
			.setRotationPoint(18.5f, -10.8f, -17).setRotationAngle(0, 0, 0).setName("Box 275")
		);
		interior.add(new ModelRendererTurbo(interior, 442, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 7.2000003f, 14, 7.2000003f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19.2f, -10.6f, -3.6000001f).setRotationAngle(0, 0, 0).setName("Box 277")
		);
		interior.add(new ModelRendererTurbo(interior, 47, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 8.400001f, 1.2f, 3.6000001f, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0.6f, 0, 0, 0.6f, 1.2f, 0, 0)
			.setRotationPoint(1.2f, -1.4f, -1.8000001f).setRotationAngle(0, 0, 0).setName("Box 278")
		);
		interior.add(new ModelRendererTurbo(interior, 72, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 4.8f, 1.2f, 4.8f, 0, -0.6f, -0.6f, -0.6f, -0.6f, -0.6f, -0.6f, -0.6f, -0.6f, -0.6f, -0.6f, -0.6f, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.200001f, -1.4f, -2.4f).setRotationAngle(0, 0, 0).setName("Box 280")
		);
		interior.add(new ModelRendererTurbo(interior, 268, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 1.2f, 0, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f, 0.24000001f)
			.setRotationPoint(15.000001f, -5, -0.6f).setRotationAngle(0, 0, 0).setName("Box 282")
		);
		interior.add(new ModelRendererTurbo(interior, 229, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.26f, -10.1f, -14.400001f).setRotationAngle(0, 0, 0).setName("Box 274cp")
		);
		interior.add(new ModelRendererTurbo(interior, 0, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 20.400002f, 3.6000001f, 7.2000003f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1.2f, -0.2f, -3.6000001f).setRotationAngle(0, 0, 0).setName("Box 276cp")
		);
		interior.add(new ModelRendererTurbo(interior, 110, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 7.2000003f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2.4f, -2, -0.6f).setRotationAngle(0, 0, -11.000001f).setName("Box 279cp")
		);
		interior.add(new ModelRendererTurbo(interior, 507, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 4.8f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.000001f, -4.4f, -0.6f).setRotationAngle(0, 0, 0).setName("Box 281cp")
		);
		interior.add(new ModelRendererTurbo(interior, 24, 53, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 0.8f, 0.8f, 3, null)
			.setRotationPoint(19, -9, 2.5f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 185, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 4.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.960001f, -6.4f, -2.4f).setRotationAngle(0, 0, -12).setName("Box 283cp")
		);
		interior.add(new ModelRendererTurbo(interior, 127, 39, textureX, textureY)
			.addShapeBox(0, 1.2f, 0, 1.2f, 2.4f, 4.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.960001f, -5, -2.4f).setRotationAngle(0, 0, 0).setName("Box 284cp")
		);
		interior.add(new ModelRendererTurbo(interior, 110, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 4.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.960001f, -5.1f, -2.4f).setRotationAngle(0, 0, -12).setName("Box 285cp")
		);
		interior.add(new ModelRendererTurbo(interior, 268, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 2.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.960001f, -9.6f, -1.4f).setRotationAngle(0, 0, 0).setName("Box 283cp")
		);
		interior.add(new ModelRendererTurbo(interior, 16, 53, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 0.8f, 0.8f, 3, null)
			.setRotationPoint(19, -9, -2.5f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 436, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 4.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.960001f, -7.6f, -2.4f).setRotationAngle(0, 0, -12).setName("Box 285cp")
		);
		interior.add(new ModelRendererTurbo(interior, 175, 0, textureX, textureY).addBox(0, 0, 0, 1, 1, 4)
			.setRotationPoint(17.9f, -8.7f, 5.1f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 8, 53, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 1, 1, 3, null)
			.setRotationPoint(17.9f, -12, 6).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 0, 53, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 1, 1, 3, null)
			.setRotationPoint(17.9f, -10, 6).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 212, 40, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.8f, 0.8f, 3, null)
			.setRotationPoint(17.9f, -11.3f, 15).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 173, 48, textureX, textureY).addBox(0, 0, 0, 1, 1, 1.5f)
			.setRotationPoint(17.9f, -10, 7.6f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 168, 48, textureX, textureY).addBox(0, 0, 0, 1, 1, 1.5f)
			.setRotationPoint(17.9f, -11.375f, 7.6f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 464, 46, textureX, textureY).addBox(0, 0, 0, 1, 1, 1.5f)
			.setRotationPoint(17.9f, -12.75f, 7.6f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 158, 0, textureX, textureY).addBox(0, 0, 0, 1, 1, 4)
			.setRotationPoint(17.9f, -8.7f, 12.475f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(interior);
		//
	}

}
