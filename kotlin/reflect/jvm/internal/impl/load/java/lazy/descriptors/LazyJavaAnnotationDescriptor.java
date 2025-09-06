package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import se.a;

@SourceDebugExtension({"SMAP\nLazyJavaAnnotationDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1549#2:125\n1620#2,3:126\n*S KotlinDebug\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor\n*L\n94#1:125\n94#1:126,3\n*E\n"})
public final class LazyJavaAnnotationDescriptor implements AnnotationDescriptor, PossiblyExternalAnnotationDescriptor {
    public final LazyJavaResolverContext a;
    public final JavaAnnotation b;
    public final NullableLazyValue c;
    public final NotNullLazyValue d;
    public final JavaSourceElement e;
    public final NotNullLazyValue f;
    public final boolean g;
    public final boolean h;
    public static final KProperty[] i;

    static {
        LazyJavaAnnotationDescriptor.i = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaAnnotationDescriptor.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public LazyJavaAnnotationDescriptor(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull JavaAnnotation javaAnnotation0, boolean z) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "c");
        Intrinsics.checkNotNullParameter(javaAnnotation0, "javaAnnotation");
        super();
        this.a = lazyJavaResolverContext0;
        this.b = javaAnnotation0;
        this.c = lazyJavaResolverContext0.getStorageManager().createNullableLazyValue(new a(this, 1));
        this.d = lazyJavaResolverContext0.getStorageManager().createLazyValue(new a(this, 2));
        this.e = lazyJavaResolverContext0.getComponents().getSourceElementFactory().source(javaAnnotation0);
        this.f = lazyJavaResolverContext0.getStorageManager().createLazyValue(new a(this, 0));
        this.g = javaAnnotation0.isIdeExternalAnnotation();
        this.h = javaAnnotation0.isFreshlySupportedTypeUseAnnotation() || z;
    }

    public LazyJavaAnnotationDescriptor(LazyJavaResolverContext lazyJavaResolverContext0, JavaAnnotation javaAnnotation0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            z = false;
        }
        this(lazyJavaResolverContext0, javaAnnotation0, z);
    }

    public final ConstantValue a(JavaAnnotationArgument javaAnnotationArgument0) {
        KotlinType kotlinType0;
        if(javaAnnotationArgument0 instanceof JavaLiteralAnnotationArgument) {
            Object object0 = ((JavaLiteralAnnotationArgument)javaAnnotationArgument0).getValue();
            return ConstantValueFactory.createConstantValue$default(ConstantValueFactory.INSTANCE, object0, null, 2, null);
        }
        if(javaAnnotationArgument0 instanceof JavaEnumValueAnnotationArgument) {
            ClassId classId0 = ((JavaEnumValueAnnotationArgument)javaAnnotationArgument0).getEnumClassId();
            Name name0 = ((JavaEnumValueAnnotationArgument)javaAnnotationArgument0).getEntryName();
            if(classId0 != null && name0 != null) {
                return new EnumValue(classId0, name0);
            }
        }
        else {
            LazyJavaResolverContext lazyJavaResolverContext0 = this.a;
            if(javaAnnotationArgument0 instanceof JavaArrayAnnotationArgument) {
                Name name1 = ((JavaArrayAnnotationArgument)javaAnnotationArgument0).getName();
                if(name1 == null) {
                    name1 = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
                }
                Intrinsics.checkNotNullExpressionValue(name1, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
                List list0 = ((JavaArrayAnnotationArgument)javaAnnotationArgument0).getElements();
                SimpleType simpleType0 = this.getType();
                Intrinsics.checkNotNullExpressionValue(simpleType0, "type");
                if(!KotlinTypeKt.isError(simpleType0)) {
                    ClassDescriptor classDescriptor0 = DescriptorUtilsKt.getAnnotationClass(this);
                    Intrinsics.checkNotNull(classDescriptor0);
                    ValueParameterDescriptor valueParameterDescriptor0 = DescriptorResolverUtils.getAnnotationParameterByName(name1, classDescriptor0);
                    if(valueParameterDescriptor0 == null) {
                    label_24:
                        KotlinBuiltIns kotlinBuiltIns0 = lazyJavaResolverContext0.getComponents().getModule().getBuiltIns();
                        ErrorType errorType0 = ErrorUtils.createErrorType(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]);
                        kotlinType0 = kotlinBuiltIns0.getArrayType(Variance.INVARIANT, errorType0);
                    }
                    else {
                        kotlinType0 = valueParameterDescriptor0.getType();
                        if(kotlinType0 == null) {
                            goto label_24;
                        }
                    }
                    Intrinsics.checkNotNullExpressionValue(kotlinType0, "DescriptorResolverUtils.…GUMENT)\n                )");
                    ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
                    for(Object object1: list0) {
                        ConstantValue constantValue0 = this.a(((JavaAnnotationArgument)object1));
                        if(constantValue0 == null) {
                            constantValue0 = new NullValue();
                        }
                        arrayList0.add(constantValue0);
                    }
                    return ConstantValueFactory.INSTANCE.createArrayValue(arrayList0, kotlinType0);
                }
            }
            else {
                if(javaAnnotationArgument0 instanceof JavaAnnotationAsAnnotationArgument) {
                    JavaAnnotation javaAnnotation0 = ((JavaAnnotationAsAnnotationArgument)javaAnnotationArgument0).getAnnotation();
                    return new AnnotationValue(new LazyJavaAnnotationDescriptor(this.a, javaAnnotation0, false, 4, null));
                }
                if(javaAnnotationArgument0 instanceof JavaClassObjectAnnotationArgument) {
                    KotlinType kotlinType1 = lazyJavaResolverContext0.getTypeResolver().transformJavaType(((JavaClassObjectAnnotationArgument)javaAnnotationArgument0).getReferencedType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null));
                    return KClassValue.Companion.create(kotlinType1);
                }
            }
        }
        return null;
    }

    public static final ClassDescriptor access$createTypeForMissingDependencies(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor0, FqName fqName0) {
        ModuleDescriptor moduleDescriptor0 = lazyJavaAnnotationDescriptor0.a.getModule();
        ClassId classId0 = ClassId.topLevel(fqName0);
        Intrinsics.checkNotNullExpressionValue(classId0, "topLevel(fqName)");
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(moduleDescriptor0, classId0, lazyJavaAnnotationDescriptor0.a.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public Map getAllValueArguments() {
        return (Map)StorageKt.getValue(this.f, this, LazyJavaAnnotationDescriptor.i[2]);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @Nullable
    public FqName getFqName() {
        return (FqName)StorageKt.getValue(this.c, this, LazyJavaAnnotationDescriptor.i[0]);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SourceElement getSource() {
        return this.getSource();
    }

    @NotNull
    public JavaSourceElement getSource() {
        return this.e;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public KotlinType getType() {
        return this.getType();
    }

    @NotNull
    public SimpleType getType() {
        return (SimpleType)StorageKt.getValue(this.d, this, LazyJavaAnnotationDescriptor.i[1]);
    }

    public final boolean isFreshlySupportedTypeUseAnnotation() {
        return this.h;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean isIdeExternalAnnotation() {
        return this.g;
    }

    @Override
    @NotNull
    public String toString() {
        return DescriptorRenderer.renderAnnotation$default(DescriptorRenderer.FQ_NAMES_IN_TYPES, this, null, 2, null);
    }
}

