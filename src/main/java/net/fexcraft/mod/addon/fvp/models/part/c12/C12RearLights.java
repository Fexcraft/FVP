//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.fvp.models.part.c12;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c12_rear_lights")
public class C12RearLights extends PartModel {

	public C12RearLights(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList lights_static_rear = new TurboList("lights_static_rear");
		lights_static_rear.add(new ModelRendererTurbo(lights_static_rear, 87, 61, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.75f, 0.75f, 2, null)
			.setRotationPoint(-53.0625f, -6.5f, 19.75f).setRotationAngle(0, 0, 0)
		);
		lights_static_rear.add(new ModelRendererTurbo(lights_static_rear, 73, 61, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 0.75f, 0.75f, 2, null)
			.setRotationPoint(-53.0625f, -6.5f, -19.75f).setRotationAngle(0, 0, 0)
		);
		lights_static_rear.add(new ModelRendererTurbo(lights_static_rear, 417, 50, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 0.375f, 0.375f, 2, null)
			.setRotationPoint(-53.0625f, -3, -21.1875f).setRotationAngle(0, 0, 0)
		);
		lights_static_rear.add(new ModelRendererTurbo(lights_static_rear, 396, 50, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 0.25f, 0.25f, 2, null)
			.setRotationPoint(-53.0625f, -3.5f, -19.125f).setRotationAngle(0, 0, 0)
		);
		lights_static_rear.add(new ModelRendererTurbo(lights_static_rear, 367, 50, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 0.25f, 0.25f, 2, null)
			.setRotationPoint(-53.0625f, -3.5f, -20.125f).setRotationAngle(0, 0, 0)
		);
		lights_static_rear.add(new ModelRendererTurbo(lights_static_rear, 363, 50, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 0.25f, 0.25f, 2, null)
			.setRotationPoint(-53.0625f, -2.5f, -19.125f).setRotationAngle(0, 0, 0)
		);
		lights_static_rear.add(new ModelRendererTurbo(lights_static_rear, 275, 49, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 0.25f, 0.25f, 2, null)
			.setRotationPoint(-53.0625f, -2.5f, -20.125f).setRotationAngle(0, 0, 0)
		);
		lights_static_rear.add(new ModelRendererTurbo(lights_static_rear, 442, 48, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 0.375f, 0.375f, 2, null)
			.setRotationPoint(-53.0625f, -3, 21.1875f).setRotationAngle(0, 0, 0)
		);
		lights_static_rear.add(new ModelRendererTurbo(lights_static_rear, 494, 45, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 0.25f, 0.25f, 2, null)
			.setRotationPoint(-53.0625f, -3.5f, 20.25f).setRotationAngle(0, 0, 0)
		);
		lights_static_rear.add(new ModelRendererTurbo(lights_static_rear, 238, 45, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 0.25f, 0.25f, 2, null)
			.setRotationPoint(-53.0625f, -3.5f, 19.25f).setRotationAngle(0, 0, 0)
		);
		lights_static_rear.add(new ModelRendererTurbo(lights_static_rear, 232, 45, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 0.25f, 0.25f, 2, null)
			.setRotationPoint(-53.0625f, -2.5f, 20.25f).setRotationAngle(0, 0, 0)
		);
		lights_static_rear.add(new ModelRendererTurbo(lights_static_rear, 369, 43, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 0.25f, 0.25f, 2, null)
			.setRotationPoint(-53.0625f, -2.5f, 19.25f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(lights_static_rear);
		//
		TurboList lights_rear = new TurboList("lights_rear");
		lights_rear.add(new ModelRendererTurbo(lights_rear, 294, 58, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 1, 1, 2, null)
			.setRotationPoint(-53.125f, -6.5f, 19.75f).setRotationAngle(18, 0, 0)
		);
		lights_rear.add(new ModelRendererTurbo(lights_rear, 112, 58, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 10, 1, 1, 2, null)
			.setRotationPoint(-53.125f, -6.5f, -19.75f).setRotationAngle(18, 0, 0)
		);
		lights_rear.addProgram(DefaultPrograms.REAR_LIGHTS);
		this.groups.add(lights_rear);
		//
		TurboList lights_reverse = new TurboList("lights_reverse");
		lights_reverse.add(new ModelRendererTurbo(lights_reverse, 181, 39, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-53.125f, -3, -20.75f).setRotationAngle(0, 0, 0)
		);
		lights_reverse.add(new ModelRendererTurbo(lights_reverse, 164, 38, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-53.125f, -3, 18.75f).setRotationAngle(0, 0, 0)
		);
		lights_reverse.addProgram(DefaultPrograms.REVERSE_LIGHTS);
		this.groups.add(lights_reverse);
		//
		TurboList lights_brake = new TurboList("lights_brake");
		lights_brake.add(new ModelRendererTurbo(lights_brake, 150, 38, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-53.125f, -4, 18.75f).setRotationAngle(0, 0, 0)
		);
		lights_brake.add(new ModelRendererTurbo(lights_brake, 296, 37, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-53.125f, -4, -20.75f).setRotationAngle(0, 0, 0)
		);
		lights_brake.add(new ModelRendererTurbo(lights_brake, 474, 17, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 1).setRadius(1, 0.001f).setLength(1).setSegments(10, 5).setScale(0.5f, 0.5f).setDirection(2)
			.setTopOffset(null).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-29.3125f, -19.75f, 0).setRotationAngle(180, 0, 10)
		);
		lights_brake.add(new ModelRendererTurbo(lights_brake, 463, 17, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 1).setRadius(1, 0.001f).setLength(1).setSegments(10, 5).setScale(0.5f, 0.5f).setDirection(2)
			.setTopOffset(null).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-29.3125f, -19.75f, 0).setRotationAngle(0, 0, 10)
		);
		lights_brake.add(new ModelRendererTurbo(lights_brake, 387, 36, textureX, textureY).addBox(0, -0.5f, -1, 1, 1, 2)
			.setRotationPoint(-29.3125f, -19.75f, 0).setRotationAngle(0, 0, 10)
		);
		lights_brake.addProgram(DefaultPrograms.BRAKE_LIGHTS);
		this.groups.add(lights_brake);
		//
		TurboList lights_turn_left_rear = new TurboList("lights_turn_left_rear");
		lights_turn_left_rear.add(new ModelRendererTurbo(lights_turn_left_rear, 501, 45, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.001f).setLength(1).setSegments(10, 5).setScale(0.5f, 0.5f).setDirection(2)
			.setTopOffset(null).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-53.125f, -3, 20.75f).setRotationAngle(0, 0, 0)
		);
		lights_turn_left_rear.addProgram(DefaultPrograms.TURN_SIGNAL_LEFT);
		this.groups.add(lights_turn_left_rear);
		//
		TurboList lights_turn_right_rear = new TurboList("lights_turn_right_rear");
		lights_turn_right_rear.add(new ModelRendererTurbo(lights_turn_right_rear, 375, 45, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0.001f).setLength(1).setSegments(10, 5).setScale(0.5f, 0.5f).setDirection(2)
			.setTopOffset(null).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(-53.125f, -3, -20.75f).setRotationAngle(180, 0, 0)
		);
		lights_turn_right_rear.addProgram(DefaultPrograms.TURN_SIGNAL_RIGHT);
		this.groups.add(lights_turn_right_rear);
		//
	}

}
