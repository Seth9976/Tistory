package kotlinx.collections.immutable.internal;

import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001JC\u0010\u000B\u001A\u00020\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ?\u0010\u0010\u001A\u00020\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\f\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u000E\u0010\r\u001A\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ/\u0010\u0014\u001A\u00020\u0011\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkotlinx/collections/immutable/internal/MapImplementation;", "", "K", "V", "", "map", "", "element", "", "containsEntry$kotlinx_collections_immutable", "(Ljava/util/Map;Ljava/util/Map$Entry;)Z", "containsEntry", "thisMap", "otherMap", "equals$kotlinx_collections_immutable", "(Ljava/util/Map;Ljava/util/Map;)Z", "equals", "", "hashCode$kotlinx_collections_immutable", "(Ljava/util/Map;)I", "hashCode", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMapImplementation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapImplementation.kt\nkotlinx/collections/immutable/internal/MapImplementation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,27:1\n1#2:28\n167#3,3:29\n*S KotlinDebug\n*F\n+ 1 MapImplementation.kt\nkotlinx/collections/immutable/internal/MapImplementation\n*L\n22#1:29,3\n*E\n"})
public final class MapImplementation {
    @NotNull
    public static final MapImplementation INSTANCE;

    static {
        MapImplementation.INSTANCE = new MapImplementation();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final boolean containsEntry$kotlinx_collections_immutable(@NotNull Map map0, @NotNull Map.Entry map$Entry0) {
        Intrinsics.checkNotNullParameter(map0, "map");
        Intrinsics.checkNotNullParameter(map$Entry0, "element");
        Object object0 = map0.get(map$Entry0.getKey());
        return object0 == null ? map$Entry0.getValue() == null && map0.containsKey(map$Entry0.getKey()) : Intrinsics.areEqual(object0, map$Entry0.getValue());
    }

    public final boolean equals$kotlinx_collections_immutable(@NotNull Map map0, @NotNull Map map1) {
        Intrinsics.checkNotNullParameter(map0, "thisMap");
        Intrinsics.checkNotNullParameter(map1, "otherMap");
        if(map0.size() != map1.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(!map1.isEmpty()) {
            for(Object object0: map1.entrySet()) {
                if(!MapImplementation.INSTANCE.containsEntry$kotlinx_collections_immutable(map0, ((Map.Entry)object0))) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    public final int hashCode$kotlinx_collections_immutable(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "map");
        return map0.entrySet().hashCode();
    }
}

