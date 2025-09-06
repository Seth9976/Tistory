package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import wb.a;

public final class StringValue extends ConstantValue {
    public StringValue(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        super(s);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType getType(ModuleDescriptor moduleDescriptor0) {
        return this.getType(moduleDescriptor0);
    }

    @NotNull
    public SimpleType getType(@NotNull ModuleDescriptor moduleDescriptor0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "module");
        SimpleType simpleType0 = moduleDescriptor0.getBuiltIns().getStringType();
        Intrinsics.checkNotNullExpressionValue(simpleType0, "module.builtIns.stringType");
        return simpleType0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("\"");
        return a.b('\"', ((String)this.getValue()), stringBuilder0);
    }
}

