package pa;

import androidx.compose.material3.d7;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntSize;
import com.kakao.kandinsky.resize.ReSizeScreenKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function3 {
    public final List w;
    public final long x;
    public final Function1 y;

    public n(List list0, long v, Function1 function10) {
        this.w = list0;
        this.x = v;
        this.y = function10;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((Modifier)object0), "it");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((Modifier)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB4B7B7A1, v, -1, "com.kakao.kandinsky.resize.FixedSizeSelector.<anonymous>.<anonymous> (ReSizeScreen.kt:407)");
        }
        for(Object object3: this.w) {
            int v1 = ((Number)object3).intValue();
            String s = String.valueOf(v1);
            boolean z = IntSize.getWidth-impl(this.x) >= v1;
            ((Composer)object1).startReplaceGroup(-1506939981);
            Function1 function10 = this.y;
            boolean z1 = ((Composer)object1).changed(function10);
            boolean z2 = ((Composer)object1).changed(v1);
            d7 d70 = ((Composer)object1).rememberedValue();
            if(z1 || z2 || d70 == Composer.Companion.getEmpty()) {
                d70 = new d7(v1, 2, function10);
                ((Composer)object1).updateRememberedValue(d70);
            }
            ((Composer)object1).endReplaceGroup();
            ReSizeScreenKt.access$ResizeTypeButton(((Modifier)object0), s, false, z, d70, ((Composer)object1), v & 14 | 0x180, 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

