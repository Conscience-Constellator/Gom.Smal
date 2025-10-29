package CC.Encycloped.Abs.Scal.Gom.ShAp;

import CC.COd.Lin_DclAr;

import CC.Encycloped.Abs.Scal.Gom.LOc$Bool;

public interface Inbl extends LOc$Bool
{
	@Lin_DclAr
	boolean Is_In(double[] Loc);
		@Lin_DclAr
		default boolean LOc$Bool(double[] LOc)
		{return Is_In(LOc);}
		static boolean Is_In_(
			Inbl A,double[] A_Loc,
			Inbl B,double[] B_Loc)
		{
			return
				A.Is_In(B_Loc)||
				B.Is_In(A_Loc);
		}

	@Lin_DclAr
	void Get_Trand_Bordr_Box_StRt(double[] Box,double[] Tran);
		@Lin_DclAr
		default double[] Get_Trand_Bordr_Box_StRt(double[] Tran)
		{
			double[] Box=new double[3];
			Get_Trand_Bordr_Box_StRt(Box,Tran);

			return Box;
		}
	@Lin_DclAr
	void Get_Trand_Bordr_Box(double[] Box,double[] Tran);
		@Lin_DclAr
		default double[] Get_Trand_Bordr_Box(double[] Tran)
		{
			double[] Box=new double[3];
			Get_Trand_Bordr_Box(Box,Tran);

			return Box;
		}

	@Lin_DclAr
	default Inbl Get_BAs_Inbl()
	{return this;}
}