package com.kakao.keditor.plugin.pluginspec.grammarcheck;

import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
final class GrammarCheckActivity.sam.androidx_lifecycle_Observer.0 implements Observer, FunctionAdapter {
    private final Function1 function;

    public GrammarCheckActivity.sam.androidx_lifecycle_Observer.0(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "function");
        super();
        this.function = function10;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(@Nullable Object object0) {
        return !(object0 instanceof Observer) || !(object0 instanceof FunctionAdapter) ? false : Intrinsics.areEqual(this.getFunctionDelegate(), ((FunctionAdapter)object0).getFunctionDelegate());
    }

    @Override  // kotlin.jvm.internal.FunctionAdapter
    @NotNull
    public final Function getFunctionDelegate() {
        return this.function;
    }

    @Override
    public final int hashCode() {
        return this.getFunctionDelegate().hashCode();
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        this.function.invoke(object0);
    }
}

