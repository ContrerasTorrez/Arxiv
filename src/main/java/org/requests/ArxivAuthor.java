package org.requests;

import org.apache.abdera.model.Entry;
import org.apache.abdera.model.Person;

import java.util.ArrayList;
import java.util.List;

public class ArxivAuthor {
    public List<Person> getAuthors(Entry entries){
        //TODO implementar funcion : debe retornar todos los autores, ademas
        List<Person> list = entries.getAuthors();
        return list;
    }
}
