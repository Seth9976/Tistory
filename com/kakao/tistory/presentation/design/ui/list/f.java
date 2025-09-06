package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.SemanticKt;
import com.kakao.tistory.presentation.design.ui.text.SingleLineNumberKt;
import com.kakao.tistory.presentation.theme.TTextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final int a;

    public f(int v) {
        this.a = v;
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
            ComposerKt.traceEventStart(0x49E23839, v, -1, "com.kakao.tistory.presentation.design.ui.list.BlogTitleWithIndex.<anonymous> (BlogTitle.kt:80)");
        }
        String[] arr_s = {StringResources_androidKt.stringResource(string.content_desc_ranking, new Object[]{this.a}, ((Composer)object0), 0x40)};
        Modifier modifier0 = SemanticKt.contentDescription(Modifier.Companion, arr_s, ((Composer)object0), 6);
        SingleLineNumberKt.SingleLineCompactNumber-cf5BqRc(this.a, modifier0, 0L, TTextStyle.INSTANCE.getSize24Weight900(), ((Composer)object0), 0xD80, 0);
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ic_list_index_slash, ((Composer)object0), 0), null, SizeKt.size-VpY3zN4(Modifier.Companion, 8.0f, 24.0f), 0L, ((Composer)object0), 0xDB8, 0);
        SpacerKt.Spacer(SizeKt.size-3ABfNKs(Modifier.Companion, 4.0f), ((Composer)object0), 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

