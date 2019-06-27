# simplex-noise

So I call things Perlin noise, but really they're simplex noise, but I was originally planning on working with Perlin noise and
never bothered to change the names. Sue me.

Comment out the checking values for v, and uncomment

int a, r, g, b;
a = (int)(Math.round((v + 1)*(255/2)));
System.out.println("a is: " + a);
r = a;
g = a;
b = a;
int p = (a<<24) | (r<<16) | (g<<8) | b;
img.setRGB(j, i, p);

on line 96 to see the noise itself. All the checks you see are because I am in the process of adapting this into a map generator, 
but that will take more work.

This program uses OpenSimplexNoise, which is a freely available Java library. OpenSimplexNoise and OpenSimplexNoiseTest are both from 
it, and are not my work. I use it to generate 2D simplex noise, which I then run through an octave to make it smoother, instead of the
purely random noise that's generated at first. You can raise the results of the octave to some power to make it smoother and less
"mountain-y" with large patches of high values; it will generate smoother valleys that way.


      
