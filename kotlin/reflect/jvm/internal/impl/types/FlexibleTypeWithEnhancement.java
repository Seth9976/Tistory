package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

public final class FlexibleTypeWithEnhancement extends FlexibleType implements TypeWithEnhancement {
    public final FlexibleType d;
    public final KotlinType e;

    public FlexibleTypeWithEnhancement(@NotNull FlexibleType flexibleType0, @NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(flexibleType0, "origin");
        Intrinsics.checkNotNullParameter(kotlinType0, "enhancement");
        super(flexibleType0.getLowerBound(), flexibleType0.getUpperBound());
        this.d = flexibleType0;
        this.e = kotlinType0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public SimpleType getDelegate() {
        return this.getOrigin().getDelegate();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    @NotNull
    public KotlinType getEnhancement() {
        return this.e;
    }

    @NotNull
    public FlexibleType getOrigin() {
        return this.d;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public UnwrappedType getOrigin() {
        return this.getOrigin();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public UnwrappedType makeNullableAsSpecified(boolean z) {
        return TypeWithEnhancementKt.wrapEnhancement(this.getOrigin().makeNullableAsSpecified(z), this.getEnhancement().unwrap().makeNullableAsSpecified(z));
    }

    @NotNull
    public FlexibleTypeWithEnhancement refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        KotlinType kotlinType0 = kotlinTypeRefiner0.refineType(this.getOrigin());
        Intrinsics.checkNotNull(kotlinType0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new FlexibleTypeWithEnhancement(((FlexibleType)kotlinType0), kotlinTypeRefiner0.refineType(this.getEnhancement()));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public KotlinType refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        return this.refine(kotlinTypeRefiner0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public UnwrappedType refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        return this.refine(kotlinTypeRefiner0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public String render(@NotNull DescriptorRenderer descriptorRenderer0, @NotNull DescriptorRendererOptions descriptorRendererOptions0) {
        Intrinsics.checkNotNullParameter(descriptorRenderer0, "renderer");
        Intrinsics.checkNotNullParameter(descriptorRendererOptions0, "options");
        return descriptorRendererOptions0.getEnhancedTypes() ? descriptorRenderer0.renderType(this.getEnhancement()) : this.getOrigin().render(descriptorRenderer0, descriptorRendererOptions0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public UnwrappedType replaceAttributes(@NotNull TypeAttributes typeAttributes0) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "newAttributes");
        return TypeWithEnhancementKt.wrapEnhancement(this.getOrigin().replaceAttributes(typeAttributes0), this.getEnhancement());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public String toString() {
        return "[@EnhancedForWarnings(" + this.getEnhancement() + ")] " + this.getOrigin();
    }
}

