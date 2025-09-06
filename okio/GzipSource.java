package okio;

import a5.b;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001F\u0010\t\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokio/GzipSource;", "Lokio/Source;", "source", "<init>", "(Lokio/Source;)V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "", "close", "()V", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nGzipSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 GzipSource.kt\nokio/-GzipSourceExtensions\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,220:1\n1#2:221\n62#3:222\n62#3:224\n62#3:226\n62#3:227\n62#3:228\n62#3:230\n62#3:232\n202#4:223\n202#4:225\n202#4:229\n202#4:231\n89#5:233\n*S KotlinDebug\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n*L\n105#1:222\n107#1:224\n119#1:226\n120#1:227\n122#1:228\n133#1:230\n144#1:232\n106#1:223\n117#1:225\n130#1:229\n141#1:231\n187#1:233\n*E\n"})
public final class GzipSource implements Source {
    public byte a;
    public final RealBufferedSource b;
    public final Inflater c;
    public final InflaterSource d;
    public final CRC32 e;

    public GzipSource(@NotNull Source source0) {
        Intrinsics.checkNotNullParameter(source0, "source");
        super();
        RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
        this.b = realBufferedSource0;
        Inflater inflater0 = new Inflater(true);
        this.c = inflater0;
        this.d = new InflaterSource(realBufferedSource0, inflater0);
        this.e = new CRC32();
    }

    public static void a(int v, int v1, String s) {
        if(v1 != v) {
            throw new IOException(b.f(3, "%s: actual 0x%08x != expected 0x%08x", "format(...)", new Object[]{s, v1, v}));
        }
    }

    public final void b(long v, Buffer buffer0, long v1) {
        Segment segment0 = buffer0.head;
        Intrinsics.checkNotNull(segment0);
        while(true) {
            int v2 = segment0.limit;
            int v3 = segment0.pos;
            if(v < ((long)(v2 - v3))) {
                break;
            }
            v -= (long)(v2 - v3);
            segment0 = segment0.next;
            Intrinsics.checkNotNull(segment0);
        }
        while(v1 > 0L) {
            int v4 = (int)(((long)segment0.pos) + v);
            int v5 = (int)Math.min(segment0.limit - v4, v1);
            this.e.update(segment0.data, v4, v5);
            v1 -= (long)v5;
            segment0 = segment0.next;
            Intrinsics.checkNotNull(segment0);
            v = 0L;
        }
    }

    @Override  // okio.Source
    public void close() throws IOException {
        this.d.close();
    }

    @Override  // okio.Source
    public long read(@NotNull Buffer buffer0, long v) throws IOException {
        long v4;
        Intrinsics.checkNotNullParameter(buffer0, "sink");
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException(q.n(v, "byteCount < 0: ").toString());
        }
        if(v1 == 0) {
            return 0L;
        }
        CRC32 cRC320 = this.e;
        RealBufferedSource realBufferedSource0 = this.b;
        if(this.a == 0) {
            realBufferedSource0.require(10L);
            int v2 = realBufferedSource0.bufferField.getByte(3L);
            boolean z = (v2 >> 1 & 1) == 1;
            if(z) {
                this.b(0L, realBufferedSource0.bufferField, 10L);
            }
            GzipSource.a(8075, realBufferedSource0.readShort(), "ID1ID2");
            realBufferedSource0.skip(8L);
            if((v2 >> 2 & 1) == 1) {
                realBufferedSource0.require(2L);
                if(z) {
                    this.b(0L, realBufferedSource0.bufferField, 2L);
                }
                int v3 = realBufferedSource0.bufferField.readShortLe();
                realBufferedSource0.require(((long)(v3 & 0xFFFF)));
                if(z) {
                    this.b(0L, realBufferedSource0.bufferField, ((long)(v3 & 0xFFFF)));
                }
                v4 = (long)(v3 & 0xFFFF);
                realBufferedSource0.skip(v4);
            }
            if((v2 >> 3 & 1) == 1) {
                long v5 = realBufferedSource0.indexOf(0);
                if(v5 == -1L) {
                    throw new EOFException();
                }
                if(z) {
                    this.b(0L, realBufferedSource0.bufferField, v5 + 1L);
                }
                realBufferedSource0.skip(v5 + 1L);
            }
            if((v2 >> 4 & 1) == 1) {
                long v6 = realBufferedSource0.indexOf(0);
                if(v6 == -1L) {
                    throw new EOFException();
                }
                if(z) {
                    this.b(0L, realBufferedSource0.bufferField, v6 + 1L);
                }
                realBufferedSource0.skip(v6 + 1L);
            }
            if(z) {
                GzipSource.a(realBufferedSource0.readShortLe(), ((short)(((int)cRC320.getValue()))), "FHCRC");
                cRC320.reset();
            }
            this.a = 1;
        }
        if(this.a == 1) {
            long v7 = buffer0.size();
            long v8 = this.d.read(buffer0, v);
            if(v8 != -1L) {
                this.b(v7, buffer0, v8);
                return v8;
            }
            this.a = 2;
        }
        if(this.a == 2) {
            GzipSource.a(realBufferedSource0.readIntLe(), ((int)cRC320.getValue()), "CRC");
            GzipSource.a(realBufferedSource0.readIntLe(), ((int)this.c.getBytesWritten()), "ISIZE");
            this.a = 3;
            if(!realBufferedSource0.exhausted()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override  // okio.Source
    @NotNull
    public Timeout timeout() {
        return this.b.timeout();
    }
}

