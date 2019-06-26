package perlin;

import java.util.Random;

public class Perlin {
	public float[][] generateWhiteNoise(int width, int height)
	{
	    Random random = new Random(0); //Seed to 0 for testing
	    float[][] noise = new float[width][height];
	 
	    for (int i = 0; i < width; i++)
	    {
	        for (int j = 0; j < height; j++)
	        {
	            noise[i][j] = (float)random.nextDouble() % 1;
	        }
	    }
	 
	    return noise;
	}
}
