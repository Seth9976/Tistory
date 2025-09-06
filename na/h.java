package na;

import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.preview.DimState;
import com.kakao.kandinsky.preview.ImagePreviewKt;
import com.kakao.kandinsky.preview.PreviewAnimator;
import com.kakao.kandinsky.preview.PreviewGestureController;
import com.kakao.kandinsky.preview.PreviewUiState;
import com.kakao.kandinsky.preview.ui.PreviewTextureLoader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public final boolean A;
    public final PreviewGestureController B;
    public final Function6 C;
    public final Function5 D;
    public final Function1 E;
    public final int F;
    public final int G;
    public final PreviewUiState w;
    public final PreviewAnimator x;
    public final PreviewTextureLoader y;
    public final DimState z;

    public h(PreviewUiState previewUiState0, PreviewAnimator previewAnimator0, PreviewTextureLoader previewTextureLoader0, DimState dimState0, boolean z, PreviewGestureController previewGestureController0, Function6 function60, Function5 function50, Function1 function10, int v, int v1) {
        this.w = previewUiState0;
        this.x = previewAnimator0;
        this.y = previewTextureLoader0;
        this.z = dimState0;
        this.A = z;
        this.B = previewGestureController0;
        this.C = function60;
        this.D = function50;
        this.E = function10;
        this.F = v;
        this.G = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ImagePreviewKt.ImagePreview(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
        return Unit.INSTANCE;
    }
}

