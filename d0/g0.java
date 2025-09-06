package d0;

import androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.LookaheadScopeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function2 {
    public final int w;
    public final Function3 x;
    public final int y;

    public g0(Function3 function30, int v, int v1) {
        this.w = v1;
        this.x = function30;
        this.y = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                LazySaveableStateHolderKt.LazySaveableStateHolderProvider(this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                int v = ((Number)object1).intValue();
                if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xF5D35FD9, v, -1, "androidx.compose.material.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:693)");
                }
                this.x.invoke(this.y, ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                LookaheadScopeKt.LookaheadScope(this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}

