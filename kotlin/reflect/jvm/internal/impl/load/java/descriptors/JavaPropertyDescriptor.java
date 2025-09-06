package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstUtil;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JavaPropertyDescriptor extends PropertyDescriptorImpl implements JavaCallableMemberDescriptor {
    public final Pair A;
    public final boolean z;

    public JavaPropertyDescriptor(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Annotations annotations0, @NotNull Modality modality0, @NotNull DescriptorVisibility descriptorVisibility0, boolean z, @NotNull Name name0, @NotNull SourceElement sourceElement0, @Nullable PropertyDescriptor propertyDescriptor0, @NotNull Kind callableMemberDescriptor$Kind0, boolean z1, @Nullable Pair pair0) {
        if(declarationDescriptor0 != null) {
            if(annotations0 != null) {
                if(modality0 != null) {
                    if(descriptorVisibility0 != null) {
                        if(name0 != null) {
                            if(sourceElement0 != null) {
                                if(callableMemberDescriptor$Kind0 != null) {
                                    super(declarationDescriptor0, propertyDescriptor0, annotations0, modality0, descriptorVisibility0, z, name0, callableMemberDescriptor$Kind0, sourceElement0, false, false, false, false, false, false);
                                    this.z = z1;
                                    this.A = pair0;
                                    return;
                                }
                                JavaPropertyDescriptor.a(6);
                                throw null;
                            }
                            JavaPropertyDescriptor.a(5);
                            throw null;
                        }
                        JavaPropertyDescriptor.a(4);
                        throw null;
                    }
                    JavaPropertyDescriptor.a(3);
                    throw null;
                }
                JavaPropertyDescriptor.a(2);
                throw null;
            }
            JavaPropertyDescriptor.a(1);
            throw null;
        }
        JavaPropertyDescriptor.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 21 ? 2 : 3)];
        switch(v) {
            case 1: 
            case 8: {
                arr_object[0] = "annotations";
                break;
            }
            case 2: 
            case 9: {
                arr_object[0] = "modality";
                break;
            }
            case 3: 
            case 10: {
                arr_object[0] = "visibility";
                break;
            }
            case 4: 
            case 11: {
                arr_object[0] = "name";
                break;
            }
            case 13: {
                arr_object[0] = "newOwner";
                break;
            }
            case 14: {
                arr_object[0] = "newModality";
                break;
            }
            case 15: {
                arr_object[0] = "newVisibility";
                break;
            }
            case 6: 
            case 16: {
                arr_object[0] = "kind";
                break;
            }
            case 17: {
                arr_object[0] = "newName";
                break;
            }
            case 5: 
            case 12: 
            case 18: {
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
            case 21: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            }
            case 22: {
                arr_object[0] = "inType";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        arr_object[1] = v == 21 ? "enhance" : "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        switch(v) {
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                arr_object[2] = "create";
                break;
            }
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: {
                arr_object[2] = "createSubstitutedCopy";
                break;
            }
            case 19: 
            case 20: {
                arr_object[2] = "enhance";
                break;
            }
            case 21: {
                break;
            }
            case 22: {
                arr_object[2] = "setInType";
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s = String.format((v == 21 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalArgumentException illegalArgumentException0 = v == 21 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalArgumentException0;
    }

    @NotNull
    public static JavaPropertyDescriptor create(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Annotations annotations0, @NotNull Modality modality0, @NotNull DescriptorVisibility descriptorVisibility0, boolean z, @NotNull Name name0, @NotNull SourceElement sourceElement0, boolean z1) {
        if(declarationDescriptor0 != null) {
            if(annotations0 != null) {
                if(modality0 != null) {
                    if(descriptorVisibility0 != null) {
                        if(name0 != null) {
                            if(sourceElement0 != null) {
                                return new JavaPropertyDescriptor(declarationDescriptor0, annotations0, modality0, descriptorVisibility0, z, name0, sourceElement0, null, Kind.DECLARATION, z1, null);
                            }
                            JavaPropertyDescriptor.a(12);
                            throw null;
                        }
                        JavaPropertyDescriptor.a(11);
                        throw null;
                    }
                    JavaPropertyDescriptor.a(10);
                    throw null;
                }
                JavaPropertyDescriptor.a(9);
                throw null;
            }
            JavaPropertyDescriptor.a(8);
            throw null;
        }
        JavaPropertyDescriptor.a(7);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    @NotNull
    public PropertyDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Modality modality0, @NotNull DescriptorVisibility descriptorVisibility0, @Nullable PropertyDescriptor propertyDescriptor0, @NotNull Kind callableMemberDescriptor$Kind0, @NotNull Name name0, @NotNull SourceElement sourceElement0) {
        if(declarationDescriptor0 != null) {
            if(modality0 != null) {
                if(descriptorVisibility0 != null) {
                    if(callableMemberDescriptor$Kind0 != null) {
                        if(name0 != null) {
                            if(sourceElement0 != null) {
                                return new JavaPropertyDescriptor(declarationDescriptor0, this.getAnnotations(), modality0, descriptorVisibility0, this.isVar(), name0, sourceElement0, propertyDescriptor0, callableMemberDescriptor$Kind0, this.z, this.A);
                            }
                            JavaPropertyDescriptor.a(18);
                            throw null;
                        }
                        JavaPropertyDescriptor.a(17);
                        throw null;
                    }
                    JavaPropertyDescriptor.a(16);
                    throw null;
                }
                JavaPropertyDescriptor.a(15);
                throw null;
            }
            JavaPropertyDescriptor.a(14);
            throw null;
        }
        JavaPropertyDescriptor.a(13);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    @NotNull
    public JavaCallableMemberDescriptor enhance(@Nullable KotlinType kotlinType0, @NotNull List list0, @NotNull KotlinType kotlinType1, @Nullable Pair pair0) {
        PropertySetterDescriptor propertySetterDescriptor1;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl1;
        if(list0 != null) {
            if(kotlinType1 != null) {
                PropertyDescriptor propertyDescriptor0 = this.getOriginal() == this ? null : this.getOriginal();
                JavaPropertyDescriptor javaPropertyDescriptor0 = new JavaPropertyDescriptor(this.getContainingDeclaration(), this.getAnnotations(), this.getModality(), this.getVisibility(), this.isVar(), this.getName(), this.getSource(), propertyDescriptor0, this.getKind(), this.z, pair0);
                PropertyGetterDescriptorImpl propertyGetterDescriptorImpl0 = this.getGetter();
                if(propertyGetterDescriptorImpl0 == null) {
                    propertyGetterDescriptorImpl1 = null;
                }
                else {
                    propertyGetterDescriptorImpl1 = new PropertyGetterDescriptorImpl(javaPropertyDescriptor0, propertyGetterDescriptorImpl0.getAnnotations(), propertyGetterDescriptorImpl0.getModality(), propertyGetterDescriptorImpl0.getVisibility(), propertyGetterDescriptorImpl0.isDefault(), propertyGetterDescriptorImpl0.isExternal(), propertyGetterDescriptorImpl0.isInline(), this.getKind(), (propertyDescriptor0 == null ? null : propertyDescriptor0.getGetter()), propertyGetterDescriptorImpl0.getSource());
                    propertyGetterDescriptorImpl1.setInitialSignatureDescriptor(propertyGetterDescriptorImpl0.getInitialSignatureDescriptor());
                    propertyGetterDescriptorImpl1.initialize(kotlinType1);
                }
                PropertySetterDescriptor propertySetterDescriptor0 = this.getSetter();
                if(propertySetterDescriptor0 == null) {
                    propertySetterDescriptor1 = null;
                }
                else {
                    PropertySetterDescriptorImpl propertySetterDescriptorImpl0 = new PropertySetterDescriptorImpl(javaPropertyDescriptor0, propertySetterDescriptor0.getAnnotations(), propertySetterDescriptor0.getModality(), propertySetterDescriptor0.getVisibility(), propertySetterDescriptor0.isDefault(), propertySetterDescriptor0.isExternal(), propertySetterDescriptor0.isInline(), this.getKind(), (propertyDescriptor0 == null ? null : propertyDescriptor0.getSetter()), propertySetterDescriptor0.getSource());
                    propertySetterDescriptorImpl0.setInitialSignatureDescriptor(propertySetterDescriptorImpl0.getInitialSignatureDescriptor());
                    propertySetterDescriptorImpl0.initialize(((ValueParameterDescriptor)propertySetterDescriptor0.getValueParameters().get(0)));
                    propertySetterDescriptor1 = propertySetterDescriptorImpl0;
                }
                javaPropertyDescriptor0.initialize(propertyGetterDescriptorImpl1, propertySetterDescriptor1, this.getBackingField(), this.getDelegateField());
                javaPropertyDescriptor0.setSetterProjectedOut(this.isSetterProjectedOut());
                Function0 function00 = this.compileTimeInitializerFactory;
                if(function00 != null) {
                    javaPropertyDescriptor0.setCompileTimeInitializer(this.compileTimeInitializer, function00);
                }
                javaPropertyDescriptor0.setOverriddenDescriptors(this.getOverriddenDescriptors());
                ReceiverParameterDescriptor receiverParameterDescriptor0 = kotlinType0 == null ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(this, kotlinType0, Annotations.Companion.getEMPTY());
                javaPropertyDescriptor0.setType(kotlinType1, this.getTypeParameters(), this.getDispatchReceiverParameter(), receiverParameterDescriptor0, CollectionsKt__CollectionsKt.emptyList());
                return javaPropertyDescriptor0;
            }
            JavaPropertyDescriptor.a(20);
            throw null;
        }
        JavaPropertyDescriptor.a(19);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public Object getUserData(UserDataKey callableDescriptor$UserDataKey0) {
        return this.A == null || !((UserDataKey)this.A.getFirst()).equals(callableDescriptor$UserDataKey0) ? null : this.A.getSecond();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    public boolean isConst() {
        KotlinType kotlinType0 = this.getType();
        return this.z && ConstUtil.canBeUsedForConstVal(kotlinType0) && (!TypeEnhancementKt.hasEnhancedNullability(kotlinType0) || KotlinBuiltIns.isString(kotlinType0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    public void setInType(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return;
        }
        JavaPropertyDescriptor.a(22);
        throw null;
    }
}

