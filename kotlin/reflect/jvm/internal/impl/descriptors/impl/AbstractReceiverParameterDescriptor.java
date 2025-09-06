package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.TransientReceiver;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractReceiverParameterDescriptor extends DeclarationDescriptorImpl implements ReceiverParameterDescriptor {
    public AbstractReceiverParameterDescriptor(@NotNull Annotations annotations0) {
        if(annotations0 != null) {
            super(annotations0, SpecialNames.THIS);
            return;
        }
        AbstractReceiverParameterDescriptor.a(0);
        throw null;
    }

    public AbstractReceiverParameterDescriptor(@NotNull Annotations annotations0, @NotNull Name name0) {
        if(annotations0 != null) {
            if(name0 != null) {
                super(annotations0, name0);
                return;
            }
            AbstractReceiverParameterDescriptor.a(2);
            throw null;
        }
        AbstractReceiverParameterDescriptor.a(1);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public static void a(int v) {
        IllegalArgumentException illegalArgumentException0;
        int v1;
        String s;
        switch(v) {
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 2: {
                arr_object[0] = "name";
                break;
            }
            case 3: {
                arr_object[0] = "substitutor";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            }
            default: {
                arr_object[0] = "annotations";
            }
        }
        switch(v) {
            case 4: {
                arr_object[1] = "getContextReceiverParameters";
                break;
            }
            case 5: {
                arr_object[1] = "getTypeParameters";
                break;
            }
            case 6: {
                arr_object[1] = "getType";
                break;
            }
            case 7: {
                arr_object[1] = "getValueParameters";
                break;
            }
            case 8: {
                arr_object[1] = "getOverriddenDescriptors";
                break;
            }
            case 9: {
                arr_object[1] = "getVisibility";
                break;
            }
            case 10: {
                arr_object[1] = "getOriginal";
                break;
            }
            case 11: {
                arr_object[1] = "getSource";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
            }
        }
        switch(v) {
            case 3: {
                arr_object[2] = "substitute";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                illegalArgumentException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public Object accept(DeclarationDescriptorVisitor declarationDescriptorVisitor0, Object object0) {
        return declarationDescriptorVisitor0.visitReceiverParameterDescriptor(this, object0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List getContextReceiverParameters() {
        List list0 = Collections.emptyList();
        if(list0 != null) {
            return list0;
        }
        AbstractReceiverParameterDescriptor.a(4);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public CallableDescriptor getOriginal() {
        return this;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getOriginal() {
        return this;
    }

    @NotNull
    public ParameterDescriptor getOriginal() [...] // Inlined contents

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public Collection getOverriddenDescriptors() {
        Collection collection0 = Collections.emptySet();
        if(collection0 != null) {
            return collection0;
        }
        AbstractReceiverParameterDescriptor.a(8);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public KotlinType getReturnType() {
        return this.getType();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement0 = SourceElement.NO_SOURCE;
        if(sourceElement0 != null) {
            return sourceElement0;
        }
        AbstractReceiverParameterDescriptor.a(11);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor
    @NotNull
    public KotlinType getType() {
        KotlinType kotlinType0 = this.getValue().getType();
        if(kotlinType0 != null) {
            return kotlinType0;
        }
        AbstractReceiverParameterDescriptor.a(6);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List getTypeParameters() {
        List list0 = Collections.emptyList();
        if(list0 != null) {
            return list0;
        }
        AbstractReceiverParameterDescriptor.a(5);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public Object getUserData(UserDataKey callableDescriptor$UserDataKey0) {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List getValueParameters() {
        List list0 = Collections.emptyList();
        if(list0 != null) {
            return list0;
        }
        AbstractReceiverParameterDescriptor.a(7);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility0 = DescriptorVisibilities.LOCAL;
        if(descriptorVisibility0 != null) {
            return descriptorVisibility0;
        }
        AbstractReceiverParameterDescriptor.a(9);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @Nullable
    public DeclarationDescriptorNonRoot substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        return this.substitute(typeSubstitutor0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor
    @Nullable
    public ReceiverParameterDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        if(typeSubstitutor0 != null) {
            if(typeSubstitutor0.isEmpty()) {
                return this;
            }
            KotlinType kotlinType0 = this.getContainingDeclaration() instanceof ClassDescriptor ? typeSubstitutor0.substitute(this.getType(), Variance.OUT_VARIANCE) : typeSubstitutor0.substitute(this.getType(), Variance.INVARIANT);
            if(kotlinType0 == null) {
                return null;
            }
            return kotlinType0 == this.getType() ? this : new ReceiverParameterDescriptorImpl(this.getContainingDeclaration(), new TransientReceiver(kotlinType0), this.getAnnotations());
        }
        AbstractReceiverParameterDescriptor.a(3);
        throw null;
    }
}

