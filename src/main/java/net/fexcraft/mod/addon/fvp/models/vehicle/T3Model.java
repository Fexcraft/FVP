//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.vehicle;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.model.VehicleModel;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.5.2 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/vehicle/T3")
public class T3Model extends VehicleModel {

	public T3Model(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList axle_front = new TurboList("axle_front");
		axle_front.add(new ModelRendererTurbo(axle_front, 206, 405, textureX, textureY).addBox(0, 0, -36, 2, 2, 36)
			.setRotationPoint(51, -3, 18).setRotationAngle(0, 0, 0).setName("axle_front")
		);
		this.groups.add(axle_front);
		//
		TurboList label_left = new TurboList("label_left");
		label_left.add(new ModelRendererTurbo(label_left, 333, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 3, 1, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(56, -30.5f, 14.55f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 104, 239, textureX, textureY)
			.addShapeBox(0, 0, 1, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 350, 227, textureX, textureY)
			.addShapeBox(0.5f, 0.5f, 1, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 502, 236, textureX, textureY)
			.addShapeBox(1, 0, 1, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 484, 133, textureX, textureY)
			.addShapeBox(1.75f, 0, 1, 2, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 502, 232, textureX, textureY)
			.addShapeBox(2.25f, 0.25f, 1, 1, 2, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 477, 133, textureX, textureY)
			.addShapeBox(3.5f, 0, 1, 2, 1, 1, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.75f, 0, -0.8f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 485, 232, textureX, textureY)
			.addShapeBox(4.5f, 0.25f, 1, 1, 2, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 216, 225, textureX, textureY)
			.addShapeBox(3.5f, 0.25f, 1, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 185, 225, textureX, textureY)
			.addShapeBox(4, 0.5f, 1, 1, 1, 1, 0, 0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, 0.25f, -0.25f, -0.8f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f)
			.setRotationPoint(56, -29.75f, 14.4f).setRotationAngle(-0.25f, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 180, 225, textureX, textureY)
			.addShapeBox(4, 0.75f, 1, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f, 0.25f, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.8f, 0.25f, 0.25f, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 466, 232, textureX, textureY)
			.addShapeBox(5.25f, 0, 1, 1, 2, 1, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, -0.5f, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 345, 227, textureX, textureY)
			.addShapeBox(6.25f, 0, 1, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.8f, -0.25f, 0, -0.8f, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.8f, -0.25f, 0, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 175, 225, textureX, textureY)
			.addShapeBox(5.75f, 0, 1, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 170, 225, textureX, textureY)
			.addShapeBox(5.75f, 1.5f, 1, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 165, 225, textureX, textureY)
			.addShapeBox(7, 0, 1, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 331, 224, textureX, textureY)
			.addShapeBox(8.25f, 0, 1, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 326, 224, textureX, textureY)
			.addShapeBox(7.5f, 1, 1, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 321, 224, textureX, textureY)
			.addShapeBox(7.75f, 1, 1, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 316, 224, textureX, textureY)
			.addShapeBox(10, 0, 1, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, 0.75f, 0, 0, -1.25f, 0, 0, -1.25f, 0, -0.8f, 0.75f, 0, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 311, 224, textureX, textureY)
			.addShapeBox(9, 0, 1, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -1.25f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.8f, -1.25f, 0, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 306, 224, textureX, textureY)
			.addShapeBox(11, 0.5f, 1, 1, 1, 1, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, 0, -0.25f, -0.8f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, 0, -0.25f, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 301, 224, textureX, textureY)
			.addShapeBox(11.5f, 0, 1, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 296, 224, textureX, textureY)
			.addShapeBox(10.75f, -0.25f, 1, 1, 1, 1, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 356, 221, textureX, textureY)
			.addShapeBox(11, 1.25f, 1, 1, 1, 1, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, 0, -0.25f, -0.8f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, 0, -0.25f, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 136, 219, textureX, textureY)
			.addShapeBox(12.5f, 0.5f, 1, 1, 1, 1, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, 0, -0.25f, -0.8f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, 0, -0.25f, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 291, 224, textureX, textureY)
			.addShapeBox(13, 0, 1, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		label_left.add(new ModelRendererTurbo(label_left, 474, 210, textureX, textureY)
			.addShapeBox(12.25f, -0.25f, 1, 1, 1, 1, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f)
			.setRotationPoint(56, -30, 14.4f).setRotationAngle(0, 9.5f, 4)
		);
		this.groups.add(label_left);
		//
		TurboList label_right = new TurboList("label_right");
		label_right.add(new ModelRendererTurbo(label_right, 303, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 3, 1, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(56, -30.5f, -15.55f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 286, 224, textureX, textureY)
			.addShapeBox(12.25f, 0, 1, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 213, 205, textureX, textureY)
			.addShapeBox(12.75f, 0.5f, 1, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 498, 222, textureX, textureY)
			.addShapeBox(13.25f, 0, 1, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 470, 133, textureX, textureY)
			.addShapeBox(10.5f, 0, 1, 2, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 493, 222, textureX, textureY)
			.addShapeBox(11, 0.25f, 1, 1, 2, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 390, 132, textureX, textureY)
			.addShapeBox(8.75f, 0, 1, 2, 1, 1, 0, -0.25f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 488, 222, textureX, textureY)
			.addShapeBox(8.75f, 0.25f, 1, 1, 2, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 135, 195, textureX, textureY)
			.addShapeBox(9.75f, 0.25f, 1, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 130, 195, textureX, textureY)
			.addShapeBox(9.25f, 0.5f, 1, 1, 1, 1, 0, -0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f)
			.setRotationPoint(56, -29.75f, -16.7f).setRotationAngle(-0.25f, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 333, 190, textureX, textureY)
			.addShapeBox(9.25f, 0.75f, 1, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f, -0.75f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, -0.8f, -0.75f, 0.25f, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 483, 222, textureX, textureY)
			.addShapeBox(7, 0, 1, 1, 2, 1, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, -0.5f, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 478, 222, textureX, textureY)
			.addShapeBox(8, 0, 1, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.8f, -0.25f, 0, -0.8f, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.8f, -0.25f, 0, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 477, 187, textureX, textureY)
			.addShapeBox(7.5f, 0, 1, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 472, 187, textureX, textureY)
			.addShapeBox(7.5f, 1.5f, 1, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.8f, -0.25f, -0.5f, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 58, 220, textureX, textureY)
			.addShapeBox(5, 0, 1, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 53, 220, textureX, textureY)
			.addShapeBox(6.25f, 0, 1, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 467, 187, textureX, textureY)
			.addShapeBox(5.5f, 1, 1, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.8f, 0, 0, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 462, 187, textureX, textureY)
			.addShapeBox(5.75f, 1, 1, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.8f, -0.5f, 0, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 48, 220, textureX, textureY)
			.addShapeBox(4.25f, 0, 1, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, 0.75f, 0, 0, -1.25f, 0, 0, -1.25f, 0, -0.8f, 0.75f, 0, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 43, 220, textureX, textureY)
			.addShapeBox(3.25f, 0, 1, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -1.25f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.8f, -1.25f, 0, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 457, 187, textureX, textureY)
			.addShapeBox(2.5f, 0.5f, 1, 1, 1, 1, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, 0, -0.25f, -0.8f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, 0, -0.25f, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 38, 220, textureX, textureY)
			.addShapeBox(1.75f, 0, 1, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 452, 187, textureX, textureY)
			.addShapeBox(2.25f, -0.25f, 1, 1, 1, 1, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 447, 187, textureX, textureY)
			.addShapeBox(2.5f, 1.25f, 1, 1, 1, 1, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, 0, -0.25f, -0.8f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, 0, -0.25f, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 442, 187, textureX, textureY)
			.addShapeBox(1, 0.5f, 1, 1, 1, 1, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, 0, -0.25f, -0.8f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.8f, 0, -0.25f, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 148, 219, textureX, textureY)
			.addShapeBox(0.25f, 0, 1, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		label_right.add(new ModelRendererTurbo(label_right, 149, 179, textureX, textureY)
			.addShapeBox(0.75f, -0.25f, 1, 1, 1, 1, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f)
			.setRotationPoint(56, -30, -16.7f).setRotationAngle(0, -9.5f, 4)
		);
		this.groups.add(label_right);
		//
		TurboList door_right = new TurboList("door_right");
		door_right.add(new ModelRendererTurbo(door_right, 0, 220, textureX, textureY).addBox(-21, 0, 0, 14, 16, 1)
			.setRotationPoint(17, -35, -21.9f).setRotationAngle(0, 0, 0)
		);
		door_right.add(new ModelRendererTurbo(door_right, 285, 317, textureX, textureY).addBox(-21, -14, 0, 2, 14, 1)
			.setRotationPoint(17, -35, -21.9f).setRotationAngle(0, 0, 0)
		);
		door_right.add(new ModelRendererTurbo(door_right, 505, 297, textureX, textureY)
			.addShapeBox(-2, -14, 0, 2, 14, 1, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17, -35, -21.9f).setRotationAngle(0, 0, 0)
		);
		door_right.add(new ModelRendererTurbo(door_right, 470, 129, textureX, textureY)
			.addShapeBox(-21, -16, 0, 19, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17, -35, -21.9f).setRotationAngle(0, 0, 0)
		);
		door_right.add(new ModelRendererTurbo(door_right, 387, 265, textureX, textureY).addBox(-1, 0, 0, 1, 16, 1)
			.setRotationPoint(17, -35, -21.9f).setRotationAngle(0, 0, 0)
		);
		door_right.add(new ModelRendererTurbo(door_right, 71, 112, textureX, textureY).addBox(-7, 0, 0, 6, 8, 1)
			.setRotationPoint(17, -35, -21.9f).setRotationAngle(0, 0, 0)
		);
		door_right.add(new ModelRendererTurbo(door_right, 449, 91, textureX, textureY).addBox(-7, 14, 0, 6, 2, 1)
			.setRotationPoint(17, -35, -21.9f).setRotationAngle(0, 0, 0)
		);
		door_right.add(new ModelRendererTurbo(door_right, 174, 95, textureX, textureY).addBox(-19, 2, 0, 3, 1, 1)
			.setRotationPoint(17, -35, -22.1f).setRotationAngle(0, 0, 0)
		);
		door_right.add(new ModelRendererTurbo(door_right, 277, 93, textureX, textureY).addBox(-7, 2, 0, 3, 1, 1)
			.setRotationPoint(17, -35, -21.8f).setRotationAngle(0, 0, 0)
		);
		door_right.addProgram(new DefaultPrograms.AttributeRotator("t3_door_right", true, -60.0f, 0.0f, -1.0f, 1, 0.0f));
		door_right.addProgram(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_right);
		//
		TurboList door_left = new TurboList("door_left");
		door_left.add(new ModelRendererTurbo(door_left, 421, 226, textureX, textureY).addBox(-21, 0, 0, 21, 16, 1)
			.setRotationPoint(17, -35, 20.9f).setRotationAngle(0, 0, 0)
		);
		door_left.add(new ModelRendererTurbo(door_left, 48, 285, textureX, textureY).addBox(-21, -14, 0, 2, 14, 1)
			.setRotationPoint(17, -35, 20.9f).setRotationAngle(0, 0, 0)
		);
		door_left.add(new ModelRendererTurbo(door_left, 13, 284, textureX, textureY)
			.addShapeBox(-2, -14, 0, 2, 14, 1, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17, -35, 20.9f).setRotationAngle(0, 0, 0)
		);
		door_left.add(new ModelRendererTurbo(door_left, 470, 125, textureX, textureY)
			.addShapeBox(-21, -16, 0, 19, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17, -35, 20.9f).setRotationAngle(0, 0, 0)
		);
		door_left.add(new ModelRendererTurbo(door_left, 174, 92, textureX, textureY).addBox(-19, 2, 0, 3, 1, 1)
			.setRotationPoint(17, -35, 21.1f).setRotationAngle(0, 0, 0)
		);
		door_left.add(new ModelRendererTurbo(door_left, 428, 87, textureX, textureY).addBox(-7, 2, 0, 3, 1, 1)
			.setRotationPoint(17, -35, 20.8f).setRotationAngle(0, 0, 0)
		);
		door_left.addProgram(new DefaultPrograms.AttributeRotator("t3_door_left", true, 0.0f, 80.0f, 1.0f, 1, 0.0f));
		door_left.addProgram(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_left);
		//
		TurboList chassis = new TurboList("chassis");
		chassis.add(new ModelRendererTurbo(chassis, 404, 65, textureX, textureY).addBox(0, 0, 0, 48, 10, 4)
			.setRotationPoint(-14, -13, -11).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 303, 54, textureX, textureY).addBox(0, 0, 0, 48, 10, 4)
			.setRotationPoint(-14, -13, 7).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 185, 142, textureX, textureY).addBox(0, 0, 0, 32, 1, 32)
			.setRotationPoint(-10, 0, -16).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 339, 150, textureX, textureY).addBox(0, 0, 0, 31, 2, 40)
			.setRotationPoint(-10, -19, -20).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 410, 387, textureX, textureY).addBox(0, 0, 0, 2, 8, 30)
			.setRotationPoint(70, -6, -15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 25, 366, textureX, textureY).addBox(0, 0, 0, 1, 24, 2)
			.setRotationPoint(71, -30, -13).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 33, 334, textureX, textureY).addBox(0, 0, 0, 1, 24, 2)
			.setRotationPoint(71, -30, 11).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 463, 300, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0)
			.setRotationPoint(71, -34, 3).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 319, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(71, -32, 11).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 444, 300, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(71, -34, -11).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 154, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(71, -32, -13).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 174, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 48, 1, 32, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0)
			.setRotationPoint(22, 0, -16).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 429, 300, textureX, textureY).addBox(0, 0, 0, 1, 2, 6)
			.setRotationPoint(71, -34, -3).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 482, 347, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 11, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -4, 0, 0, -4, 0)
			.setRotationPoint(70, -6, 15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 448, 324, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 11, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, -1, -4, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(70, -6, -26).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 405, 445, textureX, textureY).addBox(0, 0, 0, 1, 24, 22)
			.setRotationPoint(70.5f, -30, -11).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 346, 429, textureX, textureY).addBox(0, 0, 0, 1, 2, 22)
			.setRotationPoint(70.5f, -32, -11).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 310, 322, textureX, textureY).addBox(0, 0, 0, 3, 1, 10)
			.setRotationPoint(67, -6.1f, 14).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 484, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 10, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(67, -10.1f, 14).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 99, 361, textureX, textureY).addBox(0, 0, 0, 1, 3, 10)
			.setRotationPoint(67, -9.1f, 14).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 215, 181, textureX, textureY).addBox(0, 0, 0, 2, 3, 1)
			.setRotationPoint(68, -9.1f, 14).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 305, 176, textureX, textureY).addBox(0, 0, 0, 2, 3, 1)
			.setRotationPoint(68, -9.1f, 23).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 215, 176, textureX, textureY).addBox(0, 0, 0, 2, 3, 1)
			.setRotationPoint(68, -9.1f, 18.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 247, 300, textureX, textureY).addBox(0, 0, 0, 3, 1, 10)
			.setRotationPoint(67, -6.1f, -24).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 122, 300, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 10, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(67, -10.1f, -24).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 172, 350, textureX, textureY).addBox(0, 0, 0, 1, 3, 10)
			.setRotationPoint(67, -9.1f, -24).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 142, 176, textureX, textureY).addBox(0, 0, 0, 2, 3, 1)
			.setRotationPoint(68, -9.1f, -24).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 71, 175, textureX, textureY).addBox(0, 0, 0, 2, 3, 1)
			.setRotationPoint(68, -9.1f, -15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 305, 429, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 38, 0, 0, 0, 0, 0.2f, 0, -0.5f, 0.2f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 1, 0, -0.2f, 1, 0, -0.2f, 0, 0, 0)
			.setRotationPoint(16, -54, -19).setRotationAngle(0, 0, -12)
		);
		chassis.add(new ModelRendererTurbo(chassis, 71, 170, textureX, textureY).addBox(0, 0, 0, 2, 3, 1)
			.setRotationPoint(68, -9.1f, -19.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 162, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-4, -15, 21).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 450, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-4, -7, 22).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 310, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, -15, -23).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 277, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, -7, -24).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 31, 220, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(51.5f, -16.3f, 23.8f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 218, 213, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(51.5f, -16.3f, -25.8f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 320, 104, textureX, textureY).addBox(0, 0, 0, 36, 10, 4)
			.setRotationPoint(34, -13, 7).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 239, 104, textureX, textureY).addBox(0, 0, 0, 36, 10, 4)
			.setRotationPoint(34, -13, -11).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 421, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0)
			.setRotationPoint(40, -3, -11).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 286, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0)
			.setRotationPoint(40, -3, 7).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 186, 350, textureX, textureY).addBox(0, 0, 0, 2, 8, 14)
			.setRotationPoint(43, -12, -7).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 153, 350, textureX, textureY).addBox(0, 0, 0, 2, 8, 14)
			.setRotationPoint(59, -12, -7).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 291, 379, textureX, textureY).addBox(0, 0, -6, 1, 3, 12)
			.setRotationPoint(71.2f, -5, 0).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 319, 233, textureX, textureY)
			.addShapeBox(0, 0, -1, 1, 2, 2, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1)
			.setRotationPoint(70.7f, -31, 0).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 325, 371, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 17, 40, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(21, -35, -20).setRotationAngle(0, 0, 0)
		);
		this.groups.add(chassis);
		//
		TurboList lights_turn_left = new TurboList("lights_turn_left");
		lights_turn_left.add(new ModelRendererTurbo(lights_turn_left, 183, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.5f, -17.3f, 23.8f).setRotationAngle(0, 0, 0)
		);
		lights_turn_left.add(new ModelRendererTurbo(lights_turn_left, 209, 165, textureX, textureY)
			.addShapeBox(-1, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(68.5f, -9.1f, 23.5f).setRotationAngle(0, 0, 0)
		);
		lights_turn_left.addProgram(DefaultPrograms.TURN_SIGNAL_LEFT);
		this.groups.add(lights_turn_left);
		//
		TurboList lights_turn_right = new TurboList("lights_turn_right");
		lights_turn_right.add(new ModelRendererTurbo(lights_turn_right, 475, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.5f, -17.3f, -25.8f).setRotationAngle(0, 0, 0)
		);
		lights_turn_right.add(new ModelRendererTurbo(lights_turn_right, 497, 139, textureX, textureY)
			.addShapeBox(-1, 0, 0, 2, 3, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(68.5f, -9.1f, -24.5f).setRotationAngle(0, 0, 0)
		);
		lights_turn_right.addProgram(DefaultPrograms.TURN_SIGNAL_RIGHT);
		this.groups.add(lights_turn_right);
		//
		TurboList lights_front = new TurboList("lights_front");
		lights_front.add(new ModelRendererTurbo(lights_front, 352, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 3, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0)
			.setRotationPoint(68, -9.1f, 15.25f).setRotationAngle(0, 0, 0)
		);
		lights_front.add(new ModelRendererTurbo(lights_front, 352, 234, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 3, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0)
			.setRotationPoint(68, -9.1f, -18.25f).setRotationAngle(0, 0, 0)
		);
		lights_front.addProgram(DefaultPrograms.FRONT_LIGHTS);
		lights_front.addProgram(new DefaultPrograms.RectLightBeam(256, 2, 2, 72, 48, 70, -7.5f, 16.75f, 0, 0, -5, null, null));
		lights_front.addProgram(new DefaultPrograms.RectLightBeam(256, 2, 2, 72, 48, 70, -7.5f, -16.75f, 0, 0, -5, null, null));
		this.groups.add(lights_front);
		//
		TurboList lights_long = new TurboList("lights_long");
		lights_long.add(new ModelRendererTurbo(lights_long, 491, 232, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 3, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0)
			.setRotationPoint(68, -9.1f, 19.75f).setRotationAngle(0, 0, 0)
		);
		lights_long.add(new ModelRendererTurbo(lights_long, 352, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 3, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0)
			.setRotationPoint(68, -9.1f, -22.75f).setRotationAngle(0, 0, 0)
		);
		lights_long.addProgram(DefaultPrograms.FOG_LIGHTS);
		this.groups.add(lights_long);
		//
		TurboList chassis_primary = new TurboList("chassis_primary");
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 239, 119, textureX, textureY).addBox(0, 0, 0, 33, 20, 2)
			.setRotationPoint(-12, -19, -22).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 0, 112, textureX, textureY).addBox(0, 0, 0, 33, 20, 2)
			.setRotationPoint(-12, -19, 20).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 164, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 36, 19, 1, 0, 0, 0, 0, 0, -3, 6, 0, -3, -6, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, -6, 0, 0, 0)
			.setRotationPoint(35, -33, 18).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 366, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 14, 1, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, -6, -3, 1.5f, -6, -3, -1.5f, 0, 0, 0)
			.setRotationPoint(35, -14, 18).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 89, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 36, 19, 1, 0, 0, 0, 0, 0, -3, -6, 0, -3, 6, 0, 0, 0, 0, 0, 0, 0, 0, -6, 0, 0, 6, 0, 0, 0)
			.setRotationPoint(35, -33, -19).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 239, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 14, 1, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, -6, -3, -1.5f, -6, -3, 1.5f, 0, 0, 0)
			.setRotationPoint(35, -14, -19).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 77, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 8, 1, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 0, -5, 0, 0, 0, 0, -2, 0, 0, 2, -5, 0, 0.5f)
			.setRotationPoint(59, -14, -15).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 0, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 36, 2, 8, 0, 0, 0.5f, -5, 0, -3, 0, 0, -4.5f, -6, 0, -1, 0, 0, 0, -5, 0, 3, 0, 0, 3, -6, 0, 0, 0)
			.setRotationPoint(35, -35, 11).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 368, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 36, 2, 8, 0, 0, -1, 0, 0, -4.5f, -6, 0, -3, 0, 0, 0.5f, -5, 0, 0, 0, 0, 3, -6, 0, 3, 0, 0, 0, -5)
			.setRotationPoint(35, -35, -19).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 279, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 36, 2, 8, 0, 0, -0.5f, -2, 0, -3, 0, 0, -5, 0, 0, -1.5f, 5, 0, 0, -2, 0, 3, 0, 0, 5, 0, 0, 2, 5)
			.setRotationPoint(35, -37, 3).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 303, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 36, 2, 8, 0, 0, -1.5f, 5, 0, -5, 0, 0, -3, 0, 0, -0.5f, -2, 0, 2, 5, 0, 5, 0, 0, 3, 0, 0, 0, -2)
			.setRotationPoint(35, -37, -11).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 408, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 36, 2, 6, 0, 0, -1.5f, 2, 0, -4, 0, 0, -4, 0, 0, -1.5f, 2, 0, 1, 2, 0, 4, 0, 0, 4, 0, 0, 1, 2)
			.setRotationPoint(35, -38, -3).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 344, 284, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 16, 2, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0)
			.setRotationPoint(21, -14, 20).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 409, 324, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 21, 2, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0)
			.setRotationPoint(21, -35, 20).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 400, 324, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 21, 2, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 0)
			.setRotationPoint(21, -35, -22).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 242, 358, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 44, 0, 2, 0, -1, -2, 0, -3, -2, 0, -3, 2, 0, -1, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0)
			.setRotationPoint(15, -56, -22).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 318, 324, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 44, 0, 0, 0, -0.75f, -2, 0, -1, -2, 0, -1, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12, -56, -22).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 102, 271, textureX, textureY).addBox(0, 0, 0, 12, 19, 1)
			.setRotationPoint(23, -33, 18).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 0, 238, textureX, textureY).addBox(0, 0, 0, 12, 15, 1)
			.setRotationPoint(23, -14, 18).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 239, 233, textureX, textureY).addBox(0, 0, 0, 12, 19, 1)
			.setRotationPoint(23, -33, -19).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 77, 224, textureX, textureY).addBox(0, 0, 0, 12, 15, 1)
			.setRotationPoint(23, -14, -19).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 154, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 2, 8, 0, 0, 1, -5, 0, 0.5f, -5, 0, -1, 0, 0, -0.5f, 0, 0, 0, -5, 0, 0, -5, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23, -35, 11).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 319, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 2, 8, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0.5f, -5, 0, 1, -5, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5)
			.setRotationPoint(23, -35, -19).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 154, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 2, 8, 0, 0, 0, -2, 0, -0.5f, -2, 0, -1.5f, 5, 0, -1, 5, 0, 0, -2, 0, 0, -2, 0, 2, 5, 0, 2, 5)
			.setRotationPoint(23, -37, 3).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 319, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 2, 8, 0, 0, -1, 5, 0, -1.5f, 5, 0, -0.5f, -2, 0, 0, -2, 0, 2, 5, 0, 2, 5, 0, 0, -2, 0, 0, -2)
			.setRotationPoint(23, -37, -11).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 187, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 6, 0, 0, 0, 2, 0, -0.5f, 2, 0, -0.5f, 2, 0, 0, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2)
			.setRotationPoint(23, -37, -3).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 72, 285, textureX, textureY).addBox(0, 0, 0, 6, 35, 2)
			.setRotationPoint(-10, -54, 20).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 55, 285, textureX, textureY).addBox(0, 0, 0, 6, 35, 2)
			.setRotationPoint(-10, -54, -22).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 466, 226, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.95f, 0, 0, 0.95f, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, -54, 20).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 378, 324, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 19, 2, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0, -6, 0, 0, 6, 0, 3, 6, 0, -3, -6, 0, 0)
			.setRotationPoint(15, -54, 20).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 369, 324, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 19, 2, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 0, -6, 0, 0, 6, 0, -3, 6, 0, 3, -6, 0, 0)
			.setRotationPoint(15, -54, -22).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 154, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.9f, 0, 0, 0.9f, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, -54, -22).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 35, 284, textureX, textureY).addBox(0, 0, 0, 4, 16, 2)
			.setRotationPoint(17, -35, 20).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 129, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 14, 2, 0, 0, 0, 0, -2.425f, 0, 0, -2.425f, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(15, -49, 20).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 357, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0.475f, 0, 0, -1.05f, 0, 0, -1.05f, 0, 0, 0.475f, 0, 0, 0, 0, 0, -0.425f, 0, 0, -0.425f, 0, 0, 0, 0, 0)
			.setRotationPoint(15, -51, 20).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 0, 284, textureX, textureY).addBox(0, 0, 0, 4, 16, 2)
			.setRotationPoint(17, -35, -22).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 499, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 14, 2, 0, 0, 0, 0, -2.425f, 0, 0, -2.425f, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(15, -49, -22).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 499, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0.475f, 0, 0, -1.05f, 0, 0, -1.05f, 0, 0, 0.475f, 0, 0, 0, 0, 0, -0.425f, 0, 0, -0.425f, 0, 0, 0, 0, 0)
			.setRotationPoint(15, -51, -22).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 266, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 16, 2, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 0)
			.setRotationPoint(21, -14, -22).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 197, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 8, 1, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, -5, 0, 0.5f, 0, 0, 2, 0, 0, -2, -5, 0, 0)
			.setRotationPoint(59, -14, 14).setRotationAngle(0, 0, 0)
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 201, 341, textureX, textureY).addBox(0, 0, 0, 2, 20, 40)
			.setRotationPoint(-12, -19, -20).setRotationAngle(0, 0, 0)
		);
		chassis_primary.addProgram(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(chassis_primary);
		//
		TurboList chassis_secondary = new TurboList("chassis_secondary");
		chassis_secondary.add(new ModelRendererTurbo(chassis_secondary, 174, 88, textureX, textureY).addBox(0, 0, 0, 46, 2, 10)
			.setRotationPoint(-12, 0.5f, 16).setRotationAngle(0, 0, 0)
		);
		chassis_secondary.add(new ModelRendererTurbo(chassis_secondary, 325, 80, textureX, textureY).addBox(0, 0, 0, 46, 2, 10)
			.setRotationPoint(-12, 0.5f, -26).setRotationAngle(0, 0, 0)
		);
		chassis_secondary.add(new ModelRendererTurbo(chassis_secondary, 116, 54, textureX, textureY).addHollowCylinder(0, 0, 0, 14, 13, 9, 16, 7, 1, 1.1f, 0, null)
			.setRotationPoint(52, -2, -26).setRotationAngle(0, 0, 90)
		);
		chassis_secondary.add(new ModelRendererTurbo(chassis_secondary, 58, 54, textureX, textureY).addHollowCylinder(0, 0, 0, 14, 13, 9, 16, 7, 1, 1.1f, 1, null)
			.setRotationPoint(52, -2, 17).setRotationAngle(0, 0, -112.5f)
		);
		chassis_secondary.add(new ModelRendererTurbo(chassis_secondary, 344, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 10, 0, 0, 0, 0, -1.5f, 2.5f, 0, 0, 2.5f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -2, 0, 0, -2, 0, 0, 0, 0)
			.setRotationPoint(34, 0.5f, 16).setRotationAngle(0, 0, 0)
		);
		chassis_secondary.add(new ModelRendererTurbo(chassis_secondary, 265, 341, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 10, 0, 1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 1.5f, -0.5f, 0, -2, -1, 0, -0.5f, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(38, -2, 16).setRotationAngle(0, 0, 0)
		);
		chassis_secondary.add(new ModelRendererTurbo(chassis_secondary, 0, 54, textureX, textureY).addHollowCylinder(0, 0, 0, 14, 13, 4, 16, 7, 1.1f, 1.1f, 1, null)
			.setRotationPoint(52, -2, 13).setRotationAngle(0, 0, -112.5f)
		);
		chassis_secondary.add(new ModelRendererTurbo(chassis_secondary, 337, 324, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 9, 0, -0.25f, 1.875f, 0, 0, 0, 0, 0, 0, 0, 1.0626f, 1.3594f, 0, 0.8125f, -3.5f, 0, 0, 0, 0, 0, 0, 0, 2, -2.9844f, 0)
			.setRotationPoint(66, -6, 17).setRotationAngle(0, 0, 0)
		);
		chassis_secondary.add(new ModelRendererTurbo(chassis_secondary, 476, 293, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 10, 0, 0, 0, 0, 0, 2.5f, 0, -1.5f, 2.5f, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -1.5f, -2, 0, 0, 0, 0)
			.setRotationPoint(34, 0.5f, -26).setRotationAngle(0, 0, 0)
		);
		chassis_secondary.add(new ModelRendererTurbo(chassis_secondary, 47, 340, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 10, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, 1.5f, 0, 0, 0, -0.5f, 0, -0.5f, -1, 0, -2, -1, 0, 1.5f, -0.5f, 0)
			.setRotationPoint(38, -2, -26).setRotationAngle(0, 0, 0)
		);
		chassis_secondary.add(new ModelRendererTurbo(chassis_secondary, 68, 323, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 9, 0, 1.0626f, 1.3594f, 0, 0, 0, 0, 0, 0, 0, -0.25f, 1.875f, 0, 2, -2.9844f, 0, 0, 0, 0, 0, 0, 0, 0.8125f, -3.5f, 0)
			.setRotationPoint(66, -6, -26).setRotationAngle(0, 0, 0)
		);
		chassis_secondary.add(new ModelRendererTurbo(chassis_secondary, 453, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 14, 13, 4, 16, 7, 1.1f, 1.1f, 0, null)
			.setRotationPoint(52, -2, -17).setRotationAngle(0, 0, 90)
		);
		chassis_secondary.add(new ModelRendererTurbo(chassis_secondary, 261, 300, textureX, textureY).addBox(0, 0, 0, 3, 2, 14)
			.setRotationPoint(67, -6, 12).setRotationAngle(0, 0, 0)
		);
		chassis_secondary.add(new ModelRendererTurbo(chassis_secondary, 226, 300, textureX, textureY).addBox(0, 0, 0, 3, 2, 14)
			.setRotationPoint(67, -6, -26).setRotationAngle(0, 0, 0)
		);
		chassis_secondary.add(new ModelRendererTurbo(chassis_secondary, 117, 334, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-13, 0.5f, 16).setRotationAngle(0, 0, 0)
		);
		chassis_secondary.add(new ModelRendererTurbo(chassis_secondary, 172, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-13, 0.5f, -26).setRotationAngle(0, 0, 0)
		);
		chassis_secondary.add(new ModelRendererTurbo(chassis_secondary, 243, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.25f, 1.875f, 0, 0, 0, 0, 0, 0, 0, -0.25f, 1.875f, 0, 0.8125f, -3.5f, 0, 0, 0, 0, 0, 0, 0, 0.8125f, -3.5f, 0)
			.setRotationPoint(66, -6, -17).setRotationAngle(0, 0, 0)
		);
		chassis_secondary.add(new ModelRendererTurbo(chassis_secondary, 254, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.25f, 1.875f, 0, 0, 0, 0, 0, 0, 0, -0.25f, 1.875f, 0, 0.8125f, -3.5f, 0, 0, 0, 0, 0, 0, 0, 0.8125f, -3.5f, 0)
			.setRotationPoint(66, -6, 13).setRotationAngle(0, 0, 0)
		);
		chassis_secondary.addProgram(DefaultPrograms.RGB_SECONDARY);
		this.groups.add(chassis_secondary);
	}

}
