package kotlin.time;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import kotlin.ranges.c;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.p;
import mf.a;
import mf.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\"\u001A\u001B\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b\u0004\u0010\u0005\u001A\u001B\u0010\u0004\u001A\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b\u0004\u0010\u0007\u001A\u001B\u0010\u0004\u001A\u00020\u0003*\u00020\b2\u0006\u0010\u0002\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b\u0004\u0010\t\"\u0014\u0010\n\u001A\u00020\u00008\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\n\u0010\u000B\"\u0014\u0010\f\u001A\u00020\u00068\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000E\u001A\u00020\u00068\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\u000E\u0010\r\"\u001E\u0010\u0013\u001A\u00020\u0003*\u00020\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u000F\u0010\u0010\"\u001E\u0010\u0013\u001A\u00020\u0003*\u00020\u00068FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0011\u0010\u0015\u001A\u0004\b\u000F\u0010\u0014\"\u001E\u0010\u0013\u001A\u00020\u0003*\u00020\b8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0011\u0010\u0017\u001A\u0004\b\u000F\u0010\u0016\"\u001E\u0010\u001A\u001A\u00020\u0003*\u00020\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0019\u0010\u0012\u001A\u0004\b\u0018\u0010\u0010\"\u001E\u0010\u001A\u001A\u00020\u0003*\u00020\u00068FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0019\u0010\u0015\u001A\u0004\b\u0018\u0010\u0014\"\u001E\u0010\u001A\u001A\u00020\u0003*\u00020\b8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0019\u0010\u0017\u001A\u0004\b\u0018\u0010\u0016\"\u001E\u0010\u001D\u001A\u00020\u0003*\u00020\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u001C\u0010\u0012\u001A\u0004\b\u001B\u0010\u0010\"\u001E\u0010\u001D\u001A\u00020\u0003*\u00020\u00068FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u001C\u0010\u0015\u001A\u0004\b\u001B\u0010\u0014\"\u001E\u0010\u001D\u001A\u00020\u0003*\u00020\b8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u001C\u0010\u0017\u001A\u0004\b\u001B\u0010\u0016\"\u001E\u0010 \u001A\u00020\u0003*\u00020\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u001F\u0010\u0012\u001A\u0004\b\u001E\u0010\u0010\"\u001E\u0010 \u001A\u00020\u0003*\u00020\u00068FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u001F\u0010\u0015\u001A\u0004\b\u001E\u0010\u0014\"\u001E\u0010 \u001A\u00020\u0003*\u00020\b8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u001F\u0010\u0017\u001A\u0004\b\u001E\u0010\u0016\"\u001E\u0010#\u001A\u00020\u0003*\u00020\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\"\u0010\u0012\u001A\u0004\b!\u0010\u0010\"\u001E\u0010#\u001A\u00020\u0003*\u00020\u00068FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\"\u0010\u0015\u001A\u0004\b!\u0010\u0014\"\u001E\u0010#\u001A\u00020\u0003*\u00020\b8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\"\u0010\u0017\u001A\u0004\b!\u0010\u0016\"\u001E\u0010&\u001A\u00020\u0003*\u00020\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b%\u0010\u0012\u001A\u0004\b$\u0010\u0010\"\u001E\u0010&\u001A\u00020\u0003*\u00020\u00068FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b%\u0010\u0015\u001A\u0004\b$\u0010\u0014\"\u001E\u0010&\u001A\u00020\u0003*\u00020\b8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b%\u0010\u0017\u001A\u0004\b$\u0010\u0016\"\u001E\u0010)\u001A\u00020\u0003*\u00020\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b(\u0010\u0012\u001A\u0004\b\'\u0010\u0010\"\u001E\u0010)\u001A\u00020\u0003*\u00020\u00068FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b(\u0010\u0015\u001A\u0004\b\'\u0010\u0014\"\u001E\u0010)\u001A\u00020\u0003*\u00020\b8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b(\u0010\u0017\u001A\u0004\b\'\u0010\u0016\u00A8\u0006*"}, d2 = {"", "Lkotlin/time/DurationUnit;", "unit", "Lkotlin/time/Duration;", "toDuration", "(ILkotlin/time/DurationUnit;)J", "", "(JLkotlin/time/DurationUnit;)J", "", "(DLkotlin/time/DurationUnit;)J", "NANOS_IN_MILLIS", "I", "MAX_NANOS", "J", "MAX_MILLIS", "getNanoseconds", "(I)J", "getNanoseconds$annotations", "(I)V", "nanoseconds", "(J)J", "(J)V", "(D)J", "(D)V", "getMicroseconds", "getMicroseconds$annotations", "microseconds", "getMilliseconds", "getMilliseconds$annotations", "milliseconds", "getSeconds", "getSeconds$annotations", "seconds", "getMinutes", "getMinutes$annotations", "minutes", "getHours", "getHours$annotations", "hours", "getDays", "getDays$annotations", "days", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1495:1\n1447#1,6:1497\n1450#1,3:1503\n1447#1,6:1506\n1447#1,6:1512\n1450#1,3:1521\n1#2:1496\n1726#3,3:1518\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n1371#1:1497,6\n1405#1:1503,3\n1408#1:1506,6\n1411#1:1512,6\n1447#1:1521,3\n1436#1:1518,3\n*E\n"})
public final class DurationKt {
    public static final long MAX_MILLIS = 0x3FFFFFFFFFFFFFFFL;
    public static final long MAX_NANOS = 0x3FFFFFFFFFFA14BFL;
    public static final int NANOS_IN_MILLIS = 1000000;

    // 去混淆评级： 低(20)
    public static final long a(long v) {
        return new LongRange(-4611686018426L, 4611686018426L).contains(v) ? DurationKt.b(v * 1000000L) : Duration.constructor-impl((c.coerceIn(v, 0xC000000000000001L, 0x3FFFFFFFFFFFFFFFL) << 1) + 1L);
    }

    public static final long access$durationOf(long v, int v1) {
        return Duration.constructor-impl((v << 1) + ((long)v1));
    }

    public static final long access$durationOfMillis(long v) {
        return Duration.constructor-impl((v << 1) + 1L);
    }

    // 去混淆评级： 低(20)
    public static final long access$durationOfNanosNormalized(long v) {
        return new LongRange(0xC00000000005EB41L, 0x3FFFFFFFFFFA14BFL).contains(v) ? DurationKt.b(v) : Duration.constructor-impl((v / 1000000L << 1) + 1L);
    }

    public static final long access$millisToNanos(long v) [...] // Inlined contents

    public static final long access$nanosToMillis(long v) [...] // Inlined contents

    public static final long access$parseDuration(String s, boolean z) {
        long v11;
        long v = 0L;
        int v1 = s.length();
        if(v1 == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int v2 = s.charAt(0) != 43 && s.charAt(0) != 45 ? 0 : 1;
        int v3 = v2 <= 0 ? 0 : 1;
        boolean z1 = v3 != 0 && StringsKt__StringsKt.startsWith$default(s, '-', false, 2, null);
        if(v1 <= v2) {
            throw new IllegalArgumentException("No components");
        }
        if(s.charAt(v2) == 80) {
            int v4 = v2 + 1;
            if(v4 != v1) {
                Enum enum0 = null;
                boolean z2 = false;
                while(true) {
                    if(v4 >= v1) {
                        return z1 ? Duration.unaryMinus-UwyO8pc(v) : v;
                    }
                    if(s.charAt(v4) == 84) {
                        if(!z2) {
                            ++v4;
                            if(v4 != v1) {
                                z2 = true;
                                continue;
                            }
                        }
                        throw new IllegalArgumentException();
                    }
                    int v5;
                    for(v5 = v4; v5 < s.length(); ++v5) {
                        int v6 = s.charAt(v5);
                        if(!new CharRange('0', '9').contains(((char)v6)) && !StringsKt__StringsKt.contains$default("+-.", ((char)v6), false, 2, null)) {
                            break;
                        }
                    }
                    Intrinsics.checkNotNull(s, "null cannot be cast to non-null type java.lang.String");
                    String s1 = s.substring(v4, v5);
                    Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
                    if(s1.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int v7 = s1.length() + v4;
                    if(v7 < 0 || v7 > StringsKt__StringsKt.getLastIndex(s)) {
                        throw new IllegalArgumentException("Missing unit for value " + s1);
                    }
                    v4 = v7 + 1;
                    DurationUnit durationUnit0 = b.durationUnitByIsoChar(s.charAt(v7), z2);
                    if(enum0 != null && enum0.compareTo(durationUnit0) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int v8 = StringsKt__StringsKt.indexOf$default(s1, '.', 0, false, 6, null);
                    if(durationUnit0 != DurationUnit.SECONDS || v8 <= 0) {
                        v = Duration.plus-LRDsOJo(v, DurationKt.toDuration(DurationKt.c(s1), durationUnit0));
                    }
                    else {
                        Intrinsics.checkNotNull(s1, "null cannot be cast to non-null type java.lang.String");
                        String s2 = s1.substring(0, v8);
                        Intrinsics.checkNotNullExpressionValue(s2, "substring(...)");
                        long v9 = Duration.plus-LRDsOJo(v, DurationKt.toDuration(DurationKt.c(s2), durationUnit0));
                        Intrinsics.checkNotNull(s1, "null cannot be cast to non-null type java.lang.String");
                        String s3 = s1.substring(v8);
                        Intrinsics.checkNotNullExpressionValue(s3, "substring(...)");
                        v = Duration.plus-LRDsOJo(v9, DurationKt.toDuration(Double.parseDouble(s3), durationUnit0));
                    }
                    enum0 = durationUnit0;
                }
            }
            throw new IllegalArgumentException();
        }
        if(z) {
            throw new IllegalArgumentException();
        }
        if(p.regionMatches(s, v2, "Infinity", 0, Math.max(v1 - v2, 8), true)) {
            return z1 ? Duration.unaryMinus-UwyO8pc(0x7FFFFFFFFFFFFFFFL) : 0x7FFFFFFFFFFFFFFFL;
        }
        int v10 = v3 ^ 1;
        if(v3 == 0 || s.charAt(v2) != 40 || StringsKt___StringsKt.last(s) != 41) {
            v11 = 0L;
        }
        else {
            ++v2;
            --v1;
            if(v2 == v1) {
                throw new IllegalArgumentException("No components");
            }
            v11 = 0L;
            v10 = 1;
        }
        Enum enum1 = null;
        for(boolean z3 = false; v2 < v1; z3 = true) {
            if(z3 && v10 != 0) {
                while(v2 < s.length() && s.charAt(v2) == 0x20) {
                    ++v2;
                }
            }
            int v12;
            for(v12 = v2; v12 < s.length(); ++v12) {
                int v13 = s.charAt(v12);
                if(!new CharRange('0', '9').contains(((char)v13)) && v13 != 46) {
                    break;
                }
            }
            Intrinsics.checkNotNull(s, "null cannot be cast to non-null type java.lang.String");
            String s4 = s.substring(v2, v12);
            Intrinsics.checkNotNullExpressionValue(s4, "substring(...)");
            if(s4.length() == 0) {
                throw new IllegalArgumentException();
            }
            int v14 = s4.length() + v2;
            int v15;
            for(v15 = v14; v15 < s.length() && new CharRange('a', 'z').contains(s.charAt(v15)); ++v15) {
            }
            Intrinsics.checkNotNull(s, "null cannot be cast to non-null type java.lang.String");
            String s5 = s.substring(v14, v15);
            Intrinsics.checkNotNullExpressionValue(s5, "substring(...)");
            v2 = s5.length() + v14;
            DurationUnit durationUnit1 = b.durationUnitByShortName(s5);
            if(enum1 != null && enum1.compareTo(durationUnit1) <= 0) {
                throw new IllegalArgumentException("Unexpected order of duration components");
            }
            int v16 = StringsKt__StringsKt.indexOf$default(s4, '.', 0, false, 6, null);
            if(v16 > 0) {
                Intrinsics.checkNotNull(s4, "null cannot be cast to non-null type java.lang.String");
                String s6 = s4.substring(0, v16);
                Intrinsics.checkNotNullExpressionValue(s6, "substring(...)");
                long v17 = Duration.plus-LRDsOJo(v11, DurationKt.toDuration(Long.parseLong(s6), durationUnit1));
                Intrinsics.checkNotNull(s4, "null cannot be cast to non-null type java.lang.String");
                String s7 = s4.substring(v16);
                Intrinsics.checkNotNullExpressionValue(s7, "substring(...)");
                v11 = Duration.plus-LRDsOJo(v17, DurationKt.toDuration(Double.parseDouble(s7), durationUnit1));
                if(v2 < v1) {
                    throw new IllegalArgumentException("Fractional component must be last");
                }
            }
            else {
                v11 = Duration.plus-LRDsOJo(v11, DurationKt.toDuration(Long.parseLong(s4), durationUnit1));
            }
            enum1 = durationUnit1;
        }
        v = v11;
        return z1 ? Duration.unaryMinus-UwyO8pc(v) : v;
    }

    public static final long b(long v) {
        return Duration.constructor-impl(v << 1);
    }

    public static final long c(String s) {
        int v = s.length();
        int v1 = v <= 0 || !StringsKt__StringsKt.contains$default("+-", s.charAt(0), false, 2, null) ? 0 : 1;
        if(v - v1 > 16) {
            IntRange intRange0 = new IntRange(v1, StringsKt__StringsKt.getLastIndex(s));
            if(!(intRange0 instanceof Collection) || !((Collection)intRange0).isEmpty()) {
                Iterator iterator0 = intRange0.iterator();
                while(iterator0.hasNext()) {
                    int v2 = ((IntIterator)iterator0).nextInt();
                    if(new CharRange('0', '9').contains(s.charAt(v2))) {
                        continue;
                    }
                    goto label_11;
                }
            }
            return s.charAt(0) == 45 ? 0x8000000000000000L : 0x7FFFFFFFFFFFFFFFL;
        }
    label_11:
        if(p.startsWith$default(s, "+", false, 2, null)) {
            s = StringsKt___StringsKt.drop(s, 1);
        }
        return Long.parseLong(s);
    }

    public static final long getDays(double f) {
        return DurationKt.toDuration(f, DurationUnit.DAYS);
    }

    public static final long getDays(int v) {
        return DurationKt.toDuration(v, DurationUnit.DAYS);
    }

    public static final long getDays(long v) {
        return DurationKt.toDuration(v, DurationUnit.DAYS);
    }

    @Deprecated(message = "Use \'Double.days\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getDays$annotations(double f) {
    }

    @Deprecated(message = "Use \'Int.days\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getDays$annotations(int v) {
    }

    @Deprecated(message = "Use \'Long.days\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getDays$annotations(long v) {
    }

    public static final long getHours(double f) {
        return DurationKt.toDuration(f, DurationUnit.HOURS);
    }

    public static final long getHours(int v) {
        return DurationKt.toDuration(v, DurationUnit.HOURS);
    }

    public static final long getHours(long v) {
        return DurationKt.toDuration(v, DurationUnit.HOURS);
    }

    @Deprecated(message = "Use \'Double.hours\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getHours$annotations(double f) {
    }

    @Deprecated(message = "Use \'Int.hours\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getHours$annotations(int v) {
    }

    @Deprecated(message = "Use \'Long.hours\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getHours$annotations(long v) {
    }

    public static final long getMicroseconds(double f) {
        return DurationKt.toDuration(f, DurationUnit.MICROSECONDS);
    }

    public static final long getMicroseconds(int v) {
        return DurationKt.toDuration(v, DurationUnit.MICROSECONDS);
    }

    public static final long getMicroseconds(long v) {
        return DurationKt.toDuration(v, DurationUnit.MICROSECONDS);
    }

    @Deprecated(message = "Use \'Double.microseconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getMicroseconds$annotations(double f) {
    }

    @Deprecated(message = "Use \'Int.microseconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getMicroseconds$annotations(int v) {
    }

    @Deprecated(message = "Use \'Long.microseconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getMicroseconds$annotations(long v) {
    }

    public static final long getMilliseconds(double f) {
        return DurationKt.toDuration(f, DurationUnit.MILLISECONDS);
    }

    public static final long getMilliseconds(int v) {
        return DurationKt.toDuration(v, DurationUnit.MILLISECONDS);
    }

    public static final long getMilliseconds(long v) {
        return DurationKt.toDuration(v, DurationUnit.MILLISECONDS);
    }

    @Deprecated(message = "Use \'Double.milliseconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getMilliseconds$annotations(double f) {
    }

    @Deprecated(message = "Use \'Int.milliseconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getMilliseconds$annotations(int v) {
    }

    @Deprecated(message = "Use \'Long.milliseconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getMilliseconds$annotations(long v) {
    }

    public static final long getMinutes(double f) {
        return DurationKt.toDuration(f, DurationUnit.MINUTES);
    }

    public static final long getMinutes(int v) {
        return DurationKt.toDuration(v, DurationUnit.MINUTES);
    }

    public static final long getMinutes(long v) {
        return DurationKt.toDuration(v, DurationUnit.MINUTES);
    }

    @Deprecated(message = "Use \'Double.minutes\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getMinutes$annotations(double f) {
    }

    @Deprecated(message = "Use \'Int.minutes\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getMinutes$annotations(int v) {
    }

    @Deprecated(message = "Use \'Long.minutes\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getMinutes$annotations(long v) {
    }

    public static final long getNanoseconds(double f) {
        return DurationKt.toDuration(f, DurationUnit.NANOSECONDS);
    }

    public static final long getNanoseconds(int v) {
        return DurationKt.toDuration(v, DurationUnit.NANOSECONDS);
    }

    public static final long getNanoseconds(long v) {
        return DurationKt.toDuration(v, DurationUnit.NANOSECONDS);
    }

    @Deprecated(message = "Use \'Double.nanoseconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getNanoseconds$annotations(double f) {
    }

    @Deprecated(message = "Use \'Int.nanoseconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getNanoseconds$annotations(int v) {
    }

    @Deprecated(message = "Use \'Long.nanoseconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getNanoseconds$annotations(long v) {
    }

    public static final long getSeconds(double f) {
        return DurationKt.toDuration(f, DurationUnit.SECONDS);
    }

    public static final long getSeconds(int v) {
        return DurationKt.toDuration(v, DurationUnit.SECONDS);
    }

    public static final long getSeconds(long v) {
        return DurationKt.toDuration(v, DurationUnit.SECONDS);
    }

    @Deprecated(message = "Use \'Double.seconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getSeconds$annotations(double f) {
    }

    @Deprecated(message = "Use \'Int.seconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getSeconds$annotations(int v) {
    }

    @Deprecated(message = "Use \'Long.seconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static void getSeconds$annotations(long v) {
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(double f, @NotNull DurationUnit durationUnit0) {
        Intrinsics.checkNotNullParameter(durationUnit0, "unit");
        double f1 = a.convertDurationUnit(f, durationUnit0, DurationUnit.NANOSECONDS);
        if(Double.isNaN(f1)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long v = zd.c.roundToLong(f1);
        return new LongRange(0xC00000000005EB41L, 0x3FFFFFFFFFFA14BFL).contains(v) ? DurationKt.b(v) : DurationKt.a(zd.c.roundToLong(a.convertDurationUnit(f, durationUnit0, DurationUnit.MILLISECONDS)));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(int v, @NotNull DurationUnit durationUnit0) {
        Intrinsics.checkNotNullParameter(durationUnit0, "unit");
        return durationUnit0.compareTo(DurationUnit.SECONDS) > 0 ? DurationKt.toDuration(v, durationUnit0) : DurationKt.b(a.convertDurationUnitOverflow(v, durationUnit0, DurationUnit.NANOSECONDS));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(long v, @NotNull DurationUnit durationUnit0) {
        Intrinsics.checkNotNullParameter(durationUnit0, "unit");
        long v1 = a.convertDurationUnitOverflow(0x3FFFFFFFFFFA14BFL, DurationUnit.NANOSECONDS, durationUnit0);
        return new LongRange(-v1, v1).contains(v) ? DurationKt.b(a.convertDurationUnitOverflow(v, durationUnit0, DurationUnit.NANOSECONDS)) : Duration.constructor-impl((c.coerceIn(a.convertDurationUnit(v, durationUnit0, DurationUnit.MILLISECONDS), 0xC000000000000001L, 0x3FFFFFFFFFFFFFFFL) << 1) + 1L);
    }
}

