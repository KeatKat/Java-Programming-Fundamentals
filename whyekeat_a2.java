//Name: Foo Whye Keat
//FT
//Tutorial: T02F
//Student no.: 7432628
//Declaration: This work is done by me and no one else

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

//Enum month class
enum Month {Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec}

//Date class
class Date
{
    //Declaring instance variables
    private int day;
    private Month month;
    private int year;

    //Default constructor
    Date()
    {
        day = 1;
        month = Month.Jan;
        year = 2021;
    }

    //Other constructor
    public Date(int day, Month month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Copy constructor
    public Date(Date d)
    {
        this(d.day,d.month,d.year);
    }

    //Accessor methods
    public int getDay() {
        return day;
    }

    public Month getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


    //mutator method
    public void setDate(int day,Month month,int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}


//-----------------------------------------------------------------------------------------------------
//Creating new class HealthProfile
class HealthProfile {
    //declaring instance variables
    private String firstName;
    private String lastName;
    private Date dob;
    private double height;
    private double weight;
    private int currentYear;

    //other constructor
    public HealthProfile(String firstName, String lastName, Date dob, double height, double weight, int currentYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.height = height;
        this.weight = weight;
        this.currentYear = currentYear;
    }

    //copy constructor
    public HealthProfile(HealthProfile hr) {
        this(hr.firstName, hr.lastName, hr.dob, hr.height, hr.weight, hr.currentYear);
    }

    //Accessor methods
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() { return lastName; }
    public Date getDob() { return dob; }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public int getCurrentYear() { return currentYear; }

    //Mutator methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }
    public void setBMIinfo(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    //Other methods
    private int getAge() {
        int age = currentYear - dob.getYear();
        return age;

    }

    private int getMaximumHeartRate() {
        int max = 220 - getAge();
        return max;
    }

    private double getMinimumTargetHeartRate() {
        double mintarget = (50.0 / 100.0) * getMaximumHeartRate();
        return mintarget;
    }

    private double getMaximumTargetHeartRate() {
        double maxtarget = (85.0 / 100.0) * getMaximumHeartRate();
        return maxtarget;

    }

    private double getBMI()
    {
        double bmi = weight/(height*height);
        return bmi;
    }



    public void displayInfo()
    {
        System.out.printf("Name: %s, %s%n",firstName,lastName);
        System.out.printf("Date of birth: %d%5s%5d%n", dob.getDay(),dob.getMonth(),dob.getYear() );
        System.out.printf("Your Weight: %.1f kg %n",weight);
        System.out.printf("Your height: %.1f meter%n", height);
        System.out.printf("Current year: %d%n",currentYear);
        System.out.printf("Your age: %d years old %n", getAge());
        System.out.printf("Clinic analysis, based on your age: %n");
        System.out.printf("\t\t1. Your maximum heart rate is %d%n", getMaximumHeartRate());
        System.out.printf("\t\t2. Your minimum target heart rate is %.2f%n", getMinimumTargetHeartRate());
        System.out.printf("\t\t3. Your maximum target heart rate is %.2f%n", getMaximumTargetHeartRate());
        System.out.printf("Your BMI is %.1f%n", getBMI());
        System.out.printf("\t\tWeight category %30s%n ", "Range");
        System.out.printf("\t\tUnderweight / Too low %29s%n", "Below 18.5");
        System.out.printf("\t\tHealthy range %36s%n", "18.5 - 25");
        System.out.printf("\t\tOverweight %37s%n", "25 - 30");
        System.out.printf("\t\tObese %42s%n", "30 - 35");
        System.out.printf("\t\tSeverely Obese %33s%n", "35 - 40");
        System.out.printf("\t\tMorbidly Obese %33s%n", "Over 40");

    }


}

//-----------------------------------------------------------------------------------------------------
class
whyekeat_a2
{
    public static void main(String[]args) throws IOException
    {    //reading in data from a text file
        Scanner input = new Scanner(new File("patient.txt"));

        //declaring variables for patient1
        int day;
        Month month;
        int year;
        String firstName;
        String lastName;
        double height;
        double weight;
        int currentYear;



        //Read in first patient
        firstName = input.nextLine();
        lastName = input.nextLine();
        day = input.nextInt();
        month = Month.valueOf(input.next());
        year = input.nextInt();
        height = input.nextDouble();
        weight = input.nextDouble();
        currentYear = input.nextInt();
        input.nextLine();



        //Create object for patient 1
        Date dob = new Date(day, month, year);
        HealthProfile h = new HealthProfile(firstName,lastName,dob,height,weight,currentYear);
        //Copy patient 1 object
        HealthProfile h1 = new HealthProfile(h);


        //read in patient 2
        firstName = input.nextLine();
        lastName = input.nextLine();
        day = input.nextInt();
        month = Month.valueOf(input.next());
        year = input.nextInt();
        height = input.nextDouble();
        weight = input.nextDouble();
        currentYear = input.nextInt();


        //create object for patient2
        dob = new Date(day, month, year);
        h = new HealthProfile(firstName,lastName,dob,height,weight,currentYear);

        //display out

        h1.displayInfo();
        System.out.println();
        h.displayInfo();















    }
}