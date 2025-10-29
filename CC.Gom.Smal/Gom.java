package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q$Q.Dubl1$1;
import CC.Math.Arithmetc;
import CC.Math.CoP;
import java.util.concurrent.ThreadLocalRandom;

import static CC.List.BAs_ArA.*;
import static CC.Math.CoP.SqAr;
import static CC.Math.SIn.UnsIn;
import static java.lang.Math.*;

public class Gom
{
	//<editor-fold desc="Rad">
	public static double Box(double A,double B,double C)
	{
		return max(max(
			A,
			B),
			C);
	}
		public static double Box(double[] Vectr)
		{return Box(
			Vectr[0],
			Vectr[1],
			Vectr[2]);
		}
	public static double Tax(double A,double B,double C)
	{
		return
			UnsIn(A)+
			UnsIn(B)+
			UnsIn(C);
	}
		public static double Tax(double[] Vectr)
		{return Tax(
			Vectr[0],
			Vectr[1],
			Vectr[2]);
		}
	public static double Hyp(int A,int B)
	{
		return sqrt(
			(A*A)+
			(B*B));
	}
	public static double Hyp(double A,double B)
	{
		return sqrt(
			(A*A)+
			(B*B));
	}
	public static double Hyp(double A,double B,double C)
	{
		return sqrt(
			(A*A)+
			(B*B)+
			(C*C));
	}
		public static double Hyp(double[] Vectr)
		{return Hyp(
			Vectr[0],
			Vectr[1],
			Vectr[2]);
		}
	public static double Hyp(double[] A,double[] B,double[] RL)
	{
		Arithmetc.Sub(A,B,RL);

		return Hyp(RL);
	}
		public static double Hyp(
			double AX,double AY,double AZ,
			double BX,double BY,double BZ)
		{
			return Hyp(
				BX-AX,
				BY-AY,
				BZ-AZ);
		}
		public static double Hyp(double[] A,double[] B)
		{
			return Hyp(A[0],A[1],A[2],
					   B[0],B[1],B[2]);
		}
		public static double Hyp(LOc A,LOc B)
		{
			return Hyp(A.Get_COrd(0),A.Get_COrd(1),A.Get_COrd(2),
					   B.Get_COrd(0),B.Get_COrd(1),B.Get_COrd(2));
		}
		public static double Hyp(LOc_Havr A,LOc_Havr B)
		{
			return Hyp(A.Get_LOc_CoP_As_ArA(),
					   B.Get_LOc_CoP_As_ArA());
		}
	//</editor-fold>

	public static void RotAt(
		double X,
		double Y,
		double Vectr,
		double[] LOc)
	{
		AB(LOc,-X*cos(Vectr)+Y*sin(Vectr),
			   -X*sin(Vectr)-Y*cos(Vectr));
	}
		public static double[] RotAt(
			double X,
			double Y,
			double Vectr)
		{
			double[] LOc=new double[3];
			RotAt(X,Y,Vectr,LOc);

			return LOc;
		}
	public static void rotate(
		double[] LOc,
		double yaw,double pitch,double roll,
		double[] Rsult)
	{
		RotAt_Z(LOc,roll,Rsult);
		RotAt_Y(LOc,yaw,Rsult);
		RotAt_X(LOc,pitch,Rsult);
	}
	public static void rotate_Rev(
		double[] LOc,
		double yaw,double pitch,double roll,
		double[] Rsult)
	{
		RotAt_X(LOc,pitch,Rsult);
		RotAt_Y(LOc,yaw,Rsult);
		RotAt_Z(LOc,roll,Rsult);
	}
	public static void RotAt_X(
		double[] LOc,
		double angle,
		double[] Rsult)
	{
		Rsult[0]=LOc[0];
		Rsult[1]=LOc[1]*cos(angle)-LOc[2]*sin(angle);
		Rsult[2]=LOc[1]*sin(angle)+LOc[2]*cos(angle);
	}
	public static void RotAt_Y(
		double[] point,
		double angle,
		double[] Rsult)
	{
		Rsult[0]=point[0]*cos(angle)+point[2]*sin(angle);
		Rsult[1]=point[1];
		Rsult[2]=-point[0]*sin(angle)+point[2]*cos(angle);
	}
	public static void RotAt_Z(
		double[] point,
		double angle,
		double[] Rsult)
	{
		Rsult[0]=point[0]*cos(angle)-point[1]*sin(angle);
		Rsult[1]=point[0]*sin(angle)+point[1]*cos(angle);
		Rsult[2]=point[2];
	}

