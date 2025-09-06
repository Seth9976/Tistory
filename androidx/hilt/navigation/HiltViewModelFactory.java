package androidx.hilt.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001A\u001D\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0001H\u0007¢\u0006\u0002\b\u0005\u001A\u001D\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0007H\u0007¢\u0006\u0002\b\u0005¨\u0006\b"}, d2 = {"HiltViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "context", "Landroid/content/Context;", "delegateFactory", "create", "navBackStackEntry", "Landroidx/navigation/NavBackStackEntry;", "hilt-navigation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "HiltViewModelFactory")
public final class HiltViewModelFactory {
    @JvmName(name = "create")
    @NotNull
    public static final Factory create(@NotNull Context context0, @NotNull Factory viewModelProvider$Factory0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(viewModelProvider$Factory0, "delegateFactory");
        while(context0 instanceof ContextWrapper) {
            if(context0 instanceof ComponentActivity) {
                Factory viewModelProvider$Factory1 = dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.createInternal(((ComponentActivity)context0), viewModelProvider$Factory0);
                Intrinsics.checkNotNullExpressionValue(viewModelProvider$Factory1, "createInternal(\n        … */ delegateFactory\n    )");
                return viewModelProvider$Factory1;
            }
            context0 = ((ContextWrapper)context0).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context0, "ctx.baseContext");
        }
        throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: " + context0);
    }

    @JvmName(name = "create")
    @NotNull
    public static final Factory create(@NotNull Context context0, @NotNull NavBackStackEntry navBackStackEntry0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "navBackStackEntry");
        return HiltViewModelFactory.create(context0, navBackStackEntry0.getDefaultViewModelProviderFactory());
    }
}

