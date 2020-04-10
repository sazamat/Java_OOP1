package com.company;

import java.util.Arrays;

public class Shape {
public Points[] x=new Points[10];
public Points[] y=new Points[10]

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    public void addPoimts(Points p1, Points p2) {
        int[]newArray = Arrays.copyOf(x, x.length + 1);
        newArray[newArray.length - 1]= newItem;
        }
        public int calculatePerimeter(int[] x, int[] y){
     int k;
     k=2*(x[2]-x[0]+y[2]-y[0]);

     return k ;


        }
        public int longestSide (int x[],int y[]){
    int max=x[1]-x[0];
    int max2=y[0]-y[1];

    for (int i=0;i<x.length-1;i=i+2)
    {
        if ((x[i+1]-x[i])<(x[i+3]+x[i+2]) {
            max=x[i+3]-x[i+2];
        }
        return max;
        }
for (int j=0;j<y.length-1;j=j+2)
{ if((y[j+1]-y[j])<y[j+3]-y[j+2]){
    max2=y[j+3]-y[j+2];
}
return max;}


        }

    private static class ArrayUtils {
    }
}
