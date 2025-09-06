package com.kakao.tistory.presentation.main;

import androidx.core.util.Consumer;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

public final class v implements Consumer, FunctionAdapter {
    public final Function1 a;

    public v(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "function");
        super();
        this.a = function10;
    }

    @Override  // androidx.core.util.Consumer
    public final void accept(Object object0) {
        this.a.invoke(object0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof Consumer && object0 instanceof FunctionAdapter) {
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

