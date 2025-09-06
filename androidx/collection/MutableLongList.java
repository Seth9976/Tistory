package androidx.collection;

import a5.b;
import androidx.annotation.IntRange;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000F\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001A\u00020\t2\b\b\u0001\u0010\n\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\fJ\u000E\u0010\b\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\fJ\u000E\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u0001J\u0018\u0010\u000E\u001A\u00020\r2\b\b\u0001\u0010\n\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u0001J\u0018\u0010\u000E\u001A\u00020\r2\b\b\u0001\u0010\n\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u0010J\u000E\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u0010J\u0006\u0010\u0011\u001A\u00020\tJ\u000E\u0010\u0012\u001A\u00020\t2\u0006\u0010\u0005\u001A\u00020\u0003J\u0011\u0010\u0013\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\u0001H\u0086\u0002J\u0011\u0010\u0013\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\fH\u0086\nJ\u0011\u0010\u0013\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\u0010H\u0086\u0002J\u0011\u0010\u0014\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\u0001H\u0086\u0002J\u0011\u0010\u0014\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\fH\u0086\nJ\u0011\u0010\u0014\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\u0010H\u0086\u0002J\u000E\u0010\u0015\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\fJ\u000E\u0010\u0016\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u0001J\u000E\u0010\u0016\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u0010J\u0010\u0010\u0017\u001A\u00020\f2\b\b\u0001\u0010\n\u001A\u00020\u0003J\u001A\u0010\u0018\u001A\u00020\t2\b\b\u0001\u0010\u0019\u001A\u00020\u00032\b\b\u0001\u0010\u001A\u001A\u00020\u0003J\u000E\u0010\u001B\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u0001J\u000E\u0010\u001B\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u0010J\u001B\u0010\u001C\u001A\u00020\f2\b\b\u0001\u0010\n\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\fH\u0086\u0002J\u0006\u0010\u001D\u001A\u00020\tJ\u0006\u0010\u001E\u001A\u00020\tJ\u0010\u0010\u001F\u001A\u00020\t2\b\b\u0002\u0010 \u001A\u00020\u0003R\u0012\u0010\u0005\u001A\u00020\u00038\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007\u00A8\u0006!"}, d2 = {"Landroidx/collection/MutableLongList;", "Landroidx/collection/LongList;", "initialCapacity", "", "(I)V", "capacity", "getCapacity", "()I", "add", "", "index", "element", "", "", "addAll", "elements", "", "clear", "ensureCapacity", "minusAssign", "plusAssign", "remove", "removeAll", "removeAt", "removeRange", "start", "end", "retainAll", "set", "sort", "sortDescending", "trim", "minCapacity", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n+ 2 LongList.kt\nandroidx/collection/LongList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n549#1:970\n70#2:971\n253#2,6:974\n70#2:980\n70#2:981\n70#2:982\n70#2:989\n70#2:990\n13607#3,2:972\n1675#3,6:983\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n*L\n692#1:970\n753#1:971\n772#1:974,6\n783#1:980\n787#1:981\n834#1:982\n850#1:989\n869#1:990\n763#1:972,2\n836#1:983,6\n*E\n"})
public final class MutableLongList extends LongList {
    public MutableLongList() {
        this(0, 1, null);
    }

    public MutableLongList(int v) {
        super(v, null);
    }

