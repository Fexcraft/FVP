//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.t3;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.5.2 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/t3_exhaust_stack")
public class T3ExhaustStack extends PartModel {

	public T3ExhaustStack(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup exhaust_stack = new ModelGroup("exhaust_stack");
		exhaust_stack.add(new ModelRendererTurbo(exhaust_stack, 192, 233, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 12, 1, 1, 4, null)
			.setRotationPoint(-8, -60, 23).setRotationAngle(0, 0, 0)
		);
		exhaust_stack.add(new ModelRendererTurbo(exhaust_stack, 187, 233, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 12, 1, 1, 4, null)
			.setRotationPoint(-8, -48, 23).setRotationAngle(0, 0, 0)
		);
		exhaust_stack.add(new ModelRendererTurbo(exhaust_stack, 104, 224, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 12, 1, 1, 4, null)
			.setRotationPoint(-8, -36, 23).setRotationAngle(0, 0, 0)
		);
		exhaust_stack.add(new ModelRendererTurbo(exhaust_stack, 218, 198, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 12, 1, 1, 4, null)
			.setRotationPoint(-8, -24, 23).setRotationAngle(0, 0, 0)
		);
		exhaust_stack.add(new ModelRendererTurbo(exhaust_stack, 507, 163, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 12, 1, 1, 4, new net.fexcraft.lib.common.math.Vec3f(3.0, 0.0, 0.0))
			.setRotationPoint(-11, -72, 23).setRotationAngle(0, 0, 0)
		);
		exhaust_stack.add(new ModelRendererTurbo(exhaust_stack, 147, 292, textureX, textureY).addBox(0, 0, 0, 4, 12, 3)
			.setRotationPoint(-10, -12, 22).setRotationAngle(0, 0, 0)
		);
		exhaust_stack.add(new ModelRendererTurbo(exhaust_stack, 507, 133, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 12, 1, 1, 4, null)
			.setRotationPoint(-8, -60, -23).setRotationAngle(0, 0, 0)
		);
		exhaust_stack.add(new ModelRendererTurbo(exhaust_stack, 234, 122, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 12, 1, 1, 4, null)
			.setRotationPoint(-8, -48, -23).setRotationAngle(0, 0, 0)
		);
		exhaust_stack.add(new ModelRendererTurbo(exhaust_stack, 46, 30, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 12, 1, 1, 4, null)
			.setRotationPoint(-8, -36, -23).setRotationAngle(0, 0, 0)
		);
		exhaust_stack.add(new ModelRendererTurbo(exhaust_stack, 46, 15, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 12, 1, 1, 4, null)
			.setRotationPoint(-8, -24, -23).setRotationAngle(0, 0, 0)
		);
		exhaust_stack.add(new ModelRendererTurbo(exhaust_stack, 46, 0, textureX, textureY).addCylinder(0, 0, 0, 1, 12, 12, 1, 1, 4, new net.fexcraft.lib.common.math.Vec3f(3.0, 0.0, 0.0))
			.setRotationPoint(-11, -72, -23).setRotationAngle(0, 0, 0)
		);
		exhaust_stack.add(new ModelRendererTurbo(exhaust_stack, 89, 289, textureX, textureY).addBox(0, 0, 0, 4, 12, 3)
			.setRotationPoint(-10, -12, -25).setRotationAngle(0, 0, 0)
		);
		this.groups.add(exhaust_stack);
		//
	}

}
