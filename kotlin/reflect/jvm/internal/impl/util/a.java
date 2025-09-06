package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

public final class a implements Check {
    public static final a a;

    static {
        a.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.Check
    public final boolean check(FunctionDescriptor functionDescriptor0) {
        Intrinsics.checkNotNullParameter(functionDescriptor0, "functionDescriptor");
        ValueParameterDescriptor valueParameterDescriptor0 = (ValueParameterDescriptor)functionDescriptor0.getValueParameters().get(1);
        Intrinsics.checkNotNullExpressionValue(valueParameterDescriptor0, "secondParameter");
        ModuleDescriptor moduleDescriptor0 = DescriptorUtilsKt.getModule(valueParameterDescriptor0);
        KotlinType kotlinType0 = ReflectionTypes.Companion.createKPropertyStarType(moduleDescriptor0);
        if(kotlinType0 != null) {
            KotlinType kotlinType1 = valueParameterDescriptor0.getType();
            Intrinsics.checkNotNullExpressionValue(kotlinType1, "secondParameter.type");
            return TypeUtilsKt.isSubtypeOf(kotlinType0, TypeUtilsKt.makeNotNullable(kotlinType1));
        }
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.Check
    public final String getDescription() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.Check
    public final String invoke(FunctionDescriptor functionDescriptor0) {
        return DefaultImpls.invoke(this, functionDescriptor0);
    }
}

