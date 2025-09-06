package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public final class s extends Lambda implements Function0 {
    public final KotlinType w;
    public final Data x;
    public final KClassImpl y;

    public s(KotlinType kotlinType0, Data kClassImpl$Data0, KClassImpl kClassImpl0) {
        this.w = kotlinType0;
        this.x = kClassImpl$Data0;
        this.y = kClassImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Type type0;
        ClassifierDescriptor classifierDescriptor0 = this.w.getConstructor().getDeclarationDescriptor();
        if(!(classifierDescriptor0 instanceof ClassDescriptor)) {
            throw new KotlinReflectionInternalError("Supertype not a class: " + classifierDescriptor0);
        }
        Class class0 = UtilKt.toJavaClass(((ClassDescriptor)classifierDescriptor0));
        Data kClassImpl$Data0 = this.x;
        if(class0 == null) {
            throw new KotlinReflectionInternalError("Unsupported superclass of " + kClassImpl$Data0 + ": " + classifierDescriptor0);
        }
        KClassImpl kClassImpl0 = this.y;
        if(Intrinsics.areEqual(kClassImpl0.getJClass().getSuperclass(), class0)) {
            type0 = kClassImpl0.getJClass().getGenericSuperclass();
            Intrinsics.checkNotNullExpressionValue(type0, "{\n                      …ass\n                    }");
            return type0;
        }
        Class[] arr_class = kClassImpl0.getJClass().getInterfaces();
        Intrinsics.checkNotNullExpressionValue(arr_class, "jClass.interfaces");
        int v = ArraysKt___ArraysKt.indexOf(arr_class, class0);
        if(v < 0) {
            throw new KotlinReflectionInternalError("No superclass of " + kClassImpl$Data0 + " in Java reflection for " + classifierDescriptor0);
        }
        type0 = kClassImpl0.getJClass().getGenericInterfaces()[v];
        Intrinsics.checkNotNullExpressionValue(type0, "{\n                      …ex]\n                    }");
        return type0;
    }
}

