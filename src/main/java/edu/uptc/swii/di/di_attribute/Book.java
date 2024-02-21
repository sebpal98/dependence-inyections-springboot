package edu.uptc.swii.di.di_attribute;

public class Book {
    private Integer id;
    private String name;
    private Editorial editorial;

    public Book(Integer id, String name, Editorial editorial) {
        this.id = id;
        this.name = name;
        this.editorial = editorial;
    }

    public Book() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", editorial=" + editorial + "]";
    }

}
