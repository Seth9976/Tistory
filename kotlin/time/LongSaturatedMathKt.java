package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mf.a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A\'\u0010\b\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001A\'\u0010\u000B\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u000B\u0010\f\u001A\'\u0010\u000F\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00002\u0006\u0010\u000E\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u000F\u0010\f\u001A\u0014\u0010\u0011\u001A\u00020\u0010*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "value", "Lkotlin/time/DurationUnit;", "unit", "Lkotlin/time/Duration;", "duration", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "saturatingAdd", "valueNs", "origin", "saturatingDiff", "(JJLkotlin/time/DurationUnit;)J", "origin1", "origin2", "saturatingOriginsDiff", "", "isSaturated", "(J)Z", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
public final class LongSaturatedMathKt {
    // 去混淆评级： 低(40)
    public static final long a(long v) {
        return v >= 0L ? 0x7FFFFFFFFFFFFFFFL : 0x8000000000000003L;
    }

    public static final long b(long v, long v1, DurationUnit durationUnit0) {
        long v2 = v - v1;
        if(((v2 ^ v) & ~(v2 ^ v1)) < 0L) {
            DurationUnit durationUnit1 = DurationUnit.MILLISECONDS;
            if(durationUnit0.compareTo(durationUnit1) < 0) {
                long v3 = a.convertDurationUnit(1L, durationUnit1, durationUnit0);
                return Duration.plus-LRDsOJo(DurationKt.toDuration(v / v3 - v1 / v3, durationUnit1), DurationKt.toDuration(v % v3 - v1 % v3, durationUnit0));
            }
            return Duration.unaryMinus-UwyO8pc(LongSaturatedMathKt.a(v2));
        }
        return DurationKt.toDuration(v2, durationUnit0);
    }

    public static final boolean isSaturated(long v) {
        return (v - 1L | 1L) == 0x7FFFFFFFFFFFFFFFL;
    }

    public static final long saturatingAdd-NuflL3o(long v, @NotNull DurationUnit durationUnit0, long v1) {
        Intrinsics.checkNotNullParameter(durationUnit0, "unit");
        long v2 = Duration.toLong-impl(v1, durationUnit0);
        if(Long.compare(v - 1L | 1L, 0x7FFFFFFFFFFFFFFFL) == 0) {
            if(Duration.isInfinite-impl(v1) && (v ^ v2) < 0L) {
                throw new IllegalArgumentException("Summing infinities of different signs");
            }
            return v;
        }
        if((v2 - 1L | 1L) == 0x7FFFFFFFFFFFFFFFL) {
            long v3 = Duration.div-UwyO8pc(v1, 2);
            long v4 = Duration.toLong-impl(v3, durationUnit0);
            return (1L | v4 - 1L) == 0x7FFFFFFFFFFFFFFFL ? v4 : LongSaturatedMathKt.saturatingAdd-NuflL3o(LongSaturatedMathKt.saturatingAdd-NuflL3o(v, durationUnit0, v3), durationUnit0, Duration.minus-LRDsOJo(v1, v3));
        }
        long v5 = v + v2;
        if(((v2 ^ v5) & (v ^ v5)) < 0L) {
            return v >= 0L ? 0x7FFFFFFFFFFFFFFFL : 0x8000000000000000L;
        }
        return v5;
    }

    public static final long saturatingDiff(long v, long v1, @NotNull DurationUnit durationUnit0) {
        Intrinsics.checkNotNullParameter(durationUnit0, "unit");
        return (1L | v1 - 1L) == 0x7FFFFFFFFFFFFFFFL ? Duration.unaryMinus-UwyO8pc(LongSaturatedMathKt.a(v1)) : LongSaturatedMathKt.b(v, v1, durationUnit0);
    }

    public static final long saturatingOriginsDiff(long v, long v1, @NotNull DurationUnit durationUnit0) {
        Intrinsics.checkNotNullParameter(durationUnit0, "unit");
        if((v1 - 1L | 1L) == 0x7FFFFFFFFFFFFFFFL) {
            return v == v1 ? 0L : Duration.unaryMinus-UwyO8pc(LongSaturatedMathKt.a(v1));
        }
        return (1L | v - 1L) == 0x7FFFFFFFFFFFFFFFL ? LongSaturatedMathKt.a(v) : LongSaturatedMathKt.b(v, v1, durationUnit0);
    }
}

