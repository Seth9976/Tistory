package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.domain.entity.entry.ChallengeResult;
import com.kakao.tistory.presentation.widget.dialog.DialogEvent;
import com.kakao.tistory.presentation.widget.dialog.DialogFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k1 extends Lambda implements Function4 {
    public static final k1 a;

    static {
        k1.a = new k1();
    }

    public k1() {
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((DialogFactory)object0), "$this$DialogHandler");
        Intrinsics.checkNotNullParameter(((DialogEvent)object1), "it");
        if((v & 14) == 0) {
            v |= (((Composer)object2).changed(((DialogFactory)object0)) ? 4 : 2);
        }
        if((v & 651) == 130 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x493686DF, v, -1, "com.kakao.tistory.presentation.view.entry.widget.ComposableSingletons$ChallengeSuccessDialogKt.lambda-1.<anonymous> (ChallengeSuccessDialog.kt:35)");
        }
        ChallengeSuccessDialogKt.ChallengeSuccessDialog(((DialogFactory)object0), new ChallengeResult("DAILY_POSTING", "https://newliamtest.dev.tistory.com/m/manage/challenge", 3, true, "SUCCESS", "오블완 1일차 성공!", "꾸준한 글쓰기로 한걸음 더 성장했어요!", "https://t1.daumcdn.net/tistory_admin/static/images/challenge/DAILY_POSTING.png"), i1.a, j1.a, ((Composer)object2), v & 14 | 0xDC0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

