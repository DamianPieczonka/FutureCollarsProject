package com.futurecollars.Collections2Task4;

public class Pair<K, V> {
    private final K left;
    private final V right;

    private Pair(K left, V right) {
        this.left = left;
        this.right = right;
    }

    public static <U, V> Pair<U, V> of(U a, V b) {
        return new Pair<>(a, b);
    }

    public K getLeft() {
        return left;
    }

    public V getRight() {
        return right;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) o;
        if (!left.equals(pair.left)) {
            return false;
        }
        return right.equals(pair.right);
    }

    public int hashCode() {
        return 31 * left.hashCode() + right.hashCode();
    }

    public String toString() {
        return "(" + left + ", " + right + ")";
    }
}
