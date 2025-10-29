package CC.Encycloped.Abs.Scal.Gom.ShAp;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Encycloped.Abs.Scal.Gom.*;
import CC.Encycloped.Abs.Scal.Gom.Gom.*;
import CC.Encycloped.Abs.Scal.Gom.RL_LOc_Havr.RL_LOc_Havr_ConcrEt;
import CC.Encycloped.Abs.Scal.Gom.LOcg_Havr_Rapr.LOcg_Havr_Rapr_ConcrEt;
import CC.Encycloped.TIm.UpdAtbl;
import static CC.Encycloped.Abs.Scal.Gom.Gom.Hyp;
import static java.lang.Integer.toHexString;

public class D3_Polygon<SpAc_Typ extends SpAc,LOcg_Typ extends LOcg_Havr<SpAc_Typ>>
	extends LOcg_Havr_Rapr_ConcrEt<SpAc_Typ,LOcg_Typ> implements Flat,UpdAtbl
{
	@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	public int Get_Dim_Num()
	{return 3;}

	@Lin_DclAr @Finishd(Is_Finishd=false)
	public double Get_Distnc(double[] From)
	{return Hyp(From,Get_Avrg_LOc());}

	@Override @Finishd(Is_Finishd=false)
	public void Get_A_SId_Dr(Hyp_Vectr Dr)
	{
		double[] A=Get_LOc(0);
		double
			AX=A[0],AY=A[1],AZ=A[2];
		Get_LOc(1,A);
		double
			BX=A[0],BY=A[1],BZ=A[2];
		Get_LOc(2,A);
		double
			CX=A[0],CY=A[1],CZ=A[2];

		double[] Edg1={BX-AX,BY-AY,BZ-AZ};
		double[] Edg2={CX-AX,CY-AY,CZ-AZ};

		// Compute the cross product of the two edges to get the normal vector
		double
			NX=(Edg1[1]*Edg2[2])-(Edg1[2]*Edg2[1]),
			NY=(Edg1[2]*Edg2[0])-(Edg1[0]*Edg2[2]),
			NZ=(Edg1[0]*Edg2[1])-(Edg1[1]*Edg2[0]);

		Dr.CalculAt(NX,NY,NZ);
	}
//	public void FAc_Norml(Vectr Norml)
//	{
//		double
//			X=this.X[0],
//			Y=this.Y[0],
//			Z=this.Z[0],
//			X1=this.X[1]-X,
//			Y1=this.Y[1]-Y,
//			Z1=this.Z[1]-Z,
//			X2=this.X[2]-X,
//			Y2=this.Y[2]-Y,
//			Z2=this.Z[2]-Z,
//			LNg=Hyp(X1,Y1,Z1);
//		;
//	//	Norml.Set();
//	}
	private byte Latrl;
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public final byte Get_Latrl()
		{return Latrl;}
		@Override @Finishd(Is_Finishd=true)
		public void Set_Latrl(byte Latrl)
		{this.Latrl=Latrl;}
	private Hyp_Vectr FAc_Norml=new Hyp_Vectr();
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public final Hyp_Vectr Get_FAc_Norml()
		{return FAc_Norml;}
		@Override @Finishd(Is_Finishd=false)
		public void Set_FAc_Norml(Hyp_Vectr Norml)
		{FAc_Norml=Norml;}

	@Finishd(Is_Finishd=false)
	public void Set(byte Latrl,RL_LOc_Havr[] VrtXg)
	{
		this.Latrl=Latrl;
		Set_Rapd_LOcg((LOcg_Typ)new LOcg_By_LOc(VrtXg));
	}
		@Finishd(Is_Finishd=false)
		public static RL_LOc_Havr[] MAk_LOcg(RL_LOc_Havr Parnt,Object[] VrtX_SOrcg)
		{
			RL_LOc_Havr[] VrtXg=new RL_LOc_Havr[VrtX_SOrcg.length];
			for(int IndX=0;
				IndX<VrtX_SOrcg.length;
				IndX+=1)
			{VrtX_SOrcg[IndX]=new RL_LOc_Havr_ConcrEt(Parnt,VrtX_SOrcg[IndX]);}

			return VrtXg;
		}
		public void Set(byte Latrl,RL_LOc_Havr Parnt,Object[] VrtX_SOrcg)
		{Set(Latrl,MAk_LOcg(Parnt,VrtX_SOrcg));}

	@Override @Finishd(Is_Finishd=true)
	public void Get_Point_On_PlAn(double[] LOc)
	{Get_LOc(0,LOc);}

	//<editor-fold desc="UpdAt">
	@Override
	public void UpdAt()
	{}
	//</editor-fold>

	@Override
	public String toString()
	{return "Polygon@"+toHexString(hashCode());}

	@Finishd(Is_Finishd=true)
	public D3_Polygon(LOcg_Typ VrtXg,byte Latrl)
	{
		super((LOcg_Typ)new LOcg_By_LOc(VrtXg));
		Set_Latrl(Latrl);
	}
		@Finishd(Is_Finishd=true)
		public D3_Polygon(LOcg_Typ VrtXg)
		{this(VrtXg,Bilatrl);}
	@Finishd(Is_Finishd=false)
	public D3_Polygon(byte Latrl,RL_LOc_Havr... VrtXg)
	{Set(Latrl,VrtXg);}
	@Finishd(Is_Finishd=false)
	public D3_Polygon(byte Latrl,RL_LOc_Havr Parnt,Object... VrtXg)
	{Set(Latrl,Parnt,VrtXg);}
		@Finishd(Is_Finishd=false)
		public D3_Polygon(RL_LOc_Havr... VrtXg)
		{this(Bilatrl,VrtXg);}
		@Finishd(Is_Finishd=false)
		public D3_Polygon(RL_LOc_Havr Parnt,Object... VrtXg)
		{this(Bilatrl,Parnt,VrtXg);}
}