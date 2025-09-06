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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000F\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\u0004J\u000E\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u0003J\u0018\u0010\b\u001A\u00020\u000B2\b\b\u0001\u0010\f\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u0003J\u000E\u0010\r\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\u0001J\u0018\u0010\r\u001A\u00020\t2\b\b\u0001\u0010\f\u001A\u00020\u00032\u0006\u0010\u000E\u001A\u00020\u0001J\u0018\u0010\r\u001A\u00020\t2\b\b\u0001\u0010\f\u001A\u00020\u00032\u0006\u0010\u000E\u001A\u00020\u000FJ\u000E\u0010\r\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\u000FJ\u0006\u0010\u0010\u001A\u00020\u000BJ\u000E\u0010\u0011\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\u0003J\u0011\u0010\u0012\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\u0001H\u0086\u0002J\u0011\u0010\u0012\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\u0003H\u0086\nJ\u0011\u0010\u0012\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\u000FH\u0086\u0002J\u0011\u0010\u0013\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\u0001H\u0086\u0002J\u0011\u0010\u0013\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\u0003H\u0086\nJ\u0011\u0010\u0013\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\u000FH\u0086\u0002J\u000E\u0010\u0014\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u0003J\u000E\u0010\u0015\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\u0001J\u000E\u0010\u0015\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\u000FJ\u0010\u0010\u0016\u001A\u00020\u00032\b\b\u0001\u0010\f\u001A\u00020\u0003J\u001A\u0010\u0017\u001A\u00020\u000B2\b\b\u0001\u0010\u0018\u001A\u00020\u00032\b\b\u0001\u0010\u0019\u001A\u00020\u0003J\u000E\u0010\u001A\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\u0001J\u000E\u0010\u001A\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\u000FJ\u001B\u0010\u001B\u001A\u00020\u00032\b\b\u0001\u0010\f\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u0003H\u0086\u0002J\u0006\u0010\u001C\u001A\u00020\u000BJ\u0006\u0010\u001D\u001A\u00020\u000BJ\u0010\u0010\u001E\u001A\u00020\u000B2\b\b\u0002\u0010\u001F\u001A\u00020\u0003R\u0012\u0010\u0005\u001A\u00020\u00038\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007\u00A8\u0006 "}, d2 = {"Landroidx/collection/MutableIntList;", "Landroidx/collection/IntList;", "initialCapacity", "", "(I)V", "capacity", "getCapacity", "()I", "add", "", "element", "", "index", "addAll", "elements", "", "clear", "ensureCapacity", "minusAssign", "plusAssign", "remove", "removeAll", "removeAt", "removeRange", "start", "end", "retainAll", "set", "sort", "sortDescending", "trim", "minCapacity", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n549#1:970\n70#2:971\n253#2,6:974\n70#2:980\n70#2:981\n70#2:982\n70#2:989\n70#2:990\n13600#3,2:972\n1663#3,6:983\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n*L\n692#1:970\n753#1:971\n772#1:974,6\n783#1:980\n787#1:981\n834#1:982\n850#1:989\n869#1:990\n763#1:972,2\n836#1:983,6\n*E\n"})
public final class MutableIntList extends IntList {
    public MutableIntList() {
        this(0, 1, null);
    }

    public MutableIntList(int v) {
        super(v, null);
    }

