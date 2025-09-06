package a;

import android.graphics.Matrix;
import com.kakao.kandinsky.preview.PreviewAnimator;
import com.kakao.kandinsky.preview.PreviewGestureController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class m0 extends Lambda implements Function0 {
    public final PreviewGestureController a;
    public final PreviewAnimator b;

    public m0(PreviewGestureController previewGestureController0, PreviewAnimator previewAnimator0) {
        this.a = previewGestureController0;
        this.b = previewAnimator0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.resetGesture();
        Matrix matrix0 = this.a.getGestureMatrix();
        this.b.updateGestureMatrix(matrix0, true);
        return Unit.INSTANCE;
    }
}

