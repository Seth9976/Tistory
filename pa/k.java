package pa;

import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.resize.ReSizeScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;

public final class k extends Lambda implements Function2 {
    public final Function0 A;
    public final Function0 B;
    public final Function1 C;
    public final Function0 D;
    public final Function0 E;
    public final Function0 F;
    public final int G;
    public final long w;
    public final int x;
    public final ImmutableList y;
    public final boolean z;

    public k(long v, int v1, ImmutableList immutableList0, boolean z, Function0 function00, Function0 function01, Function1 function10, Function0 function02, Function0 function03, Function0 function04, int v2) {
        this.w = v;
        this.x = v1;
        this.y = immutableList0;
        this.z = z;
        this.A = function00;
        this.B = function01;
        this.C = function10;
        this.D = function02;
        this.E = function03;
        this.F = function04;
        this.G = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ReSizeScreenKt.c(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)));
        return Unit.INSTANCE;
    }
}

