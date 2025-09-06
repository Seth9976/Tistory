package xd;

import java.io.IOException;
import java.io.InputStream;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.io.encoding.Base64;
import kotlin.io.encoding.Base64Kt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;

public final class a extends InputStream {
    public final InputStream a;
    public final Base64 b;
    public boolean c;
    public boolean d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    public int h;
    public int i;

    public a(InputStream inputStream0, Base64 base640) {
        Intrinsics.checkNotNullParameter(inputStream0, "input");
        Intrinsics.checkNotNullParameter(base640, "base64");
        super();
        this.a = inputStream0;
        this.b = base640;
        this.e = new byte[1];
        this.f = new byte[0x400];
        this.g = new byte[0x400];
    }

    @Override
    public final void close() {
        if(!this.c) {
            this.c = true;
            this.a.close();
        }
    }

    @Override
    public final int read() {
        int v = this.h;
        int v1 = this.i;
        if(v < v1) {
            int v2 = this.g[v] & 0xFF;
            this.h = v + 1;
            if(v + 1 == v1) {
                this.h = 0;
                this.i = 0;
            }
            return v2;
        }
        byte[] arr_b = this.e;
        switch(this.read(arr_b, 0, 1)) {
            case -1: {
                return -1;
            }
            case 1: {
                return arr_b[0] & 0xFF;
            }
            default: {
                throw new IllegalStateException("Unreachable");
            }
        }
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        int v11;
        int v10;
        Intrinsics.checkNotNullParameter(arr_b, "destination");
        if(v >= 0 && v1 >= 0) {
            int v2 = v + v1;
            if(v2 <= arr_b.length) {
                if(this.c) {
                    throw new IOException("The input stream is closed.");
                }
                if(this.d) {
                    return -1;
                }
                if(v1 == 0) {
                    return 0;
                }
                int v3 = this.i;
                int v4 = this.h;
                byte[] arr_b1 = this.g;
                if(v3 - v4 >= v1) {
                    ArraysKt___ArraysJvmKt.copyInto(arr_b1, arr_b, v, v4, v4 + v1);
                    int v5 = this.h + v1;
                    this.h = v5;
                    if(v5 == this.i) {
                        this.h = 0;
                        this.i = 0;
                    }
                    return v1;
                }
                int v6 = (v1 - (v3 - v4) + 2) / 3 * 4;
                int v7 = v;
                boolean z;
                while(!z = this.d && v6 > 0) {
                    byte[] arr_b2 = this.f;
                    int v8 = Math.min(arr_b2.length, v6);
                    int v9 = 0;
                    boolean z1;
                    while(!z1 = this.d && v9 < v8) {
                        Base64 base640 = this.b;
                        InputStream inputStream0 = this.a;
                        if(base640.isMimeScheme$kotlin_stdlib()) {
                            while(true) {
                                v10 = inputStream0.read();
                                if(v10 == -1 || Base64Kt.isInMimeAlphabet(v10)) {
                                    break;
                                }
                            }
                        }
                        else {
                            v10 = inputStream0.read();
                        }
                        switch(v10) {
                            case -1: {
                                this.d = true;
                                break;
                            }
                            case 61: {
                                arr_b2[v9] = 61;
                                if((v9 & 3) == 2) {
                                    if(base640.isMimeScheme$kotlin_stdlib()) {
                                        while(true) {
                                            v11 = inputStream0.read();
                                            if(v11 == -1 || Base64Kt.isInMimeAlphabet(v11)) {
                                                break;
                                            }
                                        }
                                    }
                                    else {
                                        v11 = inputStream0.read();
                                    }
                                    if(v11 >= 0) {
                                        arr_b2[v9 + 1] = (byte)v11;
                                    }
                                    v9 += 2;
                                }
                                else {
                                    ++v9;
                                }
                                this.d = true;
                                break;
                            }
                            default: {
                                arr_b2[v9] = (byte)v10;
                                ++v9;
                            }
                        }
                    }
                    if(!z1 && v9 != v8) {
                        throw new IllegalStateException("Check failed.");
                    }
                    v6 -= v9;
                    int v12 = this.i + this.b.decodeIntoByteArray(this.f, this.g, this.i, 0, v9);
                    this.i = v12;
                    int v13 = Math.min(v12 - this.h, v2 - v7);
                    ArraysKt___ArraysJvmKt.copyInto(arr_b1, arr_b, v7, this.h, this.h + v13);
                    int v14 = this.h + v13;
                    this.h = v14;
                    if(v14 == this.i) {
                        this.h = 0;
                        this.i = 0;
                    }
                    int v15 = this.i;
                    if(arr_b2.length / 4 * 3 > arr_b1.length - v15) {
                        ArraysKt___ArraysJvmKt.copyInto(arr_b1, arr_b1, 0, this.h, v15);
                        this.i -= this.h;
                        this.h = 0;
                    }
                    v7 += v13;
                }
                return v7 == v && z ? -1 : v7 - v;
            }
        }
        StringBuilder stringBuilder0 = q.u("offset: ", v, ", length: ", v1, ", buffer size: ");
        stringBuilder0.append(arr_b.length);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }
}

