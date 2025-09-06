package androidx.compose.runtime.saveable;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/runtime/saveable/SaveableStateRegistryImpl$registerProvider$3", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "", "unregister", "()V", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SaveableStateRegistryImpl.registerProvider.3 implements Entry {
    public final b a;
    public final String b;
    public final Function0 c;

    public SaveableStateRegistryImpl.registerProvider.3(b b0, String s, Function0 function00) {
        this.a = b0;
        this.b = s;
        this.c = function00;
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry$Entry
    public void unregister() {
        b b0 = this.a;
        String s = this.b;
        List list0 = (List)b0.c.remove(s);
        if(list0 != null) {
            list0.remove(this.c);
        }
        if(list0 != null && !list0.isEmpty()) {
            b0.c.put(s, list0);
        }
    }
}

