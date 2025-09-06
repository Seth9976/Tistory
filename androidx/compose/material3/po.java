package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

public final class po implements ColorProducer, FunctionAdapter {
    public final PropertyReference0Impl a;

    public po(PropertyReference0Impl propertyReference0Impl0) {
        this.a = propertyReference0Impl0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof ColorProducer && object0 instanceof FunctionAdapter) {
            Function function0 = ((FunctionAdapter)object0).getFunctionDelegate();
            return Intrinsics.areEqual(this.a, function0);
        }
        return false;
    }

    @Override  // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // androidx.compose.ui.graphics.ColorProducer
    public final long invoke-0d7_KjU() {
        return ((Color)this.a.invoke()).unbox-impl();
    }
}

