//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.part.c12;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c12_rear_window_net")
public class C12RWN extends PartModel {

	public C12RWN(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList rear_window_net = new TurboList("rear_window_net");
		rear_window_net.add(new ModelRendererTurbo(rear_window_net, 412, 170, textureX, textureY).addBox(0, 0, 0, 0.5f, 1, 40)
			.setRotationPoint(-29.5f, -10.5f, -20).setRotationAngle(0, 0, 13)
		);
		rear_window_net.add(new ModelRendererTurbo(rear_window_net, 92, 167, textureX, textureY).addBox(0, -2, 0, 0.5f, 1, 40)
			.setRotationPoint(-29.5f, -10.5f, -20).setRotationAngle(0, 0, 13)
		);
		rear_window_net.add(new ModelRendererTurbo(rear_window_net, 165, 154, textureX, textureY).addBox(0, -4, 0, 0.5f, 1, 40)
			.setRotationPoint(-29.5f, -10.5f, -20).setRotationAngle(0, 0, 13)
		);
		rear_window_net.add(new ModelRendererTurbo(rear_window_net, 0, 154, textureX, textureY).addBox(0, -6, 0, 0.5f, 1, 40)
			.setRotationPoint(-29.5f, -10.5f, -20).setRotationAngle(0, 0, 13)
		);
		rear_window_net.add(new ModelRendererTurbo(rear_window_net, 50, 153, textureX, textureY).addBox(0, -8, 0, 0.5f, 1, 40)
			.setRotationPoint(-29.5f, -10.5f, -20).setRotationAngle(0, 0, 13)
		);
		rear_window_net.add(new ModelRendererTurbo(rear_window_net, 124, 81, textureX, textureY).addBox(0, -9, 0, 0.3f, 11, 1)
			.setRotationPoint(-29.4f, -10.5f, -17).setRotationAngle(0, 0, 13)
		);
		rear_window_net.add(new ModelRendererTurbo(rear_window_net, 120, 81, textureX, textureY).addBox(0, -9, 0, 0.3f, 11, 1)
			.setRotationPoint(-29.4f, -10.5f, 16).setRotationAngle(0, 0, 13)
		);
		rear_window_net.add(new ModelRendererTurbo(rear_window_net, 116, 81, textureX, textureY).addBox(0, -9, 0, 0.3f, 11, 1)
			.setRotationPoint(-29.4f, -10.5f, 12).setRotationAngle(0, 0, 13)
		);
		rear_window_net.add(new ModelRendererTurbo(rear_window_net, 112, 81, textureX, textureY).addBox(0, -9, 0, 0.3f, 11, 1)
			.setRotationPoint(-29.4f, -10.5f, -13).setRotationAngle(0, 0, 13)
		);
		rear_window_net.add(new ModelRendererTurbo(rear_window_net, 108, 81, textureX, textureY).addBox(0, -9, 0, 0.3f, 11, 1)
			.setRotationPoint(-29.4f, -10.5f, 8).setRotationAngle(0, 0, 13)
		);
		rear_window_net.add(new ModelRendererTurbo(rear_window_net, 104, 81, textureX, textureY).addBox(0, -9, 0, 0.3f, 11, 1)
			.setRotationPoint(-29.4f, -10.5f, -9).setRotationAngle(0, 0, 13)
		);
		rear_window_net.add(new ModelRendererTurbo(rear_window_net, 100, 81, textureX, textureY).addBox(0, -9, 0, 0.3f, 11, 1)
			.setRotationPoint(-29.4f, -10.5f, 4).setRotationAngle(0, 0, 13)
		);
		rear_window_net.add(new ModelRendererTurbo(rear_window_net, 471, 78, textureX, textureY).addBox(0, -9, 0, 0.3f, 11, 1)
			.setRotationPoint(-29.4f, -10.5f, -4).setRotationAngle(0, 0, 13)
		);
		rear_window_net.add(new ModelRendererTurbo(rear_window_net, 467, 78, textureX, textureY).addBox(0, -9, 0, 0.3f, 11, 1)
			.setRotationPoint(-29.4f, -10.5f, 0).setRotationAngle(0, 0, 13)
		);
		this.groups.add(rear_window_net);
		//
	}

}
