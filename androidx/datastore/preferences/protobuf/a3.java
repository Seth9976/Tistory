package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.util.Iterator;
import jeb.synthetic.FIN;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.k;

public final class a3 extends InputStream {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Iterator f;
    public Iterable g;
    public final Iterable h;

    public a3(b3 b30) {
        this.a = 0;
        this.h = b30;
        super();
        z2 z20 = new z2(b30);
        this.f = z20;
        p p0 = z20.a();
        this.g = p0;
        this.b = p0.size();
        this.c = 0;
        this.d = 0;
    }

    public a3(k k0) {
        this.a = 1;
        this.h = k0;
        super();
        z2 z20 = new z2(k0);
        this.f = z20;
        i i0 = z20.b();
        this.g = i0;
        this.b = i0.a.length;
        this.c = 0;
        this.d = 0;
    }

    public final void a() {
        if(this.a != 0) {
            if(((i)this.g) != null) {
                int v = this.b;
                if(this.c == v) {
                    this.d += v;
                    this.c = 0;
                    if(((z2)this.f).hasNext()) {
                        i i0 = ((z2)this.f).b();
                        this.g = i0;
                        this.b = i0.a.length;
                        return;
                    }
                    this.g = null;
                    this.b = 0;
                }
            }
            return;
        }
        if(((p)this.g) != null) {
            int v1 = this.b;
            if(this.c == v1) {
                this.d += v1;
                this.c = 0;
                if(((z2)this.f).hasNext()) {
                    p p0 = ((z2)this.f).a();
                    this.g = p0;
                    this.b = p0.size();
                    return;
                }
                this.g = null;
                this.b = 0;
            }
        }
    }

    @Override
    public final int available() {
        return this.a == 0 ? ((b3)this.h).d - (this.d + this.c) : ((k)this.h).a - (this.d + this.c);
    }

    public final int b(byte[] arr_b, int v, int v1) {
        if(this.a != 0) {
            int v2;
            for(v2 = v1; v2 > 0; v2 -= v3) {
                this.a();
                if(((i)this.g) == null) {
                    return v2 == v1 ? -1 : v1 - v2;
                }
                int v3 = Math.min(this.b - this.c, v2);
                if(arr_b != null) {
                    ((i)this.g).copyTo(arr_b, this.c, v, v3);
                    v += v3;
                }
                this.c += v3;
            }
            return v1 - v2;
        }
        int v4;
        for(v4 = v1; v4 > 0; v4 -= v5) {
            this.a();
            if(((p)this.g) == null) {
                break;
            }
            int v5 = Math.min(this.b - this.c, v4);
            if(arr_b != null) {
                ((p)this.g).copyTo(arr_b, this.c, v, v5);
                v += v5;
            }
            this.c += v5;
        }
        return v1 - v4;
    }

    @Override
    public final void mark(int v) {
        if(this.a != 0) {
            this.e = this.d + this.c;
            return;
        }
        this.e = this.d + this.c;
    }

    @Override
    public final boolean markSupported() {
        return true;
    }

    @Override
    public final int read() {
        if(this.a != 0) {
            this.a();
            i i0 = (i)this.g;
            if(i0 == null) {
                return -1;
            }
            int v = this.c;
            this.c = v + 1;
            return i0.a[v] & 0xFF;
        }
        this.a();
        p p0 = (p)this.g;
        if(p0 == null) {
            return -1;
        }
        int v1 = this.c;
        this.c = v1 + 1;
        return p0.byteAt(v1) & 0xFF;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        if(this.a != 0) {
            arr_b.getClass();
            if(v < 0 || v1 < 0 || v1 > arr_b.length - v) {
                throw new IndexOutOfBoundsException();
            }
            return this.b(arr_b, v, v1);
        }
        arr_b.getClass();
        if(v < 0 || v1 < 0 || v1 > arr_b.length - v) {
            throw new IndexOutOfBoundsException();
        }
        int v2 = this.b(arr_b, v, v1);
        return v2 != 0 || v1 <= 0 && ((b3)this.h).d - (this.d + this.c) != 0 ? v2 : -1;
    }

    @Override
    public final void reset() {
        int v1;
        synchronized(this) {
            if(this.a != 0) {
                z2 z20 = new z2(((k)this.h));
                this.f = z20;
                i i0 = z20.b();
                this.g = i0;
                this.b = i0.a.length;
                this.c = 0;
                this.d = 0;
                this.b(null, 0, this.e);
                return;
            }
            v1 = FIN.finallyOpen$NT();
            z2 z21 = new z2(((b3)this.h));
            this.f = z21;
            p p0 = z21.a();
            this.g = p0;
            this.b = p0.size();
            this.c = 0;
            this.d = 0;
            this.b(null, 0, this.e);
            FIN.finallyCodeBegin$NT(v1);
        }
        FIN.finallyCodeEnd$NT(v1);
    }

    @Override
    public final long skip(long v) {
        if(this.a != 0) {
            if(v < 0L) {
                throw new IndexOutOfBoundsException();
            }
            if(v > 0x7FFFFFFFL) {
                v = 0x7FFFFFFFL;
            }
            return (long)this.b(null, 0, ((int)v));
        }
        if(v < 0L) {
            throw new IndexOutOfBoundsException();
        }
        if(v > 0x7FFFFFFFL) {
            v = 0x7FFFFFFFL;
        }
        return (long)this.b(null, 0, ((int)v));
    }
}

