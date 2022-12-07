import java.util.*;

//BFS and DFS and where to use both of them.
public class A5 {
    //BFS
    public static ArrayList<Integer> bfs(int V,ArrayList<ArrayList<Integer>> adjList)
    {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        boolean arr[]=new boolean[V];
        for (int i = 0; i < V; i++) {
            arr[i]=false;
        }
        arr[0]=true;
        ArrayList<Integer> list=new ArrayList<>();

        while(!queue.isEmpty())
        {
        Integer remove=(queue.poll());
        list.add(remove);

        for(Integer list1 :adjList.get(remove))
        {
            if(arr[list1]==false)
            {
                queue.add(list1);
                arr[list1]=true;
            }
        }
    }

        return list;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //ADJACANECY MATRIX
        System.out.print("Enter the number of vertex: ");
        int V=sc.nextInt();
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <=V; i++) {
            list.add(new ArrayList<Integer>());
        }
        for(int i=0;i<=V;i++)
        {
            System.out.print("Enter the node1:");
            int v=sc.nextInt();
            System.out.print("Enter the node2:");
            int u=sc.nextInt();
            list.get(v).add(u);
            list.get(u).add(v);
        }
        ArrayList<Integer> result=A5.bfs(V,list);
        System.out.println(result);
    }
}
