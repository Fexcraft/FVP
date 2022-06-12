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
@fModel(registryname = "fvp:models/part/sb1_seats")
public class SB1Seats extends PartModel {

	public SB1Seats(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup seats = new ModelGroup("seats");
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 12.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 24.0f, 14.0f }).build()
			.setRotationPoint(4, -28, 7).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(5, -26, 9).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(5, -26, 16).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 116, textureX, textureY).newBoxBuilder()
			.setOffset(-2, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(4, -28, 7).setRotationAngle(0, 0, -6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(-12, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 0.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 36.0f, 14.0f }).build()
			.setRotationPoint(-4, -28, 7).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-13, -26, 9).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-13, -26, 16).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 316, 116, textureX, textureY).newBoxBuilder()
			.setOffset(0, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(-4, -28, 7).setRotationAngle(0, 0, 6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 12.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 24.0f, 14.0f }).build()
			.setRotationPoint(22, -28, 7).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 1143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(23, -26, 9).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(23, -26, 16).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 116, textureX, textureY).newBoxBuilder()
			.setOffset(-2, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(22, -28, 7).setRotationAngle(0, 0, -6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 12.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 24.0f, 14.0f }).build()
			.setRotationPoint(40, -28, 7).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(41, -26, 9).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(41, -26, 16).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 116, textureX, textureY).newBoxBuilder()
			.setOffset(-2, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(40, -28, 7).setRotationAngle(0, 0, -6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 12.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 24.0f, 14.0f }).build()
			.setRotationPoint(58, -28, 7).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(59, -26, 9).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(59, -26, 16).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 116, textureX, textureY).newBoxBuilder()
			.setOffset(-2, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(58, -28, 7).setRotationAngle(0, 0, -6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 12.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 24.0f, 14.0f }).build()
			.setRotationPoint(76, -28, 7).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(77, -26, 9).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(77, -26, 16).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 116, textureX, textureY).newBoxBuilder()
			.setOffset(-2, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(76, -28, 7).setRotationAngle(0, 0, -6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 12.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 24.0f, 14.0f }).build()
			.setRotationPoint(94, -28, 7).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(95, -26, 9).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 116, textureX, textureY).newBoxBuilder()
			.setOffset(-2, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(94, -28, 7).setRotationAngle(0, 0, -6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(-12, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 0.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 36.0f, 14.0f }).build()
			.setRotationPoint(-22, -28, 7).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-31, -26, 9).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-31, -26, 16).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 316, 116, textureX, textureY).newBoxBuilder()
			.setOffset(0, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(-22, -28, 7).setRotationAngle(0, 0, 6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(-12, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 0.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 36.0f, 14.0f }).build()
			.setRotationPoint(-40, -28, 7).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-49, -26, 9).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-49, -26, 16).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 316, 116, textureX, textureY).newBoxBuilder()
			.setOffset(0, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(-40, -28, 7).setRotationAngle(0, 0, 6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(-12, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 0.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 36.0f, 14.0f }).build()
			.setRotationPoint(-58, -28, 7).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-67, -26, 9).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-67, -26, 16).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 316, 116, textureX, textureY).newBoxBuilder()
			.setOffset(0, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(-58, -28, 7).setRotationAngle(0, 0, 6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(-12, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 0.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 36.0f, 14.0f }).build()
			.setRotationPoint(-76, -28, 7).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-85, -26, 9).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-85, -26, 16).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 316, 116, textureX, textureY).newBoxBuilder()
			.setOffset(0, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(-76, -28, 7).setRotationAngle(0, 0, 6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(-12, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 0.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 36.0f, 14.0f }).build()
			.setRotationPoint(-94, -28, 7).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-103, -26, 9).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-103, -26, 16).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 316, 116, textureX, textureY).newBoxBuilder()
			.setOffset(0, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(-94, -28, 7).setRotationAngle(0, 0, 6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 12.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 24.0f, 14.0f }).build()
			.setRotationPoint(4, -28, -19).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(5, -26, -17).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(5, -26, -10).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 116, textureX, textureY).newBoxBuilder()
			.setOffset(-2, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(4, -28, -19).setRotationAngle(0, 0, -6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(-12, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 0.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 36.0f, 14.0f }).build()
			.setRotationPoint(-4, -28, -19).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-13, -26, -17).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-13, -26, -10).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 316, 116, textureX, textureY).newBoxBuilder()
			.setOffset(0, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(-4, -28, -19).setRotationAngle(0, 0, 6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 12.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 24.0f, 14.0f }).build()
			.setRotationPoint(22, -28, -19).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(23, -26, -17).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(23, -26, -10).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 116, textureX, textureY).newBoxBuilder()
			.setOffset(-2, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(22, -28, -19).setRotationAngle(0, 0, -6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 12.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 24.0f, 14.0f }).build()
			.setRotationPoint(40, -28, -19).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(41, -26, -17).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(41, -26, -10).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 116, textureX, textureY).newBoxBuilder()
			.setOffset(-2, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(40, -28, -19).setRotationAngle(0, 0, -6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 12.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 24.0f, 14.0f }).build()
			.setRotationPoint(58, -28, -19).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(59, -26, -17).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(59, -26, -10).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 116, textureX, textureY).newBoxBuilder()
			.setOffset(-2, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(58, -28, -19).setRotationAngle(0, 0, -6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 12.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 24.0f, 14.0f }).build()
			.setRotationPoint(76, -28, -19).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(77, -26, -17).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(77, -26, -10).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 116, textureX, textureY).newBoxBuilder()
			.setOffset(-2, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(76, -28, -19).setRotationAngle(0, 0, -6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(-12, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 0.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 36.0f, 14.0f }).build()
			.setRotationPoint(-22, -28, -19).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-31, -26, -17).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-31, -26, -10).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 316, 116, textureX, textureY).newBoxBuilder()
			.setOffset(0, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(-22, -28, -19).setRotationAngle(0, 0, 6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(-12, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 0.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 36.0f, 14.0f }).build()
			.setRotationPoint(-40, -28, -19).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-49, -26, -17).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-49, -26, -10).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 316, 116, textureX, textureY).newBoxBuilder()
			.setOffset(0, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(-40, -28, -19).setRotationAngle(0, 0, 6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(-12, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 0.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 36.0f, 14.0f }).build()
			.setRotationPoint(-58, -28, -19).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-67, -26, -17).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-67, -26, -10).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 316, 116, textureX, textureY).newBoxBuilder()
			.setOffset(0, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(-58, -28, -19).setRotationAngle(0, 0, 6)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 101, textureX, textureY).newBoxBuilder()
			.setOffset(-12, 0, 0).setSize(12, 2, 12)
			.setPolygonUV(2, new float[]{ 0.0f, 14.0f })
			.setPolygonUV(3, new float[]{ 36.0f, 14.0f }).build()
			.setRotationPoint(-76, -28, -19).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-85, -26, -17).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 283, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-85, -26, -10).setRotationAngle(0, 0, 0)
		);
		seats.add(new ModelRendererTurbo(seats, 316, 116, textureX, textureY).newBoxBuilder()
			.setOffset(0, -13, 0).setSize(2, 14, 12)
			.setPolygonUV(2, new float[]{ 28.0f, 12.0f })
			.setPolygonUV(3, new float[]{ 30.0f, 12.0f }).build()
			.setRotationPoint(-76, -28, -19).setRotationAngle(0, 0, 6)
		);
		seats.add(new ModelRendererTurbo(seats, 302, 143, textureX, textureY)
			.addBox(0, 0, 0, 8, 3, 1, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(95, -26, 16).setRotationAngle(0, 0, 0)
		);
		this.groups.add(seats);
		//
	}

}
