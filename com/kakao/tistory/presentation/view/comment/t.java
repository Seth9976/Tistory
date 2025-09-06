package com.kakao.tistory.presentation.view.comment;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Pin;
import com.kakao.tistory.presentation.view.entry.widget.PinCommentKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function3 {
    public final Pin a;
    public final SoftwareKeyboardController b;
    public final CommentFragment c;

    public t(Pin commentItemUIModel$Pin0, SoftwareKeyboardController softwareKeyboardController0, CommentFragment commentFragment0) {
        this.a = commentItemUIModel$Pin0;
        this.b = softwareKeyboardController0;
        this.c = commentFragment0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((LazyItemScope)object0), "$this$item");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xEA1B3200, v, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.CommentList.<anonymous>.<anonymous> (CommentFragment.kt:395)");
        }
        Pin commentItemUIModel$Pin0 = this.a;
        if(commentItemUIModel$Pin0 != null) {
            SoftwareKeyboardController softwareKeyboardController0 = this.b;
            CommentFragment commentFragment0 = this.c;
            ((Composer)object1).startReplaceGroup(0x8D08599E);
            boolean z = ((Composer)object1).changed(commentItemUIModel$Pin0);
            boolean z1 = ((Composer)object1).changed(softwareKeyboardController0);
            s s0 = ((Composer)object1).rememberedValue();
            if(z || z1 || s0 == Composer.Companion.getEmpty()) {
                s0 = new s(commentItemUIModel$Pin0, softwareKeyboardController0);
                ((Composer)object1).updateRememberedValue(s0);
            }
            ((Composer)object1).endReplaceGroup();
            PinCommentKt.PinComment(Pin.copy$default(commentItemUIModel$Pin0, null, null, s0, 3, null), ((Composer)object1), 0);
            CommentFragment.access$CommentDivider-kHDZbjc(commentFragment0, 10.0f, ((Composer)object1), 70, 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

