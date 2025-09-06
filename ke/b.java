package ke;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public final class b extends DelegatedDescriptorVisibility {
    public final int b;

    public b(Visibility visibility0, int v) {
        this.b = v;
        super(visibility0);
    }

    public static void a(int v) {
        Object[] arr_object = new Object[3];
        switch(v) {
            case 1: {
                arr_object[0] = "what";
                break;
            }
            case 2: {
                arr_object[0] = "from";
                break;
            }
            default: {
                arr_object[0] = "descriptor";
            }
        }
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
        arr_object[2] = v == 1 || v == 2 ? "isVisible" : "hasContainingSourceFile";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    public static void b(int v) {
        Object[] arr_object = new Object[3];
        arr_object[0] = v == 1 ? "from" : "what";
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
        arr_object[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    public static void c(int v) {
        Object[] arr_object = new Object[3];
        arr_object[0] = v == 1 ? "from" : "what";
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
        arr_object[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    public static void d(int v) {
        Object[] arr_object = new Object[3];
        arr_object[0] = v == 1 ? "from" : "what";
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
        arr_object[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    public static void e(int v) {
        Object[] arr_object = new Object[3];
        switch(v) {
            case 1: {
                arr_object[0] = "from";
                break;
            }
            case 2: {
                arr_object[0] = "whatDeclaration";
                break;
            }
            case 3: {
                arr_object[0] = "fromClass";
                break;
            }
            default: {
                arr_object[0] = "what";
            }
        }
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
        arr_object[2] = v == 2 || v == 3 ? "doesReceiverFitForProtectedVisibility" : "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    public static void f(int v) {
        Object[] arr_object = new Object[3];
        arr_object[0] = v == 1 ? "from" : "what";
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
        arr_object[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    public static void g(int v) {
        Object[] arr_object = new Object[3];
        arr_object[0] = v == 1 ? "from" : "what";
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
        arr_object[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    public static void h(int v) {
        Object[] arr_object = new Object[3];
        arr_object[0] = v == 1 ? "from" : "what";
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
        arr_object[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    public static void i(int v) {
        Object[] arr_object = new Object[3];
        arr_object[0] = v == 1 ? "from" : "what";
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
        arr_object[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public final boolean isVisible(ReceiverValue receiverValue0, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility0, DeclarationDescriptor declarationDescriptor0, boolean z) {
        switch(this.b) {
            case 0: {
                if(declarationDescriptorWithVisibility0 != null) {
                    if(declarationDescriptor0 != null) {
                        if(DescriptorUtils.isTopLevelDeclaration(declarationDescriptorWithVisibility0) && DescriptorUtils.getContainingSourceFile(declarationDescriptor0) != SourceFile.NO_SOURCE_FILE) {
                            return DescriptorVisibilities.inSameFile(declarationDescriptorWithVisibility0, declarationDescriptor0);
                        }
                        if(declarationDescriptorWithVisibility0 instanceof ConstructorDescriptor) {
                            ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters0 = ((ConstructorDescriptor)declarationDescriptorWithVisibility0).getContainingDeclaration();
                            if(!z || !DescriptorUtils.isSealedClass(classifierDescriptorWithTypeParameters0) || !DescriptorUtils.isTopLevelDeclaration(classifierDescriptorWithTypeParameters0) || !(declarationDescriptor0 instanceof ConstructorDescriptor) || !DescriptorUtils.isTopLevelDeclaration(declarationDescriptor0.getContainingDeclaration()) || !DescriptorVisibilities.inSameFile(declarationDescriptorWithVisibility0, declarationDescriptor0)) {
                                goto label_15;
                            }
                            return true;
                        }
                    label_15:
                        while(declarationDescriptorWithVisibility0 != null) {
                            declarationDescriptorWithVisibility0 = declarationDescriptorWithVisibility0.getContainingDeclaration();
                            if(declarationDescriptorWithVisibility0 instanceof ClassDescriptor && !DescriptorUtils.isCompanionObject(declarationDescriptorWithVisibility0) || declarationDescriptorWithVisibility0 instanceof PackageFragmentDescriptor) {
                                break;
                            }
                        }
                        if(declarationDescriptorWithVisibility0 != null) {
                            while(declarationDescriptor0 != null) {
                                if(declarationDescriptorWithVisibility0 != declarationDescriptor0) {
                                    if(declarationDescriptor0 instanceof PackageFragmentDescriptor) {
                                        return declarationDescriptorWithVisibility0 instanceof PackageFragmentDescriptor && ((PackageFragmentDescriptor)declarationDescriptorWithVisibility0).getFqName().equals(((PackageFragmentDescriptor)declarationDescriptor0).getFqName()) && DescriptorUtils.areInSameModule(declarationDescriptor0, declarationDescriptorWithVisibility0);
                                    }
                                    declarationDescriptor0 = declarationDescriptor0.getContainingDeclaration();
                                    continue;
                                }
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    b.a(2);
                    throw null;
                }
                b.a(1);
                throw null;
            }
            case 1: {
                if(declarationDescriptorWithVisibility0 != null) {
                    if(declarationDescriptor0 != null) {
                        if(DescriptorVisibilities.PRIVATE.isVisible(receiverValue0, declarationDescriptorWithVisibility0, declarationDescriptor0, z)) {
                            if(receiverValue0 == DescriptorVisibilities.ALWAYS_SUITABLE_RECEIVER) {
                                return true;
                            }
                            if(receiverValue0 != DescriptorVisibilities.b) {
                                DeclarationDescriptor declarationDescriptor1 = DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility0, ClassDescriptor.class);
                                return declarationDescriptor1 == null || !(receiverValue0 instanceof ThisClassReceiver) ? false : ((ThisClassReceiver)receiverValue0).getClassDescriptor().getOriginal().equals(declarationDescriptor1.getOriginal());
                            }
                        }
                        return false;
                    }
                    b.b(1);
                    throw null;
                }
                b.b(0);
                throw null;
            }
            case 2: {
                if(declarationDescriptorWithVisibility0 != null) {
                    if(declarationDescriptor0 != null) {
                        Class class0 = ClassDescriptor.class;
                        ClassDescriptor classDescriptor0 = (ClassDescriptor)DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility0, class0);
                        ClassDescriptor classDescriptor1 = (ClassDescriptor)DescriptorUtils.getParentOfType(declarationDescriptor0, class0, false);
                        if(classDescriptor1 != null) {
                            if(classDescriptor0 != null && DescriptorUtils.isCompanionObject(classDescriptor0)) {
                                ClassDescriptor classDescriptor2 = (ClassDescriptor)DescriptorUtils.getParentOfType(classDescriptor0, class0);
                                if(classDescriptor2 == null || !DescriptorUtils.isSubclass(classDescriptor1, classDescriptor2)) {
                                    goto label_54;
                                }
                                return true;
                            }
                        label_54:
                            DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility1 = DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility0);
                            ClassDescriptor classDescriptor3 = (ClassDescriptor)DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility1, class0);
                            if(classDescriptor3 != null) {
                                if(DescriptorUtils.isSubclass(classDescriptor1, classDescriptor3)) {
                                    if(declarationDescriptorWithVisibility1 == null) {
                                        b.e(2);
                                        throw null;
                                    }
                                    if(receiverValue0 != DescriptorVisibilities.FALSE_IF_PROTECTED) {
                                        if(!(declarationDescriptorWithVisibility1 instanceof CallableMemberDescriptor) || declarationDescriptorWithVisibility1 instanceof ConstructorDescriptor || receiverValue0 == DescriptorVisibilities.ALWAYS_SUITABLE_RECEIVER) {
                                            return true;
                                        }
                                        if(receiverValue0 != DescriptorVisibilities.b && receiverValue0 != null) {
                                            KotlinType kotlinType0 = receiverValue0 instanceof SuperCallReceiverValue ? ((SuperCallReceiverValue)receiverValue0).getThisType() : receiverValue0.getType();
                                            return !DescriptorUtils.isSubtypeOfClass(kotlinType0, classDescriptor1) && !DynamicTypesKt.isDynamic(kotlinType0) ? this.isVisible(receiverValue0, declarationDescriptorWithVisibility0, classDescriptor1.getContainingDeclaration(), z) : true;
                                        }
                                    }
                                }
                                return this.isVisible(receiverValue0, declarationDescriptorWithVisibility0, classDescriptor1.getContainingDeclaration(), z);
                            }
                        }
                        return false;
                    }
                    b.e(1);
                    throw null;
                }
                b.e(0);
                throw null;
            }
            case 3: {
                if(declarationDescriptorWithVisibility0 != null) {
                    if(declarationDescriptor0 != null) {
                        ModuleDescriptor moduleDescriptor0 = DescriptorUtils.getContainingModule(declarationDescriptorWithVisibility0);
                        return DescriptorUtils.getContainingModule(declarationDescriptor0).shouldSeeInternalsOf(moduleDescriptor0) ? DescriptorVisibilities.c.isInFriendModule(declarationDescriptorWithVisibility0, declarationDescriptor0) : false;
                    }
                    b.f(1);
                    throw null;
                }
                b.f(0);
                throw null;
            }
            case 4: {
                if(declarationDescriptorWithVisibility0 != null) {
                    if(declarationDescriptor0 != null) {
                        return true;
                    }
                    b.g(1);
                    throw null;
                }
                b.g(0);
                throw null;
            }
            case 5: {
                if(declarationDescriptorWithVisibility0 != null) {
                    if(declarationDescriptor0 != null) {
                        throw new IllegalStateException("This method shouldn\'t be invoked for LOCAL visibility");
                    }
                    b.h(1);
                    throw null;
                }
                b.h(0);
                throw null;
            }
            case 6: {
                if(declarationDescriptorWithVisibility0 != null) {
                    if(declarationDescriptor0 != null) {
                        throw new IllegalStateException("Visibility is unknown yet");
                    }
                    b.i(1);
                    throw null;
                }
                b.i(0);
                throw null;
            }
            case 7: {
                if(declarationDescriptorWithVisibility0 != null) {
                    if(declarationDescriptor0 != null) {
                        return false;
                    }
                    b.j(1);
                    throw null;
                }
                b.j(0);
                throw null;
            }
            case 8: {
                if(declarationDescriptorWithVisibility0 != null) {
                    if(declarationDescriptor0 != null) {
                        return false;
                    }
                    b.k(1);
                    throw null;
                }
                b.k(0);
                throw null;
            }
            case 9: {
                if(declarationDescriptorWithVisibility0 != null) {
                    if(declarationDescriptor0 != null) {
                        return JavaDescriptorVisibilities.c(declarationDescriptorWithVisibility0, declarationDescriptor0);
                    }
                    b.l(1);
                    throw null;
                }
                b.l(0);
                throw null;
            }
            case 10: {
                if(declarationDescriptorWithVisibility0 != null) {
                    if(declarationDescriptor0 != null) {
                        return JavaDescriptorVisibilities.b(receiverValue0, declarationDescriptorWithVisibility0, declarationDescriptor0);
                    }
                    b.c(1);
                    throw null;
                }
                b.c(0);
                throw null;
            }
            default: {
                if(declarationDescriptorWithVisibility0 != null) {
                    if(declarationDescriptor0 != null) {
                        return JavaDescriptorVisibilities.b(receiverValue0, declarationDescriptorWithVisibility0, declarationDescriptor0);
                    }
                    b.d(1);
                    throw null;
                }
                b.d(0);
                throw null;
            }
        }
    }

    public static void j(int v) {
        Object[] arr_object = new Object[3];
        arr_object[0] = v == 1 ? "from" : "what";
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
        arr_object[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    public static void k(int v) {
        Object[] arr_object = new Object[3];
        arr_object[0] = v == 1 ? "from" : "what";
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
        arr_object[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    public static void l(int v) {
        Object[] arr_object = new Object[3];
        arr_object[0] = v == 1 ? "from" : "what";
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
        arr_object[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }
}

