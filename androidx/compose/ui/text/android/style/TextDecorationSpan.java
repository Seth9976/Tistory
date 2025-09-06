package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u0003\u0010\u000ER\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000F\u0010\r\u001A\u0004\b\u0004\u0010\u000E¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/android/style/TextDecorationSpan;", "Landroid/text/style/CharacterStyle;", "", "isUnderlineText", "isStrikethroughText", "<init>", "(ZZ)V", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", "Z", "()Z", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextDecorationSpan extends CharacterStyle {
    public static final int $stable;
    public final boolean a;
    public final boolean b;

    public TextDecorationSpan(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
    }

    public final boolean isStrikethroughText() {
        return this.b;
    }

    public final boolean isUnderlineText() {
        return this.a;
    }

    @Override  // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint0) {
        textPaint0.setUnderlineText(this.a);
        textPaint0.setStrikeThruText(this.b);
    }
}

