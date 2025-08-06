import java.util.*;
public class BFS_using_map
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no of vertices");
        int n= obj.nextInt();
        Map<Character,ArrayList<Character>> adj=new HashMap<>();

        while(true)
        {
            char src=obj.next().charAt(0);
            if(src=='1') break;
            char dest=obj.next().charAt(0);
            if(!adj.containsKey(src))
            {
                adj.put(src,new ArrayList<>());
                adj.get(src).add(dest);
            }
            else adj.get(src).add(dest);
            if(!adj.containsKey(dest))
            {
                adj.put(dest,new ArrayList<>());
                adj.get(dest).add(src);
            }
            else adj.get(dest).add(src);
        }

        Queue<Character> q=new LinkedList<>();
        Set<Character> set=new HashSet<>();
        System.out.println("Enter the head:");
        char ch=obj.next().charAt(0);
        q.add(ch);
        while(!q.isEmpty())
        {
            char cur=q.poll();
            set.add(cur);
            System.out.print(cur+" ");
            for (Character i:adj.get(cur))if(!set.contains(i))q.add(i);
        }
    }
}

