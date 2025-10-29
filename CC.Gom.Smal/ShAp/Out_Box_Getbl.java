package CC.Encycloped.Abs.Scal.Gom.ShAp;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Encycloped.Abs.Scal.Gom.Avrg_LOc_Havr;
import CC.Encycloped.Abs.Scal.Gom.RL_LOc_Havr;
import java.util.List;

import static CC.List.BAs_ArA.*;
import static CC.Math.Calculatr.*;
import static CC.Math.Math_Plus.CNtr;
import static CC.UI.ConsOl.Print;
import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;
import static java.lang.Math.max;
import static java.lang.Math.min;

public interface Out_Box_Getbl extends Avrg_LOc_Havr
{
	static void Max_Box(double[] Box)
	{
		UpdAt_Out_Box_StRt(Box,
			MIN_VALUE,MAX_VALUE,
			MIN_VALUE,MAX_VALUE,
			MIN_VALUE,MAX_VALUE);
	}
		static double[] Max_Box()
		{
			double[] Box=new double[6];
			Max_Box(Box);

			return Box;
		}
	static void Prep_Box(double[] Box)
	{
		UpdAt_Out_Box_StRt(Box,
			MAX_VALUE,MIN_VALUE,
			MAX_VALUE,MIN_VALUE,
			MAX_VALUE,MIN_VALUE);
	}
		static double[] Prep_Box()
		{
			double[] Box=new double[6];
			Prep_Box(Box);

			return Box;
		}
	//<editor-fold desc="Utilities">
	static void UpdAt_Out_Box(double[] Box,
		double XB,double XT,
		double YB,double YT,
		double ZB,double ZT)
	{
		ABCDEF(Box,min(Box[0],XB),
				   max(Box[1],XT),
				   min(Box[2],YB),
				   max(Box[3],YT),
				   min(Box[4],ZB),
				   max(Box[5],ZT));
	}
		static void UpdAt_Out_Box(double[] Box,
			double X,
			double Y,
			double Z)
		{UpdAt_Out_Box(Box,X,X,Y,Y,Z,Z);}
			static void UpdAt_Out_Box(double[] Box,
				double[] Loc)
			{
				UpdAt_Out_Box(Box,
					Loc[0],
					Loc[1],
					Loc[2]);
			}
				static void UpdAt_Out_Box(double[] Box,
					RL_LOc_Havr Loc)
				{UpdAt_Out_Box(Box,Loc.Get_LOc_CoP_As_ArA());}
	/**Initialises box.*/
	static void UpdAt_Out_Box_StRt(double[] Box,
		double XB,double XT,
		double YB,double YT,
		double ZB,double ZT)
	{ABCDEF(Box,XB,XT,YB,YT,ZB,ZT);}
	static double[] UpdAt_Out_Box_StRt(
		double XB,double XT,
		double YB,double YT,
		double ZB,double ZT)
	{
		double[] Box=new double[6];
		ABCDEF(Box,XB,XT,YB,YT,ZB,ZT);

		return Box;
	}
		static void UpdAt_Out_Box_StRt(double[] Box,
			double X,
			double Y,
			double Z)
		{AABBCC(Box,X,Y,Z);}
		static double[] UpdAt_Out_Box_StRt(
			double X,
			double Y,
			double Z)
		{
			double[] Box=new double[6];
			AABBCC(Box,X,Y,Z);

			return Box;
		}
			static void UpdAt_Out_Box_StRt(double[] Box,
				double[] Loc)
			{AABBCC(Box,Loc);}
			static double[] UpdAt_Out_Box_StRt(
				double[] Loc)
			{
				double[] Box=new double[6];
				AABBCC(Box,Loc);

				return Box;
			}
				static void UpdAt_Out_Box_StRt(double[] Box,
					RL_LOc_Havr Loc)
				{UpdAt_Out_Box_StRt(Box,Loc.Get_LOc_CoP_As_ArA());}
				static double[] UpdAt_Out_Box_StRt(
					RL_LOc_Havr Loc)
				{
					double[] Box=new double[6];
					UpdAt_Out_Box_StRt(Box,Loc.Get_LOc_CoP_As_ArA());

					return Box;
				}
	static void UpdAt_Out_Box_From_StRt(double[] Box,
		double XB,double X_LNg,
		double YB,double Y_LNg,
		double ZB,double Z_LNg)
	{
		ABCDEF(Box,
			XB,XB+X_LNg,
			YB,YB+Y_LNg,
			ZB,ZB+Z_LNg);
	}
	static double[] UpdAt_Out_Box_From_StRt(
		double XB,double X_LNg,
		double YB,double Y_LNg,
		double ZB,double Z_LNg)
	{
		double[] Box=new double[6];
		UpdAt_Out_Box_From_StRt(Box,
			XB,X_LNg,
			YB,Y_LNg,
			ZB,Z_LNg);

		return Box;
	}
		static void UpdAt_Out_Box_From_StRt(double[] Box,
			double[] Bot,
				double X_LNg,
				double Y_LNg,
				double Z_LNg)
		{
			UpdAt_Out_Box_From_StRt(Box,
				Bot[0],X_LNg,
				Bot[1],Y_LNg,
				Bot[2],Z_LNg);
		}
		static double[] UpdAt_Out_Box_From_StRt(
			double[] Bot,
				double X_LNg,
				double Y_LNg,
				double Z_LNg)
		{
			double[] Box=new double[6];
			UpdAt_Out_Box_From_StRt(Box,
				Bot,
					X_LNg,
					Y_LNg,
					Z_LNg);

			return Box;
		}
	static void UpdAt_Out_Box_From(double[] Box,
		double XB,double X_LNg,
		double YB,double Y_LNg,
		double ZB,double Z_LNg)
	{
		UpdAt_Out_Box(Box,
			XB,XB+X_LNg,
			YB,YB+Y_LNg,
			ZB,ZB+Z_LNg);
	}
		static void UpdAt_Out_Box_From(double[] Box,
			double[] Bot,
				double X_LNg,
				double Y_LNg,
				double Z_LNg)
		{
			UpdAt_Out_Box_From(Box,
				Bot[0],X_LNg,
				Bot[1],Y_LNg,
				Bot[2],Z_LNg);
		}
	static void Box(double[] Box,Out_Box_Getbl... Getblg)
	{
		for(Out_Box_Getbl Getbl:Getblg)
		{Getbl.Get_Bordr_Out_Box(Box);}
	}
	static double[] Min(double[] Box)
	{return
		ABC(Box[0],Box[2],Box[4]);}
	static double[] Max(double[] Box)
	{return ABC(Box[1],Box[3],Box[5]);}
	//</editor-fold>

