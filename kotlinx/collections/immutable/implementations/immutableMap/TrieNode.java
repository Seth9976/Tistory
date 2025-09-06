package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.c;
import kotlinx.collections.immutable.internal.DeltaCounter;
import kotlinx.collections.immutable.internal.MutabilityOwnership;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u0000 N*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002NOB1\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u000E\u0010\b\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\u000B\u0010\fB)\b\u0016\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u000E\u0010\b\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u00A2\u0006\u0004\b\u000B\u0010\rJ\u000F\u0010\u0010\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0015\u001A\u00020\u00122\u0006\u0010\u0011\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001A\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u0019\u0010\u0017J#\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001A\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJ%\u0010!\u001A\u00020\u00122\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001F\u001A\u00028\u00002\u0006\u0010 \u001A\u00020\u0004\u00A2\u0006\u0004\b!\u0010\"J\'\u0010#\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001F\u001A\u00028\u00002\u0006\u0010 \u001A\u00020\u0004\u00A2\u0006\u0004\b#\u0010$JQ\u0010*\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010%\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010 \u001A\u00020\u00042\u0006\u0010\'\u001A\u00020&2\u0012\u0010)\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(\u00A2\u0006\u0004\b*\u0010+J;\u0010.\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010-2\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001F\u001A\u00028\u00002\u0006\u0010,\u001A\u00028\u00012\u0006\u0010 \u001A\u00020\u0004\u00A2\u0006\u0004\b.\u0010/JM\u00100\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001F\u001A\u00028\u00002\u0006\u0010,\u001A\u00028\u00012\u0006\u0010 \u001A\u00020\u00042\u0012\u0010)\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(\u00A2\u0006\u0004\b0\u00101J3\u00102\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001F\u001A\u00028\u00002\u0006\u0010 \u001A\u00020\u0004\u00A2\u0006\u0004\b2\u00103JG\u00104\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001F\u001A\u00028\u00002\u0006\u0010 \u001A\u00020\u00042\u0012\u0010)\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(\u00A2\u0006\u0004\b4\u00105J;\u00102\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001F\u001A\u00028\u00002\u0006\u0010,\u001A\u00028\u00012\u0006\u0010 \u001A\u00020\u0004\u00A2\u0006\u0004\b2\u00106JO\u00104\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001F\u001A\u00028\u00002\u0006\u0010,\u001A\u00028\u00012\u0006\u0010 \u001A\u00020\u00042\u0012\u0010)\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(\u00A2\u0006\u0004\b4\u00101JI\u0010>\u001A\u00020\u0012\"\u0004\b\u0002\u00107\"\u0004\b\u0003\u001082\u0012\u00109\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0018\u0010;\u001A\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00120:H\u0000\u00A2\u0006\u0004\b<\u0010=J\u0093\u0001\u0010H\u001A\u00020D2\u0081\u0001\u0010E\u001A}\u0012\u001F\u0012\u001D\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u00A2\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(B\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(C\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020D0?H\u0000\u00A2\u0006\u0004\bF\u0010GR4\u0010\b\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u000E\u0010I\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00078\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010M\u00A8\u0006P"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "K", "V", "", "", "dataMap", "nodeMap", "", "buffer", "Lkotlinx/collections/immutable/internal/MutabilityOwnership;", "ownedBy", "<init>", "(II[Ljava/lang/Object;Lkotlinx/collections/immutable/internal/MutabilityOwnership;)V", "(II[Ljava/lang/Object;)V", "entryCount$kotlinx_collections_immutable", "()I", "entryCount", "positionMask", "", "hasEntryAt$kotlinx_collections_immutable", "(I)Z", "hasEntryAt", "entryKeyIndex$kotlinx_collections_immutable", "(I)I", "entryKeyIndex", "nodeIndex$kotlinx_collections_immutable", "nodeIndex", "nodeAtIndex$kotlinx_collections_immutable", "(I)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "nodeAtIndex", "keyHash", "key", "shift", "containsKey", "(ILjava/lang/Object;I)Z", "get", "(ILjava/lang/Object;I)Ljava/lang/Object;", "otherNode", "Lkotlinx/collections/immutable/internal/DeltaCounter;", "intersectionCounter", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "mutator", "mutablePutAll", "(Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;ILkotlinx/collections/immutable/internal/DeltaCounter;Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "value", "Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "put", "(ILjava/lang/Object;Ljava/lang/Object;I)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "mutablePut", "(ILjava/lang/Object;Ljava/lang/Object;ILkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "remove", "(ILjava/lang/Object;I)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableRemove", "(ILjava/lang/Object;ILkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(ILjava/lang/Object;Ljava/lang/Object;I)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "K1", "V1", "that", "Lkotlin/Function2;", "equalityComparator", "equalsWith$kotlinx_collections_immutable", "(Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;Lkotlin/jvm/functions/Function2;)Z", "equalsWith", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "node", "hash", "", "visitor", "accept$kotlinx_collections_immutable", "(Lkotlin/jvm/functions/Function5;)V", "accept", "<set-?>", "d", "[Ljava/lang/Object;", "getBuffer$kotlinx_collections_immutable", "()[Ljava/lang/Object;", "Companion", "ModificationResult", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nkotlinx/collections/immutable/implementations/immutableMap/TrieNode\n+ 2 ForEachOneBit.kt\nkotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 3 TrieNode.kt\nkotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,908:1\n10#2,9:909\n10#2,9:918\n10#2,9:927\n83#3:936\n1#4:937\n1726#5,3:938\n26#6:941\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nkotlinx/collections/immutable/implementations/immutableMap/TrieNode\n*L\n614#1:909,9\n631#1:918,9\n635#1:927,9\n683#1:936\n683#1:937\n857#1:938,3\n906#1:941\n*E\n"})
public final class TrieNode {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R&\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;", "", "Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "", "EMPTY", "Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getEMPTY$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final TrieNode getEMPTY$kotlinx_collections_immutable() {
            return TrieNode.e;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B#\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJK\u0010\f\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002*\u0010\u000B\u001A&\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00040\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR.\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "K", "V", "", "Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", "", "sizeDelta", "<init>", "(Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "Lkotlin/Function1;", "operation", "replaceNode", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "a", "Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getNode", "()Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode", "(Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "b", "I", "getSizeDelta", "()I", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nkotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,908:1\n1#2:909\n*E\n"})
    public static final class ModificationResult {
        public TrieNode a;
        public final int b;

