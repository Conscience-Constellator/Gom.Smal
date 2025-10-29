package CC.Encycloped.Abs.Scal.Gom.ShAp;

import CC.COd.Lin_DclAr;

public class Inbl_No<Rapd_Inbl_Typ extends Inbl> implements Inbl_Rapr<Rapd_Inbl_Typ>
{
	public Rapd_Inbl_Typ Rapd_Inbl;
		public Rapd_Inbl_Typ Get_Rapd_Inbl()
		{return Rapd_Inbl;}
		@Lin_DclAr
		public void Set_Rapd_Inbl(Rapd_Inbl_Typ Rapd)
		{Rapd_Inbl=Rapd;}
			@Override
			public boolean Is_In(double[] Loc)
			{return !Rapd_Inbl.Is_In(Loc);}

			public static void Swap_Dr(double[] Box)
			{
				double StOr=Box[0];
				Box[0]=Box[1];
				Box[1]=StOr;
				StOr=Box[2];
				Box[2]=Box[3];
				Box[3]=StOr;
				StOr=Box[4];
				Box[4]=Box[5];
				Box[5]=StOr;
			}
//				@Override
//				public void Get_Trand_Bordr_Box_StRt(double[] Box,double[] Tran)
//				{
//					Inbl_Rapr.super.Get_Trand_Bordr_Box_StRt(Box,Tran);
//					Swap_Dr(Box);
//				}
//				@Override
//				public void Get_Trand_Bordr_Box(double[] Box,double[] Tran)
//				{
//					Inbl_Rapr.super.Get_Trand_Bordr_Box(Box,Tran);
//					Swap_Dr(Box);
//				}
			@Override
			public void Get_Trand_Bordr_Box_StRt(double[] Box,double[] Tran)
			{Out_Box_Getbl.Max_Box(Box);}
			@Override
			public void Get_Trand_Bordr_Box(double[] Box,double[] Tran)
			{Out_Box_Getbl.Max_Box(Box);}

	@Override
	public String toString()
	{return "!"+Get_Rapd_Inbl();}

	public Inbl_No(Rapd_Inbl_Typ Rapd)
	{Set_Rapd_Inbl(Rapd);}
}