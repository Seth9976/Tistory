package a;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import b.b0;
import com.kakao.kandinsky.KandinskyActivity;
import com.kakao.kandinsky.preview.PreviewAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class w0 extends Lambda implements Function2 {
    public final KandinskyActivity a;
    public final BoxScope b;
    public final b0 c;
    public final Function1 d;
    public final PreviewAnimator e;
    public final int f;

    public w0(KandinskyActivity kandinskyActivity0, BoxScope boxScope0, b0 b00, Function1 function10, PreviewAnimator previewAnimator0, int v) {
        this.a = kandinskyActivity0;
        this.b = boxScope0;
        this.c = b00;
        this.d = function10;
        this.e = previewAnimator0;
        this.f = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        KandinskyActivity.a(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)));
        return Unit.INSTANCE;
    }
}

