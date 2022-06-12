//FMT-Marker FVTM-1.1
package net.fexcraft.mod.addon.fvp.models.part.c1r1;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.ModelGroup;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;

/** This file was exported via the FVTM Exporter V1.2 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.9 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c1_r1_doors")
public class C1R1Doors extends PartModel {

	public C1R1Doors(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand");
		//
		ModelGroup door_back_left = new ModelGroup("door_back_left");
		door_back_left.add(new ModelRendererTurbo(door_back_left, 1, 249, textureX, textureY)
			.addShapeBox(-27, 0, -0.5f, 27, 10, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-2.5f, -10, 20.5f).setRotationAngle(0, 0, 0).setName("Box 570")
		);
		door_back_left.add(new ModelRendererTurbo(door_back_left, 401, 273, textureX, textureY)
			.addShapeBox(-26.5f, -2, -0.5f, 27, 2, 1, 0, -1, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0.5f, -0.25f, -1, 0.5f, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.5f, -10, 20.5f).setRotationAngle(0, 0, 0).setName("Box 577")
		);
		door_back_left.add(new ModelRendererTurbo(door_back_left, 377, 129, textureX, textureY)
			.addShapeBox(-22.5f, -10, -1.5f, 1, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, -0.5f, -0.75f, -3, -0.5f, -0.75f, -3, -0.5f, 0.75f, 3, -0.5f, 0.75f)
			.setRotationPoint(-2.5f, -10, 20.5f).setRotationAngle(0, 0, 0).setName("Box 584")
		);
		door_back_left.add(new ModelRendererTurbo(door_back_left, 129, 137, textureX, textureY)
			.addShapeBox(-1, -10, -1.5f, 1, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f)
			.setRotationPoint(-2.5f, -10, 20.5f).setRotationAngle(0, 0, 0).setName("Box 586")
		);
		door_back_left.add(new ModelRendererTurbo(door_back_left, 457, 137, textureX, textureY)
			.addShapeBox(-1, -17, -2.5f, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(-2.5f, -10, 20.5f).setRotationAngle(0, 0, 0).setName("Box 592")
		);
		door_back_left.add(new ModelRendererTurbo(door_back_left, 209, 145, textureX, textureY)
			.addShapeBox(-18.5f, -17, -2.5f, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, -1, -4, 0, -1, -4, 0, 1, 4, 0, 1)
			.setRotationPoint(-2.5f, -10, 20.5f).setRotationAngle(0, 0, 0).setName("Box 596")
		);
		door_back_left.add(new ModelRendererTurbo(door_back_left, 89, 209, textureX, textureY)
			.addShapeBox(-18, -17, -2.5f, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.14285715f, 0, 0, -0.14285715f, 0, 0, 0.14285715f, 0, 0, 0.14285715f)
			.setRotationPoint(-2.5f, -10, 20.5f).setRotationAngle(0, 0, 0).setName("Box 601")
		);
		door_back_left.add(new ModelRendererTurbo(door_back_left, 441, 57, textureX, textureY)
			.addShapeBox(-21, 0, -0.1f, 3, 1, 1, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, 0.4f, 0, 0, 0.4f, 0.4f, 0, 0, 0.4f, 0, 0)
			.setRotationPoint(-2.5f, -10, 20.5f).setRotationAngle(0, 0, 0).setName("Box 605")
		);
		door_back_left.add(new ModelRendererTurbo(door_back_left, 193, 89, textureX, textureY)
			.addShapeBox(-7.5f, 0, -1, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.5f, -10, 20.5f).setRotationAngle(0, 0, 0).setName("Box 609")
		);
		door_back_left.addPrograms(new DefaultPrograms.AttributeRotator("c1r1_doors_bl", true, 0, 60, 0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_back_left);
		//
		ModelGroup door_back_right = new ModelGroup("door_back_right");
		door_back_right.add(new ModelRendererTurbo(door_back_right, 193, 249, textureX, textureY)
			.addShapeBox(-27, 0, -0.5f, 27, 10, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-2.5f, -10, -20.5f).setRotationAngle(0, 0, 0).setName("Box 572")
		);
		door_back_right.add(new ModelRendererTurbo(door_back_right, 1, 281, textureX, textureY)
			.addShapeBox(-26.5f, -2, -0.5f, 27, 2, 1, 0, -1, 0.5f, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, 0.25f, -1, 0.5f, 0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.5f, -10, -20.5f).setRotationAngle(0, 0, 0).setName("Box 578")
		);
		door_back_right.add(new ModelRendererTurbo(door_back_right, 369, 129, textureX, textureY)
			.addShapeBox(-22.5f, -10, 0.5f, 1, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, -0.5f, 0.75f, -3, -0.5f, 0.75f, -3, -0.5f, -0.75f, 3, -0.5f, -0.75f)
			.setRotationPoint(-2.5f, -10, -20.5f).setRotationAngle(0, 0, 0).setName("Box 583")
		);
		door_back_right.add(new ModelRendererTurbo(door_back_right, 289, 137, textureX, textureY)
			.addShapeBox(-1, -10, 0.5f, 1, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-2.5f, -10, -20.5f).setRotationAngle(0, 0, 0).setName("Box 587")
		);
		door_back_right.add(new ModelRendererTurbo(door_back_right, 337, 137, textureX, textureY)
			.addShapeBox(-1, -17, 1.5f, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-2.5f, -10, -20.5f).setRotationAngle(0, 0, 0).setName("Box 591")
		);
		door_back_right.add(new ModelRendererTurbo(door_back_right, 161, 145, textureX, textureY)
			.addShapeBox(-18.5f, -17, 1.5f, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 1, -4, 0, 1, -4, 0, -1, 4, 0, -1)
			.setRotationPoint(-2.5f, -10, -20.5f).setRotationAngle(0, 0, 0).setName("Box 595")
		);
		door_back_right.add(new ModelRendererTurbo(door_back_right, 1, 201, textureX, textureY)
			.addShapeBox(-18, -17, 1.5f, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.14285715f, 0, 0, 0.14285715f, 0, 0, -0.14285715f, 0, 0, -0.14285715f)
			.setRotationPoint(-2.5f, -10, -20.5f).setRotationAngle(0, 0, 0).setName("Box 600")
		);
		door_back_right.add(new ModelRendererTurbo(door_back_right, 425, 57, textureX, textureY)
			.addShapeBox(-21, 0, -0.9f, 3, 1, 1, 0, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0.2f, 0, 0, 0.4f, 0, 0, 0.4f, 0, 0, 0, 0, 0.4f, 0, 0, 0.4f)
			.setRotationPoint(-2.5f, -10, -20.5f).setRotationAngle(0, 0, 0).setName("Box 604")
		);
		door_back_right.add(new ModelRendererTurbo(door_back_right, 177, 89, textureX, textureY)
			.addShapeBox(-7.5f, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.5f, -10, -20.5f).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		door_back_right.addPrograms(new DefaultPrograms.AttributeRotator("c1r1_doors_br", true, -60, 0, -0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_back_right);
		//
		ModelGroup door_front_left = new ModelGroup("door_front_left");
		door_front_left.add(new ModelRendererTurbo(door_front_left, 417, 241, textureX, textureY)
			.addShapeBox(-27, 0, -0.5f, 27, 10, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(25, -10, 20.5f).setRotationAngle(0, 0, 0).setName("Box 569")
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 433, 257, textureX, textureY)
			.addShapeBox(-27, -2, -0.5f, 27, 2, 1, 0, -0.5f, 0.5f, 0.25f, -1, 0.5f, 0.25f, -1, 0.5f, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(25, -10, 20.5f).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 473, 121, textureX, textureY)
			.addShapeBox(-5, -10, -1.5f, 1, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -0.5f, -0.75f, 3, -0.5f, -0.75f, 3, -0.5f, 0.75f, -3, -0.5f, 0.75f)
			.setRotationPoint(25, -10, 20.5f).setRotationAngle(0, 0, 0).setName("Box 580")
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 33, 137, textureX, textureY)
			.addShapeBox(-26.5f, -10, -1.5f, 1, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f)
			.setRotationPoint(25, -10, 20.5f).setRotationAngle(0, 0, 0).setName("Box 585")
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 313, 137, textureX, textureY)
			.addShapeBox(-26.5f, -17, -2.5f, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(25, -10, 20.5f).setRotationAngle(0, 0, 0).setName("Box 589")
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 465, 137, textureX, textureY)
			.addShapeBox(-9, -17, -2.5f, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, -1, 4, 0, -1, 4, 0, 1, -4, 0, 1)
			.setRotationPoint(25, -10, 20.5f).setRotationAngle(0, 0, 0).setName("Box 593")
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 337, 177, textureX, textureY)
			.addShapeBox(-25.5f, -17, -2.5f, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.14285715f, 0, 0, -0.14285715f, 0, 0, 0.14285715f, 0, 0, 0.14285715f)
			.setRotationPoint(25, -10, 20.5f).setRotationAngle(0, 0, 0).setName("Box 597")
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 265, 49, textureX, textureY)
			.addShapeBox(-24, 0, -0.1f, 3, 1, 1, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0.2f, 0, -0.2f, 0, 0, 0.4f, 0, 0, 0.4f, 0.4f, 0, 0, 0.4f, 0, 0)
			.setRotationPoint(25, -10, 20.5f).setRotationAngle(0, 0, 0).setName("Box 602")
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 457, 57, textureX, textureY)
			.addShapeBox(-12.5f, 0, -1, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25, -10, 20.5f).setRotationAngle(0, 0, 0).setName("Box 606")
		);
		door_front_left.addPrograms(new DefaultPrograms.AttributeRotator("c1r1_doors_fl", true, 0, 60, 0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_front_left);
		//
		ModelGroup door_front_right = new ModelGroup("door_front_right");
		door_front_right.add(new ModelRendererTurbo(door_front_right, 81, 249, textureX, textureY)
			.addShapeBox(-27, 0, -0.5f, 27, 10, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(25, -10, -20.5f).setRotationAngle(0, 0, 0).setName("Box 571")
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 65, 281, textureX, textureY)
			.addShapeBox(-27, -2, -0.5f, 27, 2, 1, 0, -0.5f, 0.5f, -0.25f, -1, 0.5f, -0.25f, -1, 0.5f, 0.25f, -0.5f, 0.5f, 0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(25, -10, -20.5f).setRotationAngle(0, 0, 0).setName("Box 579")
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 481, 121, textureX, textureY)
			.addShapeBox(-5, -10, 0.5f, 1, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -0.5f, 0.75f, 3, -0.5f, 0.75f, 3, -0.5f, -0.75f, -3, -0.5f, -0.75f)
			.setRotationPoint(25, -10, -20.5f).setRotationAngle(0, 0, 0).setName("Box 581")
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 297, 137, textureX, textureY)
			.addShapeBox(-26.5f, -10, 0.5f, 1, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(25, -10, -20.5f).setRotationAngle(0, 0, 0).setName("Box 588")
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 321, 137, textureX, textureY)
			.addShapeBox(-26.5f, -17, 1.5f, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(25, -10, -20.5f).setRotationAngle(0, 0, 0).setName("Box 590")
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 153, 145, textureX, textureY)
			.addShapeBox(-9, -17, 1.5f, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 1, 4, 0, 1, 4, 0, -1, -4, 0, -1)
			.setRotationPoint(25, -10, -20.5f).setRotationAngle(0, 0, 0).setName("Box 594")
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 89, 185, textureX, textureY)
			.addShapeBox(-25.5f, -17, 1.5f, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.14285715f, 0, 0, 0.14285715f, 0, 0, -0.14285715f, 0, 0, -0.14285715f)
			.setRotationPoint(25, -10, -20.5f).setRotationAngle(0, 0, 0).setName("Box 599")
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 281, 49, textureX, textureY)
			.addShapeBox(-24, 0, -0.9f, 3, 1, 1, 0, 0.2f, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0.2f, 0, 0, 0.4f, 0, 0, 0.4f, 0, 0, 0, 0, 0.4f, 0, 0, 0.4f)
			.setRotationPoint(25, -10, -20.5f).setRotationAngle(0, 0, 0).setName("Box 603")
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 161, 89, textureX, textureY)
			.addShapeBox(-12.5f, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25, -10, -20.5f).setRotationAngle(0, 0, 0).setName("Box 607")
		);
		door_front_right.addPrograms(new DefaultPrograms.AttributeRotator("c1r1_doors_fr", true, -60, 0, -0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_front_right);
		//
		ModelGroup trunk = new ModelGroup("trunk");
		trunk.add(new ModelRendererTurbo(trunk, 105, 209, textureX, textureY)
			.addShapeBox(-22, 0, -13, 22, 2, 26, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-32, -12, 0).setRotationAngle(0, 0, 0).setName("Box 526")
		);
		trunk.add(new ModelRendererTurbo(trunk, 209, 209, textureX, textureY)
			.addShapeBox(-26, 2, -13, 2, 8, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.8f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0.8f, 0, 0)
			.setRotationPoint(-32, -12, 0).setRotationAngle(0, 0, 0).setName("Box 528")
		);
		trunk.add(new ModelRendererTurbo(trunk, 1, 217, textureX, textureY)
			.addShapeBox(-26, 0, -13, 4, 2, 26, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, -12, 0).setRotationAngle(0, 0, 0).setName("Box 529")
		);
		trunk.add(new ModelRendererTurbo(trunk, 1, 17, textureX, textureY)
			.addShapeBox(-26.5f, 4, -7, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0.2f, 0, 0)
			.setRotationPoint(-32, -12, 0).setRotationAngle(0, 0, 0).setName("Box 649")
		);
		trunk.add(new ModelRendererTurbo(trunk, 1, 209, textureX, textureY)
			.addShapeBox(-26.5f, 5, -6, 1, 3, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.3f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0.3f, 0, 0)
			.setRotationPoint(-32, -12, 0).setRotationAngle(0, 0, 0).setName("Box 650")
		);
		trunk.addPrograms(new DefaultPrograms.AttributeRotator("c1r1_trunk", true, 0, 72, 1, 2, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(trunk);
	}

}
