package com.kakao.tistory.presentation.view.editor;

import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

public final class f6 implements Observer, FunctionAdapter {
    public final a6 a;

    public f6(a6 a60) {
        Intrinsics.checkNotNullParameter(a60, "function");
        super();
        this.a = a60;
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
        this.a.invoke(object0);
    }
}

