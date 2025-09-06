package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ClassConstructorDescriptorImpl extends FunctionDescriptorImpl implements ClassConstructorDescriptor {
    protected final boolean isPrimary;

    public ClassConstructorDescriptorImpl(@NotNull ClassDescriptor classDescriptor0, @Nullable ConstructorDescriptor constructorDescriptor0, @NotNull Annotations annotations0, boolean z, @NotNull Kind callableMemberDescriptor$Kind0, @NotNull SourceElement sourceElement0) {
        if(classDescriptor0 != null) {
            if(annotations0 != null) {
                if(callableMemberDescriptor$Kind0 != null) {
                    if(sourceElement0 != null) {
                        super(classDescriptor0, constructorDescriptor0, annotations0, SpecialNames.INIT, callableMemberDescriptor$Kind0, sourceElement0);
                        this.isPrimary = z;
                        return;
                    }
                    ClassConstructorDescriptorImpl.a(3);
                    throw null;
                }
                ClassConstructorDescriptorImpl.a(2);
                throw null;
            }
            ClassConstructorDescriptorImpl.a(1);
            throw null;
        }
        ClassConstructorDescriptorImpl.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 21 || v == 27 || (v == 15 || v == 16 || v == 17 || v == 18 || v == 19) ? 2 : 3)];
        switch(v) {
            case 12: {
                arr_object[0] = "typeParameterDescriptors";
                break;
            }
            case 10: 
            case 13: {
                arr_object[0] = "unsubstitutedValueParameters";
                break;
            }
            case 11: 
            case 14: {
                arr_object[0] = "visibility";
                break;
            }
            case 20: {
                arr_object[0] = "originalSubstitutor";
                break;
            }
            case 22: {
                arr_object[0] = "overriddenDescriptors";
                break;
            }
            case 23: {
                arr_object[0] = "newOwner";
                break;
            }
            case 2: 
            case 24: {
                arr_object[0] = "kind";
                break;
            }
            case 1: 
            case 5: 
            case 8: 
            case 25: {
                arr_object[0] = "annotations";
                break;
            }
            case 3: 
            case 6: 
            case 9: 
            case 26: {
                arr_object[0] = "source";
                break;
            }
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 21: 
            case 27: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        switch(v) {
            case 15: 
            case 16: {
                arr_object[1] = "calculateContextReceiverParameters";
                break;
            }
            case 17: {
                arr_object[1] = "getContainingDeclaration";
                break;
            }
            case 18: {
                arr_object[1] = "getConstructedClass";
                break;
            }
            case 19: {
                arr_object[1] = "getOriginal";
                break;
            }
            case 21: {
                arr_object[1] = "getOverriddenDescriptors";
                break;
            }
            case 27: {
                arr_object[1] = "copy";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
            }
        }
        switch(v) {
            case 4: 
            case 5: 
            case 6: {
                arr_object[2] = "create";
                break;
            }
            case 7: 
            case 8: 
            case 9: {
                arr_object[2] = "createSynthesized";
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: {
                arr_object[2] = "initialize";
                break;
            }
            case 20: {
                arr_object[2] = "substitute";
                break;
            }
            case 22: {
                arr_object[2] = "setOverriddenDescriptors";
                break;
            }
            case 23: 
            case 24: 
            case 25: 
            case 26: {
                arr_object[2] = "createSubstitutedCopy";
                break;
            }
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 21: 
            case 27: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s = String.format((v == 21 || v == 27 || (v == 15 || v == 16 || v == 17 || v == 18 || v == 19) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 21 || v == 27 || (v == 15 || v == 16 || v == 17 || v == 18 || v == 19) ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public Object accept(DeclarationDescriptorVisitor declarationDescriptorVisitor0, Object object0) {
        return declarationDescriptorVisitor0.visitConstructorDescriptor(this, object0);
    }

    @Nullable
    public ReceiverParameterDescriptor calculateDispatchReceiverParameter() {
        ClassDescriptor classDescriptor0 = this.getContainingDeclaration();
        if(classDescriptor0.isInner()) {
            DeclarationDescriptor declarationDescriptor0 = classDescriptor0.getContainingDeclaration();
            return declarationDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)declarationDescriptor0).getThisAsReceiverParameter() : null;
        }
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor copy(DeclarationDescriptor declarationDescriptor0, Modality modality0, DescriptorVisibility descriptorVisibility0, Kind callableMemberDescriptor$Kind0, boolean z) {
        return this.copy(declarationDescriptor0, modality0, descriptorVisibility0, callableMemberDescriptor$Kind0, z);
    }

    @NotNull
    public ClassConstructorDescriptor copy(DeclarationDescriptor declarationDescriptor0, Modality modality0, DescriptorVisibility descriptorVisibility0, Kind callableMemberDescriptor$Kind0, boolean z) {
        ClassConstructorDescriptor classConstructorDescriptor0 = (ClassConstructorDescriptor)super.copy(declarationDescriptor0, modality0, descriptorVisibility0, callableMemberDescriptor$Kind0, z);
        if(classConstructorDescriptor0 != null) {
            return classConstructorDescriptor0;
        }
        ClassConstructorDescriptorImpl.a(27);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    public FunctionDescriptor copy(DeclarationDescriptor declarationDescriptor0, Modality modality0, DescriptorVisibility descriptorVisibility0, Kind callableMemberDescriptor$Kind0, boolean z) {
        return this.copy(declarationDescriptor0, modality0, descriptorVisibility0, callableMemberDescriptor$Kind0, z);
    }

    @NotNull
    public static ClassConstructorDescriptorImpl create(@NotNull ClassDescriptor classDescriptor0, @NotNull Annotations annotations0, boolean z, @NotNull SourceElement sourceElement0) {
        if(classDescriptor0 != null) {
            if(annotations0 != null) {
                if(sourceElement0 != null) {
                    return new ClassConstructorDescriptorImpl(classDescriptor0, null, annotations0, z, Kind.DECLARATION, sourceElement0);
                }
                ClassConstructorDescriptorImpl.a(6);
                throw null;
            }
            ClassConstructorDescriptorImpl.a(5);
            throw null;
        }
        ClassConstructorDescriptorImpl.a(4);
        throw null;
    }

    @NotNull
    public ClassConstructorDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor0, @Nullable FunctionDescriptor functionDescriptor0, @NotNull Kind callableMemberDescriptor$Kind0, @Nullable Name name0, @NotNull Annotations annotations0, @NotNull SourceElement sourceElement0) {
        if(declarationDescriptor0 != null) {
            if(callableMemberDescriptor$Kind0 != null) {
                if(annotations0 != null) {
                    if(sourceElement0 != null) {
                        Kind callableMemberDescriptor$Kind1 = Kind.DECLARATION;
                        if(callableMemberDescriptor$Kind0 != callableMemberDescriptor$Kind1 && callableMemberDescriptor$Kind0 != Kind.SYNTHESIZED) {
                            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + declarationDescriptor0 + "\nkind: " + callableMemberDescriptor$Kind0);
                        }
                        return new ClassConstructorDescriptorImpl(((ClassDescriptor)declarationDescriptor0), this, annotations0, this.isPrimary, callableMemberDescriptor$Kind1, sourceElement0);
                    }
                    ClassConstructorDescriptorImpl.a(26);
                    throw null;
                }
                ClassConstructorDescriptorImpl.a(25);
                throw null;
            }
            ClassConstructorDescriptorImpl.a(24);
            throw null;
        }
        ClassConstructorDescriptorImpl.a(23);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    public FunctionDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor0, @Nullable FunctionDescriptor functionDescriptor0, @NotNull Kind callableMemberDescriptor$Kind0, @Nullable Name name0, @NotNull Annotations annotations0, @NotNull SourceElement sourceElement0) {
        return this.createSubstitutedCopy(declarationDescriptor0, functionDescriptor0, callableMemberDescriptor$Kind0, name0, annotations0, sourceElement0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    @NotNull
    public ClassDescriptor getConstructedClass() {
        ClassDescriptor classDescriptor0 = this.getContainingDeclaration();
        if(classDescriptor0 != null) {
            return classDescriptor0;
        }
        ClassConstructorDescriptorImpl.a(18);
        throw null;
    }

    @NotNull
    public ClassDescriptor getContainingDeclaration() {
        ClassDescriptor classDescriptor0 = (ClassDescriptor)super.getContainingDeclaration();
        if(classDescriptor0 != null) {
            return classDescriptor0;
        }
        ClassConstructorDescriptorImpl.a(17);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    @NotNull
    public ClassifierDescriptorWithTypeParameters getContainingDeclaration() {
        return this.getContainingDeclaration();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    public DeclarationDescriptor getContainingDeclaration() {
        return this.getContainingDeclaration();
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

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor
    @NotNull
    public ClassConstructorDescriptor getOriginal() {
        ClassConstructorDescriptor classConstructorDescriptor0 = (ClassConstructorDescriptor)super.getOriginal();
        if(classConstructorDescriptor0 != null) {
            return classConstructorDescriptor0;
        }
        ClassConstructorDescriptorImpl.a(19);
        throw null;
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

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    public Collection getOverriddenDescriptors() {
        Collection collection0 = Collections.emptySet();
        if(collection0 != null) {
            return collection0;
        }
        ClassConstructorDescriptorImpl.a(21);
        throw null;
    }

    public ClassConstructorDescriptorImpl initialize(@NotNull List list0, @NotNull DescriptorVisibility descriptorVisibility0) {
        if(list0 != null) {
            if(descriptorVisibility0 != null) {
                this.initialize(list0, descriptorVisibility0, this.getContainingDeclaration().getDeclaredTypeParameters());
                return this;
            }
            ClassConstructorDescriptorImpl.a(14);
            throw null;
        }
        ClassConstructorDescriptorImpl.a(13);
        throw null;
    }

    public ClassConstructorDescriptorImpl initialize(@NotNull List list0, @NotNull DescriptorVisibility descriptorVisibility0, @NotNull List list1) {
        List list2;
        if(list0 != null) {
            if(descriptorVisibility0 != null) {
                if(list1 != null) {
                    ReceiverParameterDescriptor receiverParameterDescriptor0 = this.calculateDispatchReceiverParameter();
                    ClassDescriptor classDescriptor0 = this.getContainingDeclaration();
                    if(classDescriptor0.getContextReceivers().isEmpty()) {
                        list2 = Collections.emptyList();
                        if(list2 == null) {
                            ClassConstructorDescriptorImpl.a(16);
                            throw null;
                        }
                    }
                    else {
                        list2 = classDescriptor0.getContextReceivers();
                        if(list2 == null) {
                            ClassConstructorDescriptorImpl.a(15);
                            throw null;
                        }
                    }
                    super.initialize(null, receiverParameterDescriptor0, list2, list1, list0, null, Modality.FINAL, descriptorVisibility0);
                    return this;
                }
                ClassConstructorDescriptorImpl.a(12);
                throw null;
            }
            ClassConstructorDescriptorImpl.a(11);
            throw null;
        }
        ClassConstructorDescriptorImpl.a(10);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public boolean isPrimary() {
        return this.isPrimary;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void setOverriddenDescriptors(@NotNull Collection collection0) {
        if(collection0 != null) {
            return;
        }
        ClassConstructorDescriptorImpl.a(22);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor
    @Nullable
    public ClassConstructorDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        if(typeSubstitutor0 != null) {
            return (ClassConstructorDescriptor)super.substitute(typeSubstitutor0);
        }
        ClassConstructorDescriptorImpl.a(20);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    @Nullable
    public ConstructorDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        return this.substitute(typeSubstitutor0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @Nullable
    public DeclarationDescriptorNonRoot substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        return this.substitute(typeSubstitutor0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @Nullable
    public FunctionDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        return this.substitute(typeSubstitutor0);
    }
}

