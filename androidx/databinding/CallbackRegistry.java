package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

public class CallbackRegistry implements Cloneable {
    public static abstract class NotifierCallback {
        public abstract void onNotifyCallback(Object arg1, Object arg2, int arg3, Object arg4);
    }

    public ArrayList a;
    public long b;
    public long[] c;
    public int d;
    public final NotifierCallback e;

    public CallbackRegistry(NotifierCallback callbackRegistry$NotifierCallback0) {
        this.a = new ArrayList();
        this.b = 0L;
        this.e = callbackRegistry$NotifierCallback0;
    }

    public final boolean a(int v) {
        if(v < 0x40) {
            return (1L << v & this.b) != 0L;
        }
        long[] arr_v = this.c;
        if(arr_v == null) {
            return false;
        }
        int v1 = v / 0x40 - 1;
        return v1 < arr_v.length ? (1L << v % 0x40 & arr_v[v1]) != 0L : false;
    }

    public void add(Object object0) {
        synchronized(this) {
            if(object0 != null) {
                int v1 = this.a.lastIndexOf(object0);
                if(v1 < 0 || this.a(v1)) {
                    this.a.add(object0);
                }
                return;
            }
        }
        throw new IllegalArgumentException("callback cannot be null");
    }

    public final void b(Object object0, int v, Object object1, int v1, int v2, long v3) {
        long v4 = 1L;
        while(v1 < v2) {
            if((v3 & v4) == 0L) {
                Object object2 = this.a.get(v1);
                this.e.onNotifyCallback(object2, object0, v, object1);
            }
            v4 <<= 1;
            ++v1;
        }
    }

    public final void c(int v, Object object0, int v1, Object object1) {
        if(v1 < 0) {
            this.b(object0, v, object1, 0, Math.min(0x40, this.a.size()), this.b);
            return;
        }
        long v2 = this.c[v1];
        int v3 = (v1 + 1) * 0x40;
        int v4 = Math.min(this.a.size(), v3 + 0x40);
        this.c(v, object0, v1 - 1, object1);
        this.b(object0, v, object1, v3, v4, v2);
    }

    public void clear() {
        synchronized(this) {
            if(this.d == 0) {
                this.a.clear();
            }
            else if(!this.a.isEmpty()) {
                for(int v1 = this.a.size() - 1; v1 >= 0; --v1) {
                    this.e(v1);
                }
            }
        }
    }

    public CallbackRegistry clone() {
        CloneNotSupportedException cloneNotSupportedException1;
        CallbackRegistry callbackRegistry0;
        synchronized(this) {
            try {
                callbackRegistry0 = (CallbackRegistry)super.clone();
            }
            catch(CloneNotSupportedException cloneNotSupportedException0) {
                cloneNotSupportedException1 = cloneNotSupportedException0;
                cloneNotSupportedException1.printStackTrace();
                return null;
            }
        }
        try {
            callbackRegistry0.b = 0L;
            callbackRegistry0.c = null;
            callbackRegistry0.d = 0;
            callbackRegistry0.a = new ArrayList();
            int v2 = this.a.size();
            for(int v1 = 0; true; ++v1) {
                if(v1 >= v2) {
                    return callbackRegistry0;
                }
                if(!this.a(v1)) {
                    callbackRegistry0.a.add(this.a.get(v1));
                }
            }
        }
        catch(CloneNotSupportedException cloneNotSupportedException1) {
        }
        cloneNotSupportedException1.printStackTrace();
        return callbackRegistry0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    public ArrayList copyCallbacks() {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList(this.a.size());
            int v1 = this.a.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(!this.a(v2)) {
                    arrayList0.add(this.a.get(v2));
                }
            }
            return arrayList0;
        }
    }

    public void copyCallbacks(List list0) {
        synchronized(this) {
            list0.clear();
            int v1 = this.a.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(!this.a(v2)) {
                    list0.add(this.a.get(v2));
                }
            }
        }
    }

    public final void d(int v, long v1) {
        int v2 = v + 0x3F;
        long v3 = 0x8000000000000000L;
        while(v2 >= v) {
            if((v1 & v3) != 0L) {
                this.a.remove(v2);
            }
            v3 >>>= 1;
            --v2;
        }
    }

    public final void e(int v) {
        if(v < 0x40) {
            this.b |= 1L << v;
            return;
        }
        int v1 = v / 0x40 - 1;
        long[] arr_v = this.c;
        if(arr_v == null) {
            this.c = new long[this.a.size() / 0x40];
        }
        else if(arr_v.length <= v1) {
            long[] arr_v1 = new long[this.a.size() / 0x40];
            System.arraycopy(this.c, 0, arr_v1, 0, this.c.length);
            this.c = arr_v1;
        }
        this.c[v1] |= 1L << v % 0x40;
    }

    public boolean isEmpty() {
        synchronized(this) {
            if(this.a.isEmpty()) {
                return true;
            }
            if(this.d == 0) {
                return false;
            }
            int v1 = this.a.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(!this.a(v2)) {
                    return false;
                }
            }
            return true;
        }
    }

    public void notifyCallbacks(Object object0, int v, Object object1) {
        synchronized(this) {
            ++this.d;
            int v2 = this.a.size();
            int v3 = this.c == null ? -1 : this.c.length - 1;
            this.c(v, object0, v3, object1);
            this.b(object0, v, object1, (v3 + 2) * 0x40, v2, 0L);
            int v4 = this.d - 1;
            this.d = v4;
            if(v4 == 0) {
                long[] arr_v = this.c;
                if(arr_v != null) {
                    for(int v5 = arr_v.length - 1; v5 >= 0; --v5) {
                        long v6 = this.c[v5];
                        if(v6 != 0L) {
                            this.d((v5 + 1) * 0x40, v6);
                            this.c[v5] = 0L;
                        }
                    }
                }
                long v7 = this.b;
                if(v7 != 0L) {
                    this.d(0, v7);
                    this.b = 0L;
                }
            }
        }
    }

    public void remove(Object object0) {
        synchronized(this) {
            if(this.d == 0) {
                this.a.remove(object0);
            }
            else {
                int v1 = this.a.lastIndexOf(object0);
                if(v1 >= 0) {
                    this.e(v1);
                }
            }
        }
    }
}

