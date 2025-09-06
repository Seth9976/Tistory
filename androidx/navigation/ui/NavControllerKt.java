package androidx.navigation.ui;

import androidx.customview.widget.Openable;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001A\u0004\u0018\u00010\u0004\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0006¨\u0006\u0007"}, d2 = {"navigateUp", "", "Landroidx/navigation/NavController;", "drawerLayout", "Landroidx/customview/widget/Openable;", "appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "navigation-ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/ui/NavControllerKt\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,39:1\n248#2,9:40\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/ui/NavControllerKt\n*L\n30#1:40,9\n*E\n"})
public final class NavControllerKt {
    public static final boolean navigateUp(@NotNull NavController navController0, @Nullable Openable openable0) {
        Intrinsics.checkNotNullParameter(navController0, "<this>");
        return NavigationUI.navigateUp(navController0, new Builder(navController0.getGraph()).setOpenableLayout(openable0).setFallbackOnNavigateUpListener(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1.INSTANCE)).build());
    }

    public static final boolean navigateUp(@NotNull NavController navController0, @NotNull AppBarConfiguration appBarConfiguration0) {
        Intrinsics.checkNotNullParameter(navController0, "<this>");
        Intrinsics.checkNotNullParameter(appBarConfiguration0, "appBarConfiguration");
        return NavigationUI.navigateUp(navController0, appBarConfiguration0);
    }
}

