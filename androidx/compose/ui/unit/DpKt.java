package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u000E\u001A\"\u00105\u001A\u00020\u00012\u0006\u00106\u001A\u00020\b2\u0006\u00107\u001A\u00020\bH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b8\u00109\u001A\"\u0010:\u001A\u00020\u00022\u0006\u00102\u001A\u00020\b2\u0006\u0010\u0014\u001A\u00020\bH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b;\u00109\u001A*\u0010<\u001A\u00020\b2\u0006\u0010=\u001A\u00020\b2\u0006\u0010>\u001A\u00020\b2\u0006\u0010?\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b@\u0010A\u001A*\u0010<\u001A\u00020\u00012\u0006\u0010=\u001A\u00020\u00012\u0006\u0010>\u001A\u00020\u00012\u0006\u0010?\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\bB\u0010C\u001A*\u0010<\u001A\u00020\u00022\u0006\u0010=\u001A\u00020\u00022\u0006\u0010>\u001A\u00020\u00022\u0006\u0010?\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\bD\u0010C\u001A#\u0010E\u001A\u00020\b2\u0006\u0010F\u001A\u00020\b2\u0006\u0010G\u001A\u00020\bH\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\bH\u0010I\u001A#\u0010J\u001A\u00020\b2\u0006\u0010F\u001A\u00020\b2\u0006\u0010G\u001A\u00020\bH\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\bK\u0010I\u001A\u001F\u0010L\u001A\u00020\b*\u00020\b2\u0006\u0010M\u001A\u00020\bH\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\bN\u0010I\u001A\u001F\u0010O\u001A\u00020\b*\u00020\b2\u0006\u0010P\u001A\u00020\bH\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\bQ\u0010I\u001A\'\u0010R\u001A\u00020\b*\u00020\b2\u0006\u0010M\u001A\u00020\b2\u0006\u0010P\u001A\u00020\bH\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\bS\u0010A\u001A%\u0010T\u001A\u00020\b*\u00020\b2\f\u0010U\u001A\b\u0012\u0004\u0012\u00020\b0VH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\bW\u0010X\u001A%\u0010T\u001A\u00020\u0001*\u00020\u00012\f\u0010U\u001A\b\u0012\u0004\u0012\u00020\u00010VH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\bY\u0010Z\u001A%\u0010T\u001A\u00020\u0002*\u00020\u00022\f\u0010U\u001A\b\u0012\u0004\u0012\u00020\u00020VH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b[\u0010Z\u001A\u001F\u0010\\\u001A\u00020\b*\u00020\t2\u0006\u0010]\u001A\u00020\bH\u0087\n\u00F8\u0001\u0000\u00A2\u0006\u0004\b^\u0010_\u001A\u001F\u0010\\\u001A\u00020\b*\u00020\u000E2\u0006\u0010]\u001A\u00020\bH\u0087\n\u00F8\u0001\u0000\u00A2\u0006\u0004\b^\u0010I\u001A\u001F\u0010\\\u001A\u00020\u0002*\u00020\u000E2\u0006\u0010.\u001A\u00020\u0002H\u0087\n\u00F8\u0001\u0000\u00A2\u0006\u0004\b`\u0010a\u001A\u001F\u0010\\\u001A\u00020\b*\u00020\u00112\u0006\u0010]\u001A\u00020\bH\u0087\n\u00F8\u0001\u0000\u00A2\u0006\u0004\b^\u0010b\u001A\u001F\u0010\\\u001A\u00020\u0002*\u00020\u00112\u0006\u0010.\u001A\u00020\u0002H\u0087\n\u00F8\u0001\u0000\u00A2\u0006\u0004\b`\u0010c\"\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"\u001F\u0010\u0007\u001A\u00020\b*\u00020\t8\u00C6\u0002X\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r\"\u001F\u0010\u0007\u001A\u00020\b*\u00020\u000E8\u00C6\u0002X\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\n\u0010\u000F\u001A\u0004\b\f\u0010\u0010\"\u001F\u0010\u0007\u001A\u00020\b*\u00020\u00118\u00C6\u0002X\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\n\u0010\u0012\u001A\u0004\b\f\u0010\u0013\"\u001F\u0010\u0014\u001A\u00020\b*\u00020\u00158\u00C6\u0002X\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u001F\u0010\u001A\u001A\u00020\u001B*\u00020\b8\u00C6\u0002X\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u001C\u0010\u000F\u001A\u0004\b\u001D\u0010\u001E\"\u001F\u0010\u001F\u001A\u00020\u001B*\u00020\b8\u00C6\u0002X\u0087\u0004\u00A2\u0006\f\u0012\u0004\b \u0010\u000F\u001A\u0004\b!\u0010\u001E\"\u001F\u0010\u001F\u001A\u00020\u001B*\u00020\u00018\u00C6\u0002X\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\"\u0010\u0004\u001A\u0004\b#\u0010$\"\u001F\u0010\u001F\u001A\u00020\u001B*\u00020\u00028\u00C6\u0002X\u0087\u0004\u00A2\u0006\f\u0012\u0004\b%\u0010\u0004\u001A\u0004\b&\u0010$\"\u001F\u0010\'\u001A\u00020\u001B*\u00020\b8\u00C6\u0002X\u0087\u0004\u00A2\u0006\f\u0012\u0004\b(\u0010\u000F\u001A\u0004\b)\u0010\u001E\"\u001F\u0010\'\u001A\u00020\u001B*\u00020\u00018\u00C6\u0002X\u0087\u0004\u00A2\u0006\f\u0012\u0004\b*\u0010\u0004\u001A\u0004\b+\u0010$\"\u001F\u0010\'\u001A\u00020\u001B*\u00020\u00028\u00C6\u0002X\u0087\u0004\u00A2\u0006\f\u0012\u0004\b,\u0010\u0004\u001A\u0004\b-\u0010$\"\u001F\u0010.\u001A\u00020\u0002*\u00020\u00158\u00C6\u0002X\u0087\u0004\u00A2\u0006\f\u0012\u0004\b/\u0010\u0017\u001A\u0004\b0\u00101\"\u001F\u00102\u001A\u00020\b*\u00020\u00158\u00C6\u0002X\u0087\u0004\u00A2\u0006\f\u0012\u0004\b3\u0010\u0017\u001A\u0004\b4\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006d"}, d2 = {"center", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/ui/unit/DpSize;", "getCenter-EaSLcWc$annotations", "(J)V", "getCenter-EaSLcWc", "(J)J", "dp", "Landroidx/compose/ui/unit/Dp;", "", "getDp$annotations", "(D)V", "getDp", "(D)F", "", "(F)V", "(F)F", "", "(I)V", "(I)F", "height", "Landroidx/compose/ui/unit/DpRect;", "getHeight$annotations", "(Landroidx/compose/ui/unit/DpRect;)V", "getHeight", "(Landroidx/compose/ui/unit/DpRect;)F", "isFinite", "", "isFinite-0680j_4$annotations", "isFinite-0680j_4", "(F)Z", "isSpecified", "isSpecified-0680j_4$annotations", "isSpecified-0680j_4", "isSpecified-jo-Fl9I$annotations", "isSpecified-jo-Fl9I", "(J)Z", "isSpecified-EaSLcWc$annotations", "isSpecified-EaSLcWc", "isUnspecified", "isUnspecified-0680j_4$annotations", "isUnspecified-0680j_4", "isUnspecified-jo-Fl9I$annotations", "isUnspecified-jo-Fl9I", "isUnspecified-EaSLcWc$annotations", "isUnspecified-EaSLcWc", "size", "getSize$annotations", "getSize", "(Landroidx/compose/ui/unit/DpRect;)J", "width", "getWidth$annotations", "getWidth", "DpOffset", "x", "y", "DpOffset-YgX7TsA", "(FF)J", "DpSize", "DpSize-YgX7TsA", "lerp", "start", "stop", "fraction", "lerp-Md-fbLM", "(FFF)F", "lerp-xhh869w", "(JJF)J", "lerp-IDex15A", "max", "a", "b", "max-YgX7TsA", "(FF)F", "min", "min-YgX7TsA", "coerceAtLeast", "minimumValue", "coerceAtLeast-YgX7TsA", "coerceAtMost", "maximumValue", "coerceAtMost-YgX7TsA", "coerceIn", "coerceIn-2z7ARbQ", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-D5KLDUw", "(FLkotlin/jvm/functions/Function0;)F", "takeOrElse-gVKV90s", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse-itqla9I", "times", "other", "times-3ABfNKs", "(DF)F", "times-6HolHcs", "(FJ)J", "(IF)F", "(IJ)J", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,576:1\n124#1:577\n324#1:581\n482#1:588\n563#1:599\n569#1:601\n63#2,3:578\n63#2,3:582\n63#2,3:585\n63#2,3:591\n63#2,3:594\n68#3:589\n68#3:590\n56#3:597\n56#3:598\n56#3:600\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n138#1:577\n338#1:581\n496#1:588\n575#1:599\n575#1:601\n248#1:578,3\n354#1:582,3\n364#1:585,3\n505#1:591,3\n530#1:594,3\n506#1:589\n507#1:590\n563#1:597\n569#1:598\n575#1:600\n*E\n"})
public final class DpKt {
    @Stable
    public static final long DpOffset-YgX7TsA(float f, float f1) [...] // 潜在的解密器

