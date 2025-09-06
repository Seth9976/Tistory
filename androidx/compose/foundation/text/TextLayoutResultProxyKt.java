package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextLayoutResultProxyKt {
    public static final long access$coerceIn-3MmeM6k(long v, Rect rect0) {
        float f;
        if(Offset.getX-impl(v) < rect0.getLeft()) {
            f = rect0.getLeft();
        }
        else {
            f = Offset.getX-impl(v) > rect0.getRight() ? rect0.getRight() : Offset.getX-impl(v);
        }
        if(Offset.getY-impl(v) < rect0.getTop()) {
            return OffsetKt.Offset(f, rect0.getTop());
        }
        return Offset.getY-impl(v) > rect0.getBottom() ? OffsetKt.Offset(f, rect0.getBottom()) : OffsetKt.Offset(f, Offset.getY-impl(v));
    }
}

