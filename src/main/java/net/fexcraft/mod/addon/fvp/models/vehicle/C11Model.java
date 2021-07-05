//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.vehicle;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.data.root.Colorable;
import net.fexcraft.mod.fvtm.data.root.RenderCache;
import net.fexcraft.mod.fvtm.data.vehicle.VehicleData;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.model.VehicleModel;
import net.minecraft.entity.Entity;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.3.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/vehicle/c11")
public class C11Model extends VehicleModel {

	public C11Model(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList primary = new TurboList("primary");
		primary.add(new ModelRendererTurbo(primary, 434, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1, -9, 0, 0, 9, 0, 0, 9, 0, 0, -9, 0, 0)
			.setRotationPoint(8.5f, -22.5f, 18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 283, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 36, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.5f, -23.5f, -18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 166, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 42, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -1, -0.5f, -1, -2, -0.5f, -1, -2, 0, 0, -1)
			.setRotationPoint(48, 4, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 40, 0, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, -1)
			.setRotationPoint(-50, 3, -20).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 330, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 42, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(42, 4, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 389, 0, textureX, textureY)
			.addShapeBox(0, -1, 0, 46, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23, 5, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 335, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(42, -1, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 477, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -1, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 464, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -7, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 4, 2, 0, 0, 0, -0.5f, 0, -1.5f, -0.5f, 0, -1, 0, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34, -11, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 295, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(42, -7, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 278, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -3, 0, 0.5f, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(22, -6, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 15, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -1.5f, 0, 0.5f, -1.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(22, -4, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 423, 104, textureX, textureY)
			.addShapeBox(1, 0, 0, 2, 5, 2, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -1, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 295, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -3, 0, 0.5f, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(22, -7, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 493, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -3, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -3, 0, 0)
			.setRotationPoint(36, -6, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 436, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(39, -4, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 414, 104, textureX, textureY)
			.addShapeBox(1, 0, 0, 2, 5, 2, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(39, -1, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 85, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -3, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -3, 0, 0)
			.setRotationPoint(33, -7, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 150, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(42, -1, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 55, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -1, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 134, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(18, -7, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 131, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 4, 2, 0, 0, 0.5f, 0, 0, -1, 0, 0, -1.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(34, -11, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(42, -7, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 299, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(22, -4, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 362, 104, textureX, textureY)
			.addShapeBox(1, 0, 0, 2, 5, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -1, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 295, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -3, 0, 0, -3, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(22, -7, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 453, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -3, 0, 0, 0, 0, 0, 0, 0, 0.5f, -3, 0, 0.5f)
			.setRotationPoint(36, -6, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 221, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -1.5f, 0, 0.5f)
			.setRotationPoint(39, -4, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 353, 104, textureX, textureY)
			.addShapeBox(1, 0, 0, 2, 5, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(39, -1, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 404, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -3, 0, 0, 0, 0, 0, 0, 0, 0.5f, -3, 0, 0.5f)
			.setRotationPoint(33, -7, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 199, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -3, 0, 0, -3, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(22, -6, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 292, 0, textureX, textureY)
			.addShapeBox(0, -1, 0, 46, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-23, 5, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 90, 128, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(41, 5, 9).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 240, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 4, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -11, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 47, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 4, 2, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(18, -11, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 199, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 3, 4, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 0, 0)
			.setRotationPoint(34, -11.5f, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 351, 60, textureX, textureY).addBox(0, 0, 0, 16, 3, 4)
			.setRotationPoint(18, -11.5f, 15).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 458, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 3, 4, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 0, 0)
			.setRotationPoint(34, -11.5f, 15).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 236, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 42, 0, 0, -0.5f, 0.5f, 0, -0.5f, -2, 0, -0.5f, -2, 0, -0.5f, 0.5f, 0, 0, 0.25f, 0, 0, -2, 0, 0, -2, 0, 0, 0.25f)
			.setRotationPoint(48, -1.5f, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 72, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 43, 0, 0, 0, 0, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, 0)
			.setRotationPoint(48, -7, -21.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 113, textureX, textureY).addBox(0, 0, 0, 2, 11, 7)
			.setRotationPoint(46, -7, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 170, 108, textureX, textureY).addBox(0, 0, 0, 2, 11, 7)
			.setRotationPoint(46, -7, 12).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 144, 78, textureX, textureY).addBox(0, 0, 0, 2, 4, 1)
			.setRotationPoint(47.75f, -5, 12).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 278, 77, textureX, textureY).addBox(0, 0, 0, 2, 4, 1)
			.setRotationPoint(47.75f, -5, -12.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 151, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 38, 0, 0, 0, 0, -2, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(46, -10, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 342, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 3, 0, 0, -0.5f, -1.5f, 0, -1.5f, -1.75f, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(46, -10, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 269, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22, -1, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 160, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-22, -7, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 363, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 4, 2, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-22, -11, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 43, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 6, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22, -7, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 4, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22, -11, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 369, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -3, 0, 0.5f, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -6, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 72, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -1.5f, 0, 0.5f, -1.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -4, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 298, 104, textureX, textureY)
			.addShapeBox(1, 0, 0, 2, 5, 2, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-43, -1, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 352, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -3, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -3, 0, 0)
			.setRotationPoint(-28, -6, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 162, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-25, -4, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 245, 104, textureX, textureY)
			.addShapeBox(1, 0, 0, 2, 5, 2, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-25, -1, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 85, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -3, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -3, 0, 0)
			.setRotationPoint(-31, -7, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 308, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-42, -4, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 392, 103, textureX, textureY)
			.addShapeBox(1, 0, 0, 2, 5, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-43, -1, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 404, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -3, 0, 0, -3, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-42, -7, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 106, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -3, 0, 0, 0, 0, 0, 0, 0, 0.5f, -3, 0, 0.5f)
			.setRotationPoint(-28, -6, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 162, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -1.5f, 0, 0.5f)
			.setRotationPoint(-25, -4, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 289, 103, textureX, textureY)
			.addShapeBox(1, 0, 0, 2, 5, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-25, -1, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 85, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -3, 0, 0, 0, 0, 0, 0, 0, 0.5f, -3, 0, 0.5f)
			.setRotationPoint(-31, -7, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 55, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -3, 0, 0, -3, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-42, -6, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 360, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 4, 2, 0, 0, 0.5f, 1, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-42, -11, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 315, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 4, 2, 0, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -11, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 226, 83, textureX, textureY)
			.addShapeBox(0, -1, 0, 6, 2, 2, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-48, 5, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 335, 82, textureX, textureY)
			.addShapeBox(0, -1, 0, 6, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, -1, -1)
			.setRotationPoint(-48, 5, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 400, 120, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-42, 5, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 324, 120, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-42, 5, 9).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 278, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 3, 0, 0, 0, 0, 0, -1, 0, 0, -1.5f, -1.75f, 0, -0.5f, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(46, -10, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 226, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 5, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22, -1, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 395, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 36, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50, 1, -18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 354, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 36, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-50, -1, -18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 131, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-50, -4, -18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 372, 77, textureX, textureY)
			.addShapeBox(0, -1, 0, 6, 1, 2, 0, 0, 0, 0, 0, 0, 0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, 4, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 162, 50, textureX, textureY)
			.addShapeBox(0, -1, 0, 6, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-48, 4, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 438, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.1f, 0, 0, 0)
			.setRotationPoint(-48, -1, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 421, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0)
			.setRotationPoint(-48, -7, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 2, 0, 0, 0, 1.5f, 0, 0.5f, 1, 0, 0, -1.5f, 0, -0.5f, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f)
			.setRotationPoint(-48, -11, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 493, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 2, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.1f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, -1, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 152, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 2, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, -7, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 55, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 2, 0, 0, -0.5f, -2, 0, 0, -1.5f, 0, 0.5f, 1, 0, 0, 1.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, -11, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 54, 170, textureX, textureY).addBox(0, 0, 0, 2, 3, 28)
			.setRotationPoint(-50, -7, -14).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 464, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 3, 0, 0, 0, -1.5f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-50, -4, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 211, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 3, 0, -0.5f, 0, -1.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50, 1, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 177, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 3, 0, -0.5f, 0, -1.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-50, -1, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 166, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -1.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1.5f)
			.setRotationPoint(-50, -4, 18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 70, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(-50, 1, 18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 68, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1.5f)
			.setRotationPoint(-50, -1, 18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 60, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 2.5f, 0, -1, -1.5f, -1, 0, -0.5f, -1, 0, 0, 0, -0.5f, -1.5f, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50, -11, -20).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 26, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 2.5f, 0, -0.5f, -1.5f, 0, 0, 0, 0, 0, -0.5f, -1, -1, -1.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f)
			.setRotationPoint(-50, -11, 17.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 199, 60, textureX, textureY).addBox(0, 0, 0, 16, 3, 4)
			.setRotationPoint(18, -11.5f, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 19, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 11, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1, -9, 0, 0, 9, 0, 0, 9, 0, 0, -9, 0, 0)
			.setRotationPoint(8.5f, -22.5f, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 496, 31, textureX, textureY)
			.addShapeQuad(0, 0, 0, 2, 2, 0, 0, -0.5f, 1.25f, -2, 0, 0, 0, 0, 2.5f, 0, 0, 0)
			.setRotationPoint(48, -9, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 507, 23, textureX, textureY)
			.addShapeQuad(0, 0, 0, 2, 2, 0, 0, 0, 0, -2, -0.5f, -1.25f, -2, 0, 0, -2, 0, -2.5f)
			.setRotationPoint(48, -9, 19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 287, 120, textureX, textureY)
			.addShapeBox(0, -1, 0, 1, 2, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41, 5, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 444, 95, textureX, textureY).addBox(0, 0, 0, 2, 8, 1)
			.setRotationPoint(-5, -11.5f, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 167, 87, textureX, textureY).addBox(0, 0, 0, 2, 8, 1)
			.setRotationPoint(-5, -11.5f, 18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 47, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 38, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f)
			.setRotationPoint(-32, -11.5f, -19).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 85, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -3, 0, 0.5f, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -7, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 102, 140, textureX, textureY).addBox(0, 0, 0, 2, 1, 30)
			.setRotationPoint(18, -11.5f, -15).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(19, -11.25f, 19.5f).setRotationAngle(15, 10, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 11, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0)
			.setRotationPoint(19.625f, -12.75f, 21.25f).setRotationAngle(0, -4, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 145, textureX, textureY)
			.addShapeBox(0, 0, -4, 1, 1, 4, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19, -11.25f, -19.5f).setRotationAngle(-15, -10, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 11, 145, textureX, textureY)
			.addShapeBox(0, 0, -3, 1, 2, 3, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0)
			.setRotationPoint(19.625f, -12.75f, -21.25f).setRotationAngle(0, 4, 0)
		);
		primary.addProgram(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(primary);
		//
		TurboList outer_chassis = new TurboList("outer_chassis");
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 267, 45, textureX, textureY).addBox(0, 0, 0, 20, 1, 7)
			.setRotationPoint(22, -8, -19).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 107, 5, textureX, textureY).addBox(0, 0, 0, 45, 1, 8)
			.setRotationPoint(-23, 5, 11).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 123, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-48, 4, 11).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 132, 41, textureX, textureY).addBox(0, 0, 0, 20, 1, 7)
			.setRotationPoint(22, -8, 12).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 0, 5, textureX, textureY).addBox(0, 0, 0, 45, 1, 8)
			.setRotationPoint(-23, 5, -19).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 196, 5, textureX, textureY).addBox(0, 0, 0, 43, 1, 18)
			.setRotationPoint(-21, 5, -9).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 278, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(-48, 4, -19).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 66, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 18, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-46, 4, -9).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 452, 73, textureX, textureY).addBox(0, 0, 0, 11, 1, 18)
			.setRotationPoint(-32, 5, -9).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 0, 60, textureX, textureY).addBox(0, 0, 0, 18, 1, 5)
			.setRotationPoint(-41, -8, -19).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 440, 58, textureX, textureY).addBox(0, 0, 0, 18, 1, 5)
			.setRotationPoint(-41, -8, 14).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 41, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 42, 0, 0, -0.5f, 0.25f, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, 0, -0.5f, 0.25f, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, 0)
			.setRotationPoint(48, 1, -21).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 29, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0.5f, 24, 0, 0, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.0625f, 0)
			.setRotationPoint(47.5f, -5, -11.5f).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 337, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0.5f, 24, 0, 0, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.0625f, 0)
			.setRotationPoint(47.5f, -4.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 225, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0.5f, 24, 0, 0, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.0625f, 0)
			.setRotationPoint(47.5f, -4, -11.5f).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 196, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0.5f, 24, 0, 0, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.0625f, 0)
			.setRotationPoint(47.5f, -3.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 308, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0.5f, 24, 0, 0, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.0625f, 0)
			.setRotationPoint(47.5f, -3, -11.5f).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 255, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0.5f, 24, 0, 0, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.0625f, 0)
			.setRotationPoint(47.5f, -2.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 0, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0.5f, 24, 0, 0, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.0625f, 0)
			.setRotationPoint(47.5f, -2, -11.5f).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 367, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0.5f, 24, 0, 0, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.0625f, 0)
			.setRotationPoint(47.5f, -1.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 443, 158, textureX, textureY).addBox(0, 0, 0, 2, 5, 24)
			.setRotationPoint(46, -1, -12).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 167, 144, textureX, textureY).addBox(0, 0, 0, 2, 2, 24)
			.setRotationPoint(46, -7, -12).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 0, 45, textureX, textureY).addBox(0, 0, 0, 12, 1, 3)
			.setRotationPoint(14, 5.125f, 8).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 404, 5, textureX, textureY).addBox(0, 0, 0, 25, 1, 24)
			.setRotationPoint(-48, -2, -12).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 199, 76, textureX, textureY).addBox(0, 0, 0, 7, 1, 7)
			.setRotationPoint(-48, -2, -19).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 350, 75, textureX, textureY).addBox(0, 0, 0, 7, 1, 7)
			.setRotationPoint(-48, -2, 12).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 312, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(-41, -8, -14).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 406, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-41, -8, 13).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 243, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0)
			.setRotationPoint(-42, -8, -19).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 435, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 6, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -8, 13).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 363, 227, textureX, textureY).addBox(0, 0, 0, 1, 6, 38)
			.setRotationPoint(-48, -8, -19).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 206, 5, textureX, textureY).addCylinder(-0.125f, 0, 0, 1, 1, 16, 1, 1, 3, null)
			.setRotationPoint(-50, -5.5f, 0).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 85, 15, textureX, textureY).addBox(0, 0, 0, 24, 1, 24)
			.setRotationPoint(-48, -2, -12).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 125, 211, textureX, textureY).addBox(0, 0, 0, 1, 16, 38)
			.setRotationPoint(-23, -10.5f, -19).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 281, 5, textureX, textureY).addBox(0, 0, 0, 42, 1, 38)
			.setRotationPoint(-22, 4, -19).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 322, 210, textureX, textureY).addBox(0, 0, 0, 1, 16, 38)
			.setRotationPoint(17.5f, -11, -19).setRotationAngle(0, 0, -5)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 0, 4, textureX, textureY).addCylinder(-0.125f, 0, 0, 1, 1, 16, 1, 1, 3, null)
			.setRotationPoint(49.25f, -6.5f, 0).setRotationAngle(0, 0, -5)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 479, 23, textureX, textureY).addBox(0, 0, 0, 12, 1, 3)
			.setRotationPoint(14, 5.125f, -11).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 322, 52, textureX, textureY)
			.addShapeBox(0, 0, -1, 19, 4, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22, -7, 19).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 121, 50, textureX, textureY)
			.addShapeBox(0, 0, -1, 19, 4, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22, -11, 19).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 446, 49, textureX, textureY)
			.addShapeBox(0, -4, -1, 19, 7, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22, 1, 19).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 405, 49, textureX, textureY)
			.addShapeBox(0, 0, -1, 19, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-22, -7, -18).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 228, 46, textureX, textureY)
			.addShapeBox(0, 0, -1, 19, 4, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-22, -11, -18).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 187, 45, textureX, textureY)
			.addShapeBox(0, -4, -1, 19, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22, 1, -18).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 368, 89, textureX, textureY).addBox(0, 0, -1, 1, 1, 2)
			.setRotationPoint(18.5f, -12, -11).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 361, 89, textureX, textureY).addBox(0, 0, -1, 1, 1, 2)
			.setRotationPoint(18.5f, -12, 3.5f).setRotationAngle(0, 0, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 0, 151, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(19.625f, -12.75f, 21.25f).setRotationAngle(0, -4, 0)
		);
		outer_chassis.add(new ModelRendererTurbo(outer_chassis, 11, 151, textureX, textureY)
			.addShapeBox(-0.5f, 0, -3, 1, 2, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(19.625f, -12.75f, -21.25f).setRotationAngle(0, 4, 0)
		);
		this.groups.add(outer_chassis);
		//
		TurboList inner_chassis = new TurboList("inner_chassis");
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 198, 102, textureX, textureY).addBox(0, 0, 0, 2, 2, 8)
			.setRotationPoint(31, 1, 8).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 0, 36, textureX, textureY).addBox(0, 0, 0, 12, 6, 2)
			.setRotationPoint(26, 0, 6).setRotationAngle(20, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 0, 74, textureX, textureY).addBox(0, 0, 0, 10, 1, 3)
			.setRotationPoint(-37, -1, -12).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 195, 0, textureX, textureY).addBox(0, -1, -1, 46, 2, 2)
			.setRotationPoint(-32, 6, 10).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 338, 142, textureX, textureY).addBox(0, 0, 0, 2, 2, 24)
			.setRotationPoint(-48, 3, -12).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 461, 131, textureX, textureY).addBox(-1, 0, 0, 2, 1, 18)
			.setRotationPoint(-26, 5.5f, -9).setRotationAngle(0, 0, 15)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 153, 102, textureX, textureY).addBox(0, 0, -8, 2, 2, 8)
			.setRotationPoint(31, 1, -8).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 0, 27, textureX, textureY).addBox(0, 0, -2, 12, 6, 2)
			.setRotationPoint(26, 0, -6).setRotationAngle(-20, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 243, 115, textureX, textureY).addBox(0, 0, 0, 3, 1, 16)
			.setRotationPoint(23, 5.5f, -8).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 0, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(26, 5, 6).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 479, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26, 5, -10).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 55, 69, textureX, textureY).addBox(0, 0, 0, 10, 1, 3)
			.setRotationPoint(-37, -1, 9).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 98, 0, textureX, textureY).addBox(0, -1, -1, 46, 2, 2)
			.setRotationPoint(-32, 6, -10).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 0, 15, textureX, textureY)
			.addShapeBox(0, -1, -1, 12, 2, 2, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0)
			.setRotationPoint(14, 6, 10).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 479, 11, textureX, textureY)
			.addShapeBox(0, -1, -1, 12, 2, 2, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 0)
			.setRotationPoint(14, 6, -10).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 385, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 20, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, -1, -2, 0, -1, -2, 0, 0, -1)
			.setRotationPoint(38, 5, -10).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 493, 73, textureX, textureY)
			.addShapeBox(0, -1, -1, 6, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-38, 6, 10).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 257, 69, textureX, textureY)
			.addShapeBox(0, -1, -1, 6, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-38, 6, -10).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 487, 63, textureX, textureY)
			.addShapeBox(0, -2, -1, 8, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-46, 6, 10).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 203, 54, textureX, textureY)
			.addShapeBox(0, -2, -1, 8, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-46, 6, -10).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 404, 12, textureX, textureY).addBox(0, 0, 0, 10, 5, 1)
			.setRotationPoint(-37, 0, -9.5f).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 404, 5, textureX, textureY).addBox(0, 0, 0, 10, 5, 1)
			.setRotationPoint(-37, 0, 8.5f).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 123, 101, textureX, textureY).addBox(0, 0, 0, 2, 2, 8)
			.setRotationPoint(-33, 1, 7).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 47, 101, textureX, textureY).addBox(0, 0, -8, 2, 2, 8)
			.setRotationPoint(-33, 1, -8).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 464, 101, textureX, textureY).addBox(0, 0, 0, 3, 3, 16)
			.setRotationPoint(-33.5f, 0.5f, -8).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 247, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -1, 2, 0, -1, 2, 0, 1, -2, 0, 1)
			.setRotationPoint(-27, 1, -12).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 122, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 1, 2, 0, 1, 2, 0, -1, -2, 0, -1)
			.setRotationPoint(-27, 1, 10).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 0, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 24, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27, -1, -12).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 199, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, -1, -2, 0, -1, -2, 0, 1, 2, 0, 1)
			.setRotationPoint(-39, 1, -12).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 233, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, -2, 0, 1, -2, 0, -1, 2, 0, -1)
			.setRotationPoint(-39, 1, 10).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 432, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 24, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39, -1, -12).setRotationAngle(0, 0, 0)
		);
		inner_chassis.add(new ModelRendererTurbo(inner_chassis, 264, 120, textureX, textureY).addBox(-1, 0, 0, 2, 1, 18)
			.setRotationPoint(11, 5.5f, -9).setRotationAngle(0, 0, 15)
		);
		this.groups.add(inner_chassis);
		//
		TurboList exhaust = new TurboList("exhaust");
		exhaust.add(new ModelRendererTurbo(exhaust, 179, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.5f, 3.5f, -12.5f).setRotationAngle(0, 0, 0)
		);
		exhaust.add(new ModelRendererTurbo(exhaust, 424, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1.5f, 1.5f, 0, 0, 0, 0, 0, -1, -5, 0, -1, 5, 0, 0, 0, 0, 0, 0, 0, 1, -5, 0, 1, 5, 0, 0, 0)
			.setRotationPoint(-48.5f, 3.5f, -12.5f).setRotationAngle(0, 0, 0)
		);
		exhaust.add(new ModelRendererTurbo(exhaust, 85, 31, textureX, textureY).addBox(0, 0, 0, 8, 1.5f, 3.5f)
			.setRotationPoint(-41.5f, 5, -8.5f).setRotationAngle(0, 0, 5.5f)
		);
		exhaust.add(new ModelRendererTurbo(exhaust, 0, 0, textureX, textureY).addBox(4, 0, 0, 47, 1.5f, 1.5f)
			.setRotationPoint(-38, 5.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		exhaust.add(new ModelRendererTurbo(exhaust, 158, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 10.5f, 1.5f, 1.5f, 0, 0, 0, 0, 0, 1, -7, 0, 1, 7, 0, 0, 0, 0, 0, 0, 0, -1, -7, 0, -1, 7, 0, 0, 0)
			.setRotationPoint(13, 5.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(exhaust);
		//
		TurboList wipers = new TurboList("wipers");
		wipers.add(new ModelRendererTurbo(wipers, 117, 112, textureX, textureY)
			.addShapeBox(0.125f, -1, 0, 1, 1, 8, 0, 0, -0.5625f, 0, -0.5f, -0.5625f, 0, -0.875f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.875f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(18.75f, -11.5f, 3.5f).setRotationAngle(0, 0, -39)
		);
		wipers.add(new ModelRendererTurbo(wipers, 385, 118, textureX, textureY)
			.addShapeBox(-0.375f, -1, 1.5f, 1, 1, 12, 0, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(18.75f, -11.5f, 3.5f).setRotationAngle(0, 0, -39)
		);
		wipers.add(new ModelRendererTurbo(wipers, 106, 109, textureX, textureY)
			.addShapeBox(0.125f, -1, 0, 1, 1, 8, 0, 0, -0.5625f, 0, -0.5f, -0.5625f, 0, -0.875f, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.875f, -0.0625f, 0, 0, -0.0625f, 0)
			.setRotationPoint(18.75f, -11.5f, -11).setRotationAngle(0, 0, -39)
		);
		wipers.add(new ModelRendererTurbo(wipers, 58, 107, textureX, textureY)
			.addShapeBox(-0.375f, -1, 1.5f, 1, 1, 12, 0, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(18.75f, -11.5f, -11).setRotationAngle(0, 0, -39)
		);
		wipers.addProgram(new TurboList.Program(){
			private boolean ison, ret = false;
			private float moved;
			@Override
			public void preRender(TurboList list, Entity ent, VehicleData data, Colorable color, String part, RenderCache cache){
				if(cache == null) return;
				ison = data.getAttribute("windshield_wipers").boolean_value();
				moved = cache.getValue("wipers_moved", 0f);
				if(ison && !ret){
					moved += 0.5f;
				}
				if(moved >= 110 || ret || (!ison && moved > 0)){
					ret = true;
					moved -= 0.5f;
				}
				if(moved <= 0f){
					ret = false;
					moved = 0f;
				}
				if(moved != 0f){
					for(ModelRendererTurbo mrt : list) mrt.rotationAngleX = moved;
				}
				cache.setValue("wipers_moved", moved);
			}
			@Override
			public void postRender(TurboList list, Entity ent, VehicleData data, Colorable color, String part, RenderCache cache){
				if(moved != 0f) for(ModelRendererTurbo mrt : list){ mrt.rotationAngleX = 0; }
			}
		});
		this.groups.add(wipers);
		//
		/*TurboList window = new TurboList("window");
		window.add(new ModelRendererTurbo(window, 389, 68, textureX, textureY)
			.addShapeQuad(0, 0, 0, 1, 11, 0, 0, 0, 0, -1, 0, 34, -9, 0, -1, 8, 0, 35)
			.setRotationPoint(9.5f, -22.5f, 17).setRotationAngle(0, 0, 0)
		);
		window.addProgram(new DefaultPrograms.Window(0x97abdb));
		this.groups.add(window);*/
		//
		/*TurboList license_plates = new TurboList("license_plates");
		license_plates.add(new ModelRendererTurbo(license_plates, 153, 115, textureX, textureY).addBox(0, 0, -6, 1, 3, 12)
			.setRotationPoint(-49.875f, -1.5f, 0).setRotationAngle(0, 0, 0)
		);
		license_plates.add(new ModelRendererTurbo(license_plates, 198, 113, textureX, textureY).addBox(-0.25f, -1, -6, 1, 3, 12)
			.setRotationPoint(50, 1.5f, 0).setRotationAngle(0, 0, -5)
		);
		this.groups.add(license_plates);*/
	}

}
