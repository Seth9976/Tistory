package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class StarProjectionImplKt.buildStarProjectionTypeByTypeParameters.1 extends TypeConstructorSubstitution {
    public final ArrayList a;

    public StarProjectionImplKt.buildStarProjectionTypeByTypeParameters.1(ArrayList arrayList0) {
        this.a = arrayList0;
        super();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
    @Nullable
    public TypeProjection get(@NotNull TypeConstructor typeConstructor0) {
        Intrinsics.checkNotNullParameter(typeConstructor0, "key");
        if(this.a.contains(typeConstructor0)) {
            ClassifierDescriptor classifierDescriptor0 = typeConstructor0.getDeclarationDescriptor();
            Intrinsics.checkNotNull(classifierDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return TypeUtils.makeStarProjection(((TypeParameterDescriptor)classifierDescriptor0));
        }
        return null;
    }
}

