package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\t\u001A\u001F\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001A%\u0010\n\u001A\u00020\u0003*\u00020\u00032\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001A\u001F\u0010\u000F\u001A\u00020\u000B*\u00020\u000B2\u0006\u0010\f\u001A\u00020\u0003H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000E\u001A\u001F\u0010\u000F\u001A\u00020\u000B*\u00020\u00032\u0006\u0010\u0010\u001A\u00020\u000BH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000E\u001A\u001F\u0010\u0013\u001A\u00020\u000B*\u00020\u000B2\u0006\u0010\f\u001A\u00020\u0003H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000E\u001A*\u0010\u0019\u001A\u00020\u00032\u0006\u0010\u0014\u001A\u00020\u00032\u0006\u0010\u0015\u001A\u00020\u00032\u0006\u0010\u0016\u001A\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u001F\u0010\u001F\u001A\u00020\u001A*\u00020\u00038Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001B\u0010\u001C\"\u001F\u0010\"\u001A\u00020\u001A*\u00020\u00038Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u001E\u001A\u0004\b \u0010\u001C\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006#"}, d2 = {"", "scaleX", "scaleY", "Landroidx/compose/ui/layout/ScaleFactor;", "ScaleFactor", "(FF)J", "Lkotlin/Function0;", "block", "takeOrElse-oyDd2qo", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse", "Landroidx/compose/ui/geometry/Size;", "scaleFactor", "times-UQTWf7w", "(JJ)J", "times", "size", "times-m-w2e94", "div-UQTWf7w", "div", "start", "stop", "fraction", "lerp--bDIf60", "(JJF)J", "lerp", "", "isSpecified-FK8aYYs", "(J)Z", "isSpecified-FK8aYYs$annotations", "(J)V", "isSpecified", "isUnspecified-FK8aYYs", "isUnspecified-FK8aYYs$annotations", "isUnspecified", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,199:1\n131#1:203\n63#2,3:200\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n145#1:203\n32#1:200,3\n*E\n"})
public final class ScaleFactorKt {
    @Stable
    public static final long ScaleFactor(float f, float f1) [...] // 潜在的解密器

    public static final float access$roundToTenths(float f) {
        int v = (int)(f * 10.0f);
        return ((float)(f * 10.0f - ((float)v) >= 0.5f ? v + 1 : ((int)(f * 10.0f)))) / 10.0f;
    }

    @Stable
    public static final long div-UQTWf7w(long v, long v1) {
        return SizeKt.Size(Size.getWidth-impl(v) / ScaleFactor.getScaleX-impl(v1), Size.getHeight-impl(v) / ScaleFactor.getScaleY-impl(v1));
    }

    // 去混淆评级： 低(20)
    public static final boolean isSpecified-FK8aYYs(long v) {
        return v != 0x7FC000007FC00000L;
    }

    @Stable
    public static void isSpecified-FK8aYYs$annotations(long v) {
    }

    // 去混淆评级： 低(20)
    public static final boolean isUnspecified-FK8aYYs(long v) {
        return v == 0x7FC000007FC00000L;
    }

    @Stable
    public static void isUnspecified-FK8aYYs$annotations(long v) {
    }

    @Stable
    public static final long lerp--bDIf60(long v, long v1, float f) {
        return ScaleFactorKt.ScaleFactor(MathHelpersKt.lerp(ScaleFactor.getScaleX-impl(v), ScaleFactor.getScaleX-impl(v1), f), MathHelpersKt.lerp(ScaleFactor.getScaleY-impl(v), ScaleFactor.getScaleY-impl(v1), f));
    }

    // 去混淆评级： 低(30)
    public static final long takeOrElse-oyDd2qo(long v, @NotNull Function0 function00) {
        return v == 0x7FC000007FC00000L ? ((ScaleFactor)function00.invoke()).unbox-impl() : v;
    }

    @Stable
    public static final long times-UQTWf7w(long v, long v1) {
        float f = Size.getWidth-impl(v);
        float f1 = ScaleFactor.getScaleX-impl(v1);
        float f2 = Size.getHeight-impl(v);
        return SizeKt.Size(f1 * f, ScaleFactor.getScaleY-impl(v1) * f2);
    }

    @Stable
    public static final long times-m-w2e94(long v, long v1) {
        return ScaleFactorKt.times-UQTWf7w(v1, v);
    }
}

