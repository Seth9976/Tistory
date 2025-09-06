package okio;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import vg.d;
import vg.e;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002<=B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000B\u00A2\u0006\u0004\b\u000E\u0010\u000FJ%\u0010\u000E\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\r\u001A\u00020\u0007\u00A2\u0006\u0004\b\u000E\u0010\u0012J\r\u0010\u0013\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0013\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0018\u001A\u00020\u00152\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000B\u00A2\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u0018\u001A\u00020\u00152\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u001A\u001A\u00020\u00102\u0006\u0010\r\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0018\u0010\u001BJ\r\u0010\u001C\u001A\u00020\u0015\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0017\u0010\u001A\u001A\u00020\u001E2\b\b\u0002\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\u001A\u0010\u001FJ\u0015\u0010 \u001A\u00020\u00072\u0006\u0010\u001A\u001A\u00020\u001E\u00A2\u0006\u0004\b \u0010!J\u001D\u0010\"\u001A\u00020\u00152\u0006\u0010\u001A\u001A\u00020\u001E2\u0006\u0010 \u001A\u00020\u0007\u00A2\u0006\u0004\b\"\u0010#J\u0017\u0010\u0011\u001A\u00020$2\b\b\u0002\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0011\u0010%J\r\u0010&\u001A\u00020$\u00A2\u0006\u0004\b&\u0010\'J\u0015\u0010 \u001A\u00020\u00072\u0006\u0010\u0011\u001A\u00020$\u00A2\u0006\u0004\b \u0010(J\u001D\u0010\"\u001A\u00020\u00152\u0006\u0010\u0011\u001A\u00020$2\u0006\u0010 \u001A\u00020\u0007\u00A2\u0006\u0004\b\"\u0010)J\r\u0010*\u001A\u00020\u0015\u00A2\u0006\u0004\b*\u0010\u001DJ/\u0010+\u001A\u00020\u000B2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000BH$\u00A2\u0006\u0004\b+\u0010\u000FJ/\u0010,\u001A\u00020\u00152\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000BH$\u00A2\u0006\u0004\b,\u0010\u0019J\u000F\u0010-\u001A\u00020\u0015H$\u00A2\u0006\u0004\b-\u0010\u001DJ\u0017\u0010.\u001A\u00020\u00152\u0006\u0010\u0013\u001A\u00020\u0007H$\u00A2\u0006\u0004\b.\u0010\u0017J\u000F\u0010/\u001A\u00020\u0007H$\u00A2\u0006\u0004\b/\u0010\u0014J\u000F\u00100\u001A\u00020\u0015H$\u00A2\u0006\u0004\b0\u0010\u001DR\u0017\u0010\u0004\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\b1\u00102\u001A\u0004\b3\u00104R\u001B\u0010;\u001A\u000605j\u0002`68\u0006\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010:\u00A8\u0006>"}, d2 = {"Lokio/FileHandle;", "Ljava/io/Closeable;", "Lokio/Closeable;", "", "readWrite", "<init>", "(Z)V", "", "fileOffset", "", "array", "", "arrayOffset", "byteCount", "read", "(J[BII)I", "Lokio/Buffer;", "sink", "(JLokio/Buffer;J)J", "size", "()J", "", "resize", "(J)V", "write", "(J[BII)V", "source", "(JLokio/Buffer;J)V", "flush", "()V", "Lokio/Source;", "(J)Lokio/Source;", "position", "(Lokio/Source;)J", "reposition", "(Lokio/Source;J)V", "Lokio/Sink;", "(J)Lokio/Sink;", "appendingSink", "()Lokio/Sink;", "(Lokio/Sink;)J", "(Lokio/Sink;J)V", "close", "protectedRead", "protectedWrite", "protectedFlush", "protectedResize", "protectedSize", "protectedClose", "a", "Z", "getReadWrite", "()Z", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", "d", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "vg/d", "vg/e", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n+ 2 -JvmPlatform.kt\nokio/_JvmPlatformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 5 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 6 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,444:1\n33#2:445\n33#2:447\n33#2:448\n33#2:449\n33#2:450\n33#2:451\n33#2:452\n33#2:453\n33#2:457\n33#2:459\n1#3:446\n62#4:454\n62#4:455\n62#4:456\n51#5:458\n86#6:460\n86#6:461\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n*L\n69#1:445\n81#1:447\n92#1:448\n105#1:449\n119#1:450\n129#1:451\n139#1:452\n151#1:453\n221#1:457\n287#1:459\n169#1:454\n195#1:455\n202#1:456\n248#1:458\n345#1:460\n374#1:461\n*E\n"})
public abstract class FileHandle implements Closeable {
    public final boolean a;
    public boolean b;
    public int c;
    public final ReentrantLock d;

