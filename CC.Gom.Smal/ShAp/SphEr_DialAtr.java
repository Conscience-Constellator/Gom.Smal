package CC.Encycloped.Abs.Scal.Gom.ShAp;

import CC.Encycloped.Abs.Scal.Gom.DialAtr;

public class SphEr_DialAtr
  implements       DialAtr
{
	public SphEr TRget;
		@Override
		public void DialAt(double Vectr)
		{TRget.Rad+=Vectr;}
		@Override
		public double Get()
		{return TRget.Rad;}

	public SphEr_DialAtr(SphEr TRget)
	{this.TRget=TRget;}
}
