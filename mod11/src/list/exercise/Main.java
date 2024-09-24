package list.exercise;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1: Read, separate, sort, and print names
        System.out.println("Enter names separated by commas:");
        String inputNames = scanner.nextLine();

        // Separate names by comma
        String[] nameArray = inputNames.split(",");

        // Convert to list for sorting
        List<String> nameList = Arrays.asList(nameArray);

        // Sort the list of names
        Collections.sort(nameList);

        // Print sorted names
        System.out.println("Sorted names: " + nameList);

        // Part 2: Read names with gender, group by gender, and print
        System.out.println("Enter names with gender (e.g., John-m, Mary-f), separated by commas:");
        String inputNamesWithGender = scanner.nextLine();

        // Map to group names by gender
        Map<String, List<String>> genderGroups = new HashMap<>();
        genderGroups.put("Male", new ArrayList<>());
        genderGroups.put("Female", new ArrayList<>());

        // Separate by comma and then split name and gender
        String[] peopleArray = inputNamesWithGender.split(",");
        for (String person : peopleArray) {
            String[] nameGender = person.split("-");
            String name = nameGender[0].trim();
            String gender = nameGender[1].trim();

            // Group names by gender
            if (gender.equalsIgnoreCase("m")) {
                genderGroups.get("Male").add(name);
            } else if (gender.equalsIgnoreCase("f")) {
                genderGroups.get("Female").add(name);
            }
        }

        // Sort names within each group
        genderGroups.get("Male").sort(Comparator.naturalOrder());
        genderGroups.get("Female").sort(Comparator.naturalOrder());

        // Print names grouped by gender
        System.out.println("Male Group: " + genderGroups.get("Male"));
        System.out.println("Female Group: " + genderGroups.get("Female"));
    }
}
