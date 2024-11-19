public class IntList {
    public int first;
    public IntList rest;        

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public int size()
    {
        if(rest == null )//null 不能调非静态方法，因为引用。。。空的， 没有对象，
        {
            return 1;
        }
        return 1 + rest.size();
    }

    public int sizeiteration()
    {
        int cnt= 0;
        IntList p = this;
        while(p != null)
        {
            cnt +=1;
            p = p.rest;
        }
        return cnt;
    }
    
    public int get(int index)
    {
        IntList p = this;
        for(int i=0;i<index; i++)
        {
            p = p.rest;
        }
        return p.first;
    }
    
    public void addFirst(int x)
    {
        IntList newlist = new IntList(this.first, this.rest);
        first = x;
        rest = newlist;

    }
    public static void main(String[] args) {
        IntList a = new IntList(100, null);
        IntList b = new IntList(1, a);
        b.addFirst((54));
        
        // System.out.println(b.size() +" "+ b.sizeiteration());
        // System.out.println(b.get(1));

    }
}