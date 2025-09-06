package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0014\u001A \u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0005\u0010\u0006\u001A%\u0010\f\u001A\u00020\u0004*\u00020\u00042\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00040\bH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\n\u0010\u000B\u001A\u001F\u0010\u000F\u001A\u00020\u0004*\u00020\u00002\u0006\u0010\r\u001A\u00020\u0004H\u0087\n\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000E\u0010\u0006\u001A\u001F\u0010\u000F\u001A\u00020\u0004*\u00020\u00102\u0006\u0010\r\u001A\u00020\u0004H\u0087\n\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000E\u0010\u0011\u001A\u001F\u0010\u000F\u001A\u00020\u0004*\u00020\u00122\u0006\u0010\r\u001A\u00020\u0004H\u0087\n\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000E\u0010\u0013\u001A\u001F\u0010\u0017\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u0000H\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018\u001A\u001A\u0010\u001D\u001A\u00020\u001A2\u0006\u0010\u0019\u001A\u00020\u0004H\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001C\u001A\"\u0010\u001D\u001A\u00020\u001A2\u0006\u0010\u0019\u001A\u00020\u00042\u0006\u0010\u001E\u001A\u00020\u0004H\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 \u001A*\u0010\u001D\u001A\u00020\u001A2\u0006\u0010\u0019\u001A\u00020\u00042\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010!\u001A\u00020\u0004H\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010#\u001A*\u0010)\u001A\u00020\u00042\u0006\u0010$\u001A\u00020\u00042\u0006\u0010%\u001A\u00020\u00042\u0006\u0010&\u001A\u00020\u0000H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\'\u0010(\"\u001F\u0010.\u001A\u00020**\u00020\u00048\u00C6\u0002X\u0087\u0004\u00A2\u0006\f\u0012\u0004\b-\u0010\u001C\u001A\u0004\b+\u0010,\"\u001E\u00101\u001A\u00020**\u00020\u00048FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b0\u0010\u001C\u001A\u0004\b/\u0010,\"\u001E\u00106\u001A\u00020\u0004*\u00020\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b4\u00105\u001A\u0004\b2\u00103\"\u001E\u00109\u001A\u00020\u0004*\u00020\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b8\u00105\u001A\u0004\b7\u00103\"\u001E\u00106\u001A\u00020\u0004*\u00020\u00108FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b4\u0010;\u001A\u0004\b2\u0010:\"\u001E\u00109\u001A\u00020\u0004*\u00020\u00108FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b8\u0010;\u001A\u0004\b7\u0010:\"\u001E\u00106\u001A\u00020\u0004*\u00020\u00128FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b4\u0010=\u001A\u0004\b2\u0010<\"\u001E\u00109\u001A\u00020\u0004*\u00020\u00128FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b8\u0010=\u001A\u0004\b7\u0010<\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006>"}, d2 = {"", "value", "Landroidx/compose/ui/unit/TextUnitType;", "type", "Landroidx/compose/ui/unit/TextUnit;", "TextUnit-anM5pPY", "(FJ)J", "TextUnit", "Lkotlin/Function0;", "block", "takeOrElse-eAf_CNQ", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse", "other", "times-mpE4wyQ", "times", "", "(DJ)J", "", "(IJ)J", "", "unitType", "v", "pack", "(JF)J", "a", "", "checkArithmetic--R2X_6o", "(J)V", "checkArithmetic", "b", "checkArithmetic-NB67dxo", "(JJ)V", "c", "checkArithmetic-vU-0ePk", "(JJJ)V", "start", "stop", "fraction", "lerp-C3pnCVY", "(JJF)J", "lerp", "", "isSpecified--R2X_6o", "(J)Z", "isSpecified--R2X_6o$annotations", "isSpecified", "isUnspecified--R2X_6o", "isUnspecified--R2X_6o$annotations", "isUnspecified", "getSp", "(F)J", "getSp$annotations", "(F)V", "sp", "getEm", "getEm$annotations", "em", "(D)J", "(D)V", "(I)J", "(I)V", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,389:1\n251#1:390\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n265#1:390\n*E\n"})
public final class TextUnitKt {
    public static final long TextUnit-anM5pPY(float f, long v) {
        return TextUnitKt.pack(v, f);
    }

