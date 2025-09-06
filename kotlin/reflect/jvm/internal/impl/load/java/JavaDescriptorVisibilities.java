package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.HashMap;
import ke.b;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.PackageVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.ProtectedAndPackage;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.ProtectedStaticVisibility;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import org.jetbrains.annotations.NotNull;

public class JavaDescriptorVisibilities {
    @NotNull
    public static final DescriptorVisibility PACKAGE_VISIBILITY;
    @NotNull
    public static final DescriptorVisibility PROTECTED_AND_PACKAGE;
    @NotNull
    public static final DescriptorVisibility PROTECTED_STATIC_VISIBILITY;
    public static final HashMap a;

    static {
        b b0 = new b(PackageVisibility.INSTANCE, 9);
        JavaDescriptorVisibilities.PACKAGE_VISIBILITY = b0;
        b b1 = new b(ProtectedStaticVisibility.INSTANCE, 10);
        JavaDescriptorVisibilities.PROTECTED_STATIC_VISIBILITY = b1;
        b b2 = new b(ProtectedAndPackage.INSTANCE, 11);
        JavaDescriptorVisibilities.PROTECTED_AND_PACKAGE = b2;
        HashMap hashMap0 = new HashMap();
        JavaDescriptorVisibilities.a = hashMap0;
        hashMap0.put(b0.getDelegate(), b0);
        hashMap0.put(b1.getDelegate(), b1);
        hashMap0.put(b2.getDelegate(), b2);
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 5 || v == 6 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "from";
                break;
            }
            case 2: {
                arr_object[0] = "first";
                break;
            }
            case 3: {
                arr_object[0] = "second";
                break;
            }
            case 4: {
                arr_object[0] = "visibility";
                break;
            }
            case 5: 
            case 6: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            }
            default: {
                arr_object[0] = "what";
            }
        }
        arr_object[1] = v == 5 || v == 6 ? "toDescriptorVisibility" : "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        if(v == 2 || v == 3) {
            arr_object[2] = "areInSamePackage";
        }
        else {
            switch(v) {
                case 4: {
                    arr_object[2] = "toDescriptorVisibility";
                    break;
                }
                case 5: 
                case 6: {
                    break;
                }
                default: {
                    arr_object[2] = "isVisibleForProtectedAndPackage";
                }
            }
        }
        String s = String.format((v == 5 || v == 6 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 5 || v == 6 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    public static boolean b(ReceiverValue receiverValue0, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility0, DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptorWithVisibility0 != null) {
            if(declarationDescriptor0 != null) {
                return JavaDescriptorVisibilities.c(DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility0), declarationDescriptor0) ? true : DescriptorVisibilities.PROTECTED.isVisible(receiverValue0, declarationDescriptorWithVisibility0, declarationDescriptor0, false);
            }
            JavaDescriptorVisibilities.a(1);
            throw null;
        }
        JavaDescriptorVisibilities.a(0);
        throw null;
    }

    public static boolean c(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility0, DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptorWithVisibility0 != null) {
            if(declarationDescriptor0 != null) {
                PackageFragmentDescriptor packageFragmentDescriptor0 = (PackageFragmentDescriptor)DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility0, PackageFragmentDescriptor.class, false);
                PackageFragmentDescriptor packageFragmentDescriptor1 = (PackageFragmentDescriptor)DescriptorUtils.getParentOfType(declarationDescriptor0, PackageFragmentDescriptor.class, false);
                return packageFragmentDescriptor1 != null && packageFragmentDescriptor0 != null && packageFragmentDescriptor0.getFqName().equals(packageFragmentDescriptor1.getFqName());
            }
            JavaDescriptorVisibilities.a(3);
            throw null;
        }
        JavaDescriptorVisibilities.a(2);
        throw null;
    }

    @NotNull
    public static DescriptorVisibility toDescriptorVisibility(@NotNull Visibility visibility0) {
        if(visibility0 != null) {
            DescriptorVisibility descriptorVisibility0 = (DescriptorVisibility)JavaDescriptorVisibilities.a.get(visibility0);
            if(descriptorVisibility0 == null) {
                DescriptorVisibility descriptorVisibility1 = DescriptorVisibilities.toDescriptorVisibility(visibility0);
                if(descriptorVisibility1 != null) {
                    return descriptorVisibility1;
                }
                JavaDescriptorVisibilities.a(5);
                throw null;
            }
            return descriptorVisibility0;
        }
        JavaDescriptorVisibilities.a(4);
        throw null;
    }
}

