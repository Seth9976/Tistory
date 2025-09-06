package okio;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001A\u0010\n\u001A\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u0011\u0010\u000F\u001A\u00020\t8F¢\u0006\u0006\u001A\u0004\b\u000E\u0010\r¨\u0006\u0010"}, d2 = {"Lokio/SegmentPool;", "", "Lokio/Segment;", "take", "()Lokio/Segment;", "segment", "", "recycle", "(Lokio/Segment;)V", "", "MAX_SIZE", "I", "getMAX_SIZE", "()I", "getByteCount", "byteCount", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SegmentPool {
    @NotNull
    public static final SegmentPool INSTANCE;
    public static final Segment a;
    public static final int b;
    public static final AtomicReference[] c;

    static {
        SegmentPool.INSTANCE = new SegmentPool();  // 初始化器: Ljava/lang/Object;-><init>()V
        SegmentPool.a = new Segment(new byte[0], 0, 0, false, false);
        int v1 = Integer.highestOneBit(Runtime.getRuntime().availableProcessors() * 2 - 1);
        SegmentPool.b = v1;
        AtomicReference[] arr_atomicReference = new AtomicReference[v1];
        for(int v = 0; v < v1; ++v) {
            arr_atomicReference[v] = new AtomicReference();
        }
        SegmentPool.c = arr_atomicReference;
    }

    public static AtomicReference a() {
        return SegmentPool.c[((int)(Thread.currentThread().getId() & ((long)SegmentPool.b) - 1L))];
    }

    public final int getByteCount() {
        Segment segment0 = (Segment)SegmentPool.a().get();
        return segment0 == null ? 0 : segment0.limit;
    }

    public final int getMAX_SIZE() {
        return 0x10000;
    }

    @JvmStatic
    public static final void recycle(@NotNull Segment segment0) {
        Intrinsics.checkNotNullParameter(segment0, "segment");
        if(segment0.next != null || segment0.prev != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(segment0.shared) {
            return;
        }
        SegmentPool.INSTANCE.getClass();
        AtomicReference atomicReference0 = SegmentPool.a();
        Segment segment1 = (Segment)atomicReference0.getAndSet(SegmentPool.a);
        if(segment1 == SegmentPool.a) {
            return;
        }
        int v = segment1 == null ? 0 : segment1.limit;
        if(v >= 0x10000) {
            atomicReference0.set(segment1);
            return;
        }
        segment0.next = segment1;
        segment0.pos = 0;
        segment0.limit = v + 0x2000;
        atomicReference0.set(segment0);
    }

    @JvmStatic
    @NotNull
    public static final Segment take() {
        SegmentPool.INSTANCE.getClass();
        AtomicReference atomicReference0 = SegmentPool.a();
        Segment segment0 = (Segment)atomicReference0.getAndSet(SegmentPool.a);
        if(segment0 == SegmentPool.a) {
            return new Segment();
        }
        if(segment0 == null) {
            atomicReference0.set(null);
            return new Segment();
        }
        atomicReference0.set(segment0.next);
        segment0.next = null;
        segment0.limit = 0;
        return segment0;
    }
}

