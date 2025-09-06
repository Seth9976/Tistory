package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.InflaterSource;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lokio/Buffer;", "buffer", "", "inflate", "(Lokio/Buffer;)V", "close", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MessageInflater implements Closeable {
    public final boolean a;
    public final Buffer b;
    public final Inflater c;
    public final InflaterSource d;

    public MessageInflater(boolean z) {
        this.a = z;
        Buffer buffer0 = new Buffer();
        this.b = buffer0;
        Inflater inflater0 = new Inflater(true);
        this.c = inflater0;
        this.d = new InflaterSource(buffer0, inflater0);
    }

    @Override
    public void close() throws IOException {
        this.d.close();
    }

    public final void inflate(@NotNull Buffer buffer0) throws IOException {
        Intrinsics.checkNotNullParameter(buffer0, "buffer");
        Buffer buffer1 = this.b;
        if(buffer1.size() != 0L) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Inflater inflater0 = this.c;
        if(this.a) {
            inflater0.reset();
        }
        buffer1.writeAll(buffer0);
        buffer1.writeInt(0xFFFF);
        long v = inflater0.getBytesRead();
        long v1 = buffer1.size();
        do {
            this.d.readOrInflate(buffer0, 0x7FFFFFFFFFFFFFFFL);
        }
        while(inflater0.getBytesRead() < v1 + v);
    }
}

