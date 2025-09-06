package androidx.compose.ui.platform;

import androidx.activity.compose.ReportDrawnKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.TestModifierUpdaterKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class y1 extends Lambda implements Function2 {
    public final int w;
    public final Function1 x;
    public final int y;

    public y1(int v, int v1, Function1 function10) {
        this.w = v1;
        this.x = function10;
        this.y = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        switch(this.w) {
            case 0: {
                WindowInfoKt.WindowFocusObserver(this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                ReportDrawnKt.ReportDrawnAfter(this.x, ((Composer)object0), this.y | 1);
                return Unit.INSTANCE;
            }
            case 2: {
                ReportDrawnKt.ReportDrawnAfter(this.x, ((Composer)object0), this.y | 1);
                return Unit.INSTANCE;
            }
            default: {
                TestModifierUpdaterKt.TestModifierUpdaterLayout(this.x, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}

