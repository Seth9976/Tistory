package kotlinx.collections.immutable.implementations.immutableList;

import androidx.fragment.app.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlinx.collections.immutable.PersistentCollection;
import kotlinx.collections.immutable.PersistentList.Builder;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.collections.immutable.internal.ListImplementation;
import kotlinx.collections.immutable.internal.MutabilityOwnership;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0015\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B?\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\b\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u000E\u0010\t\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u0010\u001A\u00020\nH\u0000\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u001D\u0010\u0019\u001A\u00020\u00142\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001F\u0010\u0015\u001A\u00020\u001C2\u0006\u0010\u001B\u001A\u00020\n2\u0006\u0010\u0013\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u001DJ%\u0010\u0019\u001A\u00020\u00142\u0006\u0010\u001B\u001A\u00020\n2\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001EJ\u0018\u0010\u001F\u001A\u00028\u00002\u0006\u0010\u001B\u001A\u00020\nH\u0096\u0002\u00A2\u0006\u0004\b\u001F\u0010 J\u0017\u0010!\u001A\u00028\u00002\u0006\u0010\u001B\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b!\u0010 J\u001D\u0010\"\u001A\u00020\u00142\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016\u00A2\u0006\u0004\b\"\u0010\u001AJ!\u0010%\u001A\u00020\u00142\u0012\u0010$\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140#\u00A2\u0006\u0004\b%\u0010&J \u0010\'\u001A\u00028\u00002\u0006\u0010\u001B\u001A\u00020\n2\u0006\u0010\u0013\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b\'\u0010(J\u0016\u0010*\u001A\b\u0012\u0004\u0012\u00028\u00000)H\u0096\u0002\u00A2\u0006\u0004\b*\u0010+J\u0015\u0010-\u001A\b\u0012\u0004\u0012\u00028\u00000,H\u0016\u00A2\u0006\u0004\b-\u0010.J\u001D\u0010-\u001A\b\u0012\u0004\u0012\u00028\u00000,2\u0006\u0010\u001B\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b-\u0010/R\"\u0010\u000B\u001A\u00020\n8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u000F\"\u0004\b3\u00104R8\u0010:\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0010\u00105\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u00109R4\u0010=\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000E\u00105\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b;\u00107\u001A\u0004\b<\u00109R$\u0010@\u001A\u00020\n2\u0006\u00105\u001A\u00020\n8\u0016@RX\u0096\u000E\u00A2\u0006\f\n\u0004\b>\u00101\u001A\u0004\b?\u0010\u000F\u00A8\u0006A"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "E", "Lkotlin/collections/AbstractMutableList;", "Lkotlinx/collections/immutable/PersistentList$Builder;", "Lkotlinx/collections/immutable/PersistentList;", "vector", "", "", "vectorRoot", "vectorTail", "", "rootShift", "<init>", "(Lkotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "getModCount$kotlinx_collections_immutable", "()I", "getModCount", "build", "()Lkotlinx/collections/immutable/PersistentList;", "element", "", "add", "(Ljava/lang/Object;)Z", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "index", "", "(ILjava/lang/Object;)V", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "removeAt", "removeAll", "Lkotlin/Function1;", "predicate", "removeAllWithPredicate", "(Lkotlin/jvm/functions/Function1;)Z", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "d", "I", "getRootShift$kotlinx_collections_immutable", "setRootShift$kotlinx_collections_immutable", "(I)V", "<set-?>", "f", "[Ljava/lang/Object;", "getRoot$kotlinx_collections_immutable", "()[Ljava/lang/Object;", "root", "g", "getTail$kotlinx_collections_immutable", "tail", "h", "getSize", "size", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPersistentVectorBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVectorBuilder.kt\nkotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,992:1\n26#2:993\n*S KotlinDebug\n*F\n+ 1 PersistentVectorBuilder.kt\nkotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n*L\n623#1:993\n*E\n"})
public final class PersistentVectorBuilder extends AbstractMutableList implements Builder {
    public PersistentList a;
    public Object[] b;
    public Object[] c;
    public int d;
    public MutabilityOwnership e;
    public Object[] f;
    public Object[] g;
    public int h;

