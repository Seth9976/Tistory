package fg;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;

public final class g extends Lambda implements Function1 {
    public final int w;
    public static final g x;
    public static final g y;

    static {
        g.x = new g(1, 0);
        g.y = new g(1, 1);
    }

    public g(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((KClass)object0), "it");
            KSerializer kSerializer0 = SerializersKt.serializerOrNull(((KClass)object0));
            if(kSerializer0 != null) {
                KSerializer kSerializer1 = BuiltinSerializersKt.getNullable(kSerializer0);
                if(kSerializer1 != null) {
                    return kSerializer1;
                }
            }
            return null;
        }
        Intrinsics.checkNotNullParameter(((KClass)object0), "it");
        return SerializersKt.serializerOrNull(((KClass)object0));
    }
}

