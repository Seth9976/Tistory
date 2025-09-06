package ze;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;

public final class d extends ClassConstructorDescriptorImpl {
    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl
    public static void a(int v) {
        Object[] arr_object = new Object[3];
        arr_object[0] = v == 1 ? "source" : "containingClass";
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
        arr_object[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }
}

