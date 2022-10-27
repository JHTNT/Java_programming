/* Method1
private static int compute(int length) {
    int area = 0;
    area = length * 1;
    return area;
}
*/

/* Method2
private static int compute(int length,int weight) {
    int area=0;
    area = length * weight;
    return area;
}
*/

/* Method3
private static double compute(double bottom) {
    double area = 0;
    area = bottom * 0.5;
    return area;
}
*/

/* Method4
private static double compute(double bottom, double height) {
    double area = 0;
    area = bottom * height * 0.5;
    return area;
}
*/

/* Method5
private static int compute(String... tokens){
    int totalsum = 0;
    for (String num : tokens) {
        totalsum += Integer.valueOf(num);
    }
    return totalsum;
}
*/