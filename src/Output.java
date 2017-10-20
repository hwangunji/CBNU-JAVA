interface Starcraft 
{
   void attack(String s);
}
  
class Terran implements Starcraft 
{
   public void attack(String s) 
   {
      System.out.println("Terran의  " + s + "Attack");
   }
}

class Protoss implements Starcraft  
{
   public void attack(String s) 
   {
      System.out.println("Protoss의  " + s + "Attack");
   }
}

class Zerg implements Starcraft 
{
   public void attack(String s) 
   {
      System.out.println("Zerg의  " + s + "Attack");
   }
}
class Output 
{
   public static void main(String args[]) 
   {
      Starcraft obj;   
      obj = new Terran();
       obj.attack("마린 ");
      obj = new Protoss();
      obj.attack("드래곤");
      obj = new Zerg();
      obj.attack("히드라리스크.");
   }
}