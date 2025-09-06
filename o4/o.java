package o4;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.OnLookaheadMeasured;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavGraph;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function2 {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Function E;
    public final Object F;
    public final Function G;
    public final int w;
    public final Function1 x;
    public final Modifier y;
    public final int z;

    public o(Transition transition0, Function1 function10, Modifier modifier0, EnterTransition enterTransition0, ExitTransition exitTransition0, Function2 function20, OnLookaheadMeasured onLookaheadMeasured0, Function3 function30, int v, int v1) {
        this.w = 1;
        this.B = transition0;
        this.x = function10;
        this.y = modifier0;
        this.C = enterTransition0;
        this.D = exitTransition0;
        this.E = function20;
        this.F = onLookaheadMeasured0;
        this.G = function30;
        this.z = v;
        this.A = v1;
        super(2);
    }

    public o(NavHostController navHostController0, NavGraph navGraph0, Modifier modifier0, Alignment alignment0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, int v, int v1) {
        this.w = 0;
        this.B = navHostController0;
        this.C = navGraph0;
        this.y = modifier0;
        this.D = alignment0;
        this.x = function10;
        this.E = function11;
        this.F = function12;
        this.G = function13;
        this.z = v;
        this.A = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            AnimatedVisibilityKt.AnimatedEnterExitImpl(((Transition)this.B), this.x, this.y, ((EnterTransition)this.C), ((ExitTransition)this.D), ((Function2)this.E), ((OnLookaheadMeasured)this.F), ((Function3)this.G), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        NavHostKt.NavHost(((NavHostController)this.B), ((NavGraph)this.C), this.y, ((Alignment)this.D), this.x, ((Function1)this.E), ((Function1)this.F), ((Function1)this.G), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
        return Unit.INSTANCE;
    }
}

