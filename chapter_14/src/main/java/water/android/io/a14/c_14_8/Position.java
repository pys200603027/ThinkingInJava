package water.android.io.a14.c_14_8;

/**
 * 空对象的利用
 */
public class Position {
    private String title;
    private Person person;

    public Position(String jobTitle, Person person) {
        this.title = jobTitle;
        this.person = person;

        if (person == null) {
            person = Person._null;
        }
    }

    public Position(String jobTitle) {
        this.title = jobTitle;
        this.person = Person._null;
    }

    public String getTitle() {
        return title;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
        if (person == null) {
            person = Person._null;
        }
    }

    @Override
    public String toString() {
        return "Position:" + title + " " + person;
    }
}
