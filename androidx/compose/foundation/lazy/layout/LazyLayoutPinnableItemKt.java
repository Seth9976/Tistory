package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text.selection.g1;
import androidx.compose.material3.sf;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.snapshots.Snapshot.Companion;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.PinnableContainer.PinnedHandle;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A:\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0011\u0010\b\u001A\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000B¨\u0006\f"}, d2 = {"LazyLayoutPinnableItem", "", "key", "", "index", "", "pinnedItemList", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;ILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,174:1\n1223#2,6:175\n1223#2,6:182\n77#3:181\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n*L\n54#1:175,6\n57#1:182,6\n56#1:181\n*E\n"})
public final class LazyLayoutPinnableItemKt {
    @ExperimentalFoundationApi
    @Composable
    public static final void LazyLayoutPinnableItem(@Nullable Object object0, int v, @NotNull LazyLayoutPinnedItemList lazyLayoutPinnedItemList0, @NotNull Function2 function20, @Nullable Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(-2079116560);
        int v2 = (v1 & 6) == 0 ? (composer1.changedInstance(object0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (composer1.changedInstance(lazyLayoutPinnedItemList0) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2079116560, v2, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:52)");
            }
            boolean z = composer1.changed(object0);
            boolean z1 = composer1.changed(lazyLayoutPinnedItemList0);
            c c0 = composer1.rememberedValue();
            if(z || z1 || c0 == Composer.Companion.getEmpty()) {
                c0 = new c(object0, lazyLayoutPinnedItemList0);
                composer1.updateRememberedValue(c0);
            }
            MutableState mutableState0 = c0.e;
            MutableState mutableState1 = c0.f;
            c0.c.setIntValue(v);
            PinnableContainer pinnableContainer0 = (PinnableContainer)composer1.consume(PinnableContainerKt.getLocalPinnableContainer());
            Companion snapshot$Companion0 = Snapshot.Companion;
            Snapshot snapshot0 = snapshot$Companion0.getCurrentThreadSnapshot();
            Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
            Snapshot snapshot1 = snapshot$Companion0.makeCurrentNonObservable(snapshot0);
            try {
                if(pinnableContainer0 != ((PinnableContainer)mutableState1.getValue())) {
                    mutableState1.setValue(pinnableContainer0);
                    if(c0.d.getIntValue() > 0) {
                        PinnedHandle pinnableContainer$PinnedHandle0 = (PinnedHandle)mutableState0.getValue();
                        if(pinnableContainer$PinnedHandle0 != null) {
                            pinnableContainer$PinnedHandle0.release();
                        }
                        mutableState0.setValue((pinnableContainer0 == null ? null : pinnableContainer0.pin()));
                    }
                }
            }
            finally {
                snapshot$Companion0.restoreNonObservable(snapshot0, snapshot1, function10);
            }
            boolean z2 = composer1.changed(c0);
            g1 g10 = composer1.rememberedValue();
            if(z2 || g10 == Composer.Companion.getEmpty()) {
                g10 = new g1(c0, 19);
                composer1.updateRememberedValue(g10);
            }
            EffectsKt.DisposableEffect(c0, g10, composer1, 0);
            CompositionLocalKt.CompositionLocalProvider(PinnableContainerKt.getLocalPinnableContainer().provides(c0), function20, composer1, v2 >> 6 & 0x70 | ProvidedValue.$stable);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sf(object0, v, lazyLayoutPinnedItemList0, function20, v1));
        }
    }
}

