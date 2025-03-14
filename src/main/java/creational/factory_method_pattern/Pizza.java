package creational.factory_method_pattern;

public abstract class Pizza {

  public abstract void prepare();

  public void bake(){
    System.out.println("Baking pizza");
  }

  public void cut(){
    System.out.println("Cutting pizza");
  }

  public abstract void box();

}
