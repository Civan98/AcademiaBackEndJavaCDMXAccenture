package util;

import java.util.Objects;

public class Student {
    int id;

    Student(int id){
        this.id = id;
    }

    //se debe sobrescribir el método equal indicando cual es el atributo a comparar
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Student){
            Student s = (Student) o;
            return this.id == s.id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
