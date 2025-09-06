package androidx.core.util;

import android.util.SparseArray;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010(\n\u0000\u001A!\u0010\u0006\u001A\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001A\u00020\u0001H\u0086\n\u001A!\u0010\t\u001A\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001A\u00020\u0001H\u0086\b\u001A&\u0010\n\u001A\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000B\u001A\u0002H\u0002H\u0086\b\u00A2\u0006\u0002\u0010\f\u001AQ\u0010\r\u001A\u00020\u000E\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000326\u0010\u000F\u001A2\u0012\u0013\u0012\u00110\u0001\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\b\u0012\u0013\u0012\u0011H\u0002\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u000B\u0012\u0004\u0012\u00020\u000E0\u0010H\u0086\b\u001A.\u0010\u0013\u001A\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001A\u00020\u00012\u0006\u0010\u0014\u001A\u0002H\u0002H\u0086\b\u00A2\u0006\u0002\u0010\u0015\u001A4\u0010\u0016\u001A\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001A\u00020\u00012\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0017H\u0086\b\u00A2\u0006\u0002\u0010\u0018\u001A\u0019\u0010\u0019\u001A\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\b\u001A\u0019\u0010\u001A\u001A\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\b\u001A\u0016\u0010\u001B\u001A\u00020\u001C\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001A-\u0010\u001D\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\u0002\u001A$\u0010\u001F\u001A\u00020\u000E\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001A+\u0010 \u001A\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001A\u00020\u00012\u0006\u0010\u000B\u001A\u0002H\u0002\u00A2\u0006\u0002\u0010!\u001A.\u0010\"\u001A\u00020\u000E\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001A\u00020\u00012\u0006\u0010\u000B\u001A\u0002H\u0002H\u0086\n\u00A2\u0006\u0002\u0010#\u001A\u001C\u0010$\u001A\b\u0012\u0004\u0012\u0002H\u00020%\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\"\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005\u00A8\u0006&"}, d2 = {"size", "", "T", "Landroid/util/SparseArray;", "getSize", "(Landroid/util/SparseArray;)I", "contains", "", "key", "containsKey", "containsValue", "value", "(Landroid/util/SparseArray;Ljava/lang/Object;)Z", "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrDefault", "defaultValue", "(Landroid/util/SparseArray;ILjava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Landroid/util/SparseArray;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isEmpty", "isNotEmpty", "keyIterator", "Lkotlin/collections/IntIterator;", "plus", "other", "putAll", "remove", "(Landroid/util/SparseArray;ILjava/lang/Object;)Z", "set", "(Landroid/util/SparseArray;ILjava/lang/Object;)V", "valueIterator", "", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n1#1,94:1\n76#1,4:95\n*S KotlinDebug\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n72#1:95,4\n*E\n"})
public final class SparseArrayKt {
    public static final boolean contains(@NotNull SparseArray sparseArray0, int v) {
        return sparseArray0.indexOfKey(v) >= 0;
    }

    public static final boolean containsKey(@NotNull SparseArray sparseArray0, int v) {
        return sparseArray0.indexOfKey(v) >= 0;
    }

    public static final boolean containsValue(@NotNull SparseArray sparseArray0, Object object0) {
        return sparseArray0.indexOfValue(object0) >= 0;
    }

    public static final void forEach(@NotNull SparseArray sparseArray0, @NotNull Function2 function20) {
        int v = sparseArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            function20.invoke(sparseArray0.keyAt(v1), sparseArray0.valueAt(v1));
        }
    }

    public static final Object getOrDefault(@NotNull SparseArray sparseArray0, int v, Object object0) {
        Object object1 = sparseArray0.get(v);
        return object1 == null ? object0 : object1;
    }

    public static final Object getOrElse(@NotNull SparseArray sparseArray0, int v, @NotNull Function0 function00) {
        Object object0 = sparseArray0.get(v);
        return object0 == null ? function00.invoke() : object0;
    }

    public static final int getSize(@NotNull SparseArray sparseArray0) {
        return sparseArray0.size();
    }

    public static final boolean isEmpty(@NotNull SparseArray sparseArray0) {
        return sparseArray0.size() == 0;
    }

    public static final boolean isNotEmpty(@NotNull SparseArray sparseArray0) {
        return sparseArray0.size() != 0;
    }

    @NotNull
    public static final IntIterator keyIterator(@NotNull SparseArray sparseArray0) {
        return new IntIterator() {
            public int a;

            public final int getIndex() {
                return this.a;
            }

            @Override
            public boolean hasNext() {
                return this.a < sparseArray0.size();
            }

            @Override  // kotlin.collections.IntIterator
            public int nextInt() {
                int v = this.a;
                this.a = v + 1;
                return sparseArray0.keyAt(v);
            }

            public final void setIndex(int v) {
                this.a = v;
            }
        };
    }

    @NotNull
    public static final SparseArray plus(@NotNull SparseArray sparseArray0, @NotNull SparseArray sparseArray1) {
        SparseArray sparseArray2 = new SparseArray(sparseArray1.size() + sparseArray0.size());
        SparseArrayKt.putAll(sparseArray2, sparseArray0);
        SparseArrayKt.putAll(sparseArray2, sparseArray1);
        return sparseArray2;
    }

    public static final void putAll(@NotNull SparseArray sparseArray0, @NotNull SparseArray sparseArray1) {
        int v = sparseArray1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            sparseArray0.put(sparseArray1.keyAt(v1), sparseArray1.valueAt(v1));
        }
    }

    public static final boolean remove(@NotNull SparseArray sparseArray0, int v, Object object0) {
        int v1 = sparseArray0.indexOfKey(v);
        if(v1 >= 0 && Intrinsics.areEqual(object0, sparseArray0.valueAt(v1))) {
            sparseArray0.removeAt(v1);
            return true;
        }
        return false;
    }

    public static final void set(@NotNull SparseArray sparseArray0, int v, Object object0) {
        sparseArray0.put(v, object0);
    }

    @NotNull
    public static final Iterator valueIterator(@NotNull SparseArray sparseArray0) {
        return new Object() {
            public int a;
            public final SparseArray b;

            {
                SparseArray sparseArray0 = sparseArray0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.b = sparseArray0;
            }

            public final int getIndex() {
                return this.a;
            }

            @Override
            public boolean hasNext() {
                return this.a < this.b.size();
            }

            @Override
            public Object next() {
                int v = this.a;
                this.a = v + 1;
                return this.b.valueAt(v);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public final void setIndex(int v) {
                this.a = v;
            }
        };
    }
}

