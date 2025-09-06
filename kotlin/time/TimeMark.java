package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001A\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001A\u00020\u0007H\u0016J\b\u0010\b\u001A\u00020\u0007H\u0016J\u0018\u0010\t\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u0018\u0010\r\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000E\u0010\f\u0082\u0002\u0004\n\u0002\b!¨\u0006\u000F"}, d2 = {"Lkotlin/time/TimeMark;", "", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "()J", "hasNotPassedNow", "", "hasPassedNow", "minus", "duration", "minus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "plus", "plus-LRDsOJo", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalTime.class})
public interface TimeMark {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static boolean hasNotPassedNow(@NotNull TimeMark timeMark0) {
            return Duration.isNegative-impl(timeMark0.elapsedNow-UwyO8pc());
        }

        public static boolean hasPassedNow(@NotNull TimeMark timeMark0) {
            return !Duration.isNegative-impl(timeMark0.elapsedNow-UwyO8pc());
        }

        @NotNull
        public static TimeMark minus-LRDsOJo(@NotNull TimeMark timeMark0, long v) {
            return timeMark0.plus-LRDsOJo(Duration.unaryMinus-UwyO8pc(v));
        }

        @NotNull
        public static TimeMark plus-LRDsOJo(@NotNull TimeMark timeMark0, long v) {
            return new c(timeMark0, v);
        }
    }

    long elapsedNow-UwyO8pc();

    boolean hasNotPassedNow();

    boolean hasPassedNow();

    @NotNull
    TimeMark minus-LRDsOJo(long arg1);

    @NotNull
    TimeMark plus-LRDsOJo(long arg1);
}

