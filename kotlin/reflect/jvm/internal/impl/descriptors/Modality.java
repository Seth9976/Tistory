package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

public enum Modality {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Modality convertFromFlags(boolean z, boolean z1, boolean z2) {
            if(z) {
                return Modality.SEALED;
            }
            if(z1) {
                return Modality.ABSTRACT;
            }
            return z2 ? Modality.OPEN : Modality.FINAL;
        }
    }

    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;

    @NotNull
    public static final Companion Companion;

    static {
        Modality.Companion = new Companion(null);
    }
}

