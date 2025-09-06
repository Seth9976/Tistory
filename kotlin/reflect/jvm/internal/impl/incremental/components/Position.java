package kotlin.reflect.jvm.internal.impl.incremental.components;

import a5.b;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Position implements Serializable {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Position getNO_POSITION() {
            return Position.c;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int a;
    public final int b;
    public static final Position c;

    static {
        Position.Companion = new Companion(null);
        Position.c = new Position(-1, -1);
    }

    public Position(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Position)) {
            return false;
        }
        return this.a == ((Position)object0).a ? this.b == ((Position)object0).b : false;
    }

    @Override
    public int hashCode() {
        return this.b + this.a * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Position(line=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", column=");
        return b.p(stringBuilder0, this.b, ')');
    }
}

