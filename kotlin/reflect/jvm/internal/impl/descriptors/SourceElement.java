package kotlin.reflect.jvm.internal.impl.descriptors;

import ke.h;
import org.jetbrains.annotations.NotNull;

public interface SourceElement {
    public static final SourceElement NO_SOURCE;

    static {
        SourceElement.NO_SOURCE = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    SourceFile getContainingFile();
}

