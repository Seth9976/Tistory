package p0;

import androidx.compose.material.SliderKt;
import androidx.compose.runtime.MutableFloatState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class x7 extends Lambda implements Function1 {
    public final CoroutineScope A;
    public final j7 B;
    public final Function0 C;
    public final MutableFloatState w;
    public final List x;
    public final FloatRef y;
    public final FloatRef z;

    public x7(MutableFloatState mutableFloatState0, List list0, FloatRef ref$FloatRef0, FloatRef ref$FloatRef1, CoroutineScope coroutineScope0, j7 j70, Function0 function00) {
        this.w = mutableFloatState0;
        this.x = list0;
        this.y = ref$FloatRef0;
        this.z = ref$FloatRef1;
        this.A = coroutineScope0;
        this.B = j70;
        this.C = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = ((Number)object0).floatValue();
        float f1 = this.w.getFloatValue();
        float f2 = SliderKt.access$snapValueToTick(f1, this.x, this.y.element, this.z.element);
        if(f1 != f2) {
            w7 w70 = new w7(this.B, f1, f2, f, this.C, null);
            BuildersKt.launch$default(this.A, null, null, w70, 3, null);
        }
        else if(!((Boolean)this.B.b.getValue()).booleanValue()) {
            Function0 function00 = this.C;
            if(function00 != null) {
                function00.invoke();
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}

