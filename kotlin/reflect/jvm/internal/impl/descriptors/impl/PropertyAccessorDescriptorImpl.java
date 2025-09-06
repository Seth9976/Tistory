package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class PropertyAccessorDescriptorImpl extends DeclarationDescriptorNonRootImpl implements PropertyAccessorDescriptor {
    public boolean e;
    public final boolean f;
    public final Modality g;
    public final PropertyDescriptor h;
    public final boolean i;
    public final Kind j;
    public DescriptorVisibility k;
    public FunctionDescriptor l;

    public PropertyAccessorDescriptorImpl(@NotNull Modality modality0, @NotNull DescriptorVisibility descriptorVisibility0, @NotNull PropertyDescriptor propertyDescriptor0, @NotNull Annotations annotations0, @NotNull Name name0, boolean z, boolean z1, boolean z2, Kind callableMemberDescriptor$Kind0, @NotNull SourceElement sourceElement0) {
        if(modality0 != null) {
            if(descriptorVisibility0 != null) {
                if(propertyDescriptor0 != null) {
                    if(annotations0 != null) {
                        if(name0 != null) {
                            if(sourceElement0 != null) {
                                super(propertyDescriptor0.getContainingDeclaration(), annotations0, name0, sourceElement0);
                                this.l = null;
                                this.g = modality0;
                                this.k = descriptorVisibility0;
                                this.h = propertyDescriptor0;
                                this.e = z;
                                this.f = z1;
                                this.i = z2;
                                this.j = callableMemberDescriptor$Kind0;
                                return;
                            }
                            PropertyAccessorDescriptorImpl.a(5);
                            throw null;
                        }
                        PropertyAccessorDescriptorImpl.a(4);
                        throw null;
                    }
                    PropertyAccessorDescriptorImpl.a(3);
                    throw null;
                }
                PropertyAccessorDescriptorImpl.a(2);
                throw null;
            }
            PropertyAccessorDescriptorImpl.a(1);
            throw null;
        }
        PropertyAccessorDescriptorImpl.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    public static void a(int v) {
        IllegalArgumentException illegalArgumentException0;
        int v1;
        String s;
        switch(v) {
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 1: {
                arr_object[0] = "visibility";
                break;
            }
            case 2: {
                arr_object[0] = "correspondingProperty";
                break;
            }
            case 3: {
                arr_object[0] = "annotations";
                break;
            }
            case 4: {
                arr_object[0] = "name";
                break;
            }
            case 5: {
                arr_object[0] = "source";
                break;
            }
            case 7: {
                arr_object[0] = "substitutor";
                break;
            }
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            }
            case 16: {
                arr_object[0] = "overriddenDescriptors";
                break;
            }
            default: {
                arr_object[0] = "modality";
            }
        }
        switch(v) {
            case 6: {
                arr_object[1] = "getKind";
                break;
            }
            case 8: {
                arr_object[1] = "substitute";
                break;
            }
            case 9: {
                arr_object[1] = "getTypeParameters";
                break;
            }
            case 10: {
                arr_object[1] = "getModality";
                break;
            }
            case 11: {
                arr_object[1] = "getVisibility";
                break;
            }
            case 12: {
                arr_object[1] = "getCorrespondingVariable";
                break;
            }
            case 13: {
                arr_object[1] = "getCorrespondingProperty";
                break;
            }
            case 14: {
                arr_object[1] = "getContextReceiverParameters";
                break;
            }
            case 15: {
                arr_object[1] = "getOverriddenDescriptors";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
            }
        }
        switch(v) {
            case 7: {
                arr_object[2] = "substitute";
                break;
            }
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                break;
            }
            case 16: {
                arr_object[2] = "setOverriddenDescriptors";
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                illegalArgumentException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor copy(DeclarationDescriptor declarationDescriptor0, Modality modality0, DescriptorVisibility descriptorVisibility0, Kind callableMemberDescriptor$Kind0, boolean z) {
        return this.copy(declarationDescriptor0, modality0, descriptorVisibility0, callableMemberDescriptor$Kind0, z);
    }

    @NotNull
    public PropertyAccessorDescriptor copy(DeclarationDescriptor declarationDescriptor0, Modality modality0, DescriptorVisibility descriptorVisibility0, Kind callableMemberDescriptor$Kind0, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List getContextReceiverParameters() {
        List list0 = this.getCorrespondingProperty().getContextReceiverParameters();
        if(list0 != null) {
            return list0;
        }
        PropertyAccessorDescriptorImpl.a(14);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor
    @NotNull
    public PropertyDescriptor getCorrespondingProperty() {
        PropertyDescriptor propertyDescriptor0 = this.h;
        if(propertyDescriptor0 != null) {
            return propertyDescriptor0;
        }
        PropertyAccessorDescriptorImpl.a(13);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return this.getCorrespondingProperty().getDispatchReceiverParameter();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return this.getCorrespondingProperty().getExtensionReceiverParameter();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @Nullable
    public FunctionDescriptor getInitialSignatureDescriptor() {
        return this.l;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public Kind getKind() {
        Kind callableMemberDescriptor$Kind0 = this.j;
        if(callableMemberDescriptor$Kind0 != null) {
            return callableMemberDescriptor$Kind0;
        }
        PropertyAccessorDescriptorImpl.a(6);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        Modality modality0 = this.g;
        if(modality0 != null) {
            return modality0;
        }
        PropertyAccessorDescriptorImpl.a(10);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public CallableDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    @NotNull
    public DeclarationDescriptorWithSource getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    public FunctionDescriptor getOriginal() {
        return this.getOriginal();
    }

    @NotNull
    public abstract PropertyAccessorDescriptor getOriginal();

    @NotNull
    public Collection getOverriddenDescriptors(boolean z) {
        Collection collection0 = new ArrayList(0);
        for(Object object0: this.getCorrespondingProperty().getOverriddenDescriptors()) {
            PropertyDescriptor propertyDescriptor0 = (PropertyDescriptor)object0;
            PropertyGetterDescriptor propertyGetterDescriptor0 = z ? propertyDescriptor0.getGetter() : propertyDescriptor0.getSetter();
            if(propertyGetterDescriptor0 != null) {
                ((ArrayList)collection0).add(propertyGetterDescriptor0);
            }
        }
        return collection0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List getTypeParameters() {
        List list0 = Collections.emptyList();
        if(list0 != null) {
            return list0;
        }
        PropertyAccessorDescriptorImpl.a(9);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public Object getUserData(UserDataKey callableDescriptor$UserDataKey0) {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility0 = this.k;
        if(descriptorVisibility0 != null) {
            return descriptorVisibility0;
        }
        PropertyAccessorDescriptorImpl.a(11);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor
    public boolean isDefault() {
        return this.e;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isHiddenForResolutionEverywhereBesideSupercalls() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isHiddenToOvercomeSignatureClash() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInfix() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return this.i;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isOperator() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isTailrec() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    public CopyBuilder newCopyBuilder() {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    public void setDefault(boolean z) {
        this.e = z;
    }

    public void setInitialSignatureDescriptor(@Nullable FunctionDescriptor functionDescriptor0) {
        this.l = functionDescriptor0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void setOverriddenDescriptors(@NotNull Collection collection0) {
        if(collection0 != null) {
            return;
        }
        PropertyAccessorDescriptorImpl.a(16);
        throw null;
    }

    public void setVisibility(DescriptorVisibility descriptorVisibility0) {
        this.k = descriptorVisibility0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    public DeclarationDescriptorNonRoot substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        return this.substitute(typeSubstitutor0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    public FunctionDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        if(typeSubstitutor0 != null) {
            return this;
        }
        PropertyAccessorDescriptorImpl.a(7);
        throw null;
    }
}

