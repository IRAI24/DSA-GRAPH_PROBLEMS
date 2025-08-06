import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;

class pairs
{
    int src,dest,wt;
    pairs(int u,int v, int w)
    {
        src=u;
        dest=v;
        wt=w;
    }
}
public class MST_GRAPH
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no of  nodes");
        int n= obj.nextInt();
        ArrayList<ArrayList<int[]>> adj=new ArrayList<>();
        for (int i=0;i<n;i++)adj.add(new ArrayList<>());
        while(true) {
            char a = obj.next().charAt(0);
            if (a == '0') break;
            char b = obj.next().charAt(0);
            int co= obj.nextInt();
            adj.get(a - 65).add(new int[]{b - 65, co});
            adj.get(b - 65).add(new int[]{a - 65,co});
        }
        prims(n,adj);
    }
    static void prims(int n,ArrayList<ArrayList<int[]>> adj)
    {
        boolean[] visited=new boolean[n];
        PriorityQueue<pairs> pq=new PriorityQueue<>(Comparator.comparing(a->a.wt));
        pq.offer(new pairs(0,-1,0));
        int sum=0;
        while(!pq.isEmpty())
        {
            pairs current=pq.poll();
            if(visited[current.src]) continue;
            visited[current.src]=true;
            if(current.dest != -1)
            {
                System.out.println((char)(current.dest+65)+"-->"+ (char)(current.src+65)+" ("+ current.wt+")");

                sum=sum+ current.wt;
            }
            for (int[] neigh:adj.get(current.src))
            {
                if(!visited[neigh[0]])
                {
                    pq.offer(new pairs(neigh[0],current.src,neigh[1] ));
                }
            }


        }System.out.println("sum = "+sum);



    }
}
