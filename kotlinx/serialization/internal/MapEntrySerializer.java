package kotlinx.serialization.internal;

import hg.f;
import hg.g;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind.MAP;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003:\u0001\u0017B#\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00028\u0001H\u0014¢\u0006\u0004\b\f\u0010\rR\u001A\u0010\u0013\u001A\u00020\u000E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R$\u0010\n\u001A\u00028\u0000*\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015R$\u0010\u000B\u001A\u00028\u0001*\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, d2 = {"Lkotlinx/serialization/internal/MapEntrySerializer;", "K", "V", "Lkotlinx/serialization/internal/KeyValueSerializer;", "", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "key", "value", "toResult", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "getKey", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "getValue", "hg/f", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
public final class MapEntrySerializer extends KeyValueSerializer {
    public final SerialDescriptor c;

    public MapEntrySerializer(@NotNull KSerializer kSerializer0, @NotNull KSerializer kSerializer1) {
        Intrinsics.checkNotNullParameter(kSerializer0, "keySerializer");
        Intrinsics.checkNotNullParameter(kSerializer1, "valueSerializer");
        super(kSerializer0, kSerializer1, null);
        g g0 = new g(kSerializer0, kSerializer1, 0);
        this.c = SerialDescriptorsKt.buildSerialDescriptor("kotlin.collections.Map.Entry", MAP.INSTANCE, new SerialDescriptor[0], g0);
    }

    @Override  // kotlinx.serialization.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.c;
    }

    @Override  // kotlinx.serialization.internal.KeyValueSerializer
    public Object getKey(Object object0) {
        return this.getKey(((Map.Entry)object0));
    }

    public Object getKey(@NotNull Map.Entry map$Entry0) {
        Intrinsics.checkNotNullParameter(map$Entry0, "<this>");
        return map$Entry0.getKey();
    }

    @Override  // kotlinx.serialization.internal.KeyValueSerializer
    public Object getValue(Object object0) {
        return this.getValue(((Map.Entry)object0));
    }

    public Object getValue(@NotNull Map.Entry map$Entry0) {
        Intrinsics.checkNotNullParameter(map$Entry0, "<this>");
        return map$Entry0.getValue();
    }

    @Override  // kotlinx.serialization.internal.KeyValueSerializer
    public Object toResult(Object object0, Object object1) {
        return this.toResult(object0, object1);
    }

    @NotNull
    public Map.Entry toResult(Object object0, Object object1) {
        return new f(object0, object1);
    }
}

