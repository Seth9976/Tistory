package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

public final class DynamicType extends FlexibleType implements DynamicTypeMarker {
    public final TypeAttributes d;

    public DynamicType(@NotNull KotlinBuiltIns kotlinBuiltIns0, @NotNull TypeAttributes typeAttributes0) {
        Intrinsics.checkNotNullParameter(kotlinBuiltIns0, "builtIns");
        Intrinsics.checkNotNullParameter(typeAttributes0, "attributes");
        SimpleType simpleType0 = kotlinBuiltIns0.getNothingType();
        Intrinsics.checkNotNullExpressionValue(simpleType0, "builtIns.nothingType");
        SimpleType simpleType1 = kotlinBuiltIns0.getNullableAnyType();
        Intrinsics.checkNotNullExpressionValue(simpleType1, "builtIns.nullableAnyType");
        super(simpleType0, simpleType1);
        this.d = typeAttributes0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public TypeAttributes getAttributes() {
        return this.d;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public SimpleType getDelegate() {
        return this.getUpperBound();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public boolean isMarkedNullable() {
        return false;
    }

    @NotNull
    public DynamicType makeNullableAsSpecified(boolean z) [...] // Inlined contents

    @Override  // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public UnwrappedType makeNullableAsSpecified(boolean z) {
        return this;
    }

    @NotNull
    public DynamicType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        return this;
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
        return "dynamic";
    }

    @NotNull
    public DynamicType replaceAttributes(@NotNull TypeAttributes typeAttributes0) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "newAttributes");
        return new DynamicType(TypeUtilsKt.getBuiltIns(this.getDelegate()), typeAttributes0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public UnwrappedType replaceAttributes(TypeAttributes typeAttributes0) {
        return this.replaceAttributes(typeAttributes0);
    }
}

