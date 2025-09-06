package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SimpleFunctionDescriptorImpl extends FunctionDescriptorImpl implements SimpleFunctionDescriptor {
    public SimpleFunctionDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor0, @Nullable SimpleFunctionDescriptor simpleFunctionDescriptor0, @NotNull Annotations annotations0, @NotNull Name name0, @NotNull Kind callableMemberDescriptor$Kind0, @NotNull SourceElement sourceElement0) {
        if(declarationDescriptor0 != null) {
            if(annotations0 != null) {
                if(name0 != null) {
                    if(callableMemberDescriptor$Kind0 != null) {
                        if(sourceElement0 != null) {
                            super(declarationDescriptor0, simpleFunctionDescriptor0, annotations0, name0, callableMemberDescriptor$Kind0, sourceElement0);
                            return;
                        }
                        SimpleFunctionDescriptorImpl.a(4);
                        throw null;
                    }
                    SimpleFunctionDescriptorImpl.a(3);
                    throw null;
                }
                SimpleFunctionDescriptorImpl.a(2);
                throw null;
            }
            SimpleFunctionDescriptorImpl.a(1);
            throw null;
        }
        SimpleFunctionDescriptorImpl.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public static void a(int v) {
        IllegalStateException illegalStateException0;
        int v1;
        String s;
        switch(v) {
            case 13: 
            case 18: 
            case 23: 
            case 24: 
            case 29: 
            case 30: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 13: 
            case 18: 
            case 23: 
            case 24: 
            case 29: 
            case 30: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 2: 
            case 7: {
                arr_object[0] = "name";
                break;
            }
            case 14: 
            case 19: {
                arr_object[0] = "contextReceiverParameters";
                break;
            }
            case 10: 
            case 15: 
            case 20: {
                arr_object[0] = "typeParameters";
                break;
            }
            case 11: 
            case 16: 
            case 21: {
                arr_object[0] = "unsubstitutedValueParameters";
                break;
            }
            case 12: 
            case 17: 
            case 22: {
                arr_object[0] = "visibility";
                break;
            }
            case 25: {
                arr_object[0] = "newOwner";
                break;
            }
            case 3: 
            case 8: 
            case 26: {
                arr_object[0] = "kind";
                break;
            }
            case 1: 
            case 6: 
            case 27: {
                arr_object[0] = "annotations";
                break;
            }
            case 4: 
            case 9: 
            case 28: {
                arr_object[0] = "source";
                break;
            }
            case 13: 
            case 18: 
            case 23: 
            case 24: 
            case 29: 
            case 30: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        switch(v) {
            case 13: 
            case 18: 
            case 23: {
                arr_object[1] = "initialize";
                break;
            }
            case 24: {
                arr_object[1] = "getOriginal";
                break;
            }
            case 29: {
                arr_object[1] = "copy";
                break;
            }
            case 30: {
                arr_object[1] = "newCopyBuilder";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
            }
        }
        switch(v) {
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                arr_object[2] = "create";
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 19: 
            case 20: 
            case 21: 
            case 22: {
                arr_object[2] = "initialize";
                break;
            }
            case 25: 
            case 26: 
            case 27: 
            case 28: {
                arr_object[2] = "createSubstitutedCopy";
                break;
            }
            case 13: 
            case 18: 
            case 23: 
            case 24: 
            case 29: 
            case 30: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 13: 
            case 18: 
            case 23: 
            case 24: 
            case 29: 
            case 30: {
                illegalStateException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalStateException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalStateException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor copy(DeclarationDescriptor declarationDescriptor0, Modality modality0, DescriptorVisibility descriptorVisibility0, Kind callableMemberDescriptor$Kind0, boolean z) {
        return this.copy(declarationDescriptor0, modality0, descriptorVisibility0, callableMemberDescriptor$Kind0, z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    public FunctionDescriptor copy(DeclarationDescriptor declarationDescriptor0, Modality modality0, DescriptorVisibility descriptorVisibility0, Kind callableMemberDescriptor$Kind0, boolean z) {
        return this.copy(declarationDescriptor0, modality0, descriptorVisibility0, callableMemberDescriptor$Kind0, z);
    }

    @NotNull
    public SimpleFunctionDescriptor copy(DeclarationDescriptor declarationDescriptor0, Modality modality0, DescriptorVisibility descriptorVisibility0, Kind callableMemberDescriptor$Kind0, boolean z) {
        SimpleFunctionDescriptor simpleFunctionDescriptor0 = (SimpleFunctionDescriptor)super.copy(declarationDescriptor0, modality0, descriptorVisibility0, callableMemberDescriptor$Kind0, z);
        if(simpleFunctionDescriptor0 != null) {
            return simpleFunctionDescriptor0;
        }
        SimpleFunctionDescriptorImpl.a(29);
        throw null;
    }

    @NotNull
    public static SimpleFunctionDescriptorImpl create(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Annotations annotations0, @NotNull Name name0, @NotNull Kind callableMemberDescriptor$Kind0, @NotNull SourceElement sourceElement0) {
        if(declarationDescriptor0 != null) {
            if(annotations0 != null) {
                if(name0 != null) {
                    if(callableMemberDescriptor$Kind0 != null) {
                        if(sourceElement0 != null) {
                            return new SimpleFunctionDescriptorImpl(declarationDescriptor0, null, annotations0, name0, callableMemberDescriptor$Kind0, sourceElement0);
                        }
                        SimpleFunctionDescriptorImpl.a(9);
                        throw null;
                    }
                    SimpleFunctionDescriptorImpl.a(8);
                    throw null;
                }
                SimpleFunctionDescriptorImpl.a(7);
                throw null;
            }
            SimpleFunctionDescriptorImpl.a(6);
            throw null;
        }
        SimpleFunctionDescriptorImpl.a(5);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    public FunctionDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor0, @Nullable FunctionDescriptor functionDescriptor0, @NotNull Kind callableMemberDescriptor$Kind0, @Nullable Name name0, @NotNull Annotations annotations0, @NotNull SourceElement sourceElement0) {
        if(declarationDescriptor0 != null) {
            if(callableMemberDescriptor$Kind0 != null) {
                if(annotations0 != null) {
                    if(sourceElement0 != null) {
                        return name0 == null ? new SimpleFunctionDescriptorImpl(declarationDescriptor0, ((SimpleFunctionDescriptor)functionDescriptor0), annotations0, this.getName(), callableMemberDescriptor$Kind0, sourceElement0) : new SimpleFunctionDescriptorImpl(declarationDescriptor0, ((SimpleFunctionDescriptor)functionDescriptor0), annotations0, name0, callableMemberDescriptor$Kind0, sourceElement0);
                    }
                    SimpleFunctionDescriptorImpl.a(28);
                    throw null;
                }
                SimpleFunctionDescriptorImpl.a(27);
                throw null;
            }
            SimpleFunctionDescriptorImpl.a(26);
            throw null;
        }
        SimpleFunctionDescriptorImpl.a(25);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public CallableDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    public DeclarationDescriptorWithSource getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    public FunctionDescriptor getOriginal() {
        return this.getOriginal();
    }

    @NotNull
    public SimpleFunctionDescriptor getOriginal() {
        SimpleFunctionDescriptor simpleFunctionDescriptor0 = (SimpleFunctionDescriptor)super.getOriginal();
        if(simpleFunctionDescriptor0 != null) {
            return simpleFunctionDescriptor0;
        }
        SimpleFunctionDescriptorImpl.a(24);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    public FunctionDescriptorImpl initialize(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor0, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor1, @NotNull List list0, @NotNull List list1, @NotNull List list2, @Nullable KotlinType kotlinType0, @Nullable Modality modality0, @NotNull DescriptorVisibility descriptorVisibility0) {
        return this.initialize(receiverParameterDescriptor0, receiverParameterDescriptor1, list0, list1, list2, kotlinType0, modality0, descriptorVisibility0);
    }

    @NotNull
    public SimpleFunctionDescriptorImpl initialize(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor0, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor1, @NotNull List list0, @NotNull List list1, @NotNull List list2, @Nullable KotlinType kotlinType0, @Nullable Modality modality0, @NotNull DescriptorVisibility descriptorVisibility0) {
        if(list0 != null) {
            if(list1 != null) {
                if(list2 != null) {
                    if(descriptorVisibility0 != null) {
                        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImpl0 = this.initialize(receiverParameterDescriptor0, receiverParameterDescriptor1, list0, list1, list2, kotlinType0, modality0, descriptorVisibility0, null);
                        if(simpleFunctionDescriptorImpl0 != null) {
                            return simpleFunctionDescriptorImpl0;
                        }
                        SimpleFunctionDescriptorImpl.a(18);
                        throw null;
                    }
                    SimpleFunctionDescriptorImpl.a(17);
                    throw null;
                }
                SimpleFunctionDescriptorImpl.a(16);
                throw null;
            }
            SimpleFunctionDescriptorImpl.a(15);
            throw null;
        }
        SimpleFunctionDescriptorImpl.a(14);
        throw null;
    }

    @NotNull
    public SimpleFunctionDescriptorImpl initialize(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor0, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor1, @NotNull List list0, @NotNull List list1, @NotNull List list2, @Nullable KotlinType kotlinType0, @Nullable Modality modality0, @NotNull DescriptorVisibility descriptorVisibility0, @Nullable Map map0) {
        if(list0 != null) {
            if(list1 != null) {
                if(list2 != null) {
                    if(descriptorVisibility0 != null) {
                        super.initialize(receiverParameterDescriptor0, receiverParameterDescriptor1, list0, list1, list2, kotlinType0, modality0, descriptorVisibility0);
                        if(map0 != null && !map0.isEmpty()) {
                            this.userDataMap = new LinkedHashMap(map0);
                        }
                        return this;
                    }
                    SimpleFunctionDescriptorImpl.a(22);
                    throw null;
                }
                SimpleFunctionDescriptorImpl.a(21);
                throw null;
            }
            SimpleFunctionDescriptorImpl.a(20);
            throw null;
        }
        SimpleFunctionDescriptorImpl.a(19);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor
    @NotNull
    public CopyBuilder newCopyBuilder() {
        CopyBuilder functionDescriptor$CopyBuilder0 = super.newCopyBuilder();
        if(functionDescriptor$CopyBuilder0 != null) {
            return functionDescriptor$CopyBuilder0;
        }
        SimpleFunctionDescriptorImpl.a(30);
        throw null;
    }
}

