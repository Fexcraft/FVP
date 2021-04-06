package net.fexcraft.mod.addon.fvp.models.gauges;

import net.fexcraft.lib.common.math.Vec3f;
import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.mod.fvtm.model.RailGaugeModel;

@fModel(registryname = "fvp:models/gauges/tram_30")
public class TramGaugeModel extends RailGaugeModel {
	
	public TramGaugeModel(){
		super();
		rails = new Vec3f[][]{
			{ new Vec3f(-1.0625, 0.065, 0), new Vec3f(-0.9375, 0.065, 0) },
			{ new Vec3f( 0.9375, 0.065, 0), new Vec3f( 1.0625, 0.065, 0) },
			//
			{ new Vec3f(-1.0625, 0, 0), new Vec3f(-1.0625, 0.065, 0) },
			{ new Vec3f(-0.9375, 0.065, 0), new Vec3f(-0.9375, 0, 0) },
			//
			{ new Vec3f(0.9375, 0, 0), new Vec3f(0.9375, 0.065, 0) },
			{ new Vec3f(1.0625, 0.065, 0), new Vec3f(1.0625, 0, 0) },
			//
			{ new Vec3f(-1.0625, 0, 0), new Vec3f(-0.9375, 0, 0) },
			{ new Vec3f(0.9375, 0, 0), new Vec3f(1.0625, 0, 0) }
		};
	}
	
}