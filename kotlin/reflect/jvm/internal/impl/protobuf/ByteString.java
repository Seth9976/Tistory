package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.appcompat.view.menu.f;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

public abstract class ByteString implements Iterable {
    public interface ByteIterator extends Iterator {
        byte nextByte();
    }

    public static final class Output extends OutputStream {
        public final int a;
        public final ArrayList b;
        public int c;
        public byte[] d;
        public int e;
        public static final byte[] f;

        static {
            Output.f = new byte[0];
        }

        public Output() {
            this.a = 0x80;
            this.b = new ArrayList();
            this.d = new byte[0x80];
        }

        public final void a(int v) {
            i i0 = new i(this.d);
            this.b.add(i0);
            int v1 = this.c + this.d.length;
            this.c = v1;
            this.d = new byte[Math.max(this.a, Math.max(v, v1 >>> 1))];
            this.e = 0;
        }

        public final void b() {
            int v = this.e;
            byte[] arr_b = this.d;
            ArrayList arrayList0 = this.b;
            if(v >= arr_b.length) {
                arrayList0.add(new i(this.d));
                this.d = Output.f;
            }
            else if(v > 0) {
                byte[] arr_b1 = new byte[v];
                System.arraycopy(arr_b, 0, arr_b1, 0, Math.min(arr_b.length, v));
                arrayList0.add(new i(arr_b1));
            }
            this.c += this.e;
            this.e = 0;
        }

        public int size() {
            synchronized(this) {
            }
            return this.c + this.e;
        }

        public ByteString toByteString() {
            synchronized(this) {
                this.b();
                return ByteString.copyFrom(this.b);
            }
        }

