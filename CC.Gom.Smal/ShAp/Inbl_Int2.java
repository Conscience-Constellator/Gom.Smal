package CC.Encycloped.Abs.Scal.Gom.ShAp;

import CC.COd.Lin_DclAr;

import java.util.ArrayList;
import java.util.List;

public interface Inbl_Int2
{
	@Lin_DclAr
	boolean Is_In(int X,int Y);
		static <Typ extends Inbl_Int2>List<Typ> Get_Ing(int X,int Y,int Num,Typ... Atomg)
		{
			ArrayList<Typ> TRgetg=new ArrayList<>();
			for(int IndX=Num-1;
				IndX>=0;
				IndX-=1)
			{
				Typ Item=Atomg[IndX];
				if(Item.Is_In(X,Y))
				{TRgetg.add(Item);}
			}

			return TRgetg;
		}
		static <Typ extends Inbl_Int2>List<Typ> Get_Ing(int X,int Y,int Num,List<Typ> Atomg)
		{
			ArrayList<Typ> TRgetg=new ArrayList<>();
			for(int IndX=Num-1;
				IndX>=0;
				IndX-=1)
			{
				Typ Item=Atomg.get(IndX);
				if(Item.Is_In(X,Y))
				{TRgetg.add(Item);}
			}

			return TRgetg;
		}
			static <Typ extends Inbl_Int2>List<Typ> Get_Ing(double[] Loc,int Num,Typ... List)
			{
				return Get_Ing(
					(int)Loc[0],
					(int)Loc[1],
				Num,List);
			}
			static <Typ extends Inbl_Int2>List<Typ> Get_Ing(double[] Loc,int Num,List<Typ> List)
			{
				return Get_Ing(
					(int)Loc[0],
					(int)Loc[1],
				Num,List);
			}
}