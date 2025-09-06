package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

public final class o extends Lambda implements Function0 {
    public final TypeAliasConstructorDescriptorImpl w;
    public final ClassConstructorDescriptor x;

    public o(TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl0, ClassConstructorDescriptor classConstructorDescriptor0) {
        this.w = typeAliasConstructorDescriptorImpl0;
        this.x = classConstructorDescriptor0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl0 = this.w;
        ClassConstructorDescriptor classConstructorDescriptor0 = this.x;
        Annotations annotations0 = classConstructorDescriptor0.getAnnotations();
        Kind callableMemberDescriptor$Kind0 = classConstructorDescriptor0.getKind();
        Intrinsics.checkNotNullExpressionValue(callableMemberDescriptor$Kind0, "underlyingConstructorDescriptor.kind");
        SourceElement sourceElement0 = typeAliasConstructorDescriptorImpl0.getTypeAliasDescriptor().getSource();
        Intrinsics.checkNotNullExpressionValue(sourceElement0, "typeAliasDescriptor.source");
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl1 = new TypeAliasConstructorDescriptorImpl(typeAliasConstructorDescriptorImpl0.getStorageManager(), typeAliasConstructorDescriptorImpl0.getTypeAliasDescriptor(), classConstructorDescriptor0, this.w, annotations0, callableMemberDescriptor$Kind0, sourceElement0, null);
        TypeSubstitutor typeSubstitutor0 = Companion.access$getTypeSubstitutorForUnderlyingClass(TypeAliasConstructorDescriptorImpl.Companion, typeAliasConstructorDescriptorImpl0.getTypeAliasDescriptor());
        ReceiverParameterDescriptor receiverParameterDescriptor0 = null;
        if(typeSubstitutor0 == null) {
            return null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptor1 = classConstructorDescriptor0.getDispatchReceiverParameter();
        if(receiverParameterDescriptor1 != null) {
            receiverParameterDescriptor0 = receiverParameterDescriptor1.substitute(typeSubstitutor0);
        }
        List list0 = classConstructorDescriptor0.getContextReceiverParameters();
        Intrinsics.checkNotNullExpressionValue(list0, "underlyingConstructorDes…contextReceiverParameters");
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(((ReceiverParameterDescriptor)object0).substitute(typeSubstitutor0));
        }
        List list1 = typeAliasConstructorDescriptorImpl0.getTypeAliasDescriptor().getDeclaredTypeParameters();
        List list2 = typeAliasConstructorDescriptorImpl0.getValueParameters();
        KotlinType kotlinType0 = typeAliasConstructorDescriptorImpl0.getReturnType();
        DescriptorVisibility descriptorVisibility0 = typeAliasConstructorDescriptorImpl0.getTypeAliasDescriptor().getVisibility();
        typeAliasConstructorDescriptorImpl1.initialize(null, receiverParameterDescriptor0, arrayList0, list1, list2, kotlinType0, Modality.FINAL, descriptorVisibility0);
        return typeAliasConstructorDescriptorImpl1;
    }
}

