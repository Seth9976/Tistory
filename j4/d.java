package j4;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.lifecycle.SavedStateHandle.Companion;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class d implements SaverScope, FunctionAdapter {
    public final Companion a;

    public d(Companion savedStateHandle$Companion0) {
        this.a = savedStateHandle$Companion0;
    }

    @Override  // androidx.compose.runtime.saveable.SaverScope
    public final boolean canBeSaved(Object object0) {
        return this.a.validateValue(object0);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return !(object0 instanceof SaverScope) || !(object0 instanceof FunctionAdapter) ? false : Intrinsics.areEqual(this.getFunctionDelegate(), ((FunctionAdapter)object0).getFunctionDelegate());
    }

    @Override  // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, Companion.class, "validateValue", "validateValue(Ljava/lang/Object;)Z", 0);
    }

    @Override
    public final int hashCode() {
        return this.getFunctionDelegate().hashCode();
    }
}

