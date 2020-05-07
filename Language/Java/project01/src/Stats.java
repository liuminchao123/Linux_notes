import java.util.Queue;
import edu.princeton.cs.algs4.StdOut;
import static sun.java2d.cmm.ColorTransform.In;

public class Stats {
    public static void main(String[] args) {

    }

    public static int[] readInts(String name){
        In in = new In(name);
        Queue<Integer> q = new Queue<Integer>();
        while (!in.isEmpty())
            q.enqueue(in.readInt());

        int N = q.size();
        int[] a = new int[N];
        for(int i = 0; i < N; i ++)
            a[i] = q.dequeue();
        return a;
    }
}
