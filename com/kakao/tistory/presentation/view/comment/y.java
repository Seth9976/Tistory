package com.kakao.tistory.presentation.view.comment;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Comment;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Header;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.MoreButton;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Pin;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Reply;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel;
import com.kakao.tistory.presentation.view.entry.widget.CommentKt;
import com.kakao.tistory.presentation.view.entry.widget.PinCommentKt;
import com.kakao.tistory.presentation.view.entry.widget.ReplyKt;
import com.kakao.tistory.presentation.view.entry.widget.ReplyMoreKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function4 {
    public final LazyPagingItems a;
    public final FocusRequester b;
    public final SoftwareKeyboardController c;
    public final CommentFragment d;

    public y(LazyPagingItems lazyPagingItems0, FocusRequester focusRequester0, SoftwareKeyboardController softwareKeyboardController0, CommentFragment commentFragment0) {
        this.a = lazyPagingItems0;
        this.b = focusRequester0;
        this.c = softwareKeyboardController0;
        this.d = commentFragment0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object1).intValue();
        Composer composer0 = (Composer)object2;
        int v1 = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((LazyItemScope)object0), "$this$items");
        if((v1 & 0x70) == 0) {
            v1 |= (composer0.changed(v) ? 0x20 : 16);
        }
        if((v1 & 721) == 0x90 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2023185545, v1, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.CommentList.<anonymous>.<anonymous> (CommentFragment.kt:420)");
        }
        CommentItemUIModel commentItemUIModel0 = (CommentItemUIModel)this.a.get(v);
        if(Intrinsics.areEqual(commentItemUIModel0, Header.INSTANCE)) {
            composer0.startReplaceGroup(0xA5C5BFAE);
        }
        else if(commentItemUIModel0 instanceof Comment) {
            composer0.startReplaceGroup(-1513690517);
            long v2 = ColorResources_androidKt.colorResource(color.white, composer0, 0);
            Modifier modifier0 = PaddingKt.padding-VpY3zN4(BackgroundKt.background-bw27NRU$default(Modifier.Companion, v2, null, 2, null), 20.0f, 22.0f);
            composer0.startReplaceGroup(1475202286);
            boolean z = composer0.changed(commentItemUIModel0);
            boolean z1 = composer0.changed(this.b);
            boolean z2 = composer0.changed(this.c);
            FocusRequester focusRequester0 = this.b;
            SoftwareKeyboardController softwareKeyboardController0 = this.c;
            v v3 = composer0.rememberedValue();
            if((z | z1 | z2) != 0 || v3 == Composer.Companion.getEmpty()) {
                v3 = new v(((Comment)commentItemUIModel0), focusRequester0, softwareKeyboardController0);
                composer0.updateRememberedValue(v3);
            }
            composer0.endReplaceGroup();
            CommentKt.Comment(modifier0, Comment.copy$default(((Comment)commentItemUIModel0), 0L, null, null, null, null, null, 0, null, false, false, false, false, false, false, false, null, null, null, null, v3, null, 0x17FFFF, null), composer0, 0, 0);
            CommentFragment.access$CommentDivider-kHDZbjc(this.d, 0.0f, composer0, 0x40, 1);
        }
        else if(commentItemUIModel0 instanceof Reply) {
            composer0.startReplaceGroup(0xA5D1E466);
            Comment commentItemUIModel$Comment0 = ((Reply)commentItemUIModel0).getComment();
            composer0.startReplaceGroup(1475220406);
            boolean z3 = composer0.changed(commentItemUIModel0);
            boolean z4 = composer0.changed(this.b);
            boolean z5 = composer0.changed(this.c);
            FocusRequester focusRequester1 = this.b;
            SoftwareKeyboardController softwareKeyboardController1 = this.c;
            w w0 = composer0.rememberedValue();
            if((z3 | z4 | z5) != 0 || w0 == Composer.Companion.getEmpty()) {
                w0 = new w(((Reply)commentItemUIModel0), focusRequester1, softwareKeyboardController1);
                composer0.updateRememberedValue(w0);
            }
            composer0.endReplaceGroup();
            ReplyKt.Reply(((Reply)commentItemUIModel0).copy(Comment.copy$default(commentItemUIModel$Comment0, 0L, null, null, null, null, null, 0, null, false, false, false, false, false, false, false, null, null, null, null, w0, null, 0x17FFFF, null)), composer0, 0);
            CommentFragment.access$CommentDivider-kHDZbjc(this.d, 0.0f, composer0, 0x40, 1);
        }
        else if(commentItemUIModel0 instanceof MoreButton) {
            composer0.startReplaceGroup(-1512408760);
            ReplyMoreKt.ReplyMore(((MoreButton)commentItemUIModel0), composer0, 0);
            CommentFragment.access$CommentDivider-kHDZbjc(this.d, 0.0f, composer0, 0x40, 1);
        }
        else if(commentItemUIModel0 instanceof Pin) {
            composer0.startReplaceGroup(0xA5DCF27B);
            composer0.startReplaceGroup(0x57EE68BE);
            boolean z6 = composer0.changed(commentItemUIModel0);
            boolean z7 = composer0.changed(this.b);
            boolean z8 = composer0.changed(this.c);
            FocusRequester focusRequester2 = this.b;
            SoftwareKeyboardController softwareKeyboardController2 = this.c;
            x x0 = composer0.rememberedValue();
            if((z6 | z7 | z8) != 0 || x0 == Composer.Companion.getEmpty()) {
                x0 = new x(((Pin)commentItemUIModel0), focusRequester2, softwareKeyboardController2);
                composer0.updateRememberedValue(x0);
            }
            composer0.endReplaceGroup();
            PinCommentKt.PinComment(Pin.copy$default(((Pin)commentItemUIModel0), null, null, x0, 3, null), composer0, 0);
        }
        else if(commentItemUIModel0 == null) {
            composer0.startReplaceGroup(0xA5E2DF2E);
        }
        else {
            composer0.startReplaceGroup(0xA5E32C70);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

