//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.part.c12;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c12_seats")
public class C12Seats extends PartModel {

	public C12Seats(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup seats = new ModelGroup("seats");
		seats.add(new ModelRendererTurbo(seats, 149, 43, textureX, textureY).addBox(0, 0, 0, 13, 6, 41)
			.setRotationPoint(-26.5f, 1, -20.5f).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 366, 143, textureX, textureY).addBox(0, 0, 0, 2, 12, 41)
			.setRotationPoint(-27.5f, -10, -20.5f).setRotationAngle(0, 0, -6)
		);
		seats.add(new ModelRendererTurbo(seats, 234, 218, textureX, textureY).addBox(0, 0, 0, 13, 3, 12)
			.setRotationPoint(-6.5f, 1, 5).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 396, 50, textureX, textureY).addBox(0, 0, 0, 2, 11.5f, 12)
			.setRotationPoint(-7.5f, -10, 5).setRotationAngle(0, 0, -5)
		);
		seats.add(new ModelRendererTurbo(seats, 123, 208, textureX, textureY).addBox(0, 0, 0, 13, 3, 12)
			.setRotationPoint(-6.5f, 1, -17).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 216, 45, textureX, textureY).addBox(0, 0, 0, 2, 11.5f, 12)
			.setRotationPoint(-7.5f, -10, -17).setRotationAngle(0, 0, -5)
		);
		seats.add(new ModelRendererTurbo(seats, 49, 61, textureX, textureY).addBox(0, 0, 0, 9, 3, 2)
			.setRotationPoint(-4.5f, 4, -16).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 124, 58, textureX, textureY).addBox(0, 0, 0, 9, 3, 2)
			.setRotationPoint(-4.5f, 4, -8).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 363, 57, textureX, textureY).addBox(0, 0, 0, 9, 3, 2)
			.setRotationPoint(-4.5f, 4, 6).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 489, 56, textureX, textureY).addBox(0, 0, 0, 9, 3, 2)
			.setRotationPoint(-4.5f, 4, 14).setRotationAngle(0, 0, 0)
		);
		seats.addProgram(DefaultPrograms.getRGBChannel("seats"));
		this.groups.add(seats);
		//
	}

}
