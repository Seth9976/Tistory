package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaTypeQualifiers {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final JavaTypeQualifiers getNONE() {
            return JavaTypeQualifiers.e;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final NullabilityQualifier a;
    public final MutabilityQualifier b;
    public final boolean c;
    public final boolean d;
    public static final JavaTypeQualifiers e;

    static {
        JavaTypeQualifiers.Companion = new Companion(null);
        JavaTypeQualifiers.e = new JavaTypeQualifiers(null, null, false, false, 8, null);
    }

    public JavaTypeQualifiers(@Nullable NullabilityQualifier nullabilityQualifier0, @Nullable MutabilityQualifier mutabilityQualifier0, boolean z, boolean z1) {
        this.a = nullabilityQualifier0;
        this.b = mutabilityQualifier0;
        this.c = z;
        this.d = z1;
    }

    public JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier0, MutabilityQualifier mutabilityQualifier0, boolean z, boolean z1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 8) != 0) {
            z1 = false;
        }
        this(nullabilityQualifier0, mutabilityQualifier0, z, z1);
    }

    public final boolean getDefinitelyNotNull() {
        return this.c;
    }

    @Nullable
    public final MutabilityQualifier getMutability() {
        return this.b;
    }

    @Nullable
    public final NullabilityQualifier getNullability() {
        return this.a;
    }

    public final boolean isNullabilityQualifierForWarning() {
        return this.d;
    }
}

