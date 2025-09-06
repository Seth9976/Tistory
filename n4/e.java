package n4;

import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavBackStackEntry;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function0 {
    public final NavBackStackEntry w;

    public e(NavBackStackEntry navBackStackEntry0) {
        this.w = navBackStackEntry0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NavBackStackEntry navBackStackEntry0 = this.w;
        if(!navBackStackEntry0.j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry\'s SavedStateHandle until it is added to the NavController\'s back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if(navBackStackEntry0.getLifecycle().getCurrentState() == State.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry\'s SavedStateHandle after the NavBackStackEntry is destroyed.");
        }
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "owner");
        return ((c)new ViewModelProvider(navBackStackEntry0, new b(navBackStackEntry0, null)).get(c.class)).H0;  // 初始化器: Landroidx/lifecycle/AbstractSavedStateViewModelFactory;-><init>(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V
    }
}

