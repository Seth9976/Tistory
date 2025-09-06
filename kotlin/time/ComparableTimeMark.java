package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u0011\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0000H\u0096\u0002J\u0013\u0010\u0006\u001A\u00020\u00072\b\u0010\u0005\u001A\u0004\u0018\u00010\bH¦\u0002J\b\u0010\t\u001A\u00020\u0004H&J\u001B\u0010\n\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\u0000H¦\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\n\u001A\u00020\u00002\u0006\u0010\u000E\u001A\u00020\u000BH\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u0018\u0010\u0011\u001A\u00020\u00002\u0006\u0010\u000E\u001A\u00020\u000BH¦\u0002¢\u0006\u0004\b\u0012\u0010\u0010\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lkotlin/time/ComparableTimeMark;", "Lkotlin/time/TimeMark;", "", "compareTo", "", "other", "equals", "", "", "hashCode", "minus", "Lkotlin/time/Duration;", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "duration", "minus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "plus", "plus-LRDsOJo", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalTime.class})
public interface ComparableTimeMark extends Comparable, TimeMark {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static int compareTo(@NotNull ComparableTimeMark comparableTimeMark0, @NotNull ComparableTimeMark comparableTimeMark1) {
            Intrinsics.checkNotNullParameter(comparableTimeMark1, "other");
            return Duration.compareTo-LRDsOJo(comparableTimeMark0.minus-UwyO8pc(comparableTimeMark1), 0L);
        }

        public static boolean hasNotPassedNow(@NotNull ComparableTimeMark comparableTimeMark0) {
            return kotlin.time.TimeMark.DefaultImpls.hasNotPassedNow(comparableTimeMark0);
        }

        public static boolean hasPassedNow(@NotNull ComparableTimeMark comparableTimeMark0) {
            return kotlin.time.TimeMark.DefaultImpls.hasPassedNow(comparableTimeMark0);
        }

        @NotNull
        public static ComparableTimeMark minus-LRDsOJo(@NotNull ComparableTimeMark comparableTimeMark0, long v) {
            return comparableTimeMark0.plus-LRDsOJo(Duration.unaryMinus-UwyO8pc(v));
        }
    }

    int compareTo(@NotNull ComparableTimeMark arg1);

    @Override
    boolean equals(@Nullable Object arg1);

    @Override
    int hashCode();

    @NotNull
    ComparableTimeMark minus-LRDsOJo(long arg1);

    long minus-UwyO8pc(@NotNull ComparableTimeMark arg1);

    @NotNull
    ComparableTimeMark plus-LRDsOJo(long arg1);
}

