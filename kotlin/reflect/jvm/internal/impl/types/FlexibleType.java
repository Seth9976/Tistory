package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import org.jetbrains.annotations.NotNull;

public abstract class FlexibleType extends UnwrappedType implements FlexibleTypeMarker {
    public final SimpleType b;
    public final SimpleType c;

    public FlexibleType(@NotNull SimpleType simpleType0, @NotNull SimpleType simpleType1) {
        Intrinsics.checkNotNullParameter(simpleType0, "lowerBound");
        Intrinsics.checkNotNullParameter(simpleType1, "upperBound");
        super(null);
        this.b = simpleType0;
        this.c = simpleType1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public List getArguments() {
        return this.getDelegate().getArguments();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return this.getDelegate().getAttributes();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeConstructor getConstructor() {
        return this.getDelegate().getConstructor();
    }

    @NotNull
    public abstract SimpleType getDelegate();

    @NotNull
    public final SimpleType getLowerBound() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return this.getDelegate().getMemberScope();
    }

    @NotNull
    public final SimpleType getUpperBound() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.getDelegate().isMarkedNullable();
    }

    @NotNull
    public abstract String render(@NotNull DescriptorRenderer arg1, @NotNull DescriptorRendererOptions arg2);

    @Override
    @NotNull
    public String toString() {
        return DescriptorRenderer.DEBUG_TEXT.renderType(this);
    }
}

