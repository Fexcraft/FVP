//FMT-Marker FVTM-1.1
package net.fexcraft.mod.addon.fvp.models.part.t1;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;

/** This file was exported via the FVTM Exporter V1.2 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.9 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/t1_rear_wheel")
public class T1RearWheel extends PartModel {

	public T1RearWheel(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		TurboList wheel_rear = new TurboList("wheel_rear");
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 249, 145, textureX, textureY).addBox(-8, -3, 0, 16, 6, 2).setName("Box 231"));
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 209, 121, textureX, textureY).addBox(-3, 3, 0, 6, 5, 2).setName("Box 232"));
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 161, 129, textureX, textureY).addBox(-3, -8, 0, 6, 5, 2).setName("Box 233"));
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 473, 81, textureX, textureY).addBox(-6, 3, 0, 3, 3, 2).setName("Box 234"));
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 1, 89, textureX, textureY).addBox(3, 3, 0, 3, 3, 2).setName("Box 235"));
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 25, 89, textureX, textureY).addBox(-6, -6, 0, 3, 3, 2).setName("Box 236"));
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 337, 97, textureX, textureY).addBox(3, -6, 0, 3, 3, 2).setName("Box 237"));
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 449, 97, textureX, textureY)
			.addShapeBox(3, 6, 0, 3, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0).setName("Box 238")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 25, 113, textureX, textureY)
			.addShapeBox(-6, 6, 0, 3, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0).setName("Box 239")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 465, 25, textureX, textureY)
			.addShapeBox(-8, 3, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0).setName("Box 240")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 73, 57, textureX, textureY)
			.addShapeBox(6, 3, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0).setName("Box 241")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 161, 57, textureX, textureY)
			.addShapeBox(-8, -6, 0, 2, 3, 2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 242")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 249, 113, textureX, textureY)
			.addShapeBox(-6, -8, 0, 3, 2, 2, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 243")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 361, 57, textureX, textureY)
			.addShapeBox(6, -6, 0, 2, 3, 2, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 244")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 281, 113, textureX, textureY)
			.addShapeBox(3, -8, 0, 3, 2, 2, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 245")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 209, 97, textureX, textureY)
			.addShapeBox(-10, 3, 0, 2, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(0, 0, -0.5f).setRotationAngle(0, 0, 0).setName("Box 246")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 369, 129, textureX, textureY)
			.addShapeBox(-8, 6, 0, 2, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(0, 0, -0.5f).setRotationAngle(0, 0, 0).setName("Box 247")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 137, 145, textureX, textureY)
			.addShapeBox(-6, 8, 0, 3, 2, 6, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0)
			.setRotationPoint(0, 0, -0.5f).setRotationAngle(0, 0, 0).setName("Box 248")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 153, 137, textureX, textureY).addBox(-10, -3, 0, 2, 6, 6)
			.setRotationPoint(0, 0, -0.5f).setRotationAngle(0, 0, 0).setName("Box 249")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 177, 145, textureX, textureY)
			.addShapeBox(-10, -6, 0, 2, 3, 6, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, -0.5f).setRotationAngle(0, 0, 0).setName("Box 250")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 345, 145, textureX, textureY)
			.addShapeBox(-8, -8, 0, 2, 2, 6, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, -0.5f).setRotationAngle(0, 0, 0).setName("Box 251")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 393, 145, textureX, textureY)
			.addShapeBox(-6, -10, 0, 3, 2, 6, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0)
			.setRotationPoint(0, 0, -0.5f).setRotationAngle(0, 0, 0).setName("Box 252")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 433, 145, textureX, textureY).addBox(-3, -10, 0, 6, 2, 6)
			.setRotationPoint(0, 0, -0.5f).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 41, 153, textureX, textureY)
			.addShapeBox(3, -10, 0, 3, 2, 6, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0)
			.setRotationPoint(0, 0, -0.5f).setRotationAngle(0, 0, 0).setName("Box 254")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 369, 145, textureX, textureY)
			.addShapeBox(8, -6, 0, 2, 3, 6, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, -0.5f).setRotationAngle(0, 0, 0).setName("Box 255")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 81, 153, textureX, textureY)
			.addShapeBox(6, -8, 0, 2, 2, 6, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, -0.5f).setRotationAngle(0, 0, 0).setName("Box 256")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 193, 153, textureX, textureY).addBox(8, -3, 0, 2, 6, 6)
			.setRotationPoint(0, 0, -0.5f).setRotationAngle(0, 0, 0).setName("Box 257")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 105, 153, textureX, textureY).addBox(-3, 8, 0, 6, 2, 6)
			.setRotationPoint(0, 0, -0.5f).setRotationAngle(0, 0, 0).setName("Box 258")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 153, 153, textureX, textureY)
			.addShapeBox(8, 3, 0, 2, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(0, 0, -0.5f).setRotationAngle(0, 0, 0).setName("Box 259")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 473, 153, textureX, textureY)
			.addShapeBox(3, 8, 0, 3, 2, 6, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
			.setRotationPoint(0, 0, -0.5f).setRotationAngle(0, 0, 0).setName("Box 260")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 409, 153, textureX, textureY)
			.addShapeBox(6, 6, 0, 2, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, -0.5f).setRotationAngle(0, 0, 0).setName("Box 261")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 129, 241, textureX, textureY).addBox(7, -3, 1, 1, 6, 4).setName("Box 542"));
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 441, 281, textureX, textureY).addBox(-8, -3, 1, 1, 6, 4).setName("Box 543"));
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 425, 233, textureX, textureY).addBox(-3, -8, 1, 6, 1, 4).setName("Box 544"));
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 473, 257, textureX, textureY).addBox(-3, 7, 1, 6, 1, 4).setName("Box 545"));
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 449, 233, textureX, textureY)
			.addShapeBox(3, 7, 1, 3, 1, 4, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0).setName("Box 550")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 105, 241, textureX, textureY)
			.addShapeBox(3, -8, 1, 3, 1, 4, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0).setName("Box 551")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 105, 249, textureX, textureY)
			.addShapeBox(-6, -8, 1, 3, 1, 4, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0).setName("Box 552")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 225, 273, textureX, textureY)
			.addShapeBox(-6, 7, 1, 3, 1, 4, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0).setName("Box 553")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 241, 161, textureX, textureY)
			.addShapeBox(7, 3, 1, 1, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0).setName("Box 554")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 385, 217, textureX, textureY)
			.addShapeBox(7, -6, 1, 1, 3, 4, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 555")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 137, 225, textureX, textureY)
			.addShapeBox(-8, -6, 1, 1, 3, 4, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 556")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 33, 233, textureX, textureY)
			.addShapeBox(-8, 3, 1, 1, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0).setName("Box 557")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 1, 337, textureX, textureY).addBox(-2, -2, 1, 4, 4, 3).setName("Box 566"));
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 433, 161, textureX, textureY)
			.addShapeBox(-3, -2, 1, 1, 4, 3, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0).setName("Box 567")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 41, 169, textureX, textureY)
			.addShapeBox(2, -2, 1, 1, 4, 3, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0).setName("Box 568")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 385, 321, textureX, textureY)
			.addShapeBox(-2, -3, 1, 4, 1, 3, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 569")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 401, 321, textureX, textureY)
			.addShapeBox(-2, 2, 1, 4, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0).setName("Box 570")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 417, 313, textureX, textureY)
			.addShapeBox(-2, -2, 4, 4, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 577")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 249, 121, textureX, textureY)
			.addShapeBox(-2, -3, 4, 4, 1, 1, 0, -1, 0, 0, -1, 0, 0, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 578")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 465, 121, textureX, textureY)
			.addShapeBox(-2, 2, 4, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, -1, 0, 0, -1, 0, -1, -1, 0, -1).setName("Box 581")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 177, 145, textureX, textureY)
			.addShapeBox(-3, -2, 4, 1, 4, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -1).setName("Box 583")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 345, 145, textureX, textureY)
			.addShapeBox(2, -2, 4, 1, 4, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, 0, -0.5f, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, 0, -0.5f).setName("Box 584")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 505, 153, textureX, textureY)
			.addShapeBox(-1, -1, 4.5f, 2, 2, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f).setName("Box 585")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 497, 105, textureX, textureY)
			.addShapeBox(5, -2, 2, 1, 1, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f).setName("Box 593")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 281, 121, textureX, textureY)
			.addShapeBox(5, 1, 2, 1, 1, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f).setName("Box 594")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 497, 121, textureX, textureY)
			.addShapeBox(-6, 1, 2, 1, 1, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f).setName("Box 595")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 41, 153, textureX, textureY)
			.addShapeBox(-6, -2, 2, 1, 1, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f).setName("Box 596")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 81, 153, textureX, textureY)
			.addShapeBox(1, -6, 2, 1, 1, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f).setName("Box 597")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 289, 153, textureX, textureY)
			.addShapeBox(-2, -6, 2, 1, 1, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f).setName("Box 598")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 473, 153, textureX, textureY)
			.addShapeBox(1, 5, 2, 1, 1, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f).setName("Box 599")
		);
		wheel_rear.add(new ModelRendererTurbo(wheel_rear, 497, 153, textureX, textureY)
			.addShapeBox(-2, 5, 2, 1, 1, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f).setName("Box 600")
		);
		wheel_rear.addProgram(DefaultPrograms.WHEEL_AUTO_ALL);
		this.groups.add(wheel_rear);
	}

}
