package com.kakao.kandinsky.base;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u0004H&R\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/kakao/kandinsky/base/ImageDisplayBounds;", "", "imageDisplayBounds", "Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/compose/ui/geometry/Rect;", "getImageDisplayBounds", "()Lkotlinx/coroutines/flow/StateFlow;", "updateImageDisplayBounds", "", "rect", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ImageDisplayBounds {
    @NotNull
    StateFlow getImageDisplayBounds();

    void updateImageDisplayBounds(@NotNull Rect arg1);
}

