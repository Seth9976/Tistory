package androidx.constraintlayout.core;

interface Pools.Pool {
    Object acquire();

    boolean release(Object arg1);

    void releaseAll(Object[] arg1, int arg2);
}

