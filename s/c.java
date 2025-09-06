package s;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Function F;
    public final int w;
    public final Modifier x;
    public final String y;
    public final int z;

    public c(Object object0, MutableTransitionState mutableTransitionState0, Modifier modifier0, EnterTransition enterTransition0, ExitTransition exitTransition0, String s, Function3 function30, int v, int v1, int v2) {
        this.w = v2;
        this.B = object0;
        this.C = mutableTransitionState0;
        this.x = modifier0;
        this.D = enterTransition0;
        this.E = exitTransition0;
        this.y = s;
        this.F = function30;
        this.z = v;
        this.A = v1;
        super(2);
    }

    public c(Object object0, Modifier modifier0, Function1 function10, Alignment alignment0, String s, Function1 function11, Function4 function40, int v, int v1) {
        this.w = 0;
        this.B = object0;
        this.x = modifier0;
        this.C = function10;
        this.E = alignment0;
        this.y = s;
        this.D = function11;
        this.F = function40;
        this.z = v;
        this.A = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                AnimatedContentKt.AnimatedContent(this.B, this.x, ((Function1)this.C), ((Alignment)this.E), this.y, ((Function1)this.D), ((Function4)this.F), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                AnimatedVisibilityKt.AnimatedVisibility(((RowScope)this.B), ((MutableTransitionState)this.C), this.x, ((EnterTransition)this.D), ((ExitTransition)this.E), this.y, ((Function3)this.F), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                AnimatedVisibilityKt.AnimatedVisibility(((ColumnScope)this.B), ((MutableTransitionState)this.C), this.x, ((EnterTransition)this.D), ((ExitTransition)this.E), this.y, ((Function3)this.F), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
                return Unit.INSTANCE;
            }
        }
    }
}

