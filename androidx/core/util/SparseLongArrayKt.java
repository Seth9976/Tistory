package androidx.core.util;

import android.util.SparseLongArray;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.collections.LongIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001A\u0015\u0010\u0005\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0001H\u0086\n\u001A\u0015\u0010\b\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0001H\u0086\b\u001A\u0015\u0010\t\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001A\u00020\u000BH\u0086\b\u001AE\u0010\f\u001A\u00020\r*\u00020\u000226\u0010\u000E\u001A2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u000B¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u000FH\u0086\b\u001A\u001D\u0010\u0012\u001A\u00020\u000B*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u000BH\u0086\b\u001A#\u0010\u0014\u001A\u00020\u000B*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00012\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u000B0\u0015H\u0086\b\u001A\r\u0010\u0016\u001A\u00020\u0006*\u00020\u0002H\u0086\b\u001A\r\u0010\u0017\u001A\u00020\u0006*\u00020\u0002H\u0086\b\u001A\n\u0010\u0018\u001A\u00020\u0019*\u00020\u0002\u001A\u0015\u0010\u001A\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u001B\u001A\u00020\u0002H\u0086\u0002\u001A\u0012\u0010\u001C\u001A\u00020\r*\u00020\u00022\u0006\u0010\u001B\u001A\u00020\u0002\u001A\u001A\u0010\u001D\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00012\u0006\u0010\n\u001A\u00020\u000B\u001A\u001D\u0010\u001E\u001A\u00020\r*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00012\u0006\u0010\n\u001A\u00020\u000BH\u0086\n\u001A\n\u0010\u001F\u001A\u00020 *\u00020\u0002\"\u0016\u0010\u0000\u001A\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004¨\u0006!"}, d2 = {"size", "", "Landroid/util/SparseLongArray;", "getSize", "(Landroid/util/SparseLongArray;)I", "contains", "", "key", "containsKey", "containsValue", "value", "", "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "isEmpty", "isNotEmpty", "keyIterator", "Lkotlin/collections/IntIterator;", "plus", "other", "putAll", "remove", "set", "valueIterator", "Lkotlin/collections/LongIterator;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSparseLongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n*L\n71#1:95,4\n*E\n"})
public final class SparseLongArrayKt {
    public static final boolean contains(@NotNull SparseLongArray sparseLongArray0, int v) {
        return sparseLongArray0.indexOfKey(v) >= 0;
    }

    public static final boolean containsKey(@NotNull SparseLongArray sparseLongArray0, int v) {
        return sparseLongArray0.indexOfKey(v) >= 0;
    }

    public static final boolean containsValue(@NotNull SparseLongArray sparseLongArray0, long v) {
        return sparseLongArray0.indexOfValue(v) >= 0;
    }

    public static final void forEach(@NotNull SparseLongArray sparseLongArray0, @NotNull Function2 function20) {
        int v = sparseLongArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            function20.invoke(sparseLongArray0.keyAt(v1), sparseLongArray0.valueAt(v1));
        }
    }

    public static final long getOrDefault(@NotNull SparseLongArray sparseLongArray0, int v, long v1) {
        return sparseLongArray0.get(v, v1);
    }

    public static final long getOrElse(@NotNull SparseLongArray sparseLongArray0, int v, @NotNull Function0 function00) {
        int v1 = sparseLongArray0.indexOfKey(v);
        return v1 < 0 ? ((Number)function00.invoke()).longValue() : sparseLongArray0.valueAt(v1);
    }

    public static final int getSize(@NotNull SparseLongArray sparseLongArray0) {
        return sparseLongArray0.size();
    }

    public static final boolean isEmpty(@NotNull SparseLongArray sparseLongArray0) {
        return sparseLongArray0.size() == 0;
    }

    public static final boolean isNotEmpty(@NotNull SparseLongArray sparseLongArray0) {
        return sparseLongArray0.size() != 0;
    }

    @NotNull
    public static final IntIterator keyIterator(@NotNull SparseLongArray sparseLongArray0) {
        return new IntIterator() {
            public int a;

            public final int getIndex() {
                return this.a;
            }

            @Override
            public boolean hasNext() {
                return this.a < sparseLongArray0.size();
            }

            @Override  // kotlin.collections.IntIterator
            public int nextInt() {
                int v = this.a;
                this.a = v + 1;
                return sparseLongArray0.keyAt(v);
            }

            public final void setIndex(int v) {
                this.a = v;
            }
        };
    }

    @NotNull
    public static final SparseLongArray plus(@NotNull SparseLongArray sparseLongArray0, @NotNull SparseLongArray sparseLongArray1) {
        SparseLongArray sparseLongArray2 = new SparseLongArray(sparseLongArray1.size() + sparseLongArray0.size());
        SparseLongArrayKt.putAll(sparseLongArray2, sparseLongArray0);
        SparseLongArrayKt.putAll(sparseLongArray2, sparseLongArray1);
        return sparseLongArray2;
    }

    public static final void putAll(@NotNull SparseLongArray sparseLongArray0, @NotNull SparseLongArray sparseLongArray1) {
        int v = sparseLongArray1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            sparseLongArray0.put(sparseLongArray1.keyAt(v1), sparseLongArray1.valueAt(v1));
        }
    }

    public static final boolean remove(@NotNull SparseLongArray sparseLongArray0, int v, long v1) {
        int v2 = sparseLongArray0.indexOfKey(v);
        if(v2 >= 0 && v1 == sparseLongArray0.valueAt(v2)) {
            sparseLongArray0.removeAt(v2);
            return true;
        }
        return false;
    }

    public static final void set(@NotNull SparseLongArray sparseLongArray0, int v, long v1) {
        sparseLongArray0.put(v, v1);
    }

    @NotNull
    public static final LongIterator valueIterator(@NotNull SparseLongArray sparseLongArray0) {
        return new LongIterator() {
            public int a;

            public final int getIndex() {
                return this.a;
            }

            @Override
            public boolean hasNext() {
                return this.a < sparseLongArray0.size();
            }

            @Override  // kotlin.collections.LongIterator
            public long nextLong() {
                int v = this.a;
                this.a = v + 1;
                return sparseLongArray0.valueAt(v);
            }

            public final void setIndex(int v) {
                this.a = v;
            }
        };
    }
}

