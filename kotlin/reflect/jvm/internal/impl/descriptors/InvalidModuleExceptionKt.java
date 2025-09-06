package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class InvalidModuleExceptionKt {
    public static final ModuleCapability a;

    static {
        InvalidModuleExceptionKt.a = new ModuleCapability("InvalidModuleNotifier");
    }

    public static final void moduleInvalidated(@NotNull ModuleDescriptor moduleDescriptor0) {
        Unit unit0;
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "<this>");
        InvalidModuleNotifier invalidModuleNotifier0 = (InvalidModuleNotifier)moduleDescriptor0.getCapability(InvalidModuleExceptionKt.a);
        if(invalidModuleNotifier0 == null) {
            unit0 = null;
        }
        else {
            invalidModuleNotifier0.notifyModuleInvalidated(moduleDescriptor0);
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            throw new InvalidModuleException("Accessing invalid module descriptor " + moduleDescriptor0);
        }
    }
}

