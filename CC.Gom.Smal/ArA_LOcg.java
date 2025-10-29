package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.Arrays;
import static CC.List.ArA_Util.Set_LNg;
import static CC.List.BAs_ArA.ABC;
import static CC.Math.Arithmetc.Avrg;
import static CC.Math.Calculatr.*;
import static CC.Encycloped.Abs.Scal.Gom.Gom.Hyp;
import CC.Encycloped.Abs.Scal.Gom.RL_LOc_Havr.RL_LOc_Havr_ConcrEt;
import CC.Encycloped.Abs.Scal.Gom.ShAp.Out_Box_Getbl;

public class ArA_LOcg<SpAc_Typ extends SpAc>
	  extends RL_LOc_Havr_ConcrEt<SpAc_Typ>
	  implements LOcg_Havr<SpAc_Typ>
{
	public double[] X,Y,Z;
		@Lin_DclAr @Finishd(Is_Finishd=false)
		public void Set_LOcg(
			double[] X,
			double[] Y,
			double[] Z)
		{
			this.X=X;
			this.Y=Y;
			this.Z=Z;
		}
		@Lin_DclAr @Finishd(Is_Finishd=false)
		public void Init_ArAs(int LNg)
		{
			Set_LOcg(
				new double[LNg],
				new double[LNg],
				new double[LNg]);
		}
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public int Get_LOc_Num()
		{return X.length;}
		@Override @Finishd(Is_Finishd=false)
		public void Set_LOc_Num(int Num)
		{
			Set_LOcg(
				Set_LNg(X,Num),
				Set_LNg(Y,Num),
				Set_LNg(Z,Num));
		}

		@Override @Finishd(Is_Finishd=false)
		public void Get_LOc(int IndX,double[] VrtX)
		{ABC(VrtX,
			X[IndX],
			Y[IndX],
			Z[IndX]
		);}
			@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
			public double Get_Distnc_To_LOc(double[] From,int IndX)
			{
				return Hyp(
					From[0]-X[IndX],
					From[1]-Y[IndX],
					From[2]-Z[IndX]
				);
			}
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public double Get_COrd(int Dim,int LOc)
		{
			return (switch(Dim){
				case 0->X;
				case 1->Y;
				case 2->Z;
				default->throw new IllegalStateException("Unexpected value: "+Dim);
			})[LOc];
		}
		@Override @Finishd(Is_Finishd=true)
		public void Set_COrd(int Dim,int LOc,double COrd)
		{
			(switch(Dim){
				case 0->X;
				case 1->Y;
				case 2->Z;
				default->throw new IllegalStateException("Unexpected value: "+Dim);
			})[LOc]=COrd;
		}

	@Finishd(Is_Finishd=false)
	public void CoP(LOcg_Havr From)
	{
		Parnt(((RL_LOc_Havr)From).Get_Gom_PArnt());
		Init_ArAs(From.Get_LOc_Num());
		for(int IndX=0;
			IndX<Get_LOc_Num();
			IndX+=1)
		{Set_LOc(IndX,From);}
	}

	//<editor-fold desc="Box">
	@Override @Finishd(Is_Finishd=false)
	public void Box_IndX(double[] Box,int IndX)
	{
		Out_Box_Getbl.UpdAt_Out_Box(Box,
			X[IndX],
			Y[IndX],
			Z[IndX]);
	}
	@Override @Finishd(Is_Finishd=false)
	public void Box_1_StRt(double[] Box)
	{
		Out_Box_Getbl.UpdAt_Out_Box_StRt(Box,
			X[0],
			Y[0],
			Z[0]);
	}
	@Override @Finishd(Is_Finishd=false)
	public void Box_Aftr_1(double[] Box)
	{
		Minax_Aftr_1(X,Box,0,1);
		Minax_Aftr_1(Y,Box,2,3);
		Minax_Aftr_1(Z,Box,4,5);
	}
	//</editor-fold>
	@Override @Finishd(Is_Finishd=false)
	public void Get_Avrg_LOc(double[] LOc)
	{ABC(LOc,
		Avrg(X),
		Avrg(Y),
		Avrg(Z));
	}

	@Override @Finishd(Is_Finishd=true)
	public String toString()
	{return "LOcg("+
		Arrays.toString(X)+
		Arrays.toString(Y)+
		Arrays.toString(Z)+")";
	}

	@Finishd(Is_Finishd=true)
	public ArA_LOcg(RL_LOc_Havr Parnt,
		double[] X,
		double[] Y,
		double[] Z)
	{
		super(Parnt);
		Set_LOcg(X,Y,Z);
	}
		@Finishd(Is_Finishd=true)
		public ArA_LOcg(RL_LOc_Havr Parnt,
			int Num)
		{
			this(Parnt,
				new double[Num],
				new double[Num],
				new double[Num]);
		}
	@Finishd(Is_Finishd=false)
	public ArA_LOcg(
		ArA_LOcg From)
	{
		super(From.Get_Gom_PArnt());
		CoP((LOcg_Havr)From);
	}

	@Lin_DclAr @Finishd(Is_Finishd=false)
	public LOcg_Havr Get_LOcg_CoP()
	{return new ArA_LOcg(this);}
}