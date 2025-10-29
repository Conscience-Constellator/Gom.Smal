package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Alias;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Encycloped.TIm.UpdAtbl;
import CC.Encycloped.TIm.UpdAt_Lisnbl;
import CC.RL.Cyclcl_PArntng_X;
import java.util.*;

import static CC.List.List_X.Get_Th_Item;
import static CC.Math.Arithmetc.Ad;
import static CC.Encycloped.Abs.Scal.Gom.LOc.Gar_ArA;
import static CC.Encycloped.Abs.Scal.Gom.LOc.Gar_LOc;
import static CC.Encycloped.Abs.Org.Syc.TXt.TXt.QOt;
import static CC.Encycloped.Abs.Org.Syc.TXt.Num.List$String;
import static CC.Encycloped.Abs.Org.Syc.TXt.Ling.Inherit;
import static java.lang.Double.parseDouble;

public interface RL_LOc_Havr<SpAc_Typ extends SpAc>
	   extends		LOc_Havr,SpAc_Getbl<	  SpAc_Typ>,
		   UpdAt_Lisnbl
{
	// <editor-fold desc="Parnt">
	@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
	default SpAc_Typ Get_SpAc()
	{
		RL_LOc_Havr<SpAc_Typ> Parnt=Get_Gom_PArnt();

		return (Parnt!=null)?
				Parnt.Get_SpAc():
					   null;
	}

	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
	default void ThrO_If_This(RL_LOc_Havr<SpAc_Typ> PArnt)
	{
		while(!(PArnt instanceof SpAc))
		{
			if(PArnt==this)
			{	throw new Cyclcl_PArntng_X("Ancestor=this");   }
			PArnt=PArnt.Get_Gom_PArnt();
		}
	}
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=false)
	RL_LOc_Havr<SpAc_Typ> Get_Gom_PArnt();
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=false)
	void                  Set_Gom_PArnt(RL_LOc_Havr<SpAc_Typ> PArnt);
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=false)
	default void UnpArnt_No_Nul(RL_LOc_Havr<SpAc_Typ> PArnt)
	{
		PArnt.Rmov_UpdAt_Lisnr(this);
		Set_Gom_PArnt(null);
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
	default void Unparnt()
	{
		if(Get_Gom_PArnt() instanceof RL_LOc_Havr PArnt)
		{	UnpArnt_No_Nul(                       PArnt);   }
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
	default void Parnt(RL_LOc_Havr<SpAc_Typ> PArnt)
	{
		ThrO_If_This(PArnt);

		RL_LOc_Havr<SpAc_Typ> Old=Get_Gom_PArnt();
		if(Old!=null)
		{
			double[] LOc=Get_LOc_CoP_As_ArA();
			UnpArnt_No_Nul(Old);
			Set_Gom_PArnt(PArnt);
			Set_LOc(LOc);
		}
		else
		{
			Set_Gom_PArnt(PArnt);
		}
		PArnt.Ad_UpdAt_Lisnr(this);
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
	default void Gom_PArnt_Untrand(RL_LOc_Havr<SpAc_Typ> Parnt)
	{
		ThrO_If_This(Parnt);

		RL_LOc_Havr<SpAc_Typ> Old=Get_Gom_PArnt();
		if(Old!=null)
		{
			UnpArnt_No_Nul(Old);
			Set_Gom_PArnt(Parnt);
		}
		else
		{
			Set_Gom_PArnt(Parnt);
		}
		Parnt.Ad_UpdAt_Lisnr(this);
	}
		@Finishd(Is_Finishd=false)
		static <SpAc_Typ extends SpAc,
				Child_Typ extends RL_LOc_Havr<SpAc_Typ>>void Parnt(RL_LOc_Havr<SpAc_Typ> Parnt,
																   Child_Typ... Childrn)
		{
			for(int IndX=0;
					IndX<Childrn.length;
					IndX+=1)
			{
				RL_LOc_Havr<SpAc_Typ> Child=Childrn[IndX];
									  Child.Parnt(Parnt);
			}
		}
			@Alias @Finishd(Is_Finishd=false)
			static <SpAc_Typ extends SpAc,
					Child_Typ extends RL_LOc_Havr<SpAc_Typ>>void Parnt_Ech(RL_LOc_Havr<SpAc_Typ> Parnt,
																		   Child_Typ... Childrn)
			{Parnt(Parnt,Childrn);}
		@Finishd(Is_Finishd=false)
		static <SpAc_Typ extends SpAc>void Parnt(RL_LOc_Havr<SpAc_Typ> Parnt,
												 List<? extends RL_LOc_Havr<SpAc_Typ>> Childrn)
		{
			for(int IndX=0;
					IndX<Childrn.size();
					IndX+=1)
			{
				RL_LOc_Havr<SpAc_Typ> Child=Childrn.get(IndX);
									  Child.Parnt(Parnt);
			}
		}
			@Alias @Finishd(Is_Finishd=false)
			static <SpAc_Typ extends SpAc>void Parnt_Ech(RL_LOc_Havr<SpAc_Typ> Parnt,
														 List<? extends RL_LOc_Havr<SpAc_Typ>> Childrn)
			{Parnt(Parnt,Childrn);}
	@Alias @Finishd(Is_Finishd=true)
	default RL_LOc_Havr<SpAc_Typ> Is_Gom_Sibling(RL_LOc_Havr<SpAc_Typ> PotNtl_Sibling)
	{
		return (		   Get_Gom_PArnt() instanceof RL_LOc_Havr Mutual_Parnt&&
			PotNtl_Sibling.Get_Gom_PArnt() ==					  Mutual_Parnt)?Mutual_Parnt:
																			null;
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
	default RL_LOc_Havr<SpAc_Typ> Get_Min_Gom_Parnt()
	{return Get_Gom_PArnt();}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok/*1 known use case is for spaces; to terminate recursion.*/) @Finishd(Is_Finishd=true)
	default void Get_Gom_Lin(List<RL_LOc_Havr<SpAc_Typ>> List)
	{
		List.add(this);
		Get_Gom_PArnt().Get_Gom_Lin(List);
	}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default List<RL_LOc_Havr<SpAc_Typ>> Get_Gom_Lin()
		{
			List<RL_LOc_Havr<SpAc_Typ>> List=new ArrayList<>();
			Get_Gom_Lin(List);

			return List;
		}

		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default RL_LOc_Havr<SpAc_Typ> Get_Frst_In(List<RL_LOc_Havr<SpAc_Typ>> Lin)
		{
			return (Lin.contains(this))?this:
				Get_Gom_PArnt().Get_Frst_In(Lin);
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default RL_LOc_Havr<SpAc_Typ> Get_LCA(RL_LOc_Havr<SpAc_Typ> B)
		{	return Get_Frst_In(B.Get_Gom_Lin());   }

		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default boolean Is_In_Gom_Lin_RL_W(RL_LOc_Havr<?> PotNtl_RL)
		{
			return        Get_Gom_PArnt()               ==PotNtl_RL|
				PotNtl_RL.Get_Gom_PArnt()               ==this     ;
		}
	// <editor-fold desc="Sort">
	@Finishd(Is_Finishd=false)
	static <Child_Typ extends RL_LOc_Havr>void Sort_By_Parnt(List<Child_Typ> List)
	{
		Map<Child_Typ,List<Child_Typ>> children=new HashMap<>();
		Set<Child_Typ> all=new HashSet<>(List);
		List<Child_Typ> sorted=new ArrayList<>();
		Set<Child_Typ> visited=new HashSet<>();

		// build child map
		for(Child_Typ node:List)
		{
			Child_Typ p =(Child_Typ)node.Get_Gom_PArnt();
			if (p != null && all.contains(p)) {
				children.computeIfAbsent(p,(k)->
										   {return new ArrayList<>();}).add(node);
			}
		}

		// visit each root (no parent in list)
		for(Child_Typ node:List)
		{
			RL_LOc_Havr<?> p = node.Get_Gom_PArnt();
			if (p == null || !all.contains(p)) {
				Visit(node, children, visited, sorted);
			}
		}

		List.clear();
		List.addAll(sorted);
	}
	static <Child_Typ extends RL_LOc_Havr>void Visit(Child_Typ node,
								Map<Child_Typ,List<Child_Typ>> children,
												Set<Child_Typ> visited,
											  List<Child_Typ>  out)
	{
		if (!visited.add(node)) return;
		out.add(node);
		List<Child_Typ> Childrng=children.get(node);
		if (Childrng != null)
		{
			for(Child_Typ Child:Childrng)
			{Visit(Child,children,visited,out);}
		}
	}
	@Finishd(Is_Finishd=false)
	static void Sort_By_Lin(List<RL_LOc_Havr<?>> List)
	{
		List<RL_LOc_Havr<?>> OUT=new ArrayList<>();
		Set <RL_LOc_Havr<?>> VIS=new HashSet<>();
		Set <RL_LOc_Havr<?>> ALL=new HashSet<>(List);

		for(RL_LOc_Havr N:List)
		{Visit(N,VIS,OUT,ALL);}

		List.clear();
		List.addAll(OUT);
	}
	private static void Visit(RL_LOc_Havr<?>	N,
						  Set<RL_LOc_Havr<?>> VIS,
						 List<RL_LOc_Havr<?>> OUT,
						  Set<RL_LOc_Havr<?>> ALL)
	{
		if(N==null||VIS.contains(N)){return;}

		RL_LOc_Havr<?> P=N.Get_Gom_PArnt();
		if (P != null && ALL.contains(P))
		{Visit(P, VIS, OUT, ALL);}

		VIS.add(N);
		OUT.add(N);
	}
	//</editor-fold desc="Sort">
	//</editor-fold desc="Parnt">

	//<editor-fold desc="LOc">
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void Get_LOc_CoP_As_ArA(double[] Rsult)
	{
		Get_Gom_PArnt().MAk_RL_LOc(Get_RL_LOc(),
							   Rsult);
	}

		//<editor-fold desc="G">
		@Finishd(Is_Finishd=false)
		static <SpAc_Typ extends SpAc,
				Typ extends RL_LOc_Havr<SpAc_Typ>>void Get_LOc_ArAg(double[][] LOcg,
																		 Typ[] Havrg)
		{
			for(int IndX=0;
					IndX<Havrg.length;
					IndX+=1)
			{
				Havrg[IndX].Get_LOc_CoP_As_ArA(
				LOcg [IndX]);
			}
		}
		@Finishd(Is_Finishd=false)
		static <SpAc_Typ extends SpAc>void Get_LOc_ArAg(double[][] LOcg,
														List<? extends RL_LOc_Havr<SpAc_Typ>> Havrg)
		{
			for(int IndX=0;
					IndX<Havrg.size();
					IndX+=1)
			{
				Havrg.get(IndX).Get_LOc_CoP_As_ArA(
					 LOcg[IndX]);
			}
		}
			@Finishd(Is_Finishd=false)
			static <SpAc_Typ extends SpAc,
				Typ extends RL_LOc_Havr<SpAc_Typ>>
			double[][] Get_LOc_ArAg(
				Typ... Havrg)
			{
				double[][] LOcg=new double[Havrg.length][3];

				Get_LOc_ArAg(LOcg,Havrg);

				return LOcg;
			}
			@Finishd(Is_Finishd=false)
			static <SpAc_Typ extends SpAc>double[][] Get_LOc_ArAg(
				List<? extends RL_LOc_Havr<SpAc_Typ>> Havrg)
			{
				double[][] LOcg=new double[Havrg.size()][3];

				Get_LOc_ArAg(LOcg,Havrg);

				return LOcg;
			}
		//</editor-fold>
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
	default LOc  Get_Unparntd_CoP()
	{return new LOc(Get_LOc_CoP_As_ArA());}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
	default void Set_LOc(double X,double Y,double Z)
	{
		RL_LOc_Havr<SpAc_Typ> Parnt=Get_Gom_PArnt();
		Set_RL_LOc(X-Parnt.Get_COrd(0),
				   Y-Parnt.Get_COrd(1),
				   Z-Parnt.Get_COrd(2));
	}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void UpdAt_LOc(double X,double Y,double Z)
		{
			Set_LOc(X,Y,Z);
			UpdAt();
		}

		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Set_LOc(double[] LOc)
		{Set_LOc(LOc[0],LOc[1],LOc[2]);}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default void UpdAt_LOc(double[] LOc)
			{
				Set_LOc(LOc);
				UpdAt();
			}
				@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
				default void UpdAt_LOc(RL_LOc_Havr<SpAc_Typ> LOc)
				{
					Set_LOc(LOc);
					UpdAt();
				}

			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
			default void Set_LOc(Object LOc)
			{
				Set_LOc(Gar_ArA(LOc));
			}
				@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
				default void UpdAt_LOc(Object LOc)
				{
					Set_LOc(LOc);
					UpdAt();
				}

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	LOc Get_RL_LOc();

		//<editor-fold desc="MAk_RL">
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void MAk_RL_LOc(double X,double Y,double Z,
								double[] Rsult)
		{
			Get_LOc_CoP_As_ArA(Rsult);
			Ad(Rsult,X,Y,Z,Rsult);
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default double[] MAk_RL_LOc(double X,double Y,double Z)
			{
				double[] LOc=new double[3];

				MAk_RL_LOc(X,Y,Z,LOc);

				return LOc;
			}

			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default void MAk_RL_LOc(double[] RL,
									double[] Rsult)
			{
				MAk_RL_LOc(RL[0],RL[1],RL[2],
						   Rsult);
			}
				@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
				default double[] MAk_RL_LOc(double[] RL)
				{return MAk_RL_LOc(RL[0],RL[1],RL[2]);}

			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default void MAk_RL_LOc(LOc_Havr RL,
									double[] Rsult)
			{
				MAk_RL_LOc(RL.Get_COrd(0),RL.Get_COrd(1),RL.Get_COrd(2),
						   Rsult);
			}
				@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
				default double[] MAk_RL_LOc(LOc RL)
				{	return MAk_RL_LOc(RL.Get_COrd(0),RL.Get_COrd(1),RL.Get_COrd(2));   }
	//</editor-fold>
	//<editor-fold desc="Set">
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Set_RL_LOc(LOc LOc);
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void   Set_RL_LOc(Object LOc)
		{Set_RL_LOc(Gar_LOc(LOc));}

		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void UpdAt_RL_LOc(LOc LOc)
		{
			Set_RL_LOc(LOc);
			UpdAt();
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default void UpdAt_RL_LOc(Object LOc)
			{UpdAt_RL_LOc(Gar_LOc(LOc));}

	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void Set_RL_LOc(double X,double Y,double Z)
	{Get_RL_LOc().Set_LOc(X,Y,Z);}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void UpdAt_RL_LOc(double X,double Y,double Z)
		{
			Set_RL_LOc(X,Y,Z);
			UpdAt();
		}

	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void Snap_$Parnt()
	{
		Get_RL_LOc().Snap_$Origin();
		UpdAt();
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void AlIn_W_GParnt()
	{
		Get_RL_LOc().Set_LOc(Get_Gom_PArnt().
		Get_RL_LOc());
		UpdAt();
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void   Evn_W_GParnt()
	{
		Set_RL_LOc(Get_Gom_PArnt().
		Get_RL_LOc());
		UpdAt();
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void Unevn_W_GParnt()
	{
		Set_RL_LOc(
		Get_RL_LOc().CoP());
		UpdAt();
	}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void  Mov(double X,double Y,double Z)
	{Get_RL_LOc().Mov(X,Y,Z);}
	//</editor-fold>

	@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default double Get_COrd(int Dim)
	{
		return
			Get_Gom_PArnt().Get_COrd(Dim)+
			Get_RL_LOc().Get_COrd(Dim);
	}
	@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void   Set_COrd(int Dim,double COrd)
	{
		Get_RL_LOc().Set_COrd(Dim,COrd-
		Get_Gom_PArnt().Get_COrd(Dim));
	}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void UpdAt_COrd(int Dim,double COrd)
		{
			Set_COrd(Dim,COrd);
			UpdAt();
		}

	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void Set(RL_LOc_Havr Parnt,double X,double Y,double Z)
	{
		Parnt(Parnt);
		Set_RL_LOc(X,Y,Z);
	}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Set(RL_LOc_Havr Parnt)
		{
			Set(Parnt.Get_Gom_PArnt(),
				Parnt.Get_COrd(0),
				Parnt.Get_COrd(1),
				Parnt.Get_COrd(2));
		}
	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default void CoP(RL_LOc_Havr Old,LOc LOc)
	{
		Parnt(Old);
		Set_RL_LOc(LOc);
	}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void CoP(RL_LOc_Havr Old)
		{
			CoP(Old.Get_Min_Gom_Parnt(),
				Old.Get_LOc_CoP().CoP());
		}

	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default String LOc$String(int Lim)
	{
		double[] LOc=Get_LOc_CoP_As_ArA();
		String A=List$String(Lim,LOc);
		Get_RL_LOc().$ArA(LOc);
		return A+'('+List$String(Lim,LOc)+')';
	}

	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default RL_LOc_Havr<SpAc_Typ> Get_Th_Gom_Child()
	{
		return (Get_Th_Item(Get_UpdAt_Lisnrg()) instanceof RL_LOc_Havr<?> Child)?(RL_LOc_Havr<SpAc_Typ>)Child:
																										 null;
	}

	class      RL_LOc_Havr_ConcrEt<SpAc_Typ extends SpAc>
	implements RL_LOc_Havr<SpAc_Typ>
	{
		@Finishd(Is_Finishd=true)
		private RL_LOc_Havr<SpAc_Typ> Parnt;
			@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public final RL_LOc_Havr<SpAc_Typ> Get_Gom_PArnt()
			{return Parnt;}
			@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			public void Set_Gom_PArnt(RL_LOc_Havr<SpAc_Typ> PArnt)
			{	this.Parnt=PArnt;   }
		@Finishd(Is_Finishd=true)
		private LOc RL_Loc=new LOc();
			@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public final LOc Get_RL_LOc()
			{return RL_Loc;}
			@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			public void Set_RL_LOc(LOc LOc)
			{RL_Loc=LOc;}
		//</editor-fold>

		@Finishd(Is_Finishd=true)
		private List<UpdAtbl> UpdAt_Lisnrg=new ArrayList<>();
			@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public final List<UpdAtbl> Get_UpdAt_Lisnrg()
			{return UpdAt_Lisnrg;}

		public RL_LOc_Havr_ConcrEt(RL_LOc_Havr<SpAc_Typ> Parnt,Object RL_LOc)
		{
			Parnt(Parnt);
			Set_RL_LOc(RL_LOc);
		}
			public RL_LOc_Havr_ConcrEt(RL_LOc_Havr<SpAc_Typ> Parnt,
									   double X,double Y,double Z)
			{this(Parnt,new LOc(X,Y,Z));}
			public RL_LOc_Havr_ConcrEt(RL_LOc_Havr<SpAc_Typ> Parnt)
			{CoP(Parnt);}
		public static LOc Get_LOc(String SOrc,RL_LOc_Havr<?> DOnr)
		{
			try
			{
				String[]	  COrdg=SOrc.split(",");
				String   LOc0=COrdg[0];

				return ( LOc0.equals(Inherit))?DOnr.Get_RL_LOc():
											   new LOc(parseDouble(LOc0	   ),
													   parseDouble(COrdg[1]),
													   parseDouble(COrdg[2]));
			}
			catch(NumberFormatException X)
			{
				throw new RuntimeException("Error parsing LOc: "+QOt(SOrc),X);
			}
		}
		public static <SpAc_Typ extends SpAc>RL_LOc_Havr<SpAc_Typ>[] MAk_RL_LOc_Havrg(RL_LOc_Havr<SpAc_Typ> Parnt,
																					  double[] X,
																					  double[] Y,
																					  double[] Z)
		{
			int LNg=X.length;
			RL_LOc_Havr<SpAc_Typ>[] Havrg=new RL_LOc_Havr[LNg];
			for(int IndX=0  ;
					IndX<LNg;
					IndX+=1 )
			{
				Havrg[IndX]=new RL_LOc_Havr_ConcrEt<SpAc_Typ>(Parnt,
															  X[IndX],Y[IndX],Z[IndX]);
			}

			return Havrg;
		}
	}
}