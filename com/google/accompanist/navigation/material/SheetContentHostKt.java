package com.google.accompanist.navigation.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material3.ki;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.NavBackStackEntryProviderKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n6.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001Aq\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2!\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\n2!\u0010\u000E\u001A\u001D\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u000F¨\u0006\u0010²\u0006%\u0010\u0011\u001A\u001D\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\nX\u008A\u0084\u0002²\u0006%\u0010\u0012\u001A\u001D\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\nX\u008A\u0084\u0002"}, d2 = {"SheetContentHost", "", "Landroidx/compose/foundation/layout/ColumnScope;", "backStackEntry", "Landroidx/navigation/NavBackStackEntry;", "sheetState", "Landroidx/compose/material/ModalBottomSheetState;", "saveableStateHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "onSheetShown", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "entry", "onSheetDismissed", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "navigation-material_release", "currentOnSheetShown", "currentOnSheetDismissed"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSheetContentHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetContentHost.kt\ncom/google/accompanist/navigation/material/SheetContentHostKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,79:1\n81#2:80\n81#2:81\n*S KotlinDebug\n*F\n+ 1 SheetContentHost.kt\ncom/google/accompanist/navigation/material/SheetContentHostKt\n*L\n56#1:80\n57#1:81\n*E\n"})
public final class SheetContentHostKt {
    @Composable
    @ExperimentalMaterialNavigationApi
    public static final void SheetContentHost(@NotNull ColumnScope columnScope0, @Nullable NavBackStackEntry navBackStackEntry0, @NotNull ModalBottomSheetState modalBottomSheetState0, @NotNull SaveableStateHolder saveableStateHolder0, @NotNull Function1 function10, @NotNull Function1 function11, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(columnScope0, "<this>");
        Intrinsics.checkNotNullParameter(modalBottomSheetState0, "sheetState");
        Intrinsics.checkNotNullParameter(saveableStateHolder0, "saveableStateHolder");
        Intrinsics.checkNotNullParameter(function10, "onSheetShown");
        Intrinsics.checkNotNullParameter(function11, "onSheetDismissed");
        Composer composer1 = composer0.startRestartGroup(-1740714725);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1740714725, v, -1, "com.google.accompanist.navigation.material.SheetContentHost (SheetContentHost.kt:53)");
        }
        if(navBackStackEntry0 != null) {
            EffectsKt.LaunchedEffect(modalBottomSheetState0, navBackStackEntry0, new g(modalBottomSheetState0, navBackStackEntry0, SnapshotStateKt.rememberUpdatedState(function10, composer1, v >> 12 & 14), SnapshotStateKt.rememberUpdatedState(function11, composer1, v >> 15 & 14), null), composer1, ModalBottomSheetState.$stable | 0x240 | v >> 6 & 14);
            NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry0, saveableStateHolder0, ComposableLambdaKt.composableLambda(composer1, -1540712730, true, new a(navBackStackEntry0, columnScope0)), composer1, 456);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ki(columnScope0, navBackStackEntry0, modalBottomSheetState0, saveableStateHolder0, function10, function11, v, 4));
        }
    }

    public static final Function1 access$SheetContentHost$lambda$0(State state0) {
        return (Function1)state0.getValue();
    }

    public static final Function1 access$SheetContentHost$lambda$1(State state0) {
        return (Function1)state0.getValue();
    }
}

