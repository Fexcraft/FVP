//FMT-Marker FVTM-1.1
package net.fexcraft.mod.addon.fvp.models.part.t1;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.ModelGroup;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;

/** This file was exported via the FVTM Exporter V1.2 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.9 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/t1_front_wheel")
public class T1FrontWheel extends PartModel {

	public T1FrontWheel(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup wheel_front = new ModelGroup("wheel_front");
		wheel_front.add(new ModelRendererTurbo(wheel_front, 185, 1, textureX, textureY).addBox(-3, -8, 0, 6, 5, 1).setName("Box 12"));
		wheel_front.add(new ModelRendererTurbo(wheel_front, 89, 9, textureX, textureY).addBox(-8, -3, 0, 16, 6, 1).setName("Box 13"));
		wheel_front.add(new ModelRendererTurbo(wheel_front, 345, 1, textureX, textureY).addBox(-10, -3, -0.5f, 2, 6, 6).setName("Box 14"));
		wheel_front.add(new ModelRendererTurbo(wheel_front, 217, 1, textureX, textureY).addBox(-3, 3, 0, 6, 5, 1).setName("Box 15"));
		wheel_front.add(new ModelRendererTurbo(wheel_front, 1, 9, textureX, textureY).addBox(8, -3, -0.5f, 2, 6, 6).setName("Box 16"));
		wheel_front.add(new ModelRendererTurbo(wheel_front, 129, 9, textureX, textureY).addBox(-3, 8, -0.5f, 6, 2, 6).setName("Box 17"));
		wheel_front.add(new ModelRendererTurbo(wheel_front, 89, 17, textureX, textureY).addBox(-3, -10, -0.5f, 6, 2, 6).setName("Box 18"));
		wheel_front.add(new ModelRendererTurbo(wheel_front, 249, 1, textureX, textureY)
			.addShapeBox(3, 8, -0.5f, 3, 2, 6, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0).setName("Box 19")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 401, 1, textureX, textureY)
			.addShapeBox(8, 3, -0.5f, 2, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0).setName("Box 20")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 433, 1, textureX, textureY)
			.addShapeBox(6, 6, -0.5f, 2, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0).setName("Box 21")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 465, 1, textureX, textureY)
			.addShapeBox(8, -6, -0.5f, 2, 3, 6, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 22")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 377, 17, textureX, textureY)
			.addShapeBox(3, -10, -0.5f, 3, 2, 6, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0).setName("Box 23")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 401, 17, textureX, textureY)
			.addShapeBox(6, -8, -0.5f, 2, 2, 6, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 24")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 425, 17, textureX, textureY)
			.addShapeBox(-6, -10, -0.5f, 3, 2, 6, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0).setName("Box 25")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 449, 17, textureX, textureY)
			.addShapeBox(-10, -6, -0.5f, 2, 3, 6, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 26")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 473, 17, textureX, textureY)
			.addShapeBox(-8, -8, -0.5f, 2, 2, 6, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 27")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 1, 25, textureX, textureY)
			.addShapeBox(-10, 3, -0.5f, 2, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0).setName("Box 28")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 113, 25, textureX, textureY)
			.addShapeBox(-6, 8, -0.5f, 3, 2, 6, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0).setName("Box 29")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 137, 25, textureX, textureY)
			.addShapeBox(-8, 6, -0.5f, 2, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0).setName("Box 30")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 377, 1, textureX, textureY).addBox(-6, -6, 0, 3, 3, 1).setName("Box 31"));
		wheel_front.add(new ModelRendererTurbo(wheel_front, 497, 1, textureX, textureY).addBox(3, -6, 0, 3, 3, 1).setName("Box 32"));
		wheel_front.add(new ModelRendererTurbo(wheel_front, 17, 9, textureX, textureY).addBox(3, 3, 0, 3, 3, 1).setName("Box 33"));
		wheel_front.add(new ModelRendererTurbo(wheel_front, 113, 17, textureX, textureY).addBox(-6, 3, 0, 3, 3, 1).setName("Box 34"));
		wheel_front.add(new ModelRendererTurbo(wheel_front, 281, 1, textureX, textureY)
			.addShapeBox(-8, -6, 0, 2, 3, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 35")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 361, 1, textureX, textureY)
			.addShapeBox(6, -6, 0, 2, 3, 1, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 36")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 153, 9, textureX, textureY)
			.addShapeBox(6, 3, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0).setName("Box 37")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 505, 9, textureX, textureY)
			.addShapeBox(-8, 3, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0).setName("Box 38")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 161, 9, textureX, textureY)
			.addShapeBox(-6, -8, 0, 3, 2, 1, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 39")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 185, 9, textureX, textureY)
			.addShapeBox(3, -8, 0, 3, 2, 1, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 40")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 217, 9, textureX, textureY)
			.addShapeBox(3, 6, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0).setName("Box 41")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 153, 17, textureX, textureY)
			.addShapeBox(-6, 6, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0).setName("Box 42")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 161, 25, textureX, textureY).addBox(-6, -3, 0.5f, 12, 6, 5).setName("Box 43"));
		wheel_front.add(new ModelRendererTurbo(wheel_front, 345, 17, textureX, textureY).addBox(-3, -8, 0.5f, 6, 2, 4).setName("Box 44"));
		wheel_front.add(new ModelRendererTurbo(wheel_front, 201, 25, textureX, textureY).addBox(-3, 6, 0.5f, 6, 2, 4).setName("Box 45"));
		wheel_front.add(new ModelRendererTurbo(wheel_front, 497, 17, textureX, textureY).addBox(6, -3, 0.5f, 2, 6, 4).setName("Box 46"));
		wheel_front.add(new ModelRendererTurbo(wheel_front, 225, 25, textureX, textureY).addBox(-8, -3, 0.5f, 2, 6, 4).setName("Box 47"));
		wheel_front.add(new ModelRendererTurbo(wheel_front, 241, 25, textureX, textureY)
			.addShapeBox(3, 6, 0.5f, 3, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.99f, 0, 0, -1.99f, 0, 0, 0, 0).setName("Box 48")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 193, 33, textureX, textureY)
			.addShapeBox(3, -8, 0.5f, 3, 2, 4, 0, 0, 0, 0, 0, -1.99f, 0, 0, -1.99f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 49")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 209, 33, textureX, textureY)
			.addShapeBox(-6, 6, 0.5f, 3, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0).setName("Box 50")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 241, 33, textureX, textureY)
			.addShapeBox(-6, -8, 0.5f, 3, 2, 4, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 51")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 257, 33, textureX, textureY)
			.addShapeBox(6, 3, 0.5f, 2, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2.99f, 0, 0, -2.99f, 0, 0, 0, 0).setName("Box 52")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 273, 33, textureX, textureY)
			.addShapeBox(-8, 3, 0.5f, 2, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0).setName("Box 53")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 289, 33, textureX, textureY)
			.addShapeBox(-8, -6, 0.5f, 2, 3, 4, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 54")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 305, 33, textureX, textureY)
			.addShapeBox(6, -6, 0.5f, 2, 3, 4, 0, 0, 0, 0, 0, -2.99f, 0, 0, -2.99f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 55")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 321, 33, textureX, textureY)
			.addShapeBox(3, 3, 0.5f, 3, 3, 4, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 56")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 337, 33, textureX, textureY)
			.addShapeBox(3, -6, 0.5f, 3, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0).setName("Box 57")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 353, 33, textureX, textureY)
			.addShapeBox(-6, -6, 0.5f, 3, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2.99f, 0, 0, -2.99f, 0, 0, 0, 0).setName("Box 58")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 377, 33, textureX, textureY)
			.addShapeBox(-6, 3, 0.5f, 3, 3, 4, 0, 0, 0, 0, 0, -2.99f, 0, 0, -2.99f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 59")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 417, 33, textureX, textureY).addBox(-3, -6, 0.5f, 6, 3, 5).setName("Box 60"));
		wheel_front.add(new ModelRendererTurbo(wheel_front, 441, 33, textureX, textureY).addBox(-3, 3, 0.5f, 6, 3, 5).setName("Box 61"));
		wheel_front.add(new ModelRendererTurbo(wheel_front, 465, 33, textureX, textureY)
			.addShapeBox(-6, 3, 0.5f, 3, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0).setName("Box 62")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 489, 33, textureX, textureY)
			.addShapeBox(-6, -6, 0.5f, 3, 3, 5, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 63")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 105, 41, textureX, textureY)
			.addShapeBox(3, -6, 0.5f, 3, 3, 5, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 64")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 129, 41, textureX, textureY)
			.addShapeBox(3, 3, 0.5f, 3, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0).setName("Box 65")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 393, 17, textureX, textureY)
			.addShapeBox(-6, -6, 5.5f, 3, 3, 1, 0, 0, -3, 0, 0, 0, 0, 0, -1, -0.5f, -1, -3, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f).setName("Box 66")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 417, 17, textureX, textureY)
			.addShapeBox(-6, 3, 5.5f, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, 0, -3, 0, 0, 0, 0, 0, -1, -0.5f, -1, -3, -0.5f).setName("Box 68")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 441, 17, textureX, textureY)
			.addShapeBox(3, 3, 5.5f, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -3, 0, -1, -3, -0.5f, 0, -1, -0.5f).setName("Box 69")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 465, 17, textureX, textureY)
			.addShapeBox(3, -6, 5.5f, 3, 3, 1, 0, 0, 0, 0, 0, -3, 0, -1, -3, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, -1.01f, 0, -0.5f, 0, 0, -0.5f).setName("Box 70")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 281, 9, textureX, textureY)
			.addShapeBox(-3, -3, 5.5f, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 71")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 89, 33, textureX, textureY)
			.addShapeBox(-3, -4, 5.5f, 6, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 72")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 393, 33, textureX, textureY)
			.addShapeBox(-3, 3, 5.5f, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f).setName("Box 73")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 257, 25, textureX, textureY)
			.addShapeBox(3, -3, 5.5f, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f).setName("Box 74")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 417, 25, textureX, textureY)
			.addShapeBox(-4, -3, 5.5f, 1, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f).setName("Box 75")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 489, 25, textureX, textureY)
			.addShapeBox(-6, -3, 5.5f, 1, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f).setName("Box 76")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 153, 33, textureX, textureY)
			.addShapeBox(5, -3, 5.5f, 1, 6, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f).setName("Box 77")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 145, 41, textureX, textureY)
			.addShapeBox(-3, 5, 5.5f, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f).setName("Box 78")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 161, 41, textureX, textureY)
			.addShapeBox(-3, -6, 5.5f, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 79")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 249, 1, textureX, textureY)
			.addShapeBox(3.5f, -3, 5.5f, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 80")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 345, 1, textureX, textureY)
			.addShapeBox(3.5f, -1, 5.5f, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 81")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 401, 1, textureX, textureY)
			.addShapeBox(-4.5f, -1, 5.5f, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 82")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 433, 1, textureX, textureY)
			.addShapeBox(3.5f, 2, 5.5f, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 83")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 465, 1, textureX, textureY)
			.addShapeBox(-4.5f, -3, 5.5f, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 84")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 1, 9, textureX, textureY)
			.addShapeBox(-4.5f, 2, 5.5f, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 85")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 129, 9, textureX, textureY)
			.addShapeBox(2, -4.5f, 5.5f, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 86")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 89, 17, textureX, textureY)
			.addShapeBox(-3, -4.5f, 5.5f, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 87")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 489, 17, textureX, textureY)
			.addShapeBox(-1, -4.5f, 5.5f, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 88")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 17, 25, textureX, textureY)
			.addShapeBox(-1, 3.5f, 5.5f, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 89")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 377, 17, textureX, textureY)
			.addShapeBox(2, 3.5f, 5.5f, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 90")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 1, 25, textureX, textureY)
			.addShapeBox(-3, 3.5f, 5.5f, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 91")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 129, 25, textureX, textureY)
			.addShapeBox(-3, 1, 5.5f, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 93")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 153, 25, textureX, textureY)
			.addShapeBox(1, 1, 5.5f, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 94")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 193, 25, textureX, textureY)
			.addShapeBox(1, -3, 5.5f, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 95")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 105, 33, textureX, textureY)
			.addShapeBox(-1, -3, 5.5f, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f).setName("Box 96")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 409, 33, textureX, textureY)
			.addShapeBox(-1, 1, 5.5f, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 97")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 481, 33, textureX, textureY)
			.addShapeBox(1, -1, 5.5f, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f).setName("Box 98")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 505, 33, textureX, textureY)
			.addShapeBox(-3, -1, 5.5f, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f).setName("Box 99")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 121, 41, textureX, textureY)
			.addShapeBox(-1, -1, 5.5f, 2, 2, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f).setName("Box 100")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 337, 225, textureX, textureY)
			.addShapeBox(-3, 4, 5.5f, 6, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f).setName("Box 533")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 17, 233, textureX, textureY)
			.addShapeBox(-3, -5, 5.5f, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f).setName("Box 534")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 289, 145, textureX, textureY)
			.addShapeBox(4, -3, 5.5f, 1, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f).setName("Box 535")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 1, 161, textureX, textureY)
			.addShapeBox(-5, -3, 5.5f, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f).setName("Box 536")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 161, 177, textureX, textureY)
			.addShapeBox(3.5f, -2, 5.5f, 1, 1, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f).setName("Box 609")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 81, 185, textureX, textureY)
			.addShapeBox(3.5f, 1, 5.5f, 1, 1, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f).setName("Box 610")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 121, 185, textureX, textureY)
			.addShapeBox(-4.5f, 1, 5.5f, 1, 1, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f).setName("Box 611")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 177, 185, textureX, textureY)
			.addShapeBox(-4.5f, -2, 5.5f, 1, 1, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f).setName("Box 612")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 201, 185, textureX, textureY)
			.addShapeBox(-2, -4.5f, 5.5f, 1, 1, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f).setName("Box 613")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 233, 185, textureX, textureY)
			.addShapeBox(1, -4.5f, 5.5f, 1, 1, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f).setName("Box 614")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 257, 185, textureX, textureY)
			.addShapeBox(1, 3.5f, 5.5f, 1, 1, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f).setName("Box 615")
		);
		wheel_front.add(new ModelRendererTurbo(wheel_front, 297, 185, textureX, textureY)
			.addShapeBox(-2, 3.5f, 5.5f, 1, 1, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.3f, -0.3f, -0.6f, -0.3f, -0.3f, -0.6f).setName("Box 616")
		);
		wheel_front.addProgram(DefaultPrograms.WHEEL_AUTO_ALL);
		this.groups.add(wheel_front);
	}

}
