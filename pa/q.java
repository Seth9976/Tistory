package pa;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.resize.ReSizeScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function2 {
    public final Function0 A;
    public final int B;
    public final int C;
    public final Modifier w;
    public final long x;
    public final int y;
    public final Function0 z;

    public q(Modifier modifier0, long v, int v1, Function0 function00, Function0 function01, int v2, int v3) {
        this.w = modifier0;
        this.x = v;
        this.y = v1;
        this.z = function00;
        this.A = function01;
        this.B = v2;
        this.C = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ReSizeScreenKt.e(this.w, this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
        return Unit.INSTANCE;
    }
}

