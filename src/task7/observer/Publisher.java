package task7.observer;

public interface Publisher {

    Observer sendOffer(String companyName, String job, int salary);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

}
