//FMT-Marker FVTM-1
package net.fexcraft.mod.addon.fvp.models.part.c9;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter V1 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.0.4-test &copy; 2018 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c9_steering_wheel")
public class C9SteeringWheel extends PartModel {

	public C9SteeringWheel(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup steering_wheel_base = new ModelGroup("steering_wheel_base");
		steering_wheel_base.add(new ModelRendererTurbo(steering_wheel_base, 161, 137, textureX, textureY)
			.addShapeBox(0, -1, -1, 4, 2, 2, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(6.5f, -2.5f, 8).setRotationAngle(0, 0, 12).setName("Box 446")
		);
		this.groups.add(steering_wheel_base);
		//
		ModelGroup steering_wheel = new ModelGroup("steering_wheel");
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 161, 137, textureX, textureY)
			.addShapeBox(0, -1, -1, 4, 2, 2, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(6.5f, -2.5f, 8).setRotationAngle(0, 0, 12).setName("Box 446")
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 2, 248, textureX, textureY).newCylinderBuilder()
			.setPosition(-1, 0, 0).setRadius(4, 3).setLength(1).setSegments(12, 0).setScale(1, 1).setDirection(3).build()
			.setRotationPoint(6.5f, -2.5f, 8).setRotationAngle(0, 0, 12)
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 21, 249, textureX, textureY)
			.addShapeBox(-0.9f, -1.5f, -3.5f, 0.8f, 2, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6.5f, -2.5f, 8).setRotationAngle(0, 0, 12).setName("Box 446cp")
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 19, 249, textureX, textureY)
			.addShapeBox(-0.9f, 0.5f, -1.5f, 0.8f, 3, 3, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(6.5f, -2.5f, 8).setRotationAngle(0, 0, 12).setName("Box 446cp")
		);
		steering_wheel.addProgram(new DefaultPrograms.SteeringWheel(0, 3f));
		this.groups.add(steering_wheel);
		//
		this.translate(0, -8, 0);
	}

}