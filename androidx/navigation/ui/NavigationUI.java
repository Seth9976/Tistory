package androidx.navigation.ui;

import a5.b;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.core.app.h;
import androidx.customview.widget.Openable;
import androidx.navigation.ActivityNavigator.Destination;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavController.OnDestinationChangedListener;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavOptions;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.components.j;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r4.a;
import r4.c;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u00C6\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\u0007\u0010\bJ\'\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0006H\u0007\u00A2\u0006\u0004\b\u0007\u0010\nJ!\u0010\r\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00042\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0007\u00A2\u0006\u0004\b\r\u0010\u000EJ\u001F\u0010\r\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u000FH\u0007\u00A2\u0006\u0004\b\r\u0010\u0011J)\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0005\u001A\u00020\u00042\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0007\u00A2\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0010\u001A\u00020\u000FH\u0007\u00A2\u0006\u0004\b\u0015\u0010\u0017J)\u0010\u001A\u001A\u00020\u00142\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0005\u001A\u00020\u00042\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0007\u00A2\u0006\u0004\b\u001A\u0010\u001BJ)\u0010\u001A\u001A\u00020\u00142\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0010\u001A\u00020\u000FH\u0007\u00A2\u0006\u0004\b\u001A\u0010\u001CJ1\u0010\u001A\u001A\u00020\u00142\u0006\u0010\u001E\u001A\u00020\u001D2\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0005\u001A\u00020\u00042\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0007\u00A2\u0006\u0004\b\u001A\u0010\u001FJ1\u0010\u001A\u001A\u00020\u00142\u0006\u0010\u001E\u001A\u00020\u001D2\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0010\u001A\u00020\u000FH\u0007\u00A2\u0006\u0004\b\u001A\u0010 J\u001F\u0010\u001A\u001A\u00020\u00142\u0006\u0010\"\u001A\u00020!2\u0006\u0010\u0005\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\u001A\u0010#J\'\u0010\u001A\u001A\u00020\u00142\u0006\u0010\"\u001A\u00020!2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0006H\u0007\u00A2\u0006\u0004\b\u001A\u0010$J\u001D\u0010(\u001A\b\u0012\u0002\b\u0003\u0018\u00010\'2\u0006\u0010&\u001A\u00020%H\u0007\u00A2\u0006\u0004\b(\u0010)J\u001F\u0010\u001A\u001A\u00020\u00142\u0006\u0010+\u001A\u00020*2\u0006\u0010\u0005\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\u001A\u0010,J\'\u0010\u001A\u001A\u00020\u00142\u0006\u0010+\u001A\u00020*2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0006H\u0007\u00A2\u0006\u0004\b\u001A\u0010-J\u001D\u00103\u001A\u00020\u0006*\u00020.2\b\b\u0001\u00100\u001A\u00020/H\u0001\u00A2\u0006\u0004\b1\u00102\u00A8\u00064"}, d2 = {"Landroidx/navigation/ui/NavigationUI;", "", "Landroid/view/MenuItem;", "item", "Landroidx/navigation/NavController;", "navController", "", "onNavDestinationSelected", "(Landroid/view/MenuItem;Landroidx/navigation/NavController;)Z", "saveState", "(Landroid/view/MenuItem;Landroidx/navigation/NavController;Z)Z", "Landroidx/customview/widget/Openable;", "openableLayout", "navigateUp", "(Landroidx/navigation/NavController;Landroidx/customview/widget/Openable;)Z", "Landroidx/navigation/ui/AppBarConfiguration;", "configuration", "(Landroidx/navigation/NavController;Landroidx/navigation/ui/AppBarConfiguration;)Z", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "setupActionBarWithNavController", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/navigation/NavController;Landroidx/customview/widget/Openable;)V", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/navigation/NavController;Landroidx/navigation/ui/AppBarConfiguration;)V", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "setupWithNavController", "(Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/NavController;Landroidx/customview/widget/Openable;)V", "(Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/NavController;Landroidx/navigation/ui/AppBarConfiguration;)V", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingToolbarLayout", "(Lcom/google/android/material/appbar/CollapsingToolbarLayout;Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/NavController;Landroidx/customview/widget/Openable;)V", "(Lcom/google/android/material/appbar/CollapsingToolbarLayout;Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/NavController;Landroidx/navigation/ui/AppBarConfiguration;)V", "Lcom/google/android/material/navigation/NavigationView;", "navigationView", "(Lcom/google/android/material/navigation/NavigationView;Landroidx/navigation/NavController;)V", "(Lcom/google/android/material/navigation/NavigationView;Landroidx/navigation/NavController;Z)V", "Landroid/view/View;", "view", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "findBottomSheetBehavior", "(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lcom/google/android/material/navigation/NavigationBarView;", "navigationBarView", "(Lcom/google/android/material/navigation/NavigationBarView;Landroidx/navigation/NavController;)V", "(Lcom/google/android/material/navigation/NavigationBarView;Landroidx/navigation/NavController;Z)V", "Landroidx/navigation/NavDestination;", "", "destId", "matchDestination$navigation_ui_release", "(Landroidx/navigation/NavDestination;I)Z", "matchDestination", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavigationUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,714:1\n1229#2,2:715\n*S KotlinDebug\n*F\n+ 1 NavigationUI.kt\nandroidx/navigation/ui/NavigationUI\n*L\n712#1:715,2\n*E\n"})
public final class NavigationUI {
    @NotNull
    public static final NavigationUI INSTANCE;

