//https://www.hackerrank.com/challenges/circular-array-rotation/problem
//NOTE: This is simply the completed function 

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int m = a.length;
        int[] newa = new int[queries.length];

        for (int i = 0; i < queries.length; i++)
            newa[i] = queries[i] >= k ? a[queries[i] - k] : a[(m - ((k - queries[i]) % m)) % m];

        return newa;
    }
}