package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import n2.a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\'\u0010\u0005\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0004\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A\u001E\u0010\u000B\u001A\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001A\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle;", "start", "stop", "", "fraction", "lerp", "(Landroidx/compose/ui/text/style/TextForegroundStyle;Landroidx/compose/ui/text/style/TextForegroundStyle;F)Landroidx/compose/ui/text/style/TextForegroundStyle;", "Landroidx/compose/ui/graphics/Color;", "alpha", "modulate-DxMtmZc", "(JF)J", "modulate", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "TextDrawStyleKt")
public final class TextDrawStyleKt {
    // 去混淆评级： 低(20)
    public static final float access$takeOrElse(float f, Function0 function00) {
        return Float.isNaN(f) ? ((Number)function00.invoke()).floatValue() : f;
    }

    @NotNull
    public static final TextForegroundStyle lerp(@NotNull TextForegroundStyle textForegroundStyle0, @NotNull TextForegroundStyle textForegroundStyle1, float f) {
        if(!(textForegroundStyle0 instanceof a) && !(textForegroundStyle1 instanceof a)) {
            long v = ColorKt.lerp-jxsXWHM(textForegroundStyle0.getColor-0d7_KjU(), textForegroundStyle1.getColor-0d7_KjU(), f);
            return TextForegroundStyle.Companion.from-8_81llA(v);
        }
        return !(textForegroundStyle0 instanceof a) || !(textForegroundStyle1 instanceof a) ? ((TextForegroundStyle)SpanStyleKt.lerpDiscrete(textForegroundStyle0, textForegroundStyle1, f)) : TextForegroundStyle.Companion.from(((Brush)SpanStyleKt.lerpDiscrete(((a)textForegroundStyle0).a, ((a)textForegroundStyle1).a, f)), MathHelpersKt.lerp(((a)textForegroundStyle0).b, ((a)textForegroundStyle1).b, f));
    }

    public static final long modulate-DxMtmZc(long v, float f) {
        return Float.isNaN(f) || f >= 1.0f ? v : Color.copy-wmQWz5c$default(v, Color.getAlpha-impl(v) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }
}

