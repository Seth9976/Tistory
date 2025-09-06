package androidx.lifecycle;

import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o0 implements Observer, FunctionAdapter {
    public final int a;
    public final Lambda b;

    public o0(Function1 function10, int v) {
        this.a = v;
        if(v != 1) {
            Intrinsics.checkNotNullParameter(function10, "function");
            super();
            this.b = (Lambda)function10;
            return;
        }
        Intrinsics.checkNotNullParameter(function10, "function");
        super();
        this.b = (Lambda)function10;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this.a != 0) {
            if(object0 instanceof Observer && object0 instanceof FunctionAdapter) {
                Function function0 = ((FunctionAdapter)object0).getFunctionDelegate();
                return Intrinsics.areEqual(this.b, function0);
            }
            return false;
        }
        if(object0 instanceof Observer && object0 instanceof FunctionAdapter) {
            Function function1 = ((FunctionAdapter)object0).getFunctionDelegate();
            return Intrinsics.areEqual(this.b, function1);
        }
        return false;
    }

    @Override  // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        if(this.a != 0) {
            ((Function1)this.b).invoke(object0);
            return;
        }
        ((Function1)this.b).invoke(object0);
    }
}

