package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.List;

public interface SpAc_Ocupier<
				 SpAc_Typ
		 extends SpAc>
		 extends SpAc_Adbl<
				 SpAc_Typ>,
	 RL_LOc_Havr<SpAc_Typ>
{
//	@Override
//	default void Ad_To_SpAc(SpAc SpAc)
//	{SpAc.Ad_Object(this);}
//	@Override
//	default void Rmov_From_SpAc()
//	{Get_SpAc().Rmov_Object(this);}
	@Lin_DclAr
	default void Gar_SpAc(SpAc_Getbl<SpAc_Typ> SpAc_SOrc)
	{
		SpAc_Typ Crnt=(SpAc_Typ)Get_SpAc(),
			New=SpAc_SOrc.Get_SpAc();
		if(Crnt!=New)
		{
			Rmov_From_SpAc();
			Ad_To_SpAc(New);
		}
	}
//
//	@Override
//	default void Parnt(RL_Loc_Havr Parnt)
//	{
//		RL_Loc_Havr.super.Parnt(Parnt);
//		Ad_To_SpAc(Get_SpAc());
//	}
//	@Override
//	default void Unparnt_No_Nul(RL_Loc_Havr Parnt)
//	{
//		RL_Loc_Havr.super.Unparnt_No_Nul(Parnt);
//		Rmov_From_SpAc(Get_SpAc());
//	}

	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default String Get_List_NAm()
	{return "Misc";}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default <Typ extends SpAc_Ocupier>List<Typ> List_In()
		{return Get_SpAc().Gar_Category(Get_List_NAm());}

	abstract class SpAc_Ocupier_Imp<
				   SpAc_Typ
		extends	   SpAc>
		extends RL_LOc_Havr_ConcrEt<SpAc_Typ>
		implements SpAc_Ocupier<
				   SpAc_Typ>
	{
		public SpAc_Ocupier_Imp(RL_LOc_Havr Parnt,Object LOc_SOrc)
		{super(Parnt,LOc_SOrc);}
	}
}