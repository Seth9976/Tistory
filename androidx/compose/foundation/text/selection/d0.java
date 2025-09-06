package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

public final class d0 implements OffsetProvider, FunctionAdapter {
    public final Function0 a;

    public d0(Function0 function00) {
        this.a = function00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof OffsetProvider && object0 instanceof FunctionAdapter) {
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

    @Override  // androidx.compose.foundation.text.selection.OffsetProvider
    public final long provide-F1C5BW0() {
        return ((Offset)this.a.invoke()).unbox-impl();
    }
}