    public PersistentVectorBuilder(@NotNull PersistentList persistentList0, @Nullable Object[] arr_object, @NotNull Object[] arr_object1, int v) {
        Intrinsics.checkNotNullParameter(persistentList0, "vector");
        Intrinsics.checkNotNullParameter(arr_object1, "vectorTail");
        super();
        this.a = persistentList0;
        this.b = arr_object;
        this.c = arr_object1;
        this.d = v;
        this.e = new MutabilityOwnership();
        this.f = this.b;
        this.g = this.c;
        this.h = this.a.size();
    }

    public static void a(Object[] arr_object, int v, Iterator iterator0) {
        while(v < 0x20 && iterator0.hasNext()) {
            Object object0 = iterator0.next();
            arr_object[v] = object0;
            ++v;
        }
    }

    @Override  // kotlin.collections.AbstractMutableList
    public void add(int v, Object object0) {
        ListImplementation.checkPositionIndex$kotlinx_collections_immutable(v, this.size());
        if(v == this.size()) {
            this.add(object0);
            return;
        }
        ++this.modCount;
        int v1 = this.w();
        if(v >= v1) {
            this.d(this.f, v - v1, object0);
            return;
        }
        ObjectRef objectRef0 = new ObjectRef(null);
        Object[] arr_object = this.f;
        Intrinsics.checkNotNull(arr_object);
        this.d(this.c(arr_object, this.d, v, object0, objectRef0), 0, objectRef0.getValue());
    }

    @Override
    public boolean add(Object object0) {
        ++this.modCount;
        int v = this.z();
        if(v < 0x20) {
            Object[] arr_object = this.g(this.g);
            arr_object[v] = object0;
            this.g = arr_object;
            this.h = this.size() + 1;
            return true;
        }
        Object[] arr_object1 = this.j(object0);
        this.p(this.f, this.g, arr_object1);
        return true;
    }

    @Override
    public boolean addAll(int v, @NotNull Collection collection0) {
        Object[] arr_object1;
        Intrinsics.checkNotNullParameter(collection0, "elements");
        ListImplementation.checkPositionIndex$kotlinx_collections_immutable(v, this.size());
        if(v == this.size()) {
            return this.addAll(collection0);
        }
        if(collection0.isEmpty()) {
            return false;
        }
        ++this.modCount;
        int v1 = v >> 5 << 5;
        int v2 = (collection0.size() + (this.size() - v1) - 1) / 0x20;
        if(v2 == 0) {
            Object[] arr_object = ArraysKt___ArraysJvmKt.copyInto(this.g, this.g(this.g), (collection0.size() + v - 1 & 0x1F) + 1, v & 0x1F, this.z());
            PersistentVectorBuilder.a(arr_object, v & 0x1F, collection0.iterator());
            this.g = arr_object;
            this.h = collection0.size() + this.size();
            return true;
        }
        Object[][] arr2_object = new Object[v2][];
        int v3 = this.z();
        int v4 = collection0.size() + this.size();
        v4 = v4 <= 0x20 ? collection0.size() + this.size() : v4 - (v4 - 1 & 0xFFFFFFE0);
        if(v >= this.w()) {
            arr_object1 = this.i();
            this.y(collection0, v, this.g, v3, arr2_object, v2, arr_object1);
        }
        else if(v4 > v3) {
            int v5 = v4 - v3;
            arr_object1 = this.h(this.g, v5);
            this.b(collection0, v, v5, arr2_object, v2, arr_object1);
        }
        else {
            int v6 = v3 - v4;
            arr_object1 = ArraysKt___ArraysJvmKt.copyInto(this.g, this.i(), 0, v6, v3);
            Object[] arr_object2 = this.h(this.g, 0x20 - v6);
            arr2_object[v2 - 1] = arr_object2;
            this.b(collection0, v, 0x20 - v6, arr2_object, v2 - 1, arr_object2);
        }
        this.f = this.o(this.f, v1, arr2_object);
        this.g = arr_object1;
        this.h = collection0.size() + this.size();
        return true;
    }

