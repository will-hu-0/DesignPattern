package org.example.FilterPattern;

import java.util.List;

/**
 * Created by will on 16-12-12.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
