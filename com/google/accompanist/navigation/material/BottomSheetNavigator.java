package com.google.accompanist.navigation.material;

import android.annotation.SuppressLint;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material3.e0;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination.ClassType;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator.Extras;
import androidx.navigation.Navigator.Name;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Name("BottomSheetNavigator")
@ExperimentalMaterialNavigationApi
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0015\u001A\u00020\t2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E2\b\u0010\u0012\u001A\u0004\u0018\u00010\u00112\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001F\u0010\u001A\u001A\u00020\t2\u0006\u0010\u0017\u001A\u00020\u000F2\u0006\u0010\u0019\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u001A\u0010\u001BR\u001A\u0010\u0004\u001A\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u0017\u0010%\u001A\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R-\u0010.\u001A\u0018\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\t0&¢\u0006\u0002\b(¢\u0006\u0002\b)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R \u00103\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F000/8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b1\u00102¨\u00067²\u0006\u0012\u00105\u001A\b\u0012\u0004\u0012\u00020\u000F008\nX\u008A\u0084\u0002²\u0006\u000E\u00106\u001A\u0004\u0018\u00010\u000F8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "Landroidx/navigation/Navigator;", "Lcom/google/accompanist/navigation/material/BottomSheetNavigator$Destination;", "Landroidx/compose/material/ModalBottomSheetState;", "sheetState", "<init>", "(Landroidx/compose/material/ModalBottomSheetState;)V", "Landroidx/navigation/NavigatorState;", "state", "", "onAttach", "(Landroidx/navigation/NavigatorState;)V", "createDestination", "()Lcom/google/accompanist/navigation/material/BottomSheetNavigator$Destination;", "", "Landroidx/navigation/NavBackStackEntry;", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "navigate", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "popUpTo", "", "savedState", "popBackStack", "(Landroidx/navigation/NavBackStackEntry;Z)V", "c", "Landroidx/compose/material/ModalBottomSheetState;", "getSheetState$navigation_material_release", "()Landroidx/compose/material/ModalBottomSheetState;", "Lcom/google/accompanist/navigation/material/BottomSheetNavigatorSheetState;", "e", "Lcom/google/accompanist/navigation/material/BottomSheetNavigatorSheetState;", "getNavigatorSheetState", "()Lcom/google/accompanist/navigation/material/BottomSheetNavigatorSheetState;", "navigatorSheetState", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "f", "Lkotlin/jvm/functions/Function3;", "getSheetContent", "()Lkotlin/jvm/functions/Function3;", "sheetContent", "Lkotlinx/coroutines/flow/StateFlow;", "", "getTransitionsInProgress$navigation_material_release", "()Lkotlinx/coroutines/flow/StateFlow;", "transitionsInProgress", "Destination", "transitionsInProgressEntries", "retainedEntry", "navigation-material_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBottomSheetNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetNavigator.kt\ncom/google/accompanist/navigation/material/BottomSheetNavigator\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n81#2:254\n107#2,2:255\n1855#3,2:257\n*S KotlinDebug\n*F\n+ 1 BottomSheetNavigator.kt\ncom/google/accompanist/navigation/material/BottomSheetNavigator\n*L\n120#1:254\n120#1:255,2\n235#1:257,2\n*E\n"})
public final class BottomSheetNavigator extends Navigator {
    @StabilityInferred(parameters = 1)
    @ClassType(Composable.class)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\"\u0010\u000B\u001A\u001E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rR6\u0010\u000B\u001A\u001E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0002\b\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/google/accompanist/navigation/material/BottomSheetNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/FloatingWindow;", "Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "navigator", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/navigation/NavBackStackEntry;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "<init>", "(Lcom/google/accompanist/navigation/material/BottomSheetNavigator;Lkotlin/jvm/functions/Function4;)V", "k", "Lkotlin/jvm/functions/Function4;", "getContent$navigation_material_release", "()Lkotlin/jvm/functions/Function4;", "navigation-material_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Destination extends NavDestination implements FloatingWindow {
        public static final int $stable;
        public final Function4 k;

        public Destination(@NotNull BottomSheetNavigator bottomSheetNavigator0, @NotNull Function4 function40) {
            Intrinsics.checkNotNullParameter(bottomSheetNavigator0, "navigator");
            Intrinsics.checkNotNullParameter(function40, "content");
            super(bottomSheetNavigator0);
            this.k = function40;
        }

        @NotNull
        public final Function4 getContent$navigation_material_release() {
            return this.k;
        }
    }

    public static final int $stable;
    public final ModalBottomSheetState c;
    public final MutableState d;
    public final BottomSheetNavigatorSheetState e;
    public final ComposableLambda f;

    static {
        BottomSheetNavigator.$stable = ModalBottomSheetState.$stable;
    }

    public BottomSheetNavigator(@NotNull ModalBottomSheetState modalBottomSheetState0) {
        Intrinsics.checkNotNullParameter(modalBottomSheetState0, "sheetState");
        super();
        this.c = modalBottomSheetState0;
        this.d = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.e = new BottomSheetNavigatorSheetState(modalBottomSheetState0);
        this.f = ComposableLambdaKt.composableLambdaInstance(2102030527, true, new e0(this, 8));
    }

    public static final StateFlow access$getBackStack(BottomSheetNavigator bottomSheetNavigator0) {
        return ((Boolean)bottomSheetNavigator0.d.getValue()).booleanValue() ? bottomSheetNavigator0.getState().getBackStack() : StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
    }

    @Override  // androidx.navigation.Navigator
    public NavDestination createDestination() {
        return this.createDestination();
    }

    @NotNull
    public Destination createDestination() {
        return new Destination(this, ComposableSingletons.BottomSheetNavigatorKt.INSTANCE.getLambda-1$navigation_material_release());
    }

    @NotNull
    public final BottomSheetNavigatorSheetState getNavigatorSheetState() {
        return this.e;
    }

    @NotNull
    public final Function3 getSheetContent() {
        return this.f;
    }

    @NotNull
    public final ModalBottomSheetState getSheetState$navigation_material_release() {
        return this.c;
    }

    @NotNull
    public final StateFlow getTransitionsInProgress$navigation_material_release() {
        return ((Boolean)this.d.getValue()).booleanValue() ? this.getState().getTransitionsInProgress() : StateFlowKt.MutableStateFlow(f0.emptySet());
    }

    @Override  // androidx.navigation.Navigator
    @SuppressLint({"NewApi"})
    public void navigate(@NotNull List list0, @Nullable NavOptions navOptions0, @Nullable Extras navigator$Extras0) {
        Intrinsics.checkNotNullParameter(list0, "entries");
        for(Object object0: list0) {
            this.getState().pushWithTransition(((NavBackStackEntry)object0));
        }
    }

    @Override  // androidx.navigation.Navigator
    public void onAttach(@NotNull NavigatorState navigatorState0) {
        Intrinsics.checkNotNullParameter(navigatorState0, "state");
        super.onAttach(navigatorState0);
        this.d.setValue(Boolean.TRUE);
    }

    @Override  // androidx.navigation.Navigator
    public void popBackStack(@NotNull NavBackStackEntry navBackStackEntry0, boolean z) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "popUpTo");
        this.getState().popWithTransition(navBackStackEntry0, z);
    }
}

