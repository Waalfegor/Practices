package Lists_3;

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

        if(other.next == headline.next) {
            other.next = obj;
            obj.next = headline.next;
            return;
        }
        addTail(obj, other.next);
    }

    public void addFront(Student newobj)
    {
        if(this.headline.next == null){
            this.headline.next = newobj;
            newobj.next = headline.next;
            return;
        }
        addTail(newobj, headline.next);
    }

    private void recursiveDeletion(int StudentsIndex, Student obj, Student parent)
    {
        if((obj.StudentsIndex == StudentsIndex) && (obj.next == headline.next))
        {
            parent.next = headline;
            return;
        }
        if(obj.StudentsIndex == StudentsIndex)
        {
            parent.next = obj.next;
            return;
        }
        recursiveDeletion(StudentsIndex, obj.next, obj);
    }

    public void recordDeletion(int StudentsIndex)
    {
        if((this.headline.next.StudentsIndex == StudentsIndex) && (this.headline.next.next == headline.next)){
            this.headline.next = null;
            return;
        }
        recursiveDeletion(StudentsIndex, headline.next.next, headline.next);
    }

    private void RecordOut(int studentsIndex, Student obj)
    {
        if(obj == headline.next){
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
            if(this.headline.next.StudentsIndex == studentsIndex){
                this.headline.next.GetAll();
                return;
            }
            if (headline.next.next != headline.next) {
                RecordOut(studentsIndex, headline.next.next);
                return;
            }
            System.out.println("No students with this number");
        }
        System.out.println("No students with this number");
    }

    private void cleaning(Student obj, Student parent)
    {
        if(obj.next != headline.next)
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
