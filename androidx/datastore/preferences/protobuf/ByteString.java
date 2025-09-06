package androidx.datastore.preferences.protobuf;

import a5.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import r0.a;

@CheckReturnValue
public abstract class ByteString implements Serializable, Iterable {
    interface ByteArrayCopier {
        byte[] copyFrom(byte[] arg1, int arg2, int arg3);
    }

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

        public Output(int v) {
            if(v < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.a = v;
            this.b = new ArrayList();
            this.d = new byte[v];
        }

        public final void a(int v) {
            q q0 = new q(this.d);
            this.b.add(q0);
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
                arrayList0.add(new q(this.d));
                this.d = Output.f;
            }
            else if(v > 0) {
                arrayList0.add(new q(Arrays.copyOf(arr_b, v)));
            }
            this.c += this.e;
            this.e = 0;
        }

        public void reset() {
            synchronized(this) {
                this.b.clear();
                this.c = 0;
                this.e = 0;
            }
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

        public void writeTo(OutputStream outputStream0) throws IOException {
            int v2;
            byte[] arr_b;
            ByteString[] arr_byteString;
            synchronized(this) {
                arr_byteString = (ByteString[])this.b.toArray(new ByteString[0]);
                arr_b = this.d;
                v2 = this.e;
            }
            for(int v1 = 0; v1 < arr_byteString.length; ++v1) {
                arr_byteString[v1].writeTo(outputStream0);
            }
            outputStream0.write(Arrays.copyOf(arr_b, v2));
        }
    }

    public static final ByteString EMPTY;
    public int a;
    public static final ByteArrayCopier b;
    public static final l c;

    static {
        ByteString.EMPTY = new q(Internal.EMPTY_BYTE_ARRAY);
        ByteString.b = new n();  // 初始化器: Ljava/lang/Object;-><init>()V
        ByteString.c = new l();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public ByteString() {
        this.a = 0;
    }

    public static ByteString a(Iterator iterator0, int v) {
        if(v < 1) {
            throw new IllegalArgumentException("length (" + v + ") must be >= 1");
        }
        return v == 1 ? iterator0.next() : ByteString.a(iterator0, v >>> 1).concat(ByteString.a(iterator0, v - (v >>> 1)));
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List asReadOnlyByteBufferList();

    public static void b(int v, int v1) {
        if((v1 - (v + 1) | v) < 0) {
            throw v >= 0 ? new ArrayIndexOutOfBoundsException("Index > length: " + v + ", " + v1) : new ArrayIndexOutOfBoundsException("Index < 0: " + v);
        }
    }

    public abstract byte byteAt(int arg1);

    public static int c(int v, int v1, int v2) {
        int v3 = v1 - v;
        if((v | v1 | v3 | v2 - v1) < 0) {
            if(v < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + v + " < 0");
            }
            throw v1 >= v ? new IndexOutOfBoundsException("End index: " + v1 + " >= " + v2) : new IndexOutOfBoundsException("Beginning index larger than ending index: " + v + ", " + v1);
        }
        return v3;
    }

    public final ByteString concat(ByteString byteString0) {
        if(0x7FFFFFFF - this.size() < byteString0.size()) {
            throw new IllegalArgumentException("ByteString would be too long: " + this.size() + "+" + byteString0.size());
        }
        if(byteString0.size() == 0) {
            return this;
        }
        if(this.size() != 0) {
            int v = byteString0.size() + this.size();
            if(v < 0x80) {
                int v1 = this.size();
                int v2 = byteString0.size();
                byte[] arr_b = new byte[v1 + v2];
                this.copyTo(arr_b, 0, 0, v1);
                byteString0.copyTo(arr_b, 0, v1, v2);
                return new q(arr_b);
            }
            if(this instanceof b3) {
                ByteString byteString1 = ((b3)this).f;
                ByteString byteString2 = ((b3)this).e;
                if(byteString0.size() + byteString1.size() < 0x80) {
                    int v3 = byteString1.size();
                    int v4 = byteString0.size();
                    byte[] arr_b1 = new byte[v3 + v4];
                    byteString1.copyTo(arr_b1, 0, 0, v3);
                    byteString0.copyTo(arr_b1, 0, v3, v4);
                    return new b3(byteString2, new q(arr_b1));
                }
                if(byteString2.getTreeDepth() > byteString1.getTreeDepth()) {
                    int v5 = byteString0.getTreeDepth();
                    if(((b3)this).h > v5) {
                        return new b3(byteString2, new b3(byteString1, byteString0));
                    }
                }
            }
            if(v >= b3.h(Math.max(this.getTreeDepth(), byteString0.getTreeDepth()) + 1)) {
                return new b3(this, byteString0);
            }
            b2 b20 = new b2(1);
            b20.a(this);
            b20.a(byteString0);
            ArrayDeque arrayDeque0 = (ArrayDeque)b20.a;
            ByteString byteString3;
            for(byteString3 = (ByteString)arrayDeque0.pop(); !arrayDeque0.isEmpty(); byteString3 = new b3(((ByteString)arrayDeque0.pop()), byteString3)) {
            }
            return byteString3;
        }
        return byteString0;
    }

    public static ByteString copyFrom(Iterable iterable0) {
        int v;
        if(!(iterable0 instanceof Collection)) {
            v = 0;
            Iterator iterator0 = iterable0.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                ++v;
            }
            return v == 0 ? ByteString.EMPTY : ByteString.a(iterable0.iterator(), v);
        }
        v = ((Collection)iterable0).size();
        return v == 0 ? ByteString.EMPTY : ByteString.a(iterable0.iterator(), v);
    }

