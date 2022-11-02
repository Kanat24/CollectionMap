package task1;

import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private final Map<Product, Integer> food;
    private final int sumAll;
    private final String nameRecipe;
    public static final Set<Recipe> recipes = new HashSet<>();

    public static Set<Recipe> getRecipes() {
        return recipes;
    }

    public Recipe(Map<Product, Integer> food, int sumAll, String nameRecipe) {
        if (food==null || food.size()==0 || nameRecipe==null || nameRecipe.isEmpty()){
            throw new IllegalArgumentException("Не заполнены все поля");
        }
        this.food = food;
        this.sumAll = sumAll;
        this.nameRecipe = nameRecipe;
    }


    public int getSumAll() {
        return sumAll;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public static void addNewRecipe(Recipe recipe) {
        if (recipes.contains(recipe)){
                throw new IllegalArgumentException("Этот рецепц уже есть в нашем списке");
            } else recipes.add(recipe);
    }

    public static int sumProduct(Map<Product, Integer> food) {
        int summa = 0;
        if (food != null) {
            for (Product product : food.keySet()) {
                summa+=product.getPrice()*product.getAmount();
            }

        }
        return summa;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "food=" + food +
                ", sumAll=" + sumAll +
                ", nameRecipe='" + nameRecipe + '\'' +
                '}';
    }
}