    public FileHandle(boolean z) {
        this.a = z;
        this.d = _JvmPlatformKt.newLock();
    }

    public final long a(long v, Buffer buffer0, long v1) {
        if(v1 < 0L) {
            throw new IllegalArgumentException(q.n(v1, "byteCount < 0: ").toString());
        }
        long v2 = v1 + v;
        long v3 = v;
        while(v3 < v2) {
            Segment segment0 = buffer0.writableSegment$okio(1);
            int v4 = this.protectedRead(v3, segment0.data, segment0.limit, ((int)Math.min(v2 - v3, 0x2000 - segment0.limit)));
            if(v4 == -1) {
                if(segment0.pos == segment0.limit) {
                    buffer0.head = segment0.pop();
                    SegmentPool.recycle(segment0);
                }
                return v == v3 ? -1L : v3 - v;
            }
            segment0.limit += v4;
            v3 += (long)v4;
            buffer0.setSize$okio(buffer0.size() + ((long)v4));
        }
        return v3 - v;
    }

    @NotNull
    public final Sink appendingSink() throws IOException {
        return this.sink(this.size());
    }

    public final void b(long v, Buffer buffer0, long v1) {
        -SegmentedByteString.checkOffsetAndCount(buffer0.size(), 0L, v1);
        long v2 = v1 + v;
        while(v < v2) {
            Segment segment0 = buffer0.head;
            Intrinsics.checkNotNull(segment0);
            int v3 = (int)Math.min(v2 - v, segment0.limit - segment0.pos);
            this.protectedWrite(v, segment0.data, segment0.pos, v3);
            segment0.pos += v3;
            v += (long)v3;
            buffer0.setSize$okio(buffer0.size() - ((long)v3));
            if(segment0.pos == segment0.limit) {
                buffer0.head = segment0.pop();
                SegmentPool.recycle(segment0);
            }
        }
    }

    @Override
    public final void close() throws IOException {
        ReentrantLock reentrantLock0 = this.d;
        reentrantLock0.lock();
        if(this.b) {
            reentrantLock0.unlock();
            return;
        }
        this.b = true;
        if(this.c != 0) {
            reentrantLock0.unlock();
            return;
        }
        reentrantLock0.unlock();
        this.protectedClose();
    }

