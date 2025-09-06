package kotlin.reflect.full;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0007\u001A\u0014\u0010\u0004\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0007\u001A\u0014\u0010\u0005\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0001H\u0007¨\u0006\u0007"}, d2 = {"isSubtypeOf", "", "Lkotlin/reflect/KType;", "other", "isSupertypeOf", "withNullability", "nullable", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "KTypes")
public final class KTypes {
    @SinceKotlin(version = "1.1")
    public static final boolean isSubtypeOf(@NotNull KType kType0, @NotNull KType kType1) {
        Intrinsics.checkNotNullParameter(kType0, "<this>");
        Intrinsics.checkNotNullParameter(kType1, "other");
        return TypeUtilsKt.isSubtypeOf(((KTypeImpl)kType0).getType(), ((KTypeImpl)kType1).getType());
    }

    @SinceKotlin(version = "1.1")
    public static final boolean isSupertypeOf(@NotNull KType kType0, @NotNull KType kType1) {
        Intrinsics.checkNotNullParameter(kType0, "<this>");
        Intrinsics.checkNotNullParameter(kType1, "other");
        return KTypes.isSubtypeOf(kType1, kType0);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final KType withNullability(@NotNull KType kType0, boolean z) {
        Intrinsics.checkNotNullParameter(kType0, "<this>");
        return ((KTypeImpl)kType0).makeNullableAsSpecified$kotlin_reflection(z);
    }
}

