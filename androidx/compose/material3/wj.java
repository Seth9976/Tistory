package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class wj extends Lambda implements Function2 {
    public final boolean A;
    public final SegmentedButtonColors B;
    public final BorderStroke C;
    public final MutableInteractionSource D;
    public final Function2 E;
    public final Function2 F;
    public final int G;
    public final int H;
    public final int I;
    public final RowScope J;
    public final Function K;
    public final int w;
    public final boolean x;
    public final Shape y;
    public final Modifier z;

    public wj(RowScope rowScope0, boolean z, Function function0, Shape shape0, Modifier modifier0, boolean z1, SegmentedButtonColors segmentedButtonColors0, BorderStroke borderStroke0, MutableInteractionSource mutableInteractionSource0, Function2 function20, Function2 function21, int v, int v1, int v2, int v3) {
        this.w = v3;
        this.J = rowScope0;
        this.x = z;
        this.K = function0;
        this.y = shape0;
        this.z = modifier0;
        this.A = z1;
        this.B = segmentedButtonColors0;
        this.C = borderStroke0;
        this.D = mutableInteractionSource0;
        this.E = function20;
        this.F = function21;
        this.G = v;
        this.H = v1;
        this.I = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            SegmentedButtonKt.SegmentedButton(((SingleChoiceSegmentedButtonRowScope)this.J), this.x, ((Function0)this.K), this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.G | 1), RecomposeScopeImplKt.updateChangedFlags(this.H), this.I);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        SegmentedButtonKt.SegmentedButton(((MultiChoiceSegmentedButtonRowScope)this.J), this.x, ((Function1)this.K), this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.G | 1), RecomposeScopeImplKt.updateChangedFlags(this.H), this.I);
        return Unit.INSTANCE;
    }
}

