package vg;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.FileHandle;
import okio.Sink;
import okio.Timeout;

public final class d implements Sink {
    public final FileHandle a;
    public long b;
    public boolean c;

    public d(FileHandle fileHandle0, long v) {
        Intrinsics.checkNotNullParameter(fileHandle0, "fileHandle");
        super();
        this.a = fileHandle0;
        this.b = v;
    }

    @Override  // okio.Sink
    public final void close() {
        if(this.c) {
            return;
        }
        this.c = true;
        FileHandle fileHandle0 = this.a;
        ReentrantLock reentrantLock0 = fileHandle0.getLock();
        reentrantLock0.lock();
        try {
            --fileHandle0.c;
            if(fileHandle0.c == 0 && fileHandle0.b) {
                fileHandle0.protectedClose();
            }
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    @Override  // okio.Sink
    public final void flush() {
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.protectedFlush();
    }

    @Override  // okio.Sink
    public final Timeout timeout() {
        return Timeout.NONE;
    }

    @Override  // okio.Sink
    public final void write(Buffer buffer0, long v) {
        Intrinsics.checkNotNullParameter(buffer0, "source");
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.b(this.b, buffer0, v);
        this.b += v;
    }
}