	public static void CalculAt_Dr(
		double[] Vectr,
		double[] Dr)
	{
		double
			A=Vectr[0],
			B=Vectr[1],
			C=Vectr[2],
			Tax=
				UnsIn(A)+
				UnsIn(B)+
				UnsIn(C);
		if(Tax!=0)
		{
			ABC(Dr,A/Tax,
				   B/Tax,
				   C/Tax);
		}
		else
		{
			A3(Dr,0);
		}
	}
	public static void CalculAt_Dr_BtwEn(double[] Dr,
										 double[] From,
										 double[] To)
	{
		Arithmetc.Sub(Dr,From,To);
		CalculAt_Dr(Dr,Dr);
	}
		public static double[] CalculAt_Dr_BtwEn(double[] From,
												 double[] To)
		{
			double[] Dr=new double[3];
			CalculAt_Dr_BtwEn(Dr,From,To);

			return Dr;
		}
	public static double CalculAt_Metrcg_BtwEn(double[] A,
											   double[] B,
											   double[] Dr)
	{
		Arithmetc.Sub(Dr,A,B);
		double Hyp=Hyp(Dr);
		CalculAt_Dr(Dr,Dr);
		return Hyp;
	}

	public static double ScAl_AwA(double ValU)
	{
		return (ValU!=0)?1/ValU:
						 1;
	}
	public static double ScAl_AwA(double ValU,double[] A,
											  double[] B,
											  double[] Dr)
	{
		double BtwEn=CalculAt_Metrcg_BtwEn(A,B,Dr);

		return ValU*ScAl_AwA(BtwEn);
	}
	public static double Invrs_SqAr(double ValU)
	{
		return (ValU!=0)?1/SqAr(ValU):
						 1;
	}
		public static double Invrs_SqAr(double ValU,double Distnc)
		{	return ValU*Invrs_SqAr(Distnc);	  }
			public static double Invrs_SqAr(double ValU,double[] A,
														double[] B,
														double[] Dr)
			{	return Invrs_SqAr(ValU,CalculAt_Metrcg_BtwEn(A,B,Dr));	 }
	public static final Dubl1$1 Invrs_SqAr=Gom::Invrs_SqAr,
								  ScAl_AwA=Gom::ScAl_AwA;

	public static double CalculAt_SimilariT(double AX,double AY,double AZ,
											double BX,double BY,double BZ)
	{
		double Hyp=Hyp(BX,BY,BZ);
		if(Hyp!=0)
		{
			double Angl=acos(Dot_Product(AX,AY,AZ,
										 BX,BY,BZ)/
							 Hyp);

			return sqrt(Angl/PI);
		}
		else
		{return 1;}
	}
		public static double CalculAt_SimilariT(double[] A,
												double[] B)
		{
			return CalculAt_SimilariT(A[0],A[1],A[2],
									  B[0],B[1],B[2]);
		}
		public static double CalculAt_SimilariT(Hyp_Vectr A,
												double[] B)
		{
			return CalculAt_SimilariT(A.X,A.Y,A.Z,
									  B[0],B[1],B[2]);
		}
		public static double CalculAt_SimilariT(Hyp_Vectr A,
												Hyp_Vectr B)
		{
			return CalculAt_SimilariT(A.X,A.Y,A.Z,
									  B.X,B.Y,B.Z);
		}
	public static double CalculAt_Opositn(double AX,double AY,double AZ,
										  double BX,double BY,double BZ)
	{
		return 1-CalculAt_SimilariT(AX,AY,AZ,
									BX,BY,BZ);
	}
		public static double CalculAt_Opositn(double[] A,
											  double[] B)
		{return 1-CalculAt_SimilariT(A,B);}
		public static double CalculAt_Opositn(Hyp_Vectr A,
											  double[] B)
		{return 1-CalculAt_SimilariT(A,B);}
		public static double CalculAt_Opositn(Hyp_Vectr A,
											  Hyp_Vectr B)
		{return 1-CalculAt_SimilariT(A,B);}
	public static double CalculAt_Opositn_Flor(double[] A,
											   double[] B)
	{
		return max((
			CalculAt_Opositn(A,B)
			*2)-1,0);
	}

	public static double Dot_Product(double AA,double AB,double AC,
									 double BA,double BB,double BC)
	{
		return (AA*BA)+
			   (AB*BB)+
			   (AC*BC);
	}
		public static double Dot_Product(double AA,double AB,double AC,
										 double[] B)
		{return Dot_Product(AA,AB,AC,B[0],B[1],B[2]);}
	public static double Dot_Product(double[] A,
									 double[] B)
	{
		if(A.length!=
		   B.length)
		{throw new IllegalArgumentException("Vectors must be of the same length");}
		double Product=0;
		for(int IndX=0;
			IndX<A.length;
			IndX+=1)
		{
			Product+=A[IndX]*
					 B[IndX];
		}

		return Product;
	}

