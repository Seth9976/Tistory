package ra;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.kakao.kandinsky.selector.MultipleImageSelectorKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p0.g4;

public final class i extends Lambda implements Function3 {
    public final SnapshotStateList w;
    public final List x;
    public final String y;
    public final int z;

    public i(int v, SnapshotStateList snapshotStateList0, String s, List list0) {
        this.w = snapshotStateList0;
        this.x = list0;
        this.y = s;
        this.z = v;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$SelectorBottomSheet");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2F14E667, v, -1, "com.kakao.kandinsky.selector.MultipleImageSelector.<anonymous> (MultipleImageSelector.kt:79)");
        }
        MultipleImageSelectorKt.access$BottomBar(this.w.size() == this.x.size(), new g4(this.z, 2, this.y, this.w, this.x), ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

