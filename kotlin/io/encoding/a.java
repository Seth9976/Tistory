package kotlin.io.encoding;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;

public final class a extends OutputStream {
    public final OutputStream a;
    public final Base64 b;
    public boolean c;
    public int d;
    public final byte[] e;
    public final byte[] f;
    public int g;

    public a(OutputStream outputStream0, Base64 base640) {
        Intrinsics.checkNotNullParameter(outputStream0, "output");
        Intrinsics.checkNotNullParameter(base640, "base64");
        super();
        this.a = outputStream0;
        this.b = base640;
        this.d = base640.isMimeScheme$kotlin_stdlib() ? 76 : -1;
        this.e = new byte[0x400];
        this.f = new byte[3];
    }

    public final void a() {
        if(this.b(this.f, 0, this.g) != 4) {
            throw new IllegalStateException("Check failed.");
        }
        this.g = 0;
    }

    public final int b(byte[] arr_b, int v, int v1) {
        int v2 = this.b.encodeIntoByteArray(arr_b, this.e, 0, v, v1);
        OutputStream outputStream0 = this.a;
        if(this.d == 0) {
            outputStream0.write(new byte[]{13, 10});
            this.d = 76;
            if(v2 > 76) {
                throw new IllegalStateException("Check failed.");
            }
        }
        outputStream0.write(this.e, 0, v2);
        this.d -= v2;
        return v2;
    }

    @Override
    public final void close() {
        if(!this.c) {
            this.c = true;
            if(this.g != 0) {
                this.a();
            }
            this.a.close();
        }
    }

    @Override
    public final void flush() {
        if(this.c) {
            throw new IOException("The output stream is closed.");
        }
        this.a.flush();
    }

    @Override
    public final void write(int v) {
        if(this.c) {
            throw new IOException("The output stream is closed.");
        }
        int v1 = this.g;
        this.g = v1 + 1;
        this.f[v1] = (byte)v;
        if(v1 + 1 == 3) {
            this.a();
        }
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "source");
        if(this.c) {
            throw new IOException("The output stream is closed.");
        }
        if(v >= 0 && v1 >= 0) {
            int v2 = v + v1;
            if(v2 <= arr_b.length) {
                if(v1 == 0) {
                    return;
                }
                int v3 = this.g;
                if(v3 >= 3) {
                    throw new IllegalStateException("Check failed.");
                }
                byte[] arr_b1 = this.f;
                if(v3 != 0) {
                    int v4 = Math.min(3 - v3, v2 - v);
                    int v5 = v + v4;
                    ArraysKt___ArraysJvmKt.copyInto(arr_b, arr_b1, this.g, v, v5);
                    int v6 = this.g + v4;
                    this.g = v6;
                    if(v6 == 3) {
                        this.a();
                    }
                    if(this.g != 0) {
                        return;
                    }
                    v = v5;
                }
                while(v + 3 <= v2) {
                    int v7 = Math.min((this.b.isMimeScheme$kotlin_stdlib() ? this.d : this.e.length) / 4, (v2 - v) / 3);
                    int v8 = v7 * 3 + v;
                    if(this.b(arr_b, v, v8) != v7 * 4) {
                        throw new IllegalStateException("Check failed.");
                    }
                    v = v8;
                }
                ArraysKt___ArraysJvmKt.copyInto(arr_b, arr_b1, 0, v, v2);
                this.g = v2 - v;
                return;
            }
        }
        StringBuilder stringBuilder0 = q.u("offset: ", v, ", length: ", v1, ", source size: ");
        stringBuilder0.append(arr_b.length);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }
}

