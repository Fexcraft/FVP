package net.fexcraft.mod.addon.fvp.models.gauges;

import net.fexcraft.lib.common.Static;
import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.mod.fvtm.model.RailGaugeModel;

@fModel(registryname = "fvp:models/gauges/tram_30")
public class TramGaugeModel extends RailGaugeModel {
	
	public TramGaugeModel(){
		super();
		addRailRect(Static.sixteenth, 15, 1, 2, 1, true);
		addRailRect(Static.sixteenth, 14, 0.01f, 1, 0, true);
		addRailRect(Static.sixteenth, 13, 0.1f, 1, 0.1f, true);
	}
	
}