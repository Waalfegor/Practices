package Lists_1;

public class ListOfDropouts
{
    private Student headline = new Student();

    public void makeEmpty()
    {
        this.headline.next = null;
    }

    public boolean isEmpty()
    {
        if(this.headline.next == null) return true;
        return false;
    }
    private void addTail(Student obj, Student other)
    {

        if(other.next == null) {
            other.next = obj;
            return;
        }
        addTail(obj, other.next);
    }

    public void addFront(Student newobj)
    {
        if(this.headline.next == null){
            this.headline.next = newobj;
            return;
        }
        addTail(newobj, headline.next);
    }

    private void recursiveDeletion(int StudentsIndex, Student obj, Student parent)
    {
        if((obj.StudentsIndex == StudentsIndex) && (obj.next != null))
        {
            parent.next = obj.next;
            return;
        }
        recursiveDeletion(StudentsIndex, obj.next, obj);
    }

    public void recordDeletion(int StudentsIndex)
    {
        if((this.headline.next.StudentsIndex == StudentsIndex) && (this.headline.next.next != null)){
            this.headline.next = this.headline.next.next;
            return;
        }
        recursiveDeletion(StudentsIndex, headline.next.next, headline.next);
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
