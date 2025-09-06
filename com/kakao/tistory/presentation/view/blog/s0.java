package com.kakao.tistory.presentation.view.blog;

import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s0 implements Observer, FunctionAdapter {
    public final Lambda a;

    public s0(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "function");
        super();
        this.a = (Lambda)function10;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof Observer && object0 instanceof FunctionAdapter) {
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

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        ((Function1)this.a).invoke(object0);
    }
}

