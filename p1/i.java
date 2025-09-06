package p1;

import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.functions.Function1;

public final class i implements DoubleUnaryOperator {
    public final int a;
    public final Function1 b;

    public i(Function1 function10, int v) {
        this.a = v;
        this.b = function10;
        super();
    }

    @Override
    public final double applyAsDouble(double f) {
        return ((Number)this.b.invoke(f)).doubleValue();
    }
}

