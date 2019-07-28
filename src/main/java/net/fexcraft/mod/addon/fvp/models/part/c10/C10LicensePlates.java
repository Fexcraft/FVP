//FMT-Marker FVTM-1
package net.fexcraft.mod.addon.fvp.models.part.c10;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter V1 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.8 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "fvp:models/part/c10_license_plates")
public class C10LicensePlates extends PartModel {

	public C10LicensePlates(){
		super(); textureX = 512; textureY = 256;
		this.addToCreators("Ferdinand");
		//
		TurboList license_plate_front = new TurboList("license_plate_front");
		license_plate_front.add(new ModelRendererTurbo(license_plate_front, 198, 114, textureX, textureY).addBox(0, 0, 0, 1, 3, 11)
			.setRotationPoint(50.75f, 0.5f, 5.5f).setRotationAngle(0, 180, -12)
		);
		this.groups.add(license_plate_front);
		//
		TurboList license_plate_rear = new TurboList("license_plate_rear");
		license_plate_rear.add(new ModelRendererTurbo(license_plate_rear, 198, 114, textureX, textureY).addBox(-12.75f, 4.75f, -5.5f, 1, 3, 11)
			.setRotationPoint(-36, -13, 0).setRotationAngle(0, 0, 0)
		);
		license_plate_rear.addProgram(new DefaultPrograms.AttributeRotator("c10_trunk", true, 0, 72, 1, 2, 0f));
		this.groups.add(license_plate_rear);
	}

}
