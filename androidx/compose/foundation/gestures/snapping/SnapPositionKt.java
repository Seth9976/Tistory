package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AH\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\u0003H\u0000¨\u0006\f"}, d2 = {"calculateDistanceToDesiredSnapPosition", "", "mainAxisViewPortSize", "", "beforeContentPadding", "afterContentPadding", "itemSize", "itemOffset", "itemIndex", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "itemCount", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SnapPositionKt {
    public static final float calculateDistanceToDesiredSnapPosition(int v, int v1, int v2, int v3, int v4, int v5, @NotNull SnapPosition snapPosition0, int v6) {
        return ((float)v4) - ((float)snapPosition0.position(v, v3, v1, v2, v5, v6));
    }
}

