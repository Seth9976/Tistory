package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A+\u0010\u0007\u001A\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001A+\u0010\f\u001A\u00020\u0006*\u00020\t2\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\n\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\u0003H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroid/text/TextPaint;", "", "text", "", "startInclusive", "endExclusive", "Landroid/graphics/Rect;", "getCharSequenceBounds", "(Landroid/text/TextPaint;Ljava/lang/CharSequence;II)Landroid/graphics/Rect;", "Landroid/graphics/Paint;", "start", "end", "getStringBounds", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;II)Landroid/graphics/Rect;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PaintExtensions_androidKt {
    @NotNull
    public static final Rect getCharSequenceBounds(@NotNull TextPaint textPaint0, @NotNull CharSequence charSequence0, int v, int v1) {
        if(charSequence0 instanceof Spanned) {
            Class class0 = MetricAffectingSpan.class;
            if(SpannedExtensions_androidKt.hasSpan(((Spanned)charSequence0), class0, v, v1)) {
                Rect rect0 = new Rect();
                Rect rect1 = new Rect();
                TextPaint textPaint1 = new TextPaint();
                while(v < v1) {
                    int v2 = ((Spanned)charSequence0).nextSpanTransition(v, v1, class0);
                    MetricAffectingSpan[] arr_metricAffectingSpan = (MetricAffectingSpan[])((Spanned)charSequence0).getSpans(v, v2, class0);
                    textPaint1.set(textPaint0);
                    for(int v3 = 0; v3 < arr_metricAffectingSpan.length; ++v3) {
                        MetricAffectingSpan metricAffectingSpan0 = arr_metricAffectingSpan[v3];
                        if(((Spanned)charSequence0).getSpanStart(metricAffectingSpan0) != ((Spanned)charSequence0).getSpanEnd(metricAffectingSpan0)) {
                            metricAffectingSpan0.updateMeasureState(textPaint1);
                        }
                    }
                    if(Build.VERSION.SDK_INT >= 29) {
                        k.a(textPaint1, charSequence0, v, v2, rect1);
                    }
                    else {
                        textPaint1.getTextBounds(charSequence0.toString(), v, v2, rect1);
                    }
                    int v4 = rect0.right;
                    rect0.right = rect1.width() + v4;
                    rect0.top = Math.min(rect0.top, rect1.top);
                    rect0.bottom = Math.max(rect0.bottom, rect1.bottom);
                    v = v2;
                }
                return rect0;
            }
        }
        return PaintExtensions_androidKt.getStringBounds(textPaint0, charSequence0, v, v1);
    }

    @VisibleForTesting
    @NotNull
    public static final Rect getStringBounds(@NotNull Paint paint0, @NotNull CharSequence charSequence0, int v, int v1) {
        Rect rect0 = new Rect();
        if(Build.VERSION.SDK_INT >= 29) {
            k.a(paint0, charSequence0, v, v1, rect0);
            return rect0;
        }
        paint0.getTextBounds(charSequence0.toString(), v, v1, rect0);
        return rect0;
    }
}

