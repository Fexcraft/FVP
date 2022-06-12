//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.vehicle;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.ModelGroup;
import net.fexcraft.mod.fvtm.model.VehicleModel;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/vehicle/c12")
public class C12Model extends VehicleModel {

	public C12Model(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup body = new ModelGroup("body");
		body.add(new ModelRendererTurbo(body, 455, 96, textureX, textureY).addBox(0, 0, 0, 2, 13, 26)
			.setRotationPoint(40.5f, -7, -13).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 24, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, -0.1f, 0, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, 0, -0.1f, 0, 0, -0.1f, 0, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, 0, -0.1f, 0)
			.setRotationPoint(42.5f, -4.6f, -11).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 288, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, -0.1f, 0, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, 0, -0.1f, 0, 0, -0.1f, 0, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, 0, -0.1f, 0)
			.setRotationPoint(42.5f, -3.4f, -11).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 0, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, -0.1f, 0, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, 0, -0.1f, 0, 0, -0.1f, 0, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, 0, -0.1f, 0)
			.setRotationPoint(42.5f, -2.2f, -11).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 42, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, -0.1f, 0, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, 0, -0.1f, 0, 0, -0.1f, 0, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, 0, -0.1f, 0)
			.setRotationPoint(42.5f, -1, -11).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 46, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, -0.1f, 0, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, 0, -0.1f, 0, 0, -0.1f, 0, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, 0, -0.1f, 0)
			.setRotationPoint(42.5f, 0.2f, -11).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 49, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, -0.1f, 0, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, 0, -0.1f, 0, 0, -0.1f, 0, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, 0, -0.1f, 0)
			.setRotationPoint(42.5f, 1.4f, -11).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 100, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, -0.1f, 0, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, 0, -0.1f, 0, 0, -0.1f, 0, -0.4f, -0.2f, 0, -0.4f, -0.2f, 0, 0, -0.1f, 0)
			.setRotationPoint(42.5f, 2.6f, -11).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 477, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 13, 12, 0, -8, 0, 0, 8, 0, 0, 8, 0, 0, -8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19.5f, -7, -22.5f).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 249, 204, textureX, textureY).addBox(0, 0, 0, 26, 11, 1)
			.setRotationPoint(14.5f, -7.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 454, 198, textureX, textureY).addBox(0, 0, 0, 26, 11, 1)
			.setRotationPoint(14.5f, -7.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 412, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 13, 12, 0, -8, 0, 0, 8, 0, 0, 8, 0, 0, -8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19.5f, -7, 10.5f).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 493, 12, textureX, textureY).addBox(0, 0, 0, 7, 3, 1)
			.setRotationPoint(14.5f, 3.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 463, 10, textureX, textureY).addBox(0, 0, 0, 7, 3, 1)
			.setRotationPoint(14.5f, 3.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 0, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 4, 0, 0, 4, 0, 0, -4, 0, 0)
			.setRotationPoint(14.5f, -7, -10.5f).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 49, 95, textureX, textureY).addBox(0, 0, 0, 1, 13, 45)
			.setRotationPoint(13.5f, -7, -22.5f).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 198, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(-27.5f, -9, -22.5f).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 149, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-29.5f, -2, -22.5f).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 267, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 45, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-29.5f, 2, -22.5f).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 212, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
			.setRotationPoint(-32.5f, -4, -22.5f).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 371, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0)
			.setRotationPoint(-53, 1, -16).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 504, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 2)
			.setRotationPoint(-9.5f, -19, 19).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 493, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 15, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-9.5f, -9, -22).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 180, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, -2)
			.setRotationPoint(-9.5f, -19, -20).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 0, 0, textureX, textureY).addBox(0, 0, 0, 50, 2, 45)
			.setRotationPoint(-28.5f, 6, -22.5f).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 232, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 15, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-9.5f, -9, 21).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 449, 48, textureX, textureY).addBox(0, 0, 0, 12, 1, 16)
			.setRotationPoint(18.5f, 3, -8).setRotationAngle(0, 0, 0)
		);
		body.add(new ModelRendererTurbo(body, 148, 47, textureX, textureY).addBox(0, 0, 0, 5, 1, 16)
			.setRotationPoint(35.5f, 3, -8).setRotationAngle(0, 0, 0)
		);
		this.groups.add(body);
		//
		ModelGroup primary = new ModelGroup("primary");
		primary.add(new ModelRendererTurbo(primary, 28, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 5, 0, 0, 5, 0, 0, -5, 0, 0)
			.setRotationPoint(8.5f, -19, -0.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 124, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f)
			.setRotationPoint(42.5f, -8, 13).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 493, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.5f, 6, -23.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 341, 45, textureX, textureY).addBox(0, 0, 0, 5, 5, 45)
			.setRotationPoint(-32.5f, -9, -22.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 207, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 10, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.5f, -8, -23).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(14.5f, -8, 13).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 265, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 38, 1, 40, 0, -1, 0, -1, -1, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-29, -21, -20).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 316, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 10, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(40.5f, -7, -23).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 73, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(40.5f, -7, 13).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 461, 78, textureX, textureY).addBox(0, 0, 0, 1, 9, 2)
			.setRotationPoint(42.5f, -5, -13).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 178, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(42.5f, 4, -13).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 455, 78, textureX, textureY).addBox(0, 0, 0, 1, 9, 2)
			.setRotationPoint(42.5f, -5, 11).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 100, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 10, 0, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(42.5f, -7, -23).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 364, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(42.5f, -8, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 454, 170, textureX, textureY).addBox(0, 0, 0, 1, 2, 26)
			.setRotationPoint(42.5f, -7, -13).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 134, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 26, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(42.5f, -8, -13).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 23, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, 0, 0)
			.setRotationPoint(42.5f, -7, 13).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 396, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 13, 1, 0, 0, 0, -0.5f, 0, 0, -0.6f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.5f, -7, -23.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 48, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27.5f, 6, -23.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 396, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 48, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-27.5f, 6, 22.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 493, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 11, 1, 0, 0, 0, -0.5f, 0, 0, -0.7f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -7, 0, 0, -7, 0, 0, 0, 0, 0)
			.setRotationPoint(20.5f, -5, -23.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 245, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 2, 12, 0, 0, 0, -0.1f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.5f, -7, -23).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 375, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, -0.3f, 0, 0, -0.4f, 0, 0, 0.5f, 0, 0, 0.5f, -2.8f, 0, 0, 0, 0, 0, 0, 0, 0, -2.8f, 0, 0)
			.setRotationPoint(37.5f, -5, -23).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 449, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 13, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.6f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.5f, -7, 22.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 493, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 11, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.7f, 0, 0, -0.5f, 0, 0, 0, -7, 0, 0, -7, 0, 0, 0, 0, 0)
			.setRotationPoint(20.5f, -5, 22.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 489, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(20.5f, 6, 22.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 245, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 2, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, 0)
			.setRotationPoint(20.5f, -7, 11).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 8, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.4f, 0, 0, -0.3f, -2.8f, 0, 0, 0, 0, 0, 0, 0, 0, -2.8f, 0, 0)
			.setRotationPoint(37.5f, -5, 22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 145, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 39, 1, 42, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.5f, -20, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 449, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 2, 5, 0, 2, 5, 0, -2, -5, 0, -2)
			.setRotationPoint(7.5f, -19, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 185, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 15, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.5f, -9, -23.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 179, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 15, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.5f, -9, 22.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 50, textureX, textureY).addBox(0, 0, 0, 2, 2, 45)
			.setRotationPoint(12.5f, -9, -22.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 493, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, -2, 5, 0, -2, 5, 0, 2, -5, 0, 2)
			.setRotationPoint(7.5f, -19, 20).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 174, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 10, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 2, -2, 0, 2, -2, 0, -2, 3, 0, -2)
			.setRotationPoint(-29.5f, -19, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 148, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 10, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, -2, -2, 0, -2, -2, 0, 2, 3, 0, 2)
			.setRotationPoint(-29.5f, -19, 18).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 224, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 15, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(-29.5f, -9, -23.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 216, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 15, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(-29.5f, -9, 22.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 186, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.5f, 6, -23.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 182, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-28.5f, 6, 22.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 245, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 5, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -9, -23).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 96, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.1f, -1, 0, 0.1f)
			.setRotationPoint(-53, -9, 22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 171, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 5, 1, 0, -1, 0, 0.1f, 5, 0, 0.1f, 5, 0, 0, 0, 0, 0, -1, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -4, -23).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 347, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 5, 1, 0, 0, 0, 0, 5, 0, 0, 5, 0, 0.1f, -1, 0, 0.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0.1f, -1, 0, 0.1f)
			.setRotationPoint(-53, -4, 22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 178, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 3, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0, 3, 0, 0, 0, 0, 0.1f, 0, 0, 0.2f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30, -4, -23).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 174, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0.1f, 3, 0, 0.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0, 0, 0.2f)
			.setRotationPoint(-30, -4, 22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 118, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0.1f, 0, 0, 0.2f, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0.3f, 0.3f, 0, 0.3f, 0.3f, 0, -0.3f, -1.2f, 0, -0.3f)
			.setRotationPoint(-30, -2, -23).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 369, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0, 0, 0.2f, -1.2f, 0, -0.3f, 0.3f, 0, -0.3f, 0.3f, 0, 0.3f, -1.2f, 0, 0.3f)
			.setRotationPoint(-30, -2, 22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 109, textureX, textureY).addBox(0, 0, 0, 1, 1, 44)
			.setRotationPoint(-53, 0, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 198, 90, textureX, textureY).addBox(0, 0, 0, 1, 9, 8)
			.setRotationPoint(-53, -9, 14).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 483, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -9, 12).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 49, 66, textureX, textureY).addBox(0, 0, 0, 1, 9, 8)
			.setRotationPoint(-53, -9, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 477, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -9, -14).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 24, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 2)
			.setRotationPoint(-8.5f, -19, 20).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 340, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-8.5f, -9, 22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 20, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, -2)
			.setRotationPoint(-8.5f, -19, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 142, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-8.5f, -9, -23).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 445, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 26, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, -5, -13).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 267, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 9, 0, 0, 0, 0, 0, 5, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, 0, 0)
			.setRotationPoint(-48, 0, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 412, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 9, 0, 0, 0, 0, 0, 5, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, 0, 0)
			.setRotationPoint(-48, 0, 13).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 5, 1, 0, -5, 0, 0, 0, 0, 0, 0, -2, 0, -5, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, -5, -13).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 5, 1, 0, -5, -2, 0, 0, -2, 0, 0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, -5, 12).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 381, 18, textureX, textureY).addBox(0, 0, 0, 11, 1, 8)
			.setRotationPoint(-43, -5, -21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 265, 18, textureX, textureY).addBox(0, 0, 0, 11, 1, 8)
			.setRotationPoint(-43, -5, 13).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 35, 50, textureX, textureY).addBox(0, 0, 0, 4, 9, 1)
			.setRotationPoint(-52, -9, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 245, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, 0, 0)
			.setRotationPoint(-48, -9, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 23, 50, textureX, textureY).addBox(0, 0, 0, 4, 9, 1)
			.setRotationPoint(-52, -9, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 216, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, 0, 0)
			.setRotationPoint(-48, -9, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 115, 140, textureX, textureY).addBox(0, 0, 0, 19, 1, 26)
			.setRotationPoint(-48, 0, -13).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 232, 69, textureX, textureY).addBox(0, 0, 0, 11, 5, 1)
			.setRotationPoint(-43, -9, -22).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 283, 67, textureX, textureY).addBox(0, 0, 0, 11, 5, 1)
			.setRotationPoint(-43, -9, 21).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 397, 51, textureX, textureY).addBox(0, 0, 0, 4, 1, 44)
			.setRotationPoint(-52, 0, -22).setRotationAngle(0, 0, 0)
		);
		primary.addProgram(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(primary);
		//
		ModelGroup front_label = new ModelGroup("front_label");
		front_label.add(new ModelRendererTurbo(front_label, 301, 20, textureX, textureY)
			.addShapeBox(6, 0, 0, 0.375f, 1.5f, 0.375f, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0)
			.setRotationPoint(43.25f, -4.375f, -4.25f).setRotationAngle(0, -90, 0)
		);
		front_label.add(new ModelRendererTurbo(front_label, 41, 19, textureX, textureY)
			.addShapeBox(5.25f, 1.125f, 0, 0.375f, 1.5f, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(43.25f, -4.375f, -4.25f).setRotationAngle(0, -90, 0)
		);
		front_label.add(new ModelRendererTurbo(front_label, 295, 20, textureX, textureY)
			.addShapeBox(8.25f, 0, 0, 0.375f, 2.625f, 0.375f, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0)
			.setRotationPoint(43.25f, -4.375f, -4.25f).setRotationAngle(0, -90, 0)
		);
		front_label.add(new ModelRendererTurbo(front_label, 41, 17, textureX, textureY)
			.addShapeBox(0.375f, 0, 0, 1.5f, 0.375f, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43.25f, -4.375f, -4.25f).setRotationAngle(0, -90, 0)
		);
		front_label.add(new ModelRendererTurbo(front_label, 473, 14, textureX, textureY)
			.addShapeBox(0.375f, 1.125f, 0, 1.5f, 0.375f, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43.25f, -4.375f, -4.25f).setRotationAngle(0, -90, 0)
		);
		front_label.add(new ModelRendererTurbo(front_label, 417, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.375f, 2.625f, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43.25f, -4.375f, -4.25f).setRotationAngle(0, -90, 0)
		);
		front_label.add(new ModelRendererTurbo(front_label, 154, 10, textureX, textureY)
			.addShapeBox(2.625f, 0, 0, 1.5f, 0.375f, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43.25f, -4.375f, -4.25f).setRotationAngle(0, -90, 0)
		);
		front_label.add(new ModelRendererTurbo(front_label, 183, 7, textureX, textureY)
			.addShapeBox(2.625f, 1.125f, 0, 1.5f, 0.375f, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43.25f, -4.375f, -4.25f).setRotationAngle(0, -90, 0)
		);
		front_label.add(new ModelRendererTurbo(front_label, 411, 18, textureX, textureY)
			.addShapeBox(2.25f, 0, 0, 0.375f, 2.625f, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43.25f, -4.375f, -4.25f).setRotationAngle(0, -90, 0)
		);
		front_label.add(new ModelRendererTurbo(front_label, 183, 5, textureX, textureY)
			.addShapeBox(2.625f, 2.25f, 0, 1.5f, 0.375f, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43.25f, -4.375f, -4.25f).setRotationAngle(0, -90, 0)
		);
		front_label.add(new ModelRendererTurbo(front_label, 183, 2, textureX, textureY)
			.addShapeBox(4.875f, 0, 0, 1.125f, 0.375f, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43.25f, -4.375f, -4.25f).setRotationAngle(0, -90, 0)
		);
		front_label.add(new ModelRendererTurbo(front_label, 171, 2, textureX, textureY)
			.addShapeBox(4.875f, 1.125f, 0, 1.125f, 0.375f, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43.25f, -4.375f, -4.25f).setRotationAngle(0, -90, 0)
		);
		front_label.add(new ModelRendererTurbo(front_label, 171, 5, textureX, textureY)
			.addShapeBox(4.5f, 0, 0, 0.375f, 2.625f, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43.25f, -4.375f, -4.25f).setRotationAngle(0, -90, 0)
		);
		front_label.add(new ModelRendererTurbo(front_label, 183, 0, textureX, textureY)
			.addShapeBox(7.125f, 0, 0, 1.125f, 0.375f, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43.25f, -4.375f, -4.25f).setRotationAngle(0, -90, 0)
		);
		front_label.add(new ModelRendererTurbo(front_label, 171, 0, textureX, textureY)
			.addShapeBox(7.125f, 2.25f, 0, 1.125f, 0.375f, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43.25f, -4.375f, -4.25f).setRotationAngle(0, -90, 0)
		);
		front_label.add(new ModelRendererTurbo(front_label, 157, 0, textureX, textureY)
			.addShapeBox(6.75f, 0, 0, 0.375f, 2.625f, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43.25f, -4.375f, -4.25f).setRotationAngle(0, -90, 0)
		);
		this.groups.add(front_label);
		//
		ModelGroup front_icon = new ModelGroup("front_icon");
		front_icon.add(new ModelRendererTurbo(front_icon, 463, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, 0, 0)
			.setRotationPoint(42.25f, 0.3125f, -1).setRotationAngle(0, 0, 0)
		);
		this.groups.add(front_icon);
		//
		ModelGroup suspension_body = new ModelGroup("suspension_body");
		suspension_body.add(new ModelRendererTurbo(suspension_body, 145, 0, textureX, textureY).addBox(0, 0, 0, 5, 4, 16)
			.setRotationPoint(30.5f, 3, -8).setRotationAngle(0, 0, 0)
		);
		suspension_body.add(new ModelRendererTurbo(suspension_body, 216, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -3, -0.25f, 0, -3, -0.25f, 0, -3, -0.25f, 0, -3)
			.setRotationPoint(31.5f, 7, -5).setRotationAngle(0, 0, 0)
		);
		suspension_body.add(new ModelRendererTurbo(suspension_body, 171, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31, -5, -16).setRotationAngle(0, 0, 0)
		);
		suspension_body.add(new ModelRendererTurbo(suspension_body, 145, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31, -5, 12.5f).setRotationAngle(0, 0, 0)
		);
		suspension_body.add(new ModelRendererTurbo(suspension_body, 267, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -3, -0.25f, 0, -3, -0.25f, 0, -3, -0.25f, 0, -3)
			.setRotationPoint(-40.5f, 7, -5).setRotationAngle(0, 0, 0)
		);
		suspension_body.add(new ModelRendererTurbo(suspension_body, 428, 60, textureX, textureY).addCylinder(0, 0, 0, 2, 9, 8, 1, 1, 3, null)
			.setRotationPoint(-37, 5, 0).setRotationAngle(22.5f, 0, 0)
		);
		suspension_body.add(new ModelRendererTurbo(suspension_body, 463, 17, textureX, textureY).addBox(0, 0, 0, 7, 5, 16)
			.setRotationPoint(-42.5f, 1, -8).setRotationAngle(0, 0, 0)
		);
		suspension_body.add(new ModelRendererTurbo(suspension_body, 463, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-42.5f, 6, -8).setRotationAngle(0, 0, 0)
		);
		suspension_body.add(new ModelRendererTurbo(suspension_body, 503, 90, textureX, textureY).addCylinder(0, 0, 0, 2, 13, 8, 1, 1, 3, null)
			.setRotationPoint(18, 5, 0).setRotationAngle(22.5f, 0, 0)
		);
		this.groups.add(suspension_body);
		//
		ModelGroup suspension_beam_fl = new ModelGroup("suspension_beam_fl");
		suspension_beam_fl.add(new ModelRendererTurbo(suspension_beam_fl, 164, 67, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, 0, 3, 3, 10, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(33, 4.5f, 8).setRotationAngle(-14, 0, 0)
		);
		this.groups.add(suspension_beam_fl);
		//
		ModelGroup suspension_beam_fr = new ModelGroup("suspension_beam_fr");
		suspension_beam_fr.add(new ModelRendererTurbo(suspension_beam_fr, 449, 65, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, -10, 3, 3, 10, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(33, 4.5f, -8).setRotationAngle(14, 0, 0)
		);
		this.groups.add(suspension_beam_fr);
		//
		ModelGroup suspension_beam_rl = new ModelGroup("suspension_beam_rl");
		suspension_beam_rl.add(new ModelRendererTurbo(suspension_beam_rl, 148, 64, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, 0, 3, 3, 10, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-39, 4.5f, 8).setRotationAngle(-14, 0, 0)
		);
		this.groups.add(suspension_beam_rl);
		//
		ModelGroup suspension_beam_rr = new ModelGroup("suspension_beam_rr");
		suspension_beam_rr.add(new ModelRendererTurbo(suspension_beam_rr, 347, 57, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, -10, 3, 3, 10, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-39, 4.5f, -8).setRotationAngle(14, 0, 0)
		);
		this.groups.add(suspension_beam_rr);
		//
		ModelGroup suspension_spring_fl = new ModelGroup("suspension_spring_fl");
		suspension_spring_fl.add(new ModelRendererTurbo(suspension_spring_fl, 67, 66, textureX, textureY).addCylinder(0, 0, 0, 1, 9, 16, 1, 1, 4, null)
			.setRotationPoint(33, -5, 14.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(suspension_spring_fl);
		//
		ModelGroup suspension_spring_fr = new ModelGroup("suspension_spring_fr");
		suspension_spring_fr.add(new ModelRendererTurbo(suspension_spring_fr, 499, 65, textureX, textureY).addCylinder(0, 0, 0, 1, 9, 16, 1, 1, 4, null)
			.setRotationPoint(33, -5, -14).setRotationAngle(0, 0, 0)
		);
		this.groups.add(suspension_spring_fr);
		//
		ModelGroup suspension_spring_rl = new ModelGroup("suspension_spring_rl");
		suspension_spring_rl.add(new ModelRendererTurbo(suspension_spring_rl, 152, 64, textureX, textureY).addCylinder(0, 0, 0, 1, 8, 16, 1, 1, 4, null)
			.setRotationPoint(-39, -4, 14.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(suspension_spring_rl);
		//
		ModelGroup suspension_spring_rr = new ModelGroup("suspension_spring_rr");
		suspension_spring_rr.add(new ModelRendererTurbo(suspension_spring_rr, 148, 64, textureX, textureY).addCylinder(0, 0, 0, 1, 8, 16, 1, 1, 4, null)
			.setRotationPoint(-39, -4, -14).setRotationAngle(0, 0, 0)
		);
		this.groups.add(suspension_spring_rr);
		//
		ModelGroup suspension_buffer_fl = new ModelGroup("suspension_buffer_fl");
		suspension_buffer_fl.add(new ModelRendererTurbo(suspension_buffer_fl, 27, 36, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(31.5f, 4, 13).setRotationAngle(0, 0, 0)
		);
		this.groups.add(suspension_buffer_fl);
		//
		ModelGroup suspension_buffer_fr = new ModelGroup("suspension_buffer_fr");
		suspension_buffer_fr.add(new ModelRendererTurbo(suspension_buffer_fr, 403, 34, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(31.5f, 4, -15.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(suspension_buffer_fr);
		//
		ModelGroup suspension_buffer_rl = new ModelGroup("suspension_buffer_rl");
		suspension_buffer_rl.add(new ModelRendererTurbo(suspension_buffer_rl, 381, 32, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-40.5f, 4, 13).setRotationAngle(0, 0, 0)
		);
		this.groups.add(suspension_buffer_rl);
		//
		ModelGroup suspension_buffer_rr = new ModelGroup("suspension_buffer_rr");
		suspension_buffer_rr.add(new ModelRendererTurbo(suspension_buffer_rr, 493, 29, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-40.5f, 4, -15.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(suspension_buffer_rr);
		//
		ModelGroup suspension_wheel_fl = new ModelGroup("suspension_wheel_fl");
		suspension_wheel_fl.add(new ModelRendererTurbo(suspension_wheel_fl, 289, 49, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 16, 1, 1.25f, 0, new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(33, 7, 17.75f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(suspension_wheel_fl);
		//
		ModelGroup suspension_wheel_fr = new ModelGroup("suspension_wheel_fr");
		suspension_wheel_fr.add(new ModelRendererTurbo(suspension_wheel_fr, 296, 43, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 16, 1, 1.25f, 1, new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.75))
			.setRotationPoint(33, 7, -18.75f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(suspension_wheel_fr);
		//
		ModelGroup suspension_wheel_rl = new ModelGroup("suspension_wheel_rl");
		suspension_wheel_rl.add(new ModelRendererTurbo(suspension_wheel_rl, 265, 21, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 16, 1, 1.25f, 0, new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(-39, 7, 17.75f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(suspension_wheel_rl);
		//
		ModelGroup suspension_wheel_rr = new ModelGroup("suspension_wheel_rr");
		suspension_wheel_rr.add(new ModelRendererTurbo(suspension_wheel_rr, 381, 18, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 16, 1, 1.25f, 1, new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.75))
			.setRotationPoint(-39, 7, -18.75f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(suspension_wheel_rr);
		//
	}

}
