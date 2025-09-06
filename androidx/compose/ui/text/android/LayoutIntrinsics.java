package androidx.compose.ui.text.android;

import android.text.BoringLayout.Metrics;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\r\u001A\u0004\u0018\u00010\n8F¢\u0006\u0006\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0011\u001A\u00020\u000E8F¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0013\u001A\u00020\u000E8F¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/android/LayoutIntrinsics;", "", "", "charSequence", "Landroid/text/TextPaint;", "textPaint", "", "textDirectionHeuristic", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V", "Landroid/text/BoringLayout$Metrics;", "getBoringMetrics", "()Landroid/text/BoringLayout$Metrics;", "boringMetrics", "", "getMinIntrinsicWidth", "()F", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LayoutIntrinsics {
    public static final int $stable = 8;
    public final CharSequence a;
    public final TextPaint b;
    public final int c;
    public float d;
    public float e;
    public BoringLayout.Metrics f;
    public boolean g;

    public LayoutIntrinsics(@NotNull CharSequence charSequence0, @NotNull TextPaint textPaint0, int v) {
        this.a = charSequence0;
        this.b = textPaint0;
        this.c = v;
        this.d = NaNf;
        this.e = NaNf;
    }

    @Nullable
    public final BoringLayout.Metrics getBoringMetrics() {
        if(!this.g) {
            TextDirectionHeuristic textDirectionHeuristic0 = TextLayout_androidKt.getTextDirectionHeuristic(this.c);
            this.f = BoringLayoutFactory.INSTANCE.measure(this.a, this.b, textDirectionHeuristic0);
            this.g = true;
        }
        return this.f;
    }

    public final float getMaxIntrinsicWidth() {
        if(!Float.isNaN(this.d)) {
            return this.d;
        }
        BoringLayout.Metrics boringLayout$Metrics0 = this.getBoringMetrics();
        float f = (float)(boringLayout$Metrics0 == null ? -1 : boringLayout$Metrics0.width);
        TextPaint textPaint0 = this.b;
        CharSequence charSequence0 = this.a;
        if(Float.compare(f, 0.0f) < 0) {
            f = (float)Math.ceil(Layout.getDesiredWidth(charSequence0, 0, charSequence0.length(), textPaint0));
        }
        if(LayoutIntrinsics_androidKt.access$shouldIncreaseMaxIntrinsic(f, charSequence0, textPaint0)) {
            f += 0.5f;
        }
        this.d = f;
        return f;
    }

    public final float getMinIntrinsicWidth() {
        if(!Float.isNaN(this.e)) {
            return this.e;
        }
        float f = LayoutIntrinsics_androidKt.minIntrinsicWidth(this.a, this.b);
        this.e = f;
        return f;
    }
}

