package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001F\u0010\n\u001A\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\n\u0010\u000BJ#\u0010\r\u001A\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\r\u0010\u000EJ)\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\u000F\u0010\u0010J)\u0010\u0011\u001A\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001A\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0013\u001A\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0019\u001A\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0017\u001A\u00020\f2\u0006\u0010\u0018\u001A\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\u001AR\u001A\u0010 \u001A\u00020\u001B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001F¨\u0006!"}, d2 = {"Lkotlinx/serialization/internal/HashSetSerializer;", "E", "Lkotlinx/serialization/internal/CollectionSerializer;", "", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Lkotlinx/serialization/KSerializer;", "eSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "builder", "()Ljava/util/HashSet;", "", "builderSize", "(Ljava/util/HashSet;)I", "toResult", "(Ljava/util/HashSet;)Ljava/util/Set;", "toBuilder", "(Ljava/util/Set;)Ljava/util/HashSet;", "size", "", "checkCapacity", "(Ljava/util/HashSet;I)V", "index", "element", "insert", "(Ljava/util/HashSet;ILjava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
public final class HashSetSerializer extends CollectionSerializer {
    public final HashSetClassDesc b;

    public HashSetSerializer(@NotNull KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(kSerializer0, "eSerializer");
        super(kSerializer0);
        this.b = new HashSetClassDesc(kSerializer0.getDescriptor());
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Object builder() {
        return this.builder();
    }

    @NotNull
    public HashSet builder() {
        return new HashSet();
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int builderSize(Object object0) {
        return this.builderSize(((HashSet)object0));
    }

    public int builderSize(@NotNull HashSet hashSet0) {
        Intrinsics.checkNotNullParameter(hashSet0, "<this>");
        return hashSet0.size();
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void checkCapacity(Object object0, int v) {
        this.checkCapacity(((HashSet)object0), v);
    }

    public void checkCapacity(@NotNull HashSet hashSet0, int v) {
        Intrinsics.checkNotNullParameter(hashSet0, "<this>");
    }

    @Override  // kotlinx.serialization.internal.CollectionLikeSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override  // kotlinx.serialization.internal.CollectionLikeSerializer
    public void insert(Object object0, int v, Object object1) {
        this.insert(((HashSet)object0), v, object1);
    }

    public void insert(@NotNull HashSet hashSet0, int v, Object object0) {
        Intrinsics.checkNotNullParameter(hashSet0, "<this>");
        hashSet0.add(object0);
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Object toBuilder(Object object0) {
        return this.toBuilder(((Set)object0));
    }

    @NotNull
    public HashSet toBuilder(@NotNull Set set0) {
        Intrinsics.checkNotNullParameter(set0, "<this>");
        HashSet hashSet0 = set0 instanceof HashSet ? ((HashSet)set0) : null;
        return hashSet0 == null ? new HashSet(set0) : hashSet0;
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Object toResult(Object object0) {
        return this.toResult(((HashSet)object0));
    }

    @NotNull
    public Set toResult(@NotNull HashSet hashSet0) {
        Intrinsics.checkNotNullParameter(hashSet0, "<this>");
        return hashSet0;
    }
}

