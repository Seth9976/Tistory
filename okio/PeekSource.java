package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\n\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokio/PeekSource;", "Lokio/Source;", "Lokio/BufferedSource;", "upstream", "<init>", "(Lokio/BufferedSource;)V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "", "close", "()V", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPeekSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeekSource.kt\nokio/PeekSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class PeekSource implements Source {
    public final BufferedSource a;
    public final Buffer b;
    public Segment c;
    public int d;
    public boolean e;
    public long f;

    public PeekSource(@NotNull BufferedSource bufferedSource0) {
        Intrinsics.checkNotNullParameter(bufferedSource0, "upstream");
        super();
        this.a = bufferedSource0;
        Buffer buffer0 = bufferedSource0.getBuffer();
        this.b = buffer0;
        this.c = buffer0.head;
        this.d = buffer0.head == null ? -1 : buffer0.head.pos;
    }

    @Override  // okio.Source
    public void close() {
        this.e = true;
    }

    @Override  // okio.Source
    public long read(@NotNull Buffer buffer0, long v) {
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException(q.n(v, "byteCount < 0: ").toString());
        }
        if(this.e) {
            throw new IllegalStateException("closed");
        }
        Segment segment0 = this.c;
        Buffer buffer1 = this.b;
        if(segment0 != null) {
            Segment segment1 = buffer1.head;
            if(segment0 != segment1) {
                throw new IllegalStateException("Peek source is invalid because upstream source was used");
            }
            int v2 = this.d;
            Intrinsics.checkNotNull(segment1);
            if(v2 != segment1.pos) {
                throw new IllegalStateException("Peek source is invalid because upstream source was used");
            }
        }
        if(v1 == 0) {
            return 0L;
        }
        if(!this.a.request(this.f + 1L)) {
            return -1L;
        }
        if(this.c == null) {
            Segment segment2 = buffer1.head;
            if(segment2 != null) {
                this.c = segment2;
                Intrinsics.checkNotNull(segment2);
                this.d = segment2.pos;
            }
        }
        long v3 = Math.min(v, buffer1.size() - this.f);
        this.b.copyTo(buffer0, this.f, v3);
        this.f += v3;
        return v3;
    }

    @Override  // okio.Source
    @NotNull
    public Timeout timeout() {
        return this.a.timeout();
    }
}

