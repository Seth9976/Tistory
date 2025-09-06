package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

public final class NotNullTypeParameterImpl extends DelegatingSimpleType implements NotNullTypeParameter {
    public final SimpleType b;

    public NotNullTypeParameterImpl(@NotNull SimpleType simpleType0) {
        Intrinsics.checkNotNullParameter(simpleType0, "delegate");
        super();
        this.b = simpleType0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public SimpleType getDelegate() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public boolean isMarkedNullable() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public boolean isTypeParameter() {
        return true;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z) {
        return z ? this.getDelegate().makeNullableAsSpecified(true) : this;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public UnwrappedType makeNullableAsSpecified(boolean z) {
        return this.makeNullableAsSpecified(z);
    }

    @NotNull
    public NotNullTypeParameterImpl replaceAttributes(@NotNull TypeAttributes typeAttributes0) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "newAttributes");
        return new NotNullTypeParameterImpl(this.getDelegate().replaceAttributes(typeAttributes0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public SimpleType replaceAttributes(TypeAttributes typeAttributes0) {
        return this.replaceAttributes(typeAttributes0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public UnwrappedType replaceAttributes(TypeAttributes typeAttributes0) {
        return this.replaceAttributes(typeAttributes0);
    }

    @NotNull
    public NotNullTypeParameterImpl replaceDelegate(@NotNull SimpleType simpleType0) {
        Intrinsics.checkNotNullParameter(simpleType0, "delegate");
        return new NotNullTypeParameterImpl(simpleType0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public DelegatingSimpleType replaceDelegate(SimpleType simpleType0) {
        return this.replaceDelegate(simpleType0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    @NotNull
    public KotlinType substitutionResult(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "replacement");
        KotlinType kotlinType1 = kotlinType0.unwrap();
        if(!TypeUtilsKt.isTypeParameter(kotlinType1) && !TypeUtils.isNullableType(kotlinType1)) {
            return kotlinType1;
        }
        if(kotlinType1 instanceof SimpleType) {
            KotlinType kotlinType2 = ((SimpleType)kotlinType1).makeNullableAsSpecified(false);
            return TypeUtilsKt.isTypeParameter(((SimpleType)kotlinType1)) ? new NotNullTypeParameterImpl(((SimpleType)kotlinType2)) : kotlinType2;
        }
        if(!(kotlinType1 instanceof FlexibleType)) {
            throw new IllegalStateException(("Incorrect type: " + kotlinType1).toString());
        }
        SimpleType simpleType0 = ((FlexibleType)kotlinType1).getLowerBound();
        SimpleType simpleType1 = simpleType0.makeNullableAsSpecified(false);
        if(TypeUtilsKt.isTypeParameter(simpleType0)) {
            simpleType1 = new NotNullTypeParameterImpl(simpleType1);
        }
        SimpleType simpleType2 = ((FlexibleType)kotlinType1).getUpperBound();
        SimpleType simpleType3 = simpleType2.makeNullableAsSpecified(false);
        if(TypeUtilsKt.isTypeParameter(simpleType2)) {
            simpleType3 = new NotNullTypeParameterImpl(simpleType3);
        }
        return TypeWithEnhancementKt.wrapEnhancement(KotlinTypeFactory.flexibleType(simpleType1, simpleType3), TypeWithEnhancementKt.getEnhancement(kotlinType1));
    }
}

