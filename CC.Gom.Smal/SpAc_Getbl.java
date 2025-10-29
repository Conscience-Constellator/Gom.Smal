package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

@Finishd(Is_Finishd=true)
public interface SpAc_Getbl<
				 SpAc_Typ
	   extends	 SpAc>
{
	@Lin_DclAr @Neds_Ovrid(NEds=No ) @Finishd(Is_Finishd=true)
	default boolean Has_SpAc()
	{return Get_SpAc()!=null;}
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	SpAc_Typ 		Get_SpAc();

	@Finishd(Is_Finishd=true)
	interface SpAc_Setbl<
			  SpAc_Typ
	extends	  SpAc>
	extends   SpAc_Getbl<
			  SpAc_Typ>
	{
		@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
		void Set_SpAc(SpAc_Typ SpAc);

		class	   SpAc_Setbl_ConcrEt<
				   SpAc_Typ extends
				   SpAc>
		implements SpAc_Setbl<
				   SpAc_Typ>
		{
			@Finishd(Is_Finishd=true)
			private SpAc_Typ SpAc;
				@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
				public final SpAc_Typ Get_SpAc()
				{return SpAc;}
				@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
				public void Set_SpAc(SpAc_Typ SpAc)
				{this.SpAc=SpAc;}

			@Finishd(Is_Finishd=false)
			public SpAc_Setbl_ConcrEt()
			{}
			@Finishd(Is_Finishd=true)
			public SpAc_Setbl_ConcrEt(SpAc_Typ SpAc)
			{Set_SpAc(SpAc);}
		}
	}
}