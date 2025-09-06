package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

public interface SimpleFunctionDescriptor extends FunctionDescriptor {
    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    @NotNull
    CopyBuilder newCopyBuilder();
}

