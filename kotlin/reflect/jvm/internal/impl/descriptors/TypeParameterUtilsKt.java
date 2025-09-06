package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke.a;
import ke.i;
import ke.j;
import ke.k;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\ntypeParameterUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeParameterUtils.kt\norg/jetbrains/kotlin/descriptors/TypeParameterUtilsKt\n+ 2 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n15#2,2:101\n1549#3:103\n1620#3,3:104\n*S KotlinDebug\n*F\n+ 1 typeParameterUtils.kt\norg/jetbrains/kotlin/descriptors/TypeParameterUtilsKt\n*L\n37#1:101,2\n42#1:103\n42#1:104,3\n*E\n"})
public final class TypeParameterUtilsKt {
    public static final PossiblyInnerType a(KotlinType kotlinType0, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters0, int v) {
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters1 = null;
        if(classifierDescriptorWithTypeParameters0 != null && !ErrorUtils.isError(classifierDescriptorWithTypeParameters0)) {
            int v1 = classifierDescriptorWithTypeParameters0.getDeclaredTypeParameters().size() + v;
            if(!classifierDescriptorWithTypeParameters0.isInner()) {
                if(v1 != kotlinType0.getArguments().size()) {
                    DescriptorUtils.isLocal(classifierDescriptorWithTypeParameters0);
                }
                return new PossiblyInnerType(classifierDescriptorWithTypeParameters0, kotlinType0.getArguments().subList(v, kotlinType0.getArguments().size()), null);
            }
            List list0 = kotlinType0.getArguments().subList(v, v1);
            DeclarationDescriptor declarationDescriptor0 = classifierDescriptorWithTypeParameters0.getContainingDeclaration();
            if(declarationDescriptor0 instanceof ClassifierDescriptorWithTypeParameters) {
                classifierDescriptorWithTypeParameters1 = (ClassifierDescriptorWithTypeParameters)declarationDescriptor0;
            }
            return new PossiblyInnerType(classifierDescriptorWithTypeParameters0, list0, TypeParameterUtilsKt.a(kotlinType0, classifierDescriptorWithTypeParameters1, v1));
        }
        return null;
    }

    @Nullable
    public static final PossiblyInnerType buildPossiblyInnerType(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
        return classifierDescriptor0 instanceof ClassifierDescriptorWithTypeParameters ? TypeParameterUtilsKt.a(kotlinType0, ((ClassifierDescriptorWithTypeParameters)classifierDescriptor0), 0) : TypeParameterUtilsKt.a(kotlinType0, null, 0);
    }

    @NotNull
    public static final List computeConstructorTypeParameters(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters0) {
        List list2;
        Intrinsics.checkNotNullParameter(classifierDescriptorWithTypeParameters0, "<this>");
        List list0 = classifierDescriptorWithTypeParameters0.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(list0, "declaredTypeParameters");
        if(!classifierDescriptorWithTypeParameters0.isInner() && !(classifierDescriptorWithTypeParameters0.getContainingDeclaration() instanceof CallableDescriptor)) {
            return list0;
        }
        Object object0 = null;
        List list1 = SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.flatMap(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.takeWhile(DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters0), i.w), j.w), k.w));
        Iterator iterator0 = DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters0).iterator();
        while(true) {
            list2 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            if(object1 instanceof ClassDescriptor) {
                object0 = object1;
                break;
            }
        }
        if(((ClassDescriptor)object0) != null) {
            TypeConstructor typeConstructor0 = ((ClassDescriptor)object0).getTypeConstructor();
            if(typeConstructor0 != null) {
                list2 = typeConstructor0.getParameters();
            }
        }
        if(list2 == null) {
            list2 = CollectionsKt__CollectionsKt.emptyList();
        }
        if(list1.isEmpty() && list2.isEmpty()) {
            List list3 = classifierDescriptorWithTypeParameters0.getDeclaredTypeParameters();
            Intrinsics.checkNotNullExpressionValue(list3, "declaredTypeParameters");
            return list3;
        }
        Iterable iterable0 = CollectionsKt___CollectionsKt.plus(list1, list2);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object2: iterable0) {
            Intrinsics.checkNotNullExpressionValue(((TypeParameterDescriptor)object2), "it");
            arrayList0.add(new a(((TypeParameterDescriptor)object2), classifierDescriptorWithTypeParameters0, list0.size()));
        }
        return CollectionsKt___CollectionsKt.plus(list0, arrayList0);
    }
}

