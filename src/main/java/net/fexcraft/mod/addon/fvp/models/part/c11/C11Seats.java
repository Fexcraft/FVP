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
@fModel(registryname = "fvp:models/part/c11_seats")
public class C11Seats extends PartModel {

	public C11Seats(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList seats = new TurboList("seats");
		seats.add(new ModelRendererTurbo(seats, 308, 66, textureX, textureY).addBox(0, 0, 0, 12, 2, 12)
			.setRotationPoint(-1, 1, 4).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 421, 65, textureX, textureY).addBox(0, 0, 0, 12, 2, 12)
			.setRotationPoint(-1, 1, -16).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 119, 63, textureX, textureY).addBox(0, -1, 0, 15, 2, 12)
			.setRotationPoint(-1, 2, 4).setRotationAngle(0, 0, -100)
		);
		seats.add(new ModelRendererTurbo(seats, 265, 62, textureX, textureY).addBox(0, -1, 0, 15, 2, 12)
			.setRotationPoint(-1, 2, -16).setRotationAngle(0, 0, -100)
		);
		seats.add(new ModelRendererTurbo(seats, 405, 45, textureX, textureY).addBox(0, 0, 0, 8, 2, 1)
			.setRotationPoint(0, 3, 6).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 489, 44, textureX, textureY).addBox(0, 0, 0, 8, 2, 1)
			.setRotationPoint(0, 3, 13).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 489, 40, textureX, textureY).addBox(0, 0, 0, 8, 2, 1)
			.setRotationPoint(0, 3, -14).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 295, 33, textureX, textureY).addBox(0, 0, 0, 8, 2, 1)
			.setRotationPoint(0, 3, -7).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 379, 81, textureX, textureY).addBox(15, -0.5f, 3, 1, 1, 1)
			.setRotationPoint(-1, 2, 4).setRotationAngle(0, 0, -100)
		);
		seats.add(new ModelRendererTurbo(seats, 60, 81, textureX, textureY).addBox(15, -0.5f, 8, 1, 1, 1)
			.setRotationPoint(-1, 2, 4).setRotationAngle(0, 0, -100)
		);
		seats.add(new ModelRendererTurbo(seats, 278, 92, textureX, textureY).addBox(16, -1, 2, 4, 2, 8)
			.setRotationPoint(-1, 2, 4).setRotationAngle(0, 0, -100)
		);
		seats.add(new ModelRendererTurbo(seats, 55, 81, textureX, textureY).addBox(15, -0.5f, 3, 1, 1, 1)
			.setRotationPoint(-1, 2, -16).setRotationAngle(0, 0, -100)
		);
		seats.add(new ModelRendererTurbo(seats, 199, 80, textureX, textureY).addBox(15, -0.5f, 8, 1, 1, 1)
			.setRotationPoint(-1, 2, -16).setRotationAngle(0, 0, -100)
		);
		seats.add(new ModelRendererTurbo(seats, 208, 85, textureX, textureY).addBox(16, -1, 2, 4, 2, 8)
			.setRotationPoint(-1, 2, -16).setRotationAngle(0, 0, -100)
		);
		seats.add(new ModelRendererTurbo(seats, 138, 63, textureX, textureY).addBox(0, 0, 0, 12, 2, 36)
			.setRotationPoint(-21, 1, -18).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 221, 77, textureX, textureY).addBox(0, 0, 0, 10, 1, 36)
			.setRotationPoint(-21, 3, -18).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 200, 115, textureX, textureY).addBox(0, -14, 0, 3, 15, 36)
			.setRotationPoint(-22, 1, -18).setRotationAngle(0, 0, -5)
		);
		this.groups.add(seats);
	}

}
