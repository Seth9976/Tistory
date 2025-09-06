package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;

public abstract class w2 implements ModifierLocalConsumer, ModifierLocalProvider {
    public final MutableState a;

    public w2() {
        this.a = SnapshotStateKt.mutableStateOf$default(WindowInsetsKt.WindowInsets(0, 0, 0, 0), null, 2, null);
    }

    public abstract WindowInsets a(WindowInsets arg1);

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    public final ProvidableModifierLocal getKey() {
        return WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets();
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    public final Object getValue() {
        return (WindowInsets)this.a.getValue();
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope0) {
        WindowInsets windowInsets0 = this.a(((WindowInsets)modifierLocalReadScope0.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets())));
        this.a.setValue(windowInsets0);
    }
}

