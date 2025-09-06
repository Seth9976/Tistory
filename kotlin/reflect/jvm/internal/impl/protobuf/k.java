package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.datastore.preferences.protobuf.a3;
import androidx.datastore.preferences.protobuf.z2;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class k extends ByteString {
    public final int a;
    public final ByteString b;
    public final ByteString c;
    public final int d;
    public final int e;
    public int f;
    public static final int[] g;

    static {
        ArrayList arrayList0 = new ArrayList();
        int v = 1;
        for(int v1 = 1; v1 > 0; v1 = v2) {
            arrayList0.add(v1);
            int v2 = v + v1;
            v = v1;
        }
        arrayList0.add(0x7FFFFFFF);
        k.g = new int[arrayList0.size()];
        for(int v3 = 0; true; ++v3) {
            int[] arr_v = k.g;
            if(v3 >= arr_v.length) {
                break;
            }
            arr_v[v3] = (int)(((Integer)arrayList0.get(v3)));
        }
    }

    public k(ByteString byteString0, ByteString byteString1) {
        this.f = 0;
        this.b = byteString0;
        this.c = byteString1;
        int v = byteString0.size();
        this.d = v;
        this.a = byteString1.size() + v;
        this.e = Math.max(byteString0.getTreeDepth(), byteString1.getTreeDepth()) + 1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void b(OutputStream outputStream0, int v, int v1) {
        ByteString byteString0 = this.b;
        int v2 = this.d;
        if(v + v1 <= v2) {
            byteString0.b(outputStream0, v, v1);
            return;
        }
        ByteString byteString1 = this.c;
        if(v >= v2) {
            byteString1.b(outputStream0, v - v2, v1);
            return;
        }
        int v3 = v2 - v;
        byteString0.b(outputStream0, v, v3);
        byteString1.b(outputStream0, 0, v1 - v3);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void copyToInternal(byte[] arr_b, int v, int v1, int v2) {
        ByteString byteString0 = this.b;
        int v3 = this.d;
        if(v + v2 <= v3) {
            byteString0.copyToInternal(arr_b, v, v1, v2);
            return;
        }
        ByteString byteString1 = this.c;
        if(v >= v3) {
            byteString1.copyToInternal(arr_b, v - v3, v1, v2);
            return;
        }
        int v4 = v3 - v;
        byteString0.copyToInternal(arr_b, v, v1, v4);
        byteString1.copyToInternal(arr_b, 0, v1 + v4, v2 - v4);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof ByteString)) {
            return false;
        }
        int v = this.a;
        if(v != ((ByteString)object0).size()) {
            return false;
        }
        if(v == 0) {
            return true;
        }
        if(this.f != 0) {
            int v1 = ((ByteString)object0).peekCachedHashCode();
            if(v1 != 0 && this.f != v1) {
                return false;
            }
        }
        z2 z20 = new z2(this);
        i i0 = z20.b();
        z2 z21 = new z2(((ByteString)object0));
        i i1 = z21.b();
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        while(true) {
            int v5 = i0.a.length - v2;
            int v6 = i1.a.length - v3;
            int v7 = Math.min(v5, v6);
            if(!(v2 == 0 ? i0.c(i1, v3, v7) : i1.c(i0, v2, v7))) {
                return false;
            }
            v4 += v7;
            if(v4 >= v) {
                if(v4 != v) {
                    throw new IllegalStateException();
                }
                return true;
            }
            if(v7 == v5) {
                i0 = z20.b();
                v2 = 0;
            }
            else {
                v2 += v7;
            }
            if(v7 == v6) {
                i1 = z21.b();
                v3 = 0;
            }
            else {
                v3 += v7;
            }
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int getTreeDepth() {
        return this.e;
    }

    @Override
    public final int hashCode() {
        int v = this.f;
        if(v == 0) {
            v = this.partialHash(this.a, 0, this.a);
            if(v == 0) {
                v = 1;
            }
            this.f = v;
        }
        return v;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean isBalanced() {
        return this.a >= k.g[this.e];
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean isValidUtf8() {
        int v = this.b.partialIsValidUtf8(0, 0, this.d);
        return this.c.partialIsValidUtf8(v, 0, this.c.size()) == 0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final Iterator iterator() {
        return new j(this);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final ByteIterator iterator() {
        return new j(this);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(new a3(this));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int partialHash(int v, int v1, int v2) {
        ByteString byteString0 = this.b;
        int v3 = this.d;
        if(v1 + v2 <= v3) {
            return byteString0.partialHash(v, v1, v2);
        }
        return v1 < v3 ? this.c.partialHash(byteString0.partialHash(v, v1, v3 - v1), 0, v2 - (v3 - v1)) : this.c.partialHash(v, v1 - v3, v2);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int partialIsValidUtf8(int v, int v1, int v2) {
        ByteString byteString0 = this.b;
        int v3 = this.d;
        if(v1 + v2 <= v3) {
            return byteString0.partialIsValidUtf8(v, v1, v2);
        }
        return v1 < v3 ? this.c.partialIsValidUtf8(byteString0.partialIsValidUtf8(v, v1, v3 - v1), 0, v2 - (v3 - v1)) : this.c.partialIsValidUtf8(v, v1 - v3, v2);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int peekCachedHashCode() {
        return this.f;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int size() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final String toString(String s) {
        return new String(this.toByteArray(), s);
    }
}

