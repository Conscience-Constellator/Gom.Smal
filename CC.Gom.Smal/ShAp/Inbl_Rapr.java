package CC.Encycloped.Abs.Scal.Gom.ShAp;

import CC.COd.Lin_DclAr;

public interface Inbl_Rapr<Rapd_Inbl_Typ extends Inbl> extends Inbl
{
	@Lin_DclAr
	Rapd_Inbl_Typ Get_Rapd_Inbl();
		@Lin_DclAr
		default Inbl Get_BAs_Inbl()
		{return Get_Rapd_Inbl();}
			@Override
			default boolean Is_In(double[] Loc)
			{return Get_Rapd_Inbl().Is_In(Loc);}
			@Override
			default void Get_Trand_Bordr_Box_StRt(double[] Box,double[] Tran)
			{Get_Rapd_Inbl().Get_Trand_Bordr_Box_StRt(Box,Tran);}
			@Override
			default void Get_Trand_Bordr_Box(double[] Box,double[] Tran)
			{Get_Rapd_Inbl().Get_Trand_Bordr_Box(Box,Tran);}
}