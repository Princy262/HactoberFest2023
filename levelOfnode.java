class Solution

{

   ArrayList<Integer> list = new ArrayList<>();

   

    //Function to find the level of node X.

    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)

    {

        // code here

        

        Queue<Integer> q = new LinkedList<>();

        q.add(0);

        int lvl = 0;

        while(q.size()>0)

        {

            int n = q.size();

            for(int i=0; i<n; i++)

            {

                int c = q.remove();

                if(c==X) 

                {

                   return lvl;

                }

                

                for(int j=0; j<adj.get(c).size(); j++)

                {

                    int nb = adj.get(c).get(j);

                    if(!list.contains(nb))

                    {

                      list.add(nb);

                      q.add(nb);

                    }

                }

                

            }

            lvl++;

        }

        return -1;

    }
