package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Scal.Gom.ShAp.Out_Box_Getbl;
import CC.Encycloped.Abs.Scal.Gom.ShAp.Out_Box_Getbl.Out_Box_Getbl_IndX;
import CC.List.List_Managr;
import CC.Encycloped.Abs.Scal.Gom.RL_LOc_Havr.RL_LOc_Havr_ConcrEt;
import java.util.ArrayList;

public class Object_PlAn extends RL_LOc_Havr_ConcrEt implements Out_Box_Getbl_IndX
{
	@Override
	public int Get_Dim_Num()
	{return 3;}

	public ArrayList<RL_LOc_Havr> Grid=new ArrayList<>();
		public List_Managr<RL_LOc_Havr> Managr;
		public void Ad(RL_LOc_Havr Object)
		{
			Grid.add(Object);
			Object.Parnt(this);
			Managr.Manag(Grid);
		}
	@Override
	public int Box_Num()
	{return Grid.size();}
	@Override
	public void Box_IndX(double[] Box,int IndX)
	{Out_Box_Getbl.Get_Bordr_Out_Box(Grid.get(IndX),Box);}
	@Override
	public void Box_1_StRt(double[] Box)
	{Out_Box_Getbl.Get_Bordr_Out_Box_StRt(Grid.get(0),Box);}
	@Override
	public void Box_1(double[] Box)
	{Box_IndX(Box,0);}
	@Override
	public double[] Get_Bordr_Out_Box_StRt()
	{
		return (Grid.size()>0)?
			Out_Box_Getbl_IndX.super.Get_Bordr_Out_Box_StRt():
			null;
	}

	public Object_PlAn(RL_LOc_Havr Parnt,Object Loc_Sorc,List_Managr<RL_LOc_Havr> Managr)
	{
		super(Parnt,Loc_Sorc);
		this.Managr=Managr;
	}
		public static Object_PlAn Gar_PlAn(Object Sorc,RL_LOc_Havr Parnt,Object Loc_Sorc)
		{
			return
				(Sorc instanceof Object_PlAn)?(Object_PlAn)Sorc:
				(Sorc instanceof List_Managr)?new Object_PlAn(Parnt,Loc_Sorc,(List_Managr<RL_LOc_Havr>)Sorc):
				null;
		}
}