package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

@Finishd(Is_Finishd=true)
public interface LOcg_Inst<TMplat_Typ extends LOcg_TMplat,SpAc_Typ extends SpAc,LOcg_Typ extends LOcg_Havr<SpAc_Typ>>
		 extends LOcg_Havr_Rapr<SpAc_Typ,LOcg_Typ>
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	TMplat_Typ Get_TMplat();
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void	   Set_TMplat(TMplat_Typ TMplat);

	class   LOcg_Inst_ConcrEt<TMplat_Typ extends LOcg_TMplat,SpAc_Typ extends SpAc,LOcg_Typ extends LOcg_Havr<SpAc_Typ>>
	extends LOcg_Havr_Rapr_ConcrEt<SpAc_Typ,LOcg_Typ> implements LOcg_Inst<TMplat_Typ,SpAc_Typ,LOcg_Typ>
	{
		@Finishd(Is_Finishd=true)
		private TMplat_Typ TMplat;
			@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public final TMplat_Typ Get_TMplat()
			{return TMplat;}
			@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			public			   void Set_TMplat(TMplat_Typ TMplat)
			{this.TMplat=TMplat;}

		public LOcg_Inst_ConcrEt(TMplat_Typ TMplat,LOcg_Typ LOcg)
		{
			super(LOcg);
			Set_TMplat(TMplat);
		}
	}
}