    @Override
    public boolean addAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        if(collection0.isEmpty()) {
            return false;
        }
        ++this.modCount;
        int v = this.z();
        Iterator iterator0 = collection0.iterator();
        if(0x20 - v >= collection0.size()) {
            Object[] arr_object = this.g(this.g);
            PersistentVectorBuilder.a(arr_object, v, iterator0);
            this.g = arr_object;
            this.h = collection0.size() + this.size();
            return true;
        }
        int v1 = (collection0.size() + v - 1) / 0x20;
        Object[][] arr2_object = new Object[v1][];
        Object[] arr_object1 = this.g(this.g);
        PersistentVectorBuilder.a(arr_object1, v, iterator0);
        arr2_object[0] = arr_object1;
        for(int v2 = 1; v2 < v1; ++v2) {
            Object[] arr_object2 = this.i();
            PersistentVectorBuilder.a(arr_object2, 0, iterator0);
            arr2_object[v2] = arr_object2;
        }
        this.f = this.o(this.f, this.w(), arr2_object);
        Object[] arr_object3 = this.i();
        PersistentVectorBuilder.a(arr_object3, 0, iterator0);
        this.g = arr_object3;
        this.h = collection0.size() + this.size();
        return true;
    }

    public final void b(Collection collection0, int v, int v1, Object[][] arr2_object, int v2, Object[] arr_object) {
        if(this.f == null) {
            throw new IllegalStateException("Required value was null.");
        }
        AbstractListIterator abstractListIterator0 = this.f(this.w() >> 5);
        int v3 = v2;
        Object[] arr_object1 = arr_object;
        while(abstractListIterator0.previousIndex() != v >> 5) {
            Object[] arr_object2 = (Object[])abstractListIterator0.previous();
            ArraysKt___ArraysJvmKt.copyInto(arr_object2, arr_object1, 0, 0x20 - v1, 0x20);
            arr_object1 = this.h(arr_object2, v1);
            --v3;
            arr2_object[v3] = arr_object1;
        }
        Object object0 = abstractListIterator0.previous();
        int v4 = v2 - ((this.w() >> 5) - 1 - (v >> 5));
        if(v4 < v2) {
            arr_object = arr2_object[v4];
            Intrinsics.checkNotNull(arr_object);
        }
        this.y(collection0, v, ((Object[])object0), 0x20, arr2_object, v4, arr_object);
    }

    @Override  // kotlinx.collections.immutable.PersistentCollection$Builder
    public PersistentCollection build() {
        return this.build();
    }

    @Override  // kotlinx.collections.immutable.PersistentList$Builder
    @NotNull
    public PersistentList build() {
        PersistentList persistentList0;
        if(this.f != this.b || this.g != this.c) {
            this.e = new MutabilityOwnership();
            this.b = this.f;
            Object[] arr_object = this.g;
            this.c = arr_object;
            if(this.f != null) {
                Object[] arr_object2 = this.f;
                Intrinsics.checkNotNull(arr_object2);
                persistentList0 = new PersistentVector(arr_object2, this.g, this.size(), this.d);
            }
            else if(arr_object.length == 0) {
                persistentList0 = UtilsKt.persistentVectorOf();
            }
            else {
                Object[] arr_object1 = Arrays.copyOf(this.g, this.size());
                Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(...)");
                persistentList0 = new SmallPersistentVector(arr_object1);
            }
        }
        else {
            persistentList0 = this.a;
        }
        this.a = persistentList0;
        return persistentList0;
    }

    public final Object[] c(Object[] arr_object, int v, int v1, Object object0, ObjectRef objectRef0) {
        int v2 = v1 >> v & 0x1F;
        if(v == 0) {
            objectRef0.setValue(arr_object[0x1F]);
            Object[] arr_object1 = ArraysKt___ArraysJvmKt.copyInto(arr_object, this.g(arr_object), v2 + 1, v2, 0x1F);
            arr_object1[v2] = object0;
            return arr_object1;
        }
        Object[] arr_object2 = this.g(arr_object);
        Object object1 = arr_object2[v2];
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        arr_object2[v2] = this.c(((Object[])object1), v - 5, v1, object0, objectRef0);
        while(true) {
            ++v2;
            if(v2 >= 0x20) {
                break;
            }
            Object object2 = arr_object2[v2];
            if(object2 == null) {
                break;
            }
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            arr_object2[v2] = this.c(((Object[])object2), v - 5, 0, objectRef0.getValue(), objectRef0);
        }
        return arr_object2;
    }

    public final void d(Object[] arr_object, int v, Object object0) {
        int v1 = this.z();
        Object[] arr_object1 = this.g(this.g);
        if(v1 < 0x20) {
            ArraysKt___ArraysJvmKt.copyInto(this.g, arr_object1, v + 1, v, v1);
            arr_object1[v] = object0;
            this.f = arr_object;
            this.g = arr_object1;
            this.h = this.size() + 1;
            return;
        }
        Object[] arr_object2 = this.g;
        Object object1 = arr_object2[0x1F];
        ArraysKt___ArraysJvmKt.copyInto(arr_object2, arr_object1, v + 1, v, 0x1F);
        arr_object1[v] = object0;
        this.p(arr_object, arr_object1, this.j(object1));
    }

    public final boolean e(Object[] arr_object) {
        return arr_object.length == 33 && arr_object[0x20] == this.e;
    }

    public final AbstractListIterator f(int v) {
        if(this.f == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int v1 = this.w();
        ListImplementation.checkPositionIndex$kotlinx_collections_immutable(v, v1 >> 5);
        int v2 = this.d;
        if(v2 == 0) {
            Object[] arr_object = this.f;
            Intrinsics.checkNotNull(arr_object);
            return new SingleElementListIterator(arr_object, v);
        }
        Object[] arr_object1 = this.f;
        Intrinsics.checkNotNull(arr_object1);
        return new TrieIterator(arr_object1, v, v1 >> 5, v2 / 5);
    }

    public final Object[] g(Object[] arr_object) {
        if(arr_object == null) {
            return this.i();
        }
        return this.e(arr_object) ? arr_object : ArraysKt___ArraysJvmKt.copyInto$default(arr_object, this.i(), 0, 0, c.coerceAtMost(arr_object.length, 0x20), 6, null);
    }

    @Override
    public Object get(int v) {
        ListImplementation.checkElementIndex$kotlinx_collections_immutable(v, this.size());
        if(this.w() <= v) {
            return this.g[v & 0x1F];
        }
        Object[] arr_object = this.f;
        Intrinsics.checkNotNull(arr_object);
        for(int v1 = this.d; v1 > 0; v1 -= 5) {
            Object object0 = arr_object[v >> v1 & 0x1F];
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            arr_object = (Object[])object0;
        }
        return arr_object[v & 0x1F];
    }

    public final int getModCount$kotlinx_collections_immutable() {
        return this.modCount;
    }

    @Nullable
    public final Object[] getRoot$kotlinx_collections_immutable() {
        return this.f;
    }

    public final int getRootShift$kotlinx_collections_immutable() {
        return this.d;
    }

    @Override  // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.h;
    }

    @NotNull
    public final Object[] getTail$kotlinx_collections_immutable() {
        return this.g;
    }

    // 去混淆评级： 低(20)
    public final Object[] h(Object[] arr_object, int v) {
        return this.e(arr_object) ? ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object, v, 0, 0x20 - v) : ArraysKt___ArraysJvmKt.copyInto(arr_object, this.i(), v, 0, 0x20 - v);
    }

    public final Object[] i() {
        Object[] arr_object = new Object[33];
        arr_object[0x20] = this.e;
        return arr_object;
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return this.listIterator();
    }

    public final Object[] j(Object object0) {
        Object[] arr_object = new Object[33];
        arr_object[0] = object0;
        arr_object[0x20] = this.e;
        return arr_object;
    }

    public final Object[] k(int v, int v1, Object[] arr_object) {
        if(v1 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if(v1 == 0) {
            return arr_object;
        }
        int v2 = v >> v1 & 0x1F;
        Object object0 = arr_object[v2];
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] arr_object1 = this.k(v, v1 - 5, ((Object[])object0));
        if(v2 < 0x1F && arr_object[v2 + 1] != null) {
            if(this.e(arr_object)) {
                ArraysKt___ArraysJvmKt.fill(arr_object, null, v2 + 1, 0x20);
            }
            arr_object = ArraysKt___ArraysJvmKt.copyInto(arr_object, this.i(), 0, 0, v2 + 1);
        }
        if(arr_object1 != arr_object[v2]) {
            arr_object = this.g(arr_object);
            arr_object[v2] = arr_object1;
        }
        return arr_object;
    }

    public final Object[] l(Object[] arr_object, int v, int v1, ObjectRef objectRef0) {
        Object[] arr_object1;
        int v2 = v1 - 1 >> v & 0x1F;
        if(v == 5) {
            objectRef0.setValue(arr_object[v2]);
            arr_object1 = null;
        }
        else {
            Object object0 = arr_object[v2];
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            arr_object1 = this.l(((Object[])object0), v - 5, v1, objectRef0);
        }
        if(arr_object1 == null && v2 == 0) {
            return null;
        }
        Object[] arr_object2 = this.g(arr_object);
        arr_object2[v2] = arr_object1;
        return arr_object2;
    }

    @Override
    @NotNull
    public ListIterator listIterator() {
        return this.listIterator(0);
    }

    @Override
    @NotNull
    public ListIterator listIterator(int v) {
        ListImplementation.checkPositionIndex$kotlinx_collections_immutable(v, this.size());
        return new PersistentVectorMutableIterator(this, v);
    }

    public final void m(int v, int v1, Object[] arr_object) {
        if(v1 == 0) {
            this.f = null;
            if(arr_object == null) {
                arr_object = new Object[0];
            }
            this.g = arr_object;
            this.h = v;
            this.d = 0;
            return;
        }
        ObjectRef objectRef0 = new ObjectRef(null);
        Intrinsics.checkNotNull(arr_object);
        Object[] arr_object1 = this.l(arr_object, v1, v, objectRef0);
        Intrinsics.checkNotNull(arr_object1);
        Object object0 = objectRef0.getValue();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.g = (Object[])object0;
        this.h = v;
        if(arr_object1[1] == null) {
            this.f = (Object[])arr_object1[0];
            this.d = v1 - 5;
            return;
        }
        this.f = arr_object1;
        this.d = v1;
    }

    public final Object[] n(Object[] arr_object, int v, int v1, Iterator iterator0) {
        if(!iterator0.hasNext() || v1 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if(v1 == 0) {
            return iterator0.next();
        }
        Object[] arr_object1 = this.g(arr_object);
        int v2 = v >> v1 & 0x1F;
        arr_object1[v2] = this.n(((Object[])arr_object1[v2]), v, v1 - 5, iterator0);
        while(true) {
            ++v2;
            if(v2 >= 0x20 || !iterator0.hasNext()) {
                break;
            }
            arr_object1[v2] = this.n(((Object[])arr_object1[v2]), 0, v1 - 5, iterator0);
        }
        return arr_object1;
    }

    public final Object[] o(Object[] arr_object, int v, Object[][] arr2_object) {
        Iterator iterator0 = ArrayIteratorKt.iterator(arr2_object);
        int v1 = this.d;
        Object[] arr_object1 = v >> 5 >= 1 << v1 ? this.g(arr_object) : this.n(arr_object, v, v1, iterator0);
        while(iterator0.hasNext()) {
            this.d += 5;
            arr_object1 = this.j(arr_object1);
            this.n(arr_object1, 1 << this.d, this.d, iterator0);
        }
        return arr_object1;
    }

    public final void p(Object[] arr_object, Object[] arr_object1, Object[] arr_object2) {
        int v = this.d;
        if(this.size() >> 5 > 1 << v) {
            Object[] arr_object3 = this.j(arr_object);
            this.f = this.q(this.d + 5, arr_object3, arr_object1);
            this.g = arr_object2;
            this.d += 5;
            this.h = this.size() + 1;
            return;
        }
        if(arr_object == null) {
            this.f = arr_object1;
            this.g = arr_object2;
            this.h = this.size() + 1;
            return;
        }
        this.f = this.q(v, arr_object, arr_object1);
        this.g = arr_object2;
        this.h = this.size() + 1;
    }

    public final Object[] q(int v, Object[] arr_object, Object[] arr_object1) {
        int v1 = this.size() - 1 >> v & 0x1F;
        Object[] arr_object2 = this.g(arr_object);
        if(v == 5) {
            arr_object2[v1] = arr_object1;
            return arr_object2;
        }
        arr_object2[v1] = this.q(v - 5, ((Object[])arr_object2[v1]), arr_object1);
        return arr_object2;
    }

    public final int r(Function1 function10, Object[] arr_object, int v, int v1, ObjectRef objectRef0, ArrayList arrayList0, ArrayList arrayList1) {
        if(this.e(arr_object)) {
            arrayList0.add(arr_object);
        }
        Object object0 = objectRef0.getValue();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] arr_object1 = (Object[])object0;
        for(int v2 = 0; v2 < v; ++v2) {
            Object object1 = arr_object[v2];
            if(!((Boolean)function10.invoke(object1)).booleanValue()) {
                if(v1 == 0x20) {
                    arr_object1 = arrayList0.isEmpty() ? this.i() : ((Object[])arrayList0.remove(arrayList0.size() - 1));
                    v1 = 0;
                }
                arr_object1[v1] = object1;
                ++v1;
            }
        }
        objectRef0.setValue(arr_object1);
        if(((Object[])object0) != objectRef0.getValue()) {
            arrayList1.add(((Object[])object0));
        }
        return v1;
    }

    @Override
    public boolean removeAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return this.removeAllWithPredicate(new l(collection0, 8));
    }

    public final boolean removeAllWithPredicate(@NotNull Function1 function10) {
        int v7;
        Object[] arr_object1;
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = this.z();
        Object[] arr_object = null;
        ObjectRef objectRef0 = new ObjectRef(null);
        boolean z = false;
        if(this.f != null) {
            AbstractListIterator abstractListIterator0 = this.f(0);
            int v1;
            for(v1 = 0x20; v1 == 0x20 && abstractListIterator0.hasNext(); v1 = this.s(function10, ((Object[])abstractListIterator0.next()), 0x20, objectRef0)) {
            }
            if(v1 == 0x20) {
                abstractListIterator0.hasNext();
                int v2 = this.t(function10, v, objectRef0);
                if(v2 == 0) {
                    this.m(this.size(), this.d, this.f);
                }
                if(v2 == v) {
                    goto label_54;
                }
            }
            else {
                int v3 = abstractListIterator0.previousIndex() << 5;
                ArrayList arrayList0 = new ArrayList();
                ArrayList arrayList1 = new ArrayList();
                int v4;
                for(v4 = v1; abstractListIterator0.hasNext(); v4 = this.r(function10, ((Object[])abstractListIterator0.next()), 0x20, v4, objectRef0, arrayList1, arrayList0)) {
                }
                int v5 = this.r(function10, this.g, v, v4, objectRef0, arrayList1, arrayList0);
                Object object0 = objectRef0.getValue();
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                ArraysKt___ArraysJvmKt.fill(((Object[])object0), null, v5, 0x20);
                if(arrayList0.isEmpty()) {
                    arr_object1 = this.f;
                    Intrinsics.checkNotNull(arr_object1);
                }
                else {
                    arr_object1 = this.n(this.f, v3, this.d, arrayList0.iterator());
                }
                int v6 = v3 + (arrayList0.size() << 5);
                if((v6 & 0x1F) != 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if(v6 == 0) {
                    this.d = 0;
                }
                else {
                    while(true) {
                        v7 = this.d;
                        if(v6 - 1 >> v7 != 0) {
                            break;
                        }
                        this.d = v7 - 5;
                        Object object1 = arr_object1[0];
                        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        arr_object1 = (Object[])object1;
                    }
                    arr_object = this.k(v6 - 1, v7, arr_object1);
                }
                this.f = arr_object;
                this.g = (Object[])object0;
                this.h = v6 + v5;
            }
        }
        else if(this.t(function10, v, objectRef0) == v) {
            goto label_54;
        }
        z = true;
    label_54:
        if(z) {
            ++this.modCount;
        }
        return z;
    }

    @Override  // kotlin.collections.AbstractMutableList
    public Object removeAt(int v) {
        ListImplementation.checkElementIndex$kotlinx_collections_immutable(v, this.size());
        ++this.modCount;
        int v1 = this.w();
        if(v >= v1) {
            return this.v(this.f, v1, this.d, v - v1);
        }
        ObjectRef objectRef0 = new ObjectRef(this.g[0]);
        Object[] arr_object = this.f;
        Intrinsics.checkNotNull(arr_object);
        this.v(this.u(arr_object, this.d, v, objectRef0), v1, this.d, 0);
        return objectRef0.getValue();
    }

    public final int s(Function1 function10, Object[] arr_object, int v, ObjectRef objectRef0) {
        Object[] arr_object1 = arr_object;
        int v2 = v;
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                if(z) {
                    arr_object1[v2] = object0;
                    ++v2;
                }
            }
            else if(!z) {
                arr_object1 = this.g(arr_object);
                z = true;
                v2 = v1;
            }
        }
        objectRef0.setValue(arr_object1);
        return v2;
    }

    @Override  // kotlin.collections.AbstractMutableList
    public Object set(int v, Object object0) {
        ListImplementation.checkElementIndex$kotlinx_collections_immutable(v, this.size());
        if(this.w() <= v) {
            Object[] arr_object = this.g(this.g);
            if(arr_object != this.g) {
                ++this.modCount;
            }
            Object object1 = arr_object[v & 0x1F];
            arr_object[v & 0x1F] = object0;
            this.g = arr_object;
            return object1;
        }
        ObjectRef objectRef0 = new ObjectRef(null);
        Object[] arr_object1 = this.f;
        Intrinsics.checkNotNull(arr_object1);
        this.f = this.x(arr_object1, this.d, v, object0, objectRef0);
        return objectRef0.getValue();
    }

    public final void setRootShift$kotlinx_collections_immutable(int v) {
        this.d = v;
    }

    public final int t(Function1 function10, int v, ObjectRef objectRef0) {
        int v1 = this.s(function10, this.g, v, objectRef0);
        if(v1 == v) {
            boolean z = objectRef0.getValue() != this.g;
            return v;
        }
        Object object0 = objectRef0.getValue();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        ArraysKt___ArraysJvmKt.fill(((Object[])object0), null, v1, v);
        this.g = (Object[])object0;
        this.h = this.size() - (v - v1);
        return v1;
    }

    public final Object[] u(Object[] arr_object, int v, int v1, ObjectRef objectRef0) {
        int v2 = v1 >> v & 0x1F;
        int v3 = 0x1F;
        if(v == 0) {
            Object object0 = arr_object[v2];
            Object[] arr_object1 = ArraysKt___ArraysJvmKt.copyInto(arr_object, this.g(arr_object), v2, v2 + 1, 0x20);
            arr_object1[0x1F] = objectRef0.getValue();
            objectRef0.setValue(object0);
            return arr_object1;
        }
        if(arr_object[0x1F] == null) {
            v3 = this.w() - 1 >> v & 0x1F;
        }
        Object[] arr_object2 = this.g(arr_object);
        if(v2 + 1 <= v3) {
            while(true) {
                Object object1 = arr_object2[v3];
                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                arr_object2[v3] = this.u(((Object[])object1), v - 5, 0, objectRef0);
                if(v3 == v2 + 1) {
                    break;
                }
                --v3;
            }
        }
        Object object2 = arr_object2[v2];
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        arr_object2[v2] = this.u(((Object[])object2), v - 5, v1, objectRef0);
        return arr_object2;
    }

    public final Object v(Object[] arr_object, int v, int v1, int v2) {
        int v3 = this.size() - v;
        if(v3 == 1) {
            Object object0 = this.g[0];
            this.m(v, v1, arr_object);
            return object0;
        }
        Object[] arr_object1 = this.g;
        Object object1 = arr_object1[v2];
        Object[] arr_object2 = ArraysKt___ArraysJvmKt.copyInto(arr_object1, this.g(arr_object1), v2, v2 + 1, v3);
        arr_object2[v3 - 1] = null;
        this.f = arr_object;
        this.g = arr_object2;
        this.h = v + v3 - 1;
        this.d = v1;
        return object1;
    }

    public final int w() {
        return this.size() > 0x20 ? this.size() - 1 & 0xFFFFFFE0 : 0;
    }

    public final Object[] x(Object[] arr_object, int v, int v1, Object object0, ObjectRef objectRef0) {
        int v2 = v1 >> v & 0x1F;
        Object[] arr_object1 = this.g(arr_object);
        if(v == 0) {
            if(arr_object1 != arr_object) {
                ++this.modCount;
            }
            objectRef0.setValue(arr_object1[v2]);
            arr_object1[v2] = object0;
            return arr_object1;
        }
        Object object1 = arr_object1[v2];
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        arr_object1[v2] = this.x(((Object[])object1), v - 5, v1, object0, objectRef0);
        return arr_object1;
    }

    public final void y(Collection collection0, int v, Object[] arr_object, int v1, Object[][] arr2_object, int v2, Object[] arr_object1) {
        Object[] arr_object3;
        if(v2 < 1) {
            throw new IllegalStateException("Check failed.");
        }
        Object[] arr_object2 = this.g(arr_object);
        arr2_object[0] = arr_object2;
        int v4 = collection0.size() + v - 1 & 0x1F;
        int v5 = v1 - (v & 0x1F) + v4;
        if(v5 < 0x20) {
            ArraysKt___ArraysJvmKt.copyInto(arr_object2, arr_object1, v4 + 1, v & 0x1F, v1);
        }
        else {
            if(v2 == 1) {
                arr_object3 = arr_object2;
            }
            else {
                arr_object3 = this.i();
                --v2;
                arr2_object[v2] = arr_object3;
            }
            int v6 = v1 - (v5 - 0x1F);
            ArraysKt___ArraysJvmKt.copyInto(arr_object2, arr_object1, 0, v6, v1);
            ArraysKt___ArraysJvmKt.copyInto(arr_object2, arr_object3, v4 + 1, v & 0x1F, v6);
            arr_object1 = arr_object3;
        }
        Iterator iterator0 = collection0.iterator();
        PersistentVectorBuilder.a(arr_object2, v & 0x1F, iterator0);
        for(int v3 = 1; v3 < v2; ++v3) {
            Object[] arr_object4 = this.i();
            PersistentVectorBuilder.a(arr_object4, 0, iterator0);
            arr2_object[v3] = arr_object4;
        }
        PersistentVectorBuilder.a(arr_object1, 0, iterator0);
    }

    public final int z() {
        int v = this.size();
        return v <= 0x20 ? v : v - (v - 1 & 0xFFFFFFE0);
    }
}

