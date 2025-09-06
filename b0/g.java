package b0;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function4 {
    public final int w;
    public final Function3 x;

    public g(int v, Function3 function30) {
        this.w = v;
        this.x = function30;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                int v1 = ((Number)object3).intValue();
                if((v1 & 6) == 0) {
                    v1 |= (((Composer)object2).changed(((LazyItemScope)object0)) ? 4 : 2);
                }
                if((v1 & 0x83) == 130 && ((Composer)object2).getSkipping()) {
                    ((Composer)object2).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1010194746, v1, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:58)");
                }
                this.x.invoke(((LazyItemScope)object0), ((Composer)object2), ((int)(v1 & 14)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                int v2 = ((Number)object3).intValue();
                if((v2 & 6) == 0) {
                    v2 |= (((Composer)object2).changed(((LazyGridItemScope)object0)) ? 4 : 2);
                }
                if((v2 & 0x83) == 130 && ((Composer)object2).getSkipping()) {
                    ((Composer)object2).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xFDEFEC08, v2, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:49)");
                }
                this.x.invoke(((LazyGridItemScope)object0), ((Composer)object2), ((int)(v2 & 14)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                int v3 = ((Number)object3).intValue();
                if((v3 & 6) == 0) {
                    v3 |= (((Composer)object2).changed(((LazyStaggeredGridItemScope)object0)) ? 4 : 2);
                }
                if((v3 & 0x83) == 130 && ((Composer)object2).getSkipping()) {
                    ((Composer)object2).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x273583E4, v3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent.item.<anonymous> (LazyStaggeredGridIntervalContent.kt:47)");
                }
                this.x.invoke(((LazyStaggeredGridItemScope)object0), ((Composer)object2), ((int)(v3 & 14)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                AnimatedContentScope animatedContentScope0 = (AnimatedContentScope)object0;
                int v = ((Number)object3).intValue();
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x1CDC15AA, v, -1, "androidx.navigation.compose.composable.<anonymous> (NavGraphBuilder.kt:55)");
                }
                this.x.invoke(((NavBackStackEntry)object1), ((Composer)object2), ((int)(v >> 3 & 14)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

