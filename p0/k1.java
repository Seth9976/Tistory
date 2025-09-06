package p0;

import androidx.compose.material.BottomNavigationKt;
import androidx.compose.material.NavigationRailKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class k1 extends Lambda implements Function2 {
    public final int w;
    public final Function3 x;
    public final State y;

    public k1(Function3 function30, State state0, int v) {
        this.w = v;
        this.x = function30;
        this.y = state0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            int v = ((Number)object1).intValue();
            if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
                ((Composer)object0).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9B60090E, v, -1, "androidx.compose.material.NavigationRailTransition.<anonymous> (NavigationRail.kt:309)");
            }
            Float float0 = NavigationRailKt.access$NavigationRailTransition_Klgx_Pg$lambda$3(this.y);
            this.x.invoke(float0, ((Composer)object0), 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v1 = ((Number)object1).intValue();
        if((v1 & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF7C4DF2E, v1, -1, "androidx.compose.material.BottomNavigationTransition.<anonymous> (BottomNavigation.kt:299)");
        }
        Float float1 = BottomNavigationKt.access$BottomNavigationTransition_Klgx_Pg$lambda$3(this.y);
        this.x.invoke(float1, ((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

