package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006J\b\u0010\u0002\u001A\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lkotlin/time/TimeSource;", "", "markNow", "Lkotlin/time/TimeMark;", "Companion", "Monotonic", "WithComparableMarks", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalTime.class})
public interface TimeSource {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/TimeSource$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tJ\u0012\u0010\u0005\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "markNow", "", "toString", "()Ljava/lang/String;", "ValueTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Monotonic implements WithComparableMarks {
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001A\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\t\u001A\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u0018\u0010\r\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u0018\u0010\u000F\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u000E\u0010\fJ\u000F\u0010\u0013\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0015\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u001B\u0010\u000F\u001A\u00020\u00072\u0006\u0010\u0016\u001A\u00020\u0001H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u000F\u001A\u00020\u00072\u0006\u0010\u0016\u001A\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\fJ\u0018\u0010\u001D\u001A\u00020\u001A2\u0006\u0010\u0016\u001A\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010!\u001A\u00020\u001EHÖ\u0001¢\u0006\u0004\b\u001F\u0010 J\u0010\u0010$\u001A\u00020\u001AHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001A\u0010(\u001A\u00020\u00102\b\u0010\u0016\u001A\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b&\u0010\'\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006)"}, d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/ComparableTimeMark;", "", "Lkotlin/time/ValueTimeMarkReading;", "reading", "constructor-impl", "(J)J", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "elapsedNow", "duration", "plus-LRDsOJo", "(JJ)J", "plus", "minus-LRDsOJo", "minus", "", "hasPassedNow-impl", "(J)Z", "hasPassedNow", "hasNotPassedNow-impl", "hasNotPassedNow", "other", "minus-UwyO8pc", "(JLkotlin/time/ComparableTimeMark;)J", "minus-6eNON_k", "", "compareTo-6eNON_k", "(JJ)I", "compareTo", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", "hashCode", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        @SinceKotlin(version = "1.9")
        @WasExperimental(markerClass = {ExperimentalTime.class})
        @JvmInline
        public static final class ValueTimeMark implements ComparableTimeMark {
            public final long a;

            public ValueTimeMark(long v) {
                this.a = v;
            }

            public static final ValueTimeMark box-impl(long v) {
                return new ValueTimeMark(v);
            }

            @Override
            public int compareTo(Object object0) {
                return this.compareTo(((ComparableTimeMark)object0));
            }

            @Override  // kotlin.time.ComparableTimeMark
            public int compareTo(@NotNull ComparableTimeMark comparableTimeMark0) {
                return DefaultImpls.compareTo(this, comparableTimeMark0);
            }

            // 去混淆评级： 低(20)
            public static final int compareTo-6eNON_k(long v, long v1) {
                return Duration.compareTo-LRDsOJo(ValueTimeMark.minus-6eNON_k(v, v1), 0L);
            }

            public static int compareTo-impl(long v, @NotNull ComparableTimeMark comparableTimeMark0) {
                Intrinsics.checkNotNullParameter(comparableTimeMark0, "other");
                return ValueTimeMark.box-impl(v).compareTo(comparableTimeMark0);
            }

            public static long constructor-impl(long v) [...] // Inlined contents

            public static long elapsedNow-UwyO8pc(long v) {
                return MonotonicTimeSource.INSTANCE.elapsedFrom-6eNON_k(v);
            }

            @Override  // kotlin.time.TimeMark
            public long elapsedNow-UwyO8pc() {
                return ValueTimeMark.elapsedNow-UwyO8pc(this.a);
            }

            @Override  // kotlin.time.ComparableTimeMark
            public boolean equals(Object object0) {
                return ValueTimeMark.equals-impl(this.a, object0);
            }

            public static boolean equals-impl(long v, Object object0) {
                return object0 instanceof ValueTimeMark ? v == ((ValueTimeMark)object0).unbox-impl() : false;
            }

            public static final boolean equals-impl0(long v, long v1) {
                return v == v1;
            }

            @Override  // kotlin.time.TimeMark
            public boolean hasNotPassedNow() {
                return ValueTimeMark.hasNotPassedNow-impl(this.a);
            }

            public static boolean hasNotPassedNow-impl(long v) {
                return Duration.isNegative-impl(ValueTimeMark.elapsedNow-UwyO8pc(v));
            }

            @Override  // kotlin.time.TimeMark
            public boolean hasPassedNow() {
                return ValueTimeMark.hasPassedNow-impl(this.a);
            }

            public static boolean hasPassedNow-impl(long v) {
                return !Duration.isNegative-impl(ValueTimeMark.elapsedNow-UwyO8pc(v));
            }

            @Override  // kotlin.time.ComparableTimeMark
            public int hashCode() {
                return ValueTimeMark.hashCode-impl(this.a);
            }

            public static int hashCode-impl(long v) {
                return Long.hashCode(v);
            }

            public static final long minus-6eNON_k(long v, long v1) {
                return MonotonicTimeSource.INSTANCE.differenceBetween-fRLX17w(v, v1);
            }

            public static long minus-LRDsOJo(long v, long v1) {
                long v2 = Duration.unaryMinus-UwyO8pc(v1);
                return MonotonicTimeSource.INSTANCE.adjustReading-6QKq23U(v, v2);
            }

            public long minus-LRDsOJo(long v) {
                return ValueTimeMark.minus-LRDsOJo(this.a, v);
            }

            @Override  // kotlin.time.ComparableTimeMark
            public ComparableTimeMark minus-LRDsOJo(long v) {
                return ValueTimeMark.box-impl(this.minus-LRDsOJo(v));
            }

            @Override  // kotlin.time.TimeMark
            public TimeMark minus-LRDsOJo(long v) {
                return ValueTimeMark.box-impl(this.minus-LRDsOJo(v));
            }

            public static long minus-UwyO8pc(long v, @NotNull ComparableTimeMark comparableTimeMark0) {
                Intrinsics.checkNotNullParameter(comparableTimeMark0, "other");
                if(!(comparableTimeMark0 instanceof ValueTimeMark)) {
                    throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ValueTimeMark.toString-impl(v) + " and " + comparableTimeMark0);
                }
                return ValueTimeMark.minus-6eNON_k(v, ((ValueTimeMark)comparableTimeMark0).unbox-impl());
            }

            @Override  // kotlin.time.ComparableTimeMark
            public long minus-UwyO8pc(@NotNull ComparableTimeMark comparableTimeMark0) {
                Intrinsics.checkNotNullParameter(comparableTimeMark0, "other");
                return ValueTimeMark.minus-UwyO8pc(this.a, comparableTimeMark0);
            }

            public static long plus-LRDsOJo(long v, long v1) {
                return MonotonicTimeSource.INSTANCE.adjustReading-6QKq23U(v, v1);
            }

            public long plus-LRDsOJo(long v) {
                return ValueTimeMark.plus-LRDsOJo(this.a, v);
            }

            @Override  // kotlin.time.ComparableTimeMark
            public ComparableTimeMark plus-LRDsOJo(long v) {
                return ValueTimeMark.box-impl(this.plus-LRDsOJo(v));
            }

            @Override  // kotlin.time.TimeMark
            public TimeMark plus-LRDsOJo(long v) {
                return ValueTimeMark.box-impl(this.plus-LRDsOJo(v));
            }

            @Override
            public String toString() {
                return ValueTimeMark.toString-impl(this.a);
            }

            public static String toString-impl(long v) {
                return "ValueTimeMark(reading=" + v + ')';
            }

            public final long unbox-impl() {
                return this.a;
            }
        }

        @NotNull
        public static final Monotonic INSTANCE;

        static {
            Monotonic.INSTANCE = new Monotonic();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // kotlin.time.TimeSource$WithComparableMarks
        public ComparableTimeMark markNow() {
            return ValueTimeMark.box-impl(this.markNow-z9LOYto());
        }

        @Override  // kotlin.time.TimeSource
        public TimeMark markNow() {
            return ValueTimeMark.box-impl(this.markNow-z9LOYto());
        }

        // 去混淆评级： 低(20)
        public long markNow-z9LOYto() {
            return -208800L;
        }

        @Override
        @NotNull
        public String toString() {
            return "TimeSource(System.nanoTime())";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "markNow", "Lkotlin/time/ComparableTimeMark;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public interface WithComparableMarks extends TimeSource {
        @NotNull
        ComparableTimeMark markNow();
    }

    @NotNull
    public static final Companion Companion;

    static {
        TimeSource.Companion = Companion.a;
    }

    @NotNull
    TimeMark markNow();
}

