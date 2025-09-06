package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000B\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001F\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R#\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lokio/ForwardingSink;", "Lokio/Sink;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "", "onException", "<init>", "(Lokio/Sink;Lkotlin/jvm/functions/Function1;)V", "Lokio/Buffer;", "source", "", "byteCount", "write", "(Lokio/Buffer;J)V", "flush", "()V", "close", "b", "Lkotlin/jvm/functions/Function1;", "getOnException", "()Lkotlin/jvm/functions/Function1;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class FaultHidingSink extends ForwardingSink {
    public final Function1 b;
    public boolean c;

    public FaultHidingSink(@NotNull Sink sink0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sink0, "delegate");
        Intrinsics.checkNotNullParameter(function10, "onException");
        super(sink0);
        this.b = function10;
    }

    @Override  // okio.ForwardingSink
    public void close() {
        if(this.c) {
            return;
        }
        try {
            super.close();
        }
        catch(IOException iOException0) {
            this.c = true;
            this.b.invoke(iOException0);
        }
    }

    @Override  // okio.ForwardingSink
    public void flush() {
        if(this.c) {
            return;
        }
        try {
            super.flush();
        }
        catch(IOException iOException0) {
            this.c = true;
            this.b.invoke(iOException0);
        }
    }

    @NotNull
    public final Function1 getOnException() {
        return this.b;
    }

    @Override  // okio.ForwardingSink
    public void write(@NotNull Buffer buffer0, long v) {
        Intrinsics.checkNotNullParameter(buffer0, "source");
        if(this.c) {
            buffer0.skip(v);
            return;
        }
        try {
            super.write(buffer0, v);
        }
        catch(IOException iOException0) {
            this.c = true;
            this.b.invoke(iOException0);
        }
    }
}

