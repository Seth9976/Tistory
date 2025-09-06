package androidx.compose.runtime;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b2\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\r\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000E\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0010\u0010\tJ\u0015\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0011\u0010\tJ\u0015\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0012\u0010\tJ\u0015\u0010\u0013\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0014\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0014\u0010\u000FJ\u0017\u0010\u0015\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0015\u0010\u000FJ\u0015\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0017\u001A\u00020\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0018J\u0015\u0010\u0019\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0019\u0010\fJ\u0015\u0010\u001A\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u001A\u0010\fJ\u0015\u0010\u001B\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u001B\u0010\tJ\u0017\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u001C\u0010\u000FJ\u0017\u0010\u001D\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u001D\u0010\u000FJ\u001F\u0010\u001D\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u001E\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u001D\u0010\u001FJ\u000F\u0010 \u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b \u0010!J\r\u0010#\u001A\u00020\"\u00A2\u0006\u0004\b#\u0010$J\r\u0010%\u001A\u00020\"\u00A2\u0006\u0004\b%\u0010$J\r\u0010&\u001A\u00020\"\u00A2\u0006\u0004\b&\u0010$J\r\u0010\'\u001A\u00020\"\u00A2\u0006\u0004\b\'\u0010$J\r\u0010(\u001A\u00020\"\u00A2\u0006\u0004\b(\u0010$J\r\u0010)\u001A\u00020\u0006\u00A2\u0006\u0004\b)\u0010*J\r\u0010+\u001A\u00020\"\u00A2\u0006\u0004\b+\u0010$J\u0015\u0010,\u001A\u00020\"2\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b,\u0010-J\u0015\u0010.\u001A\u00020\"2\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b.\u0010-J\r\u0010/\u001A\u00020\"\u00A2\u0006\u0004\b/\u0010$J\u0013\u00102\u001A\b\u0012\u0004\u0012\u00020100\u00A2\u0006\u0004\b2\u00103J\u000F\u00105\u001A\u000204H\u0016\u00A2\u0006\u0004\b5\u00106J\u0017\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0017\u00107R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010;R$\u0010A\u001A\u00020\n2\u0006\u0010<\u001A\u00020\n8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@R$\u0010E\u001A\u00020\u00062\u0006\u0010<\u001A\u00020\u00068\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010*R$\u0010H\u001A\u00020\u00062\u0006\u0010<\u001A\u00020\u00068\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bF\u0010C\u001A\u0004\bG\u0010*R$\u0010\b\u001A\u00020\u00062\u0006\u0010<\u001A\u00020\u00068\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bI\u0010C\u001A\u0004\bJ\u0010*R$\u0010M\u001A\u00020\n2\u0006\u0010<\u001A\u00020\n8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bK\u0010>\u001A\u0004\bL\u0010@R\u0011\u0010O\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\bN\u0010*R\u0011\u0010Q\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\bP\u0010*R\u0011\u0010\u000B\u001A\u00020\n8F\u00A2\u0006\u0006\u001A\u0004\b\u000B\u0010@R\u0011\u0010\r\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\bR\u0010*R\u0011\u0010S\u001A\u00020\n8F\u00A2\u0006\u0006\u001A\u0004\bS\u0010@R\u0011\u0010U\u001A\u00020\n8F\u00A2\u0006\u0006\u001A\u0004\bT\u0010@R\u0011\u0010\u0010\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\bV\u0010*R\u0011\u0010\u0011\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\bW\u0010*R\u0011\u0010\u0012\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\bX\u0010*R\u0011\u0010Z\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\bY\u0010*R\u0011\u0010\u0013\u001A\u00020\n8F\u00A2\u0006\u0006\u001A\u0004\b[\u0010@R\u0013\u0010\u0014\u001A\u0004\u0018\u00010\u00018F\u00A2\u0006\u0006\u001A\u0004\b\\\u0010!R\u0013\u0010\u0015\u001A\u0004\u0018\u00010\u00018F\u00A2\u0006\u0006\u001A\u0004\b]\u0010!R\u0013\u0010_\u001A\u0004\u0018\u00010\u00018F\u00A2\u0006\u0006\u001A\u0004\b^\u0010!R\u0011\u0010a\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\b`\u0010*R\u0011\u0010c\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\bb\u0010*R\u0011\u0010e\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\bd\u0010*\u00A8\u0006f"}, d2 = {"Landroidx/compose/runtime/SlotReader;", "", "Landroidx/compose/runtime/SlotTable;", "table", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "", "index", "parent", "(I)I", "", "isNode", "(I)Z", "nodeCount", "node", "(I)Ljava/lang/Object;", "groupSize", "groupEnd", "groupKey", "hasObjectKey", "groupObjectKey", "groupAux", "Landroidx/compose/runtime/Anchor;", "anchor", "(Landroidx/compose/runtime/Anchor;)I", "hasMark", "containsMark", "parentOf", "get", "groupGet", "group", "(II)Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "", "beginEmpty", "()V", "endEmpty", "close", "startGroup", "startNode", "skipGroup", "()I", "skipToGroupEnd", "reposition", "(I)V", "restoreParent", "endGroup", "", "Landroidx/compose/runtime/KeyInfo;", "extractKeys", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "(I)Landroidx/compose/runtime/Anchor;", "a", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "<set-?>", "f", "Z", "getClosed", "()Z", "closed", "g", "I", "getCurrentGroup", "currentGroup", "h", "getCurrentEnd", "currentEnd", "i", "getParent", "n", "getHadNext", "hadNext", "getSize", "size", "getSlot", "slot", "getNodeCount", "isGroupEnd", "getInEmpty", "inEmpty", "getGroupSize", "getGroupEnd", "getGroupKey", "getGroupSlotIndex", "groupSlotIndex", "getHasObjectKey", "getGroupObjectKey", "getGroupAux", "getGroupNode", "groupNode", "getParentNodes", "parentNodes", "getRemainingSlots", "remainingSlots", "getGroupSlotCount", "groupSlotCount", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n1#1,4151:1\n33#2,7:4152\n33#2,7:4159\n33#2,7:4166\n33#2,7:4173\n4551#3,7:4180\n4551#3,7:4187\n4551#3,7:4194\n4551#3,7:4201\n4551#3,7:4208\n4018#4,6:4215\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n*L\n1078#1:4152,7\n1149#1:4159,7\n1169#1:4166,7\n1196#1:4173,7\n1205#1:4180,7\n1215#1:4187,7\n1225#1:4194,7\n1244#1:4201,7\n1258#1:4208,7\n1311#1:4215,6\n*E\n"})
public final class SlotReader {
    public static final int $stable = 8;
    public final SlotTable a;
    public final int[] b;
    public final int c;
    public final Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public final IntStack j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    public SlotReader(@NotNull SlotTable slotTable0) {
        this.a = slotTable0;
        this.b = slotTable0.getGroups();
        int v = slotTable0.getGroupsSize();
        this.c = v;
        this.d = slotTable0.getSlots();
        this.e = slotTable0.getSlotsSize();
        this.h = v;
        this.i = -1;
        this.j = new IntStack();
    }

