package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u0000 :*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001:B)\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u000E\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u000E\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u00A2\u0006\u0004\b\t\u0010\u000BJ\u0017\u0010\u000F\u001A\u00020\u00032\u0006\u0010\f\u001A\u00020\u0003H\u0000\u00A2\u0006\u0004\b\r\u0010\u000EJ%\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0010\u001A\u00020\u00032\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u001B\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u0018\u001A\u00020\u00172\n\u0010\u001A\u001A\u0006\u0012\u0002\b\u00030\u0019\u00A2\u0006\u0004\b\u001B\u0010\u001CJ9\u0010\u001D\u001A\u0004\u0018\u00010\u00022\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u0018\u001A\u00020\u00172\n\u0010\u001A\u001A\u0006\u0012\u0002\b\u00030\u0019\u00A2\u0006\u0004\b\u001D\u0010\u001EJ9\u0010\u001F\u001A\u0004\u0018\u00010\u00022\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u0018\u001A\u00020\u00172\n\u0010\u001A\u001A\u0006\u0012\u0002\b\u00030\u0019\u00A2\u0006\u0004\b\u001F\u0010\u001EJ#\u0010 \u001A\u00020\u00132\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001A\u00020\u0003\u00A2\u0006\u0004\b \u0010!J+\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001A\u00020\u00032\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u0003\u00A2\u0006\u0004\b\"\u0010#J7\u0010$\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001A\u00020\u00032\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u00032\n\u0010\u001A\u001A\u0006\u0012\u0002\b\u00030\u0019\u00A2\u0006\u0004\b$\u0010%J+\u0010&\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001A\u00020\u00032\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u0003\u00A2\u0006\u0004\b&\u0010#J7\u0010\'\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001A\u00020\u00032\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u00032\n\u0010\u001A\u001A\u0006\u0012\u0002\b\u00030\u0019\u00A2\u0006\u0004\b\'\u0010%R\"\u0010\u0004\u001A\u00020\u00038\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b.\u0010/\u001A\u0004\b0\u00101\"\u0004\b2\u00103R$\u0010\b\u001A\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b4\u00105\u001A\u0004\b6\u00107\"\u0004\b8\u00109\u00A8\u0006;"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "E", "", "", "bitmap", "", "buffer", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownedBy", "<init>", "(I[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "(I[Ljava/lang/Object;)V", "positionMask", "indexOfCellAt$runtime_release", "(I)I", "indexOfCellAt", "elementHash", "element", "shift", "", "contains", "(ILjava/lang/Object;I)Z", "otherNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "intersectionSizeRef", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "mutator", "mutableAddAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableRetainAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Ljava/lang/Object;", "mutableRemoveAll", "containsAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;I)Z", "add", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAdd", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "remove", "mutableRemove", "a", "I", "getBitmap", "()I", "setBitmap", "(I)V", "b", "[Ljava/lang/Object;", "getBuffer", "()[Ljava/lang/Object;", "setBuffer", "([Ljava/lang/Object;)V", "c", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "getOwnedBy", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnedBy", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n+ 2 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt\n+ 3 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,851:1\n54#2,13:852\n50#2,17:865\n50#2,17:882\n50#2,10:918\n60#2,7:929\n50#2,10:945\n60#2,7:956\n10#3,5:899\n15#3,4:905\n10#3,9:909\n10#3,9:936\n10#3,9:965\n1#4:904\n53#5:928\n53#5:955\n12541#6,2:963\n26#7:974\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n*L\n297#1:852,13\n324#1:865,17\n347#1:882,17\n594#1:918,10\n594#1:929,7\n701#1:945,10\n701#1:956,7\n423#1:899,5\n423#1:905,4\n525#1:909,9\n621#1:936,9\n717#1:965,9\n594#1:928\n701#1:955\n710#1:963,2\n849#1:974\n*E\n"})
public final class TrieNode {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R \u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "getEMPTY$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.d;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public int a;
    public Object[] b;
    public MutabilityOwnership c;
    public static final TrieNode d;

    static {
        TrieNode.Companion = new Companion(null);
        TrieNode.$stable = 8;
        TrieNode.d = new TrieNode(0, new Object[0]);
    }

