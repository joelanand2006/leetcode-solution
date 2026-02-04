// Last updated: 2/4/2026, 8:20:13 PM
class Solution {
    public double[] convertTemperature(double celsius) {
        double f = celsius * 1.8 + 32.0;
        double k = celsius + 273.15;

        double[] arr = new double[2];
        arr[0] = k;
        arr[1] = f;
        return arr;
    }
}