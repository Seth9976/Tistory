package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\b\u001A\u0019\u0010\u0002\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u00A2\u0006\u0004\b\u0002\u0010\u0003\u001A\u0019\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0003\u001A)\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\t\u001A9\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\f\u001AI\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\u000F\u001AY\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\u0012\u001Ai\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00028\u00002\u0006\u0010\u0014\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\u0015\u001A\u0019\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018\u001A)\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0017\u0010\u0019\u001A9\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0017\u0010\u001A\u001AI\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0017\u0010\u001B\u001AY\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0017\u0010\u001C\u001Ai\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00028\u00002\u0006\u0010\u0014\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0017\u0010\u001D\u00A8\u0006\u001E"}, d2 = {"K", "Landroidx/collection/ObjectIntMap;", "emptyObjectIntMap", "()Landroidx/collection/ObjectIntMap;", "objectIntMap", "key1", "", "value1", "objectIntMapOf", "(Ljava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "key2", "value2", "(Ljava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "key3", "value3", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "key4", "value4", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "key5", "value5", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "Landroidx/collection/MutableObjectIntMap;", "mutableObjectIntMapOf", "()Landroidx/collection/MutableObjectIntMap;", "(Ljava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ObjectIntMapKt {
    public static final MutableObjectIntMap a;

    static {
        ObjectIntMapKt.a = new MutableObjectIntMap(0);
    }

    @NotNull
    public static final ObjectIntMap emptyObjectIntMap() {
        Intrinsics.checkNotNull(ObjectIntMapKt.a, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        return ObjectIntMapKt.a;
    }

    @NotNull
    public static final MutableObjectIntMap mutableObjectIntMapOf() {
        return new MutableObjectIntMap(0, 1, null);
    }

    @NotNull
    public static final MutableObjectIntMap mutableObjectIntMapOf(Object object0, int v) {
        MutableObjectIntMap mutableObjectIntMap0 = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap0.set(object0, v);
        return mutableObjectIntMap0;
    }

    @NotNull
    public static final MutableObjectIntMap mutableObjectIntMapOf(Object object0, int v, Object object1, int v1) {
        MutableObjectIntMap mutableObjectIntMap0 = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap0.set(object0, v);
        mutableObjectIntMap0.set(object1, v1);
        return mutableObjectIntMap0;
    }

    @NotNull
    public static final MutableObjectIntMap mutableObjectIntMapOf(Object object0, int v, Object object1, int v1, Object object2, int v2) {
        MutableObjectIntMap mutableObjectIntMap0 = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap0.set(object0, v);
        mutableObjectIntMap0.set(object1, v1);
        mutableObjectIntMap0.set(object2, v2);
        return mutableObjectIntMap0;
    }

    @NotNull
    public static final MutableObjectIntMap mutableObjectIntMapOf(Object object0, int v, Object object1, int v1, Object object2, int v2, Object object3, int v3) {
        MutableObjectIntMap mutableObjectIntMap0 = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap0.set(object0, v);
        mutableObjectIntMap0.set(object1, v1);
        mutableObjectIntMap0.set(object2, v2);
        mutableObjectIntMap0.set(object3, v3);
        return mutableObjectIntMap0;
    }

    @NotNull
    public static final MutableObjectIntMap mutableObjectIntMapOf(Object object0, int v, Object object1, int v1, Object object2, int v2, Object object3, int v3, Object object4, int v4) {
        MutableObjectIntMap mutableObjectIntMap0 = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap0.set(object0, v);
        mutableObjectIntMap0.set(object1, v1);
        mutableObjectIntMap0.set(object2, v2);
        mutableObjectIntMap0.set(object3, v3);
        mutableObjectIntMap0.set(object4, v4);
        return mutableObjectIntMap0;
    }

    @NotNull
    public static final ObjectIntMap objectIntMap() {
        Intrinsics.checkNotNull(ObjectIntMapKt.a, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.objectIntMap>");
        return ObjectIntMapKt.a;
    }

    @NotNull
    public static final ObjectIntMap objectIntMapOf(Object object0, int v) {
        ObjectIntMap objectIntMap0 = new MutableObjectIntMap(0, 1, null);
        ((MutableObjectIntMap)objectIntMap0).set(object0, v);
        return objectIntMap0;
    }

    @NotNull
    public static final ObjectIntMap objectIntMapOf(Object object0, int v, Object object1, int v1) {
        ObjectIntMap objectIntMap0 = new MutableObjectIntMap(0, 1, null);
        ((MutableObjectIntMap)objectIntMap0).set(object0, v);
        ((MutableObjectIntMap)objectIntMap0).set(object1, v1);
        return objectIntMap0;
    }

    @NotNull
    public static final ObjectIntMap objectIntMapOf(Object object0, int v, Object object1, int v1, Object object2, int v2) {
        ObjectIntMap objectIntMap0 = new MutableObjectIntMap(0, 1, null);
        ((MutableObjectIntMap)objectIntMap0).set(object0, v);
        ((MutableObjectIntMap)objectIntMap0).set(object1, v1);
        ((MutableObjectIntMap)objectIntMap0).set(object2, v2);
        return objectIntMap0;
    }

    @NotNull
    public static final ObjectIntMap objectIntMapOf(Object object0, int v, Object object1, int v1, Object object2, int v2, Object object3, int v3) {
        ObjectIntMap objectIntMap0 = new MutableObjectIntMap(0, 1, null);
        ((MutableObjectIntMap)objectIntMap0).set(object0, v);
        ((MutableObjectIntMap)objectIntMap0).set(object1, v1);
        ((MutableObjectIntMap)objectIntMap0).set(object2, v2);
        ((MutableObjectIntMap)objectIntMap0).set(object3, v3);
        return objectIntMap0;
    }

    @NotNull
    public static final ObjectIntMap objectIntMapOf(Object object0, int v, Object object1, int v1, Object object2, int v2, Object object3, int v3, Object object4, int v4) {
        ObjectIntMap objectIntMap0 = new MutableObjectIntMap(0, 1, null);
        ((MutableObjectIntMap)objectIntMap0).set(object0, v);
        ((MutableObjectIntMap)objectIntMap0).set(object1, v1);
        ((MutableObjectIntMap)objectIntMap0).set(object2, v2);
        ((MutableObjectIntMap)objectIntMap0).set(object3, v3);
        ((MutableObjectIntMap)objectIntMap0).set(object4, v4);
        return objectIntMap0;
    }
}

