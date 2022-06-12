//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.sb1;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.1 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/sb1_ticket_machines")
public class SB1TicketMachines extends PartModel {

	public SB1TicketMachines(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		ModelGroup ticket_machines = new ModelGroup("ticket_machines");
		ticket_machines.add(new ModelRendererTurbo(ticket_machines, 349, 128, textureX, textureY).addBox(0, 0, 0, 3, 8, 4)
			.setRotationPoint(-93.5f, -47, -10).setRotationAngle(0, 0, 0)
		);
		ticket_machines.add(new ModelRendererTurbo(ticket_machines, 379, 135, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-91.375f, -46, -9.5f).setRotationAngle(0, 0, 0)
		);
		ticket_machines.add(new ModelRendererTurbo(ticket_machines, 379, 140, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-91.375f, -44, -9.5f).setRotationAngle(0, 0, 0)
		);
		ticket_machines.add(new ModelRendererTurbo(ticket_machines, 364, 128, textureX, textureY).addBox(0, 0, 0, 3, 8, 4)
			.setRotationPoint(90.5f, -47, -10).setRotationAngle(0, 0, 0)
		);
		ticket_machines.add(new ModelRendererTurbo(ticket_machines, 379, 125, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(90.375f, -46, -9.5f).setRotationAngle(0, 0, 0)
		);
		ticket_machines.add(new ModelRendererTurbo(ticket_machines, 379, 130, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(90.375f, -44, -9.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(ticket_machines);
	}

}
