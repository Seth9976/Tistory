package kotlinx.collections.immutable.implementations.immutableSet;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.internal.DeltaCounter;
import kotlinx.collections.immutable.internal.MutabilityOwnership;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u0000 :*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001:B)\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u000E\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u000E\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u00A2\u0006\u0004\b\t\u0010\u000BJ\u0017\u0010\u000F\u001A\u00020\u00032\u0006\u0010\f\u001A\u00020\u0003H\u0000\u00A2\u0006\u0004\b\r\u0010\u000EJ%\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0010\u001A\u00020\u00032\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u001B\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u0018\u001A\u00020\u00172\n\u0010\u001A\u001A\u0006\u0012\u0002\b\u00030\u0019\u00A2\u0006\u0004\b\u001B\u0010\u001CJ9\u0010\u001D\u001A\u0004\u0018\u00010\u00022\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u0018\u001A\u00020\u00172\n\u0010\u001A\u001A\u0006\u0012\u0002\b\u00030\u0019\u00A2\u0006\u0004\b\u001D\u0010\u001EJ9\u0010\u001F\u001A\u0004\u0018\u00010\u00022\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u0018\u001A\u00020\u00172\n\u0010\u001A\u001A\u0006\u0012\u0002\b\u00030\u0019\u00A2\u0006\u0004\b\u001F\u0010\u001EJ#\u0010 \u001A\u00020\u00132\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001A\u00020\u0003\u00A2\u0006\u0004\b \u0010!J+\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001A\u00020\u00032\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u0003\u00A2\u0006\u0004\b\"\u0010#J7\u0010$\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001A\u00020\u00032\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u00032\n\u0010\u001A\u001A\u0006\u0012\u0002\b\u00030\u0019\u00A2\u0006\u0004\b$\u0010%J+\u0010&\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001A\u00020\u00032\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u0003\u00A2\u0006\u0004\b&\u0010#J7\u0010\'\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001A\u00020\u00032\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u00032\n\u0010\u001A\u001A\u0006\u0012\u0002\b\u00030\u0019\u00A2\u0006\u0004\b\'\u0010%R\"\u0010\u0004\u001A\u00020\u00038\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b.\u0010/\u001A\u0004\b0\u00101\"\u0004\b2\u00103R$\u0010\b\u001A\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b4\u00105\u001A\u0004\b6\u00107\"\u0004\b8\u00109\u00A8\u0006;"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "E", "", "", "bitmap", "", "buffer", "Lkotlinx/collections/immutable/internal/MutabilityOwnership;", "ownedBy", "<init>", "(I[Ljava/lang/Object;Lkotlinx/collections/immutable/internal/MutabilityOwnership;)V", "(I[Ljava/lang/Object;)V", "positionMask", "indexOfCellAt$kotlinx_collections_immutable", "(I)I", "indexOfCellAt", "elementHash", "element", "shift", "", "contains", "(ILjava/lang/Object;I)Z", "otherNode", "Lkotlinx/collections/immutable/internal/DeltaCounter;", "intersectionSizeRef", "Lkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "mutator", "mutableAddAll", "(Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;ILkotlinx/collections/immutable/internal/DeltaCounter;Lkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableRetainAll", "(Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;ILkotlinx/collections/immutable/internal/DeltaCounter;Lkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Ljava/lang/Object;", "mutableRemoveAll", "containsAll", "(Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;I)Z", "add", "(ILjava/lang/Object;I)Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAdd", "(ILjava/lang/Object;ILkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "remove", "mutableRemove", "a", "I", "getBitmap", "()I", "setBitmap", "(I)V", "b", "[Ljava/lang/Object;", "getBuffer", "()[Ljava/lang/Object;", "setBuffer", "([Ljava/lang/Object;)V", "c", "Lkotlinx/collections/immutable/internal/MutabilityOwnership;", "getOwnedBy", "()Lkotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnedBy", "(Lkotlinx/collections/immutable/internal/MutabilityOwnership;)V", "Companion", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nkotlinx/collections/immutable/implementations/immutableSet/TrieNode\n+ 2 TrieNode.kt\nkotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt\n+ 3 ForEachOneBit.kt\nkotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TrieNode.kt\nkotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,790:1\n54#2,13:791\n50#2,17:804\n50#2,17:821\n50#2,10:857\n60#2,7:868\n50#2,10:884\n60#2,7:895\n10#3,5:838\n15#3,4:844\n10#3,9:848\n10#3,9:875\n10#3,9:904\n1#4:843\n53#5:867\n53#5:894\n12271#6,2:902\n26#7:913\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nkotlinx/collections/immutable/implementations/immutableSet/TrieNode\n*L\n239#1:791,13\n261#1:804,17\n284#1:821,17\n531#1:857,10\n531#1:868,7\n638#1:884,10\n638#1:895,7\n360#1:838,5\n360#1:844,4\n462#1:848,9\n558#1:875,9\n654#1:904,9\n531#1:867\n638#1:894\n647#1:902,2\n788#1:913\n*E\n"})
public final class TrieNode {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R \u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "", "EMPTY", "Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "getEMPTY$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final TrieNode getEMPTY$kotlinx_collections_immutable() {
            return TrieNode.d;
        }
    }

    @NotNull
    public static final Companion Companion;
    public int a;
    public Object[] b;
    public MutabilityOwnership c;
    public static final TrieNode d;

    static {
        TrieNode.Companion = new Companion(null);
        TrieNode.d = new TrieNode(0, new Object[0]);
    }

    public TrieNode(int v, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "buffer");
        this(v, arr_object, null);
    }

    public TrieNode(int v, @NotNull Object[] arr_object, @Nullable MutabilityOwnership mutabilityOwnership0) {
        Intrinsics.checkNotNullParameter(arr_object, "buffer");
        super();
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
        if(this.d(1 << v2)) {
            return this.h(this.a | 1 << v2, TrieNodeKt.access$addElementAtIndex(this.b, this.indexOfCellAt$kotlinx_collections_immutable(1 << v2), object0), null);
        }
        int v3 = this.indexOfCellAt$kotlinx_collections_immutable(1 << v2);
        Object object1 = this.b[v3];
        int v4 = 0;
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.f(v3);
            if(v1 == 30) {
                if(ArraysKt___ArraysKt.contains(trieNode0.b, object0)) {
                    return this;
                }
                trieNode1 = trieNode0.h(0, TrieNodeKt.access$addElementAtIndex(trieNode0.b, 0, object0), null);
                return trieNode0 == trieNode1 ? this : this.g(v3, trieNode1, null);
            }
            trieNode1 = trieNode0.add(v, object0, v1 + 5);
            return trieNode0 == trieNode1 ? this : this.g(v3, trieNode1, null);
        }
        if(Intrinsics.areEqual(object0, object1)) {
            return this;
        }
        Object object2 = this.b[v3];
        if(object2 != null) {
            v4 = object2.hashCode();
        }
        return this.g(v3, TrieNode.e(v4, object2, v, object0, v1 + 5, null), null);
    }

    public final TrieNode b(int v, TrieNode trieNode0, MutabilityOwnership mutabilityOwnership0) {
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
        return this.g(v, trieNode0, mutabilityOwnership0);
    }

    public final boolean c(TrieNode trieNode0) {
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

    public final boolean contains(int v, Object object0, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.d(1 << v2)) {
            return false;
        }
        int v3 = this.indexOfCellAt$kotlinx_collections_immutable(1 << v2);
        Object object1 = this.b[v3];
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.f(v3);
            return v1 == 30 ? ArraysKt___ArraysKt.contains(trieNode0.b, object0) : trieNode0.contains(v, object0, v1 + 5);
        }
        return Intrinsics.areEqual(object0, object1);
    }

    public final boolean containsAll(@NotNull TrieNode trieNode0, int v) {
        Intrinsics.checkNotNullParameter(trieNode0, "otherNode");
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
            Object object0 = this.b[this.indexOfCellAt$kotlinx_collections_immutable(v3)];
            Object object1 = trieNode0.b[trieNode0.indexOfCellAt$kotlinx_collections_immutable(v3)];
            boolean z = object0 instanceof TrieNode;
            boolean z1 = object1 instanceof TrieNode;
            if(z && z1) {
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if(!((TrieNode)object0).containsAll(((TrieNode)object1), v + 5)) {
                    return false;
                }
            }
            else if(z) {
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
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

    public final boolean d(int v) {
        return (v & this.a) == 0;
    }

    public static TrieNode e(int v, Object object0, int v1, Object object1, int v2, MutabilityOwnership mutabilityOwnership0) {
        if(v2 > 30) {
            return new TrieNode(0, new Object[]{object0, object1}, mutabilityOwnership0);
        }
        int v3 = v >> v2 & 0x1F;
        int v4 = v1 >> v2 & 0x1F;
        if(v3 != v4) {
            return v3 >= v4 ? new TrieNode(1 << v3 | 1 << v4, new Object[]{object1, object0}, mutabilityOwnership0) : new TrieNode(1 << v3 | 1 << v4, new Object[]{object0, object1}, mutabilityOwnership0);
        }
        return new TrieNode(1 << v3, new Object[]{TrieNode.e(v, object0, v1, object1, v2 + 5, mutabilityOwnership0)}, mutabilityOwnership0);
    }

    public final TrieNode f(int v) {
        Object object0 = this.b[v];
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode)object0;
    }

    public final TrieNode g(int v, Object object0, MutabilityOwnership mutabilityOwnership0) {
        if(this.c != null && this.c == mutabilityOwnership0) {
            this.b[v] = object0;
            return this;
        }
        Object[] arr_object = Arrays.copyOf(this.b, this.b.length);
        Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(...)");
        arr_object[v] = object0;
        return new TrieNode(this.a, arr_object, mutabilityOwnership0);
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

    public final TrieNode h(int v, Object[] arr_object, MutabilityOwnership mutabilityOwnership0) {
        if(this.c != null && this.c == mutabilityOwnership0) {
            this.a = v;
            this.b = arr_object;
            return this;
        }
        return new TrieNode(v, arr_object, mutabilityOwnership0);
    }

    public final int indexOfCellAt$kotlinx_collections_immutable(int v) {
        return Integer.bitCount(v - 1 & this.a);
    }

    @NotNull
    public final TrieNode mutableAdd(int v, Object object0, int v1, @NotNull PersistentHashSetBuilder persistentHashSetBuilder0) {
        TrieNode trieNode1;
        Intrinsics.checkNotNullParameter(persistentHashSetBuilder0, "mutator");
        int v2 = v >> v1 & 0x1F;
        if(this.d(1 << v2)) {
            persistentHashSetBuilder0.setSize(persistentHashSetBuilder0.size() + 1);
            return this.h(this.a | 1 << v2, TrieNodeKt.access$addElementAtIndex(this.b, this.indexOfCellAt$kotlinx_collections_immutable(1 << v2), object0), persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable());
        }
        int v3 = this.indexOfCellAt$kotlinx_collections_immutable(1 << v2);
        Object object1 = this.b[v3];
        int v4 = 0;
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.f(v3);
            if(v1 == 30) {
                if(ArraysKt___ArraysKt.contains(trieNode0.b, object0)) {
                    return this;
                }
                persistentHashSetBuilder0.setSize(persistentHashSetBuilder0.size() + 1);
                trieNode1 = trieNode0.h(0, TrieNodeKt.access$addElementAtIndex(trieNode0.b, 0, object0), persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable());
                return trieNode0 == trieNode1 ? this : this.g(v3, trieNode1, persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable());
            }
            trieNode1 = trieNode0.mutableAdd(v, object0, v1 + 5, persistentHashSetBuilder0);
            return trieNode0 == trieNode1 ? this : this.g(v3, trieNode1, persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable());
        }
        if(Intrinsics.areEqual(object0, object1)) {
            return this;
        }
        persistentHashSetBuilder0.setSize(persistentHashSetBuilder0.size() + 1);
        MutabilityOwnership mutabilityOwnership0 = persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable();
        Object object2 = this.b[v3];
        if(object2 != null) {
            v4 = object2.hashCode();
        }
        return this.g(v3, TrieNode.e(v4, object2, v, object0, v1 + 5, mutabilityOwnership0), mutabilityOwnership0);
    }

    @NotNull
    public final TrieNode mutableAddAll(@NotNull TrieNode trieNode0, int v, @NotNull DeltaCounter deltaCounter0, @NotNull PersistentHashSetBuilder persistentHashSetBuilder0) {
        TrieNode trieNode2;
        Intrinsics.checkNotNullParameter(trieNode0, "otherNode");
        Intrinsics.checkNotNullParameter(deltaCounter0, "intersectionSizeRef");
        Intrinsics.checkNotNullParameter(persistentHashSetBuilder0, "mutator");
        if(this == trieNode0) {
            deltaCounter0.setCount(this.a() + deltaCounter0.getCount());
            return this;
        }
        if(v > 30) {
            MutabilityOwnership mutabilityOwnership0 = persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable();
            if(this == trieNode0) {
                deltaCounter0.plusAssign(this.b.length);
                return this;
            }
            Object[] arr_object = Arrays.copyOf(this.b, this.b.length + trieNode0.b.length);
            Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(...)");
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
                        Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(...)");
                    }
                    return this.h(0, arr_object, mutabilityOwnership0);
                }
                return trieNode0;
            }
            return this;
        }
        int v4 = trieNode0.a | this.a;
        TrieNode trieNode1 = v4 != this.a || !Intrinsics.areEqual(this.c, persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable()) ? new TrieNode(v4, new Object[Integer.bitCount(v4)], persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable()) : this;
        int v5 = 0;
        while(v4 != 0) {
            int v6 = Integer.lowestOneBit(v4);
            int v7 = this.indexOfCellAt$kotlinx_collections_immutable(v6);
            int v8 = trieNode0.indexOfCellAt$kotlinx_collections_immutable(v6);
            Object[] arr_object2 = trieNode1.b;
            if(this.d(v6)) {
                trieNode2 = trieNode0.b[v8];
            }
            else if(trieNode0.d(v6)) {
                trieNode2 = this.b[v7];
            }
            else {
                trieNode2 = this.b[v7];
                Object object0 = trieNode0.b[v8];
                boolean z = trieNode2 instanceof TrieNode;
                boolean z1 = object0 instanceof TrieNode;
                if(z && z1) {
                    Intrinsics.checkNotNull(trieNode2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    trieNode2 = trieNode2.mutableAddAll(((TrieNode)object0), v + 5, deltaCounter0, persistentHashSetBuilder0);
                }
                else if(z) {
                    Intrinsics.checkNotNull(trieNode2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    trieNode2 = trieNode2.mutableAdd((object0 == null ? 0 : object0.hashCode()), object0, v + 5, persistentHashSetBuilder0);
                    deltaCounter0.setCount(deltaCounter0.getCount() + 1);
                }
                else if(z1) {
                    Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    trieNode2 = ((TrieNode)object0).mutableAdd((trieNode2 == null ? 0 : trieNode2.hashCode()), trieNode2, v + 5, persistentHashSetBuilder0);
                    deltaCounter0.setCount(deltaCounter0.getCount() + 1);
                }
                else if(Intrinsics.areEqual(trieNode2, object0)) {
                    deltaCounter0.setCount(deltaCounter0.getCount() + 1);
                }
                else {
                    trieNode2 = TrieNode.e((trieNode2 == null ? 0 : trieNode2.hashCode()), trieNode2, (object0 == null ? 0 : object0.hashCode()), object0, v + 5, persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable());
                }
            }
            arr_object2[v5] = trieNode2;
            ++v5;
            v4 ^= v6;
        }
        if(this.c(trieNode1)) {
            return this;
        }
        return trieNode0.c(trieNode1) ? trieNode0 : trieNode1;
    }

    @NotNull
    public final TrieNode mutableRemove(int v, Object object0, int v1, @NotNull PersistentHashSetBuilder persistentHashSetBuilder0) {
        TrieNode trieNode1;
        Intrinsics.checkNotNullParameter(persistentHashSetBuilder0, "mutator");
        int v2 = v >> v1 & 0x1F;
        if(this.d(1 << v2)) {
            return this;
        }
        int v3 = this.indexOfCellAt$kotlinx_collections_immutable(1 << v2);
        Object object1 = this.b[v3];
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.f(v3);
            if(v1 == 30) {
                int v4 = ArraysKt___ArraysKt.indexOf(trieNode0.b, object0);
                if(v4 != -1) {
                    persistentHashSetBuilder0.setSize(persistentHashSetBuilder0.size() - 1);
                    trieNode1 = trieNode0.h(0, TrieNodeKt.access$removeCellAtIndex(trieNode0.b, v4), persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable());
                    return trieNode0.c == persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable() || trieNode0 != trieNode1 ? this.b(v3, trieNode1, persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable()) : this;
                }
                return trieNode0.c == persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable() ? this.b(v3, trieNode0, persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable()) : this;
            }
            trieNode1 = trieNode0.mutableRemove(v, object0, v1 + 5, persistentHashSetBuilder0);
            return trieNode0.c == persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable() || trieNode0 != trieNode1 ? this.b(v3, trieNode1, persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable()) : this;
        }
        if(Intrinsics.areEqual(object0, object1)) {
            persistentHashSetBuilder0.setSize(persistentHashSetBuilder0.size() - 1);
            return this.h(this.a ^ 1 << v2, TrieNodeKt.access$removeCellAtIndex(this.b, v3), persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable());
        }
        return this;
    }

    @Nullable
    public final Object mutableRemoveAll(@NotNull TrieNode trieNode0, int v, @NotNull DeltaCounter deltaCounter0, @NotNull PersistentHashSetBuilder persistentHashSetBuilder0) {
        TrieNode trieNode2;
        Intrinsics.checkNotNullParameter(trieNode0, "otherNode");
        Intrinsics.checkNotNullParameter(deltaCounter0, "intersectionSizeRef");
        Intrinsics.checkNotNullParameter(persistentHashSetBuilder0, "mutator");
        TrieNode trieNode1 = TrieNode.d;
        if(this == trieNode0) {
            deltaCounter0.plusAssign(this.a());
            return trieNode1;
        }
        if(v > 30) {
            MutabilityOwnership mutabilityOwnership0 = persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable();
            if(this == trieNode0) {
                deltaCounter0.plusAssign(this.b.length);
                return trieNode1;
            }
            Object[] arr_object = mutabilityOwnership0 == this.c ? this.b : new Object[this.b.length];
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
                        return this.h(0, arr_object, mutabilityOwnership0);
                    }
                    Object[] arr_object2 = Arrays.copyOf(arr_object, v2);
                    Intrinsics.checkNotNullExpressionValue(arr_object2, "copyOf(...)");
                    return this.h(0, arr_object2, mutabilityOwnership0);
                }
            }
        }
        int v3 = this.a & trieNode0.a;
        if(v3 == 0) {
            return this;
        }
        if(Intrinsics.areEqual(this.c, persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable())) {
            trieNode2 = this;
        }
        else {
            int v4 = this.a;
            Object[] arr_object3 = Arrays.copyOf(this.b, this.b.length);
            Intrinsics.checkNotNullExpressionValue(arr_object3, "copyOf(...)");
            trieNode2 = new TrieNode(v4, arr_object3, persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable());
        }
        int v5 = this.a;
        while(v3 != 0) {
            int v6 = Integer.lowestOneBit(v3);
            int v7 = this.indexOfCellAt$kotlinx_collections_immutable(v6);
            TrieNode trieNode3 = this.b[v7];
            Object object0 = trieNode0.b[trieNode0.indexOfCellAt$kotlinx_collections_immutable(v6)];
            boolean z = trieNode3 instanceof TrieNode;
            boolean z1 = object0 instanceof TrieNode;
            if(z && z1) {
                Intrinsics.checkNotNull(trieNode3, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                trieNode3 = trieNode3.mutableRemoveAll(((TrieNode)object0), v + 5, deltaCounter0, persistentHashSetBuilder0);
            }
            else if(z) {
                Intrinsics.checkNotNull(trieNode3, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                trieNode3.mutableRemove((object0 == null ? 0 : object0.hashCode()), object0, v + 5, persistentHashSetBuilder0);
            }
            else if(z1) {
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
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
                return trieNode2.c(this) ? this : trieNode2;
            }
            if(v8 == 1 && v != 0) {
                trieNode1 = trieNode2.b[trieNode2.indexOfCellAt$kotlinx_collections_immutable(v5)];
                return trieNode1 instanceof TrieNode ? new TrieNode(v5, new Object[]{trieNode1}, persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable()) : trieNode1;
            }
            Object[] arr_object4 = new Object[v8];
            Object[] arr_object5 = trieNode2.b;
            int v10 = 0;
            for(int v9 = 0; v9 < arr_object5.length; ++v9) {
                if(arr_object5[v9] != TrieNode.Companion.getEMPTY$kotlinx_collections_immutable()) {
                    arr_object4[v10] = arr_object5[v9];
                    ++v10;
                }
            }
            return new TrieNode(v5, arr_object4, persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable());
        }
        return trieNode1;
    }

    @Nullable
    public final Object mutableRetainAll(@NotNull TrieNode trieNode0, int v, @NotNull DeltaCounter deltaCounter0, @NotNull PersistentHashSetBuilder persistentHashSetBuilder0) {
        Intrinsics.checkNotNullParameter(trieNode0, "otherNode");
        Intrinsics.checkNotNullParameter(deltaCounter0, "intersectionSizeRef");
        Intrinsics.checkNotNullParameter(persistentHashSetBuilder0, "mutator");
        if(this == trieNode0) {
            deltaCounter0.plusAssign(this.a());
            return this;
        }
        TrieNode trieNode1 = TrieNode.d;
        if(v > 30) {
            MutabilityOwnership mutabilityOwnership0 = persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable();
            if(this == trieNode0) {
                deltaCounter0.plusAssign(this.b.length);
                return this;
            }
            Object[] arr_object = mutabilityOwnership0 == this.c ? this.b : new Object[Math.min(this.b.length, trieNode0.b.length)];
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
                        return this.h(0, arr_object, mutabilityOwnership0);
                    }
                    Object[] arr_object2 = Arrays.copyOf(arr_object, v2);
                    Intrinsics.checkNotNullExpressionValue(arr_object2, "copyOf(...)");
                    return this.h(0, arr_object2, mutabilityOwnership0);
                }
                return trieNode0;
            }
            return this;
        }
        int v3 = this.a & trieNode0.a;
        if(v3 == 0) {
            return trieNode1;
        }
        TrieNode trieNode2 = !Intrinsics.areEqual(this.c, persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable()) || v3 != this.a ? new TrieNode(v3, new Object[Integer.bitCount(v3)], persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable()) : this;
        int v4 = v3;
        int v5 = 0;
        int v6 = 0;
        while(v4 != 0) {
            int v7 = Integer.lowestOneBit(v4);
            TrieNode trieNode3 = this.b[this.indexOfCellAt$kotlinx_collections_immutable(v7)];
            Object object0 = trieNode0.b[trieNode0.indexOfCellAt$kotlinx_collections_immutable(v7)];
            boolean z = trieNode3 instanceof TrieNode;
            boolean z1 = object0 instanceof TrieNode;
            if(z && z1) {
                Intrinsics.checkNotNull(trieNode3, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                trieNode3 = trieNode3.mutableRetainAll(((TrieNode)object0), v + 5, deltaCounter0, persistentHashSetBuilder0);
            }
            else if(z) {
                Intrinsics.checkNotNull(trieNode3, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
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
                    Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    if(((TrieNode)object0).contains((trieNode3 == null ? 0 : trieNode3.hashCode()), trieNode3, v + 5)) {
                        deltaCounter0.plusAssign(1);
                        goto label_71;
                    }
                }
                else if(Intrinsics.areEqual(trieNode3, object0)) {
                    deltaCounter0.plusAssign(1);
                    goto label_71;
                }
                trieNode3 = trieNode1;
            }
        label_71:
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
            if(trieNode2.c(this)) {
                return this;
            }
            return trieNode2.c(trieNode0) ? trieNode0 : trieNode2;
        }
        if(v8 == 1 && v != 0) {
            TrieNode trieNode4 = trieNode2.b[trieNode2.indexOfCellAt$kotlinx_collections_immutable(v5)];
            return trieNode4 instanceof TrieNode ? new TrieNode(v5, new Object[]{trieNode4}, persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable()) : trieNode4;
        }
        Object[] arr_object3 = new Object[v8];
        Object[] arr_object4 = trieNode2.b;
        int v10 = 0;
        for(int v9 = 0; v9 < arr_object4.length; ++v9) {
            if(arr_object4[v9] != TrieNode.Companion.getEMPTY$kotlinx_collections_immutable()) {
                arr_object3[v10] = arr_object4[v9];
                ++v10;
            }
        }
        return new TrieNode(v5, arr_object3, persistentHashSetBuilder0.getOwnership$kotlinx_collections_immutable());
    }

    @NotNull
    public final TrieNode remove(int v, Object object0, int v1) {
        TrieNode trieNode1;
        int v2 = v >> v1 & 0x1F;
        if(this.d(1 << v2)) {
            return this;
        }
        int v3 = this.indexOfCellAt$kotlinx_collections_immutable(1 << v2);
        Object object1 = this.b[v3];
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.f(v3);
            if(v1 == 30) {
                int v4 = ArraysKt___ArraysKt.indexOf(trieNode0.b, object0);
                if(v4 != -1) {
                    trieNode1 = trieNode0.h(0, TrieNodeKt.access$removeCellAtIndex(trieNode0.b, v4), null);
                    return trieNode0 == trieNode1 ? this : this.b(v3, trieNode1, null);
                }
                return this;
            }
            trieNode1 = trieNode0.remove(v, object0, v1 + 5);
            return trieNode0 == trieNode1 ? this : this.b(v3, trieNode1, null);
        }
        return Intrinsics.areEqual(object0, object1) ? this.h(this.a ^ 1 << v2, TrieNodeKt.access$removeCellAtIndex(this.b, v3), null) : this;
    }

    public final void setBitmap(int v) {
        this.a = v;
    }

    public final void setBuffer(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<set-?>");
        this.b = arr_object;
    }

    public final void setOwnedBy(@Nullable MutabilityOwnership mutabilityOwnership0) {
        this.c = mutabilityOwnership0;
    }
}

