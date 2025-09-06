package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.PopupProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function2 {
    public final ScrollState A;
    public final PopupProperties B;
    public final Shape C;
    public final long D;
    public final float E;
    public final float F;
    public final BorderStroke G;
    public final Function3 H;
    public final int I;
    public final int J;
    public final int K;
    public final boolean w;
    public final Function0 x;
    public final Modifier y;
    public final long z;

    public u(boolean z, Function0 function00, Modifier modifier0, long v, ScrollState scrollState0, PopupProperties popupProperties0, Shape shape0, long v1, float f, float f1, BorderStroke borderStroke0, Function3 function30, int v2, int v3, int v4) {
        this.w = z;
        this.x = function00;
        this.y = modifier0;
        this.z = v;
        this.A = scrollState0;
        this.B = popupProperties0;
        this.C = shape0;
        this.D = v1;
        this.E = f;
        this.F = f1;
        this.G = borderStroke0;
        this.H = function30;
        this.I = v2;
        this.J = v3;
        this.K = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        AndroidMenu_androidKt.DropdownMenu-IlH_yew(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, ((Composer)object0), (this.I | 1) & -920350135 | ((0x24924924 & (this.I | 1)) >> 1 | 306783378 & (this.I | 1)) | (306783378 & (this.I | 1)) << 1 & (0x24924924 & (this.I | 1)), this.J & -920350135 | ((0x24924924 & this.J) >> 1 | 306783378 & this.J) | (306783378 & this.J) << 1 & (0x24924924 & this.J), this.K);
        return Unit.INSTANCE;
    }
}

