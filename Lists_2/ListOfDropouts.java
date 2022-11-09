package Lists_2;

public class ListOfDropouts
{
    private Student headline = null;

    public void makeEmpty()
    {
        this.headline = null;
    }

    public boolean isEmpty()
    {
        return this.headline == null;
    }
    private void addTail(Student obj, Student other)
    {

        if(other.next == null) {
            other.next = obj;
            obj.parent = other;
            return;
        }
        addTail(obj, other.next);
    }

    public void addFront(Student newobj)
    {
        if(this.headline == null){
            this.headline = newobj;
            return;
        }
        addTail(newobj, headline);
    }

    private void recursiveDeletion(int StudentsIndex, Student obj)
    {
        if((obj.StudentsIndex == StudentsIndex) && (obj.next != null))
        {
            obj.parent.next = obj.next;
            obj.next.parent = obj.parent;
            return;
        }
        if(obj.StudentsIndex == StudentsIndex)
        {
            obj.parent.next = null;
            return;
        }
        recursiveDeletion(StudentsIndex, obj.next);
    }

    public void recordDeletion(int StudentsIndex)
    {
        if((this.headline.StudentsIndex == StudentsIndex) && (this.headline.next != null)){
            this.headline = this.headline.next;
            headline.next.parent = null;
            return;
        }
        if ((this.headline.StudentsIndex == StudentsIndex) && (this.headline.next == null)) {
            this.headline = null;
            return;
        }
        recursiveDeletion(StudentsIndex, headline.next);
    }

    private void RecordOut(int studentsIndex, Student obj)
    {
        if(obj == null){
            System.out.println("No students with this number");
            return;
        }
        if (obj.StudentsIndex == studentsIndex)
        {
            obj.GetAll();
            return;
        }
        RecordOut(studentsIndex, obj.next);
    }

    public void GetRecord(int studentsIndex)
    {
        if(!isEmpty())
        {
            if (headline.next.StudentsIndex == studentsIndex) {
                headline.next.GetAll();
                return;
            }
            if (headline.next.next != null) {
                RecordOut(studentsIndex, headline.next.next);
                return;
            }
            System.out.println("No students with this number");
        }
        System.out.println("No students with this number");
    }



    private void cleaning(Student obj, Student parent)
    {
        if(obj.next != null)
        {
            cleaning(obj.next, obj);
        }
        parent.next = null;
    }

    public void cleaningUp()
    {
        if(!isEmpty())
        {
            cleaning(this.headline.next, this.headline);
            makeEmpty();
        }
    }
}

