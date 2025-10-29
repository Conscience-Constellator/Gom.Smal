package CC.Encycloped.Abs.Scal.Gom.ShAp;

import CC.Encycloped.Abs.Scal.Gom.DialAtr;
import CC.Encycloped.Abs.Scal.Gom.RL_LOc_Havr;

public
	 class Box_DialAtr
	implements DialAtr
{
	public RL_LOc_Havr[] TRget;
		@Override
		public void DialAt(double Vectr)
		{
			TRget[0].Mov(-Vectr,-Vectr,-Vectr);
			TRget[1].Mov(Vectr,-Vectr,-Vectr);
			TRget[2].Mov(-Vectr,Vectr,-Vectr);
			TRget[3].Mov(Vectr,Vectr,-Vectr);
			TRget[4].Mov(-Vectr,-Vectr,Vectr);
			TRget[5].Mov(Vectr,-Vectr,Vectr);
			TRget[6].Mov(-Vectr,Vectr,Vectr);
			TRget[7].Mov(Vectr,Vectr,Vectr);
		}
		@Override
		public double Get()
		{return TRget[1].Get_RL_LOc().Get_COrd(0);}

	public Box_DialAtr(RL_LOc_Havr[] TRget)
	{this.TRget=TRget;}
}
