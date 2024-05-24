// Declare Batter class
class batter implements player{
  // declare private variables
  private String name;
  private int homeRuns = 0;
  private double salary, average;

  public batter(){}

  // Declare batter constructor
  public batter(String inpName, int inpHRs, double avg, double sal){
    // Assigns values to batter object
    name = inpName;
    homeRuns = inpHRs;
    salary = sal;
    average = avg;
  }

  // Set method for home runs and returns old value
  public int setHR(int newHR){
    int i = homeRuns;
    homeRuns = newHR;
    return i;
  }

  // Set method for salary and returns old value
  public double setSal(double newSal){
    double i = salary;
    salary = newSal;
    return i;
  }

  // Set method for average and returns old value
  public double setAvg(double newAvg){
    double i = average;
    average = newAvg;
    return i;
  }

  // Returns home runs
  public int getHR(){
    return homeRuns;
  }
  // Returns salary
  public double getSal(){
    return salary;
  }
  // Returns Average
  public double getAvg(){
    return average;
  }
  // Returns Name
  public String getName(){
    return name;
  }

  // Prints stats for batter
  public void showStats(){
    System.out.println("Name: "+name+"\nHome Runs: "+homeRuns+"\nSalary: "+salary+"\nAverage: "+average);
  }
  
}