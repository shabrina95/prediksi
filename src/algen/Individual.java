package algen;

public class Individual {
    private double[] chromosome;
    private double fitness = -1;
    public Individual(double[] chromosome) {
        // Create individual chromosome
        this.chromosome = chromosome;
    }
    public Individual(double chromosomeLength) {
        this.chromosome = new double[(int) chromosomeLength];
        for (int gene = 0; gene < chromosomeLength; gene++) {
            double random = Math.random();
            while (random > 1){
                random = generateRandomGene(random);
            }
            this.setGene(gene, random);
        }
    }

    public double generateRandomGene(double random){
        random = Math.random();
        return random;
    }

    public double[] getChromosome() {
        return this.chromosome;
    }
    public double getChromosomeLength() {
        return this.chromosome.length;
    }
    public void setGene(double offset, double gene) {
        this.chromosome[(int) offset] = gene;
    }
    public double getGene(double offset) {
        return this.chromosome[(int) offset];
    }
    public void setFitness(double fitness) {
        this.fitness = fitness;
    }
    public double getFitness() {
        return this.fitness;
    }
    public String toString() {
        String output = "";
        for (int gene = 0; gene < this.chromosome.length; gene++) {
            output += this.chromosome[gene]+" ";
        }
        return output;
    }

}
