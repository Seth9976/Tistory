package kotlinx.serialization.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u000B\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022B\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012 \u0012\u001E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00060\u0003B#\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00010\u0007\u00A2\u0006\u0004\b\n\u0010\u000BJ\u001F\u0010\r\u001A\u00020\f*\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014\u00A2\u0006\u0004\b\r\u0010\u000EJ1\u0010\u0011\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u000F*\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014\u00A2\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001A\u001E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014\u00A2\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001A\u00020\f*\u001E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014\u00A2\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004*\u001E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014\u00A2\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u0019\u001A\u001E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006*\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014\u00A2\u0006\u0004\b\u0019\u0010\u001AJ7\u0010\u001D\u001A\u00020\u001C*\u001E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00062\u0006\u0010\u001B\u001A\u00020\fH\u0014\u00A2\u0006\u0004\b\u001D\u0010\u001EJG\u0010\"\u001A\u00020\u001C*\u001E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00062\u0006\u0010\u001F\u001A\u00020\f2\u0006\u0010 \u001A\u00028\u00002\u0006\u0010!\u001A\u00028\u0001H\u0014\u00A2\u0006\u0004\b\"\u0010#R\u001A\u0010)\u001A\u00020$8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(\u00A8\u0006*"}, d2 = {"Lkotlinx/serialization/internal/HashMapSerializer;", "K", "V", "Lkotlinx/serialization/internal/MapLikeSerializer;", "", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Lkotlinx/serialization/KSerializer;", "kSerializer", "vSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "", "collectionSize", "(Ljava/util/Map;)I", "", "", "collectionIterator", "(Ljava/util/Map;)Ljava/util/Iterator;", "builder", "()Ljava/util/HashMap;", "builderSize", "(Ljava/util/HashMap;)I", "toResult", "(Ljava/util/HashMap;)Ljava/util/Map;", "toBuilder", "(Ljava/util/Map;)Ljava/util/HashMap;", "size", "", "checkCapacity", "(Ljava/util/HashMap;I)V", "index", "key", "value", "insertKeyValuePair", "(Ljava/util/HashMap;ILjava/lang/Object;Ljava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
public final class HashMapSerializer extends MapLikeSerializer {
    public final HashMapClassDesc c;

    public HashMapSerializer(@NotNull KSerializer kSerializer0, @NotNull KSerializer kSerializer1) {
        Intrinsics.checkNotNullParameter(kSerializer0, "kSerializer");
        Intrinsics.checkNotNullParameter(kSerializer1, "vSerializer");
        super(kSerializer0, kSerializer1, null);
        this.c = new HashMapClassDesc(kSerializer0.getDescriptor(), kSerializer1.getDescriptor());
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Object builder() {
        return this.builder();
    }

    @NotNull
    public HashMap builder() {
        return new HashMap();
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int builderSize(Object object0) {
        return this.builderSize(((HashMap)object0));
    }

    public int builderSize(@NotNull HashMap hashMap0) {
        Intrinsics.checkNotNullParameter(hashMap0, "<this>");
        return hashMap0.size() * 2;
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void checkCapacity(Object object0, int v) {
        this.checkCapacity(((HashMap)object0), v);
    }

    public void checkCapacity(@NotNull HashMap hashMap0, int v) {
        Intrinsics.checkNotNullParameter(hashMap0, "<this>");
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Iterator collectionIterator(Object object0) {
        return this.collectionIterator(((Map)object0));
    }

    @NotNull
    public Iterator collectionIterator(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        return map0.entrySet().iterator();
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(Object object0) {
        return this.collectionSize(((Map)object0));
    }

    public int collectionSize(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        return map0.size();
    }

    @Override  // kotlinx.serialization.internal.MapLikeSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.c;
    }

    public void insertKeyValuePair(@NotNull HashMap hashMap0, int v, Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(hashMap0, "<this>");
        hashMap0.put(object0, object1);
    }

    @Override  // kotlinx.serialization.internal.MapLikeSerializer
    public void insertKeyValuePair(Map map0, int v, Object object0, Object object1) {
        this.insertKeyValuePair(((HashMap)map0), v, object0, object1);
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Object toBuilder(Object object0) {
        return this.toBuilder(((Map)object0));
    }

    @NotNull
    public HashMap toBuilder(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        HashMap hashMap0 = map0 instanceof HashMap ? ((HashMap)map0) : null;
        return hashMap0 == null ? new HashMap(map0) : hashMap0;
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Object toResult(Object object0) {
        return this.toResult(((HashMap)object0));
    }

    @NotNull
    public Map toResult(@NotNull HashMap hashMap0) {
        Intrinsics.checkNotNullParameter(hashMap0, "<this>");
        return hashMap0;
    }
}

