package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000F\b\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001A\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0007\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001A\u0004\b\u001A\u0010\u0016¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/text/android/style/ShadowSpan;", "Landroid/text/style/CharacterStyle;", "", "color", "", "offsetX", "offsetY", "radius", "<init>", "(IFFF)V", "Landroid/text/TextPaint;", "tp", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", "I", "getColor", "()I", "b", "F", "getOffsetX", "()F", "c", "getOffsetY", "d", "getRadius", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ShadowSpan extends CharacterStyle {
    public static final int $stable;
    public final int a;
    public final float b;
    public final float c;
    public final float d;

    public ShadowSpan(int v, float f, float f1, float f2) {
        this.a = v;
        this.b = f;
        this.c = f1;
        this.d = f2;
    }

    public final int getColor() {
        return this.a;
    }

    public final float getOffsetX() {
        return this.b;
    }

    public final float getOffsetY() {
        return this.c;
    }

    public final float getRadius() {
        return this.d;
    }

    @Override  // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint0) {
        textPaint0.setShadowLayer(this.d, this.b, this.c, this.a);
    }
}

