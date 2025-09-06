package kotlinx.collections.immutable.implementations.immutableList;

import java.util.Arrays;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.PersistentCollection.Builder;
import kotlinx.collections.immutable.PersistentCollection;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.collections.immutable.internal.ListImplementation;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000E\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000E\u0010\u0007\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ%\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0010\u001A\u00020\b2\u0006\u0010\r\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u000E\u0010\u0011J\u001D\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0010\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001A\u001A\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ\u001D\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00000\u001C2\u0006\u0010\u0010\u001A\u00020\bH\u0016¢\u0006\u0004\b\u001D\u0010\u001EJ\u0018\u0010\u001F\u001A\u00028\u00002\u0006\u0010\u0010\u001A\u00020\bH\u0096\u0002¢\u0006\u0004\b\u001F\u0010 J%\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0010\u001A\u00020\b2\u0006\u0010\r\u001A\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\u0011R\u001A\u0010\t\u001A\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "E", "Lkotlinx/collections/immutable/PersistentList;", "Lkotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "", "", "root", "tail", "", "size", "rootShift", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "element", "add", "(Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentList;", "index", "(ILjava/lang/Object;)Lkotlinx/collections/immutable/PersistentList;", "removeAt", "(I)Lkotlinx/collections/immutable/PersistentList;", "Lkotlin/Function1;", "", "predicate", "removeAll", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/collections/immutable/PersistentList;", "Lkotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "builder", "()Lkotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "c", "I", "getSize", "()I", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVector.kt\nkotlinx/collections/immutable/implementations/immutableList/PersistentVector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
public final class PersistentVector extends AbstractPersistentList implements PersistentList {
    public final Object[] a;
    public final Object[] b;
    public final int c;
    public final int d;

    public PersistentVector(@NotNull Object[] arr_object, @NotNull Object[] arr_object1, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_object, "root");
        Intrinsics.checkNotNullParameter(arr_object1, "tail");
        super();
        this.a = arr_object;
        this.b = arr_object1;
        this.c = v;
        this.d = v1;
        if(this.size() <= 0x20) {
            throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + this.size()).toString());
        }
    }

    public static Object[] a(Object[] arr_object, int v, int v1, Object object0, ObjectRef objectRef0) {
        Object[] arr_object1;
        int v2 = v1 >> v & 0x1F;
        if(v == 0) {
            if(v2 == 0) {
                arr_object1 = new Object[0x20];
            }
            else {
                arr_object1 = Arrays.copyOf(arr_object, 0x20);
                Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(...)");
            }
            ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object1, v2 + 1, v2, 0x1F);
            objectRef0.setValue(arr_object[0x1F]);
            arr_object1[v2] = object0;
            return arr_object1;
        }
        Object[] arr_object2 = Arrays.copyOf(arr_object, 0x20);
        Intrinsics.checkNotNullExpressionValue(arr_object2, "copyOf(...)");
        Object object1 = arr_object[v2];
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        arr_object2[v2] = PersistentVector.a(((Object[])object1), v - 5, v1, object0, objectRef0);
        while(true) {
            ++v2;
            if(v2 >= 0x20 || arr_object2[v2] == null) {
                break;
            }
            Object object2 = arr_object[v2];
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            arr_object2[v2] = PersistentVector.a(((Object[])object2), v - 5, 0, objectRef0.getValue(), objectRef0);
        }
        return arr_object2;
    }

    @Override  // kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection add(Object object0) {
        return this.add(object0);
    }

    @Override  // kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList add(int v, Object object0) {
        ListImplementation.checkPositionIndex$kotlinx_collections_immutable(v, this.size());
        if(v == this.size()) {
            return this.add(object0);
        }
        int v1 = this.h();
        Object[] arr_object = this.a;
        if(v >= v1) {
            return this.b(arr_object, v - v1, object0);
        }
        ObjectRef objectRef0 = new ObjectRef(null);
        return this.b(PersistentVector.a(arr_object, this.d, v, object0, objectRef0), 0, objectRef0.getValue());
    }

    @Override  // kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList add(Object object0) {
        int v = this.size() - this.h();
        Object[] arr_object = this.a;
        Object[] arr_object1 = this.b;
        if(v < 0x20) {
            Object[] arr_object2 = Arrays.copyOf(arr_object1, 0x20);
            Intrinsics.checkNotNullExpressionValue(arr_object2, "copyOf(...)");
            arr_object2[v] = object0;
            return new PersistentVector(arr_object, arr_object2, this.size() + 1, this.d);
        }
        return this.d(arr_object, arr_object1, UtilsKt.presizedBufferWith(object0));
    }

    public final PersistentVector b(Object[] arr_object, int v, Object object0) {
        int v1 = this.size() - this.h();
        Object[] arr_object1 = this.b;
        Object[] arr_object2 = Arrays.copyOf(arr_object1, 0x20);
        Intrinsics.checkNotNullExpressionValue(arr_object2, "copyOf(...)");
        if(v1 < 0x20) {
            ArraysKt___ArraysJvmKt.copyInto(arr_object1, arr_object2, v + 1, v, v1);
            arr_object2[v] = object0;
            return new PersistentVector(arr_object, arr_object2, this.size() + 1, this.d);
        }
        Object object1 = arr_object1[0x1F];
        ArraysKt___ArraysJvmKt.copyInto(arr_object1, arr_object2, v + 1, v, v1 - 1);
        arr_object2[v] = object0;
        return this.d(arr_object, arr_object2, UtilsKt.presizedBufferWith(object1));
    }

    @Override  // kotlinx.collections.immutable.PersistentCollection
    public Builder builder() {
        return this.builder();
    }

    @Override  // kotlinx.collections.immutable.PersistentList
    public kotlinx.collections.immutable.PersistentList.Builder builder() {
        return this.builder();
    }

    @NotNull
    public PersistentVectorBuilder builder() {
        return new PersistentVectorBuilder(this, this.a, this.b, this.d);
    }

    public static Object[] c(Object[] arr_object, int v, int v1, ObjectRef objectRef0) {
        Object[] arr_object1;
        int v2 = v1 >> v & 0x1F;
        if(v == 5) {
            objectRef0.setValue(arr_object[v2]);
            arr_object1 = null;
        }
        else {
            Object object0 = arr_object[v2];
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            arr_object1 = PersistentVector.c(((Object[])object0), v - 5, v1, objectRef0);
        }
        if(arr_object1 == null && v2 == 0) {
            return null;
        }
        Object[] arr_object2 = Arrays.copyOf(arr_object, 0x20);
        Intrinsics.checkNotNullExpressionValue(arr_object2, "copyOf(...)");
        arr_object2[v2] = arr_object1;
        return arr_object2;
    }

    public final PersistentVector d(Object[] arr_object, Object[] arr_object1, Object[] arr_object2) {
        return this.size() >> 5 <= 1 << this.d ? new PersistentVector(this.e(this.d, arr_object, arr_object1), arr_object2, this.size() + 1, this.d) : new PersistentVector(this.e(this.d + 5, UtilsKt.presizedBufferWith(arr_object), arr_object1), arr_object2, this.size() + 1, this.d + 5);
    }

    public final Object[] e(int v, Object[] arr_object, Object[] arr_object1) {
        Object[] arr_object2;
        int v1 = this.size() - 1 >> v & 0x1F;
        if(arr_object == null) {
            arr_object2 = new Object[0x20];
        }
        else {
            arr_object2 = Arrays.copyOf(arr_object, 0x20);
            Intrinsics.checkNotNullExpressionValue(arr_object2, "copyOf(...)");
            if(arr_object2 == null) {
                arr_object2 = new Object[0x20];
            }
        }
        if(v == 5) {
            arr_object2[v1] = arr_object1;
            return arr_object2;
        }
        arr_object2[v1] = this.e(v - 5, ((Object[])arr_object2[v1]), arr_object1);
        return arr_object2;
    }

    public final Object[] f(Object[] arr_object, int v, int v1, ObjectRef objectRef0) {
        Object[] arr_object1;
        int v2 = v1 >> v & 0x1F;
        int v3 = 0x1F;
        if(v == 0) {
            if(v2 == 0) {
                arr_object1 = new Object[0x20];
            }
            else {
                arr_object1 = Arrays.copyOf(arr_object, 0x20);
                Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(...)");
            }
            ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object1, v2, v2 + 1, 0x20);
            arr_object1[0x1F] = objectRef0.getValue();
            objectRef0.setValue(arr_object[v2]);
            return arr_object1;
        }
        if(arr_object[0x1F] == null) {
            v3 = this.h() - 1 >> v & 0x1F;
        }
        Object[] arr_object2 = Arrays.copyOf(arr_object, 0x20);
        Intrinsics.checkNotNullExpressionValue(arr_object2, "copyOf(...)");
        if(v2 + 1 <= v3) {
            while(true) {
                Object object0 = arr_object2[v3];
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                arr_object2[v3] = this.f(((Object[])object0), v - 5, 0, objectRef0);
                if(v3 == v2 + 1) {
                    break;
                }
                --v3;
            }
        }
        Object object1 = arr_object2[v2];
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        arr_object2[v2] = this.f(((Object[])object1), v - 5, v1, objectRef0);
        return arr_object2;
    }

    public final AbstractPersistentList g(Object[] arr_object, int v, int v1, int v2) {
        int v3 = this.size() - v;
        if(v3 == 1) {
            if(v1 == 0) {
                if(arr_object.length == 33) {
                    arr_object = Arrays.copyOf(arr_object, 0x20);
                    Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(...)");
                }
                return new SmallPersistentVector(arr_object);
            }
            ObjectRef objectRef0 = new ObjectRef(null);
            Object[] arr_object1 = PersistentVector.c(arr_object, v1, v - 1, objectRef0);
            Intrinsics.checkNotNull(arr_object1);
            Object object0 = objectRef0.getValue();
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            if(arr_object1[1] == null) {
                Object object1 = arr_object1[0];
                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                return new PersistentVector(((Object[])object1), ((Object[])object0), v, v1 - 5);
            }
            return new PersistentVector(arr_object1, ((Object[])object0), v, v1);
        }
        Object[] arr_object2 = this.b;
        Object[] arr_object3 = Arrays.copyOf(arr_object2, 0x20);
        Intrinsics.checkNotNullExpressionValue(arr_object3, "copyOf(...)");
        if(v2 < v3 - 1) {
            ArraysKt___ArraysJvmKt.copyInto(arr_object2, arr_object3, v2, v2 + 1, v3);
        }
        arr_object3[v3 - 1] = null;
        return new PersistentVector(arr_object, arr_object3, v + v3 - 1, v1);
    }

    @Override  // kotlin.collections.AbstractList
    public Object get(int v) {
        ListImplementation.checkElementIndex$kotlinx_collections_immutable(v, this.size());
        if(this.h() <= v) {
            return this.b[v & 0x1F];
        }
        Object[] arr_object = this.a;
        for(int v1 = this.d; v1 > 0; v1 -= 5) {
            Object object0 = arr_object[v >> v1 & 0x1F];
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            arr_object = (Object[])object0;
        }
        return arr_object[v & 0x1F];
    }

    @Override  // kotlin.collections.AbstractList
    public int getSize() {
        return this.c;
    }

    public final int h() {
        return this.size() - 1 & 0xFFFFFFE0;
    }

    public static Object[] i(Object[] arr_object, Object object0, int v, int v1) {
        int v2 = v1 >> v & 0x1F;
        Object[] arr_object1 = Arrays.copyOf(arr_object, 0x20);
        Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(...)");
        if(v == 0) {
            arr_object1[v2] = object0;
            return arr_object1;
        }
        Object object1 = arr_object1[v2];
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        arr_object1[v2] = PersistentVector.i(((Object[])object1), object0, v - 5, v1);
        return arr_object1;
    }

    @Override  // kotlin.collections.AbstractList
    @NotNull
    public ListIterator listIterator(int v) {
        ListImplementation.checkPositionIndex$kotlinx_collections_immutable(v, this.size());
        return new PersistentVectorIterator(this.a, this.b, v, this.size(), this.d / 5 + 1);
    }

    @Override  // kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection removeAll(Function1 function10) {
        return this.removeAll(function10);
    }

    @Override  // kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList removeAll(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        PersistentVectorBuilder persistentVectorBuilder0 = this.builder();
        persistentVectorBuilder0.removeAllWithPredicate(function10);
        return persistentVectorBuilder0.build();
    }

    @Override  // kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList removeAt(int v) {
        ListImplementation.checkElementIndex$kotlinx_collections_immutable(v, this.size());
        int v1 = this.h();
        return v < v1 ? this.g(this.f(this.a, this.d, v, new ObjectRef(this.b[0])), v1, this.d, 0) : this.g(this.a, v1, this.d, v - v1);
    }

    @Override  // kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList set(int v, Object object0) {
        ListImplementation.checkElementIndex$kotlinx_collections_immutable(v, this.size());
        Object[] arr_object = this.a;
        Object[] arr_object1 = this.b;
        int v1 = this.d;
        if(this.h() <= v) {
            Object[] arr_object2 = Arrays.copyOf(arr_object1, 0x20);
            Intrinsics.checkNotNullExpressionValue(arr_object2, "copyOf(...)");
            arr_object2[v & 0x1F] = object0;
            return new PersistentVector(arr_object, arr_object2, this.size(), v1);
        }
        return new PersistentVector(PersistentVector.i(arr_object, object0, v1, v), arr_object1, this.size(), v1);
    }
}

