import java.util.LinkedList;

public interface Tracker {

  //Add to the directory if not there yet
  public void addPatient(Person p, LinkedList<Person> user); 

  //See IDs of those in quarantine (yellow & red)
  public void PrintInContact(LinkedList<Person> user);

  //See IDs of those tested positive (red)
  public void PrintTestedPositive(LinkedList<Person> user);

  //See IDs of those tested negative (green)
  public void PrintCovidFree(LinkedList<Person> user);

  //See number of those in quarantine (yellow, red)
  public void GetNumQuarantine(LinkedList<Person> user);

  //See number of those tested positive (red)
  public void GetNumPositive(LinkedList<Person> user);

  //If tested negative, they are healthy (yellow/red -> green)
  public void IsHealthy(Person p);

  //If tested positive, they have Covid (green/yellow -> red) 
  public void HasCovid(Person p);

}