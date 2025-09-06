package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

public final class SimpleTypeWithEnhancement extends DelegatingSimpleType implements TypeWithEnhancement {
    public final SimpleType b;
    public final KotlinType c;

    public SimpleTypeWithEnhancement(@NotNull SimpleType simpleType0, @NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(simpleType0, "delegate");
        Intrinsics.checkNotNullParameter(kotlinType0, "enhancement");
        super();
        this.b = simpleType0;
        this.c = kotlinType0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public SimpleType getDelegate() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    @NotNull
    public KotlinType getEnhancement() {
        return this.c;
    }

    @NotNull
    public SimpleType getOrigin() {
        return this.getDelegate();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public UnwrappedType getOrigin() {
        return this.getOrigin();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z) {
        UnwrappedType unwrappedType0 = TypeWithEnhancementKt.wrapEnhancement(this.getOrigin().makeNullableAsSpecified(z), this.getEnhancement().unwrap().makeNullableAsSpecified(z));
        Intrinsics.checkNotNull(unwrappedType0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (SimpleType)unwrappedType0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public UnwrappedType makeNullableAsSpecified(boolean z) {
        return this.makeNullableAsSpecified(z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public KotlinType refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        return this.refine(kotlinTypeRefiner0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public SimpleType refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        return this.refine(kotlinTypeRefiner0);
    }

    @NotNull
    public SimpleTypeWithEnhancement refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        KotlinType kotlinType0 = kotlinTypeRefiner0.refineType(this.getDelegate());
        Intrinsics.checkNotNull(kotlinType0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new SimpleTypeWithEnhancement(((SimpleType)kotlinType0), kotlinTypeRefiner0.refineType(this.getEnhancement()));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public UnwrappedType refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        return this.refine(kotlinTypeRefiner0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes typeAttributes0) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "newAttributes");
        UnwrappedType unwrappedType0 = TypeWithEnhancementKt.wrapEnhancement(this.getOrigin().replaceAttributes(typeAttributes0), this.getEnhancement());
        Intrinsics.checkNotNull(unwrappedType0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (SimpleType)unwrappedType0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public UnwrappedType replaceAttributes(TypeAttributes typeAttributes0) {
        return this.replaceAttributes(typeAttributes0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public DelegatingSimpleType replaceDelegate(SimpleType simpleType0) {
        return this.replaceDelegate(simpleType0);
    }

    @NotNull
    public SimpleTypeWithEnhancement replaceDelegate(@NotNull SimpleType simpleType0) {
        Intrinsics.checkNotNullParameter(simpleType0, "delegate");
        return new SimpleTypeWithEnhancement(simpleType0, this.getEnhancement());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        return "[@EnhancedForWarnings(" + this.getEnhancement() + ")] " + this.getOrigin();
    }
}

