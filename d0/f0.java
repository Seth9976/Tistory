package d0;

import aa.o;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.Companion;
import androidx.compose.foundation.text.selection.a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry.Entry;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class f0 implements SaveableStateHolder, SaveableStateRegistry {
    public final SaveableStateRegistry a;
    public final MutableState b;
    public final LinkedHashSet c;
    public static final LazySaveableStateHolder.Companion d;

    static {
        f0.d = new LazySaveableStateHolder.Companion(null);
    }

    public f0(SaveableStateRegistry saveableStateRegistry0, Map map0) {
        SaveableStateRegistry saveableStateRegistry1 = SaveableStateRegistryKt.SaveableStateRegistry(map0, new d0(saveableStateRegistry0, 0));
        super();
        this.a = saveableStateRegistry1;
        this.b = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.c = new LinkedHashSet();
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void SaveableStateProvider(Object object0, Function2 function20, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xD671DF0F);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(object0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(this) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
        }
        else {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD671DF0F, v1, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
            }
            SaveableStateHolder saveableStateHolder0 = (SaveableStateHolder)this.b.getValue();
            if(saveableStateHolder0 == null) {
                throw new IllegalArgumentException("null wrappedHolder");
            }
            saveableStateHolder0.SaveableStateProvider(object0, function20, composer1, v1 & 0x7E);
            boolean z = composer1.changedInstance(this);
            boolean z1 = composer1.changedInstance(object0);
            o o0 = composer1.rememberedValue();
            if(z || z1 || o0 == Composer.Companion.getEmpty()) {
                o0 = new o(22, this, object0);
                composer1.updateRememberedValue(o0);
            }
            EffectsKt.DisposableEffect(object0, o0, composer1, v1 & 14);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(v, 3, this, object0, function20));
        }
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean canBeSaved(Object object0) {
        return this.a.canBeSaved(object0);
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Object consumeRestored(String s) {
        return this.a.consumeRestored(s);
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Map performSave() {
        SaveableStateHolder saveableStateHolder0 = (SaveableStateHolder)this.b.getValue();
        if(saveableStateHolder0 != null) {
            for(Object object0: this.c) {
                saveableStateHolder0.removeState(object0);
            }
        }
        return this.a.performSave();
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Entry registerProvider(String s, Function0 function00) {
        return this.a.registerProvider(s, function00);
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void removeState(Object object0) {
        SaveableStateHolder saveableStateHolder0 = (SaveableStateHolder)this.b.getValue();
        if(saveableStateHolder0 == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        saveableStateHolder0.removeState(object0);
    }
}

