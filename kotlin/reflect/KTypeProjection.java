package kotlin.reflect;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\n\b\u0087\b\u0018\u0000 \u001E2\u00020\u0001:\u0001\u001EB\u001B\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000B\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0012\u0010\r\u001A\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ(\u0010\u000F\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\fR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u000E¨\u0006\u001F"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "Lkotlin/reflect/KVariance;", "variance", "Lkotlin/reflect/KType;", "type", "<init>", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Lkotlin/reflect/KVariance;", "component2", "()Lkotlin/reflect/KType;", "copy", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlin/reflect/KVariance;", "getVariance", "b", "Lkotlin/reflect/KType;", "getType", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.1")
public final class KTypeProjection {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006R\u001A\u0010\t\u001A\u00020\u00048\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000B\u0010\fR\u0011\u0010\u000F\u001A\u00020\u00048F¢\u0006\u0006\u001A\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/KTypeProjection$Companion;", "", "Lkotlin/reflect/KType;", "type", "Lkotlin/reflect/KTypeProjection;", "invariant", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;", "contravariant", "covariant", "star", "Lkotlin/reflect/KTypeProjection;", "getStar$annotations", "()V", "getSTAR", "()Lkotlin/reflect/KTypeProjection;", "STAR", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final KTypeProjection contravariant(@NotNull KType kType0) {
            Intrinsics.checkNotNullParameter(kType0, "type");
            return new KTypeProjection(KVariance.IN, kType0);
        }

        @JvmStatic
        @NotNull
        public final KTypeProjection covariant(@NotNull KType kType0) {
            Intrinsics.checkNotNullParameter(kType0, "type");
            return new KTypeProjection(KVariance.OUT, kType0);
        }

        @NotNull
        public final KTypeProjection getSTAR() {
            return KTypeProjection.star;
        }

        @PublishedApi
        public static void getStar$annotations() {
        }

        @JvmStatic
        @NotNull
        public final KTypeProjection invariant(@NotNull KType kType0) {
            Intrinsics.checkNotNullParameter(kType0, "type");
            return new KTypeProjection(KVariance.INVARIANT, kType0);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[KVariance.values().length];
            try {
                arr_v[KVariance.INVARIANT.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KVariance.IN.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KVariance.OUT.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final KVariance a;
    public final KType b;
    @JvmField
    @NotNull
    public static final KTypeProjection star;

    static {
        KTypeProjection.Companion = new Companion(null);
        KTypeProjection.star = new KTypeProjection(null, null);
    }

    public KTypeProjection(@Nullable KVariance kVariance0, @Nullable KType kType0) {
        this.a = kVariance0;
        this.b = kType0;
        if((kVariance0 == null ? 1 : 0) != (kType0 == null ? 1 : 0)) {
            throw new IllegalArgumentException((kVariance0 == null ? "Star projection must have no type specified." : "The projection variance " + kVariance0 + " requires type to be specified.").toString());
        }
    }

    @Nullable
    public final KVariance component1() {
        return this.a;
    }

    @Nullable
    public final KType component2() {
        return this.b;
    }

    @JvmStatic
    @NotNull
    public static final KTypeProjection contravariant(@NotNull KType kType0) {
        return KTypeProjection.Companion.contravariant(kType0);
    }

    @NotNull
    public final KTypeProjection copy(@Nullable KVariance kVariance0, @Nullable KType kType0) {
        return new KTypeProjection(kVariance0, kType0);
    }

    public static KTypeProjection copy$default(KTypeProjection kTypeProjection0, KVariance kVariance0, KType kType0, int v, Object object0) {
        if((v & 1) != 0) {
            kVariance0 = kTypeProjection0.a;
        }
        if((v & 2) != 0) {
            kType0 = kTypeProjection0.b;
        }
        return kTypeProjection0.copy(kVariance0, kType0);
    }

    @JvmStatic
    @NotNull
    public static final KTypeProjection covariant(@NotNull KType kType0) {
        return KTypeProjection.Companion.covariant(kType0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof KTypeProjection)) {
            return false;
        }
        return this.a == ((KTypeProjection)object0).a ? Intrinsics.areEqual(this.b, ((KTypeProjection)object0).b) : false;
    }

    @Nullable
    public final KType getType() {
        return this.b;
    }

    @Nullable
    public final KVariance getVariance() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        KType kType0 = this.b;
        if(kType0 != null) {
            v = kType0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @JvmStatic
    @NotNull
    public static final KTypeProjection invariant(@NotNull KType kType0) {
        return KTypeProjection.Companion.invariant(kType0);
    }

    @Override
    @NotNull
    public String toString() {
        int v = this.a == null ? -1 : WhenMappings.$EnumSwitchMapping$0[this.a.ordinal()];
        if(v != -1) {
            KType kType0 = this.b;
            switch(v) {
                case 1: {
                    return String.valueOf(kType0);
                }
                case 2: {
                    return "in " + kType0;
                }
                case 3: {
                    return "out " + kType0;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return "*";
    }
}

