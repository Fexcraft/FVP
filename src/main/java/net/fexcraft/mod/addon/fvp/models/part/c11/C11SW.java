//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.c11;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.3.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c11_steering_wheel")
public class C11SW extends PartModel {

	public C11SW(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList steering_wheel = new TurboList("steering_wheel");
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 125, 78, textureX, textureY)
			.addShapeBox(0, 1, -0.5f, 1, 2, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(11, -8.5f, 10).setRotationAngle(-124, 0, 15)
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 503, 28, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 16, 0.75f, 0.75f, 3, null)
			.setRotationPoint(11, -8.5f, 10).setRotationAngle(0, 0, 15)
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 301, 5, textureX, textureY).addHollowCylinder(0.125f, 0, 0, 3, 1, 1, 16, 4, 1, 1, 3, new net.fexcraft.lib.common.math.Vec3f(-0.25, 0.0, 0.0))
			.setRotationPoint(11, -8.5f, 10).setRotationAngle(45, 0, 15)
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 486, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 4, 3, 1, 16, 0, 1, 1, 3, null)
			.setRotationPoint(11, -8.5f, 10).setRotationAngle(0, 0, 15)
		);
		steering_wheel.add(new ModelRendererTurbo(steering_wheel, 120, 78, textureX, textureY)
			.addShapeBox(0, 1, -0.5f, 1, 2, 1, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(11, -8.5f, 10).setRotationAngle(124, 0, 15)
		);
		this.groups.add(steering_wheel);
	}

}
