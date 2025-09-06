package kotlin.reflect.jvm.internal;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.DescriptorsJvmAbiUtil;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;

public final class m0 extends Lambda implements Function0 {
    public final KPropertyImpl w;

    public m0(KPropertyImpl kPropertyImpl0) {
        this.w = kPropertyImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Class class0;
        KPropertyImpl kPropertyImpl0 = this.w;
        PropertyDescriptor propertyDescriptor0 = kPropertyImpl0.getDescriptor();
        JvmPropertySignature jvmPropertySignature0 = RuntimeTypeMapper.INSTANCE.mapPropertySignature(propertyDescriptor0);
        if(jvmPropertySignature0 instanceof KotlinProperty) {
            PropertyDescriptor propertyDescriptor1 = ((KotlinProperty)jvmPropertySignature0).getDescriptor();
            Property protoBuf$Property0 = ((KotlinProperty)jvmPropertySignature0).getProto();
            NameResolver nameResolver0 = ((KotlinProperty)jvmPropertySignature0).getNameResolver();
            TypeTable typeTable0 = ((KotlinProperty)jvmPropertySignature0).getTypeTable();
            Field jvmMemberSignature$Field0 = JvmProtoBufUtil.getJvmFieldSignature$default(JvmProtoBufUtil.INSTANCE, protoBuf$Property0, nameResolver0, typeTable0, false, 8, null);
            if(jvmMemberSignature$Field0 != null) {
                if(DescriptorsJvmAbiUtil.isPropertyWithBackingFieldInOuterClass(propertyDescriptor1) || JvmProtoBufUtil.isMovedFromInterfaceCompanion(((KotlinProperty)jvmPropertySignature0).getProto())) {
                    class0 = kPropertyImpl0.getContainer().getJClass().getEnclosingClass();
                }
                else {
                    DeclarationDescriptor declarationDescriptor0 = propertyDescriptor1.getContainingDeclaration();
                    class0 = declarationDescriptor0 instanceof ClassDescriptor ? UtilKt.toJavaClass(((ClassDescriptor)declarationDescriptor0)) : kPropertyImpl0.getContainer().getJClass();
                }
                if(class0 != null) {
                    try {
                        return class0.getDeclaredField(jvmMemberSignature$Field0.getName());
                    }
                    catch(NoSuchFieldException unused_ex) {
                    }
                }
            }
        }
        else {
            if(jvmPropertySignature0 instanceof JavaField) {
                return ((JavaField)jvmPropertySignature0).getField();
            }
            if(!(jvmPropertySignature0 instanceof JavaMethodProperty) && !(jvmPropertySignature0 instanceof MappedKotlinProperty)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}

