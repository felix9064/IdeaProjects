package com.felix.crazyjava.item0604;

/**
 * Created with IntelliJ IDEA.
 * Description: 将经常使用的不可变类的实例缓存起来，提高系统性能
 * Author: Felix
 * Date: 2017/3/28
 * Time: 14:21
 */
public class CacheImmutableTest {

    public static void main(String[] args) {
        CacheImmutable c1 = CacheImmutable.valueOf("hello");
        System.out.println(c1);
        CacheImmutable c2 = CacheImmutable.valueOf("hello");
        System.out.println(c1 == c2);
    }

}

class CacheImmutable {
    private static int MAX_SIZE = 10;
    private static CacheImmutable[] cache = new CacheImmutable[MAX_SIZE];

    private static int pos = 0;
    private final String name;

    private CacheImmutable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static CacheImmutable valueOf(String name) {

        for (int i = 0; i < MAX_SIZE; i++) {
            if(cache[i] != null && cache[i].getName().equals(name)) {
                return cache[i];
            }
        }
        if(pos == MAX_SIZE) {
            cache[0] = new CacheImmutable(name);
            pos = 1;
        } else {
            cache[pos++] = new CacheImmutable(name);
        }

        return cache[pos-1];
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == CacheImmutable.class) {
            CacheImmutable ci = (CacheImmutable) obj;
            return name.equals(ci.getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "[CacheImmutable][" + name + "]";
    }
}
