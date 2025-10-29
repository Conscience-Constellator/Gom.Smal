package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.List;

public
	interface SpAc_Adbl<
			  SpAc_Typ
	extends   SpAc>
	extends   SpAc_Getbl<
			  SpAc_Typ>
{
	//<editor-fold desc="Ad">
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Ad_To_SpAc(SpAc_Typ SpAc);
		@Finishd(Is_Finishd=true)
		static <SpAc_Typ extends SpAc>void Ad_To_SpAc(
			SpAc_Typ SpAc,
			SpAc_Adbl<SpAc_Typ>... Objectg)
		{
			for(SpAc_Adbl<SpAc_Typ> Object:Objectg)
			{Object.Ad_To_SpAc(SpAc);}
		}
		@Finishd(Is_Finishd=true)
		static <SpAc_Typ extends SpAc>void Ad_To_SpAc(
			SpAc_Typ SpAc,
			List<? extends SpAc_Adbl<SpAc_Typ>> Objectg)
		{
			for(SpAc_Adbl<SpAc_Typ> Object:Objectg)
			{Object.Ad_To_SpAc(SpAc);}
		}
	//</editor-fold>
	//<editor-fold desc="Rmov">
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Rmov_From_SpAc(SpAc_Typ SpAc);
		@Finishd(Is_Finishd=true)
		static <SpAc_Typ extends SpAc>void Rmov_From_SpAc(
			SpAc_Typ SpAc,
			SpAc_Adbl<SpAc_Typ>... Objectg)
		{
			for(SpAc_Adbl<SpAc_Typ> Object:Objectg)
			{Object.Rmov_From_SpAc(SpAc);}
		}
		@Finishd(Is_Finishd=true)
		static <SpAc_Typ extends SpAc>void Rmov_From_SpAc(
			SpAc_Typ SpAc,
			List<? extends SpAc_Adbl<SpAc_Typ>> Objectg)
		{
			for(SpAc_Adbl<SpAc_Typ> Object:Objectg)
			{Object.Rmov_From_SpAc(SpAc);}
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Rmov_From_SpAc()
		{Rmov_From_SpAc(Get_SpAc());}
			@Finishd(Is_Finishd=true)
			static <SpAc_Typ extends SpAc>void Rmov_From_SpAc(
				SpAc_Adbl<SpAc_Typ>... Objectg)
			{
				for(SpAc_Adbl<SpAc_Typ> Object:Objectg)
				{Object.Rmov_From_SpAc();}
			}
	//</editor-fold>
	@Lin_DclAr
	default void Togl_SpAc(SpAc_Typ SpAc)
	{}
}