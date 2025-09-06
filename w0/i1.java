package w0;

import androidx.compose.runtime.State;
import com.kakao.kandinsky.crop.CropScreenKt;
import com.kakao.kandinsky.crop.contract.CropViewType;
import com.kakao.kandinsky.sticker.StickerScreenKt;
import com.kakao.kandinsky.text.TextScreenKt;
import com.kakao.kandinsky.text.contract.TextMode.Input;
import com.kakao.kdtracker.KDTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i1 extends Lambda implements Function0 {
    public final int w;
    public final State x;

    public i1(State state0, int v) {
        this.w = v;
        this.x = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return ((Number)this.x.getValue()).floatValue() > 0.0f;
            }
            case 1: {
                StickerScreenKt.access$StickerScreen$lambda$0(this.x).getOnFinish().invoke();
                return Unit.INSTANCE;
            }
            case 2: {
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "sticker-tab", "removeall", null, null, 12, null);
                StickerScreenKt.access$StickerScreen$lambda$0(this.x).getOnClickRemoveAll().invoke();
                return Unit.INSTANCE;
            }
            case 3: {
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "footer", "complete-sticker", null, null, 12, null);
                StickerScreenKt.access$StickerScreen$lambda$0(this.x).getOnFinish().invoke();
                return Unit.INSTANCE;
            }
            case 4: {
                CropScreenKt.access$CropScreen$lambda$0(this.x).getOnClickCancel().invoke();
                return Unit.INSTANCE;
            }
            case 5: {
                String s = CropScreenKt.access$CropScreen$lambda$0(this.x).getViewType() == CropViewType.Crop ? "cancel-cut" : "cancel-rotate";
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "footer", s, null, null, 12, null);
                CropScreenKt.access$CropScreen$lambda$0(this.x).getOnClickCancel().invoke();
                return Unit.INSTANCE;
            }
            case 6: {
                String s1 = CropScreenKt.access$CropScreen$lambda$0(this.x).getViewType() == CropViewType.Crop ? "complete-cut" : "complete-rotate";
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "footer", s1, null, null, 12, null);
                CropScreenKt.access$CropScreen$lambda$0(this.x).getOnClickConfirm().invoke();
                return Unit.INSTANCE;
            }
            case 7: {
                CropScreenKt.access$CropScreen$lambda$0(this.x).getOnChangeViewType().invoke(CropViewType.Crop);
                return Unit.INSTANCE;
            }
            case 8: {
                CropScreenKt.access$CropScreen$lambda$0(this.x).getOnChangeViewType().invoke(CropViewType.Rotate);
                return Unit.INSTANCE;
            }
            case 9: {
                State state0 = this.x;
                if(TextScreenKt.access$TextScreen$lambda$0(state0).getTextMode() instanceof Input) {
                    TextScreenKt.access$TextScreen$lambda$0(state0).getChangeModeToControl().invoke();
                    return Unit.INSTANCE;
                }
                TextScreenKt.access$TextScreen$lambda$0(state0).getOnClickCancel().invoke();
                return Unit.INSTANCE;
            }
            case 10: {
                TextScreenKt.access$TextScreen$lambda$0(this.x).getChangeModeToInput().invoke(Boolean.FALSE);
                return Unit.INSTANCE;
            }
            case 11: {
                TextScreenKt.access$TextScreen$lambda$0(this.x).getChangeModeToInput().invoke(Boolean.TRUE);
                return Unit.INSTANCE;
            }
            case 12: {
                TextScreenKt.access$TextScreen$lambda$0(this.x).getRemoveAllDeco().invoke();
                return Unit.INSTANCE;
            }
            case 13: {
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "footer", "cancel-text", null, null, 12, null);
                TextScreenKt.access$TextScreen$lambda$0(this.x).getOnClickCancel().invoke();
                return Unit.INSTANCE;
            }
            case 14: {
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "footer", "complete-text", null, null, 12, null);
                TextScreenKt.access$TextScreen$lambda$0(this.x).getOnClickConfirm().invoke();
                return Unit.INSTANCE;
            }
            default: {
                TextScreenKt.access$TextScreen$lambda$0(this.x).getChangeModeToControl().invoke();
                return Unit.INSTANCE;
            }
        }
    }
}

