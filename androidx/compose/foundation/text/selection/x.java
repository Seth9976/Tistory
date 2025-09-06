package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function2 {
    public final Function2 w;
    public final SelectionManager x;

    public x(Function2 function20, SelectionManager selectionManager0) {
        this.w = function20;
        this.x = selectionManager0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x51F9571E, v, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:108)");
        }
        this.w.invoke(composer0, 0);
        SelectionManager selectionManager0 = this.x;
        if(!selectionManager0.isInTouchMode() || !selectionManager0.getHasFocus() || selectionManager0.isTriviallyCollapsedSelection$foundation_release()) {
            composer0.startReplaceGroup(0xCB80F247);
        }
        else {
            composer0.startReplaceGroup(0xCB6A46BD);
            Selection selection0 = selectionManager0.getSelection();
            if(selection0 == null) {
                composer0.startReplaceGroup(0xCB6ADE77);
            }
            else {
                composer0.startReplaceGroup(-882188680);
                composer0.startReplaceGroup(0x592480C2);
                List list0 = CollectionsKt__CollectionsKt.listOf(new Boolean[]{Boolean.TRUE, Boolean.FALSE});
                int v1 = list0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    boolean z = ((Boolean)list0.get(v2)).booleanValue();
                    boolean z1 = composer0.changed(z);
                    TextDragObserver textDragObserver0 = composer0.rememberedValue();
                    if(z1 || textDragObserver0 == Composer.Companion.getEmpty()) {
                        textDragObserver0 = selectionManager0.handleDragObserver(z);
                        composer0.updateRememberedValue(textDragObserver0);
                    }
                    boolean z2 = composer0.changed(z);
                    v v3 = composer0.rememberedValue();
                    if(z2 || v3 == Composer.Companion.getEmpty()) {
                        v v4 = z ? new v(selectionManager0) : new w(selectionManager0);
                        v3 = v4;
                        composer0.updateRememberedValue(v3);
                    }
                    ResolvedTextDirection resolvedTextDirection0 = z ? selection0.getStart().getDirection() : selection0.getEnd().getDirection();
                    d0 d00 = new d0(v3);
                    boolean z3 = selection0.getHandlesCrossed();
                    Companion modifier$Companion0 = Modifier.Companion;
                    boolean z4 = composer0.changedInstance(textDragObserver0);
                    u u0 = composer0.rememberedValue();
                    if(z4 || u0 == Composer.Companion.getEmpty()) {
                        u0 = new u(textDragObserver0, null);
                        composer0.updateRememberedValue(u0);
                    }
                    AndroidSelectionHandles_androidKt.SelectionHandle-pzduO1o(d00, z, resolvedTextDirection0, z3, 0L, SuspendingPointerInputFilterKt.pointerInput(modifier$Companion0, textDragObserver0, u0), composer0, 0, 16);
                }
                composer0.endReplaceGroup();
            }
            composer0.endReplaceGroup();
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

