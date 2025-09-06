package com.kakao.kandinsky.base;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00040\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r¨\u0006\u000F"}, d2 = {"Lcom/kakao/kandinsky/base/ImageDisplayBoundsImpl;", "Lcom/kakao/kandinsky/base/ImageDisplayBounds;", "<init>", "()V", "Landroidx/compose/ui/geometry/Rect;", "rect", "", "updateImageDisplayBounds", "(Landroidx/compose/ui/geometry/Rect;)V", "Lkotlinx/coroutines/flow/StateFlow;", "b", "Lkotlinx/coroutines/flow/StateFlow;", "getImageDisplayBounds", "()Lkotlinx/coroutines/flow/StateFlow;", "imageDisplayBounds", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nImageDisplayBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDisplayBounds.kt\ncom/kakao/kandinsky/base/ImageDisplayBoundsImpl\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,22:1\n230#2,5:23\n*S KotlinDebug\n*F\n+ 1 ImageDisplayBounds.kt\ncom/kakao/kandinsky/base/ImageDisplayBoundsImpl\n*L\n20#1:23,5\n*E\n"})
public final class ImageDisplayBoundsImpl implements ImageDisplayBounds {
    public static final int $stable = 8;
    public final MutableStateFlow a;
    public final MutableStateFlow b;

    public ImageDisplayBoundsImpl() {
        MutableStateFlow mutableStateFlow0 = StateFlowKt.MutableStateFlow(Rect.Companion.getZero());
        this.a = mutableStateFlow0;
        this.b = mutableStateFlow0;
    }

    @Override  // com.kakao.kandinsky.base.ImageDisplayBounds
    @NotNull
    public StateFlow getImageDisplayBounds() {
        return this.b;
    }

    @Override  // com.kakao.kandinsky.base.ImageDisplayBounds
    public void updateImageDisplayBounds(@NotNull Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "rect");
        do {
            Object object0 = this.a.getValue();
            Rect rect1 = (Rect)object0;
        }
        while(!this.a.compareAndSet(object0, rect0));
    }
}

