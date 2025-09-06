package z9;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.kakao.kandinsky.crop.contract.CropRatioType;
import com.kakao.kandinsky.crop.contract.CropRatioTypeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function4 {
    public static final a w;

    static {
        a.w = new a(4);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        ((Boolean)object0).booleanValue();
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        if((v1 & 0x70) == 0) {
            v1 |= (((Composer)object2).changed(v) ? 0x20 : 16);
        }
        if((v1 & 721) == 0x90 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x10F49773, v1, -1, "com.kakao.kandinsky.crop.ui.ComposableSingletons$CropMenuKt.lambda-1.<anonymous> (CropMenu.kt:28)");
        }
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(((CropRatioType)CropRatioTypeKt.getCropRatioTypeList().get(v)).getIcon(), ((Composer)object2), 0), null, SizeKt.size-3ABfNKs(Modifier.Companion, 28.0f), 0L, ((Composer)object2), 440, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

