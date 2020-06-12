//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.fvp.models.part.t3;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.5.2 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/t3_cab_night")
public class T3CabNight extends PartModel {

	public T3CabNight(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		TurboList cab_night = new TurboList("cab_night");
		cab_night.add(new ModelRendererTurbo(cab_night, 71, 122, textureX, textureY).addBox(0, 0, 0, 32, 10, 4)
			.setRotationPoint(-46, -13, -11).setRotationAngle(0, 0, 0)
		);
		cab_night.add(new ModelRendererTurbo(cab_night, 310, 119, textureX, textureY).addBox(0, 0, 0, 32, 10, 4)
			.setRotationPoint(-46, -13, 7).setRotationAngle(0, 0, 0)
		);
		cab_night.add(new ModelRendererTurbo(cab_night, 186, 327, textureX, textureY).addBox(0, 0, 0, 2, 8, 14)
			.setRotationPoint(-40, -12, -7).setRotationAngle(0, 0, 0)
		);
		cab_night.add(new ModelRendererTurbo(cab_night, 153, 327, textureX, textureY).addBox(0, 0, 0, 2, 8, 14)
			.setRotationPoint(-21, -12, -7).setRotationAngle(0, 0, 0)
		);
		cab_night.add(new ModelRendererTurbo(cab_night, 428, 80, textureX, textureY).addBox(0, -1.5f, -1.5f, 32, 3, 3)
			.setRotationPoint(-34, -2, 0).setRotationAngle(0, 0, 0).setName("axle_frontcp")
		);
		cab_night.add(new ModelRendererTurbo(cab_night, 369, 104, textureX, textureY)
			.addShapeBox(-12, 0, 0, 34, 2, 32, 0, 0, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, -15, -16).setRotationAngle(0, 0, 0)
		);
		cab_night.add(new ModelRendererTurbo(cab_night, 379, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 31, 2, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -17, -27).setRotationAngle(0, 0, 0)
		);
		cab_night.add(new ModelRendererTurbo(cab_night, 478, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, 4, 0, 0, 0, 0, 0, -0.75f, 0, 0, -4.75f, 0, 0, 4, 0, 0, 0)
			.setRotationPoint(-16, -17, -27).setRotationAngle(0, 0, 0)
		);
		cab_night.add(new ModelRendererTurbo(cab_night, 438, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 31, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-47, -17, 26).setRotationAngle(0, 0, 0)
		);
		cab_night.add(new ModelRendererTurbo(cab_night, 494, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, 0, 0, 0, 4, 0, 0, -4.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 4, 0, 0, -4.75f, 0, 0, -0.75f)
			.setRotationPoint(-16, -17, 26).setRotationAngle(0, 0, 0)
		);
		this.groups.add(cab_night);
		//
		TurboList cab_night_lights = new TurboList("cab_night_lights");
		cab_night_lights.add(new ModelRendererTurbo(cab_night_lights, 383, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45, -16.5f, -27).setRotationAngle(0, 0, 0)
		);
		cab_night_lights.add(new ModelRendererTurbo(cab_night_lights, 140, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40, -16.5f, -27).setRotationAngle(0, 0, 0)
		);
		cab_night_lights.add(new ModelRendererTurbo(cab_night_lights, 0, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35, -16.5f, -27).setRotationAngle(0, 0, 0)
		);
		cab_night_lights.add(new ModelRendererTurbo(cab_night_lights, 316, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30, -16.5f, -27).setRotationAngle(0, 0, 0)
		);
		cab_night_lights.add(new ModelRendererTurbo(cab_night_lights, 81, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25, -16.5f, -27).setRotationAngle(0, 0, 0)
		);
		cab_night_lights.add(new ModelRendererTurbo(cab_night_lights, 0, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20, -16.5f, -27).setRotationAngle(0, 0, 0)
		);
		cab_night_lights.add(new ModelRendererTurbo(cab_night_lights, 267, 101, textureX, textureY)
			.addShapeBox(1.25f, 0, -0.25f, 2, 1, 1, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, -16.5f, -27).setRotationAngle(0, -34, 0)
		);
		cab_night_lights.add(new ModelRendererTurbo(cab_night_lights, 260, 101, textureX, textureY)
			.addShapeBox(5, 0, -0.25f, 2, 1, 1, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, -16.5f, -27).setRotationAngle(0, -34, 0)
		);
		cab_night_lights.add(new ModelRendererTurbo(cab_night_lights, 253, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f)
			.setRotationPoint(-45, -16.5f, 26).setRotationAngle(0, 0, 0)
		);
		cab_night_lights.add(new ModelRendererTurbo(cab_night_lights, 246, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f)
			.setRotationPoint(-40, -16.5f, 26).setRotationAngle(0, 0, 0)
		);
		cab_night_lights.add(new ModelRendererTurbo(cab_night_lights, 239, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f)
			.setRotationPoint(-35, -16.5f, 26).setRotationAngle(0, 0, 0)
		);
		cab_night_lights.add(new ModelRendererTurbo(cab_night_lights, 81, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f)
			.setRotationPoint(-30, -16.5f, 26).setRotationAngle(0, 0, 0)
		);
		cab_night_lights.add(new ModelRendererTurbo(cab_night_lights, 0, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f)
			.setRotationPoint(-25, -16.5f, 26).setRotationAngle(0, 0, 0)
		);
		cab_night_lights.add(new ModelRendererTurbo(cab_night_lights, 449, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f)
			.setRotationPoint(-20, -16.5f, 26).setRotationAngle(0, 0, 0)
		);
		cab_night_lights.add(new ModelRendererTurbo(cab_night_lights, 505, 51, textureX, textureY)
			.addShapeBox(0.25f, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f)
			.setRotationPoint(-16, -16.5f, 26).setRotationAngle(0, 34, 0)
		);
		cab_night_lights.add(new ModelRendererTurbo(cab_night_lights, 45, 49, textureX, textureY)
			.addShapeBox(4, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f)
			.setRotationPoint(-16, -16.5f, 26).setRotationAngle(0, 34, 0)
		);
		cab_night_lights.addProgram(DefaultPrograms.LIGHTS);
		this.groups.add(cab_night_lights);
		//
		TurboList cab_night_primary = new TurboList("cab_night_primary");
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 65, 186, textureX, textureY).addBox(0, 0, 0, 30, 35, 2)
			.setRotationPoint(-46, -54, -26).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 327, 284, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 35, 2, 0, 0, 0, 0, 0, 0, -4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 4, 0, 0, 0)
			.setRotationPoint(-16, -54, -26).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 0, 182, textureX, textureY).addBox(0, 0, 0, 30, 35, 2)
			.setRotationPoint(-46, -54, 24).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 310, 284, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 35, 2, 0, 0, 0, 0, 0, 0, 4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, -4, 0, 0, 0)
			.setRotationPoint(-16, -54, 24).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 100, 327, textureX, textureY).addBox(0, 0, 0, 2, 35, 48)
			.setRotationPoint(-46, -54, -24).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 173, 176, textureX, textureY).addBox(0, 0, 0, 30, 4, 52)
			.setRotationPoint(-46, -19, -26).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 245, 284, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 52, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0)
			.setRotationPoint(-16, -19, -26).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 376, 324, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 48, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46, -68, -24).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 442, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 30, 14, 2, 0, 0, 0, 1, 0, -2, 1, 0, -2, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46, -68, 24).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 444, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 30, 14, 2, 0, 0, 0, -1, 0, -2, -1, 0, -2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46, -68, -26).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 144, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 30, 1, 10, 0, 0, -0.5f, 0, 0, -2.5f, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0)
			.setRotationPoint(-46, -69, -25).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 69, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 30, 3, 12, 0, 0, -1, 0, 0, -3, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0)
			.setRotationPoint(-46, -71, -15).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 0, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 30, 1, 10, 0, 0, 1, 0, 0, -1, 0, 0, -2.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0)
			.setRotationPoint(-46, -69, 15).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 282, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 30, 3, 12, 0, 0, 0, 0, 0, -2, 0, 0, -3, 0, 0, -1, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0)
			.setRotationPoint(-46, -71, 3).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 0, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 30, 3, 6, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0)
			.setRotationPoint(-46, -71, -3).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 429, 276, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 12, 2, 0, 0, 0, 1, 0, -2, 5, 0, -2, -5, 0, 0, -1, 0, 0, 0, 0, 0, 4, 0, 0, -4, 0, 0, 0)
			.setRotationPoint(-16, -66, 24).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 260, 254, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 12, 2, 0, 0, 0, -1, 0, -2, -5, 0, -2, 5, 0, 0, 1, 0, 0, 0, 0, 0, -4, 0, 0, 4, 0, 0, 0)
			.setRotationPoint(-16, -66, -26).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 319, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 10, 0, 0, -0.5f, 0, 0, -2.5f, -4, 0, -1, 1, 0, 1, 0, 0, 0, 0, 0, 3, -4, 0, 2, 1, 0, 0, 0)
			.setRotationPoint(-16, -67, -25).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 260, 284, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 12, 0, 0, -1, 0, 0, -3, -1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, -1, 0, 2, 0, 0, 0, 0)
			.setRotationPoint(-16, -69, -15).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 478, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 10, 0, 0, 1, 0, 0, -1, 1, 0, -2.5f, -4, 0, -0.5f, 0, 0, 0, 0, 0, 3, 1, 0, 3, -4, 0, 0, 0)
			.setRotationPoint(-16, -67, 15).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 223, 284, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 12, 0, 0, 0, 0, 0, -2, 0, 0, -3, -1, 0, -1, 0, 0, 0, 0, 0, 2, 0, 0, 3, -1, 0, 0, 0)
			.setRotationPoint(-16, -69, 3).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 74, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 6, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0)
			.setRotationPoint(-16, -69, -3).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 286, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 6, 0, 0, 0, 0, 0, -2, -1, 0, -2, -1, 0, 0, 0, 0, 1, 0, 0, 2, -1, 0, 2, -1, 0, 1, 0)
			.setRotationPoint(-10, -67, -3).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 199, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 10, 2, 0, 0, 0, -1, 0, -2, -1, 0, -2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, -64, -22).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 383, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 10, 2, 0, 0, 0, 1, 0, -2, 1, 0, -2, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, -64, 20).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 356, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 11, 0, 0, 0, 0, 0, -2, 1, 0, -3, -1, 0, -1, 0, 0, 1, 0, 0, 2, 1, 0, 3, -1, 0, 2, 0)
			.setRotationPoint(-10, -67, 3).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 47, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 7, 0, 0, 1, 0, 0, -1, 1, 0, -2.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 1, 1, 0, 2, 0, 0, 0, 0)
			.setRotationPoint(-10, -65, 14).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 466, 279, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 11, 0, 0, -1, 0, 0, -3, -1, 0, -2, 1, 0, 0, 0, 0, 1, 0, 0, 3, -1, 0, 2, 1, 0, 1, 0)
			.setRotationPoint(-10, -67, -14).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 336, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 7, 0, 0, -0.5f, 0, 0, -2.5f, 0, 0, -1, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 0, 1, 1, 0, -1, 0)
			.setRotationPoint(-10, -65, -21).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 442, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 2, 4, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0)
			.setRotationPoint(-4, -65, -2).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 51, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 2, 11, 0, 0, 0, 0, 0, -3, 0, 0, -4, 0, 0, -1, 0, 0, 0, 0, 0, 3, 0, 0, 4, 0, 0, 1, 0)
			.setRotationPoint(-4, -65, 2).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 466, 268, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 2, 8, 0, 0, 0, 0, 0, -3, 0, 0, -4.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 3, 0, 0, 4, 0, 0, 1, 0)
			.setRotationPoint(-4, -64, 13).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 0, 270, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 2, 11, 0, 0, -1, 0, 0, -4, 0, 0, -3, 0, 0, 0, 0, 0, 1, 0, 0, 4, 0, 0, 3, 0, 0, 0, 0)
			.setRotationPoint(-4, -65, -13).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 429, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 2, 8, 0, 0, -1.5f, 0, 0, -4.5f, 0, 0, -3, 0, 0, 0, 0, 0, 1, 0, 0, 4, 0, 0, 3, 0, 0, 0, 0)
			.setRotationPoint(-4, -64, -21).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 154, 233, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 8, 2, 0, 0, 0, 1, 0, -3, 1, 0, -3, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, -62, 20).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 478, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 8, 2, 0, 0, 0, -1, 0, -3, -1, 0, -3, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, -62, -22).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 154, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 4, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, -1, 2, 0, -1, 2, 0, 0, 0, 0)
			.setRotationPoint(10, -62, -2).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 57, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 4, 0, 0, -1, 0, -1, -4, 0, -1, -4, 0, 0, -1, 0, 1, 0, 0, -3, 2, 0, -3, 2, 0, 1, 0, 0)
			.setRotationPoint(13, -60, -2).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 235, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 11, 0, 0, 0, 0, 0, -3, 0, 0, -4, 0, 0, -1, 0, 0, 0, 0, -1, 2, 0, -1, 3, 0, 0, 1, 0)
			.setRotationPoint(10, -62, 2).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 98, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 11, 0, 0, -1, 0, -1, -4, 0, -1, -4, 0, 0, -2, 0, 1, 0, 0, -3, 2, 0, -3, 2, 0, 1, 1, 0)
			.setRotationPoint(13, -60, 2).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 194, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 6, 0, 0, 0, 0, 1, -3, 0, 1, -3.5f, 0, 0, -1.125f, 0, 0, 0, 0, 0, 2, 0, -1, 2, 0, 0, 0.75f, 0)
			.setRotationPoint(10, -61, 13).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 495, 288, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 6, 0, 1, -2, 0, -1, -4, 0, -1, -4, 0, 1, -2.5f, 0, 2, 1, 0, -3, 2, 0, -4, 2, 0, 3, 1, 0)
			.setRotationPoint(14, -60, 13).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 360, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, -0.125f, 0, -1, -2.5f, 0, -2, -2.75f, 0, 0, -0.5f, 0, 0, -0.25f, 0, -2, 2, 0, -2, 2, 0.25f, 0, -1, 0)
			.setRotationPoint(10, -60, 19).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 0, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 2, 0, 0, 0, 1, 0, -3, 1, 0, -3, -0.75f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10, -59, 20).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 282, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 2, 0, 0, 0, -1, 0, -3, -0.75f, 0, -3, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10, -59, -22).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 499, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0.125f, 0, 0, -2, 0, 0, -3, -0.25f, 0, 1.0625f, -0.25f, 0, 1, -0.5f, 0, 0, -0.5f, 0, -2, -0.5f, 0, 1, -0.5f, 0.25f)
			.setRotationPoint(13, -57.5f, 19).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 477, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 11, 0, 0, -1, 0, 0, -4, 0, 0, -3, 0, 0, 0, 0, 0, 1, 0, -1, 3, 0, -1, 2, 0, 0, 0, 0)
			.setRotationPoint(10, -62, -13).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 362, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 11, 0, 0, -2, 0, -1, -4, 0, -1, -4, 0, 0, -1, 0, 1, 1, 0, -3, 2, 0, -3, 2, 0, 1, 0, 0)
			.setRotationPoint(13, -60, -13).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 490, 279, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 6, 0, 0, -1.125f, 0, 1, -3.5f, 0, 1, -3, 0, 0, 0, 0, 0, 0.75f, 0, -1, 2, 0, 0, 2, 0, 0, 0, 0)
			.setRotationPoint(10, -61, -19).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 342, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 6, 0, 1, -2.5f, 0, -1, -4, 0, -1, -4, 0, 1, -2, 0, 3, 1, 0, -4, 2, 0, -3, 2, 0, 2, 1, 0)
			.setRotationPoint(14, -60, -19).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 499, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, -0.5f, 0, -2, -2.75f, 0, -1, -2.5f, 0, 0, -0.125f, 0, 0, -1, 0, -2, 2, 0.25f, -2, 2, 0, 0, -0.25f, 0)
			.setRotationPoint(10, -60, -21).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 457, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 1.0625f, -0.25f, 0, -3, -0.25f, 0, -2, 0, 0, 0.125f, 0, 0, 1, -0.5f, 0.25f, -2, -0.5f, 0, 0, -0.5f, 0, 1, -0.5f, 0)
			.setRotationPoint(13, -57.5f, -21).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 283, 405, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 39, 2, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -54, 24).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 92, 361, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 39, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0)
			.setRotationPoint(-47, -54, -26).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 429, 324, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, -0.9f, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0)
			.setRotationPoint(-47, -68, -26).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 47, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 2, 0, -0.9f, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -68, 24).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 288, 341, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 1, 0, 0, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -69, 15).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 369, 351, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 12, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0)
			.setRotationPoint(-47, -71, 3).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 282, 300, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0)
			.setRotationPoint(-47, -71, -3).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 484, 332, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0)
			.setRotationPoint(-47, -69, -25).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.add(new ModelRendererTurbo(cab_night_primary, 58, 342, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 12, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0)
			.setRotationPoint(-47, -71, -15).setRotationAngle(0, 0, 0)
		);
		cab_night_primary.addProgram(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(cab_night_primary);
	}

}