    public final void flush() throws IOException {
        if(!this.a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock0 = this.d;
        reentrantLock0.lock();
        try {
            if(!this.b) {
                this.protectedFlush();
                return;
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public final ReentrantLock getLock() {
        return this.d;
    }

    public final boolean getReadWrite() {
        return this.a;
    }

    public final long position(@NotNull Sink sink0) throws IOException {
        long v;
        Intrinsics.checkNotNullParameter(sink0, "sink");
        if(sink0 instanceof RealBufferedSink) {
            v = ((RealBufferedSink)sink0).bufferField.size();
            sink0 = ((RealBufferedSink)sink0).sink;
        }
        else {
            v = 0L;
        }
        if(!(sink0 instanceof d) || ((d)sink0).a != this) {
            throw new IllegalArgumentException("sink was not created by this FileHandle");
        }
        if(((d)sink0).c) {
            throw new IllegalStateException("closed");
        }
        return ((d)sink0).b + v;
    }

    public final long position(@NotNull Source source0) throws IOException {
        long v;
        Intrinsics.checkNotNullParameter(source0, "source");
        if(source0 instanceof RealBufferedSource) {
            v = ((RealBufferedSource)source0).bufferField.size();
            source0 = ((RealBufferedSource)source0).source;
        }
        else {
            v = 0L;
        }
        if(!(source0 instanceof e) || ((e)source0).a != this) {
            throw new IllegalArgumentException("source was not created by this FileHandle");
        }
        if(((e)source0).c) {
            throw new IllegalStateException("closed");
        }
        return ((e)source0).b - v;
    }

    public abstract void protectedClose() throws IOException;

    public abstract void protectedFlush() throws IOException;

    public abstract int protectedRead(long arg1, @NotNull byte[] arg2, int arg3, int arg4) throws IOException;

    public abstract void protectedResize(long arg1) throws IOException;

    public abstract long protectedSize() throws IOException;

    public abstract void protectedWrite(long arg1, @NotNull byte[] arg2, int arg3, int arg4) throws IOException;

    public final int read(long v, @NotNull byte[] arr_b, int v1, int v2) throws IOException {
        Intrinsics.checkNotNullParameter(arr_b, "array");
        ReentrantLock reentrantLock0 = this.d;
        reentrantLock0.lock();
        try {
            if(!this.b) {
                return this.protectedRead(v, arr_b, v1, v2);
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        throw new IllegalStateException("closed");
    }

    public final long read(long v, @NotNull Buffer buffer0, long v1) throws IOException {
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        ReentrantLock reentrantLock0 = this.d;
        reentrantLock0.lock();
        try {
            if(!this.b) {
                return this.a(v, buffer0, v1);
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        throw new IllegalStateException("closed");
    }

    public final void reposition(@NotNull Sink sink0, long v) throws IOException {
        Intrinsics.checkNotNullParameter(sink0, "sink");
        if(sink0 instanceof RealBufferedSink) {
            Sink sink1 = ((RealBufferedSink)sink0).sink;
            if(!(sink1 instanceof d) || ((d)sink1).a != this) {
                throw new IllegalArgumentException("sink was not created by this FileHandle");
            }
            if(((d)sink1).c) {
                throw new IllegalStateException("closed");
            }
            ((RealBufferedSink)sink0).emit();
            ((d)sink1).b = v;
            return;
        }
        if(!(sink0 instanceof d) || ((d)sink0).a != this) {
            throw new IllegalArgumentException("sink was not created by this FileHandle");
        }
        if(((d)sink0).c) {
            throw new IllegalStateException("closed");
        }
        ((d)sink0).b = v;
    }

    public final void reposition(@NotNull Source source0, long v) throws IOException {
        Intrinsics.checkNotNullParameter(source0, "source");
        if(source0 instanceof RealBufferedSource) {
            Source source1 = ((RealBufferedSource)source0).source;
            if(!(source1 instanceof e) || ((e)source1).a != this) {
                throw new IllegalArgumentException("source was not created by this FileHandle");
            }
            if(((e)source1).c) {
                throw new IllegalStateException("closed");
            }
            long v1 = ((RealBufferedSource)source0).bufferField.size();
            long v2 = v - (((e)source1).b - v1);
            if(0L <= v2 && v2 < v1) {
                ((RealBufferedSource)source0).skip(v2);
                return;
            }
            ((RealBufferedSource)source0).bufferField.clear();
            ((e)source1).b = v;
            return;
        }
        if(!(source0 instanceof e) || ((e)source0).a != this) {
            throw new IllegalArgumentException("source was not created by this FileHandle");
        }
        if(((e)source0).c) {
            throw new IllegalStateException("closed");
        }
        ((e)source0).b = v;
    }

    public final void resize(long v) throws IOException {
        if(!this.a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock0 = this.d;
        reentrantLock0.lock();
        try {
            if(!this.b) {
                this.protectedResize(v);
                return;
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public final Sink sink(long v) throws IOException {
        if(!this.a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock0 = this.d;
        reentrantLock0.lock();
        try {
            if(!this.b) {
                ++this.c;
                return new d(this, v);
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        throw new IllegalStateException("closed");
    }

    public static Sink sink$default(FileHandle fileHandle0, long v, int v1, Object object0) throws IOException {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if((v1 & 1) != 0) {
            v = 0L;
        }
        return fileHandle0.sink(v);
    }

    public final long size() throws IOException {
        ReentrantLock reentrantLock0 = this.d;
        reentrantLock0.lock();
        try {
            if(!this.b) {
                return this.protectedSize();
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public final Source source(long v) throws IOException {
        ReentrantLock reentrantLock0 = this.d;
        reentrantLock0.lock();
        try {
            if(!this.b) {
                ++this.c;
                return new e(this, v);
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        throw new IllegalStateException("closed");
    }

    public static Source source$default(FileHandle fileHandle0, long v, int v1, Object object0) throws IOException {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: source");
        }
        if((v1 & 1) != 0) {
            v = 0L;
        }
        return fileHandle0.source(v);
    }

    public final void write(long v, @NotNull Buffer buffer0, long v1) throws IOException {
        Intrinsics.checkNotNullParameter(buffer0, "source");
        if(!this.a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock0 = this.d;
        reentrantLock0.lock();
        try {
            if(!this.b) {
                this.b(v, buffer0, v1);
                return;
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        throw new IllegalStateException("closed");
    }

    public final void write(long v, @NotNull byte[] arr_b, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_b, "array");
        if(!this.a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock0 = this.d;
        reentrantLock0.lock();
        try {
            if(!this.b) {
                this.protectedWrite(v, arr_b, v1, v2);
                return;
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        throw new IllegalStateException("closed");
    }
}

