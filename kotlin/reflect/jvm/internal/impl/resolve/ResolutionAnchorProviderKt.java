package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ResolutionAnchorProviderKt {
    public static final ModuleCapability a;

    static {
        ResolutionAnchorProviderKt.a = new ModuleCapability("ResolutionAnchorProvider");
    }

    @Nullable
    public static final ModuleDescriptor getResolutionAnchorIfAny(@NotNull ModuleDescriptor moduleDescriptor0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "<this>");
        ResolutionAnchorProvider resolutionAnchorProvider0 = (ResolutionAnchorProvider)moduleDescriptor0.getCapability(ResolutionAnchorProviderKt.a);
        return resolutionAnchorProvider0 == null ? null : resolutionAnchorProvider0.getResolutionAnchor(moduleDescriptor0);
    }
}

