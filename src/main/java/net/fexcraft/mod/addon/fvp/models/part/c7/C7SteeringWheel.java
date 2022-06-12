//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.c7;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.1 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c7_steering_wheel")
public class C7SteeringWheel extends PartModel {

	public C7SteeringWheel(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup steering_wheel = new ModelGroup("steering_wheel");
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 506, 42, textureX, textureY)
			.addShapeBox(0, -3, 0.6f, 1.2f, 2.4f, 1.2f, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0)
			.setRotationPoint(13.4f, -11.2f, 9.6f).setRotationAngle(0, 0, 8).setName("Box 262")
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 498, 42, textureX, textureY)
			.addShapeBox(0, 0.6f, 0.6f, 1.2f, 2.4f, 1.2f, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0)
			.setRotationPoint(13.4f, -11.2f, 9.6f).setRotationAngle(0, 0, 8).setName("Box 263")
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 464, 42, textureX, textureY)
			.addShapeBox(0, -0.6f, 1.8000001f, 1.2f, 1.2f, 2.4f, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0)
			.setRotationPoint(13.4f, -11.2f, 9.6f).setRotationAngle(0, 0, 8).setName("Box 264")
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 310, 40, textureX, textureY)
			.addShapeBox(0, -0.6f, -1.8000001f, 1.2f, 1.2f, 2.4f, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0, -0.24000001f, 0, 0)
			.setRotationPoint(13.4f, -11.2f, 9.6f).setRotationAngle(0, 0, 8).setName("Box 265")
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 293, 40, textureX, textureY)
			.addShapeBox(0, 1.8000001f, 4.2000003f, 1.2f, 2.4f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 1.2f, 0, -1.2f, 1.2f, 0, 0, -2.4f, 0, 0, -2.4f)
			.setRotationPoint(13.4f, -11.2f, 9.6f).setRotationAngle(0, 0, 8).setName("Box 270")
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 285, 40, textureX, textureY)
			.addShapeBox(0, -4.2000003f, 4.2000003f, 1.2f, 2.4f, 1.2f, 0, 0, -1.2f, 1.2f, 0, -1.2f, 1.2f, 0, 0, -2.4f, 0, 0, -2.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.4f, -11.2f, 9.6f).setRotationAngle(0, 0, 8).setName("Box 271")
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 237, 40, textureX, textureY)
			.addShapeBox(0, -4.2000003f, -3, 1.2f, 2.4f, 1.2f, 0, 0, 0, -2.4f, 0, 0, -2.4f, 0, -1.2f, 1.2f, 0, -1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.4f, -11.2f, 9.6f).setRotationAngle(0, 0, 8).setName("Box 272")
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 229, 40, textureX, textureY)
			.addShapeBox(0, 1.8000001f, -3, 1.2f, 2.4f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2.4f, 0, 0, -2.4f, 0, -1.2f, 1.2f, 0, -1.2f, 1.2f)
			.setRotationPoint(13.4f, -11.2f, 9.6f).setRotationAngle(0, 0, 8).setName("Box 273")
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 505, 0, textureX, textureY)
			.addShapeBox(0, -0.6f, 0.6f, 2.4f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.4f, -11.2f, 9.6f).setRotationAngle(0, 0, 8).setName("Box 261cp")
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 26, 0, textureX, textureY)
			.addShapeBox(0, 3, -0.6f, 1.2f, 1.2f, 3.6000001f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.4f, -11.2f, 9.6f).setRotationAngle(0, 0, 8).setName("Box 266cp")
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 0, 0, textureX, textureY)
			.addShapeBox(0, -4.2000003f, -0.6f, 1.2f, 1.2f, 3.6000001f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.4f, -11.2f, 9.6f).setRotationAngle(0, 0, 8).setName("Box 267cp")
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 187, 72, textureX, textureY)
			.addShapeBox(0, -1.8000001f, -3, 1.2f, 3.6000001f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.4f, -11.2f, 9.6f).setRotationAngle(0, 0, 8).setName("Box 268cp")
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 390, 56, textureX, textureY)
			.addShapeBox(0, -1.8000001f, 4.2000003f, 1.2f, 3.6000001f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.4f, -11.2f, 9.6f).setRotationAngle(0, 0, 8).setName("Box 269cp")
		);
		steering_wheel.addProgram(DefaultPrograms.STEERING_WHEEL_X);
		this.groups.add(steering_wheel);
	}

}
