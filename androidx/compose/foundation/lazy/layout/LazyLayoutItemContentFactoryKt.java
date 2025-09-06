package androidx.compose.foundation.lazy.layout;

import aa.d;
import androidx.compose.material3.sf;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LazyLayoutItemContentFactoryKt {
    public static final void access$SkippableItem-JVlU9Rs(LazyLayoutItemProvider lazyLayoutItemProvider0, Object object0, int v, Object object1, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x55D242FD);
        int v2 = (v1 & 6) == 0 ? (composer1.changed(lazyLayoutItemProvider0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer1.changed(object0) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (composer1.changed(object1) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x55D242FD, v2, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:132)");
            }
            ((SaveableStateHolder)object0).SaveableStateProvider(object1, ComposableLambdaKt.rememberComposableLambda(980966366, true, new d(lazyLayoutItemProvider0, v, object1, 8), composer1, 54), composer1, 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sf(lazyLayoutItemProvider0, object0, v, object1, v1));
        }
    }
}

