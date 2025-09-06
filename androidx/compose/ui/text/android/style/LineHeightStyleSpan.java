package androidx.compose.ui.text.android.style;

import android.graphics.Paint.FontMetricsInt;
import android.text.style.LineHeightSpan;
import androidx.annotation.FloatRange;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0007\u0012\b\b\u0001\u0010\n\u001A\u00020\u0002¢\u0006\u0004\b\u000B\u0010\fJ?\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u0007H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u0017\u0010\t\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R$\u0010\'\u001A\u00020\u00042\u0006\u0010\"\u001A\u00020\u00048\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&R$\u0010*\u001A\u00020\u00042\u0006\u0010\"\u001A\u00020\u00048\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b(\u0010$\u001A\u0004\b)\u0010&¨\u0006+"}, d2 = {"Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/text/style/LineHeightSpan;", "", "lineHeight", "", "startIndex", "endIndex", "", "trimFirstLineTop", "trimLastLineBottom", "topRatio", "<init>", "(FIIZZF)V", "", "text", "start", "end", "spanStartVertical", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "", "chooseHeight", "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V", "copy$ui_text_release", "(IIZ)Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "copy", "a", "F", "getLineHeight", "()F", "e", "Z", "getTrimLastLineBottom", "()Z", "<set-?>", "k", "I", "getFirstAscentDiff", "()I", "firstAscentDiff", "l", "getLastDescentDiff", "lastDescentDiff", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LineHeightStyleSpan implements LineHeightSpan {
    public static final int $stable = 8;
    public final float a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    public LineHeightStyleSpan(float f, int v, int v1, boolean z, boolean z1, @FloatRange(from = -1.0, to = 1.0) float f1) {
        this.a = f;
        this.b = v;
        this.c = v1;
        this.d = z;
        this.e = z1;
        this.f = f1;
        this.g = 0x80000000;
        this.h = 0x80000000;
        this.i = 0x80000000;
        this.j = 0x80000000;
        if((0.0f > f1 || f1 > 1.0f) && f1 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    @Override  // android.text.style.LineHeightSpan
    public void chooseHeight(@NotNull CharSequence charSequence0, int v, int v1, int v2, int v3, @NotNull Paint.FontMetricsInt paint$FontMetricsInt0) {
        boolean z = false;
        if(LineHeightStyleSpan_androidKt.lineHeight(paint$FontMetricsInt0) <= 0) {
            return;
        }
        boolean z1 = v == this.b;
        if(v1 == this.c) {
            z = true;
        }
        boolean z2 = this.e;
        boolean z3 = this.d;
        if(z1 && z && z3 && z2) {
            return;
        }
        if(this.g == 0x80000000) {
            int v4 = (int)(((float)Math.ceil(this.a)));
            int v5 = v4 - LineHeightStyleSpan_androidKt.lineHeight(paint$FontMetricsInt0);
            float f = this.f == -1.0f ? Math.abs(paint$FontMetricsInt0.ascent) / ((float)LineHeightStyleSpan_androidKt.lineHeight(paint$FontMetricsInt0)) : this.f;
            int v6 = paint$FontMetricsInt0.descent;
            int v7 = ((int)(((float)(v5 > 0 ? Math.ceil((1.0f - f) * ((float)v5)) : Math.ceil(((float)v5) * f))))) + v6;
            this.i = v7;
            int v8 = v7 - v4;
            this.h = v8;
            if(z3) {
                v8 = paint$FontMetricsInt0.ascent;
            }
            this.g = v8;
            if(z2) {
                v7 = v6;
            }
            this.j = v7;
            this.k = paint$FontMetricsInt0.ascent - v8;
            this.l = v7 - v6;
        }
        paint$FontMetricsInt0.ascent = z1 ? this.g : this.h;
        paint$FontMetricsInt0.descent = z ? this.j : this.i;
    }

    @NotNull
    public final LineHeightStyleSpan copy$ui_text_release(int v, int v1, boolean z) {
        return new LineHeightStyleSpan(this.a, v, v1, z, this.e, this.f);
    }

    public static LineHeightStyleSpan copy$ui_text_release$default(LineHeightStyleSpan lineHeightStyleSpan0, int v, int v1, boolean z, int v2, Object object0) {
        if((v2 & 4) != 0) {
            z = lineHeightStyleSpan0.d;
        }
        return lineHeightStyleSpan0.copy$ui_text_release(v, v1, z);
    }

    public final int getFirstAscentDiff() {
        return this.k;
    }

    public final int getLastDescentDiff() {
        return this.l;
    }

    public final float getLineHeight() {
        return this.a;
    }

    public final boolean getTrimLastLineBottom() {
        return this.e;
    }
}

