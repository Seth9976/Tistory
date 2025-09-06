package o6;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Modifier;
import com.google.accompanist.pager.Pager;
import com.google.accompanist.pager.PagerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function2 {
    public final float A;
    public final PaddingValues B;
    public final Vertical C;
    public final FlingBehavior D;
    public final Function1 E;
    public final boolean F;
    public final Function4 G;
    public final int H;
    public final int I;
    public final int J;
    public final int w;
    public final Modifier x;
    public final PagerState y;
    public final boolean z;

    public b(int v, Modifier modifier0, PagerState pagerState0, boolean z, float f, PaddingValues paddingValues0, Vertical alignment$Vertical0, FlingBehavior flingBehavior0, Function1 function10, boolean z1, Function4 function40, int v1, int v2, int v3) {
        this.w = v;
        this.x = modifier0;
        this.y = pagerState0;
        this.z = z;
        this.A = f;
        this.B = paddingValues0;
        this.C = alignment$Vertical0;
        this.D = flingBehavior0;
        this.E = function10;
        this.F = z1;
        this.G = function40;
        this.H = v1;
        this.I = v2;
        this.J = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        Pager.HorizontalPager-7SJ-wSw(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I & -920350135 | ((0x24924924 & this.I) >> 1 | 306783378 & this.I) | (306783378 & this.I) << 1 & (0x24924924 & this.I), this.J);
        return Unit.INSTANCE;
    }
}

