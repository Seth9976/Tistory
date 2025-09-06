package com.kakao.kandinsky.preview;

import android.graphics.Matrix;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.designsystem.util.MatrixTransformKt;
import com.kakao.kandinsky.gesture.ImageGestureController;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import d0.l;
import j2.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import na.q;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000F\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000Bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\u0018\u0010\u0013\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001A\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0003J\r\u0010\u0015\u001A\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0003R+\u0010\u001E\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u00168F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001DR\u001B\u0010\"\u001A\u00020\u001F8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006%"}, d2 = {"Lcom/kakao/kandinsky/preview/PreviewGestureController;", "Lcom/kakao/kandinsky/gesture/ImageGestureController;", "<init>", "()V", "Landroidx/compose/ui/geometry/Rect;", "previewBoundary", "", "updateDisplayInfo", "(Landroidx/compose/ui/geometry/Rect;)V", "Landroidx/compose/ui/geometry/Offset;", "center", "", "zoom", "zoomInOut-3MmeM6k", "(JF)V", "zoomInOut", "offset", "move-k-4lQ0M", "(J)V", "move", "finishInteraction", "resetGesture", "Landroid/graphics/Matrix;", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getGestureMatrix", "()Landroid/graphics/Matrix;", "setGestureMatrix", "(Landroid/graphics/Matrix;)V", "gestureMatrix", "", "b", "Landroidx/compose/runtime/State;", "isChanged", "()Z", "Companion", "preview_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPreviewGestureController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewGestureController.kt\ncom/kakao/kandinsky/preview/PreviewGestureController\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,85:1\n81#2:86\n107#2,2:87\n81#2:89\n*S KotlinDebug\n*F\n+ 1 PreviewGestureController.kt\ncom/kakao/kandinsky/preview/PreviewGestureController\n*L\n22#1:86\n22#1:87,2\n24#1:89\n*E\n"})
public final class PreviewGestureController extends ImageGestureController {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/kakao/kandinsky/preview/PreviewGestureController$Companion;", "", "", "ZOOM_MAX_SCALE", "F", "ZOOM_MIN_SCALE", "preview_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final MutableState a;
    public final State b;
    public Offset c;
    public Rect d;

    static {
        PreviewGestureController.Companion = new Companion(null);
    }

    public PreviewGestureController() {
        this.a = SnapshotStateKt.mutableStateOf$default(new Matrix(), null, 2, null);
        this.b = SnapshotStateKt.derivedStateOf(new j(this, 28));
        this.d = Rect.Companion.getZero();
    }

    public static final Rect access$getPreviewBoundary$p(PreviewGestureController previewGestureController0) {
        return previewGestureController0.d;
    }

    public final void finishInteraction() {
        Matrix matrix0 = this.fitMatrixIntoImage(this.getGestureMatrix(), this.d, this.d, MatrixTransformKt.getTransform(this.getGestureMatrix()).getScaleX());
        matrix0.postTranslate(this.d.getLeft(), this.d.getTop());
        this.setGestureMatrix(matrix0);
        this.c = null;
    }

    @NotNull
    public final Matrix getGestureMatrix() {
        return (Matrix)this.a.getValue();
    }

    public final boolean isChanged() {
        return ((Boolean)this.b.getValue()).booleanValue();
    }

    public final void move-k-4lQ0M(long v) {
        if(this.c != null) {
            return;
        }
        this.setGestureMatrix(MatrixExtensionKt.buildMatrix(this.getGestureMatrix(), new l(1, v, this)));
    }

    public final void resetGesture() {
        this.setGestureMatrix(new Matrix());
    }

    public final void setGestureMatrix(@NotNull Matrix matrix0) {
        Intrinsics.checkNotNullParameter(matrix0, "<set-?>");
        this.a.setValue(matrix0);
    }

    public final void updateDisplayInfo(@NotNull Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "previewBoundary");
        this.d = rect0;
    }

    public final void zoomInOut-3MmeM6k(long v, float f) {
        if(this.c == null) {
            this.c = Offset.box-impl(v);
        }
        Offset offset0 = this.c;
        if(offset0 != null) {
            long v1 = offset0.unbox-impl();
            this.setGestureMatrix(MatrixExtensionKt.buildMatrix(this.getGestureMatrix(), new q(f, Offset.getX-impl(v1), Offset.getY-impl(v1))));
        }
    }
}