    static {
        NavigationUI.INSTANCE = new NavigationUI();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @JvmStatic
    @Nullable
    public static final BottomSheetBehavior findBottomSheetBehavior(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof LayoutParams)) {
            ViewParent viewParent0 = view0.getParent();
            return viewParent0 instanceof View ? NavigationUI.findBottomSheetBehavior(((View)viewParent0)) : null;
        }
        Behavior coordinatorLayout$Behavior0 = ((LayoutParams)viewGroup$LayoutParams0).getBehavior();
        return coordinatorLayout$Behavior0 instanceof BottomSheetBehavior ? ((BottomSheetBehavior)coordinatorLayout$Behavior0) : null;
    }

    @JvmStatic
    public static final boolean matchDestination$navigation_ui_release(@NotNull NavDestination navDestination0, @IdRes int v) {
        Intrinsics.checkNotNullParameter(navDestination0, "<this>");
        for(Object object0: NavDestination.Companion.getHierarchy(navDestination0)) {
            if(((NavDestination)object0).getId() == v) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @JvmStatic
    public static final boolean navigateUp(@NotNull NavController navController0, @Nullable Openable openable0) {
        Intrinsics.checkNotNullParameter(navController0, "navController");
        return NavigationUI.navigateUp(navController0, new Builder(navController0.getGraph()).setOpenableLayout(openable0).build());
    }

    @JvmStatic
    public static final boolean navigateUp(@NotNull NavController navController0, @NotNull AppBarConfiguration appBarConfiguration0) {
        Intrinsics.checkNotNullParameter(navController0, "navController");
        Intrinsics.checkNotNullParameter(appBarConfiguration0, "configuration");
        Openable openable0 = appBarConfiguration0.getOpenableLayout();
        NavDestination navDestination0 = navController0.getCurrentDestination();
        if(openable0 != null && navDestination0 != null && appBarConfiguration0.isTopLevelDestination(navDestination0)) {
            openable0.open();
            return true;
        }
        if(!navController0.navigateUp()) {
            OnNavigateUpListener appBarConfiguration$OnNavigateUpListener0 = appBarConfiguration0.getFallbackOnNavigateUpListener();
            return appBarConfiguration$OnNavigateUpListener0 == null ? false : appBarConfiguration$OnNavigateUpListener0.onNavigateUp();
        }
        return true;
    }

    @JvmStatic
    public static final boolean onNavDestinationSelected(@NotNull MenuItem menuItem0, @NotNull NavController navController0) {
        Intrinsics.checkNotNullParameter(menuItem0, "item");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        androidx.navigation.NavOptions.Builder navOptions$Builder0 = new androidx.navigation.NavOptions.Builder().setLaunchSingleTop(true).setRestoreState(true);
        NavDestination navDestination0 = navController0.getCurrentDestination();
        Intrinsics.checkNotNull(navDestination0);
        NavGraph navGraph0 = navDestination0.getParent();
        Intrinsics.checkNotNull(navGraph0);
        if(navGraph0.findNode(menuItem0.getItemId()) instanceof Destination) {
            navOptions$Builder0.setEnterAnim(anim.nav_default_enter_anim).setExitAnim(anim.nav_default_exit_anim).setPopEnterAnim(anim.nav_default_pop_enter_anim).setPopExitAnim(anim.nav_default_pop_exit_anim);
        }
        else {
            navOptions$Builder0.setEnterAnim(animator.nav_default_enter_anim).setExitAnim(animator.nav_default_exit_anim).setPopEnterAnim(animator.nav_default_pop_enter_anim).setPopExitAnim(animator.nav_default_pop_exit_anim);
        }
        if((menuItem0.getOrder() & 0x30000) == 0) {
            NavGraph navGraph1 = navController0.getGraph();
            navOptions$Builder0.setPopUpTo(NavGraph.Companion.findStartDestination(navGraph1).getId(), false, true);
        }
        NavOptions navOptions0 = navOptions$Builder0.build();
        try {
            navController0.navigate(menuItem0.getItemId(), null, navOptions0);
            NavDestination navDestination1 = navController0.getCurrentDestination();
            return navDestination1 == null || !NavigationUI.matchDestination$navigation_ui_release(navDestination1, menuItem0.getItemId()) ? false : true;
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            int v = menuItem0.getItemId();
            StringBuilder stringBuilder0 = b.v("Ignoring onNavDestinationSelected for MenuItem ", NavDestination.Companion.getDisplayName(navController0.getContext(), v), " as it cannot be found from the current destination ");
            stringBuilder0.append(navController0.getCurrentDestination());
            Log.i("NavigationUI", stringBuilder0.toString(), illegalArgumentException0);
            return false;
        }
    }

    @NavigationUiSaveStateControl
    @JvmStatic
    public static final boolean onNavDestinationSelected(@NotNull MenuItem menuItem0, @NotNull NavController navController0, boolean z) {
        Intrinsics.checkNotNullParameter(menuItem0, "item");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        if(!z) {
            androidx.navigation.NavOptions.Builder navOptions$Builder0 = new androidx.navigation.NavOptions.Builder().setLaunchSingleTop(true);
            NavDestination navDestination0 = navController0.getCurrentDestination();
            Intrinsics.checkNotNull(navDestination0);
            NavGraph navGraph0 = navDestination0.getParent();
            Intrinsics.checkNotNull(navGraph0);
            if(navGraph0.findNode(menuItem0.getItemId()) instanceof Destination) {
                navOptions$Builder0.setEnterAnim(anim.nav_default_enter_anim).setExitAnim(anim.nav_default_exit_anim).setPopEnterAnim(anim.nav_default_pop_enter_anim).setPopExitAnim(anim.nav_default_pop_exit_anim);
            }
            else {
                navOptions$Builder0.setEnterAnim(animator.nav_default_enter_anim).setExitAnim(animator.nav_default_exit_anim).setPopEnterAnim(animator.nav_default_pop_enter_anim).setPopExitAnim(animator.nav_default_pop_exit_anim);
            }
            if((menuItem0.getOrder() & 0x30000) == 0) {
                NavGraph navGraph1 = navController0.getGraph();
                androidx.navigation.NavOptions.Builder.setPopUpTo$default(navOptions$Builder0, NavGraph.Companion.findStartDestination(navGraph1).getId(), false, false, 4, null);
            }
            NavOptions navOptions0 = navOptions$Builder0.build();
            try {
                navController0.navigate(menuItem0.getItemId(), null, navOptions0);
                NavDestination navDestination1 = navController0.getCurrentDestination();
                return navDestination1 == null || !NavigationUI.matchDestination$navigation_ui_release(navDestination1, menuItem0.getItemId()) ? false : true;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                int v = menuItem0.getItemId();
                StringBuilder stringBuilder0 = b.v("Ignoring onNavDestinationSelected for MenuItem ", NavDestination.Companion.getDisplayName(navController0.getContext(), v), " as it cannot be found from the current destination ");
                stringBuilder0.append(navController0.getCurrentDestination());
                Log.i("NavigationUI", stringBuilder0.toString(), illegalArgumentException0);
                return false;
            }
        }
        throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default");
    }

    @JvmOverloads
    @JvmStatic
    public static final void setupActionBarWithNavController(@NotNull AppCompatActivity appCompatActivity0, @NotNull NavController navController0) {
        Intrinsics.checkNotNullParameter(appCompatActivity0, "activity");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        NavigationUI.setupActionBarWithNavController$default(appCompatActivity0, navController0, null, 4, null);
    }

    @JvmStatic
    public static final void setupActionBarWithNavController(@NotNull AppCompatActivity appCompatActivity0, @NotNull NavController navController0, @Nullable Openable openable0) {
        Intrinsics.checkNotNullParameter(appCompatActivity0, "activity");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        NavigationUI.setupActionBarWithNavController(appCompatActivity0, navController0, new Builder(navController0.getGraph()).setOpenableLayout(openable0).build());
    }

    @JvmOverloads
    @JvmStatic
    public static final void setupActionBarWithNavController(@NotNull AppCompatActivity appCompatActivity0, @NotNull NavController navController0, @NotNull AppBarConfiguration appBarConfiguration0) {
        Intrinsics.checkNotNullParameter(appCompatActivity0, "activity");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        Intrinsics.checkNotNullParameter(appBarConfiguration0, "configuration");
        navController0.addOnDestinationChangedListener(new ActionBarOnDestinationChangedListener(appCompatActivity0, appBarConfiguration0));
    }

    public static void setupActionBarWithNavController$default(AppCompatActivity appCompatActivity0, NavController navController0, AppBarConfiguration appBarConfiguration0, int v, Object object0) {
        if((v & 4) != 0) {
            appBarConfiguration0 = new Builder(navController0.getGraph()).build();
        }
        NavigationUI.setupActionBarWithNavController(appCompatActivity0, navController0, appBarConfiguration0);
    }

    @JvmOverloads
    @JvmStatic
    public static final void setupWithNavController(@NotNull Toolbar toolbar0, @NotNull NavController navController0) {
        Intrinsics.checkNotNullParameter(toolbar0, "toolbar");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        NavigationUI.setupWithNavController$default(toolbar0, navController0, null, 4, null);
    }

    @JvmStatic
    public static final void setupWithNavController(@NotNull Toolbar toolbar0, @NotNull NavController navController0, @Nullable Openable openable0) {
        Intrinsics.checkNotNullParameter(toolbar0, "toolbar");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        NavigationUI.setupWithNavController(toolbar0, navController0, new Builder(navController0.getGraph()).setOpenableLayout(openable0).build());
    }

    @JvmOverloads
    @JvmStatic
    public static final void setupWithNavController(@NotNull Toolbar toolbar0, @NotNull NavController navController0, @NotNull AppBarConfiguration appBarConfiguration0) {
        Intrinsics.checkNotNullParameter(toolbar0, "toolbar");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        Intrinsics.checkNotNullParameter(appBarConfiguration0, "configuration");
        navController0.addOnDestinationChangedListener(new ToolbarOnDestinationChangedListener(toolbar0, appBarConfiguration0));
        toolbar0.setNavigationOnClickListener(new r4.b(navController0, appBarConfiguration0, 0));
    }

    @JvmOverloads
    @JvmStatic
    public static final void setupWithNavController(@NotNull CollapsingToolbarLayout collapsingToolbarLayout0, @NotNull Toolbar toolbar0, @NotNull NavController navController0) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout0, "collapsingToolbarLayout");
        Intrinsics.checkNotNullParameter(toolbar0, "toolbar");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        NavigationUI.setupWithNavController$default(collapsingToolbarLayout0, toolbar0, navController0, null, 8, null);
    }

    @JvmStatic
    public static final void setupWithNavController(@NotNull CollapsingToolbarLayout collapsingToolbarLayout0, @NotNull Toolbar toolbar0, @NotNull NavController navController0, @Nullable Openable openable0) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout0, "collapsingToolbarLayout");
        Intrinsics.checkNotNullParameter(toolbar0, "toolbar");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        NavigationUI.setupWithNavController(collapsingToolbarLayout0, toolbar0, navController0, new Builder(navController0.getGraph()).setOpenableLayout(openable0).build());
    }

    @JvmOverloads
    @JvmStatic
    public static final void setupWithNavController(@NotNull CollapsingToolbarLayout collapsingToolbarLayout0, @NotNull Toolbar toolbar0, @NotNull NavController navController0, @NotNull AppBarConfiguration appBarConfiguration0) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout0, "collapsingToolbarLayout");
        Intrinsics.checkNotNullParameter(toolbar0, "toolbar");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        Intrinsics.checkNotNullParameter(appBarConfiguration0, "configuration");
        navController0.addOnDestinationChangedListener(new CollapsingToolbarOnDestinationChangedListener(collapsingToolbarLayout0, toolbar0, appBarConfiguration0));
        toolbar0.setNavigationOnClickListener(new r4.b(navController0, appBarConfiguration0, 1));
    }

    @JvmStatic
    public static final void setupWithNavController(@NotNull NavigationBarView navigationBarView0, @NotNull NavController navController0) {
        Intrinsics.checkNotNullParameter(navigationBarView0, "navigationBarView");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        navigationBarView0.setOnItemSelectedListener(new h(navController0, 24));
        navController0.addOnDestinationChangedListener(new OnDestinationChangedListener() {
            public final WeakReference a;
            public final NavController b;

            {
                WeakReference weakReference0 = new WeakReference(navigationBarView0);  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                NavController navController0 = navController0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = weakReference0;
                this.b = navController0;
            }

            @Override  // androidx.navigation.NavController$OnDestinationChangedListener
            public void onDestinationChanged(@NotNull NavController navController0, @NotNull NavDestination navDestination0, @Nullable Bundle bundle0) {
                Intrinsics.checkNotNullParameter(navController0, "controller");
                Intrinsics.checkNotNullParameter(navDestination0, "destination");
                NavigationBarView navigationBarView0 = (NavigationBarView)this.a.get();
                if(navigationBarView0 == null) {
                    this.b.removeOnDestinationChangedListener(this);
                    return;
                }
                if(navDestination0 instanceof FloatingWindow) {
                    return;
                }
                Menu menu0 = navigationBarView0.getMenu();
                Intrinsics.checkNotNullExpressionValue(menu0, "view.menu");
                int v = menu0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    MenuItem menuItem0 = menu0.getItem(v1);
                    Intrinsics.checkExpressionValueIsNotNull(menuItem0, "getItem(index)");
                    if(NavigationUI.matchDestination$navigation_ui_release(navDestination0, menuItem0.getItemId())) {
                        menuItem0.setChecked(true);
                    }
                }
            }
        });
    }

    @NavigationUiSaveStateControl
    @JvmStatic
    public static final void setupWithNavController(@NotNull NavigationBarView navigationBarView0, @NotNull NavController navController0, boolean z) {
        Intrinsics.checkNotNullParameter(navigationBarView0, "navigationBarView");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        if(z) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default");
        }
        navigationBarView0.setOnItemSelectedListener(new a(navController0, false));
        navController0.addOnDestinationChangedListener(new OnDestinationChangedListener() {
            public final WeakReference a;
            public final NavController b;

            {
                WeakReference weakReference0 = new WeakReference(navigationBarView0);  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                NavController navController0 = navController0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = weakReference0;
                this.b = navController0;
            }

            @Override  // androidx.navigation.NavController$OnDestinationChangedListener
            public void onDestinationChanged(@NotNull NavController navController0, @NotNull NavDestination navDestination0, @Nullable Bundle bundle0) {
                Intrinsics.checkNotNullParameter(navController0, "controller");
                Intrinsics.checkNotNullParameter(navDestination0, "destination");
                NavigationBarView navigationBarView0 = (NavigationBarView)this.a.get();
                if(navigationBarView0 == null) {
                    this.b.removeOnDestinationChangedListener(this);
                    return;
                }
                if(navDestination0 instanceof FloatingWindow) {
                    return;
                }
                Menu menu0 = navigationBarView0.getMenu();
                Intrinsics.checkNotNullExpressionValue(menu0, "view.menu");
                int v = menu0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    MenuItem menuItem0 = menu0.getItem(v1);
                    Intrinsics.checkExpressionValueIsNotNull(menuItem0, "getItem(index)");
                    if(NavigationUI.matchDestination$navigation_ui_release(navDestination0, menuItem0.getItemId())) {
                        menuItem0.setChecked(true);
                    }
                }
            }
        });
    }

    @JvmStatic
    public static final void setupWithNavController(@NotNull NavigationView navigationView0, @NotNull NavController navController0) {
        Intrinsics.checkNotNullParameter(navigationView0, "navigationView");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        navigationView0.setNavigationItemSelectedListener(new j(4, navController0, navigationView0));
        navController0.addOnDestinationChangedListener(new OnDestinationChangedListener() {
            public final WeakReference a;
            public final NavController b;

            {
                WeakReference weakReference0 = new WeakReference(navigationView0);  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                NavController navController0 = navController0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = weakReference0;
                this.b = navController0;
            }

            @Override  // androidx.navigation.NavController$OnDestinationChangedListener
            public void onDestinationChanged(@NotNull NavController navController0, @NotNull NavDestination navDestination0, @Nullable Bundle bundle0) {
                Intrinsics.checkNotNullParameter(navController0, "controller");
                Intrinsics.checkNotNullParameter(navDestination0, "destination");
                NavigationView navigationView0 = (NavigationView)this.a.get();
                if(navigationView0 == null) {
                    this.b.removeOnDestinationChangedListener(this);
                    return;
                }
                if(navDestination0 instanceof FloatingWindow) {
                    return;
                }
                Menu menu0 = navigationView0.getMenu();
                Intrinsics.checkNotNullExpressionValue(menu0, "view.menu");
                int v = menu0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    MenuItem menuItem0 = menu0.getItem(v1);
                    Intrinsics.checkExpressionValueIsNotNull(menuItem0, "getItem(index)");
                    menuItem0.setChecked(NavigationUI.matchDestination$navigation_ui_release(navDestination0, menuItem0.getItemId()));
                }
            }
        });
    }

    @NavigationUiSaveStateControl
    @JvmStatic
    public static final void setupWithNavController(@NotNull NavigationView navigationView0, @NotNull NavController navController0, boolean z) {
        Intrinsics.checkNotNullParameter(navigationView0, "navigationView");
        Intrinsics.checkNotNullParameter(navController0, "navController");
        if(z) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default");
        }
        navigationView0.setNavigationItemSelectedListener(new c(navigationView0, navController0, false));
        navController0.addOnDestinationChangedListener(new OnDestinationChangedListener() {
            public final WeakReference a;
            public final NavController b;

            {
                WeakReference weakReference0 = new WeakReference(navigationView0);  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                NavController navController0 = navController0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = weakReference0;
                this.b = navController0;
            }

            @Override  // androidx.navigation.NavController$OnDestinationChangedListener
            public void onDestinationChanged(@NotNull NavController navController0, @NotNull NavDestination navDestination0, @Nullable Bundle bundle0) {
                Intrinsics.checkNotNullParameter(navController0, "controller");
                Intrinsics.checkNotNullParameter(navDestination0, "destination");
                NavigationView navigationView0 = (NavigationView)this.a.get();
                if(navigationView0 == null) {
                    this.b.removeOnDestinationChangedListener(this);
                    return;
                }
                if(navDestination0 instanceof FloatingWindow) {
                    return;
                }
                Menu menu0 = navigationView0.getMenu();
                Intrinsics.checkNotNullExpressionValue(menu0, "view.menu");
                int v = menu0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    MenuItem menuItem0 = menu0.getItem(v1);
                    Intrinsics.checkExpressionValueIsNotNull(menuItem0, "getItem(index)");
                    menuItem0.setChecked(NavigationUI.matchDestination$navigation_ui_release(navDestination0, menuItem0.getItemId()));
                }
            }
        });
    }

    public static void setupWithNavController$default(Toolbar toolbar0, NavController navController0, AppBarConfiguration appBarConfiguration0, int v, Object object0) {
        if((v & 4) != 0) {
            appBarConfiguration0 = new Builder(navController0.getGraph()).build();
        }
        NavigationUI.setupWithNavController(toolbar0, navController0, appBarConfiguration0);
    }

    public static void setupWithNavController$default(CollapsingToolbarLayout collapsingToolbarLayout0, Toolbar toolbar0, NavController navController0, AppBarConfiguration appBarConfiguration0, int v, Object object0) {
        if((v & 8) != 0) {
            appBarConfiguration0 = new Builder(navController0.getGraph()).build();
        }
        NavigationUI.setupWithNavController(collapsingToolbarLayout0, toolbar0, navController0, appBarConfiguration0);
    }
}

