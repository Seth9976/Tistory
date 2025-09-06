package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v9 extends Lambda implements Function3 {
    public final int w;
    public final boolean x;
    public final Object y;
    public final Object z;

    public v9(Function0 function00, Function0 function01, boolean z) {
        this.w = 1;
        this.y = function00;
        this.x = z;
        this.z = function01;
        super(3);
    }

    public v9(boolean z, MutableIntState mutableIntState0, MutableIntState mutableIntState1) {
        this.w = 0;
        this.x = z;
        this.y = mutableIntState0;
        this.z = mutableIntState1;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            int v = ((Number)object2).intValue();
            Intrinsics.checkNotNullParameter(((BoxScope)object0), "$this$FeatureBottomBar");
            if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
                ((Composer)object1).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB451EDD2, v, -1, "com.kakao.kandinsky.designsystem.common.CommonFeatureBottomBar.<anonymous> (FeatureBottomBar.kt:43)");
            }
            FeatureBottomBarKt.access$FeatureBottomBarRightContent(((Function0)this.y), (this.x ? null : ((Function0)this.z)), ((Composer)object1), 0, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        long v1 = ((Constraints)object2).unbox-impl();
        int v2 = ConstraintsKt.constrainWidth-K40F9xA(v1, ExposedDropdownMenu_androidKt.access$ExposedDropdownMenuBox$lambda$5(((MutableIntState)this.y)));
        int v3 = ConstraintsKt.constrainHeight-K40F9xA(v1, ExposedDropdownMenu_androidKt.access$ExposedDropdownMenuBox$lambda$8(((MutableIntState)this.z)));
        int v4 = this.x ? v2 : Constraints.getMinWidth-impl(v1);
        if(!this.x) {
            v2 = Constraints.getMaxWidth-impl(v1);
        }
        Placeable placeable0 = ((Measurable)object1).measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v1, v4, v2, 0, v3, 4, null));
        return MeasureScope.layout$default(((MeasureScope)object0), placeable0.getWidth(), placeable0.getHeight(), null, new u9(placeable0), 4, null);
    }
}

