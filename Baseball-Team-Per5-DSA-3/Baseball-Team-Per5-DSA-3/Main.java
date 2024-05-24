class Main { 
  public static void main(String[] args) {

    // Declare and intialize batter and pitcher and set new values
    batter Batter1 = new batter("Amogh", 14, 0.01, 3600000);
    double i = Batter1.setAvg(0.99);
    System.out.println("Old Avg: " + i + "\n");
    Batter1.showStats();
    System.out.println("");

    pitcher Pitcher1 = new pitcher("john", 2, 45, 8.01, 4);
    Pitcher1.setERA(0.3);
    Pitcher1.setLosses(Pitcher1.getWins()+4);
    Pitcher1.showStats();
    System.out.println("");
    

    // declare array of players and initial each one
    player[] team = new player[5];
    team[0] = new pitcher("Jeffrey", 7, 11, 3.73, 7999);
    team[1] = new pitcher("Heet", 3, 15, 7.84, 903241);
    team[2] = new batter("Keith", 3, 0.4, 4555);
    team[3] = new batter("Jamal", 2, .23, 43.23);
    team[4] = new batter("Ram Gupta", 20, 0.999999, 15.14);

    // Print array of players stats
    for (int j =0 ; j <5; j++){
      team[j].showStats();
      System.out.println("");
    }

    
    
    



    
  }
}
