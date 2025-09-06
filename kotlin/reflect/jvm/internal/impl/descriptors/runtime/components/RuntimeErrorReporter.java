package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import org.jetbrains.annotations.NotNull;

public final class RuntimeErrorReporter implements ErrorReporter {
    @NotNull
    public static final RuntimeErrorReporter INSTANCE;

    static {
        RuntimeErrorReporter.INSTANCE = new RuntimeErrorReporter();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public void reportCannotInferVisibility(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + callableMemberDescriptor0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public void reportIncompleteHierarchy(@NotNull ClassDescriptor classDescriptor0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(list0, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + classDescriptor0.getName() + ", unresolved classes " + list0);
    }
}

