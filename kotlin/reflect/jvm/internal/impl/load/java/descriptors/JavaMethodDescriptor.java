package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.OperatorChecks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qe.a;
import qe.b;

public class JavaMethodDescriptor extends SimpleFunctionDescriptorImpl implements JavaCallableMemberDescriptor {
    public int D;
    public final boolean E;
    public static final UserDataKey HAS_ERASED_VALUE_PARAMETERS;
    public static final UserDataKey ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER;

    static {
        JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        JavaMethodDescriptor.HAS_ERASED_VALUE_PARAMETERS = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public JavaMethodDescriptor(@NotNull DeclarationDescriptor declarationDescriptor0, @Nullable SimpleFunctionDescriptor simpleFunctionDescriptor0, @NotNull Annotations annotations0, @NotNull Name name0, @NotNull Kind callableMemberDescriptor$Kind0, @NotNull SourceElement sourceElement0, boolean z) {
        if(declarationDescriptor0 != null) {
            if(annotations0 != null) {
                if(name0 != null) {
                    if(callableMemberDescriptor$Kind0 != null) {
                        if(sourceElement0 != null) {
                            super(declarationDescriptor0, simpleFunctionDescriptor0, annotations0, name0, callableMemberDescriptor$Kind0, sourceElement0);
                            this.D = 0;
                            this.E = z;
                            return;
                        }
                        JavaMethodDescriptor.a(4);
                        throw null;
                    }
                    JavaMethodDescriptor.a(3);
                    throw null;
                }
                JavaMethodDescriptor.a(2);
                throw null;
            }
            JavaMethodDescriptor.a(1);
            throw null;
        }
        JavaMethodDescriptor.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 13 || v == 18 || v == 21 ? 2 : 3)];
        switch(v) {
            case 2: 
            case 7: {
                arr_object[0] = "name";
                break;
            }
            case 9: {
                arr_object[0] = "contextReceiverParameters";
                break;
            }
            case 10: {
                arr_object[0] = "typeParameters";
                break;
            }
            case 11: {
                arr_object[0] = "unsubstitutedValueParameters";
                break;
            }
            case 12: {
                arr_object[0] = "visibility";
                break;
            }
            case 14: {
                arr_object[0] = "newOwner";
                break;
            }
            case 3: 
            case 15: {
                arr_object[0] = "kind";
                break;
            }
            case 1: 
            case 6: 
            case 16: {
                arr_object[0] = "annotations";
                break;
            }
            case 4: 
            case 8: 
            case 17: {
                arr_object[0] = "source";
                break;
            }
            case 19: {
                arr_object[0] = "enhancedValueParameterTypes";
                break;
            }
            case 20: {
                arr_object[0] = "enhancedReturnType";
                break;
            }
            case 13: 
            case 18: 
            case 21: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        switch(v) {
            case 13: {
                arr_object[1] = "initialize";
                break;
            }
            case 18: {
                arr_object[1] = "createSubstitutedCopy";
                break;
            }
            case 21: {
                arr_object[1] = "enhance";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
            }
        }
        switch(v) {
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                arr_object[2] = "createJavaMethod";
                break;
            }
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                arr_object[2] = "initialize";
                break;
            }
            case 14: 
            case 15: 
            case 16: 
            case 17: {
                arr_object[2] = "createSubstitutedCopy";
                break;
            }
            case 19: 
            case 20: {
                arr_object[2] = "enhance";
                break;
            }
            case 13: 
            case 18: 
            case 21: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s = String.format((v == 13 || v == 18 || v == 21 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 13 || v == 18 || v == 21 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @NotNull
    public static JavaMethodDescriptor createJavaMethod(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Annotations annotations0, @NotNull Name name0, @NotNull SourceElement sourceElement0, boolean z) {
        if(declarationDescriptor0 != null) {
            if(annotations0 != null) {
                if(name0 != null) {
                    if(sourceElement0 != null) {
                        return new JavaMethodDescriptor(declarationDescriptor0, null, annotations0, name0, Kind.DECLARATION, sourceElement0, z);
                    }
                    JavaMethodDescriptor.a(8);
                    throw null;
                }
                JavaMethodDescriptor.a(7);
                throw null;
            }
            JavaMethodDescriptor.a(6);
            throw null;
        }
        JavaMethodDescriptor.a(5);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl
    @NotNull
    public FunctionDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor0, @Nullable FunctionDescriptor functionDescriptor0, @NotNull Kind callableMemberDescriptor$Kind0, @Nullable Name name0, @NotNull Annotations annotations0, @NotNull SourceElement sourceElement0) {
        return this.createSubstitutedCopy(declarationDescriptor0, functionDescriptor0, callableMemberDescriptor$Kind0, name0, annotations0, sourceElement0);
    }

    @NotNull
    public JavaMethodDescriptor createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor0, @Nullable FunctionDescriptor functionDescriptor0, @NotNull Kind callableMemberDescriptor$Kind0, @Nullable Name name0, @NotNull Annotations annotations0, @NotNull SourceElement sourceElement0) {
        if(declarationDescriptor0 != null) {
            if(callableMemberDescriptor$Kind0 != null) {
                if(annotations0 != null) {
                    if(sourceElement0 != null) {
                        if(name0 == null) {
                            name0 = this.getName();
                        }
                        JavaMethodDescriptor javaMethodDescriptor0 = new JavaMethodDescriptor(declarationDescriptor0, ((SimpleFunctionDescriptor)functionDescriptor0), annotations0, name0, callableMemberDescriptor$Kind0, sourceElement0, this.E);
                        javaMethodDescriptor0.setParameterNamesStatus(this.hasStableParameterNames(), this.hasSynthesizedParameterNames());
                        return javaMethodDescriptor0;
                    }
                    JavaMethodDescriptor.a(17);
                    throw null;
                }
                JavaMethodDescriptor.a(16);
                throw null;
            }
            JavaMethodDescriptor.a(15);
            throw null;
        }
        JavaMethodDescriptor.a(14);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    @NotNull
    public JavaCallableMemberDescriptor enhance(@Nullable KotlinType kotlinType0, @NotNull List list0, @NotNull KotlinType kotlinType1, @Nullable Pair pair0) {
        return this.enhance(kotlinType0, list0, kotlinType1, pair0);
    }

    @NotNull
    public JavaMethodDescriptor enhance(@Nullable KotlinType kotlinType0, @NotNull List list0, @NotNull KotlinType kotlinType1, @Nullable Pair pair0) {
        if(list0 != null) {
            if(kotlinType1 != null) {
                List list1 = UtilKt.copyValueParameters(list0, this.getValueParameters(), this);
                ReceiverParameterDescriptor receiverParameterDescriptor0 = kotlinType0 == null ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(this, kotlinType0, Annotations.Companion.getEMPTY());
                JavaMethodDescriptor javaMethodDescriptor0 = (JavaMethodDescriptor)this.newCopyBuilder().setValueParameters(list1).setReturnType(kotlinType1).setExtensionReceiverParameter(receiverParameterDescriptor0).setDropOriginalInContainingParts().setPreserveSourceElement().build();
                if(pair0 != null) {
                    javaMethodDescriptor0.putInUserDataMap(((UserDataKey)pair0.getFirst()), pair0.getSecond());
                }
                if(javaMethodDescriptor0 != null) {
                    return javaMethodDescriptor0;
                }
                JavaMethodDescriptor.a(21);
                throw null;
            }
            JavaMethodDescriptor.a(20);
            throw null;
        }
        JavaMethodDescriptor.a(19);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public boolean hasStableParameterNames() {
        switch(this.D) {
            case 1: 
            case 3: {
                return false;
            }
            case 2: 
            case 4: {
                return true;
            }
            default: {
                throw null;
            }
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        switch(this.D) {
            case 1: 
            case 2: {
                return false;
            }
            case 3: 
            case 4: {
                return true;
            }
            default: {
                throw null;
            }
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl
    @NotNull
    public SimpleFunctionDescriptorImpl initialize(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor0, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor1, @NotNull List list0, @NotNull List list1, @NotNull List list2, @Nullable KotlinType kotlinType0, @Nullable Modality modality0, @NotNull DescriptorVisibility descriptorVisibility0, @Nullable Map map0) {
        if(list0 != null) {
            if(list1 != null) {
                if(list2 != null) {
                    if(descriptorVisibility0 != null) {
                        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImpl0 = super.initialize(receiverParameterDescriptor0, receiverParameterDescriptor1, list0, list1, list2, kotlinType0, modality0, descriptorVisibility0, map0);
                        this.setOperator(OperatorChecks.INSTANCE.check(simpleFunctionDescriptorImpl0).isSuccess());
                        if(simpleFunctionDescriptorImpl0 != null) {
                            return simpleFunctionDescriptorImpl0;
                        }
                        JavaMethodDescriptor.a(13);
                        throw null;
                    }
                    JavaMethodDescriptor.a(12);
                    throw null;
                }
                JavaMethodDescriptor.a(11);
                throw null;
            }
            JavaMethodDescriptor.a(10);
            throw null;
        }
        JavaMethodDescriptor.a(9);
        throw null;
    }

    public void setParameterNamesStatus(boolean z, boolean z1) {
        int v;
        if(!z) {
            v = z1 ? 3 : 1;
        }
        else if(z1) {
            v = 4;
        }
        else {
            v = 2;
        }
        this.D = v;
    }
}

