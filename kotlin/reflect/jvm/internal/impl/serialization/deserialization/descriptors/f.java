package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import j2.j;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;

public final class f {
    public final LinkedHashMap a;
    public final MemoizedFunctionToNullable b;
    public final NotNullLazyValue c;
    public final DeserializedClassDescriptor d;

    public f(DeserializedClassDescriptor deserializedClassDescriptor0) {
        this.d = deserializedClassDescriptor0;
        List list0 = deserializedClassDescriptor0.getClassProto().getEnumEntryList();
        Intrinsics.checkNotNullExpressionValue(list0, "classProto.enumEntryList");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(list0, 10)), 16));
        for(Object object0: list0) {
            linkedHashMap0.put(NameResolverUtilKt.getName(deserializedClassDescriptor0.getC().getNameResolver(), ((EnumEntry)object0).getName()), object0);
        }
        this.a = linkedHashMap0;
        this.b = this.d.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new e(this, this.d));
        this.c = this.d.getC().getStorageManager().createLazyValue(new j(this, 16));
    }
}