    @NotNull
    public final Anchor anchor(int v) {
        ArrayList arrayList0 = this.a.getAnchors$runtime_release();
        int v1 = SlotTableKt.access$search(arrayList0, v, this.c);
        if(v1 < 0) {
            Anchor anchor0 = new Anchor(v);
            arrayList0.add(-(v1 + 1), anchor0);
            return anchor0;
        }
        return (Anchor)arrayList0.get(v1);
    }

    public static Anchor anchor$default(SlotReader slotReader0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = slotReader0.g;
        }
        return slotReader0.anchor(v);
    }

    public final void beginEmpty() {
        ++this.k;
    }

    public final void close() {
        this.f = true;
        this.a.close$runtime_release(this, null);
    }

    public final boolean containsMark(int v) {
        return SlotTableKt.access$containsMark(this.b, v);
    }

    public final void endEmpty() {
        if(this.k <= 0) {
            PreconditionsKt.throwIllegalArgumentException("Unbalanced begin/end empty");
        }
        --this.k;
    }

    public final void endGroup() {
        if(this.k == 0) {
            if(this.g != this.h) {
                ComposerKt.composeImmediateRuntimeError("endGroup() not called at the end of a group");
            }
            int[] arr_v = this.b;
            int v = SlotTableKt.access$parentAnchor(arr_v, this.i);
            this.i = v;
            int v1 = this.c;
            this.h = v >= 0 ? SlotTableKt.access$groupSize(arr_v, v) + v : v1;
            int v2 = this.j.pop();
            if(v2 < 0) {
                this.l = 0;
                this.m = 0;
                return;
            }
            this.l = v2;
            this.m = v < v1 - 1 ? SlotTableKt.access$dataAnchor(arr_v, v + 1) : this.e;
        }
    }

    @NotNull
    public final List extractKeys() {
        List list0 = new ArrayList();
        if(this.k > 0) {
            return list0;
        }
        int v = this.g;
        for(int v1 = 0; v < this.h; ++v1) {
            ((ArrayList)list0).add(new KeyInfo(SlotTableKt.access$key(this.b, v), (SlotTableKt.access$hasObjectKey(this.b, v) ? this.d[SlotTableKt.access$objectKeyIndex(this.b, v)] : null), v, (SlotTableKt.access$isNode(this.b, v) ? 1 : SlotTableKt.access$nodeCount(this.b, v)), v1));
            v += SlotTableKt.access$groupSize(this.b, v);
        }
        return list0;
    }

    @Nullable
    public final Object get(int v) {
        int v1 = this.l + v;
        return v1 >= this.m ? Composer.Companion.getEmpty() : this.d[v1];
    }

    public final boolean getClosed() {
        return this.f;
    }

    public final int getCurrentEnd() {
        return this.h;
    }

    public final int getCurrentGroup() {
        return this.g;
    }

    @Nullable
    public final Object getGroupAux() {
        int v = this.g;
        if(v < this.h) {
            return SlotTableKt.access$hasAux(this.b, v) ? this.d[SlotTableKt.access$auxIndex(this.b, v)] : Composer.Companion.getEmpty();
        }
        return 0;
    }

    public final int getGroupEnd() {
        return this.h;
    }

    public final int getGroupKey() {
        return this.g >= this.h ? 0 : SlotTableKt.access$key(this.b, this.g);
    }

    @Nullable
    public final Object getGroupNode() {
        int v = this.g;
        if(v < this.h) {
            return SlotTableKt.access$isNode(this.b, v) ? this.d[SlotTableKt.access$nodeIndex(this.b, v)] : Composer.Companion.getEmpty();
        }
        return null;
    }

    @Nullable
    public final Object getGroupObjectKey() {
        int v = this.g;
        if(v < this.h) {
            return SlotTableKt.access$hasObjectKey(this.b, v) ? this.d[SlotTableKt.access$objectKeyIndex(this.b, v)] : null;
        }
        return null;
    }

    public final int getGroupSize() {
        return SlotTableKt.access$groupSize(this.b, this.g);
    }

    public final int getGroupSlotCount() {
        int v = this.g;
        int v1 = SlotTableKt.access$slotAnchor(this.b, v);
        return v + 1 >= this.c ? this.e - v1 : SlotTableKt.access$dataAnchor(this.b, v + 1) - v1;
    }

    public final int getGroupSlotIndex() {
        return this.l - SlotTableKt.access$slotAnchor(this.b, this.i);
    }

    public final boolean getHadNext() {
        return this.n;
    }

    public final boolean getHasObjectKey() {
        return this.g < this.h && SlotTableKt.access$hasObjectKey(this.b, this.g);
    }

    public final boolean getInEmpty() {
        return this.k > 0;
    }

    public final int getNodeCount() {
        return SlotTableKt.access$nodeCount(this.b, this.g);
    }

    public final int getParent() {
        return this.i;
    }

    public final int getParentNodes() {
        return this.i < 0 ? 0 : SlotTableKt.access$nodeCount(this.b, this.i);
    }

    public final int getRemainingSlots() {
        return this.m - this.l;
    }

    public final int getSize() {
        return this.c;
    }

    public final int getSlot() {
        return this.l - SlotTableKt.access$slotAnchor(this.b, this.i);
    }

    @NotNull
    public final SlotTable getTable$runtime_release() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public final Object groupAux(int v) {
        return SlotTableKt.access$hasAux(this.b, v) ? this.d[SlotTableKt.access$auxIndex(this.b, v)] : Composer.Companion.getEmpty();
    }

    public final int groupEnd(int v) {
        return SlotTableKt.access$groupSize(this.b, v) + v;
    }

    @Nullable
    public final Object groupGet(int v) {
        return this.groupGet(this.g, v);
    }

    @Nullable
    public final Object groupGet(int v, int v1) {
        int v2 = SlotTableKt.access$slotAnchor(this.b, v) + v1;
        return v2 >= (v + 1 >= this.c ? this.e : SlotTableKt.access$dataAnchor(this.b, v + 1)) ? Composer.Companion.getEmpty() : this.d[v2];
    }

    public final int groupKey(int v) {
        return SlotTableKt.access$key(this.b, v);
    }

    public final int groupKey(@NotNull Anchor anchor0) {
        if(anchor0.getValid()) {
            int v = this.a.anchorIndex(anchor0);
            return SlotTableKt.access$key(this.b, v);
        }
        return 0;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public final Object groupObjectKey(int v) {
        return SlotTableKt.access$hasObjectKey(this.b, v) ? this.d[SlotTableKt.access$objectKeyIndex(this.b, v)] : null;
    }

    public final int groupSize(int v) {
        return SlotTableKt.access$groupSize(this.b, v);
    }

    public final boolean hasMark(int v) {
        return SlotTableKt.access$hasMark(this.b, v);
    }

    public final boolean hasObjectKey(int v) {
        return SlotTableKt.access$hasObjectKey(this.b, v);
    }

    public final boolean isGroupEnd() {
        return this.getInEmpty() || this.g == this.h;
    }

    public final boolean isNode() {
        return SlotTableKt.access$isNode(this.b, this.g);
    }

    public final boolean isNode(int v) {
        return SlotTableKt.access$isNode(this.b, v);
    }

    @Nullable
    public final Object next() {
        if(this.k <= 0) {
            int v = this.l;
            if(v < this.m) {
                this.n = true;
                this.l = v + 1;
                return this.d[v];
            }
        }
        this.n = false;
        return Composer.Companion.getEmpty();
    }

    @Nullable
    public final Object node(int v) {
        int[] arr_v = this.b;
        if(SlotTableKt.access$isNode(arr_v, v)) {
            return SlotTableKt.access$isNode(arr_v, v) ? this.d[SlotTableKt.access$nodeIndex(arr_v, v)] : Composer.Companion.getEmpty();
        }
        return null;
    }

    public final int nodeCount(int v) {
        return SlotTableKt.access$nodeCount(this.b, v);
    }

    public final int parent(int v) {
        return SlotTableKt.access$parentAnchor(this.b, v);
    }

    public final int parentOf(int v) {
        if(v < 0 || v >= this.c) {
            PreconditionsKt.throwIllegalArgumentException(("Invalid group index " + v));
        }
        return SlotTableKt.access$parentAnchor(this.b, v);
    }

    public final void reposition(int v) {
        if(this.k != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot reposition while in an empty region");
        }
        this.g = v;
        int[] arr_v = this.b;
        int v1 = this.c;
        int v2 = v >= v1 ? -1 : SlotTableKt.access$parentAnchor(arr_v, v);
        this.i = v2;
        this.h = v2 < 0 ? v1 : SlotTableKt.access$groupSize(arr_v, v2) + v2;
        this.l = 0;
        this.m = 0;
    }

    public final void restoreParent(int v) {
        int v1 = SlotTableKt.access$groupSize(this.b, v) + v;
        int v2 = this.g;
        if(v2 < v || v2 > v1) {
            ComposerKt.composeImmediateRuntimeError(("Index " + v + " is not a parent of " + v2));
        }
        this.i = v;
        this.h = v1;
        this.l = 0;
        this.m = 0;
    }

    public final int skipGroup() {
        int v = 1;
        if(this.k != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip while in an empty region");
        }
        int[] arr_v = this.b;
        if(!SlotTableKt.access$isNode(arr_v, this.g)) {
            v = SlotTableKt.access$nodeCount(arr_v, this.g);
        }
        this.g = SlotTableKt.access$groupSize(arr_v, this.g) + this.g;
        return v;
    }

    public final void skipToGroupEnd() {
        if(this.k != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip the enclosing group while in an empty region");
        }
        this.g = this.h;
        this.l = 0;
        this.m = 0;
    }

    public final void startGroup() {
        if(this.k <= 0) {
            int v = this.g;
            int[] arr_v = this.b;
            if(SlotTableKt.access$parentAnchor(arr_v, v) != this.i) {
                PreconditionsKt.throwIllegalArgumentException("Invalid slot table detected");
            }
            int v1 = this.l;
            IntStack intStack0 = this.j;
            if(v1 != 0 || this.m != 0) {
                intStack0.push(v1);
            }
            else {
                intStack0.push(-1);
            }
            this.i = v;
            this.h = SlotTableKt.access$groupSize(arr_v, v) + v;
            this.g = v + 1;
            this.l = SlotTableKt.access$slotAnchor(arr_v, v);
            this.m = v < this.c - 1 ? SlotTableKt.access$dataAnchor(arr_v, v + 1) : this.e;
        }
    }

    public final void startNode() {
        if(this.k <= 0) {
            if(!SlotTableKt.access$isNode(this.b, this.g)) {
                PreconditionsKt.throwIllegalArgumentException("Expected a node group");
            }
            this.startGroup();
        }
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SlotReader(current=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", key=");
        stringBuilder0.append(this.getGroupKey());
        stringBuilder0.append(", parent=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", end=");
        return b.p(stringBuilder0, this.h, ')');
    }
}

