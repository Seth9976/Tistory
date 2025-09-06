package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ContentScaleKt {
    public static final float access$computeFillHeight-iLBOSCw(long v, long v1) {
        return Size.getHeight-impl(v1) / Size.getHeight-impl(v);
    }

    public static final float access$computeFillMaxDimension-iLBOSCw(long v, long v1) {
        return Math.max(Size.getWidth-impl(v1) / Size.getWidth-impl(v), Size.getHeight-impl(v1) / Size.getHeight-impl(v));
    }

    public static final float access$computeFillMinDimension-iLBOSCw(long v, long v1) {
        return Math.min(Size.getWidth-impl(v1) / Size.getWidth-impl(v), Size.getHeight-impl(v1) / Size.getHeight-impl(v));
    }

    public static final float access$computeFillWidth-iLBOSCw(long v, long v1) {
        return Size.getWidth-impl(v1) / Size.getWidth-impl(v);
    }
}

