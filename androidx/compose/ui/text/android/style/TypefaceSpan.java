package androidx.compose.ui.text.android.style;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/android/style/TypefaceSpan;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/graphics/Typeface;", "typeface", "<init>", "(Landroid/graphics/Typeface;)V", "Landroid/text/TextPaint;", "ds", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "paint", "updateMeasureState", "a", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TypefaceSpan extends MetricAffectingSpan {
    public static final int $stable = 8;
    public final Typeface a;

    public TypefaceSpan(@NotNull Typeface typeface0) {
        this.a = typeface0;
    }

    @NotNull
    public final Typeface getTypeface() {
        return this.a;
    }

    @Override  // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint0) {
        textPaint0.setTypeface(this.a);
    }

    @Override  // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint textPaint0) {
        textPaint0.setTypeface(this.a);
    }
}