    public TrieNode(int v, @NotNull Object[] arr_object) {
        this(v, arr_object, null);
    }

    public TrieNode(int v, @NotNull Object[] arr_object, @Nullable MutabilityOwnership mutabilityOwnership0) {
        this.a = v;
        this.b = arr_object;
        this.c = mutabilityOwnership0;
    }

    public final int a() {
        if(this.a == 0) {
            return this.b.length;
        }
        Object[] arr_object = this.b;
        int v1 = 0;
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            v1 += (object0 instanceof TrieNode ? ((TrieNode)object0).a() : 1);
        }
        return v1;
    }

    @NotNull
    public final TrieNode add(int v, Object object0, int v1) {
        TrieNode trieNode1;
        int v2 = v >> v1 & 0x1F;
        if(this.c(1 << v2)) {
            Object[] arr_object = TrieNodeKt.access$addElementAtIndex(this.b, this.indexOfCellAt$runtime_release(1 << v2), object0);
            return new TrieNode(this.a | 1 << v2, arr_object);
        }
        int v3 = this.indexOfCellAt$runtime_release(1 << v2);
        Object object1 = this.b[v3];
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.g(v3);
            if(v1 == 30) {
                if(ArraysKt___ArraysKt.contains(trieNode0.b, object0)) {
                    return this;
                }
                trieNode1 = new TrieNode(0, TrieNodeKt.access$addElementAtIndex(trieNode0.b, 0, object0));
                return trieNode0 == trieNode1 ? this : this.h(trieNode1, v3);
            }
            trieNode1 = trieNode0.add(v, object0, v1 + 5);
            return trieNode0 == trieNode1 ? this : this.h(trieNode1, v3);
        }
        if(Intrinsics.areEqual(object0, object1)) {
            return this;
        }
        Object[] arr_object1 = Arrays.copyOf(this.b, this.b.length);
        Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(this, size)");
        arr_object1[v3] = this.e(v3, v, object0, v1, null);
        return new TrieNode(this.a, arr_object1);
    }

    public final boolean b(TrieNode trieNode0) {
        if(this == trieNode0) {
            return true;
        }
        if(this.a != trieNode0.a) {
            return false;
        }
        for(int v = 0; v < this.b.length; ++v) {
            if(this.b[v] != trieNode0.b[v]) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(int v) {
        return (v & this.a) == 0;
    }

    public final boolean contains(int v, Object object0, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.c(1 << v2)) {
            return false;
        }
        int v3 = this.indexOfCellAt$runtime_release(1 << v2);
        Object object1 = this.b[v3];
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.g(v3);
            return v1 == 30 ? ArraysKt___ArraysKt.contains(trieNode0.b, object0) : trieNode0.contains(v, object0, v1 + 5);
        }
        return Intrinsics.areEqual(object0, object1);
    }

    public final boolean containsAll(@NotNull TrieNode trieNode0, int v) {
        if(this == trieNode0) {
            return true;
        }
        if(v > 30) {
            Object[] arr_object = trieNode0.b;
            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                if(!ArraysKt___ArraysKt.contains(this.b, arr_object[v1])) {
                    return false;
                }
            }
            return true;
        }
        int v2 = this.a & trieNode0.a;
        if(v2 != trieNode0.a) {
            return false;
        }
        while(v2 != 0) {
            int v3 = Integer.lowestOneBit(v2);
            Object object0 = this.b[this.indexOfCellAt$runtime_release(v3)];
            Object object1 = trieNode0.b[trieNode0.indexOfCellAt$runtime_release(v3)];
            boolean z = object0 instanceof TrieNode;
            boolean z1 = object1 instanceof TrieNode;
            if(z && z1) {
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if(!((TrieNode)object0).containsAll(((TrieNode)object1), v + 5)) {
                    return false;
                }
            }
            else if(z) {
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if(!((TrieNode)object0).contains((object1 == null ? 0 : object1.hashCode()), object1, v + 5)) {
                    return false;
                }
            }
            else {
                if(z1) {
                    return false;
                }
                if(!Intrinsics.areEqual(object0, object1)) {
                    return false;
                }
            }
            v2 ^= v3;
        }
        return true;
    }

    public static TrieNode d(int v, Object object0, int v1, Object object1, int v2, MutabilityOwnership mutabilityOwnership0) {
        if(v2 > 30) {
            return new TrieNode(0, new Object[]{object0, object1}, mutabilityOwnership0);
        }
        int v3 = v >> v2 & 0x1F;
        int v4 = v1 >> v2 & 0x1F;
        if(v3 != v4) {
            return v3 >= v4 ? new TrieNode(1 << v3 | 1 << v4, new Object[]{object1, object0}, mutabilityOwnership0) : new TrieNode(1 << v3 | 1 << v4, new Object[]{object0, object1}, mutabilityOwnership0);
        }
        return new TrieNode(1 << v3, new Object[]{TrieNode.d(v, object0, v1, object1, v2 + 5, mutabilityOwnership0)}, mutabilityOwnership0);
    }

    public final TrieNode e(int v, int v1, Object object0, int v2, MutabilityOwnership mutabilityOwnership0) {
        Object object1 = this.b[v];
        return object1 == null ? TrieNode.d(0, null, v1, object0, v2 + 5, mutabilityOwnership0) : TrieNode.d(object1.hashCode(), object1, v1, object0, v2 + 5, mutabilityOwnership0);
    }

    public final TrieNode f(int v, TrieNode trieNode0, MutabilityOwnership mutabilityOwnership0) {
        Object[] arr_object = trieNode0.b;
        if(arr_object.length == 1) {
            Object object0 = arr_object[0];
            if(!(object0 instanceof TrieNode)) {
                if(this.b.length == 1) {
                    trieNode0.a = this.a;
                    return trieNode0;
                }
                trieNode0 = object0;
            }
        }
        if(this.c == mutabilityOwnership0) {
            this.b[v] = trieNode0;
            return this;
        }
        Object[] arr_object1 = Arrays.copyOf(this.b, this.b.length);
        Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(this, size)");
        arr_object1[v] = trieNode0;
        return new TrieNode(this.a, arr_object1, mutabilityOwnership0);
    }

    public final TrieNode g(int v) {
        Object object0 = this.b[v];
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode)object0;
    }

    public final int getBitmap() {
        return this.a;
    }

    @NotNull
    public final Object[] getBuffer() {
        return this.b;
    }

    @Nullable
    public final MutabilityOwnership getOwnedBy() {
        return this.c;
    }

    public final TrieNode h(TrieNode trieNode0, int v) {
        Object[] arr_object = trieNode0.b;
        if(arr_object.length == 1) {
            Object object0 = arr_object[0];
            if(!(object0 instanceof TrieNode)) {
                if(this.b.length == 1) {
                    trieNode0.a = this.a;
                    return trieNode0;
                }
                trieNode0 = object0;
            }
        }
        Object[] arr_object1 = Arrays.copyOf(this.b, this.b.length);
        Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(this, size)");
        arr_object1[v] = trieNode0;
        return new TrieNode(this.a, arr_object1);
    }

    public final int indexOfCellAt$runtime_release(int v) {
        return Integer.bitCount(v - 1 & this.a);
    }

    @NotNull
    public final TrieNode mutableAdd(int v, Object object0, int v1, @NotNull PersistentHashSetBuilder persistentHashSetBuilder0) {
        TrieNode trieNode1;
        int v2 = v >> v1 & 0x1F;
        if(this.c(1 << v2)) {
            persistentHashSetBuilder0.setSize(persistentHashSetBuilder0.size() + 1);
            MutabilityOwnership mutabilityOwnership0 = persistentHashSetBuilder0.getOwnership$runtime_release();
            int v3 = this.indexOfCellAt$runtime_release(1 << v2);
            if(this.c == mutabilityOwnership0) {
                this.b = TrieNodeKt.access$addElementAtIndex(this.b, v3, object0);
                this.a |= 1 << v2;
                return this;
            }
            Object[] arr_object = TrieNodeKt.access$addElementAtIndex(this.b, v3, object0);
            return new TrieNode(this.a | 1 << v2, arr_object, mutabilityOwnership0);
        }
        int v4 = this.indexOfCellAt$runtime_release(1 << v2);
        Object object1 = this.b[v4];
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.g(v4);
            if(v1 == 30) {
                if(ArraysKt___ArraysKt.contains(trieNode0.b, object0)) {
                    return this;
                }
                persistentHashSetBuilder0.setSize(persistentHashSetBuilder0.size() + 1);
                if(trieNode0.c == persistentHashSetBuilder0.getOwnership$runtime_release()) {
                    trieNode0.b = TrieNodeKt.access$addElementAtIndex(trieNode0.b, 0, object0);
                    return this;
                }
                trieNode1 = new TrieNode(0, TrieNodeKt.access$addElementAtIndex(trieNode0.b, 0, object0), persistentHashSetBuilder0.getOwnership$runtime_release());
                return trieNode0 == trieNode1 ? this : this.f(v4, trieNode1, persistentHashSetBuilder0.getOwnership$runtime_release());
            }
            trieNode1 = trieNode0.mutableAdd(v, object0, v1 + 5, persistentHashSetBuilder0);
            return trieNode0 == trieNode1 ? this : this.f(v4, trieNode1, persistentHashSetBuilder0.getOwnership$runtime_release());
        }
        if(Intrinsics.areEqual(object0, object1)) {
            return this;
        }
        persistentHashSetBuilder0.setSize(persistentHashSetBuilder0.size() + 1);
        MutabilityOwnership mutabilityOwnership1 = persistentHashSetBuilder0.getOwnership$runtime_release();
        if(this.c == mutabilityOwnership1) {
            Object[] arr_object1 = this.b;
            arr_object1[v4] = this.e(v4, v, object0, v1, mutabilityOwnership1);
            return this;
        }
        Object[] arr_object2 = Arrays.copyOf(this.b, this.b.length);
        Intrinsics.checkNotNullExpressionValue(arr_object2, "copyOf(this, size)");
        arr_object2[v4] = this.e(v4, v, object0, v1, mutabilityOwnership1);
        return new TrieNode(this.a, arr_object2, mutabilityOwnership1);
    }

    @NotNull
    public final TrieNode mutableAddAll(@NotNull TrieNode trieNode0, int v, @NotNull DeltaCounter deltaCounter0, @NotNull PersistentHashSetBuilder persistentHashSetBuilder0) {
        TrieNode trieNode2;
        if(this == trieNode0) {
            deltaCounter0.setCount(this.a() + deltaCounter0.getCount());
            return this;
        }
        if(v > 30) {
            MutabilityOwnership mutabilityOwnership0 = persistentHashSetBuilder0.getOwnership$runtime_release();
            if(this == trieNode0) {
                deltaCounter0.plusAssign(this.b.length);
                return this;
            }
            Object[] arr_object = Arrays.copyOf(this.b, this.b.length + trieNode0.b.length);
            Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(this, newSize)");
            Object[] arr_object1 = trieNode0.b;
            int v2 = 0;
            for(int v1 = 0; v1 < arr_object1.length; ++v1) {
                if(!ArraysKt___ArraysKt.contains(this.b, arr_object1[v1])) {
                    arr_object[this.b.length + v2] = arr_object1[v1];
                    ++v2;
                }
            }
            int v3 = v2 + this.b.length;
            deltaCounter0.plusAssign(arr_object.length - v3);
            if(v3 != this.b.length) {
                if(v3 != trieNode0.b.length) {
                    if(v3 != arr_object.length) {
                        arr_object = Arrays.copyOf(arr_object, v3);
                        Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(this, newSize)");
                    }
                    if(Intrinsics.areEqual(this.c, mutabilityOwnership0)) {
                        this.b = arr_object;
                        return this;
                    }
                    return new TrieNode(0, arr_object, mutabilityOwnership0);
                }
                return trieNode0;
            }
            return this;
        }
        int v4 = trieNode0.a | this.a;
        TrieNode trieNode1 = v4 != this.a || !Intrinsics.areEqual(this.c, persistentHashSetBuilder0.getOwnership$runtime_release()) ? new TrieNode(v4, new Object[Integer.bitCount(v4)], persistentHashSetBuilder0.getOwnership$runtime_release()) : this;
        int v5 = 0;
        while(v4 != 0) {
            int v6 = Integer.lowestOneBit(v4);
            int v7 = this.indexOfCellAt$runtime_release(v6);
            int v8 = trieNode0.indexOfCellAt$runtime_release(v6);
            Object[] arr_object2 = trieNode1.b;
            if(this.c(v6)) {
                trieNode2 = trieNode0.b[v8];
            }
            else if(trieNode0.c(v6)) {
                trieNode2 = this.b[v7];
            }
            else {
                trieNode2 = this.b[v7];
                Object object0 = trieNode0.b[v8];
                boolean z = trieNode2 instanceof TrieNode;
                boolean z1 = object0 instanceof TrieNode;
                if(z && z1) {
                    Intrinsics.checkNotNull(trieNode2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    trieNode2 = trieNode2.mutableAddAll(((TrieNode)object0), v + 5, deltaCounter0, persistentHashSetBuilder0);
                }
                else if(z) {
                    Intrinsics.checkNotNull(trieNode2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    trieNode2 = trieNode2.mutableAdd((object0 == null ? 0 : object0.hashCode()), object0, v + 5, persistentHashSetBuilder0);
                    deltaCounter0.setCount(deltaCounter0.getCount() + 1);
                }
                else if(z1) {
                    Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    trieNode2 = ((TrieNode)object0).mutableAdd((trieNode2 == null ? 0 : trieNode2.hashCode()), trieNode2, v + 5, persistentHashSetBuilder0);
                    deltaCounter0.setCount(deltaCounter0.getCount() + 1);
                }
                else if(Intrinsics.areEqual(trieNode2, object0)) {
                    deltaCounter0.setCount(deltaCounter0.getCount() + 1);
                }
                else {
                    trieNode2 = TrieNode.d((trieNode2 == null ? 0 : trieNode2.hashCode()), trieNode2, (object0 == null ? 0 : object0.hashCode()), object0, v + 5, persistentHashSetBuilder0.getOwnership$runtime_release());
                }
            }
            arr_object2[v5] = trieNode2;
            ++v5;
            v4 ^= v6;
        }
        if(this.b(trieNode1)) {
            return this;
        }
        return trieNode0.b(trieNode1) ? trieNode0 : trieNode1;
    }

    @NotNull
    public final TrieNode mutableRemove(int v, Object object0, int v1, @NotNull PersistentHashSetBuilder persistentHashSetBuilder0) {
        TrieNode trieNode1;
        int v2 = v >> v1 & 0x1F;
        if(this.c(1 << v2)) {
            return this;
        }
        int v3 = this.indexOfCellAt$runtime_release(1 << v2);
        Object object1 = this.b[v3];
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.g(v3);
            if(v1 == 30) {
                int v4 = ArraysKt___ArraysKt.indexOf(trieNode0.b, object0);
                if(v4 != -1) {
                    persistentHashSetBuilder0.setSize(persistentHashSetBuilder0.size() - 1);
                    MutabilityOwnership mutabilityOwnership0 = persistentHashSetBuilder0.getOwnership$runtime_release();
                    if(trieNode0.c == mutabilityOwnership0) {
                        trieNode0.b = TrieNodeKt.access$removeCellAtIndex(trieNode0.b, v4);
                        return this.c == persistentHashSetBuilder0.getOwnership$runtime_release() ? this.f(v3, trieNode0, persistentHashSetBuilder0.getOwnership$runtime_release()) : this;
                    }
                    trieNode1 = new TrieNode(0, TrieNodeKt.access$removeCellAtIndex(trieNode0.b, v4), mutabilityOwnership0);
                    return this.c == persistentHashSetBuilder0.getOwnership$runtime_release() || trieNode0 != trieNode1 ? this.f(v3, trieNode1, persistentHashSetBuilder0.getOwnership$runtime_release()) : this;
                }
                return this.c == persistentHashSetBuilder0.getOwnership$runtime_release() ? this.f(v3, trieNode0, persistentHashSetBuilder0.getOwnership$runtime_release()) : this;
            }
            trieNode1 = trieNode0.mutableRemove(v, object0, v1 + 5, persistentHashSetBuilder0);
            return this.c == persistentHashSetBuilder0.getOwnership$runtime_release() || trieNode0 != trieNode1 ? this.f(v3, trieNode1, persistentHashSetBuilder0.getOwnership$runtime_release()) : this;
        }
        if(Intrinsics.areEqual(object0, object1)) {
            persistentHashSetBuilder0.setSize(persistentHashSetBuilder0.size() - 1);
            MutabilityOwnership mutabilityOwnership1 = persistentHashSetBuilder0.getOwnership$runtime_release();
            if(this.c == mutabilityOwnership1) {
                this.b = TrieNodeKt.access$removeCellAtIndex(this.b, v3);
                this.a ^= 1 << v2;
                return this;
            }
            Object[] arr_object = TrieNodeKt.access$removeCellAtIndex(this.b, v3);
            return new TrieNode(this.a ^ 1 << v2, arr_object, mutabilityOwnership1);
        }
        return this;
    }

    @Nullable
    public final Object mutableRemoveAll(@NotNull TrieNode trieNode0, int v, @NotNull DeltaCounter deltaCounter0, @NotNull PersistentHashSetBuilder persistentHashSetBuilder0) {
        TrieNode trieNode2;
        TrieNode trieNode1 = TrieNode.d;
        if(this == trieNode0) {
            deltaCounter0.plusAssign(this.a());
            return trieNode1;
        }
        if(v > 30) {
            MutabilityOwnership mutabilityOwnership0 = persistentHashSetBuilder0.getOwnership$runtime_release();
            if(this == trieNode0) {
                deltaCounter0.plusAssign(this.b.length);
                return trieNode1;
            }
            Object[] arr_object = Intrinsics.areEqual(mutabilityOwnership0, this.c) ? this.b : new Object[this.b.length];
            Object[] arr_object1 = this.b;
            int v2 = 0;
            for(int v1 = 0; v1 < arr_object1.length; ++v1) {
                if(!ArraysKt___ArraysKt.contains(trieNode0.b, arr_object1[v1])) {
                    arr_object[v2] = arr_object1[v1];
                    ++v2;
                }
            }
            deltaCounter0.plusAssign(this.b.length - v2);
            switch(v2) {
                case 0: {
                    return trieNode1;
                }
                case 1: {
                    return arr_object[0];
                }
                default: {
                    if(v2 == this.b.length) {
                        return this;
                    }
                    if(v2 == arr_object.length) {
                        return new TrieNode(0, arr_object, mutabilityOwnership0);
                    }
                    Object[] arr_object2 = Arrays.copyOf(arr_object, v2);
                    Intrinsics.checkNotNullExpressionValue(arr_object2, "copyOf(this, newSize)");
                    return new TrieNode(0, arr_object2, mutabilityOwnership0);
                }
            }
        }
        int v3 = this.a & trieNode0.a;
        if(v3 == 0) {
            return this;
        }
        if(Intrinsics.areEqual(this.c, persistentHashSetBuilder0.getOwnership$runtime_release())) {
            trieNode2 = this;
        }
        else {
            int v4 = this.a;
            Object[] arr_object3 = Arrays.copyOf(this.b, this.b.length);
            Intrinsics.checkNotNullExpressionValue(arr_object3, "copyOf(this, size)");
            trieNode2 = new TrieNode(v4, arr_object3, persistentHashSetBuilder0.getOwnership$runtime_release());
        }
        int v5 = this.a;
        while(v3 != 0) {
            int v6 = Integer.lowestOneBit(v3);
            int v7 = this.indexOfCellAt$runtime_release(v6);
            TrieNode trieNode3 = this.b[v7];
            Object object0 = trieNode0.b[trieNode0.indexOfCellAt$runtime_release(v6)];
            boolean z = trieNode3 instanceof TrieNode;
            boolean z1 = object0 instanceof TrieNode;
            if(z && z1) {
                Intrinsics.checkNotNull(trieNode3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                trieNode3 = trieNode3.mutableRemoveAll(((TrieNode)object0), v + 5, deltaCounter0, persistentHashSetBuilder0);
            }
            else if(z) {
                Intrinsics.checkNotNull(trieNode3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                trieNode3.mutableRemove((object0 == null ? 0 : object0.hashCode()), object0, v + 5, persistentHashSetBuilder0);
            }
            else if(z1) {
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                if(((TrieNode)object0).contains((trieNode3 == null ? 0 : trieNode3.hashCode()), trieNode3, v + 5)) {
                    deltaCounter0.plusAssign(1);
                    trieNode3 = trieNode1;
                }
            }
            else if(Intrinsics.areEqual(trieNode3, object0)) {
                deltaCounter0.plusAssign(1);
                trieNode3 = trieNode1;
            }
            if(trieNode3 == trieNode1) {
                v5 ^= v6;
            }
            trieNode2.b[v7] = trieNode3;
            v3 ^= v6;
        }
        int v8 = Integer.bitCount(v5);
        if(v5 != 0) {
            if(v5 == this.a) {
                return trieNode2.b(this) ? this : trieNode2;
            }
            if(v8 == 1 && v != 0) {
                trieNode1 = trieNode2.b[trieNode2.indexOfCellAt$runtime_release(v5)];
                return trieNode1 instanceof TrieNode ? new TrieNode(v5, new Object[]{trieNode1}, persistentHashSetBuilder0.getOwnership$runtime_release()) : trieNode1;
            }
            Object[] arr_object4 = new Object[v8];
            Object[] arr_object5 = trieNode2.b;
            int v10 = 0;
            for(int v9 = 0; v9 < arr_object5.length; ++v9) {
                if(arr_object5[v9] != TrieNode.Companion.getEMPTY$runtime_release()) {
                    arr_object4[v10] = arr_object5[v9];
                    ++v10;
                }
            }
            return new TrieNode(v5, arr_object4, persistentHashSetBuilder0.getOwnership$runtime_release());
        }
        return trieNode1;
    }

    @Nullable
    public final Object mutableRetainAll(@NotNull TrieNode trieNode0, int v, @NotNull DeltaCounter deltaCounter0, @NotNull PersistentHashSetBuilder persistentHashSetBuilder0) {
        if(this == trieNode0) {
            deltaCounter0.plusAssign(this.a());
            return this;
        }
        TrieNode trieNode1 = TrieNode.d;
        if(v > 30) {
            MutabilityOwnership mutabilityOwnership0 = persistentHashSetBuilder0.getOwnership$runtime_release();
            if(this == trieNode0) {
                deltaCounter0.plusAssign(this.b.length);
                return this;
            }
            Object[] arr_object = Intrinsics.areEqual(mutabilityOwnership0, this.c) ? this.b : new Object[Math.min(this.b.length, trieNode0.b.length)];
            Object[] arr_object1 = this.b;
            int v2 = 0;
            for(int v1 = 0; v1 < arr_object1.length; ++v1) {
                if(ArraysKt___ArraysKt.contains(trieNode0.b, arr_object1[v1])) {
                    arr_object[v2] = arr_object1[v1];
                    ++v2;
                }
            }
            deltaCounter0.plusAssign(v2);
            if(v2 == 0) {
                return trieNode1;
            }
            if(v2 == 1) {
                return arr_object[0];
            }
            if(v2 != this.b.length) {
                if(v2 != trieNode0.b.length) {
                    if(v2 == arr_object.length) {
                        return new TrieNode(0, arr_object, mutabilityOwnership0);
                    }
                    Object[] arr_object2 = Arrays.copyOf(arr_object, v2);
                    Intrinsics.checkNotNullExpressionValue(arr_object2, "copyOf(this, newSize)");
                    return new TrieNode(0, arr_object2, mutabilityOwnership0);
                }
                return trieNode0;
            }
            return this;
        }
        int v3 = this.a & trieNode0.a;
        if(v3 == 0) {
            return trieNode1;
        }
        TrieNode trieNode2 = !Intrinsics.areEqual(this.c, persistentHashSetBuilder0.getOwnership$runtime_release()) || v3 != this.a ? new TrieNode(v3, new Object[Integer.bitCount(v3)], persistentHashSetBuilder0.getOwnership$runtime_release()) : this;
        int v4 = v3;
        int v5 = 0;
        int v6 = 0;
        while(v4 != 0) {
            int v7 = Integer.lowestOneBit(v4);
            TrieNode trieNode3 = this.b[this.indexOfCellAt$runtime_release(v7)];
            Object object0 = trieNode0.b[trieNode0.indexOfCellAt$runtime_release(v7)];
            boolean z = trieNode3 instanceof TrieNode;
            boolean z1 = object0 instanceof TrieNode;
            if(z && z1) {
                Intrinsics.checkNotNull(trieNode3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                trieNode3 = trieNode3.mutableRetainAll(((TrieNode)object0), v + 5, deltaCounter0, persistentHashSetBuilder0);
            }
            else if(z) {
                Intrinsics.checkNotNull(trieNode3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                if(trieNode3.contains((object0 == null ? 0 : object0.hashCode()), object0, v + 5)) {
                    deltaCounter0.plusAssign(1);
                    trieNode3 = object0;
                }
                else {
                    trieNode3 = trieNode1;
                }
            }
            else {
                if(z1) {
                    Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    if(((TrieNode)object0).contains((trieNode3 == null ? 0 : trieNode3.hashCode()), trieNode3, v + 5)) {
                        deltaCounter0.plusAssign(1);
                        goto label_68;
                    }
                }
                else if(Intrinsics.areEqual(trieNode3, object0)) {
                    deltaCounter0.plusAssign(1);
                    goto label_68;
                }
                trieNode3 = trieNode1;
            }
        label_68:
            if(trieNode3 != trieNode1) {
                v5 |= v7;
            }
            trieNode2.b[v6] = trieNode3;
            ++v6;
            v4 ^= v7;
        }
        int v8 = Integer.bitCount(v5);
        if(v5 == 0) {
            return trieNode1;
        }
        if(v5 == v3) {
            if(trieNode2.b(this)) {
                return this;
            }
            return trieNode2.b(trieNode0) ? trieNode0 : trieNode2;
        }
        if(v8 == 1 && v != 0) {
            trieNode0 = trieNode2.b[trieNode2.indexOfCellAt$runtime_release(v5)];
            return trieNode0 instanceof TrieNode ? new TrieNode(v5, new Object[]{trieNode0}, persistentHashSetBuilder0.getOwnership$runtime_release()) : trieNode0;
        }
        Object[] arr_object3 = new Object[v8];
        Object[] arr_object4 = trieNode2.b;
        int v10 = 0;
        for(int v9 = 0; v9 < arr_object4.length; ++v9) {
            if(arr_object4[v9] != TrieNode.Companion.getEMPTY$runtime_release()) {
                arr_object3[v10] = arr_object4[v9];
                ++v10;
            }
        }
        return new TrieNode(v5, arr_object3, persistentHashSetBuilder0.getOwnership$runtime_release());
    }

    @NotNull
    public final TrieNode remove(int v, Object object0, int v1) {
        TrieNode trieNode1;
        int v2 = v >> v1 & 0x1F;
        if(this.c(1 << v2)) {
            return this;
        }
        int v3 = this.indexOfCellAt$runtime_release(1 << v2);
        Object object1 = this.b[v3];
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.g(v3);
            if(v1 == 30) {
                int v4 = ArraysKt___ArraysKt.indexOf(trieNode0.b, object0);
                if(v4 != -1) {
                    trieNode1 = new TrieNode(0, TrieNodeKt.access$removeCellAtIndex(trieNode0.b, v4));
                    return trieNode0 == trieNode1 ? this : this.h(trieNode1, v3);
                }
                return this;
            }
            trieNode1 = trieNode0.remove(v, object0, v1 + 5);
            return trieNode0 == trieNode1 ? this : this.h(trieNode1, v3);
        }
        if(Intrinsics.areEqual(object0, object1)) {
            Object[] arr_object = TrieNodeKt.access$removeCellAtIndex(this.b, v3);
            return new TrieNode(this.a ^ 1 << v2, arr_object);
        }
        return this;
    }

    public final void setBitmap(int v) {
        this.a = v;
    }

    public final void setBuffer(@NotNull Object[] arr_object) {
        this.b = arr_object;
    }

    public final void setOwnedBy(@Nullable MutabilityOwnership mutabilityOwnership0) {
        this.c = mutabilityOwnership0;
    }
}

