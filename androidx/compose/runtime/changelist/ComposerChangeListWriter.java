package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0000\u0018\u0000 ~2\u00020\u0001:\u0001~B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\r\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\r\u0010\fJ\r\u0010\u000E\u001A\u00020\n\u00A2\u0006\u0004\b\u000E\u0010\u000FJ&\u0010\u0013\u001A\u00020\n2\u0006\u0010\u0010\u001A\u00020\u00042\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\n0\u0011H\u0086\b\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u001E\u0010\u0015\u001A\u00020\n2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\n0\u0011H\u0086\b\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001A\u00020\n2\u0006\u0010\u0018\u001A\u00020\u0017\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001F\u0010\u001C\u001A\u00020\n2\b\u0010\u0018\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u001B\u001A\u00020\b\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\'\u0010 \u001A\u00020\n2\b\u0010\u0018\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u001F\u001A\u00020\u001E2\u0006\u0010\u001B\u001A\u00020\b\u00A2\u0006\u0004\b \u0010!J\u001F\u0010\"\u001A\u00020\n2\u0006\u0010\u001F\u001A\u00020\u001E2\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001A\u00020\n2\u0006\u0010$\u001A\u00020\b\u00A2\u0006\u0004\b%\u0010\fJ\r\u0010&\u001A\u00020\n\u00A2\u0006\u0004\b&\u0010\u000FJ\u0017\u0010(\u001A\u00020\n2\b\u0010\'\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b(\u0010)J\r\u0010*\u001A\u00020\n\u00A2\u0006\u0004\b*\u0010\u000FJ\r\u0010+\u001A\u00020\n\u00A2\u0006\u0004\b+\u0010\u000FJ\r\u0010,\u001A\u00020\n\u00A2\u0006\u0004\b,\u0010\u000FJ\r\u0010-\u001A\u00020\n\u00A2\u0006\u0004\b-\u0010\u000FJ\u001D\u00100\u001A\u00020\n2\u0006\u0010\u001F\u001A\u00020\u001E2\u0006\u0010/\u001A\u00020.\u00A2\u0006\u0004\b0\u00101J%\u00100\u001A\u00020\n2\u0006\u0010\u001F\u001A\u00020\u001E2\u0006\u0010/\u001A\u00020.2\u0006\u00103\u001A\u000202\u00A2\u0006\u0004\b0\u00104J\u0015\u00106\u001A\u00020\n2\u0006\u00105\u001A\u00020\b\u00A2\u0006\u0004\b6\u0010\fJ)\u0010;\u001A\u00020\n2\u0012\u00109\u001A\u000E\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\n072\u0006\u0010:\u001A\u000208\u00A2\u0006\u0004\b;\u0010<J\u0017\u0010>\u001A\u00020\n2\b\u0010=\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b>\u0010)J@\u0010C\u001A\u00020\n\"\u0004\b\u0000\u0010?\"\u0004\b\u0001\u0010@2\u0006\u0010\u0018\u001A\u00028\u00012\u001D\u0010\u0012\u001A\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0A\u00A2\u0006\u0002\bB\u00A2\u0006\u0004\bC\u0010DJ\u001D\u0010F\u001A\u00020\n2\u0006\u0010E\u001A\u00020\b2\u0006\u0010$\u001A\u00020\b\u00A2\u0006\u0004\bF\u0010GJ%\u0010I\u001A\u00020\n2\u0006\u0010/\u001A\u00020\b2\u0006\u0010H\u001A\u00020\b2\u0006\u0010$\u001A\u00020\b\u00A2\u0006\u0004\bI\u0010JJ\r\u0010K\u001A\u00020\n\u00A2\u0006\u0004\bK\u0010\u000FJ\r\u0010L\u001A\u00020\n\u00A2\u0006\u0004\bL\u0010\u000FJ\u001D\u0010N\u001A\u00020\n2\u0006\u0010E\u001A\u00020\b2\u0006\u0010M\u001A\u00020\b\u00A2\u0006\u0004\bN\u0010GJ\r\u0010O\u001A\u00020\n\u00A2\u0006\u0004\bO\u0010\u000FJ\u0017\u0010P\u001A\u00020\n2\b\u0010=\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\bP\u0010)J\u001B\u0010R\u001A\u00020\n2\f\u0010Q\u001A\b\u0012\u0004\u0012\u00020\n0\u0011\u00A2\u0006\u0004\bR\u0010\u0016J\u001D\u0010U\u001A\u00020\n2\u0006\u0010T\u001A\u00020S2\u0006\u0010\u001F\u001A\u00020\u001E\u00A2\u0006\u0004\bU\u0010VJ%\u0010Z\u001A\u00020\n2\u000E\u0010X\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010W2\u0006\u0010Y\u001A\u00020S\u00A2\u0006\u0004\bZ\u0010[J/\u0010a\u001A\u00020\n2\b\u0010]\u001A\u0004\u0018\u00010\\2\u0006\u0010_\u001A\u00020^2\u0006\u0010/\u001A\u00020`2\u0006\u0010H\u001A\u00020`\u00A2\u0006\u0004\ba\u0010bJ%\u0010e\u001A\u00020\n2\u0006\u0010:\u001A\u00020c2\u0006\u0010_\u001A\u00020^2\u0006\u0010d\u001A\u00020`\u00A2\u0006\u0004\be\u0010fJ\r\u0010g\u001A\u00020\n\u00A2\u0006\u0004\bg\u0010\u000FJ!\u0010i\u001A\u00020\n2\u0006\u0010h\u001A\u00020\u00042\n\b\u0002\u0010Y\u001A\u0004\u0018\u00010S\u00A2\u0006\u0004\bi\u0010jJ\r\u0010k\u001A\u00020\n\u00A2\u0006\u0004\bk\u0010\u000FJ\r\u0010l\u001A\u00020\n\u00A2\u0006\u0004\bl\u0010\u000FJ\r\u0010m\u001A\u00020\n\u00A2\u0006\u0004\bm\u0010\u000FR\"\u0010\u0005\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bn\u0010o\u001A\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010{\u001A\u00020t8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bu\u0010v\u001A\u0004\bw\u0010x\"\u0004\by\u0010zR\u0011\u0010}\u001A\u00020t8F\u00A2\u0006\u0006\u001A\u0004\b|\u0010x\u00A8\u0006\u007F"}, d2 = {"Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "", "Landroidx/compose/runtime/ComposerImpl;", "composer", "Landroidx/compose/runtime/changelist/ChangeList;", "changeList", "<init>", "(Landroidx/compose/runtime/ComposerImpl;Landroidx/compose/runtime/changelist/ChangeList;)V", "", "location", "", "moveReaderRelativeTo", "(I)V", "moveReaderToAbsolute", "recordSlotEditing", "()V", "newChangeList", "Lkotlin/Function0;", "block", "withChangeList", "(Landroidx/compose/runtime/changelist/ChangeList;Lkotlin/jvm/functions/Function0;)V", "withoutImplicitRootStart", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/RememberObserver;", "value", "remember", "(Landroidx/compose/runtime/RememberObserver;)V", "groupSlotIndex", "updateValue", "(Ljava/lang/Object;I)V", "Landroidx/compose/runtime/Anchor;", "anchor", "updateAnchoredValue", "(Ljava/lang/Object;Landroidx/compose/runtime/Anchor;I)V", "appendValue", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", "count", "trimValues", "resetSlots", "data", "updateAuxData", "(Ljava/lang/Object;)V", "endRoot", "endCurrentGroup", "skipToEndOfCurrentGroup", "removeCurrentGroup", "Landroidx/compose/runtime/SlotTable;", "from", "insertSlots", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/changelist/FixupList;", "fixups", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/changelist/FixupList;)V", "offset", "moveCurrentGroup", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "action", "composition", "endCompositionScope", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composition;)V", "node", "useNode", "T", "V", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "updateNode", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "nodeIndex", "removeNode", "(II)V", "to", "moveNode", "(III)V", "releaseMovableContent", "endNodeMovement", "group", "endNodeMovementAndDeleteNode", "moveUp", "moveDown", "effect", "sideEffect", "Landroidx/compose/runtime/internal/IntRef;", "effectiveNodeIndexOut", "determineMovableContentNodeIndex", "(Landroidx/compose/runtime/internal/IntRef;Landroidx/compose/runtime/Anchor;)V", "", "nodes", "effectiveNodeIndex", "copyNodesToNewAnchorLocation", "(Ljava/util/List;Landroidx/compose/runtime/internal/IntRef;)V", "Landroidx/compose/runtime/MovableContentState;", "resolvedState", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/MovableContentStateReference;", "copySlotTableToAnchorLocation", "(Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentStateReference;)V", "Landroidx/compose/runtime/ControlledComposition;", "reference", "releaseMovableGroupAtCurrent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;)V", "endMovableContentPlacement", "other", "includeOperationsIn", "(Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/internal/IntRef;)V", "finalizeComposition", "resetTransientState", "deactivateCurrentGroup", "b", "Landroidx/compose/runtime/changelist/ChangeList;", "getChangeList", "()Landroidx/compose/runtime/changelist/ChangeList;", "setChangeList", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "", "e", "Z", "getImplicitRootStart", "()Z", "setImplicitRootStart", "(Z)V", "implicitRootStart", "getPastParent", "pastParent", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComposerChangeListWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,484:1\n4551#2,7:485\n4551#2,7:492\n4551#2,7:499\n4551#2,7:506\n*S KotlinDebug\n*F\n+ 1 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n*L\n167#1:485,7\n248#1:492,7\n318#1:499,7\n466#1:506,7\n*E\n"})
public final class ComposerChangeListWriter {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/changelist/ComposerChangeListWriter$Companion;", "", "", "invalidGroupLocation", "I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final ComposerImpl a;
    public ChangeList b;
    public boolean c;
    public final IntStack d;
    public boolean e;
    public int f;
    public int g;
    public final Stack h;
    public int i;
    public int j;
    public int k;
    public int l;

