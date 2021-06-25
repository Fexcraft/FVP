//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.part.sb1;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/sb1_pantographs")
public class SB1Pantographs extends PartModel {

	public SB1Pantographs(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		TurboList.Program lower = new DefaultPrograms.AttributeRotator("sb1_pantograph", true, 0, 20, 0.2f, 2, -30f);
		TurboList.Program upper = new DefaultPrograms.AttributeRotator("sb1_pantograph", true, -20, 0, -0.2f, 2, 30f);
		TurboList.Program down = new DefaultPrograms.AttributeTranslator("sb1_pantograph", true, 0, 10, 0.05f, 1);
		//
		TurboList pantograph_front_base = new TurboList("pantograph_front_base");
		pantograph_front_base.add(new ModelRendererTurbo(pantograph_front_base, 377, 1, textureX, textureY)
			.addBox(0, -2, 0, 36, 2, 24, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(68, -49, -12).setRotationAngle(0, 0, 0)
		);
		pantograph_front_base.addProgram(new DefaultPrograms.IDSpecific("pantograph_front"));
		this.groups.add(pantograph_front_base);
		//
		TurboList pantograph_front_lower = new TurboList("pantograph_front_lower");
		pantograph_front_lower.add(new ModelRendererTurbo(pantograph_front_lower, 438, 4, textureX, textureY).addBox(0, 0, 0, 16, 1, 1)
			.setRotationPoint(86, -51, -10).setRotationAngle(0, 0, -30)
		);
		pantograph_front_lower.add(new ModelRendererTurbo(pantograph_front_lower, 438, 1, textureX, textureY).addBox(0, 0, 0, 16, 1, 1)
			.setRotationPoint(86, -51, 9).setRotationAngle(0, 0, -30)
		);
		pantograph_front_lower.add(new ModelRendererTurbo(pantograph_front_lower, 438, 10, textureX, textureY).addBox(0, 0, -1, 16, 1, 1)
			.setRotationPoint(86, -51, -10).setRotationAngle(0, 180, -30)
		);
		pantograph_front_lower.add(new ModelRendererTurbo(pantograph_front_lower, 438, 7, textureX, textureY).addBox(0, 0, -1, 16, 1, 1)
			.setRotationPoint(86, -51, 9).setRotationAngle(0, 180, -30)
		);
		pantograph_front_lower.addProgram(new DefaultPrograms.IDSpecific("pantograph_front"));
		pantograph_front_lower.addProgram(lower);
		this.groups.add(pantograph_front_lower);
		//
		TurboList pantograph_front_upper = new TurboList("pantograph_front_upper");
		pantograph_front_upper.add(new ModelRendererTurbo(pantograph_front_upper, 438, 16, textureX, textureY).addBox(0, -1, 0, 16, 1, 1)
			.setRotationPoint(86, -66, -10).setRotationAngle(0, 0, 30)
		);
		pantograph_front_upper.add(new ModelRendererTurbo(pantograph_front_upper, 438, 13, textureX, textureY).addBox(0, -1, 0, 16, 1, 1)
			.setRotationPoint(86, -66, 9).setRotationAngle(0, 0, 30)
		);
		pantograph_front_upper.add(new ModelRendererTurbo(pantograph_front_upper, 438, 22, textureX, textureY).addBox(0, -1, -1, 16, 1, 1)
			.setRotationPoint(86, -66, -10).setRotationAngle(0, 180, 30)
		);
		pantograph_front_upper.add(new ModelRendererTurbo(pantograph_front_upper, 438, 19, textureX, textureY).addBox(0, -1, -1, 16, 1, 1)
			.setRotationPoint(86, -66, 9).setRotationAngle(0, 180, 30)
		);
		pantograph_front_upper.addProgram(new DefaultPrograms.IDSpecific("pantograph_front"));
		pantograph_front_upper.addPrograms(upper, down);
		this.groups.add(pantograph_front_upper);
		//
		TurboList pantograph_front_top = new TurboList("pantograph_front_top");
		pantograph_front_top.add(new ModelRendererTurbo(pantograph_front_top, 389, 28, textureX, textureY).newBoxBuilder()
			.setOffset(-1.5f, 0, 0).setSize(3, 1, 30)
			.removePolygons(4, 5)
			.setPolygonUV(1, new float[]{ 0.0f, 0.0f })
			.setPolygonUV(3, new float[]{ 33.0f, 1.0f })
			.setPolygonUV(0, new float[]{ 30.0f, 0.0f })
			.setPolygonUV(2, new float[]{ 30.0f, 1.0f }).build()
			.setRotationPoint(85.5f, -67, -15).setRotationAngle(0, 0, 0)
		);
		pantograph_front_top.add(new ModelRendererTurbo(pantograph_front_top, 389, 2, textureX, textureY)
			.addShapeBox(-1.5f, 0, -3, 3, 1, 4, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(85.5f, -67, -16).setRotationAngle(0, 0, 0)
		);
		pantograph_front_top.add(new ModelRendererTurbo(pantograph_front_top, 389, 8, textureX, textureY)
			.addShapeBox(-1.5f, 0, 0, 3, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0,
				new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(85.5f, -67, 15).setRotationAngle(0, 0, 0)
		);
		pantograph_front_top.addProgram(new DefaultPrograms.IDSpecific("pantograph_front"));
		pantograph_front_top.addProgram(down);
		this.groups.add(pantograph_front_top);
		//
		TurboList pantograph_rear_base = new TurboList("pantograph_rear_base");
		pantograph_rear_base.add(new ModelRendererTurbo(pantograph_rear_base, 377, 1, textureX, textureY)
			.addBox(0, 0, 0, 36, 2, 24, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-104, -51, -12).setRotationAngle(0, 0, 0)
		);
		pantograph_rear_base.addProgram(new DefaultPrograms.IDSpecific("pantograph_rear"));
		this.groups.add(pantograph_rear_base);
		//
		TurboList pantograph_rear_lower = new TurboList("pantograph_rear_lower");
		pantograph_rear_lower.add(new ModelRendererTurbo(pantograph_rear_lower, 438, 4, textureX, textureY).addBox(0, 0, 0, 16, 1, 1)
			.setRotationPoint(-86, -51, -10).setRotationAngle(0, 0, -30)
		);
		pantograph_rear_lower.add(new ModelRendererTurbo(pantograph_rear_lower, 438, 1, textureX, textureY).addBox(0, 0, 0, 16, 1, 1)
			.setRotationPoint(-86, -51, 9).setRotationAngle(0, 0, -30)
		);
		pantograph_rear_lower.add(new ModelRendererTurbo(pantograph_rear_lower, 438, 10, textureX, textureY).addBox(0, 0, -1, 16, 1, 1)
			.setRotationPoint(-86, -51, -10).setRotationAngle(0, 180, -30)
		);
		pantograph_rear_lower.add(new ModelRendererTurbo(pantograph_rear_lower, 438, 7, textureX, textureY).addBox(0, 0, -1, 16, 1, 1)
			.setRotationPoint(-86, -51, 9).setRotationAngle(0, 180, -30)
		);
		pantograph_rear_lower.addProgram(new DefaultPrograms.IDSpecific("pantograph_rear"));
		pantograph_rear_lower.addProgram(lower);
		this.groups.add(pantograph_rear_lower);
		//
		TurboList pantograph_rear_upper = new TurboList("pantograph_rear_upper");
		pantograph_rear_upper.add(new ModelRendererTurbo(pantograph_rear_upper, 438, 16, textureX, textureY).addBox(0, -1, 0, 16, 1, 1)
			.setRotationPoint(-86, -66, -10).setRotationAngle(0, 0, 30)
		);
		pantograph_rear_upper.add(new ModelRendererTurbo(pantograph_rear_upper, 438, 13, textureX, textureY).addBox(0, -1, 0, 16, 1, 1)
			.setRotationPoint(-86, -66, 9).setRotationAngle(0, 0, 30)
		);
		pantograph_rear_upper.add(new ModelRendererTurbo(pantograph_rear_upper, 438, 22, textureX, textureY).addBox(0, -1, -1, 16, 1, 1)
			.setRotationPoint(-86, -66, -10).setRotationAngle(0, 180, 30)
		);
		pantograph_rear_upper.add(new ModelRendererTurbo(pantograph_rear_upper, 438, 19, textureX, textureY).addBox(0, -1, -1, 16, 1, 1)
			.setRotationPoint(-86, -66, 9).setRotationAngle(0, 180, 30)
		);
		pantograph_rear_upper.addProgram(new DefaultPrograms.IDSpecific("pantograph_rear"));
		pantograph_rear_upper.addPrograms(upper, down);
		this.groups.add(pantograph_rear_upper);
		//
		TurboList pantograph_rear_top = new TurboList("pantograph_rear_top");
		pantograph_rear_top.add(new ModelRendererTurbo(pantograph_rear_top, 389, 28, textureX, textureY).newBoxBuilder()
			.setOffset(-1.5f, 0, 0).setSize(3, 1, 30)
			.removePolygons(4, 5)
			.setPolygonUV(1, new float[]{ 0.0f, 0.0f })
			.setPolygonUV(3, new float[]{ 33.0f, 1.0f })
			.setPolygonUV(0, new float[]{ 30.0f, 0.0f })
			.setPolygonUV(2, new float[]{ 30.0f, 1.0f }).build()
			.setRotationPoint(-86.5f, -67, -15).setRotationAngle(0, 0, 0)
		);
		pantograph_rear_top.add(new ModelRendererTurbo(pantograph_rear_top, 389, 2, textureX, textureY)
			.addShapeBox(-1.5f, 0, -3, 3, 1, 4, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(-86.5f, -67, -16).setRotationAngle(0, 0, 0)
		);
		pantograph_rear_top.add(new ModelRendererTurbo(pantograph_rear_top, 389, 8, textureX, textureY)
			.addShapeBox(-1.5f, 0, 0, 3, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0,
				new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(-86.5f, -67, 15).setRotationAngle(0, 0, 0)
		);
		pantograph_rear_top.addProgram(new DefaultPrograms.IDSpecific("pantograph_rear"));
		pantograph_rear_top.addProgram(down);
		this.groups.add(pantograph_rear_top);
		//
		translate(0, -12, 0);
	}

}
