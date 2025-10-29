package CC.Encycloped.Abs.Scal.Gom.ShAp;

import static CC.Encycloped.Abs.Scal.Gom.Gom.Hyp;

public class SphEr implements Inbl
{
	public double Rad;
		@Override
		public boolean Is_In(double[] Loc)
		{return Hyp(Loc)<Rad;}

	@Override
	public void Get_Trand_Bordr_Box_StRt(double[] Box,double[] Tran)
	{
		double
			X=Tran[0],
			Y=Tran[0],
			Z=Tran[0];
		Out_Box_Getbl.UpdAt_Out_Box_StRt(Box,
			X-Rad,X+Rad,
			Y-Rad,Y+Rad,
			Z-Rad,Z+Rad);
	}
	@Override
	public void Get_Trand_Bordr_Box(double[] Box,double[] Tran)
	{
		double
			X=Tran[0],
			Y=Tran[0],
			Z=Tran[0];
		Out_Box_Getbl.UpdAt_Out_Box(Box,
			X-Rad,X+Rad,
			Y-Rad,Y+Rad,
			Z-Rad,Z+Rad);
	}

	@Override
	public String toString()
	{return "SphEr("+Rad+")";}

	public SphEr(double Rad)
	{this.Rad=Rad;}
}