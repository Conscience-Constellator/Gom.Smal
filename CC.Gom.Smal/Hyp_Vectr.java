package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Lin_DclAr;

import static CC.Math.SIn.UnsIn;
import static CC.List.BAs_ArA.ABC;
import static CC.Encycloped.Abs.Org.Comput.Bi.Swap.Swap;
import static CC.Encycloped.Abs.Scal.Gom.Gom.Hyp;
import static CC.Encycloped.Abs.Org.Syc.TXt.Num.List$String;
import static CC.Encycloped.Abs.Org.Syc.TXt.TXt.ParIs;

public class Hyp_Vectr
{
	public double X,Y,Z;
		public double Totl()
		{
			return
				UnsIn(X)+
				UnsIn(Y)+
				UnsIn(Z);
		}
		public void Set(double X,double Y,double Z)
		{	this.X=X;this.Y=Y;this.Z=Z;	  }
			public void Set(double[] Dr)
			{	Set(Dr[0],Dr[1],Dr[2]);	  }
			public void Set(Hyp_Vectr Dr)
			{	Set(Dr.X,Dr.Y,Dr.Z);   }
		public void CalculAt(double X,double Y,double Z)
		{
			double LNg=Hyp(X,Y,Z);
			if(LNg>0)
			{
				this.X=X/LNg;
				this.Y=Y/LNg;
				this.Z=Z/LNg;
			}
		}
			public void CalculAt(double[] LOc)
			{
				CalculAt(LOc[0],
						 LOc[1],
						 LOc[2]);
			}
	public void Cros_Product(double[] Vectr,
		double AX,double AY,double AZ,
		double BX,double BY,double BZ)
	{
		ABC(Vectr,
			(AY*BZ)-(AZ*BY),
			(AZ*BX)-(AX*BZ),
			(AX*BY)-(AY*BX)
		);
	}
	public void Cros_Product(
		double AX,double AY,double AZ,
		double BX,double BY,double BZ)
	{
		CalculAt(
			(AY*BZ)-(AZ*BY),
			(AZ*BX)-(AX*BZ),
			(AX*BY)-(AY*BX)
		);
	}
		public static Hyp_Vectr Cros_Product_(
			double AX,double AY,double AZ,
			double BX,double BY,double BZ)
		{
			Hyp_Vectr Rsult=new Hyp_Vectr();
			Rsult.Cros_Product(
				AX,AY,AZ,
				BX,BY,BZ);

			return Rsult;
		}
	public void Cros_Product_(Hyp_Vectr A,Hyp_Vectr B)
	{
		Cros_Product(
			A.X,A.Y,A.Z,
			B.X,B.Y,B.Z);
	}
	public void Cros_Product(Hyp_Vectr Vectr,Hyp_Vectr Rsult)
	{
		Rsult.Cros_Product(
			X,Y,Z,
			Vectr.X,Vectr.Y,Vectr.Z);
	}
		public Hyp_Vectr Cros_Product(Hyp_Vectr Vectr)
		{
			Hyp_Vectr Norml=new Hyp_Vectr();

			Cros_Product(Vectr,Norml);

			return Norml;
		}

		public String toString(int Lim)
		{return List$String(Lim,X,Y,Z);}
		public String toString_Lim(int Lim)
		{return toString(Lim)+ParIs(Totl());}
		@Override
		public String toString()
		{return toString(20);}

	@Lin_DclAr
	public void NegAt()
	{
		X*=-1;
		Y*=-1;
		Z*=-1;
	}
	public static int CalculAt_Dr_Octnt(double X,double Y,double Z)
	{return
		((X<0)?0b001:0)|
		((Y<0)?0b010:0)|
		((Z<0)?0b100:0);
	}
		public static int CalculAt_Dr_Octnt(double[] Dr)
		{
			return CalculAt_Dr_Octnt(
				Dr[0],
				Dr[1],
				Dr[2]);
		}
		public int CalculAt_Dr_Octnt()
		{return CalculAt_Dr_Octnt(X,Y,Z);}
	public static int CalculAt_Dr_Octnt(byte Latrl,double X,double Y,double Z)
	{
		byte Rvrs_Latrl=Swap(Latrl);

		return
			((X<0)?Latrl:Rvrs_Latrl)|
			((Y<0)?Latrl:Rvrs_Latrl)<<2|
			((Z<0)?Latrl:Rvrs_Latrl)<<4;
	}
		public static int CalculAt_Dr_Octnt(byte Latrl,double[] Dr)
		{
			return CalculAt_Dr_Octnt(Latrl,
				Dr[0],
				Dr[1],
				Dr[2]);
		}
		public int CalculAt_Dr_Octnt(byte Latrl)
		{return CalculAt_Dr_Octnt(Latrl,X,Y,Z);}
	public static byte Rev_Dr(byte Dr)
	{return (byte)((~Dr)&0b0011_1111);}

	public void $ArA(double[] ArA)
	{ABC(ArA,X,Y,Z);}
		public double[] $ArA()
		{return ABC(X,Y,Z);}

	public Hyp_Vectr()
	{}
	public Hyp_Vectr(double X,double Y,double Z)
	{CalculAt(X,Y,Z);}
		public Hyp_Vectr(double[] LOc)
		{CalculAt(LOc);}
}