    @Stable
    public static final long DpSize-YgX7TsA(float f, float f1) {
        return ((long)Float.floatToRawIntBits(f1)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f)) << 0x20;
    }

    @Stable
    public static final float coerceAtLeast-YgX7TsA(float f, float f1) {
        return c.coerceAtLeast(f, f1);
    }

    @Stable
    public static final float coerceAtMost-YgX7TsA(float f, float f1) {
        return c.coerceAtMost(f, f1);
    }

    @Stable
    public static final float coerceIn-2z7ARbQ(float f, float f1, float f2) {
        return Dp.constructor-impl(c.coerceIn(f, f1, f2));
    }

    public static final long getCenter-EaSLcWc(long v) {
        return ((long)Float.floatToRawIntBits(DpSize.getHeight-D9Ej5fM(v) / 2.0f)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(DpSize.getWidth-D9Ej5fM(v) / 2.0f)) << 0x20;
    }

    @Stable
    public static void getCenter-EaSLcWc$annotations(long v) {
    }

    public static final float getDp(double f) {
        return (float)f;
    }

    public static final float getDp(float f) {
        return Dp.constructor-impl(f);
    }

    public static final float getDp(int v) {
        return Dp.constructor-impl(v);
    }

    @Stable
    public static void getDp$annotations(double f) {
    }

    @Stable
    public static void getDp$annotations(float f) {
    }

    @Stable
    public static void getDp$annotations(int v) {
    }

    public static final float getHeight(@NotNull DpRect dpRect0) {
        return Dp.constructor-impl(dpRect0.getBottom-D9Ej5fM() - dpRect0.getTop-D9Ej5fM());
    }

    @Stable
    public static void getHeight$annotations(DpRect dpRect0) {
    }

    public static final long getSize(@NotNull DpRect dpRect0) {
        return DpKt.DpSize-YgX7TsA(Dp.constructor-impl(dpRect0.getRight-D9Ej5fM() - dpRect0.getLeft-D9Ej5fM()), Dp.constructor-impl(dpRect0.getBottom-D9Ej5fM() - dpRect0.getTop-D9Ej5fM()));
    }

    @Stable
    public static void getSize$annotations(DpRect dpRect0) {
    }

    public static final float getWidth(@NotNull DpRect dpRect0) {
        return Dp.constructor-impl(dpRect0.getRight-D9Ej5fM() - dpRect0.getLeft-D9Ej5fM());
    }

    @Stable
    public static void getWidth$annotations(DpRect dpRect0) {
    }

    public static final boolean isFinite-0680j_4(float f) {
        return Float.compare(f, Infinityf) == 0 ? 0 : 1;
    }

    @Stable
    public static void isFinite-0680j_4$annotations(float f) {
    }

    public static final boolean isSpecified-0680j_4(float f) {
        return !Float.isNaN(f);
    }

    @Stable
    public static void isSpecified-0680j_4$annotations(float f) {
    }

    public static final boolean isSpecified-EaSLcWc(long v) {
        return v != 0x7FC000007FC00000L;
    }

    @Stable
    public static void isSpecified-EaSLcWc$annotations(long v) {
    }

    public static final boolean isSpecified-jo-Fl9I(long v) {
        return v != 0x7FC000007FC00000L;
    }

    @Stable
    public static void isSpecified-jo-Fl9I$annotations(long v) {
    }

    public static final boolean isUnspecified-0680j_4(float f) {
        return Float.isNaN(f);
    }

    @Stable
    public static void isUnspecified-0680j_4$annotations(float f) {
    }

    public static final boolean isUnspecified-EaSLcWc(long v) {
        return v == 0x7FC000007FC00000L;
    }

    @Stable
    public static void isUnspecified-EaSLcWc$annotations(long v) {
    }

    public static final boolean isUnspecified-jo-Fl9I(long v) {
        return v == 0x7FC000007FC00000L;
    }

    @Stable
    public static void isUnspecified-jo-Fl9I$annotations(long v) {
    }

    @Stable
    public static final long lerp-IDex15A(long v, long v1, float f) {
        return ((long)Float.floatToRawIntBits(DpKt.lerp-Md-fbLM(DpSize.getWidth-D9Ej5fM(v), DpSize.getWidth-D9Ej5fM(v1), f))) << 0x20 | ((long)Float.floatToRawIntBits(DpKt.lerp-Md-fbLM(DpSize.getHeight-D9Ej5fM(v), DpSize.getHeight-D9Ej5fM(v1), f))) & 0xFFFFFFFFL;
    }

    @Stable
    public static final float lerp-Md-fbLM(float f, float f1, float f2) {
        return f2 * f1 + (1.0f - f2) * f;
    }

    @Stable
    public static final long lerp-xhh869w(long v, long v1, float f) {
        return ((long)Float.floatToRawIntBits(f * DpOffset.getX-D9Ej5fM(v1) + (1.0f - f) * DpOffset.getX-D9Ej5fM(v))) << 0x20 | ((long)Float.floatToRawIntBits(f * DpOffset.getY-D9Ej5fM(v1) + (1.0f - f) * DpOffset.getY-D9Ej5fM(v))) & 0xFFFFFFFFL;
    }

    @Stable
    public static final float max-YgX7TsA(float f, float f1) {
        return Math.max(f, f1);
    }

    @Stable
    public static final float min-YgX7TsA(float f, float f1) {
        return Dp.constructor-impl(Math.min(f, f1));
    }

    // 去混淆评级： 低(20)
    public static final float takeOrElse-D5KLDUw(float f, @NotNull Function0 function00) {
        return Float.isNaN(f) ? ((Dp)function00.invoke()).unbox-impl() : f;
    }

    public static final long takeOrElse-gVKV90s(long v, @NotNull Function0 function00) {
        return v == 0x7FC000007FC00000L ? ((DpOffset)function00.invoke()).unbox-impl() : v;
    }

    public static final long takeOrElse-itqla9I(long v, @NotNull Function0 function00) {
        return v == 0x7FC000007FC00000L ? ((DpSize)function00.invoke()).unbox-impl() : v;
    }

    @Stable
    public static final float times-3ABfNKs(double f, float f1) {
        return ((float)f) * f1;
    }

    @Stable
    public static final float times-3ABfNKs(float f, float f1) {
        return f * f1;
    }

    @Stable
    public static final float times-3ABfNKs(int v, float f) {
        return Dp.constructor-impl(((float)v) * f);
    }

    @Stable
    public static final long times-6HolHcs(float f, long v) {
        return DpSize.times-Gh9hcWk(v, f);
    }

    @Stable
    public static final long times-6HolHcs(int v, long v1) {
        return DpSize.times-Gh9hcWk(v1, v);
    }
}