	@Lin_DclAr
	void Get_Bordr_Out_Box_StRt(double[] Box);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default double[] Get_Bordr_Out_Box_StRt()
		{
			double[] Box=new double[6];

			Get_Bordr_Out_Box_StRt(Box);

			return Box;
		}
	@Lin_DclAr
	void Get_Bordr_Out_Box(double[] Box);
		static <Box_Getbl_Typ extends Out_Box_Getbl>double[][] Get_Out_Boxg(Box_Getbl_Typ[] Objectg)
		{
			int LNg=Objectg.length;
			double[][] Boxg=new double[LNg][];
			for(int IndX=0;
				IndX<LNg;
				IndX+=1)
			{Boxg[IndX]=Objectg[IndX].Get_Bordr_Out_Box_StRt();}

			return Boxg;
		}
		static double[][] Get_Out_Boxg(List<? extends Out_Box_Getbl> Objectg)
		{
			int LNg=Objectg.size();
			double[][] Boxg=new double[LNg][];
			for(int IndX=0;
				IndX<LNg;
				IndX+=1)
			{Boxg[IndX]=Objectg.get(IndX).Get_Bordr_Out_Box_StRt();}

			return Boxg;
		}
		static <Box_Getbl_Typ extends Out_Box_Getbl>void Get_Out_Box_Of_Rang(double[] Box,Box_Getbl_Typ[] Objectg,int IndX,int Nd)
		{
			for(;IndX<Nd
				;IndX+=1)
			{Objectg[IndX].Get_Bordr_Out_Box(Box);}
		}
		static void Get_Out_Box_Of_Rang(double[] Box,List<? extends Out_Box_Getbl> Objectg,int IndX,int Nd)
		{
			int LNg=Objectg.size();
			for(;IndX<LNg
				;IndX+=1)
			{Objectg.get(IndX).Get_Bordr_Out_Box(Box);}
		}
		static <Box_Getbl_Typ extends Out_Box_Getbl>void Get_Out_Box_Of_List_StRt(double[] Box,Box_Getbl_Typ[] Objectg)
		{
			int LNg=Objectg.length;
			if(LNg>0)
			{
				Objectg[0].Get_Bordr_Out_Box_StRt(Box);
				Get_Out_Box_Of_Rang(Box,Objectg,1,Objectg.length);
			}
		}
		static void Get_Out_Box_Of_List_StRt(double[] Box,List<? extends Out_Box_Getbl> Objectg)
		{
			int LNg=Objectg.size();
			if(LNg>0)
			{
				Objectg.get(0).Get_Bordr_Out_Box_StRt(Box);
				Get_Out_Box_Of_Rang(Box,Objectg,1,LNg);
			}
			else
			{
				Prep_Box(Box);
			}
		}
			static <Box_Getbl_Typ extends Out_Box_Getbl>double[] Get_Out_Box_Of_List_StRt(Box_Getbl_Typ... Objectg)
			{
				double[] Box=new double[6];
				Get_Out_Box_Of_List_StRt(Box,Objectg);

				return Box;
			}
			static double[] Get_Out_Box_Of_List_StRt(List<? extends Out_Box_Getbl> Objectg)
			{
				double[] Box=new double[6];
				Get_Out_Box_Of_List_StRt(Box,Objectg);

				return Box;
			}
		static <Box_Getbl_Typ extends Out_Box_Getbl>void Get_Out_Box_Of_List(double[] Box,Box_Getbl_Typ[] Objectg)
		{Get_Out_Box_Of_Rang(Box,Objectg,0,Objectg.length);}
		static void Get_Out_Box_Of_List(double[] Box,List<? extends Out_Box_Getbl> Objectg)
		{Get_Out_Box_Of_Rang(Box,Objectg,0,Objectg.size());}

