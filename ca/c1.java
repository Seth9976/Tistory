package ca;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class c1 extends Lambda implements Function3 {
    public final int w;
    public final Function4 x;
    public final boolean y;
    public final int z;

    public c1(Function4 function40, boolean z, int v, int v1) {
        this.w = v1;
        this.x = function40;
        this.y = z;
        this.z = v;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            ((Number)object0).intValue();
            int v = ((Number)object2).intValue();
            if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
                ((Composer)object1).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x78F97DF0, v, -1, "com.kakao.kandinsky.designsystem.common.Pager.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ItemSlider.kt:201)");
            }
            this.x.invoke(Boolean.valueOf(this.y), this.z, ((Composer)object1), 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        ((Number)object0).intValue();
        int v1 = ((Number)object2).intValue();
        if((v1 & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1460935407, v1, -1, "com.kakao.kandinsky.designsystem.common.Pager.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ItemSlider.kt:198)");
        }
        this.x.invoke(Boolean.valueOf(this.y), this.z, ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

