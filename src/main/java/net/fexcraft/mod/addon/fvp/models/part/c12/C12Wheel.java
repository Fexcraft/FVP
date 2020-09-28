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
@fModel(registryname = "fvp:models/part/c12_wheel")
public class C12Wheel extends PartModel {

	public C12Wheel(){
		super(); textureX = 64; textureY = 32;
		this.addToCreators("FerdinandFEX___96");
		//
		TurboList wheel = new TurboList("wheel");
		wheel.add(new ModelRendererTurbo(wheel, 54, 0, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2.5f, 1.0E-4f).setLength(1).setSegments(16, 0).setScale(1, 1).setDirection(0)
			.setTopOffset(null).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.0))
			.removePolygons(1, 3).build());
		wheel.add(new ModelRendererTurbo(wheel, 60, 0, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 2).setRadius(2, 0.001f).setLength(1).setSegments(16, 0).setScale(1.125f, 1.125f).setDirection(0)
			.setTopOffset(null).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.0))
			.removePolygons(0, 2, 3).build());
		wheel.add(new ModelRendererTurbo(wheel, 17, 0, textureX, textureY).addBox(-4, -3, 1, 8, 6, 1));
		wheel.add(new ModelRendererTurbo(wheel, 0, 0, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 1).setRadius(12, 8).setLength(4).setSegments(16, 0).setScale(0.75f, 0.75f).setDirection(0)
			.setTopOffset(null).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.0))
			.removePolygons(0, 1, 3)
			.setPolygonUV(2, new float[]{ 0.0f, 25.0f })
			.setDetachedUV(2).build());
		wheel.add(new ModelRendererTurbo(wheel, 49, 8, textureX, textureY)
			.addBox(4, 0.5f, 1, 1, 4, 1, 0, 1f, new boolean[]{ true, false, false, true, false, false })
		);
		wheel.add(new ModelRendererTurbo(wheel, 50, 0, textureX, textureY)
			.addBox(5, -3.5f, 1, 1, 7, 1, 0, 1f, new boolean[]{ true, false, true, true, false, false })
		);
		wheel.add(new ModelRendererTurbo(wheel, 53, 8, textureX, textureY)
			.addBox(4, -4.5f, 1, 1, 4, 1, 0, 1f, new boolean[]{ true, false, true, false, false, false })
		);
		wheel.add(new ModelRendererTurbo(wheel, 57, 8, textureX, textureY)
			.addBox(-5, 0.5f, 1, 1, 4, 1, 0, 1f, new boolean[]{ false, true, false, true, false, false })
		);
		wheel.add(new ModelRendererTurbo(wheel, 47, 0, textureX, textureY)
			.addBox(-6, -3.5f, 1, 1, 7, 1, 0, 1f, new boolean[]{ false, true, true, true, false, false })
		);
		wheel.add(new ModelRendererTurbo(wheel, 61, 8, textureX, textureY)
			.addBox(-5, -4.5f, 1, 1, 4, 1, 0, 1f, new boolean[]{ false, true, true, false, false, false })
		);
		wheel.add(new ModelRendererTurbo(wheel, 19, 11, textureX, textureY)
			.addBox(-3.5f, 5, 1, 7, 1, 1, 0, 1f, new boolean[]{ true, true, false, true, false, false })
		);
		wheel.add(new ModelRendererTurbo(wheel, 19, 8, textureX, textureY)
			.addBox(-3.5f, -6, 1, 7, 1, 1, 0, 1f, new boolean[]{ true, true, true, false, false, false })
		);
		wheel.add(new ModelRendererTurbo(wheel, 3, 11, textureX, textureY)
			.addBox(0.5f, 4, 1, 3.5f, 1, 1, 0, 1f, new boolean[]{ true, false, false, true, false, false })
		);
		wheel.add(new ModelRendererTurbo(wheel, 11, 11, textureX, textureY)
			.addBox(-4, 4, 1, 3.5f, 1, 1, 0, 1f, new boolean[]{ false, true, false, true, false, false })
		);
		wheel.add(new ModelRendererTurbo(wheel, 3, 8, textureX, textureY)
			.addBox(0.5f, -5, 1, 3.5f, 1, 1, 0, 1f, new boolean[]{ true, false, true, false, false, false })
		);
		wheel.add(new ModelRendererTurbo(wheel, 11, 8, textureX, textureY)
			.addBox(-4, -5, 1, 3.5f, 1, 1, 0, 1f, new boolean[]{ false, true, true, false, false, false })
		);
		wheel.add(new ModelRendererTurbo(wheel, 34, 11, textureX, textureY)
			.addBox(-3, 3, 1, 6, 1, 1, 0, 1f, new boolean[]{ false, false, true, false, false, false })
		);
		wheel.add(new ModelRendererTurbo(wheel, 34, 8, textureX, textureY)
			.addBox(-3, -4, 1, 6, 1, 1, 0, 1f, new boolean[]{ false, false, false, true, false, false })
		);
		wheel.add(new ModelRendererTurbo(wheel, 0, 24, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(12, 0.01f).setLength(1).setSegments(16, 0).setScale(0.625f, 0.75f).setDirection(0)
			.setRadialTexture(3, 2).setTopOffset(null).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.0))
			.removePolygons(0, 1, 3).build());
		wheel.add(new ModelRendererTurbo(wheel, 0, 29, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 5).setRadius(12, 0.01f).setLength(1).setSegments(16, 0).setScale(0.75f, 0.625f).setDirection(0)
			.setRadialTexture(3, 2).setTopOffset(null).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.0))
			.removePolygons(0, 1, 3).build());
		wheel.add(new ModelRendererTurbo(wheel, 0, 19, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 5).setRadius(8, 7).setLength(1).setSegments(16, 0).setScale(0.9375f, 0.9375f).setDirection(0)
			.setRadialTexture(3, 1).setTopOffset(null).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.0))
			.removePolygons(0, 2)
			.setPolygonUV(3, new float[]{ 0.0f, 20.0f })
			.setPolygonUV(1, new float[]{ 0.0f, 30.0f })
			.setDetachedUV(3, 1).build());
		wheel.add(new ModelRendererTurbo(wheel, 0, 0, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 2).setRadius(3, 2).setLength(2).setSegments(16, 0).setScale(1.125f, 1).setDirection(0)
			.setRadialTexture(1, 1).setTopOffset(null).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.0))
			.removePolygons(0).build());
		wheel.add(new ModelRendererTurbo(wheel, 0, 0, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(8, 7).setLength(1).setSegments(16, 0).setScale(0.9375f, 0.9375f).setDirection(0)
			.setRadialTexture(3, 1).setTopOffset(null).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.0))
			.removePolygons(1, 2)
			.setPolygonUV(0, new float[]{ 0.0f, 23.0f })
			.setPolygonUV(3, new float[]{ 0.0f, 14.0f })
			.setDetachedUV(0, 3).build());
		wheel.add(new ModelRendererTurbo(wheel, 2, 14, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0.5f).setRadius(7, 6.5f).setLength(5).setSegments(16, 0).setScale(0.9375f, 0.9375f).setDirection(0)
			.setRadialTexture(3, 1).setTopOffset(null).setTopRotation(new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.0))
			.removePolygons(2)
			.setPolygonUV(0, new float[]{ 0.0f, 22.0f })
			.setPolygonUV(3, new float[]{ 2.0f, 15.0f })
			.setPolygonUV(1, new float[]{ 0.0f, 31.0f })
			.setDetachedUV(0, 3, 1).build());
		wheel.addProgram(DefaultPrograms.WHEEL_AUTO_ALL);
		this.groups.add(wheel);
	}

}
