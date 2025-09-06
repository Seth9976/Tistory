package pg;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.Exchange;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

public final class a extends ForwardingSink {
    public final long b;
    public boolean c;
    public long d;
    public boolean e;
    public final Exchange f;

    public a(Exchange exchange0, Sink sink0, long v) {
        Intrinsics.checkNotNullParameter(sink0, "delegate");
        this.f = exchange0;
        super(sink0);
        this.b = v;
    }

    public final IOException a(IOException iOException0) {
        if(this.c) {
            return iOException0;
        }
        this.c = true;
        return this.f.bodyComplete(this.d, false, true, iOException0);
    }

    @Override  // okio.ForwardingSink
    public final void close() {
        if(this.e) {
            return;
        }
        this.e = true;
        if(this.b != -1L && this.d != this.b) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            this.a(null);
        }
        catch(IOException iOException0) {
            throw this.a(iOException0);
        }
    }

    @Override  // okio.ForwardingSink
    public final void flush() {
        try {
            super.flush();
        }
        catch(IOException iOException0) {
            throw this.a(iOException0);
        }
    }

    @Override  // okio.ForwardingSink
    public final void write(Buffer buffer0, long v) {
        Intrinsics.checkNotNullParameter(buffer0, "source");
        if(!this.e) {
            long v1 = this.b;
            if(v1 != -1L && this.d + v > v1) {
                throw new ProtocolException("expected " + v1 + " bytes but received " + (this.d + v));
            }
            try {
                super.write(buffer0, v);
                this.d += v;
                return;
            }
            catch(IOException iOException0) {
                throw this.a(iOException0);
            }
        }
        throw new IllegalStateException("closed");
    }
}

