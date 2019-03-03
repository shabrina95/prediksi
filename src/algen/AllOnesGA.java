package algen;

import java.util.Scanner;

public class AllOnesGA {
    public static void main(String[] args) {
        // Create GA object
        int popultaionSize;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah populasi = ");
        popultaionSize = sc.nextInt();

        GeneticAlgorithm ga = new GeneticAlgorithm(popultaionSize, 0.01, 0.95, 0);
        // Initialize population
        Population population = ga.initPopulation(5);

        // The following is the new code you should be adding:
        ga.evalPopulation(population);
        int generation = 1;
        while (ga.isTerminationConditionMet(population) == false) {
            // Print fittest individual from population
            System.out.println("Best solution: " + population.getFittest(0).toString());
            // Apply crossover
            population = ga.crossoverPopulation(population);
            // Apply mutation
            population = ga.mutatePopulation(population);
            // Evaluate population
            ga.evalPopulation(population);
            // Increment the current generation
            generation++;
        }
        System.out.println("Found solution in " + generation + " generations");
        System.out.println("Best solution: " + population.getFittest(0).toString());
        // We’ll add a lot more here...
    }

}
