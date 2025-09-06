package io.reactivex.internal.util;

public final class OpenHashSet {
    public final float a;
    public int b;
    public int c;
    public int d;
    public Object[] e;

    public OpenHashSet() {
        this(16, 0.75f);
    }

    public OpenHashSet(int v) {
        this(v, 0.75f);
    }

    public OpenHashSet(int v, float f) {
        this.a = f;
        int v1 = Pow2.roundToPowerOfTwo(v);
        this.b = v1 - 1;
        this.d = (int)(f * ((float)v1));
        this.e = new Object[v1];
    }

    public final void a(int v, int v1, Object[] arr_object) {
        --this.c;
        while(true) {
            int v2 = v + 1;
        label_2:
            int v3 = v2 & v1;
            Object object0 = arr_object[v3];
            if(object0 == null) {
                break;
            }
            int v4 = object0.hashCode();
            int v5 = (v4 * -1640531527 ^ v4 * -1640531527 >>> 16) & v1;
            if(v <= v3) {
                if(v < v5 && v5 <= v3) {
                    v2 = v3 + 1;
                    goto label_2;
                }
                else {
                    arr_object[v] = object0;
                    v = v3;
                    continue;
                }
                goto label_10;
            }
            else {
            label_10:
                if(v >= v5 && v5 > v3) {
                    arr_object[v] = object0;
                    v = v3;
                    continue;
                }
                v2 = v3 + 1;
                goto label_2;
            }
            arr_object[v] = object0;
            v = v3;
        }
        arr_object[v] = null;
    }

    public boolean add(Object object0) {
        Object object3;
        Object[] arr_object = this.e;
        int v = this.b;
        int v1 = object0.hashCode();
        int v2 = (v1 * -1640531527 ^ v1 * -1640531527 >>> 16) & v;
        Object object1 = arr_object[v2];
        if(object1 != null) {
            if(object1.equals(object0)) {
                return false;
            }
            while(true) {
                v2 = v2 + 1 & v;
                Object object2 = arr_object[v2];
                if(object2 == null) {
                    break;
                }
                if(object2.equals(object0)) {
                    return false;
                }
            }
        }
        arr_object[v2] = object0;
        int v3 = this.c + 1;
        this.c = v3;
        if(v3 >= this.d) {
            Object[] arr_object1 = this.e;
            int v4 = arr_object1.length;
            int v5 = v4 << 1;
            Object[] arr_object2 = new Object[v5];
            while(v3 != 0) {
                do {
                    --v4;
                    object3 = arr_object1[v4];
                }
                while(object3 == null);
                int v6 = object3.hashCode();
                int v7 = (v6 * -1640531527 ^ v6 * -1640531527 >>> 16) & v5 - 1;
                if(arr_object2[v7] != null) {
                    while(true) {
                        v7 = v7 + 1 & v5 - 1;
                        if(arr_object2[v7] == null) {
                            break;
                        }
                    }
                }
                arr_object2[v7] = arr_object1[v4];
                --v3;
            }
            this.b = v5 - 1;
            this.d = (int)(((float)v5) * this.a);
            this.e = arr_object2;
        }
        return true;
    }

    public Object[] keys() {
        return this.e;
    }

    public boolean remove(Object object0) {
        Object[] arr_object = this.e;
        int v = this.b;
        int v1 = object0.hashCode();
        int v2 = (v1 * -1640531527 ^ v1 * -1640531527 >>> 16) & v;
        Object object1 = arr_object[v2];
        if(object1 == null) {
            return false;
        }
        if(object1.equals(object0)) {
            this.a(v2, v, arr_object);
            return true;
        }
        do {
            v2 = v2 + 1 & v;
            Object object2 = arr_object[v2];
            if(object2 == null) {
                return false;
            }
        }
        while(!object2.equals(object0));
        this.a(v2, v, arr_object);
        return true;
    }

    public int size() {
        return this.c;
    }
}

