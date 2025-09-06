package if;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public final class b {
    public final TypeParameterDescriptor a;
    public final KotlinType b;
    public final KotlinType c;

    public b(TypeParameterDescriptor typeParameterDescriptor0, KotlinType kotlinType0, KotlinType kotlinType1) {
        Intrinsics.checkNotNullParameter(typeParameterDescriptor0, "typeParameter");
        Intrinsics.checkNotNullParameter(kotlinType0, "inProjection");
        Intrinsics.checkNotNullParameter(kotlinType1, "outProjection");
        super();
        this.a = typeParameterDescriptor0;
        this.b = kotlinType0;
        this.c = kotlinType1;
    }
}

