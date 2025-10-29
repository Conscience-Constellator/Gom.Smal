package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

public interface Projectr
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Project(double X,double Y,double Z,
				 double[] LOc);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Project(double[] LOc,
							 double[] Projectd)
		{
			Project(LOc[0],LOc[1],LOc[2],
					Projectd);
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default double[] Project(double X,double Y,double Z)
		{
			double[] Projectd=new double[3];

			Project(X,Y,Z,
					Projectd);

			return Projectd;
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default double[] Project(double[] LOc)
		{
			double[] Projectd=new double[3];

			Project(LOc,
					Projectd);

			return Projectd;
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Project(double X,double Y,double Z,
							 LOcg_Havr Projectn,
							 double[] Projectd,
							 int IndX)
		{
			Project(X,Y,Z,
					Projectd);
			Projectn.Set_LOc(IndX,Projectd);
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default void Project(double[] LOc,
								 LOcg_Havr Projectn,
								 double[]  Projectd,
								 int IndX)
			{
				Project(LOc[0],LOc[1],LOc[2],
						Projectn,
						Projectd,
						IndX);
			}

	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default double[] Get_VrtX_StOr()
	{return new double[3];}

	interface Projectr_Rapr
	  extends Projectr
	{
		@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
		Projectr Get_Rapd_Projectr();
			@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
			default void Project(double X,double Y,double Z,
								 double[] LOc)
			{
				Get_Rapd_Projectr().Project(X,Y,Z,
											LOc);
			}
	}
}