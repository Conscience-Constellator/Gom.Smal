package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

public interface Distnc_Havr
{
	@Lin_DclAr
	void CalculAt_Distnc_Rang(double[] From,double[] Rang);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default double[] CalculAt_Distnc_Rang(double[] From)
		{
			double[] Rang=new double[6];
			CalculAt_Distnc_Rang(From,Rang);

			return Rang;
		}
}
