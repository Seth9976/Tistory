package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002JA\u0010\u0003\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00042\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00020\u00072\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\n0\tH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\f\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\r"}, d2 = {"Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "T", "", "get", "Lkotlin/Result;", "Lkotlinx/serialization/KSerializer;", "key", "Lkotlin/reflect/KClass;", "types", "", "Lkotlin/reflect/KType;", "get-gIAlu-s", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ParametrizedSerializerCache {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object get-gIAlu-s$default(ParametrizedSerializerCache parametrizedSerializerCache0, KClass kClass0, List list0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get-gIAlu-s");
            }
            if((v & 2) != 0) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
            return parametrizedSerializerCache0.get-gIAlu-s(kClass0, list0);
        }
    }

    @NotNull
    Object get-gIAlu-s(@NotNull KClass arg1, @NotNull List arg2);
}

