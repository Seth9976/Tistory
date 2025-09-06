package androidx.navigation.compose;

import ac.b;
import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import ga.a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import o4.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u001B\u0010\u0003\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001A3\u0010\n\u001A\u00020\t2\"\u0010\b\u001A\u0012\u0012\u000E\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005\"\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/navigation/NavController;", "Landroidx/compose/runtime/State;", "Landroidx/navigation/NavBackStackEntry;", "currentBackStackEntryAsState", "(Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "navigators", "Landroidx/navigation/NavHostController;", "rememberNavController", "([Landroidx/navigation/Navigator;Landroidx/compose/runtime/Composer;I)Landroidx/navigation/NavHostController;", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavHostController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHostController.kt\nandroidx/navigation/compose/NavHostControllerKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,83:1\n77#2:84\n1223#3,6:85\n*S KotlinDebug\n*F\n+ 1 NavHostController.kt\nandroidx/navigation/compose/NavHostControllerKt\n*L\n59#1:84\n60#1:85,6\n*E\n"})
public final class NavHostControllerKt {
    public static final NavHostController access$createNavController(Context context0) {
        NavHostController navHostController0 = new NavHostController(context0);
        navHostController0.getNavigatorProvider().addNavigator(new ComposeNavGraphNavigator(navHostController0.getNavigatorProvider()));
        navHostController0.getNavigatorProvider().addNavigator(new ComposeNavigator());
        navHostController0.getNavigatorProvider().addNavigator(new DialogNavigator());
        return navHostController0;
    }

    @Composable
    @NotNull
    public static final State currentBackStackEntryAsState(@NotNull NavController navController0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-120375203, v, -1, "androidx.navigation.compose.currentBackStackEntryAsState (NavHostController.kt:41)");
        }
        State state0 = SnapshotStateKt.collectAsState(navController0.getCurrentBackStackEntryFlow(), null, null, composer0, 0x30, 2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @NotNull
    public static final NavHostController rememberNavController(@NotNull Navigator[] arr_navigator, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xED63F7F2, v, -1, "androidx.navigation.compose.rememberNavController (NavHostController.kt:57)");
        }
        Context context0 = (Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Object[] arr_object = Arrays.copyOf(arr_navigator, arr_navigator.length);
        a a0 = new a(context0, 1);
        Saver saver0 = SaverKt.Saver(f.w, a0);
        boolean z = composer0.changedInstance(context0);
        b b0 = composer0.rememberedValue();
        if(z || b0 == Composer.Companion.getEmpty()) {
            b0 = new b(context0, 2);
            composer0.updateRememberedValue(b0);
        }
        NavHostController navHostController0 = (NavHostController)RememberSaveableKt.rememberSaveable(arr_object, saver0, null, b0, composer0, 0, 4);
        for(int v1 = 0; v1 < arr_navigator.length; ++v1) {
            navHostController0.getNavigatorProvider().addNavigator(arr_navigator[v1]);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navHostController0;
    }
}

