package main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;

import perlin.OpenSimplexNoise;
import perlin.Perlin;

public class Main {
	
//	Perlin p = new Perlin();
//	System.out.print(p.generateWhiteNoise(5, 5));
	 private String[] args;

	public static void main(String[] args) throws IOException {
		new Main(args).run();
	}
	
	 private Main(String[] args) {
		    this.args = args;
		  }
	 
	 private double summyOctave(int x, int y, long seed) {
		 return (1*this.sumOctave(4, x, y, 0.5, 0.02, -1, 1, seed) + 0.5*this.sumOctave(4, 2*x, 2*y, 0.5, 0.02, -1, 1, seed) + 0.25*this.sumOctave(4, 4*x, 4*y, 0.5, 0.02, -1, 1, seed) + 0.125*this.sumOctave(4, 8*x, 8*y, 0.5, 0.02, -1, 1, seed))/1.875;
	 }
	 private double sumOctave(int numIter, int x, int y, double persistence, double scale, double lo, double hi, long seed) {
		 //		 System.out.println(rand.nextLong());
		 OpenSimplexNoise os = new OpenSimplexNoise(seed);
		 int maxAmp = 0;
		 int amp = 1;
		 double freq = scale;
		 double noise = 0;
		 
		 for (int i = 0; i < numIter; i++) {
			 noise += os.eval(x*freq, y*freq)*amp;
			 maxAmp += amp;
			 amp *= persistence;
			 freq *= 2;
		 }
		 
		 noise /= maxAmp;
		 noise = noise*(hi - lo)/2 + (hi + lo)/2;
		 return noise;
	 }
		  private void run() {
			  Random rand = new Random();
			  long seed = rand.nextLong();
			  float[] nums = new float[10];
			  for (int i = 0; i < 10; i++) {
				  nums[i] = 0;
			  }
		    // Parse command line arguments
		    BufferedImage img = 
		    	    new BufferedImage(1000, 500, BufferedImage.TYPE_4BYTE_ABGR);
		    File f = null;
		    File f3 = null;
		    BufferedImage img3 = new BufferedImage(1000, 500, BufferedImage.TYPE_INT_ARGB);
		    double scale = .007;
		    
		    double min = 999;
		    double max = -999;
		    for (int i = 0; i < 500; i++) {
		    	for (int j = 0; j < 1000; j++) {
		    	}
		    }
		    	
		    for (int i = 0; i < 500; i++) {
		    	for (int j = 0; j < 1000; j++) {
//		    		double v = (os.eval(j*scale, i*scale) + 1)/2.0;
//		    		double v = os.eval(j, i);
//		    		double v = os.eval(j*scale, i*scale);
//		    		double v = sumOctave(4, j, i, .5, scale, -1, 1);
		    		
		    		
		    		double v = summyOctave(j, i, seed);
		    		System.out.println(v);
//		    		double v = 0;
//		    		if (i < 350 && i > 150 && j > 400 && j < 600){
//		    			v = summyOctave(j, i);
//			    		System.out.println(v);
//		    		}
		    		v = Math.pow(v, 7);
		    		if (v > max) {
		    			max = v;
		    		}
		    		if (v < min) {
		    			min = v;
		    		}
		    		System.out.println("2nd v: " + v);
//		    		int a, r, g, b;
//		    		a = (int)(Math.round((v + 1)*(255/2)));
//		    		System.out.println("a is: " + a);
//		    		r = a;
//		    		g = a;
//		    		b = a;
//		    		int p = (a<<24) | (r<<16) | (g<<8) | b;
//		    		img.setRGB(j, i, p);

		    		
		    		if (v < -.06) {
		    			int a = (int)(0); //generating 
		                int r = (int)(0); //values 
		                int g = (int)(0); //less than 
		                int b = (int)(0); //256 
		  
		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
		  
		                img.setRGB(j, i, p); 
		    		} else if (v < -.055){
		    			int a = (int)(50); //generating 
		                int r = (int)(50); //values 
		                int g = (int)(50); //less than 
		                int b = (int)(50); //256 
		  
		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
		  
		                img.setRGB(j,i, p); 
		    		} else if (v < -.045) {
		    			int a = (int)(70); //generating 
		                int r = (int)(70); //values 
		                int g = (int)(70); //less than 
		                int b = (int)(70); //256 
		  
		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
		  
		                img.setRGB(j,i, p); 
		    		} else if (v < -.03) {
		    			int a = (int)(90); //generating 
		                int r = (int)(90); //values 
		                int g = (int)(90); //less than 
		                int b = (int)(90); //256 
		  
		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
		  
		                img.setRGB(j,i, p); 
		    		} else if (v < -.2) {
		    			int a = (int)(110); //generating 
		                int r = (int)(110); //values 
		                int g = (int)(110); //less than 
		                int b = (int)(110); //256 
		  
		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
		  
		                img.setRGB(j,i, p); 
		    		} else if (v < .0) {
		    			int a = (int)(130); //generating 
		                int r = (int)(130); //values 
		                int g = (int)(130); //less than 
		                int b = (int)(130); //256 
		  
		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
		  
		                img.setRGB(j,i, p); 
		    		} else if (v < .03) {
		    			int a = (int)(150); //generating 
		                int r = (int)(150); //values 
		                int g = (int)(150); //less than 
		                int b = (int)(150); //256 
		  
		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
		  
		                img.setRGB(j,i, p); 
		    		} else if (v < .045) {
		    			int a = (int)(170); //generating 
		                int r = (int)(170); //values 
		                int g = (int)(170); //less than 
		                int b = (int)(170); //256 
		  
		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
		  
		                img.setRGB(j,i, p); 
		    		} else if (v < .06) {
		    			int a = (int)(190); //generating 
		                int r = (int)(190); //values 
		                int g = (int)(190); //less than 
		                int b = (int)(190); //256 
		  
		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
		  
		                img.setRGB(j,i, p); 
		    		} else {
		    			int a = (int)(210); //generating 
		                int r = (int)(210); //values 
		                int g = (int)(210); //less than 
		                int b = (int)(210); //256 
		  
		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
		  
		                img.setRGB(j,i, p); 
		    		}
//		    	if (v < -0.8) {
//	    			int a = (int)(0); //generating 
//	                int r = (int)(0); //values 
//	                int g = (int)(0); //less than 
//	                int b = (int)(0); //256 
//	  
//	                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//	  
//	                img.setRGB(j, i, p); 
//	    		} else if (v < -0.6){
//	    			int a = (int)(50); //generating 
//	                int r = (int)(50); //values 
//	                int g = (int)(50); //less than 
//	                int b = (int)(50); //256 
//	  
//	                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//	  
//	                img.setRGB(j,i, p); 
//	    		} else if (v < -0.4) {
//	    			int a = (int)(70); //generating 
//	                int r = (int)(70); //values 
//	                int g = (int)(70); //less than 
//	                int b = (int)(70); //256 
//	  
//	                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//	  
//	                img.setRGB(j,i, p); 
//	    		} else if (v < -0.2) {
//	    			int a = (int)(90); //generating 
//	                int r = (int)(90); //values 
//	                int g = (int)(90); //less than 
//	                int b = (int)(90); //256 
//	  
//	                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//	  
//	                img.setRGB(j,i, p); 
//	    		} else if (v < 0) {
//	    			int a = (int)(110); //generating 
//	                int r = (int)(110); //values 
//	                int g = (int)(110); //less than 
//	                int b = (int)(110); //256 
//	  
//	                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//	  
//	                img.setRGB(j,i, p); 
//	    		} else if (v < .2) {
//	    			int a = (int)(130); //generating 
//	                int r = (int)(130); //values 
//	                int g = (int)(130); //less than 
//	                int b = (int)(130); //256 
//	  
//	                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//	  
//	                img.setRGB(j,i, p); 
//	    		} else if (v < .4) {
//	    			int a = (int)(150); //generating 
//	                int r = (int)(150); //values 
//	                int g = (int)(150); //less than 
//	                int b = (int)(150); //256 
//	  
//	                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//	  
//	                img.setRGB(j,i, p); 
//	    		} else if (v < .6) {
//	    			int a = (int)(170); //generating 
//	                int r = (int)(170); //values 
//	                int g = (int)(170); //less than 
//	                int b = (int)(170); //256 
//	  
//	                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//	  
//	                img.setRGB(j,i, p); 
//	    		} else if (v < .8) {
//	    			int a = (int)(190); //generating 
//	                int r = (int)(190); //values 
//	                int g = (int)(190); //less than 
//	                int b = (int)(190); //256 
//	  
//	                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//	  
//	                img.setRGB(j,i, p); 
//	    		} else {
//	    			int a = (int)(210); //generating 
//	                int r = (int)(210); //values 
//	                int g = (int)(210); //less than 
//	                int b = (int)(210); //256 
//	  
//	                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//	  
//	                img.setRGB(j,i, p); 
//	    		}

		    	}
		    }
		    
		    try
	        { 
	            f = new File("D:\\China Work\\Out.jpg"); 
	            ImageIO.write(img, "jpg", f); 
	        } 
	        catch(IOException e) 
	        { 
	            System.out.println("Error: " + e); 
	        } 
		  
		  System.out.println("MIN: "+min+" MAX: "+max);
		  Perlin perl = new Perlin();
		  float[][] perly = perl.generateWhiteNoise(640, 320);
		  BufferedImage img2 = 
		    	    new BufferedImage(640, 320, BufferedImage.TYPE_INT_ARGB);
		    File f2 = null;
		    for (int i = 0; i < 320; i++) {
		    	for (int j = 0; j < 640; j++) {
//		    		double v = os.eval(j, i);
		    		double v = perly[j][i];
		    		
//		    		System.out.println(v);
//		    		if (v < 0.1) {
//		    			int a = (int)(0); //generating 
//		                int r = (int)(0); //values 
//		                int g = (int)(0); //less than 
//		                int b = (int)(0); //256 
//		  
//		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//		  
//		                img2.setRGB(j, i, p); 
//		    		} else if (v < 0.2){
//		    			int a = (int)(50); //generating 
//		                int r = (int)(50); //values 
//		                int g = (int)(50); //less than 
//		                int b = (int)(50); //256 
//		  
//		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//		  
//		                img2.setRGB(j,i, p); 
//		    		} else if (v <0.3) {
//		    			int a = (int)(70); //generating 
//		                int r = (int)(70); //values 
//		                int g = (int)(70); //less than 
//		                int b = (int)(70); //256 
//		  
//		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//		  
//		                img2.setRGB(j,i, p); 
//		    		} else if (v <0.4) {
//		    			int a = (int)(90); //generating 
//		                int r = (int)(90); //values 
//		                int g = (int)(90); //less than 
//		                int b = (int)(90); //256 
//		  
//		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//		  
//		                img2.setRGB(j,i, p); 
//		    		} else if (v < 0.5) {
//		    			int a = (int)(110); //generating 
//		                int r = (int)(110); //values 
//		                int g = (int)(110); //less than 
//		                int b = (int)(110); //256 
//		  
//		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//		  
//		                img2.setRGB(j,i, p); 
//		    		} else if (v < .6) {
//		    			int a = (int)(130); //generating 
//		                int r = (int)(130); //values 
//		                int g = (int)(130); //less than 
//		                int b = (int)(130); //256 
//		  
//		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//		  
//		                img2.setRGB(j,i, p); 
//		    		} else if (v < .7) {
//		    			int a = (int)(150); //generating 
//		                int r = (int)(150); //values 
//		                int g = (int)(150); //less than 
//		                int b = (int)(150); //256 
//		  
//		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//		  
//		                img2.setRGB(j,i, p); 
//		    		} else if (v < .8) {
//		    			int a = (int)(170); //generating 
//		                int r = (int)(170); //values 
//		                int g = (int)(170); //less than 
//		                int b = (int)(170); //256 
//		  
//		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//		  
//		                img2.setRGB(j,i, p); 
//		    		} else if (v < .9) {
//		    			int a = (int)(190); //generating 
//		                int r = (int)(190); //values 
//		                int g = (int)(190); //less than 
//		                int b = (int)(190); //256 
//		  
//		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//		  
//		                img2.setRGB(j,i, p); 
//		    		} else {
//		    			int a = (int)(210); //generating 
//		                int r = (int)(210); //values 
//		                int g = (int)(210); //less than 
//		                int b = (int)(210); //256 
//		  
//		                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
//		  
//		                img2.setRGB(j,i, p); 
//		    		}
		    		int a, r, g, b;
		    		a = (int)(Math.round((v + 1)*120));
//		    		System.out.println("a is: " + a);
		    		r = a;
		    		g = a;
		    		b = a;
		    		int p = (a<<24) | (r<<16) | (g<<8) | b;
		    		img2.setRGB(j, i, p);
		    	}
		    }
		    double mx = nums[0];
		    double sum = nums[0];
		    for (int i = 1; i < 10; i++) {
		    	if (nums[i] > mx) {
		    		mx = nums[i];
		    	}
		    	sum += nums[i];
		    }
//		    System.out.println();
//		    System.out.println("Raw numbers");
//		    System.out.println();
//		    for (int i = 0; i < 10; i++) {
//		    	System.out.print("(" + i + " , " + nums[i] + " ), ");
//		    	
//		    }
//		    System.out.println();
//		    System.out.println("Scaled to max");
//		    System.out.println();
//		    for (int i = 0; i < 10; i++) {
//		    	System.out.print("(" + i + " , " + nums[i]/max + " ), ");
//		    }
//		    System.out.println();
//		    System.out.println("Scaled to total");
//		    System.out.println();
//		    for (int i = 0; i < 10; i++) {
//		    	System.out.print("(" + i + " , " + nums[i]/sum + " ), ");
//		    }
//		    System.out.println();
//		    System.out.println("Cumulative");
//		    System.out.println();
//		    double prevsum = 0;
//		    for (int i = 0; i < 10; i++) {
//		    	prevsum += nums[i];
//		    	System.out.print("(" + i + " , " + prevsum/sum + "), " );
//		    }
		    
		    try
	        { 
	            f = new File("D:\\China Work\\Out2.jpg"); 
	            ImageIO.write(img2, "jpg", f); 
	        } 
	        catch(IOException e) 
	        { 
	            System.out.println("Error: " + e); 
	        } 
		  }
}
