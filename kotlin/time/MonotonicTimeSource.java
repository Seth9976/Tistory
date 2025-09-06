package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\bÁ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\b\u001A\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\r\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\u0005¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u0012\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\u00052\u0006\u0010\u000F\u001A\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u001D\u0010\u0015\u001A\u00020\u00052\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\u0013\u001A\u00020\n¢\u0006\u0004\b\u0014\u0010\u0011\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0016"}, d2 = {"Lkotlin/time/MonotonicTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "", "toString", "()Ljava/lang/String;", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "markNow", "timeMark", "Lkotlin/time/Duration;", "elapsedFrom-6eNON_k", "(J)J", "elapsedFrom", "one", "another", "differenceBetween-fRLX17w", "(JJ)J", "differenceBetween", "duration", "adjustReading-6QKq23U", "adjustReading", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.3")
public final class MonotonicTimeSource implements WithComparableMarks {
    @NotNull
    public static final MonotonicTimeSource INSTANCE;
    public static final long a;

    static {
        MonotonicTimeSource.INSTANCE = new MonotonicTimeSource();  // 初始化器: Ljava/lang/Object;-><init>()V
        MonotonicTimeSource.a = System.nanoTime();
    }

    public final long adjustReading-6QKq23U(long v, long v1) {
        return ValueTimeMark.constructor-impl(LongSaturatedMathKt.saturatingAdd-NuflL3o(v, DurationUnit.NANOSECONDS, v1));
    }

    public final long differenceBetween-fRLX17w(long v, long v1) {
        return LongSaturatedMathKt.saturatingOriginsDiff(v, v1, DurationUnit.NANOSECONDS);
    }

    public final long elapsedFrom-6eNON_k(long v) {
        return LongSaturatedMathKt.saturatingDiff(System.nanoTime() - MonotonicTimeSource.a, v, DurationUnit.NANOSECONDS);
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.time.TimeSource$WithComparableMarks
    public ComparableTimeMark markNow() {
        return ValueTimeMark.box-impl(-214200L);
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.time.TimeSource
    public TimeMark markNow() {
        return ValueTimeMark.box-impl(-164200L);
    }

    public long markNow-z9LOYto() [...] // 潜在的解密器

    @Override
    @NotNull
    public String toString() [...] // Inlined contents
}

