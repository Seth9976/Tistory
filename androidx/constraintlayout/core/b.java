package androidx.constraintlayout.core;

public final class b implements Pools.Pool {
    public final Object[] a;
    public int b;

    public b() {
        this.a = new Object[0x100];
    }

    @Override  // androidx.constraintlayout.core.Pools$Pool
    public final Object acquire() {
        int v = this.b;
        if(v > 0) {
            Object object0 = this.a[v - 1];
            this.a[v - 1] = null;
            this.b = v - 1;
            return object0;
        }
        return null;
    }

    @Override  // androidx.constraintlayout.core.Pools$Pool
    public final boolean release(Object object0) {
        int v = this.b;
        Object[] arr_object = this.a;
        if(v < arr_object.length) {
            arr_object[v] = object0;
            this.b = v + 1;
            return true;
        }
        return false;
    }

    @Override  // androidx.constraintlayout.core.Pools$Pool
    public final void releaseAll(Object[] arr_object, int v) {
        if(v > arr_object.length) {
            v = arr_object.length;
        }
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            int v2 = this.b;
            Object[] arr_object1 = this.a;
            if(v2 < arr_object1.length) {
                arr_object1[v2] = object0;
                this.b = v2 + 1;
            }
        }
    }
}

