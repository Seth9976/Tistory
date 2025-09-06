package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractModifierChecks {
    @NotNull
    public final CheckResult check(@NotNull FunctionDescriptor functionDescriptor0) {
        Intrinsics.checkNotNullParameter(functionDescriptor0, "functionDescriptor");
        for(Object object0: this.getChecks$descriptors()) {
            Checks checks0 = (Checks)object0;
            if(checks0.isApplicable(functionDescriptor0)) {
                return checks0.checkAll(functionDescriptor0);
            }
            if(false) {
                break;
            }
        }
        return IllegalFunctionName.INSTANCE;
    }

    @NotNull
    public abstract List getChecks$descriptors();
}

