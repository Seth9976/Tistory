package androidx.navigation.ui;

import android.view.MenuItem;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004¨\u0006\u0005"}, d2 = {"onNavDestinationSelected", "", "Landroid/view/MenuItem;", "navController", "Landroidx/navigation/NavController;", "navigation-ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class MenuItemKt {
    public static final boolean onNavDestinationSelected(@NotNull MenuItem menuItem0, @NotNull NavController navController0) {
        Intrinsics.checkNotNullParameter(menuItem0, "<this>");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        return NavigationUI.onNavDestinationSelected(menuItem0, navController0);
    }
}

