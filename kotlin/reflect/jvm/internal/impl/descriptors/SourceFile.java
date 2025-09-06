package kotlin.reflect.jvm.internal.impl.descriptors;

import j7.d;
import org.jetbrains.annotations.Nullable;

public interface SourceFile {
    public static final SourceFile NO_SOURCE_FILE;

    static {
        SourceFile.NO_SOURCE_FILE = new d(5);
    }

    @Nullable
    String getName();
}

