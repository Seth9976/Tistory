package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d1 extends Lambda implements Function3 {
    public final TextFieldValue a;
    public final CommentModifyModel b;
    public final Function1 c;

    public d1(TextFieldValue textFieldValue0, CommentModifyModel commentModifyModel0, Function1 function10) {
        this.a = textFieldValue0;
        this.b = commentModifyModel0;
        this.c = function10;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((PaddingValues)object0), "paddingValues");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((PaddingValues)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2C980B28, v, -1, "com.kakao.tistory.presentation.view.entry.widget.CommentModifyPage.<anonymous> (CommentModifyPage.kt:49)");
        }
        ((Composer)object1).startReplaceGroup(2055395665);
        FocusRequester focusRequester0 = ((Composer)object1).rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(focusRequester0 == composer$Companion0.getEmpty()) {
            focusRequester0 = new FocusRequester();
            ((Composer)object1).updateRememberedValue(focusRequester0);
        }
        ((Composer)object1).endReplaceGroup();
        Modifier modifier0 = PaddingKt.padding(Modifier.Companion, ((PaddingValues)object0));
        a1 a10 = new a1(this.a, this.b, this.c);
        String s = StringResources_androidKt.stringResource(string.label_comment_write_hint, ((Composer)object1), 0);
        b1 b10 = new b1(this.b);
        CommentEditFieldKt.CommentModifyEditField(modifier0, this.a, a10, this.b.getMention(), this.b.getShowSecretButton(), this.b.getOrigin().isSecret(), s, focusRequester0, this.b.getRemoveMention(), b10, ((Composer)object1), 0xC01000, 0);
        Unit unit0 = Unit.INSTANCE;
        ((Composer)object1).startReplaceGroup(2055433065);
        c1 c10 = ((Composer)object1).rememberedValue();
        if(c10 == composer$Companion0.getEmpty()) {
            c10 = new c1(focusRequester0, null);
            ((Composer)object1).updateRememberedValue(c10);
        }
        ((Composer)object1).endReplaceGroup();
        EffectsKt.LaunchedEffect(unit0, c10, ((Composer)object1), 70);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

