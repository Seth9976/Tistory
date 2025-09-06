package a;

import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.KandinskyActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q0 extends Lambda implements Function2 {
    public final KandinskyActivity a;
    public final int b;

    public q0(KandinskyActivity kandinskyActivity0, int v) {
        this.a = kandinskyActivity0;
        this.b = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        KandinskyActivity.b(this.a, ((Composer)object0), (this.b | 1) & -920350135 | ((0x24924924 & (this.b | 1)) >> 1 | 306783378 & (this.b | 1)) | (306783378 & (this.b | 1)) << 1 & (0x24924924 & (this.b | 1)));
        return Unit.INSTANCE;
    }
}

