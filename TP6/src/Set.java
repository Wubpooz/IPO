public interface Set {
    boolean contains(int x);
    int cardinal();
    String toString();
    void add(int x);
    void remove(int x);
    Set clone();
    Set union(Set B);
    Set intersection(Set B);

    int get(int i);
}
