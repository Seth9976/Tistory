package androidx.navigation.compose;

import aa.d;
import androidx.compose.material3.gd;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import j0.t1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o4.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001E\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\u001A\u0015\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001A!\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0002\u0010\n\u001A%\u0010\u000B\u001A\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00070\f2\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000E²\u0006\u0010\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00070\u0010X\u008A\u0084\u0002²\u0006\u0010\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00070\u0012X\u008A\u0084\u0002"}, d2 = {"DialogHost", "", "dialogNavigator", "Landroidx/navigation/compose/DialogNavigator;", "(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/runtime/Composer;I)V", "rememberVisibleList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/navigation/NavBackStackEntry;", "backStack", "", "(Ljava/util/Collection;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "PopulateVisibleList", "", "(Ljava/util/List;Ljava/util/Collection;Landroidx/compose/runtime/Composer;I)V", "navigation-compose_release", "dialogBackStack", "", "transitionInProgress", ""}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDialogHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,137:1\n1223#2,6:138\n1223#2,6:145\n1223#2,6:152\n1223#2,6:160\n1223#2,3:168\n1226#2,3:174\n1855#3:144\n1856#3:151\n1855#3:159\n1856#3:166\n766#3:171\n857#3,2:172\n77#4:158\n77#4:167\n81#5:177\n81#5:178\n*S KotlinDebug\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt\n*L\n48#1:138,6\n53#1:145,6\n74#1:152,6\n92#1:160,6\n123#1:168,3\n123#1:174,3\n50#1:144\n50#1:151\n91#1:159\n91#1:166\n126#1:171\n126#1:172,2\n90#1:158\n122#1:167\n43#1:177\n47#1:178\n*E\n"})
public final class DialogHostKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void DialogHost(@NotNull DialogNavigator dialogNavigator0, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x118F13D0);
        int v1 = (v & 6) == 0 ? (composer1.changed(dialogNavigator0) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x118F13D0, v1, -1, "androidx.navigation.compose.DialogHost (DialogHost.kt:40)");
            }
            SaveableStateHolder saveableStateHolder0 = SaveableStateHolderKt.rememberSaveableStateHolder(composer1, 0);
            State state0 = SnapshotStateKt.collectAsState(dialogNavigator0.getBackStack$navigation_compose_release(), null, composer1, 0, 1);
            SnapshotStateList snapshotStateList0 = DialogHostKt.rememberVisibleList(((List)state0.getValue()), composer1, 0);
            DialogHostKt.PopulateVisibleList(snapshotStateList0, ((List)state0.getValue()), composer1, 0);
            State state1 = SnapshotStateKt.collectAsState(dialogNavigator0.getTransitionInProgress$navigation_compose_release(), null, composer1, 0, 1);
            SnapshotStateList snapshotStateList1 = composer1.rememberedValue();
            if(snapshotStateList1 == Composer.Companion.getEmpty()) {
                snapshotStateList1 = SnapshotStateKt.mutableStateListOf();
                composer1.updateRememberedValue(snapshotStateList1);
            }
            composer1.startReplaceGroup(1361037007);
            for(Object object0: snapshotStateList0) {
                NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)object0;
                NavDestination navDestination0 = navBackStackEntry0.getDestination();
                Intrinsics.checkNotNull(navDestination0, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                boolean z = composer1.changedInstance(navBackStackEntry0);
                t1 t10 = composer1.rememberedValue();
                if((v1 & 14) == 4 || z || t10 == Composer.Companion.getEmpty()) {
                    t10 = new t1(20, dialogNavigator0, navBackStackEntry0);
                    composer1.updateRememberedValue(t10);
                }
                AndroidDialog_androidKt.Dialog(t10, ((Destination)navDestination0).getDialogProperties$navigation_compose_release(), ComposableLambdaKt.rememberComposableLambda(0x43541EBC, true, new c(navBackStackEntry0, dialogNavigator0, saveableStateHolder0, snapshotStateList1, ((Destination)navDestination0)), composer1, 54), composer1, 0x180, 0);
            }
            composer1.endReplaceGroup();
            Set set0 = (Set)state1.getValue();
            boolean z1 = composer1.changed(state1);
            o4.c c0 = composer1.rememberedValue();
            if(z1 || (v1 & 14) == 4 || c0 == Composer.Companion.getEmpty()) {
                c0 = new o4.c(state1, dialogNavigator0, snapshotStateList1, null);
                composer1.updateRememberedValue(c0);
            }
            EffectsKt.LaunchedEffect(set0, snapshotStateList1, c0, composer1, 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gd(dialogNavigator0, v, 10));
        }
    }

    @Composable
    public static final void PopulateVisibleList(@NotNull List list0, @NotNull Collection collection0, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x5BAA69C3);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(list0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(collection0) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5BAA69C3, v1, -1, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:88)");
            }
            boolean z = ((Boolean)composer1.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
            for(Object object0: collection0) {
                NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)object0;
                Lifecycle lifecycle0 = navBackStackEntry0.getLifecycle();
                boolean z1 = composer1.changed(z);
                boolean z2 = composer1.changedInstance(list0);
                boolean z3 = composer1.changedInstance(navBackStackEntry0);
                e e0 = composer1.rememberedValue();
                if((z1 | z2 | z3) != 0 || e0 == Composer.Companion.getEmpty()) {
                    e0 = new e(navBackStackEntry0, list0, z);
                    composer1.updateRememberedValue(e0);
                }
                EffectsKt.DisposableEffect(lifecycle0, e0, composer1, 0);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(list0, collection0, v, 19));
        }
    }

    public static final Set access$DialogHost$lambda$1(State state0) {
        return (Set)state0.getValue();
    }

    @Composable
    @NotNull
    public static final SnapshotStateList rememberVisibleList(@NotNull Collection collection0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1BDBA1C5, v, -1, "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:119)");
        }
        boolean z = ((Boolean)composer0.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
        boolean z1 = composer0.changed(collection0);
        SnapshotStateList snapshotStateList0 = composer0.rememberedValue();
        if(z1 || snapshotStateList0 == Composer.Companion.getEmpty()) {
            snapshotStateList0 = SnapshotStateKt.mutableStateListOf();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: collection0) {
                if((z ? true : ((NavBackStackEntry)object0).getLifecycle().getCurrentState().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED))) {
                    arrayList0.add(object0);
                }
            }
            snapshotStateList0.addAll(arrayList0);
            composer0.updateRememberedValue(snapshotStateList0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return snapshotStateList0;
    }
}

