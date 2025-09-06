package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

public class ArrayValue extends ConstantValue {
    public final Function1 b;

    public ArrayValue(@NotNull List list0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "value");
        Intrinsics.checkNotNullParameter(function10, "computeType");
        super(list0);
        this.b = function10;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public KotlinType getType(@NotNull ModuleDescriptor moduleDescriptor0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "module");
        KotlinType kotlinType0 = (KotlinType)this.b.invoke(moduleDescriptor0);
        if(!KotlinBuiltIns.isArray(kotlinType0) && !KotlinBuiltIns.isPrimitiveArray(kotlinType0)) {
            KotlinBuiltIns.isUnsignedArrayType(kotlinType0);
        }
        return kotlinType0;
    }
}

