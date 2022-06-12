//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.part.c12;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c12_front_lights")
public class C12FrontLights extends PartModel {

	public C12FrontLights(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		ModelGroup lights_static_front = new ModelGroup("lights_static_front");
		lights_static_front.add(new ModelRendererTurbo(lights_static_front, 160, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 1, 1, 2, null)
			.setRotationPoint(42.5625f, -4.5f, -19.5f).setRotationAngle(0, 0, 0)
		);
		lights_static_front.add(new ModelRendererTurbo(lights_static_front, 156, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 1.25f, 1.25f, 2, null)
			.setRotationPoint(42.5625f, -4, 15.5f).setRotationAngle(0, 0, 0)
		);
		lights_static_front.add(new ModelRendererTurbo(lights_static_front, 152, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 1, 1, 2, null)
			.setRotationPoint(42.5625f, -4.5f, 19.5f).setRotationAngle(0, 0, 0)
		);
		lights_static_front.add(new ModelRendererTurbo(lights_static_front, 148, 60, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 1.25f, 1.25f, 2, null)
			.setRotationPoint(42.5625f, -4, -15.5f).setRotationAngle(0, 0, 0)
		);
		lights_static_front.add(new ModelRendererTurbo(lights_static_front, 302, 58, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 0.4375f, 0.4375f, 2, null)
			.setRotationPoint(42.5625f, -2, -19.75f).setRotationAngle(0, 0, 0)
		);
		lights_static_front.add(new ModelRendererTurbo(lights_static_front, 379, 54, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 0.375f, 0.375f, 2, null)
			.setRotationPoint(42.5625f, -2, -17.75f).setRotationAngle(0, 0, 0)
		);
		lights_static_front.add(new ModelRendererTurbo(lights_static_front, 375, 54, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 0.4375f, 0.4375f, 2, null)
			.setRotationPoint(42.5625f, -2, 19.75f).setRotationAngle(0, 0, 0)
		);
		lights_static_front.add(new ModelRendererTurbo(lights_static_front, 436, 50, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 0.375f, 0.375f, 2, null)
			.setRotationPoint(42.5625f, -2, 17.75f).setRotationAngle(0, 0, 0)
		);
		lights_static_front.add(new ModelRendererTurbo(lights_static_front, 267, 49, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.001f).setLength(1).setSegments(10, 5).setScale(0.5f, 0.5f).setDirection(2)
			.setTopOffset(null).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-53.125f, -3, 18.75f).setRotationAngle(180, 0, 0)
		);
		lights_static_front.add(new ModelRendererTurbo(lights_static_front, 489, 48, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.001f).setLength(1).setSegments(10, 5).setScale(0.5f, 0.5f).setDirection(2)
			.setTopOffset(null).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-53.125f, -3, -18.75f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(lights_static_front);
		//
		ModelGroup lights_front = new ModelGroup("lights_front");
		lights_front.add(new ModelRendererTurbo(lights_front, 0, 62, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 10, 1, 1, 2, null)
			.setRotationPoint(41.625f, -4, -15.5f).setRotationAngle(18, 0, 0)
		);
		lights_front.add(new ModelRendererTurbo(lights_front, 286, 61, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 1, 1, 2, null)
			.setRotationPoint(42.625f, -4, 15.5f).setRotationAngle(18, 0, 0)
		);
		lights_front.addProgram(DefaultPrograms.FRONT_LIGHTS);
		this.groups.add(lights_front);
		//
		ModelGroup lights_long = new ModelGroup("lights_long");
		lights_long.add(new ModelRendererTurbo(lights_long, 267, 61, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.75f, 0.75f, 2, null)
			.setRotationPoint(42.625f, -4.5f, -19.5f).setRotationAngle(18, 0, 0)
		);
		lights_long.add(new ModelRendererTurbo(lights_long, 246, 61, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.75f, 0.75f, 2, null)
			.setRotationPoint(42.625f, -4.5f, 19.5f).setRotationAngle(18, 0, 0)
		);
		lights_long.addProgram(DefaultPrograms.LONG_LIGHTS);
		this.groups.add(lights_long);
		//
		ModelGroup lights_fog = new ModelGroup("lights_fog");
		lights_fog.add(new ModelRendererTurbo(lights_fog, 149, 43, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(42.625f, -2.5f, -18.25f).setRotationAngle(0, 0, 0)
		);
		lights_fog.add(new ModelRendererTurbo(lights_fog, 145, 43, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(42.625f, -2.5f, 17.25f).setRotationAngle(0, 0, 0)
		);
		lights_fog.addProgram(DefaultPrograms.FOG_LIGHTS);
		this.groups.add(lights_fog);
		//
		ModelGroup lights_turn_left_front = new ModelGroup("lights_turn_left_front");
		lights_turn_left_front.add(new ModelRendererTurbo(lights_turn_left_front, 397, 41, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(42.625f, -2.5f, 18.75f).setRotationAngle(0, 0, 0)
		);
		lights_turn_left_front.addProgram(DefaultPrograms.TURN_SIGNAL_LEFT);
		this.groups.add(lights_turn_left_front);
		//
		ModelGroup lights_turn_right_front = new ModelGroup("lights_turn_right_front");
		lights_turn_right_front.add(new ModelRendererTurbo(lights_turn_right_front, 391, 41, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(42.625f, -2.5f, -20.75f).setRotationAngle(0, 0, 0)
		);
		lights_turn_right_front.addProgram(DefaultPrograms.TURN_SIGNAL_RIGHT);
		this.groups.add(lights_turn_right_front);
	}

}
