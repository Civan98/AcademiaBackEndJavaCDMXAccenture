package util;

import java.util.Objects;

public class Student {
    int id;

    Student(int id){
        this.id = id;
    }

    //se debe sobrescribir el metodo equal indicando cual es el atributo a comparar
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
