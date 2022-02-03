package ch.zuehlke.fullstack.domain.model;

import ch.zuehlke.fullstack.annotations.ExampleAnnotation;

@ExampleAnnotation()
public class ExampleDto {

    private final int id;
    private final String name;

    public ExampleDto(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
