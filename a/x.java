package a;

import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.KandinskyActivity;
import com.kakao.kandinsky.selector.SelectorEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function2 {
    public final KandinskyActivity a;
    public final SelectorEvent b;
    public final Function0 c;
    public final int d;

    public x(KandinskyActivity kandinskyActivity0, SelectorEvent selectorEvent0, Function0 function00, int v) {
        this.a = kandinskyActivity0;
        this.b = selectorEvent0;
        this.c = function00;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        KandinskyActivity.a(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

