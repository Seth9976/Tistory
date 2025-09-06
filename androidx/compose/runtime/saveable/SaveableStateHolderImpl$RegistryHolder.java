package androidx.compose.runtime.saveable;

import fg.c;
import h1.f;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J5\u0010\u000B\u001A\u00020\n2&\u0010\t\u001A\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00060\u0005¢\u0006\u0004\b\u000B\u0010\fR\u0017\u0010\u0002\u001A\u00020\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\"\u0010\u0018\u001A\u00020\u00118\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001E\u001A\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D¨\u0006\u001F"}, d2 = {"androidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder", "", "key", "<init>", "(Lh1/f;Ljava/lang/Object;)V", "", "", "", "", "map", "", "saveTo", "(Ljava/util/Map;)V", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "", "b", "Z", "getShouldSave", "()Z", "setShouldSave", "(Z)V", "shouldSave", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "c", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getRegistry", "()Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "registry", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SaveableStateHolderImpl.RegistryHolder {
    public final Object a;
    public boolean b;
    public final SaveableStateRegistry c;

    public SaveableStateHolderImpl.RegistryHolder(@NotNull f f0, Object object0) {
        this.a = object0;
        this.b = true;
        this.c = SaveableStateRegistryKt.SaveableStateRegistry(((Map)f0.a.get(object0)), new c(f0, 3));
    }

    @NotNull
    public final Object getKey() {
        return this.a;
    }

    @NotNull
    public final SaveableStateRegistry getRegistry() {
        return this.c;
    }

    public final boolean getShouldSave() {
        return this.b;
    }

    public final void saveTo(@NotNull Map map0) {
        if(this.b) {
            Map map1 = this.c.performSave();
            Object object0 = this.a;
            if(map1.isEmpty()) {
                map0.remove(object0);
                return;
            }
            map0.put(object0, map1);
        }
    }

    public final void setShouldSave(boolean z) {
        this.b = z;
    }
}

