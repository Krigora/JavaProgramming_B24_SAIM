package day45_constructors;

public class App {

    /*

	create a class called App

		- instance variables
			name (String)
			version (double)
			isFree (boolean)

		- instance method

			update():
				print:
						name of application is updating....
						name of application is updating....
						name of application is updating....

	create a class called UsingApp

		- create an App object, define value to the variables
		- Print all the information of your app
		- execute update method
     */

    String name;
    double version;
    boolean isFree;

    public void update(){
        System.out.println(name + " of application is updating....");
        System.out.println(name + " of application is updating....");
        System.out.println(name + " of application is updating....");
    }



}
