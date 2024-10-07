public class MaDate {
	private int jour;
	private int mois;
	private int année;
	public MaDate(int jour, int mois, int  année){
		this.jour=jour;
		this.mois=mois;
		this.année=année;
	}
	public MaDate(int annee){
		jour=1;
		mois=1;
		this.année=annee;
	}
	public void setJour(int j){
		jour=j;
	}
	public int getJour(){
		return jour;
	}
	public void setMois(int m){
		mois=m;
	}
	public int getMois(){
		return mois;
	}
	public void setAnnee(int m){
		année=m;
	}
	public int getAnnee(){
		return année;
	}
	public String toString(){
		return jour+"/"+mois+"/"+année;
	}
	public void ajouterJour(){
		jour++;
		int jb=nbjour();
		if(jour>jb){
			jour=1;
		}
		this.ajouterUnmois();	
	}
	public int nbjour(){
		switch(mois){
			case 4:case 6:case 9:case 11:
				return 30;
			case 2:
				if(this.bissextile())
					{return 29;}
				else
					{return 28;}
			default:
				return 31;
		}	
	}
	public boolean bissextile(){
		if(année%4==0 && année%100!=0 || année%400==0){
			return true;
		}
		else{
			return false;
		}
	}



	public void ajouterPluseursjour(int n){
		for (int i=0;i<n;i++){
			ajouterJour();
		}
	}


	public void ajouterUnmois(){
		mois++;
		if(mois>12){
			mois=1;
		}
		ajouterUnannee();	
	}
	public void ajouterUnannee(){
		année++;
	}
	
	
	

}
