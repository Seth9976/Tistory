package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class s2 extends Lambda implements Function2 {
    public final CardElevation A;
    public final BorderStroke B;
    public final Function3 C;
    public final int D;
    public final int E;
    public final int w;
    public final Modifier x;
    public final Shape y;
    public final CardColors z;

    public s2(Modifier modifier0, Shape shape0, CardColors cardColors0, CardElevation cardElevation0, BorderStroke borderStroke0, Function3 function30, int v, int v1, int v2) {
        this.w = v2;
        this.x = modifier0;
        this.y = shape0;
        this.z = cardColors0;
        this.A = cardElevation0;
        this.B = borderStroke0;
        this.C = function30;
        this.D = v;
        this.E = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            CardKt.OutlinedCard(this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.D | 1), this.E);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        CardKt.Card(this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.D | 1), this.E);
        return Unit.INSTANCE;
    }
}

