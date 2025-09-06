package kotlin.reflect.jvm.internal.impl.platform;

import org.jetbrains.annotations.NotNull;

public abstract class SimplePlatform {
    @NotNull
    public String getTargetName() {
        throw new NullPointerException();
    }

    @NotNull
    public TargetPlatformVersion getTargetPlatformVersion() [...] // Inlined contents

    @Override
    @NotNull
    public String toString() {
        String s = this.getTargetName();
        return s.length() <= 0 ? null : "null (" + s + ')';
    }
}

