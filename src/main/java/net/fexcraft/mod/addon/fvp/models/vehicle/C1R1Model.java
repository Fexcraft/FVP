//FMT-Marker FVTM-1.1
package net.fexcraft.mod.addon.fvp.models.vehicle;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.ModelGroup;
import net.fexcraft.mod.fvtm.model.VehicleModel;

/** This file was exported via the FVTM Exporter V1.2 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.9 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/vehicle/c1_r1")
public class C1R1Model extends VehicleModel {

	public C1R1Model(){
		super(); textureX = 512; textureY = 512;
		addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup chassis = new ModelGroup("chassis");
		chassis.add(new ModelRendererTurbo(chassis, 1, 1, textureX, textureY).addBox(-32, 1, -21, 64, 1, 42).setName("Box 0"));
		chassis.add(new ModelRendererTurbo(chassis, 177, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(32, 1, -9).setRotationAngle(0, 0, -0).setName("Box 1")
		);
		chassis.add(new ModelRendererTurbo(chassis, 209, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 28, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-42, 1, -14).setRotationAngle(0, 0, -0).setName("Box 2")
		);
		chassis.add(new ModelRendererTurbo(chassis, 257, 1, textureX, textureY).addBox(0, 0, 0, 3, 3, 34)
			.setRotationPoint(42, -1, -17).setRotationAngle(0, 0, -0).setName("Box 3")
		);
		chassis.add(new ModelRendererTurbo(chassis, 337, 1, textureX, textureY).addBox(0, 0, 0, 3, 3, 34)
			.setRotationPoint(-45, -1, -17).setRotationAngle(0, 0, -0).setName("Box 4")
		);
		chassis.add(new ModelRendererTurbo(chassis, 305, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(45, 1, -9).setRotationAngle(0, 0, -0).setName("Box 9")
		);
		chassis.add(new ModelRendererTurbo(chassis, 385, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 28, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-55, 1, -14).setRotationAngle(0, 0, -0).setName("Box 10")
		);
		chassis.add(new ModelRendererTurbo(chassis, 377, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 58, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-29, 0.5f, 21).setRotationAngle(0, 0, -0).setName("Box 432")
		);
		chassis.add(new ModelRendererTurbo(chassis, 1, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 58, 3, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29, 0.5f, -22).setRotationAngle(0, 0, -0).setName("Box 433")
		);
		chassis.add(new ModelRendererTurbo(chassis, 121, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 64, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-32, 3, 18).setRotationAngle(0, 0, -0).setName("Box 434")
		);
		chassis.add(new ModelRendererTurbo(chassis, 257, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 64, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-32, 3, -21).setRotationAngle(0, 0, -0).setName("Box 435")
		);
		chassis.add(new ModelRendererTurbo(chassis, 353, 105, textureX, textureY).addBox(0, 0, -21, 3, 3, 42)
			.setRotationPoint(55, 0, 0).setRotationAngle(0, 0, -0).setName("Box 436")
		);
		chassis.add(new ModelRendererTurbo(chassis, 1, 113, textureX, textureY).addBox(0, 0, -21, 3, 3, 42)
			.setRotationPoint(-58, 0, 0).setRotationAngle(0, 0, -0).setName("Box 437")
		);
		chassis.add(new ModelRendererTurbo(chassis, 105, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(55, 0.5f, 21).setRotationAngle(0, 0, -0).setName("Box 438")
		);
		chassis.add(new ModelRendererTurbo(chassis, 121, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 3, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(32, 1, -12).setRotationAngle(0, 0, -0).setName("Box 440")
		);
		chassis.add(new ModelRendererTurbo(chassis, 153, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 3, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(45, 1, -12).setRotationAngle(0, 0, -0).setName("Box 441")
		);
		chassis.add(new ModelRendererTurbo(chassis, 185, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2)
			.setRotationPoint(45, 1, 9).setRotationAngle(0, 0, -0).setName("Box 442")
		);
		chassis.add(new ModelRendererTurbo(chassis, 233, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, -2, 0, 0, 0)
			.setRotationPoint(32, 1, 9).setRotationAngle(0, 0, -0).setName("Box 443")
		);
		chassis.add(new ModelRendererTurbo(chassis, 193, 113, textureX, textureY)
			.addShapeBox(0, 0, -21, 2, 4, 42, 0, 0, 0, 0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -1, -1, 0, -1, -1, 0, -0.5f, 0.5f)
			.setRotationPoint(58, 0, 0).setRotationAngle(0, 0, -0).setName("Box 450")
		);
		chassis.add(new ModelRendererTurbo(chassis, 265, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55, 0.5f, -22).setRotationAngle(0, 0, -0).setName("Box 451")
		);
		chassis.add(new ModelRendererTurbo(chassis, 297, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(55, 3, 15).setRotationAngle(0, 0, -0).setName("Box 452")
		);
		chassis.add(new ModelRendererTurbo(chassis, 321, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1.5f, -0.5f, 0)
			.setRotationPoint(55, 3, -20).setRotationAngle(0, 0, -0).setName("Box 453")
		);
		chassis.add(new ModelRendererTurbo(chassis, 329, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(55, 3, -21).setRotationAngle(0, 0, -0).setName("Box 454")
		);
		chassis.add(new ModelRendererTurbo(chassis, 345, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(55, 3, 20).setRotationAngle(0, 0, -0).setName("Box 455")
		);
		chassis.add(new ModelRendererTurbo(chassis, 57, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1.5f, -0.5f, 0)
			.setRotationPoint(55, 3, -15).setRotationAngle(0, 0, -0).setName("Box 456")
		);
		chassis.add(new ModelRendererTurbo(chassis, 417, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.5f, 0)
			.setRotationPoint(57.65f, -2.7f, -9).setRotationAngle(0, 0, -0).setName("Box 462")
		);
		chassis.add(new ModelRendererTurbo(chassis, 241, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.5f, 0)
			.setRotationPoint(57.6f, -3, -9).setRotationAngle(0, 0, -0).setName("Box 463")
		);
		chassis.add(new ModelRendererTurbo(chassis, 281, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.5f, 0)
			.setRotationPoint(57.55f, -3.3f, -9).setRotationAngle(0, 0, -0).setName("Box 464")
		);
		chassis.add(new ModelRendererTurbo(chassis, 321, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.5f, 0)
			.setRotationPoint(57.5f, -3.6f, -9).setRotationAngle(0, 0, -0).setName("Box 465")
		);
		chassis.add(new ModelRendererTurbo(chassis, 449, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.5f, 0)
			.setRotationPoint(57.45f, -3.9f, -9).setRotationAngle(0, 0, -0).setName("Box 466")
		);
		chassis.add(new ModelRendererTurbo(chassis, 345, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.5f, 0)
			.setRotationPoint(57.4f, -4.2f, -9).setRotationAngle(0, 0, -0).setName("Box 467")
		);
		chassis.add(new ModelRendererTurbo(chassis, 473, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.5f, 0)
			.setRotationPoint(57.35f, -4.5f, -9).setRotationAngle(0, 0, -0).setName("Box 468")
		);
		chassis.add(new ModelRendererTurbo(chassis, 1, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.5f, 0)
			.setRotationPoint(57.3f, -4.8f, -9).setRotationAngle(0, 0, -0).setName("Box 469")
		);
		chassis.add(new ModelRendererTurbo(chassis, 169, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.5f, 0)
			.setRotationPoint(57.25f, -5.1f, -9).setRotationAngle(0, 0, -0).setName("Box 470")
		);
		chassis.add(new ModelRendererTurbo(chassis, 289, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.5f, 0)
			.setRotationPoint(57.2f, -5.4f, -9).setRotationAngle(0, 0, -0).setName("Box 471")
		);
		chassis.add(new ModelRendererTurbo(chassis, 433, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.5f, 0)
			.setRotationPoint(57.15f, -5.7f, -9).setRotationAngle(0, 0, -0).setName("Box 472")
		);
		chassis.add(new ModelRendererTurbo(chassis, 265, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.5f, 0)
			.setRotationPoint(57.1f, -6, -9).setRotationAngle(0, 0, -0).setName("Box 473")
		);
		chassis.add(new ModelRendererTurbo(chassis, 313, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.5f, 0)
			.setRotationPoint(57.05f, -6.3f, -9).setRotationAngle(0, 0, -0).setName("Box 474")
		);
		chassis.add(new ModelRendererTurbo(chassis, 457, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.5f, 0)
			.setRotationPoint(57, -6.6f, -9).setRotationAngle(0, 0, -0).setName("Box 475")
		);
		chassis.add(new ModelRendererTurbo(chassis, 337, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.5f, 0)
			.setRotationPoint(56.95f, -6.9f, -9).setRotationAngle(0, 0, -0).setName("Box 476")
		);
		chassis.add(new ModelRendererTurbo(chassis, 377, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.5f, 0)
			.setRotationPoint(56.9f, -7.2f, -9).setRotationAngle(0, 0, -0).setName("Box 477")
		);
		chassis.add(new ModelRendererTurbo(chassis, 1, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.5f, 0)
			.setRotationPoint(56.85f, -7.5f, -9).setRotationAngle(0, 0, -0).setName("Box 478")
		);
		chassis.add(new ModelRendererTurbo(chassis, 41, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.5f, 0)
			.setRotationPoint(56.8f, -7.8f, -9).setRotationAngle(0, 0, -0).setName("Box 479")
		);
		chassis.add(new ModelRendererTurbo(chassis, 177, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.5f, 0)
			.setRotationPoint(56.75f, -8.1f, -9).setRotationAngle(0, 0, -0).setName("Box 480")
		);
		chassis.add(new ModelRendererTurbo(chassis, 41, 177, textureX, textureY)
			.addShapeBox(0, 0, -21, 2, 4, 42, 0, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, -1, -1, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -1, -1)
			.setRotationPoint(-60, 0, 0).setRotationAngle(0, 0, -0).setName("Box 503")
		);
		chassis.add(new ModelRendererTurbo(chassis, 313, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-58, 0.5f, 21).setRotationAngle(0, 0, -0).setName("Box 504")
		);
		chassis.add(new ModelRendererTurbo(chassis, 337, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-58, 0.5f, -22).setRotationAngle(0, 0, -0).setName("Box 505")
		);
		chassis.add(new ModelRendererTurbo(chassis, 193, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-58, 3, -15).setRotationAngle(0, 0, -0).setName("Box 506")
		);
		chassis.add(new ModelRendererTurbo(chassis, 345, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-58, 3, -20).setRotationAngle(0, 0, -0).setName("Box 507")
		);
		chassis.add(new ModelRendererTurbo(chassis, 121, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-58, 3, 15).setRotationAngle(0, 0, -0).setName("Box 508")
		);
		chassis.add(new ModelRendererTurbo(chassis, 361, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-58, 3, 20).setRotationAngle(0, 0, -0).setName("Box 509")
		);
		chassis.add(new ModelRendererTurbo(chassis, 249, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-58, 3, -21).setRotationAngle(0, 0, -0).setName("Box 510")
		);
		chassis.add(new ModelRendererTurbo(chassis, 33, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -1, -0.5f)
			.setRotationPoint(-32, 0.5f, 21).setRotationAngle(0, 0, -0).setName("Box 511")
		);
		chassis.add(new ModelRendererTurbo(chassis, 97, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(29, 0.5f, 21).setRotationAngle(0, 0, -0).setName("Box 512")
		);
		chassis.add(new ModelRendererTurbo(chassis, 153, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, 0.5f, -22).setRotationAngle(0, 0, -0).setName("Box 513")
		);
		chassis.add(new ModelRendererTurbo(chassis, 193, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(29, 0.5f, -22).setRotationAngle(0, 0, -0).setName("Box 514")
		);
		chassis.add(new ModelRendererTurbo(chassis, 369, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 28, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55, -1, -14).setRotationAngle(0, 0, -0).setName("Box 524")
		);
		chassis.add(new ModelRendererTurbo(chassis, 425, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 28, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -1, -14).setRotationAngle(0, 0, -0).setName("Box 525")
		);
		chassis.add(new ModelRendererTurbo(chassis, 97, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 2, 1, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(-3.5f, -28.5f, -10.5f).setRotationAngle(0, 0, -0).setName("Box 554")
		);
		chassis.add(new ModelRendererTurbo(chassis, 153, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 2, 1, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(-3.5f, -28.5f, 9.5f).setRotationAngle(0, 0, -0).setName("Box 555")
		);
		chassis.add(new ModelRendererTurbo(chassis, 193, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 19, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(-3.5f, -28.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 556")
		);
		chassis.add(new ModelRendererTurbo(chassis, 281, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 19, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(8.5f, -28.5f, -9.5f).setRotationAngle(0, 0, -0).setName("Box 557")
		);
		chassis.add(new ModelRendererTurbo(chassis, 129, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(-3.5f, -27, 17).setRotationAngle(0, 0, -0).setName("Box 559")
		);
		chassis.add(new ModelRendererTurbo(chassis, 497, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(-3.5f, -20, 18).setRotationAngle(0, 0, -0).setName("Box 560")
		);
		chassis.add(new ModelRendererTurbo(chassis, 1, 129, textureX, textureY).addBox(0, 0, 0, 3, 11, 1)
			.setRotationPoint(-3.5f, -10, 19).setRotationAngle(0, 0, -0).setName("Box 561")
		);
		chassis.add(new ModelRendererTurbo(chassis, 225, 129, textureX, textureY).addBox(0, 0, 0, 3, 11, 1)
			.setRotationPoint(-3.5f, -10, -20).setRotationAngle(0, 0, -0).setName("Box 562")
		);
		chassis.add(new ModelRendererTurbo(chassis, 385, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-3.5f, -20, -19).setRotationAngle(0, 0, -0).setName("Box 563")
		);
		chassis.add(new ModelRendererTurbo(chassis, 457, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-3.5f, -27, -18).setRotationAngle(0, 0, -0).setName("Box 564")
		);
		chassis.add(new ModelRendererTurbo(chassis, 1, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 10, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(60, 0.5f, -5).setRotationAngle(0, 0, 2).setName("Box 661")
		);
		chassis.add(new ModelRendererTurbo(chassis, 265, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0)
			.setRotationPoint(30.5f, -2, 20.1f).setRotationAngle(0, 0, -0).setName("Box 666")
		);
		chassis.add(new ModelRendererTurbo(chassis, 305, 1, textureX, textureY)
			.addShapeBox(0, 0.8f, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0)
			.setRotationPoint(30.5f, -2, 20.1f).setRotationAngle(0, 0, -0).setName("Box 667")
		);
		chassis.add(new ModelRendererTurbo(chassis, 345, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(31.5f, -2, 20.1f).setRotationAngle(0, 0, -0).setName("Box 668")
		);
		chassis.add(new ModelRendererTurbo(chassis, 385, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(30.5f, -2, 20.1f).setRotationAngle(0, 0, -10).setName("Box 669")
		);
		chassis.add(new ModelRendererTurbo(chassis, 441, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(30.1f, -2, 20.1f).setRotationAngle(0, 0, -0).setName("Box 670")
		);
		chassis.add(new ModelRendererTurbo(chassis, 465, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0)
			.setRotationPoint(29.1f, -2, 20.1f).setRotationAngle(0, 0, -0).setName("Box 671")
		);
		chassis.add(new ModelRendererTurbo(chassis, 1, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, -0.8f, 0)
			.setRotationPoint(29.1f, -1.6f, 20.1f).setRotationAngle(0, 0, -0).setName("Box 672")
		);
		chassis.add(new ModelRendererTurbo(chassis, 177, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0)
			.setRotationPoint(29, -2, 20.1f).setRotationAngle(0, 0, -10).setName("Box 674")
		);
		chassis.add(new ModelRendererTurbo(chassis, 217, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, 0.5f, -0.8f, 0, -0.3f, -0.8f, 0, -0.5f, -0.8f, 0)
			.setRotationPoint(29.1f, -1.8f, 20.1f).setRotationAngle(0, 0, -0).setName("Box 675")
		);
		chassis.add(new ModelRendererTurbo(chassis, 265, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.4f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, -0.4f, 0)
			.setRotationPoint(29.1f, -1.6f, 20.1f).setRotationAngle(0, 0, -0).setName("Box 676")
		);
		chassis.add(new ModelRendererTurbo(chassis, 105, 321, textureX, textureY).addBox(-32, 1, -21, 64, 1, 42)
			.setRotationPoint(0, 1, 0).setRotationAngle(0, 0, -0).setName("Box 742")
		);
		chassis.add(new ModelRendererTurbo(chassis, 41, 353, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 13, 40, 0, 0, -0.1f, 0, -1, -0.5f, -2, -1, -0.5f, -2, 0, -0.1f, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(-29, -13, -20).setRotationAngle(0, 0, -0).setName("Box 703")
		);
		chassis.add(new ModelRendererTurbo(chassis, 1, 1, textureX, textureY).addBox(-32, 1, -21, 64, 1, 40)
			.setRotationPoint(0, -1, 1).setRotationAngle(0, 0, -0).setName("Box 704")
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 0, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 2).setName("Box 705"));
		this.groups.add(chassis);
		//
		ModelGroup chassis_primary = new ModelGroup("chassis_primary");
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 97, 113, textureX, textureY).addBox(0, 0, 0, 3, 11, 42)
			.setRotationPoint(25, -10, -21).setRotationAngle(0, 0, -0).setName("Box 439")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 409, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 9, 2, 0, 0, 0, -2, 0, 0, 1, 0, 0, -1, 0, 0, 2, 0, 0, -4, 0, 0, -2, 0, 0, 2, 0, 0, 4)
			.setRotationPoint(45, -8, -14).setRotationAngle(0, 0, -0).setName("Box 444")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 441, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 9, 2, 0, 0, 0, 1, 0, 0, -2, 0, 0, 2, 0, 0, -1, 0, 0, -2, 0, 0, -4, 0, 0, 4, 0, 0, 2)
			.setRotationPoint(32, -8, -14).setRotationAngle(0, 0, -0).setName("Box 445")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 473, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 9, 2, 0, 0, 0, -1, 0, 0, 2, 0, 0, -2, 0, 0, 1, 0, 0, 2, 0, 0, 4, 0, 0, -4, 0, 0, -2)
			.setRotationPoint(32, -8, 12).setRotationAngle(0, 0, -0).setName("Box 446")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 1, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 9, 2, 0, 0, 0, 2, 0, 0, -1, 0, 0, 1, 0, 0, -2, 0, 0, 4, 0, 0, 2, 0, 0, -2, 0, 0, -4)
			.setRotationPoint(45, -8, 12).setRotationAngle(0, 0, -0).setName("Box 447")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 57, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 9, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2)
			.setRotationPoint(42, -8, -12).setRotationAngle(0, 0, -0).setName("Box 448")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 73, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 9, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(42, -8, 10).setRotationAngle(0, 0, -0).setName("Box 449")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 97, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 12, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(55, -8, 9).setRotationAngle(0, 0, -0).setName("Box 457")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 153, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 8, 12, 0, 1, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0)
			.setRotationPoint(55, -8, -21).setRotationAngle(0, 0, -0).setName("Box 458")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 177, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, 0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(58, -2, -9).setRotationAngle(0, 0, -0).setName("Box 459")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 505, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 2, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(58.2f, -8, -1).setRotationAngle(0, 0, -0).setName("Box 460")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 201, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 8, 0, 0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(58, -2, 1).setRotationAngle(0, 0, -0).setName("Box 461")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 401, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 3, 12, 0, 0, 1, 0, 0, -1, 0, -1, -1, -1, 1, 1, -1, 0, -2, 0, 1, 0, 0, 0, 0, 0, 1, -2, 0)
			.setRotationPoint(45, -11, 9).setRotationAngle(0, 0, -0).setName("Box 482")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 265, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 12, 0, 0, 0, 0, 0, -1, 0, -1, -1, -1, 1, 0, -1, -1, 0, 0, 1, 0, 0, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(54, -10, 9).setRotationAngle(0, 0, -0).setName("Box 484")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 201, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 2, 12, 0, 0, 0, 0, 1, -1, 0, 0, -1, -1, 0, 0, -1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0)
			.setRotationPoint(28, -13, 9).setRotationAngle(0, 0, -0).setName("Box 485")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 305, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 12, 0, 1, 0, -1, -1, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(54, -10, -21).setRotationAngle(0, 0, -0).setName("Box 486")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 65, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 3, 12, 0, 1, 1, -1, -1, -1, -1, 0, -1, 0, 0, 1, 0, 1, -2, 0, 0, 0, 0, 1, 0, 0, 0, -2, 0)
			.setRotationPoint(45, -11, -21).setRotationAngle(0, 0, -0).setName("Box 487")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 97, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 2, 12, 0, 0, 0, -1, 0, -1, -1, 1, -1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0)
			.setRotationPoint(28, -13, -21).setRotationAngle(0, 0, -0).setName("Box 488")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 137, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 18, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54, -10, -9).setRotationAngle(0, 0, -0).setName("Box 489")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 241, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 18, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0)
			.setRotationPoint(45, -12, -9).setRotationAngle(0, 0, -0).setName("Box 490")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 401, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 2, 18, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0)
			.setRotationPoint(28, -13, -9).setRotationAngle(0, 0, -0).setName("Box 491")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 57, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 8, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0, -3.5f, -0.5f, 1, 0, -0.5f, 0, -0.5f, -0.5f, 0, -3.5f, -0.5f, 0)
			.setRotationPoint(49, -9, 13).setRotationAngle(0, 0, -0).setName("Box 494")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 369, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 8, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -2.5f, -0.5f, 1, -0.5f, -0.5f, 1, -0.5f, -0.5f, 0, -2.5f, -0.5f, 0)
			.setRotationPoint(52.5f, -4.5f, 13).setRotationAngle(0, 0, -0).setName("Box 495")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 193, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 8, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0, -3.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, -3.5f, -0.5f, 1)
			.setRotationPoint(49, -9, -21).setRotationAngle(0, 0, -0).setName("Box 496")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 409, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 8, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -2.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 1, -2.5f, -0.5f, 1)
			.setRotationPoint(52.5f, -4.5f, -21).setRotationAngle(0, 0, -0).setName("Box 497")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 257, 169, textureX, textureY).addBox(0, 0, 0, 4, 11, 42)
			.setRotationPoint(28, -10, -21).setRotationAngle(0, 0, -0).setName("Box 498")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 241, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 5, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -6, 0, 0, -6, 0, 0, 0, 0, 0)
			.setRotationPoint(32, -10, 13).setRotationAngle(0, 0, -0).setName("Box 499")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 481, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -2, 0, 1, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(32, -5, 13).setRotationAngle(0, 0, -0).setName("Box 500")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 361, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 5, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -6, 0, 0, -6, 0, 0, 0, 0, 0)
			.setRotationPoint(32, -10, -21).setRotationAngle(0, 0, -0).setName("Box 501")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 25, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 1, 0, 0, 1)
			.setRotationPoint(32, -5, -21).setRotationAngle(0, 0, -0).setName("Box 502")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 489, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 8, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-58, -10, 13).setRotationAngle(0, 0, -0).setName("Box 515")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 313, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 8, 0, -1, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 1, 0, 0)
			.setRotationPoint(-58, -10, -21).setRotationAngle(0, 0, -0).setName("Box 516")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 313, 185, textureX, textureY).addBox(0, 0, 0, 3, 11, 42)
			.setRotationPoint(-32, -10, -21).setRotationAngle(0, 0, -0).setName("Box 517")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 1, 185, textureX, textureY).addBox(0, 0, 0, 23, 11, 1)
			.setRotationPoint(-55, -10, -14).setRotationAngle(0, 0, -0).setName("Box 518")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 89, 193, textureX, textureY).addBox(0, 0, 0, 23, 11, 1)
			.setRotationPoint(-55, -10, 13).setRotationAngle(0, 0, -0).setName("Box 519")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 145, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 2, 8, 0, 0, 0, 0, 0, 1, 0, 0, 1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54, -12, 13).setRotationAngle(0, 0, -0).setName("Box 520")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 233, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 2, 8, 0, 0, 0, -1, 0, 1, -1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54, -12, -21).setRotationAngle(0, 0, -0).setName("Box 521")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 457, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 8, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, -2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1)
			.setRotationPoint(-58, -12, 13).setRotationAngle(0, 0, -0).setName("Box 522")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 369, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 8, 0, -2, 0, -2, 0, 0, -1, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-58, -12, -21).setRotationAngle(0, 0, -0).setName("Box 523")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 25, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 26, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-59, -2, -13).setRotationAngle(0, 0, -0).setName("Box 527")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 465, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 5, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, -6, 0, 0)
			.setRotationPoint(-40, -10, 14).setRotationAngle(0, 0, -0).setName("Box 530")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 57, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(-34, -5, 14).setRotationAngle(0, 0, -0).setName("Box 531")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 313, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 5, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -6, 0, 0, -6, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-55, -10, 14).setRotationAngle(0, 0, -0).setName("Box 532")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 201, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(-55, -5, 14).setRotationAngle(0, 0, -0).setName("Box 533")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 481, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 5, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, -6, 0, 0)
			.setRotationPoint(-40, -10, -21).setRotationAngle(0, 0, -0).setName("Box 534")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 369, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(-34, -5, -21).setRotationAngle(0, 0, -0).setName("Box 535")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 177, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 5, 7, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -6, 0, 0, -6, 0, 0, 0, 0, 0)
			.setRotationPoint(-55, -10, -21).setRotationAngle(0, 0, -0).setName("Box 536")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 425, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(-55, -5, -21).setRotationAngle(0, 0, -0).setName("Box 537")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 25, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 42, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, -13, -21).setRotationAngle(0, 0, -0).setName("Box 538")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 225, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 42, 0, 0, 1, -1, 0, 0, -1, 0, 0, -1, 0, 1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25, -13, -21).setRotationAngle(0, 0, -0).setName("Box 539")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 225, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 10, 2, 0, 4, 0, 1, -4, 0, 1, -4, 0, -1, 4, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25, -20, 19).setRotationAngle(0, 0, -0).setName("Box 540")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 241, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 10, 2, 0, 4, 0, -1, -4, 0, -1, -4, 0, 1, 4, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25, -20, -21).setRotationAngle(0, 0, -0).setName("Box 541")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 265, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 2, 0, 4, 0, 0, -4, 0, 0, -4, 0, 0, 4, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(21, -27, 17).setRotationAngle(0, 0, -0).setName("Box 542")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 289, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 2, 0, 4, 0, 0, -4, 0, 0, -4, 0, 0, 4, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(21, -27, -19).setRotationAngle(0, 0, -0).setName("Box 543")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 345, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 10, 2, 0, -4, 0, 1, 4, 0, 1, 4, 0, -1, -4, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31, -20, 19).setRotationAngle(0, 0, -0).setName("Box 544")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 33, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 10, 2, 0, -4, 0, -1, 4, 0, -1, 4, 0, 1, -4, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31, -20, -21).setRotationAngle(0, 0, -0).setName("Box 545")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 305, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 2, 0, -4, 0, 0, 4, 0, 0, 4, 0, 0, -4, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(-27, -27, 17).setRotationAngle(0, 0, -0).setName("Box 546")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 329, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 2, 0, -4, 0, 0, 4, 0, 0, 4, 0, 0, -4, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-27, -27, -19).setRotationAngle(0, 0, -0).setName("Box 547")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 409, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 42, 1, 2, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23, -28, 17).setRotationAngle(0, 0, -0).setName("Box 548")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 81, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 42, 1, 2, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23, -28, -19).setRotationAngle(0, 0, -0).setName("Box 549")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 137, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 34, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9, -28, -17).setRotationAngle(0, 0, -0).setName("Box 550")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 289, 241, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 34, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23, -28, -17).setRotationAngle(0, 0, -0).setName("Box 551")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 57, 145, textureX, textureY).addBox(0, 0, 0, 12, 1, 7)
			.setRotationPoint(-3, -28, -17).setRotationAngle(0, 0, -0).setName("Box 552")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 97, 145, textureX, textureY).addBox(0, 0, 0, 12, 1, 7)
			.setRotationPoint(-3, -28, 10).setRotationAngle(0, 0, -0).setName("Box 553")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 369, 241, textureX, textureY).addBox(0, 0, 0, 11, 1, 19)
			.setRotationPoint(-2.5f, -28, -9.5f).setRotationAngle(0, 0, -0).setName("Box 558")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 497, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(-2.5f, -27, 18).setRotationAngle(0, 0, -0).setName("Box 565")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 409, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(-2.5f, -20, 19).setRotationAngle(0, 0, -0).setName("Box 566")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 25, 129, textureX, textureY).addBox(0, 0, 0, 1, 10, 1)
			.setRotationPoint(-2.5f, -10, 20).setRotationAngle(0, 0, -0).setName("Box 567")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 433, 129, textureX, textureY).addBox(0, 0, 0, 1, 10, 1)
			.setRotationPoint(-2.5f, -10, -21).setRotationAngle(0, 0, -0).setName("Box 568")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 441, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-2.5f, -20, -20).setRotationAngle(0, 0, -0).setName("Box 569")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 505, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-2.5f, -27, -19).setRotationAngle(0, 0, -0).setName("Box 570")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 369, 265, textureX, textureY).addBox(0, 0, 0, 54, 1, 1)
			.setRotationPoint(-29, 0, 20).setRotationAngle(0, 0, -0).setName("Box 567")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 1, 273, textureX, textureY).addBox(0, 0, 0, 54, 1, 1)
			.setRotationPoint(-29, 0, -21).setRotationAngle(0, 0, -0).setName("Box 568")
		);
		chassis_primary.addProgram(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(chassis_primary);
	}

}