    public MutableLongList(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 16;
        }
        this(v);
    }

    public final void add(@IntRange(from = 0L) int v, long v1) {
        if(v >= 0) {
            int v2 = this._size;
            if(v <= v2) {
                this.ensureCapacity(v2 + 1);
                long[] arr_v = this.content;
                int v3 = this._size;
                if(v != v3) {
                    ArraysKt___ArraysJvmKt.copyInto(arr_v, arr_v, v + 1, v, v3);
                }
                arr_v[v] = v1;
                ++this._size;
                return;
            }
        }
        StringBuilder stringBuilder0 = b.s(v, "Index ", " must be in 0..");
        stringBuilder0.append(this._size);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final boolean add(long v) {
        this.ensureCapacity(this._size + 1);
        int v1 = this._size;
        this.content[v1] = v;
        this._size = v1 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0L) int v, @NotNull LongList longList0) {
        Intrinsics.checkNotNullParameter(longList0, "elements");
        if(v >= 0 && v <= this._size) {
            if(longList0.isEmpty()) {
                return false;
            }
            this.ensureCapacity(this._size + longList0._size);
            long[] arr_v = this.content;
            int v1 = this._size;
            if(v != v1) {
                ArraysKt___ArraysJvmKt.copyInto(arr_v, arr_v, longList0._size + v, v, v1);
            }
            ArraysKt___ArraysJvmKt.copyInto(longList0.content, arr_v, v, 0, longList0._size);
            this._size += longList0._size;
            return true;
        }
        StringBuilder stringBuilder0 = b.s(v, "Index ", " must be in 0..");
        stringBuilder0.append(this._size);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final boolean addAll(@IntRange(from = 0L) int v, @NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        if(v >= 0) {
            int v1 = this._size;
            if(v <= v1) {
                if(arr_v.length == 0) {
                    return false;
                }
                this.ensureCapacity(v1 + arr_v.length);
                long[] arr_v1 = this.content;
                int v2 = this._size;
                if(v != v2) {
                    ArraysKt___ArraysJvmKt.copyInto(arr_v1, arr_v1, arr_v.length + v, v, v2);
                }
                ArraysKt___ArraysJvmKt.copyInto$default(arr_v, arr_v1, v, 0, 0, 12, null);
                this._size += arr_v.length;
                return true;
            }
        }
        StringBuilder stringBuilder0 = b.s(v, "Index ", " must be in 0..");
        stringBuilder0.append(this._size);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final boolean addAll(@NotNull LongList longList0) {
        Intrinsics.checkNotNullParameter(longList0, "elements");
        return this.addAll(this._size, longList0);
    }

    public final boolean addAll(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        return this.addAll(this._size, arr_v);
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int v) {
        long[] arr_v = this.content;
        if(arr_v.length < v) {
            long[] arr_v1 = Arrays.copyOf(arr_v, Math.max(v, arr_v.length * 3 / 2));
            Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(this, newSize)");
            this.content = arr_v1;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(long v) {
        this.remove(v);
    }

    public final void minusAssign(@NotNull LongList longList0) {
        Intrinsics.checkNotNullParameter(longList0, "elements");
        long[] arr_v = longList0.content;
        int v = longList0._size;
        for(int v1 = 0; v1 < v; ++v1) {
            this.remove(arr_v[v1]);
        }
    }

    public final void minusAssign(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        for(int v = 0; v < arr_v.length; ++v) {
            this.remove(arr_v[v]);
        }
    }

    public final void plusAssign(long v) {
        this.add(v);
    }

    public final void plusAssign(@NotNull LongList longList0) {
        Intrinsics.checkNotNullParameter(longList0, "elements");
        this.addAll(this._size, longList0);
    }

    public final void plusAssign(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        this.addAll(this._size, arr_v);
    }

    public final boolean remove(long v) {
        int v1 = this.indexOf(v);
        if(v1 >= 0) {
            this.removeAt(v1);
            return true;
        }
        return false;
    }

    public final boolean removeAll(@NotNull LongList longList0) {
        Intrinsics.checkNotNullParameter(longList0, "elements");
        int v = this._size;
        int v1 = longList0._size - 1;
        if(v1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                this.remove(longList0.get(v2));
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v != this._size;
    }

    public final boolean removeAll(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        int v = this._size;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            this.remove(arr_v[v1]);
        }
        return v != this._size;
    }

    public final long removeAt(@IntRange(from = 0L) int v) {
        if(v >= 0) {
            int v1 = this._size;
            if(v < v1) {
                long[] arr_v = this.content;
                long v2 = arr_v[v];
                if(v != v1 - 1) {
                    ArraysKt___ArraysJvmKt.copyInto(arr_v, arr_v, v, v + 1, v1);
                }
                --this._size;
                return v2;
            }
        }
        StringBuilder stringBuilder0 = b.s(v, "Index ", " must be in 0..");
        stringBuilder0.append(this._size - 1);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final void removeRange(@IntRange(from = 0L) int v, @IntRange(from = 0L) int v1) {
        if(v >= 0) {
            int v2 = this._size;
            if(v <= v2 && v1 >= 0 && v1 <= v2) {
                if(v1 < v) {
                    throw new IllegalArgumentException("Start (" + v + ") is more than end (" + v1 + ')');
                }
                if(v1 != v) {
                    if(v1 < v2) {
                        ArraysKt___ArraysJvmKt.copyInto(this.content, this.content, v, v1, v2);
                    }
                    this._size -= v1 - v;
                }
                return;
            }
        }
        StringBuilder stringBuilder0 = q.u("Start (", v, ") and end (", v1, ") must be in 0..");
        stringBuilder0.append(this._size);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final boolean retainAll(@NotNull LongList longList0) {
        Intrinsics.checkNotNullParameter(longList0, "elements");
        int v = this._size;
        long[] arr_v = this.content;
        for(int v1 = v - 1; -1 < v1; --v1) {
            if(!longList0.contains(arr_v[v1])) {
                this.removeAt(v1);
            }
        }
        return v != this._size;
    }

    public final boolean retainAll(@NotNull long[] arr_v) {
        int v2;
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        int v = this._size;
        long[] arr_v1 = this.content;
        for(int v1 = v - 1; true; --v1) {
            v2 = 0;
            int v3 = -1;
            if(-1 >= v1) {
                break;
            }
            long v4 = arr_v1[v1];
            while(v2 < arr_v.length) {
                if(arr_v[v2] == v4) {
                    v3 = v2;
                    break;
                }
                ++v2;
            }
            if(v3 < 0) {
                this.removeAt(v1);
            }
        }
        if(v != this._size) {
            v2 = 1;
        }
        return v2 != 0;
    }

    public final long set(@IntRange(from = 0L) int v, long v1) {
        if(v >= 0 && v < this._size) {
            long[] arr_v = this.content;
            long v2 = arr_v[v];
            arr_v[v] = v1;
            return v2;
        }
        StringBuilder stringBuilder0 = b.s(v, "set index ", " must be between 0 .. ");
        stringBuilder0.append(this._size - 1);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final void sort() {
        ArraysKt___ArraysJvmKt.sort(this.content, 0, this._size);
    }

    public final void sortDescending() {
        ArraysKt___ArraysKt.sortDescending(this.content, 0, this._size);
    }

    public final void trim(int v) {
        int v1 = Math.max(v, this._size);
        long[] arr_v = this.content;
        if(arr_v.length > v1) {
            long[] arr_v1 = Arrays.copyOf(arr_v, v1);
            Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(this, newSize)");
            this.content = arr_v1;
        }
    }

    public static void trim$default(MutableLongList mutableLongList0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = mutableLongList0._size;
        }
        mutableLongList0.trim(v);
    }
}

