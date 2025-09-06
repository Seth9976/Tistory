package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b3 extends ByteString {
    public final int d;
    public final ByteString e;
    public final ByteString f;
    public final int g;
    public final int h;
    public static final int[] i;

    static {
        b3.i = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 0x90, 0xE9, 377, 610, 987, 0x63D, 0xA18, 0x1055, 6765, 10946, 0x452F, 0x6FF1, 0xB520, 75025, 0x1DA31, 0x2FF42, 0x4D973, 0x7D8B5, 832040, 0x148ADD, 0x213D05, 0x35C7E2, 0x5704E7, 0x8CCCC9, 0xE3D1B0, 0x1709E79, 0x2547029, 0x3C50EA2, 102334155, 165580141, 0xFF80C38, 0x19D699A5, 701408733, 1134903170, 0x6D73E55F, 0x7FFFFFFF};
    }

    public b3(ByteString byteString0, ByteString byteString1) {
        this.e = byteString0;
        this.f = byteString1;
        int v = byteString0.size();
        this.g = v;
        this.d = byteString1.size() + v;
        this.h = Math.max(byteString0.getTreeDepth(), byteString1.getTreeDepth()) + 1;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.toByteArray()).asReadOnlyBuffer();
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        p p1;
        List list0 = new ArrayList();
        ArrayDeque arrayDeque0 = new ArrayDeque(this.h);
        arrayDeque0.push(this);
        ByteString byteString0;
        for(byteString0 = this.e; byteString0 instanceof b3; byteString0 = ((b3)byteString0).e) {
            arrayDeque0.push(((b3)byteString0));
        }
        for(p p0 = (p)byteString0; p0 != null; p0 = p1) {
            do {
                if(arrayDeque0.isEmpty()) {
                    p1 = null;
                    break;
                }
                ByteString byteString1;
                for(byteString1 = ((b3)arrayDeque0.pop()).f; byteString1 instanceof b3; byteString1 = ((b3)byteString1).e) {
                    arrayDeque0.push(((b3)byteString1));
                }
                p1 = (p)byteString1;
            }
            while(p1.isEmpty());
            ((ArrayList)list0).add(p0.asReadOnlyByteBuffer());
        }
        return list0;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final byte byteAt(int v) {
        ByteString.b(v, this.d);
        return this.e(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer0) {
        this.e.copyTo(byteBuffer0);
        this.f.copyTo(byteBuffer0);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final void copyToInternal(byte[] arr_b, int v, int v1, int v2) {
        ByteString byteString0 = this.e;
        int v3 = this.g;
        if(v + v2 <= v3) {
            byteString0.copyToInternal(arr_b, v, v1, v2);
            return;
        }
        ByteString byteString1 = this.f;
        if(v >= v3) {
            byteString1.copyToInternal(arr_b, v - v3, v1, v2);
            return;
        }
        int v4 = v3 - v;
        byteString0.copyToInternal(arr_b, v, v1, v4);
        byteString1.copyToInternal(arr_b, 0, v1 + v4, v2 - v4);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final byte e(int v) {
        return v >= this.g ? this.f.e(v - this.g) : this.e.e(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof ByteString)) {
            return false;
        }
        int v = this.d;
        if(v != ((ByteString)object0).size()) {
            return false;
        }
        if(v == 0) {
            return true;
        }
        int v1 = this.peekCachedHashCode();
        int v2 = ((ByteString)object0).peekCachedHashCode();
        if(v1 != 0 && v2 != 0 && v1 != v2) {
            return false;
        }
        z2 z20 = new z2(this);
        p p0 = z20.a();
        z2 z21 = new z2(((ByteString)object0));
        p p1 = z21.a();
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        while(true) {
            int v6 = p0.size() - v3;
            int v7 = p1.size() - v4;
            int v8 = Math.min(v6, v7);
            if(!(v3 == 0 ? p0.h(p1, v4, v8) : p1.h(p0, v3, v8))) {
                return false;
            }
            v5 += v8;
            if(v5 >= v) {
                if(v5 != v) {
                    throw new IllegalStateException();
                }
                return true;
            }
            if(v8 == v6) {
                p0 = z20.a();
                v3 = 0;
            }
            else {
                v3 += v8;
            }
            if(v8 == v7) {
                p1 = z21.a();
                v4 = 0;
            }
            else {
                v4 += v8;
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final void g(ByteOutput byteOutput0) {
        this.e.g(byteOutput0);
        this.f.g(byteOutput0);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final int getTreeDepth() {
        return this.h;
    }

    public static int h(int v) {
        return v < 0x2F ? b3.i[v] : 0x7FFFFFFF;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final boolean isBalanced() {
        int v = b3.h(this.h);
        return this.d >= v;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final boolean isValidUtf8() {
        int v = this.e.partialIsValidUtf8(0, 0, this.g);
        return this.f.partialIsValidUtf8(v, 0, this.f.size()) == 0;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final ByteIterator iterator() {
        return new y2(this);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final Iterator iterator() {
        return new y2(this);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.b(this.asReadOnlyByteBufferList(), true);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final InputStream newInput() {
        return new a3(this);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final int partialHash(int v, int v1, int v2) {
        ByteString byteString0 = this.e;
        int v3 = this.g;
        if(v1 + v2 <= v3) {
            return byteString0.partialHash(v, v1, v2);
        }
        return v1 < v3 ? this.f.partialHash(byteString0.partialHash(v, v1, v3 - v1), 0, v2 - (v3 - v1)) : this.f.partialHash(v, v1 - v3, v2);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final int partialIsValidUtf8(int v, int v1, int v2) {
        ByteString byteString0 = this.e;
        int v3 = this.g;
        if(v1 + v2 <= v3) {
            return byteString0.partialIsValidUtf8(v, v1, v2);
        }
        return v1 < v3 ? this.f.partialIsValidUtf8(byteString0.partialIsValidUtf8(v, v1, v3 - v1), 0, v2 - (v3 - v1)) : this.f.partialIsValidUtf8(v, v1 - v3, v2);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final int size() {
        return this.d;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final ByteString substring(int v, int v1) {
        int v2 = this.d;
        int v3 = ByteString.c(v, v1, v2);
        if(v3 == 0) {
            return ByteString.EMPTY;
        }
        if(v3 == v2) {
            return this;
        }
        ByteString byteString0 = this.e;
        int v4 = this.g;
        if(v1 <= v4) {
            return byteString0.substring(v, v1);
        }
        ByteString byteString1 = this.f;
        return v >= v4 ? byteString1.substring(v - v4, v1 - v4) : new b3(byteString0.substring(v), byteString1.substring(0, v1 - v4));
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final String toStringInternal(Charset charset0) {
        return new String(this.toByteArray(), charset0);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final void writeTo(OutputStream outputStream0) {
        this.e.writeTo(outputStream0);
        this.f.writeTo(outputStream0);
    }
}

