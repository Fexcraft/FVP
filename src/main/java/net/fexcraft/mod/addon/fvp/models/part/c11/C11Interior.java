//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.c11;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.data.attribute.Attribute;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.ModelGroup;
import net.fexcraft.mod.fvtm.model.PartModel;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.3.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c11_interior")
public class C11Interior extends PartModel {

	public C11Interior(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup interior = new ModelGroup("interior");
		interior.add(new ModelRendererTurbo(interior, 86, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0)
			.setRotationPoint(1, 2, -2).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 183, 21, textureX, textureY).addBox(-0.5f, -0.5f, -0.5f, 5, 1, 1)
			.setRotationPoint(4, 1, 0).setRotationAngle(0, 0, -8)
		);
		interior.add(new ModelRendererTurbo(interior, 490, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 11, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0)
			.setRotationPoint(16, -7, -3).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 344, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 8, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(14, -12, 6).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 203, 15, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 12, 0.5f, 0.5f, 3, null)
			.setRotationPoint(13.875f, -10.75f, 12.75f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 310, 14, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 12, 0.25f, 0.25f, 3, null)
			.setRotationPoint(14.75f, -7.5f, -2.25f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 279, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 7, 38, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0)
			.setRotationPoint(15, -11.5f, -19).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 491, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0)
			.setRotationPoint(3, 1, -1.5f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 121, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 2, 0, 0, -1, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(14, -12, 4).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 72, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 6, 2, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -1, 0)
			.setRotationPoint(14, -12, 14).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 345, 68, textureX, textureY)
			.addShapeBox(0, -1, -1.5f, 11, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(13, -8.5f, 10).setRotationAngle(0, 0, 39)
		);
		interior.add(new ModelRendererTurbo(interior, 455, 80, textureX, textureY)
			.addShapeBox(0, -1, -1, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.5f, -8.5f, 10).setRotationAngle(0, 0, 15)
		);
		interior.add(new ModelRendererTurbo(interior, 301, 14, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 12, 0.5f, 0.5f, 3, null)
			.setRotationPoint(13.875f, -10.75f, 7.25f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 73, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.75f, -10.25f, -2).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 350, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(14.75f, -10.5f, 1.875f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 345, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(14.75f, -10, 1.875f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 257, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(14.75f, -10.5f, -2.875f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 24, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(14.75f, -10, -2.875f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 383, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.75f, -8, -0.25f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 99, 5, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 12, 0.25f, 0.25f, 3, null)
			.setRotationPoint(14.75f, -7.5f, -1).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 465, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(13.875f, -10.25f, 15).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 79, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(13.875f, -8.25f, 15).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 507, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(13.875f, -8.25f, 14).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 42, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(13.875f, -10.25f, 14).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 398, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(13.875f, -10.25f, 5).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 393, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(13.875f, -8.25f, 5).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 388, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(13.875f, -8.25f, 4).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 236, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(13.875f, -10.25f, 4).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 113, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(14.75f, -10, -12.5f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 228, 95, textureX, textureY).addBox(0, 0, 0, 2, 3, 7)
			.setRotationPoint(14.875f, -10.25f, -15).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 226, 106, textureX, textureY).addBox(0, 0, 0, 1, 2, 4)
			.setRotationPoint(15.75f, -5.75f, -2).setRotationAngle(0, 0, 5.25f)
		);
		interior.add(new ModelRendererTurbo(interior, 464, 80, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(14.875f, -10.25f, 16.125f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 169, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(14.9375f, -10.25f, 17.75f).setRotationAngle(0, 0, 0)
		);
		interior.add(new ModelRendererTurbo(interior, 113, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.9375f, -10.25f, -18.75f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(interior);
		//
		ModelGroup interior_lights = new ModelGroup("interior_lights");
		interior_lights.add(new ModelRendererTurbo(interior_lights, 0, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(13.875f, -11, 15).setRotationAngle(0, 0, 0)
		);
		interior_lights.add(new ModelRendererTurbo(interior_lights, 482, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(13.875f, -9, 15).setRotationAngle(0, 0, 0)
		);
		interior_lights.add(new ModelRendererTurbo(interior_lights, 113, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(13.875f, -9, 14).setRotationAngle(0, 0, 0)
		);
		interior_lights.add(new ModelRendererTurbo(interior_lights, 269, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(13.875f, -11, 14).setRotationAngle(0, 0, 0)
		);
		interior_lights.add(new ModelRendererTurbo(interior_lights, 31, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(13.875f, -11, 5).setRotationAngle(0, 0, 0)
		);
		interior_lights.add(new ModelRendererTurbo(interior_lights, 269, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(13.875f, -9, 5).setRotationAngle(0, 0, 0)
		);
		interior_lights.add(new ModelRendererTurbo(interior_lights, 132, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(13.875f, -9, 4).setRotationAngle(0, 0, 0)
		);
		interior_lights.add(new ModelRendererTurbo(interior_lights, 274, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(13.875f, -11, 4).setRotationAngle(0, 0, 0)
		);
		interior_lights.add(new ModelRendererTurbo(interior_lights, 503, 0, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 12, 0.625f, 0.5f, 3, null)
			.setRotationPoint(13.875f, -10.5f, 10).setRotationAngle(0, 0, 0)
		);
		interior_lights.addProgram(DefaultPrograms.LIGHTS);
		this.groups.add(interior_lights);
		//
		ModelGroup light_toggle = new ModelGroup("light_toggle");
		light_toggle.add(new ModelRendererTurbo(light_toggle, 435, 40, textureX, textureY)
			.addShapeBox(-0.125f, -0.625f, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(15, -9.75f, 16.125f).setRotationAngle(0, 0, 90)
		);
		light_toggle.add(new ModelRendererTurbo(light_toggle, 314, 37, textureX, textureY)
			.addShapeBox(-0.125f, -0.625f, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(15, -8.75f, 16.125f).setRotationAngle(0, 0, 90)
		);
		light_toggle.add(new ModelRendererTurbo(light_toggle, 507, 10, textureX, textureY)
			.addShapeBox(-0.125f, -0.625f, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(15, -7.75f, 16.125f).setRotationAngle(0, 0, 90)
		);
		light_toggle.addProgram(new ModelGroup.Program(){
			@Override
			public void preRender(ModelGroup list, ModelRenderData data){
				if(data.entity == null){
					list.rotate(0, 0, 90, true);
					return;
				}
				Attribute<?> attr = data.vehicle.getAttribute("lights");
				list.get(0).rotationAngleZ = attr.conditional_boolean(60f,  140f);
				attr = data.vehicle.getAttribute("lights_long");
				list.get(1).rotationAngleZ = attr.conditional_boolean(60f,  140f);
				attr = data.vehicle.getAttribute("lights_fog");
				list.get(2).rotationAngleZ = attr.conditional_boolean(60f,  140f);
			}
			@Override
			public boolean isPostRender(){
				return false;
			}
		});
		this.groups.add(light_toggle);
		//
		ModelGroup levers = new ModelGroup("levers");
		levers.add(new ModelRendererTurbo(levers, 217, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(12, -8.5f, 10).setRotationAngle(30, 0, 15)
		);
		levers.add(new ModelRendererTurbo(levers, 142, 92, textureX, textureY)
			.addShapeBox(-1, 0, 0, 1, 1, 5, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(12, -8.5f, 10).setRotationAngle(30, 180, -15)
		);
		levers.addProgram(new ModelGroup.Program(){
			@Override
			public void preRender(ModelGroup list, ModelRenderData data){
				if(data.entity == null) return;
				Attribute<?> attr = data.vehicle.getAttribute("turn_lights");
				list.get(0).rotationAngleX = attr.conditional_tristate(30f,  35f, 25f);
				attr = data.vehicle.getAttribute("windshield_wipers");
				list.get(1).rotationAngleX = attr.conditional_boolean(25f, 30f);
			}
			@Override
			public boolean isPostRender(){
				return false;
			}
		});
		this.groups.add(levers);
	}

}
