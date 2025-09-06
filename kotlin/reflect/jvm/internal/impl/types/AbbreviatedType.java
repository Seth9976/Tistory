package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

public final class AbbreviatedType extends DelegatingSimpleType {
    public final SimpleType b;
    public final SimpleType c;

    public AbbreviatedType(@NotNull SimpleType simpleType0, @NotNull SimpleType simpleType1) {
        Intrinsics.checkNotNullParameter(simpleType0, "delegate");
        Intrinsics.checkNotNullParameter(simpleType1, "abbreviation");
        super();
        this.b = simpleType0;
        this.c = simpleType1;
    }

    @NotNull
    public final SimpleType getAbbreviation() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public SimpleType getDelegate() {
        return this.b;
    }

    @NotNull
    public final SimpleType getExpandedType() {
        return this.getDelegate();
    }

    @NotNull
    public AbbreviatedType makeNullableAsSpecified(boolean z) {
        return new AbbreviatedType(this.getDelegate().makeNullableAsSpecified(z), this.c.makeNullableAsSpecified(z));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public SimpleType makeNullableAsSpecified(boolean z) {
        return this.makeNullableAsSpecified(z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public UnwrappedType makeNullableAsSpecified(boolean z) {
        return this.makeNullableAsSpecified(z);
    }

    @NotNull
    public AbbreviatedType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        KotlinType kotlinType0 = kotlinTypeRefiner0.refineType(this.getDelegate());
        Intrinsics.checkNotNull(kotlinType0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType kotlinType1 = kotlinTypeRefiner0.refineType(this.c);
        Intrinsics.checkNotNull(kotlinType1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new AbbreviatedType(((SimpleType)kotlinType0), ((SimpleType)kotlinType1));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public KotlinType refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        return this.refine(kotlinTypeRefiner0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public SimpleType refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        return this.refine(kotlinTypeRefiner0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public UnwrappedType refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        return this.refine(kotlinTypeRefiner0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes typeAttributes0) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "newAttributes");
        return new AbbreviatedType(this.getDelegate().replaceAttributes(typeAttributes0), this.c);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public UnwrappedType replaceAttributes(TypeAttributes typeAttributes0) {
        return this.replaceAttributes(typeAttributes0);
    }

    @NotNull
    public AbbreviatedType replaceDelegate(@NotNull SimpleType simpleType0) {
        Intrinsics.checkNotNullParameter(simpleType0, "delegate");
        return new AbbreviatedType(simpleType0, this.c);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public DelegatingSimpleType replaceDelegate(SimpleType simpleType0) {
        return this.replaceDelegate(simpleType0);
    }
}

