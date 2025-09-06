package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\b\u001A\u0019\u0010\u0002\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u00A2\u0006\u0004\b\u0002\u0010\u0003\u001A\u0019\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0003\u001A)\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\t\u001A9\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\f\u001AI\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\u000F\u001AY\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\u0012\u001Ai\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00028\u00002\u0006\u0010\u0014\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\u0015\u001A\u0019\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018\u001A)\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0017\u0010\u0019\u001A9\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0017\u0010\u001A\u001AI\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0017\u0010\u001B\u001AY\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0017\u0010\u001C\u001Ai\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00028\u00002\u0006\u0010\u0014\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0017\u0010\u001D\u00A8\u0006\u001E"}, d2 = {"K", "Landroidx/collection/ObjectLongMap;", "emptyObjectLongMap", "()Landroidx/collection/ObjectLongMap;", "objectLongMap", "key1", "", "value1", "objectLongMapOf", "(Ljava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "key2", "value2", "(Ljava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "key3", "value3", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "key4", "value4", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "key5", "value5", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "Landroidx/collection/MutableObjectLongMap;", "mutableObjectLongMapOf", "()Landroidx/collection/MutableObjectLongMap;", "(Ljava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "(Ljava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ObjectLongMapKt {
    public static final MutableObjectLongMap a;

    static {
        ObjectLongMapKt.a = new MutableObjectLongMap(0);
    }

    @NotNull
    public static final ObjectLongMap emptyObjectLongMap() {
        Intrinsics.checkNotNull(ObjectLongMapKt.a, "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.emptyObjectLongMap>");
        return ObjectLongMapKt.a;
    }

    @NotNull
    public static final MutableObjectLongMap mutableObjectLongMapOf() {
        return new MutableObjectLongMap(0, 1, null);
    }

    @NotNull
    public static final MutableObjectLongMap mutableObjectLongMapOf(Object object0, long v) {
        MutableObjectLongMap mutableObjectLongMap0 = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap0.set(object0, v);
        return mutableObjectLongMap0;
    }

    @NotNull
    public static final MutableObjectLongMap mutableObjectLongMapOf(Object object0, long v, Object object1, long v1) {
        MutableObjectLongMap mutableObjectLongMap0 = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap0.set(object0, v);
        mutableObjectLongMap0.set(object1, v1);
        return mutableObjectLongMap0;
    }

    @NotNull
    public static final MutableObjectLongMap mutableObjectLongMapOf(Object object0, long v, Object object1, long v1, Object object2, long v2) {
        MutableObjectLongMap mutableObjectLongMap0 = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap0.set(object0, v);
        mutableObjectLongMap0.set(object1, v1);
        mutableObjectLongMap0.set(object2, v2);
        return mutableObjectLongMap0;
    }

    @NotNull
    public static final MutableObjectLongMap mutableObjectLongMapOf(Object object0, long v, Object object1, long v1, Object object2, long v2, Object object3, long v3) {
        MutableObjectLongMap mutableObjectLongMap0 = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap0.set(object0, v);
        mutableObjectLongMap0.set(object1, v1);
        mutableObjectLongMap0.set(object2, v2);
        mutableObjectLongMap0.set(object3, v3);
        return mutableObjectLongMap0;
    }

    @NotNull
    public static final MutableObjectLongMap mutableObjectLongMapOf(Object object0, long v, Object object1, long v1, Object object2, long v2, Object object3, long v3, Object object4, long v4) {
        MutableObjectLongMap mutableObjectLongMap0 = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap0.set(object0, v);
        mutableObjectLongMap0.set(object1, v1);
        mutableObjectLongMap0.set(object2, v2);
        mutableObjectLongMap0.set(object3, v3);
        mutableObjectLongMap0.set(object4, v4);
        return mutableObjectLongMap0;
    }

    @NotNull
    public static final ObjectLongMap objectLongMap() {
        Intrinsics.checkNotNull(ObjectLongMapKt.a, "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.objectLongMap>");
        return ObjectLongMapKt.a;
    }

    @NotNull
    public static final ObjectLongMap objectLongMapOf(Object object0, long v) {
        ObjectLongMap objectLongMap0 = new MutableObjectLongMap(0, 1, null);
        ((MutableObjectLongMap)objectLongMap0).set(object0, v);
        return objectLongMap0;
    }

    @NotNull
    public static final ObjectLongMap objectLongMapOf(Object object0, long v, Object object1, long v1) {
        ObjectLongMap objectLongMap0 = new MutableObjectLongMap(0, 1, null);
        ((MutableObjectLongMap)objectLongMap0).set(object0, v);
        ((MutableObjectLongMap)objectLongMap0).set(object1, v1);
        return objectLongMap0;
    }

    @NotNull
    public static final ObjectLongMap objectLongMapOf(Object object0, long v, Object object1, long v1, Object object2, long v2) {
        ObjectLongMap objectLongMap0 = new MutableObjectLongMap(0, 1, null);
        ((MutableObjectLongMap)objectLongMap0).set(object0, v);
        ((MutableObjectLongMap)objectLongMap0).set(object1, v1);
        ((MutableObjectLongMap)objectLongMap0).set(object2, v2);
        return objectLongMap0;
    }

    @NotNull
    public static final ObjectLongMap objectLongMapOf(Object object0, long v, Object object1, long v1, Object object2, long v2, Object object3, long v3) {
        ObjectLongMap objectLongMap0 = new MutableObjectLongMap(0, 1, null);
        ((MutableObjectLongMap)objectLongMap0).set(object0, v);
        ((MutableObjectLongMap)objectLongMap0).set(object1, v1);
        ((MutableObjectLongMap)objectLongMap0).set(object2, v2);
        ((MutableObjectLongMap)objectLongMap0).set(object3, v3);
        return objectLongMap0;
    }

    @NotNull
    public static final ObjectLongMap objectLongMapOf(Object object0, long v, Object object1, long v1, Object object2, long v2, Object object3, long v3, Object object4, long v4) {
        ObjectLongMap objectLongMap0 = new MutableObjectLongMap(0, 1, null);
        ((MutableObjectLongMap)objectLongMap0).set(object0, v);
        ((MutableObjectLongMap)objectLongMap0).set(object1, v1);
        ((MutableObjectLongMap)objectLongMap0).set(object2, v2);
        ((MutableObjectLongMap)objectLongMap0).set(object3, v3);
        ((MutableObjectLongMap)objectLongMap0).set(object4, v4);
        return objectLongMap0;
    }
}

