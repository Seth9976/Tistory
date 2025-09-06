package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nflexibleTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 flexibleTypes.kt\norg/jetbrains/kotlin/types/FlexibleTypeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
public final class FlexibleTypeImpl extends FlexibleType implements CustomTypeParameter {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    public static boolean RUN_SLOW_ASSERTIONS;
    public boolean d;

    static {
        FlexibleTypeImpl.Companion = new Companion(null);
    }

    public FlexibleTypeImpl(@NotNull SimpleType simpleType0, @NotNull SimpleType simpleType1) {
        Intrinsics.checkNotNullParameter(simpleType0, "lowerBound");
        Intrinsics.checkNotNullParameter(simpleType1, "upperBound");
        super(simpleType0, simpleType1);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public SimpleType getDelegate() {
        if(FlexibleTypeImpl.RUN_SLOW_ASSERTIONS && !this.d) {
            this.d = true;
            FlexibleTypesKt.isFlexible(this.getLowerBound());
            FlexibleTypesKt.isFlexible(this.getUpperBound());
            Intrinsics.areEqual(this.getLowerBound(), this.getUpperBound());
            KotlinTypeChecker.DEFAULT.isSubtypeOf(this.getLowerBound(), this.getUpperBound());
        }
        return this.getLowerBound();
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public boolean isTypeParameter() {
        return this.getLowerBound().getConstructor().getDeclarationDescriptor() instanceof TypeParameterDescriptor && Intrinsics.areEqual(this.getLowerBound().getConstructor(), this.getUpperBound().getConstructor());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public UnwrappedType makeNullableAsSpecified(boolean z) {
        return KotlinTypeFactory.flexibleType(this.getLowerBound().makeNullableAsSpecified(z), this.getUpperBound().makeNullableAsSpecified(z));
    }

    @NotNull
    public FlexibleType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        KotlinType kotlinType0 = kotlinTypeRefiner0.refineType(this.getLowerBound());
        Intrinsics.checkNotNull(kotlinType0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType kotlinType1 = kotlinTypeRefiner0.refineType(this.getUpperBound());
        Intrinsics.checkNotNull(kotlinType1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new FlexibleTypeImpl(((SimpleType)kotlinType0), ((SimpleType)kotlinType1));
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
        return descriptorRendererOptions0.getDebugMode() ? "(" + descriptorRenderer0.renderType(this.getLowerBound()) + ".." + descriptorRenderer0.renderType(this.getUpperBound()) + ')' : descriptorRenderer0.renderFlexibleType(descriptorRenderer0.renderType(this.getLowerBound()), descriptorRenderer0.renderType(this.getUpperBound()), TypeUtilsKt.getBuiltIns(this));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public UnwrappedType replaceAttributes(@NotNull TypeAttributes typeAttributes0) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "newAttributes");
        return KotlinTypeFactory.flexibleType(this.getLowerBound().replaceAttributes(typeAttributes0), this.getUpperBound().replaceAttributes(typeAttributes0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    @NotNull
    public KotlinType substitutionResult(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "replacement");
        UnwrappedType unwrappedType0 = kotlinType0.unwrap();
        if(unwrappedType0 instanceof FlexibleType) {
            return TypeWithEnhancementKt.inheritEnhancement(unwrappedType0, unwrappedType0);
        }
        if(!(unwrappedType0 instanceof SimpleType)) {
            throw new NoWhenBranchMatchedException();
        }
        return TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(((SimpleType)unwrappedType0), ((SimpleType)unwrappedType0).makeNullableAsSpecified(true)), unwrappedType0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public String toString() {
        return "(" + this.getLowerBound() + ".." + this.getUpperBound() + ')';
    }
}

