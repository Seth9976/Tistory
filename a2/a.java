package a2;

import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.jvm.functions.Function1;

public final class a extends InspectorValueInfo implements ModifierLocalConsumer {
    public final Function1 c;

    public a(Function1 function10, Function1 function11) {
        super(function11);
        this.c = function10;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof a && ((a)object0).c == this.c;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope0) {
        this.c.invoke(modifierLocalReadScope0);
    }
}

