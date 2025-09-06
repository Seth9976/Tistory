package androidx.core.util;

import android.util.SparseBooleanArray;
import kotlin.Metadata;
import kotlin.collections.BooleanIterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001A\u0015\u0010\u0005\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0001H\u0086\n\u001A\u0015\u0010\b\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0001H\u0086\b\u001A\u0015\u0010\t\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001A\u00020\u0006H\u0086\b\u001AE\u0010\u000B\u001A\u00020\f*\u00020\u000226\u0010\r\u001A2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\f0\u000EH\u0086\b\u001A\u001D\u0010\u0011\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00012\u0006\u0010\u0012\u001A\u00020\u0006H\u0086\b\u001A#\u0010\u0013\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00012\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0086\b\u001A\r\u0010\u0015\u001A\u00020\u0006*\u00020\u0002H\u0086\b\u001A\r\u0010\u0016\u001A\u00020\u0006*\u00020\u0002H\u0086\b\u001A\n\u0010\u0017\u001A\u00020\u0018*\u00020\u0002\u001A\u0015\u0010\u0019\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u001A\u001A\u00020\u0002H\u0086\u0002\u001A\u0012\u0010\u001B\u001A\u00020\f*\u00020\u00022\u0006\u0010\u001A\u001A\u00020\u0002\u001A\u001A\u0010\u001C\u001A\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00012\u0006\u0010\n\u001A\u00020\u0006\u001A\u001D\u0010\u001D\u001A\u00020\f*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00012\u0006\u0010\n\u001A\u00020\u0006H\u0086\n\u001A\n\u0010\u001E\u001A\u00020\u001F*\u00020\u0002\"\u0016\u0010\u0000\u001A\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004¨\u0006 "}, d2 = {"size", "", "Landroid/util/SparseBooleanArray;", "getSize", "(Landroid/util/SparseBooleanArray;)I", "contains", "", "key", "containsKey", "containsValue", "value", "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "isEmpty", "isNotEmpty", "keyIterator", "Lkotlin/collections/IntIterator;", "plus", "other", "putAll", "remove", "set", "valueIterator", "Lkotlin/collections/BooleanIterator;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSparseBooleanArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n77#1,4:97\n1#2:96\n*S KotlinDebug\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n*L\n73#1:97,4\n*E\n"})
public final class SparseBooleanArrayKt {
    public static final boolean contains(@NotNull SparseBooleanArray sparseBooleanArray0, int v) {
        return sparseBooleanArray0.indexOfKey(v) >= 0;
    }

    public static final boolean containsKey(@NotNull SparseBooleanArray sparseBooleanArray0, int v) {
        return sparseBooleanArray0.indexOfKey(v) >= 0;
    }

    public static final boolean containsValue(@NotNull SparseBooleanArray sparseBooleanArray0, boolean z) {
        return sparseBooleanArray0.indexOfValue(z) >= 0;
    }

    public static final void forEach(@NotNull SparseBooleanArray sparseBooleanArray0, @NotNull Function2 function20) {
        int v = sparseBooleanArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            function20.invoke(sparseBooleanArray0.keyAt(v1), Boolean.valueOf(sparseBooleanArray0.valueAt(v1)));
        }
    }

    public static final boolean getOrDefault(@NotNull SparseBooleanArray sparseBooleanArray0, int v, boolean z) {
        return sparseBooleanArray0.get(v, z);
    }

    public static final boolean getOrElse(@NotNull SparseBooleanArray sparseBooleanArray0, int v, @NotNull Function0 function00) {
        int v1 = sparseBooleanArray0.indexOfKey(v);
        return v1 < 0 ? ((Boolean)function00.invoke()).booleanValue() : sparseBooleanArray0.valueAt(v1);
    }

    public static final int getSize(@NotNull SparseBooleanArray sparseBooleanArray0) {
        return sparseBooleanArray0.size();
    }

    public static final boolean isEmpty(@NotNull SparseBooleanArray sparseBooleanArray0) {
        return sparseBooleanArray0.size() == 0;
    }

    public static final boolean isNotEmpty(@NotNull SparseBooleanArray sparseBooleanArray0) {
        return sparseBooleanArray0.size() != 0;
    }

    @NotNull
    public static final IntIterator keyIterator(@NotNull SparseBooleanArray sparseBooleanArray0) {
        return new IntIterator() {
            public int a;

            public final int getIndex() {
                return this.a;
            }

            @Override
            public boolean hasNext() {
                return this.a < sparseBooleanArray0.size();
            }

            @Override  // kotlin.collections.IntIterator
            public int nextInt() {
                int v = this.a;
                this.a = v + 1;
                return sparseBooleanArray0.keyAt(v);
            }

            public final void setIndex(int v) {
                this.a = v;
            }
        };
    }

    @NotNull
    public static final SparseBooleanArray plus(@NotNull SparseBooleanArray sparseBooleanArray0, @NotNull SparseBooleanArray sparseBooleanArray1) {
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(sparseBooleanArray1.size() + sparseBooleanArray0.size());
        SparseBooleanArrayKt.putAll(sparseBooleanArray2, sparseBooleanArray0);
        SparseBooleanArrayKt.putAll(sparseBooleanArray2, sparseBooleanArray1);
        return sparseBooleanArray2;
    }

    public static final void putAll(@NotNull SparseBooleanArray sparseBooleanArray0, @NotNull SparseBooleanArray sparseBooleanArray1) {
        int v = sparseBooleanArray1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            sparseBooleanArray0.put(sparseBooleanArray1.keyAt(v1), sparseBooleanArray1.valueAt(v1));
        }
    }

    public static final boolean remove(@NotNull SparseBooleanArray sparseBooleanArray0, int v, boolean z) {
        int v1 = sparseBooleanArray0.indexOfKey(v);
        if(v1 >= 0 && z == sparseBooleanArray0.valueAt(v1)) {
            sparseBooleanArray0.delete(v);
            return true;
        }
        return false;
    }

    public static final void set(@NotNull SparseBooleanArray sparseBooleanArray0, int v, boolean z) {
        sparseBooleanArray0.put(v, z);
    }

    @NotNull
    public static final BooleanIterator valueIterator(@NotNull SparseBooleanArray sparseBooleanArray0) {
        return new BooleanIterator() {
            public int a;

            public final int getIndex() {
                return this.a;
            }

            @Override
            public boolean hasNext() {
                return this.a < sparseBooleanArray0.size();
            }

            @Override  // kotlin.collections.BooleanIterator
            public boolean nextBoolean() {
                int v = this.a;
                this.a = v + 1;
                return sparseBooleanArray0.valueAt(v);
            }

            public final void setIndex(int v) {
                this.a = v;
            }
        };
    }
}

