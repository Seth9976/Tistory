package o1;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesScope;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

public final class h implements FocusPropertiesScope, FunctionAdapter {
    public final Function1 a;

    public h(Function1 function10) {
        this.a = function10;
    }

    @Override  // androidx.compose.ui.focus.FocusPropertiesScope
    public final void apply(FocusProperties focusProperties0) {
        this.a.invoke(focusProperties0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof FocusPropertiesScope && object0 instanceof FunctionAdapter) {
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
}

