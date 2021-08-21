package net.fexcraft.mod.addon.fvp.models.part.t1;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

@fModel(registryname = "fvp:models/part/t1_snow_plow")
public class T1SnowPlow extends PartModel {
	
	private TurboList body, snowplow;

    public T1SnowPlow(){
    	super(); textureX = 512; textureY = 128;
        addToCreators("Ferdinand (FEX___96)");
        
		TurboList lights = new TurboList("lights");
		lights.add(new ModelRendererTurbo(lights, 201, 1, textureX, textureY)
			.addShapeBox(13, -8, 21.5f, 1, 2, 4, 0, 0, -0.2f, -0.2f, -0.8f, -0.45f, -0.45f, -0.8f, -0.45f, -0.45f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, -0.8f, -0.45f, -0.45f, -0.8f, -0.45f, -0.45f, 0, -0.2f, -0.2f)
			.setRotationPoint(58, -5, 0).setRotationAngle(0, 0, -0).setName("Box 12")
		);
		lights.add(new ModelRendererTurbo(lights, 217, 1, textureX, textureY)
			.addShapeBox(9, -8, -24.5f, 1, 2, 4, 0, 0, -0.2f, -0.2f, -0.8f, -0.45f, -0.45f, -0.8f, -0.45f, -0.45f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, -0.8f, -0.45f, -0.45f, -0.8f, -0.45f, -0.45f, 0, -0.2f, -0.2f)
			.setRotationPoint(58, -5, 0).setRotationAngle(0, 0, -0).setName("Box 13")
		);
		lights.addPrograms(DefaultPrograms.LIGHTS, new DefaultPrograms.AttributeRotator("t1_snowplow", true, 0, 20, 1, 2, -20f));
		this.groups.add(lights);
		//
		TurboList base = new TurboList("base");
		base.add(new ModelRendererTurbo(base, 185, 1, textureX, textureY)
			.addShapeBox(0, 0, -24, 4, 7, 48, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0)
			.setRotationPoint(56, -4.5f, 0).setRotationAngle(0, 0, -0).setName("Box 9")
		);
		this.groups.add(base);
		//
		TurboList moving = new TurboList("moving");
		moving.add(new ModelRendererTurbo(moving, 1, 1, textureX, textureY)
			.addShapeBox(5, -3, -27.5f, 2, 6, 56, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, -5, 0, 0)
			.setRotationPoint(58, -5, 0).setRotationAngle(0, 0, -0).setName("Box 0")
		);
		moving.add(new ModelRendererTurbo(moving, 121, 1, textureX, textureY)
			.addShapeBox(5, 3, -27.5f, 2, 6, 56, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, -5, 0, 0, -1, 0, 0, 1, 0, 0, 6, 0, 0, -6, 0, 0)
			.setRotationPoint(58, -5, 0).setRotationAngle(0, 0, -0).setName("Box 1")
		);
		moving.add(new ModelRendererTurbo(moving, 241, 1, textureX, textureY)
			.addShapeBox(6, 9, -27.5f, 2, 6, 56, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, -5, 0, 0, -4, 0, 0, 4, 0, 0, 10, 0, 0, -10, 0, 0)
			.setRotationPoint(58, -5, 0).setRotationAngle(0, 0, -0).setName("Box 2")
		);
		moving.add(new ModelRendererTurbo(moving, 361, 1, textureX, textureY)
			.addShapeBox(5, -6, -27.5f, 2, 3, 56, 0, -2, 0, 0, 2, 0, 0, 7, 0, 0, -7, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, -5, 0, 0)
			.setRotationPoint(58, -5, 0).setRotationAngle(0, 0, -0).setName("Box 3")
		);
		moving.add(new ModelRendererTurbo(moving, 1, 65, textureX, textureY)
			.addShapeBox(10.5f, 14, -28, 1, 1, 57, 0, 0, 0, -0.3f, 0, 0, 0, 6, 0, 0, -6, 0, -0.3f, 0, 0, -0.3f, 1, 0, 0, 7, 0, 0, -6, 0, -0.3f)
			.setRotationPoint(58, -5, 0).setRotationAngle(0, 0, -0).setName("Box 4")
		);
		moving.add(new ModelRendererTurbo(moving, 1, 1, textureX, textureY).addBox(-2, 4, -13.5f, 10, 2, 4)
			.setRotationPoint(58, -5, 0).setRotationAngle(0, 0, -0).setName("Box 5")
		);
		moving.add(new ModelRendererTurbo(moving, 65, 1, textureX, textureY).addBox(-2, 4, 10.5f, 12, 2, 4)
			.setRotationPoint(58, -5, 0).setRotationAngle(0, 0, -0).setName("Box 6")
		);
		moving.add(new ModelRendererTurbo(moving, 105, 1, textureX, textureY)
			.addShapeBox(-2, -2, 17.5f, 12, 2, 3, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 0)
			.setRotationPoint(58, -5, 0).setRotationAngle(0, 0, -0).setName("Box 7")
		);
		moving.add(new ModelRendererTurbo(moving, 137, 1, textureX, textureY)
			.addShapeBox(-2, -3, -20.5f, 9, 2, 3, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0)
			.setRotationPoint(58, -5, 0).setRotationAngle(0, 0, -0).setName("Box 8")
		);
		moving.add(new ModelRendererTurbo(moving, 33, 1, textureX, textureY)
			.addShapeBox(12, -8, 21.5f, 1, 2, 4, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(58, -5, 0).setRotationAngle(0, 0, -0).setName("Box 10")
		);
		moving.add(new ModelRendererTurbo(moving, 185, 1, textureX, textureY)
			.addShapeBox(8, -8, -24.5f, 1, 2, 4, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(58, -5, 0).setRotationAngle(0, 0, -0).setName("Box 11")
		);
		moving.addProgram(new DefaultPrograms.AttributeRotator("t1_snowplow", true, 0, 20, 1, 2, -20f));
		this.groups.add(moving);
    }

}
