package com.kakao.kandinsky.preview;

import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.kandinsky.gesture.GestureInteraction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u000F\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u0013\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0016"}, d2 = {"Lcom/kakao/kandinsky/preview/ImagePreviewGestureInteraction;", "Lcom/kakao/kandinsky/gesture/GestureInteraction;", "Lcom/kakao/kandinsky/preview/PreviewGestureController;", "gestureController", "Lcom/kakao/kandinsky/preview/PreviewAnimator;", "previewAnimator", "<init>", "(Lcom/kakao/kandinsky/preview/PreviewGestureController;Lcom/kakao/kandinsky/preview/PreviewAnimator;)V", "Landroidx/compose/ui/geometry/Offset;", "centroid", "", "zoom", "", "onZoom-3MmeM6k", "(JF)V", "onZoom", "pan", "onDrag-k-4lQ0M", "(J)V", "onDrag", "onFinish", "()V", "preview_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ImagePreviewGestureInteraction implements GestureInteraction {
    public static final int $stable;
    public final PreviewGestureController a;
    public final PreviewAnimator b;

    public ImagePreviewGestureInteraction(@NotNull PreviewGestureController previewGestureController0, @NotNull PreviewAnimator previewAnimator0) {
        Intrinsics.checkNotNullParameter(previewGestureController0, "gestureController");
        Intrinsics.checkNotNullParameter(previewAnimator0, "previewAnimator");
        super();
        this.a = previewGestureController0;
        this.b = previewAnimator0;
    }

    @Override  // com.kakao.kandinsky.gesture.GestureInteraction
    public void onDrag-k-4lQ0M(long v) {
        this.a.move-k-4lQ0M(v);
        Matrix matrix0 = this.a.getGestureMatrix();
        this.b.updateGestureMatrix(matrix0, false);
    }

    @Override  // com.kakao.kandinsky.gesture.GestureInteraction
    public void onFinish() {
        this.a.finishInteraction();
        Matrix matrix0 = this.a.getGestureMatrix();
        this.b.updateGestureMatrix(matrix0, true);
    }

    @Override  // com.kakao.kandinsky.gesture.GestureInteraction
    public void onZoom-3MmeM6k(long v, float f) {
        this.a.zoomInOut-3MmeM6k(v, f);
        Matrix matrix0 = this.a.getGestureMatrix();
        this.b.updateGestureMatrix(matrix0, false);
    }
}

