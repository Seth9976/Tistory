package com.google.firebase.crashlytics.internal.metadata;

import com.bumptech.glide.load.engine.g0;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class g implements Closeable {
    public final RandomAccessFile a;
    public int b;
    public int c;
    public e d;
    public e e;
    public final byte[] f;
    public static final Logger g;

    static {
        g.g = Logger.getLogger("com.google.firebase.crashlytics.internal.metadata.g");
    }

    public g(File file0) {
        byte[] arr_b = new byte[16];
        this.f = arr_b;
        if(!file0.exists()) {
            File file1 = new File(file0.getPath() + ".tmp");
            try(RandomAccessFile randomAccessFile0 = new RandomAccessFile(file1, "rwd")) {
                randomAccessFile0.setLength(0x1000L);
                randomAccessFile0.seek(0L);
                byte[] arr_b1 = new byte[16];
                int v = 0;
                for(int v1 = 0; true; ++v1) {
                    if(v1 >= 4) {
                        break;
                    }
                    g.m(arr_b1, v, new int[]{0x1000, 0, 0, 0}[v1]);
                    v += 4;
                }
                randomAccessFile0.write(arr_b1);
            }
            if(!file1.renameTo(file0)) {
                throw new IOException("Rename failed!");
            }
        }
        RandomAccessFile randomAccessFile1 = new RandomAccessFile(file0, "rwd");
        this.a = randomAccessFile1;
        randomAccessFile1.seek(0L);
        randomAccessFile1.readFully(arr_b);
        int v2 = g.f(0, arr_b);
        this.b = v2;
        if(((long)v2) > randomAccessFile1.length()) {
            throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + randomAccessFile1.length());
        }
        this.c = g.f(4, arr_b);
        int v3 = g.f(8, arr_b);
        int v4 = g.f(12, arr_b);
        this.d = this.e(v3);
        this.e = this.e(v4);
    }

    public final void a(byte[] arr_b) {
        synchronized(this) {
            if(arr_b.length >= 0 && arr_b.length <= arr_b.length) {
                this.b(arr_b.length);
                boolean z = this.d();
                int v1 = z ? 16 : this.k(this.e.a + 4 + this.e.b);
                e e0 = new e(v1, arr_b.length);
                g.m(this.f, 0, arr_b.length);
                this.i(this.f, v1, 4);
                this.i(arr_b, v1 + 4, arr_b.length);
                this.l(this.b, this.c + 1, (z ? v1 : this.d.a), v1);
                this.e = e0;
                ++this.c;
                if(z) {
                    this.d = e0;
                }
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public final void b(int v) {
        int v1 = this.b - this.j();
        if(v1 >= v + 4) {
            return;
        }
        int v2 = this.b;
        do {
            v1 += v2;
            v2 <<= 1;
        }
        while(v1 < v + 4);
        RandomAccessFile randomAccessFile0 = this.a;
        randomAccessFile0.setLength(((long)v2));
        randomAccessFile0.getChannel().force(true);
        int v3 = this.k(this.e.a + 4 + this.e.b);
        if(v3 < this.d.a) {
            FileChannel fileChannel0 = randomAccessFile0.getChannel();
            fileChannel0.position(((long)this.b));
            if(fileChannel0.transferTo(16L, ((long)(v3 - 4)), fileChannel0) != ((long)(v3 - 4))) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int v4 = this.e.a;
        int v5 = this.d.a;
        if(v4 < v5) {
            int v6 = this.b + v4 - 16;
            this.l(v2, this.c, v5, v6);
            this.e = new e(v6, this.e.b);
        }
        else {
            this.l(v2, this.c, v5, v4);
        }
        this.b = v2;
    }

    public final void c(QueueFile.ElementReader queueFile$ElementReader0) {
        synchronized(this) {
            int v1 = this.d.a;
            for(int v2 = 0; v2 < this.c; ++v2) {
                e e0 = this.e(v1);
                queueFile$ElementReader0.read(new f(this, e0), e0.b);
                v1 = this.k(e0.a + 4 + e0.b);
            }
        }
    }

    @Override
    public final void close() {
        synchronized(this) {
            this.a.close();
        }
    }

    public final boolean d() {
        synchronized(this) {
        }
        return this.c == 0;
    }

    public final e e(int v) {
        if(v == 0) {
            return e.c;
        }
        this.a.seek(((long)v));
        return new e(v, this.a.readInt());
    }

    public static int f(int v, byte[] arr_b) {
        return ((arr_b[v] & 0xFF) << 24) + ((arr_b[v + 1] & 0xFF) << 16) + ((arr_b[v + 2] & 0xFF) << 8) + (arr_b[v + 3] & 0xFF);
    }

    public final void g() {
        synchronized(this) {
            if(!this.d()) {
                if(this.c == 1) {
                    synchronized(this) {
                        this.l(0x1000, 0, 0, 0);
                        this.c = 0;
                        this.d = e.c;
                        this.e = e.c;
                        if(this.b > 0x1000) {
                            this.a.setLength(0x1000L);
                            this.a.getChannel().force(true);
                        }
                        this.b = 0x1000;
                    }
                }
                else {
                    int v1 = this.k(this.d.a + 4 + this.d.b);
                    this.h(v1, this.f, 0, 4);
                    int v2 = g.f(0, this.f);
                    this.l(this.b, this.c - 1, v1, this.e.a);
                    --this.c;
                    this.d = new e(v1, v2);
                }
                return;
            }
        }
        throw new NoSuchElementException();
    }

    public final void h(int v, byte[] arr_b, int v1, int v2) {
        int v3 = this.k(v);
        int v4 = this.b;
        RandomAccessFile randomAccessFile0 = this.a;
        if(v3 + v2 <= v4) {
            randomAccessFile0.seek(((long)v3));
            randomAccessFile0.readFully(arr_b, v1, v2);
            return;
        }
        int v5 = v4 - v3;
        randomAccessFile0.seek(((long)v3));
        randomAccessFile0.readFully(arr_b, v1, v5);
        randomAccessFile0.seek(16L);
        randomAccessFile0.readFully(arr_b, v1 + v5, v2 - v5);
    }

    public final void i(byte[] arr_b, int v, int v1) {
        int v2 = this.k(v);
        int v3 = this.b;
        RandomAccessFile randomAccessFile0 = this.a;
        if(v2 + v1 <= v3) {
            randomAccessFile0.seek(((long)v2));
            randomAccessFile0.write(arr_b, 0, v1);
            return;
        }
        int v4 = v3 - v2;
        randomAccessFile0.seek(((long)v2));
        randomAccessFile0.write(arr_b, 0, v4);
        randomAccessFile0.seek(16L);
        randomAccessFile0.write(arr_b, v4, v1 - v4);
    }

    public final int j() {
        if(this.c == 0) {
            return 16;
        }
        int v = this.e.a;
        int v1 = this.d.a;
        return v < v1 ? v + 4 + this.e.b + this.b - v1 : v - v1 + 4 + this.e.b + 16;
    }

    public final int k(int v) {
        return v < this.b ? v : v + 16 - this.b;
    }

    public final void l(int v, int v1, int v2, int v3) {
        int[] arr_v = {v, v1, v2, v3};
        byte[] arr_b = this.f;
        int v4 = 0;
        for(int v5 = 0; v5 < 4; ++v5) {
            g.m(arr_b, v4, arr_v[v5]);
            v4 += 4;
        }
        this.a.seek(0L);
        this.a.write(arr_b);
    }

    public static void m(byte[] arr_b, int v, int v1) {
        arr_b[v] = (byte)(v1 >> 24);
        arr_b[v + 1] = (byte)(v1 >> 16);
        arr_b[v + 2] = (byte)(v1 >> 8);
        arr_b[v + 3] = (byte)v1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("g");
        stringBuilder0.append("[fileLength=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", size=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", first=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", last=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", element lengths=[");
        try {
            this.c(new g0(stringBuilder0));
        }
        catch(IOException iOException0) {
            g.g.log(Level.WARNING, "read error", iOException0);
        }
        stringBuilder0.append("]]");
        return stringBuilder0.toString();
    }
}

