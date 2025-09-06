package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class VariableDescriptorImpl extends DeclarationDescriptorNonRootImpl implements VariableDescriptor {
    protected KotlinType outType;

    public VariableDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Annotations annotations0, @NotNull Name name0, @Nullable KotlinType kotlinType0, @NotNull SourceElement sourceElement0) {
        if(declarationDescriptor0 != null) {
            if(annotations0 != null) {
                if(name0 != null) {
                    if(sourceElement0 != null) {
                        super(declarationDescriptor0, annotations0, name0, sourceElement0);
                        this.outType = kotlinType0;
                        return;
                    }
                    VariableDescriptorImpl.a(3);
                    throw null;
                }
                VariableDescriptorImpl.a(2);
                throw null;
            }
            VariableDescriptorImpl.a(1);
            throw null;
        }
        VariableDescriptorImpl.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
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
            case 10: {
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
            case 10: {
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
                arr_object[0] = "annotations";
                break;
            }
            case 2: {
                arr_object[0] = "name";
                break;
            }
            case 3: {
                arr_object[0] = "source";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        switch(v) {
            case 4: {
                arr_object[1] = "getType";
                break;
            }
            case 5: {
                arr_object[1] = "getOriginal";
                break;
            }
            case 6: {
                arr_object[1] = "getValueParameters";
                break;
            }
            case 7: {
                arr_object[1] = "getOverriddenDescriptors";
                break;
            }
            case 8: {
                arr_object[1] = "getTypeParameters";
                break;
            }
            case 9: {
                arr_object[1] = "getContextReceiverParameters";
                break;
            }
            case 10: {
                arr_object[1] = "getReturnType";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
            }
        }
        switch(v) {
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: {
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
            case 10: {
                illegalArgumentException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List getContextReceiverParameters() {
        List list0 = Collections.emptyList();
        if(list0 != null) {
            return list0;
        }
        VariableDescriptorImpl.a(9);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public CallableDescriptor getOriginal() {
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

    @NotNull
    public VariableDescriptor getOriginal() {
        VariableDescriptor variableDescriptor0 = (VariableDescriptor)super.getOriginal();
        if(variableDescriptor0 != null) {
            return variableDescriptor0;
        }
        VariableDescriptorImpl.a(5);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public Collection getOverriddenDescriptors() {
        Collection collection0 = Collections.emptySet();
        if(collection0 != null) {
            return collection0;
        }
        VariableDescriptorImpl.a(7);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public KotlinType getReturnType() {
        KotlinType kotlinType0 = this.getType();
        if(kotlinType0 != null) {
            return kotlinType0;
        }
        VariableDescriptorImpl.a(10);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor
    @NotNull
    public KotlinType getType() {
        KotlinType kotlinType0 = this.outType;
        if(kotlinType0 != null) {
            return kotlinType0;
        }
        VariableDescriptorImpl.a(4);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List getTypeParameters() {
        List list0 = Collections.emptyList();
        if(list0 != null) {
            return list0;
        }
        VariableDescriptorImpl.a(8);
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
        VariableDescriptorImpl.a(6);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return false;
    }

    public void setOutType(KotlinType kotlinType0) {
        this.outType = kotlinType0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public DeclarationDescriptorNonRoot substitute(TypeSubstitutor typeSubstitutor0) {
        return this.substitute(typeSubstitutor0);
    }
}

