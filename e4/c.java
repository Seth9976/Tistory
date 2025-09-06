package e4;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

public final class c extends FilterOutputStream {
    public final OutputStream a;
    public ByteOrder b;

    public c(OutputStream outputStream0, ByteOrder byteOrder0) {
        super(outputStream0);
        this.a = outputStream0;
        this.b = byteOrder0;
    }

    public final void a(int v) {
        this.a.write(v);
    }

    public final void b(int v) {
        ByteOrder byteOrder0 = this.b;
        OutputStream outputStream0 = this.a;
        if(byteOrder0 == ByteOrder.LITTLE_ENDIAN) {
            outputStream0.write(v & 0xFF);
            outputStream0.write(v >>> 8 & 0xFF);
            outputStream0.write(v >>> 16 & 0xFF);
            outputStream0.write(v >>> 24 & 0xFF);
            return;
        }
        if(byteOrder0 == ByteOrder.BIG_ENDIAN) {
            outputStream0.write(v >>> 24 & 0xFF);
            outputStream0.write(v >>> 16 & 0xFF);
            outputStream0.write(v >>> 8 & 0xFF);
            outputStream0.write(v & 0xFF);
        }
    }

    public final void c(short v) {
        ByteOrder byteOrder0 = this.b;
        OutputStream outputStream0 = this.a;
        if(byteOrder0 == ByteOrder.LITTLE_ENDIAN) {
            outputStream0.write(v & 0xFF);
            outputStream0.write(v >>> 8 & 0xFF);
            return;
        }
        if(byteOrder0 == ByteOrder.BIG_ENDIAN) {
            outputStream0.write(v >>> 8 & 0xFF);
            outputStream0.write(v & 0xFF);
        }
    }

    public final void d(long v) {
        if(v > 0xFFFFFFFFL) {
            throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
        }
        this.b(((int)v));
    }

    public final void e(int v) {
        if(v > 0xFFFF) {
            throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
        }
        this.c(((short)v));
    }

    @Override
    public final void write(byte[] arr_b) {
        this.a.write(arr_b);
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        this.a.write(arr_b, v, v1);
    }
}

