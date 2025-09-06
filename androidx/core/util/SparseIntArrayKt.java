package androidx.core.util;

import android.util.SparseIntArray;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\u0015\u0010\u0005\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0001H\u0086\n\u001A\u0015\u0010\b\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0001H\u0086\b\u001A\u0015\u0010\t\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001A\u00020\u0001H\u0086\b\u001AE\u0010\u000B\u001A\u00020\f*\u00020\u000226\u0010\r\u001A2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\f0\u000EH\u0086\b\u001A\u001D\u0010\u0011\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00012\u0006\u0010\u0012\u001A\u00020\u0001H\u0086\b\u001A#\u0010\u0013\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00012\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0086\b\u001A\r\u0010\u0015\u001A\u00020\u0006*\u00020\u0002H\u0086\b\u001A\r\u0010\u0016\u001A\u00020\u0006*\u00020\u0002H\u0086\b\u001A\n\u0010\u0017\u001A\u00020\u0018*\u00020\u0002\u001A\u0015\u0010\u0019\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u001A\u001A\u00020\u0002H\u0086\u0002\u001A\u0012\u0010\u001B\u001A\u00020\f*\u00020\u00022\u0006\u0010\u001A\u001A\u00020\u0002\u001A\u001A\u0010\u001C\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00012\u0006\u0010\n\u001A\u00020\u0001\u001A\u001D\u0010\u001D\u001A\u00020\f*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00012\u0006\u0010\n\u001A\u00020\u0001H\u0086\n\u001A\n\u0010\u001E\u001A\u00020\u0018*\u00020\u0002\"\u0016\u0010\u0000\u001A\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u001F"}, d2 = {"size", "", "Landroid/util/SparseIntArray;", "getSize", "(Landroid/util/SparseIntArray;)I", "contains", "", "key", "containsKey", "containsValue", "value", "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "isEmpty", "isNotEmpty", "keyIterator", "Lkotlin/collections/IntIterator;", "plus", "other", "putAll", "remove", "set", "valueIterator", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSparseIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n71#1:95,4\n*E\n"})
public final class SparseIntArrayKt {
    public static final boolean contains(@NotNull SparseIntArray sparseIntArray0, int v) {
        return sparseIntArray0.indexOfKey(v) >= 0;
    }

    public static final boolean containsKey(@NotNull SparseIntArray sparseIntArray0, int v) {
        return sparseIntArray0.indexOfKey(v) >= 0;
    }

    public static final boolean containsValue(@NotNull SparseIntArray sparseIntArray0, int v) {
        return sparseIntArray0.indexOfValue(v) >= 0;
    }

    public static final void forEach(@NotNull SparseIntArray sparseIntArray0, @NotNull Function2 function20) {
        int v = sparseIntArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            function20.invoke(sparseIntArray0.keyAt(v1), sparseIntArray0.valueAt(v1));
        }
    }

    public static final int getOrDefault(@NotNull SparseIntArray sparseIntArray0, int v, int v1) {
        return sparseIntArray0.get(v, v1);
    }

    public static final int getOrElse(@NotNull SparseIntArray sparseIntArray0, int v, @NotNull Function0 function00) {
        int v1 = sparseIntArray0.indexOfKey(v);
        return v1 < 0 ? ((Number)function00.invoke()).intValue() : sparseIntArray0.valueAt(v1);
    }

    public static final int getSize(@NotNull SparseIntArray sparseIntArray0) {
        return sparseIntArray0.size();
    }

    public static final boolean isEmpty(@NotNull SparseIntArray sparseIntArray0) {
        return sparseIntArray0.size() == 0;
    }

    public static final boolean isNotEmpty(@NotNull SparseIntArray sparseIntArray0) {
        return sparseIntArray0.size() != 0;
    }

    @NotNull
    public static final IntIterator keyIterator(@NotNull SparseIntArray sparseIntArray0) {
        return new IntIterator() {
            public int a;

            public final int getIndex() {
                return this.a;
            }

            @Override
            public boolean hasNext() {
                return this.a < sparseIntArray0.size();
            }

            @Override  // kotlin.collections.IntIterator
            public int nextInt() {
                int v = this.a;
                this.a = v + 1;
                return sparseIntArray0.keyAt(v);
            }

            public final void setIndex(int v) {
                this.a = v;
            }
        };
    }

    @NotNull
    public static final SparseIntArray plus(@NotNull SparseIntArray sparseIntArray0, @NotNull SparseIntArray sparseIntArray1) {
        SparseIntArray sparseIntArray2 = new SparseIntArray(sparseIntArray1.size() + sparseIntArray0.size());
        SparseIntArrayKt.putAll(sparseIntArray2, sparseIntArray0);
        SparseIntArrayKt.putAll(sparseIntArray2, sparseIntArray1);
        return sparseIntArray2;
    }

    public static final void putAll(@NotNull SparseIntArray sparseIntArray0, @NotNull SparseIntArray sparseIntArray1) {
        int v = sparseIntArray1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            sparseIntArray0.put(sparseIntArray1.keyAt(v1), sparseIntArray1.valueAt(v1));
        }
    }

    public static final boolean remove(@NotNull SparseIntArray sparseIntArray0, int v, int v1) {
        int v2 = sparseIntArray0.indexOfKey(v);
        if(v2 >= 0 && v1 == sparseIntArray0.valueAt(v2)) {
            sparseIntArray0.removeAt(v2);
            return true;
        }
        return false;
    }

    public static final void set(@NotNull SparseIntArray sparseIntArray0, int v, int v1) {
        sparseIntArray0.put(v, v1);
    }

    @NotNull
    public static final IntIterator valueIterator(@NotNull SparseIntArray sparseIntArray0) {
        return new IntIterator() {
            public int a;

            public final int getIndex() {
                return this.a;
            }

            @Override
            public boolean hasNext() {
                return this.a < sparseIntArray0.size();
            }

            @Override  // kotlin.collections.IntIterator
            public int nextInt() {
                int v = this.a;
                this.a = v + 1;
                return sparseIntArray0.valueAt(v);
            }

            public final void setIndex(int v) {
                this.a = v;
            }
        };
    }
}

