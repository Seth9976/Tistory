package androidx.compose.ui.text.caches;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import jeb.synthetic.FIN;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000B\u001A\u0004\u0018\u00018\u00012\u0006\u0010\n\u001A\u00028\u0000\u00A2\u0006\u0004\b\u000B\u0010\fJ\u001F\u0010\u000E\u001A\u0004\u0018\u00018\u00012\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\r\u001A\u00028\u0001\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0010\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0007J\u0017\u0010\u0011\u001A\u0004\u0018\u00018\u00012\u0006\u0010\n\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0011\u0010\fJ1\u0010\u0016\u001A\u00020\b2\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u0014\u001A\u00028\u00012\b\u0010\u0015\u001A\u0004\u0018\u00018\u0001H\u0014\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001A\u0004\u0018\u00018\u00012\u0006\u0010\n\u001A\u00028\u0000H\u0014\u00A2\u0006\u0004\b\u0018\u0010\fJ\u001F\u0010\u0019\u001A\u00020\u00042\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\r\u001A\u00028\u0001H\u0014\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\r\u0010\u001B\u001A\u00020\b\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\r\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0005\u0010\u001DJ\r\u0010\u001E\u001A\u00020\u0004\u00A2\u0006\u0004\b\u001E\u0010\u001DJ\r\u0010\u001F\u001A\u00020\u0004\u00A2\u0006\u0004\b\u001F\u0010\u001DJ\r\u0010 \u001A\u00020\u0004\u00A2\u0006\u0004\b \u0010\u001DJ\r\u0010!\u001A\u00020\u0004\u00A2\u0006\u0004\b!\u0010\u001DJ\r\u0010\"\u001A\u00020\u0004\u00A2\u0006\u0004\b\"\u0010\u001DJ\u0019\u0010$\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#\u00A2\u0006\u0004\b$\u0010%J\u000F\u0010\'\u001A\u00020&H\u0016\u00A2\u0006\u0004\b\'\u0010(J$\u0010.\u001A\u00028\u0002\"\u0004\b\u0002\u0010)2\f\u0010+\u001A\b\u0012\u0004\u0012\u00028\u00020*H\u0080\b\u00A2\u0006\u0004\b,\u0010-R$\u00102\u001A\u00020\u00042\u0006\u0010/\u001A\u00020\u00048G@BX\u0086\u000E\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u001D\u00A8\u00063"}, d2 = {"Landroidx/compose/ui/text/caches/LruCache;", "K", "V", "", "", "maxSize", "<init>", "(I)V", "", "resize", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "trimToSize", "remove", "", "evicted", "oldValue", "newValue", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "create", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "evictAll", "()V", "()I", "hitCount", "missCount", "createCount", "putCount", "evictionCount", "", "snapshot", "()Ljava/util/Map;", "", "toString", "()Ljava/lang/String;", "R", "Lkotlin/Function0;", "block", "synchronizedValue$ui_text_release", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "synchronizedValue", "<set-?>", "d", "I", "size", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n350#1:354\n350#1:363\n350#1:365\n350#1:367\n350#1:369\n350#1:371\n350#1:373\n26#2:355\n26#2:357\n26#2:358\n26#2:359\n26#2:360\n26#2:361\n26#2:362\n26#2:364\n26#2:366\n26#2:368\n26#2:370\n26#2:372\n26#2:374\n26#2:375\n26#2:376\n26#2:377\n1#3:356\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n*L\n40#1:354\n297#1:363\n303#1:365\n309#1:367\n314#1:369\n319#1:371\n324#1:373\n40#1:355\n71#1:357\n86#1:358\n104#1:359\n142#1:360\n176#1:361\n218#1:362\n297#1:364\n303#1:366\n309#1:368\n314#1:370\n319#1:372\n324#1:374\n331#1:375\n341#1:376\n350#1:377\n*E\n"})
public class LruCache {
    public static final int $stable = 8;
    public final SynchronizedObject a;
    public final HashMap b;
    public final LinkedHashSet c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    public LruCache(int v) {
        this.a = Synchronization_jvmKt.createSynchronizedObject();
        if(v <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.e = v;
        this.b = new HashMap(0, 0.75f);
        this.c = new LinkedHashSet();
    }

    public final int a(Object object0, Object object1) {
        return 1;
    }

    @Nullable
    public Object create(Object object0) [...] // Inlined contents

    public final int createCount() {
        synchronized(this.a) {
        }
        return this.g;
    }

    public void entryRemoved(boolean z, Object object0, Object object1, @Nullable Object object2) {
    }

    public final void evictAll() {
        this.trimToSize(-1);
    }

    public final int evictionCount() {
        synchronized(this.a) {
        }
        return this.h;
    }

    @Nullable
    public final Object get(Object object0) {
        synchronized(this.a) {
            Object object1 = this.b.get(object0);
            if(object1 != null) {
                this.c.remove(object0);
                this.c.add(object0);
                ++this.i;
                return object1;
            }
            ++this.j;
            return null;
        }
    }

    public final int hitCount() {
        synchronized(this.a) {
        }
        return this.i;
    }

    public final int maxSize() {
        synchronized(this.a) {
        }
        return this.e;
    }

    public final int missCount() {
        synchronized(this.a) {
        }
        return this.j;
    }

    @Nullable
    public final Object put(Object object0, Object object1) {
        Object object2;
        if(object0 == null || object1 == null) {
            throw null;
        }
        synchronized(this.a) {
            ++this.f;
            this.d = this.size() + this.a(object0, object1);
            object2 = this.b.put(object0, object1);
            if(object2 != null) {
                this.d = this.size() - this.a(object0, object2);
            }
            if(this.c.contains(object0)) {
                this.c.remove(object0);
            }
            this.c.add(object0);
        }
        this.trimToSize(this.e);
        return object2;
    }

    public final int putCount() {
        synchronized(this.a) {
        }
        return this.f;
    }

    @Nullable
    public final Object remove(Object object0) {
        object0.getClass();
        synchronized(this.a) {
            Object object1 = this.b.remove(object0);
            this.c.remove(object0);
            if(object1 != null) {
                this.d = this.size() - this.a(object0, object1);
            }
            return object1;
        }
    }

    public void resize(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized(this.a) {
            this.e = v;
        }
        this.trimToSize(v);
    }

    @JvmName(name = "size")
    public final int size() {
        synchronized(this.a) {
        }
        return this.d;
    }

    public int sizeOf(Object object0, Object object1) [...] // Inlined contents

    @NotNull
    public final Map snapshot() {
        synchronized(this.a) {
            Map map0 = new LinkedHashMap();
            for(Object object0: this.c) {
                Object object1 = this.b.get(object0);
                Intrinsics.checkNotNull(object1);
                ((AbstractMap)map0).put(object0, object1);
            }
            return map0;
        }
    }

    public final Object synchronizedValue$ui_text_release(@NotNull Function0 function00) {
        synchronized(this.a) {
            return function00.invoke();
        }
    }

    @Override
    @NotNull
    public String toString() {
        synchronized(this.a) {
            int v1 = this.j + this.i;
            int v2 = v1 == 0 ? 0 : this.i * 100 / v1;
            return "LruCache[maxSize=" + this.e + ",hits=" + this.i + ",misses=" + this.j + ",hitRate=" + v2 + "%]";
        }
    }

    public void trimToSize(int v) {
        Object object1;
        Object object0;
        int v1;
        while(true) {
            synchronized(this.a) {
                v1 = FIN.finallyOpen$NT();
                if(this.size() < 0 || this.b.isEmpty() && this.size() != 0 || this.b.isEmpty() != this.c.isEmpty()) {
                    break;
                }
                if(this.size() <= v || this.b.isEmpty()) {
                    object0 = null;
                    object1 = null;
                }
                else {
                    object0 = CollectionsKt___CollectionsKt.first(this.c);
                    object1 = this.b.get(object0);
                    if(object1 != null) {
                        TypeIntrinsics.asMutableMap(this.b).remove(object0);
                        TypeIntrinsics.asMutableCollection(this.c).remove(object0);
                        Intrinsics.checkNotNull(object0);
                        Intrinsics.checkNotNull(object1);
                        this.d = this.size() - this.a(object0, object1);
                        ++this.h;
                        goto label_19;
                    }
                    FIN.finallyExec$NT(v1);
                    throw new IllegalStateException("inconsistent state");
                }
            label_19:
                FIN.finallyCodeBegin$NT(v1);
            }
            FIN.finallyCodeEnd$NT(v1);
            if(object0 == null && object1 == null) {
                return;
            }
            Intrinsics.checkNotNull(object0);
            Intrinsics.checkNotNull(object1);
        }
        FIN.finallyExec$NT(v1);
        throw new IllegalStateException("map/keySet size inconsistency");
    }
}

