public class SLList {
    public static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n)
        {
            item = i;
            next = n;
        }
    }
    public IntNode first;

    public SLList(int x)
    {
        first = new IntNode(x, null);
    }

    public void addFirst(int x)
    {
        first = new IntNode(x, first);
    }

    public int getFirst()
    {
        return first.item;
    }

    public void addLast(int x)
    {
        IntNode newnode = new IntNode(x, null) ;
        if(first == null)
        {
            first = newnode;
            return;
        }

        IntNode p = this.first;
        while(p.next !=null)
        {
            p = p.next;
        }
        p.next = newnode;


    }
    
    public void addLast_recur (int x)
    {
        
        if(first == null){
            first = new IntNode(x, null) ;
            return ;
        }
        else if(first.next == null)
        {
            first.next = new IntNode(x, null);
            return;
        }
        SLList next = this;
        next.first = this.first.next;
        next.addLast_recur(x);
        
    }
    /**
     * Returns the number of items in the list using recursion.
     */
    public int size()
    {
        int cnt = 0;
        IntNode p = first;
        while(p != null){
            cnt += 1;
            p = p.next;
        }
        return cnt;
    }
    public int size_recur()
    {
        //不是， 我也不知道传进来的是不是空链表啊
        if(this.first == null){
            return 0;
        }
        SLList nex = this;
        nex.first = this.first.next;
        return 1 + nex.size_recur();

    }
}