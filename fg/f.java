package fg;

import f0.c;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

public final class f extends Lambda implements Function2 {
    public final int w;
    public static final f x;
    public static final f y;

    static {
        f.x = new f(2, 0);
        f.y = new f(2, 1);
    }

    public f(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((KClass)object0), "clazz");
            Intrinsics.checkNotNullParameter(((List)object1), "types");
            List list0 = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), ((List)object1), true);
            Intrinsics.checkNotNull(list0);
            KSerializer kSerializer0 = SerializersKt.parametrizedSerializerOrNull(((KClass)object0), list0, new c(((List)object1), 2));
            if(kSerializer0 != null) {
                KSerializer kSerializer1 = BuiltinSerializersKt.getNullable(kSerializer0);
                if(kSerializer1 != null) {
                    return kSerializer1;
                }
            }
            return null;
        }
        Intrinsics.checkNotNullParameter(((KClass)object0), "clazz");
        Intrinsics.checkNotNullParameter(((List)object1), "types");
        List list1 = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), ((List)object1), true);
        Intrinsics.checkNotNull(list1);
        return SerializersKt.parametrizedSerializerOrNull(((KClass)object0), list1, new c(((List)object1), 1));
    }
}

