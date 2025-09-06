package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

public abstract enum RenderingFormat {
    PLAIN(null) /* 警告！未生成枚举子类：ye.n */,
    HTML(null) /* 警告！未生成枚举子类：ye.m */;

    public RenderingFormat(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @NotNull
    public abstract String escape(@NotNull String arg1);
}

