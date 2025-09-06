package ff;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;

public final class j {
    public final TypeParameterDescriptor a;
    public final ErasureTypeAttributes b;

    public j(TypeParameterDescriptor typeParameterDescriptor0, ErasureTypeAttributes erasureTypeAttributes0) {
        Intrinsics.checkNotNullParameter(typeParameterDescriptor0, "typeParameter");
        Intrinsics.checkNotNullParameter(erasureTypeAttributes0, "typeAttr");
        super();
        this.a = typeParameterDescriptor0;
        this.b = erasureTypeAttributes0;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof j ? Intrinsics.areEqual(((j)object0).a, this.a) && Intrinsics.areEqual(((j)object0).b, this.b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b.hashCode() + v * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.a + ", typeAttr=" + this.b + ')';
    }
}

