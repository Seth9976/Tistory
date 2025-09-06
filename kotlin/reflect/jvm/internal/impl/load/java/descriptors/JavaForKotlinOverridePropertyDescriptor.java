package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaForKotlinOverridePropertyDescriptor extends JavaPropertyDescriptor {
    public final SimpleFunctionDescriptor B;
    public final SimpleFunctionDescriptor C;
    public final PropertyDescriptor D;

    public JavaForKotlinOverridePropertyDescriptor(@NotNull ClassDescriptor classDescriptor0, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor0, @Nullable SimpleFunctionDescriptor simpleFunctionDescriptor1, @NotNull PropertyDescriptor propertyDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "ownerDescriptor");
        Intrinsics.checkNotNullParameter(simpleFunctionDescriptor0, "getterMethod");
        Intrinsics.checkNotNullParameter(propertyDescriptor0, "overriddenProperty");
        Modality modality0 = simpleFunctionDescriptor0.getModality();
        DescriptorVisibility descriptorVisibility0 = simpleFunctionDescriptor0.getVisibility();
        super(classDescriptor0, Annotations.Companion.getEMPTY(), modality0, descriptorVisibility0, simpleFunctionDescriptor1 != null, propertyDescriptor0.getName(), simpleFunctionDescriptor0.getSource(), null, Kind.DECLARATION, false, null);
        this.B = simpleFunctionDescriptor0;
        this.C = simpleFunctionDescriptor1;
        this.D = propertyDescriptor0;
    }
}