        public ModificationResult(@NotNull TrieNode trieNode0, int v) {
            Intrinsics.checkNotNullParameter(trieNode0, "node");
            super();
            this.a = trieNode0;
            this.b = v;
        }

        @NotNull
        public final TrieNode getNode() {
            return this.a;
        }

        public final int getSizeDelta() {
            return this.b;
        }

        @NotNull
        public final ModificationResult replaceNode(@NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(function10, "operation");
            this.setNode(((TrieNode)function10.invoke(this.getNode())));
            return this;
        }

        public final void setNode(@NotNull TrieNode trieNode0) {
            Intrinsics.checkNotNullParameter(trieNode0, "<set-?>");
            this.a = trieNode0;
        }
    }

    @NotNull
    public static final Companion Companion;
    public int a;
    public int b;
    public final MutabilityOwnership c;
    public Object[] d;
    public static final TrieNode e;

    static {
        TrieNode.Companion = new Companion(null);
        TrieNode.e = new TrieNode(0, 0, new Object[0]);
    }

    public TrieNode(int v, int v1, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "buffer");
        this(v, v1, arr_object, null);
    }

    public TrieNode(int v, int v1, @NotNull Object[] arr_object, @Nullable MutabilityOwnership mutabilityOwnership0) {
        Intrinsics.checkNotNullParameter(arr_object, "buffer");
        super();
        this.a = v;
        this.b = v1;
        this.c = mutabilityOwnership0;
        this.d = arr_object;
    }

    public final void a(Function5 function50, int v, int v1) {
        function50.invoke(this, v1, v, this.a, this.b);
        for(int v2 = this.b; v2 != 0; v2 -= v3) {
            int v3 = Integer.lowestOneBit(v2);
            this.nodeAtIndex$kotlinx_collections_immutable(this.nodeIndex$kotlinx_collections_immutable(v3)).a(function50, (Integer.numberOfTrailingZeros(v3) << v1) + v, v1 + 5);
        }
    }

    public final void accept$kotlinx_collections_immutable(@NotNull Function5 function50) {
        Intrinsics.checkNotNullParameter(function50, "visitor");
        this.a(function50, 0, 0);
    }

    public final Object[] b(int v, int v1, int v2, Object object0, Object object1, int v3, MutabilityOwnership mutabilityOwnership0) {
        Object object2 = this.d[v];
        TrieNode trieNode0 = TrieNode.g((object2 == null ? 0 : object2.hashCode()), object2, this.n(v), v2, object0, object1, v3 + 5, mutabilityOwnership0);
        return TrieNodeKt.access$replaceEntryWithNode(this.d, v, this.nodeIndex$kotlinx_collections_immutable(v1) + 1, trieNode0);
    }

    public final int c() {
        if(this.b == 0) {
            return this.d.length / 2;
        }
        int v = Integer.bitCount(this.a);
        for(int v1 = v * 2; v1 < this.d.length; ++v1) {
            v += this.nodeAtIndex$kotlinx_collections_immutable(v1).c();
        }
        return v;
    }

    public final boolean containsKey(int v, Object object0, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.hasEntryAt$kotlinx_collections_immutable(1 << v2)) {
            return Intrinsics.areEqual(object0, this.d[this.entryKeyIndex$kotlinx_collections_immutable(1 << v2)]);
        }
        if(this.f(1 << v2)) {
            TrieNode trieNode0 = this.nodeAtIndex$kotlinx_collections_immutable(this.nodeIndex$kotlinx_collections_immutable(1 << v2));
            return v1 == 30 ? trieNode0.d(object0) != -1 : trieNode0.containsKey(v, object0, v1 + 5);
        }
        return false;
    }

    public final int d(Object object0) {
        IntProgression intProgression0 = c.step(c.until(0, this.d.length), 2);
        int v = intProgression0.getFirst();
        int v1 = intProgression0.getLast();
        int v2 = intProgression0.getStep();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(Intrinsics.areEqual(object0, this.d[v])) {
                    return v;
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        return -1;
    }

    public final boolean e(TrieNode trieNode0) {
        if(this == trieNode0) {
            return true;
        }
        if(this.b != trieNode0.b) {
            return false;
        }
        if(this.a != trieNode0.a) {
            return false;
        }
        for(int v = 0; v < this.d.length; ++v) {
            if(this.d[v] != trieNode0.d[v]) {
                return false;
            }
        }
        return true;
    }

    public final int entryCount$kotlinx_collections_immutable() {
        return Integer.bitCount(this.a);
    }

    public final int entryKeyIndex$kotlinx_collections_immutable(int v) {
        return Integer.bitCount(v - 1 & this.a) * 2;
    }

    public final boolean equalsWith$kotlinx_collections_immutable(@NotNull TrieNode trieNode0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(trieNode0, "that");
        Intrinsics.checkNotNullParameter(function20, "equalityComparator");
        if(this == trieNode0) {
            return true;
        }
        int v = this.a;
        if(v == trieNode0.a) {
            int v1 = this.b;
            if(v1 == trieNode0.b) {
                if(v == 0 && v1 == 0) {
                    Object[] arr_object = this.d;
                    if(arr_object.length != trieNode0.d.length) {
                        return false;
                    }
                    IntProgression intProgression0 = c.step(c.until(0, arr_object.length), 2);
                    if(!(intProgression0 instanceof Collection) || !((Collection)intProgression0).isEmpty()) {
                        Iterator iterator0 = intProgression0.iterator();
                        while(iterator0.hasNext()) {
                            int v2 = ((IntIterator)iterator0).nextInt();
                            Object object0 = trieNode0.d[v2];
                            Object object1 = trieNode0.n(v2);
                            int v3 = this.d(object0);
                            if(!(v3 == -1 ? false : ((Boolean)function20.invoke(this.n(v3), object1)).booleanValue())) {
                                return false;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    return true;
                }
                int v4 = Integer.bitCount(v) * 2;
                IntProgression intProgression1 = c.step(c.until(0, v4), 2);
                int v5 = intProgression1.getFirst();
                int v6 = intProgression1.getLast();
                int v7 = intProgression1.getStep();
                if(v7 > 0 && v5 <= v6 || v7 < 0 && v6 <= v5) {
                    while(true) {
                        if(!Intrinsics.areEqual(this.d[v5], trieNode0.d[v5])) {
                            return false;
                        }
                        if(!((Boolean)function20.invoke(this.n(v5), trieNode0.n(v5))).booleanValue()) {
                            return false;
                        }
                        if(v5 == v6) {
                            break;
                        }
                        v5 += v7;
                    }
                }
                while(v4 < this.d.length) {
                    if(!this.nodeAtIndex$kotlinx_collections_immutable(v4).equalsWith$kotlinx_collections_immutable(trieNode0.nodeAtIndex$kotlinx_collections_immutable(v4), function20)) {
                        return false;
                    }
                    ++v4;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean f(int v) {
        return (v & this.b) != 0;
    }

    public static TrieNode g(int v, Object object0, Object object1, int v1, Object object2, Object object3, int v2, MutabilityOwnership mutabilityOwnership0) {
        if(v2 > 30) {
            return new TrieNode(0, 0, new Object[]{object0, object1, object2, object3}, mutabilityOwnership0);
        }
        int v3 = v >> v2 & 0x1F;
        int v4 = v1 >> v2 & 0x1F;
        if(v3 != v4) {
            return v3 >= v4 ? new TrieNode(1 << v3 | 1 << v4, 0, new Object[]{object2, object3, object0, object1}, mutabilityOwnership0) : new TrieNode(1 << v3 | 1 << v4, 0, new Object[]{object0, object1, object2, object3}, mutabilityOwnership0);
        }
        return new TrieNode(0, 1 << v3, new Object[]{TrieNode.g(v, object0, object1, v1, object2, object3, v2 + 5, mutabilityOwnership0)}, mutabilityOwnership0);
    }

    @Nullable
    public final Object get(int v, Object object0, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.hasEntryAt$kotlinx_collections_immutable(1 << v2)) {
            int v3 = this.entryKeyIndex$kotlinx_collections_immutable(1 << v2);
            return Intrinsics.areEqual(object0, this.d[v3]) ? this.n(v3) : null;
        }
        if(this.f(1 << v2)) {
            TrieNode trieNode0 = this.nodeAtIndex$kotlinx_collections_immutable(this.nodeIndex$kotlinx_collections_immutable(1 << v2));
            if(v1 == 30) {
                int v4 = trieNode0.d(object0);
                return v4 == -1 ? null : trieNode0.n(v4);
            }
            return trieNode0.get(v, object0, v1 + 5);
        }
        return null;
    }

    @NotNull
    public final Object[] getBuffer$kotlinx_collections_immutable() {
        return this.d;
    }

    public final TrieNode h(int v, PersistentHashMapBuilder persistentHashMapBuilder0) {
        persistentHashMapBuilder0.setSize(persistentHashMapBuilder0.size() - 1);
        persistentHashMapBuilder0.setOperationResult$kotlinx_collections_immutable(this.n(v));
        if(this.d.length == 2) {
            return null;
        }
        if(this.c == persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable()) {
            this.d = TrieNodeKt.access$removeEntryAtIndex(this.d, v);
            return this;
        }
        return new TrieNode(0, 0, TrieNodeKt.access$removeEntryAtIndex(this.d, v), persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable());
    }

    public final boolean hasEntryAt$kotlinx_collections_immutable(int v) {
        return (v & this.a) != 0;
    }

    public final TrieNode i(int v, int v1, PersistentHashMapBuilder persistentHashMapBuilder0) {
        persistentHashMapBuilder0.setSize(persistentHashMapBuilder0.size() - 1);
        persistentHashMapBuilder0.setOperationResult$kotlinx_collections_immutable(this.n(v));
        if(this.d.length == 2) {
            return null;
        }
        if(this.c == persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable()) {
            this.d = TrieNodeKt.access$removeEntryAtIndex(this.d, v);
            this.a ^= v1;
            return this;
        }
        Object[] arr_object = TrieNodeKt.access$removeEntryAtIndex(this.d, v);
        return new TrieNode(v1 ^ this.a, this.b, arr_object, persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable());
    }

    public final TrieNode j(TrieNode trieNode0, TrieNode trieNode1, int v, int v1, MutabilityOwnership mutabilityOwnership0) {
        if(trieNode1 == null) {
            Object[] arr_object = this.d;
            if(arr_object.length == 1) {
                return null;
            }
            if(this.c == mutabilityOwnership0) {
                this.d = TrieNodeKt.access$removeNodeAtIndex(arr_object, v);
                this.b ^= v1;
                return this;
            }
            Object[] arr_object1 = TrieNodeKt.access$removeNodeAtIndex(arr_object, v);
            return new TrieNode(this.a, v1 ^ this.b, arr_object1, mutabilityOwnership0);
        }
        return trieNode0 == trieNode1 ? this : this.k(v, trieNode1, mutabilityOwnership0);
    }

    public final TrieNode k(int v, TrieNode trieNode0, MutabilityOwnership mutabilityOwnership0) {
        Object[] arr_object = this.d;
        if(arr_object.length == 1 && trieNode0.d.length == 2 && trieNode0.b == 0) {
            trieNode0.a = this.b;
            return trieNode0;
        }
        if(this.c == mutabilityOwnership0) {
            arr_object[v] = trieNode0;
            return this;
        }
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(...)");
        arr_object1[v] = trieNode0;
        return new TrieNode(this.a, this.b, arr_object1, mutabilityOwnership0);
    }

    public final TrieNode l(TrieNode trieNode0, TrieNode trieNode1, int v, int v1) {
        if(trieNode1 == null) {
            Object[] arr_object = this.d;
            if(arr_object.length == 1) {
                return null;
            }
            Object[] arr_object1 = TrieNodeKt.access$removeNodeAtIndex(arr_object, v);
            return new TrieNode(this.a, v1 ^ this.b, arr_object1);
        }
        return trieNode0 == trieNode1 ? this : this.m(v, v1, trieNode1);
    }

    public final TrieNode m(int v, int v1, TrieNode trieNode0) {
        Object[] arr_object = trieNode0.d;
        if(arr_object.length == 2 && trieNode0.b == 0) {
            if(this.d.length == 1) {
                trieNode0.a = this.b;
                return trieNode0;
            }
            Object[] arr_object1 = TrieNodeKt.access$replaceNodeWithEntry(this.d, v, this.entryKeyIndex$kotlinx_collections_immutable(v1), arr_object[0], arr_object[1]);
            return new TrieNode(this.a ^ v1, v1 ^ this.b, arr_object1);
        }
        Object[] arr_object2 = Arrays.copyOf(this.d, this.d.length);
        Intrinsics.checkNotNullExpressionValue(arr_object2, "copyOf(...)");
        arr_object2[v] = trieNode0;
        return new TrieNode(this.a, this.b, arr_object2);
    }

    @NotNull
    public final TrieNode mutablePut(int v, Object object0, Object object1, int v1, @NotNull PersistentHashMapBuilder persistentHashMapBuilder0) {
        TrieNode trieNode1;
        Intrinsics.checkNotNullParameter(persistentHashMapBuilder0, "mutator");
        int v2 = v >> v1 & 0x1F;
        MutabilityOwnership mutabilityOwnership0 = this.c;
        if(this.hasEntryAt$kotlinx_collections_immutable(1 << v2)) {
            int v3 = this.entryKeyIndex$kotlinx_collections_immutable(1 << v2);
            if(Intrinsics.areEqual(object0, this.d[v3])) {
                persistentHashMapBuilder0.setOperationResult$kotlinx_collections_immutable(this.n(v3));
                if(this.n(v3) == object1) {
                    return this;
                }
                if(mutabilityOwnership0 == persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable()) {
                    this.d[v3 + 1] = object1;
                    return this;
                }
                persistentHashMapBuilder0.setModCount$kotlinx_collections_immutable(persistentHashMapBuilder0.getModCount$kotlinx_collections_immutable() + 1);
                Object[] arr_object = Arrays.copyOf(this.d, this.d.length);
                Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(...)");
                arr_object[v3 + 1] = object1;
                return new TrieNode(this.a, this.b, arr_object, persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable());
            }
            persistentHashMapBuilder0.setSize(persistentHashMapBuilder0.size() + 1);
            MutabilityOwnership mutabilityOwnership1 = persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable();
            if(mutabilityOwnership0 == mutabilityOwnership1) {
                this.d = this.b(v3, 1 << v2, v, object0, object1, v1, mutabilityOwnership1);
                this.a ^= 1 << v2;
                this.b |= 1 << v2;
                return this;
            }
            Object[] arr_object1 = this.b(v3, 1 << v2, v, object0, object1, v1, mutabilityOwnership1);
            return new TrieNode(this.a ^ 1 << v2, this.b | 1 << v2, arr_object1, mutabilityOwnership1);
        }
        if(this.f(1 << v2)) {
            int v4 = this.nodeIndex$kotlinx_collections_immutable(1 << v2);
            TrieNode trieNode0 = this.nodeAtIndex$kotlinx_collections_immutable(v4);
            if(v1 == 30) {
                int v5 = trieNode0.d(object0);
                if(v5 != -1) {
                    persistentHashMapBuilder0.setOperationResult$kotlinx_collections_immutable(trieNode0.n(v5));
                    if(trieNode0.c == persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable()) {
                        trieNode0.d[v5 + 1] = object1;
                        return this;
                    }
                    persistentHashMapBuilder0.setModCount$kotlinx_collections_immutable(persistentHashMapBuilder0.getModCount$kotlinx_collections_immutable() + 1);
                    Object[] arr_object2 = Arrays.copyOf(trieNode0.d, trieNode0.d.length);
                    Intrinsics.checkNotNullExpressionValue(arr_object2, "copyOf(...)");
                    arr_object2[v5 + 1] = object1;
                    trieNode1 = new TrieNode(0, 0, arr_object2, persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable());
                    return trieNode0 == trieNode1 ? this : this.k(v4, trieNode1, persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable());
                }
                persistentHashMapBuilder0.setSize(persistentHashMapBuilder0.size() + 1);
                trieNode1 = new TrieNode(0, 0, TrieNodeKt.access$insertEntryAtIndex(trieNode0.d, 0, object0, object1), persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable());
                return trieNode0 == trieNode1 ? this : this.k(v4, trieNode1, persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable());
            }
            trieNode1 = trieNode0.mutablePut(v, object0, object1, v1 + 5, persistentHashMapBuilder0);
            return trieNode0 == trieNode1 ? this : this.k(v4, trieNode1, persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable());
        }
        persistentHashMapBuilder0.setSize(persistentHashMapBuilder0.size() + 1);
        MutabilityOwnership mutabilityOwnership2 = persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable();
        int v6 = this.entryKeyIndex$kotlinx_collections_immutable(1 << v2);
        if(mutabilityOwnership0 == mutabilityOwnership2) {
            this.d = TrieNodeKt.access$insertEntryAtIndex(this.d, v6, object0, object1);
            this.a |= 1 << v2;
            return this;
        }
        Object[] arr_object3 = TrieNodeKt.access$insertEntryAtIndex(this.d, v6, object0, object1);
        return new TrieNode(this.a | 1 << v2, this.b, arr_object3, mutabilityOwnership2);
    }

    @NotNull
    public final TrieNode mutablePutAll(@NotNull TrieNode trieNode0, int v, @NotNull DeltaCounter deltaCounter0, @NotNull PersistentHashMapBuilder persistentHashMapBuilder0) {
        int v14;
        Object[] arr_object4;
        TrieNode trieNode2;
        Intrinsics.checkNotNullParameter(trieNode0, "otherNode");
        Intrinsics.checkNotNullParameter(deltaCounter0, "intersectionCounter");
        Intrinsics.checkNotNullParameter(persistentHashMapBuilder0, "mutator");
        if(this == trieNode0) {
            deltaCounter0.plusAssign(this.c());
            return this;
        }
        if(v > 30) {
            MutabilityOwnership mutabilityOwnership0 = persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable();
            Object[] arr_object = Arrays.copyOf(this.d, this.d.length + trieNode0.d.length);
            Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(...)");
            int v1 = this.d.length;
            IntProgression intProgression0 = c.step(c.until(0, trieNode0.d.length), 2);
            int v2 = intProgression0.getFirst();
            int v3 = intProgression0.getLast();
            int v4 = intProgression0.getStep();
            if(v4 > 0 && v2 <= v3 || v4 < 0 && v3 <= v2) {
                while(true) {
                    if(this.d(trieNode0.d[v2]) == -1) {
                        Object[] arr_object1 = trieNode0.d;
                        arr_object[v1] = arr_object1[v2];
                        arr_object[v1 + 1] = arr_object1[v2 + 1];
                        v1 += 2;
                    }
                    else {
                        deltaCounter0.setCount(deltaCounter0.getCount() + 1);
                    }
                    if(v2 == v3) {
                        break;
                    }
                    v2 += v4;
                }
            }
            if(v1 == this.d.length) {
                return this;
            }
            if(v1 != trieNode0.d.length) {
                if(v1 == arr_object.length) {
                    return new TrieNode(0, 0, arr_object, mutabilityOwnership0);
                }
                Object[] arr_object2 = Arrays.copyOf(arr_object, v1);
                Intrinsics.checkNotNullExpressionValue(arr_object2, "copyOf(...)");
                return new TrieNode(0, 0, arr_object2, mutabilityOwnership0);
            }
            return trieNode0;
        }
        int v5 = this.b | trieNode0.b;
        int v6 = this.a & trieNode0.a;
        int v7 = (this.a ^ trieNode0.a) & ~v5;
        while(v6 != 0) {
            int v8 = Integer.lowestOneBit(v6);
            if(Intrinsics.areEqual(this.d[this.entryKeyIndex$kotlinx_collections_immutable(v8)], trieNode0.d[trieNode0.entryKeyIndex$kotlinx_collections_immutable(v8)])) {
                v7 |= v8;
            }
            else {
                v5 |= v8;
            }
            v6 ^= v8;
        }
        if((v5 & v7) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        TrieNode trieNode1 = !Intrinsics.areEqual(this.c, persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable()) || this.a != v7 || this.b != v5 ? new TrieNode(v7, v5, new Object[Integer.bitCount(v5) + Integer.bitCount(v7) * 2]) : this;
        int v9 = v5;
        int v10 = 0;
        while(v9 != 0) {
            int v11 = Integer.lowestOneBit(v9);
            Object[] arr_object3 = trieNode1.d;
            int v12 = arr_object3.length - 1 - v10;
            if(this.f(v11)) {
                trieNode2 = this.nodeAtIndex$kotlinx_collections_immutable(this.nodeIndex$kotlinx_collections_immutable(v11));
                if(trieNode0.f(v11)) {
                    trieNode2 = trieNode2.mutablePutAll(trieNode0.nodeAtIndex$kotlinx_collections_immutable(trieNode0.nodeIndex$kotlinx_collections_immutable(v11)), v + 5, deltaCounter0, persistentHashMapBuilder0);
                }
                else if(trieNode0.hasEntryAt$kotlinx_collections_immutable(v11)) {
                    int v13 = trieNode0.entryKeyIndex$kotlinx_collections_immutable(v11);
                    Object object0 = trieNode0.d[v13];
                    arr_object4 = arr_object3;
                    trieNode2 = trieNode2.mutablePut((object0 == null ? 0 : object0.hashCode()), object0, trieNode0.n(v13), v + 5, persistentHashMapBuilder0);
                    deltaCounter0.setCount(deltaCounter0.getCount() + 1);
                    v14 = v11;
                    goto label_88;
                }
                arr_object4 = arr_object3;
                v14 = v11;
            }
            else {
                arr_object4 = arr_object3;
                v14 = v11;
                if(trieNode0.f(v14)) {
                    trieNode2 = trieNode0.nodeAtIndex$kotlinx_collections_immutable(trieNode0.nodeIndex$kotlinx_collections_immutable(v14));
                    if(this.hasEntryAt$kotlinx_collections_immutable(v14)) {
                        int v15 = this.entryKeyIndex$kotlinx_collections_immutable(v14);
                        Object object1 = this.d[v15];
                        if(trieNode2.containsKey((object1 == null ? 0 : object1.hashCode()), object1, v + 5)) {
                            deltaCounter0.setCount(deltaCounter0.getCount() + 1);
                        }
                        else {
                            trieNode2 = trieNode2.mutablePut((object1 == null ? 0 : object1.hashCode()), object1, this.n(v15), v + 5, persistentHashMapBuilder0);
                        }
                    }
                }
                else {
                    int v16 = this.entryKeyIndex$kotlinx_collections_immutable(v14);
                    Object object2 = this.d[v16];
                    Object object3 = this.n(v16);
                    int v17 = trieNode0.entryKeyIndex$kotlinx_collections_immutable(v14);
                    Object object4 = trieNode0.d[v17];
                    trieNode2 = TrieNode.g((object2 == null ? 0 : object2.hashCode()), object2, object3, (object4 == null ? 0 : object4.hashCode()), object4, trieNode0.n(v17), v + 5, persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable());
                }
            }
        label_88:
            arr_object4[v12] = trieNode2;
            ++v10;
            v9 ^= v14;
        }
        int v18 = 0;
        while(v7 != 0) {
            int v19 = Integer.lowestOneBit(v7);
            if(trieNode0.hasEntryAt$kotlinx_collections_immutable(v19)) {
                int v21 = trieNode0.entryKeyIndex$kotlinx_collections_immutable(v19);
                Object[] arr_object6 = trieNode1.d;
                arr_object6[v18 * 2] = trieNode0.d[v21];
                arr_object6[v18 * 2 + 1] = trieNode0.n(v21);
                if(this.hasEntryAt$kotlinx_collections_immutable(v19)) {
                    deltaCounter0.setCount(deltaCounter0.getCount() + 1);
                }
            }
            else {
                int v20 = this.entryKeyIndex$kotlinx_collections_immutable(v19);
                Object[] arr_object5 = trieNode1.d;
                arr_object5[v18 * 2] = this.d[v20];
                arr_object5[v18 * 2 + 1] = this.n(v20);
            }
            ++v18;
            v7 ^= v19;
        }
        if(this.e(trieNode1)) {
            return this;
        }
        return trieNode0.e(trieNode1) ? trieNode0 : trieNode1;
    }

    @Nullable
    public final TrieNode mutableRemove(int v, Object object0, int v1, @NotNull PersistentHashMapBuilder persistentHashMapBuilder0) {
        Intrinsics.checkNotNullParameter(persistentHashMapBuilder0, "mutator");
        int v2 = v >> v1 & 0x1F;
        if(this.hasEntryAt$kotlinx_collections_immutable(1 << v2)) {
            int v3 = this.entryKeyIndex$kotlinx_collections_immutable(1 << v2);
            return Intrinsics.areEqual(object0, this.d[v3]) ? this.i(v3, 1 << v2, persistentHashMapBuilder0) : this;
        }
        if(this.f(1 << v2)) {
            int v4 = this.nodeIndex$kotlinx_collections_immutable(1 << v2);
            TrieNode trieNode0 = this.nodeAtIndex$kotlinx_collections_immutable(v4);
            if(v1 == 30) {
                int v5 = trieNode0.d(object0);
                return v5 == -1 ? this.j(trieNode0, trieNode0, v4, 1 << v2, persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable()) : this.j(trieNode0, trieNode0.h(v5, persistentHashMapBuilder0), v4, 1 << v2, persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable());
            }
            return this.j(trieNode0, trieNode0.mutableRemove(v, object0, v1 + 5, persistentHashMapBuilder0), v4, 1 << v2, persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable());
        }
        return this;
    }

    @Nullable
    public final TrieNode mutableRemove(int v, Object object0, Object object1, int v1, @NotNull PersistentHashMapBuilder persistentHashMapBuilder0) {
        Intrinsics.checkNotNullParameter(persistentHashMapBuilder0, "mutator");
        int v2 = v >> v1 & 0x1F;
        if(this.hasEntryAt$kotlinx_collections_immutable(1 << v2)) {
            int v3 = this.entryKeyIndex$kotlinx_collections_immutable(1 << v2);
            return !Intrinsics.areEqual(object0, this.d[v3]) || !Intrinsics.areEqual(object1, this.n(v3)) ? this : this.i(v3, 1 << v2, persistentHashMapBuilder0);
        }
        if(this.f(1 << v2)) {
            int v4 = this.nodeIndex$kotlinx_collections_immutable(1 << v2);
            TrieNode trieNode0 = this.nodeAtIndex$kotlinx_collections_immutable(v4);
            if(v1 == 30) {
                int v5 = trieNode0.d(object0);
                return v5 == -1 || !Intrinsics.areEqual(object1, trieNode0.n(v5)) ? this.j(trieNode0, trieNode0, v4, 1 << v2, persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable()) : this.j(trieNode0, trieNode0.h(v5, persistentHashMapBuilder0), v4, 1 << v2, persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable());
            }
            return this.j(trieNode0, trieNode0.mutableRemove(v, object0, object1, v1 + 5, persistentHashMapBuilder0), v4, 1 << v2, persistentHashMapBuilder0.getOwnership$kotlinx_collections_immutable());
        }
        return this;
    }

    public final Object n(int v) {
        return this.d[v + 1];
    }

    @NotNull
    public final TrieNode nodeAtIndex$kotlinx_collections_immutable(int v) {
        Object object0 = this.d[v];
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode)object0;
    }

    public final int nodeIndex$kotlinx_collections_immutable(int v) {
        return this.d.length - 1 - Integer.bitCount(v - 1 & this.b);
    }

    @Nullable
    public final ModificationResult put(int v, Object object0, Object object1, int v1) {
        ModificationResult trieNode$ModificationResult0;
        int v2 = v >> v1 & 0x1F;
        if(this.hasEntryAt$kotlinx_collections_immutable(1 << v2)) {
            int v3 = this.entryKeyIndex$kotlinx_collections_immutable(1 << v2);
            if(Intrinsics.areEqual(object0, this.d[v3])) {
                if(this.n(v3) == object1) {
                    return null;
                }
                Object[] arr_object = Arrays.copyOf(this.d, this.d.length);
                Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(...)");
                arr_object[v3 + 1] = object1;
                return new ModificationResult(new TrieNode(this.a, this.b, arr_object), 0);
            }
            Object[] arr_object1 = this.b(v3, 1 << v2, v, object0, object1, v1, null);
            return new ModificationResult(new TrieNode(this.a ^ 1 << v2, this.b | 1 << v2, arr_object1), 1);
        }
        if(this.f(1 << v2)) {
            int v4 = this.nodeIndex$kotlinx_collections_immutable(1 << v2);
            TrieNode trieNode0 = this.nodeAtIndex$kotlinx_collections_immutable(v4);
            if(v1 == 30) {
                int v5 = trieNode0.d(object0);
                if(v5 == -1) {
                    trieNode$ModificationResult0 = new ModificationResult(new TrieNode(0, 0, TrieNodeKt.access$insertEntryAtIndex(trieNode0.d, 0, object0, object1)), 1);
                }
                else if(object1 == trieNode0.n(v5)) {
                    trieNode$ModificationResult0 = null;
                }
                else {
                    Object[] arr_object2 = Arrays.copyOf(trieNode0.d, trieNode0.d.length);
                    Intrinsics.checkNotNullExpressionValue(arr_object2, "copyOf(...)");
                    arr_object2[v5 + 1] = object1;
                    trieNode$ModificationResult0 = new ModificationResult(new TrieNode(0, 0, arr_object2), 0);
                }
                if(trieNode$ModificationResult0 == null) {
                    return null;
                }
            }
            else {
                trieNode$ModificationResult0 = trieNode0.put(v, object0, object1, v1 + 5);
                if(trieNode$ModificationResult0 == null) {
                    return null;
                }
            }
            trieNode$ModificationResult0.setNode(this.m(v4, 1 << v2, trieNode$ModificationResult0.getNode()));
            return trieNode$ModificationResult0;
        }
        Object[] arr_object3 = TrieNodeKt.access$insertEntryAtIndex(this.d, this.entryKeyIndex$kotlinx_collections_immutable(1 << v2), object0, object1);
        return new ModificationResult(new TrieNode(this.a | 1 << v2, this.b, arr_object3), 1);
    }

    @Nullable
    public final TrieNode remove(int v, Object object0, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.hasEntryAt$kotlinx_collections_immutable(1 << v2)) {
            int v3 = this.entryKeyIndex$kotlinx_collections_immutable(1 << v2);
            if(Intrinsics.areEqual(object0, this.d[v3])) {
                Object[] arr_object = this.d;
                if(arr_object.length != 2) {
                    Object[] arr_object1 = TrieNodeKt.access$removeEntryAtIndex(arr_object, v3);
                    return new TrieNode(this.a ^ 1 << v2, this.b, arr_object1);
                }
                return null;
            }
            return this;
        }
        if(this.f(1 << v2)) {
            int v4 = this.nodeIndex$kotlinx_collections_immutable(1 << v2);
            TrieNode trieNode0 = this.nodeAtIndex$kotlinx_collections_immutable(v4);
            if(v1 == 30) {
                int v5 = trieNode0.d(object0);
                if(v5 != -1) {
                    Object[] arr_object2 = trieNode0.d;
                    return arr_object2.length == 2 ? this.l(trieNode0, null, v4, 1 << v2) : this.l(trieNode0, new TrieNode(0, 0, TrieNodeKt.access$removeEntryAtIndex(arr_object2, v5)), v4, 1 << v2);
                }
                return this.l(trieNode0, trieNode0, v4, 1 << v2);
            }
            return this.l(trieNode0, trieNode0.remove(v, object0, v1 + 5), v4, 1 << v2);
        }
        return this;
    }

    @Nullable
    public final TrieNode remove(int v, Object object0, Object object1, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.hasEntryAt$kotlinx_collections_immutable(1 << v2)) {
            int v3 = this.entryKeyIndex$kotlinx_collections_immutable(1 << v2);
            if(Intrinsics.areEqual(object0, this.d[v3]) && Intrinsics.areEqual(object1, this.n(v3))) {
                Object[] arr_object = this.d;
                if(arr_object.length != 2) {
                    Object[] arr_object1 = TrieNodeKt.access$removeEntryAtIndex(arr_object, v3);
                    return new TrieNode(this.a ^ 1 << v2, this.b, arr_object1);
                }
                return null;
            }
            return this;
        }
        if(this.f(1 << v2)) {
            int v4 = this.nodeIndex$kotlinx_collections_immutable(1 << v2);
            TrieNode trieNode0 = this.nodeAtIndex$kotlinx_collections_immutable(v4);
            if(v1 == 30) {
                int v5 = trieNode0.d(object0);
                if(v5 != -1 && Intrinsics.areEqual(object1, trieNode0.n(v5))) {
                    Object[] arr_object2 = trieNode0.d;
                    return arr_object2.length == 2 ? this.l(trieNode0, null, v4, 1 << v2) : this.l(trieNode0, new TrieNode(0, 0, TrieNodeKt.access$removeEntryAtIndex(arr_object2, v5)), v4, 1 << v2);
                }
                return this.l(trieNode0, trieNode0, v4, 1 << v2);
            }
            return this.l(trieNode0, trieNode0.remove(v, object0, object1, v1 + 5), v4, 1 << v2);
        }
        return this;
    }
}

