package kotlin.time;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\u001A\u001F\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A\u001F\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\"\u001A\u0010\t\u001A\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"", "value", "", "decimals", "", "formatToExactDecimals", "(DI)Ljava/lang/String;", "formatUpToDecimals", "", "durationAssertionsEnabled", "Z", "getDurationAssertionsEnabled", "()Z", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDurationJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationJvm.kt\nkotlin/time/DurationJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class DurationJvmKt {
    public static final ThreadLocal[] a;

    static {
        ThreadLocal[] arr_threadLocal = new ThreadLocal[4];
        for(int v = 0; v < 4; ++v) {
            arr_threadLocal[v] = new ThreadLocal();
        }
        DurationJvmKt.a = arr_threadLocal;
    }

    public static final DecimalFormat a(int v) {
        DecimalFormat decimalFormat0 = new DecimalFormat("0");
        if(v > 0) {
            decimalFormat0.setMinimumFractionDigits(v);
        }
        decimalFormat0.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat0;
    }

    @NotNull
    public static final String formatToExactDecimals(double f, int v) {
        DecimalFormat decimalFormat1;
        ThreadLocal[] arr_threadLocal = DurationJvmKt.a;
        if(v < arr_threadLocal.length) {
            ThreadLocal threadLocal0 = arr_threadLocal[v];
            DecimalFormat decimalFormat0 = threadLocal0.get();
            if(decimalFormat0 == null) {
                decimalFormat0 = DurationJvmKt.a(v);
                threadLocal0.set(decimalFormat0);
            }
            else {
                Intrinsics.checkNotNull(decimalFormat0);
            }
            decimalFormat1 = decimalFormat0;
        }
        else {
            decimalFormat1 = DurationJvmKt.a(v);
        }
        String s = decimalFormat1.format(f);
        Intrinsics.checkNotNullExpressionValue(s, "format(...)");
        return s;
    }

    @NotNull
    public static final String formatUpToDecimals(double f, int v) {
        DecimalFormat decimalFormat0 = DurationJvmKt.a(0);
        decimalFormat0.setMaximumFractionDigits(v);
        String s = decimalFormat0.format(f);
        Intrinsics.checkNotNullExpressionValue(s, "format(...)");
        return s;
    }

    public static final boolean getDurationAssertionsEnabled() [...] // Inlined contents
}

