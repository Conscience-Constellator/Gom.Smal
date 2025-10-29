package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Encycloped.Abs.Scal.Gom.ShAp.Out_Box_Getbl.Out_Box_Getbl_IndX;
import static CC.Encycloped.Abs.Org.Comput.Bi.Bi.OrAl;
import static CC.Encycloped.Abs.Scal.Gom.Gom.Hyp;
import static java.lang.Math.max;
import static java.lang.Math.min;

public interface  LOcg_Havr<SpAc_Typ extends SpAc>
		 extends SpAc_Getbl<SpAc_Typ>,Out_Box_Getbl_IndX
{
	@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
	default int Get_Dim_Num()
	{return 3;}

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	int Get_LOc_Num();
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Set_LOc_Num(int Num);
		@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
		void Get_LOc(int IndX,double[] VrtX);
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default double[] Get_LOc(int IndX)
			{
				double[] VrtX=new double[3];

				Get_LOc(IndX,VrtX);

				return VrtX;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void Set_LOc(int IndX,double X,double Y,double Z)
		{
			Set_COrd(0,IndX,X);
			Set_COrd(1,IndX,Y);
			Set_COrd(2,IndX,Z);
		}
			@Lin_DclAr @Finishd(Is_Finishd=true)
			default void Set_LOc(int IndX,double[] Loc)
			{Set_LOc(IndX,Loc[0],Loc[1],Loc[2]);}
			@Lin_DclAr @Finishd(Is_Finishd=true)
			default void Set_LOc(int IndX,LOcg_Havr From)
			{
				Set_LOc(IndX,
					From.Get_COrd(0,IndX),
					From.Get_COrd(1,IndX),
					From.Get_COrd(2,IndX));
			}
		@Lin_DclAr @Finishd(Is_Finishd=true)
		double Get_Distnc_To_LOc(double[] From,int IndX);
		@Lin_DclAr @Finishd(Is_Finishd=true)
		double Get_COrd(int Dim,int LOc);
		@Lin_DclAr @Finishd(Is_Finishd=true)
		void Set_COrd(int Dim,int LOc,double COrd);
	@Lin_DclAr
	void Set_LOcg(double[] X,double[] Y,double[] Z);

	@Lin_DclAr @Finishd(Is_Finishd=false)
	default void Get_Prox_Rang(
		double[] From,
		double[] Rang)
	{
		double[] LOc=new double[3];
		double
			Bot=Rang[0],
			Top=Rang[1];
		for(int IndX=0;
			IndX<Get_LOc_Num();
			IndX+=1)
		{
			Get_LOc(IndX,LOc);
			double Hyp=Hyp(From,LOc);
			Bot=min(Hyp,Bot);
			Top=max(Hyp,Top);
		}

		Rang[0]=Bot;
		Rang[1]=Top;
	}

	@Lin_DclAr @Finishd(Is_Finishd=false)
	default double CalculAt_COrd_Avrg(int Dim)
	{
		int LOc_Num=Get_LOc_Num();
		double COrd=0;
		for(int IndX=0;
			IndX<LOc_Num;
			IndX+=1)
		{COrd+=Get_COrd(Dim,IndX);}

		return COrd/LOc_Num;
	}

	@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default int Box_Num()
	{return Get_LOc_Num();}

	@Lin_DclAr @Finishd(Is_Finishd=false)
	default int Project(Projectr Projectr,LOcg_Havr Projectn)
	{
		Projectn=Projectn.Get_BAs_LOcg_Havr();

		int Do_Draw=0;
		double[] VrtX=Projectr.Get_VrtX_StOr();
		for(int IndX=0;
			IndX<Get_LOc_Num();
			IndX+=1)
		{
			Get_LOc(IndX,VrtX);
//			out.println(Arrays.toString(VrtX)+"->");
			Projectr.Project(
				VrtX,
				Projectn,
				VrtX,
				IndX);
//			out.println(Arrays.toString(VrtX));
			Do_Draw=OrAl(Do_Draw,((int)VrtX[2])>>>31);
		}

		return Do_Draw;
	}

	@Lin_DclAr @Finishd(Is_Finishd=true)
	default LOcg_Havr Get_BAs_LOcg_Havr()
	{return this;}

	@Lin_DclAr @Finishd(Is_Finishd=true)
	LOcg_Havr Get_LOcg_CoP();
}