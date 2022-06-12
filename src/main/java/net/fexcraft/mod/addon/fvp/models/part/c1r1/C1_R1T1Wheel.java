//FMT-Marker FVTM-1
package net.fexcraft.mod.addon.fvp.models.part.c1r1;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter V1 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.0.1-test &copy; 2018 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c1_r1_t1_wheel")
public class C1_R1T1Wheel extends PartModel {

	public C1_R1T1Wheel(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup r1_wheel = new ModelGroup("r1_wheel");
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 17, 1, textureX, textureY).addBox(-1.5f, -1.5f, -3, 3, 3, 3)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 6")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 265, 1, textureX, textureY).addBox(-1.5f, 7.5f, -4.5f, 3, 2, 5)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 11")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 305, 1, textureX, textureY).addBox(-1.5f, -9.5f, -4.5f, 3, 2, 5)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 12")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 345, 1, textureX, textureY).addBox(7.5f, -1.5f, -4.5f, 2, 3, 5)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 13")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 385, 1, textureX, textureY).addBox(-9.5f, -1.5f, -4.5f, 2, 3, 5)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 441, 1, textureX, textureY)
			.addShapeBox(3.7f, 4.7f, -4.5f, 3, 2, 5, 0, -0.5f, -1.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, -1.5f, 0, -2, 1, 0, 1, -1, 0, 1, -1, 0, -2, 1, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 16")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 465, 1, textureX, textureY)
			.addShapeBox(5.2f, -7.2f, -4.5f, 3, 2, 5, 0, -0.5f, 0.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, 0.5f, 0, 1, -1, 0, -2, 1, 0, -2, 1, 0, 1, -1, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 18")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 489, 1, textureX, textureY)
			.addShapeBox(-6.7f, 4.7f, -4.5f, 3, 2, 5, 0, -0.5f, 0.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, 0.5f, 0, 1, -1, 0, -2, 1, 0, -2, 1, 0, 1, -1, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 1, 9, textureX, textureY)
			.addShapeBox(-6.7f, -6.7f, -4.5f, 3, 2, 5, 0, 1, -1, 0, -2, 1, 0, -2, 1, 0, 1, -1, 0, -0.5f, 0.5f, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 25, 9, textureX, textureY)
			.addShapeBox(1.5f, 7.5f, -4.5f, 3, 2, 5, 0, 0, 0, 0, -0.3f, 1.3f, 0, -0.3f, 1.3f, 0, 0, 0, 0, 0, 0, 0, 1.2f, -1.8f, 0, 1.2f, -1.8f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 21")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 177, 9, textureX, textureY)
			.addShapeBox(-4.5f, 7.5f, -4.5f, 3, 2, 5, 0, -0.3f, 1.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, 1.3f, 0, 1.2f, -1.8f, 0, 0, 0, 0, 0, 0, 0, 1.2f, -1.8f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 22")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 217, 9, textureX, textureY)
			.addShapeBox(-4.5f, -9.5f, -4.5f, 3, 2, 5, 0, 1.2f, -1.8f, 0, 0, 0, 0, 0, 0, 0, 1.2f, -1.8f, 0, -0.3f, 1.3f, 0, 0, 0, 0, 0, 0, 0, -0.3f, 1.3f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 23")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 265, 9, textureX, textureY)
			.addShapeBox(1.5f, -9.5f, -4.5f, 3, 2, 5, 0, 0, 0, 0, 1.2f, -1.8f, 0, 1.2f, -1.8f, 0, 0, 0, 0, 0, 0, 0, -0.3f, 1.3f, 0, -0.3f, 1.3f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 24")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 305, 9, textureX, textureY)
			.addShapeBox(7.5f, 1.5f, -4.5f, 2, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.3f, -0.3f, 0, -1.8f, 1.2f, 0, -1.8f, 1.2f, 0, 1.3f, -0.3f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 26")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 441, 9, textureX, textureY)
			.addShapeBox(7.5f, -4.5f, -4.5f, 2, 3, 5, 0, 1.3f, -0.3f, 0, -1.8f, 1.2f, 0, -1.8f, 1.2f, 0, 1.3f, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 27")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 457, 9, textureX, textureY)
			.addShapeBox(-9.5f, -4.5f, -4.5f, 2, 3, 5, 0, -1.8f, 1.2f, 0, 1.3f, -0.3f, 0, 1.3f, -0.3f, 0, -1.8f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 28")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 473, 9, textureX, textureY)
			.addShapeBox(-9.5f, 1.5f, -4.5f, 2, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.8f, 1.2f, 0, 1.3f, -0.3f, 0, 1.3f, -0.3f, 0, -1.8f, 1.2f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 29")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 33, 1, textureX, textureY)
			.addShapeBox(-1.5f, 7.5f, 0.5f, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 30")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 281, 1, textureX, textureY)
			.addShapeBox(-1.5f, -9.5f, 0.5f, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 31")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 361, 1, textureX, textureY)
			.addShapeBox(7.5f, -1.5f, 0.5f, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f, 0, 0, 0, 0, 0, 0, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 32")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 401, 1, textureX, textureY)
			.addShapeBox(-9.5f, -1.5f, 0.5f, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f, 0, 0, 0, 0, 0, 0, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 33")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 457, 1, textureX, textureY)
			.addShapeBox(7.5f, 1.5f, 0.5f, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f, 1.3f, -0.3f, 0, -1.8f, 1.2f, 0, -2, 1.2f, -0.7f, 1.2f, -0.1f, -0.7f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 34")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 481, 1, textureX, textureY)
			.addShapeBox(3.7f, 4.7f, 0.5f, 3, 2, 1, 0, -0.5f, -1.5f, 0, -0.5f, 0.5f, 0, -0.4f, 0.3f, -0.7f, -0.7f, -1.6f, -0.7f, -2, 1, 0, 1, -1, 0, 0.8f, -1, -0.7f, -1.9f, 0.8f, -0.7f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 36")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 17, 9, textureX, textureY)
			.addShapeBox(1.5f, 7.5f, 0.5f, 3, 2, 1, 0, 0, 0, 0, -0.3f, 1.3f, 0, -0.1f, 1.2f, -0.7f, 0, -0.2f, -0.7f, 0, 0, 0, 1.2f, -1.8f, 0, 1.1f, -2, -0.7f, 0, -0.2f, -0.7f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 37")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 505, 1, textureX, textureY)
			.addShapeBox(7.5f, -4.5f, 0.5f, 2, 3, 1, 0, 1.3f, -0.3f, 0, -1.8f, 1.2f, 0, -2, 1.2f, -0.7f, 1.2f, -0.1f, -0.7f, 0, 0, 0, 0, 0, 0, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 281, 9, textureX, textureY)
			.addShapeBox(-9.5f, -4.5f, 0.5f, 2, 3, 1, 0, -1.8f, 1.2f, 0, 1.3f, -0.3f, 0, 1.2f, -0.1f, -0.7f, -2, 1.2f, -0.7f, 0, 0, 0, 0, 0, 0, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 39")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 361, 9, textureX, textureY)
			.addShapeBox(-9.5f, 1.5f, 0.5f, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f, -1.8f, 1.2f, 0, 1.3f, -0.3f, 0, 1.2f, -0.1f, -0.7f, -2, 1.2f, -0.7f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 40")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 401, 9, textureX, textureY)
			.addShapeBox(3.7f, -6.7f, 0.5f, 3, 2, 1, 0, -2, 1, 0, 1, -1, 0, 0.8f, -1, -0.7f, -1.9f, 0.8f, -0.7f, -0.5f, -1.5f, 0, -0.5f, 0.5f, 0, -0.4f, 0.3f, -0.7f, -0.7f, -1.6f, -0.7f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 489, 9, textureX, textureY)
			.addShapeBox(-6.7f, -6.7f, 0.5f, 3, 2, 1, 0, 1, -1, 0, -2, 1, 0, -1.9f, 0.8f, -0.7f, 0.8f, -1, -0.7f, -0.5f, 0.5f, 0, -0.5f, -1.5f, 0, -0.7f, -1.6f, -0.7f, -0.4f, 0.3f, -0.7f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 42")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 1, 17, textureX, textureY)
			.addShapeBox(-6.7f, 4.7f, 0.5f, 3, 2, 1, 0, -0.5f, 0.5f, 0, -0.5f, -1.5f, 0, -0.7f, -1.6f, -0.7f, -0.4f, 0.3f, -0.7f, 1, -1, 0, -2, 1, 0, -1.9f, 0.8f, -0.7f, 0.8f, -1, -0.7f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 43")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 17, 17, textureX, textureY)
			.addShapeBox(-4.5f, 7.5f, 0.5f, 3, 2, 1, 0, -0.3f, 1.3f, 0, 0, 0, 0, 0, -0.2f, -0.7f, -0.1f, 1.2f, -0.7f, 1.2f, -1.8f, 0, 0, 0, 0, 0, -0.2f, -0.7f, 1.1f, -2, -0.7f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 44")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 33, 17, textureX, textureY)
			.addShapeBox(-4.5f, -9.5f, 0.5f, 3, 2, 1, 0, 1.2f, -1.8f, 0, 0, 0, 0, 0, -0.2f, -0.7f, 1.1f, -2, -0.7f, -0.3f, 1.3f, 0, 0, 0, 0, 0, -0.2f, -0.7f, -0.1f, 1.2f, -0.7f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 45")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 265, 17, textureX, textureY)
			.addShapeBox(1.5f, -9.5f, 0.5f, 3, 2, 1, 0, 0, 0, 0, 1.2f, -1.8f, 0, 1.1f, -2, -0.7f, 0, -0.2f, -0.7f, 0, 0, 0, -0.3f, 1.3f, 0, -0.1f, 1.2f, -0.7f, 0, -0.2f, -0.7f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 46")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 281, 17, textureX, textureY)
			.addShapeBox(-1.5f, -9.5f, -5.5f, 3, 2, 1, 0, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 47")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 385, 17, textureX, textureY)
			.addShapeBox(1.5f, -9.5f, -5.5f, 3, 2, 1, 0, 0, -0.2f, -0.7f, 1.1f, -2, -0.7f, 1.2f, -1.8f, 0, 0, 0, 0, 0, -0.2f, -0.7f, -0.1f, 1.2f, -0.7f, -0.3f, 1.3f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 48")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 401, 17, textureX, textureY)
			.addShapeBox(3.7f, -6.7f, -5.5f, 3, 2, 1, 0, -1.9f, 0.8f, -0.7f, 0.8f, -1, -0.7f, 1, -1, 0, -2, 1, 0, -0.7f, -1.6f, -0.7f, -0.4f, 0.3f, -0.7f, -0.5f, 0.5f, 0, -0.5f, -1.5f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 49")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 505, 9, textureX, textureY)
			.addShapeBox(7.5f, -4.5f, -5.5f, 2, 3, 1, 0, 1.2f, -0.1f, -0.7f, -2, 1.2f, -0.7f, -1.8f, 1.2f, 0, 1.3f, -0.3f, 0, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 50")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 489, 17, textureX, textureY)
			.addShapeBox(7.5f, -1.5f, -5.5f, 2, 3, 1, 0, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f, 0, 0, 0, 0, 0, 0, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 51")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 497, 17, textureX, textureY)
			.addShapeBox(7.5f, 1.5f, -5.5f, 2, 3, 1, 0, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f, 0, 0, 0, 0, 0, 0, 1.2f, -0.1f, -0.7f, -2, 1.2f, -0.7f, -1.8f, 1.2f, 0, 1.3f, -0.3f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 52")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 1, 25, textureX, textureY)
			.addShapeBox(3.7f, 4.7f, -5.5f, 3, 2, 1, 0, -0.7f, -1.6f, -0.7f, -0.4f, 0.3f, -0.7f, -0.5f, 0.5f, 0, -0.5f, -1.5f, 0, -1.9f, 0.8f, -0.7f, 0.8f, -1, -0.7f, 1, -1, 0, -2, 1, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 53")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 17, 25, textureX, textureY)
			.addShapeBox(1.5f, 7.5f, -5.5f, 3, 2, 1, 0, 0, -0.2f, -0.7f, -0.1f, 1.2f, -0.7f, -0.3f, 1.3f, 0, 0, 0, 0, 0, -0.2f, -0.7f, 1.1f, -2, -0.7f, 1.2f, -1.8f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 33, 25, textureX, textureY)
			.addShapeBox(-1.5f, 7.5f, -5.5f, 3, 2, 1, 0, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f, 0, 0, 0, 0, 0, 0, 0, -0.2f, -0.7f, 0, -0.2f, -0.7f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 177, 25, textureX, textureY)
			.addShapeBox(-4.5f, 7.5f, -5.5f, 3, 2, 1, 0, -0.1f, 1.2f, -0.7f, 0, -0.2f, -0.7f, 0, 0, 0, -0.3f, 1.3f, 0, 1.1f, -2, -0.7f, 0, -0.2f, -0.7f, 0, 0, 0, 1.2f, -1.8f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 56")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 193, 25, textureX, textureY)
			.addShapeBox(-6.7f, 4.7f, -5.5f, 3, 2, 1, 0, -0.4f, 0.3f, -0.7f, -0.7f, -1.6f, -0.7f, -0.5f, -1.5f, 0, -0.5f, 0.5f, 0, 0.8f, -1, -0.7f, -1.9f, 0.8f, -0.7f, -2, 1, 0, 1, -1, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 57")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 505, 17, textureX, textureY)
			.addShapeBox(-9.5f, 1.5f, -5.5f, 2, 3, 1, 0, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f, 0, 0, 0, 0, 0, 0, -2, 1.2f, -0.7f, 1.2f, -0.1f, -0.7f, 1.3f, -0.3f, 0, -1.8f, 1.2f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 58")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 305, 25, textureX, textureY)
			.addShapeBox(-9.5f, -1.5f, -5.5f, 2, 3, 1, 0, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f, 0, 0, 0, 0, 0, 0, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 59")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 313, 25, textureX, textureY)
			.addShapeBox(-9.5f, -4.5f, -5.5f, 2, 3, 1, 0, -2, 1.2f, -0.7f, 1.2f, -0.1f, -0.7f, 1.3f, -0.3f, 0, -1.8f, 1.2f, 0, -0.2f, 0, -0.7f, -0.2f, 0, -0.7f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 60")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 209, 25, textureX, textureY)
			.addShapeBox(-6.7f, -6.7f, -5.5f, 3, 2, 1, 0, 0.8f, -1, -0.7f, -1.9f, 0.8f, -0.7f, -2, 1, 0, 1, -1, 0, -0.4f, 0.3f, -0.7f, -0.7f, -1.6f, -0.7f, -0.5f, -1.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 61")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 225, 25, textureX, textureY)
			.addShapeBox(-4.5f, -9.5f, -5.5f, 3, 2, 1, 0, 1.1f, -2, -0.7f, 0, -0.2f, -0.7f, 0, 0, 0, 1.2f, -1.8f, 0, -0.1f, 1.2f, -0.7f, 0, -0.2f, -0.7f, 0, 0, 0, -0.3f, 1.3f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 62")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 321, 25, textureX, textureY)
			.addShapeBox(1.5f, -0.5f, -3, 1, 1, 3, 0, 0, 0.1f, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0.1f, 0, 0, 0.1f, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0.1f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 63")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 337, 25, textureX, textureY)
			.addShapeBox(-2.5f, -0.5f, -3, 1, 1, 3, 0, -0.4f, -0.5f, 0, 0, 0.1f, 0, 0, 0.1f, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0.1f, 0, 0, 0.1f, 0, -0.4f, -0.5f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 353, 25, textureX, textureY)
			.addShapeBox(-0.5f, 1.5f, -3, 1, 1, 3, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 66")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 465, 25, textureX, textureY)
			.addShapeBox(-0.5f, -2.5f, -3, 1, 1, 3, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 67")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 481, 25, textureX, textureY).addBox(-0.5f, 1.5f, -2.5f, 1, 6, 2)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 489, 25, textureX, textureY).addBox(-0.5f, -7.5f, -2.5f, 1, 6, 2)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 69")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 265, 25, textureX, textureY).addBox(1.5f, -0.5f, -2.5f, 6, 1, 2)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 70")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 385, 25, textureX, textureY).addBox(-7.5f, -0.5f, -2.5f, 6, 1, 2)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 441, 25, textureX, textureY)
			.addShapeBox(-1, -1, 0, 2, 2, 1, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 74")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 497, 25, textureX, textureY)
			.addShapeBox(-0.5f, 1.5f, -2.5f, 1, 6, 2, 0, -0.85f, -0.05f, 0, 0.7f, 0.45f, 0, 0.7f, 0.45f, 0, -0.85f, -0.05f, 0, -3.8f, -0.75f, 0, 3.7f, -1.25f, 0, 3.7f, -1.25f, 0, -3.8f, -0.75f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 75")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 505, 25, textureX, textureY)
			.addShapeBox(-0.5f, -7.5f, -2.5f, 1, 6, 2, 0, -3.8f, -0.75f, 0, 3.7f, -1.25f, 0, 3.7f, -1.25f, 0, -3.8f, -0.75f, 0, -0.85f, -0.05f, 0, 0.7f, 0.45f, 0, 0.7f, 0.45f, 0, -0.85f, -0.05f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 77")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 1, 33, textureX, textureY)
			.addShapeBox(-0.5f, -7.5f, -2.5f, 1, 6, 2, 0, 3.7f, -1.25f, 0, -3.8f, -0.75f, 0, -3.8f, -0.75f, 0, 3.7f, -1.25f, 0, 0.7f, 0.45f, 0, -0.85f, -0.05f, 0, -0.85f, -0.05f, 0, 0.7f, 0.45f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 78")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 9, 33, textureX, textureY)
			.addShapeBox(-0.5f, 1.5f, -2.5f, 1, 6, 2, 0, 0.7f, 0.45f, 0, -0.85f, -0.05f, 0, -0.85f, -0.05f, 0, 0.7f, 0.45f, 0, 3.7f, -1.25f, 0, -3.8f, -0.75f, 0, -3.8f, -0.75f, 0, 3.7f, -1.25f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 79")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 17, 33, textureX, textureY)
			.addShapeBox(1.5f, -0.5f, -2.5f, 6, 1, 2, 0, -0.05f, -0.8f, 0, -0.75f, -3.8f, 0, -0.75f, -3.8f, 0, -0.05f, -0.8f, 0, 0.45f, 0.7f, 0, -1.25f, 3.7f, 0, -1.25f, 3.7f, 0, 0.45f, 0.7f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 81")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 177, 33, textureX, textureY)
			.addShapeBox(-7.5f, -0.5f, -2.5f, 6, 1, 2, 0, -1.25f, 3.7f, 0, 0.45f, 0.7f, 0, 0.45f, 0.7f, 0, -1.25f, 3.7f, 0, -0.75f, -3.8f, 0, -0.05f, -0.8f, 0, -0.05f, -0.8f, 0, -0.75f, -3.8f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 82")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 201, 33, textureX, textureY)
			.addShapeBox(-7.5f, -0.5f, -2.5f, 6, 1, 2, 0, -0.75f, -3.8f, 0, -0.05f, -0.8f, 0, -0.05f, -0.8f, 0, -0.75f, -3.8f, 0, -1.25f, 3.7f, 0, 0.45f, 0.7f, 0, 0.45f, 0.7f, 0, -1.25f, 3.7f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 83")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 225, 33, textureX, textureY)
			.addShapeBox(1.5f, -0.5f, -2.5f, 6, 1, 2, 0, 0.45f, 0.7f, 0, -1.25f, 3.7f, 0, -1.25f, 3.7f, 0, 0.45f, 0.7f, 0, -0.05f, -0.8f, 0, -0.75f, -3.8f, 0, -0.75f, -3.8f, 0, -0.05f, -0.8f, 0)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 84")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 449, 25, textureX, textureY)
			.addShapeBox(1.5f, -0.5f, -0.5f, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 85")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 417, 33, textureX, textureY)
			.addShapeBox(-7.5f, -0.5f, -0.5f, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 249, 33, textureX, textureY)
			.addShapeBox(-0.5f, 1.5f, -0.5f, 1, 6, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 87")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 433, 33, textureX, textureY)
			.addShapeBox(-0.5f, -7.5f, -0.5f, 1, 6, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 88")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 441, 33, textureX, textureY)
			.addShapeBox(-0.5f, 1.5f, -0.5f, 1, 6, 1, 0, -0.85f, -0.05f, 0, 0.7f, 0.45f, 0, 0.35f, 0.15f, -0.5f, -1.35f, 0.15f, -0.5f, -3.8f, -0.75f, 0, 3.7f, -1.25f, 0, 3.3f, -1, -0.5f, -4.25f, -1.1f, -0.5f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 89")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 449, 33, textureX, textureY)
			.addShapeBox(-0.5f, 1.5f, -0.5f, 1, 6, 1, 0, 0.7f, 0.45f, 0, -0.85f, -0.05f, 0, -1.35f, 0.15f, -0.5f, 0.35f, 0.15f, -0.5f, 3.7f, -1.25f, 0, -3.8f, -0.75f, 0, -4.25f, -1.1f, -0.5f, 3.3f, -1, -0.5f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 93")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 457, 33, textureX, textureY)
			.addShapeBox(-0.5f, -7.5f, -0.5f, 1, 6, 1, 0, 3.7f, -1.25f, 0, -3.8f, -0.75f, 0, -4.25f, -1.1f, -0.5f, 3.3f, -1, -0.5f, 0.7f, 0.45f, 0, -0.85f, -0.05f, 0, -1.35f, 0.15f, -0.5f, 0.35f, 0.15f, -0.5f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 465, 33, textureX, textureY)
			.addShapeBox(-0.5f, -7.5f, -0.5f, 1, 6, 1, 0, -3.8f, -0.75f, 0, 3.7f, -1.25f, 0, 3.3f, -1, -0.5f, -4.25f, -1.1f, -0.5f, -0.85f, -0.05f, 0, 0.7f, 0.45f, 0, 0.35f, 0.15f, -0.5f, -1.35f, 0.15f, -0.5f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 95")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 217, 41, textureX, textureY)
			.addShapeBox(1.5f, -0.5f, -0.5f, 6, 1, 1, 0, -0.05f, -0.8f, 0, -0.75f, -3.8f, 0, -0.85f, -4.25f, -0.5f, 0.15f, -1.25f, -0.5f, 0.45f, 0.7f, 0, -1.25f, 3.7f, 0, -1.05f, 3.15f, -0.5f, 0.3f, 0.15f, -0.5f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 233, 41, textureX, textureY)
			.addShapeBox(1.5f, -0.5f, -0.5f, 6, 1, 1, 0, 0.45f, 0.7f, 0, -1.25f, 3.7f, 0, -1.05f, 3.15f, -0.5f, 0.3f, 0.15f, -0.5f, -0.05f, -0.8f, 0, -0.75f, -3.8f, 0, -0.85f, -4.25f, -0.5f, 0.15f, -1.25f, -0.5f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 249, 41, textureX, textureY)
			.addShapeBox(-7.5f, -0.5f, -0.5f, 6, 1, 1, 0, -1.25f, 3.7f, 0, 0.45f, 0.7f, 0, 0.3f, 0.15f, -0.5f, -1.05f, 3.15f, -0.5f, -0.75f, -3.8f, 0, -0.05f, -0.8f, 0, 0.15f, -1.25f, -0.5f, -0.85f, -4.25f, -0.5f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 101")
		);
		r1_wheel.add(new ModelRendererTurbo(r1_wheel, 265, 41, textureX, textureY)
			.addShapeBox(-7.5f, -0.5f, -0.5f, 6, 1, 1, 0, -0.75f, -3.8f, 0, -0.05f, -0.8f, 0, 0.15f, -1.25f, -0.5f, -0.85f, -4.25f, -0.5f, -1.25f, 3.7f, 0, 0.45f, 0.7f, 0, 0.3f, 0.15f, -0.5f, -1.05f, 3.15f, -0.5f)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0).setName("Box 102")
		);
		r1_wheel.addProgram(DefaultPrograms.WHEEL_AUTO_ALL);
		this.groups.add(r1_wheel);
	}

}