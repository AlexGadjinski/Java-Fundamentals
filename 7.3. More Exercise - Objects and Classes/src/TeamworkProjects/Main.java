package TeamworkProjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Team> teams = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean isCreated = false;
            String[] input = scanner.nextLine().split("-");
            String creator = input[0];
            String name = input[1];

            for (int j = 0; j < teams.size(); j++) {
                if (teams.get(j).name.equals(name)) {
                    System.out.printf("Team %s was already created!\n", name);
                    isCreated = true;
                    break;
                }
                if (teams.get(j).creator.equals(creator)) {
                    System.out.printf("%s cannot create another team!\n", creator);
                    isCreated = true;
                    break;
                }
            }
            if (!isCreated) {
                Team newTeam = new Team(name, creator);
                teams.add(newTeam);
                System.out.printf("Team %s has been created by %s!\n", name, creator);
            }
        }

        List<String> listOfAllPeople = new ArrayList<>();
        for (int i = 0; i < teams.size(); i++) {
            listOfAllPeople.add(teams.get(i).creator);
        }

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end of assignment")) {
                break;
            }
            String[] command = input.split("->");
            String member = command[0];
            String team = command[1];
            boolean isExisting = false;

            for (int i = 0; i < teams.size(); i++) {
                if (teams.get(i).name.equals(team)) {
                    isExisting = true;
                    break;
                }
            }
            if (!isExisting) {
                System.out.printf("Team %s does not exist!\n", team);
                continue;
            }
            if (listOfAllPeople.contains(member)) {
                System.out.printf("Member %s cannot join team %s!\n", member, team);
                continue;
            }
            for (int i = 0; i < teams.size(); i++) {
                if (teams.get(i).name.equals(team)) {
                    teams.get(i).addMember(member);
                    listOfAllPeople.add(member);
                    break;
                }
            }
        }

        List<Team> sortedTeamsByCount = new ArrayList<>();

        for (int i = 0; i < teams.size();) {
            int maxCount = teams.get(0).members.size();
            Team maxMembersTeam = teams.get(0);
            for (Team team : teams) {
                if (team.members.size() > maxCount) {
                    maxCount = team.members.size();
                    maxMembersTeam = team;
                }
            }
            sortedTeamsByCount.add(maxMembersTeam);
            teams.remove(maxMembersTeam);
        }
        for (int i = 0; i < sortedTeamsByCount.size(); i++) {

            for (int j = i + 1; j < sortedTeamsByCount.size(); j++) {
                Team team1 = sortedTeamsByCount.get(i);
                int membersOne = team1.members.size();
                Team team2 = sortedTeamsByCount.get(j);
                int membersTwo = sortedTeamsByCount.get(j).members.size();

                if (membersOne == membersTwo) {
                    if (team2.name.compareTo(team1.name) < 0) {
                        sortedTeamsByCount.set(i, team2);
                        sortedTeamsByCount.set(j, team1);
                    }
                } else {
                    break;
                }
            }
        }

        for (Team team : sortedTeamsByCount) {
            if (!team.members.isEmpty()) {
                System.out.println(team.name);
                System.out.println("- " + team.creator);
                for (String member : team.members) {
                    System.out.println("-- " + member);
                }
            }
        }
        System.out.println("Teams to disband:");
        List<String> disbandedTeams = new ArrayList<>();
        for (Team team : sortedTeamsByCount) {
            if (team.members.isEmpty()) {
                disbandedTeams.add(team.name);
            }
        }
        Collections.sort(disbandedTeams);
        System.out.println(String.join(System.lineSeparator(), disbandedTeams));
    }
}
