package ca;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.kandinsky.designsystem.common.CommonDialogKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function2 {
    public static final i w;

    static {
        i.w = new i(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD964E544, v, -1, "com.kakao.kandinsky.designsystem.common.ComposableSingletons$CommonDialogKt.lambda-1.<anonymous> (CommonDialog.kt:28)");
        }
        CommonDialogKt.access$CommonDialog("편집 중인 이미지가 있습니다.", "편집을 종료하면 변경한 내용이 저장되지 않습니다. 편집을 취소하시겠습니까?", null, null, ((Composer)object0), 54, 12);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

