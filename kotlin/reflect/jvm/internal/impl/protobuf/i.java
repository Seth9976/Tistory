package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.util.Iterator;
import r0.a;

public class i extends ByteString {
    public final byte[] a;
    public int b;

    public i(byte[] arr_b) {
        this.b = 0;
        this.a = arr_b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void b(OutputStream outputStream0, int v, int v1) {
        outputStream0.write(this.a, v, v1);
    }

    public final boolean c(i i0, int v, int v1) {
        byte[] arr_b = i0.a;
        byte[] arr_b1 = this.a;
        if(v1 > arr_b.length) {
            throw new IllegalArgumentException("Length too large: " + v1 + arr_b1.length);
        }
        byte[] arr_b2 = i0.a;
        if(v + v1 > arr_b.length) {
            throw new IllegalArgumentException("Ran off end of other: " + v + ", " + v1 + ", " + arr_b2.length);
        }
        int v2 = 0;
        while(v2 < v1) {
            if(arr_b1[v2] != arr_b2[v]) {
                return false;
            }
            ++v2;
            ++v;
        }
        return true;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public void copyToInternal(byte[] arr_b, int v, int v1, int v2) {
        System.arraycopy(this.a, v, arr_b, v1, v2);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof ByteString)) {
            return false;
        }
        if(this.size() != ((ByteString)object0).size()) {
            return false;
        }
        if(this.size() == 0) {
            return true;
        }
        if(object0 instanceof i) {
            return this.c(((i)object0), 0, this.size());
        }
        if(object0 instanceof k) {
            return object0.equals(this);
        }
        String s = String.valueOf(object0.getClass());
        throw new IllegalArgumentException(a.o(new StringBuilder(s.length() + 49), "Has a new type of ByteString been created? Found ", s));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int getTreeDepth() {
        return 0;
    }

    @Override
    public final int hashCode() {
        int v = this.b;
        if(v == 0) {
            int v1 = this.size();
            v = this.partialHash(v1, 0, v1);
            if(v == 0) {
                v = 1;
            }
            this.b = v;
        }
        return v;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean isBalanced() {
        return true;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean isValidUtf8() {
        return o.c(this.a, 0, this.a.length) == 0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public Iterator iterator() {
        return new h(this);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public ByteIterator iterator() {
        return new h(this);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        CodedInputStream codedInputStream0 = new CodedInputStream(this);
        try {
            codedInputStream0.pushLimit(this.size());
            return codedInputStream0;
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            throw new IllegalArgumentException(invalidProtocolBufferException0);
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int partialHash(int v, int v1, int v2) {
        for(int v3 = v1; v3 < v1 + v2; ++v3) {
            v = v * 0x1F + this.a[v3];
        }
        return v;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int partialIsValidUtf8(int v, int v1, int v2) {
        int v8;
        int v7;
        int v3 = v2 + v1;
        byte[] arr_b = this.a;
        if(v != 0) {
            if(v1 < v3) {
                if(((byte)v) < 0xFFFFFFE0) {
                    if(((byte)v) >= -62) {
                        return arr_b[v1] > -65 ? -1 : o.c(arr_b, v1 + 1, v3);
                    }
                }
                else if(((byte)v) < -16) {
                    int v4 = (byte)(~(v >> 8));
                    if(v4 == 0) {
                        int v5 = arr_b[v1];
                        if(v1 + 1 >= v3) {
                            return o.a(((byte)v), v5);
                        }
                        ++v1;
                        v4 = v5;
                    }
                    if(v4 <= -65 && (((byte)v) != 0xFFFFFFE0 || v4 >= 0xFFFFFFA0) && (((byte)v) != -19 || v4 < 0xFFFFFFA0)) {
                        return arr_b[v1] <= -65 ? o.c(arr_b, v1 + 1, v3) : -1;
                    }
                }
                else {
                    int v6 = (byte)(~(v >> 8));
                    if(v6 == 0) {
                        v7 = v1 + 1;
                        v6 = arr_b[v1];
                        if(v7 >= v3) {
                            return o.a(((byte)v), v6);
                        }
                        v8 = 0;
                    }
                    else {
                        v8 = (byte)(v >> 16);
                        v7 = v1;
                    }
                    if(v8 == 0) {
                        int v9 = arr_b[v7];
                        if(v7 + 1 >= v3) {
                            return ((byte)v) > -12 || v6 > -65 || v9 > -65 ? -1 : v9 << 16 ^ (v6 << 8 ^ ((byte)v));
                        }
                        v8 = v9;
                        ++v7;
                    }
                    if(v6 <= -65 && v6 + 0x70 + (((byte)v) << 28) >> 30 == 0 && v8 <= -65) {
                        return arr_b[v7] > -65 ? -1 : o.c(arr_b, v7 + 1, v3);
                    }
                }
                return -1;
            }
            return v;
        }
        return o.c(arr_b, v1, v3);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int peekCachedHashCode() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.a.length;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final String toString(String s) {
        return new String(this.a, 0, this.a.length, s);
    }
}

