package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\n\b\u0000\u0018\u0000 ,*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001,B\u0017\u0012\u000E\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u00A2\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u000B\u0010\fJ#\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\rH\u0016\u00A2\u0006\u0004\b\u000F\u0010\u0010J)\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0011H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0017\u001A\u00020\u00162\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\rH\u0016\u00A2\u0006\u0004\b\u000F\u0010\u0019J%\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\t\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u000B\u0010\u001AJ\u001D\u0010\u001B\u001A\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0017\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0015\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u001DH\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0017\u0010 \u001A\u00020\u00162\u0006\u0010\t\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b \u0010!J\u0017\u0010\"\u001A\u00020\u00162\u0006\u0010\t\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\"\u0010!J\u001D\u0010$\u001A\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u0017\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b$\u0010%J\u0018\u0010&\u001A\u00028\u00002\u0006\u0010\u0017\u001A\u00020\u0016H\u0096\u0002\u00A2\u0006\u0004\b&\u0010\'J%\u0010(\u001A\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\t\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b(\u0010\u001AR\u0014\u0010+\u001A\u00020\u00168VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b)\u0010*\u00A8\u0006-"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "", "", "buffer", "<init>", "([Ljava/lang/Object;)V", "element", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "add", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "", "elements", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Lkotlin/Function1;", "", "predicate", "removeAll", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "", "index", "c", "(ILjava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "removeAt", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "builder", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "getSize", "()I", "size", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSmallPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,161:1\n41#2:162\n41#2:163\n26#3:164\n*S KotlinDebug\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n*L\n48#1:162\n91#1:163\n159#1:164\n*E\n"})
public final class SmallPersistentVector extends AbstractPersistentList implements ImmutableList {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector$Companion;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "getEMPTY", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final SmallPersistentVector getEMPTY() {
            return SmallPersistentVector.b;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final Object[] a;
    public static final SmallPersistentVector b;

    static {
        SmallPersistentVector.Companion = new Companion(null);
        SmallPersistentVector.$stable = 8;
        SmallPersistentVector.b = new SmallPersistentVector(new Object[0]);
    }

    public SmallPersistentVector(@NotNull Object[] arr_object) {
        this.a = arr_object;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection add(Object object0) {
        return this.add(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList add(int v, Object object0) {
        ListImplementation.checkPositionIndex$runtime_release(v, this.size());
        if(v == this.size()) {
            return this.add(object0);
        }
        Object[] arr_object = this.a;
        if(this.size() < 0x20) {
            Object[] arr_object1 = new Object[this.size() + 1];
            ArraysKt___ArraysJvmKt.copyInto$default(this.a, arr_object1, 0, 0, v, 6, null);
            ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object1, v + 1, v, this.size());
            arr_object1[v] = object0;
            return new SmallPersistentVector(arr_object1);
        }
        Object[] arr_object2 = Arrays.copyOf(arr_object, arr_object.length);
        Intrinsics.checkNotNullExpressionValue(arr_object2, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object2, v + 1, v, this.size() - 1);
        arr_object2[v] = object0;
        return new PersistentVector(arr_object2, UtilsKt.presizedBufferWith(arr_object[0x1F]), this.size() + 1, 0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList add(Object object0) {
        Object[] arr_object = this.a;
        if(this.size() < 0x20) {
            Object[] arr_object1 = Arrays.copyOf(arr_object, this.size() + 1);
            Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(this, newSize)");
            arr_object1[this.size()] = object0;
            return new SmallPersistentVector(arr_object1);
        }
        return new PersistentVector(arr_object, UtilsKt.presizedBufferWith(object0), this.size() + 1, 0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList
    public PersistentCollection addAll(Collection collection0) {
        return this.addAll(collection0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList
    @NotNull
    public PersistentList addAll(int v, @NotNull Collection collection0) {
        ListImplementation.checkPositionIndex$runtime_release(v, this.size());
        if(collection0.size() + this.size() <= 0x20) {
            Object[] arr_object = new Object[collection0.size() + this.size()];
            ArraysKt___ArraysJvmKt.copyInto$default(this.a, arr_object, 0, 0, v, 6, null);
            ArraysKt___ArraysJvmKt.copyInto(this.a, arr_object, collection0.size() + v, v, this.size());
            for(Object object0: collection0) {
                arr_object[v] = object0;
                ++v;
            }
            return new SmallPersistentVector(arr_object);
        }
        Builder persistentList$Builder0 = this.builder();
        persistentList$Builder0.addAll(v, collection0);
        return persistentList$Builder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList
    @NotNull
    public PersistentList addAll(@NotNull Collection collection0) {
        if(collection0.size() + this.size() <= 0x20) {
            Object[] arr_object = Arrays.copyOf(this.a, collection0.size() + this.size());
            Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(this, newSize)");
            int v = this.size();
            for(Object object0: collection0) {
                arr_object[v] = object0;
                ++v;
            }
            return new SmallPersistentVector(arr_object);
        }
        Builder persistentList$Builder0 = this.builder();
        persistentList$Builder0.addAll(collection0);
        return persistentList$Builder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder builder() {
        return this.builder();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @NotNull
    public Builder builder() {
        return new PersistentVectorBuilder(this, null, this.a, 0);
    }

    @Override  // kotlin.collections.AbstractList
    public Object get(int v) {
        ListImplementation.checkElementIndex$runtime_release(v, this.size());
        return this.a[v];
    }

    @Override  // kotlin.collections.AbstractList
    public int getSize() {
        return this.a.length;
    }

    @Override  // kotlin.collections.AbstractList
    public int indexOf(Object object0) {
        return ArraysKt___ArraysKt.indexOf(this.a, object0);
    }

    @Override  // kotlin.collections.AbstractList
    public int lastIndexOf(Object object0) {
        return ArraysKt___ArraysKt.lastIndexOf(this.a, object0);
    }

    @Override  // kotlin.collections.AbstractList
    @NotNull
    public ListIterator listIterator(int v) {
        ListImplementation.checkPositionIndex$runtime_release(v, this.size());
        return new BufferIterator(this.a, v, this.size());
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection removeAll(Function1 function10) {
        return this.removeAll(function10);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList removeAll(@NotNull Function1 function10) {
        int v = this.size();
        int v1 = this.size();
        Object[] arr_object = this.a;
        Object[] arr_object1 = arr_object;
        boolean z = false;
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = arr_object[v2];
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                if(z) {
                    arr_object1[v] = object0;
                    ++v;
                }
            }
            else if(!z) {
                arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
                Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(this, size)");
                z = true;
                v = v2;
            }
        }
        if(v == this.size()) {
            return this;
        }
        return v == 0 ? SmallPersistentVector.b : new SmallPersistentVector(ArraysKt___ArraysJvmKt.copyOfRange(arr_object1, 0, v));
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList removeAt(int v) {
        ListImplementation.checkElementIndex$runtime_release(v, this.size());
        if(this.size() == 1) {
            return SmallPersistentVector.b;
        }
        Object[] arr_object = Arrays.copyOf(this.a, this.size() - 1);
        Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(this, newSize)");
        ArraysKt___ArraysJvmKt.copyInto(this.a, arr_object, v, v + 1, this.size());
        return new SmallPersistentVector(arr_object);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @NotNull
    public PersistentList set(int v, Object object0) {
        ListImplementation.checkElementIndex$runtime_release(v, this.size());
        Object[] arr_object = Arrays.copyOf(this.a, this.a.length);
        Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(this, size)");
        arr_object[v] = object0;
        return new SmallPersistentVector(arr_object);
    }
}

