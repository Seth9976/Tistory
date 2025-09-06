package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import b2.g;
import b2.h;
import g.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u001E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0017\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002ABB\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\t\u0010\u0004J\u001D\u0010\r\u001A\u00020\u00052\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u0005\u00A2\u0006\u0004\b\r\u0010\u000EJ+\u0010\u0012\u001A\u00020\b2\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u00052\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\b0\u0010\u00A2\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0014\u001A\u00020\b2\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u00052\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\b0\u0010\u00A2\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0016\u001A\u00020\b2\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u00052\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\b0\u0010\u00A2\u0006\u0004\b\u0016\u0010\u0015J\u001E\u0010\u0018\u001A\u00020\b2\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\b0\u0010H\u0086\b\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001B\u001A\u00020\u00052\u0006\u0010\u001A\u001A\u00020\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u001D\u0010\u001F\u001A\u00020\u00052\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00020\u001DH\u0016\u00A2\u0006\u0004\b\u001F\u0010 J\u0018\u0010#\u001A\u00020\u00022\u0006\u0010\"\u001A\u00020!H\u0096\u0002\u00A2\u0006\u0004\b#\u0010$J\u0017\u0010%\u001A\u00020!2\u0006\u0010\u001A\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b%\u0010&J\u000F\u0010\'\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b\'\u0010\u0007J\u0016\u0010)\u001A\b\u0012\u0004\u0012\u00020\u00020(H\u0096\u0002\u00A2\u0006\u0004\b)\u0010*J\u0017\u0010+\u001A\u00020!2\u0006\u0010\u001A\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b+\u0010&J\u0015\u0010-\u001A\b\u0012\u0004\u0012\u00020\u00020,H\u0016\u00A2\u0006\u0004\b-\u0010.J\u001D\u0010-\u001A\b\u0012\u0004\u0012\u00020\u00020,2\u0006\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0004\b-\u0010/J%\u00102\u001A\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00100\u001A\u00020!2\u0006\u00101\u001A\u00020!H\u0016\u00A2\u0006\u0004\b2\u00103J\r\u00104\u001A\u00020\b\u00A2\u0006\u0004\b4\u0010\u0004R$\u0010:\u001A\u00020!2\u0006\u00105\u001A\u00020!8\u0016@RX\u0096\u000E\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u00109R\"\u0010@\u001A\u00020\u00058\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b;\u0010<\u001A\u0004\b=\u0010\u0007\"\u0004\b>\u0010?\u00A8\u0006C"}, d2 = {"Landroidx/compose/ui/node/HitTestResult;", "", "Landroidx/compose/ui/Modifier$Node;", "<init>", "()V", "", "hasHit", "()Z", "", "acceptHits", "", "distanceFromEdge", "isInLayer", "isHitInMinimumTouchTargetBetter", "(FZ)Z", "node", "Lkotlin/Function0;", "childHitTest", "hit", "(Landroidx/compose/ui/Modifier$Node;ZLkotlin/jvm/functions/Function0;)V", "hitInMinimumTouchTarget", "(Landroidx/compose/ui/Modifier$Node;FZLkotlin/jvm/functions/Function0;)V", "speculativeHit", "block", "siblingHits", "(Lkotlin/jvm/functions/Function0;)V", "element", "contains", "(Landroidx/compose/ui/Modifier$Node;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Landroidx/compose/ui/Modifier$Node;", "indexOf", "(Landroidx/compose/ui/Modifier$Node;)I", "isEmpty", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "clear", "<set-?>", "d", "I", "getSize", "()I", "size", "e", "Z", "getShouldSharePointerInputWithSibling", "setShouldSharePointerInputWithSibling", "(Z)V", "shouldSharePointerInputWithSibling", "b2/g", "b2/h", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,347:1\n1855#2,2:348\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n200#1:348,2\n*E\n"})
public final class HitTestResult implements List, KMappedMarker {
    public static final int $stable = 8;
    public Object[] a;
    public long[] b;
    public int c;
    public int d;
    public boolean e;

    public HitTestResult() {
        this.a = new Object[16];
        this.b = new long[16];
        this.c = -1;
        this.e = true;
    }

    public final long a() {
        long v = 0x7F80000000000000L;
        int v1 = this.c + 1;
        int v2 = CollectionsKt__CollectionsKt.getLastIndex(this);
        if(v1 <= v2) {
            while(true) {
                long v3 = this.b[v1];
                if(a.m(v3, v) < 0) {
                    v = v3;
                }
                if(Float.intBitsToFloat(((int)(v >> 0x20))) < 0.0f && ((int)(0xFFFFFFFFL & v)) != 0) {
                    return v;
                }
                if(v1 == v2) {
                    break;
                }
                ++v1;
            }
        }
        return v;
    }

    public final void acceptHits() {
        this.c = this.size() - 1;
    }

