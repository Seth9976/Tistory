package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP})
@Name("NoOp")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001A\u00020\u0002H\u0016J.\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00022\b\u0010\u0007\u001A\u0004\u0018\u00010\b2\b\u0010\t\u001A\u0004\u0018\u00010\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001A\u00020\u000EH\u0016¨\u0006\u000F"}, d2 = {"Landroidx/navigation/NoOpNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "()V", "createDestination", "navigate", "destination", "args", "Landroid/os/Bundle;", "navOptions", "Landroidx/navigation/NavOptions;", "navigatorExtras", "Landroidx/navigation/Navigator$Extras;", "popBackStack", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NoOpNavigator extends Navigator {
    @Override  // androidx.navigation.Navigator
    @NotNull
    public NavDestination createDestination() {
        return new NavDestination(this);
    }

    @Override  // androidx.navigation.Navigator
    @NotNull
    public NavDestination navigate(@NotNull NavDestination navDestination0, @Nullable Bundle bundle0, @Nullable NavOptions navOptions0, @Nullable Extras navigator$Extras0) {
        Intrinsics.checkNotNullParameter(navDestination0, "destination");
        return navDestination0;
    }

    @Override  // androidx.navigation.Navigator
    public boolean popBackStack() {
        return true;
    }
}

