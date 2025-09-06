package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.NameUtils;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ze.d;

public class DescriptorFactory {
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 12 || v == 23 || v == 25 ? 2 : 3)];
        switch(v) {
            case 2: 
            case 5: 
            case 9: {
                arr_object[0] = "parameterAnnotations";
                break;
            }
            case 10: {
                arr_object[0] = "visibility";
                break;
            }
            case 6: 
            case 11: 
            case 19: {
                arr_object[0] = "sourceElement";
                break;
            }
            case 20: {
                arr_object[0] = "containingClass";
                break;
            }
            case 21: {
                arr_object[0] = "source";
                break;
            }
            case 12: 
            case 23: 
            case 25: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            }
            case 22: 
            case 24: 
            case 26: {
                arr_object[0] = "enumClass";
                break;
            }
            case 27: 
            case 28: 
            case 29: {
                arr_object[0] = "descriptor";
                break;
            }
            case 30: 
            case 0x20: 
            case 34: {
                arr_object[0] = "owner";
                break;
            }
            case 1: 
            case 4: 
            case 8: 
            case 14: 
            case 16: 
            case 18: 
            case 0x1F: 
            case 33: 
            case 35: {
                arr_object[0] = "annotations";
                break;
            }
            default: {
                arr_object[0] = "propertyDescriptor";
            }
        }
        switch(v) {
            case 12: {
                arr_object[1] = "createSetter";
                break;
            }
            case 23: {
                arr_object[1] = "createEnumValuesMethod";
                break;
            }
            case 25: {
                arr_object[1] = "createEnumValueOfMethod";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
            }
        }
        switch(v) {
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                arr_object[2] = "createSetter";
                break;
            }
            case 13: 
            case 14: {
                arr_object[2] = "createDefaultGetter";
                break;
            }
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                arr_object[2] = "createGetter";
                break;
            }
            case 20: 
            case 21: {
                arr_object[2] = "createPrimaryConstructorForObject";
                break;
            }
            case 22: {
                arr_object[2] = "createEnumValuesMethod";
                break;
            }
            case 24: {
                arr_object[2] = "createEnumValueOfMethod";
                break;
            }
            case 12: 
            case 23: 
            case 25: {
                break;
            }
            case 26: {
                arr_object[2] = "createEnumEntriesProperty";
                break;
            }
            case 27: {
                arr_object[2] = "isEnumValuesMethod";
                break;
            }
            case 28: {
                arr_object[2] = "isEnumValueOfMethod";
                break;
            }
            case 29: {
                arr_object[2] = "isEnumSpecialMethod";
                break;
            }
            case 30: 
            case 0x1F: {
                arr_object[2] = "createExtensionReceiverParameterForCallable";
                break;
            }
            case 0x20: 
            case 33: {
                arr_object[2] = "createContextReceiverParameterForCallable";
                break;
            }
            case 34: 
            case 35: {
                arr_object[2] = "createContextReceiverParameterForClass";
                break;
            }
            default: {
                arr_object[2] = "createDefaultSetter";
            }
        }
        String s = String.format((v == 12 || v == 23 || v == 25 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 12 || v == 23 || v == 25 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    public static boolean b(FunctionDescriptor functionDescriptor0) {
        if(functionDescriptor0 != null) {
            return functionDescriptor0.getKind() == Kind.SYNTHESIZED && DescriptorUtils.isEnumClass(functionDescriptor0.getContainingDeclaration());
        }
        DescriptorFactory.a(29);
        throw null;
    }

    @Nullable
    public static ReceiverParameterDescriptor createContextReceiverParameterForCallable(@NotNull CallableDescriptor callableDescriptor0, @Nullable KotlinType kotlinType0, @Nullable Name name0, @NotNull Annotations annotations0, int v) {
        if(callableDescriptor0 != null) {
            if(annotations0 != null) {
                return kotlinType0 != null ? new ReceiverParameterDescriptorImpl(callableDescriptor0, new ContextReceiver(callableDescriptor0, kotlinType0, name0, null), annotations0, NameUtils.contextReceiverName(v)) : null;
            }
            DescriptorFactory.a(33);
            throw null;
        }
        DescriptorFactory.a(0x20);
        throw null;
    }

    @Nullable
    public static ReceiverParameterDescriptor createContextReceiverParameterForClass(@NotNull ClassDescriptor classDescriptor0, @Nullable KotlinType kotlinType0, @Nullable Name name0, @NotNull Annotations annotations0, int v) {
        if(classDescriptor0 != null) {
            if(annotations0 != null) {
                return kotlinType0 != null ? new ReceiverParameterDescriptorImpl(classDescriptor0, new ContextClassReceiver(classDescriptor0, kotlinType0, name0, null), annotations0, NameUtils.contextReceiverName(v)) : null;
            }
            DescriptorFactory.a(35);
            throw null;
        }
        DescriptorFactory.a(34);
        throw null;
    }

    @NotNull
    public static PropertyGetterDescriptorImpl createDefaultGetter(@NotNull PropertyDescriptor propertyDescriptor0, @NotNull Annotations annotations0) {
        if(propertyDescriptor0 != null) {
            if(annotations0 != null) {
                return DescriptorFactory.createGetter(propertyDescriptor0, annotations0, true, false, false);
            }
            DescriptorFactory.a(14);
            throw null;
        }
        DescriptorFactory.a(13);
        throw null;
    }

    @NotNull
    public static PropertySetterDescriptorImpl createDefaultSetter(@NotNull PropertyDescriptor propertyDescriptor0, @NotNull Annotations annotations0, @NotNull Annotations annotations1) {
        if(propertyDescriptor0 != null) {
            if(annotations0 != null) {
                if(annotations1 != null) {
                    return DescriptorFactory.createSetter(propertyDescriptor0, annotations0, annotations1, true, false, false, propertyDescriptor0.getSource());
                }
                DescriptorFactory.a(2);
                throw null;
            }
            DescriptorFactory.a(1);
            throw null;
        }
        DescriptorFactory.a(0);
        throw null;
    }

    @Nullable
    public static PropertyDescriptor createEnumEntriesProperty(@NotNull ClassDescriptor classDescriptor0) {
        if(classDescriptor0 != null) {
            ClassDescriptor classDescriptor1 = FindClassInModuleKt.findClassAcrossModuleDependencies(DescriptorUtils.getContainingModule(classDescriptor0), StandardClassIds.INSTANCE.getEnumEntries());
            if(classDescriptor1 == null) {
                return null;
            }
            SourceElement sourceElement0 = classDescriptor0.getSource();
            PropertyDescriptor propertyDescriptor0 = PropertyDescriptorImpl.create(classDescriptor0, Annotations.Companion.getEMPTY(), Modality.FINAL, DescriptorVisibilities.PUBLIC, false, StandardNames.ENUM_ENTRIES, Kind.SYNTHESIZED, sourceElement0, false, false, false, false, false, false);
            SourceElement sourceElement1 = classDescriptor0.getSource();
            PropertyGetterDescriptorImpl propertyGetterDescriptorImpl0 = new PropertyGetterDescriptorImpl(propertyDescriptor0, Annotations.Companion.getEMPTY(), Modality.FINAL, DescriptorVisibilities.PUBLIC, false, false, false, Kind.SYNTHESIZED, null, sourceElement1);
            ((PropertyDescriptorImpl)propertyDescriptor0).initialize(propertyGetterDescriptorImpl0, null);
            ((PropertyDescriptorImpl)propertyDescriptor0).setType(KotlinTypeFactory.simpleType(TypeAttributes.Companion.getEmpty(), classDescriptor1.getTypeConstructor(), Collections.singletonList(new TypeProjectionImpl(classDescriptor0.getDefaultType())), false), Collections.emptyList(), null, null, Collections.emptyList());
            propertyGetterDescriptorImpl0.initialize(((PropertyDescriptorImpl)propertyDescriptor0).getReturnType());
            return propertyDescriptor0;
        }
        DescriptorFactory.a(26);
        throw null;
    }

    @NotNull
    public static SimpleFunctionDescriptor createEnumValueOfMethod(@NotNull ClassDescriptor classDescriptor0) {
        if(classDescriptor0 != null) {
            SourceElement sourceElement0 = classDescriptor0.getSource();
            SimpleFunctionDescriptorImpl simpleFunctionDescriptorImpl0 = SimpleFunctionDescriptorImpl.create(classDescriptor0, Annotations.Companion.getEMPTY(), StandardNames.ENUM_VALUE_OF, Kind.SYNTHESIZED, sourceElement0);
            Name name0 = Name.identifier("value");
            SimpleType simpleType0 = DescriptorUtilsKt.getBuiltIns(classDescriptor0).getStringType();
            SourceElement sourceElement1 = classDescriptor0.getSource();
            ValueParameterDescriptorImpl valueParameterDescriptorImpl0 = new ValueParameterDescriptorImpl(simpleFunctionDescriptorImpl0, null, 0, Annotations.Companion.getEMPTY(), name0, simpleType0, false, false, false, null, sourceElement1);
            SimpleFunctionDescriptor simpleFunctionDescriptor0 = simpleFunctionDescriptorImpl0.initialize(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(valueParameterDescriptorImpl0), classDescriptor0.getDefaultType(), Modality.FINAL, DescriptorVisibilities.PUBLIC);
            if(simpleFunctionDescriptor0 != null) {
                return simpleFunctionDescriptor0;
            }
            DescriptorFactory.a(25);
            throw null;
        }
        DescriptorFactory.a(24);
        throw null;
    }

    @NotNull
    public static SimpleFunctionDescriptor createEnumValuesMethod(@NotNull ClassDescriptor classDescriptor0) {
        if(classDescriptor0 != null) {
            SourceElement sourceElement0 = classDescriptor0.getSource();
            SimpleFunctionDescriptorImpl simpleFunctionDescriptorImpl0 = SimpleFunctionDescriptorImpl.create(classDescriptor0, Annotations.Companion.getEMPTY(), StandardNames.ENUM_VALUES, Kind.SYNTHESIZED, sourceElement0);
            List list0 = Collections.emptyList();
            List list1 = Collections.emptyList();
            List list2 = Collections.emptyList();
            KotlinBuiltIns kotlinBuiltIns0 = DescriptorUtilsKt.getBuiltIns(classDescriptor0);
            SimpleType simpleType0 = classDescriptor0.getDefaultType();
            SimpleFunctionDescriptor simpleFunctionDescriptor0 = simpleFunctionDescriptorImpl0.initialize(null, null, list0, list1, list2, kotlinBuiltIns0.getArrayType(Variance.INVARIANT, simpleType0), Modality.FINAL, DescriptorVisibilities.PUBLIC);
            if(simpleFunctionDescriptor0 != null) {
                return simpleFunctionDescriptor0;
            }
            DescriptorFactory.a(23);
            throw null;
        }
        DescriptorFactory.a(22);
        throw null;
    }

    @Nullable
    public static ReceiverParameterDescriptor createExtensionReceiverParameterForCallable(@NotNull CallableDescriptor callableDescriptor0, @Nullable KotlinType kotlinType0, @NotNull Annotations annotations0) {
        if(callableDescriptor0 != null) {
            if(annotations0 != null) {
                return kotlinType0 != null ? new ReceiverParameterDescriptorImpl(callableDescriptor0, new ExtensionReceiver(callableDescriptor0, kotlinType0, null), annotations0) : null;
            }
            DescriptorFactory.a(0x1F);
            throw null;
        }
        DescriptorFactory.a(30);
        throw null;
    }

    @NotNull
    public static PropertyGetterDescriptorImpl createGetter(@NotNull PropertyDescriptor propertyDescriptor0, @NotNull Annotations annotations0, boolean z, boolean z1, boolean z2) {
        if(propertyDescriptor0 != null) {
            if(annotations0 != null) {
                return DescriptorFactory.createGetter(propertyDescriptor0, annotations0, z, z1, z2, propertyDescriptor0.getSource());
            }
            DescriptorFactory.a(16);
            throw null;
        }
        DescriptorFactory.a(15);
        throw null;
    }

    @NotNull
    public static PropertyGetterDescriptorImpl createGetter(@NotNull PropertyDescriptor propertyDescriptor0, @NotNull Annotations annotations0, boolean z, boolean z1, boolean z2, @NotNull SourceElement sourceElement0) {
        if(propertyDescriptor0 != null) {
            if(annotations0 != null) {
                if(sourceElement0 != null) {
                    return new PropertyGetterDescriptorImpl(propertyDescriptor0, annotations0, propertyDescriptor0.getModality(), propertyDescriptor0.getVisibility(), z, z1, z2, Kind.DECLARATION, null, sourceElement0);
                }
                DescriptorFactory.a(19);
                throw null;
            }
            DescriptorFactory.a(18);
            throw null;
        }
        DescriptorFactory.a(17);
        throw null;
    }

    @NotNull
    public static ClassConstructorDescriptorImpl createPrimaryConstructorForObject(@NotNull ClassDescriptor classDescriptor0, @NotNull SourceElement sourceElement0) {
        if(classDescriptor0 != null) {
            if(sourceElement0 != null) {
                if(classDescriptor0 != null) {
                    if(sourceElement0 != null) {
                        ClassConstructorDescriptorImpl classConstructorDescriptorImpl0 = new d(classDescriptor0, null, Annotations.Companion.getEMPTY(), true, Kind.DECLARATION, sourceElement0);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotations;ZLkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;Lkotlin/reflect/jvm/internal/impl/descriptors/SourceElement;)V
                        classConstructorDescriptorImpl0.initialize(Collections.emptyList(), DescriptorUtils.getDefaultConstructorVisibility(classDescriptor0, false));
                        return classConstructorDescriptorImpl0;
                    }
                    d.a(1);
                    throw null;
                }
                d.a(0);
                throw null;
            }
            DescriptorFactory.a(21);
            throw null;
        }
        DescriptorFactory.a(20);
        throw null;
    }

    @NotNull
    public static PropertySetterDescriptorImpl createSetter(@NotNull PropertyDescriptor propertyDescriptor0, @NotNull Annotations annotations0, @NotNull Annotations annotations1, boolean z, boolean z1, boolean z2, @NotNull DescriptorVisibility descriptorVisibility0, @NotNull SourceElement sourceElement0) {
        if(propertyDescriptor0 != null) {
            if(annotations0 != null) {
                if(annotations1 != null) {
                    if(descriptorVisibility0 != null) {
                        if(sourceElement0 != null) {
                            PropertySetterDescriptorImpl propertySetterDescriptorImpl0 = new PropertySetterDescriptorImpl(propertyDescriptor0, annotations0, propertyDescriptor0.getModality(), descriptorVisibility0, z, z1, z2, Kind.DECLARATION, null, sourceElement0);
                            propertySetterDescriptorImpl0.initialize(PropertySetterDescriptorImpl.createSetterParameter(propertySetterDescriptorImpl0, propertyDescriptor0.getType(), annotations1));
                            return propertySetterDescriptorImpl0;
                        }
                        DescriptorFactory.a(11);
                        throw null;
                    }
                    DescriptorFactory.a(10);
                    throw null;
                }
                DescriptorFactory.a(9);
                throw null;
            }
            DescriptorFactory.a(8);
            throw null;
        }
        DescriptorFactory.a(7);
        throw null;
    }

    @NotNull
    public static PropertySetterDescriptorImpl createSetter(@NotNull PropertyDescriptor propertyDescriptor0, @NotNull Annotations annotations0, @NotNull Annotations annotations1, boolean z, boolean z1, boolean z2, @NotNull SourceElement sourceElement0) {
        if(propertyDescriptor0 != null) {
            if(annotations0 != null) {
                if(annotations1 != null) {
                    if(sourceElement0 != null) {
                        return DescriptorFactory.createSetter(propertyDescriptor0, annotations0, annotations1, z, z1, z2, propertyDescriptor0.getVisibility(), sourceElement0);
                    }
                    DescriptorFactory.a(6);
                    throw null;
                }
                DescriptorFactory.a(5);
                throw null;
            }
            DescriptorFactory.a(4);
            throw null;
        }
        DescriptorFactory.a(3);
        throw null;
    }

    public static boolean isEnumValueOfMethod(@NotNull FunctionDescriptor functionDescriptor0) {
        if(functionDescriptor0 != null) {
            return functionDescriptor0.getName().equals(StandardNames.ENUM_VALUE_OF) && DescriptorFactory.b(functionDescriptor0);
        }
        DescriptorFactory.a(28);
        throw null;
    }

    public static boolean isEnumValuesMethod(@NotNull FunctionDescriptor functionDescriptor0) {
        if(functionDescriptor0 != null) {
            return functionDescriptor0.getName().equals(StandardNames.ENUM_VALUES) && DescriptorFactory.b(functionDescriptor0);
        }
        DescriptorFactory.a(27);
        throw null;
    }
}

