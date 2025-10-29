package CC.Encycloped.Abs.Scal.Gom.ShAp;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Encycloped.Abs.Scal.Gom.Hyp_Vectr;
import CC.Encycloped.Abs.Scal.Gom.LOc$Dr_Mag;
import static CC.Encycloped.Abs.Org.Comput.Bi.Wrd_GAt.Or;
import static CC.Encycloped.Abs.Scal.Gom.Gom.Hit_From_PlAn;

public interface Flat extends Out_Box_Getbl,LOc$Dr_Mag
{
	@Override @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=false)
	default int Get_Dim_Num()
	{return 3;}

	@Lin_DclAr
	void Get_A_SId_Dr(Hyp_Vectr Dr);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default Hyp_Vectr Get_A_SId_Dr()
		{
			Hyp_Vectr Dr=new Hyp_Vectr();
			Get_A_SId_Dr(Dr);

			return Dr;
		}
	@Lin_DclAr
	default void Get_B_SId_Dr(Hyp_Vectr Dr)
	{
		Get_A_SId_Dr(Dr);
		Dr.NegAt();
	}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default Hyp_Vectr Get_B_SId_Dr()
		{
			Hyp_Vectr Dr=new Hyp_Vectr();
			Get_B_SId_Dr(Dr);

			return Dr;
		}

	/*FAc_Norml*/
		@Lin_DclAr
		Hyp_Vectr Get_FAc_Norml();
		@Lin_DclAr
		void Set_FAc_Norml(Hyp_Vectr Norml);
	@Lin_DclAr
	default void CalculAt_FAc_Norml(Hyp_Vectr Norml)
	{
		if(Or.Byt$Bool(Get_Latrl(),(byte)1))
		{Get_A_SId_Dr(Norml);}
		else
		{Get_B_SId_Dr(Norml);}
	}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default Hyp_Vectr CalculAt_FAc_Norml()
		{
			Hyp_Vectr Norml=new Hyp_Vectr();
			CalculAt_FAc_Norml(Norml);

			return Norml;
		}
	@Lin_DclAr @Neds_Ovrid(NEds=No)
	default void CoP_FAc_Norml(Hyp_Vectr Norml)
	{Norml.Set(Get_FAc_Norml());}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default Hyp_Vectr CoP_FAc_Norml()
		{
			Hyp_Vectr Norml=new Hyp_Vectr();
			CoP_FAc_Norml(Norml);

			return Norml;
		}
		@Override
		default void LOc$Dr(double[] LOc,double[] Dr)
		{CoP_FAc_Norml().$ArA(Dr);}
	default void UpdAt_FAc_Norml()
	{CalculAt_FAc_Norml(Get_FAc_Norml());}

	@Lin_DclAr
	void Get_Point_On_PlAn(double[] LOc);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default double[] Get_Point_On_PlAn()
		{
			double[] LOc=new double[3];
			Get_Point_On_PlAn(LOc);

			return LOc;
		}

	@Override
	default double LOc$Dubl(double[] LOc)
	{return Hit_From_PlAn(
		Get_Point_On_PlAn(),
		CoP_FAc_Norml().$ArA(),
		LOc);
	}

	byte
		A_Latrl=0b01,
		B_Latrl=0b10,
		Bilatrl=(byte)(A_Latrl|B_Latrl);
	@Lin_DclAr
	byte Get_Latrl();
	@Lin_DclAr
	void Set_Latrl(byte Latrl);
}