    public static ByteString copyFrom(String s, String s1) throws UnsupportedEncodingException {
        return new q(s.getBytes(s1));
    }

    public static ByteString copyFrom(String s, Charset charset0) {
        return new q(s.getBytes(charset0));
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer0) {
        return ByteString.copyFrom(byteBuffer0, byteBuffer0.remaining());
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer0, int v) {
        ByteString.c(0, v, byteBuffer0.remaining());
        byte[] arr_b = new byte[v];
        byteBuffer0.get(arr_b);
        return new q(arr_b);
    }

    public static ByteString copyFrom(byte[] arr_b) {
        return ByteString.copyFrom(arr_b, 0, arr_b.length);
    }

    public static ByteString copyFrom(byte[] arr_b, int v, int v1) {
        ByteString.c(v, v + v1, arr_b.length);
        return new q(ByteString.b.copyFrom(arr_b, v, v1));
    }

    public static ByteString copyFromUtf8(String s) {
        return new q(s.getBytes(Internal.a));
    }

    public abstract void copyTo(ByteBuffer arg1);

    public void copyTo(byte[] arr_b, int v) {
        this.copyTo(arr_b, 0, v, this.size());
    }

    @Deprecated
    public final void copyTo(byte[] arr_b, int v, int v1, int v2) {
        ByteString.c(v, v + v2, this.size());
        ByteString.c(v1, v1 + v2, arr_b.length);
        if(v2 > 0) {
            this.copyToInternal(arr_b, v, v1, v2);
        }
    }

    public abstract void copyToInternal(byte[] arg1, int arg2, int arg3, int arg4);

    public static int d(int v, String s) {
        int v2;
        int v1 = s.charAt(v);
        if(v1 >= 0x30 && v1 <= 57) {
            v2 = v1 - 0x30;
        }
        else if(v1 < 65 || v1 > 70) {
            v2 = v1 < 97 || v1 > 102 ? -1 : v1 - 87;
        }
        else {
            v2 = v1 - 55;
        }
        if(v2 != -1) {
            return v2;
        }
        StringBuilder stringBuilder0 = b.v("Invalid hexString ", s, " must only contain [0-9a-fA-F] but contained ");
        stringBuilder0.append(s.charAt(v));
        stringBuilder0.append(" at index ");
        stringBuilder0.append(v);
        throw new NumberFormatException(stringBuilder0.toString());
    }

    public abstract byte e(int arg1);

    public static final ByteString empty() {
        return ByteString.EMPTY;
    }

    public final boolean endsWith(ByteString byteString0) {
        return this.size() >= byteString0.size() && this.substring(this.size() - byteString0.size()).equals(byteString0);
    }

    @Override
    public abstract boolean equals(Object arg1);

    public static p f(ByteBuffer byteBuffer0) {
        if(byteBuffer0.hasArray()) {
            int v = byteBuffer0.arrayOffset();
            return new o(byteBuffer0.array(), byteBuffer0.position() + v, byteBuffer0.remaining());
        }
        return new q2(byteBuffer0);
    }

