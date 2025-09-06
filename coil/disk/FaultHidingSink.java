package coil.disk;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0016\u0010\b\u001A\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u001F\u0010\u000F\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcoil/disk/FaultHidingSink;", "Lokio/ForwardingSink;", "Lokio/Sink;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "Lokio/IOException;", "", "onException", "<init>", "(Lokio/Sink;Lkotlin/jvm/functions/Function1;)V", "Lokio/Buffer;", "source", "", "byteCount", "write", "(Lokio/Buffer;J)V", "flush", "()V", "close", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FaultHidingSink extends ForwardingSink {
    public final Function1 b;
    public boolean c;

    public FaultHidingSink(@NotNull Sink sink0, @NotNull Function1 function10) {
        super(sink0);
        this.b = function10;
    }

    @Override  // okio.ForwardingSink
    public void close() {
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
        try {
            super.flush();
        }
        catch(IOException iOException0) {
            this.c = true;
            this.b.invoke(iOException0);
        }
    }

    @Override  // okio.ForwardingSink
    public void write(@NotNull Buffer buffer0, long v) {
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

