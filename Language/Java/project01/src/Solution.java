import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Random;
import java.util.Scanner;

public class Solution {

    // 随机点个数
    public static void randomNodeNumber(int N, Point2D[] point){
        var random = new Random();
        for(int i = 0; i < N; i ++)
            point[i] = new Point(random.nextInt(100), random.nextInt(100)); // 设置正方形边长为 100

    }

    public static double Comparsion(Point2D[] a) {
        double min = 200;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                double b =  a[i].distance(a[j]);
                min = (min < b) ? min : b;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // 命令台输入整数 N
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Point2D[] point = new Point2D[N];
        randomNodeNumber(N, point);
        System.out.println(Comparsion(point));
    }
}
