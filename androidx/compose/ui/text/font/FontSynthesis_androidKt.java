package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A6\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"synthesizeTypeface", "", "Landroidx/compose/ui/text/font/FontSynthesis;", "typeface", "font", "Landroidx/compose/ui/text/font/Font;", "requestedWeight", "Landroidx/compose/ui/text/font/FontWeight;", "requestedStyle", "Landroidx/compose/ui/text/font/FontStyle;", "synthesizeTypeface-FxwP2eA", "(ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FontSynthesis_androidKt {
    @NotNull
    public static final Object synthesizeTypeface-FxwP2eA(int v, @NotNull Object object0, @NotNull Font font0, @NotNull FontWeight fontWeight0, int v1) {
        boolean z = false;
        if(!(object0 instanceof Typeface)) {
            return object0;
        }
        boolean z1 = FontSynthesis.isWeightOn-impl$ui_text_release(v) && !Intrinsics.areEqual(font0.getWeight(), fontWeight0) && (fontWeight0.compareTo(AndroidFontUtils_androidKt.getAndroidBold(FontWeight.Companion)) >= 0 && font0.getWeight().compareTo(AndroidFontUtils_androidKt.getAndroidBold(FontWeight.Companion)) < 0);
        boolean z2 = FontSynthesis.isStyleOn-impl$ui_text_release(v) && !FontStyle.equals-impl0(v1, font0.getStyle-_-LCdwA());
        if(!z2 && !z1) {
            return object0;
        }
        if(Build.VERSION.SDK_INT < 28) {
            if(z2 && FontStyle.equals-impl0(v1, 1)) {
                z = true;
            }
            return Typeface.create(((Typeface)object0), AndroidFontUtils_androidKt.getAndroidTypefaceStyle(z1, z));
        }
        int v2 = z1 ? fontWeight0.getWeight() : font0.getWeight().getWeight();
        if(z2) {
            return TypefaceHelperMethodsApi28.INSTANCE.create(((Typeface)object0), v2, FontStyle.equals-impl0(v1, 1));
        }
        boolean z3 = FontStyle.equals-impl0(font0.getStyle-_-LCdwA(), 1);
        return TypefaceHelperMethodsApi28.INSTANCE.create(((Typeface)object0), v2, z3);
    }
}

