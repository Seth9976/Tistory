package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\b\u001A\u0019\u0010\u0002\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u00A2\u0006\u0004\b\u0002\u0010\u0003\u001A\u0019\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0003\u001A)\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\t\u001A9\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\f\u001AI\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\u000F\u001AY\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\u0012\u001Ai\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00028\u00002\u0006\u0010\u0014\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\u0015\u001A\u0019\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018\u001A)\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0017\u0010\u0019\u001A9\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0017\u0010\u001A\u001AI\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0017\u0010\u001B\u001AY\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0017\u0010\u001C\u001Ai\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\r\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00028\u00002\u0006\u0010\u0014\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0017\u0010\u001D\u00A8\u0006\u001E"}, d2 = {"K", "Landroidx/collection/ObjectFloatMap;", "emptyObjectFloatMap", "()Landroidx/collection/ObjectFloatMap;", "objectFloatMap", "key1", "", "value1", "objectFloatMapOf", "(Ljava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "key2", "value2", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "key3", "value3", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "key4", "value4", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "key5", "value5", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "Landroidx/collection/MutableObjectFloatMap;", "mutableObjectFloatMapOf", "()Landroidx/collection/MutableObjectFloatMap;", "(Ljava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ObjectFloatMapKt {
    public static final MutableObjectFloatMap a;

    static {
        ObjectFloatMapKt.a = new MutableObjectFloatMap(0);
    }

    @NotNull
    public static final ObjectFloatMap emptyObjectFloatMap() {
        Intrinsics.checkNotNull(ObjectFloatMapKt.a, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.emptyObjectFloatMap>");
        return ObjectFloatMapKt.a;
    }

    @NotNull
    public static final MutableObjectFloatMap mutableObjectFloatMapOf() {
        return new MutableObjectFloatMap(0, 1, null);
    }

    @NotNull
    public static final MutableObjectFloatMap mutableObjectFloatMapOf(Object object0, float f) {
        MutableObjectFloatMap mutableObjectFloatMap0 = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap0.set(object0, f);
        return mutableObjectFloatMap0;
    }

    @NotNull
    public static final MutableObjectFloatMap mutableObjectFloatMapOf(Object object0, float f, Object object1, float f1) {
        MutableObjectFloatMap mutableObjectFloatMap0 = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap0.set(object0, f);
        mutableObjectFloatMap0.set(object1, f1);
        return mutableObjectFloatMap0;
    }

    @NotNull
    public static final MutableObjectFloatMap mutableObjectFloatMapOf(Object object0, float f, Object object1, float f1, Object object2, float f2) {
        MutableObjectFloatMap mutableObjectFloatMap0 = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap0.set(object0, f);
        mutableObjectFloatMap0.set(object1, f1);
        mutableObjectFloatMap0.set(object2, f2);
        return mutableObjectFloatMap0;
    }

    @NotNull
    public static final MutableObjectFloatMap mutableObjectFloatMapOf(Object object0, float f, Object object1, float f1, Object object2, float f2, Object object3, float f3) {
        MutableObjectFloatMap mutableObjectFloatMap0 = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap0.set(object0, f);
        mutableObjectFloatMap0.set(object1, f1);
        mutableObjectFloatMap0.set(object2, f2);
        mutableObjectFloatMap0.set(object3, f3);
        return mutableObjectFloatMap0;
    }

    @NotNull
    public static final MutableObjectFloatMap mutableObjectFloatMapOf(Object object0, float f, Object object1, float f1, Object object2, float f2, Object object3, float f3, Object object4, float f4) {
        MutableObjectFloatMap mutableObjectFloatMap0 = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap0.set(object0, f);
        mutableObjectFloatMap0.set(object1, f1);
        mutableObjectFloatMap0.set(object2, f2);
        mutableObjectFloatMap0.set(object3, f3);
        mutableObjectFloatMap0.set(object4, f4);
        return mutableObjectFloatMap0;
    }

    @NotNull
    public static final ObjectFloatMap objectFloatMap() {
        Intrinsics.checkNotNull(ObjectFloatMapKt.a, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.objectFloatMap>");
        return ObjectFloatMapKt.a;
    }

    @NotNull
    public static final ObjectFloatMap objectFloatMapOf(Object object0, float f) {
        ObjectFloatMap objectFloatMap0 = new MutableObjectFloatMap(0, 1, null);
        ((MutableObjectFloatMap)objectFloatMap0).set(object0, f);
        return objectFloatMap0;
    }

    @NotNull
    public static final ObjectFloatMap objectFloatMapOf(Object object0, float f, Object object1, float f1) {
        ObjectFloatMap objectFloatMap0 = new MutableObjectFloatMap(0, 1, null);
        ((MutableObjectFloatMap)objectFloatMap0).set(object0, f);
        ((MutableObjectFloatMap)objectFloatMap0).set(object1, f1);
        return objectFloatMap0;
    }

    @NotNull
    public static final ObjectFloatMap objectFloatMapOf(Object object0, float f, Object object1, float f1, Object object2, float f2) {
        ObjectFloatMap objectFloatMap0 = new MutableObjectFloatMap(0, 1, null);
        ((MutableObjectFloatMap)objectFloatMap0).set(object0, f);
        ((MutableObjectFloatMap)objectFloatMap0).set(object1, f1);
        ((MutableObjectFloatMap)objectFloatMap0).set(object2, f2);
        return objectFloatMap0;
    }

    @NotNull
    public static final ObjectFloatMap objectFloatMapOf(Object object0, float f, Object object1, float f1, Object object2, float f2, Object object3, float f3) {
        ObjectFloatMap objectFloatMap0 = new MutableObjectFloatMap(0, 1, null);
        ((MutableObjectFloatMap)objectFloatMap0).set(object0, f);
        ((MutableObjectFloatMap)objectFloatMap0).set(object1, f1);
        ((MutableObjectFloatMap)objectFloatMap0).set(object2, f2);
        ((MutableObjectFloatMap)objectFloatMap0).set(object3, f3);
        return objectFloatMap0;
    }

    @NotNull
    public static final ObjectFloatMap objectFloatMapOf(Object object0, float f, Object object1, float f1, Object object2, float f2, Object object3, float f3, Object object4, float f4) {
        ObjectFloatMap objectFloatMap0 = new MutableObjectFloatMap(0, 1, null);
        ((MutableObjectFloatMap)objectFloatMap0).set(object0, f);
        ((MutableObjectFloatMap)objectFloatMap0).set(object1, f1);
        ((MutableObjectFloatMap)objectFloatMap0).set(object2, f2);
        ((MutableObjectFloatMap)objectFloatMap0).set(object3, f3);
        ((MutableObjectFloatMap)objectFloatMap0).set(object4, f4);
        return objectFloatMap0;
    }
}

