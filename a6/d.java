package a6;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public final class d implements Closeable {
    public final FileInputStream a;
    public final Charset b;
    public byte[] c;
    public int d;
    public int e;

    public d(FileInputStream fileInputStream0, Charset charset0) {
        if(charset0 == null) {
            throw null;
        }
        if(!charset0.equals(e.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.a = fileInputStream0;
        this.b = charset0;
        this.c = new byte[0x2000];
    }

    public final String a() {
        int v4;
        synchronized(this.a) {
            byte[] arr_b = this.c;
            if(arr_b != null) {
                if(this.d >= this.e) {
                    int v1 = this.a.read(arr_b, 0, arr_b.length);
                    if(v1 == -1) {
                        throw new EOFException();
                    }
                    this.d = 0;
                    this.e = v1;
                }
                for(int v2 = this.d; v2 != this.e; ++v2) {
                    byte[] arr_b1 = this.c;
                    if(arr_b1[v2] == 10) {
                        int v3 = this.d;
                        if(v2 == v3) {
                            v4 = v2;
                        }
                        else {
                            v4 = v2 - 1;
                            if(arr_b1[v4] != 13) {
                                v4 = v2;
                            }
                        }
                        String s = new String(arr_b1, v3, v4 - v3, this.b.name());
                        this.d = v2 + 1;
                        return s;
                    }
                }
                c c0 = new c(this, this.e - this.d + 80);
                while(true) {
                    c0.write(this.c, this.d, this.e - this.d);
                    this.e = -1;
                    int v5 = this.a.read(this.c, 0, this.c.length);
                    if(v5 == -1) {
                        break;
                    }
                    this.d = 0;
                    this.e = v5;
                    for(int v6 = 0; v6 != this.e; ++v6) {
                        byte[] arr_b2 = this.c;
                        if(arr_b2[v6] == 10) {
                            int v7 = this.d;
                            if(v6 != v7) {
                                c0.write(arr_b2, v7, v6 - v7);
                            }
                            this.d = v6 + 1;
                            return c0.toString();
                        }
                    }
                }
                throw new EOFException();
            }
        }
        throw new IOException("LineReader is closed");
    }

    @Override
    public final void close() {
        synchronized(this.a) {
            if(this.c != null) {
                this.c = null;
                this.a.close();
            }
        }
    }
}

