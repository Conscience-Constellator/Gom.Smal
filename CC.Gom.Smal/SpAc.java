package CC.Encycloped.Abs.Scal.Gom;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q$.Point$;
import CC.Bool.Trn.Flagd_On_Trnbl.Flagd_On_Trnbl_Imp;
import CC.Encycloped.TIm.UpdAt_ContXt_;
import CC.Encycloped.TIm.UpdAtbl;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import static CC.List.List_X.Togl_Is_In;
import static CC.List.BAs_ArA.A3;

public class SpAc<SpAc_Typ extends SpAc> extends Flagd_On_Trnbl_Imp
	implements RL_LOc_Havr<SpAc_Typ>,
		UpdAt_ContXt_
{
	//<editor-fold desc="SpAc">
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public SpAc_Typ Get_SpAc()
	{return (SpAc_Typ)this;}

	@Override @Finishd(Is_Finishd=true)
	public RL_LOc_Havr Get_Gom_PArnt()
	{	return this;   }
	@Override @Finishd(Is_Finishd=false)
	public void Set_Gom_PArnt(RL_LOc_Havr PArnt)
	{}
	@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	public SpAc Get_Min_Gom_Parnt()
	{return this;}
	@Override @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=true)
	public void Get_Gom_Lin(List<RL_LOc_Havr<SpAc_Typ>> List)
	{	List.add(this);   }
		@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
		public LOc Get_RL_LOc()
		{return new LOc();}
			@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=false)
			public void Get_LOc_CoP_As_ArA(double[] Rsult)
			{A3(Rsult,0);}
			@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=false)
			public void Get_LOc_CoP(LOc_Havr Rsult)
			{Rsult.Set_LOc(0,0,0);}
		@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=false)
		public void Set_RL_LOc(LOc LOc)
		{}
			@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=false)
			public void UpdAt_RL_LOc(double X,double Y,double Z)
			{}
		@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=false)
		public void Set_LOc(double X,double Y,double Z)
		{}
			@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=false)
			public void UpdAt_LOc(double X,double Y,double Z)
			{}
		@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=false)
		public void Mov(double X,double Y,double Z)
		{}
		@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=false)
		public double Get_COrd(int Dim)
		{return 0;}
		@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=false)
		public void Set_COrd(int Dim,double COrd)
		{}
	//</editor-fold>

	//<editor-fold desc="Object">
	public List<SpAc_Ocupier<SpAc_Typ>> Objectg=new ArrayList<>();
		@Lin_DclAr @Finishd(Is_Finishd=false)
		public void Ad_Object(SpAc_Ocupier Object)
		{Objectg.add(Object);}
		@Lin_DclAr @Finishd(Is_Finishd=false)
		public void Rmov_Object(SpAc_Ocupier Object)
		{Objectg.remove(Object);}
	//</editor-fold>

	//<editor-fold desc="Sort">
	public Map<String,List<? extends SpAc_Getbl>> Sortd_Objectg=new HashMap<>();
	{
		Sortd_Objectg.put("Misc",new ArrayList<>());
	}
		@Finishd(Is_Finishd=false)
		public <Typ extends SpAc_Getbl>List<Typ> Set_Category(String NAm,List<Typ> List)
		{
//			out.println("Set_Category:"+NAm);
			if(List==null)
			{throw new RuntimeException("No List");}

			Sortd_Objectg.put(NAm,List);
			return List;
		}
			public <Typ extends SpAc_Getbl>List<Typ> Ad_Category(String NAm)
			{
				List<Typ> List=new ArrayList<>();

				Set_Category(NAm,List);
				return List;
			}
		@Finishd(Is_Finishd=false)
		public <Typ extends SpAc_Getbl>List<Typ> Get_Category(String NAm)
		{return (List<Typ>)Sortd_Objectg.get(NAm);}
		@Finishd(Is_Finishd=false)
		public <Typ extends SpAc_Getbl>List<Typ> Gar_Category(String NAm)
		{
			List<Typ> List=Get_Category(NAm);

			if(List==null)
			{List=Ad_Category(NAm);}
			return List;
		}
			@Finishd(Is_Finishd=false)
			public void   Ad_Sortd_Item(SpAc_Getbl Item,String Category)
			{Gar_Category(Category).add(Item);}
			@Finishd(Is_Finishd=false)
			public void Rmov_Sortd_Item(SpAc_Getbl Item,String Category)
			{Gar_Category(Category).remove(Item);}
		@Finishd(Is_Finishd=false)
		public void Togl_Sortd_Item(SpAc_Getbl Togld,String Category)
		{Togl_Is_In(Gar_Category(Category),Togld);}
			@Finishd(Is_Finishd=false)
			public Runnable Sortd_Item_Toglr(SpAc_Getbl Togld,String Category)
			{return ()->{Togl_Sortd_Item(Togld,Category);};}
	@Finishd(Is_Finishd=false)
	public void Ad_Sortd_Object(SpAc_Ocupier Object,String Category)
	{
		Ad_Object(Object);
		Ad_Sortd_Item(Object,Category);
	}
		@Finishd(Is_Finishd=false)
		public void Ad_Sortd_Object(SpAc_Ocupier Object)
		{Ad_Sortd_Object(Object,Object.Get_List_NAm());}
	@Finishd(Is_Finishd=true)
	public void Rmov_Sortd_Object(SpAc_Ocupier Object,String Category)
	{
		Rmov_Object(Object);
		Rmov_Sortd_Item(Object,Category);
	}
		@Finishd(Is_Finishd=true)
		public void Rmov_Sortd_Object(SpAc_Ocupier Object)
		{Rmov_Sortd_Object(Object,Object.Get_List_NAm());}
	@Finishd(Is_Finishd=false)
	public <Item_Typ>void Do_W_Sortd(String NAm,Point$<Item_Typ> Do)
	{Do.Point$_List(Gar_Category(NAm));}
		@Finishd(Is_Finishd=false)
		public <Item_Typ>void Ad_Sortd_Task(String NAm,Point$<Item_Typ> Do)
		{Ad_Tik_Task(()->{Do_W_Sortd(NAm,Do);});}
	//</editor-fold>

	@Finishd(Is_Finishd=true)
	public void Togl_Is_In_SpAc(SpAc_Adbl<SpAc_Typ> Togld)
	{
		if(Togld.Has_SpAc())
		{Togld.Rmov_From_SpAc();}
		else
		{Togld.Ad_To_SpAc((SpAc_Typ)this);}
	}
		@Finishd(Is_Finishd=true)
		public Runnable SpAc_Toglr(SpAc_Adbl Togld)
		{return ()->{Togl_Is_In_SpAc(Togld);};}

	public List<Runnable> Tik_Taskg=new ArrayList<>();
		@Override @Finishd(Is_Finishd=true)
		public List<Runnable> Get_Tik_Taskg()
		{return Tik_Taskg;}

	public ArrayList<UpdAtbl> Lisnrg=new ArrayList<>();
		@Override @Finishd(Is_Finishd=true)
		public ArrayList<UpdAtbl> Get_UpdAt_Lisnrg()
		{return Lisnrg;}