	public static double SpEd_On_Axis(double[] Vectr,double[] Dr)
	{
		return Vectr[0]*Dr[0]+
			   Vectr[1]*Dr[1]+
			   Vectr[2]*Dr[2];
	}

	public static void Invrt_Vectr_On_Axis(double[] Norml,
										   double[] RflectE,
										   double[] Rsult)
	{
		double Hyp=Hyp(Norml);
		if(Hyp!=0)
		{
			double[] Unit_Norml={Norml[0]/Hyp,
								 Norml[1]/Hyp,
								 Norml[2]/Hyp};

			double Dot_Product=Dot_Product(RflectE,Unit_Norml);

			ABC(Rsult,RflectE[0]-2*Dot_Product*Unit_Norml[0],
					  RflectE[1]-2*Dot_Product*Unit_Norml[1],
					  RflectE[2]-2*Dot_Product*Unit_Norml[2]);
		}
		else
		{
			A3(Rsult,0);
		}
	}
		public static double[] Invrt_Vectr_On_Axis(double[] Norml,
												   double[] RflectE)
		{
			double[] Rsult=new double[3];
			Invrt_Vectr_On_Axis(Norml,RflectE,Rsult);

			return Rsult;
		}
		public static void Invrt_Vectr_On_Axis_SAm(double[] Norml,
												   double[] RflectE)
		{Invrt_Vectr_On_Axis(Norml,RflectE,RflectE);}
	public static void Gar_No_Against_Dr(double[] Norml,
										 double[] RflectE,
										 double[] Rsult)
	{
		if(SpEd_On_Axis(RflectE,Norml)<0)
		{Invrt_Vectr_On_Axis(Norml,RflectE,Rsult);}
	}
		public static double[] Gar_No_Against_Dr(double[] Norml,
												 double[] RflectE)
		{
			double[] Rsult=new double[3];
			Gar_No_Against_Dr(Norml,RflectE,Rsult);

			return Rsult;
		}
		public static void Gar_No_Against_Dr_SAm(double[] Norml,
												 double[] RflectE)
		{Gar_No_Against_Dr(Norml,RflectE,RflectE);}
	public static void Gar_No_W_Dr(double[] Norml,
								   double[] RflectE,
								   double[] Rsult)
	{
		if(SpEd_On_Axis(RflectE,Norml)>0)
		{Invrt_Vectr_On_Axis(Norml,RflectE,Rsult);}
	}
		public static double[] Gar_No_W_Dr(double[] Norml,
										   double[] RflectE)
		{
			double[] Rsult=new double[3];

			Gar_No_W_Dr(Norml,RflectE,Rsult);

			return Rsult;
		}
		public static void Gar_No_W_Dr_SAm(double[] Norml,
										   double[] RflectE)
		{Gar_No_W_Dr(Norml,RflectE,RflectE);}
	public static void Rflect_Vectr_Along_Norml(double[] Norml,
												double[] RflectE,
												double[] Rsult)
	{
		double Hyp=Hyp(Norml);
		if(Hyp!=0)
		{
			double[] Unit_Norml={Norml[0]/Hyp,
								 Norml[1]/Hyp,
								 Norml[2]/Hyp};

			double Dot_Product=Dot_Product(RflectE,Unit_Norml);

			ABC(Rsult,RflectE[0]-2*Dot_Product*Unit_Norml[0],
					  RflectE[1]-2*Dot_Product*Unit_Norml[1],
					  RflectE[2]-2*Dot_Product*Unit_Norml[2]);
			double dotProduct=RflectE[0]*Unit_Norml[0]+
							  RflectE[1]*Unit_Norml[1]+
							  RflectE[2]*Unit_Norml[2];
			double[] projection={dotProduct*Unit_Norml[0],
								 dotProduct*Unit_Norml[1],
								 dotProduct*Unit_Norml[2]};
			double[] perpendicular={RflectE[0]-projection[0],
									RflectE[1]-projection[1],
									RflectE[2]-projection[2]};
			Rsult[0]=projection[0]-perpendicular[0];
			Rsult[1]=projection[1]-perpendicular[1];
			Rsult[2]=projection[2]-perpendicular[2];
		}
		else
		{
			A3(Rsult,0);
		}
	}
		public static double[] Rflect_Vectr_Along_Norml(double[] Norml,
														double[] RflectE)
		{
			double[] Rsult=new double[3];

			Rflect_Vectr_Along_Norml(Norml,RflectE,Rsult);

			return Rsult;
		}
		public static void Rflect_Vectr_Along_Norml_SAm(double[] Norml,
														double[] RflectE)
		{Rflect_Vectr_Along_Norml(Norml,RflectE,RflectE);}

