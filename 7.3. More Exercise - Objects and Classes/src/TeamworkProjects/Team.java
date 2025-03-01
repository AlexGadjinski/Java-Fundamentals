package TeamworkProjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    String name;
    String creator;
    List<String> members;

    Team(String name, String creator) {
        this.name = name;
        this.creator = creator;
        members = new ArrayList<>();
    }

    void addMember(String member) {
        members.add(member);
        Collections.sort(members);
    }
}
