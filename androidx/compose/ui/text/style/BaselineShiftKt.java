package androidx.compose.ui.text.style;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001A*\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\b"}, d2 = {"lerp", "Landroidx/compose/ui/text/style/BaselineShift;", "start", "stop", "fraction", "", "lerp-jWV1Mfo", "(FFF)F", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class BaselineShiftKt {
    @Stable
    public static final float lerp-jWV1Mfo(float f, float f1, float f2) {
        return f2 * f1 + (1.0f - f2) * f;
    }
}

