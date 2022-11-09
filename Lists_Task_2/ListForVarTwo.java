package Lists_Task_2;

public class ListForVarTwo
{
    private Node head= null;
    private int size = 0; //
    // private Node MinObj = new Node(min);
    private int ind = 1;

    private void Add(Node newobj, Node obj)
    {
        if(obj.next == null)
        {
            this.size++;
            obj.next = newobj;
            newobj.parent = obj;
            newobj.index = this.size;
            return;
        }
        Add(newobj, obj.next);
    }
    public void addNode(Node newobj)
    {
        if (this.head == null) {
            this.head = newobj;
            this.size++;
            newobj.index = this.size;
            return;
        }
        Add(newobj, this.head);
    }
    private void AddInBeginning(Node obj)
    {
        if(this.head != null) {
            Node tempNode = this.head;
            obj.parent = null;
            this.head = obj;
            this.head.next = tempNode;
            tempNode.parent = this.head;
            return;
        }
        this.head = obj;
    }
    private void recursiveDeletion(int index, Node obj)
    {
        if((obj.index == index) && (obj.next != null))
        {
            obj.parent.next = obj.next;
            obj.next.parent = obj.parent;
            return;
        }
        if(obj.index == index)
        {
            obj.parent.next = null;
            return;
        }
        recursiveDeletion(index, obj.next);
    }
    public void remove(int index)
    {
        if((this.head.index == index) && (this.head.next != null))
        {
            this.head = this.head.next;
            head.parent = null;
            return;
        }
        if((this.head.index == index) && (this.head.next == null)){
            this.head = null;
            return;
        }
        recursiveDeletion(index, head.next);
    }
    private Node searchMin(Node obj, Node temp, int ind)
    {
        if(obj.index >= ind)
        {
            if (obj.data < temp.data) temp = obj;
            if (obj.next != null) temp = searchMin(obj.next,temp,ind);
            return temp;
        }
        else temp = searchMin(obj.next,temp,ind);
        return temp;
    }
    private void indexing(Node obj)
    {
        obj.index = ind;
        ind++;
        if(obj.next != null) indexing(obj.next);
    }
    public void Sort()
    {
        int max = Integer.MAX_VALUE;
        for(int i = 1; i < this.size + 1;i++)
        {
            Node temp = new Node(max);
            temp = searchMin(head,temp, i);
            remove(temp.index);
            AddInBeginning(temp);
            indexing(this.head);
            this.ind = 1;
        }
    }

    private void recursiveGet(int index, Node obj)
    {
        if(obj.index == index){
            System.out.println(obj.data);
            return;
        }
        if(obj.next != null)recursiveGet(index,obj.next);
    }

    public void GetNode(int index) {
        if (index < 1 && index > size) return;
        if (head.index == index) {
            System.out.println(head.data);
            return;
        }
        recursiveGet(index, head.next);
    }
}
