package ca;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function3 {
    public final int w;
    public final Function0 x;

    public c0(Function0 function00, int v) {
        this.w = v;
        this.x = function00;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((MeasureScope)object0), "$this$layout");
            Intrinsics.checkNotNullParameter(((Measurable)object1), "measurable");
            Placeable placeable0 = ((Measurable)object1).measure-BRTryo0(((Constraints)object2).unbox-impl());
            return MeasureScope.layout$default(((MeasureScope)object0), placeable0.getWidth(), placeable0.getHeight(), null, new w1(this.x, placeable0), 4, null);
        }
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxScope)object0), "$this$FeatureBottomBar");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5E2FB14, v, -1, "com.kakao.kandinsky.designsystem.common.CommonFeatureBottomBar.<anonymous> (FeatureBottomBar.kt:34)");
        }
        FeatureBottomBarKt.access$FeatureBottomBarLeftContent(this.x, ((Composer)object1), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

