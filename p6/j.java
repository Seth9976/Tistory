package p6;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.google.accompanist.swiperefresh.SwipeRefreshKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function2 {
    public final float A;
    public final Alignment B;
    public final PaddingValues C;
    public final Function4 D;
    public final boolean E;
    public final Function2 F;
    public final int G;
    public final int H;
    public final SwipeRefreshState w;
    public final Function0 x;
    public final Modifier y;
    public final boolean z;

    public j(SwipeRefreshState swipeRefreshState0, Function0 function00, Modifier modifier0, boolean z, float f, Alignment alignment0, PaddingValues paddingValues0, Function4 function40, boolean z1, Function2 function20, int v, int v1) {
        this.w = swipeRefreshState0;
        this.x = function00;
        this.y = modifier0;
        this.z = z;
        this.A = f;
        this.B = alignment0;
        this.C = paddingValues0;
        this.D = function40;
        this.E = z1;
        this.F = function20;
        this.G = v;
        this.H = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SwipeRefreshKt.SwipeRefresh-Fsagccs(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)), this.H);
        return Unit.INSTANCE;
    }
}

