package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class JvmMemberSignature {
    public static final class Field extends JvmMemberSignature {
        public final String a;
        public final String b;

        public Field(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(s1, "desc");
            super(null);
            this.a = s;
            this.b = s1;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String asString() {
            return this.getName() + ':' + this.getDesc();
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final String component2() {
            return this.b;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Field)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((Field)object0).a) ? Intrinsics.areEqual(this.b, ((Field)object0).b) : false;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String getDesc() {
            return this.b;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String getName() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 0x1F;
        }
    }

    public static final class Method extends JvmMemberSignature {
        public final String a;
        public final String b;

        public Method(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(s1, "desc");
            super(null);
            this.a = s;
            this.b = s1;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String asString() {
            return this.getName() + this.getDesc();
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Method)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((Method)object0).a) ? Intrinsics.areEqual(this.b, ((Method)object0).b) : false;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String getDesc() {
            return this.b;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String getName() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 0x1F;
        }
    }

    public JvmMemberSignature(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @NotNull
    public abstract String asString();

    @NotNull
    public abstract String getDesc();

    @NotNull
    public abstract String getName();

    @Override
    @NotNull
    public final String toString() {
        return this.asString();
    }
}

