package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nStarProjectionImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StarProjectionImpl.kt\norg/jetbrains/kotlin/types/StarProjectionImplKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1549#2:102\n1620#2,3:103\n1549#2:106\n1620#2,3:107\n*S KotlinDebug\n*F\n+ 1 StarProjectionImpl.kt\norg/jetbrains/kotlin/types/StarProjectionImplKt\n*L\n66#1:102\n66#1:103,3\n73#1:106\n73#1:107,3\n*E\n"})
public final class StarProjectionImplKt {
    public static final KotlinType a(ArrayList arrayList0, List list0, KotlinBuiltIns kotlinBuiltIns0) {
        KotlinType kotlinType0 = TypeSubstitutor.create(new StarProjectionImplKt.buildStarProjectionTypeByTypeParameters.1(arrayList0)).substitute(((KotlinType)CollectionsKt___CollectionsKt.first(list0)), Variance.OUT_VARIANCE);
        if(kotlinType0 == null) {
            kotlinType0 = kotlinBuiltIns0.getDefaultBound();
        }
        Intrinsics.checkNotNullExpressionValue(kotlinType0, "typeParameters: List<Typ… ?: builtIns.defaultBound");
        return kotlinType0;
    }

    @NotNull
    public static final KotlinType starProjectionType(@NotNull TypeParameterDescriptor typeParameterDescriptor0) {
        Intrinsics.checkNotNullParameter(typeParameterDescriptor0, "<this>");
        DeclarationDescriptor declarationDescriptor0 = typeParameterDescriptor0.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(declarationDescriptor0, "this.containingDeclaration");
        if(declarationDescriptor0 instanceof ClassifierDescriptorWithTypeParameters) {
            List list0 = ((ClassifierDescriptorWithTypeParameters)declarationDescriptor0).getTypeConstructor().getParameters();
            Intrinsics.checkNotNullExpressionValue(list0, "descriptor.typeConstructor.parameters");
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            for(Object object0: list0) {
                TypeConstructor typeConstructor0 = ((TypeParameterDescriptor)object0).getTypeConstructor();
                Intrinsics.checkNotNullExpressionValue(typeConstructor0, "it.typeConstructor");
                arrayList0.add(typeConstructor0);
            }
            List list1 = typeParameterDescriptor0.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(list1, "upperBounds");
            return StarProjectionImplKt.a(arrayList0, list1, DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor0));
        }
        if(!(declarationDescriptor0 instanceof FunctionDescriptor)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List list2 = ((FunctionDescriptor)declarationDescriptor0).getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(list2, "descriptor.typeParameters");
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(list2, 10));
        for(Object object1: list2) {
            TypeConstructor typeConstructor1 = ((TypeParameterDescriptor)object1).getTypeConstructor();
            Intrinsics.checkNotNullExpressionValue(typeConstructor1, "it.typeConstructor");
            arrayList1.add(typeConstructor1);
        }
        List list3 = typeParameterDescriptor0.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(list3, "upperBounds");
        return StarProjectionImplKt.a(arrayList1, list3, DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor0));
    }
}

