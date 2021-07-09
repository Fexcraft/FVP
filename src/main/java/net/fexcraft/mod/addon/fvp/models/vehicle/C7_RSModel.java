//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.vehicle;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.model.VehicleModel;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.1 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/vehicle/c7rs")
public class C7_RSModel extends VehicleModel {

	public C7_RSModel(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList chassis_body = new TurboList("chassis_body");
		chassis_body.add(new ModelRendererTurbo(chassis_body, 350, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 60.000004f, 2.4f, 2.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0, -1.08f, 0, 0, -1.08f, 0, 0, -1.08f, 0, 0)
			.setRotationPoint(-30.000002f, 2.2f, -21.6f).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 350, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 60.000004f, 2.4f, 2.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0, -1.08f, 0, 0, -1.08f, 0, 0, -1.08f, 0, 0)
			.setRotationPoint(-30.000002f, 2.2f, 19.2f).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 27, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 6, 2.4f, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(27.6f, -3.8f, -21.6f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 259, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 6, 2.4f, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.600002f, -3.8f, -21.6f).setRotationAngle(0, 0, 0).setName("Box 4")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 464, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 1.2f, 2.4f, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44.4f, -5, -21.6f).setRotationAngle(0, 0, 0).setName("Box 5")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 398, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 1.2f, 2.4f, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.800001f, -5, -21.6f).setRotationAngle(0, 0, 0).setName("Box 6")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 350, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 15.6f, 1.2f, 2.4f, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.000002f, -6.2f, -21.6f).setRotationAngle(0, 0, 0).setName("Box 7")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 108, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 6, 2.4f, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(27.6f, -3.8f, 19.2f).setRotationAngle(0, 0, 0).setName("Box 8")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 66, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 1.2f, 2.4f, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.800001f, -5, 19.2f).setRotationAngle(0, 0, 0).setName("Box 9")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 0, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 15.6f, 1.2f, 2.4f, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.000002f, -6.2f, 19.2f).setRotationAngle(0, 0, 0).setName("Box 10")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 17, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 1.2f, 2.4f, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44.4f, -5, 19.2f).setRotationAngle(0, 0, 0).setName("Box 11")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 463, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 6, 2.4f, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.600002f, -3.8f, 19.2f).setRotationAngle(0, 0, 0).setName("Box 12")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 0, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 6, 2.4f, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, -3.8f, 19.2f).setRotationAngle(0, 0, 0).setName("Box 13")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 357, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 6, 2.4f, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30.000002f, -3.8f, 19.2f).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 0, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 1.2f, 2.4f, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31.2f, -5, 19.2f).setRotationAngle(0, 0, 0).setName("Box 15")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 350, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 15.6f, 1.2f, 2.4f, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.600002f, -6.2f, 19.2f).setRotationAngle(0, 0, 0).setName("Box 16")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 212, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 1.2f, 2.4f, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.800003f, -5, 19.2f).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 310, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 6, 2.4f, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30.000002f, -3.8f, -21.6f).setRotationAngle(0, 0, 0).setName("Box 18")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 268, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 1.2f, 2.4f, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31.2f, -5, -21.6f).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 0, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 15.6f, 1.2f, 2.4f, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.600002f, -6.2f, -21.6f).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 168, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 1.2f, 2.4f, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.800003f, -5, -21.6f).setRotationAngle(0, 0, 0).setName("Box 21")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 478, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 6, 2.4f, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, -3.8f, -21.6f).setRotationAngle(0, 0, 0).setName("Box 22")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 493, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 7.2000003f, 2.4f, 2.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0, -1.08f, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.800003f, 2.2f, 19.2f).setRotationAngle(0, 0, 0).setName("Box 23")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 369, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 7.2000003f, 2.4f, 2.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0, -1.08f, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.800003f, 2.2f, -21.6f).setRotationAngle(0, 0, 0).setName("Box 24")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 304, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 2.4f, 38.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0)
			.setRotationPoint(-56.4f, 2.2f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 25")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 212, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 2.4f, 2.4f, 0, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, -1.2f, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0)
			.setRotationPoint(-56.4f, 2.2f, -21.6f).setRotationAngle(0, 0, 0).setName("Box 26")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 110, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 2.4f, 2.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, -1.2f)
			.setRotationPoint(-56.4f, 2.2f, 19.2f).setRotationAngle(0, 0, 0).setName("Box 27")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 268, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 1.2f, 2.4f, 0, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-56.4f, 1, -21.6f).setRotationAngle(0, 0, 0).setName("Box 29")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 212, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 1.2f, 2.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f)
			.setRotationPoint(-56.4f, 1, 19.2f).setRotationAngle(0, 0, 0).setName("Box 30")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 440, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 1.2f, 2.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0)
			.setRotationPoint(45.600002f, 2.2f, 19.2f).setRotationAngle(0, 0, 0).setName("Box 31")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 413, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 1.2f, 2.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0)
			.setRotationPoint(45.600002f, 2.2f, -21.6f).setRotationAngle(0, 0, 0).setName("Box 33")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 110, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 2.4f, 38.4f, 0, 0, 0, 0, 0.120000005f, 0, 0, 0.120000005f, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0, -1.08f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.600002f, 1, -19.2f).setRotationAngle(0, 0, 0).setName("Box 35")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 0, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 2.4f, 2, 0, 0, 0, 0, 0.120000005f, 0, 0, 0.120000005f, 0, -1.5f, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0, -1.08f, 0, -1.5f, 0, 0, 0)
			.setRotationPoint(51.600002f, 1, 19.2f).setRotationAngle(0, 0, 0).setName("Box 36")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 285, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6f, 2.4f, 2, 0, 0, 0, 0, 0.120000005f, 0, -1.5f, 0.120000005f, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, -1.5f, -1.08f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.600002f, 1, -21.2f).setRotationAngle(0, 0, 0).setName("Box 37")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 47, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 2.4f, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0)
			.setRotationPoint(28.800001f, 2.2f, -12).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 0, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6f, 2.4f, 38.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.120000005f, 0, 0, 0.120000005f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.600002f, -1.4f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 60")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 127, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 7.2000003f, 0, 0, -0.24000001f, 0, -0.96000004f, -0.24000001f, 0, -0.96000004f, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, -0.96000004f, -0.24000001f, 0, -0.96000004f, -0.24000001f, 0, 0, -0.24000001f, 0)
			.setRotationPoint(55.32f, -3.2f, -3.6000001f).setRotationAngle(0, 0, 0).setName("Box 84")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 241, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 7.2000003f, 0, 0, -0.24000001f, 0, -0.96000004f, -0.24000001f, 0, -0.96000004f, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, -0.96000004f, -0.24000001f, 0, -0.96000004f, -0.24000001f, 0, 0, -0.24000001f, 0)
			.setRotationPoint(55.32f, -5, -3.6000001f).setRotationAngle(0, 0, 0).setName("Box 85")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 210, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 7.2000003f, 0, 0, -0.24000001f, 0, -0.96000004f, -0.24000001f, 0, -0.96000004f, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, -0.96000004f, -0.24000001f, 0, -0.96000004f, -0.24000001f, 0, 0, -0.24000001f, 0)
			.setRotationPoint(55.32f, -6.8f, -3.6000001f).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 110, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 13.200001f, 0, 0, -0.24000001f, 0, -0.96000004f, -0.24000001f, 0, -1.32f, -0.24000001f, -0.6f, 0.36f, -0.24000001f, -0.6f, 0, -0.24000001f, 0, -0.96000004f, -0.24000001f, 0, -1.32f, -0.24000001f, -0.6f, 0.36f, -0.24000001f, -0.6f)
			.setRotationPoint(55.32f, -6.8f, 3.6000001f).setRotationAngle(0, 0, 0).setName("Box 87")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 268, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 13.200001f, 0, 0, -0.24000001f, 0, -0.96000004f, -0.24000001f, 0, -1.32f, -0.24000001f, -0.6f, 0.36f, -0.24000001f, -0.6f, 0, -0.24000001f, 0, -0.96000004f, -0.24000001f, 0, -1.32f, -0.24000001f, -0.6f, 0.36f, -0.24000001f, -0.6f)
			.setRotationPoint(55.32f, -5, 3.6000001f).setRotationAngle(0, 0, 0).setName("Box 88")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 212, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 13.200001f, 0, 0, -0.24000001f, 0, -0.96000004f, -0.24000001f, 0, -1.32f, -0.24000001f, -0.6f, 0.36f, -0.24000001f, -0.6f, 0, -0.24000001f, 0, -0.96000004f, -0.24000001f, 0, -1.32f, -0.24000001f, -0.6f, 0.36f, -0.24000001f, -0.6f)
			.setRotationPoint(55.32f, -3.2f, 3.6000001f).setRotationAngle(0, 0, 0).setName("Box 89")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 168, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 13.200001f, 0, 0.36f, -0.24000001f, -0.6f, -1.32f, -0.24000001f, -0.6f, -0.96000004f, -0.24000001f, 0, 0, -0.24000001f, 0, 0.36f, -0.24000001f, -0.6f, -1.32f, -0.24000001f, -0.6f, -0.96000004f, -0.24000001f, 0, 0, -0.24000001f, 0)
			.setRotationPoint(55.32f, -6.8f, -16.800001f).setRotationAngle(0, 0, 0).setName("Box 90")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 66, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 13.200001f, 0, 0.36f, -0.24000001f, -0.6f, -1.32f, -0.24000001f, -0.6f, -0.96000004f, -0.24000001f, 0, 0, -0.24000001f, 0, 0.36f, -0.24000001f, -0.6f, -1.32f, -0.24000001f, -0.6f, -0.96000004f, -0.24000001f, 0, 0, -0.24000001f, 0)
			.setRotationPoint(55.32f, -5, -16.800001f).setRotationAngle(0, 0, 0).setName("Box 91")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 0, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 13.200001f, 0, 0.36f, -0.24000001f, -0.6f, -1.32f, -0.24000001f, -0.6f, -0.96000004f, -0.24000001f, 0, 0, -0.24000001f, 0, 0.36f, -0.24000001f, -0.6f, -1.32f, -0.24000001f, -0.6f, -0.96000004f, -0.24000001f, 0, 0, -0.24000001f, 0)
			.setRotationPoint(55.32f, -3.2f, -16.800001f).setRotationAngle(0, 0, 0).setName("Box 92")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 30, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 6, 1.2f, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0)
			.setRotationPoint(54.000004f, -7.4f, -3.8f).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 291, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 6, 1.2f, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0)
			.setRotationPoint(54.000004f, -7.4f, 2.4f).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 133, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 13.4f, 1.2f, 0, 9.6f, 0, 1.2f, -9.6f, 0, 1.2f, -9.6f, 0, -1.2f, 9.6f, 0, -1.2f, 4.8f, 0, 0, 0, 0, 0, 0, 0, 0, 4.8f, 0, 0.6f)
			.setRotationPoint(24, -23.2f, 18).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 126, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 13.4f, 1.2f, 0, 9.6f, 0, -1.2f, -9.6f, 0, -1.2f, -9.6f, 0, 1.2f, 9.6f, 0, 1.2f, 4.8f, 0, 0.6f, 0, 0, 0, 0, 0, 0, 4.8f, 0, 0)
			.setRotationPoint(24, -23.2f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 123")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 383, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 12.2f, 1.2f, 0, -4.8f, 0, 1.2f, 4.8f, 0, 1.2f, 4.8f, 0, -1.2f, -4.8f, 0, -1.2f, 0.6f, 0, 0, 0, 0, 0, 0, 0, 0.6f, 0.6f, 0, 0.6f)
			.setRotationPoint(-54.000004f, -23.2f, 18).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 504, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 12.2f, 1.2f, 0, -4.8f, 0, -1.2f, 4.8f, 0, -1.2f, 4.8f, 0, 1.2f, -4.8f, 0, 1.2f, 0.6f, 0, 0.6f, 0, 0, 0.6f, 0, 0, 0, 0.6f, 0, 0)
			.setRotationPoint(-54.000004f, -23.2f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 125")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 497, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 12.2f, 1.2f, 0, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0.6f, 0, 0, 0.6f)
			.setRotationPoint(-28.800001f, -23.2f, 18).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 472, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 12.2f, 1.2f, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, 0.6f, 0, 0, 0.6f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.800001f, -23.2f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 132")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 161, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5.8f, 38, 0, 1.2f, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 1.2f, 0, 0, 0, 0, 1.2f, 0, 1.2f, 1.2f, 0, 1.2f, 1.2f, 0, 0, 1.2f)
			.setRotationPoint(20.400002f, -12, -19.2f).setRotationAngle(0, 0, 0).setName("Box 133")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 398, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 9.6f, 40.800003f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0)
			.setRotationPoint(25.2f, -6.2f, -20.400002f).setRotationAngle(0, 0, 0).setName("Box 135")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 499, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 2.4f, 4.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0)
			.setRotationPoint(-30.000002f, 2.2f, 14.400001f).setRotationAngle(0, 0, 0).setName("Box 138")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 110, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 2.4f, 4.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0, -1.08f, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.800003f, 2.2f, 14.400001f).setRotationAngle(0, 0, 0).setName("Box 139")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 268, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 2.4f, 4.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0, -1.08f, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.800003f, 2.2f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 140")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 212, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 2.4f, 4.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0)
			.setRotationPoint(-30.000002f, 2.2f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 141")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 472, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 2.4f, 7.2000003f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0, -1.08f, 0, 0, 0, 0, 0)
			.setRotationPoint(28.800001f, 2.2f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 142")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 227, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 2.4f, 7.2000003f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0, -1.08f, 0, 0, 0, 0, 0)
			.setRotationPoint(28.800001f, 2.2f, 12).setRotationAngle(0, 0, 0).setName("Box 143")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 210, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 7.2000003f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0)
			.setRotationPoint(45.600002f, 2.2f, 12).setRotationAngle(0, 0, 0).setName("Box 144")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 167, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 7.2000003f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0)
			.setRotationPoint(45.600002f, 2.2f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 145")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 408, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 7.2000003f, 2.4f, 40.800003f, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.000004f, 1, -20.400002f).setRotationAngle(0, 0, 0).setName("Box 156")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 347, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 9.6f, 1.2f, 28.800001f, 0, 0, 0, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.800003f, 2.2f, -14.400001f).setRotationAngle(0, 0, 0).setName("Box 157")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 158, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8.400001f, 1.2f, 28.800001f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37.2f, 2.2f, -14.400001f).setRotationAngle(0, 0, 0).setName("Box 158")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 364, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 12.2f, 1.2f, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, 0.6f, 0, 0, 0.6f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.8f, -23.2f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 241")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 90, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 12.2f, 1.2f, 0, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0.6f, 0, 0, 0.6f)
			.setRotationPoint(-4.8f, -23.2f, 18).setRotationAngle(0, 0, 0).setName("Box 242")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 195, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 57.600002f, 1.2f, 38.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28.800001f, 3.4f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 0cp")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 157, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 1.2f, 38.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-56.4f, 1, -19.2f).setRotationAngle(0, 0, 0).setName("Box 28cp")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 57, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 7.2000003f, 1.2f, 38.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.000004f, 3.4f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 38cp")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 261, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 4.8f, 1.2f, 38.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(46.800003f, 2.2f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 39cp")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 0, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1.2f, 28.800001f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.800003f, 3.4f, -14.400001f).setRotationAngle(0, 0, 0).setName("Box 40cp")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 431, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 2.4f, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(36.600002f, 1.6f, -18).setRotationAngle(0, 0, 0).setName("Box 108cp")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 390, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 2.4f, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39, 1.6f, -18).setRotationAngle(0, 0, 0).setName("Box 109cp")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 354, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 40.800003f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(27.6f, 2.2f, -20.400002f).setRotationAngle(0, 0, 0).setName("Box 245cp")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 108, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 1.2f, 4.8f, 0, 0, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, -2.0400002f, 0, 0, -1.08f, 0, -0.96000004f, 0, -0.24000001f, -0.96000004f, 0, -0.24000001f, -0.96000004f, -2.0400002f, 0, -0.96000004f, -1.08f)
			.setRotationPoint(51.600002f, -7.4f, 16.800001f).setRotationAngle(0, 0, 0).setName("Box 73")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 461, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 1.2f, 4.8f, 0, 0, 0, -1.08f, -0.24000001f, 0, -2.0400002f, -0.24000001f, 0, 0, 0, 0, 0, 0, -0.96000004f, -1.08f, -0.24000001f, -0.96000004f, -2.0400002f, -0.24000001f, -0.96000004f, 0, 0, -0.96000004f, 0)
			.setRotationPoint(51.600002f, -7.4f, -21.6f).setRotationAngle(0, 0, 0).setName("Box 82")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 221, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6f, 2.4f, 1.2f, 0, 0, 0, 0.2f, 0.120000005f, 0, -0.7f, 0.120000005f, 0, 0, 0, 0, 0, 0, 0, 0.232f, 0.120000005f, 0, -0.7f, 0.120000005f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.600002f, -1.4f, -20.4f).setRotationAngle(0, 0, 0).setName("Box 69")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 204, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6f, 2.4f, 1.2f, 0, 0, 0, 0, 0.120000005f, 0, 0, 0.120000005f, 0, -0.7f, 0, 0, 0.2f, 0, 0, 0, 0.120000005f, 0, 0, 0.120000005f, 0, -0.7f, 0, 0, 0.232f)
			.setRotationPoint(51.6f, -1.4f, 19.2f).setRotationAngle(0, 0, 0).setName("Box 70")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 442, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 1.2f, 4.8f, 0, 0, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, -2.0400002f, 0, 0, -1.08f, 0, -0.96000004f, 0, -0.24000001f, -0.96000004f, 0, -0.24000001f, -0.96000004f, -2.0400002f, 0, -0.96000004f, -1.08f)
			.setRotationPoint(51.600002f, -4, 16.800001f).setRotationAngle(0, 0, 0).setName("Box")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 324, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 1.2f, 4.8f, 0, 0, 0, -1.08f, -0.24000001f, 0, -2.0400002f, -0.24000001f, 0, 0, 0, 0, 0, 0, -0.96000004f, -1.08f, -0.24000001f, -0.96000004f, -2.0400002f, -0.24000001f, -0.96000004f, 0, 0, -0.96000004f, 0)
			.setRotationPoint(51.600002f, -4, -21.6f).setRotationAngle(0, 0, 0).setName("Box")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 305, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 1.2f, 4.8f, 0, 0, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, -2.0400002f, 0, 0, -1.08f, 0, -0.96000004f, 0, -0.24000001f, -0.96000004f, 0, -0.24000001f, -0.96000004f, -2.0400002f, 0, -0.96000004f, -1.08f)
			.setRotationPoint(51.600002f, -1.6f, 16.800001f).setRotationAngle(0, 0, 0).setName("Box 73")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 493, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 1.2f, 4.8f, 0, 0, 0, -1.08f, -0.24000001f, 0, -2.0400002f, -0.24000001f, 0, 0, 0, 0, 0, 0, -0.96000004f, -1.08f, -0.24000001f, -0.96000004f, -2.0400002f, -0.24000001f, -0.96000004f, 0, 0, -0.96000004f, 0)
			.setRotationPoint(51.600002f, -1.6f, -21.6f).setRotationAngle(0, 0, 0).setName("Box 82")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 229, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 1.2f, 2.4f, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, 0)
			.setRotationPoint(48, 1, 19.2f).setRotationAngle(0, 0, 0).setName("Box 32")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 127, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 1.2f, 2.4f, 0, 0.3f, 0, 0, 0, 0, -0.4f, 0, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(48, 1, -21.6f).setRotationAngle(0, 0, 0).setName("Box 34")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 185, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 1.2f, 2.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, 0)
			.setRotationPoint(48, 2.2f, 19.2f).setRotationAngle(0, 0, 0).setName("Box 32cp")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 436, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 1.2f, 2.4f, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(48, 2.2f, -21.6f).setRotationAngle(0, 0, 0).setName("Box 34cp")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 286, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 6, 1.2f, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0)
			.setRotationPoint(54, -7.4f, -6.8f).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 143, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 6, 1.2f, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0)
			.setRotationPoint(54.000004f, -7.4f, 5.4f).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 242, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 6, 1.2f, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0)
			.setRotationPoint(54, -7.4f, -9.8f).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 237, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 6, 1.2f, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0)
			.setRotationPoint(54, -7.4f, -12.8f).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 205, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 6, 1.2f, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0)
			.setRotationPoint(54.000004f, -7.4f, 8.4f).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 200, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 6, 1.2f, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0)
			.setRotationPoint(54, -7.4f, 11.4f).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, 187, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 6, 1.2f, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0)
			.setRotationPoint(54, -7.4f, -0.8f).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		chassis_body.add(new ModelRendererTurbo(chassis_body, -1, -1, textureX, textureY).addBox(0, 0, 0, 1, 1, 1));
		/*chassis_body.add(new ModelRendererTurbo(chassis_body, 259, 80, textureX, textureY)
			.addShapeBox(0, 0, 4.8f, 1.2f, 3.6000001f, 12, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0)
			.setRotationPoint(54.2f, -1, -10.8f).setRotationAngle(0, 0, 1.5f).setName("Box 258")
		);*/
		this.groups.add(chassis_body);
		//
		TurboList chassis_primary = new TurboList("chassis_primary");
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 310, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 13.200001f, 2.4f, 3.6000001f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -1.8000001f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.4f, -12, 15.6f).setRotationAngle(0, 0, 0).setName("Box 44")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 483, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 10.8f, 11.8f, 1.2f, 0, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19.2f, -9.6f, 20.400002f).setRotationAngle(0, 0, 0).setName("Box 45")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 355, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 11.8f, 1.2f, 0, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(45.600002f, -9.6f, 20.400002f).setRotationAngle(0, 0, 0).setName("Box 46")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 357, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 15.6f, 4.6f, 1.2f, 0, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0.6f, 0, 0, 0.6f, 0, 0, -0.78000003f, 0, 0, -0.78000003f)
			.setRotationPoint(30.000002f, -9.6f, 20.400002f).setRotationAngle(0, 0, 0).setName("Box 47")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 201, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 13.200001f, 1.2f, 1.2f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -1.08f, 0, 0, -1.08f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.4f, -10.8f, 19.2f).setRotationAngle(0, 0, 0).setName("Box 48")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 347, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 10.8f, 11.8f, 1.2f, 0, 0, 0, -1.1f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19.2f, -9.6f, -21.6f).setRotationAngle(0, 0, 0).setName("Box 49")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 340, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 11.8f, 1.2f, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.600002f, -9.6f, -21.6f).setRotationAngle(0, 0, 0).setName("Box 50")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 310, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 15.6f, 4.6f, 1.2f, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -0.78000003f, 0, 0, -0.78000003f, 0, 0, 0.6f, 0, 0, 0.6f)
			.setRotationPoint(30.000002f, -9.6f, -21.6f).setRotationAngle(0, 0, 0).setName("Box 51")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 201, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 13.200001f, 1.2f, 1.2f, 0, 0, -1.08f, 0, 0, -1.08f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.4f, -10.8f, -20.400002f).setRotationAngle(0, 0, 0).setName("Box 52")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 413, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 13.200001f, 2.4f, 3.6000001f, 0, 0, -1.2f, 0, 0, -1.8000001f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.4f, -12, -19.2f).setRotationAngle(0, 0, 0).setName("Box 53")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 357, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 2.4f, 3.6000001f, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.400002f, -12, 15.6f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 413, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0, -1.08f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.400002f, -10.8f, 19.2f).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 344, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1.2f, 1.2f, 0, 0, -1.08f, 0, 0, -1.08f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.400002f, -10.8f, -20.400002f).setRotationAngle(0, 0, 0).setName("Box 56")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 478, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 2.4f, 3.6000001f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.400002f, -12, -19.2f).setRotationAngle(0, 0, 0).setName("Box 57")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 47, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 1.2f, 3.6000001f, 0, 0, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, 0, 0, 0, 0.6f, 0, 0, 0, 0, 0.120000005f, 0, 0, 0.120000005f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.600002f, -10.8f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 63")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 170, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 1.2f, 3.6000001f, 0, 0, 0.6f, 0, -0.6f, 0, 0, -0.6f, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0.120000005f, 0, 0, 0.120000005f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.600002f, -10.8f, 15.6f).setRotationAngle(0, 0, 0).setName("Box 64")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 175, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 1.2f, 1.2f, 0, 0, -0.6f, 0, -0.6f, -0.6f, 0, 0, -1.08f, -0.72f, 0, -1.08f, 0, 0, 0, 0, 0.120000005f, 0, 0, 0.120000005f, 0, -0.72f, 0, 0, 0)
			.setRotationPoint(51.600002f, -10.8f, 19.2f).setRotationAngle(0, 0, 0).setName("Box 66")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 158, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 2.2f, 1.2f, 0, 0, 0, 0, 0.120000005f, 0, -0.72f, 0.120000005f, 0, 0, 0, 0, 0, 0, 0, 0.132f, 0.120000005f, 0, -0.72f, 0.120000005f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.600002f, -9.6f, -20.4f).setRotationAngle(0, 0, 0).setName("Box 69")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 26, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6f, 2.2f, 1.2f, 0, 0, 0, 0, 0.120000005f, 0, 0, 0.120000005f, 0, -0.72f, 0, 0, 0, 0, 0, 0, 0.120000005f, 0, 0, 0.120000005f, 0, -0.72f, 0, 0, 0.132f)
			.setRotationPoint(51.6f, -9.6f, 19.2f).setRotationAngle(0, 0, 0).setName("Box 70")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 310, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 2.2f, 38.4f, 0, 0, 0, 0, 0.120000005f, 0, 0, 0.120000005f, 0, 0, 0, 0, 0, 0, 0, 0, 0.120000005f, 0, 0, 0.120000005f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.600002f, -9.6f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 450, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 6, 3.6000001f, 0, 0, 0, 0, 0, 0, 0, -1.8000001f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.8000001f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.600002f, -7.4f, -15.6f).setRotationAngle(0, 0, 0).setName("Box 93")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 322, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 6, 3.6000001f, 0, 0, 0, 0, -1.8000001f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.8000001f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.600002f, -7.4f, 12).setRotationAngle(0, 0, 0).setName("Box 95")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 182, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 6, 1.2f, 0, 0, 0, 0, 0.6f, 0, 0, -0.90000004f, 0, 0, 0, 0, 0, 0, 0, 0, 0.6f, 0, 0, -0.90000004f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.600002f, -7.4f, -12).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 47, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 6, 1.2f, 0, 0, 0, 0, -0.90000004f, 0, 0, 0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.90000004f, 0, 0, 0.6f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.600002f, -7.4f, 10.8f).setRotationAngle(0, 0, 0).setName("Box 98")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 58, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 7.2000003f, 14.2f, 2.4f, 0, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.800003f, -12, 19.2f).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 431, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 7.2000003f, 14.2f, 2.4f, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.800003f, -12, -21.6f).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 350, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 15.6f, 7, 2.4f, 0, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0.66f, 0, 0, 0.66f, 0, 0, -0.66f, 0, 0, -0.66f)
			.setRotationPoint(-45.600002f, -12, 19.2f).setRotationAngle(0, 0, 0).setName("Box 101")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 0, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 15.6f, 7, 2.4f, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -0.66f, 0, 0, -0.66f, 0, 0, 0.66f, 0, 0, 0.66f)
			.setRotationPoint(-45.6f, -12, -21.6f).setRotationAngle(0, 0, 0).setName("Box 102")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 148, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 13, 2.4f, 0, 0, 0, -1.8000001f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -0.120000005f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.2f, -12, -21.6f).setRotationAngle(0, 0, 0).setName("Box 104")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 35, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 13, 2.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.8000001f, 0, 0, 0, 0, 0, 0, 0, 0, -0.120000005f, 0, 0, -1.2f)
			.setRotationPoint(-55.2f, -12, 19.2f).setRotationAngle(0, 0, 0).setName("Box 105")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 259, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 1.2f, 37.2f, 0, 0, 0, 0, -1.2f, 0, -1.2f, -1.2f, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.8f, -24.4f, -18.6f).setRotationAngle(0, 0, 0).setName("Box 126")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 213, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 1.2f, 37.2f, 0, -1.2f, 0, -1.2f, 0, 0, 0, 0, 0, 0, -1.2f, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.800003f, -24.4f, -18.6f).setRotationAngle(0, 0, 0).setName("Box 127")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 13, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 4.8f, 14.2f, 1.2f, 0, 0, 0, 1.2f, -1.2f, 0, 1.2f, -1.2f, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30.000002f, -12, 20.400002f).setRotationAngle(0, 0, 0).setName("Box 129")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 0, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 4.8f, 14.2f, 1.2f, 0, 0, 0, -1.2f, -1.2f, 0, -1.2f, -1.2f, 0, 1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30.000002f, -12, -21.6f).setRotationAngle(0, 0, 0).setName("Box 130")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 157, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 7.2000003f, 1.2f, 1.2f, 0, 0, 0, -0.6f, 0, 0, 0, 0, -1.08f, 0, 0, -0.58f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.1f)
			.setRotationPoint(19.2f, -10.8f, 19.2f).setRotationAngle(0, 0, 0).setName("Box 136")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 127, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 7.2000003f, 1.2f, 1.2f, 0, 0, -0.58f, 0, 0, -1.08f, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19.2f, -10.8f, -20.400002f).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 168, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 6, 4.8f, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30.000002f, -3.8f, 14.400001f).setRotationAngle(0, 0, 0).setName("Box 146")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 82, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 6, 4.8f, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30.000002f, -3.8f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 147")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 66, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 6, 4.8f, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.800003f, -3.8f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 148")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 16, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 6, 4.8f, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.800003f, -3.8f, 14.400001f).setRotationAngle(0, 0, 0).setName("Box 149")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 0, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 4.8f, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31.2f, -5, 14.400001f).setRotationAngle(0, 0, 0).setName("Box 150")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 110, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 4.8f, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.600002f, -5, 14.400001f).setRotationAngle(0, 0, 0).setName("Box 151")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 498, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 4.8f, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31.2f, -5, -19.2f).setRotationAngle(0, 0, 0).setName("Box 152")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 285, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 4.8f, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.600002f, -5, -19.2f).setRotationAngle(0, 0, 0).setName("Box 153")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 350, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 13.200001f, 1.2f, 4.8f, 0, -1.2f, -0.6f, -1.2f, -1.2f, -0.6f, -1.2f, -1.2f, -0.6f, 0, -1.2f, -0.6f, 0, 0, 0, 0.120000005f, 0, 0, 0.120000005f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-44.4f, -6.2f, 14.400001f).setRotationAngle(0, 0, 0).setName("Box 154")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 473, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 13.200001f, 1.2f, 4.8f, 0, -1.2f, -0.6f, 0, -1.2f, -0.6f, 0, -1.2f, -0.6f, -1.2f, -1.2f, -0.6f, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0.120000005f, 0, 0, 0.120000005f)
			.setRotationPoint(-44.4f, -6.2f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 155")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 398, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 6, 1.2f, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, -0.6f, -1.2f, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.800003f, -3.8f, -14.400001f).setRotationAngle(0, 0, 0).setName("Box 159")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 398, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 6, 1.2f, 0, -1.2f, 0, -0.6f, -1.2f, 0, -0.6f, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.800003f, -3.8f, 13.200001f).setRotationAngle(0, 0, 0).setName("Box 160")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 350, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 15.6f, 1.2f, 1.2f, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, -1.08f, -1.2f, 0, -1.08f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f)
			.setRotationPoint(-45.600002f, -5, -14.400001f).setRotationAngle(0, 0, 0).setName("Box 161")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 413, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 15.6f, 1.2f, 1.2f, 0, -1.2f, 0, -1.08f, -1.2f, 0, -1.08f, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.600002f, -5, 13.200001f).setRotationAngle(0, 0, 0).setName("Box 162")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 397, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 6, 7.2000003f, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.600002f, -3.8f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 163")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 347, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 6, 7.2000003f, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.800001f, -3.8f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 164")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 125, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 7.2000003f, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44.4f, -5, -19.2f).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 157, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 7.2000003f, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.000002f, -5, -19.2f).setRotationAngle(0, 0, 0).setName("Box 166")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 464, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 13.200001f, 1.2f, 7.2000003f, 0, -1.2f, -0.6f, 0, -1.2f, -0.6f, 0, -1.2f, -0.6f, -1.2f, -1.2f, -0.6f, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0.120000005f, 0, 0, 0.120000005f)
			.setRotationPoint(31.2f, -6.2f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 167")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 398, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 6, 1.2f, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, -0.6f, -1.2f, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.800001f, -3.8f, -12).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 413, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 15.6f, 1.2f, 1.2f, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, -1.08f, -1.2f, 0, -1.08f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f)
			.setRotationPoint(30.000002f, -5, -12).setRotationAngle(0, 0, 0).setName("Box 169")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 200, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 6, 7.2000003f, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.600002f, -3.8f, 12).setRotationAngle(0, 0, 0).setName("Box 170")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 305, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 6, 7.2000003f, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.800001f, -3.8f, 12).setRotationAngle(0, 0, 0).setName("Box 171")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 0, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 7.2000003f, 0, 1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44.4f, -5, 12).setRotationAngle(0, 0, 0).setName("Box 172")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 323, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 7.2000003f, 0, -1.2f, 0, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.000002f, -5, 12).setRotationAngle(0, 0, 0).setName("Box 173")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 398, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 6, 1.2f, 0, -1.2f, 0, -0.6f, -1.2f, 0, -0.6f, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.800001f, -3.8f, 10.8f).setRotationAngle(0, 0, 0).setName("Box 174")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 475, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 15.6f, 1.2f, 1.2f, 0, -1.2f, 0, -1.08f, -1.2f, 0, -1.08f, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.000002f, -5, 10.8f).setRotationAngle(0, 0, 0).setName("Box 175")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 310, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 13.200001f, 1.2f, 7.2000003f, 0, -1.2f, -0.6f, -1.2f, -1.2f, -0.6f, -1.2f, -1.2f, -0.6f, 0, -1.2f, -0.6f, 0, 0, 0, 0.120000005f, 0, 0, 0.120000005f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.2f, -6.2f, 12).setRotationAngle(0, 0, 0).setName("Box 176")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 370, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 4.8f, 13.200001f, 1.2f, 0, 0, 0, -1.2f, -1.2f, 0, -1.2f, -1.2f, 0, 1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30.000002f, -11, -20.400002f).setRotationAngle(0, 0, 0).setName("Box 177")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 224, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 4.8f, 13.200001f, 1.2f, 0, 0, 0, 1.2f, -1.2f, 0, 1.2f, -1.2f, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30.000002f, -11, 19.2f).setRotationAngle(0, 0, 0).setName("Box 178")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 325, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 4.8f, 14.2f, 2.4f, 0, 0, 0, 1.2f, -1.2f, 0, 1.2f, -1.2f, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.8f, -12, 19.2f).setRotationAngle(0, 0, 0).setName("Box 239")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 256, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 4.8f, 14.2f, 2.4f, 0, 0, 0, -1.2f, -1.2f, 0, -1.2f, -1.2f, 0, 1.2f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.8f, -12, -21.6f).setRotationAngle(0, 0, 0).setName("Box 240")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 1.2f, 1.2f, 0, 0, -1.08f, 0, 0, -1.08f, -0.72f, -0.6f, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0.120000005f, 0, -0.72f, 0.120000005f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.600002f, -10.8f, -20.400002f).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 0, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 6, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.600002f, -7.4f, 15.6f).setRotationAngle(0, 0, 0).setName("Box 77cp")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 413, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 3.6000001f, 6, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.600002f, -7.4f, -16.800001f).setRotationAngle(0, 0, 0).setName("Box 78cp")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 26, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 13.2f, 2.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.2f, -12, -19.2f).setRotationAngle(0, 0, 0).setName("Box 103cp")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 60.000004f, 1.2f, 37.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.2f, -24.4f, -18.6f).setRotationAngle(0, 0, 0).setName("Box 128cp")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 82, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31.2f, -5, 18.6f).setRotationAngle(0, 0, 0).setName("Box 179cp")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 74, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.600002f, -5, 18.6f).setRotationAngle(0, 0, 0).setName("Box 180cp")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 66, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45.600002f, -5, -19.800001f).setRotationAngle(0, 0, 0).setName("Box 181cp")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 273, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31.2f, -5, -19.800001f).setRotationAngle(0, 0, 0).setName("Box 182cp")
		);
		chassis_primary.add(new ModelRendererTurbo(chassis_primary, 415, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 13.2f, 2.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.2f, -12, 16.800001f).setRotationAngle(0, 0, 0).setName("Box 238cp")
		);
		chassis_primary.addProgram(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(chassis_primary);
		//
		TurboList door_front_left = new TurboList("door_front_left");
		door_front_left.add(new ModelRendererTurbo(door_front_left, 282, 131, textureX, textureY)
			.addShapeBox(-19.2f, 0, -1.2f, 20.400002f, 13.2f, 1.2f, 0, 0, 0.9f, 0, 0, -0.4f, 0, 0, -0.9f, 0, 0, 0.9f, 0, -1.2f, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, -1.2f, 0, 1.2f)
			.setRotationPoint(18, -11, 20.400002f).setRotationAngle(0, 0, 0).setName("Box 242")
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 158, 34, textureX, textureY)
			.addShapeBox(-19.2f, -2.4f, -1.2f, 20.400002f, 1.2f, 1.2f, 0, 0, -1.18f, 0, 0, -2.4f, -0.6f, 0, -2.98f, 0, 0, -1.18f, 0, 0, 0.1f, 0, 0, 2.4f, 0, 0, 1.9f, 0, 0, 0.1f, 0)
			.setRotationPoint(18, -10.8f, 20.400002f).setRotationAngle(0, 0, 0).setName("Box 243")
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 221, 3, textureX, textureY)
			.addShapeBox(-18, 0, -0.6f, 3.6000001f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -7.4f, 20.4f).setRotationAngle(0, 0, 0).setName("Box 248cp")
		);
		door_front_left.add(new ModelRendererTurbo(door_front_left, 221, 3, textureX, textureY)
			.addShapeBox(-8, 0, -0.6f, 3.6000001f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19, -7.4f, 19.9f).setRotationAngle(0, 0, 0).setName("Box 248cp")
		);
		door_front_left.addPrograms(DefaultPrograms.RGB_PRIMARY, new DefaultPrograms.AttributeRotator("c7_doors_fl", true, 0, 60, 0.5f, 1, 0f));
		this.groups.add(door_front_left);
		//
		TurboList door_front_right = new TurboList("door_front_right");
		door_front_right.add(new ModelRendererTurbo(door_front_right, 166, 125, textureX, textureY)
			.addShapeBox(-19.2f, 0, -1.2f, 20.400002f, 13.2f, 1.2f, 0, 0, 0.9f, 0, 0, -0.9f, 0, 0, -1.4f, 0, 0, 0.9f, 0, -1.2f, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, -1.2f, 0, -1.2f)
			.setRotationPoint(18, -11, -19.2f).setRotationAngle(0, 0, 0).setName("Box 244")
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 158, 31, textureX, textureY)
			.addShapeBox(-19.2f, -2.4f, -1.2f, 20.400002f, 1.2f, 1.2f, 0, 0, -1.18f, 0, 0, -2.98f, 0, 0, -2.4f, -0.6f, 0, -1.18f, 0, 0, 0.1f, 0, 0, 1.9f, 0, 0, 2.4f, 0, 0, 0.1f, 0)
			.setRotationPoint(18, -10.8f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 245")
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 204, 3, textureX, textureY)
			.addShapeBox(-18, 0, -1.8000001f, 3.6000001f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -7.4f, -19.2f).setRotationAngle(0, 0, 0).setName("Box 249cp")
		);
		door_front_right.add(new ModelRendererTurbo(door_front_right, 204, 3, textureX, textureY)
			.addShapeBox(-7, 0, -1.8000001f, 3.6000001f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, -7.4f, -18.7f).setRotationAngle(0, 0, 0).setName("Box 249cp")
		);
		door_front_right.addPrograms(DefaultPrograms.RGB_PRIMARY, new DefaultPrograms.AttributeRotator("c7_doors_fr", true, -60, 0, -0.5f, 1, 0f));
		this.groups.add(door_front_right);
		//
		TurboList door_hood = new TurboList("door_hood");
		door_hood.add(new ModelRendererTurbo(door_hood, 110, 39, textureX, textureY)
			.addShapeBox(12, 0, 0, 13.200001f, 1.2f, 31.2f, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0.6f, 0, 0, 0.6f, 0, 0, 0, 0)
			.setRotationPoint(26.400002f, -12, -15.6f).setRotationAngle(0, 0, 0).setName("Box 59")
		);
		door_hood.add(new ModelRendererTurbo(door_hood, 126, 125, textureX, textureY)
			.addShapeBox(25.2f, 1.2f, 0, 3.6000001f, 1.2f, 31.2f, 0, 0, 0.6f, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0.6f, 0, 0, 0, 0, 0.120000005f, 0, 0, 0.120000005f, 0, 0, 0, 0, 0)
			.setRotationPoint(26.400002f, -12, -15.6f).setRotationAngle(0, 0, 0).setName("Box 67")
		);
		door_hood.add(new ModelRendererTurbo(door_hood, 212, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1.2f, 31.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.400002f, -12, -15.6f).setRotationAngle(0, 0, 0).setName("Box 58cp")
		);
		door_hood.add(new ModelRendererTurbo(door_hood, 33, 111, textureX, textureY)
			.addShapeBox(24, 1.8000001f, 0, 1.2f, 1.2f, 21.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.400002f, -11, -10.8f).setRotationAngle(0, 0, 0).setName("Box 96cp")
		);
		door_hood.addPrograms(DefaultPrograms.RGB_PRIMARY, new DefaultPrograms.AttributeRotator("c7_hood", true, -70, 0, -1, 2, 0f));
		this.groups.add(door_hood);
		//
		TurboList door_rear_left = new TurboList("door_rear_left");
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 464, 26, textureX, textureY)
			.addShapeBox(-20.400002f, 0, 1.2f, 21.6f, 14.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, -1.2f, 0, 0, -1.2f, 0, 0, 1.2f, -1.2f, 0, 1.2f)
			.setRotationPoint(-6, -12, 18).setRotationAngle(0, 0, 0).setName("Box 246")
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 221, 0, textureX, textureY)
			.addShapeBox(-16.800001f, 0, 1.8000001f, 3.6000001f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6, -7.4f, 18).setRotationAngle(0, 0, 0).setName("Box 250cp")
		);
		door_rear_left.add(new ModelRendererTurbo(door_rear_left, 221, 0, textureX, textureY)
			.addShapeBox(-5.8f, 0, 1.8000001f, 3.6000001f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6, -7.4f, 17.5f).setRotationAngle(0, 0, 0).setName("Box 250cp")
		);
		door_rear_left.addPrograms(DefaultPrograms.RGB_PRIMARY, new DefaultPrograms.AttributeRotator("c7_doors_bl", true, 0, 60, 0.5f, 1, 0f));
		this.groups.add(door_rear_left);
		//
		TurboList door_rear_right = new TurboList("door_rear_right");
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 464, 10, textureX, textureY)
			.addShapeBox(-20.400002f, 0, 1.2f, 21.6f, 14.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 1.2f, 0, 0, 1.2f, 0, 0, -1.2f, -1.2f, 0, -1.2f)
			.setRotationPoint(-6, -12, -21.6f).setRotationAngle(0, 0, 0).setName("Box 247")
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 204, 0, textureX, textureY)
			.addShapeBox(-16.800001f, 0, 0.6f, 3.6000001f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6, -7.4f, -21.6f).setRotationAngle(0, 0, 0).setName("Box 251cp")
		);
		door_rear_right.add(new ModelRendererTurbo(door_rear_right, 204, 0, textureX, textureY)
			.addShapeBox(-5.8f, 0, 0.6f, 3.6000001f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6, -7.4f, -21.1f).setRotationAngle(0, 0, 0).setName("Box 251cp")
		);
		door_rear_right.addPrograms(DefaultPrograms.RGB_PRIMARY, new DefaultPrograms.AttributeRotator("c7_doors_br", true, -60, 0, -0.5f, 1, 0f));
		this.groups.add(door_rear_right);
		//
		TurboList door_trunk = new TurboList("door_trunk");
		door_trunk.add(new ModelRendererTurbo(door_trunk, 77, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 12.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5.4f, 0, -1.2f, -4.8f, 0, -1.2f, -4.8f, 0, 1.2f, 5.4f, 0, 1.2f)
			.setRotationPoint(-49.2f, -23.2f, 15.6f).setRotationAngle(0, 0, 0).setName("Box 255")
		);
		door_trunk.add(new ModelRendererTurbo(door_trunk, 414, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 12.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5.4f, 0, 1.2f, -4.8f, 0, 1.2f, -4.8f, 0, -1.2f, 5.4f, 0, -1.2f)
			.setRotationPoint(-49.2f, -23.2f, -16.800001f).setRotationAngle(0, 0, 0).setName("Box 256")
		);
		door_trunk.addPrograms(new DefaultPrograms.AttributeRotator("c7_trunk", true, 0, 75, 1, 2, 0f));
		this.groups.add(door_trunk);
		//
		TurboList door_trunk_primary = new TurboList("door_trunk_primary");
		door_trunk_primary.add(new ModelRendererTurbo(door_trunk_primary, 202, 112, textureX, textureY)
			.addShapeBox(-3.6000001f, 13.200001f, 0, 1.2f, 1.2f, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.08f, 0, 0, -1.08f, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.2f, -25.2f, -18).setRotationAngle(0, 0, 0).setName("Box 253")
		);
		door_trunk_primary.add(new ModelRendererTurbo(door_trunk_primary, 442, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 1.2f, 31.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.2f, -23.2f, -15.6f).setRotationAngle(0, 0, 0).setName("Box 254")
		);
		door_trunk_primary.add(new ModelRendererTurbo(door_trunk_primary, 110, 39, textureX, textureY)
			.addShapeBox(-7.2000003f, 15.6f, 4.8f, 1.2f, 1.2f, 14.400001f, 0, -0.6f, -0.48000002f, -0.6f, 0, 0, 0, 0, 0, 0, -0.6f, -0.48000002f, -0.6f, -0.6f, 0, -0.6f, 0, 0, 0, 0, 0, 0, -0.6f, 0, -0.6f)
			.setRotationPoint(-49.2f, -24.2f, -12).setRotationAngle(0, 0, 0).setName("Box 257")
		);
		/*door_trunk_primary.add(new ModelRendererTurbo(door_trunk_primary, 259, 80, textureX, textureY)
			.addShapeBox(-7.2000003f, 15.6f, 4.8f, 1.2f, 3.6000001f, 12, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0, -0.96000004f, 0, 0, 0, 0, 0, 0, 0, 0, -0.96000004f, 0, 0)
			.setRotationPoint(-49.2f, -23, -10.8f).setRotationAngle(0, 0, 0).setName("Box 258")
		);*/
		door_trunk_primary.add(new ModelRendererTurbo(door_trunk_primary, 243, 119, textureX, textureY)
			.addShapeBox(-6, 13.200001f, 0, 2.4f, 13, 33.600002f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.2f, -25.2f, -16.800001f).setRotationAngle(0, 0, 0).setName("Box 252cp")
		);
		door_trunk_primary.addPrograms(DefaultPrograms.RGB_PRIMARY, new DefaultPrograms.AttributeRotator("c7_trunk", true, 0, 75, 1, 2, 0f));
		this.groups.add(door_trunk_primary);
		//
		TurboList label = new TurboList("label");
		label.add(new ModelRendererTurbo(label, 193, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.2f, 1.4f, 0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-52, -10.7f, -20.7f).setRotationAngle(0, 0, 0)
		);
		label.add(new ModelRendererTurbo(label, 185, 39, textureX, textureY)
			.addShapeBox(2.8f, 0, 0, 0.2f, 0.8f, 0.2f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-51.2f, -10.7f, -20.7f).setRotationAngle(0, 0, 0)
		);
		label.add(new ModelRendererTurbo(label, 135, 39, textureX, textureY)
			.addShapeBox(2.8f, 0, 0, 0.2f, 0.8f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, 0.4f, 0, 0, 0.4f, 0, 0, -0.4f, 0, 0)
			.setRotationPoint(-51.6f, -10.1f, -20.7f).setRotationAngle(0, 0, 0)
		);
		label.add(new ModelRendererTurbo(label, 127, 39, textureX, textureY)
			.addShapeBox(4, 0, 0, 0.2f, 0.8f, 0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0)
			.setRotationPoint(-52, -10.7f, -20.7f).setRotationAngle(0, 0, 0)
		);
		label.add(new ModelRendererTurbo(label, 118, 39, textureX, textureY)
			.addShapeBox(4, 0, 0, 0.2f, 0.8f, 0.2f, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0)
			.setRotationPoint(-51.2f, -10.1f, -20.7f).setRotationAngle(0, 0, 0)
		);
		label.add(new ModelRendererTurbo(label, 110, 39, textureX, textureY)
			.addShapeBox(4, 0, 0, 0.8f, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.8f, -10.7f, -20.7f).setRotationAngle(0, 0, 0)
		);
		label.add(new ModelRendererTurbo(label, 444, 35, textureX, textureY)
			.addShapeBox(4, 0, 0, 0.8f, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52, -9.5f, -20.7f).setRotationAngle(0, 0, 0)
		);
		label.add(new ModelRendererTurbo(label, 444, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.2f, 1.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.6f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0.6f, 0, 0)
			.setRotationPoint(-50, -10.5f, -20.7f).setRotationAngle(0, 0, 0)
		);
		label.add(new ModelRendererTurbo(label, 436, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.8f, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.8f, -10.7f, -20.7f).setRotationAngle(0, 0, 0)
		);
		label.add(new ModelRendererTurbo(label, 382, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 0.8f, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.8f, -9.5f, -20.7f).setRotationAngle(0, 0, 0)
		);
		label.add(new ModelRendererTurbo(label, 350, 10, textureX, textureY)
			.addShapeBox(2.8f, 0, 0, 0.6f, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.8f, -10.7f, -20.7f).setRotationAngle(0, 0, 0)
		);
		label.add(new ModelRendererTurbo(label, 180, 9, textureX, textureY)
			.addShapeBox(2.8f, 0, 0, 0.6f, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.8f, -10.1f, -20.7f).setRotationAngle(0, 0, 0)
		);
		label.add(new ModelRendererTurbo(label, 175, 9, textureX, textureY)
			.addShapeBox(2.8f, 0, 0, 0.2f, 1.4f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52, -10.7f, -20.7f).setRotationAngle(0, 0, 0)
		);
		label.add(new ModelRendererTurbo(label, 182, 0, textureX, textureY)
			.addShapeBox(4, 0, 0, 0.6f, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.8f, -10.1f, -20.7f).setRotationAngle(0, 0, 0)
		);
		label.add(new ModelRendererTurbo(label, 165, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.8f, -10.7f, -20.7f).setRotationAngle(0, 0, 0)
		);
		label.addProgram(DefaultPrograms.LIGHTS);
		this.groups.add(label);
	}

}
