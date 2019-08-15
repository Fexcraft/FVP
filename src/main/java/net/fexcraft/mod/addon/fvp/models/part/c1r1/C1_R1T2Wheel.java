//FMT-Marker FVTM-1
package net.fexcraft.mod.addon.fvp.models.part.c1r1;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter V1 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.0.1-test &copy; 2018 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c1_r1_t2_wheel")
public class C1_R1T2Wheel extends PartModel {

	public C1_R1T2Wheel(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList r2_wheel = new TurboList("r2_wheel");
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 217, 209, textureX, textureY).addBox(-2, -2, 0, 4, 4, 3).setName("Box 632"));
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 241, 209, textureX, textureY)
			.addShapeBox(-2, -3, 0, 4, 1, 3, 0, -1, 0, 0, -1, 0, 0, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setName("Box 633")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 217, 217, textureX, textureY)
			.addShapeBox(-2, 2, 0, 4, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, -1, -1, 0, -1).setName("Box 634")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 209, 41, textureX, textureY)
			.addShapeBox(2, -2, 0, 1, 4, 3, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, 0, 0).setName("Box 635")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 241, 217, textureX, textureY)
			.addShapeBox(-3, -2, 0, 1, 4, 3, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1).setName("Box 636")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 217, 129, textureX, textureY).addBox(-1, 1, -2, 2, 6, 1)
			.setRotationPoint(0, 0, 3).setRotationAngle(4, 0, 0).setName("Box 637")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 425, 129, textureX, textureY).addBox(-1, 1, -2, 2, 6, 1)
			.setRotationPoint(0, 0, 3).setRotationAngle(4, 0, -40).setName("Box 638")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 241, 137, textureX, textureY).addBox(-1, 1, -2, 2, 6, 1)
			.setRotationPoint(0, 0, 3).setRotationAngle(4, 0, -80).setName("Box 639")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 329, 137, textureX, textureY).addBox(-1, 1, -2, 2, 6, 1)
			.setRotationPoint(0, 0, 3).setRotationAngle(4, 0, -120).setName("Box 640")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 481, 145, textureX, textureY).addBox(-1, 1, -2, 2, 6, 1)
			.setRotationPoint(0, 0, 3).setRotationAngle(4, 0, -160).setName("Box 641")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 497, 145, textureX, textureY).addBox(-1, 1, -2, 2, 6, 1)
			.setRotationPoint(0, 0, 3).setRotationAngle(4, 0, -200).setName("Box 642")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 361, 153, textureX, textureY).addBox(-1, 1, -2, 2, 6, 1)
			.setRotationPoint(0, 0, 3).setRotationAngle(4, 0, -240).setName("Box 643")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 25, 161, textureX, textureY).addBox(-1, 1, -2, 2, 6, 1)
			.setRotationPoint(0, 0, 3).setRotationAngle(4, 0, -280).setName("Box 644")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 41, 161, textureX, textureY).addBox(-1, 1, -2, 2, 6, 1)
			.setRotationPoint(0, 0, 3).setRotationAngle(4, 0, -320).setName("Box 645")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 441, 25, textureX, textureY)
			.addShapeBox(-1, -1, 0, 2, 2, 1, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(0, 0, 3).setRotationAngle(0, 0, 0).setName("Box 646")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 41, 225, textureX, textureY)
			.addShapeBox(0, 6.5f, -0.5f, 4, 3, 5, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.5f, 0.45f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.75f, 0, -0.35f, -0.75f, 0, 0, 0, 0).setName("Box 647")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 41, 225, textureX, textureY)
			.addShapeBox(0, 6.5f, -0.5f, 4, 3, 5, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.5f, 0.45f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.75f, 0, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -22.5f).setName("Box 649")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 41, 225, textureX, textureY)
			.addShapeBox(0, 6.5f, -0.5f, 4, 3, 5, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.5f, 0.45f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.75f, 0, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -45).setName("Box 650")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 41, 225, textureX, textureY)
			.addShapeBox(0, 6.5f, -0.5f, 4, 3, 5, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.5f, 0.45f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.75f, 0, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -67.5f).setName("Box 651")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 41, 225, textureX, textureY)
			.addShapeBox(0, 6.5f, -0.5f, 4, 3, 5, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.5f, 0.45f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.75f, 0, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -90).setName("Box 653")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 41, 225, textureX, textureY)
			.addShapeBox(0, 6.5f, -0.5f, 4, 3, 5, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.5f, 0.45f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.75f, 0, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -112.5f).setName("Box 654")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 41, 225, textureX, textureY)
			.addShapeBox(0, 6.5f, -0.5f, 4, 3, 5, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.5f, 0.45f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.75f, 0, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -135).setName("Box 655")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 41, 225, textureX, textureY)
			.addShapeBox(0, 6.5f, -0.5f, 4, 3, 5, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.5f, 0.45f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.75f, 0, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -157.5f).setName("Box 656")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 41, 225, textureX, textureY)
			.addShapeBox(0, 6.5f, -0.5f, 4, 3, 5, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.5f, 0.45f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.75f, 0, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -180).setName("Box 657")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 41, 225, textureX, textureY)
			.addShapeBox(0, 6.5f, -0.5f, 4, 3, 5, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.5f, 0.45f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.75f, 0, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -202.5f).setName("Box 658")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 41, 225, textureX, textureY)
			.addShapeBox(0, 6.5f, -0.5f, 4, 3, 5, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.5f, 0.45f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.75f, 0, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -225).setName("Box 659")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 41, 225, textureX, textureY)
			.addShapeBox(0, 6.5f, -0.5f, 4, 3, 5, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.5f, 0.45f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.75f, 0, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -247.5f).setName("Box 660")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 41, 225, textureX, textureY)
			.addShapeBox(0, 6.5f, -0.5f, 4, 3, 5, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.5f, 0.45f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.75f, 0, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -270).setName("Box 661")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 41, 225, textureX, textureY)
			.addShapeBox(0, 6.5f, -0.5f, 4, 3, 5, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.5f, 0.45f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.75f, 0, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -292.5f).setName("Box 662")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 41, 225, textureX, textureY)
			.addShapeBox(0, 6.5f, -0.5f, 4, 3, 5, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.5f, 0.45f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.75f, 0, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -315).setName("Box 663")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 41, 225, textureX, textureY)
			.addShapeBox(0, 6.5f, -0.5f, 4, 3, 5, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.5f, 0.45f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.75f, 0, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -337.5f).setName("Box 664")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, 4.5f, 4, 3, 1, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.3f, -0.05f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.35f, -0.75f, 0, -0.6f, -1.25f, -0.5f, 0, -0.5f, -0.5f).setName("Box 665")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, 4.5f, 4, 3, 1, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.3f, -0.05f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.35f, -0.75f, 0, -0.6f, -1.25f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -22.5f).setName("Box 666")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, 4.5f, 4, 3, 1, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.3f, -0.05f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.35f, -0.75f, 0, -0.6f, -1.25f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -45).setName("Box 667")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, 4.5f, 4, 3, 1, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.3f, -0.05f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.35f, -0.75f, 0, -0.6f, -1.25f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -67.5f).setName("Box 668")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, 4.5f, 4, 3, 1, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.3f, -0.05f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.35f, -0.75f, 0, -0.6f, -1.25f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -90).setName("Box 669")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, 4.5f, 4, 3, 1, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.3f, -0.05f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.35f, -0.75f, 0, -0.6f, -1.25f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -112.5f).setName("Box 670")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, 4.5f, 4, 3, 1, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.3f, -0.05f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.35f, -0.75f, 0, -0.6f, -1.25f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -135).setName("Box 671")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, 4.5f, 4, 3, 1, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.3f, -0.05f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.35f, -0.75f, 0, -0.6f, -1.25f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -157.5f).setName("Box 672")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, 4.5f, 4, 3, 1, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.3f, -0.05f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.35f, -0.75f, 0, -0.6f, -1.25f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -180).setName("Box 673")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, 4.5f, 4, 3, 1, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.3f, -0.05f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.35f, -0.75f, 0, -0.6f, -1.25f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -202.5f).setName("Box 674")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, 4.5f, 4, 3, 1, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.3f, -0.05f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.35f, -0.75f, 0, -0.6f, -1.25f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -225).setName("Box 675")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, 4.5f, 4, 3, 1, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.3f, -0.05f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.35f, -0.75f, 0, -0.6f, -1.25f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -247.5f).setName("Box 676")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, 4.5f, 4, 3, 1, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.3f, -0.05f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.35f, -0.75f, 0, -0.6f, -1.25f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -270).setName("Box 677")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, 4.5f, 4, 3, 1, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.3f, -0.05f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.35f, -0.75f, 0, -0.6f, -1.25f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -292.5f).setName("Box 678")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, 4.5f, 4, 3, 1, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.3f, -0.05f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.35f, -0.75f, 0, -0.6f, -1.25f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -315).setName("Box 679")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, 4.5f, 4, 3, 1, 0, 0, 0, 0, -1.5f, 0.45f, 0, -1.3f, -0.05f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.35f, -0.75f, 0, -0.6f, -1.25f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -337.5f).setName("Box 680")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, -1.5f, 4, 3, 1, 0, 0, -0.5f, -0.5f, -1.3f, -0.05f, -0.5f, -1.5f, 0.45f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.25f, -0.5f, -0.35f, -0.75f, 0, 0, 0, 0).setName("Box 681")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, -1.5f, 4, 3, 1, 0, 0, -0.5f, -0.5f, -1.3f, -0.05f, -0.5f, -1.5f, 0.45f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.25f, -0.5f, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -22.5f).setName("Box 682")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, -1.5f, 4, 3, 1, 0, 0, -0.5f, -0.5f, -1.3f, -0.05f, -0.5f, -1.5f, 0.45f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.25f, -0.5f, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -45).setName("Box 683")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, -1.5f, 4, 3, 1, 0, 0, -0.5f, -0.5f, -1.3f, -0.05f, -0.5f, -1.5f, 0.45f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.25f, -0.5f, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -67.5f).setName("Box 684")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, -1.5f, 4, 3, 1, 0, 0, -0.5f, -0.5f, -1.3f, -0.05f, -0.5f, -1.5f, 0.45f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.25f, -0.5f, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -90).setName("Box 685")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, -1.5f, 4, 3, 1, 0, 0, -0.5f, -0.5f, -1.3f, -0.05f, -0.5f, -1.5f, 0.45f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.25f, -0.5f, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -112.5f).setName("Box 686")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, -1.5f, 4, 3, 1, 0, 0, -0.5f, -0.5f, -1.3f, -0.05f, -0.5f, -1.5f, 0.45f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.25f, -0.5f, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -135).setName("Box 687")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, -1.5f, 4, 3, 1, 0, 0, -0.5f, -0.5f, -1.3f, -0.05f, -0.5f, -1.5f, 0.45f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.25f, -0.5f, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -157.5f).setName("Box 688")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, -1.5f, 4, 3, 1, 0, 0, -0.5f, -0.5f, -1.3f, -0.05f, -0.5f, -1.5f, 0.45f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.25f, -0.5f, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -180).setName("Box 689")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, -1.5f, 4, 3, 1, 0, 0, -0.5f, -0.5f, -1.3f, -0.05f, -0.5f, -1.5f, 0.45f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.25f, -0.5f, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -202.5f).setName("Box 690")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, -1.5f, 4, 3, 1, 0, 0, -0.5f, -0.5f, -1.3f, -0.05f, -0.5f, -1.5f, 0.45f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.25f, -0.5f, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -225).setName("Box 691")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, -1.5f, 4, 3, 1, 0, 0, -0.5f, -0.5f, -1.3f, -0.05f, -0.5f, -1.5f, 0.45f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.25f, -0.5f, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -247.5f).setName("Box 692")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, -1.5f, 4, 3, 1, 0, 0, -0.5f, -0.5f, -1.3f, -0.05f, -0.5f, -1.5f, 0.45f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.25f, -0.5f, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -270).setName("Box 693")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, -1.5f, 4, 3, 1, 0, 0, -0.5f, -0.5f, -1.3f, -0.05f, -0.5f, -1.5f, 0.45f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.25f, -0.5f, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -292.5f).setName("Box 694")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, -1.5f, 4, 3, 1, 0, 0, -0.5f, -0.5f, -1.3f, -0.05f, -0.5f, -1.5f, 0.45f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.25f, -0.5f, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -315).setName("Box 695")
		);
		r2_wheel.add(new ModelRendererTurbo(r2_wheel, 201, 209, textureX, textureY)
			.addShapeBox(0, 6.5f, -1.5f, 4, 3, 1, 0, 0, -0.5f, -0.5f, -1.3f, -0.05f, -0.5f, -1.5f, 0.45f, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.6f, -1.25f, -0.5f, -0.35f, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(0, 0, 0).setRotationAngle(0, 0, -337.5f).setName("Box 696")
		);
		r2_wheel.addProgram(DefaultPrograms.WHEEL_AUTO_ALL);
		this.groups.add(r2_wheel);
	}

}