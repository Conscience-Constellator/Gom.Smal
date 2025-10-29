package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Encycloped.Abs.Scal.Gom.RL_LOc_Havr.RL_LOc_Havr_ConcrEt;
import static CC.List.ArA_Util.Set_LNg;
import static CC.List.BAs_ArA.ABC;
import static CC.Encycloped.Abs.Scal.Gom.Gom.Hyp;
import CC.Encycloped.Abs.Scal.Gom.ShAp.Out_Box_Getbl;

public class LOcg_By_LOc<SpAc_Typ extends SpAc>
  implements LOcg_Havr  <SpAc_Typ>
{
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=false)
	public SpAc_Typ Get_SpAc()
	{
		return (LOcg!=null)?
			LOcg[0].Get_SpAc():
			null;
	}

	private RL_LOc_Havr<SpAc_Typ>[] LOcg;
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public RL_LOc_Havr<SpAc_Typ>[] Get_VrtXg()
		{return LOcg;}
		@Lin_DclAr @Finishd(Is_Finishd=true)
		public void Set_LOcg(RL_LOc_Havr<SpAc_Typ>... LOcg)
		{this.LOcg=LOcg;}
		@Lin_DclAr @Finishd(Is_Finishd=true)
		public  int Get_LOc_Num()
		{return LOcg.length;}
		@Override @Finishd(Is_Finishd=false)
		public void Set_LOc_Num(int Num)
		{
			RL_LOc_Havr<SpAc_Typ> Parnt=LOcg[0].Get_Gom_PArnt();
			LOcg=Set_LNg(LOcg,RL_LOc_Havr.class,Num,
				()->{return new RL_LOc_Havr_ConcrEt<SpAc_Typ>(Parnt,null);});
		}
		@Override @Finishd(Is_Finishd=true)
		public void Get_LOc(int IndX,double[] VrtX)
		{LOcg[IndX].Get_LOc_CoP_As_ArA(VrtX);}
		@Override @Finishd(Is_Finishd=true)
		public void Set_LOc(int IndX,double[] VrtX)
		{LOcg[IndX].Set_LOc(VrtX);}
			@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
			public double Get_Distnc_To_LOc(double[] From,int LOc)
			{
				double[] VrtX=Get_LOc(LOc);

				return Hyp(
					From[0]-VrtX[0],
					From[1]-VrtX[1],
					From[2]-VrtX[2]
				);
			}
		@Override @Finishd(Is_Finishd=true)
		public double Get_COrd(int Dim,int LOc)
		{return LOcg[LOc].Get_COrd(Dim);}
		@Override @Finishd(Is_Finishd=true)
		public void Set_COrd(int Dim,int LOc,double COrd)
		{LOcg[LOc].Set_COrd(Dim,COrd);}

	@Finishd(Is_Finishd=false)
	public void CoP(LOcg_By_LOc<SpAc_Typ> From)
	{
		LOcg=new RL_LOc_Havr[From.Get_LOc_Num()];
		for(int IndX=0;
			IndX<Get_LOc_Num();
			IndX+=1)
		{LOcg[IndX]=new RL_LOc_Havr_ConcrEt<SpAc_Typ>(From.LOcg[IndX]);}
	}
	@Finishd(Is_Finishd=false)
	public void CoP(SpAc SpAc,LOcg_Havr<SpAc_Typ> From)
	{LOcg=MAk_VrtXg(SpAc,From.Get_LOc_Num());}
		@Finishd(Is_Finishd=false)
		public void CoP(LOcg_Havr<SpAc_Typ> From)
		{CoP(From.Get_SpAc(),From);}

	//<editor-fold desc="Box">
	@Override @Finishd(Is_Finishd=false)
	public void Box_IndX(double[] Box,int IndX)
	{Out_Box_Getbl.UpdAt_Out_Box(Box,Get_LOc(IndX));}
	@Override @Finishd(Is_Finishd=false)
	public void Box_1_StRt(double[] Box)
	{Out_Box_Getbl.UpdAt_Out_Box_StRt(Box,Get_LOc(0));}
	//</editor-fold>
	@Override @Finishd(Is_Finishd=false)
	public void Get_Avrg_LOc(double[] LOc)
	{
		double X=0,Y=0,Z=0;
		for(int IndX=0;
			IndX<Get_LOc_Num();
			IndX+=1)
		{
			Get_LOc(IndX,LOc);
			X+=LOc[0];
			Y+=LOc[1];
			Z+=LOc[2];
		}
		int VrtX_Num=Get_LOc_Num();

		ABC(LOc,
			X/VrtX_Num,
			Y/VrtX_Num,
			Z/VrtX_Num);
	}

	@Finishd(Is_Finishd=true)
	public LOcg_By_LOc(RL_LOc_Havr<SpAc_Typ>... LOcg)
	{Set_LOcg(LOcg);}
	@Finishd(Is_Finishd=true)
	public LOcg_By_LOc(RL_LOc_Havr<SpAc_Typ> Parnt,int Num)
	{this(MAk_VrtXg(Parnt,Num));}
	@Finishd(Is_Finishd=true)
	public LOcg_By_LOc(LOcg_By_LOc<SpAc_Typ> From)
	{CoP(From);}
	@Finishd(Is_Finishd=true)
	public LOcg_By_LOc(LOcg_Havr<SpAc_Typ> From)
	{CoP(From);}
	@Finishd(Is_Finishd=false)
	public static <SpAc_Typ extends SpAc>RL_LOc_Havr<SpAc_Typ>[] MAk_VrtXg(RL_LOc_Havr<SpAc_Typ> Parnt,int VrtX_Num)
	{
		RL_LOc_Havr<SpAc_Typ>[] VrtXg=new RL_LOc_Havr[VrtX_Num];
		for(int IndX=0;
			IndX<VrtX_Num;
			IndX+=1)
		{VrtXg[IndX]=new RL_LOc_Havr_ConcrEt<SpAc_Typ>(Parnt,null);}

		return VrtXg;
	}

	@Override
	public void Set_LOcg(double[] X,double[] Y,double[] Z)
	{
		int LNg=X.length;
		Set_LOc_Num(LNg);
		for(int IndX=0;
			IndX<LNg;
			IndX+=1)
		{
			Set_LOc(IndX,
				X[IndX],
				Y[IndX],
				Z[IndX]);
		}
	}

	@Lin_DclAr @Finishd(Is_Finishd=false)
	public LOcg_Havr<SpAc_Typ> Get_LOcg_CoP()
	{return new LOcg_By_LOc<>(this);}
}