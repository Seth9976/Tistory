package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JavaClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements JavaCallableMemberDescriptor {
    public Boolean D;
    public Boolean E;

    public JavaClassConstructorDescriptor(@NotNull ClassDescriptor classDescriptor0, @Nullable JavaClassConstructorDescriptor javaClassConstructorDescriptor0, @NotNull Annotations annotations0, boolean z, @NotNull Kind callableMemberDescriptor$Kind0, @NotNull SourceElement sourceElement0) {
        if(classDescriptor0 != null) {
            if(annotations0 != null) {
                if(callableMemberDescriptor$Kind0 != null) {
                    if(sourceElement0 != null) {
                        super(classDescriptor0, javaClassConstructorDescriptor0, annotations0, z, callableMemberDescriptor$Kind0, sourceElement0);
                        this.D = null;
                        this.E = null;
                        return;
                    }
                    JavaClassConstructorDescriptor.a(3);
                    throw null;
                }
                JavaClassConstructorDescriptor.a(2);
                throw null;
            }
            JavaClassConstructorDescriptor.a(1);
            throw null;
        }
        JavaClassConstructorDescriptor.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 11 || v == 18 ? 2 : 3)];
        switch(v) {
            case 3: 
            case 6: 
            case 10: {
                arr_object[0] = "source";
                break;
            }
            case 7: 
            case 12: {
                arr_object[0] = "newOwner";
                break;
            }
            case 2: 
            case 8: 
            case 13: {
                arr_object[0] = "kind";
                break;
            }
            case 14: {
                arr_object[0] = "sourceElement";
                break;
            }
            case 1: 
            case 5: 
            case 9: 
            case 15: {
                arr_object[0] = "annotations";
                break;
            }
            case 16: {
                arr_object[0] = "enhancedValueParameterTypes";
                break;
            }
            case 17: {
                arr_object[0] = "enhancedReturnType";
                break;
            }
            case 11: 
            case 18: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        switch(v) {
            case 11: {
                arr_object[1] = "createSubstitutedCopy";
                break;
            }
            case 18: {
                arr_object[1] = "enhance";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
            }
        }
        switch(v) {
            case 4: 
            case 5: 
            case 6: {
                arr_object[2] = "createJavaConstructor";
                break;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                arr_object[2] = "createSubstitutedCopy";
                break;
            }
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                arr_object[2] = "createDescriptor";
                break;
            }
            case 16: 
            case 17: {
                arr_object[2] = "enhance";
                break;
            }
            case 11: 
            case 18: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s = String.format((v == 11 || v == 18 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 11 || v == 18 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @NotNull
    public JavaClassConstructorDescriptor createDescriptor(@NotNull ClassDescriptor classDescriptor0, @Nullable JavaClassConstructorDescriptor javaClassConstructorDescriptor0, @NotNull Kind callableMemberDescriptor$Kind0, @NotNull SourceElement sourceElement0, @NotNull Annotations annotations0) {
        if(classDescriptor0 != null) {
            if(callableMemberDescriptor$Kind0 != null) {
                if(sourceElement0 != null) {
                    if(annotations0 != null) {
                        return new JavaClassConstructorDescriptor(classDescriptor0, javaClassConstructorDescriptor0, annotations0, this.isPrimary, callableMemberDescriptor$Kind0, sourceElement0);
                    }
                    JavaClassConstructorDescriptor.a(15);
                    throw null;
                }
                JavaClassConstructorDescriptor.a(14);
                throw null;
            }
            JavaClassConstructorDescriptor.a(13);
            throw null;
        }
        JavaClassConstructorDescriptor.a(12);
        throw null;
    }

    @NotNull
    public static JavaClassConstructorDescriptor createJavaConstructor(@NotNull ClassDescriptor classDescriptor0, @NotNull Annotations annotations0, boolean z, @NotNull SourceElement sourceElement0) {
        if(classDescriptor0 != null) {
            if(annotations0 != null) {
                if(sourceElement0 != null) {
                    return new JavaClassConstructorDescriptor(classDescriptor0, null, annotations0, z, Kind.DECLARATION, sourceElement0);
                }
                JavaClassConstructorDescriptor.a(6);
                throw null;
            }
            JavaClassConstructorDescriptor.a(5);
            throw null;
        }
        JavaClassConstructorDescriptor.a(4);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl
    @NotNull
    public ClassConstructorDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor0, @Nullable FunctionDescriptor functionDescriptor0, @NotNull Kind callableMemberDescriptor$Kind0, @Nullable Name name0, @NotNull Annotations annotations0, @NotNull SourceElement sourceElement0) {
        return this.createSubstitutedCopy(declarationDescriptor0, functionDescriptor0, callableMemberDescriptor$Kind0, name0, annotations0, sourceElement0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl
    @NotNull
    public FunctionDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor0, @Nullable FunctionDescriptor functionDescriptor0, @NotNull Kind callableMemberDescriptor$Kind0, @Nullable Name name0, @NotNull Annotations annotations0, @NotNull SourceElement sourceElement0) {
        return this.createSubstitutedCopy(declarationDescriptor0, functionDescriptor0, callableMemberDescriptor$Kind0, name0, annotations0, sourceElement0);
    }

    @NotNull
    public JavaClassConstructorDescriptor createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor0, @Nullable FunctionDescriptor functionDescriptor0, @NotNull Kind callableMemberDescriptor$Kind0, @Nullable Name name0, @NotNull Annotations annotations0, @NotNull SourceElement sourceElement0) {
        if(declarationDescriptor0 != null) {
            if(callableMemberDescriptor$Kind0 != null) {
                if(annotations0 != null) {
                    if(sourceElement0 != null) {
                        if(callableMemberDescriptor$Kind0 != Kind.DECLARATION && callableMemberDescriptor$Kind0 != Kind.SYNTHESIZED) {
                            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + declarationDescriptor0 + "\nkind: " + callableMemberDescriptor$Kind0);
                        }
                        JavaClassConstructorDescriptor javaClassConstructorDescriptor0 = this.createDescriptor(((ClassDescriptor)declarationDescriptor0), ((JavaClassConstructorDescriptor)functionDescriptor0), callableMemberDescriptor$Kind0, sourceElement0, annotations0);
                        javaClassConstructorDescriptor0.setHasStableParameterNames(this.hasStableParameterNames());
                        javaClassConstructorDescriptor0.setHasSynthesizedParameterNames(this.hasSynthesizedParameterNames());
                        return javaClassConstructorDescriptor0;
                    }
                    JavaClassConstructorDescriptor.a(10);
                    throw null;
                }
                JavaClassConstructorDescriptor.a(9);
                throw null;
            }
            JavaClassConstructorDescriptor.a(8);
            throw null;
        }
        JavaClassConstructorDescriptor.a(7);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    @NotNull
    public JavaCallableMemberDescriptor enhance(@Nullable KotlinType kotlinType0, @NotNull List list0, @NotNull KotlinType kotlinType1, @Nullable Pair pair0) {
        return this.enhance(kotlinType0, list0, kotlinType1, pair0);
    }

    @NotNull
    public JavaClassConstructorDescriptor enhance(@Nullable KotlinType kotlinType0, @NotNull List list0, @NotNull KotlinType kotlinType1, @Nullable Pair pair0) {
        ReceiverParameterDescriptor receiverParameterDescriptor0 = null;
        if(list0 != null) {
            if(kotlinType1 != null) {
                JavaClassConstructorDescriptor javaClassConstructorDescriptor0 = this.createSubstitutedCopy(this.getContainingDeclaration(), null, this.getKind(), null, this.getAnnotations(), this.getSource());
                if(kotlinType0 != null) {
                    receiverParameterDescriptor0 = DescriptorFactory.createExtensionReceiverParameterForCallable(javaClassConstructorDescriptor0, kotlinType0, Annotations.Companion.getEMPTY());
                }
                javaClassConstructorDescriptor0.initialize(receiverParameterDescriptor0, this.getDispatchReceiverParameter(), CollectionsKt__CollectionsKt.emptyList(), this.getTypeParameters(), UtilKt.copyValueParameters(list0, this.getValueParameters(), javaClassConstructorDescriptor0), kotlinType1, this.getModality(), this.getVisibility());
                if(pair0 != null) {
                    javaClassConstructorDescriptor0.putInUserDataMap(((UserDataKey)pair0.getFirst()), pair0.getSecond());
                }
                return javaClassConstructorDescriptor0;
            }
            JavaClassConstructorDescriptor.a(17);
            throw null;
        }
        JavaClassConstructorDescriptor.a(16);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public boolean hasStableParameterNames() {
        return this.D.booleanValue();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return this.E.booleanValue();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public void setHasStableParameterNames(boolean z) {
        this.D = Boolean.valueOf(z);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public void setHasSynthesizedParameterNames(boolean z) {
        this.E = Boolean.valueOf(z);
    }
}

