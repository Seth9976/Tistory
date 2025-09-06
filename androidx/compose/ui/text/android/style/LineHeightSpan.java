package androidx.compose.ui.text.android.style;

import android.graphics.Paint.FontMetricsInt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\b2\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/android/style/LineHeightSpan;", "Landroid/text/style/LineHeightSpan;", "", "lineHeight", "<init>", "(F)V", "", "text", "", "start", "end", "spanstartVertical", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "", "chooseHeight", "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V", "a", "F", "getLineHeight", "()F", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LineHeightSpan implements android.text.style.LineHeightSpan {
    public static final int $stable;
    public final float a;

    public LineHeightSpan(float f) {
        this.a = f;
    }

    @Override  // android.text.style.LineHeightSpan
    public void chooseHeight(@NotNull CharSequence charSequence0, int v, int v1, int v2, int v3, @NotNull Paint.FontMetricsInt paint$FontMetricsInt0) {
        int v4 = LineHeightStyleSpan_androidKt.lineHeight(paint$FontMetricsInt0);
        if(v4 <= 0) {
            return;
        }
        int v5 = (int)(((float)Math.ceil(this.a)));
        int v6 = (int)Math.ceil(((double)paint$FontMetricsInt0.descent) * ((double)(((float)v5) * 1.0f / ((float)v4))));
        paint$FontMetricsInt0.descent = v6;
        paint$FontMetricsInt0.ascent = v6 - v5;
    }

    public final float getLineHeight() {
        return this.a;
    }
}

