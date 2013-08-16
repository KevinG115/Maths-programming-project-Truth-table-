/*
 *
 *@author: kevin gleeson
 *
 *date: 25/10/2011
 *
 *2nd instantiale class for part 2 of the maths app programme
 *
 */

 class Maths2{
	 //declare data members
	 private int n;
	 private int result;

	 //construtc
	 public void Maths2(){
		 n = 0;
		 result = 0;
	 }

	 //set methods

	 public void setN(int n){

		 this.n = n;
	 }

	 //compute

	 public void compute(){

		 if(n>10){
			 result = 0;
		 }

		 else if((n<10) && (n%2 == 0)){
			 result = 1;
		 }
	 }

	 //get method

	 public int getResult(){
		 return result;
	 }
 }