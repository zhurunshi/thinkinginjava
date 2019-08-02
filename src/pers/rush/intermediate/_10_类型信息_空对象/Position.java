package pers.rush.intermediate._10_类型信息_空对象;

public class Position {
    private String title;
    private Person person;

    public Position(String title, Person person) {
        this.title = title;
        this.person = person;
        if (person == null) {
            this.person = Person.NULL;
        }
    }

    public Position(String title) {
        this.title = title;
        this.person = Person.NULL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
        if (this.person == null) {
            this.person = Person.NULL;
        }
    }

    @Override
    public String toString() {
        return "Position{" +
                "title='" + title + '\'' +
                ", person=" + person +
                '}';
    }
}
