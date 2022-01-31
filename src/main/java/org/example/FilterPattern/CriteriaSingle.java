package org.example.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by will on 16-12-12.
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("SINGLE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
