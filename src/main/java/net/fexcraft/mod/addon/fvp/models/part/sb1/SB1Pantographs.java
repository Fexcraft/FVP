//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.sb1;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.1 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/sb1_pantographs")
public class SB1Pantographs extends PartModel {

	public SB1Pantographs(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList pantograph_front = new TurboList("pantograph_front");
		pantograph_front.add(new ModelRendererTurbo(pantograph_front, 377, 1, textureX, textureY)
			.addBox(0, -2, 0, 36, 2, 24, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(68, -61, -12).setRotationAngle(0, 0, 0)
		);
		pantograph_front.add(new ModelRendererTurbo(pantograph_front, 438, 4, textureX, textureY).addBox(0, 0, 0, 16, 1, 1)
			.setRotationPoint(86, -63, -10).setRotationAngle(0, 0, -30)
		);
		pantograph_front.add(new ModelRendererTurbo(pantograph_front, 438, 1, textureX, textureY).addBox(0, 0, 0, 16, 1, 1)
			.setRotationPoint(86, -63, 9).setRotationAngle(0, 0, -30)
		);
		pantograph_front.add(new ModelRendererTurbo(pantograph_front, 438, 10, textureX, textureY).addBox(0, -1, 0, 16, 1, 1)
			.setRotationPoint(86, -63, -10).setRotationAngle(0, 0, -150)
		);
		pantograph_front.add(new ModelRendererTurbo(pantograph_front, 438, 7, textureX, textureY).addBox(0, -1, 0, 16, 1, 1)
			.setRotationPoint(86, -63, 9).setRotationAngle(0, 0, -150)
		);
		pantograph_front.add(new ModelRendererTurbo(pantograph_front, 438, 16, textureX, textureY).addBox(0, -1, 0, 16, 1, 1)
			.setRotationPoint(86, -78, -10).setRotationAngle(0, 0, 30)
		);
		pantograph_front.add(new ModelRendererTurbo(pantograph_front, 438, 13, textureX, textureY).addBox(0, -1, 0, 16, 1, 1)
			.setRotationPoint(86, -78, 9).setRotationAngle(0, 0, 30)
		);
		pantograph_front.add(new ModelRendererTurbo(pantograph_front, 438, 22, textureX, textureY).addBox(0, 0, 0, 16, 1, 1)
			.setRotationPoint(86, -78, -10).setRotationAngle(0, 0, 150)
		);
		pantograph_front.add(new ModelRendererTurbo(pantograph_front, 438, 19, textureX, textureY).addBox(0, 0, 0, 16, 1, 1)
			.setRotationPoint(86, -78, 9).setRotationAngle(0, 0, 150)
		);
		pantograph_front.add(new ModelRendererTurbo(pantograph_front, 389, 28, textureX, textureY).newBoxBuilder()
			.setOffset(-1.5f, 0, 0).setSize(3, 1, 30)
			.removePolygons(4, 5)
			.setPolygonUV(0, new float[]{ 30.0f, 0.0f })
			.setPolygonUV(1, new float[]{ 0.0f, 0.0f })
			.setPolygonUV(2, new float[]{ 30.0f, 1.0f })
			.setPolygonUV(3, new float[]{ 33.0f, 1.0f }).build()
			.setRotationPoint(85.5f, -79, -15).setRotationAngle(0, 0, 0)
		);
		pantograph_front.add(new ModelRendererTurbo(pantograph_front, 389, 2, textureX, textureY)
			.addShapeBox(-1.5f, 0, -3, 3, 1, 4, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(85.5f, -79, -16).setRotationAngle(0, 0, 0)
		);
		pantograph_front.add(new ModelRendererTurbo(pantograph_front, 389, 8, textureX, textureY)
			.addShapeBox(-1.5f, 0, 0, 3, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0,
				new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(85.5f, -79, 15).setRotationAngle(0, 0, 0)
		);
		pantograph_front.addProgram(new DefaultPrograms.IDSpecific("pantograph_front"));
		this.groups.add(pantograph_front);
		//
		TurboList pantograph_rear = new TurboList("pantograph_rear");
		pantograph_rear.add(new ModelRendererTurbo(pantograph_rear, 377, 1, textureX, textureY)
			.addBox(0, 0, 0, 36, 2, 24, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-104, -63, -12).setRotationAngle(0, 0, 0)
		);
		pantograph_rear.add(new ModelRendererTurbo(pantograph_rear, 438, 4, textureX, textureY).addBox(0, 0, 0, 16, 1, 1)
			.setRotationPoint(-86, -63, -10).setRotationAngle(0, 0, -30)
		);
		pantograph_rear.add(new ModelRendererTurbo(pantograph_rear, 438, 1, textureX, textureY).addBox(0, 0, 0, 16, 1, 1)
			.setRotationPoint(-86, -63, 9).setRotationAngle(0, 0, -30)
		);
		pantograph_rear.add(new ModelRendererTurbo(pantograph_rear, 438, 10, textureX, textureY).addBox(0, -1, 0, 16, 1, 1)
			.setRotationPoint(-86, -63, -10).setRotationAngle(0, 0, -150)
		);
		pantograph_rear.add(new ModelRendererTurbo(pantograph_rear, 438, 7, textureX, textureY).addBox(0, -1, 0, 16, 1, 1)
			.setRotationPoint(-86, -63, 9).setRotationAngle(0, 0, -150)
		);
		pantograph_rear.add(new ModelRendererTurbo(pantograph_rear, 438, 16, textureX, textureY).addBox(0, -1, 0, 16, 1, 1)
			.setRotationPoint(-86, -78, -10).setRotationAngle(0, 0, 30)
		);
		pantograph_rear.add(new ModelRendererTurbo(pantograph_rear, 438, 13, textureX, textureY).addBox(0, -1, 0, 16, 1, 1)
			.setRotationPoint(-86, -78, 9).setRotationAngle(0, 0, 30)
		);
		pantograph_rear.add(new ModelRendererTurbo(pantograph_rear, 438, 22, textureX, textureY).addBox(0, 0, 0, 16, 1, 1)
			.setRotationPoint(-86, -78, -10).setRotationAngle(0, 0, 150)
		);
		pantograph_rear.add(new ModelRendererTurbo(pantograph_rear, 438, 19, textureX, textureY).addBox(0, 0, 0, 16, 1, 1)
			.setRotationPoint(-86, -78, 9).setRotationAngle(0, 0, 150)
		);
		pantograph_rear.add(new ModelRendererTurbo(pantograph_rear, 389, 28, textureX, textureY).newBoxBuilder()
			.setOffset(-1.5f, 0, 0).setSize(3, 1, 30)
			.removePolygons(4, 5)
			.setPolygonUV(0, new float[]{ 30.0f, 0.0f })
			.setPolygonUV(1, new float[]{ 0.0f, 0.0f })
			.setPolygonUV(2, new float[]{ 30.0f, 1.0f })
			.setPolygonUV(3, new float[]{ 33.0f, 1.0f }).build()
			.setRotationPoint(-86.5f, -79, -15).setRotationAngle(0, 0, 0)
		);
		pantograph_rear.add(new ModelRendererTurbo(pantograph_rear, 389, 2, textureX, textureY)
			.addShapeBox(-1.5f, 0, -3, 3, 1, 4, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(-86.5f, -79, -16).setRotationAngle(0, 0, 0)
		);
		pantograph_rear.add(new ModelRendererTurbo(pantograph_rear, 389, 8, textureX, textureY)
			.addShapeBox(-1.5f, 0, 0, 3, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0,
				new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(-86.5f, -79, 15).setRotationAngle(0, 0, 0)
		);
		pantograph_rear.addProgram(new DefaultPrograms.IDSpecific("pantograph_rear"));
		this.groups.add(pantograph_rear);
	}

}
