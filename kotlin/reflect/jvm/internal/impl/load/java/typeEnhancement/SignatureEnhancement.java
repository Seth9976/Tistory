package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionNInfo;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfoKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import s.h1;
import ue.d;
import ue.e;
import ue.f;
import ue.g;
import ue.i;

@SourceDebugExtension({"SMAP\nsignatureEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n1549#2:283\n1620#2,3:284\n1549#2:287\n1620#2,3:288\n1549#2:292\n1620#2,3:293\n1747#2,3:296\n1747#2,3:299\n1559#2:302\n1590#2,4:303\n1549#2:307\n1620#2,3:308\n1549#2:311\n1620#2,3:312\n1#3:291\n*S KotlinDebug\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancement\n*L\n55#1:283\n55#1:284,3\n66#1:287\n66#1:288,3\n117#1:292\n117#1:293,3\n138#1:296,3\n144#1:299,3\n150#1:302\n150#1:303,4\n164#1:307\n164#1:308,3\n214#1:311\n214#1:312,3\n*E\n"})
public final class SignatureEnhancement {
    public final JavaTypeEnhancement a;

    public SignatureEnhancement(@NotNull JavaTypeEnhancement javaTypeEnhancement0) {
        Intrinsics.checkNotNullParameter(javaTypeEnhancement0, "typeEnhancement");
        super();
        this.a = javaTypeEnhancement0;
    }

