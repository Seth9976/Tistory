package pa;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.FlowColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function3 {
    public final Function3 w;

    public m(Function3 function30) {
        this.w = function30;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((FlowColumnScope)object0), "$this$FlowColumn");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((FlowColumnScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB3DFDDF9, v, -1, "com.kakao.kandinsky.resize.FixedSizeSelector.<anonymous> (ReSizeScreen.kt:438)");
        }
        Modifier modifier0 = ColumnScope.weight$default(((FlowColumnScope)object0), Modifier.Companion, 1.0f, false, 2, null);
        this.w.invoke(modifier0, ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

