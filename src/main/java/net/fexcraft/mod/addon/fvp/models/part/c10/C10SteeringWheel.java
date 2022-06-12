//FMT-Marker FVTM-1
package net.fexcraft.mod.addon.fvp.models.part.c10;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter V1 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.8 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c10_steering_wheel")
public class C10SteeringWheel extends PartModel {

	public C10SteeringWheel(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup steering_wheel = new ModelGroup("steering_wheel");
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 462, 25, textureX, textureY).addBox(-1, -0.5f, -0.5f, 1, 1, 1)
			.setRotationPoint(14, -12, 10).setRotationAngle(0, 0, 15)
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 133, 0, textureX, textureY).addHollowCylinder(-2, 0, 0, 4, 3, 1, 16, 0, 1, 1, 3, null)
			.setRotationPoint(14, -12, 10).setRotationAngle(0, 0, 15)
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 259, 0, textureX, textureY).addCylinder(-2, 0, 0, 1, 1, 16, 1, 1, 3, null)
			.setRotationPoint(14, -12, 10).setRotationAngle(0, 0, 15)
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 248, 95, textureX, textureY)
			.addShapeBox(-2, -0.5f, 0.5f, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(14, -12, 10).setRotationAngle(30, 0, 15)
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 307, 68, textureX, textureY)
			.addShapeBox(-2, -0.5f, 0.5f, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(14, -12, 10).setRotationAngle(150, 0, 15)
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 150, 0, textureX, textureY).addHollowCylinder(-1.75f, 0, 0, 3, 1, 1, 16, 4, 1, 1, 3, new net.fexcraft.lib.common.math.Vec3f(-0.5, 0.0, 0.0))
			.setRotationPoint(14, -12, 10).setRotationAngle(45, 0, 15)
		);
		steering_wheel.addProgram(new DefaultPrograms.SteeringWheelCentered(0, 1.5f));//new DefaultPrograms.AttributeRotator("steering_angle", false, -360, 360, 1, 0, 0f, false));
		steering_wheel.translate(-14, 12, -10);
		this.groups.add(steering_wheel);
	}

}
