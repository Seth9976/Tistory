package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer.UnsafeCursor;
import okio.Buffer;
import okio.ByteString;
import okio.DeflaterSink;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lokio/Buffer;", "buffer", "", "deflate", "(Lokio/Buffer;)V", "close", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MessageDeflater implements Closeable {
    public final boolean a;
    public final Buffer b;
    public final Deflater c;
    public final DeflaterSink d;

    public MessageDeflater(boolean z) {
        this.a = z;
        Buffer buffer0 = new Buffer();
        this.b = buffer0;
        Deflater deflater0 = new Deflater(-1, true);
        this.c = deflater0;
        this.d = new DeflaterSink(buffer0, deflater0);
    }

    @Override
    public void close() throws IOException {
        this.d.close();
    }

    public final void deflate(@NotNull Buffer buffer0) throws IOException {
        Intrinsics.checkNotNullParameter(buffer0, "buffer");
        Buffer buffer1 = this.b;
        if(buffer1.size() != 0L) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(this.a) {
            this.c.reset();
        }
        this.d.write(buffer0, buffer0.size());
        this.d.flush();
        ByteString byteString0 = MessageDeflaterKt.a;
        if(buffer1.rangeEquals(buffer1.size() - ((long)byteString0.size()), byteString0)) {
            UnsafeCursor buffer$UnsafeCursor0 = Buffer.readAndWriteUnsafe$default(buffer1, null, 1, null);
            try {
                buffer$UnsafeCursor0.resizeBuffer(buffer1.size() - 4L);
            }
            catch(Throwable throwable0) {
                CloseableKt.closeFinally(buffer$UnsafeCursor0, throwable0);
                throw throwable0;
            }
            CloseableKt.closeFinally(buffer$UnsafeCursor0, null);
        }
        else {
            buffer1.writeByte(0);
        }
        buffer0.write(buffer1, buffer1.size());
    }
}

