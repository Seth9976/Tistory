package a6;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

public final class c extends ByteArrayOutputStream {
    public final d a;

    public c(d d0, int v) {
        this.a = d0;
        super(v);
    }

    @Override
    public final String toString() {
        int v = this.count <= 0 || this.buf[this.count - 1] != 13 ? this.count : this.count - 1;
        try {
            return new String(this.buf, 0, v, this.a.b.name());
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new AssertionError(unsupportedEncodingException0);
        }
    }
}