    public static ByteString fromHex(@CompileTimeConstant String s) {
        if(s.length() % 2 == 0) {
            int v = s.length();
            byte[] arr_b = new byte[v / 2];
            for(int v1 = 0; v1 < v / 2; ++v1) {
                int v2 = ByteString.d(v1 * 2, s);
                arr_b[v1] = (byte)(ByteString.d(v1 * 2 + 1, s) | v2 << 4);
            }
            return new q(arr_b);
        }
        StringBuilder stringBuilder0 = b.v("Invalid hexString ", s, " of length ");
        stringBuilder0.append(s.length());
        stringBuilder0.append(" must be even.");
        throw new NumberFormatException(stringBuilder0.toString());
    }

    public abstract void g(ByteOutput arg1);

    public abstract int getTreeDepth();

    @Override
    public final int hashCode() {
        int v = this.a;
        if(v == 0) {
            int v1 = this.size();
            v = this.partialHash(v1, 0, v1);
            if(v == 0) {
                v = 1;
            }
            this.a = v;
        }
        return v;
    }

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return this.size() == 0;
    }

    public abstract boolean isValidUtf8();

    public ByteIterator iterator() {
        return new k(this);
    }

    @Override
    public Iterator iterator() {
        return this.iterator();
    }

    public abstract CodedInputStream newCodedInput();

    public abstract InputStream newInput();

    public static Output newOutput() {
        return new Output(0x80);
    }

    public static Output newOutput(int v) {
        return new Output(v);
    }

    public abstract int partialHash(int arg1, int arg2, int arg3);

    public abstract int partialIsValidUtf8(int arg1, int arg2, int arg3);

    public final int peekCachedHashCode() {
        return this.a;
    }

    public static ByteString readFrom(InputStream inputStream0) throws IOException {
        return ByteString.readFrom(inputStream0, 0x100, 0x2000);
    }

    public static ByteString readFrom(InputStream inputStream0, int v) throws IOException {
        return ByteString.readFrom(inputStream0, v, v);
    }

    public static ByteString readFrom(InputStream inputStream0, int v, int v1) throws IOException {
        ArrayList arrayList0 = new ArrayList();
        while(true) {
            byte[] arr_b = new byte[v];
            int v2;
            for(v2 = 0; v2 < v; v2 += v3) {
                int v3 = inputStream0.read(arr_b, v2, v - v2);
                if(v3 == -1) {
                    break;
                }
            }
            ByteString byteString0 = v2 == 0 ? null : ByteString.copyFrom(arr_b, 0, v2);
            if(byteString0 == null) {
                break;
            }
            arrayList0.add(byteString0);
            v = Math.min(v * 2, v1);
        }
        return ByteString.copyFrom(arrayList0);
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString0) {
        return this.size() >= byteString0.size() && this.substring(0, byteString0.size()).equals(byteString0);
    }

    public final ByteString substring(int v) {
        return this.substring(v, this.size());
    }

    public abstract ByteString substring(int arg1, int arg2);

    public final byte[] toByteArray() {
        int v = this.size();
        if(v == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] arr_b = new byte[v];
        this.copyToInternal(arr_b, 0, 0, v);
        return arr_b;
    }

    @Override
    public final String toString() {
        String s = this.size() > 50 ? e4.i(this.substring(0, 0x2F)) + "..." : e4.i(this);
        StringBuilder stringBuilder0 = new StringBuilder("<ByteString@");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append(" size=");
        stringBuilder0.append(this.size());
        stringBuilder0.append(" contents=\"");
        return a.o(stringBuilder0, s, "\">");
    }

    public final String toString(String s) throws UnsupportedEncodingException {
        try {
            return this.toString(Charset.forName(s));
        }
        catch(UnsupportedCharsetException unsupportedCharsetException0) {
            UnsupportedEncodingException unsupportedEncodingException0 = new UnsupportedEncodingException(s);
            unsupportedEncodingException0.initCause(unsupportedCharsetException0);
            throw unsupportedEncodingException0;
        }
    }

    public final String toString(Charset charset0) {
        return this.size() == 0 ? "" : this.toStringInternal(charset0);
    }

    public abstract String toStringInternal(Charset arg1);

    public final String toStringUtf8() {
        return this.toString(Internal.a);
    }

    public static Comparator unsignedLexicographicalComparator() {
        return ByteString.c;
    }

    public abstract void writeTo(OutputStream arg1) throws IOException;
}

