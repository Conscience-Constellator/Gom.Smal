package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import static CC.List.BAs_ArA.ABC;

public interface Box_Havr
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	double[] Get_Box();
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Get_Box_CoP(double[] Box)
		{ABC(Box,Get_Box());}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default double[] Get_Box_CoP()
			{
				double[] Box=new double[6];

				Get_Box_CoP(Box);

				return Box;
			}
}