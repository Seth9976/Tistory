package androidx.navigation;

import android.content.Context;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000E\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bJ\u000E\u0010\t\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u000BJ\u000E\u0010\f\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\u000EJ\u000E\u0010\u000F\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u0011¨\u0006\u0012"}, d2 = {"Landroidx/navigation/NavHostController;", "Landroidx/navigation/NavController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "enableOnBackPressed", "", "enabled", "", "setLifecycleOwner", "owner", "Landroidx/lifecycle/LifecycleOwner;", "setOnBackPressedDispatcher", "dispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "setViewModelStore", "viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class NavHostController extends NavController {
    public NavHostController(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
    }

    @Override  // androidx.navigation.NavController
    public final void enableOnBackPressed(boolean z) {
        super.enableOnBackPressed(z);
    }

    @Override  // androidx.navigation.NavController
    public final void setLifecycleOwner(@NotNull LifecycleOwner lifecycleOwner0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "owner");
        super.setLifecycleOwner(lifecycleOwner0);
    }

    @Override  // androidx.navigation.NavController
    public final void setOnBackPressedDispatcher(@NotNull OnBackPressedDispatcher onBackPressedDispatcher0) {
        Intrinsics.checkNotNullParameter(onBackPressedDispatcher0, "dispatcher");
        super.setOnBackPressedDispatcher(onBackPressedDispatcher0);
    }

    @Override  // androidx.navigation.NavController
    public final void setViewModelStore(@NotNull ViewModelStore viewModelStore0) {
        Intrinsics.checkNotNullParameter(viewModelStore0, "viewModelStore");
        super.setViewModelStore(viewModelStore0);
    }
}

