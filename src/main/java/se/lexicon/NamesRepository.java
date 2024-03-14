package se.lexicon;

import java.util.Arrays;

public class NamesRepository {
    public static String[] nameDatabase = new String[0];
    public static void print() {
        //Prints the content of the name Array
        System.out.println();
        for (int i = 0; i < nameDatabase.length; i++) {
            System.out.println(nameDatabase[i]);
        }
    }

    public static String find(final String fullName) {
        //Searches the Array for a name. Returns if found
        for(String name : nameDatabase) {
            if(name.equalsIgnoreCase(fullName)) {
                return name;
            }
        }
        return null;

    }
    public static boolean add(final String fullName) {
        //Adds a name to Array. Returns false if already found.
        String foundFullName = find(fullName);
        if(foundFullName !=null) {
            return false;
        }
        String[] newArray = Arrays.copyOf(nameDatabase, nameDatabase.length + 1);
        newArray[newArray.length - 1] = fullName;
        nameDatabase = newArray;
        return true;
    }
}


