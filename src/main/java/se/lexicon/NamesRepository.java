package se.lexicon;

import java.util.Arrays;

public class NamesRepository {
    public static String[] nameDatabase = new String[0];

    public static void print() {
        //Prints the content of the name Array
        for (String s : nameDatabase) {
            System.out.println(s);
        }
    }

    public static void print(String[] array) {
        //Print the content of a search result
        for (String s : array) {
            System.out.println(s);
        }
    }

    public static String find(final String fullName) {
        //Searches the Array for a name. Returns if found
        for (String name : nameDatabase) {
            if (name.equalsIgnoreCase(fullName)) {
                return name;
            }
        }
        return null;

    }

    public static boolean add(final String fullName) {
        //Adds a name to Array. Returns false if already found.
        String foundFullName = find(fullName);
        if (foundFullName != null) {
            return false;
        }
        String[] newArray = Arrays.copyOf(nameDatabase, nameDatabase.length + 1);
        newArray[newArray.length - 1] = fullName;
        nameDatabase = newArray;
        return true;
    }

    public static String[] findByFirstName(final String firstName) {
        //Searches the array trying to find all names that has passed in first name.
        // Returns a String array containing all matches.
        String[] result = new String[0];
        for (String name : nameDatabase) {
            if (name.contains(firstName)) {
                String[] resultFound = Arrays.copyOf(result, result.length + 1);
                resultFound[resultFound.length - 1] = name;
                result = resultFound;
                return result;
            }
        }
        return null;
    }

    public static String[] findByLastName(final String lastName) {
        //Searches the array trying to find all names that has passed in last name.
        // Returns a String array containing all matches.
        String[] result = new String[0];
        for (String name : nameDatabase) {
            if (name.contains(lastName)) {
                String[] resultFound = Arrays.copyOf(result, result.length + 1);
                resultFound[resultFound.length - 1] = name;
                result = resultFound;
                return result;
            }
        }
        return null;
    }

    public static boolean update(final String original, final String updatedName) {
        //Should find a name and replace it with new fullName if available.
        // Returns true if name was found and updated with the new name.
        // False if name could not be updated because name wasn’t found or name was found but an existing name
        //matching the updatedName already exists.
        String originalExists = find(original);
        String updateExists = find(updatedName);
        if (originalExists == null && updateExists == null) {
            System.out.println("Original name not found!");
            return false;
        } else if (originalExists != null && updateExists != null) {
            System.out.println("That name already exists!");
            return false;
        } else {
            for (int i = 0; i < nameDatabase.length; i++) {
                if (nameDatabase[i].equalsIgnoreCase(original)) {
                    int originalIndex = i;
                    nameDatabase[originalIndex] = updatedName;
                    System.out.println("Name updated successfully!");
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean remove(final String fullName) {
        //Should remove a name from the array. Returns true if name was removed and false if the name was not
        //removed for some reason.
        String nameExists = find(fullName);
        if (nameExists == null) {
            System.out.println("That name doesn't exist!");
            return false;
        } else {
            for (int i = 0; i < nameDatabase.length; i++) {
                if (nameDatabase[i].equalsIgnoreCase(fullName)) {
                    int originalIndex = i;
                    nameDatabase[originalIndex] = null;
                    return true;
                }
            }
        }
        return false;
    }
}


