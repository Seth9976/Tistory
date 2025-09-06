package androidx.datastore.preferences.protobuf;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

public class q extends p {
    public final byte[] d;

    public q(byte[] arr_b) {
        arr_b.getClass();
        this.d = arr_b;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.d, this.i(), this.size()).asReadOnlyBuffer();
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        return Collections.singletonList(this.asReadOnlyByteBuffer());
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public byte byteAt(int v) {
        return this.d[v];
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer0) {
        byteBuffer0.put(this.d, this.i(), this.size());
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public void copyToInternal(byte[] arr_b, int v, int v1, int v2) {
        System.arraycopy(this.d, v, arr_b, v1, v2);
    }

    @Override  // androidx.datastore.preferences.protobuf.p
    public byte e(int v) {
        return this.d[v];
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
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
        if(object0 instanceof q) {
            int v = this.peekCachedHashCode();
            int v1 = ((q)object0).peekCachedHashCode();
            return v == 0 || v1 == 0 || v == v1 ? this.h(((q)object0), 0, this.size()) : false;
        }
        return object0.equals(this);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final void g(ByteOutput byteOutput0) {
        byteOutput0.writeLazy(this.d, this.i(), this.size());
    }

    @Override  // androidx.datastore.preferences.protobuf.p
    public final boolean h(p p0, int v, int v1) {
        if(v1 > p0.size()) {
            throw new IllegalArgumentException("Length too large: " + v1 + this.size());
        }
        int v2 = v + v1;
        if(v2 <= p0.size()) {
            if(p0 instanceof q) {
                int v3 = this.i();
                int v4 = this.i();
                for(int v5 = ((q)p0).i() + v; v4 < v3 + v1; ++v5) {
                    if(this.d[v4] != ((q)p0).d[v5]) {
                        return false;
                    }
                    ++v4;
                }
                return true;
            }
            return p0.substring(v, v2).equals(this.substring(0, v1));
        }
        StringBuilder stringBuilder0 = kotlin.text.q.u("Ran off end of other: ", v, ", ", v1, ", ");
        stringBuilder0.append(p0.size());
        throw new IllegalArgumentException(stringBuilder0.toString());
    }

    public int i() {
        return 0;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final boolean isValidUtf8() {
        int v = this.i();
        return g4.a.l(0, this.d, v, this.size() + v) == 0;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.a(this.d, this.i(), this.size(), true);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final InputStream newInput() {
        return new ByteArrayInputStream(this.d, this.i(), this.size());
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final int partialHash(int v, int v1, int v2) {
        return Internal.b(v, this.d, this.i() + v1, v2);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final int partialIsValidUtf8(int v, int v1, int v2) {
        int v3 = this.i();
        return g4.a.l(v, this.d, v3 + v1, v2 + (v3 + v1));
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public int size() {
        return this.d.length;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final ByteString substring(int v, int v1) {
        int v2 = ByteString.c(v, v1, this.size());
        return v2 == 0 ? ByteString.EMPTY : new o(this.d, this.i() + v, v2);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final String toStringInternal(Charset charset0) {
        return new String(this.d, this.i(), this.size(), charset0);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteString
    public final void writeTo(OutputStream outputStream0) {
        outputStream0.write(this.toByteArray());
    }
}

