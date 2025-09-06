package ue;

import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameterImpl;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

public final class i extends AbstractSignatureParts {
    public final DeclarationDescriptorNonRoot a;
    public final boolean b;
    public final LazyJavaResolverContext c;
    public final AnnotationQualifierApplicabilityType d;
    public final boolean e;

    public i(DeclarationDescriptorNonRoot declarationDescriptorNonRoot0, boolean z, LazyJavaResolverContext lazyJavaResolverContext0, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType0, boolean z1) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "containerContext");
        Intrinsics.checkNotNullParameter(annotationQualifierApplicabilityType0, "containerApplicabilityType");
        super();
        this.a = declarationDescriptorNonRoot0;
        this.b = z;
        this.c = lazyJavaResolverContext0;
        this.d = annotationQualifierApplicabilityType0;
        this.e = z1;
    }

    // 去混淆评级： 低(40)
    @Override  // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean forceWarning(Object object0, KotlinTypeMarker kotlinTypeMarker0) {
        Intrinsics.checkNotNullParameter(((AnnotationDescriptor)object0), "<this>");
        return ((AnnotationDescriptor)object0) instanceof PossiblyExternalAnnotationDescriptor && ((PossiblyExternalAnnotationDescriptor)(((AnnotationDescriptor)object0))).isIdeExternalAnnotation() || ((AnnotationDescriptor)object0) instanceof LazyJavaAnnotationDescriptor && !this.getEnableImprovementsInStrictMode() && (((LazyJavaAnnotationDescriptor)(((AnnotationDescriptor)object0))).isFreshlySupportedTypeUseAnnotation() || this.d == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS) || kotlinTypeMarker0 != null && KotlinBuiltIns.isPrimitiveArray(((KotlinType)kotlinTypeMarker0)) && (this.c.getComponents().getAnnotationTypeQualifierResolver().isTypeUseAnnotation(((AnnotationDescriptor)object0)) && !this.c.getComponents().getSettings().getEnhancePrimitiveArrays());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final AbstractAnnotationTypeQualifierResolver getAnnotationTypeQualifierResolver() {
        return this.c.getComponents().getAnnotationTypeQualifierResolver();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final Iterable getAnnotations(KotlinTypeMarker kotlinTypeMarker0) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "<this>");
        return ((KotlinType)kotlinTypeMarker0).getAnnotations();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final Iterable getContainerAnnotations() {
        DeclarationDescriptorNonRoot declarationDescriptorNonRoot0 = this.a;
        if(declarationDescriptorNonRoot0 != null) {
            Iterable iterable0 = declarationDescriptorNonRoot0.getAnnotations();
            if(iterable0 != null) {
                return iterable0;
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final AnnotationQualifierApplicabilityType getContainerApplicabilityType() {
        return this.d;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final JavaTypeQualifiersByElementType getContainerDefaultTypeQualifiers() {
        return this.c.getDefaultTypeQualifiers();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean getContainerIsVarargParameter() {
        return this.a instanceof ValueParameterDescriptor && ((ValueParameterDescriptor)this.a).getVarargElementType() != null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean getEnableImprovementsInStrictMode() {
        return this.c.getComponents().getSettings().getTypeEnhancementImprovementsInStrictMode();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final KotlinTypeMarker getEnhancedForWarnings(KotlinTypeMarker kotlinTypeMarker0) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "<this>");
        return TypeWithEnhancementKt.getEnhancement(((KotlinType)kotlinTypeMarker0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final FqNameUnsafe getFqNameUnsafe(KotlinTypeMarker kotlinTypeMarker0) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "<this>");
        ClassDescriptor classDescriptor0 = TypeUtils.getClassDescriptor(((KotlinType)kotlinTypeMarker0));
        return classDescriptor0 == null ? null : DescriptorUtils.getFqName(classDescriptor0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean getSkipRawTypeArguments() {
        return this.e;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final TypeSystemContext getTypeSystem() {
        return SimpleClassicTypeSystemContext.INSTANCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isArrayOrPrimitiveArray(KotlinTypeMarker kotlinTypeMarker0) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "<this>");
        return KotlinBuiltIns.isArrayOrPrimitiveArray(((KotlinType)kotlinTypeMarker0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isCovariant() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isEqual(KotlinTypeMarker kotlinTypeMarker0, KotlinTypeMarker kotlinTypeMarker1) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "<this>");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker1, "other");
        return this.c.getComponents().getKotlinTypeChecker().equalTypes(((KotlinType)kotlinTypeMarker0), ((KotlinType)kotlinTypeMarker1));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isFromJava(TypeParameterMarker typeParameterMarker0) {
        Intrinsics.checkNotNullParameter(typeParameterMarker0, "<this>");
        return typeParameterMarker0 instanceof LazyJavaTypeParameterDescriptor;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isNotNullTypeParameterCompat(KotlinTypeMarker kotlinTypeMarker0) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "<this>");
        return ((KotlinType)kotlinTypeMarker0).unwrap() instanceof NotNullTypeParameterImpl;
    }
}

