package com.kakao.kandinsky.crop;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.crop.contract.TouchCirclePoint;
import com.kakao.kandinsky.crop.contract.TouchLinePoint;
import com.kakao.kandinsky.crop.contract.TouchPoint;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0019\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "Lcom/kakao/kandinsky/crop/contract/TouchPoint;", "touchPoint", "Landroidx/compose/ui/geometry/Offset;", "getFixPoint", "(Landroidx/compose/ui/geometry/Rect;Lcom/kakao/kandinsky/crop/contract/TouchPoint;)J", "crop_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class CropControllerKt {
    // 去混淆评级： 低(20)
    public static final Pair access$split(Rect rect0, boolean z) {
        return z ? TuplesKt.to(new Rect(rect0.getLeft(), rect0.getTop(), Offset.getX-impl(rect0.getCenter-F1C5BW0()), rect0.getBottom()), new Rect(Offset.getX-impl(rect0.getCenter-F1C5BW0()), rect0.getTop(), rect0.getRight(), rect0.getBottom())) : TuplesKt.to(new Rect(rect0.getLeft(), rect0.getTop(), rect0.getRight(), Offset.getY-impl(rect0.getCenter-F1C5BW0())), new Rect(rect0.getLeft(), Offset.getY-impl(rect0.getCenter-F1C5BW0()), rect0.getRight(), rect0.getBottom()));
    }

    public static final long getFixPoint(@NotNull Rect rect0, @NotNull TouchPoint touchPoint0) {
        Intrinsics.checkNotNullParameter(rect0, "<this>");
        Intrinsics.checkNotNullParameter(touchPoint0, "touchPoint");
        if(touchPoint0 == TouchCirclePoint.TopLeft) {
            return rect0.getBottomRight-F1C5BW0();
        }
        if(touchPoint0 == TouchCirclePoint.TopRight) {
            return rect0.getBottomLeft-F1C5BW0();
        }
        if(touchPoint0 == TouchCirclePoint.BottomLeft) {
            return rect0.getTopRight-F1C5BW0();
        }
        if(touchPoint0 == TouchCirclePoint.BottomRight) {
            return rect0.getTopLeft-F1C5BW0();
        }
        if(touchPoint0 == TouchLinePoint.Top) {
            return rect0.getBottomCenter-F1C5BW0();
        }
        if(touchPoint0 == TouchLinePoint.Left) {
            return rect0.getCenterRight-F1C5BW0();
        }
        if(touchPoint0 == TouchLinePoint.Right) {
            return rect0.getCenterLeft-F1C5BW0();
        }
        return touchPoint0 == TouchLinePoint.Bottom ? rect0.getTopCenter-F1C5BW0() : rect0.getCenter-F1C5BW0();
    }
}

