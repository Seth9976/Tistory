package kotlinx.serialization.internal;

import hg.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A;\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u001E\u0010\u0004\u001A\u001A\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001AI\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002,\u0010\u0004\u001A(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\bH\u0000¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"T", "Lkotlin/Function1;", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "factory", "Lkotlinx/serialization/internal/SerializerCache;", "createCache", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/internal/SerializerCache;", "Lkotlin/Function2;", "", "", "Lkotlin/reflect/KType;", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "createParametrizedCache", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class CachingKt {
    public static final boolean a;

    static {
        CachingKt.a = true;
    }

    @NotNull
    public static final SerializerCache createCache(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "factory");
        return CachingKt.a ? new b(function10) : new a7.b(function10);
    }

    @NotNull
    public static final ParametrizedSerializerCache createParametrizedCache(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "factory");
        return CachingKt.a ? new a7.b(function20, 20) : new a7.b(function20, 22);
    }
}

