//FMT-Marker FVTM-1
package net.fexcraft.mod.addon.fvp.models.vehicle;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.model.VehicleModel;

/** This file was exported via the FVTM Exporter V1 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.8 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/vehicle/c10")
public class C10Model extends VehicleModel {

	public C10Model(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList chassis = new TurboList("chassis");
		chassis.add(new ModelRendererTurbo(chassis, 237, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 2)
			.setRotationPoint(22, 2, -15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 470, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 2, 0, -1, 0)
			.setRotationPoint(34, 2, -15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 248, 87, textureX, textureY).addBox(0, 0, 0, 4, 1, 3)
			.setRotationPoint(30, 2, -15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 287, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-42, 2, -15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 47, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-30, 2, -15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 88, textureX, textureY).addBox(0, 0, 0, 4, 1, 30)
			.setRotationPoint(-34, 2, -15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 366, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 3, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(22, 2, 12).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 168, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 3, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 2, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(34, 2, 12).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 233, 87, textureX, textureY).addBox(0, 0, 0, 4, 1, 3)
			.setRotationPoint(30, 2, 12).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 50, 107, textureX, textureY).addBox(-1, -1, 0, 2, 2, 3)
			.setRotationPoint(-32, 0, -18).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 133, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(-24, -6, 15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 466, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -2, 0, 0, -2, 0, 0, 1, 0, 0)
			.setRotationPoint(-43, -6, 15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 27, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 6, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0)
			.setRotationPoint(-43, -9, 15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 423, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 2, 0, 0, 2, 0, 0, 1, 0, 0)
			.setRotationPoint(-43, -6, 14).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 459, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 6, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0)
			.setRotationPoint(-28, -9, 15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 261, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 6, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40, -10, 14).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 376, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 3, 1, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-43, -9, 14).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 492, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(-24, -6, -21).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 168, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -2, 0, 0, -2, 0, 0, 1, 0, 0)
			.setRotationPoint(-43, -6, -21).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 121, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 6, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0)
			.setRotationPoint(-43, -9, -21).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 329, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 2, 0, 0, 2, 0, 0, 1, 0, 0)
			.setRotationPoint(-43, -6, -15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 94, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 6, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0)
			.setRotationPoint(-28, -9, -21).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 431, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 6, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40, -10, -20).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 376, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 3, 1, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-43, -9, -15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 431, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(21, -6, 15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 377, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 1, 0, 0, 1, 0, 0, -2, 0, 0)
			.setRotationPoint(40, -6, 15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 281, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 6, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -9, 15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 423, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 1, 0, 0, 1, 0, 0, 2, 0, 0)
			.setRotationPoint(21, -6, 14).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 6, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0)
			.setRotationPoint(36, -9, 15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 216, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 6, 0, -3, 0, -1, -3, 0, -1, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24, -10, 14).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 376, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 3, 1, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -9, 14).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 200, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(21, -6, -21).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 256, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 1, 0, 0, 1, 0, 0, -2, 0, 0)
			.setRotationPoint(40, -6, -21).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 334, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 6, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -9, -21).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 329, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 1, 0, 0, 1, 0, 0, 2, 0, 0)
			.setRotationPoint(21, -6, -15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 254, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 6, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0)
			.setRotationPoint(36, -9, -21).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 171, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 6, 0, -3, 0, 0, -3, 0, 0, -3, 0, -1, -3, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24, -10, -20).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 431, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 3, 1, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -9, -15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 419, 106, textureX, textureY).addBox(-1, -1, 0, 2, 2, 3)
			.setRotationPoint(-32, 0, 15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 233, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 44, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -0.5f, -0.5f, -1, -2, -0.5f, -1, -2, 0, 0, -0.5f)
			.setRotationPoint(46, 2, -22).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 146, 103, textureX, textureY).addBox(-1, -1, 0, 2, 2, 3)
			.setRotationPoint(32, 0, -18).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 213, 99, textureX, textureY).addBox(-1, -1, 0, 2, 2, 3)
			.setRotationPoint(32, 0, 15).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 413, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 44, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(42, 2, -22).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 44, 2, 44, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-22, 2, -22).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 180, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 44, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-46, 2, -22).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 370, 82, textureX, textureY).addBox(0, 0, 0, 5, 1, 38)
			.setRotationPoint(44, 1, -19).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 150, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 24, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(49, -0.875f, -12).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 291, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 24, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(49, -2.125f, -12).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 123, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 24, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(49, -1.5f, -12).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 24, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(48, -9.125f, -12).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 264, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 24, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(48.25f, -8.375f, -12).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 392, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 24, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(48.5f, -7.625f, -12).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 111, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 24, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(48.75f, -6.875f, -12).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 329, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 44, 0, 0.5f, 0, -2, 0, 0, 0, 0, 0, 0, 0.5f, 0, -2, 0, -1, -2.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -2.5f)
			.setRotationPoint(-49, 2, -22).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 174, 49, textureX, textureY).addBox(0, 0, 0, 13, 1, 36)
			.setRotationPoint(-34, -13.5f, -18).setRotationAngle(0, 0, -2)
		);
		chassis.add(new ModelRendererTurbo(chassis, 385, 175, textureX, textureY).addBox(0, 0, 0, 0, 14, 42)
			.setRotationPoint(18, -12, -21).setRotationAngle(0, 0, -4)
		);
		chassis.add(new ModelRendererTurbo(chassis, 68, 134, textureX, textureY).addBox(0, 0, 0, 3, 2, 36)
			.setRotationPoint(18, -14, -18).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 300, 174, textureX, textureY).addBox(0, 0, 0, 0, 12, 42)
			.setRotationPoint(-21.1f, -9, -21).setRotationAngle(0, 0, -11)
		);
		chassis.add(new ModelRendererTurbo(chassis, 62, 173, textureX, textureY).addBox(0, 0, 0, 0, 4, 40)
			.setRotationPoint(-21.1f, -13, -20).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 106, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, -9, 20.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 237, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, -12, 20).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 199, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, -14, 19).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 428, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 1, 0, 0, 0, 3, 0, 0, 3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, -24, 18).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 429, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 6, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, -4, 20).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 43, 55, textureX, textureY).addBox(0, 0, 0, 3, 2, 1)
			.setRotationPoint(-3, -6, 20.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 503, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 6, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, -4, -21).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 55, textureX, textureY).addBox(0, 0, 0, 3, 2, 1)
			.setRotationPoint(-3, -6, -21.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 144, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, -9, -21.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 102, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, -12, -21).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 466, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, -14, -20).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 419, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 1, 0, 0, 0, -3, 0, 0, -3, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, -24, -19).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 232, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 1, 32, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22, -24.5f, -16).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 471, 122, textureX, textureY)
			.addShapeBox(-0.5f, -1, 0, 1, 2, 4, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(19.5f, -14.5f, 21).setRotationAngle(0, -13.5f, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 439, 122, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 4, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0)
			.setRotationPoint(19.5f, -14.5f, 21).setRotationAngle(0, -13.5f, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 428, 122, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(20, -13, 20).setRotationAngle(22.5f, -3, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 417, 122, textureX, textureY)
			.addShapeBox(-0.5f, -1, -4, 1, 2, 4, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(19.5f, -14.5f, -21).setRotationAngle(0, 13.5f, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 406, 122, textureX, textureY)
			.addShapeBox(0, -1, -4, 1, 2, 4, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0)
			.setRotationPoint(19.5f, -14.5f, -21).setRotationAngle(0, 13.5f, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 86, 119, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(20, -13, -19).setRotationAngle(22.5f, -177, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 321, 71, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(8.5f, -23.5f, 0).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 178, 122, textureX, textureY)
			.addShapeBox(-0.5f, 0, -2, 1, 2, 4, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(9, -22.75f, 0).setRotationAngle(0, 26, -10)
		);
		chassis.add(new ModelRendererTurbo(chassis, 355, 120, textureX, textureY)
			.addShapeBox(0, 0, -2, 1, 2, 4, 0, 0, 0, 0, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, 0, -0.5f, 0)
			.setRotationPoint(9, -22.75f, 0).setRotationAngle(0, 26, -10)
		);
		this.groups.add(chassis);
		//
		TurboList primary = new TurboList("primary");
		primary.add(new ModelRendererTurbo(primary, 65, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 1, 0, 1.5f, 0, 0, 0, 0, 0.5f, 0, 0, 0, 1.5f, 0, 0.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(42, -4, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 497, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(18, -6, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 274, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0, 1, 0, 0.5f, 0.5f, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0.5f)
			.setRotationPoint(41, -6, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 23, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 3, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(18, -9, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 3, 1, 0, 0, 0, 0.5f, 0, 0, 1, 0, 0, -0.5f, 0, 0, 0, -4, 0, 0, 0, 0, 0.5f, 0, 0, 0, -4, 0, 0.5f)
			.setRotationPoint(36, -9, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 478, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 3, 1, 0, 0, 0, 0, 0, -1, 1, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 1)
			.setRotationPoint(36, -12, 20).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 371, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 3, 0, 0, 0, 0, 0, -1, 1, 0, -1, -3, 0, 0, -2, 0, 0, 0, 0, 1, 1, 0, 1, -0.5f, 0, 0, 0)
			.setRotationPoint(36, -13, 18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 429, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 1, 0, 0, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -4, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 133, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(18, -12, 20).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 183, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26, -13, 18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 374, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 3, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, -2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -14, 18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 148, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -14, 18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 223, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 38, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(49, 0, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 23, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 38, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(49, -4, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 495, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 7, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(49, -2, 12).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 101, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 7, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(49, -2, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 424, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 38, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(49, -6, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 419, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(49, -9, -15).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 33, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 10, 0, 1.5f, 0, 0, -1.5f, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(48, -11, -15).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 10, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(48, -11, -5).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 286, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 10, 0, 1, 0, 0, -1, 0, 0, -1.5f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(48, -11, 5).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 446, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(49, -9, 11).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 300, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 3, 0, 0, 0, -1.5f, 0.5f, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -1.5f, 0.5f, 0, 0, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(46, -2, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 285, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 3, 0, 0, 0, -1.5f, 0.25f, 0, 0, -0.5f, 0, -2, 0, 0, 0, 0, 0, -1.5f, 0.5f, 0, 0, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(46, -4, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 270, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 3, 0, 0, 0, -1.5f, 0, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1.5f, 0.25f, 0, 0, -0.5f, 0, -2, 0, 0, 0)
			.setRotationPoint(46, -6, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 57, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 1.5f, 0, 0, -1.5f, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(48, -11, 15).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 199, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, -1, 0, 0, -1.5f, 0, -0.75f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, 0, 0, 0.5f)
			.setRotationPoint(46, -11, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 15, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 3, 0, 0, 0, 0, 0, 0, -2, 0.5f, 0, 0, 0, 0, -1.5f, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -1.5f)
			.setRotationPoint(46, 0, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 3, 0, 0, 0, 0, 0, 0, -2, 0.5f, 0, 0, 0, 0, -1.5f, 0, 0, 0, 0, 0, -2, 0.5f, 0, 0, 0, 0, -1.5f)
			.setRotationPoint(46, -2, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 437, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 3, 0, 0, 0, 0, -0.5f, 0, -2, 0.25f, 0, 0, 0, 0, -1.5f, 0, 0, 0, 0, 0, -2, 0.5f, 0, 0, 0, 0, -1.5f)
			.setRotationPoint(46, -4, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 159, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 3, 0, 0, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, -1.5f, 0, 0, 0, -0.5f, 0, -2, 0.25f, 0, 0, 0, 0, -1.5f)
			.setRotationPoint(46, -6, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 348, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 2, 0, 0, -2, 0, 0, -1.5f, 0, 0, 1.5f, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(48, -11, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 115, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, -0.5f, -1.5f, 0, -0.75f, -1, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(46, -11, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 237, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 1, 0, 1.5f, 0, 0.5f, 0, 0, 0, 0, 0, 0.5f, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0)
			.setRotationPoint(42, -4, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 345, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -6, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 497, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0.5f, 1, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0)
			.setRotationPoint(41, -6, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 315, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -4, 0, 0.5f, -4, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -9, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 374, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 3, 1, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 1, 0, 0, 0.5f, -4, 0, 0.5f, 0, 0, 0, 0, 0, 0.5f, -4, 0, 0)
			.setRotationPoint(36, -9, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 337, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 3, 1, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36, -12, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 274, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 3, 0, 0, 0, -2, 0, -1, -3, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 1, -0.5f, 0, 1, 1, 0, 0, 0)
			.setRotationPoint(36, -13, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 1, 0, 0, 0, 0.5f, 1.5f, 0, 0.5f, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -4, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 307, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -12, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 480, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 3, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26, -13, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 67, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 3, 0, 0, 0, -1, 0, -1, -2, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -14, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 389, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -14, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 286, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 4, 0, 0, -0.5f, -2, 0, -1.5f, -3, 0, -1.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 1, -1, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(36, -14, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 345, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -2, 0, -0.5f, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26, -14, 15).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 174, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 4, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, -1.5f, -3, 0, -0.5f, -2, 0, 0, 0, 0, 1, 0, 0, 1, -1, 0, 0, 0)
			.setRotationPoint(36, -14, 15).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 174, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0.5f, 0, -1, 0.5f, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(46, -12, 15).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 359, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -1, 0.5f, 0, -1, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.375f, 0, 0, 0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(46, -12, 16).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 300, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0, 0, -1, -0.375f, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(46, -12, 18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 470, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0.5f, 0, -1, 0.5f, 0, 0, 0, 0, -0.375f, 0, 0, 0.375f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(46, -12, -16).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 144, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -1, 0, 0, -1, 0.5f, 0, 0, 0, 0, -0.125f, 0, 0, 0.125f, 0, 0, 0.375f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(46, -12, -18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 255, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.375f, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(46, -12, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 482, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, -0.375f, 0, 0, -1, 0, -0.5f, -1, 0.25f, 0, -1, 0.5f, 0, 0.375f, 0, 0, 1, 0, -0.5f, 1, 0.25f, 0, 1, 0.5f)
			.setRotationPoint(46, -12, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 478, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 1, 0, 0, -1, 0.5f, -0.5f, -1, 0.25f, 0, -1, 0, 0, -0.375f, 0, 0, 1, 0.5f, -0.5f, 1, 0.25f, 0, 1, 0, 0, 0.375f, 0)
			.setRotationPoint(46, -12, -20).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 250, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0.5f, 0, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f)
			.setRotationPoint(-24, -6, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 380, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 3, 1, 0, 0, 0, 0.5f, -1, 0, 0.5f, -1, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0.5f, -4, 0, 0.5f)
			.setRotationPoint(-28, -9, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 361, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 1, 0, 1.5f, 0, 0, -1, 0, 0, -1, 0, 0.5f, 1.5f, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22, -4, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 380, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(-44, -12, 20).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 210, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-44, -6, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-44, -9, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 39, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 1, 0, 0, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-44, -4, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 352, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 1, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46, -4, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 429, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0)
			.setRotationPoint(-46, -6, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 137, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 1, 0, 0, 0.5f, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0)
			.setRotationPoint(-46, -9, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 275, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0.5f)
			.setRotationPoint(-46, -12, 20).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 429, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 1, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.5f)
			.setRotationPoint(-46, -9, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 37, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0.5f, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46, -12, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 346, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, 0.5f, -1, 0, 0.5f, -1, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-24, -6, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 359, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0.5f, 0, 0, 0.5f, -4, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -4, 0, 0)
			.setRotationPoint(-28, -9, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 497, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 1, 0, 1.5f, 0, 0.5f, -1, 0, 0.5f, -1, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22, -4, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 329, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-44, -12, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 255, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-44, -6, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 382, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -4, 0, 0.5f, -4, 0, 0, 0, 0, 0)
			.setRotationPoint(-44, -9, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 334, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 1, 0, 0, 0, 0.5f, 1.5f, 0, 0.5f, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-44, -4, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 419, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 1, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f)
			.setRotationPoint(-46, -4, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 505, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0.5f)
			.setRotationPoint(-46, -6, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 483, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-44, -13, 18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 76, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 5, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -2, 0, -0.5f, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46, -14, 14).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 233, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 8, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49, -6, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 466, 49, textureX, textureY).addBox(0, 0, 0, 3, 3, 1)
			.setRotationPoint(-49, -9, 14).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 477, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 7, 0, -1, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, -1.5f)
			.setRotationPoint(-49, -12, 14).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 337, 48, textureX, textureY).addBox(0, 0, 0, 3, 3, 1)
			.setRotationPoint(-49, -9, -15).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 256, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 7, 0, -1, 0, -2, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, 0, 0, -1.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49, -12, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 460, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 3, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-44, -13, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 232, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 5, 0, 0, -0.5f, -2, 0, -0.5f, -2, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46, -14, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 108, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, 0)
			.setRotationPoint(-48, -13, 14).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 91, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0.5f)
			.setRotationPoint(-46, -13, 14).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 326, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, -2, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-47, -14, 14).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 13, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, -13, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 39, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46, -13, -20).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 301, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -1, -1, 0, -0.5f, -2, 0, -0.5f, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -14, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 127, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 44, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0.5f, 0, -2, 0, 0, 0, 0, 0, 0, 0.5f, 0, -2)
			.setRotationPoint(-49, -1, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(-49, -6, 14).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 133, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 1, 34, 0, -2, 0, -1, -2, 0, -1, -2, 0, -1, -2, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22, -25, -17).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 62, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 2, 0, 11, 0, -3, -11, 0, -3, -11, 0, 3, 11, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -24, -20).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 237, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1)
			.setRotationPoint(21, -14, 15).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 180, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, 0, -1, 0, -0.5f, -2, 0, -0.5f, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -14, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 476, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 10, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -14, -15).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 138, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 10, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -14, 5).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 44, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 10, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -14, -5).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 466, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 2, 0, -12, 0, 3, 12, 0, 3, 12, 0, -3, -12, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, -24, 18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 445, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 2, 0, -12, 0, -3, 12, 0, -3, 12, 0, 3, -12, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, -24, -20).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 177, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, -14, 18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 347, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -1, 0, -0.5f, -2, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0)
			.setRotationPoint(-36, -14, 15).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 21, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 3, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, -1, 0, -1, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -14, 18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 334, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, -0.5f, -2, 0, 0, -1, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -14, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 311, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 10, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -14, -15).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 286, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 10, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -14, 5).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 76, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 10, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -14, -5).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 355, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 3, 0, 0, -1, -2, 0, 0, -1, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -14, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 144, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 2, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, -14, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 396, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 10, 1, 0, 0, 0, 3, 0, 0, 3, 0, 0, -3, 0, 0, -3, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(-21, -24, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 23, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 10, 1, 0, 0, 0, -3, 0, 0, -3, 0, 0, 3, 0, 0, 3, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(-21, -24, -20).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 334, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -9, 21.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 94, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -12, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 507, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -14, 20).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 371, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 3, 0, 0, 3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -24, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 372, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 2, 0, 11, 0, 3, -11, 0, 3, -11, 0, -3, 11, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -24, 18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -4, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 232, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 4, 0, 0, -0.5f, -2, 0, -0.5f, -2, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26, -14, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 302, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 3, 0, 0, 0, -1.5f, 0.5f, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -1.5f, 0, 0, 0, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(46, 0, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 436, 57, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-2, -6, 21.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 76, 55, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-2, -6, -22.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 397, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -9, -22.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 301, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -12, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 261, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -14, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 403, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, -3, 0, 0, -3, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -24, -20).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 40, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, -4, -22).setRotationAngle(0, 0, 0)
		);
		this.groups.add(primary);
		primary.addProgram(DefaultPrograms.RGB_PRIMARY);
	}

}
