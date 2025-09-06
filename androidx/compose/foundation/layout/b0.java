package androidx.compose.foundation.layout;

import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class b0 implements ModifierLocalConsumer {
    public final Function1 a;
    public WindowInsets b;

    public b0(Function1 function10) {
        this.a = function10;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b0 ? ((b0)object0).a == this.a : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope0) {
        WindowInsets windowInsets0 = (WindowInsets)modifierLocalReadScope0.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
        if(!Intrinsics.areEqual(windowInsets0, this.b)) {
            this.b = windowInsets0;
            this.a.invoke(windowInsets0);
        }
    }
}

