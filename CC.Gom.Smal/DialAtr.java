package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Lin_DclAr;

import static java.lang.System.out;

public interface DialAtr
{
	@Lin_DclAr
	void DialAt(double Vectr);
	@Lin_DclAr
	double Get();

	class DialAtr_Rapr<Rapd_DialAtr_Typ extends DialAtr>
	implements DialAtr
	{
		public Rapd_DialAtr_Typ Rapd_DialAtr;
			@Override
			public void DialAt(double Vectr)
			{Rapd_DialAtr.DialAt(Vectr);}
			@Override
			public double Get()
			{return Rapd_DialAtr.Get();}

		public DialAtr_Rapr(Rapd_DialAtr_Typ Rapd)
		{Rapd_DialAtr=Rapd;}
	}
	class Print_DialAtr<Rapd_DialAtr_Typ extends DialAtr>
	extends DialAtr_Rapr<Rapd_DialAtr_Typ>
	{
		@Override
		public void DialAt(double Vectr)
		{
			out.print(Get());
			super.DialAt(Vectr);
//			out.print("+");
//			out.print(Vectr);
			out.print("->");
			out.println(Get());
		}

		public Print_DialAtr(Rapd_DialAtr_Typ Rapd)
		{super(Rapd);}
	}
}
