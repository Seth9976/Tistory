package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text.selection.b0;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import d0.s;
import d0.x;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AL\u0010\r\u001A\u00020\f2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\u001D\u0010\u000B\u001A\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\r\u0010\u000E\u001AR\u0010\r\u001A\u00020\f2\f\u0010\u0001\u001A\b\u0012\u0004\u0012\u00020\u00000\u000F2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\u001D\u0010\u000B\u001A\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\r\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "measurePolicy", "", "LazyLayout", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,158:1\n1223#2,6:159\n*S KotlinDebug\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt\n*L\n55#1:159,6\n*E\n"})
public final class LazyLayoutKt {
    @ExperimentalFoundationApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    @Deprecated(message = "Use an overload accepting a lambda prodicing an item provider instead", replaceWith = @ReplaceWith(expression = "LazyLayout({ itemProvider }, modifier, prefetchState, measurePolicy)", imports = {}))
    public static final void LazyLayout(@NotNull LazyLayoutItemProvider lazyLayoutItemProvider0, @Nullable Modifier modifier0, @Nullable LazyLayoutPrefetchState lazyLayoutPrefetchState0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x32D52BD3);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(lazyLayoutItemProvider0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(lazyLayoutPrefetchState0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                modifier0 = Modifier.Companion;
            }
            if((v1 & 4) != 0) {
                lazyLayoutPrefetchState0 = null;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x32D52BD3, v2, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:53)");
            }
            s s0 = composer1.rememberedValue();
            if((v2 & 14) == 4 || s0 == Composer.Companion.getEmpty()) {
                s0 = new s(lazyLayoutItemProvider0, 1);
                composer1.updateRememberedValue(s0);
            }
            LazyLayoutKt.LazyLayout(s0, modifier0, lazyLayoutPrefetchState0, function20, composer1, v2 & 0x1FF0, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(lazyLayoutItemProvider0, modifier0, lazyLayoutPrefetchState0, function20, v, v1, 4));
        }
    }

    @ExperimentalFoundationApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable:[androidx.compose.ui.UiComposable]]]")
    public static final void LazyLayout(@NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable LazyLayoutPrefetchState lazyLayoutPrefetchState0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        LazyLayoutPrefetchState lazyLayoutPrefetchState1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(2002163445);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(lazyLayoutPrefetchState0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            LazyLayoutPrefetchState lazyLayoutPrefetchState2 = (v1 & 4) == 0 ? lazyLayoutPrefetchState0 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2002163445, v2, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:78)");
            }
            LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.rememberComposableLambda(0xA73FB41D, true, new x(0, lazyLayoutPrefetchState2, modifier1, function20, SnapshotStateKt.rememberUpdatedState(function00, composer1, v2 & 14)), composer1, 54), composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            lazyLayoutPrefetchState1 = lazyLayoutPrefetchState2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            lazyLayoutPrefetchState1 = lazyLayoutPrefetchState0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(function00, modifier1, lazyLayoutPrefetchState1, function20, v, v1, 5));
        }
    }
}

