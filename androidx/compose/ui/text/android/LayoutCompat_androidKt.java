package androidx.compose.ui.text.android;

import android.text.Layout;
import androidx.annotation.IntRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\u001A\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"getLineForOffset", "", "Landroid/text/Layout;", "offset", "upstream", "", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LayoutCompat_androidKt {
    public static final int getLineForOffset(@NotNull Layout layout0, @IntRange(from = 0L) int v, boolean z) {
        if(v <= 0) {
            return 0;
        }
        if(v >= layout0.getText().length()) {
            return layout0.getLineCount() - 1;
        }
        int v1 = layout0.getLineForOffset(v);
        int v2 = layout0.getLineStart(v1);
        if(v2 != v && layout0.getLineEnd(v1) != v) {
            return v1;
        }
        if(v2 == v) {
            return z ? v1 - 1 : v1;
        }
        return z ? v1 : v1 + 1;
    }
}

