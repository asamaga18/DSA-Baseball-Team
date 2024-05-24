class pitcher implements player{ // pitcher class that implements player interface
  private String name;
  private int wins, losses;
  private double salary, ERA; // local private variables

  public pitcher(String inpName, int w,int l, double earnedRunAvg, double sal){ // constructor for pitcher variables
    name = inpName;
    wins = w;
    losses = l;
    salary = sal;
    ERA = earnedRunAvg;
  }

  public int setWins(int newWins){ // sets wins and returns old
    int i = wins;
    wins = newWins;
    return i;
  }

  public int setLosses(int newLosses){ // sets losses and returns old
    int i = losses;
    losses = newLosses;
    return i;
  }

  public double setSalary(double newSalary){ // sets salary and returns old
    double i = salary;
    salary = newSalary;
    return i;
  }

  public double setERA(double newERA){ // sets ERA and returns old
    double i = ERA;
    ERA = newERA;
    return i;
  }

  public int getWins() { // retrieves wins
    return wins;
  }

  public int getLosses() { // retrieves losses
    return losses;
  }

  public double getSalary() { // retrieves salary
    return salary;
  }

  public double getERA() { // retrieves ERA
    return ERA;
  }

   public void showStats(){ // pitcher's version of showStats(); prints stats for pitcher
    System.out.println("Name: "+name+"\nWins: "+wins+"\nLosses: "+losses+"\nSalary: "+salary+"\nERA: "+ERA);
  }
  
}