package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000B\u0018\u0000 F2\u00020\u0001:\u0002FGJ\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u0004\u0018\u00010\n¢\u0006\u0004\b\u000B\u0010\fR$\u0010\u0014\u001A\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001A\u001A\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u0019R\"\u0010 \u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010\u0006R\u0017\u0010#\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001C\u001A\u0004\b\"\u0010\u001ER$\u0010+\u001A\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u0017\u00101\u001A\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u00100R\"\u00109\u001A\u0002028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b3\u00104\u001A\u0004\b5\u00106\"\u0004\b7\u00108R\u0017\u0010<\u001A\u00020,8\u0006¢\u0006\f\n\u0004\b:\u0010.\u001A\u0004\b;\u00100R\"\u0010D\u001A\u00020=8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b>\u0010?\u001A\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0011\u0010E\u001A\u0002028F¢\u0006\u0006\u001A\u0004\bE\u00106¨\u0006H"}, d2 = {"Lokhttp3/internal/cache2/Relay;", "", "", "upstreamSize", "", "commit", "(J)V", "Lokio/ByteString;", "metadata", "()Lokio/ByteString;", "Lokio/Source;", "newSource", "()Lokio/Source;", "Ljava/io/RandomAccessFile;", "a", "Ljava/io/RandomAccessFile;", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "file", "b", "Lokio/Source;", "getUpstream", "setUpstream", "(Lokio/Source;)V", "upstream", "c", "J", "getUpstreamPos", "()J", "setUpstreamPos", "upstreamPos", "e", "getBufferMaxSize", "bufferMaxSize", "Ljava/lang/Thread;", "f", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "upstreamReader", "Lokio/Buffer;", "g", "Lokio/Buffer;", "getUpstreamBuffer", "()Lokio/Buffer;", "upstreamBuffer", "", "h", "Z", "getComplete", "()Z", "setComplete", "(Z)V", "complete", "i", "getBuffer", "buffer", "", "j", "I", "getSourceCount", "()I", "setSourceCount", "(I)V", "sourceCount", "isClosed", "Companion", "RelaySource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Relay {
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J-\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\r\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\r\u0010\u000ER\u0014\u0010\u000F\u001A\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0011\u001A\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001A\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0015\u001A\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001A\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", "", "Ljava/io/File;", "file", "Lokio/Source;", "upstream", "Lokio/ByteString;", "metadata", "", "bufferMaxSize", "Lokhttp3/internal/cache2/Relay;", "edit", "(Ljava/io/File;Lokio/Source;Lokio/ByteString;J)Lokhttp3/internal/cache2/Relay;", "read", "(Ljava/io/File;)Lokhttp3/internal/cache2/Relay;", "FILE_HEADER_SIZE", "J", "PREFIX_CLEAN", "Lokio/ByteString;", "PREFIX_DIRTY", "", "SOURCE_FILE", "I", "SOURCE_UPSTREAM", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Relay edit(@NotNull File file0, @NotNull Source source0, @NotNull ByteString byteString0, long v) throws IOException {
            Intrinsics.checkNotNullParameter(file0, "file");
            Intrinsics.checkNotNullParameter(source0, "upstream");
            Intrinsics.checkNotNullParameter(byteString0, "metadata");
            RandomAccessFile randomAccessFile0 = new RandomAccessFile(file0, "rw");
            Relay relay0 = new Relay(randomAccessFile0, source0, 0L, byteString0, v, null);
            randomAccessFile0.setLength(0L);
            relay0.a(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay0;
        }

        @NotNull
        public final Relay read(@NotNull File file0) throws IOException {
            Intrinsics.checkNotNullParameter(file0, "file");
            RandomAccessFile randomAccessFile0 = new RandomAccessFile(file0, "rw");
            FileChannel fileChannel0 = randomAccessFile0.getChannel();
            Intrinsics.checkNotNullExpressionValue(fileChannel0, "randomAccessFile.channel");
            FileOperator fileOperator0 = new FileOperator(fileChannel0);
            Buffer buffer0 = new Buffer();
            fileOperator0.read(0L, buffer0, 0x20L);
            if(!Intrinsics.areEqual(buffer0.readByteString(((long)Relay.PREFIX_CLEAN.size())), Relay.PREFIX_CLEAN)) {
                throw new IOException("unreadable cache file");
            }
            long v = buffer0.readLong();
            long v1 = buffer0.readLong();
            Buffer buffer1 = new Buffer();
            fileOperator0.read(v + 0x20L, buffer1, v1);
            return new Relay(randomAccessFile0, null, v, buffer1.readByteString(), 0L, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001F\u0010\b\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Lokio/Source;", "<init>", "(Lokhttp3/internal/cache2/Relay;)V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "", "close", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nRelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,356:1\n563#2:357\n*S KotlinDebug\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n*L\n267#1:357\n*E\n"})
    public final class RelaySource implements Source {
        public final Timeout a;
        public FileOperator b;
        public long c;
        public final Relay d;

        public RelaySource() {
            this.a = new Timeout();
            RandomAccessFile randomAccessFile0 = relay0.getFile();
            Intrinsics.checkNotNull(randomAccessFile0);
            FileChannel fileChannel0 = randomAccessFile0.getChannel();
            Intrinsics.checkNotNullExpressionValue(fileChannel0, "file!!.channel");
            this.b = new FileOperator(fileChannel0);
        }

        @Override  // okio.Source
        public void close() throws IOException {
            if(this.b == null) {
                return;
            }
            RandomAccessFile randomAccessFile0 = null;
            this.b = null;
            Relay relay0 = Relay.this;
            synchronized(relay0) {
                relay0.setSourceCount(relay0.getSourceCount() - 1);
                if(relay0.getSourceCount() == 0) {
                    relay0.setFile(null);
                    randomAccessFile0 = relay0.getFile();
                }
            }
            if(randomAccessFile0 != null) {
                Util.closeQuietly(randomAccessFile0);
            }
        }

        @Override  // okio.Source
        public long read(@NotNull Buffer buffer0, long v) throws IOException {
            int v3;
            long v2;
            Intrinsics.checkNotNullParameter(buffer0, "sink");
            if(this.b != null) {
                Relay relay0 = Relay.this;
                __monitor_enter(relay0);
                while(true) {
                    try {
                    label_4:
                        if(Long.compare(this.c, relay0.getUpstreamPos()) != 0) {
                            long v1 = relay0.getUpstreamPos() - relay0.getBuffer().size();
                            if(this.c >= v1) {
                                v2 = Math.min(v, relay0.getUpstreamPos() - this.c);
                                relay0.getBuffer().copyTo(buffer0, this.c - v1, v2);
                                this.c += v2;
                                goto label_10;
                            }
                            v3 = 2;
                            break;
                        }
                        goto label_14;
                    }
                    catch(Throwable throwable0) {
                        __monitor_exit(relay0);
                        throw throwable0;
                    }
                label_10:
                    __monitor_exit(relay0);
                    return v2;
                    try {
                        v3 = 2;
                        break;
                    }
                    catch(Throwable throwable0) {
                        __monitor_exit(relay0);
                        throw throwable0;
                    }
                label_14:
                    if(relay0.getComplete()) {
                        __monitor_exit(relay0);
                        return -1L;
                    }
                    try {
                        if(relay0.getUpstreamReader() != null) {
                            this.a.waitUntilNotified(relay0);
                            goto label_4;
                        }
                        relay0.setUpstreamReader(Thread.currentThread());
                        v3 = 1;
                        break;
                    }
                    catch(Throwable throwable0) {
                    }
                    __monitor_exit(relay0);
                    throw throwable0;
                }
                __monitor_exit(relay0);
                if(v3 == 2) {
                    long v4 = Math.min(v, Relay.this.getUpstreamPos() - this.c);
                    FileOperator fileOperator0 = this.b;
                    Intrinsics.checkNotNull(fileOperator0);
                    fileOperator0.read(this.c + 0x20L, buffer0, v4);
                    this.c += v4;
                    return v4;
                }
                try {
                    Source source0 = Relay.this.getUpstream();
                    Intrinsics.checkNotNull(source0);
                    long v6 = source0.read(Relay.this.getUpstreamBuffer(), Relay.this.getBufferMaxSize());
                    if(v6 == -1L) {
                        Relay.this.commit(Relay.this.getUpstreamPos());
                        return -1L;
                    }
                    long v8 = Math.min(v6, v);
                    Relay.this.getUpstreamBuffer().copyTo(buffer0, 0L, v8);
                    this.c += v8;
                    FileOperator fileOperator1 = this.b;
                    Intrinsics.checkNotNull(fileOperator1);
                    fileOperator1.write(Relay.this.getUpstreamPos() + 0x20L, Relay.this.getUpstreamBuffer().clone(), v6);
                    Relay relay1 = Relay.this;
                    synchronized(relay1) {
                        relay1.getBuffer().write(relay1.getUpstreamBuffer(), v6);
                        if(relay1.getBuffer().size() > relay1.getBufferMaxSize()) {
                            relay1.getBuffer().skip(relay1.getBuffer().size() - relay1.getBufferMaxSize());
                        }
                        relay1.setUpstreamPos(relay1.getUpstreamPos() + v6);
                        return v8;
                    }
                }
                finally {
                    synchronized(Relay.this) {
                        Relay.this.setUpstreamReader(null);
                        Intrinsics.checkNotNull(Relay.this, "null cannot be cast to non-null type java.lang.Object");
                        Relay.this.notifyAll();
                    }
                }
            }
            throw new IllegalStateException("Check failed.");
        }

        @Override  // okio.Source
        @NotNull
        public Timeout timeout() {
            return this.a;
        }
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final ByteString PREFIX_CLEAN;
    @JvmField
    @NotNull
    public static final ByteString PREFIX_DIRTY;
    public RandomAccessFile a;
    public Source b;
    public long c;
    public final ByteString d;
    public final long e;
    public Thread f;
    public final Buffer g;
    public boolean h;
    public final Buffer i;
    public int j;

    static {
        Relay.Companion = new Companion(null);
        Relay.PREFIX_CLEAN = ByteString.Companion.encodeUtf8("OkHttp cache v1\n");
        Relay.PREFIX_DIRTY = ByteString.Companion.encodeUtf8("OkHttp DIRTY :(\n");
    }

    public Relay(RandomAccessFile randomAccessFile0, Source source0, long v, ByteString byteString0, long v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = randomAccessFile0;
        this.b = source0;
        this.c = v;
        this.d = byteString0;
        this.e = v1;
        this.g = new Buffer();
        this.h = this.b == null;
        this.i = new Buffer();
    }

    public final void a(ByteString byteString0, long v, long v1) {
        Buffer buffer0 = new Buffer();
        buffer0.write(byteString0);
        buffer0.writeLong(v);
        buffer0.writeLong(v1);
        if(buffer0.size() != 0x20L) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        RandomAccessFile randomAccessFile0 = this.a;
        Intrinsics.checkNotNull(randomAccessFile0);
        FileChannel fileChannel0 = randomAccessFile0.getChannel();
        Intrinsics.checkNotNullExpressionValue(fileChannel0, "file!!.channel");
        new FileOperator(fileChannel0).write(0L, buffer0, 0x20L);
    }

    public final void commit(long v) throws IOException {
        Buffer buffer0 = new Buffer();
        buffer0.write(this.d);
        RandomAccessFile randomAccessFile0 = this.a;
        Intrinsics.checkNotNull(randomAccessFile0);
        FileChannel fileChannel0 = randomAccessFile0.getChannel();
        Intrinsics.checkNotNullExpressionValue(fileChannel0, "file!!.channel");
        new FileOperator(fileChannel0).write(v + 0x20L, buffer0, ((long)this.d.size()));
        RandomAccessFile randomAccessFile1 = this.a;
        Intrinsics.checkNotNull(randomAccessFile1);
        randomAccessFile1.getChannel().force(false);
        this.a(Relay.PREFIX_CLEAN, v, ((long)this.d.size()));
        RandomAccessFile randomAccessFile2 = this.a;
        Intrinsics.checkNotNull(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized(this) {
            this.h = true;
        }
        Source source0 = this.b;
        if(source0 != null) {
            Util.closeQuietly(source0);
        }
        this.b = null;
    }

    @NotNull
    public final Buffer getBuffer() {
        return this.i;
    }

    public final long getBufferMaxSize() {
        return this.e;
    }

    public final boolean getComplete() {
        return this.h;
    }

    @Nullable
    public final RandomAccessFile getFile() {
        return this.a;
    }

    public final int getSourceCount() {
        return this.j;
    }

    @Nullable
    public final Source getUpstream() {
        return this.b;
    }

    @NotNull
    public final Buffer getUpstreamBuffer() {
        return this.g;
    }

    public final long getUpstreamPos() {
        return this.c;
    }

    @Nullable
    public final Thread getUpstreamReader() {
        return this.f;
    }

    public final boolean isClosed() {
        return this.a == null;
    }

    @NotNull
    public final ByteString metadata() {
        return this.d;
    }

    @Nullable
    public final Source newSource() {
        synchronized(this) {
            if(this.a == null) {
                return null;
            }
            ++this.j;
        }
        return new RelaySource(this);
    }

    public final void setComplete(boolean z) {
        this.h = z;
    }

    public final void setFile(@Nullable RandomAccessFile randomAccessFile0) {
        this.a = randomAccessFile0;
    }

    public final void setSourceCount(int v) {
        this.j = v;
    }

    public final void setUpstream(@Nullable Source source0) {
        this.b = source0;
    }

    public final void setUpstreamPos(long v) {
        this.c = v;
    }

    public final void setUpstreamReader(@Nullable Thread thread0) {
        this.f = thread0;
    }
}

