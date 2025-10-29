package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.List;
import CC.Encycloped.TIm.UpdAtbl;

public interface RL_LOc_Havr_Rapr<SpAc_Typ extends SpAc>
		 extends RL_LOc_Havr	 <SpAc_Typ>
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	RL_LOc_Havr<SpAc_Typ> Get_Rapd_LOc_Havr();
	@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default RL_LOc_Havr<SpAc_Typ> Get_Gom_PArnt()
	{return Get_Rapd_LOc_Havr().Get_Gom_PArnt();}
	@Override @Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void Set_Gom_PArnt(RL_LOc_Havr<SpAc_Typ> PArnt)
	{Get_Rapd_LOc_Havr().Set_Gom_PArnt(PArnt);}
	@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default LOc Get_RL_LOc()
	{return Get_Rapd_LOc_Havr().Get_RL_LOc();}
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void Set_RL_LOc(LOc LOc)
	{Get_Rapd_LOc_Havr().Set_RL_LOc(LOc);}

	@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default List<UpdAtbl> Get_UpdAt_Lisnrg()
	{return Get_Rapd_LOc_Havr().Get_UpdAt_Lisnrg();}

	@Finishd(Is_Finishd=true)
	class RL_LOc_Havr_Rapr_ConcrEt<SpAc_Typ extends SpAc> implements RL_LOc_Havr_Rapr<SpAc_Typ>
	{
		@Finishd(Is_Finishd=true)
		private RL_LOc_Havr<SpAc_Typ> Rapd_Loc_Havr;
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public final RL_LOc_Havr<SpAc_Typ> Get_Rapd_LOc_Havr()
		{return Rapd_Loc_Havr;}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		public void Set_Rapd_Loc_Havr(RL_LOc_Havr<SpAc_Typ> Rapd)
		{Rapd_Loc_Havr=Rapd;}

		@Finishd(Is_Finishd=true)
		public RL_LOc_Havr_Rapr_ConcrEt(RL_LOc_Havr<SpAc_Typ> Rapd)
		{Set_Rapd_Loc_Havr(Rapd);}
	}
}