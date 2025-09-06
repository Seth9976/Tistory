package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

public final class u extends Lambda implements Function0 {
    public final Data w;
    public final KClassImpl x;

    public u(Data kClassImpl$Data0, KClassImpl kClassImpl0) {
        this.w = kClassImpl$Data0;
        this.x = kClassImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Data kClassImpl$Data0 = this.w;
        Collection collection0 = kClassImpl$Data0.getDescriptor().getTypeConstructor().getSupertypes();
        Intrinsics.checkNotNullExpressionValue(collection0, "descriptor.typeConstructor.supertypes");
        ArrayList arrayList0 = new ArrayList(collection0.size());
        for(Object object0: collection0) {
            Intrinsics.checkNotNullExpressionValue(((KotlinType)object0), "kotlinType");
            arrayList0.add(new KTypeImpl(((KotlinType)object0), new s(((KotlinType)object0), kClassImpl$Data0, this.x)));
        }
        if(!KotlinBuiltIns.isSpecialClassWithNoSupertypes(kClassImpl$Data0.getDescriptor())) {
            if(!arrayList0.isEmpty()) {
                for(Object object1: arrayList0) {
                    ClassKind classKind0 = DescriptorUtils.getClassDescriptorForType(((KTypeImpl)object1).getType()).getKind();
                    Intrinsics.checkNotNullExpressionValue(classKind0, "getClassDescriptorForType(it.type).kind");
                    if(classKind0 != ClassKind.INTERFACE && classKind0 != ClassKind.ANNOTATION_CLASS) {
                        return CollectionsKt.compact(arrayList0);
                    }
                }
            }
            SimpleType simpleType0 = DescriptorUtilsKt.getBuiltIns(kClassImpl$Data0.getDescriptor()).getAnyType();
            Intrinsics.checkNotNullExpressionValue(simpleType0, "descriptor.builtIns.anyType");
            arrayList0.add(new KTypeImpl(simpleType0, t.w));
        }
        return CollectionsKt.compact(arrayList0);
    }
}

