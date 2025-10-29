package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Encycloped.Abs.Scal.Gom.ShAp.Out_Box_Getbl.Out_Box_Getbl_IndX_Rapr;

public interface LOcg_Havr_Rapr<SpAc_Typ extends SpAc,Rapd_LOcg_Typ extends LOcg_Havr<SpAc_Typ>>
		 extends LOcg_Havr	   <SpAc_Typ>,Out_Box_Getbl_IndX_Rapr
{
	@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default SpAc_Typ Get_SpAc()
	{return Get_Rapd_LOcg().Get_SpAc();}

	@Lin_DclAr @Finishd(Is_Finishd=true)
	Rapd_LOcg_Typ Get_Rapd_LOcg();
	@Lin_DclAr @Finishd(Is_Finishd=true)
	void	 Set_Rapd_LOcg(Rapd_LOcg_Typ Locg);
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default  int Get_LOc_Num()
		{return Get_Rapd_LOcg().Get_LOc_Num();}
		@Override @Finishd(Is_Finishd=true)
		default void Set_LOc_Num(int Num)
		{Get_Rapd_LOcg().Set_LOc_Num(Num);}
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Get_LOc(int IndX,double[] Loc)
		{Get_Rapd_LOcg().Get_LOc(IndX,Loc);}
			@Override @Finishd(Is_Finishd=true)
			default double Get_COrd(int Dim,int LOc)
			{return Get_Rapd_LOcg().Get_COrd(Dim,LOc);}
			@Override @Finishd(Is_Finishd=true)
			default void Set_COrd(int Dim,int LOc,double COrd)
			{Get_Rapd_LOcg().Set_COrd(Dim,LOc,COrd);}
		@Override @Finishd(Is_Finishd=true)
		default void Get_Avrg_LOc(double[] LOc)
		{Get_Rapd_LOcg().Get_Avrg_LOc(LOc);}
		@Override @Finishd(Is_Finishd=true)
		default double Get_Distnc_To_LOc(double[] From,int IndX)
		{return Get_Rapd_LOcg().Get_Distnc_To_LOc(From,IndX);}
	@Override @Finishd(Is_Finishd=true)
	default void Set_LOcg(double[] X,double[] Y,double[] Z)
	{Get_Rapd_LOcg().Set_LOcg(X,Y,Z);}

	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default int Project(Projectr Projectr,LOcg_Havr LOcg)
	{return Get_BAs_LOcg_Havr().Project(Projectr,LOcg);}

	@Override @Finishd(Is_Finishd=true)
	default LOcg_Havr Get_Rapd_Box_Getbl()
	{return Get_Rapd_LOcg();}

	@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default LOcg_Havr Get_BAs_LOcg_Havr()
	{return Get_Rapd_LOcg().Get_BAs_LOcg_Havr();}

	@Lin_DclAr @Finishd(Is_Finishd=true)
	default LOcg_Havr Get_LOcg_CoP()
	{return Get_Rapd_LOcg().Get_LOcg_CoP();}

	class LOcg_Havr_Rapr_ConcrEt<SpAc_Typ extends SpAc,LOcg_Typ extends LOcg_Havr<SpAc_Typ>>
		implements LOcg_Havr_Rapr<SpAc_Typ,LOcg_Typ>
	{
		@Finishd(Is_Finishd=true)
		private LOcg_Typ Rapd_LOcg;
			@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public LOcg_Typ Get_Rapd_LOcg()
			{return Rapd_LOcg;}
			@Override @Finishd(Is_Finishd=true)
			public void Set_Rapd_LOcg(LOcg_Typ Rapd)
			{
				if(Rapd==null)
				{throw new RuntimeException("Rapd=null");}

				Rapd_LOcg=Rapd;
			}

		@Finishd(Is_Finishd=false)
		public LOcg_Havr_Rapr_ConcrEt()
		{}
		@Finishd(Is_Finishd=true)
		public LOcg_Havr_Rapr_ConcrEt(LOcg_Typ Rapd)
		{Set_Rapd_LOcg(Rapd);}
	}
}