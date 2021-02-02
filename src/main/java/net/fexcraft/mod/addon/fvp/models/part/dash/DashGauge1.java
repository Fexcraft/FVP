//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.part.dash;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/dash_gauge1")
public class DashGauge1 extends PartModel {

	public DashGauge1(){
		super(); textureX = 16; textureY = 8;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList gauge = new TurboList("gauge");
		gauge.add(new ModelRendererTurbo(gauge, 10, 3, textureX, textureY)
			.addShapeBox(-0.025f, -0.05f, 0, 0.1f, 0.1f, 0.8f, 0, 0, 0, 0, 0, 0, 0, -0.025f, -0.025f, 0, -0.025f, -0.025f, 0, 0, 0, 0, 0, 0, 0, -0.025f, -0.025f, 0, -0.025f, -0.025f, 0)
			.setRotationPoint(0, -0.9f, 0).setRotationAngle(0, 0, 0)
		);
		gauge.add(new ModelRendererTurbo(gauge, 11, 0, textureX, textureY)
			.addShapeBox(-0.025f, -0.05f, -0.1f, 0.1f, 0.1f, 0.1f, 0, -0.025f, -0.025f, 0, -0.025f, -0.025f, 0, 0, 0, 0, 0, 0, 0, -0.025f, -0.025f, 0, -0.025f, -0.025f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -0.9f, 0).setRotationAngle(0, 0, 0)
		);
		gauge.addPrograms(DefaultPrograms.LIGHTS, new DefaultPrograms.Gauge("speed", 0, -18, 202, 0, 160));
		gauge.translate(0, 1, 0);
		this.groups.add(gauge);
		//
		TurboList base = new TurboList("base");
		base.add(new ModelRendererTurbo(base, 0, 0, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(1, 0.9f).setLength(1).setSegments(16, 10).setScale(1, 1).setDirection(3)
			.setTopOffset(new net.fexcraft.lib.common.math.Vec3f(-0.9, 0.0, 0.0)).build()
			.setRotationPoint(0, -0.9f, 0).setRotationAngle(-66, 0, 0)
		);
		base.add(new ModelRendererTurbo(base, 6, 0, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 12, 0.1f, 0.2f, 3, new net.fexcraft.lib.common.math.Vec3f(-0.9, 0.0, 0.0))
			.setRotationPoint(0, -0.9f, 0).setRotationAngle(0, 0, 0)
		);
		base.translate(0, 1, 0);
		this.groups.add(base);
	}

}
