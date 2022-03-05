package collection_review.candidate_manager.service;

public interface IService <E>{
    void add(E object);
    void edit();
    void remove();
    void display();
    boolean searchByName(String name);

}
