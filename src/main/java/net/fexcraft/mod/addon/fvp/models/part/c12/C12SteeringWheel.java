//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.part.c12;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c12_steering_wheel")
public class C12SteeringWheel extends PartModel {

	public C12SteeringWheel(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup steering_wheel = new ModelGroup("steering_wheel");
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 0, 50, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(5, 4).setLength(1).setSegments(16, 0).setScale(1, 1).setDirection(3)
			.setTopOffset(null).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(5, -9, 11).setRotationAngle(0, 0, 8)
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 353, 51, textureX, textureY)
			.addShapeBox(0, -1, 1, 1, 2.5f, 2, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, -1, 0, -0.1f, -1, 0)
			.setRotationPoint(5, -9, 11).setRotationAngle(0, 0, 8)
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 363, 43, textureX, textureY)
			.addShapeBox(0, -1, 3, 1, 2, 1, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, -0.5f, 0, -0.1f, -0.5f, 0, -0.1f, -0.5f, 0, -0.1f, -0.5f, 0)
			.setRotationPoint(5, -9, 11).setRotationAngle(0, 0, 8)
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 402, 50, textureX, textureY)
			.addShapeBox(0, -1, -3, 1, 2.5f, 2, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, -1, 0, -0.1f, -1, 0, -0.1f, 0, 0, -0.1f, 0, 0)
			.setRotationPoint(5, -9, 11).setRotationAngle(0, 0, 8)
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 289, 43, textureX, textureY)
			.addShapeBox(0, -1, -3, 1, 2, 1, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, -0.5f, 0, -0.1f, -0.5f, 0, -0.1f, -0.5f, 0, -0.1f, -0.5f, 0)
			.setRotationPoint(5, -9, 10).setRotationAngle(0, 0, 8)
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 347, 63, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 2.5f, 2, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0)
			.setRotationPoint(5, -9, 11).setRotationAngle(0, 0, 8)
		);
		steering_wheel.addProgram(DefaultPrograms.STEERING_WHEEL_X);
		this.groups.add(steering_wheel);
	}

}
