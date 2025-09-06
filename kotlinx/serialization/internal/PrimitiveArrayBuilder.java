package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007\b\u0000¢\u0006\u0002\u0010\u0003J\u000F\u0010\b\u001A\u00028\u0000H ¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000B\u001A\u00020\f2\b\b\u0002\u0010\r\u001A\u00020\u0005H ¢\u0006\u0002\b\u000ER\u0012\u0010\u0004\u001A\u00020\u0005X \u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007¨\u0006\u000F"}, d2 = {"Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Array", "", "()V", "position", "", "getPosition$kotlinx_serialization_core", "()I", "build", "build$kotlinx_serialization_core", "()Ljava/lang/Object;", "ensureCapacity", "", "requiredCapacity", "ensureCapacity$kotlinx_serialization_core", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
public abstract class PrimitiveArrayBuilder {
    public abstract Object build$kotlinx_serialization_core();

    public abstract void ensureCapacity$kotlinx_serialization_core(int arg1);

    public static void ensureCapacity$kotlinx_serialization_core$default(PrimitiveArrayBuilder primitiveArrayBuilder0, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if((v1 & 1) != 0) {
            v = primitiveArrayBuilder0.getPosition$kotlinx_serialization_core() + 1;
        }
        primitiveArrayBuilder0.ensureCapacity$kotlinx_serialization_core(v);
    }

    public abstract int getPosition$kotlinx_serialization_core();
}

