package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
import r.i;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u001F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\b\u000B\n\u0002\u0010\b\n\u0002\b\u0004\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001D\u0010\r\u001A\u00020\u00022\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001D\u0010\u0012\u001A\u00020\u00022\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u000BH\u0016¢\u0006\u0004\b\u0012\u0010\u000EJ\u001D\u0010\u0013\u001A\u00020\u00022\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u000BH\u0016¢\u0006\u0004\b\u0013\u0010\u000EJ\u0017\u0010\u0014\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u001D\u0010\u0015\u001A\u00020\u00022\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u000BH\u0016¢\u0006\u0004\b\u0015\u0010\u000EJ\u0018\u0010\u0016\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u001A\u001A\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$values$1", "", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "clear", "()V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "element", "add", "(Ljava/lang/Object;)Z", "retainAll", "removeAll", "remove", "containsAll", "contains", "", "getSize", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n363#2,6:1855\n373#2,3:1862\n376#2,9:1866\n363#2,6:1875\n373#2,3:1882\n376#2,9:1886\n1810#3:1841\n1672#3:1845\n1810#3:1861\n1672#3:1865\n1810#3:1881\n1672#3:1885\n1726#4,3:1895\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1\n*L\n1530#1:1835,6\n1530#1:1842,3\n1530#1:1846,9\n1541#1:1855,6\n1541#1:1862,3\n1541#1:1866,9\n1551#1:1875,6\n1551#1:1882,3\n1551#1:1886,9\n1530#1:1841\n1530#1:1845\n1541#1:1861\n1541#1:1865\n1551#1:1881\n1551#1:1885\n1561#1:1895,3\n*E\n"})
public final class MutableScatterMap.MutableMapWrapper.values.1 implements Collection, KMutableCollection {
    public final MutableScatterMap a;

    public MutableScatterMap.MutableMapWrapper.values.1(MutableScatterMap mutableScatterMap0) {
        this.a = mutableScatterMap0;
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public boolean contains(Object object0) {
        return this.a.containsValue(object0);
    }

    @Override
    public boolean containsAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        if(!collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(!this.a.containsValue(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    public int getSize() {
        return this.a._size;
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return new Object() {
            public final Iterator a;
            public int b;
            public final MutableScatterMap c;

            {
                this.c = mutableScatterMap0;
                this.a = SequencesKt__SequenceBuilderKt.iterator(new i(mutableScatterMap0, null));
                this.b = -1;
            }

            @Override
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override
            public Object next() {
                Object object0 = this.a.next();
                int v = ((Number)object0).intValue();
                this.b = v;
                return this.c.values[v];
            }

            @Override
            public void remove() {
                int v = this.b;
                if(v >= 0) {
                    this.c.removeValueAt(v);
                    this.b = -1;
                }
            }
        };
    }

    @Override
    public boolean remove(Object object0) {
        MutableScatterMap mutableScatterMap0 = this.a;
        long[] arr_v = mutableScatterMap0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            if(Intrinsics.areEqual(mutableScatterMap0.values[v5], object0)) {
                                mutableScatterMap0.removeValueAt(v5);
                                return true;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_19;
                    }
                    break;
                }
            label_19:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return false;
    }

    @Override
    public boolean removeAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        MutableScatterMap mutableScatterMap0 = this.a;
        long[] arr_v = mutableScatterMap0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            boolean z = false;
            for(int v1 = 0; true; ++v1) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            if(CollectionsKt___CollectionsKt.contains(collection0, mutableScatterMap0.values[v5])) {
                                mutableScatterMap0.removeValueAt(v5);
                                z = true;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 != 8) {
                        return z;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
            return z;
        }
        return false;
    }

    @Override
    public boolean retainAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        MutableScatterMap mutableScatterMap0 = this.a;
        long[] arr_v = mutableScatterMap0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            boolean z = false;
            for(int v1 = 0; true; ++v1) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            if(!CollectionsKt___CollectionsKt.contains(collection0, mutableScatterMap0.values[v5])) {
                                mutableScatterMap0.removeValueAt(v5);
                                z = true;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 != 8) {
                        return z;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
            return z;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "array");
        return CollectionToArray.toArray(this, arr_object);
    }
}

