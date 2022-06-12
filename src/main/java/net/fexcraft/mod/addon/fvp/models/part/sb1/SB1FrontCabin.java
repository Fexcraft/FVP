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
@fModel(registryname = "fvp:models/part/sb1_front_cabin")
public class SB1FrontCabin extends PartModel {

	public SB1FrontCabin(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup cabin_front = new ModelGroup("cabin_front");
		cabin_front.add(new ModelRendererTurbo(cabin_front, 415, 71, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 14, 13)
			.removePolygons(2, 3, 4)
			.setPolygonUV(0, new float[]{ 369.0f, 71.0f })
			.setPolygonUV(1, new float[]{ 355.0f, 71.0f })
			.setDetachedUV(0, 1).build()
			.setRotationPoint(110, -37, -21).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 412, 71, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 14, 13)
			.removePolygons(2, 3, 5)
			.setPolygonUV(0, new float[]{ 398.0f, 71.0f })
			.setPolygonUV(1, new float[]{ 326.0f, 71.0f })
			.setDetachedUV(0, 1).build()
			.setRotationPoint(110, -37, 8).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 415, 49, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 22, 13)
			.setCorners(0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.removePolygons(2, 3, 4)
			.setPolygonUV(0, new float[]{ 369.0f, 49.0f })
			.setPolygonUV(1, new float[]{ 355.0f, 49.0f })
			.setDetachedUV(0, 1).build()
			.setRotationPoint(110, -59, -21).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 412, 49, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 22, 13)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.removePolygons(2, 3, 5)
			.setPolygonUV(0, new float[]{ 398.0f, 49.0f })
			.setPolygonUV(1, new float[]{ 326.0f, 49.0f })
			.setDetachedUV(0, 1).build()
			.setRotationPoint(110, -59, 8).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 352, 38, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 1, 40)
			.removePolygons(2, 3, 4, 5)
			.setPolygonUV(0, new float[]{ 370.0f, 48.0f })
			.setPolygonUV(1, new float[]{ 327.0f, 48.0f })
			.setDetachedUV(0, 1).build()
			.setRotationPoint(110, -60, -20).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, -1, -1, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 20, 16)
			.setCorners(-0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0)
			.removePolygons(3)
			.setPolygonUV(0, new float[]{ 382.0f, 65.0f })
			.setPolygonUV(1, new float[]{ 339.0f, 65.0f })
			.setPolygonUV(2, new float[]{ 416.0f, 37.0f })
			.setPolygonUV(4, new float[]{ 414.0f, 65.0f })
			.setPolygonUV(5, new float[]{ 413.0f, 65.0f })
			.setDetachedUV(0, 1, 2, 4, 5).build()
			.setRotationPoint(110, -43, -8).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 412, 33, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 2, 16)
			.removePolygons(2, 4, 5)
			.setPolygonUV(0, new float[]{ 382.0f, 49.0f })
			.setPolygonUV(1, new float[]{ 339.0f, 49.0f })
			.setDetachedUV(0, 1).build()
			.setRotationPoint(110, -59, -8).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, -1, -1, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 2, 16)
			.setCorners(-0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0)
			.setPolygonUV(0, new float[]{ 382.0f, 51.0f })
			.setPolygonUV(1, new float[]{ 339.0f, 51.0f })
			.setPolygonUV(2, new float[]{ 413.0f, 35.0f })
			.setPolygonUV(3, new float[]{ 414.0f, 35.0f })
			.setPolygonUV(4, new float[]{ 414.0f, 51.0f })
			.setPolygonUV(5, new float[]{ 413.0f, 51.0f })
			.setDetachedUV(0, 1, 2, 3, 4, 5).build()
			.setRotationPoint(110, -57, -8).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, -1, -1, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 12, 3)
			.setCorners(-0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0)
			.removePolygons(2, 3)
			.setPolygonUV(0, new float[]{ 395.0f, 53.0f })
			.setPolygonUV(1, new float[]{ 352.0f, 53.0f })
			.setPolygonUV(4, new float[]{ 414.0f, 53.0f })
			.setPolygonUV(5, new float[]{ 417.0f, 53.0f })
			.setDetachedUV(0, 1, 4, 5).build()
			.setRotationPoint(110, -55, -8).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, -1, -1, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 12, 3)
			.setCorners(-0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0)
			.removePolygons(2, 3)
			.setPolygonUV(0, new float[]{ 382.0f, 53.0f })
			.setPolygonUV(1, new float[]{ 339.0f, 53.0f })
			.setPolygonUV(4, new float[]{ 416.0f, 53.0f })
			.setPolygonUV(5, new float[]{ 413.0f, 53.0f })
			.setDetachedUV(0, 1, 4, 5).build()
			.setRotationPoint(110, -55, 5).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, -1, -1, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 12, 10)
			.setCorners(-0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.removePolygons(2, 3, 4, 5)
			.setPolygonUV(0, new float[]{ 385.0f, 53.0f })
			.setPolygonUV(1, new float[]{ 342.0f, 53.0f })
			.setDetachedUV(0, 1).build()
			.setRotationPoint(110, -55, -5).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 359, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(109.5f, -40, -5).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 443, 124, textureX, textureY).addCylinder(3, 0, 10, 2, 2, 12, 1, 1, 4, null)
			.setRotationPoint(132, -37.125f, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 417, 77, textureX, textureY)
			.addBox(-2, 0, -2, 4, 4, 4, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -27, 0).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 417, 60, textureX, textureY).addBox(-5, 0, -6, 10, 2, 12)
			.setRotationPoint(121, -29, 0).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 469, 34, textureX, textureY)
			.addShapeBox(-7, -13, -6, 2, 13, 12, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(121, -29, 0).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 388, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 42, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(132, -39, -21).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 388, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, false, true, false })
			.setRotationPoint(121, -37, -21).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 411, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0,
				new boolean[]{ true, false, false, false, true, false })
			.setRotationPoint(118, -37, -21).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 388, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 4, 5, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ false, true, false, false, false, true })
			.setRotationPoint(121, -37, 16).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 411, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 5, 0, -2, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, false, false, false, true })
			.setRotationPoint(118, -37, 16).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 466, 126, textureX, textureY)
			.addShapeBox(-0.5f, -3, 0.5f, 1, 3, 1, 0, -0.25f, 0.125f, -0.25f, -0.25f, 0.125f, -0.25f, -0.25f, 0.125f, -0.25f, -0.25f, 0.125f, -0.25f, -0.25f, 0.125f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(134, -37, -6.5f).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 478, 127, textureX, textureY)
			.addShapeBox(-0.5f, -4, 0, 1, 1, 2, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(134, -37, -6.5f).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 461, 126, textureX, textureY)
			.addShapeBox(-0.5f, -3, 0.5f, 1, 3, 1, 0, -0.25f, 0.125f, -0.25f, -0.25f, 0.125f, -0.25f, -0.25f, 0.125f, -0.25f, -0.25f, 0.125f, -0.25f, -0.25f, 0.125f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(134, -37, 4.5f).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 471, 127, textureX, textureY)
			.addShapeBox(-0.5f, -4, 0, 1, 1, 2, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0)
			.setRotationPoint(134, -37, 4.5f).setRotationAngle(0, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 458, 89, textureX, textureY)
			.addBox(4, 0, 1, 1, 1, 2, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37.25f, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 465, 89, textureX, textureY)
			.addBox(4, 0, -3, 1, 1, 2, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37.25f, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 458, 93, textureX, textureY)
			.addBox(2.5f, 0, 1, 1, 1, 2, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37.25f, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 465, 93, textureX, textureY)
			.addBox(2.5f, 0, -3, 1, 1, 2, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37.25f, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 458, 97, textureX, textureY)
			.addBox(1, 0, 1, 1, 1, 2, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37.25f, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 465, 97, textureX, textureY)
			.addBox(1, 0, -3, 1, 1, 2, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37.25f, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 482, 90, textureX, textureY)
			.addBox(4, 0, -18, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 482, 93, textureX, textureY)
			.addBox(2.5f, 0, -18, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 482, 96, textureX, textureY)
			.addBox(1, 0, -18, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 477, 90, textureX, textureY)
			.addBox(4, 0, -16, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 477, 93, textureX, textureY)
			.addBox(2.5f, 0, -16, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 477, 96, textureX, textureY)
			.addBox(1, 0, -16, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 472, 93, textureX, textureY)
			.addBox(2.5f, 0, -14, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 472, 96, textureX, textureY)
			.addBox(1, 0, -14, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 453, 93, textureX, textureY)
			.addBox(2.5f, 0, 13, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 453, 96, textureX, textureY)
			.addBox(1, 0, 13, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 448, 90, textureX, textureY)
			.addBox(4, 0, 15, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 448, 93, textureX, textureY)
			.addBox(2.5f, 0, 15, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 448, 96, textureX, textureY)
			.addBox(1, 0, 15, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 443, 90, textureX, textureY)
			.addBox(4, 0, 17, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 443, 93, textureX, textureY)
			.addBox(2.5f, 0, 17, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 443, 96, textureX, textureY)
			.addBox(1, 0, 17, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(132, -37, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 452, 124, textureX, textureY).addCylinder(3, 0, -10, 2, 2, 12, 1, 1, 4, null)
			.setRotationPoint(132, -37.125f, 0).setRotationAngle(0, 0, -20)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 473, 107, textureX, textureY)
			.addBox(0.25f, 0, 0.5f, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 468, 107, textureX, textureY)
			.addBox(1.75f, 0, 0.5f, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 463, 107, textureX, textureY)
			.addBox(3.25f, 0, 0.5f, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 458, 107, textureX, textureY)
			.addBox(4.75f, 0, 0.5f, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 453, 107, textureX, textureY)
			.addBox(6.25f, 0, 0.5f, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 448, 107, textureX, textureY)
			.addBox(7.75f, 0, 0.5f, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 473, 110, textureX, textureY)
			.addBox(0.25f, 0, 2, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 468, 110, textureX, textureY)
			.addBox(1.75f, 0, 2, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 463, 110, textureX, textureY)
			.addBox(3.25f, 0, 2, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 458, 110, textureX, textureY)
			.addBox(4.75f, 0, 2, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 453, 110, textureX, textureY)
			.addBox(6.25f, 0, 2, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 448, 110, textureX, textureY)
			.addBox(7.75f, 0, 2, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 473, 113, textureX, textureY)
			.addBox(0.25f, 0, 3.5f, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 468, 113, textureX, textureY)
			.addBox(1.75f, 0, 3.5f, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 463, 113, textureX, textureY)
			.addBox(3.25f, 0, 3.5f, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 458, 113, textureX, textureY)
			.addBox(4.75f, 0, 3.5f, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 453, 113, textureX, textureY)
			.addBox(6.25f, 0, 3.5f, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 448, 113, textureX, textureY)
			.addBox(7.75f, 0, 3.5f, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 443, 107, textureX, textureY)
			.addBox(9.25f, 0, 0.5f, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 443, 110, textureX, textureY)
			.addBox(9.25f, 0, 2, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 443, 113, textureX, textureY)
			.addBox(9.25f, 0, 3.5f, 1, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -37.125f, -21).setRotationAngle(-12, 0, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 443, 101, textureX, textureY)
			.addBox(0.5f, 0, 0.5f, 1, 1, 4, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -36.125f, 16).setRotationAngle(10, 1, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 454, 101, textureX, textureY)
			.addBox(2, 0, 0.5f, 1, 1, 4, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -36.125f, 16).setRotationAngle(10, 1, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 465, 101, textureX, textureY)
			.addBox(3.5f, 0, 0.5f, 1, 1, 4, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -36.125f, 16).setRotationAngle(10, 1, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 476, 101, textureX, textureY)
			.addBox(5, 0, 0.5f, 1, 1, 4, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -36.125f, 16).setRotationAngle(10, 1, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 487, 101, textureX, textureY)
			.addBox(6.5f, 0, 0.5f, 1, 1, 4, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -36.125f, 16).setRotationAngle(10, 1, 0)
		);
		cabin_front.add(new ModelRendererTurbo(cabin_front, 498, 101, textureX, textureY)
			.addBox(8, 0, 0.5f, 1, 1, 4, 0, 1f, new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(121, -36.125f, 16).setRotationAngle(10, 1, 0)
		);
		this.groups.add(cabin_front);
		//
	}

}
