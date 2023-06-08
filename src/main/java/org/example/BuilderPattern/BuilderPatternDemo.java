package org.example.BuilderPattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        NutritionFacts result = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .fat(399)
                .sodium(23)
                .carbohydrate(50)
                .build();
    }
}
