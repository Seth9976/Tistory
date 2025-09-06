package ne;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;

public final class i extends Lambda implements Function1 {
    public static final i w;

    static {
        i.w = new i(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        String s = ((Class)object0).getSimpleName();
        if(!Name.isValidIdentifier(s)) {
            s = null;
        }
        return s == null ? null : Name.identifier(s);
    }
}

