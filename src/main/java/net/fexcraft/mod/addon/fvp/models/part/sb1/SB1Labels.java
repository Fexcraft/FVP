//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.sb1;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.1 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/sb1_labels")
public class SB1Labels extends PartModel {

	public SB1Labels(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup label_front = new ModelGroup("label_front");
		label_front.add(new ModelRendererTurbo(label_front, 374, 1, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 5, 30)
			.removePolygons(1, 2, 4, 5)
			.setPolygonUV(0, new float[]{ 289.0f, 2.0f })
			.setDetachedUV(0).build()
			.setRotationPoint(133, -58, -15).setRotationAngle(0, 0, 0)
		);
		label_front.add(new ModelRendererTurbo(label_front, 345, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0,
				new boolean[]{ true, false, true, false, true, true })
			.setRotationPoint(132, -60, -15).setRotationAngle(0, 0, 0)
		);
		label_front.add(new ModelRendererTurbo(label_front, 313, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0,
				new boolean[]{ true, false, true, false, false, true })
			.setRotationPoint(132, -60, -17).setRotationAngle(0, 0, 0)
		);
		label_front.add(new ModelRendererTurbo(label_front, 311, 8, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 5, 2)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0)
			.removePolygons(1, 2, 5)
			.setPolygonUV(0, new float[]{ 287.0f, 2.0f })
			.setDetachedUV(0).build()
			.setRotationPoint(133, -58, -17).setRotationAngle(0, 0, 0)
		);
		label_front.add(new ModelRendererTurbo(label_front, 317, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, -2, 0,
				new boolean[]{ true, false, true, false, true, false })
			.setRotationPoint(132, -60, 15).setRotationAngle(0, 0, 0)
		);
		label_front.add(new ModelRendererTurbo(label_front, 321, 8, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 5, 2)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0)
			.removePolygons(1, 2, 4)
			.setPolygonUV(0, new float[]{ 319.0f, 2.0f })
			.setDetachedUV(0).build()
			.setRotationPoint(133, -58, 15).setRotationAngle(0, 0, 0)
		);
		this.groups.add(label_front);
		//
		ModelGroup label_rear = new ModelGroup("label_rear");
		label_rear.add(new ModelRendererTurbo(label_rear, 374, 1, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 5, 30)
			.removePolygons(0, 2, 4, 5)
			.setPolygonUV(1, new float[]{ 289.0f, 58.0f })
			.setDetachedUV(1).build()
			.setRotationPoint(-134, -58, -15).setRotationAngle(0, 0, 0)
		);
		label_rear.add(new ModelRendererTurbo(label_rear, 375, 1, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 6, 30)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.removePolygons(1, 2, 4, 5)
			.setPolygonUV(0, new float[]{ -30.0f, 30.0f }).build()
			.setRotationPoint(-133, -60, -15).setRotationAngle(0, 0, 0)
		);
		label_rear.add(new ModelRendererTurbo(label_rear, 317, 8, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 6, 2)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -2, 0, 0, 0, 0, 0, 1, 0)
			.removePolygons(1, 2, 5)
			.setPolygonUV(0, new float[]{ 0.0f, 2.0f })
			.setPolygonUV(3, new float[]{ 2.0f, 0.0f })
			.setPolygonUV(4, new float[]{ 2.0f, 2.0f }).build()
			.setRotationPoint(-133, -60, -17).setRotationAngle(0, 0, 0)
		);
		label_rear.add(new ModelRendererTurbo(label_rear, 321, 8, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 5, 2)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0)
			.removePolygons(0, 2, 5)
			.setPolygonUV(1, new float[]{ 319.0f, 58.0f })
			.setDetachedUV(1).build()
			.setRotationPoint(-134, -58, -17).setRotationAngle(0, 0, 0)
		);
		label_rear.add(new ModelRendererTurbo(label_rear, 313, 8, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 6, 2)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -2, 0, 0, -1, 0)
			.removePolygons(1, 2, 4)
			.setPolygonUV(3, new float[]{ 2.0f, 0.0f }).build()
			.setRotationPoint(-133, -60, 15).setRotationAngle(0, 0, 0)
		);
		label_rear.add(new ModelRendererTurbo(label_rear, 311, 8, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 5, 2)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0)
			.removePolygons(0, 2, 4)
			.setPolygonUV(1, new float[]{ 287.0f, 58.0f })
			.setDetachedUV(1).build()
			.setRotationPoint(-134, -58, 15).setRotationAngle(0, 0, 0)
		);
		this.groups.add(label_rear);
		//
		ModelGroup labels_line = new ModelGroup("labels_line");
		labels_line.add(new ModelRendererTurbo(labels_line, 290, 9, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 4, 6)
			.removePolygons(3, 4, 5)
			.setPolygonUV(0, new float[]{ 288.0f, 9.0f })
			.setPolygonUV(2, new float[]{ 6.0f, 4.0f })
			.setDetachedUV(0).build()
			.setRotationPoint(129, -65, -17).setRotationAngle(0, 0, 0)
		);
		labels_line.add(new ModelRendererTurbo(labels_line, 287, 14, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 4, 1)
			.setCorners(0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.removePolygons(3, 5)
			.setPolygonUV(0, new float[]{ 287.0f, 9.0f })
			.setDetachedUV(0).build()
			.setRotationPoint(129, -65, -18).setRotationAngle(0, 0, 0)
		);
		labels_line.add(new ModelRendererTurbo(labels_line, 298, 14, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 4, 1)
			.setCorners(0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.removePolygons(3, 4)
			.setPolygonUV(0, new float[]{ 294.0f, 9.0f })
			.setDetachedUV(0).build()
			.setRotationPoint(129, -65, -11).setRotationAngle(0, 0, 0)
		);
		labels_line.add(new ModelRendererTurbo(labels_line, 290, 65, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 4, 6)
			.removePolygons(3, 4, 5)
			.setPolygonUV(1, new float[]{ 288.0f, 65.0f })
			.setPolygonUV(2, new float[]{ 6.0f, 4.0f })
			.setDetachedUV(1).build()
			.setRotationPoint(-130, -65, 11).setRotationAngle(0, 0, 0)
		);
		labels_line.add(new ModelRendererTurbo(labels_line, 298, 70, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 4, 1)
			.setCorners(0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.removePolygons(3, 5)
			.setPolygonUV(1, new float[]{ 294.0f, 65.0f })
			.setDetachedUV(1).build()
			.setRotationPoint(-130, -65, 10).setRotationAngle(0, 0, 0)
		);
		labels_line.add(new ModelRendererTurbo(labels_line, 287, 70, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 4, 1)
			.setCorners(0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.removePolygons(3, 4)
			.setPolygonUV(1, new float[]{ 287.0f, 65.0f })
			.setDetachedUV(1).build()
			.setRotationPoint(-130, -65, 17).setRotationAngle(0, 0, 0)
		);
		labels_line.addProgram(new DefaultPrograms.AttributeTextRenderer("sb1_line_number", -130.1f, -64, -14, 0, 0, 0, 4, true).setLightAttribute("lights").setColor(0xffffff));
		labels_line.addProgram(new DefaultPrograms.AttributeTextRenderer("sb1_line_number", 130.1f, -64, 14, 0, 180, 0, 4, true).setLightAttribute("lights").setColor(0xffffff));
		labels_line.addProgram(new DefaultPrograms.AttributeTextRenderer("sb1_destination", -134.05f, -57, -15, 0, 0, 0, 5, false).setLightAttribute("lights").setColor(0xcdcdcd));
		labels_line.addProgram(new DefaultPrograms.AttributeTextRenderer("sb1_destination", 134.05f, -57, 15, 0, 180, 0, 5, false).setLightAttribute("lights").setColor(0xcdcdcd));
		this.groups.add(labels_line);
	}

}
