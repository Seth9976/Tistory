package ra;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.selector.SelectorGridKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function4 {
    public final List w;
    public final String x;
    public final int y;
    public final SnapshotStateList z;

    public h(int v, SnapshotStateList snapshotStateList0, String s, List list0) {
        this.w = list0;
        this.x = s;
        this.y = v;
        this.z = snapshotStateList0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$SelectorBottomSheet");
        Intrinsics.checkNotNullParameter(((Function0)object1), "dismiss");
        if((v & 14) == 0) {
            v |= (((Composer)object2).changed(((ColumnScope)object0)) ? 4 : 2);
        }
        if((v & 651) == 130 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x75CA4B0A, v, -1, "com.kakao.kandinsky.selector.MultipleImageSelector.<anonymous> (MultipleImageSelector.kt:60)");
        }
        Modifier modifier0 = ColumnScope.weight$default(((ColumnScope)object0), Modifier.Companion, 1.0f, false, 2, null);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xD4ED2A49, true, new g(this.x, this.y, this.z), ((Composer)object2), 54);
        SelectorGridKt.SelectorGrid(modifier0, this.w, composableLambda0, ((Composer)object2), 0x1C0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

