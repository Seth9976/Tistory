package p4;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.c;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavHostController;
import androidx.navigation.fragment.NavHostFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function0 {
    public final NavHostFragment w;

    public g(NavHostFragment navHostFragment0) {
        this.w = navHostFragment0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NavHostFragment navHostFragment0 = this.w;
        Context context0 = navHostFragment0.getContext();
        if(context0 == null) {
            throw new IllegalStateException("NavController cannot be created before the fragment is attached");
        }
        Intrinsics.checkNotNullExpressionValue(context0, "checkNotNull(context) {\n…s attached\"\n            }");
        NavHostController navHostController0 = new NavHostController(context0);
        navHostController0.setLifecycleOwner(navHostFragment0);
        ViewModelStore viewModelStore0 = navHostFragment0.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore0, "viewModelStore");
        navHostController0.setViewModelStore(viewModelStore0);
        navHostFragment0.onCreateNavHostController(navHostController0);
        Bundle bundle0 = navHostFragment0.getSavedStateRegistry().consumeRestoredStateForKey("android-support-nav:fragment:navControllerState");
        if(bundle0 != null) {
            navHostController0.restoreState(bundle0);
        }
        navHostFragment0.getSavedStateRegistry().registerSavedStateProvider("android-support-nav:fragment:navControllerState", new c(navHostController0, 3));
        Bundle bundle1 = navHostFragment0.getSavedStateRegistry().consumeRestoredStateForKey("android-support-nav:fragment:graphId");
        if(bundle1 != null) {
            navHostFragment0.B = bundle1.getInt("android-support-nav:fragment:graphId");
        }
        navHostFragment0.getSavedStateRegistry().registerSavedStateProvider("android-support-nav:fragment:graphId", new c(navHostFragment0, 4));
        if(navHostFragment0.B != 0) {
            navHostController0.setGraph(navHostFragment0.B);
            return navHostController0;
        }
        Bundle bundle2 = navHostFragment0.getArguments();
        int v = bundle2 == null ? 0 : bundle2.getInt("android-support-nav:fragment:graphId");
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle("android-support-nav:fragment:startDestinationArgs");
        if(v != 0) {
            navHostController0.setGraph(v, bundle3);
        }
        return navHostController0;
    }
}

