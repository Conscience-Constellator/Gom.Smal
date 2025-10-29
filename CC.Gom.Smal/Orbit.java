package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import static CC.Math.Arithmetc.Ad;
import static CC.List.BAs_ArA.ABC;
import static java.lang.Math.*;
import static java.lang.Math.hypot;

public interface Orbit
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Orbit(double   X,double	Y,double   Z,
			   double Yaw,double Pich,double Rol,
			   double[] Rsult);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default double[] Orbit(double   X,double	Y,double   Z,
							   double Yaw,double Pich,double Rol)
		{
			double[] Rsult=new double[3];

			Orbit(X,Y,Z,Yaw,Pich,Rol,Rsult);

			return Rsult;
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Orbit(LOc_Havr LOc,
						   double Yaw,double Pich,double Rol)
		{
			double[] L=LOc.Get_LOc_CoP_As_ArA();
			Orbit(L[0],L[1],L[2],Yaw,Pich,Rol,L);
			LOc.Set_LOc(L);
		}

		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Orbit(double   X,double	Y,double   Z,
						   double Yaw,double Pich,double Rol,double SpEd,
						   double[] Rsult)
		{Orbit(X,Y,Z,Yaw*SpEd,Pich*SpEd,Rol*SpEd,Rsult);}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default double[] Orbit(double   X,double	Y,double   Z,
								   double Yaw,double Pich,double Rol,double SpEd)
			{return Orbit(X,Y,Z,Yaw*SpEd,Pich*SpEd,Rol*SpEd);}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default void Orbit(LOc_Havr LOc,
							   double Yaw,double Pich,double Rol,double SpEd)
			{Orbit(LOc,Yaw*SpEd,Pich*SpEd,Rol*SpEd);}

		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Orbit(double Origin_X,double Origin_Y,double Origin_Z,
						   double		 X,double		 Y,double		 Z,
						   double	   Yaw,double	  Pich,double	   Rol,
						   double[] Rsult)
		{
			Orbit(X-Origin_X,Y-Origin_Y,Z-Origin_Z,Yaw,Pich,Rol,Rsult);
			Ad(Rsult,Origin_X,Origin_Y,Origin_Z);
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default double[] Orbit(double Origin_X,double Origin_Y,double Origin_Z,
								   double		 X,double		 Y,double		 Z,
								   double	   Yaw,double	  Pich,double	   Rol)
			{return Orbit(X-Origin_X,Y-Origin_Y,Z-Origin_Z,Yaw,Pich,Rol);}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default void Orbit(double Origin_X,double Origin_Y,double Origin_Z,
							   LOc_Havr LOc,
							   double	   Yaw,double	  Pich,double	   Rol)
			{
				double[] L=LOc.Get_LOc_CoP_As_ArA();
				Orbit(L[0]-Origin_X,L[1]-Origin_Y,L[2]-Origin_Z,Yaw,Pich,Rol,L);
				LOc.Set_LOc(L);
			}

			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default void Orbit(double Origin_X,double Origin_Y,double Origin_Z,
							   double		 X,double		 Y,double		 Z,
							   double	   Yaw,double	  Pich,double	   Rol,double SpEd,
							   double[] Rsult)
			{Orbit(X-Origin_X,Y-Origin_Y,Z-Origin_Z,Yaw,Pich,Rol,SpEd,Rsult);}
				@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
				default double[] Orbit(double Origin_X,double Origin_Y,double Origin_Z,
									   double		 X,double		 Y,double		 Z,
									   double	   Yaw,double	  Pich,double	   Rol,double SpEd)
				{return Orbit(X-Origin_X,Y-Origin_Y,Z-Origin_Z,Yaw,Pich,Rol,SpEd);}
				@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
				default void Orbit(double Origin_X,double Origin_Y,double Origin_Z,
								   LOc_Havr LOc,
								   double	   Yaw,double	  Pich,double	   Rol,double SpEd)
				{Orbit(Origin_X,Origin_Y,Origin_Z,LOc,Yaw*SpEd,Pich*SpEd,Rol*SpEd);}

	/**Yaw   = rotation about world Y
	 * Pich = rotation about world X
	 * Rol  = rotation about world Z*/
	Orbit Orbit_Angl=(X,Y,Z,
					  Yaw,Pich,Rol,
					  Rsult)->
	{
		//precompute sines/cosines
		double cy=cos(Yaw  ),sy=sin(Yaw);
		double cp=cos(Pich),sp=sin(Pich);
		double cr=cos(Rol ),sr=sin(Rol);

		//1) Yaw around Y (mix X↔Z)
		double x1= X*cy+Z*sy;
		double z1=-X*sy+Z*cy;
		double y1= Y;

		//2) Pich around X (mix Y↔Z)
		double y2=y1*cp-z1*sp;
		double z2=y1*sp+z1*cp;
		double x2=x1;

		//3) Rol around Z (mix X↔Y)
		double x3=x2*cr-y2*sr;
		double y3=x2*sr+y2*cr;
		double z3=z2;

		ABC(Rsult,x3,y3,z3);
	},
	/**Rotate (X,Y,Z) about world-axes by distances along the orbit.
	 * ds_yaw   = arc-length along a circle in the XZ-plane (axis=Y)
	 * ds_pitch = arc-length along a circle in the YZ-plane (axis=X)
	 * ds_roll  = arc-length along a circle in the XY-plane (axis=Z)*/
	Orbit_Crcumfrnc=(X,Y,Z,
		ds_yaw,ds_pitch,ds_roll,
		Rsult)->
	{
		// 1) yaw about Y
		double r_yaw =hypot(X, Z);               // radius in XZ plane
		double a_yaw =(r_yaw != 0 ? ds_yaw/r_yaw : 0);
		double cy    =cos(a_yaw),sy=sin(a_yaw);

		double x1 =  X*cy + Z*sy;
		double z1 = -X*sy + Z*cy;
		double y1 =  Y;

		// 2) pitch about X
		double r_pit=hypot(y1, z1);             // radius in YZ plane
		double a_pit=(r_pit != 0 ? ds_pitch/r_pit:0);
		double cp   =cos(a_pit),sp=sin(a_pit);

		double y2 =  y1*cp - z1*sp;
		double z2 =  y1*sp + z1*cp;
		double x2 =  x1;

		// 3) roll about Z
		double r_roll=hypot(x2, y2);             // radius in XY plane
		double a_roll=(r_roll != 0 ? ds_roll/r_roll : 0);
		double cr    =cos(a_roll),sr=sin(a_roll);

		double x3 =  x2*cr - y2*sr;
		double y3 =  x2*sr + y2*cr;
		double z3 =  z2;

		ABC(Rsult,x3,y3,z3);
	};
}