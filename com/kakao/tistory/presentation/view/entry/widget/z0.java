package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyModel;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar.AppBarHomeAsUpButtonType.Custom;
import com.kakao.tistory.presentation.widget.common.FunctionStateKt;
import com.kakao.tistory.presentation.widget.common.TistoryToolbarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class z0 extends Lambda implements Function2 {
    public final CommentModifyModel a;
    public final TextFieldValue b;

    public z0(CommentModifyModel commentModifyModel0, TextFieldValue textFieldValue0) {
        this.a = commentModifyModel0;
        this.b = textFieldValue0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1370212015, v, -1, "com.kakao.tistory.presentation.view.entry.widget.CommentModifyPage.<anonymous> (CommentModifyPage.kt:33)");
        }
        Function0 function00 = FunctionStateKt.rememberImmutableFunctionState(new y0(this.a, this.b), ((Composer)object0), 0);
        TistoryToolbarKt.TistoryToolbar(StringResources_androidKt.stringResource(this.a.getTitleResId(), ((Composer)object0), 0), true, true, new Custom(drawable.ic_navi_close_b, string.content_desc_dialog_modify_cancel), function00, null, null, null, ((Composer)object0), 0x1B0, 0xE0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

