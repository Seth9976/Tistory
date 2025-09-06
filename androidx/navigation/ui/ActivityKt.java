package androidx.navigation.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u001C\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u001A\u001C\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\b¨\u0006\t"}, d2 = {"setupActionBarWithNavController", "", "Landroidx/appcompat/app/AppCompatActivity;", "navController", "Landroidx/navigation/NavController;", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "configuration", "Landroidx/navigation/ui/AppBarConfiguration;", "navigation-ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Activity.kt\nandroidx/navigation/ui/ActivityKt\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,78:1\n248#2,9:79\n248#2,9:88\n*S KotlinDebug\n*F\n+ 1 Activity.kt\nandroidx/navigation/ui/ActivityKt\n*L\n50#1:79,9\n74#1:88,9\n*E\n"})
public final class ActivityKt {
    public static final void setupActionBarWithNavController(@NotNull AppCompatActivity appCompatActivity0, @NotNull NavController navController0, @Nullable DrawerLayout drawerLayout0) {
        Intrinsics.checkNotNullParameter(appCompatActivity0, "<this>");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        NavigationUI.setupActionBarWithNavController(appCompatActivity0, navController0, new Builder(navController0.getGraph()).setOpenableLayout(drawerLayout0).setFallbackOnNavigateUpListener(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1.INSTANCE)).build());
    }

    public static final void setupActionBarWithNavController(@NotNull AppCompatActivity appCompatActivity0, @NotNull NavController navController0, @NotNull AppBarConfiguration appBarConfiguration0) {
        Intrinsics.checkNotNullParameter(appCompatActivity0, "<this>");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        Intrinsics.checkNotNullParameter(appBarConfiguration0, "configuration");
        NavigationUI.setupActionBarWithNavController(appCompatActivity0, navController0, appBarConfiguration0);
    }

    public static void setupActionBarWithNavController$default(AppCompatActivity appCompatActivity0, NavController navController0, AppBarConfiguration appBarConfiguration0, int v, Object object0) {
        if((v & 2) != 0) {
            appBarConfiguration0 = new Builder(navController0.getGraph()).setOpenableLayout(null).setFallbackOnNavigateUpListener(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1.INSTANCE)).build();
        }
        ActivityKt.setupActionBarWithNavController(appCompatActivity0, navController0, appBarConfiguration0);
    }
}

