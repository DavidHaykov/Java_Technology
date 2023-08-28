package telran.person;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PersonReadAppl {
    private static final String FILE_NAME = "persons.data";

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        //mapper.registerModule(new JavaTimeModule());
        mapper.findAndRegisterModules();
        //Person[] array = mapper.readValue(new File(FILE_NAME), Person[].class);
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, Person.class);
        List<Person> array = mapper.readValue(new File(FILE_NAME), type);

        array = mapper.readValue(new File(FILE_NAME), new TypeReference<List<Person>>() {
        });
//        for (Person p : array) {
//            System.out.println(p);
//        }
        Map<String, Person> map = new HashMap<>();
        map.put("Masha", new Person(1, "Masha", null, null));
        map.put("Sasha", new Person(1, "Sasha", null, null));
        map.put("Pasha", new Person(1, "Pasha", null, null));

        String json = mapper.writerFor(new TypeReference<Map<String, Person>>() {
        }).writeValueAsString(map);
        System.out.println(json);

        JsonNode node = mapper.readTree(json);
        JsonNode masha = node.get("Masha");
        System.out.println(masha.get("name"));
    }

}
