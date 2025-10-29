package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

public interface ROt_Havr
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	LOc  Get_ROt();
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Set_ROt(LOc ROt);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void   Set_RotAtn(double I,double K,double J)
		{Get_ROt().Set_LOc(I,K,J);}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void   RotAt(double I,double K,double J)
		{Get_ROt().Mov(I,K,J);}
		@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
		default void UnrotAt(double I,double K,double J)
		{RotAt(-I,-K,-J);}
	@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
	default void ClEr_ROt()
	{Get_ROt().Snap_$Origin();}
}