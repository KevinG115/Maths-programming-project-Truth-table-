/*
 *Maths1
 *
 *@author: kevin gleeson
 *
 *date:25/10/2011
 *
 *maths logic programme first instantiable class
 *
 */

 class Maths1{

	 //declare data members
	 private int k;
	 private int g;
	 private int conj;
	 private int dis;
	 private int condi;

	 //constructor
	 public Maths1(){
		 k = 0;
		 g = 0;
		 conj = 0;
		 dis = 0;
		 condi = 0;
	 }

	 //set methods
	 public void setK(int k){
		 this.k = k;
	 }

	 public void setG(int g){
		 this.g = g;
	 }


	 //compute methods
	 public void compute(){

		 //conjuction

		 if((k == 1) && ( g == 1)){
			 conj = 1;
		 }
		 else{
			 conj = 0;
		 }

		 //disjunction

		 if((k == 1) && (g == 1)){
			 dis = 1;
		 }

		 else if((k == 1) && (g == 0)){
			 dis = 1;
		 }

		 else if((k == 0) && (g == 1)){
			 dis = 1;
		 }

		 else{
			 dis = 0;
		 }

		 //conditional

		 if((k ==1) && (g ==1)){
			 condi = 1;
		 }


		 else if((k ==0) && (g ==1)){
			 condi = 1;
		 }

		 else if((k == 0) && (g == 0)){
			 condi = 1;
		 }
		 else{
			 condi = 0;

		 }
	 }

	 //get methods

	public int getConj(){
		return conj;
	}

	public int getDis(){
		return dis;
	}

	public int getCondi(){
		return condi;
	}
}








