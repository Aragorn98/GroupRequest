package kz.iitu.jd3.bookrequest;

public class Group {

    private Long id;
    private String name;
    private String specialty;

    public Group() {
    }

    public Group(Long id, String title, String author) {
        this.id = id;
        this.name = title;
        this.specialty = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
