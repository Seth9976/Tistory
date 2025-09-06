package h1;

import aa.r;
import androidx.compose.foundation.text.selection.a;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl.Companion;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl.RegistryHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class f implements SaveableStateHolder {
    public final Map a;
    public final LinkedHashMap b;
    public SaveableStateRegistry c;
    public static final SaveableStateHolderImpl.Companion d;
    public static final Saver e;

    static {
        f.d = new SaveableStateHolderImpl.Companion(null);
        f.e = SaverKt.Saver(d.x, e.x);
    }

    public f(Map map0) {
        this.a = map0;
        this.b = new LinkedHashMap();
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void SaveableStateProvider(Object object0, Function2 function20, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xB88FC293);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(object0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(this) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB88FC293, v1, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:75)");
            }
            composer1.startReusableGroup(0xCF, object0);
            SaveableStateHolderImpl.RegistryHolder saveableStateHolderImpl$RegistryHolder0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(saveableStateHolderImpl$RegistryHolder0 == composer$Companion0.getEmpty()) {
                if(!(this.c == null ? true : this.c.canBeSaved(object0))) {
                    throw new IllegalArgumentException(("Type of the key " + object0 + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                saveableStateHolderImpl$RegistryHolder0 = new SaveableStateHolderImpl.RegistryHolder(this, object0);
                composer1.updateRememberedValue(saveableStateHolderImpl$RegistryHolder0);
            }
            CompositionLocalKt.CompositionLocalProvider(SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(saveableStateHolderImpl$RegistryHolder0.getRegistry()), function20, composer1, v1 & 0x70 | ProvidedValue.$stable);
            Unit unit0 = Unit.INSTANCE;
            boolean z = composer1.changedInstance(this);
            boolean z1 = composer1.changedInstance(object0);
            boolean z2 = composer1.changedInstance(saveableStateHolderImpl$RegistryHolder0);
            r r0 = composer1.rememberedValue();
            if((z | z1 | z2) != 0 || r0 == composer$Companion0.getEmpty()) {
                r0 = new r(this, object0, 9, saveableStateHolderImpl$RegistryHolder0);
                composer1.updateRememberedValue(r0);
            }
            EffectsKt.DisposableEffect(unit0, r0, composer1, 6);
            composer1.endReusableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(v, 6, this, object0, function20));
        }
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void removeState(Object object0) {
        SaveableStateHolderImpl.RegistryHolder saveableStateHolderImpl$RegistryHolder0 = (SaveableStateHolderImpl.RegistryHolder)this.b.get(object0);
        if(saveableStateHolderImpl$RegistryHolder0 != null) {
            saveableStateHolderImpl$RegistryHolder0.setShouldSave(false);
            return;
        }
        this.a.remove(object0);
    }
}