	//<editor-fold desc="DialAt">
	static void DialAt(double[] Box,
		int A_IndX,double A,
		int B_IndX,double B)
	{
		Box[A_IndX]-=A;
		Box[B_IndX]+=B;
	}
	static void DialAt(double[] Box,
		double A_Bot,double A_Top,
		double B_Bot,double B_Top,
		double C_Bot,double C_Top)
	{
		DialAt(Box,
			0,A_Bot,
			1,A_Top);
		DialAt(Box,
			2,B_Bot,
			3,B_Top);
		DialAt(Box,
			4,C_Bot,
			5,C_Top);
	}
	static void DialAt(double[] Box,
		double A,
		double B,
		double C)
	{DialAt(Box,A,A,B,B,C,C);}
	static void DialAt(double[] Box,double MRgin)
	{DialAt(Box,MRgin,MRgin,MRgin);}
	//</editor-fold>

	@Override @Finishd(Is_Finishd=false)
	default void Get_Avrg_LOc(double[] LOc)
	{
		double[] Box=Get_Bordr_Out_Box_StRt();
		ABC(LOc,
			CNtr(Box[0],Box[1]),
			CNtr(Box[2],Box[3]),
			CNtr(Box[4],Box[5]));
	}

	interface Out_Box_Getbl_IndX
	  extends Out_Box_Getbl
	{
		@Lin_DclAr
		int Box_Num();
		@Lin_DclAr
		void Box_IndX(double[] Box,int IndX);
		@Lin_DclAr
		void Box_1_StRt(double[] Box);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Box_1(double[] Box)
		{Box_IndX(Box,0);}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Box_Aftr_1(double[] Box)
		{
			for(int IndX=1;IndX<Box_Num();IndX+=1)
			{Box_IndX(Box,IndX);}
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Get_Bordr_Out_Box(double[] Box)
		{
			Box_1(Box);
			Box_Aftr_1(Box);
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Get_Bordr_Out_Box_StRt(double[] Box)
		{
			Box_1_StRt(Box);
			Box_Aftr_1(Box);
		}
	}
	interface Out_Box_Getbl_Rapr extends Out_Box_Getbl
	{
		@Lin_DclAr
		Out_Box_Getbl Get_Rapd_Box_Getbl();
			@Override
			default void Get_Bordr_Out_Box(double[] Box)
			{Get_Rapd_Box_Getbl().Get_Bordr_Out_Box(Box);}
			@Override
			default void Get_Bordr_Out_Box_StRt(double[] Box)
			{Get_Rapd_Box_Getbl().Get_Bordr_Out_Box_StRt(Box);}

			@Override
			default void Get_Avrg_LOc(double[] LOc)
			{Get_Rapd_Box_Getbl().Get_Avrg_LOc(LOc);}
	}
	interface Out_Box_Getbl_IndX_Rapr extends
		Out_Box_Getbl_Rapr,
		Out_Box_Getbl_IndX
	{
		@Override
		Out_Box_Getbl_IndX Get_Rapd_Box_Getbl();

		@Override
		default void Get_Bordr_Out_Box(double[] Box)
		{Out_Box_Getbl_Rapr.super.Get_Bordr_Out_Box(Box);}
		@Override
		default void Get_Bordr_Out_Box_StRt(double[] Box)
		{Out_Box_Getbl_Rapr.super.Get_Bordr_Out_Box_StRt(Box);}
		@Override
		default void Box_IndX(double[] Box,int IndX)
		{Get_Rapd_Box_Getbl().Box_IndX(Box,IndX);}
		@Override
		default void Box_1_StRt(double[] Box)
		{Get_Rapd_Box_Getbl().Box_1_StRt(Box);}

		@Override
		default void Get_Avrg_LOc(double[] LOc)
		{Out_Box_Getbl_Rapr.super.Get_Avrg_LOc(LOc);}
	}
	static void Get_Bordr_Out_Box_StRt(RL_LOc_Havr SOrc,double[] Box)
	{Out_Box_Getbl.UpdAt_Out_Box_StRt(Box,SOrc);}
	static void Get_Bordr_Out_Box(RL_LOc_Havr SOrc,double[] Box)
	{Out_Box_Getbl.UpdAt_Out_Box(Box,SOrc);}

	static boolean Is_LIn_Som_In_LIn(
		double AA,double AB,
		double BA,double BB)
	{
		return
			Is_In_Rang(AA,AB,BA)||
			Is_In_Rang(AA,AB,BB)||
			Is_In_Rang(BA,BB,AA)||
			Is_In_Rang(BA,BB,AB);
	}
	static boolean Is_LIn_Som_Out_LIn(
		double AA,double AB,
		double BA,double BB)
	{
		return
			(!Is_In_Rang(AA,AB,BA))||
			(!Is_In_Rang(AA,AB,BB))||
			(!Is_In_Rang(BA,BB,AA))||
			(!Is_In_Rang(BA,BB,AB));
	}
	static boolean Is_LIn_Al_In_LIn(
		double AA,double AB,
		double BA,double BB)
	{
		return
			Is_In_Rang(BA,BB,AA)&&
			Is_In_Rang(BA,BB,AB);
	}
	static boolean Is_LIn_Al_Out_LIn(
		double AA,double AB,
		double BA,double BB)
	{
		return
			(!Is_In_Rang(BA,BB,AA))&&
			(!Is_In_Rang(BA,BB,AB));
	}
		static boolean Is_LIn_Som_In_LIn(
			double[] A,double[] B,
			int Bot,int Top)
		{return Is_LIn_Som_In_LIn(
			A[Bot],A[Top],
			B[Bot],B[Top]);
		}
		static boolean Is_LIn_Som_Out_LIn(
			double[] A,double[] B,
			int Bot,int Top)
		{return Is_LIn_Som_Out_LIn(
			A[Bot],A[Top],
			B[Bot],B[Top]);
		}
		static boolean Is_LIn_Al_In_LIn(
			double[] A,double[] B,
			int Bot,int Top)
		{return Is_LIn_Al_In_LIn(
			A[Bot],A[Top],
			B[Bot],B[Top]);
		}
		static boolean Is_LIn_Al_Out_LIn(
			double[] A,double[] B,
			int Bot,int Top)
		{return Is_LIn_Al_Out_LIn(
			A[Bot],A[Top],
			B[Bot],B[Top]);
		}
		static boolean Is_Cord_In_LIn(
			double[] Box,int Bot,int Top,
			double[] Loc,int Cord)
		{return Is_In_Rang(
			Box[Bot],Box[Top],
			Loc[Cord]);
		}
	static boolean Is_Box_Som_In_Box(double[] A,double[] B)
	{
		return
			Is_LIn_Som_In_LIn(A,B,0,1)&&
			Is_LIn_Som_In_LIn(A,B,2,3)&&
			Is_LIn_Som_In_LIn(A,B,4,5);
	}
	static boolean Is_Box_Som_Out_Box(double[] A,double[] B)
	{
		return
			Is_LIn_Som_Out_LIn(A,B,0,1)&&
			Is_LIn_Som_Out_LIn(A,B,2,3)&&
			Is_LIn_Som_Out_LIn(A,B,4,5);
	}
	static boolean Is_Box_OInt_Box(double[] A,double[] B)
	{
		return
			Is_Box_Som_In_Box(A,B)&&
			Is_Box_Som_Out_Box(A,B);
	}
	static boolean Is_Box_Al_In_Box(double[] A,double[] B)
	{
		return
			Is_LIn_Al_In_LIn(A,B,0,1)&&
			Is_LIn_Al_In_LIn(A,B,2,3)&&
			Is_LIn_Al_In_LIn(A,B,4,5);
	}
	static boolean Is_Box_Al_Out_Box(double[] A,double[] B)
	{
		return
			Is_LIn_Al_Out_LIn(A,B,0,1)||
			Is_LIn_Al_Out_LIn(A,B,2,3)|
			Is_LIn_Al_Out_LIn(A,B,4,5);
	}
	static boolean Is_Loc_In_Box(double[] Box,double[] Loc)
	{
		return
			Is_Cord_In_LIn(Box,0,1,Loc,0)&&
			Is_Cord_In_LIn(Box,2,3,Loc,1)&&
			Is_Cord_In_LIn(Box,4,5,Loc,2);
	}
}