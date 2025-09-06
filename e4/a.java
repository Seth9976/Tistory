package e4;

import android.media.MediaDataSource;
import java.io.IOException;

public final class a extends MediaDataSource {
    public long a;
    public final g b;

    public a(g g0) {
        this.b = g0;
        super();
    }

    @Override
    public final void close() {
    }

    @Override  // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override  // android.media.MediaDataSource
    public final int readAt(long v, byte[] arr_b, int v1, int v2) {
        if(v2 == 0) {
            return 0;
        }
        if(Long.compare(v, 0L) < 0) {
            return -1;
        }
        try {
            long v3 = this.a;
            g g0 = this.b;
            if(Long.compare(v3, v) != 0) {
                if(v3 >= 0L && v >= v3 + ((long)g0.a.available())) {
                    return -1;
                }
                g0.b(v);
                this.a = v;
            }
            if(v2 > g0.a.available()) {
                v2 = g0.a.available();
            }
            int v4 = g0.read(arr_b, v1, v2);
            if(v4 >= 0) {
                this.a += (long)v4;
                return v4;
            }
        }
        catch(IOException unused_ex) {
        }
        this.a = -1L;
        return -1;
    }
}

