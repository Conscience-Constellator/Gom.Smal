package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;

import java.util.ArrayList;
import java.util.List;

public class TLeport_ContXt
{
	public RL_LOc_Havr TRget;
	public List<double[]> MM;
		public int Histry_IndX;

	@Lin_DclAr @Finishd(Is_Finishd=false)
	public void TLeport_IndX(int IndX)
	{
//		TRget.();
	}
		@Lin_DclAr @Finishd(Is_Finishd=false)
		public void TLeport_Bak()
		{TLeport_IndX(Histry_IndX-1);}
		@Lin_DclAr @Finishd(Is_Finishd=false)
		public void TLeport_For()
		{TLeport_IndX(Histry_IndX+1);}

	public TLeport_ContXt(RL_LOc_Havr TRget,List<double[]> MM)
	{
		this.TRget=TRget;
		this.MM=MM;
	}
		public TLeport_ContXt(RL_LOc_Havr TRget)
		{this(TRget,new ArrayList<>());}
}