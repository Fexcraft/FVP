//FMT-Marker FVTM-1
package net.fexcraft.mod.addon.fvp.models.part.c10;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter V1 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.8 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c10_seats")
public class C10Seats extends PartModel {

	public C10Seats(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand");
		//
		ModelGroup seats = new ModelGroup("seats");
		seats.add(new ModelRendererTurbo(seats, 366, 42, textureX, textureY).addBox(0, 0, 0, 13, 3, 36)
			.setRotationPoint(-20, -1, -18).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 294, 120, textureX, textureY).addBox(-2, 0, 0, 3, 14, 36)
			.setRotationPoint(-20, -14, -18).setRotationAngle(0, 0, -11)
		);
		seats.add(new ModelRendererTurbo(seats, 300, 42, textureX, textureY).addBox(-1, -1, 5, 1, 1, 1)
			.setRotationPoint(-20, -14, -18).setRotationAngle(0, 0, -11)
		);
		seats.add(new ModelRendererTurbo(seats, 470, 41, textureX, textureY).addBox(-1, -1, 10, 1, 1, 1)
			.setRotationPoint(-20, -14, -18).setRotationAngle(0, 0, -11)
		);
		seats.add(new ModelRendererTurbo(seats, 170, 41, textureX, textureY).addBox(-1, -1, 25, 1, 1, 1)
			.setRotationPoint(-20, -14, -18).setRotationAngle(0, 0, -11)
		);
		seats.add(new ModelRendererTurbo(seats, 165, 41, textureX, textureY).addBox(-1, -1, 30, 1, 1, 1)
			.setRotationPoint(-20, -14, -18).setRotationAngle(0, 0, -11)
		);
		seats.add(new ModelRendererTurbo(seats, 233, 106, textureX, textureY).addBox(-1.5f, -5, 4, 2, 4, 8)
			.setRotationPoint(-20, -14, -18).setRotationAngle(0, 0, -11)
		);
		seats.add(new ModelRendererTurbo(seats, 0, 105, textureX, textureY).addBox(-1.5f, -5, 24, 2, 4, 8)
			.setRotationPoint(-20, -14, -18).setRotationAngle(0, 0, -11)
		);
		seats.add(new ModelRendererTurbo(seats, 183, 66, textureX, textureY).addBox(0, 0, 0, 9, 1, 2)
			.setRotationPoint(2, 1, 13).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 160, 66, textureX, textureY).addBox(0, 0, 0, 9, 1, 2)
			.setRotationPoint(2, 1, 5).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 237, 50, textureX, textureY).addBox(0, 0, 0, 12, 2, 12)
			.setRotationPoint(0, -1, 4).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 0, 47, textureX, textureY).addBox(-1, 0, 0, 15, 2, 12)
			.setRotationPoint(0, -1, 4).setRotationAngle(0, 0, -102)
		);
		seats.add(new ModelRendererTurbo(seats, 160, 41, textureX, textureY).addBox(14, 0.5f, 3, 1, 1, 1)
			.setRotationPoint(0, -1, 4).setRotationAngle(0, 0, -102)
		);
		seats.add(new ModelRendererTurbo(seats, 437, 38, textureX, textureY).addBox(14, 0.5f, 8, 1, 1, 1)
			.setRotationPoint(0, -1, 4).setRotationAngle(0, 0, -102)
		);
		seats.add(new ModelRendererTurbo(seats, 334, 84, textureX, textureY).addBox(15, 0, 1.5f, 4, 2, 8.5f)
			.setRotationPoint(0, -1, 4).setRotationAngle(0, 0, -102)
		);
		seats.add(new ModelRendererTurbo(seats, 137, 66, textureX, textureY).addBox(0, 0, 0, 9, 1, 2)
			.setRotationPoint(2, 1, -7).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 262, 65, textureX, textureY).addBox(0, 0, 0, 9, 1, 2)
			.setRotationPoint(2, 1, -15).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 429, 49, textureX, textureY).addBox(0, 0, 0, 12, 2, 12)
			.setRotationPoint(0, -1, -16).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 294, 43, textureX, textureY).addBox(-1, 0, 0, 15, 2, 12)
			.setRotationPoint(0, -1, -16).setRotationAngle(0, 0, -102)
		);
		seats.add(new ModelRendererTurbo(seats, 504, 36, textureX, textureY).addBox(14, 0.5f, 3, 1, 1, 1)
			.setRotationPoint(0, -1, -16).setRotationAngle(0, 0, -102)
		);
		seats.add(new ModelRendererTurbo(seats, 355, 29, textureX, textureY).addBox(14, 0.5f, 8, 1, 1, 1)
			.setRotationPoint(0, -1, -16).setRotationAngle(0, 0, -102)
		);
		seats.add(new ModelRendererTurbo(seats, 419, 82, textureX, textureY).addBox(15, 0, 1.5f, 4, 2, 8.5f)
			.setRotationPoint(0, -1, -16).setRotationAngle(0, 0, -102)
		);
		seats.addProgram("fvtm:example_program");//TODO do not forget these exists!
		this.groups.add(seats);
		//
	}

}
