package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DescriptorUtils {
    public static final FqName JVM_NAME;

    static {
        DescriptorUtils.JVM_NAME = new FqName("kotlin.jvm.JvmName");
    }

    public static void a(int v) {
        IllegalArgumentException illegalArgumentException0;
        int v1;
        String s;
        switch(v) {
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 0x2F: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 60: 
            case 62: 
            case 0x3F: 
            case 65: 
            case 72: 
            case 76: 
            case 83: 
            case 84: 
            case 86: 
            case 89: 
            case 94: 
            case 0x60: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 0x2F: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 60: 
            case 62: 
            case 0x3F: 
            case 65: 
            case 72: 
            case 76: 
            case 83: 
            case 84: 
            case 86: 
            case 89: 
            case 94: 
            case 0x60: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 16: {
                arr_object[0] = "first";
                break;
            }
            case 17: {
                arr_object[0] = "second";
                break;
            }
            case 18: 
            case 19: {
                arr_object[0] = "aClass";
                break;
            }
            case 20: {
                arr_object[0] = "kotlinType";
                break;
            }
            case 25: {
                arr_object[0] = "declarationDescriptor";
                break;
            }
            case 26: 
            case 28: {
                arr_object[0] = "subClass";
                break;
            }
            case 0x1F: {
                arr_object[0] = "other";
                break;
            }
            case 27: 
            case 29: 
            case 33: {
                arr_object[0] = "superClass";
                break;
            }
            case 37: {
                arr_object[0] = "classKind";
                break;
            }
            case 46: {
                arr_object[0] = "typeConstructor";
                break;
            }
            case 55: {
                arr_object[0] = "innerClassName";
                break;
            }
            case 56: {
                arr_object[0] = "location";
                break;
            }
            case 66: {
                arr_object[0] = "variable";
                break;
            }
            case 30: 
            case 0x20: 
            case 45: 
            case 67: {
                arr_object[0] = "type";
                break;
            }
            case 71: {
                arr_object[0] = "f";
                break;
            }
            case 73: {
                arr_object[0] = "current";
                break;
            }
            case 74: {
                arr_object[0] = "result";
                break;
            }
            case 75: {
                arr_object[0] = "memberDescriptor";
                break;
            }
            case 38: 
            case 39: 
            case 41: 
            case 44: 
            case 0x30: 
            case 54: 
            case 68: 
            case 69: 
            case 70: 
            case 77: 
            case 78: {
                arr_object[0] = "classDescriptor";
                break;
            }
            case 0x4F: 
            case 80: 
            case 81: {
                arr_object[0] = "annotated";
                break;
            }
            case 85: 
            case 87: 
            case 90: 
            case 92: {
                arr_object[0] = "scope";
                break;
            }
            case 88: 
            case 91: 
            case 93: {
                arr_object[0] = "name";
                break;
            }
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 0x2F: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 60: 
            case 62: 
            case 0x3F: 
            case 65: 
            case 72: 
            case 76: 
            case 83: 
            case 84: 
            case 86: 
            case 89: 
            case 94: 
            case 0x60: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 11: 
            case 13: 
            case 14: 
            case 15: 
            case 21: 
            case 23: 
            case 24: 
            case 34: 
            case 35: 
            case 36: 
            case 57: 
            case 58: 
            case 59: 
            case 61: 
            case 0x40: 
            case 82: 
            case 0x5F: 
            case 97: {
                arr_object[0] = "descriptor";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        switch(v) {
            case 4: {
                arr_object[1] = "getFqNameSafe";
                break;
            }
            case 7: {
                arr_object[1] = "getFqNameUnsafe";
                break;
            }
            case 9: 
            case 10: {
                arr_object[1] = "getFqNameFromTopLevelClass";
                break;
            }
            case 12: {
                arr_object[1] = "getClassIdForNonLocalClass";
                break;
            }
            case 22: {
                arr_object[1] = "getContainingModule";
                break;
            }
            case 40: {
                arr_object[1] = "getSuperclassDescriptors";
                break;
            }
            case 42: 
            case 43: {
                arr_object[1] = "getSuperClassType";
                break;
            }
            case 0x2F: {
                arr_object[1] = "getClassDescriptorForTypeConstructor";
                break;
            }
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: {
                arr_object[1] = "getDefaultConstructorVisibility";
                break;
            }
            case 60: {
                arr_object[1] = "unwrapFakeOverride";
                break;
            }
            case 62: 
            case 0x3F: {
                arr_object[1] = "unwrapSubstitutionOverride";
                break;
            }
            case 65: {
                arr_object[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            }
            case 72: {
                arr_object[1] = "getAllOverriddenDescriptors";
                break;
            }
            case 76: {
                arr_object[1] = "getAllOverriddenDeclarations";
                break;
            }
            case 83: 
            case 84: {
                arr_object[1] = "getContainingSourceFile";
                break;
            }
            case 86: {
                arr_object[1] = "getAllDescriptors";
                break;
            }
            case 89: {
                arr_object[1] = "getFunctionByName";
                break;
            }
            case 94: {
                arr_object[1] = "getPropertyByName";
                break;
            }
            case 0x60: {
                arr_object[1] = "getDirectMember";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
            }
        }
        switch(v) {
            case 1: {
                arr_object[2] = "isLocal";
                break;
            }
            case 2: {
                arr_object[2] = "getFqName";
                break;
            }
            case 3: {
                arr_object[2] = "getFqNameSafe";
                break;
            }
            case 5: {
                arr_object[2] = "getFqNameSafeIfPossible";
                break;
            }
            case 6: {
                arr_object[2] = "getFqNameUnsafe";
                break;
            }
            case 8: {
                arr_object[2] = "getFqNameFromTopLevelClass";
                break;
            }
            case 11: {
                arr_object[2] = "getClassIdForNonLocalClass";
                break;
            }
            case 13: {
                arr_object[2] = "isExtension";
                break;
            }
            case 14: {
                arr_object[2] = "isOverride";
                break;
            }
            case 15: {
                arr_object[2] = "isStaticDeclaration";
                break;
            }
            case 16: 
            case 17: {
                arr_object[2] = "areInSameModule";
                break;
            }
            case 18: 
            case 19: {
                arr_object[2] = "getParentOfType";
                break;
            }
            case 21: {
                arr_object[2] = "getContainingModule";
                break;
            }
            case 20: 
            case 23: {
                arr_object[2] = "getContainingModuleOrNull";
                break;
            }
            case 24: {
                arr_object[2] = "getContainingClass";
                break;
            }
            case 25: {
                arr_object[2] = "isAncestor";
                break;
            }
            case 26: 
            case 27: {
                arr_object[2] = "isDirectSubclass";
                break;
            }
            case 28: 
            case 29: {
                arr_object[2] = "isSubclass";
                break;
            }
            case 30: 
            case 0x1F: {
                arr_object[2] = "isSameClass";
                break;
            }
            case 0x20: 
            case 33: {
                arr_object[2] = "isSubtypeOfClass";
                break;
            }
            case 34: {
                arr_object[2] = "isAnonymousObject";
                break;
            }
            case 35: {
                arr_object[2] = "isAnonymousFunction";
                break;
            }
            case 36: {
                arr_object[2] = "isEnumEntry";
                break;
            }
            case 37: {
                arr_object[2] = "isKindOf";
                break;
            }
            case 38: {
                arr_object[2] = "hasAbstractMembers";
                break;
            }
            case 39: {
                arr_object[2] = "getSuperclassDescriptors";
                break;
            }
            case 41: {
                arr_object[2] = "getSuperClassType";
                break;
            }
            case 44: {
                arr_object[2] = "getSuperClassDescriptor";
                break;
            }
            case 45: {
                arr_object[2] = "getClassDescriptorForType";
                break;
            }
            case 46: {
                arr_object[2] = "getClassDescriptorForTypeConstructor";
                break;
            }
            case 0x30: {
                arr_object[2] = "getDefaultConstructorVisibility";
                break;
            }
            case 54: 
            case 55: 
            case 56: {
                arr_object[2] = "getInnerClassByName";
                break;
            }
            case 57: {
                arr_object[2] = "isStaticNestedClass";
                break;
            }
            case 58: {
                arr_object[2] = "isTopLevelOrInnerClass";
                break;
            }
            case 59: {
                arr_object[2] = "unwrapFakeOverride";
                break;
            }
            case 61: {
                arr_object[2] = "unwrapSubstitutionOverride";
                break;
            }
            case 0x40: {
                arr_object[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            }
            case 66: 
            case 67: {
                arr_object[2] = "shouldRecordInitializerForProperty";
                break;
            }
            case 68: {
                arr_object[2] = "classCanHaveAbstractFakeOverride";
                break;
            }
            case 69: {
                arr_object[2] = "classCanHaveAbstractDeclaration";
                break;
            }
            case 70: {
                arr_object[2] = "classCanHaveOpenMembers";
                break;
            }
            case 71: {
                arr_object[2] = "getAllOverriddenDescriptors";
                break;
            }
            case 73: 
            case 74: {
                arr_object[2] = "collectAllOverriddenDescriptors";
                break;
            }
            case 75: {
                arr_object[2] = "getAllOverriddenDeclarations";
                break;
            }
            case 77: {
                arr_object[2] = "isSingletonOrAnonymousObject";
                break;
            }
            case 78: {
                arr_object[2] = "canHaveDeclaredConstructors";
                break;
            }
            case 0x4F: {
                arr_object[2] = "getJvmName";
                break;
            }
            case 80: {
                arr_object[2] = "findJvmNameAnnotation";
                break;
            }
            case 81: {
                arr_object[2] = "hasJvmNameAnnotation";
                break;
            }
            case 82: {
                arr_object[2] = "getContainingSourceFile";
                break;
            }
            case 85: {
                arr_object[2] = "getAllDescriptors";
                break;
            }
            case 87: 
            case 88: {
                arr_object[2] = "getFunctionByName";
                break;
            }
            case 90: 
            case 91: {
                arr_object[2] = "getFunctionByNameOrNull";
                break;
            }
            case 92: 
            case 93: {
                arr_object[2] = "getPropertyByName";
                break;
            }
            case 0x5F: {
                arr_object[2] = "getDirectMember";
                break;
            }
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 0x2F: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 60: 
            case 62: 
            case 0x3F: 
            case 65: 
            case 72: 
            case 76: 
            case 83: 
            case 84: 
            case 86: 
            case 89: 
            case 94: 
            case 0x60: {
                break;
            }
            case 97: {
                arr_object[2] = "isMethodOfAny";
                break;
            }
            default: {
                arr_object[2] = "getDispatchReceiverParameterIfNeeded";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 0x2F: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 60: 
            case 62: 
            case 0x3F: 
            case 65: 
            case 72: 
            case 76: 
            case 83: 
            case 84: 
            case 86: 
            case 89: 
            case 94: 
            case 0x60: {
                illegalArgumentException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    public static boolean areInSameModule(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull DeclarationDescriptor declarationDescriptor1) {
        if(declarationDescriptor0 != null) {
            if(declarationDescriptor1 != null) {
                return DescriptorUtils.getContainingModule(declarationDescriptor0).equals(DescriptorUtils.getContainingModule(declarationDescriptor1));
            }
            DescriptorUtils.a(17);
            throw null;
        }
        DescriptorUtils.a(16);
        throw null;
    }

    public static void b(CallableDescriptor callableDescriptor0, LinkedHashSet linkedHashSet0) {
        if(callableDescriptor0 != null) {
            if(linkedHashSet0.contains(callableDescriptor0)) {
                return;
            }
            for(Object object0: callableDescriptor0.getOriginal().getOverriddenDescriptors()) {
                CallableDescriptor callableDescriptor1 = ((CallableDescriptor)object0).getOriginal();
                DescriptorUtils.b(callableDescriptor1, linkedHashSet0);
                linkedHashSet0.add(callableDescriptor1);
            }
            return;
        }
        DescriptorUtils.a(73);
        throw null;
    }

    public static FqName c(DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptor0 != null) {
            if(!(declarationDescriptor0 instanceof ModuleDescriptor) && !ErrorUtils.isError(declarationDescriptor0)) {
                if(declarationDescriptor0 instanceof PackageViewDescriptor) {
                    return ((PackageViewDescriptor)declarationDescriptor0).getFqName();
                }
                return declarationDescriptor0 instanceof PackageFragmentDescriptor ? ((PackageFragmentDescriptor)declarationDescriptor0).getFqName() : null;
            }
            return FqName.ROOT;
        }
        DescriptorUtils.a(5);
        throw null;
    }

    public static boolean d(DeclarationDescriptor declarationDescriptor0, ClassKind classKind0) {
        if(classKind0 != null) {
            return declarationDescriptor0 instanceof ClassDescriptor && ((ClassDescriptor)declarationDescriptor0).getKind() == classKind0;
        }
        DescriptorUtils.a(37);
        throw null;
    }

    public static boolean e(KotlinType kotlinType0, DeclarationDescriptor declarationDescriptor0) {
        if(kotlinType0 != null) {
            if(declarationDescriptor0 != null) {
                ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
                if(classifierDescriptor0 != null) {
                    DeclarationDescriptor declarationDescriptor1 = classifierDescriptor0.getOriginal();
                    return declarationDescriptor1 instanceof ClassifierDescriptor && declarationDescriptor0 instanceof ClassifierDescriptor && ((ClassifierDescriptor)declarationDescriptor0).getTypeConstructor().equals(((ClassifierDescriptor)declarationDescriptor1).getTypeConstructor());
                }
                return false;
            }
            DescriptorUtils.a(0x1F);
            throw null;
        }
        DescriptorUtils.a(30);
        throw null;
    }

    @NotNull
    public static Set getAllOverriddenDescriptors(@NotNull CallableDescriptor callableDescriptor0) {
        if(callableDescriptor0 != null) {
            Set set0 = new LinkedHashSet();
            DescriptorUtils.b(callableDescriptor0.getOriginal(), ((LinkedHashSet)set0));
            return set0;
        }
        DescriptorUtils.a(71);
        throw null;
    }

    @NotNull
    public static ClassDescriptor getClassDescriptorForType(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return DescriptorUtils.getClassDescriptorForTypeConstructor(kotlinType0.getConstructor());
        }
        DescriptorUtils.a(45);
        throw null;
    }

    @NotNull
    public static ClassDescriptor getClassDescriptorForTypeConstructor(@NotNull TypeConstructor typeConstructor0) {
        if(typeConstructor0 != null) {
            ClassDescriptor classDescriptor0 = (ClassDescriptor)typeConstructor0.getDeclarationDescriptor();
            if(classDescriptor0 != null) {
                return classDescriptor0;
            }
            DescriptorUtils.a(0x2F);
            throw null;
        }
        DescriptorUtils.a(46);
        throw null;
    }

    @NotNull
    public static ModuleDescriptor getContainingModule(@NotNull DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptor0 != null) {
            ModuleDescriptor moduleDescriptor0 = DescriptorUtils.getContainingModuleOrNull(declarationDescriptor0);
            if(moduleDescriptor0 != null) {
                return moduleDescriptor0;
            }
            DescriptorUtils.a(22);
            throw null;
        }
        DescriptorUtils.a(21);
        throw null;
    }

    @Nullable
    public static ModuleDescriptor getContainingModuleOrNull(@NotNull DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptor0 != null) {
            while(declarationDescriptor0 != null) {
                if(declarationDescriptor0 instanceof ModuleDescriptor) {
                    return (ModuleDescriptor)declarationDescriptor0;
                }
                if(declarationDescriptor0 instanceof PackageViewDescriptor) {
                    return ((PackageViewDescriptor)declarationDescriptor0).getModule();
                }
                declarationDescriptor0 = declarationDescriptor0.getContainingDeclaration();
            }
            return null;
        }
        DescriptorUtils.a(23);
        throw null;
    }

    @Nullable
    public static ModuleDescriptor getContainingModuleOrNull(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
            return classifierDescriptor0 == null ? null : DescriptorUtils.getContainingModuleOrNull(classifierDescriptor0);
        }
        DescriptorUtils.a(20);
        throw null;
    }

    @NotNull
    public static SourceFile getContainingSourceFile(@NotNull DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptor0 != null) {
            if(declarationDescriptor0 instanceof PropertySetterDescriptor) {
                declarationDescriptor0 = ((PropertySetterDescriptor)declarationDescriptor0).getCorrespondingProperty();
            }
            if(declarationDescriptor0 instanceof DeclarationDescriptorWithSource) {
                SourceFile sourceFile0 = ((DeclarationDescriptorWithSource)declarationDescriptor0).getSource().getContainingFile();
                if(sourceFile0 != null) {
                    return sourceFile0;
                }
                DescriptorUtils.a(83);
                throw null;
            }
            SourceFile sourceFile1 = SourceFile.NO_SOURCE_FILE;
            if(sourceFile1 != null) {
                return sourceFile1;
            }
            DescriptorUtils.a(84);
            throw null;
        }
        DescriptorUtils.a(82);
        throw null;
    }

    @NotNull
    public static DescriptorVisibility getDefaultConstructorVisibility(@NotNull ClassDescriptor classDescriptor0, boolean z) {
        if(classDescriptor0 != null) {
            ClassKind classKind0 = classDescriptor0.getKind();
            if(classKind0 != ClassKind.ENUM_CLASS && !classKind0.isSingleton()) {
                if(DescriptorUtils.isSealedClass(classDescriptor0)) {
                    if(z) {
                        DescriptorVisibility descriptorVisibility0 = DescriptorVisibilities.PROTECTED;
                        if(descriptorVisibility0 != null) {
                            return descriptorVisibility0;
                        }
                        DescriptorUtils.a(50);
                        throw null;
                    }
                    DescriptorVisibility descriptorVisibility1 = DescriptorVisibilities.PRIVATE;
                    if(descriptorVisibility1 != null) {
                        return descriptorVisibility1;
                    }
                    DescriptorUtils.a(51);
                    throw null;
                }
                if(DescriptorUtils.isAnonymousObject(classDescriptor0)) {
                    DescriptorVisibility descriptorVisibility2 = DescriptorVisibilities.DEFAULT_VISIBILITY;
                    if(descriptorVisibility2 != null) {
                        return descriptorVisibility2;
                    }
                    DescriptorUtils.a(52);
                    throw null;
                }
                DescriptorVisibility descriptorVisibility3 = DescriptorVisibilities.PUBLIC;
                if(descriptorVisibility3 != null) {
                    return descriptorVisibility3;
                }
                DescriptorUtils.a(53);
                throw null;
            }
            DescriptorVisibility descriptorVisibility4 = DescriptorVisibilities.PRIVATE;
            if(descriptorVisibility4 != null) {
                return descriptorVisibility4;
            }
            DescriptorUtils.a(49);
            throw null;
        }
        DescriptorUtils.a(0x30);
        throw null;
    }

    @Nullable
    public static ReceiverParameterDescriptor getDispatchReceiverParameterIfNeeded(@NotNull DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptor0 != null) {
            return declarationDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)declarationDescriptor0).getThisAsReceiverParameter() : null;
        }
        DescriptorUtils.a(0);
        throw null;
    }

    @NotNull
    public static FqNameUnsafe getFqName(@NotNull DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptor0 != null) {
            FqName fqName0 = DescriptorUtils.c(declarationDescriptor0);
            if(fqName0 != null) {
                return fqName0.toUnsafe();
            }
            FqNameUnsafe fqNameUnsafe0 = DescriptorUtils.getFqName(declarationDescriptor0.getContainingDeclaration()).child(declarationDescriptor0.getName());
            if(fqNameUnsafe0 != null) {
                return fqNameUnsafe0;
            }
            DescriptorUtils.a(7);
            throw null;
        }
        DescriptorUtils.a(2);
        throw null;
    }

    @NotNull
    public static FqName getFqNameSafe(@NotNull DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptor0 != null) {
            FqName fqName0 = DescriptorUtils.c(declarationDescriptor0);
            if(fqName0 == null) {
                FqNameUnsafe fqNameUnsafe0 = DescriptorUtils.getFqName(declarationDescriptor0.getContainingDeclaration()).child(declarationDescriptor0.getName());
                if(fqNameUnsafe0 != null) {
                    fqName0 = fqNameUnsafe0.toSafe();
                    goto label_9;
                }
                DescriptorUtils.a(7);
                throw null;
            }
        label_9:
            if(fqName0 != null) {
                return fqName0;
            }
            DescriptorUtils.a(4);
            throw null;
        }
        DescriptorUtils.a(3);
        throw null;
    }

    @Nullable
    public static DeclarationDescriptor getParentOfType(@Nullable DeclarationDescriptor declarationDescriptor0, @NotNull Class class0) {
        if(class0 != null) {
            return DescriptorUtils.getParentOfType(declarationDescriptor0, class0, true);
        }
        DescriptorUtils.a(18);
        throw null;
    }

    @Nullable
    public static DeclarationDescriptor getParentOfType(@Nullable DeclarationDescriptor declarationDescriptor0, @NotNull Class class0, boolean z) {
        if(class0 != null) {
            if(declarationDescriptor0 == null) {
                return null;
            }
            if(z) {
                declarationDescriptor0 = declarationDescriptor0.getContainingDeclaration();
            }
            while(declarationDescriptor0 != null) {
                if(class0.isInstance(declarationDescriptor0)) {
                    return declarationDescriptor0;
                }
                declarationDescriptor0 = declarationDescriptor0.getContainingDeclaration();
            }
            return null;
        }
        DescriptorUtils.a(19);
        throw null;
    }

    @Nullable
    public static ClassDescriptor getSuperClassDescriptor(@NotNull ClassDescriptor classDescriptor0) {
        if(classDescriptor0 != null) {
            for(Object object0: classDescriptor0.getTypeConstructor().getSupertypes()) {
                ClassDescriptor classDescriptor1 = DescriptorUtils.getClassDescriptorForType(((KotlinType)object0));
                if(classDescriptor1.getKind() != ClassKind.INTERFACE) {
                    return classDescriptor1;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }
        DescriptorUtils.a(44);
        throw null;
    }

    public static boolean isAnnotationClass(@Nullable DeclarationDescriptor declarationDescriptor0) {
        return DescriptorUtils.d(declarationDescriptor0, ClassKind.ANNOTATION_CLASS);
    }

    public static boolean isAnonymousObject(@NotNull DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptor0 != null) {
            return DescriptorUtils.isClass(declarationDescriptor0) && declarationDescriptor0.getName().equals(SpecialNames.NO_NAME_PROVIDED);
        }
        DescriptorUtils.a(34);
        throw null;
    }

    public static boolean isClass(@Nullable DeclarationDescriptor declarationDescriptor0) {
        return DescriptorUtils.d(declarationDescriptor0, ClassKind.CLASS);
    }

    // 去混淆评级： 低(20)
    public static boolean isClassOrEnumClass(@Nullable DeclarationDescriptor declarationDescriptor0) {
        return DescriptorUtils.isClass(declarationDescriptor0) || DescriptorUtils.isEnumClass(declarationDescriptor0);
    }

    // 去混淆评级： 低(20)
    public static boolean isCompanionObject(@Nullable DeclarationDescriptor declarationDescriptor0) {
        return DescriptorUtils.d(declarationDescriptor0, ClassKind.OBJECT) && ((ClassDescriptor)declarationDescriptor0).isCompanionObject();
    }

    public static boolean isDescriptorWithLocalVisibility(DeclarationDescriptor declarationDescriptor0) {
        return declarationDescriptor0 instanceof DeclarationDescriptorWithVisibility && ((DeclarationDescriptorWithVisibility)declarationDescriptor0).getVisibility() == DescriptorVisibilities.LOCAL;
    }

    public static boolean isDirectSubclass(@NotNull ClassDescriptor classDescriptor0, @NotNull ClassDescriptor classDescriptor1) {
        if(classDescriptor0 != null) {
            if(classDescriptor1 != null) {
                for(Object object0: classDescriptor0.getTypeConstructor().getSupertypes()) {
                    if(DescriptorUtils.e(((KotlinType)object0), classDescriptor1.getOriginal())) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
                return false;
            }
            DescriptorUtils.a(27);
            throw null;
        }
        DescriptorUtils.a(26);
        throw null;
    }

    public static boolean isEnumClass(@Nullable DeclarationDescriptor declarationDescriptor0) {
        return DescriptorUtils.d(declarationDescriptor0, ClassKind.ENUM_CLASS);
    }

    public static boolean isEnumEntry(@NotNull DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptor0 != null) {
            return DescriptorUtils.d(declarationDescriptor0, ClassKind.ENUM_ENTRY);
        }
        DescriptorUtils.a(36);
        throw null;
    }

    public static boolean isInterface(@Nullable DeclarationDescriptor declarationDescriptor0) {
        return DescriptorUtils.d(declarationDescriptor0, ClassKind.INTERFACE);
    }

    public static boolean isLocal(@NotNull DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptor0 != null) {
            while(declarationDescriptor0 != null) {
                if(!DescriptorUtils.isAnonymousObject(declarationDescriptor0) && !DescriptorUtils.isDescriptorWithLocalVisibility(declarationDescriptor0)) {
                    declarationDescriptor0 = declarationDescriptor0.getContainingDeclaration();
                    continue;
                }
                return true;
            }
            return false;
        }
        DescriptorUtils.a(1);
        throw null;
    }

    // 去混淆评级： 低(20)
    public static boolean isSealedClass(@Nullable DeclarationDescriptor declarationDescriptor0) {
        return (DescriptorUtils.d(declarationDescriptor0, ClassKind.CLASS) || DescriptorUtils.d(declarationDescriptor0, ClassKind.INTERFACE)) && ((ClassDescriptor)declarationDescriptor0).getModality() == Modality.SEALED;
    }

    public static boolean isSubclass(@NotNull ClassDescriptor classDescriptor0, @NotNull ClassDescriptor classDescriptor1) {
        if(classDescriptor0 != null) {
            if(classDescriptor1 != null) {
                return DescriptorUtils.isSubtypeOfClass(classDescriptor0.getDefaultType(), classDescriptor1.getOriginal());
            }
            DescriptorUtils.a(29);
            throw null;
        }
        DescriptorUtils.a(28);
        throw null;
    }

    public static boolean isSubtypeOfClass(@NotNull KotlinType kotlinType0, @NotNull DeclarationDescriptor declarationDescriptor0) {
        if(kotlinType0 != null) {
            if(declarationDescriptor0 != null) {
                if(DescriptorUtils.e(kotlinType0, declarationDescriptor0)) {
                    return true;
                }
                for(Object object0: kotlinType0.getConstructor().getSupertypes()) {
                    if(DescriptorUtils.isSubtypeOfClass(((KotlinType)object0), declarationDescriptor0)) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
                return false;
            }
            DescriptorUtils.a(33);
            throw null;
        }
        DescriptorUtils.a(0x20);
        throw null;
    }

    public static boolean isTopLevelDeclaration(@Nullable DeclarationDescriptor declarationDescriptor0) {
        return declarationDescriptor0 != null && declarationDescriptor0.getContainingDeclaration() instanceof PackageFragmentDescriptor;
    }

    public static boolean shouldRecordInitializerForProperty(@NotNull VariableDescriptor variableDescriptor0, @NotNull KotlinType kotlinType0) {
        if(variableDescriptor0 != null) {
            if(kotlinType0 != null) {
                if(!variableDescriptor0.isVar() && !KotlinTypeKt.isError(kotlinType0)) {
                    if(TypeUtils.acceptsNullable(kotlinType0)) {
                        return true;
                    }
                    KotlinBuiltIns kotlinBuiltIns0 = DescriptorUtilsKt.getBuiltIns(variableDescriptor0);
                    return KotlinBuiltIns.isPrimitiveType(kotlinType0) || (KotlinTypeChecker.DEFAULT.equalTypes(kotlinBuiltIns0.getStringType(), kotlinType0) || KotlinTypeChecker.DEFAULT.equalTypes(kotlinBuiltIns0.getNumber().getDefaultType(), kotlinType0) || KotlinTypeChecker.DEFAULT.equalTypes(kotlinBuiltIns0.getAnyType(), kotlinType0) || UnsignedTypes.isUnsignedType(kotlinType0));
                }
                return false;
            }
            DescriptorUtils.a(67);
            throw null;
        }
        DescriptorUtils.a(66);
        throw null;
    }

    @NotNull
    public static CallableMemberDescriptor unwrapFakeOverride(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        if(callableMemberDescriptor0 != null) {
            while(callableMemberDescriptor0.getKind() == Kind.FAKE_OVERRIDE) {
                Collection collection0 = callableMemberDescriptor0.getOverriddenDescriptors();
                if(collection0.isEmpty()) {
                    throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + callableMemberDescriptor0);
                }
                Object object0 = collection0.iterator().next();
                callableMemberDescriptor0 = (CallableMemberDescriptor)object0;
            }
            return callableMemberDescriptor0;
        }
        DescriptorUtils.a(59);
        throw null;
    }

    @NotNull
    public static DeclarationDescriptorWithVisibility unwrapFakeOverrideToAnyDeclaration(@NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility0) {
        if(declarationDescriptorWithVisibility0 != null) {
            if(declarationDescriptorWithVisibility0 instanceof CallableMemberDescriptor) {
                return DescriptorUtils.unwrapFakeOverride(((CallableMemberDescriptor)declarationDescriptorWithVisibility0));
            }
            if(declarationDescriptorWithVisibility0 != null) {
                return declarationDescriptorWithVisibility0;
            }
            DescriptorUtils.a(65);
            throw null;
        }
        DescriptorUtils.a(0x40);
        throw null;
    }
}

