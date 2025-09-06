package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.font.TypefaceHelperMethodsApi28;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Deprecated(message = "This path for preloading fonts is not supported")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\r\u001A\u00020\n2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\fR\u001A\u0010\u0013\u001A\u00020\u000E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidDefaultTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "<init>", "()V", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "synthesis", "Landroid/graphics/Typeface;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "getNativeTypeface", "Landroidx/compose/ui/text/font/FontFamily;", "a", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidDefaultTypeface implements AndroidTypeface {
    public static final int $stable;
    public final SystemFontFamily a;

    public AndroidDefaultTypeface() {
        this.a = FontFamily.Companion.getDefault();
    }

    @Override  // androidx.compose.ui.text.font.Typeface
    @NotNull
    public FontFamily getFontFamily() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.text.platform.AndroidTypeface
    @NotNull
    public Typeface getNativeTypeface-PYhJU0U(@NotNull FontWeight fontWeight0, int v, int v1) {
        return Build.VERSION.SDK_INT >= 28 ? TypefaceHelperMethodsApi28.INSTANCE.create(Typeface.DEFAULT, fontWeight0.getWeight(), FontStyle.equals-impl0(v, 1)) : Typeface.defaultFromStyle(AndroidFontUtils_androidKt.getAndroidTypefaceStyle-FO1MlWM(fontWeight0, v));
    }
}

