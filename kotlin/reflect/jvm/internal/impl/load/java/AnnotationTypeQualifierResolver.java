package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nAnnotationTypeQualifierResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AnnotationTypeQualifierResolver\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n76#2:55\n96#2,5:56\n1360#3:61\n1446#3,5:62\n*S KotlinDebug\n*F\n+ 1 AnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AnnotationTypeQualifierResolver\n*L\n40#1:55\n40#1:56,5\n49#1:61\n49#1:62,5\n*E\n"})
public final class AnnotationTypeQualifierResolver extends AbstractAnnotationTypeQualifierResolver {
    public AnnotationTypeQualifierResolver(@NotNull JavaTypeEnhancementState javaTypeEnhancementState0) {
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState0, "javaTypeEnhancementState");
        super(javaTypeEnhancementState0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public Iterable enumArguments(Object object0, boolean z) {
        return this.enumArguments(((AnnotationDescriptor)object0), z);
    }

    @NotNull
    public Iterable enumArguments(@NotNull AnnotationDescriptor annotationDescriptor0, boolean z) {
        Intrinsics.checkNotNullParameter(annotationDescriptor0, "<this>");
        Map map0 = annotationDescriptor0.getAllValueArguments();
        Iterable iterable0 = new ArrayList();
        for(Object object0: map0.entrySet()) {
            Name name0 = (Name)((Map.Entry)object0).getKey();
            ConstantValue constantValue0 = (ConstantValue)((Map.Entry)object0).getValue();
            o.addAll(((Collection)iterable0), (!z || Intrinsics.areEqual(name0, JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME) ? AnnotationTypeQualifierResolver.f(constantValue0) : CollectionsKt__CollectionsKt.emptyList()));
        }
        return iterable0;
    }

    public static List f(ConstantValue constantValue0) {
        if(constantValue0 instanceof ArrayValue) {
            Iterable iterable0 = (Iterable)((ArrayValue)constantValue0).getValue();
            List list0 = new ArrayList();
            for(Object object0: iterable0) {
                o.addAll(list0, AnnotationTypeQualifierResolver.f(((ConstantValue)object0)));
            }
            return list0;
        }
        return constantValue0 instanceof EnumValue ? k.listOf(((EnumValue)constantValue0).getEnumEntryName().getIdentifier()) : CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public FqName getFqName(Object object0) {
        return this.getFqName(((AnnotationDescriptor)object0));
    }

    @Nullable
    public FqName getFqName(@NotNull AnnotationDescriptor annotationDescriptor0) {
        Intrinsics.checkNotNullParameter(annotationDescriptor0, "<this>");
        return annotationDescriptor0.getFqName();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public Object getKey(Object object0) {
        return this.getKey(((AnnotationDescriptor)object0));
    }

    @NotNull
    public Object getKey(@NotNull AnnotationDescriptor annotationDescriptor0) {
        Intrinsics.checkNotNullParameter(annotationDescriptor0, "<this>");
        ClassDescriptor classDescriptor0 = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor0);
        Intrinsics.checkNotNull(classDescriptor0);
        return classDescriptor0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public Iterable getMetaAnnotations(Object object0) {
        return this.getMetaAnnotations(((AnnotationDescriptor)object0));
    }

    @NotNull
    public Iterable getMetaAnnotations(@NotNull AnnotationDescriptor annotationDescriptor0) {
        Intrinsics.checkNotNullParameter(annotationDescriptor0, "<this>");
        ClassDescriptor classDescriptor0 = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor0);
        if(classDescriptor0 != null) {
            Iterable iterable0 = classDescriptor0.getAnnotations();
            if(iterable0 != null) {
                return iterable0;
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }
}

