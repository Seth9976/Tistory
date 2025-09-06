package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;

public final class d2 {
    public int[] a;
    public ArrayList b;

    public final void a(c2 c20) {
        if(this.b == null) {
            this.b = new ArrayList();
        }
        int v = this.b.size();
        for(int v1 = 0; v1 < v; ++v1) {
            c2 c21 = (c2)this.b.get(v1);
            if(c21.a == c20.a) {
                this.b.remove(v1);
            }
            if(c21.a >= c20.a) {
                this.b.add(v1, c20);
                return;
            }
        }
        this.b.add(c20);
    }

    public final void b() {
        int[] arr_v = this.a;
        if(arr_v != null) {
            Arrays.fill(arr_v, -1);
        }
        this.b = null;
    }

    public final void c(int v) {
        int[] arr_v = this.a;
        if(arr_v == null) {
            int[] arr_v1 = new int[Math.max(v, 10) + 1];
            this.a = arr_v1;
            Arrays.fill(arr_v1, -1);
            return;
        }
        if(v >= arr_v.length) {
            int v1;
            for(v1 = arr_v.length; v1 <= v; v1 *= 2) {
            }
            int[] arr_v2 = new int[v1];
            this.a = arr_v2;
            System.arraycopy(arr_v, 0, arr_v2, 0, arr_v.length);
            Arrays.fill(this.a, arr_v.length, this.a.length, -1);
        }
    }

    public final void d(int v) {
        ArrayList arrayList0 = this.b;
        if(arrayList0 != null) {
            for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
                if(((c2)this.b.get(v1)).a >= v) {
                    this.b.remove(v1);
                }
            }
        }
        this.g(v);
    }

    public final c2 e(int v, int v1, int v2) {
        ArrayList arrayList0 = this.b;
        if(arrayList0 == null) {
            return null;
        }
        int v3 = arrayList0.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            c2 c20 = (c2)this.b.get(v4);
            int v5 = c20.a;
            if(v5 >= v1) {
                return null;
            }
            if(v5 >= v && (v2 == 0 || c20.b == v2 || c20.d)) {
                return c20;
            }
        }
        return null;
    }

    public final c2 f(int v) {
        ArrayList arrayList0 = this.b;
        if(arrayList0 == null) {
            return null;
        }
        for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
            c2 c20 = (c2)this.b.get(v1);
            if(c20.a == v) {
                return c20;
            }
        }
        return null;
    }

    public final int g(int v) {
        int v3;
        int[] arr_v = this.a;
        if(arr_v == null) {
            return -1;
        }
        if(v >= arr_v.length) {
            return -1;
        }
        if(this.b == null) {
            v3 = -1;
        }
        else {
            c2 c20 = this.f(v);
            if(c20 != null) {
                this.b.remove(c20);
            }
            int v1 = this.b.size();
            int v2;
            for(v2 = 0; true; ++v2) {
                if(v2 >= v1) {
                    v2 = -1;
                    break;
                }
                if(((c2)this.b.get(v2)).a >= v) {
                    break;
                }
            }
            if(v2 == -1) {
                v3 = -1;
            }
            else {
                c2 c21 = (c2)this.b.get(v2);
                this.b.remove(v2);
                v3 = c21.a;
            }
        }
        if(v3 == -1) {
            Arrays.fill(this.a, v, this.a.length, -1);
            return this.a.length;
        }
        int v4 = Math.min(v3 + 1, this.a.length);
        Arrays.fill(this.a, v, v4, -1);
        return v4;
    }

    public final void h(int v, int v1) {
        if(this.a != null && v < this.a.length) {
            int v2 = v + v1;
            this.c(v2);
            System.arraycopy(this.a, v, this.a, v2, this.a.length - v - v1);
            Arrays.fill(this.a, v, v2, -1);
            ArrayList arrayList0 = this.b;
            if(arrayList0 != null) {
                for(int v3 = arrayList0.size() - 1; v3 >= 0; --v3) {
                    c2 c20 = (c2)this.b.get(v3);
                    int v4 = c20.a;
                    if(v4 >= v) {
                        c20.a = v4 + v1;
                    }
                }
            }
        }
    }

    public final void i(int v, int v1) {
        if(this.a != null && v < this.a.length) {
            int v2 = v + v1;
            this.c(v2);
            System.arraycopy(this.a, v2, this.a, v, this.a.length - v - v1);
            Arrays.fill(this.a, this.a.length - v1, this.a.length, -1);
            ArrayList arrayList0 = this.b;
            if(arrayList0 != null) {
                for(int v3 = arrayList0.size() - 1; v3 >= 0; --v3) {
                    c2 c20 = (c2)this.b.get(v3);
                    int v4 = c20.a;
                    if(v4 >= v) {
                        if(v4 < v2) {
                            this.b.remove(v3);
                        }
                        else {
                            c20.a = v4 - v1;
                        }
                    }
                }
            }
        }
    }
}

