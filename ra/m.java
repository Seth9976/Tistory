package ra;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class m extends Lambda implements Function3 {
    public final SheetState A;
    public final Function0 B;
    public final Function4 w;
    public final Function4 x;
    public final Function3 y;
    public final CoroutineScope z;

    public m(Function4 function40, Function4 function41, Function3 function30, CoroutineScope coroutineScope0, SheetState sheetState0, Function0 function00) {
        this.w = function40;
        this.x = function41;
        this.y = function30;
        this.z = coroutineScope0;
        this.A = sheetState0;
        this.B = function00;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$ModalBottomSheet");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((ColumnScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-572890830, v, -1, "com.kakao.kandinsky.selector.SelectorBottomSheet.<anonymous>.<anonymous> (SelectorBottomSheet.kt:46)");
        }
        k k0 = new k(this.z, this.A, this.B);
        this.w.invoke(((ColumnScope)object0), k0, ((Composer)object1), ((int)(v & 14)));
        l l0 = new l(this.z, this.A, this.B);
        this.x.invoke(((ColumnScope)object0), l0, ((Composer)object1), ((int)(v & 14)));
        this.y.invoke(((ColumnScope)object0), ((Composer)object1), ((int)(v & 14)));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

