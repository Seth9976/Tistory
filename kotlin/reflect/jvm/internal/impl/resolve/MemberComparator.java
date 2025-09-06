package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Comparator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.n;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public class MemberComparator implements Comparator {
    public static class NameAndTypeMemberComparator implements Comparator {
        public static final NameAndTypeMemberComparator INSTANCE;

        static {
            NameAndTypeMemberComparator.INSTANCE = new NameAndTypeMemberComparator();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public static Integer a(DeclarationDescriptor declarationDescriptor0, DeclarationDescriptor declarationDescriptor1) {
            int v = NameAndTypeMemberComparator.b(declarationDescriptor1) - NameAndTypeMemberComparator.b(declarationDescriptor0);
            if(v != 0) {
                return v;
            }
            if(DescriptorUtils.isEnumEntry(declarationDescriptor0) && DescriptorUtils.isEnumEntry(declarationDescriptor1)) {
                return 0;
            }
            int v1 = declarationDescriptor0.getName().compareTo(declarationDescriptor1.getName());
            return v1 == 0 ? null : v1;
        }

        public static int b(DeclarationDescriptor declarationDescriptor0) {
            if(DescriptorUtils.isEnumEntry(declarationDescriptor0)) {
                return 8;
            }
            if(declarationDescriptor0 instanceof ConstructorDescriptor) {
                return 7;
            }
            if(declarationDescriptor0 instanceof PropertyDescriptor) {
                return ((PropertyDescriptor)declarationDescriptor0).getExtensionReceiverParameter() == null ? 6 : 5;
            }
            if(declarationDescriptor0 instanceof FunctionDescriptor) {
                return ((FunctionDescriptor)declarationDescriptor0).getExtensionReceiverParameter() == null ? 4 : 3;
            }
            if(declarationDescriptor0 instanceof ClassDescriptor) {
                return 2;
            }
            return declarationDescriptor0 instanceof TypeAliasDescriptor ? 1 : 0;
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.compare(((DeclarationDescriptor)object0), ((DeclarationDescriptor)object1));
        }

        public int compare(DeclarationDescriptor declarationDescriptor0, DeclarationDescriptor declarationDescriptor1) {
            Integer integer0 = NameAndTypeMemberComparator.a(declarationDescriptor0, declarationDescriptor1);
            return integer0 == null ? 0 : ((int)integer0);
        }
    }

    public static final MemberComparator INSTANCE;
    public static final DescriptorRenderer a;

    static {
        MemberComparator.INSTANCE = new MemberComparator();  // 初始化器: Ljava/lang/Object;-><init>()V
        n n0 = new n(3);
        MemberComparator.a = DescriptorRenderer.Companion.withOptions(n0);
    }

    @Override
    public int compare(Object object0, Object object1) {
        return this.compare(((DeclarationDescriptor)object0), ((DeclarationDescriptor)object1));
    }

    public int compare(DeclarationDescriptor declarationDescriptor0, DeclarationDescriptor declarationDescriptor1) {
        Integer integer0 = NameAndTypeMemberComparator.a(declarationDescriptor0, declarationDescriptor1);
        if(integer0 != null) {
            return (int)integer0;
        }
        DescriptorRenderer descriptorRenderer0 = MemberComparator.a;
        if(declarationDescriptor0 instanceof TypeAliasDescriptor && declarationDescriptor1 instanceof TypeAliasDescriptor) {
            int v = descriptorRenderer0.renderType(((TypeAliasDescriptor)declarationDescriptor0).getUnderlyingType()).compareTo(descriptorRenderer0.renderType(((TypeAliasDescriptor)declarationDescriptor1).getUnderlyingType()));
            if(v == 0) {
                goto label_57;
            }
            return v;
        }
        if(declarationDescriptor0 instanceof CallableDescriptor && declarationDescriptor1 instanceof CallableDescriptor) {
            ReceiverParameterDescriptor receiverParameterDescriptor0 = ((CallableDescriptor)declarationDescriptor0).getExtensionReceiverParameter();
            ReceiverParameterDescriptor receiverParameterDescriptor1 = ((CallableDescriptor)declarationDescriptor1).getExtensionReceiverParameter();
            if(receiverParameterDescriptor0 != null) {
                int v1 = descriptorRenderer0.renderType(receiverParameterDescriptor0.getType()).compareTo(descriptorRenderer0.renderType(receiverParameterDescriptor1.getType()));
                if(v1 != 0) {
                    return v1;
                }
            }
            List list0 = ((CallableDescriptor)declarationDescriptor0).getValueParameters();
            List list1 = ((CallableDescriptor)declarationDescriptor1).getValueParameters();
            for(int v2 = 0; v2 < Math.min(list0.size(), list1.size()); ++v2) {
                int v3 = descriptorRenderer0.renderType(((ValueParameterDescriptor)list0.get(v2)).getType()).compareTo(descriptorRenderer0.renderType(((ValueParameterDescriptor)list1.get(v2)).getType()));
                if(v3 != 0) {
                    return v3;
                }
            }
            int v4 = list0.size() - list1.size();
            if(v4 != 0) {
                return v4;
            }
            List list2 = ((CallableDescriptor)declarationDescriptor0).getTypeParameters();
            List list3 = ((CallableDescriptor)declarationDescriptor1).getTypeParameters();
            for(int v5 = 0; v5 < Math.min(list2.size(), list3.size()); ++v5) {
                List list4 = ((TypeParameterDescriptor)list2.get(v5)).getUpperBounds();
                List list5 = ((TypeParameterDescriptor)list3.get(v5)).getUpperBounds();
                int v6 = list4.size() - list5.size();
                if(v6 != 0) {
                    return v6;
                }
                for(int v7 = 0; v7 < list4.size(); ++v7) {
                    int v8 = descriptorRenderer0.renderType(((KotlinType)list4.get(v7))).compareTo(descriptorRenderer0.renderType(((KotlinType)list5.get(v7))));
                    if(v8 != 0) {
                        return v8;
                    }
                }
            }
            int v9 = list2.size() - list3.size();
            if(v9 != 0) {
                return v9;
            }
            if(!(((CallableDescriptor)declarationDescriptor0) instanceof CallableMemberDescriptor) || !(((CallableDescriptor)declarationDescriptor1) instanceof CallableMemberDescriptor)) {
                goto label_57;
            }
            int v10 = ((CallableMemberDescriptor)(((CallableDescriptor)declarationDescriptor0))).getKind().ordinal() - ((CallableMemberDescriptor)(((CallableDescriptor)declarationDescriptor1))).getKind().ordinal();
            if(v10 == 0) {
                goto label_57;
            }
            return v10;
        }
        if(!(declarationDescriptor0 instanceof ClassDescriptor) || !(declarationDescriptor1 instanceof ClassDescriptor)) {
            throw new AssertionError(String.format("Unsupported pair of descriptors:\n\'%s\' Class: %s\n%s\' Class: %s", declarationDescriptor0, declarationDescriptor0.getClass(), declarationDescriptor1, declarationDescriptor1.getClass()));
        }
        if(((ClassDescriptor)declarationDescriptor0).getKind().ordinal() != ((ClassDescriptor)declarationDescriptor1).getKind().ordinal()) {
            return ((ClassDescriptor)declarationDescriptor0).getKind().ordinal() - ((ClassDescriptor)declarationDescriptor1).getKind().ordinal();
        }
        if(((ClassDescriptor)declarationDescriptor0).isCompanionObject() != ((ClassDescriptor)declarationDescriptor1).isCompanionObject()) {
            return ((ClassDescriptor)declarationDescriptor0).isCompanionObject() ? 1 : -1;
        }
    label_57:
        int v11 = descriptorRenderer0.render(declarationDescriptor0).compareTo(descriptorRenderer0.render(declarationDescriptor1));
        return v11 == 0 ? DescriptorUtils.getContainingModule(declarationDescriptor0).getName().compareTo(DescriptorUtils.getContainingModule(declarationDescriptor1).getName()) : v11;
    }
}