        @Override
        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.size());
        }

        @Override
        public void write(int v) {
            synchronized(this) {
                if(this.e == this.d.length) {
                    this.a(1);
                }
                int v2 = this.e;
                this.e = v2 + 1;
                this.d[v2] = (byte)v;
            }
        }

        @Override
        public void write(byte[] arr_b, int v, int v1) {
            synchronized(this) {
                byte[] arr_b1 = this.d;
                int v3 = this.e;
                if(v1 <= arr_b1.length - v3) {
                    System.arraycopy(arr_b, v, arr_b1, v3, v1);
                    this.e += v1;
                }
                else {
                    int v4 = arr_b1.length - v3;
                    System.arraycopy(arr_b, v, arr_b1, v3, v4);
                    int v5 = v1 - v4;
                    this.a(v5);
                    System.arraycopy(arr_b, v + v4, this.d, 0, v5);
                    this.e = v5;
                }
            }
        }
    }

    public static final ByteString EMPTY;

    static {
        ByteString.EMPTY = new i(new byte[0]);
    }

    public static ByteString a(Iterator iterator0, int v) {
        return v == 1 ? iterator0.next() : ByteString.a(iterator0, v >>> 1).concat(ByteString.a(iterator0, v - (v >>> 1)));
    }

    public abstract void b(OutputStream arg1, int arg2, int arg3);

    public ByteString concat(ByteString byteString0) {
        int v = this.size();
        int v1 = byteString0.size();
        if(((long)v) + ((long)v1) >= 0x7FFFFFFFL) {
            throw new IllegalArgumentException("ByteString would be too long: " + v + "+" + v1);
        }
        k k0 = this instanceof k ? ((k)this) : null;
        if(byteString0.size() == 0) {
            return this;
        }
        if(this.size() != 0) {
            int v2 = byteString0.size() + this.size();
            if(v2 < 0x80) {
                int v3 = this.size();
                int v4 = byteString0.size();
                byte[] arr_b = new byte[v3 + v4];
                this.copyTo(arr_b, 0, 0, v3);
                byteString0.copyTo(arr_b, 0, v3, v4);
                return new i(arr_b);
            }
            if(k0 != null) {
                ByteString byteString1 = k0.c;
                if(byteString0.size() + byteString1.size() < 0x80) {
                    int v5 = byteString1.size();
                    int v6 = byteString0.size();
                    byte[] arr_b1 = new byte[v5 + v6];
                    byteString1.copyTo(arr_b1, 0, 0, v5);
                    byteString0.copyTo(arr_b1, 0, v5, v6);
                    i i0 = new i(arr_b1);
                    return new k(k0.b, i0);
                }
            }
            if(k0 != null) {
                ByteString byteString2 = k0.b;
                int v7 = byteString2.getTreeDepth();
                ByteString byteString3 = k0.c;
                if(v7 > byteString3.getTreeDepth()) {
                    int v8 = byteString0.getTreeDepth();
                    if(k0.e > v8) {
                        return new k(byteString2, new k(byteString3, byteString0));
                    }
                }
            }
            if(v2 >= k.g[Math.max(this.getTreeDepth(), byteString0.getTreeDepth()) + 1]) {
                return new k(this, byteString0);
            }
            f f0 = new f(25);
            f0.c(this);
            f0.c(byteString0);
            Stack stack0 = (Stack)f0.b;
            ByteString byteString4;
            for(byteString4 = (ByteString)stack0.pop(); !stack0.isEmpty(); byteString4 = new k(((ByteString)stack0.pop()), byteString4)) {
            }
            return byteString4;
        }
        return byteString0;
    }

    public static ByteString copyFrom(Iterable iterable0) {
        Collection collection0;
        if(!(iterable0 instanceof Collection)) {
            collection0 = new ArrayList();
            for(Object object0: iterable0) {
                ((ArrayList)collection0).add(((ByteString)object0));
            }
            return collection0.isEmpty() ? ByteString.EMPTY : ByteString.a(collection0.iterator(), collection0.size());
        }
        collection0 = (Collection)iterable0;
        return collection0.isEmpty() ? ByteString.EMPTY : ByteString.a(collection0.iterator(), collection0.size());
    }

    public static ByteString copyFrom(byte[] arr_b) {
        return ByteString.copyFrom(arr_b, 0, arr_b.length);
    }

    public static ByteString copyFrom(byte[] arr_b, int v, int v1) {
        byte[] arr_b1 = new byte[v1];
        System.arraycopy(arr_b, v, arr_b1, 0, v1);
        return new i(arr_b1);
    }

    public static ByteString copyFromUtf8(String s) {
        try {
            return new i(s.getBytes("UTF-8"));
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException("UTF-8 not supported?", unsupportedEncodingException0);
        }
    }

    public void copyTo(byte[] arr_b, int v, int v1, int v2) {
        if(v < 0) {
            throw new IndexOutOfBoundsException("Source offset < 0: " + v);
        }
        if(v1 < 0) {
            throw new IndexOutOfBoundsException("Target offset < 0: " + v1);
        }
        if(v2 < 0) {
            throw new IndexOutOfBoundsException("Length < 0: " + v2);
        }
        int v3 = v + v2;
        if(v3 > this.size()) {
            throw new IndexOutOfBoundsException("Source end offset < 0: " + v3);
        }
        int v4 = v1 + v2;
        if(v4 > arr_b.length) {
            throw new IndexOutOfBoundsException("Target end offset < 0: " + v4);
        }
        if(v2 > 0) {
            this.copyToInternal(arr_b, v, v1, v2);
        }
    }

    public abstract void copyToInternal(byte[] arg1, int arg2, int arg3, int arg4);

    public abstract int getTreeDepth();

    public abstract boolean isBalanced();

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public abstract boolean isValidUtf8();

    @Override
    public Iterator iterator() {
        return this.iterator();
    }

    public abstract ByteIterator iterator();

    public abstract CodedInputStream newCodedInput();

    public static Output newOutput() {
        return new Output();
    }

    public abstract int partialHash(int arg1, int arg2, int arg3);

    public abstract int partialIsValidUtf8(int arg1, int arg2, int arg3);

    public abstract int peekCachedHashCode();

    public abstract int size();

    public byte[] toByteArray() {
        int v = this.size();
        if(v == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] arr_b = new byte[v];
        this.copyToInternal(arr_b, 0, 0, v);
        return arr_b;
    }

    @Override
    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.size());
    }

    public abstract String toString(String arg1) throws UnsupportedEncodingException;

    public String toStringUtf8() {
        try {
            return this.toString("UTF-8");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException("UTF-8 not supported?", unsupportedEncodingException0);
        }
    }
}

