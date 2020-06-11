//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.t3;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.5.2 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/t3_steering_wheel")
public class T3SteeringWheel extends PartModel {

	public T3SteeringWheel(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList steering_wheel = new TurboList("steering_wheel");
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 91, 271, textureX, textureY)
			.addShapeBox(-1, -1.5f, -5.5f, 1, 3, 4, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, -1, 0, -0.1f, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13, -35.5f, 12).setRotationAngle(0, 0, 5)
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 0, 270, textureX, textureY)
			.addShapeBox(-1, -1.5f, 1.5f, 1, 3, 4, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, -1, 0, -0.1f, -1, 0)
			.setRotationPoint(13, -35.5f, 12).setRotationAngle(0, 0, 5)
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 356, 216, textureX, textureY)
			.addShapeBox(-1.1f, -1, -1, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f)
			.setRotationPoint(13, -35.5f, 12).setRotationAngle(0, 0, 5)
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 453, 37, textureX, textureY).addHollowCylinder(0, 0, 0, 6, 5, 1, 16, 0, 1, 1, 2, null)
			.setRotationPoint(12, -35.5f, 12).setRotationAngle(0, 0, 5)
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 503, 267, textureX, textureY)
			.addShapeBox(-1, -1.5f, -1.5f, 1, 3, 3, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0)
			.setRotationPoint(13, -35.5f, 12).setRotationAngle(0, 0, 5)
		);
		this.groups.add(steering_wheel);
		//
	}

}
