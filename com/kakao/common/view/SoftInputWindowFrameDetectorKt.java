package com.kakao.common.view;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u001B\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "Landroid/graphics/Rect;", "outRect", "", "getSoftInputWindowFrame", "(Landroid/view/View;Landroid/graphics/Rect;)V", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class SoftInputWindowFrameDetectorKt {
    public static final void getSoftInputWindowFrame(@NotNull View view0, @NotNull Rect rect0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Intrinsics.checkNotNullParameter(rect0, "outRect");
        if(view0.isAttachedToWindow()) {
            int[] arr_v = new int[2];
            view0.getRootView().getLocationOnScreen(arr_v);
            if(arr_v[0] == 0 && arr_v[1] == 0) {
                Point point0 = new Point();
                view0.getDisplay().getRealSize(point0);
                if(view0.getRootView().getWidth() == point0.x && view0.getRootView().getHeight() == point0.y) {
                    view0.getWindowVisibleDisplayFrame(rect0);
                    rect0.set(0, rect0.bottom, rect0.right, rect0.bottom);
                    return;
                }
            }
        }
        rect0.setEmpty();
    }
}

