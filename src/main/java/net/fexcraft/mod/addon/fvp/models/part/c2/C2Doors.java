//FMT-Marker FVTM-1.1
package net.fexcraft.mod.addon.fvp.models.part.c2;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;

/** This file was exported via the FVTM Exporter V1.2 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.9 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c2_doors")
public class C2Doors extends PartModel {

	public C2Doors(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList door_left = new TurboList("door_left");
		door_left.add(new ModelRendererTurbo(door_left, 65, 89, textureX, textureY).addBox(-22, 0, 0, 23, 13, 1)
			.setRotationPoint(12, -25, 23).setRotationAngle(0, 0, 0).setName("Box 104")
		);
		door_left.add(new ModelRendererTurbo(door_left, 185, 9, textureX, textureY).addBox(-18, 0, 0.2f, 3, 1, 1)
			.setRotationPoint(12, -23, 23).setRotationAngle(0, 0, 0).setName("Box 106")
		);
		door_left.add(new ModelRendererTurbo(door_left, 425, 9, textureX, textureY).addBox(-9, 0, -0.5f, 4, 1, 1)
			.setRotationPoint(12, -22, 23).setRotationAngle(0, 0, 0).setName("Box 108")
		);
		door_left.addPrograms(new DefaultPrograms.AttributeRotator("c2_door_left", true, 0, 60, 0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_left);
		//
		TurboList door_rear = new TurboList("door_rear");
		door_rear.add(new ModelRendererTurbo(door_rear, 425, 209, textureX, textureY).addBox(0, -14, 0, 1, 14, 40)
			.setRotationPoint(-81.5f, -12, -20).setRotationAngle(0, 0, 0).setName("Box 110")
		);
		door_rear.add(new ModelRendererTurbo(door_rear, 217, 17, textureX, textureY).addBox(-0.5f, -13, 0, 1, 2, 4)
			.setRotationPoint(-81.5f, -12, -2).setRotationAngle(0, 0, 0).setName("Box 111")
		);
		door_rear.addPrograms(new DefaultPrograms.AttributeRotator("c2_door_rear", true, -90, 0, -1, 2, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_rear);
		//
		TurboList door_right = new TurboList("door_right");
		door_right.add(new ModelRendererTurbo(door_right, 177, 89, textureX, textureY).addBox(-22, 0, -1, 23, 13, 1)
			.setRotationPoint(12, -25, -23).setRotationAngle(0, 0, 0).setName("Box 105")
		);
		door_right.add(new ModelRendererTurbo(door_right, 209, 9, textureX, textureY).addBox(-18, 0, -1.2f, 3, 1, 1)
			.setRotationPoint(12, -23, -23).setRotationAngle(0, 0, 0).setName("Box 107")
		);
		door_right.add(new ModelRendererTurbo(door_right, 17, 17, textureX, textureY).addBox(-9, 0, -0.5f, 4, 1, 1)
			.setRotationPoint(12, -22, -23).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		door_right.addPrograms(new DefaultPrograms.AttributeRotator("c2_door_right", true, -60, 0, -0.5f, 1, 0f), DefaultPrograms.RGB_PRIMARY);
		this.groups.add(door_right);
	}

}
