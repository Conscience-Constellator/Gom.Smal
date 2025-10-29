package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;
import CC.COd.Alias;

import static CC.List.BAs_ArA.ABC;
import static CC.UI.ConsOl.Print;

public class LOc
  implements LOc_Havr
{
	@Finishd(Is_Finishd=true)
	private double X,Y,Z;
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public void $ArA(double[] ArA)
		{ABC(ArA,Get_COrd(0),Get_COrd(1),Get_COrd(2));}
			@Override @Neds_Ovrid(NEds=Ok) @Alias @Finishd(Is_Finishd=true)
			public void Get_LOc_CoP_As_ArA(double[] Rsult)
			{$ArA(Rsult);}

			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public double[] $ArA()
			{return ABC(Get_COrd(0),Get_COrd(1),Get_COrd(2));}

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public double Get_COrd(int Dim)
	{
		return switch(Dim)
		{
			case 0->X;
			case 1->Y;
			case 2->Z;
			default->throw new IllegalStateException("No coord:"+Dim);
		};
	}
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public void Set_COrd(int Dim,double COrd)
	{
		switch(Dim)
		{
			case 0->X=COrd;
			case 1->Y=COrd;
			case 2->Z=COrd;
			default->throw new IllegalStateException("No coord:"+Dim);
		};
	}

	public LOc()
	{}
	public LOc(double X,double Y,double Z)
	{Set_LOc(X,Y,Z);}
		public LOc(double[] LOc,double X,double Y,double Z)
		{Set_LOc(LOc,X,Y,Z);}
		public LOc(LOc_Havr LOc,double X,double Y,double Z)
		{Set_LOc(LOc,X,Y,Z);}
	public LOc(double[] SOrc)
	{Set_LOc(SOrc[0],SOrc[1],SOrc[2]);}
	public LOc(RL_LOc_Havr SOrc)
	{Set_LOc(SOrc.Get_LOc_CoP_As_ArA());}
	public LOc CoP()
	{return new LOc(Get_COrd(0),Get_COrd(1),Get_COrd(2));}
	public static LOc Gar_LOc(Object SOrc)
	{
		return (SOrc instanceof LOc LOc)?LOc:
			   (SOrc instanceof RL_LOc_Havr Havr)?Havr.Get_LOc_CoP():
			   (SOrc instanceof double[])?new LOc((double[])SOrc):
			   (SOrc==null)?new LOc(0,0,0):
			   Print(1,"Invalid LOc_SOrc:",SOrc);
	}
	public static double[] Gar_ArA(Object SOrc)
	{
		return (SOrc instanceof LOc LOc)?LOc.$ArA():
			   (SOrc instanceof RL_LOc_Havr Havr)?Havr.Get_LOc_CoP_As_ArA():
			   (SOrc instanceof double[])?(double[])SOrc:
			   (SOrc==null)?new double[3]:
			   Print(1,"Invalid LOc_SOrc:",SOrc);
	}
}