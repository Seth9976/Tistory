package androidx.collection.internal;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001B\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001F\b\u0016\u0012\u0014\u0010\n\u001A\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\b\b\u0010\u000BJ\u001A\u0010\r\u001A\u0004\u0018\u00018\u00012\u0006\u0010\f\u001A\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u001F\u0010\u0010\u001A\u0004\u0018\u00018\u00012\u0006\u0010\f\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00028\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001A\u0004\u0018\u00018\u00012\u0006\u0010\f\u001A\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u000ER\u0011\u0010\u0014\u001A\u00020\u00138F¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015R#\u0010\u001A\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00170\u00168F¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"Landroidx/collection/internal/LruHashMap;", "", "K", "V", "", "initialCapacity", "", "loadFactor", "<init>", "(IF)V", "original", "(Landroidx/collection/internal/LruHashMap;)V", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "", "isEmpty", "()Z", "", "", "getEntries", "()Ljava/util/Set;", "entries", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LruHashMap {
    public final LinkedHashMap a;

    public LruHashMap() {
        this(0, 0.0f, 3, null);
    }

    public LruHashMap(int v, float f) {
        this.a = new LinkedHashMap(v, f, true);
    }

    public LruHashMap(int v, float f, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 16;
        }
        if((v1 & 2) != 0) {
            f = 0.75f;
        }
        this(v, f);
    }

    public LruHashMap(@NotNull LruHashMap lruHashMap0) {
        Intrinsics.checkNotNullParameter(lruHashMap0, "original");
        this(0, 0.0f, 3, null);
        for(Object object0: lruHashMap0.getEntries()) {
            this.put(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
    }

    @Nullable
    public final Object get(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "key");
        return this.a.get(object0);
    }

    @NotNull
    public final Set getEntries() {
        Set set0 = this.a.entrySet();
        Intrinsics.checkNotNullExpressionValue(set0, "map.entries");
        return set0;
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Nullable
    public final Object put(@NotNull Object object0, @NotNull Object object1) {
        Intrinsics.checkNotNullParameter(object0, "key");
        Intrinsics.checkNotNullParameter(object1, "value");
        return this.a.put(object0, object1);
    }

    @Nullable
    public final Object remove(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "key");
        return this.a.remove(object0);
    }
}

