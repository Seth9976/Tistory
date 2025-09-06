package kotlinx.serialization.internal;

import hg.g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B#\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00028\u0001H\u0014¢\u0006\u0004\b\f\u0010\rR\u001A\u0010\u0013\u001A\u00020\u000E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R$\u0010\n\u001A\u00028\u0000*\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015R$\u0010\u000B\u001A\u00028\u0001*\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lkotlinx/serialization/internal/PairSerializer;", "K", "V", "Lkotlinx/serialization/internal/KeyValueSerializer;", "Lkotlin/Pair;", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "key", "value", "toResult", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "getKey", "(Lkotlin/Pair;)Ljava/lang/Object;", "getValue", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
public final class PairSerializer extends KeyValueSerializer {
    public final SerialDescriptor c;

    public PairSerializer(@NotNull KSerializer kSerializer0, @NotNull KSerializer kSerializer1) {
        Intrinsics.checkNotNullParameter(kSerializer0, "keySerializer");
        Intrinsics.checkNotNullParameter(kSerializer1, "valueSerializer");
        super(kSerializer0, kSerializer1, null);
        g g0 = new g(kSerializer0, kSerializer1, 1);
        this.c = SerialDescriptorsKt.buildClassSerialDescriptor("kotlin.Pair", new SerialDescriptor[0], g0);
    }

    @Override  // kotlinx.serialization.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.c;
    }

    @Override  // kotlinx.serialization.internal.KeyValueSerializer
    public Object getKey(Object object0) {
        return this.getKey(((Pair)object0));
    }

    public Object getKey(@NotNull Pair pair0) {
        Intrinsics.checkNotNullParameter(pair0, "<this>");
        return pair0.getFirst();
    }

    @Override  // kotlinx.serialization.internal.KeyValueSerializer
    public Object getValue(Object object0) {
        return this.getValue(((Pair)object0));
    }

    public Object getValue(@NotNull Pair pair0) {
        Intrinsics.checkNotNullParameter(pair0, "<this>");
        return pair0.getSecond();
    }

    @Override  // kotlinx.serialization.internal.KeyValueSerializer
    public Object toResult(Object object0, Object object1) {
        return this.toResult(object0, object1);
    }

    @NotNull
    public Pair toResult(Object object0, Object object1) {
        return TuplesKt.to(object0, object1);
    }
}

