package kotlinx.serialization;

import fg.f;
import fg.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.internal.CachingKt;
import kotlinx.serialization.internal.ParametrizedSerializerCache;
import kotlinx.serialization.internal.SerializerCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A/\u0010\u0006\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001AC\u0010\f\u001A\u0012\u0012\u000E\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00050\u000B2\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Lkotlin/reflect/KClass;", "", "clazz", "", "isNullable", "Lkotlinx/serialization/KSerializer;", "findCachedSerializer", "(Lkotlin/reflect/KClass;Z)Lkotlinx/serialization/KSerializer;", "", "Lkotlin/reflect/KType;", "types", "Lkotlin/Result;", "findParametrizedCachedSerializer", "(Lkotlin/reflect/KClass;Ljava/util/List;Z)Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSerializersCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,75:1\n79#2:76\n*S KotlinDebug\n*F\n+ 1 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt\n*L\n53#1:76\n*E\n"})
public final class SerializersCacheKt {
    public static final SerializerCache a;
    public static final SerializerCache b;
    public static final ParametrizedSerializerCache c;
    public static final ParametrizedSerializerCache d;

    static {
        SerializersCacheKt.a = CachingKt.createCache(g.x);
        SerializersCacheKt.b = CachingKt.createCache(g.y);
        SerializersCacheKt.c = CachingKt.createParametrizedCache(f.x);
        SerializersCacheKt.d = CachingKt.createParametrizedCache(f.y);
    }

    @Nullable
    public static final KSerializer findCachedSerializer(@NotNull KClass kClass0, boolean z) {
        Intrinsics.checkNotNullParameter(kClass0, "clazz");
        if(!z) {
            KSerializer kSerializer0 = SerializersCacheKt.a.get(kClass0);
            return kSerializer0 == null ? null : kSerializer0;
        }
        return SerializersCacheKt.b.get(kClass0);
    }

    @NotNull
    public static final Object findParametrizedCachedSerializer(@NotNull KClass kClass0, @NotNull List list0, boolean z) {
        Intrinsics.checkNotNullParameter(kClass0, "clazz");
        Intrinsics.checkNotNullParameter(list0, "types");
        return z ? SerializersCacheKt.d.get-gIAlu-s(kClass0, list0) : SerializersCacheKt.c.get-gIAlu-s(kClass0, list0);
    }
}

