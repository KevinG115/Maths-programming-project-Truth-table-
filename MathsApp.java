/*
 *@author: kevin gleeson
 *
 *date: 25/10/2011
 *
 *Maths Application
 */

 import javabook.*;

 class MathsApp{
	 public static void main(String args[]){
		 //declare varaibles
		 int k;
		 int g;
		 int conj;
		 int dis;
		 int condi;
		 int n;
		 int result;

		 //variable result

		 k = 0;
		 g = 0;
		 conj = 0;
		 dis = 0;
		 condi = 0;
		 n = 0;
		 result = 0;

		 //decalre objects
		 MainWindow mWindow;
		 InputBox iBox;
		 OutputBox oBox;
		 Maths1 aMaths;
		 Maths2 bMaths;

		 //create objects
		 mWindow = new MainWindow();
		 iBox = new InputBox(mWindow);
		 oBox = new OutputBox(mWindow);
		 aMaths = new Maths1();
		 bMaths = new Maths2();

		 //show objects
		 mWindow.show();
	     oBox.show();

		 //start of programme the following is shown

		 oBox.println(" welcome to my truth table programme");
		 oBox.println(" the programme is  going to tell the user whether ");
		 oBox.println(" the statement is true or false");
		 oBox.println(" it will also show if the statements ");
		 oBox.println(" is in the set D in terms of the predicates");
		 oBox.println(" if the statement is true please enter 1 to represent this");
		 oBox.println(" if the statement is true please enter 0 to represent this");
		 oBox.println(" the programme will show all logical operations ");
		 oBox.println(" and the predicate");


		 //input 1

		 k = iBox.getInteger(" please enter if the first statement is true or false" );
		 g = iBox.getInteger(" please enter if the second statement is true or false" );

		 //set 1
		 aMaths.setK(k);
		 aMaths.setG(g);

		 //compute 1

		 aMaths.compute();

		 //first  statement
		 if(k ==1){
			 oBox.println(" your first statement is true");
		 }
		 else{
			 oBox.println(" your first statement is false");
		 }

		 //second statement
		 if(g ==1){
			 oBox.println(" your second statement is true");
		 }

		 else{
			 oBox.println(" your second statement is false");
		 }



		 //*****results*****

		 //conjuction

		 conj = aMaths.getConj();

		 if(conj ==1){
			 oBox.println(" the conjuction statement is true");
		 }

		 else if(conj ==0){
			 oBox.println(" the conjuction statement is false");
		 }

		 //disjunction

		 dis = aMaths.getDis();

		 if(dis ==1){
			 oBox.println(" the disjunction statement is true");
		 }

		 else if(dis ==0){
			 oBox.println(" the disjunction statement is false");
		 }

		 //conditional

		 condi = aMaths.getCondi();

		 if(condi ==1){
			 oBox.println(" the conditional statement is true");
		 }

		 else if(condi ==0){
			 oBox.println(" the conditional statement is false");
		 }




	 //input of predicate part

	 n = iBox.getInteger(" please enter a number see if it is in set D");


	 //set predicate part

	 bMaths.setN(n);

	 //compute predicate part

	 bMaths.compute();

	 //get prdicate part

	 result = bMaths.getResult();

	          //results

	             if(result ==1){
					 oBox.println(" the number "+n+" you have choosen is in the setD");
					 	 }
					 	 else{
							 oBox.println(" the number "+n+" you have choosen is not in the set D");
						 }
					 }
				 }




