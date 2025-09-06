package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import org.jetbrains.annotations.NotNull;

public final class DefaultBuiltIns extends KotlinBuiltIns {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final DefaultBuiltIns getInstance() {
            return DefaultBuiltIns.f;
        }
    }

    @NotNull
    public static final Companion Companion;
    public static final DefaultBuiltIns f;

    static {
        DefaultBuiltIns.Companion = new Companion(null);
        DefaultBuiltIns.f = new DefaultBuiltIns(false, 1, null);
    }

    public DefaultBuiltIns() {
        this(false, 1, null);
    }

    public DefaultBuiltIns(boolean z) {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        if(z) {
            this.createBuiltInsModule(false);
        }
    }

    public DefaultBuiltIns(boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = true;
        }
        this(z);
    }
}

