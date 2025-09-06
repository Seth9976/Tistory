package androidx.compose.ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.TextLayout_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002Jp\u0010\u0003\u001A\u00020\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\n2\b\u0010\u000F\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001A\u00020\n2\u0006\u0010\u0012\u001A\u00020\n2\u0006\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001A\u00020\n2\u0006\u0010\u0018\u001A\u00020\u0014H\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/android/style/IndentationFixSpan;", "Landroid/text/style/LeadingMarginSpan;", "()V", "drawLeadingMargin", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "left", "", "dir", "top", "baseline", "bottom", "text", "", "start", "end", "first", "", "layout", "Landroid/text/Layout;", "getLeadingMargin", "firstLine", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class IndentationFixSpan implements LeadingMarginSpan {
    public static final int $stable;

    @Override  // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(@Nullable Canvas canvas0, @Nullable Paint paint0, int v, int v1, int v2, int v3, int v4, @Nullable CharSequence charSequence0, int v5, int v6, boolean z, @Nullable Layout layout0) {
        if(layout0 != null && paint0 != null) {
            int v7 = layout0.getLineForOffset(v5);
            if(v7 == layout0.getLineCount() - 1 && TextLayout_androidKt.isLineEllipsized(layout0, v7)) {
                float f = IndentationFixSpan_androidKt.getEllipsizedLeftPadding(layout0, v7, paint0);
                float f1 = IndentationFixSpan_androidKt.getEllipsizedRightPadding(layout0, v7, paint0) + f;
                if(f1 != 0.0f) {
                    Intrinsics.checkNotNull(canvas0);
                    canvas0.translate(f1, 0.0f);
                }
            }
        }
    }

    @Override  // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return 0;
    }
}

