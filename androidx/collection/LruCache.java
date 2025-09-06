package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001A\u00020\b2\b\b\u0001\u0010\u0005\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\t\u0010\u0007J\u001A\u0010\u000B\u001A\u0004\u0018\u00018\u00012\u0006\u0010\n\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0004\b\u000B\u0010\fJ\u001F\u0010\u000E\u001A\u0004\u0018\u00018\u00012\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\r\u001A\u00028\u0001\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0010\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0007J\u0017\u0010\u0011\u001A\u0004\u0018\u00018\u00012\u0006\u0010\n\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0011\u0010\fJ1\u0010\u0016\u001A\u00020\b2\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u0014\u001A\u00028\u00012\b\u0010\u0015\u001A\u0004\u0018\u00018\u0001H\u0014\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001A\u0004\u0018\u00018\u00012\u0006\u0010\n\u001A\u00028\u0000H\u0014\u00A2\u0006\u0004\b\u0018\u0010\fJ\u001F\u0010\u0019\u001A\u00020\u00042\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\r\u001A\u00028\u0001H\u0014\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\r\u0010\u001B\u001A\u00020\b\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\r\u0010\u001D\u001A\u00020\u0004\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\r\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0005\u0010\u001EJ\r\u0010\u001F\u001A\u00020\u0004\u00A2\u0006\u0004\b\u001F\u0010\u001EJ\r\u0010 \u001A\u00020\u0004\u00A2\u0006\u0004\b \u0010\u001EJ\r\u0010!\u001A\u00020\u0004\u00A2\u0006\u0004\b!\u0010\u001EJ\r\u0010\"\u001A\u00020\u0004\u00A2\u0006\u0004\b\"\u0010\u001EJ\r\u0010#\u001A\u00020\u0004\u00A2\u0006\u0004\b#\u0010\u001EJ\u0019\u0010%\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$\u00A2\u0006\u0004\b%\u0010&J\u000F\u0010(\u001A\u00020\'H\u0016\u00A2\u0006\u0004\b(\u0010)\u00A8\u0006*"}, d2 = {"Landroidx/collection/LruCache;", "", "K", "V", "", "maxSize", "<init>", "(I)V", "", "resize", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "trimToSize", "remove", "", "evicted", "oldValue", "newValue", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "create", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "evictAll", "()V", "size", "()I", "hitCount", "missCount", "createCount", "putCount", "evictionCount", "", "snapshot", "()Ljava/util/Map;", "", "toString", "()Ljava/lang/String;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 4 Lock.jvm.kt\nandroidx/collection/internal/Lock\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,355:1\n1#2:356\n23#3,3:357\n23#3,3:361\n23#3,3:365\n23#3,3:369\n23#3,3:373\n23#3,3:377\n23#3,3:381\n23#3,3:385\n23#3,3:389\n23#3,3:393\n23#3,3:397\n23#3,3:401\n23#3,3:405\n23#3,3:409\n23#3,3:415\n26#4:360\n26#4:364\n26#4:368\n26#4:372\n26#4:376\n26#4:380\n26#4:384\n26#4:388\n26#4:392\n26#4:396\n26#4:400\n26#4:404\n26#4:408\n26#4:412\n26#4:418\n1855#5,2:413\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n*L\n65#1:357,3\n78#1:361,3\n95#1:365,3\n122#1:369,3\n151#1:373,3\n180#1:377,3\n255#1:381,3\n262#1:385,3\n268#1:389,3\n274#1:393,3\n279#1:397,3\n284#1:401,3\n289#1:405,3\n299#1:409,3\n308#1:415,3\n65#1:360\n78#1:364\n95#1:368\n122#1:372\n151#1:376\n180#1:380\n255#1:384\n262#1:388\n268#1:392\n274#1:396\n279#1:400\n284#1:404\n289#1:408\n299#1:412\n308#1:418\n300#1:413,2\n*E\n"})
public class LruCache {
    public int a;
    public final LruHashMap b;
    public final Lock c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    public LruCache(@IntRange(from = 1L, to = 0x7FFFFFFFFFFFFFFFL) int v) {
        this.a = v;
        if(v <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.b = new LruHashMap(0, 0.75f);
        this.c = new Lock();
    }

    public final int a(Object object0, Object object1) {
        int v = this.sizeOf(object0, object1);
        if(v < 0) {
            throw new IllegalStateException(("Negative size: " + object0 + '=' + object1).toString());
        }
        return v;
    }

    @Nullable
    public Object create(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "key");
        return null;
    }

