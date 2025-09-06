package o6;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Modifier;
import com.google.accompanist.pager.Pager;
import com.google.accompanist.pager.PagerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function2 {
    public final float A;
    public final boolean B;
    public final FlingBehavior C;
    public final Function1 D;
    public final PaddingValues E;
    public final boolean F;
    public final Vertical G;
    public final Horizontal H;
    public final Function4 I;
    public final int J;
    public final int K;
    public final int L;
    public final int w;
    public final Modifier x;
    public final PagerState y;
    public final boolean z;

    public n(int v, Modifier modifier0, PagerState pagerState0, boolean z, float f, boolean z1, FlingBehavior flingBehavior0, Function1 function10, PaddingValues paddingValues0, boolean z2, Vertical alignment$Vertical0, Horizontal alignment$Horizontal0, Function4 function40, int v1, int v2, int v3) {
        this.w = v;
        this.x = modifier0;
        this.y = pagerState0;
        this.z = z;
        this.A = f;
        this.B = z1;
        this.C = flingBehavior0;
        this.D = function10;
        this.E = paddingValues0;
        this.F = z2;
        this.G = alignment$Vertical0;
        this.H = alignment$Horizontal0;
        this.I = function40;
        this.J = v1;
        this.K = v2;
        this.L = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        Pager.Pager-upBTbn8(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, ((Composer)object0), (this.J | 1) & -920350135 | ((0x24924924 & (this.J | 1)) >> 1 | 306783378 & (this.J | 1)) | (306783378 & (this.J | 1)) << 1 & (0x24924924 & (this.J | 1)), this.K & -920350135 | ((0x24924924 & this.K) >> 1 | 306783378 & this.K) | (306783378 & this.K) << 1 & (0x24924924 & this.K), this.L);
        return Unit.INSTANCE;
    }
}

