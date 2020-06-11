//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.t3;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.5.2 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/t3_rear_wheel")
public class T3RearWheel extends PartModel {

	public T3RearWheel(){
		super(); textureX = 256; textureY = 128;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList wheel1 = new TurboList("wheel1");
		wheel1.add(new ModelRendererTurbo(wheel1, 97, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 24, 18, 5, 16, 0, 0.5f, 0.5f, 1,
			null, new boolean[]{ true, true, false, false }));
		wheel1.add(new ModelRendererTurbo(wheel1, 48, 78, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true }).setName("Box 52")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 37, 78, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -22.5f).setName("Box 53")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 241, 76, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -45).setName("Box 54")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 235, 74, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -90).setName("Box 55")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 224, 74, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -67.5f).setName("Box 56")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 213, 74, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -112.5f).setName("Box 57")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 202, 74, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -135).setName("Box 58")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 191, 74, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -157.5f).setName("Box 59")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 180, 74, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -180).setName("Box 60")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 169, 74, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -202.5f).setName("Box 61")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 158, 74, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -225).setName("Box 62")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 147, 74, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -247.5f).setName("Box 63")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 136, 74, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -270).setName("Box 64")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 125, 74, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -292.5f).setName("Box 65")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 114, 74, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -315).setName("Box 66")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 103, 74, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -337.5f).setName("Box 67")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 242, 69, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false }).setName("Box 36")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 231, 69, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -22.5f).setName("Box 37")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 180, 69, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -45).setName("Box 38")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 169, 69, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -67.5f).setName("Box 39")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 158, 69, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -90).setName("Box 40")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 147, 69, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -112.5f).setName("Box 41")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 136, 69, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -135).setName("Box 42")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 125, 69, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -157.5f).setName("Box 43")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 114, 69, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -180).setName("Box 44")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 103, 69, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -202.5f).setName("Box 45")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 242, 64, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -225).setName("Box 46")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 231, 64, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -247.5f).setName("Box 47")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 180, 64, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -270).setName("Box 48")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 169, 64, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -292.5f).setName("Box 49")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 158, 64, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -315).setName("Box 50")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 147, 64, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -337.5f).setName("Box 51")
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 0, 59, textureX, textureY).addCylinder(0, 0, 0, 9, 1, 16, 1, 1, 1, null)
			.setRotationPoint(0, 0, 4).setRotationAngle(0, 0, 0)
		);
		wheel1.add(new ModelRendererTurbo(wheel1, 194, 47, textureX, textureY).addHollowCylinder(0, 0, 0, 9, 8.5f, 4, 16, 0, 1, 0.875f, 0, null));
		wheel1.addProgram(DefaultPrograms.WHEEL_AUTO_ALL);
		this.groups.add(wheel1);
		//
		TurboList wheel2 = new TurboList("wheel2");
		wheel2.add(new ModelRendererTurbo(wheel2, 0, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 24, 18, 5, 16, 0, 0.5f, 0.5f, 1,
			null, new boolean[]{ true, true, false, false })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, 0)
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 136, 64, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, 0).setName("Box 36")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 125, 64, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -22.5f).setName("Box 37")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 114, 64, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -45).setName("Box 38")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 103, 64, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -67.5f).setName("Box 39")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 242, 59, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -90).setName("Box 40")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 231, 59, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -112.5f).setName("Box 41")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 180, 59, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -135).setName("Box 42")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 169, 59, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -157.5f).setName("Box 43")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 158, 59, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -180).setName("Box 44")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 147, 59, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -202.5f).setName("Box 45")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 136, 59, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -225).setName("Box 46")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 125, 59, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -247.5f).setName("Box 47")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 114, 59, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -270).setName("Box 48")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 103, 59, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -292.5f).setName("Box 49")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 242, 54, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -315).setName("Box 50")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 231, 54, textureX, textureY)
			.addShapeBox(0, 9, 5, 5, 3, 1, 0, 0, 0, 0, -1.55f, 0.7f, 0, -1.35f, 0.25f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.4f, -0.9f, 0, -0.6f, -1.4f, -0.5f, 0, -0.5f, -0.5f,
				new boolean[]{ true, true, false, false, true, false })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -337.5f).setName("Box 51")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 242, 49, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, 0).setName("Box 52")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 231, 49, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -22.5f).setName("Box 53")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 242, 44, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -45).setName("Box 54")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 231, 44, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -90).setName("Box 55")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 242, 39, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -67.5f).setName("Box 56")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 231, 39, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -112.5f).setName("Box 57")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 242, 34, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -135).setName("Box 58")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 231, 34, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -157.5f).setName("Box 59")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 242, 29, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -180).setName("Box 60")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 231, 29, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -202.5f).setName("Box 61")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 242, 24, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -225).setName("Box 62")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 231, 24, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -247.5f).setName("Box 63")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 242, 19, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -270).setName("Box 64")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 231, 19, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -292.5f).setName("Box 65")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 242, 14, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -315).setName("Box 66")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 231, 14, textureX, textureY)
			.addShapeBox(0, 9, -1, 5, 3, 1, 0, 0, -0.5f, -0.5f, -1.35f, 0.25f, -0.5f, -1.55f, 0.7f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.4f, -0.5f, -0.4f, -0.9f, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, true })
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, -337.5f).setName("Box 67")
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 194, 27, textureX, textureY).addCylinder(0, 0, 0, 9, 1, 16, 1, 1, 1, null)
			.setRotationPoint(0, 0, 6.5f).setRotationAngle(0, 0, 0)
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 194, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 9, 8.5f, 4, 16, 0, 1, 0.875f, 1,
			null, new boolean[]{ false, false, true, false })
			.setRotationPoint(0, 0, 7.5f).setRotationAngle(0, 0, 0)
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 37, 59, textureX, textureY).addHollowCylinder(0, 0, 0, 8, 7, 1, 16, 0, 1, 1, 1,
			null, new boolean[]{ false, false, true, false })
			.setRotationPoint(0, 0, 3).setRotationAngle(0, 0, 0)
		);
		wheel2.add(new ModelRendererTurbo(wheel2, 70, 59, textureX, textureY).addHollowCylinder(0, 0, 0, 8, 7, 1, 16, 0, 1, 1, 1,
			null, new boolean[]{ false, false, true, false })
			.setRotationPoint(0, 0, 7.5f).setRotationAngle(0, 0, 0)
		);
		wheel2.addProgram(DefaultPrograms.WHEEL_AUTO_ALL);
		this.groups.add(wheel2);
		//
		TurboList inner = new TurboList("inner");
		inner.add(new ModelRendererTurbo(inner, 231, 0, textureX, textureY).addCylinder(0, 0, 0, 4, 5, 16, 1, 1, 1, null)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 68, 78, textureX, textureY).addBox(-0.5f, -3.5f, 4, 1, 1, 6)
			.setRotationPoint(0, 0, -1).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 53, 78, textureX, textureY).addBox(-0.5f, 2.5f, 4, 1, 1, 6)
			.setRotationPoint(0, 0, -1).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 224, 76, textureX, textureY).addBox(2.5f, -0.5f, 4, 1, 1, 6)
			.setRotationPoint(0, 0, -1).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 202, 76, textureX, textureY).addBox(-3.5f, -0.5f, 4, 1, 1, 6)
			.setRotationPoint(0, 0, -1).setRotationAngle(0, 0, 0)
		);
		inner.add(new ModelRendererTurbo(inner, 180, 76, textureX, textureY).addBox(-0.5f, -3.5f, 4, 1, 1, 6)
			.setRotationPoint(0, 0, -1).setRotationAngle(0, 0, -45)
		);
		inner.add(new ModelRendererTurbo(inner, 158, 76, textureX, textureY).addBox(-0.5f, 2.5f, 4, 1, 1, 6)
			.setRotationPoint(0, 0, -1).setRotationAngle(0, 0, -45)
		);
		inner.add(new ModelRendererTurbo(inner, 136, 76, textureX, textureY).addBox(2.5f, -0.5f, 4, 1, 1, 6)
			.setRotationPoint(0, 0, -1).setRotationAngle(0, 0, -45)
		);
		inner.add(new ModelRendererTurbo(inner, 114, 76, textureX, textureY).addBox(-3.5f, -0.5f, 4, 1, 1, 6)
			.setRotationPoint(0, 0, -1).setRotationAngle(0, 0, -45)
		);
		inner.add(new ModelRendererTurbo(inner, 99, 76, textureX, textureY).addBox(-1, -1, 0, 2, 2, 10)
			.setRotationPoint(0, 0, -1).setRotationAngle(0, 0, 0)
		);
		inner.addProgram(DefaultPrograms.WHEEL_AUTO_ALL);
		this.groups.add(inner);
	}

}
