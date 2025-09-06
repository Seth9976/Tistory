package kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.NotNull;

public abstract class TypeRefinementSupport {
    public static final class Enabled extends TypeRefinementSupport {
        @NotNull
        public final KotlinTypeRefiner getTypeRefiner() {
            return null;
        }
    }

    public final boolean isEnabled() [...] // Inlined contents
}

