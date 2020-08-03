//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.sb1;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.1 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/sb1_frames")
public class SB1Frames extends PartModel {

	public SB1Frames(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList frames = new TurboList("frames");
		frames.add(new ModelRendererTurbo(frames, 346, 89, textureX, textureY)
			.addBox(0, 0, 0, 1, 38, 2, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-0.5f, -60, 7).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 367, 89, textureX, textureY)
			.addBox(0, 0, 0, 1, 38, 2, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-92.5f, -60, -9).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 339, 89, textureX, textureY)
			.addBox(0, 0, 0, 1, 38, 2, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(91.5f, -60, -9).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 332, 89, textureX, textureY)
			.addBox(0, 0, 0, 1, 38, 2, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(91.5f, -60, 6.875f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 360, 89, textureX, textureY)
			.addBox(0, 0, 0, 1, 38, 2, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-92.5f, -60, 6.875f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 418, 86, textureX, textureY)
			.addBox(0, 0, 0, 32, 1, 1, 0, 1f, new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(0, -58, -8.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 418, 86, textureX, textureY)
			.addBox(0, 0, 0, 32, 1, 1, 0, 1f, new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(0, -58, 7.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 418, 86, textureX, textureY)
			.addBox(0, 0, 0, 32, 1, 1, 0, 1f, new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(32, -58, -8.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 418, 86, textureX, textureY)
			.addBox(0, 0, 0, 32, 1, 1, 0, 1f, new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(32, -58, 7.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 360, 86, textureX, textureY)
			.addBox(0, 0, 0, 29, 1, 1, 0, 1f, new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(64, -58, -8.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 360, 86, textureX, textureY)
			.addBox(0, 0, 0, 29, 1, 1, 0, 1f, new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(64, -58, 7.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 344, 86, textureX, textureY)
			.addBox(0, 0, 0, 8, 1, 1, 0, 1f, new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(93, -58, -8.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 344, 86, textureX, textureY)
			.addBox(0, 0, 0, 8, 1, 1, 0, 1f, new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(93, -58, 7.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 326, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(101, -58, -8.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 326, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(101, -58, 7.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 344, 86, textureX, textureY)
			.addBox(0, 0, 0, 8, 1, 1, 0, 1f, new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-101, -58, -8.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 344, 86, textureX, textureY)
			.addBox(0, 0, 0, 8, 1, 1, 0, 1f, new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-101, -58, 7.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 326, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-110, -58, -8.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 326, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0,
				new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-110, -58, 7.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 418, 86, textureX, textureY)
			.addBox(0, 0, 0, 32, 1, 1, 0, 1f, new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-32, -58, -8.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 418, 86, textureX, textureY)
			.addBox(0, 0, 0, 32, 1, 1, 0, 1f, new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-32, -58, 7.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 418, 86, textureX, textureY)
			.addBox(0, 0, 0, 32, 1, 1, 0, 1f, new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-64, -58, -8.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 418, 86, textureX, textureY)
			.addBox(0, 0, 0, 32, 1, 1, 0, 1f, new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-64, -58, 7.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 360, 86, textureX, textureY)
			.addBox(0, 0, 0, 29, 1, 1, 0, 1f, new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-93, -58, -8.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 360, 86, textureX, textureY)
			.addBox(0, 0, 0, 29, 1, 1, 0, 1f, new boolean[]{ true, true, false, false, false, false })
			.setRotationPoint(-93, -58, 7.5f).setRotationAngle(0, 0, 0)
		);
		frames.add(new ModelRendererTurbo(frames, 353, 89, textureX, textureY)
			.addBox(0, 0, 0, 1, 38, 2, 0, 1f, new boolean[]{ false, false, true, true, false, false })
			.setRotationPoint(-0.5f, -60, -9).setRotationAngle(0, 0, 0)
		);
		this.groups.add(frames);
		//
	}

}
