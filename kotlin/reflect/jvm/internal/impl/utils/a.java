package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.functions.Function1;

public final class a extends AbstractNodeHandler {
    public final Function1 a;
    public final boolean[] b;

    public a(boolean[] arr_z, Function1 function10) {
        this.a = function10;
        this.b = arr_z;
        super();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.utils.DFS$AbstractNodeHandler
    public final boolean beforeChildren(Object object0) {
        boolean z = ((Boolean)this.a.invoke(object0)).booleanValue();
        boolean[] arr_z = this.b;
        if(z) {
            arr_z[0] = true;
        }
        return !arr_z[0];
    }

    @Override  // kotlin.reflect.jvm.internal.impl.utils.DFS$NodeHandler
    public final Object result() {
        return Boolean.valueOf(this.b[0]);
    }
}

