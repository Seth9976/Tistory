package ke;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;

public final class h implements SourceElement {
    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public final SourceFile getContainingFile() {
        SourceFile sourceFile0 = SourceFile.NO_SOURCE_FILE;
        if(sourceFile0 == null) {
            throw new IllegalStateException("@NotNull method kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1.getContainingFile must not return null");
        }
        return sourceFile0;
    }

    @Override
    public final String toString() {
        return "NO_SOURCE";
    }
}

