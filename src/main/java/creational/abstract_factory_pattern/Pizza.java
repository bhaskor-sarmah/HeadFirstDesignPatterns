package creational.abstract_factory_pattern;

public abstract class Pizza {

  protected abstract void prepare(final PizzaIngredientFactory ingredientFactory);

  public void bake(){
    System.out.println("Baking pizza");
  }

  public void cut(){
    System.out.println("Cutting pizza");
  }

  protected void addIngredients(final PizzaIngredientFactory ingredientFactory){
    ingredientFactory.createDough();
    ingredientFactory.createCheese();
    ingredientFactory.createSauce();
  }

  public void box(){
    System.out.println("Packing pizza in Official Pizza box");
  }

}
