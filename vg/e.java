package vg;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.FileHandle;
import okio.Source;
import okio.Timeout;

public final class e implements Source {
    public final FileHandle a;
    public long b;
    public boolean c;

    public e(FileHandle fileHandle0, long v) {
        Intrinsics.checkNotNullParameter(fileHandle0, "fileHandle");
        super();
        this.a = fileHandle0;
        this.b = v;
    }

    @Override  // okio.Source
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

    @Override  // okio.Source
    public final long read(Buffer buffer0, long v) {
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        if(this.c) {
            throw new IllegalStateException("closed");
        }
        long v1 = this.a.a(this.b, buffer0, v);
        if(v1 != -1L) {
            this.b += v1;
        }
        return v1;
    }

    @Override  // okio.Source
    public final Timeout timeout() {
        return Timeout.NONE;
    }
}