    @PublishedApi
    public static final void checkArithmetic--R2X_6o(long v) {
        if(TextUnitKt.isUnspecified--R2X_6o(v)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    @PublishedApi
    public static final void checkArithmetic-NB67dxo(long v, long v1) {
        if(TextUnitKt.isUnspecified--R2X_6o(v) || TextUnitKt.isUnspecified--R2X_6o(v1)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if(!TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(v), TextUnit.getType-UIouoOA(v1))) {
            throw new IllegalArgumentException(("Cannot perform operation for " + TextUnitType.toString-impl(TextUnit.getType-UIouoOA(v)) + " and " + TextUnitType.toString-impl(TextUnit.getType-UIouoOA(v1))).toString());
        }
    }

    @PublishedApi
    public static final void checkArithmetic-vU-0ePk(long v, long v1, long v2) {
        if(TextUnitKt.isUnspecified--R2X_6o(v) || TextUnitKt.isUnspecified--R2X_6o(v1) || TextUnitKt.isUnspecified--R2X_6o(v2)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if(!TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(v), TextUnit.getType-UIouoOA(v1)) || !TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(v1), TextUnit.getType-UIouoOA(v2))) {
            throw new IllegalArgumentException(("Cannot perform operation for " + TextUnitType.toString-impl(TextUnit.getType-UIouoOA(v)) + " and " + TextUnitType.toString-impl(TextUnit.getType-UIouoOA(v1))).toString());
        }
    }

    public static final long getEm(double f) {
        return TextUnitKt.pack(0x200000000L, ((float)f));
    }

    public static final long getEm(float f) {
        return TextUnitKt.pack(0x200000000L, f);
    }

    public static final long getEm(int v) {
        return TextUnitKt.pack(0x200000000L, ((float)v));
    }

    @Stable
    public static void getEm$annotations(double f) {
    }

    @Stable
    public static void getEm$annotations(float f) {
    }

    @Stable
    public static void getEm$annotations(int v) {
    }

    public static final long getSp(double f) [...] // 潜在的解密器

    public static final long getSp(float f) {
        return TextUnitKt.pack(0x100000000L, f);
    }

    public static final long getSp(int v) [...] // 潜在的解密器

    @Stable
    public static void getSp$annotations(double f) {
    }

    @Stable
    public static void getSp$annotations(float f) {
    }

    @Stable
    public static void getSp$annotations(int v) {
    }

    public static final boolean isSpecified--R2X_6o(long v) {
        return !TextUnitKt.isUnspecified--R2X_6o(v);
    }

    @Stable
    public static void isSpecified--R2X_6o$annotations(long v) {
    }

    public static final boolean isUnspecified--R2X_6o(long v) {
        return (v & 0xFF00000000L) == 0L;
    }

    @Stable
    public static void isUnspecified--R2X_6o$annotations(long v) {
    }

    @Stable
    public static final long lerp-C3pnCVY(long v, long v1, float f) {
        TextUnitKt.checkArithmetic-NB67dxo(v, v1);
        return TextUnitKt.pack(v & 0xFF00000000L, f * TextUnit.getValue-impl(v1) + (1.0f - f) * TextUnit.getValue-impl(v));
    }

    @PublishedApi
    public static final long pack(long v, float f) [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static final long takeOrElse-eAf_CNQ(long v, @NotNull Function0 function00) {
        return TextUnitKt.isUnspecified--R2X_6o(v) ? ((TextUnit)function00.invoke()).unbox-impl() : v;
    }

    @Stable
    public static final long times-mpE4wyQ(double f, long v) {
        TextUnitKt.checkArithmetic--R2X_6o(v);
        return TextUnitKt.pack(TextUnit.getRawType-impl(v), TextUnit.getValue-impl(v) * ((float)f));
    }

    @Stable
    public static final long times-mpE4wyQ(float f, long v) {
        TextUnitKt.checkArithmetic--R2X_6o(v);
        return TextUnitKt.pack(v & 0xFF00000000L, TextUnit.getValue-impl(v) * f);
    }

    @Stable
    public static final long times-mpE4wyQ(int v, long v1) {
        TextUnitKt.checkArithmetic--R2X_6o(v1);
        return TextUnitKt.pack(TextUnit.getRawType-impl(v1), TextUnit.getValue-impl(v1) * ((float)v));
    }
}

