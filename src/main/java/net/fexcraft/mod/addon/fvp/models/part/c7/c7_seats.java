//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.c7;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.1 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c7_seats")
public class c7_seats extends PartModel {

	public c7_seats(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList seats = new TurboList("seats");
		seats.add(new ModelRendererTurbo(seats, 108, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 2.4f, 12, 0, 0, 0, 0, 0, -0.24000001f, -1.2f, 0, -0.24000001f, -1.2f, 0, 0, 0, 0, 0, 0, 0, -0.24000001f, -1.2f, 0, -0.24000001f, -1.2f, 0, 0, 0)
			.setRotationPoint(-13.200001f, -0.2f, -18).setRotationAngle(0, 0, 0).setName("Box 215")
		);
		seats.add(new ModelRendererTurbo(seats, 0, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 2.4f, 12, 0, 0, 0, 0, 0, -0.24000001f, -1.2f, 0, -0.24000001f, -1.2f, 0, 0, 0, 0, 0, 0, 0, -0.24000001f, -1.2f, 0, -0.24000001f, -1.2f, 0, 0, 0)
			.setRotationPoint(-13.200001f, -0.2f, -6).setRotationAngle(0, 0, 0).setName("Box 216")
		);
		seats.add(new ModelRendererTurbo(seats, 357, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 2.4f, 12, 0, 0, 0, 0, 0, -0.24000001f, -1.2f, 0, -0.24000001f, -1.2f, 0, 0, 0, 0, 0, 0, 0, -0.24000001f, -1.2f, 0, -0.24000001f, -1.2f, 0, 0, 0)
			.setRotationPoint(-13.200001f, -0.2f, 6).setRotationAngle(0, 0, 0).setName("Box 217")
		);
		seats.add(new ModelRendererTurbo(seats, 268, 40, textureX, textureY)
			.addShapeBox(0, -1.2f, 0, 2.4f, 1.2f, 12, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.400002f, -14, -18).setRotationAngle(0, 0, -4).setName("Box 219")
		);
		seats.add(new ModelRendererTurbo(seats, 212, 40, textureX, textureY)
			.addShapeBox(0, -1.2f, 12, 2.4f, 1.2f, 12, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.400002f, -14, -18).setRotationAngle(0, 0, -4).setName("Box 220")
		);
		seats.add(new ModelRendererTurbo(seats, 168, 39, textureX, textureY)
			.addShapeBox(0, -1.2f, 0, 2.4f, 1.2f, 12, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.400002f, -14, 6).setRotationAngle(0, 0, -4).setName("Box 221")
		);
		seats.add(new ModelRendererTurbo(seats, 66, 39, textureX, textureY)
			.addShapeBox(0, -1.2f, 0, 2.4f, 1.2f, 12, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.2f, -14, -18).setRotationAngle(0, 0, -8).setName("Box 230")
		);
		seats.add(new ModelRendererTurbo(seats, 0, 39, textureX, textureY)
			.addShapeBox(0, -1.2f, 0, 2.4f, 1.2f, 12, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.2f, -14, 6).setRotationAngle(0, 0, -8).setName("Box 231")
		);
		seats.add(new ModelRendererTurbo(seats, 310, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 2.4f, 12, 0, 0, 0, 0, 0, -0.24000001f, -1.2f, 0, -0.24000001f, -1.2f, 0, 0, 0, 0, 0, 0, 0, -0.24000001f, -1.2f, 0, -0.24000001f, -1.2f, 0, 0, 0)
			.setRotationPoint(12, -0.2f, 6).setRotationAngle(0, 0, 0).setName("Box 243")
		);
		seats.add(new ModelRendererTurbo(seats, 478, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.2f, 2.4f, 12, 0, 0, 0, 0, 0, -0.24000001f, -1.2f, 0, -0.24000001f, -1.2f, 0, 0, 0, 0, 0, 0, 0, -0.24000001f, -1.2f, 0, -0.24000001f, -1.2f, 0, 0, 0)
			.setRotationPoint(12, -0.2f, -18).setRotationAngle(0, 0, 0).setName("Box 244")
		);
		seats.add(new ModelRendererTurbo(seats, 15, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 9.6f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24, 2.2f, 14.400001f).setRotationAngle(0, 0, 0).setName("Box 210cp")
		);
		seats.add(new ModelRendererTurbo(seats, 372, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 9.6f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24, 2.2f, -15.6f).setRotationAngle(0, 0, 0).setName("Box 211cp")
		);
		seats.add(new ModelRendererTurbo(seats, 325, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 9.6f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24, 2.2f, -7.2000003f).setRotationAngle(0, 0, 0).setName("Box 212cp")
		);
		seats.add(new ModelRendererTurbo(seats, 372, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 9.6f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24, 2.2f, 6).setRotationAngle(0, 0, 0).setName("Box 213cp")
		);
		seats.add(new ModelRendererTurbo(seats, 352, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 2.4f, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.2f, -0.2f, -18).setRotationAngle(0, 0, 0).setName("Box 214cp")
		);
		seats.add(new ModelRendererTurbo(seats, 49, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 14.400001f, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26.400002f, -14, -18).setRotationAngle(0, 0, -4).setName("Box 218cp")
		);
		seats.add(new ModelRendererTurbo(seats, 325, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 9.6f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.2f, 2.2f, 15.6f).setRotationAngle(0, 0, 0).setName("Box 222cp")
		);
		seats.add(new ModelRendererTurbo(seats, 372, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 9.6f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.2f, 2.2f, 7.2000003f).setRotationAngle(0, 0, 0).setName("Box 223cp")
		);
		seats.add(new ModelRendererTurbo(seats, 325, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 9.6f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.2f, 2.2f, -16.800001f).setRotationAngle(0, 0, 0).setName("Box 224cp")
		);
		seats.add(new ModelRendererTurbo(seats, 344, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 9.6f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.2f, 2.2f, -8.400001f).setRotationAngle(0, 0, 0).setName("Box 225cp")
		);
		seats.add(new ModelRendererTurbo(seats, 90, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 2.4f, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -0.2f, 6).setRotationAngle(0, 0, 0).setName("Box 226cp")
		);
		seats.add(new ModelRendererTurbo(seats, 200, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 2.4f, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -0.2f, -18).setRotationAngle(0, 0, 0).setName("Box 227cp")
		);
		seats.add(new ModelRendererTurbo(seats, 204, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 14.400001f, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.2f, -14, 6).setRotationAngle(0, 0, -8).setName("Box 228cp")
		);
		seats.add(new ModelRendererTurbo(seats, 158, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2.4f, 14.400001f, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.2f, -14, -18).setRotationAngle(0, 0, -8).setName("Box 229cp")
		);
		seats.add(new ModelRendererTurbo(seats, 118, 46, textureX, textureY)
			.addShapeBox(0.6f, -2.4f, 3, 1.2f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.2f, -14, 6).setRotationAngle(0, 0, -8).setName("Box 232cp")
		);
		seats.add(new ModelRendererTurbo(seats, 110, 46, textureX, textureY)
			.addShapeBox(0.6f, -2.4f, 7.8f, 1.2f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.2f, -14, 6).setRotationAngle(0, 0, -8).setName("Box 233cp")
		);
		seats.add(new ModelRendererTurbo(seats, 310, 44, textureX, textureY)
			.addShapeBox(0.6f, -2.4f, 7.8f, 1.2f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.2f, -14, -18).setRotationAngle(0, 0, -8).setName("Box 234cp")
		);
		seats.add(new ModelRendererTurbo(seats, 274, 40, textureX, textureY)
			.addShapeBox(0.6f, -2.4f, 3, 1.2f, 1.2f, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.2f, -14, -18).setRotationAngle(0, 0, -8).setName("Box 235cp")
		);
		seats.add(new ModelRendererTurbo(seats, 17, 90, textureX, textureY)
			.addShapeBox(0, -6, 1.8000001f, 2.4f, 3.6000001f, 8.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.2f, -14, 6).setRotationAngle(0, 0, -8).setName("Box 236cp")
		);
		seats.add(new ModelRendererTurbo(seats, 127, 87, textureX, textureY)
			.addShapeBox(0, -6, 1.8000001f, 2.4f, 3.6000001f, 8.400001f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.2f, -14, -18).setRotationAngle(0, 0, -8).setName("Box 237cp")
		);
		this.groups.add(seats);
	}

}