    static {
        ComposerChangeListWriter.Companion = new Companion(null);
        ComposerChangeListWriter.$stable = 8;
    }

    public ComposerChangeListWriter(@NotNull ComposerImpl composerImpl0, @NotNull ChangeList changeList0) {
        this.a = composerImpl0;
        this.b = changeList0;
        this.d = new IntStack();
        this.e = true;
        this.h = new Stack();
        this.i = -1;
        this.j = -1;
        this.k = -1;
    }

    public final void a() {
        int v = this.g;
        if(v > 0) {
            this.b.pushUps(v);
            this.g = 0;
        }
        Stack stack0 = this.h;
        if(stack0.isNotEmpty()) {
            this.b.pushDowns(stack0.toArray());
            stack0.clear();
        }
    }

    public final void appendValue(@NotNull Anchor anchor0, @Nullable Object object0) {
        this.b.pushAppendValue(anchor0, object0);
    }

    public final void b() {
        int v = this.l;
        if(v > 0) {
            int v1 = this.i;
            if(v1 >= 0) {
                this.a();
                this.b.pushRemoveNode(v1, v);
                this.i = -1;
            }
            else {
                int v2 = this.k;
                int v3 = this.j;
                this.a();
                this.b.pushMoveNode(v2, v3, v);
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void c(boolean z) {
        int v = z ? this.a.getReader$runtime_release().getParent() : this.a.getReader$runtime_release().getCurrentGroup();
        int v1 = v - this.f;
        if(v1 < 0) {
            ComposerKt.composeImmediateRuntimeError("Tried to seek backward");
        }
        if(v1 > 0) {
            this.b.pushAdvanceSlotsBy(v1);
            this.f = v;
        }
    }

    public final void copyNodesToNewAnchorLocation(@NotNull List list0, @NotNull IntRef intRef0) {
        this.b.pushCopyNodesToNewAnchorLocation(list0, intRef0);
    }

    public final void copySlotTableToAnchorLocation(@Nullable MovableContentState movableContentState0, @NotNull CompositionContext compositionContext0, @NotNull MovableContentStateReference movableContentStateReference0, @NotNull MovableContentStateReference movableContentStateReference1) {
        this.b.pushCopySlotTableToAnchorLocation(movableContentState0, compositionContext0, movableContentStateReference0, movableContentStateReference1);
    }

    public final void deactivateCurrentGroup() {
        this.c(false);
        this.b.pushDeactivateCurrentGroup();
    }

    public final void determineMovableContentNodeIndex(@NotNull IntRef intRef0, @NotNull Anchor anchor0) {
        this.a();
        this.b.pushDetermineMovableContentNodeIndex(intRef0, anchor0);
    }

    public final void endCompositionScope(@NotNull Function1 function10, @NotNull Composition composition0) {
        this.b.pushEndCompositionScope(function10, composition0);
    }

    public final void endCurrentGroup() {
        int v = this.a.getReader$runtime_release().getParent();
        IntStack intStack0 = this.d;
        if(intStack0.peekOr(-1) > v) {
            ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup");
        }
        if(intStack0.peekOr(-1) == v) {
            this.c(false);
            intStack0.pop();
            this.b.pushEndCurrentGroup();
        }
    }

    public final void endMovableContentPlacement() {
        this.b.pushEndMovableContentPlacement();
        this.f = 0;
    }

    public final void endNodeMovement() {
        this.b();
    }

    public final void endNodeMovementAndDeleteNode(int v, int v1) {
        this.endNodeMovement();
        this.a();
        int v2 = this.a.getReader$runtime_release().isNode(v1) ? 1 : this.a.getReader$runtime_release().nodeCount(v1);
        if(v2 > 0) {
            this.removeNode(v, v2);
        }
    }

    public final void endRoot() {
        if(this.c) {
            this.c(false);
            this.c(false);
            this.b.pushEndCurrentGroup();
            this.c = false;
        }
    }

    public final void finalizeComposition() {
        this.a();
        if(!this.d.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup()");
        }
    }

    @NotNull
    public final ChangeList getChangeList() {
        return this.b;
    }

    public final boolean getImplicitRootStart() {
        return this.e;
    }

    public final boolean getPastParent() {
        return this.a.getReader$runtime_release().getParent() - this.f < 0;
    }

    public final void includeOperationsIn(@NotNull ChangeList changeList0, @Nullable IntRef intRef0) {
        this.b.pushExecuteOperationsIn(changeList0, intRef0);
    }

    public static void includeOperationsIn$default(ComposerChangeListWriter composerChangeListWriter0, ChangeList changeList0, IntRef intRef0, int v, Object object0) {
        if((v & 2) != 0) {
            intRef0 = null;
        }
        composerChangeListWriter0.includeOperationsIn(changeList0, intRef0);
    }

    public final void insertSlots(@NotNull Anchor anchor0, @NotNull SlotTable slotTable0) {
        this.a();
        this.c(false);
        this.recordSlotEditing();
        this.b();
        this.b.pushInsertSlots(anchor0, slotTable0);
    }

    public final void insertSlots(@NotNull Anchor anchor0, @NotNull SlotTable slotTable0, @NotNull FixupList fixupList0) {
        this.a();
        this.c(false);
        this.recordSlotEditing();
        this.b();
        this.b.pushInsertSlots(anchor0, slotTable0, fixupList0);
    }

    public final void moveCurrentGroup(int v) {
        this.c(false);
        this.recordSlotEditing();
        this.b.pushMoveCurrentGroup(v);
    }

    public final void moveDown(@Nullable Object object0) {
        this.b();
        this.h.push(object0);
    }

    public final void moveNode(int v, int v1, int v2) {
        if(v2 > 0) {
            int v3 = this.l;
            if(v3 > 0 && this.j == v - v3 && this.k == v1 - v3) {
                this.l = v3 + v2;
                return;
            }
            this.b();
            this.j = v;
            this.k = v1;
            this.l = v2;
        }
    }

    public final void moveReaderRelativeTo(int v) {
        this.f = v - this.a.getReader$runtime_release().getCurrentGroup() + this.f;
    }

    public final void moveReaderToAbsolute(int v) {
        this.f = v;
    }

    public final void moveUp() {
        this.b();
        Stack stack0 = this.h;
        if(stack0.isNotEmpty()) {
            stack0.pop();
            return;
        }
        ++this.g;
    }

    public final void recordSlotEditing() {
        ComposerImpl composerImpl0 = this.a;
        if(composerImpl0.getReader$runtime_release().getSize() > 0) {
            SlotReader slotReader0 = composerImpl0.getReader$runtime_release();
            int v = slotReader0.getParent();
            IntStack intStack0 = this.d;
            if(intStack0.peekOr(-2) != v) {
                if(!this.c && this.e) {
                    this.c(false);
                    this.b.pushEnsureRootStarted();
                    this.c = true;
                }
                if(v > 0) {
                    Anchor anchor0 = slotReader0.anchor(v);
                    intStack0.push(v);
                    this.c(false);
                    this.b.pushEnsureGroupStarted(anchor0);
                    this.c = true;
                }
            }
        }
    }

    public final void releaseMovableContent() {
        this.a();
        if(this.c) {
            this.skipToEndOfCurrentGroup();
            this.endRoot();
        }
    }

    public final void releaseMovableGroupAtCurrent(@NotNull ControlledComposition controlledComposition0, @NotNull CompositionContext compositionContext0, @NotNull MovableContentStateReference movableContentStateReference0) {
        this.b.pushReleaseMovableGroupAtCurrent(controlledComposition0, compositionContext0, movableContentStateReference0);
    }

    public final void remember(@NotNull RememberObserver rememberObserver0) {
        this.b.pushRemember(rememberObserver0);
    }

    public final void removeCurrentGroup() {
        this.c(false);
        this.recordSlotEditing();
        this.b.pushRemoveCurrentGroup();
        this.f = this.a.getReader$runtime_release().getGroupSize() + this.f;
    }

    public final void removeNode(int v, int v1) {
        if(v1 > 0) {
            if(v < 0) {
                ComposerKt.composeImmediateRuntimeError(("Invalid remove index " + v));
            }
            if(this.i == v) {
                this.l += v1;
                return;
            }
            this.b();
            this.i = v;
            this.l = v1;
        }
    }

    public final void resetSlots() {
        this.b.pushResetSlots();
    }

    public final void resetTransientState() {
        this.c = false;
        this.d.clear();
        this.f = 0;
    }

    public final void setChangeList(@NotNull ChangeList changeList0) {
        this.b = changeList0;
    }

    public final void setImplicitRootStart(boolean z) {
        this.e = z;
    }

    public final void sideEffect(@NotNull Function0 function00) {
        this.b.pushSideEffect(function00);
    }

    public final void skipToEndOfCurrentGroup() {
        this.b.pushSkipToEndOfCurrentGroup();
    }

    public final void trimValues(int v) {
        if(v > 0) {
            this.c(false);
            this.recordSlotEditing();
            this.b.pushTrimValues(v);
        }
    }

    public final void updateAnchoredValue(@Nullable Object object0, @NotNull Anchor anchor0, int v) {
        this.b.pushUpdateAnchoredValue(object0, anchor0, v);
    }

    public final void updateAuxData(@Nullable Object object0) {
        this.c(false);
        this.b.pushUpdateAuxData(object0);
    }

    public final void updateNode(Object object0, @NotNull Function2 function20) {
        this.a();
        this.b.pushUpdateNode(object0, function20);
    }

    public final void updateValue(@Nullable Object object0, int v) {
        this.c(true);
        this.b.pushUpdateValue(object0, v);
    }

    public final void useNode(@Nullable Object object0) {
        this.a();
        this.b.pushUseNode(object0);
    }

    public final void withChangeList(@NotNull ChangeList changeList0, @NotNull Function0 function00) {
        try {
            this.setChangeList(changeList0);
            function00.invoke();
        }
        finally {
            this.setChangeList(this.getChangeList());
        }
    }

    public final void withoutImplicitRootStart(@NotNull Function0 function00) {
        try {
            this.setImplicitRootStart(false);
            function00.invoke();
        }
        finally {
            this.setImplicitRootStart(this.getImplicitRootStart());
        }
    }
}

