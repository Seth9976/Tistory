package com.squareup.moshi;

import okio.Buffer;
import okio.ForwardingSink;

public final class b0 extends ForwardingSink {
    public final Buffer b;
    public final c0 c;

    public b0(c0 c00, Buffer buffer0, Buffer buffer1) {
        this.c = c00;
        this.b = buffer1;
        super(buffer0);
    }

    @Override  // okio.ForwardingSink
    public final void close() {
        c0 c00 = this.c;
        if(c00.b() == 9) {
            int v = c00.a;
            if(c00.k[v] == null) {
                c00.a = v - 1;
                Object object0 = JsonReader.of(this.b).readJsonValue();
                boolean z = c00.g;
                c00.g = true;
                try {
                    c00.d(object0);
                }
                finally {
                    c00.g = z;
                }
                int v2 = c00.a - 1;
                ++c00.d[v2];
                return;
            }
        }
        throw new AssertionError();
    }
}

