package p0;

import androidx.compose.material.SliderKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics.Kotlin;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.ranges.ClosedFloatingPointRange;

public final class u7 extends FunctionReferenceImpl implements Function1 {
    public final ClosedFloatingPointRange a;
    public final FloatRef b;
    public final FloatRef c;

    public u7(ClosedFloatingPointRange closedFloatingPointRange0, FloatRef ref$FloatRef0, FloatRef ref$FloatRef1) {
        this.a = closedFloatingPointRange0;
        this.b = ref$FloatRef0;
        this.c = ref$FloatRef1;
        super(1, Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return SliderKt.access$scale(((Number)this.a.getStart()).floatValue(), ((Number)this.a.getEndInclusive()).floatValue(), ((Number)object0).floatValue(), this.b.element, this.c.element);
    }
}