	public static double[] ScAl_To_Cap(double[] Vectr,double cap)
	{
		double Hyp=Hyp(Vectr);
		if(Hyp>cap)
		{
			// Apply a scaling factor that increases with how excessive the magnitude is
			double scaleFactor=cap/(Hyp+(Hyp-cap));
			Vectr[0]*=scaleFactor;
			Vectr[1]*=scaleFactor;
			Vectr[2]*=scaleFactor;
		}

		return Vectr;
	}

	public static double[] projectOntoNormal(double[] P, double[] N, double[] origin)
	{
		double length = Math.sqrt(N[0] * N[0] + N[1] * N[1]);
		double[] unitNormal = {N[0] / length, N[1] / length};

		// Translate P to the origin
		double[] translatedP={
			P[0]-origin[0],
			P[1]-origin[1]};

		double dotProduct=Dot_Product(translatedP,unitNormal);
		double[] projection={
			dotProduct*unitNormal[0],
			dotProduct*unitNormal[1]};

		// Translate projection back to the original location
		return new double[]{
			projection[0]+origin[0],
			projection[1]+origin[1]};
	}
	public static double Cord_On_Norml(double[] P,double[] Dr,double[] origin)
	{
		CalculAt_Dr(Dr,Dr);

		// Vector from origin to point P
		double[] Vectr_To_Point={
			P[0]-origin[0],
			P[1]-origin[1],
			P[2]-origin[2]};

		return
			Vectr_To_Point[0]*Dr[0]+
			Vectr_To_Point[1]*Dr[1]+
			Vectr_To_Point[2]*Dr[2];
	}
	public static double Hit_From_PlAn(
		double[] Dr,
		double[] LOc)
	{
		return Dot_Product(LOc,Dr);
	}
		public static double Hit_From_PlAn(
			double[] Tran,
			double[] Dr,
			double[] LOc)
		{return Hit_From_PlAn(Dr,Arithmetc.Sub(LOc,Tran));}

	//<editor-fold desc="Grid$SpAc">
	public static void Grid$SpAc(double[] ArA,int X,int Y,double SIz)
	{AB(ArA,X*SIz,Y*SIz);}
		public static double[] Grid$SpAc(int X,int Y,double SIz)
		{return AB(X*SIz,Y*SIz);}
	public static void Grid$SpAc(double[] ArA,int X,int Y,int Z,double SIz)
	{ABC(ArA,X*SIz,Y*SIz,Z*SIz);}
		public static double[] Grid$SpAc(int X,int Y,int Z,double SIz)
		{return ABC(X*SIz,Y*SIz,Z*SIz);}
	public static void Grid$SpAc(double[] ArA,int X,int Y,int Z,double SIz,double[] LOc)
	{
		ABC(ArA,LOc[0]+(X*SIz),
				LOc[1]+(Y*SIz),
				LOc[2]+(Z*SIz));
	}
		public static double[] Grid$SpAc(int X,int Y,int Z,double SIz,double[] LOc)
		{
			double[] SpAc=new double[3];

			Grid$SpAc(SpAc,X,Y,Z,SIz,LOc);

			return SpAc;
		}
	//</editor-fold>

	public static double Shufl_Cord(ThreadLocalRandom Shuflr,double Rad)
	{return Shuflr.nextDouble(-Rad,Rad);}
	public interface LOc_Shuflr
	{
		@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=false)
		void Shufl(ThreadLocalRandom Shuflr,double[] LOc,double Rad);
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
			default double[] Shufl(ThreadLocalRandom Shuflr,double Rad)
			{
				double[] LOc=new double[3];

				Shufl(Shuflr,LOc,Rad);

				return LOc;
			}

		LOc_Shuflr Tax_Shuflr=(Shuflr,LOc,Rad)->{},
				   Box_Shuflr=(Shuflr,LOc,Rad)->
				   {
					   ABC(LOc,Shufl_Cord(Shuflr,Rad),
							   Shufl_Cord(Shuflr,Rad),
							   Shufl_Cord(Shuflr,Rad));
				   },
				   Hyp_Shuflr=(Shuflr,LOc,Rad)->
				   {
					   Box_Shuflr.Shufl(Shuflr,LOc,Rad);
					   new Hyp_Vectr(LOc).$ArA(LOc);
					   Arithmetc.SqAr(LOc,Shuflr.nextDouble(Rad));
				   };
	}
}