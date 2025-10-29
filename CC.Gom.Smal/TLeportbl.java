package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;

public interface TLeportbl
{
	@Lin_DclAr @Finishd(Is_Finishd=true)
	void TLeport(double X,double Y,double Z);
		@Lin_DclAr @Finishd(Is_Finishd=true)
		default void TLeport(double[] LOc)
		{TLeport(LOc[0],LOc[1],LOc[2]);}
			@Lin_DclAr @Finishd(Is_Finishd=true)
			default void TLeport(RL_LOc_Havr SOrc)
			{TLeport(SOrc.Get_LOc_CoP_As_ArA());}
}