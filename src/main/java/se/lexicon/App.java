package se.lexicon;
class App {


    public static void main(String[] args) {
        NamesRepository.add("Erik Svensson");
        NamesRepository.add("John Doe");
        NamesRepository.print();
        NamesRepository.add("John Doe");
        NamesRepository.print();
        NamesRepository.print(NamesRepository.findByFirstName("Erik"));
        NamesRepository.print(NamesRepository.findByLastName("Doe"));
        NamesRepository.update("James Dean","Jimmy Dean");
        NamesRepository.update("Erik Svensson","John Doe");
        NamesRepository.update("John Doe","James Dean");
        NamesRepository.print();

    }
}


