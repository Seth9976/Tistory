package com.kakao.kandinsky.preview;

import android.graphics.Matrix.ScaleToFit;
import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import com.kakao.kandinsky.core.kdphoto.Decoration;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.designsystem.util.RectExtensionKt;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m0.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001A\u0010\u000E\u001A\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u001A\u0010\u0014\u001A\u00020\u000F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u001C\u0010\u0016\u001A\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001D\u001A\u00020\u001A8F¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001CR\u0011\u0010\u001F\u001A\u00020\u000F8F¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u0013R\u0011\u0010!\u001A\u00020\u001A8F¢\u0006\u0006\u001A\u0004\b \u0010\u001C¨\u0006\""}, d2 = {"Lcom/kakao/kandinsky/preview/PreviewUiState;", "", "<init>", "()V", "Lcom/kakao/kandinsky/core/kdphoto/Decoration;", "decoration", "Lcom/kakao/kandinsky/decoration/DecorationStatus;", "getDecorationStatus", "(Lcom/kakao/kandinsky/core/kdphoto/Decoration;)Lcom/kakao/kandinsky/decoration/DecorationStatus;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "q", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "getPhoto", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "Landroidx/compose/ui/geometry/Rect;", "r", "Landroidx/compose/ui/geometry/Rect;", "getContentBounds", "()Landroidx/compose/ui/geometry/Rect;", "contentBounds", "", "selectedNo", "Ljava/lang/Integer;", "getSelectedNo", "()Ljava/lang/Integer;", "Landroid/graphics/Matrix;", "getDisplayMatrix", "()Landroid/graphics/Matrix;", "displayMatrix", "getDisplayCropRect", "displayCropRect", "getPreviewMatrix", "previewMatrix", "preview_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class PreviewUiState {
    public static final int $stable;
    public final KDPhoto q;
    public final Rect r;

    public PreviewUiState() {
        this.q = KDPhoto.Companion.getEmpty();
        this.r = Rect.Companion.getZero();
    }

    @NotNull
    public Rect getContentBounds() {
        return this.r;
    }

    @NotNull
    public DecorationStatus getDecorationStatus(@NotNull Decoration decoration0) {
        Intrinsics.checkNotNullParameter(decoration0, "decoration");
        return DecorationStatus.OnlyView;
    }

    @NotNull
    public final Rect getDisplayCropRect() {
        return RectExtensionKt.mapRect(this.getDisplayMatrix(), SizeKt.toRect-uvyYCjk(this.getPhoto().getCropSize-NH-jbRc()));
    }

    @NotNull
    public final Matrix getDisplayMatrix() {
        Matrix matrix0 = new Matrix();
        if(!Size.isEmpty-impl(this.getPhoto().getCropSize-NH-jbRc()) && !this.getContentBounds().isEmpty()) {
            RectExtensionKt.setRectToRect(matrix0, SizeKt.toRect-uvyYCjk(this.getPhoto().getCropSize-NH-jbRc()), this.getContentBounds(), Matrix.ScaleToFit.CENTER);
        }
        return matrix0;
    }

    @NotNull
    public KDPhoto getPhoto() {
        return this.q;
    }

    @NotNull
    public final Matrix getPreviewMatrix() {
        return MatrixExtensionKt.buildMatrix(this.getPhoto().getMatrix(), new b0(this, 6));
    }

    @Nullable
    public Integer getSelectedNo() {
        return null;
    }
}

