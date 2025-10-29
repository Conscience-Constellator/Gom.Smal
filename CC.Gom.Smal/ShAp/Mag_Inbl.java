package CC.Encycloped.Abs.Scal.Gom.ShAp;

import CC.COd.Finishd;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Encycloped.Abs.Scal.Gom.LOc$Dubl;

public class Mag_Inbl implements Inbl
{
	public LOc$Dubl Loc$Mag;
	public double Mag;
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public boolean Is_In(double[] Loc)
		{return Loc$Mag.LOc$Dubl(Loc)<Mag;}

	@Override
	public void Get_Trand_Bordr_Box_StRt(double[] Box,double[] Tran)
	{
		double
			X=Tran[0],
			Y=Tran[0],
			Z=Tran[0];
		Out_Box_Getbl.UpdAt_Out_Box_StRt(Box,
			X-Mag,X+Mag,
			Y-Mag,Y+Mag,
			Z-Mag,Z+Mag);
	}
	@Override
	public void Get_Trand_Bordr_Box(double[] Box,double[] Tran)
	{
		double
			X=Tran[0],
			Y=Tran[0],
			Z=Tran[0];
		Out_Box_Getbl.UpdAt_Out_Box(Box,
			X-Mag,X+Mag,
			Y-Mag,Y+Mag,
			Z-Mag,Z+Mag);
	}
	
	@Override
	public String toString()
	{return "Mag_Inbl";}

	public Mag_Inbl(LOc$Dubl Loc$Mag,double Mag)
	{
		this.Loc$Mag=Loc$Mag;
		this.Mag=Mag;
	}
		public Mag_Inbl(LOc$Dubl Loc$Mag)
		{this(Loc$Mag,0);}
}