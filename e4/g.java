package e4;

import java.io.InputStream;

public final class g extends b {
    public g(InputStream inputStream0) {
        super(inputStream0);
        if(!inputStream0.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.a.mark(0x7FFFFFFF);
    }

    public g(byte[] arr_b) {
        super(arr_b);
        this.a.mark(0x7FFFFFFF);
    }

    public final void b(long v) {
        int v1 = this.b;
        if(((long)v1) > v) {
            this.b = 0;
            this.a.reset();
        }
        else {
            v -= (long)v1;
        }
        this.a(((int)v));
    }
}