    public void add(int v, Node modifier$Node0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void add(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Node modifier$Node0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        int v = this.c + 1;
        int v1 = CollectionsKt__CollectionsKt.getLastIndex(this);
        if(v <= v1) {
            while(true) {
                this.a[v] = null;
                if(v == v1) {
                    break;
                }
                ++v;
            }
        }
        this.d = this.c + 1;
    }

    @Override
    public final void clear() {
        this.c = -1;
        this.b();
        this.e = true;
    }

    public boolean contains(@NotNull Node modifier$Node0) {
        return this.indexOf(modifier$Node0) != -1;
    }

    @Override
    public final boolean contains(Object object0) {
        return object0 instanceof Node ? this.contains(((Node)object0)) : false;
    }

    @Override
    public boolean containsAll(@NotNull Collection collection0) {
        for(Object object0: collection0) {
            if(!this.contains(((Node)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @NotNull
    public Node get(int v) {
        Object object0 = this.a[v];
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Node)object0;
    }

    @Override
    public Object get(int v) {
        return this.get(v);
    }

    public final boolean getShouldSharePointerInputWithSibling() {
        return this.e;
    }

    public int getSize() {
        return this.d;
    }

    public final boolean hasHit() {
        long v = this.a();
        return Float.intBitsToFloat(((int)(v >> 0x20))) < 0.0f && ((int)(v & 0xFFFFFFFFL)) != 0;
    }

    public final void hit(@NotNull Node modifier$Node0, boolean z, @NotNull Function0 function00) {
        this.hitInMinimumTouchTarget(modifier$Node0, -1.0f, z, function00);
        NodeCoordinator nodeCoordinator0 = modifier$Node0.getCoordinator$ui_release();
        if(nodeCoordinator0 != null && !nodeCoordinator0.shouldSharePointerInputWithSiblings()) {
            this.e = false;
        }
    }

    public final void hitInMinimumTouchTarget(@NotNull Node modifier$Node0, float f, boolean z, @NotNull Function0 function00) {
        int v = this.c;
        this.c = v + 1;
        Object[] arr_object = this.a;
        if(v + 1 >= arr_object.length) {
            Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length + 16);
            Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(this, newSize)");
            this.a = arr_object1;
            long[] arr_v = Arrays.copyOf(this.b, arr_object.length + 16);
            Intrinsics.checkNotNullExpressionValue(arr_v, "copyOf(this, newSize)");
            this.b = arr_v;
        }
        int v1 = this.c;
        this.a[v1] = modifier$Node0;
        this.b[v1] = HitTestResultKt.access$DistanceAndInLayer(f, z);
        this.b();
        function00.invoke();
        this.c = v;
    }

    public int indexOf(@NotNull Node modifier$Node0) {
        int v = CollectionsKt__CollectionsKt.getLastIndex(this);
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                if(Intrinsics.areEqual(this.a[v1], modifier$Node0)) {
                    return v1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return -1;
    }

    @Override
    public final int indexOf(Object object0) {
        return object0 instanceof Node ? this.indexOf(((Node)object0)) : -1;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    public final boolean isHitInMinimumTouchTargetBetter(float f, boolean z) {
        return this.c == CollectionsKt__CollectionsKt.getLastIndex(this) ? true : a.m(this.a(), HitTestResultKt.access$DistanceAndInLayer(f, z)) > 0;
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return new g(this, 0, 7);
    }

    public int lastIndexOf(@NotNull Node modifier$Node0) {
        for(int v = CollectionsKt__CollectionsKt.getLastIndex(this); -1 < v; --v) {
            if(Intrinsics.areEqual(this.a[v], modifier$Node0)) {
                return v;
            }
        }
        return -1;
    }

    @Override
    public final int lastIndexOf(Object object0) {
        return object0 instanceof Node ? this.lastIndexOf(((Node)object0)) : -1;
    }

    @Override
    @NotNull
    public ListIterator listIterator() {
        return new g(this, 0, 7);
    }

    @Override
    @NotNull
    public ListIterator listIterator(int v) {
        return new g(this, v, 6);
    }

    public Node remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void replaceAll(UnaryOperator unaryOperator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Node set(int v, Node modifier$Node0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object set(int v, Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setShouldSharePointerInputWithSibling(boolean z) {
        this.e = z;
    }

    public final void siblingHits(@NotNull Function0 function00) {
        function00.invoke();
        this.c = this.c;
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    public void sort(Comparator comparator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void speculativeHit(@NotNull Node modifier$Node0, float f, boolean z, @NotNull Function0 function00) {
        if(this.c == CollectionsKt__CollectionsKt.getLastIndex(this)) {
            this.hitInMinimumTouchTarget(modifier$Node0, f, z, function00);
            if(this.c + 1 == CollectionsKt__CollectionsKt.getLastIndex(this)) {
                this.b();
            }
            return;
        }
        long v = this.a();
        int v1 = this.c;
        this.c = CollectionsKt__CollectionsKt.getLastIndex(this);
        this.hitInMinimumTouchTarget(modifier$Node0, f, z, function00);
        if(this.c + 1 < CollectionsKt__CollectionsKt.getLastIndex(this) && a.m(v, this.a()) > 0) {
            int v2 = this.c + 1;
            ArraysKt___ArraysJvmKt.copyInto(this.a, this.a, v1 + 1, v2, this.size());
            ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, v1 + 1, v2, this.size());
            this.c = this.size() + v1 - this.c - 1;
        }
        this.b();
        this.c = v1;
    }

    @Override
    @NotNull
    public List subList(int v, int v1) {
        return new h(this, v, v1);
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        return CollectionToArray.toArray(this, arr_object);
    }
}

