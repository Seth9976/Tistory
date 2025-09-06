package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ConstantValue {
    public final Object a;

    public ConstantValue(Object object0) {
        this.a = object0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this != object0) {
            Object object1 = this.getValue();
            Object object2 = null;
            ConstantValue constantValue0 = object0 instanceof ConstantValue ? ((ConstantValue)object0) : null;
            if(constantValue0 != null) {
                object2 = constantValue0.getValue();
            }
            return Intrinsics.areEqual(object1, object2);
        }
        return true;
    }

    @NotNull
    public abstract KotlinType getType(@NotNull ModuleDescriptor arg1);

    public Object getValue() {
        return this.a;
    }

    @Override
    public int hashCode() {
        Object object0 = this.getValue();
        return object0 == null ? 0 : object0.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return String.valueOf(this.getValue());
    }
}

