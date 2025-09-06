package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class TypeEnhancementInfo {
    public final Map a;

    public TypeEnhancementInfo(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "map");
        super();
        this.a = map0;
    }

    @NotNull
    public final Map getMap() {
        return this.a;
    }
}

