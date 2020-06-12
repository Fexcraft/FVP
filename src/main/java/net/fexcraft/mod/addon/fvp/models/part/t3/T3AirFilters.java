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
@fModel(registryname = "fvp:models/part/t3_air_filters")
public class T3AirFilters extends PartModel {

	public T3AirFilters(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList air_filters = new TurboList("air_filters");
		air_filters.add(new ModelRendererTurbo(air_filters, 286, 192, textureX, textureY).addBox(0, 0, 0, 1, 6, 2)
			.setRotationPoint(32.4f, -28, 22).setRotationAngle(0, 0, 0)
		);
		air_filters.add(new ModelRendererTurbo(air_filters, 493, 54, textureX, textureY).addCylinder(0, 0, 0, 4, 2, 12, 0.75f, 0.75f, 4, null)
			.setRotationPoint(30, -32, 23).setRotationAngle(0, 0, 0)
		);
		air_filters.add(new ModelRendererTurbo(air_filters, 29, 40, textureX, textureY).addCylinder(0, 0, 0, 4, 1, 12, 0.75f, 0.8125f, 4, null)
			.setRotationPoint(30, -33, 23).setRotationAngle(0, 0, 0)
		);
		air_filters.add(new ModelRendererTurbo(air_filters, 393, 69, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 12, 0.75f, 0.75f, 1, null)
			.setRotationPoint(30, -29, 19).setRotationAngle(0, 0, 0)
		);
		air_filters.add(new ModelRendererTurbo(air_filters, 207, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0.25f, 0, 0, -1, 0, 0, -1, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(33, -28, 19).setRotationAngle(0, 0, 0)
		);
		air_filters.add(new ModelRendererTurbo(air_filters, 367, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.25f, 0, 0, -1, 0, 0, -1, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(33, -31, 19).setRotationAngle(0, 0, 0)
		);
		air_filters.add(new ModelRendererTurbo(air_filters, 495, 37, textureX, textureY).addCylinder(0, 0, 0, 4, 1, 12, 0.8125f, 0.75f, 4, null)
			.setRotationPoint(30, -19, 23).setRotationAngle(0, 0, 0)
		);
		air_filters.add(new ModelRendererTurbo(air_filters, 217, 122, textureX, textureY).addCylinder(0, 0, 0, 4, 11, 12, 0.8125f, 0.8125f, 4, null)
			.setRotationPoint(30, -30, 23).setRotationAngle(0, 0, 0)
		);
		air_filters.add(new ModelRendererTurbo(air_filters, 364, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(33, -30, 19).setRotationAngle(0, 0, 0)
		);
		air_filters.add(new ModelRendererTurbo(air_filters, 130, 186, textureX, textureY).addBox(0, 0, 0, 1, 6, 2)
			.setRotationPoint(32.4f, -28, -24).setRotationAngle(0, 0, 0)
		);
		air_filters.add(new ModelRendererTurbo(air_filters, 478, 37, textureX, textureY).addCylinder(0, 0, 0, 4, 2, 12, 0.75f, 0.75f, 4, null)
			.setRotationPoint(30, -32, -23).setRotationAngle(0, 0, 0)
		);
		air_filters.add(new ModelRendererTurbo(air_filters, 29, 30, textureX, textureY).addCylinder(0, 0, 0, 4, 1, 12, 0.75f, 0.8125f, 4, null)
			.setRotationPoint(30, -33, -23).setRotationAngle(0, 0, 0)
		);
		air_filters.add(new ModelRendererTurbo(air_filters, 384, 69, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 12, 0.75f, 0.75f, 1, null)
			.setRotationPoint(30, -29, -21).setRotationAngle(0, 0, 0)
		);
		air_filters.add(new ModelRendererTurbo(air_filters, 282, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0.25f, 0, 0, -1, 0, 0, -1, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(33, -28, -21).setRotationAngle(0, 0, 0)
		);
		air_filters.add(new ModelRendererTurbo(air_filters, 53, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.25f, 0, 0, -1, 0, 0, -1, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(33, -31, -21).setRotationAngle(0, 0, 0)
		);
		air_filters.add(new ModelRendererTurbo(air_filters, 29, 20, textureX, textureY).addCylinder(0, 0, 0, 4, 1, 12, 0.8125f, 0.75f, 4, null)
			.setRotationPoint(30, -19, -23).setRotationAngle(0, 0, 0)
		);
		air_filters.add(new ModelRendererTurbo(air_filters, 29, 0, textureX, textureY).addCylinder(0, 0, 0, 4, 11, 12, 0.8125f, 0.8125f, 4, null)
			.setRotationPoint(30, -30, -23).setRotationAngle(0, 0, 0)
		);
		air_filters.add(new ModelRendererTurbo(air_filters, 157, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(33, -30, -21).setRotationAngle(0, 0, 0)
		);
		this.groups.add(air_filters);
		//
		TurboList air_filters_lights = new TurboList("air_filters_lights");
		air_filters_lights.add(new ModelRendererTurbo(air_filters_lights, 464, 95, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(32.6f, -23.5f, -23.5f).setRotationAngle(0, 0, 0)
		);
		air_filters_lights.add(new ModelRendererTurbo(air_filters_lights, 371, 98, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(32.6f, -25.5f, -23.5f).setRotationAngle(0, 0, 0)
		);
		air_filters_lights.add(new ModelRendererTurbo(air_filters_lights, 274, 101, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(32.6f, -27.5f, -23.5f).setRotationAngle(0, 0, 0)
		);
		air_filters_lights.add(new ModelRendererTurbo(air_filters_lights, 496, 133, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(32.6f, -27.5f, 22.5f).setRotationAngle(0, 0, 0)
		);
		air_filters_lights.add(new ModelRendererTurbo(air_filters_lights, 491, 133, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(32.6f, -25.5f, 22.5f).setRotationAngle(0, 0, 0)
		);
		air_filters_lights.add(new ModelRendererTurbo(air_filters_lights, 507, 118, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(32.6f, -23.5f, 22.5f).setRotationAngle(0, 0, 0)
		);
		air_filters_lights.addProgram(DefaultPrograms.LIGHTS);
		this.groups.add(air_filters_lights);
		//
	}

}