    public final KotlinType a(JavaCallableMemberDescriptor javaCallableMemberDescriptor0, CallableDescriptor callableDescriptor0, boolean z, LazyJavaResolverContext lazyJavaResolverContext0, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType0, TypeEnhancementInfo typeEnhancementInfo0, boolean z1, Function1 function10) {
        i i0 = new i(callableDescriptor0, z, lazyJavaResolverContext0, annotationQualifierApplicabilityType0, false);
        KotlinType kotlinType0 = (KotlinType)function10.invoke(javaCallableMemberDescriptor0);
        Collection collection0 = javaCallableMemberDescriptor0.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(collection0, "overriddenDescriptors");
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(collection0, 10));
        for(Object object0: collection0) {
            Intrinsics.checkNotNullExpressionValue(((CallableMemberDescriptor)object0), "it");
            arrayList0.add(((KotlinType)function10.invoke(((CallableMemberDescriptor)object0))));
        }
        Function1 function11 = i0.computeIndexedQualifiers(kotlinType0, arrayList0, typeEnhancementInfo0, z1);
        return this.a.enhance(kotlinType0, function11, i0.e);
    }

    // This method was un-flattened
    @NotNull
    public final Collection enhanceSignatures(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull Collection collection0) {
        KotlinType kotlinType5;
        Pair pair0;
        boolean z2;
        LazyJavaResolverContext lazyJavaResolverContext5;
        TypeEnhancementInfo typeEnhancementInfo0;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo0;
        KotlinType kotlinType0;
        LazyJavaResolverContext lazyJavaResolverContext3;
        CallableMemberDescriptor callableMemberDescriptor1;
        Annotations annotations0;
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "c");
        Intrinsics.checkNotNullParameter(collection0, "platformSignatures");
        Collection collection1 = new ArrayList(l.collectionSizeOrDefault(collection0, 10));
        for(Object object0: collection0) {
            CallableMemberDescriptor callableMemberDescriptor0 = (CallableMemberDescriptor)object0;
            if(callableMemberDescriptor0 instanceof JavaCallableMemberDescriptor) {
                JavaCallableMemberDescriptor javaCallableMemberDescriptor0 = (JavaCallableMemberDescriptor)callableMemberDescriptor0;
                boolean z = true;
                if(javaCallableMemberDescriptor0.getKind() != Kind.FAKE_OVERRIDE || javaCallableMemberDescriptor0.getOriginal().getOverriddenDescriptors().size() != 1) {
                    ClassifierDescriptor classifierDescriptor0 = DescriptorUtilKt.getTopLevelContainingClassifier(callableMemberDescriptor0);
                    if(classifierDescriptor0 == null) {
                        annotations0 = callableMemberDescriptor0.getAnnotations();
                    }
                    else {
                        LazyJavaClassDescriptor lazyJavaClassDescriptor0 = classifierDescriptor0 instanceof LazyJavaClassDescriptor ? ((LazyJavaClassDescriptor)classifierDescriptor0) : null;
                        List list0 = lazyJavaClassDescriptor0 == null ? null : lazyJavaClassDescriptor0.getModuleAnnotations();
                        if(list0 == null || list0.isEmpty()) {
                            annotations0 = callableMemberDescriptor0.getAnnotations();
                        }
                        else {
                            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
                            for(Object object1: list0) {
                                arrayList0.add(new LazyJavaAnnotationDescriptor(lazyJavaResolverContext0, ((JavaAnnotation)object1), true));
                            }
                            List list1 = CollectionsKt___CollectionsKt.plus(callableMemberDescriptor0.getAnnotations(), arrayList0);
                            annotations0 = Annotations.Companion.create(list1);
                        }
                    }
                    LazyJavaResolverContext lazyJavaResolverContext1 = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext0, annotations0);
                    if(callableMemberDescriptor0 instanceof JavaPropertyDescriptor) {
                        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl0 = ((JavaPropertyDescriptor)callableMemberDescriptor0).getGetter();
                        if(propertyGetterDescriptorImpl0 != null && !propertyGetterDescriptorImpl0.isDefault()) {
                            PropertyGetterDescriptorImpl propertyGetterDescriptorImpl1 = ((JavaPropertyDescriptor)callableMemberDescriptor0).getGetter();
                            Intrinsics.checkNotNull(propertyGetterDescriptorImpl1);
                            callableMemberDescriptor1 = propertyGetterDescriptorImpl1;
                        }
                    }
                    else {
                        callableMemberDescriptor1 = callableMemberDescriptor0;
                    }
                    if(javaCallableMemberDescriptor0.getExtensionReceiverParameter() == null) {
                        kotlinType0 = null;
                    }
                    else {
                        FunctionDescriptor functionDescriptor0 = callableMemberDescriptor1 instanceof FunctionDescriptor ? ((FunctionDescriptor)callableMemberDescriptor1) : null;
                        ValueParameterDescriptor valueParameterDescriptor0 = functionDescriptor0 == null ? null : ((ValueParameterDescriptor)functionDescriptor0.getUserData(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER));
                        e e0 = e.w;
                        if(valueParameterDescriptor0 == null) {
                            lazyJavaResolverContext3 = lazyJavaResolverContext1;
                        }
                        else {
                            LazyJavaResolverContext lazyJavaResolverContext2 = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext1, valueParameterDescriptor0.getAnnotations());
                            if(lazyJavaResolverContext2 != null) {
                                lazyJavaResolverContext3 = lazyJavaResolverContext2;
                            }
                        }
                        kotlinType0 = this.a(((JavaCallableMemberDescriptor)callableMemberDescriptor0), valueParameterDescriptor0, false, lazyJavaResolverContext3, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, null, false, e0);
                    }
                    JavaMethodDescriptor javaMethodDescriptor0 = callableMemberDescriptor0 instanceof JavaMethodDescriptor ? ((JavaMethodDescriptor)callableMemberDescriptor0) : null;
                    if(javaMethodDescriptor0 == null) {
                        predefinedFunctionEnhancementInfo0 = null;
                    }
                    else {
                        DeclarationDescriptor declarationDescriptor0 = javaMethodDescriptor0.getContainingDeclaration();
                        Intrinsics.checkNotNull(declarationDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        String s = MethodSignatureMappingKt.computeJvmDescriptor$default(javaMethodDescriptor0, false, false, 3, null);
                        String s1 = MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, ((ClassDescriptor)declarationDescriptor0), s);
                        if(s1 != null) {
                            predefinedFunctionEnhancementInfo0 = (PredefinedFunctionEnhancementInfo)PredefinedEnhancementInfoKt.getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE().get(s1);
                        }
                    }
                    if(predefinedFunctionEnhancementInfo0 != null) {
                        predefinedFunctionEnhancementInfo0.getParametersInfo().size();
                        javaCallableMemberDescriptor0.getValueParameters().size();
                    }
                    boolean z1 = (UtilsKt.isJspecifyEnabledInStrictMode(lazyJavaResolverContext0.getComponents().getJavaTypeEnhancementState()) || lazyJavaResolverContext1.getComponents().getSettings().getIgnoreNullabilityForErasedValueParameters()) && UtilsKt.hasErasedValueParameters(callableMemberDescriptor0);
                    List list2 = callableMemberDescriptor1.getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(list2, "annotationOwnerForMember.valueParameters");
                    ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(list2, 10));
                    for(Object object2: list2) {
                        ValueParameterDescriptor valueParameterDescriptor1 = (ValueParameterDescriptor)object2;
                        if(predefinedFunctionEnhancementInfo0 == null) {
                            typeEnhancementInfo0 = null;
                        }
                        else {
                            List list3 = predefinedFunctionEnhancementInfo0.getParametersInfo();
                            if(list3 != null) {
                                typeEnhancementInfo0 = (TypeEnhancementInfo)CollectionsKt___CollectionsKt.getOrNull(list3, valueParameterDescriptor1.getIndex());
                            }
                        }
                        h1 h10 = new h1(valueParameterDescriptor1, 14);
                        if(valueParameterDescriptor1 == null) {
                            lazyJavaResolverContext5 = lazyJavaResolverContext1;
                        }
                        else {
                            LazyJavaResolverContext lazyJavaResolverContext4 = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext1, valueParameterDescriptor1.getAnnotations());
                            if(lazyJavaResolverContext4 != null) {
                                lazyJavaResolverContext5 = lazyJavaResolverContext4;
                            }
                        }
                        arrayList1.add(this.a(((JavaCallableMemberDescriptor)callableMemberDescriptor0), valueParameterDescriptor1, false, lazyJavaResolverContext5, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, typeEnhancementInfo0, z1, h10));
                    }
                    PropertyDescriptor propertyDescriptor0 = callableMemberDescriptor0 instanceof PropertyDescriptor ? ((PropertyDescriptor)callableMemberDescriptor0) : null;
                    KotlinType kotlinType1 = this.a(((JavaCallableMemberDescriptor)callableMemberDescriptor0), callableMemberDescriptor1, true, lazyJavaResolverContext1, (propertyDescriptor0 == null || !JavaDescriptorUtilKt.isJavaField(propertyDescriptor0) ? AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE : AnnotationQualifierApplicabilityType.FIELD), (predefinedFunctionEnhancementInfo0 == null ? null : predefinedFunctionEnhancementInfo0.getReturnTypeInfo()), false, f.w);
                    KotlinType kotlinType2 = javaCallableMemberDescriptor0.getReturnType();
                    Intrinsics.checkNotNull(kotlinType2);
                    d d0 = d.w;
                    if(TypeUtils.contains(kotlinType2, d0)) {
                    label_111:
                        pair0 = TuplesKt.to(DescriptorBasedDeprecationInfoKt.getDEPRECATED_FUNCTION_KEY(), new DeprecationCausedByFunctionNInfo(callableMemberDescriptor0));
                    }
                    else {
                        ReceiverParameterDescriptor receiverParameterDescriptor0 = javaCallableMemberDescriptor0.getExtensionReceiverParameter();
                        if(receiverParameterDescriptor0 == null) {
                            z2 = false;
                        }
                        else {
                            KotlinType kotlinType3 = receiverParameterDescriptor0.getType();
                            if(kotlinType3 != null) {
                                z2 = TypeUtils.contains(kotlinType3, d0);
                            }
                        }
                        if(z2) {
                            goto label_111;
                        }
                        else {
                            pair0 = null;
                            List list4 = javaCallableMemberDescriptor0.getValueParameters();
                            Intrinsics.checkNotNullExpressionValue(list4, "valueParameters");
                            Iterable iterable0 = list4;
                            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                                for(Object object3: iterable0) {
                                    KotlinType kotlinType4 = ((ValueParameterDescriptor)object3).getType();
                                    Intrinsics.checkNotNullExpressionValue(kotlinType4, "it.type");
                                    if(TypeUtils.contains(kotlinType4, d.w)) {
                                        goto label_111;
                                    }
                                }
                            }
                        }
                    }
                    if(kotlinType0 != null || kotlinType1 != null) {
                    label_121:
                        if(kotlinType0 == null) {
                            ReceiverParameterDescriptor receiverParameterDescriptor1 = javaCallableMemberDescriptor0.getExtensionReceiverParameter();
                            kotlinType5 = receiverParameterDescriptor1 == null ? null : receiverParameterDescriptor1.getType();
                        }
                        else {
                            kotlinType5 = kotlinType0;
                        }
                        ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(arrayList1, 10));
                        int v = 0;
                        for(Object object5: arrayList1) {
                            if(v < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            KotlinType kotlinType6 = (KotlinType)object5;
                            if(kotlinType6 == null) {
                                kotlinType6 = ((ValueParameterDescriptor)javaCallableMemberDescriptor0.getValueParameters().get(v)).getType();
                                Intrinsics.checkNotNullExpressionValue(kotlinType6, "valueParameters[index].type");
                            }
                            arrayList2.add(kotlinType6);
                            ++v;
                        }
                        if(kotlinType1 == null) {
                            kotlinType1 = javaCallableMemberDescriptor0.getReturnType();
                            Intrinsics.checkNotNull(kotlinType1);
                        }
                        callableMemberDescriptor0 = javaCallableMemberDescriptor0.enhance(kotlinType5, arrayList2, kotlinType1, pair0);
                        Intrinsics.checkNotNull(callableMemberDescriptor0, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                    }
                    else {
                        if(!arrayList1.isEmpty()) {
                            for(Object object4: arrayList1) {
                                if(((KotlinType)object4) == null) {
                                    continue;
                                }
                                goto label_120;
                            }
                        }
                        z = false;
                    label_120:
                        if(z || pair0 != null) {
                            goto label_121;
                        }
                    }
                }
            }
            ((ArrayList)collection1).add(callableMemberDescriptor0);
        }
        return collection1;
    }

    @NotNull
    public final KotlinType enhanceSuperType(@NotNull KotlinType kotlinType0, @NotNull LazyJavaResolverContext lazyJavaResolverContext0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "type");
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "context");
        i i0 = new i(null, false, lazyJavaResolverContext0, AnnotationQualifierApplicabilityType.TYPE_USE, true);
        Function1 function10 = i0.computeIndexedQualifiers(kotlinType0, CollectionsKt__CollectionsKt.emptyList(), null, false);
        KotlinType kotlinType1 = this.a.enhance(kotlinType0, function10, i0.e);
        return kotlinType1 == null ? kotlinType0 : kotlinType1;
    }

    @NotNull
    public final List enhanceTypeParameterBounds(@NotNull TypeParameterDescriptor typeParameterDescriptor0, @NotNull List list0, @NotNull LazyJavaResolverContext lazyJavaResolverContext0) {
        Intrinsics.checkNotNullParameter(typeParameterDescriptor0, "typeParameter");
        Intrinsics.checkNotNullParameter(list0, "bounds");
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "context");
        List list1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            KotlinType kotlinType0 = (KotlinType)object0;
            if(!TypeUtilsKt.contains(kotlinType0, g.w)) {
                i i0 = new i(typeParameterDescriptor0, false, lazyJavaResolverContext0, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false);
                Function1 function10 = i0.computeIndexedQualifiers(kotlinType0, CollectionsKt__CollectionsKt.emptyList(), null, false);
                KotlinType kotlinType1 = this.a.enhance(kotlinType0, function10, i0.e);
                if(kotlinType1 != null) {
                    kotlinType0 = kotlinType1;
                }
            }
            ((ArrayList)list1).add(kotlinType0);
        }
        return list1;
    }
}

