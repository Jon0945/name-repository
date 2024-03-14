package se.lexicon;
class App {


    public static void main(String[] args) {
        NamesRepository.add("Erik Svensson");
        NamesRepository.add("John Doe");
        NamesRepository.add("James Dean");
        NamesRepository.print();
        NamesRepository.remove("Test Testsson");
        NamesRepository.remove("John Doe");
        NamesRepository.print();


    }
}


