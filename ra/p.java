package ra;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.selector.SelectorGridKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function4 {
    public final List w;
    public final Function1 x;
    public final int y;

    public p(List list0, Function1 function10, int v) {
        this.w = list0;
        this.x = function10;
        this.y = v;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$SelectorBottomSheet");
        Intrinsics.checkNotNullParameter(((Function0)object1), "dismiss");
        int v1 = (v & 14) == 0 ? (((Composer)object2).changed(((ColumnScope)object0)) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (((Composer)object2).changedInstance(((Function0)object1)) ? 0x20 : 16);
        }
        if((v1 & 731) == 0x92 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE4050FE3, v1, -1, "com.kakao.kandinsky.selector.SingleImageSelector.<anonymous> (SingleImageSelector.kt:47)");
        }
        Modifier modifier0 = ColumnScope.weight$default(((ColumnScope)object0), Modifier.Companion, 1.0f, false, 2, null);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x2B154204, true, new g(this.x, ((Function0)object1), this.y), ((Composer)object2), 54);
        SelectorGridKt.SelectorGrid(modifier0, this.w, composableLambda0, ((Composer)object2), 0x1C0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

