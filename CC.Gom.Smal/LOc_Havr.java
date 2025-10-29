package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;

import java.util.List;

import static CC.COd.Neds_Ovrid.*;

import static CC.Math.Avrg.Avrg;
import static CC.Math.Bool.CalculAt_Unit;
import static CC.List.BAs_ArA.ABC;
import static java.lang.Math.*;

@Finishd(Is_Finishd=true)
public interface LOc_Havr
{
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=false)
	default void Get_LOc_CoP(LOc_Havr Rsult)
	{Rsult.Set_LOc(Rsult,Get_COrd(0),Get_COrd(1),Get_COrd(2));}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
		default LOc Get_LOc_CoP()
		{
			LOc			Rsult=new LOc();

			Get_LOc_CoP(Rsult);

			return		Rsult;
		}
	@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
	default void Get_LOc_CoP_As_ArA(double[] Rsult)
	{ABC(Rsult,Get_COrd(0),Get_COrd(1),Get_COrd(2));}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default double[] Get_LOc_CoP_As_ArA()
		{
			double[]		   LOc=new double[3];

			Get_LOc_CoP_As_ArA(LOc);

			return			   LOc;
		}

	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	double Get_COrd(int Dim);
	@Lin_DclAr @Finishd(Is_Finishd=true)
	void   Set_COrd(int Dim,double COrd);
	@Lin_DclAr @Finishd(Is_Finishd=true)
	default void   Mov_COrd(int Dim,double Vectr)
	{
		Set_COrd(Dim,
		Get_COrd(Dim)+Vectr);
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No ) @Finishd(Is_Finishd=true)
	default void Set_LOc(double X,double Y,double Z)
	{Set_COrd(0,X);Set_COrd(1,Y);Set_COrd(2,Z);}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Set_LOc(LOc_Havr LOc)
		{Set_LOc(LOc.Get_COrd(0),LOc.Get_COrd(1),LOc.Get_COrd(2));}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Set_LOc(double[] LOc)
		{Set_LOc(LOc[0],LOc[1],LOc[2]);}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Set_LOc(LOc_Havr LOc,
							 double X,double Y,double Z)
		{Set_LOc(LOc.Get_COrd(0)+X,LOc.Get_COrd(1)+Y,LOc.Get_COrd(2)+Z);}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Set_LOc(double[] LOc,
							 double X,double Y,double Z)
		{Set_LOc(LOc[0]+X,LOc[1]+Y,LOc[2]+Z);}
	@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
	default void Mov(double X,double Y,double Z)
	{Set_LOc(Get_COrd(0)+X,Get_COrd(1)+Y,Get_COrd(2)+Z);}
		@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=true)
		default void Mov(double[] LOc)
		{Mov(LOc[0],LOc[1],LOc[2]);}
		@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
		default void Mov(LOc_Havr LOc)
		{Mov(LOc.Get_COrd(0),LOc.Get_COrd(1),LOc.Get_COrd(2));}
	@Finishd(Is_Finishd=true)
	static void Mov(List<? extends LOc_Havr> LOcg,double X,double Y,double Z)
	{
		for(int IndX =0;
				IndX <LOcg.size();
				IndX+=1)
		{
			LOc_Havr LOc=LOcg.get(IndX);
			LOc.Mov(X,Y,Z);
		}
	}
		@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=true)
		static void Mov(List<? extends LOc_Havr> LOcg,double[] LOc)
		{Mov(LOcg,LOc[0],LOc[1],LOc[2]);}
		@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
		static void Mov(List<? extends LOc_Havr> LOcg,LOc_Havr LOc)
		{Mov(LOcg,LOc.Get_COrd(0),LOc.Get_COrd(1),LOc.Get_COrd(2));}
	@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
	default void Unmov(double X,double Y,double Z)
	{Mov(-X,-Y,-Z);}
		@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
		default void Unmov(double[] LOc)
		{Unmov(LOc[0],LOc[1],LOc[2]);}
		@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
		default void Unmov(LOc_Havr LOc)
		{Unmov(LOc.Get_COrd(0),LOc.Get_COrd(1),LOc.Get_COrd(2));}
	@Finishd(Is_Finishd=true)
	static void Unmov(List<? extends LOc_Havr> LOcg,double X,double Y,double Z)
	{Mov(LOcg,-X,-Y,-Z);}
		@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=true)
		static void Unmov(List<? extends LOc_Havr> LOcg,double[] LOc)
		{Unmov(LOcg,LOc[0],LOc[1],LOc[2]);}
		@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
		static void Unmov(List<? extends LOc_Havr> LOcg,LOc_Havr LOc)
		{Unmov(LOcg,LOc.Get_COrd(0),LOc.Get_COrd(1),LOc.Get_COrd(2));}
	@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=false)
	default void Mov_SlId(double X,double Y,double Z,
			  double SlId)
	{Mov(X*SlId,Y*SlId,Z*SlId);}
		@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=false)
		default void Mov_SlId(double[] Vectr,
				  double SlId)
		{
			Mov_SlId(Vectr[0],Vectr[1],Vectr[2],
				SlId);
		}
		@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=false)
		default void Mov_SlId(LOc_Havr Vectr,
				  double SlId)
		{
			Mov_SlId(Vectr.Get_COrd(0),Vectr.Get_COrd(1),Vectr.Get_COrd(2),
				SlId);
		}
	@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=false)
	default void Mov(double X,boolean X_Pos,boolean X_Neg,
					 double Y,boolean Y_Pos,boolean Y_Neg,
					 double Z,boolean Z_Pos,boolean Z_Neg)
	{
		Mov(CalculAt_Unit(X,X_Pos,X_Neg),
			CalculAt_Unit(Y,Y_Pos,Y_Neg),
			CalculAt_Unit(Z,Z_Pos,Z_Neg));
	}
		@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=false)
		default void Mov(double[] LOc,boolean X_Pos,boolean X_Neg,
									  boolean Y_Pos,boolean Y_Neg,
									  boolean Z_Pos,boolean Z_Neg)
		{
			Mov(LOc[0],X_Pos,X_Neg,
				LOc[1],Y_Pos,Y_Neg,
				LOc[2],Z_Pos,Z_Neg);
		}
		@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=false)
		default void Mov(LOc LOc,boolean X_Pos,boolean X_Neg,
								 boolean Y_Pos,boolean Y_Neg,
								 boolean Z_Pos,boolean Z_Neg)
		{
			Mov(LOc.Get_COrd(0),X_Pos,X_Neg,
				LOc.Get_COrd(1),Y_Pos,Y_Neg,
				LOc.Get_COrd(2),Z_Pos,Z_Neg);
		}

		/*Working term for transcoord multiplier is "speed".*/
		@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=false)
		default void Mov(double SpEd,boolean X_Pos,boolean X_Neg,
									 boolean Y_Pos,boolean Y_Neg,
									 boolean Z_Pos,boolean Z_Neg)
		{
			Mov(SpEd,X_Pos,X_Neg,
				SpEd,Y_Pos,Y_Neg,
				SpEd,Z_Pos,Z_Neg);
		}
		@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=false)
		default void Mov(double SpEd,double X,boolean X_Pos,boolean X_Neg,
									 double Y,boolean Y_Pos,boolean Y_Neg,
									 double Z,boolean Z_Pos,boolean Z_Neg)
		{
			Mov(SpEd*X,X_Pos,X_Neg,
				SpEd*Y,Y_Pos,Y_Neg,
				SpEd*Z,Z_Pos,Z_Neg);
		}
	//<editor-fold desc="RL_Axis">
	/*DOF:
	 *	double, double[], LOc.
	 *	none, multiply, sign.*/
	@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
	default void Mov(double AX,double AY,double AZ,
					 double BX,double BY,double BZ,
					 double CX,double CY,double CZ)
	{
		Mov(AX+BX+CX,
			AY+BY+CY,
			AZ+BZ+CZ);
	}
		@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
		default void Mov(double[] A,double[] B,double[] C)
		{
			Mov(A[0],A[1],A[2],
				B[0],B[1],B[2],
				C[0],C[1],C[2]);
		}
		@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
		default void Mov(LOc	  A,LOc		 B,LOc		C)
		{
			Mov(A.Get_COrd(0),A.Get_COrd(1),A.Get_COrd(2),
				B.Get_COrd(0),B.Get_COrd(1),B.Get_COrd(2),
				C.Get_COrd(0),C.Get_COrd(1),C.Get_COrd(2));
		}

		//<editor-fold desc="Mul">
		@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
		default void Mov(double AX,double AY,double AZ,double A_Mul,
						 double BX,double BY,double BZ,double B_Mul,
						 double CX,double CY,double CZ,double C_Mul)
		{
			Mov(AX*A_Mul,AY*A_Mul,AZ*A_Mul,
				BX*B_Mul,BY*B_Mul,BZ*B_Mul,
				CX*C_Mul,CY*C_Mul,CZ*C_Mul);
		}
			@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
			default void Mov(double[] A,double A_Mul,
							 double[] B,double B_Mul,
							 double[] C,double C_Mul)
			{
				Mov(A[0],A[1],A[2],A_Mul,
					B[0],B[1],B[2],B_Mul,
					C[0],C[1],C[2],C_Mul);
			}
			@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
			default void Mov(LOc A,double A_Mul,
							 LOc B,double B_Mul,
							 LOc C,double C_Mul)
			{
				Mov(A.Get_COrd(0),A.Get_COrd(1),A.Get_COrd(2),A_Mul,
					B.Get_COrd(0),B.Get_COrd(1),B.Get_COrd(2),B_Mul,
					C.Get_COrd(0),C.Get_COrd(1),C.Get_COrd(2),C_Mul);
			}
		//</editor-fold>
		//<editor-fold desc="SIn">
		@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
		default void Mov(double AX,double AY,double AZ,boolean A_Pos,boolean A_Neg,
						 double BX,double BY,double BZ,boolean B_Pos,boolean B_Neg,
						 double CX,double CY,double CZ,boolean C_Pos,boolean C_Neg)
		{
			Mov(AX,AY,AZ,CalculAt_Unit(A_Pos,A_Neg),
				BX,BY,BZ,CalculAt_Unit(B_Pos,B_Neg),
				CX,CY,CZ,CalculAt_Unit(C_Pos,C_Neg));
		}
			@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
			default void Mov(double[] A,boolean A_Pos,boolean A_Neg,
							 double[] B,boolean B_Pos,boolean B_Neg,
							 double[] C,boolean C_Pos,boolean C_Neg)
			{
				Mov(A,CalculAt_Unit(A_Pos,A_Neg),
					B,CalculAt_Unit(B_Pos,B_Neg),
					C,CalculAt_Unit(C_Pos,C_Neg));
			}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default void Mov(LOc A,boolean A_Pos,boolean A_Neg,
							 LOc B,boolean B_Pos,boolean B_Neg,
							 LOc C,boolean C_Pos,boolean C_Neg)
			{
				Mov(A,CalculAt_Unit(A_Pos,A_Neg),
					B,CalculAt_Unit(B_Pos,B_Neg),
					C,CalculAt_Unit(C_Pos,C_Neg));
			}
		//</editor-fold>
		/**The vr that caused me so many problems.
		 * Seems effect is useful for something.*/
		@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
		default void Mov_(double AX,double AY,double AZ,
						  double BX,double BY,double BZ,
						  double CX,double CY,double CZ)
		{
			Mov(AX,BX,CX,
				AY,BY,CY,
				AZ,BZ,CZ);
		}
			@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
			default void Mov_(double[] A,
							  double[] B,
							  double[] C)
			{
				Mov_(A[0],A[1],A[2],
					 B[0],B[1],B[2],
					 C[0],C[1],C[2]);
			}

			@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
			default void Mov_(double AX,double AY,double AZ,double A_Mul,
							  double BX,double BY,double BZ,double B_Mul,
							  double CX,double CY,double CZ,double C_Mul)
			{
				Mov_(AX*A_Mul,AY*A_Mul,AZ*A_Mul,
					 BX*B_Mul,BY*B_Mul,BZ*B_Mul,
					 CX*C_Mul,CY*C_Mul,CZ*C_Mul);
			}
				@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
				default void Mov_(double[] A,double A_Mul,
								  double[] B,double B_Mul,
								  double[] C,double C_Mul)
				{
					Mov_(A[0],A[1],A[2],A_Mul,
						 B[0],B[1],B[2],B_Mul,
						 C[0],C[1],C[2],C_Mul);
				}
				@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
				default void Mov_(double AX,double AY,double AZ,boolean A_Pos,boolean A_Neg,
								  double BX,double BY,double BZ,boolean B_Pos,boolean B_Neg,
								  double CX,double CY,double CZ,boolean C_Pos,boolean C_Neg)
				{
					Mov_(AX,AY,AZ,CalculAt_Unit(A_Pos,A_Neg),
						 BX,BY,BZ,CalculAt_Unit(A_Pos,A_Neg),
						 CX,CY,CZ,CalculAt_Unit(A_Pos,A_Neg));
				}
					@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
					default void Mov_(double[] A,boolean A_Pos,boolean A_Neg,
									  double[] B,boolean B_Pos,boolean B_Neg,
									  double[] C,boolean C_Pos,boolean C_Neg)
					{
						Mov_(A,CalculAt_Unit(A_Pos,A_Neg),
							 B,CalculAt_Unit(B_Pos,B_Neg),
							 C,CalculAt_Unit(C_Pos,C_Neg));
					}
	//</editor-fold>
	@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
	default void ScAl(double ScAl)
	{Set_LOc(Get_COrd(0)*ScAl,Get_COrd(1)*ScAl,Get_COrd(2)*ScAl);}
		@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
		default void NegAt()
		{ScAl(-1);}
	@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
	default LOc NormlIz()
	{
		double X=Get_COrd(0),
			   Y=Get_COrd(1),
			   Z=Get_COrd(2),
			LNg=sqrt(X*X+Y*Y+Z*Z);

		return new LOc(X/LNg,Y/LNg,Z/LNg);
	}
	@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
	default void Snap_$Origin()
	{Set_LOc(0,0,0);}
	@Lin_DclAr @Neds_Ovrid(NEds=AlwAs_Wrks) @Finishd(Is_Finishd=true)
	default void SeprAt(LOc_Havr A,List<? extends LOc_Havr> B,double X,double Y,double Z)
	{
		A.Mov(	X,Y,Z);
		Unmov(B,X,Y,Z);
	}

	// <editor-fold desc="RL">
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void RL(LOc_Havr B,LOc_Havr Rsult)
	{
		B	 .Get_LOc_CoP(Rsult);
		Rsult.Unmov(this);
	}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default LOc RL(LOc_Havr B)
		{
			LOc Rsult=new LOc();

			RL(B,Rsult);

			return Rsult;
		}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void RL_Invrs(LOc_Havr B,LOc_Havr Rsult)
	{
		RL(B,Rsult);
			 Rsult.NegAt();
	}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default LOc RL_Invrs(LOc_Havr B)
		{
			LOc	   Rsult=RL(B);
				   Rsult.NegAt();

			return Rsult;
		}
	//</editor-fold desc="RL">
	//<editor-fold desc="Avrg">
	static  void Get_Avrg_LOc(double[] Rsult,
							  double AX,double AY,double AZ,
							  double BX,double BY,double BZ)
	{
		ABC(Rsult,
			Avrg(AX,BX),Avrg(AY,BY),Avrg(AZ,BZ));
	}
		static double[] Get_Avrg_LOc(
			double AX,double AY,double AZ,
			double BX,double BY,double BZ)
		{
			double[] Rsult=new double[3];

			Get_Avrg_LOc(Rsult,
						 AX,AY,AZ,
						 BX,BY,BZ);

			return Rsult;
		}

		static void Get_Avrg_LOc(double[] Rsult,
								 double[] A,
								 double[] B)
		{
			Get_Avrg_LOc(Rsult,
						 A[0],A[1],A[2],
						 B[0],B[1],B[2]);
		}
			static double[] Get_Avrg_LOc(double[] A,
										 double[] B)
			{
				double[] Rsult=new double[3];

				Get_Avrg_LOc(Rsult,A,B);

				return Rsult;
			}

		static void Get_Avrg_LOc(double[] Rsult,
								 LOc_Havr A,
								 LOc_Havr B)
		{
			Get_Avrg_LOc(Rsult,A.Get_COrd(0),A.Get_COrd(1),A.Get_COrd(2),
							   B.Get_COrd(0),B.Get_COrd(1),B.Get_COrd(2));
		}
			static double[] Get_Avrg_LOc(LOc_Havr A,
										 LOc_Havr B)
			{
				double[] Rsult=new double[3];

				Get_Avrg_LOc(Rsult,A,B);

				return Rsult;
			}
	//</editor-fold>
}