    public MutableIntList(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 16;
        }
        this(v);
    }

    public final void add(@IntRange(from = 0L) int v, int v1) {
        if(v >= 0) {
            int v2 = this._size;
            if(v <= v2) {
                this.ensureCapacity(v2 + 1);
                int[] arr_v = this.content;
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

    public final boolean add(int v) {
        this.ensureCapacity(this._size + 1);
        int v1 = this._size;
        this.content[v1] = v;
        this._size = v1 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0L) int v, @NotNull IntList intList0) {
        Intrinsics.checkNotNullParameter(intList0, "elements");
        if(v >= 0 && v <= this._size) {
            if(intList0.isEmpty()) {
                return false;
            }
            this.ensureCapacity(this._size + intList0._size);
            int[] arr_v = this.content;
            int v1 = this._size;
            if(v != v1) {
                ArraysKt___ArraysJvmKt.copyInto(arr_v, arr_v, intList0._size + v, v, v1);
            }
            ArraysKt___ArraysJvmKt.copyInto(intList0.content, arr_v, v, 0, intList0._size);
            this._size += intList0._size;
            return true;
        }
        StringBuilder stringBuilder0 = b.s(v, "Index ", " must be in 0..");
        stringBuilder0.append(this._size);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final boolean addAll(@IntRange(from = 0L) int v, @NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        if(v >= 0) {
            int v1 = this._size;
            if(v <= v1) {
                if(arr_v.length == 0) {
                    return false;
                }
                this.ensureCapacity(v1 + arr_v.length);
                int[] arr_v1 = this.content;
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

    public final boolean addAll(@NotNull IntList intList0) {
        Intrinsics.checkNotNullParameter(intList0, "elements");
        return this.addAll(this._size, intList0);
    }

    public final boolean addAll(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        return this.addAll(this._size, arr_v);
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int v) {
        int[] arr_v = this.content;
        if(arr_v.length < v) {
            int[] arr_v1 = Arrays.copyOf(arr_v, Math.max(v, arr_v.length * 3 / 2));
            Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(this, newSize)");
            this.content = arr_v1;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(int v) {
        this.remove(v);
    }

    public final void minusAssign(@NotNull IntList intList0) {
        Intrinsics.checkNotNullParameter(intList0, "elements");
        int[] arr_v = intList0.content;
        int v = intList0._size;
        for(int v1 = 0; v1 < v; ++v1) {
            this.remove(arr_v[v1]);
        }
    }

    public final void minusAssign(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        for(int v = 0; v < arr_v.length; ++v) {
            this.remove(arr_v[v]);
        }
    }

    public final void plusAssign(int v) {
        this.add(v);
    }

    public final void plusAssign(@NotNull IntList intList0) {
        Intrinsics.checkNotNullParameter(intList0, "elements");
        this.addAll(this._size, intList0);
    }

    public final void plusAssign(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        this.addAll(this._size, arr_v);
    }

    public final boolean remove(int v) {
        int v1 = this.indexOf(v);
        if(v1 >= 0) {
            this.removeAt(v1);
            return true;
        }
        return false;
    }

    public final boolean removeAll(@NotNull IntList intList0) {
        Intrinsics.checkNotNullParameter(intList0, "elements");
        int v = this._size;
        int v1 = intList0._size - 1;
        if(v1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                this.remove(intList0.get(v2));
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v != this._size;
    }

    public final boolean removeAll(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        int v = this._size;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            this.remove(arr_v[v1]);
        }
        return v != this._size;
    }

    public final int removeAt(@IntRange(from = 0L) int v) {
        if(v >= 0) {
            int v1 = this._size;
            if(v < v1) {
                int[] arr_v = this.content;
                int v2 = arr_v[v];
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

    public final boolean retainAll(@NotNull IntList intList0) {
        Intrinsics.checkNotNullParameter(intList0, "elements");
        int v = this._size;
        int[] arr_v = this.content;
        for(int v1 = v - 1; -1 < v1; --v1) {
            if(!intList0.contains(arr_v[v1])) {
                this.removeAt(v1);
            }
        }
        return v != this._size;
    }

    public final boolean retainAll(@NotNull int[] arr_v) {
        int v2;
        Intrinsics.checkNotNullParameter(arr_v, "elements");
        int v = this._size;
        int[] arr_v1 = this.content;
        for(int v1 = v - 1; true; --v1) {
            v2 = 0;
            int v3 = -1;
            if(-1 >= v1) {
                break;
            }
            int v4 = arr_v1[v1];
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

    public final int set(@IntRange(from = 0L) int v, int v1) {
        if(v >= 0 && v < this._size) {
            int[] arr_v = this.content;
            int v2 = arr_v[v];
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
        int[] arr_v = this.content;
        if(arr_v.length > v1) {
            int[] arr_v1 = Arrays.copyOf(arr_v, v1);
            Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(this, newSize)");
            this.content = arr_v1;
        }
    }

    public static void trim$default(MutableIntList mutableIntList0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = mutableIntList0._size;
        }
        mutableIntList0.trim(v);
    }
}

