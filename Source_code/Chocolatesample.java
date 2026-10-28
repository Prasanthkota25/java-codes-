/**

* Chocolate billing system

*

* Here we will be calculating the raw cost of the chocolate,GST, Total cost of the chocolate including GST

* The raw cost of the chocolate is equal to the weight (gram) of the chocolate

* GST for the chocolate is fixed at 2%.

* Overall cost the chocolate has been calculated using raw price of the choco * quantity

* Raw cost is calculated by overallCostOfChoco * how many quantity we have brought

* The totalCost of the choco IncludingGST is calculated by Overall cost + GST
 
*/
 
 
public class Chocolatesample
{
 
     static final Double gstForDairyMilk = 2.0;

    public static void main(String[] args){

	String chocolate = "Dairy Milk";

	Integer grams = Integer.parseInt(args[0]);

	Integer quantity = 1;

	if(args.length>=2){

	   quantity=Integer.parseInt(args[1]);

	}

	Integer manufacturingCostPerUnit;

	Double rawCost;

	Integer overallCostOfTheChocolate;

	int[] gramsList = {10, 20, 30};

	int i;

for (i = 0; i < gramsList.length; i++) {

	 if (gramsList[i] == grams) {

	  break;

	  }

	}

	if(i == gramsList.length) {

	  System.out.println("Invalid grams");

	  return;

	}
 
	manufacturingCostPerUnit = gramsList[i];
 
	overallCostOfTheChocolate = manufacturingCostPerUnit * quantity ;

	Double gstIncluded = (overallCostOfTheChocolate * gstForDairyMilk )/100;

	rawCost = overallCostOfTheChocolate - gstIncluded;

	Double totalCostIncludingGST = overallCostOfTheChocolate + gstIncluded;
 
	

	System.out.println("           Invoice Bill         ");

        System.out.println("Chocolate Name       : " + chocolate);

        System.out.println("Weight               : " + grams + " grams");

        System.out.println("Quantity             : " + quantity);

		System.out.println("Raw Cost             : " + rawCost + " Rs");

        System.out.println("overallCostOfChoco   : " + overallCostOfTheChocolate + " Rs");

        System.out.println("GST (2%)             : " + gstIncluded + " Rs");

		System.out.println("TotalCostIncludingGST: " + totalCostIncludingGST + " Rs");

    }

}

 