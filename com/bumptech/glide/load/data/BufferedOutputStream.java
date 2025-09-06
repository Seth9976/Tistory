package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.IOException;
import java.io.OutputStream;
import jeb.synthetic.TWR;

public final class BufferedOutputStream extends OutputStream {
    public final OutputStream a;
    public byte[] b;
    public final ArrayPool c;
    public int d;

    public BufferedOutputStream(@NonNull OutputStream outputStream0, @NonNull ArrayPool arrayPool0) {
        this.a = outputStream0;
        this.c = arrayPool0;
        this.b = (byte[])arrayPool0.get(0x10000, byte[].class);
    }

    @Override
    public void close() throws IOException {
        OutputStream outputStream0;
        try {
            outputStream0 = this.a;
            this.flush();
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(outputStream0, throwable0);
            throw throwable0;
        }
        outputStream0.close();
        byte[] arr_b = this.b;
        if(arr_b != null) {
            this.c.put(arr_b);
            this.b = null;
        }
    }

    @Override
    public void flush() throws IOException {
        int v = this.d;
        OutputStream outputStream0 = this.a;
        if(v > 0) {
            outputStream0.write(this.b, 0, v);
            this.d = 0;
        }
        outputStream0.flush();
    }

    @Override
    public void write(int v) throws IOException {
        byte[] arr_b = this.b;
        int v1 = this.d;
        this.d = v1 + 1;
        arr_b[v1] = (byte)v;
        if(v1 + 1 == arr_b.length && v1 + 1 > 0) {
            this.a.write(arr_b, 0, v1 + 1);
            this.d = 0;
        }
    }

    @Override
    public void write(@NonNull byte[] arr_b) throws IOException {
        this.write(arr_b, 0, arr_b.length);
    }

    @Override
    public void write(@NonNull byte[] arr_b, int v, int v1) throws IOException {
        int v2 = 0;
        do {
            int v3 = v1 - v2;
            int v4 = v + v2;
            int v5 = this.d;
            OutputStream outputStream0 = this.a;
            if(v5 == 0 && v3 >= this.b.length) {
                outputStream0.write(arr_b, v4, v3);
                return;
            }
            int v6 = Math.min(v3, this.b.length - v5);
            System.arraycopy(arr_b, v4, this.b, this.d, v6);
            int v7 = this.d + v6;
            this.d = v7;
            v2 += v6;
            byte[] arr_b1 = this.b;
            if(v7 == arr_b1.length && v7 > 0) {
                outputStream0.write(arr_b1, 0, v7);
                this.d = 0;
            }
        }
        while(v2 < v1);
    }
}

