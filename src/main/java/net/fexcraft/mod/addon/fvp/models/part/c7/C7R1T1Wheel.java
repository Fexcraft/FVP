//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.c7;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.1 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c7r1t1")
public class C7R1T1Wheel extends PartModel {

	public C7R1T1Wheel(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList wheel = new TurboList("wheel");
		wheel.add(new ModelRendererTurbo(wheel, 0, 123, textureX, textureY)
			.addShapeBox(-7.2000003f, -7.2000003f, -1.2f, 2.4f, 4.8f, 4.8f, 0, -4.8f, 0, 0, 2.4f, -2.4f, 0, 2.4f, -2.4f, 0, -4.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 1.2f).setRotationAngle(0, 0, 0).setName("Box 114")
		);
		wheel.add(new ModelRendererTurbo(wheel, 494, 120, textureX, textureY)
			.addShapeBox(-7.2000003f, 2.4f, -1.2f, 2.4f, 4.8f, 4.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4.8f, 0, 0, 2.4f, -2.4f, 0, 2.4f, -2.4f, 0, -4.8f, 0, 0)
			.setRotationPoint(0, 0, 1.2f).setRotationAngle(0, 0, 0).setName("Box 115")
		);
		wheel.add(new ModelRendererTurbo(wheel, 472, 120, textureX, textureY)
			.addShapeBox(4.8f, 2.4f, -1.2f, 2.4f, 4.8f, 4.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2.4f, -2.4f, 0, -4.8f, 0, 0, -4.8f, 0, 0, 2.4f, -2.4f, 0)
			.setRotationPoint(0, 0, 1.2f).setRotationAngle(0, 0, 0).setName("Box 116")
		);
		wheel.add(new ModelRendererTurbo(wheel, 282, 119, textureX, textureY)
			.addShapeBox(4.8f, -7.2000003f, -1.2f, 2.4f, 4.8f, 4.8f, 0, 2.4f, -2.4f, 0, -4.8f, 0, 0, -4.8f, 0, 0, 2.4f, -2.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 1.2f).setRotationAngle(0, 0, 0).setName("Box 117")
		);
		wheel.add(new ModelRendererTurbo(wheel, 357, 78, textureX, textureY)
			.addShapeBox(-2.4f, -7.2000003f, -1.2f, 4.8f, 2.4f, 4.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 1.2f).setRotationAngle(0, 0, 0).setName("Box 110cp")
		);
		wheel.add(new ModelRendererTurbo(wheel, 478, 76, textureX, textureY)
			.addShapeBox(-2.4f, 4.8f, -1.2f, 4.8f, 2.4f, 4.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 1.2f).setRotationAngle(0, 0, 0).setName("Box 111cp")
		);
		wheel.add(new ModelRendererTurbo(wheel, 253, 119, textureX, textureY)
			.addShapeBox(4.8f, -2.4f, -1.2f, 2.4f, 4.8f, 4.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 1.2f).setRotationAngle(0, 0, 0).setName("Box 112cp")
		);
		wheel.add(new ModelRendererTurbo(wheel, 450, 117, textureX, textureY)
			.addShapeBox(-7.2000003f, -2.4f, -1.2f, 2.4f, 4.8f, 4.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 1.2f).setRotationAngle(0, 0, 0).setName("Box 113cp")
		);
		wheel.add(new ModelRendererTurbo(wheel, 157, 85, textureX, textureY)
			.addShapeBox(-4.8f, -4.8f, 0, 9.6f, 9.6f, 2.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 1.2f).setRotationAngle(0, 0, 0).setName("Box 118cp")
		);
		wheel.addProgram(DefaultPrograms.WHEEL_AUTO_ALL);
		this.groups.add(wheel);
	}

}
