package co.simplon.eventparadise.dtos;

public class LabelValue {

    private Long id;

    private String name;

    public LabelValue() {

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

    @Override
    public String toString() {
	return "{id=" + id + ", name=" + name + "}";
    }

}