    public final int createCount() {
        synchronized(this.c) {
        }
        return this.f;
    }

    public void entryRemoved(boolean z, @NotNull Object object0, @NotNull Object object1, @Nullable Object object2) {
        Intrinsics.checkNotNullParameter(object0, "key");
        Intrinsics.checkNotNullParameter(object1, "oldValue");
    }

    public final void evictAll() {
        this.trimToSize(-1);
    }

    public final int evictionCount() {
        synchronized(this.c) {
        }
        return this.g;
    }

    @Nullable
    public final Object get(@NotNull Object object0) {
        Object object3;
        Intrinsics.checkNotNullParameter(object0, "key");
        synchronized(this.c) {
            Object object1 = this.b.get(object0);
            if(object1 != null) {
                ++this.h;
                return object1;
            }
            ++this.i;
        }
        Object object2 = this.create(object0);
        if(object2 == null) {
            return null;
        }
        synchronized(this.c) {
            ++this.f;
            object3 = this.b.put(object0, object2);
            if(object3 == null) {
                this.d += this.a(object0, object2);
            }
            else {
                this.b.put(object0, object3);
            }
        }
        if(object3 != null) {
            this.entryRemoved(false, object0, object2, object3);
            return object3;
        }
        this.trimToSize(this.a);
        return object2;
    }

    public final int hitCount() {
        synchronized(this.c) {
        }
        return this.h;
    }

    public final int maxSize() {
        synchronized(this.c) {
        }
        return this.a;
    }

    public final int missCount() {
        synchronized(this.c) {
        }
        return this.i;
    }

    @Nullable
    public final Object put(@NotNull Object object0, @NotNull Object object1) {
        Object object2;
        Intrinsics.checkNotNullParameter(object0, "key");
        Intrinsics.checkNotNullParameter(object1, "value");
        synchronized(this.c) {
            ++this.e;
            this.d += this.a(object0, object1);
            object2 = this.b.put(object0, object1);
            if(object2 != null) {
                this.d -= this.a(object0, object2);
            }
        }
        if(object2 != null) {
            this.entryRemoved(false, object0, object2, object1);
        }
        this.trimToSize(this.a);
        return object2;
    }

    public final int putCount() {
        synchronized(this.c) {
        }
        return this.e;
    }

    @Nullable
    public final Object remove(@NotNull Object object0) {
        Object object1;
        Intrinsics.checkNotNullParameter(object0, "key");
        synchronized(this.c) {
            object1 = this.b.remove(object0);
            if(object1 != null) {
                this.d -= this.a(object0, object1);
            }
        }
        if(object1 != null) {
            this.entryRemoved(false, object0, object1, null);
        }
        return object1;
    }

    public void resize(@IntRange(from = 1L, to = 0x7FFFFFFFFFFFFFFFL) int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized(this.c) {
            this.a = v;
        }
        this.trimToSize(v);
    }

    public final int size() {
        synchronized(this.c) {
        }
        return this.d;
    }

    public int sizeOf(@NotNull Object object0, @NotNull Object object1) {
        Intrinsics.checkNotNullParameter(object0, "key");
        Intrinsics.checkNotNullParameter(object1, "value");
        return 1;
    }

    @NotNull
    public final Map snapshot() {
        Map map0 = new LinkedHashMap();
        synchronized(this.c) {
            for(Object object0: this.b.getEntries()) {
                map0.put(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
            }
            return map0;
        }
    }

    @Override
    @NotNull
    public String toString() {
        synchronized(this.c) {
            int v1 = this.i + this.h;
            int v2 = v1 == 0 ? 0 : this.h * 100 / v1;
            return "LruCache[maxSize=" + this.a + ",hits=" + this.h + ",misses=" + this.i + ",hitRate=" + v2 + "%]";
        }
    }

    public void trimToSize(int v) {
        Object object1;
        Object object0;
        Lock lock0;
        while(true) {
            lock0 = this.c;
            synchronized(lock0) {
                if(this.d < 0 || this.b.isEmpty() && this.d != 0) {
                    throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
                }
                if(this.d <= v || this.b.isEmpty()) {
                    break;
                }
                Map.Entry map$Entry0 = (Map.Entry)CollectionsKt___CollectionsKt.firstOrNull(this.b.getEntries());
                if(map$Entry0 == null) {
                    return;
                }
                object0 = map$Entry0.getKey();
                object1 = map$Entry0.getValue();
                this.b.remove(object0);
                this.d -= this.a(object0, object1);
                ++this.g;
            }
            this.entryRemoved(true, object0, object1, null);
        }
    }
}

