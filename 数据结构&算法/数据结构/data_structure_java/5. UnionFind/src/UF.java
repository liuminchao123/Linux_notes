public interface UF {

    int getSize();
    // p q 是否相连
    boolean isCounected(int p, int q);
    // 是否包含元素 p q
    void unionElements(int p, int q);
}
