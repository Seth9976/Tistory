package pa;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.resize.ReSizeScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;

public final class j extends Lambda implements Function2 {
    public final boolean A;
    public final Function0 B;
    public final Function0 C;
    public final Function1 D;
    public final Function0 E;
    public final Function0 F;
    public final Function0 G;
    public final int H;
    public final int I;
    public final int J;
    public final Modifier w;
    public final long x;
    public final int y;
    public final ImmutableList z;

    public j(Modifier modifier0, long v, int v1, ImmutableList immutableList0, boolean z, Function0 function00, Function0 function01, Function1 function10, Function0 function02, Function0 function03, Function0 function04, int v2, int v3, int v4) {
        this.w = modifier0;
        this.x = v;
        this.y = v1;
        this.z = immutableList0;
        this.A = z;
        this.B = function00;
        this.C = function01;
        this.D = function10;
        this.E = function02;
        this.F = function03;
        this.G = function04;
        this.H = v2;
        this.I = v3;
        this.J = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ReSizeScreenKt.access$DefaultTypeToolbar-SUCSAKA(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I & -920350135 | ((0x24924924 & this.I) >> 1 | 306783378 & this.I) | (306783378 & this.I) << 1 & (0x24924924 & this.I), this.J);
        return Unit.INSTANCE;
    }
}

