public class Main {
    public static void main(String[] args) {
        Person[] kvartira = new Person[]{new Person(new Kvartira()), new Person(new Kvartira()), new Person(new Kvartira()), new Person(new Kvartira())};
        Person[] gostinitha = new Person[]{new Person(new Gostinitsa()), new Person(new Gostinitsa())};
        Person[] obshejitie = new Person[]{new Person(new Obshejitie()), new Person(new Obshejitie())};
        System.out.printf("Квартирада %s адам жашайт. %s\nГостиницада %s. %s\nОбщежитиеде %s адам.%s\n Баары болуп %s адам бар.",
                kvartira.length, kvartira[0].pay(), gostinitha.length, gostinitha[0].pay(), obshejitie.length, obshejitie[0].pay(),
                kvartira.length + gostinitha.length + obshejitie.length);
    }
}