package h1;

import androidx.compose.runtime.saveable.SaveableStateHolderImpl.RegistryHolder;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.Map;
import kotlin.collections.x;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public final int w;
    public static final d x;
    public static final d y;

    static {
        d.x = new d(2, 0);
        d.y = new d(2, 1);
    }

    public d(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            SaverScope saverScope0 = (SaverScope)object0;
            return object1;
        }
        SaverScope saverScope1 = (SaverScope)object0;
        Map map0 = x.toMutableMap(((f)object1).a);
        for(Object object2: ((f)object1).b.values()) {
            ((SaveableStateHolderImpl.RegistryHolder)object2).saveTo(map0);
        }
        return map0.isEmpty() ? null : map0;
    }
}

