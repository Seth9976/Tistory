package kotlin.reflect.jvm.internal.impl.descriptors;

public enum ClassKind {
    CLASS,
    INTERFACE,
    ENUM_CLASS,
    ENUM_ENTRY,
    ANNOTATION_CLASS,
    OBJECT;

    public final boolean isSingleton() {
        return this == ClassKind.OBJECT || this == ClassKind.ENUM_ENTRY;
    }
}

