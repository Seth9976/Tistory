package fe;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public final class o extends Lambda implements Function0 {
    public final int w;
    public final KTypeImpl x;

    public o(KTypeImpl kTypeImpl0, int v) {
        this.w = v;
        this.x = kTypeImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            KotlinType kotlinType0 = this.x.getType();
            return KTypeImpl.access$convert(this.x, kotlinType0);
        }
        Type type0 = this.x.getJavaType();
        Intrinsics.checkNotNull(type0);
        return ReflectClassUtilKt.getParameterizedTypeArguments(type0);
    }
}

