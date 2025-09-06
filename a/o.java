package a;

import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.KandinskyActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;

public final class o extends Lambda implements Function2 {
    public final KandinskyActivity a;
    public final Flow b;
    public final int c;

    public o(KandinskyActivity kandinskyActivity0, Flow flow0, int v) {
        this.a = kandinskyActivity0;
        this.b = flow0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.a(this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

