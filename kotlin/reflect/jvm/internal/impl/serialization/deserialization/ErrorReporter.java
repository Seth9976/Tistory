package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import j7.d;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import org.jetbrains.annotations.NotNull;

public interface ErrorReporter {
    public static final ErrorReporter DO_NOTHING;

    static {
        ErrorReporter.DO_NOTHING = new d(6);
    }

    void reportCannotInferVisibility(@NotNull CallableMemberDescriptor arg1);

    void reportIncompleteHierarchy(@NotNull ClassDescriptor arg1, @NotNull List arg2);
}

