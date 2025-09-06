package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

public final class MemberSignature {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromFieldNameAndDesc(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(s1, "desc");
            return new MemberSignature(s + '#' + s1, null);
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromJvmMemberSignature(@NotNull JvmMemberSignature jvmMemberSignature0) {
            Intrinsics.checkNotNullParameter(jvmMemberSignature0, "signature");
            if(jvmMemberSignature0 instanceof Method) {
                return this.fromMethodNameAndDesc(jvmMemberSignature0.getName(), jvmMemberSignature0.getDesc());
            }
            if(!(jvmMemberSignature0 instanceof Field)) {
                throw new NoWhenBranchMatchedException();
            }
            return this.fromFieldNameAndDesc(jvmMemberSignature0.getName(), jvmMemberSignature0.getDesc());
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromMethod(@NotNull NameResolver nameResolver0, @NotNull JvmMethodSignature jvmProtoBuf$JvmMethodSignature0) {
            Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
            Intrinsics.checkNotNullParameter(jvmProtoBuf$JvmMethodSignature0, "signature");
            return this.fromMethodNameAndDesc(nameResolver0.getString(jvmProtoBuf$JvmMethodSignature0.getName()), nameResolver0.getString(jvmProtoBuf$JvmMethodSignature0.getDesc()));
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromMethodNameAndDesc(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(s1, "desc");
            return new MemberSignature(s + s1, null);
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromMethodSignatureAndParameterIndex(@NotNull MemberSignature memberSignature0, int v) {
            Intrinsics.checkNotNullParameter(memberSignature0, "signature");
            return new MemberSignature(memberSignature0.getSignature() + '@' + v, null);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final String a;

    static {
        MemberSignature.Companion = new Companion(null);
    }

    public MemberSignature(String s, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = s;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof MemberSignature ? Intrinsics.areEqual(this.a, ((MemberSignature)object0).a) : false;
    }

    @NotNull
    public final String getSignature() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("MemberSignature(signature=");
        return a.b(')', this.a, stringBuilder0);
    }
}