//	@Finishd(Is_Finishd=false)
//	public static void Do_W_Al_In(Inbl Bordr,List<RL_LOc_Havr> Objectg,Point$<RL_LOc_Havr> Do)
//	{
//		double[] LOc=new double[3];
//		for(int IndX=0;
//			IndX<Objectg.size();
//			IndX+=1)
//		{
//			RL_LOc_Havr Object=Objectg.get(IndX);
//			Object.Get_LOc_ArA(LOc);
//			if(Bordr.Is_In(LOc))
//			{Do.Point$(Object);}
//		}
//	}
//		@Finishd(Is_Finishd=false)
//		public void Do_W_Al_In(Inbl Bordr,Point$<RL_LOc_Havr> Do)
//		{Do_W_Al_In(Bordr,Get_Physc_LMNt_Cast("Tran"),Do);}

	@Lin_DclAr @Finishd(Is_Finishd=false)
	public void MpT()
	{SpAc_Adbl.Rmov_From_SpAc((SpAc_Typ)this,Objectg);}

	public double TIm=switch(2)
	{
		case 0->60;
		case 1->1024;
		case 2->1;
		default->throw new IllegalStateException("Unexpected value: "+1);
	};

	@Finishd(Is_Finishd=true)
	public SpAc(boolean Is_On)
	{Trn_Bool(Is_On,null);}
		@Finishd(Is_Finishd=true)
		public SpAc()
		{this(true);}
}