package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import static CC.Encycloped.Abs.Scal.Gom.Gom.Hyp;

@Finishd(Is_Finishd=true)
public interface Avrg_LOc_Havr
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=false)
	int Get_Dim_Num();

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Get_Avrg_LOc(double[] LOc);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default double[] Get_Avrg_LOc()
		{
			double[] LOc=new double[Get_Dim_Num()];

			Get_Avrg_LOc(LOc);

			return LOc;
		}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default double CalculAt_Distnc_Avrg(double[] From)
	{return Hyp(From,Get_Avrg_LOc());}
}