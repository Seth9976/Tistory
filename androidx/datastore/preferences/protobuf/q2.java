package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

public final class q2 extends p {
    public final ByteBuffer d;

    public q2(ByteBuffer byteBuffer0) {
        Internal.a(byteBuffer0, "buffer");
        this.d = byteBuffer0.slice().order(ByteOrder.nativeOrder());
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return this.d.asReadOnlyBuffer();
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        return Collections.singletonList(this.d.asReadOnlyBuffer());
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final byte byteAt(int v) {
        try {
            return this.d.get(v);
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
            throw arrayIndexOutOfBoundsException0;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new ArrayIndexOutOfBoundsException(indexOutOfBoundsException0.getMessage());
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer0) {
        byteBuffer0.put(this.d.slice());
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final void copyToInternal(byte[] arr_b, int v, int v1, int v2) {
        ByteBuffer byteBuffer0 = this.d.slice();
        byteBuffer0.position(v);
        byteBuffer0.get(arr_b, v1, v2);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof ByteString)) {
            return false;
        }
        ByteBuffer byteBuffer0 = this.d;
        if(byteBuffer0.remaining() != ((ByteString)object0).size()) {
            return false;
        }
        if(byteBuffer0.remaining() == 0) {
            return true;
        }
        if(object0 instanceof q2) {
            return byteBuffer0.equals(((q2)object0).d);
        }
        return object0 instanceof b3 ? object0.equals(this) : byteBuffer0.equals(((ByteString)object0).asReadOnlyByteBuffer());
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final void g(ByteOutput byteOutput0) {
        byteOutput0.writeLazy(this.d.slice());
    }

    @Override  // androidx.datastore.preferences.protobuf.p
    public final boolean h(p p0, int v, int v1) {
        return this.substring(0, v1).equals(p0.substring(v, v1 + v));
    }

    public final ByteBuffer i(int v, int v1) {
        ByteBuffer byteBuffer0 = this.d;
        if(v < byteBuffer0.position() || v1 > byteBuffer0.limit() || v > v1) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", v, v1));
        }
        ByteBuffer byteBuffer1 = byteBuffer0.slice();
        byteBuffer1.position(v - byteBuffer0.position());
        byteBuffer1.limit(v1 - byteBuffer0.position());
        return byteBuffer1;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final boolean isValidUtf8() {
        return g4.a.k(0, this.d.position(), this.d.remaining(), this.d) == 0;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.c(this.d, true);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final InputStream newInput() {
        return new p2(this);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final int partialHash(int v, int v1, int v2) {
        for(int v3 = v1; v3 < v1 + v2; ++v3) {
            v = v * 0x1F + this.d.get(v3);
        }
        return v;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final int partialIsValidUtf8(int v, int v1, int v2) {
        return g4.a.k(v, v1, v2 + v1, this.d);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final int size() {
        return this.d.remaining();
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final ByteString substring(int v, int v1) {
        try {
            return new q2(this.i(v, v1));
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
            throw arrayIndexOutOfBoundsException0;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new ArrayIndexOutOfBoundsException(indexOutOfBoundsException0.getMessage());
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final String toStringInternal(Charset charset0) {
        ByteBuffer byteBuffer0 = this.d;
        if(byteBuffer0.hasArray()) {
            return new String(byteBuffer0.array(), byteBuffer0.position() + byteBuffer0.arrayOffset(), byteBuffer0.remaining(), charset0);
        }
        byte[] arr_b = this.toByteArray();
        return new String(arr_b, 0, arr_b.length, charset0);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final void writeTo(OutputStream outputStream0) {
        outputStream0.write(this.toByteArray());
    }
}

