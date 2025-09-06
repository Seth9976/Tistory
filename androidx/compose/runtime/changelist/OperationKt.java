package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl.Companion;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,990:1\n174#2,5:991\n180#2,3:997\n174#2,5:1000\n180#2,3:1006\n1#3:996\n1#3:1005\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n*L\n922#1:991,5\n922#1:997,3\n980#1:1000,5\n980#1:1006,3\n922#1:996\n980#1:1005\n*E\n"})
public final class OperationKt {
    public static final int access$positionToInsert(SlotWriter slotWriter0, Anchor anchor0, Applier applier0) {
        int v = slotWriter0.anchorIndex(anchor0);
        boolean z = true;
        ComposerKt.runtimeCheck(slotWriter0.getCurrentGroup() < v);
        while(!slotWriter0.indexInParent(v)) {
            slotWriter0.skipToGroupEnd();
            if(slotWriter0.isNode(slotWriter0.getParent())) {
                applier0.up();
            }
            slotWriter0.endGroup();
        }
        int v1 = slotWriter0.getCurrentGroup();
        int v2;
        for(v2 = slotWriter0.getParent(); v2 >= 0 && !slotWriter0.isNode(v2); v2 = slotWriter0.parent(v2)) {
        }
        int v3 = v2 + 1;
        int v4 = 0;
        while(v3 < v1) {
            if(slotWriter0.indexInGroup(v1, v3)) {
                if(slotWriter0.isNode(v3)) {
                    v4 = 0;
                }
                ++v3;
            }
            else {
                v4 += (slotWriter0.isNode(v3) ? 1 : slotWriter0.nodeCount(v3));
                v3 += slotWriter0.groupSize(v3);
            }
        }
        while(slotWriter0.getCurrentGroup() < v) {
            if(slotWriter0.indexInCurrentGroup(v)) {
                if(slotWriter0.isNode()) {
                    applier0.down(slotWriter0.node(slotWriter0.getCurrentGroup()));
                    v4 = 0;
                }
                slotWriter0.startGroup();
            }
            else {
                v4 += slotWriter0.skipGroup();
            }
        }
        if(slotWriter0.getCurrentGroup() != v) {
            z = false;
        }
        ComposerKt.runtimeCheck(z);
        return v4;
    }

    public static final void access$positionToParentOf(SlotWriter slotWriter0, Applier applier0, int v) {
        while(!slotWriter0.indexInParent(v)) {
            slotWriter0.skipToGroupEnd();
            if(slotWriter0.isNode(slotWriter0.getParent())) {
                applier0.up();
            }
            slotWriter0.endGroup();
        }
    }

    public static final void access$releaseMovableGroupAtCurrent(ControlledComposition controlledComposition0, CompositionContext compositionContext0, MovableContentStateReference movableContentStateReference0, SlotWriter slotWriter0) {
        List list0;
        SlotTable slotTable0 = new SlotTable();
        if(slotWriter0.getCollectingSourceInformation()) {
            slotTable0.collectSourceInformation();
        }
        if(slotWriter0.getCollectingCalledInformation()) {
            slotTable0.collectCalledByInformation();
        }
        SlotWriter slotWriter1 = slotTable0.openWriter();
        try {
            slotWriter1.beginInsert();
            slotWriter1.startGroup(0x78CC281, movableContentStateReference0.getContent$runtime_release());
            SlotWriter.markGroup$default(slotWriter1, 0, 1, null);
            slotWriter1.update(movableContentStateReference0.getParameter$runtime_release());
            list0 = slotWriter0.moveTo(movableContentStateReference0.getAnchor$runtime_release(), 1, slotWriter1);
            slotWriter1.skipGroup();
            slotWriter1.endGroup();
            slotWriter1.endInsert();
        }
        catch(Throwable throwable0) {
            slotWriter1.close(false);
            throw throwable0;
        }
        slotWriter1.close(true);
        MovableContentState movableContentState0 = new MovableContentState(slotTable0);
        Companion recomposeScopeImpl$Companion0 = RecomposeScopeImpl.Companion;
        if(recomposeScopeImpl$Companion0.hasAnchoredRecomposeScopes$runtime_release(slotTable0, list0)) {
            OperationKt.releaseMovableGroupAtCurrent.movableContentRecomposeScopeOwner.1 operationKt$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$10 = new OperationKt.releaseMovableGroupAtCurrent.movableContentRecomposeScopeOwner.1(controlledComposition0, movableContentStateReference0);
            SlotWriter slotWriter2 = slotTable0.openWriter();
            try {
                recomposeScopeImpl$Companion0.adoptAnchoredScopes$runtime_release(slotWriter2, list0, operationKt$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$10);
            }
            catch(Throwable throwable1) {
                slotWriter2.close(false);
                throw throwable1;
            }
            slotWriter2.close(true);
        }
        compositionContext0.movableContentStateReleased$runtime_release(movableContentStateReference0, movableContentState0);
    }
}

