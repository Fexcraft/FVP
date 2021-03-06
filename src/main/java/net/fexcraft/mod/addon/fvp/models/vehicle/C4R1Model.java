//FMT-Marker FVTM-1
package net.fexcraft.mod.addon.fvp.models.vehicle;

import org.lwjgl.opengl.GL11;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.mc.utils.Static;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.data.attribute.Attribute;
import net.fexcraft.mod.fvtm.data.root.Colorable;
import net.fexcraft.mod.fvtm.data.root.RenderCache;
import net.fexcraft.mod.fvtm.data.vehicle.VehicleData;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.model.VehicleModel;
import net.minecraft.entity.Entity;

/** This file was exported via the FVTM Exporter V1 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.0.7-test &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/vehicle/c4")
public class C4R1Model extends VehicleModel {

	public C4R1Model(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList chassis = new TurboList("chassis");
		chassis.add(new ModelRendererTurbo(chassis, 169, 205, textureX, textureY).addBox(0, 0, 0, 3, 3, 38)
			.setRotationPoint(-47, -9, -19).setRotationAngle(0, 0, 0).setName("Box 88")
		);
		chassis.add(new ModelRendererTurbo(chassis, 124, 201, textureX, textureY).addBox(0, 0, 0, 3, 3, 38)
			.setRotationPoint(44, -9, -19).setRotationAngle(0, 0, 0).setName("Box 88")
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(32, -12, -24).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		chassis.add(new ModelRendererTurbo(chassis, 279, 85, textureX, textureY).addBox(0, 0, 0, 20, 12, 32)
			.setRotationPoint(36.01f, -19, -16).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		chassis.add(new ModelRendererTurbo(chassis, 215, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 48, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(55, -12, -24).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-36, -12, 17).setRotationAngle(0, 0, 0).setName("Box 4")
		);
		chassis.add(new ModelRendererTurbo(chassis, 373, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-36, -12, -24).setRotationAngle(0, 0, 0).setName("Box 5")
		);
		chassis.add(new ModelRendererTurbo(chassis, 350, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-59, -12, 17).setRotationAngle(0, 0, 0).setName("Box 6")
		);
		chassis.add(new ModelRendererTurbo(chassis, 327, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-59, -12, -24).setRotationAngle(0, 0, 0).setName("Box 7")
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 132, textureX, textureY)
			.addShapeBox(0, -2, 0, 5, 7, 48, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0)
			.setRotationPoint(59, -11, -24).setRotationAngle(0, 0, 0).setName("Box 8")
		);
		chassis.add(new ModelRendererTurbo(chassis, 327, 197, textureX, textureY).addBox(0, 0, 0, 3, 7, 48)
			.setRotationPoint(56, -13, -24).setRotationAngle(0, 0, 0).setName("Box 27")
		);
		chassis.add(new ModelRendererTurbo(chassis, 272, 192, textureX, textureY).addBox(0, 0, 0, 3, 2, 48)
			.setRotationPoint(44, -19, -24).setRotationAngle(0, 0, 0).setName("Box 35")
		);
		chassis.add(new ModelRendererTurbo(chassis, 502, 51, textureX, textureY).addBox(0, 0, 0, 3, 2, 1)
			.setRotationPoint(-47, -19, -24).setRotationAngle(0, 0, 0).setName("Box 46")
		);
		chassis.add(new ModelRendererTurbo(chassis, 312, 43, textureX, textureY).addBox(0, 0, 0, 3, 2, 1)
			.setRotationPoint(-47, -19, 23).setRotationAngle(0, 0, 0).setName("Box 47")
		);
		chassis.add(new ModelRendererTurbo(chassis, 385, 61, textureX, textureY).addBox(0, 0, 0, 27, 3, 34)
			.setRotationPoint(-59, -10, -17).setRotationAngle(0, 0, 0).setName("Box 48")
		);
		chassis.add(new ModelRendererTurbo(chassis, 5, 141, textureX, textureY).addBox(0, 0, 0, 3, 10, 18)
			.setRotationPoint(58, -23, -9).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		chassis.add(new ModelRendererTurbo(chassis, 104, 208, textureX, textureY).addBox(0, 0, 0, 1, 1, 18)
			.setRotationPoint(62, -22.5f, -9).setRotationAngle(0, 0, 0).setName("Box 56")
		);
		chassis.add(new ModelRendererTurbo(chassis, 53, 208, textureX, textureY).addBox(0, 0, 0, 1, 1, 18)
			.setRotationPoint(62, -21, -9).setRotationAngle(0, 0, 0).setName("Box 57")
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 208, textureX, textureY).addBox(0, 0, 0, 1, 1, 18)
			.setRotationPoint(62, -19.5f, -9).setRotationAngle(0, 0, 0).setName("Box 58")
		);
		chassis.add(new ModelRendererTurbo(chassis, 382, 205, textureX, textureY).addBox(0, 0, 0, 1, 1, 18)
			.setRotationPoint(62, -18, -9).setRotationAngle(0, 0, 0).setName("Box 59")
		);
		chassis.add(new ModelRendererTurbo(chassis, 214, 201, textureX, textureY).addBox(0, 0, 0, 1, 1, 18)
			.setRotationPoint(62, -16.5f, -9).setRotationAngle(0, 0, 0).setName("Box 60")
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 188, textureX, textureY).addBox(0, 0, 0, 1, 1, 18)
			.setRotationPoint(62, -15, -9).setRotationAngle(0, 0, 0).setName("Box 61")
		);
		chassis.add(new ModelRendererTurbo(chassis, 240, 151, textureX, textureY).addBox(0, 0, 0, 1, 1, 18)
			.setRotationPoint(62, -13.5f, -9).setRotationAngle(0, 0, 0).setName("Box 62")
		);
		chassis.add(new ModelRendererTurbo(chassis, 276, 11, textureX, textureY).addBox(0, 0, 0, 64, 3, 46)
			.setRotationPoint(-32, -10, -23).setRotationAngle(0, 0, 0).setName("Box 62")
		);
		chassis.add(new ModelRendererTurbo(chassis, 89, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(32, -12, 22).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		chassis.add(new ModelRendererTurbo(chassis, 439, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 32, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32, -12, -16).setRotationAngle(0, 0, 0).setName("Box 67")
		);
		chassis.add(new ModelRendererTurbo(chassis, 291, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 6, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(32, -12, 16).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		chassis.add(new ModelRendererTurbo(chassis, 270, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 6, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(32, -12, -22).setRotationAngle(0, 0, 0).setName("Box 69")
		);
		chassis.add(new ModelRendererTurbo(chassis, 162, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32, -12, 11).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		chassis.add(new ModelRendererTurbo(chassis, 352, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32, -12, 16).setRotationAngle(0, 0, 0).setName("Box 72")
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 16, 10, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32, -26, -5).setRotationAngle(0, 0, 0).setName("Box 76")
		);
		chassis.add(new ModelRendererTurbo(chassis, 89, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 8, 8, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, -6, 0)
			.setRotationPoint(35, -26, 9).setRotationAngle(0, 0, 0).setName("Box 80")
		);
		chassis.add(new ModelRendererTurbo(chassis, 322, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0)
			.setRotationPoint(33, -26, 12).setRotationAngle(0, 0, 0).setName("Box 81")
		);
		chassis.add(new ModelRendererTurbo(chassis, 89, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 5, 8, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0)
			.setRotationPoint(13, -15, -4).setRotationAngle(0, 0, 0).setName("Box 82")
		);
		chassis.add(new ModelRendererTurbo(chassis, 283, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 6, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26, -20, -3).setRotationAngle(0, 0, 0).setName("Box 83")
		);
		chassis.add(new ModelRendererTurbo(chassis, 270, 101, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(39, -28.5f, 23).setRotationAngle(0, 0, 0).setName("Box 102")
		);
		chassis.add(new ModelRendererTurbo(chassis, 327, 143, textureX, textureY).addBox(0, 0, 0, 1, 4, 5)
			.setRotationPoint(39, -30, 24).setRotationAngle(0, -30, 0).setName("Box 103")
		);
		chassis.add(new ModelRendererTurbo(chassis, 89, 98, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(39, -28.5f, -25).setRotationAngle(0, 0, 0).setName("Box 105")
		);
		chassis.add(new ModelRendererTurbo(chassis, 59, 141, textureX, textureY).addBox(0, 0, 0, 1, 4, 5)
			.setRotationPoint(39.8f, -30, -24.5f).setRotationAngle(0, -150, 0).setName("Box 108")
		);
		/*chassis.add(new ModelRendererTurbo(chassis, 480, 148, textureX, textureY).addBox(0, 0, 0, 1, 3, 12)
			.setRotationPoint(-64.2f, -11, -6).setRotationAngle(0, 0, 0).setName("Box 121")
		);*/
		chassis.add(new ModelRendererTurbo(chassis, 99, 132, textureX, textureY).addBox(0, 0, 0, 3, 7, 7)
			.setRotationPoint(-59, -13, -24).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		chassis.add(new ModelRendererTurbo(chassis, 268, 130, textureX, textureY)
			.addShapeBox(0, -2, 0, 5, 7, 48, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, -1)
			.setRotationPoint(-64, -11, -24).setRotationAngle(0, 0, 0).setName("Box 123")
		);
		chassis.add(new ModelRendererTurbo(chassis, 78, 132, textureX, textureY).addBox(0, 0, 0, 3, 7, 7)
			.setRotationPoint(-59, -13, 17).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		chassis.add(new ModelRendererTurbo(chassis, 116, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 34, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-59, -13, -17).setRotationAngle(0, 0, 0).setName("Box 125")
		);
		chassis.add(new ModelRendererTurbo(chassis, 191, 5, textureX, textureY).addBox(0, 0, 0, 64, 5, 1)
			.setRotationPoint(-32, -12, 23).setRotationAngle(0, 0, 0).setName("Box 126")
		);
		chassis.add(new ModelRendererTurbo(chassis, 337, 4, textureX, textureY).addBox(0, 0, 0, 64, 5, 1)
			.setRotationPoint(-32, -12, -24).setRotationAngle(0, 0, 0).setName("Box 127")
		);
		/*chassis.add(new ModelRendererTurbo(chassis, 439, 147, textureX, textureY).addBox(0, 0, 0, 1, 3, 12)
			.setRotationPoint(63.2f, -11, -6).setRotationAngle(0, 0, 0).setName("Box 128")
		);*/
		chassis.add(new ModelRendererTurbo(chassis, 207, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0)
			.setRotationPoint(36, -18, 23).setRotationAngle(0, 0, 0).setName("Box 139")
		);
		chassis.add(new ModelRendererTurbo(chassis, 298, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34, -14, 23).setRotationAngle(0, 0, 0).setName("Box 136")
		);
		chassis.add(new ModelRendererTurbo(chassis, 338, 0, textureX, textureY).addBox(0, 0, 0, 70, 1, 2)
			.setRotationPoint(-35, -7, 22).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		chassis.add(new ModelRendererTurbo(chassis, 191, 0, textureX, textureY).addBox(0, 0, 0, 70, 1, 3)
			.setRotationPoint(-35, -7, -24).setRotationAngle(0, 0, 0).setName("Box 138")
		);
		chassis.add(new ModelRendererTurbo(chassis, 162, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(40, -19, 23).setRotationAngle(0, 0, 0).setName("Box 139")
		);
		chassis.add(new ModelRendererTurbo(chassis, 110, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(47, -19, 23).setRotationAngle(0, 0, 0).setName("Box 140")
		);
		chassis.add(new ModelRendererTurbo(chassis, 121, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0)
			.setRotationPoint(51, -18, 23).setRotationAngle(0, 0, 0).setName("Box 141")
		);
		chassis.add(new ModelRendererTurbo(chassis, 503, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55, -14, 23).setRotationAngle(0, 0, 0).setName("Box 142")
		);
		chassis.add(new ModelRendererTurbo(chassis, 157, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55, -14, -24).setRotationAngle(0, 0, 0).setName("Box 145")
		);
		chassis.add(new ModelRendererTurbo(chassis, 110, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0)
			.setRotationPoint(51, -18, -24).setRotationAngle(0, 0, 0).setName("Box 146")
		);
		chassis.add(new ModelRendererTurbo(chassis, 217, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(47, -19, -24).setRotationAngle(0, 0, 0).setName("Box 147")
		);
		chassis.add(new ModelRendererTurbo(chassis, 29, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(40, -19, -24).setRotationAngle(0, 0, 0).setName("Box 148")
		);
		chassis.add(new ModelRendererTurbo(chassis, 29, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0)
			.setRotationPoint(36, -18, -24).setRotationAngle(0, 0, 0).setName("Box 149")
		);
		chassis.add(new ModelRendererTurbo(chassis, 503, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34, -14, -24).setRotationAngle(0, 0, 0).setName("Box 150")
		);
		chassis.add(new ModelRendererTurbo(chassis, 382, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0)
			.setRotationPoint(-40, -18, 23).setRotationAngle(0, 0, 0).setName("Box 151")
		);
		chassis.add(new ModelRendererTurbo(chassis, 505, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -14, 23).setRotationAngle(0, 0, 0).setName("Box 152")
		);
		chassis.add(new ModelRendererTurbo(chassis, 371, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-44, -19, 23).setRotationAngle(0, 0, 0).setName("Box 153")
		);
		chassis.add(new ModelRendererTurbo(chassis, 505, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57, -14, 23).setRotationAngle(0, 0, 0).setName("Box 154")
		);
		chassis.add(new ModelRendererTurbo(chassis, 288, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-51, -19, 23).setRotationAngle(0, 0, 0).setName("Box 155")
		);
		chassis.add(new ModelRendererTurbo(chassis, 277, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0)
			.setRotationPoint(-55, -18, 23).setRotationAngle(0, 0, 0).setName("Box 156")
		);
		chassis.add(new ModelRendererTurbo(chassis, 266, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -14, -24).setRotationAngle(0, 0, 0).setName("Box 157")
		);
		chassis.add(new ModelRendererTurbo(chassis, 266, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0)
			.setRotationPoint(-40, -18, -24).setRotationAngle(0, 0, 0).setName("Box 158")
		);
		chassis.add(new ModelRendererTurbo(chassis, 217, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-44, -19, -24).setRotationAngle(0, 0, 0).setName("Box 159")
		);
		chassis.add(new ModelRendererTurbo(chassis, 505, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57, -14, -24).setRotationAngle(0, 0, 0).setName("Box 160")
		);
		chassis.add(new ModelRendererTurbo(chassis, 501, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-51, -19, -24).setRotationAngle(0, 0, 0).setName("Box 161")
		);
		chassis.add(new ModelRendererTurbo(chassis, 500, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0)
			.setRotationPoint(-55, -18, -24).setRotationAngle(0, 0, 0).setName("Box 162")
		);
		chassis.add(new ModelRendererTurbo(chassis, 89, 84, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
			.setRotationPoint(28, -23, -0.5f).setRotationAngle(0, 0, -15).setName("Box 163")
		);
		chassis.add(new ModelRendererTurbo(chassis, 136, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 4, 0, 0, -1, -1, 0, 0, -1, 0, 0, -1, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17, -17, -2).setRotationAngle(0, 0, 0).setName("Box 164")
		);
		chassis.add(new ModelRendererTurbo(chassis, 483, 0, textureX, textureY).addBox(0, 0, 0, 7, 1, 1)
			.setRotationPoint(17.5f, -16, -0.5f).setRotationAngle(0, 0, -20).setName("Box 165")
		);
		chassis.add(new ModelRendererTurbo(chassis, 447, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(36, -40, -0.5f).setRotationAngle(0, 0, 0).setName("Box 166")
		);
		chassis.add(new ModelRendererTurbo(chassis, 474, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(36, -39, 0.5f).setRotationAngle(0, 0, 0).setName("Box 167")
		);
		chassis.add(new ModelRendererTurbo(chassis, 209, 139, textureX, textureY).addBox(0, 0, 0, 1, 2, 5)
			.setRotationPoint(34.8f, -38.2f, -1).setRotationAngle(0, 15, -9).setName("Box 168")
		);
		chassis.add(new ModelRendererTurbo(chassis, 299, 253, textureX, textureY).addBox(0, 0, 0, 1, 2, 42)
			.setRotationPoint(-60, -40, -21).setRotationAngle(0, 0, 0).setName("Box 215")
		);
		chassis.add(new ModelRendererTurbo(chassis, 106, 243, textureX, textureY).addBox(0, 0, 0, 1, 1, 42)
			.setRotationPoint(-61, -40, -21).setRotationAngle(0, 0, 0).setName("Box 216")
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 89, textureX, textureY).addBox(0, 0, 0, 2, 6, 2)
			.setRotationPoint(-59, -36, -22).setRotationAngle(0, 0, 0).setName("Box 217")
		);
		chassis.add(new ModelRendererTurbo(chassis, 302, 88, textureX, textureY).addBox(0, 0, 0, 2, 6, 2)
			.setRotationPoint(-59, -36, 20).setRotationAngle(0, 0, 0).setName("Box 218")
		);
		chassis.add(new ModelRendererTurbo(chassis, 191, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 43, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, -12, -23).setRotationAngle(0, 0, 0).setName("Box 0")
		);
		chassis.add(new ModelRendererTurbo(chassis, 89, 69, textureX, textureY).addBox(0, 0, 0, 24, 1, 1)
			.setRotationPoint(-51, -24, -23.1f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		chassis.add(new ModelRendererTurbo(chassis, 235, 54, textureX, textureY).addBox(0, 0, 0, 24, 1, 1)
			.setRotationPoint(-51, -26, -23.1f).setRotationAngle(0, 0, 0).setName("Box 4")
		);
		chassis.add(new ModelRendererTurbo(chassis, 384, 147, textureX, textureY).addBox(0, 0, 0, 2, 27, 1)
			.setRotationPoint(-61, -40, 21).setRotationAngle(0, 0, 0).setName("Box 212")
		);
		chassis.add(new ModelRendererTurbo(chassis, 367, 147, textureX, textureY).addBox(0, 0, 0, 2, 27, 1)
			.setRotationPoint(-61, -40, -22).setRotationAngle(0, 0, 0).setName("Box 214")
		);
		this.groups.add(chassis);
		//
		TurboList primary = new TurboList("primary");
		primary.add(new ModelRendererTurbo(primary, 220, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0)
			.setRotationPoint(-55, -19, -23).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		primary.add(new ModelRendererTurbo(primary, 478, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0)
			.setRotationPoint(-40, -19, -23).setRotationAngle(0, 0, 0).setName("Box 39")
		);
		primary.add(new ModelRendererTurbo(primary, 183, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0)
			.setRotationPoint(-40, -19, 17).setRotationAngle(0, 0, 0).setName("Box 40")
		);
		primary.add(new ModelRendererTurbo(primary, 162, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0)
			.setRotationPoint(-55, -19, 17).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		primary.add(new ModelRendererTurbo(primary, 463, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-51, -19, -23).setRotationAngle(0, 0, 0).setName("Box 42")
		);
		primary.add(new ModelRendererTurbo(primary, 442, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-44, -19, -23).setRotationAngle(0, 0, 0).setName("Box 43")
		);
		primary.add(new ModelRendererTurbo(primary, 205, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 6, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-59, -19, -23).setRotationAngle(0, 0, 0).setName("Box 112")
		);
		primary.add(new ModelRendererTurbo(primary, 384, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 6, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -19, -23).setRotationAngle(0, 0, 0).setName("Box 113")
		);
		primary.add(new ModelRendererTurbo(primary, 352, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 6, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57, -21, 17).setRotationAngle(0, 0, 0).setName("Box 115")
		);
		primary.add(new ModelRendererTurbo(primary, 474, 74, textureX, textureY).addBox(0, 0, 0, 11, 2, 6)
			.setRotationPoint(-51, -21, 17).setRotationAngle(0, 0, 0).setName("Box 116")
		);
		primary.add(new ModelRendererTurbo(primary, 264, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 6, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40, -21, -23).setRotationAngle(0, 0, 0).setName("Box 117")
		);
		primary.add(new ModelRendererTurbo(primary, 474, 65, textureX, textureY).addBox(0, 0, 0, 11, 2, 6)
			.setRotationPoint(-51, -21, -23).setRotationAngle(0, 0, 0).setName("Box 118")
		);
		primary.add(new ModelRendererTurbo(primary, 474, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 6, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57, -21, -23).setRotationAngle(0, 0, 0).setName("Box 119")
		);
		primary.add(new ModelRendererTurbo(primary, 0, 48, textureX, textureY).addBox(0, 0, 0, 43, 30, 1)
			.setRotationPoint(-32, -40, 22).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		primary.add(new ModelRendererTurbo(primary, 362, 61, textureX, textureY).addBox(0, 0, 0, 27, 19, 1)
			.setRotationPoint(-59, -40, 22).setRotationAngle(0, 0, 0).setName("Box 201")
		);
		primary.add(new ModelRendererTurbo(primary, 305, 61, textureX, textureY).addBox(0, 0, 0, 27, 19, 1)
			.setRotationPoint(-59, -40, -23).setRotationAngle(0, 0, 0).setName("Box 202")
		);
		primary.add(new ModelRendererTurbo(primary, 295, 103, textureX, textureY).addBox(0, 0, 0, 4, 9, 1)
			.setRotationPoint(-59, -21, 22).setRotationAngle(0, 0, 0).setName("Box 203")
		);
		primary.add(new ModelRendererTurbo(primary, 476, 99, textureX, textureY).addBox(0, 0, 0, 4, 9, 1)
			.setRotationPoint(-36, -21, 22).setRotationAngle(0, 0, 0).setName("Box 204")
		);
		primary.add(new ModelRendererTurbo(primary, 399, 99, textureX, textureY).addBox(0, 0, 0, 4, 9, 1)
			.setRotationPoint(-59, -21, -23).setRotationAngle(0, 0, 0).setName("Box 207")
		);
		primary.add(new ModelRendererTurbo(primary, 352, 97, textureX, textureY).addBox(0, 0, 0, 4, 9, 1)
			.setRotationPoint(-36, -21, -23).setRotationAngle(0, 0, 0).setName("Box 209")
		);
		primary.add(new ModelRendererTurbo(primary, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 72, 1, 46, 0, -2, 0, -1, 0, 0, -1, 0, 0, -1, -2, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-61, -41, -23).setRotationAngle(0, 0, 0).setName("Box 211")
		);
		primary.add(new ModelRendererTurbo(primary, 492, 99, textureX, textureY).addBox(0, 0, 0, 5, 28, 1)
			.setRotationPoint(-32, -39, -23).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		primary.add(new ModelRendererTurbo(primary, 229, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 6, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-59, -19, 17).setRotationAngle(0, 0, 0).setName("Box 111")
		);
		primary.add(new ModelRendererTurbo(primary, 136, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 6, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40, -21, 17).setRotationAngle(0, 0, 0).setName("Box 114")
		);
		primary.add(new ModelRendererTurbo(primary, 451, 47, textureX, textureY).addBox(0, 0, 0, 27, 2, 1)
			.setRotationPoint(-59, -12, 16).setRotationAngle(0, 0, 0).setName("Box 133")
		);
		primary.add(new ModelRendererTurbo(primary, 451, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 7, 1, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-59, -19, 16).setRotationAngle(0, 0, 0).setName("Box 135")
		);
		primary.add(new ModelRendererTurbo(primary, 217, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 2, 1, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57, -21, 16).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		primary.add(new ModelRendererTurbo(primary, 112, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-44, -19, 17).setRotationAngle(0, 0, 0).setName("Box 44")
		);
		primary.add(new ModelRendererTurbo(primary, 235, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-51, -19, 17).setRotationAngle(0, 0, 0).setName("Box 45")
		);
		primary.add(new ModelRendererTurbo(primary, 214, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 6, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -19, 17).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		primary.add(new ModelRendererTurbo(primary, 451, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 7, 1, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-59, -19, -17).setRotationAngle(0, 0, 0).setName("Box 136")
		);
		primary.add(new ModelRendererTurbo(primary, 89, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 2, 1, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57, -21, -17).setRotationAngle(0, 0, 0).setName("Box 138")
		);
		primary.add(new ModelRendererTurbo(primary, 474, 65, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-55, -21, 22).setRotationAngle(0, 0, 0).setName("Box 205")
		);
		primary.add(new ModelRendererTurbo(primary, 159, 64, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-37, -21, 22).setRotationAngle(0, 0, 0).setName("Box 206")
		);
		primary.add(new ModelRendererTurbo(primary, 497, 58, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-55, -21, -23).setRotationAngle(0, 0, 0).setName("Box 208")
		);
		primary.add(new ModelRendererTurbo(primary, 276, 34, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-37, -21, -23).setRotationAngle(0, 0, 0).setName("Box 210")
		);
		primary.add(new ModelRendererTurbo(primary, 162, 106, textureX, textureY)
			.addShapeBox(0, -2, 0, 5, 6, 16, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(58, -17, -23).setRotationAngle(0, 0, 0).setName("Box 28")
		);
		primary.add(new ModelRendererTurbo(primary, 61, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 46, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0)
			.setRotationPoint(36, -19, -23).setRotationAngle(0, 0, 0).setName("Box 29")
		);
		primary.add(new ModelRendererTurbo(primary, 384, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 46, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0)
			.setRotationPoint(51, -19, -23).setRotationAngle(0, 0, 0).setName("Box 30")
		);
		primary.add(new ModelRendererTurbo(primary, 217, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32, -19, -23).setRotationAngle(0, 0, 0).setName("Box 31")
		);
		primary.add(new ModelRendererTurbo(primary, 0, 188, textureX, textureY).addBox(0, 0, 0, 3, 7, 46)
			.setRotationPoint(55, -19, -23).setRotationAngle(0, 0, 0).setName("Box 32")
		);
		primary.add(new ModelRendererTurbo(primary, 213, 101, textureX, textureY)
			.addShapeBox(0, -2, 0, 5, 3, 46, 0, 0, 0, 0, 0, -1, -2, 0, -1, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(58, -24, -23).setRotationAngle(0, 0, 0).setName("Box 37")
		);
		primary.add(new ModelRendererTurbo(primary, 0, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 7, 44, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36, -26, -22).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		primary.add(new ModelRendererTurbo(primary, 449, 99, textureX, textureY)
			.addShapeBox(0, -2, 0, 5, 6, 16, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(58, -17, 7).setRotationAngle(0, 0, 0).setName("Box 49")
		);
		primary.add(new ModelRendererTurbo(primary, 442, 99, textureX, textureY)
			.addShapeBox(0, -2, 0, 5, 4, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(58, -21, -13).setRotationAngle(0, 0, 0).setName("Box 53")
		);
		primary.add(new ModelRendererTurbo(primary, 138, 92, textureX, textureY)
			.addShapeBox(0, -2, 0, 5, 4, 6, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(58, -21, 7).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		primary.add(new ModelRendererTurbo(primary, 235, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 4, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34, -23, 22).setRotationAngle(0, 0, 0).setName("Box 63")
		);
		primary.add(new ModelRendererTurbo(primary, 266, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 4, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34, -23, -23).setRotationAngle(0, 0, 0).setName("Box 64")
		);
		primary.add(new ModelRendererTurbo(primary, 499, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32, -19, 22).setRotationAngle(0, 0, 0).setName("Box 66")
		);
		primary.add(new ModelRendererTurbo(primary, 55, 208, textureX, textureY).addBox(0, 0, 0, 2, 20, 44)
			.setRotationPoint(11, -30, -22).setRotationAngle(0, 0, 0).setName("Box 73")
		);
		primary.add(new ModelRendererTurbo(primary, 217, 79, textureX, textureY).addBox(0, 0, 0, 22, 3, 1)
			.setRotationPoint(36, -26, 22).setRotationAngle(0, 0, 0).setName("Box 74")
		);
		primary.add(new ModelRendererTurbo(primary, 89, 76, textureX, textureY).addBox(0, 0, 0, 22, 3, 1)
			.setRotationPoint(36, -26, -23).setRotationAngle(0, 0, 0).setName("Box 75")
		);
		primary.add(new ModelRendererTurbo(primary, 391, 147, textureX, textureY).addBox(0, 0, 0, 1, 30, 1)
			.setRotationPoint(11, -40, 22).setRotationAngle(0, 0, 0).setName("Box 93")
		);
		primary.add(new ModelRendererTurbo(primary, 0, 145, textureX, textureY).addBox(0, 0, 0, 1, 30, 1)
			.setRotationPoint(11, -40, -23).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		primary.add(new ModelRendererTurbo(primary, 87, 106, textureX, textureY).addBox(0, 0, 0, 14, 1, 46)
			.setRotationPoint(25, -41, -23).setRotationAngle(0, 0, 0).setName("Box 95")
		);
		primary.add(new ModelRendererTurbo(primary, 120, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 15, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8, 0, 0, 8, 0, 0, 8, 0, 0, -8, 0, 0)
			.setRotationPoint(37, -41, 22).setRotationAngle(0, 0, 0).setName("Box 96")
		);
		primary.add(new ModelRendererTurbo(primary, 241, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 15, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8, 0, 0, 8, 0, 0, 8, 0, 0, -8, 0, 0)
			.setRotationPoint(37, -41, -23).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		primary.add(new ModelRendererTurbo(primary, 405, 116, textureX, textureY).addBox(0, 0, 0, 2, 14, 1)
			.setRotationPoint(36, -40, 22).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		primary.add(new ModelRendererTurbo(primary, 140, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38, -29, 22).setRotationAngle(0, 0, 0).setName("Box 101")
		);
		primary.add(new ModelRendererTurbo(primary, 140, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38, -29, -23).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		primary.add(new ModelRendererTurbo(primary, 505, 4, textureX, textureY).addBox(0, 0, 0, 2, 14, 1)
			.setRotationPoint(36, -40, -23).setRotationAngle(0, 0, 0).setName("Box 104")
		);
		primary.add(new ModelRendererTurbo(primary, 0, 25, textureX, textureY).addBox(0, 0, 0, 21, 2, 1)
			.setRotationPoint(12, -12, 22).setRotationAngle(0, 0, 0).setName("Box 171")
		);
		primary.add(new ModelRendererTurbo(primary, 487, 99, textureX, textureY).addBox(0, 0, 0, 1, 14, 1)
			.setRotationPoint(35, -40, -23).setRotationAngle(0, 0, 0).setName("Box 185")
		);
		primary.add(new ModelRendererTurbo(primary, 191, 12, textureX, textureY).addBox(0, 0, 0, 43, 1, 1)
			.setRotationPoint(-32, -40, -23).setRotationAngle(0, 0, 0).setName("Box 200")
		);
		primary.add(new ModelRendererTurbo(primary, 367, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 46, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11, -41, -23).setRotationAngle(0, 0, 0).setName("Box 213")
		);
		primary.add(new ModelRendererTurbo(primary, 360, 143, textureX, textureY).addBox(0, 0, 0, 2, 28, 1)
			.setRotationPoint(9, -39, -23).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		primary.add(new ModelRendererTurbo(primary, 162, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 46, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(40, -19, -23).setRotationAngle(0, 0, 0).setName("Box 33")
		);
		primary.add(new ModelRendererTurbo(primary, 329, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 46, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(47, -19, -23).setRotationAngle(0, 0, 0).setName("Box 34")
		);
		primary.add(new ModelRendererTurbo(primary, 451, 25, textureX, textureY).addBox(0, 0, 0, 27, 2, 1)
			.setRotationPoint(-59, -12, -17).setRotationAngle(0, 0, 0).setName("Box 134")
		);
		primary.add(new ModelRendererTurbo(primary, 0, 21, textureX, textureY).addBox(0, 0, 0, 21, 2, 1)
			.setRotationPoint(12, -12, -23).setRotationAngle(0, 0, 0).setName("Box 172")
		);
		primary.add(new ModelRendererTurbo(primary, 59, 132, textureX, textureY).addBox(0, 0, 0, 3, 2, 6)
			.setRotationPoint(-47, -19, -23).setRotationAngle(0, 0, 0).setName("Box 46cp")
		);
		primary.add(new ModelRendererTurbo(primary, 23, 132, textureX, textureY).addBox(0, 0, 0, 3, 2, 6)
			.setRotationPoint(-47, -19, 17).setRotationAngle(0, 0, 0).setName("Box 47cp")
		);
		primary.add(new ModelRendererTurbo(primary, 39, 96, textureX, textureY).addBox(0, 0, 0, 1, 14, 1)
			.setRotationPoint(35, -40, 22).setRotationAngle(0, 0, 0).setName("Box 177")
		);
		primary.add(new ModelRendererTurbo(primary, 250, 116, textureX, textureY).addBox(0, 0, 0, 2, 27, 1)
			.setRotationPoint(-61, -40, -23).setRotationAngle(0, 0, 0).setName("Box 214cp")
		);
		primary.add(new ModelRendererTurbo(primary, 505, 99, textureX, textureY).addBox(0, 0, 0, 2, 27, 1)
			.setRotationPoint(-61, -40, 22).setRotationAngle(0, 0, 0).setName("Box 212cp")
		);
		primary.addProgram(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(primary);
		//
		TurboList door_back = new TurboList("door_back");
		door_back.add(new ModelRendererTurbo(door_back, 0, 242, textureX, textureY).addBox(-1, 0, 0, 1, 26, 42)
			.setRotationPoint(-60, -39, -21).setRotationAngle(0, 0, 0).setName("Box 219")
		);
		door_back.add(new ModelRendererTurbo(door_back, 28, 116, textureX, textureY).addBox(-1.5f, 23, 0, 1, 1, 6)
			.setRotationPoint(-60, -39, -3).setRotationAngle(0, 0, 0).setName("Box 220")
		);
		door_back.add(new ModelRendererTurbo(door_back, 35, 141, textureX, textureY).addBox(0, 0, 0, 1, 16, 1)
			.setRotationPoint(-58, -38, -21).setRotationAngle(0, 0, 0).setName("Box 221")
		);
		door_back.add(new ModelRendererTurbo(door_back, 30, 141, textureX, textureY).addBox(0, 0, 0, 1, 16, 1)
			.setRotationPoint(-58, -38, 20).setRotationAngle(0, 0, 0).setName("Box 222")
		);
		door_back.addPrograms(new DefaultPrograms.AttributeRotator("c4_door_back", true, 0, 120, 0.5f, 2, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_back);
		//
		TurboList door_left = new TurboList("door_left");
		door_left.add(new ModelRendererTurbo(door_left, 0, 80, textureX, textureY)
			.addShapeBox(-24, 0, 0, 20, 7, 1, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36, -19, 22).setRotationAngle(0, 0, 0).setName("Box 173")
		);
		door_left.add(new ModelRendererTurbo(door_left, 358, 82, textureX, textureY)
			.addShapeBox(-24, 0, 0, 22, 4, 1, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36, -23, 22).setRotationAngle(0, 0, 0).setName("Box 174")
		);
		door_left.add(new ModelRendererTurbo(door_left, 89, 64, textureX, textureY).addBox(-24, 0, 0, 24, 3, 1)
			.setRotationPoint(36, -26, 22).setRotationAngle(0, 0, 0).setName("Box 175")
		);
		door_left.add(new ModelRendererTurbo(door_left, 396, 147, textureX, textureY).addBox(-24, 0, 0, 1, 14, 1)
			.setRotationPoint(36, -40, 22).setRotationAngle(0, 0, 0).setName("Box 176")
		);
		door_left.add(new ModelRendererTurbo(door_left, 311, 82, textureX, textureY).addBox(-23, 0, 0, 22, 1, 1)
			.setRotationPoint(36, -40, 22).setRotationAngle(0, 0, 0).setName("Box 178")
		);
		door_left.add(new ModelRendererTurbo(door_left, 34, 43, textureX, textureY).addBox(-21, 0, 0.5f, 3, 1, 1)
			.setRotationPoint(36, -23, 22).setRotationAngle(0, 0, 0).setName("Box 179")
		);
		door_left.add(new ModelRendererTurbo(door_left, 39, 96, textureX, textureY).addBox(-1, 0, 0, 1, 14, 1)
			.setRotationPoint(36, -40, 22).setRotationAngle(0, 0, 0).setName("Box 177")
		);
		door_left.addPrograms(new DefaultPrograms.AttributeRotator("c4_door_left", true, 0, 72, 0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_left);
		//
		TurboList door_right = new TurboList("door_right");
		door_right.add(new ModelRendererTurbo(door_right, 0, 29, textureX, textureY)
			.addShapeBox(-24, 0, -1, 20, 7, 1, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36, -19, -22).setRotationAngle(0, 0, 0).setName("Box 180cp")
		);
		door_right.add(new ModelRendererTurbo(door_right, 264, 82, textureX, textureY)
			.addShapeBox(-24, 0, -1, 22, 4, 1, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36, -23, -22).setRotationAngle(0, 0, 0).setName("Box 181cp")
		);
		door_right.add(new ModelRendererTurbo(door_right, 451, 51, textureX, textureY)
			.addShapeBox(-24, 0, -1, 24, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36, -26, -22).setRotationAngle(0, 0, 0).setName("Box 182cp")
		);
		door_right.add(new ModelRendererTurbo(door_right, 37, 18, textureX, textureY)
			.addShapeBox(-21, 0, -1.5f, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36, -23, -22).setRotationAngle(0, 0, 0).setName("Box 183cp")
		);
		door_right.add(new ModelRendererTurbo(door_right, 204, 134, textureX, textureY)
			.addShapeBox(-24, 0, -1, 1, 14, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36, -40, -22).setRotationAngle(0, 0, 0).setName("Box 184cp")
		);
		door_right.add(new ModelRendererTurbo(door_right, 89, 81, textureX, textureY)
			.addShapeBox(-23, 0, -1, 22, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36, -40, -22).setRotationAngle(0, 0, 0).setName("Box 186cp")
		);
		door_right.add(new ModelRendererTurbo(door_right, 487, 99, textureX, textureY)
			.addShapeBox(-1, 0, -1, 1, 14, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36, -40, -22).setRotationAngle(0, 0, 0).setName("Box 185cp")
		);
		door_right.addPrograms(new DefaultPrograms.AttributeRotator("c4_door_right", true, -72, 0, -0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_right);
		//
		TurboList door_side = new TurboList("door_side");
		door_side.add(new ModelRendererTurbo(door_side, 89, 48, textureX, textureY).addBox(0, 0, -1, 36, 14, 1)
			.setRotationPoint(-27, -26, -22).setRotationAngle(0, 0, 0).setName("Box 235")
		);
		door_side.add(new ModelRendererTurbo(door_side, 237, 45, textureX, textureY).addBox(0, 0, -0.9f, 36, 1, 1)
			.setRotationPoint(-27, -25, -22).setRotationAngle(0, 0, 0).setName("Box 236")
		);
		door_side.add(new ModelRendererTurbo(door_side, 127, 132, textureX, textureY).addBox(0, 0, -1, 1, 12, 1)
			.setRotationPoint(8, -38, -22).setRotationAngle(0, 0, 0).setName("Box 237")
		);
		door_side.add(new ModelRendererTurbo(door_side, 504, 128, textureX, textureY).addBox(0, 0, -1, 1, 12, 1)
			.setRotationPoint(-27, -38, -22).setRotationAngle(0, 0, 0).setName("Box 238")
		);
		door_side.add(new ModelRendererTurbo(door_side, 191, 42, textureX, textureY).addBox(0, 0, -1, 36, 1, 1)
			.setRotationPoint(-27, -39, -22).setRotationAngle(0, 0, 0).setName("Box 239")
		);
		door_side.add(new ModelRendererTurbo(door_side, 234, 61, textureX, textureY).addBox(0, 0, -1, 34, 12, 1)
			.setRotationPoint(-26, -38, -22).setRotationAngle(0, 0, 0).setName("Box 240")
		);
		door_side.add(new ModelRendererTurbo(door_side, 229, 106, textureX, textureY).addBox(0, 0, -1.5f, 3, 1, 2)
			.setRotationPoint(4, -23, -22).setRotationAngle(0, 0, 0).setName("Box 246")
		);
		door_side.addPrograms(new TurboList.Program(){
			
			private Attribute<?> attr;
			private Float offx, offz;

			@Override
			public void preRender(TurboList list, Entity ent, VehicleData data, Colorable color, String part, RenderCache cache){
				if(cache == null) return;
				attr = data.getAttribute("c4_door_side");
				if(attr == null) return;
				offx = cache.getValue("c4_side_offx");
				offz = cache.getValue("c4_side_offz");
				if(attr.boolean_value()){
					offx = offx == null ? 0 : offx >= 2 ? 2 : offx + Static.sixteenth;
				}
				else{
					offx = offx == null ? 2 : offx <= 0 ? 0 : offx - Static.sixteenth;
				}
				offz = offx == null ? 0 : offx > 0.5f ? Static.eighth : offx <= 0.1f ? 0 : Static.sixteenth;
				cache.setValue("c4_side_offx", offx);
				cache.setValue("c4_side_offz", offz);
				if(offx != null) GL11.glTranslatef(-offx, 0, -offz);
			}

			@Override
			public void postRender(TurboList list, Entity ent, VehicleData data, Colorable color, String part, RenderCache cache){
				if(offx != null) GL11.glTranslatef(offx, 0, offz);
				offx = null;
			}
			
		}, DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_side);
		
	}

}
