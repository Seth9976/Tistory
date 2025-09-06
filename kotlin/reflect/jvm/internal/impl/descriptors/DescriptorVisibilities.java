package kotlin.reflect.jvm.internal.impl.descriptors;

import j7.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import ke.b;
import kotlin.collections.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper.EMPTY;
import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DescriptorVisibilities {
    public static final ReceiverValue ALWAYS_SUITABLE_RECEIVER;
    public static final DescriptorVisibility DEFAULT_VISIBILITY;
    @Deprecated
    public static final ReceiverValue FALSE_IF_PROTECTED;
    @NotNull
    public static final DescriptorVisibility INHERITED;
    @NotNull
    public static final DescriptorVisibility INTERNAL;
    @NotNull
    public static final DescriptorVisibility INVISIBLE_FAKE;
    public static final Set INVISIBLE_FROM_OTHER_MODULES;
    @NotNull
    public static final DescriptorVisibility LOCAL;
    @NotNull
    public static final DescriptorVisibility PRIVATE;
    @NotNull
    public static final DescriptorVisibility PRIVATE_TO_THIS;
    @NotNull
    public static final DescriptorVisibility PROTECTED;
    @NotNull
    public static final DescriptorVisibility PUBLIC;
    @NotNull
    public static final DescriptorVisibility UNKNOWN;
    public static final Map a;
    public static final d b;
    public static final ModuleVisibilityHelper c;
    public static final HashMap d;

    static {
        ModuleVisibilityHelper moduleVisibilityHelper0;
        b b0 = new b(Private.INSTANCE, 0);
        DescriptorVisibilities.PRIVATE = b0;
        b b1 = new b(PrivateToThis.INSTANCE, 1);
        DescriptorVisibilities.PRIVATE_TO_THIS = b1;
        b b2 = new b(Protected.INSTANCE, 2);
        DescriptorVisibilities.PROTECTED = b2;
        b b3 = new b(Internal.INSTANCE, 3);
        DescriptorVisibilities.INTERNAL = b3;
        b b4 = new b(Public.INSTANCE, 4);
        DescriptorVisibilities.PUBLIC = b4;
        b b5 = new b(Local.INSTANCE, 5);
        DescriptorVisibilities.LOCAL = b5;
        b b6 = new b(Inherited.INSTANCE, 6);
        DescriptorVisibilities.INHERITED = b6;
        b b7 = new b(InvisibleFake.INSTANCE, 7);
        DescriptorVisibilities.INVISIBLE_FAKE = b7;
        b b8 = new b(Unknown.INSTANCE, 8);
        DescriptorVisibilities.UNKNOWN = b8;
        DescriptorVisibilities.INVISIBLE_FROM_OTHER_MODULES = Collections.unmodifiableSet(f0.setOf(new DescriptorVisibility[]{b0, b1, b3, b5}));
        HashMap hashMap0 = CollectionsKt.newHashMapWithExpectedSize(4);
        hashMap0.put(b1, 0);
        hashMap0.put(b0, 0);
        hashMap0.put(b3, 1);
        hashMap0.put(b2, 1);
        hashMap0.put(b4, 2);
        DescriptorVisibilities.a = Collections.unmodifiableMap(hashMap0);
        DescriptorVisibilities.DEFAULT_VISIBILITY = b4;
        DescriptorVisibilities.b = new d(2);
        DescriptorVisibilities.ALWAYS_SUITABLE_RECEIVER = new d(3);
        DescriptorVisibilities.FALSE_IF_PROTECTED = new d(4);
        Iterator iterator0 = ServiceLoader.load(ModuleVisibilityHelper.class, ModuleVisibilityHelper.class.getClassLoader()).iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            moduleVisibilityHelper0 = (ModuleVisibilityHelper)object0;
        }
        else {
            moduleVisibilityHelper0 = EMPTY.INSTANCE;
        }
        DescriptorVisibilities.c = moduleVisibilityHelper0;
        DescriptorVisibilities.d = new HashMap();
        DescriptorVisibilities.b(b0);
        DescriptorVisibilities.b(b1);
        DescriptorVisibilities.b(b2);
        DescriptorVisibilities.b(b3);
        DescriptorVisibilities.b(b4);
        DescriptorVisibilities.b(b5);
        DescriptorVisibilities.b(b6);
        DescriptorVisibilities.b(b7);
        DescriptorVisibilities.b(b8);
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 16 ? 2 : 3)];
        if(v == 1 || v == 3 || (v == 5 || v == 7)) {
            arr_object[0] = "from";
        }
        else {
            switch(v) {
                case 9: {
                    arr_object[0] = "from";
                    break;
                }
                case 10: 
                case 12: {
                    arr_object[0] = "first";
                    break;
                }
                case 11: 
                case 13: {
                    arr_object[0] = "second";
                    break;
                }
                case 14: 
                case 15: {
                    arr_object[0] = "visibility";
                    break;
                }
                case 16: {
                    arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                }
                default: {
                    arr_object[0] = "what";
                }
            }
        }
        arr_object[1] = v == 16 ? "toDescriptorVisibility" : "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        switch(v) {
            case 2: 
            case 3: {
                arr_object[2] = "isVisibleIgnoringReceiver";
                break;
            }
            case 4: 
            case 5: {
                arr_object[2] = "isVisibleWithAnyReceiver";
                break;
            }
            case 6: 
            case 7: {
                arr_object[2] = "inSameFile";
                break;
            }
            case 8: 
            case 9: {
                arr_object[2] = "findInvisibleMember";
                break;
            }
            case 10: 
            case 11: {
                arr_object[2] = "compareLocal";
                break;
            }
            case 12: 
            case 13: {
                arr_object[2] = "compare";
                break;
            }
            case 14: {
                arr_object[2] = "isPrivate";
                break;
            }
            case 15: {
                arr_object[2] = "toDescriptorVisibility";
                break;
            }
            case 16: {
                break;
            }
            default: {
                arr_object[2] = "isVisible";
            }
        }
        String s = String.format((v == 16 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalArgumentException illegalArgumentException0 = v == 16 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalArgumentException0;
    }

    public static void b(DelegatedDescriptorVisibility delegatedDescriptorVisibility0) {
        DescriptorVisibilities.d.put(delegatedDescriptorVisibility0.getDelegate(), delegatedDescriptorVisibility0);
    }

    @Nullable
    public static Integer compare(@NotNull DescriptorVisibility descriptorVisibility0, @NotNull DescriptorVisibility descriptorVisibility1) {
        if(descriptorVisibility0 != null) {
            if(descriptorVisibility1 != null) {
                Integer integer0 = descriptorVisibility0.compareTo(descriptorVisibility1);
                if(integer0 != null) {
                    return integer0;
                }
                Integer integer1 = descriptorVisibility1.compareTo(descriptorVisibility0);
                return integer1 == null ? null : ((int)(-((int)integer1)));
            }
            DescriptorVisibilities.a(13);
            throw null;
        }
        DescriptorVisibilities.a(12);
        throw null;
    }

    @Nullable
    public static DeclarationDescriptorWithVisibility findInvisibleMember(@Nullable ReceiverValue receiverValue0, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility0, @NotNull DeclarationDescriptor declarationDescriptor0, boolean z) {
        if(declarationDescriptorWithVisibility0 != null) {
            if(declarationDescriptor0 != null) {
                for(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility1 = (DeclarationDescriptorWithVisibility)declarationDescriptorWithVisibility0.getOriginal(); declarationDescriptorWithVisibility1 != null && declarationDescriptorWithVisibility1.getVisibility() != DescriptorVisibilities.LOCAL; declarationDescriptorWithVisibility1 = (DeclarationDescriptorWithVisibility)DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility1, DeclarationDescriptorWithVisibility.class)) {
                    if(!declarationDescriptorWithVisibility1.getVisibility().isVisible(receiverValue0, declarationDescriptorWithVisibility1, declarationDescriptor0, z)) {
                        return declarationDescriptorWithVisibility1;
                    }
                }
                if(declarationDescriptorWithVisibility0 instanceof TypeAliasConstructorDescriptor) {
                    DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2 = DescriptorVisibilities.findInvisibleMember(receiverValue0, ((TypeAliasConstructorDescriptor)declarationDescriptorWithVisibility0).getUnderlyingConstructorDescriptor(), declarationDescriptor0, z);
                    return declarationDescriptorWithVisibility2 == null ? null : declarationDescriptorWithVisibility2;
                }
                return null;
            }
            DescriptorVisibilities.a(9);
            throw null;
        }
        DescriptorVisibilities.a(8);
        throw null;
    }

    public static boolean inSameFile(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull DeclarationDescriptor declarationDescriptor1) {
        if(declarationDescriptor0 != null) {
            if(declarationDescriptor1 != null) {
                SourceFile sourceFile0 = DescriptorUtils.getContainingSourceFile(declarationDescriptor1);
                return sourceFile0 == SourceFile.NO_SOURCE_FILE ? false : sourceFile0.equals(DescriptorUtils.getContainingSourceFile(declarationDescriptor0));
            }
            DescriptorVisibilities.a(7);
            throw null;
        }
        DescriptorVisibilities.a(6);
        throw null;
    }

    public static boolean isPrivate(@NotNull DescriptorVisibility descriptorVisibility0) {
        if(descriptorVisibility0 != null) {
            return descriptorVisibility0 == DescriptorVisibilities.PRIVATE || descriptorVisibility0 == DescriptorVisibilities.PRIVATE_TO_THIS;
        }
        DescriptorVisibilities.a(14);
        throw null;
    }

    public static boolean isVisibleIgnoringReceiver(@NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility0, @NotNull DeclarationDescriptor declarationDescriptor0, boolean z) {
        if(declarationDescriptorWithVisibility0 != null) {
            if(declarationDescriptor0 != null) {
                return DescriptorVisibilities.findInvisibleMember(DescriptorVisibilities.ALWAYS_SUITABLE_RECEIVER, declarationDescriptorWithVisibility0, declarationDescriptor0, z) == null;
            }
            DescriptorVisibilities.a(3);
            throw null;
        }
        DescriptorVisibilities.a(2);
        throw null;
    }

    @NotNull
    public static DescriptorVisibility toDescriptorVisibility(@NotNull Visibility visibility0) {
        if(visibility0 != null) {
            DescriptorVisibility descriptorVisibility0 = (DescriptorVisibility)DescriptorVisibilities.d.get(visibility0);
            if(descriptorVisibility0 == null) {
                throw new IllegalArgumentException("Inapplicable visibility: " + visibility0);
            }
            return descriptorVisibility0;
        }
        DescriptorVisibilities.a(15);
        throw null;
    }
}

