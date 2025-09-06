package com.kakao.tistory.presentation.view.comment;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i0 extends Lambda implements Function3 {
    public final ModalBottomSheetState a;
    public final CommentFragment b;

    public i0(ModalBottomSheetState modalBottomSheetState0, CommentFragment commentFragment0) {
        this.a = modalBottomSheetState0;
        this.b = commentFragment0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$ModalBottomSheetLayout");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9E90AB6E, v, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.CommentListPage.<anonymous> (CommentFragment.kt:147)");
        }
        Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(SizeKt.defaultMinSize-VpY3zN4$default(Modifier.Companion, 0.0f, 56.0f, 1, null), 0.0f, 12.0f, 0.0f, 0.0f, 13, null);
        ModalBottomSheetState modalBottomSheetState0 = this.a;
        CommentFragment commentFragment0 = this.b;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), ((Composer)object1), 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object1), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object1).getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(((Composer)object1), modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(((Composer)object1).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object1).startReusableNode();
        if(((Composer)object1).getInserting()) {
            ((Composer)object1).createNode(function00);
        }
        else {
            ((Composer)object1).useNode();
        }
        Composer composer0 = Updater.constructor-impl(((Composer)object1));
        Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            d.a(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        CommentBottomSheetKt.CommentBottomSheet(modalBottomSheetState0, commentFragment0.getCommentListViewModel(), ((Composer)object1), ModalBottomSheetState.$stable | 0x40);
        ((Composer)object1).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

