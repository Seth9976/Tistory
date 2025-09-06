package androidx.navigation.ui;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u001C\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u001A\u001C\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\b¨\u0006\t"}, d2 = {"setupWithNavController", "", "Landroidx/appcompat/widget/Toolbar;", "navController", "Landroidx/navigation/NavController;", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "configuration", "Landroidx/navigation/ui/AppBarConfiguration;", "navigation-ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nToolbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toolbar.kt\nandroidx/navigation/ui/ToolbarKt\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,73:1\n248#2,9:74\n248#2,9:83\n*S KotlinDebug\n*F\n+ 1 Toolbar.kt\nandroidx/navigation/ui/ToolbarKt\n*L\n47#1:74,9\n69#1:83,9\n*E\n"})
public final class ToolbarKt {
    public static final void setupWithNavController(@NotNull Toolbar toolbar0, @NotNull NavController navController0, @Nullable DrawerLayout drawerLayout0) {
        Intrinsics.checkNotNullParameter(toolbar0, "<this>");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        NavigationUI.setupWithNavController(toolbar0, navController0, new Builder(navController0.getGraph()).setOpenableLayout(drawerLayout0).setFallbackOnNavigateUpListener(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1.INSTANCE)).build());
    }

    public static final void setupWithNavController(@NotNull Toolbar toolbar0, @NotNull NavController navController0, @NotNull AppBarConfiguration appBarConfiguration0) {
        Intrinsics.checkNotNullParameter(toolbar0, "<this>");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        Intrinsics.checkNotNullParameter(appBarConfiguration0, "configuration");
        NavigationUI.setupWithNavController(toolbar0, navController0, appBarConfiguration0);
    }

    public static void setupWithNavController$default(Toolbar toolbar0, NavController navController0, AppBarConfiguration appBarConfiguration0, int v, Object object0) {
        if((v & 2) != 0) {
            appBarConfiguration0 = new Builder(navController0.getGraph()).setOpenableLayout(null).setFallbackOnNavigateUpListener(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1.INSTANCE)).build();
        }
        ToolbarKt.setupWithNavController(toolbar0, navController0, appBarConfiguration0);
    }
}

