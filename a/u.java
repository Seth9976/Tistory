package a;

import androidx.compose.runtime.Composer;
import b.s;
import com.kakao.kandinsky.KandinskyActivity;
import com.kakao.kandinsky.preview.PreviewAnimator;
import com.kakao.kandinsky.preview.PreviewGestureController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function2 {
    public final KandinskyActivity a;
    public final PreviewAnimator b;
    public final PreviewGestureController c;
    public final s d;
    public final int e;

    public u(KandinskyActivity kandinskyActivity0, PreviewAnimator previewAnimator0, PreviewGestureController previewGestureController0, s s0, int v) {
        this.a = kandinskyActivity0;
        this.b = previewAnimator0;
        this.c = previewGestureController0;
        this.d = s0;
        this.e = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        KandinskyActivity.a(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

