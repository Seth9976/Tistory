package aa;

import android.graphics.Matrix;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.material.SwitchKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.decoration.DecorationBoxKt;
import com.kakao.kandinsky.filter.FilterScreenKt;
import com.kakao.kandinsky.filter.contract.EffectMenu;
import com.kakao.kandinsky.signature.SignatureScreenKt.SignatureScreen.5.3.2.1.WhenMappings;
import com.kakao.kandinsky.signature.SignatureScreenKt;
import com.kakao.kandinsky.signature.ui.SignatureMenu;
import com.kakao.kandinsky.sticker.StickerScreenKt;
import com.kakao.kandinsky.sticker.contract.StickerGroup;
import com.kakao.kandinsky.text.TextScreenKt;
import com.kakao.kdtracker.KDTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function1 {
    public final int w;
    public final State x;

    public w(State state0, int v) {
        this.w = v;
        this.x = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
                float f = DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$11(this.x).getRotate();
                float f1 = DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$11(this.x).getScale();
                long v = DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$11(this.x).getFlip-F1C5BW0();
                ((Matrix)object0).postScale(Offset.getX-impl(v), Offset.getY-impl(v));
                ((Matrix)object0).postRotate(f);
                ((Matrix)object0).postScale(f1, f1);
                return Unit.INSTANCE;
            }
            case 1: {
                ((GraphicsLayerScope)object0).setAlpha(((Number)this.x.getValue()).floatValue());
                return Unit.INSTANCE;
            }
            case 2: {
                ((GraphicsLayerScope)object0).setAlpha(((Number)this.x.getValue()).floatValue());
                return Unit.INSTANCE;
            }
            case 3: {
                return IntOffset.box-impl(IntOffsetKt.IntOffset(((Density)object0).roundToPx-0680j_4(((Dp)this.x.getValue()).unbox-impl()), 0));
            }
            case 4: {
                ((ContentDrawScope)object0).drawContent();
                float f2 = ((ContentDrawScope)object0).toPx-0680j_4(((BorderStroke)this.x.getValue()).getWidth-D9Ej5fM());
                float f3 = Size.getHeight-impl(((ContentDrawScope)object0).getSize-NH-jbRc()) - f2 / 2.0f;
                DrawScope.drawLine-1RTmtNc$default(((ContentDrawScope)object0), ((BorderStroke)this.x.getValue()).getBrush(), OffsetKt.Offset(0.0f, f3), OffsetKt.Offset(Size.getWidth-impl(((ContentDrawScope)object0).getSize-NH-jbRc()), f3), f2, 0, null, 0.0f, null, 0, 0x1F0, null);
                return Unit.INSTANCE;
            }
            case 5: {
                Intrinsics.checkNotNullParameter(((Rect)object0), "it");
                FilterScreenKt.access$FilterScreen$lambda$0(this.x).getUpdatePreviewBounds().invoke(((Rect)object0));
                return Unit.INSTANCE;
            }
            case 6: {
                Intrinsics.checkNotNullParameter(((EffectMenu)object0), "it");
                FilterScreenKt.access$FilterScreen$lambda$0(this.x).getOnClickEffectMenu().invoke(((EffectMenu)object0));
                return Unit.INSTANCE;
            }
            case 7: {
                FilterScreenKt.access$FilterScreen$lambda$0(this.x).getChangeEffectValue().invoke(((Number)object0).floatValue());
                return Unit.INSTANCE;
            }
            case 8: {
                Intrinsics.checkNotNullParameter(((Filter)object0), "it");
                FilterScreenKt.access$FilterScreen$lambda$0(this.x).getOnClickFilter().invoke(((Filter)object0));
                return Unit.INSTANCE;
            }
            case 9: {
                FilterScreenKt.access$FilterScreen$lambda$0(this.x).getChangeFilterIntensity().invoke(((Number)object0).floatValue());
                return Unit.INSTANCE;
            }
            case 10: {
                ((Function1)this.x.getValue()).invoke(Offset.box-impl(((Offset)object0).unbox-impl()));
                return Unit.INSTANCE;
            }
            case 11: {
                SwitchKt.access$drawTrack-RPmYEkk(((DrawScope)object0), SwitchKt.access$SwitchImpl$lambda$15(this.x), ((DrawScope)object0).toPx-0680j_4(34.0f), ((DrawScope)object0).toPx-0680j_4(14.0f));
                return Unit.INSTANCE;
            }
            case 12: {
                ((GraphicsLayerScope)object0).setAlpha(((Number)this.x.getValue()).floatValue());
                return Unit.INSTANCE;
            }
            case 13: {
                Intrinsics.checkNotNullParameter(((SignatureMenu)object0), "it");
                State state0 = this.x;
                switch(SignatureScreenKt.SignatureScreen.5.3.2.1.WhenMappings.$EnumSwitchMapping$0[((SignatureMenu)object0).ordinal()]) {
                    case 1: {
                        SignatureScreenKt.access$SignatureScreen$lambda$0(state0).getOnClickMenuText().invoke();
                        return Unit.INSTANCE;
                    }
                    case 2: {
                        SignatureScreenKt.access$SignatureScreen$lambda$0(state0).getOnClickMenuImage().invoke();
                        return Unit.INSTANCE;
                    }
                    case 3: {
                        SignatureScreenKt.access$SignatureScreen$lambda$0(state0).getOnClickMenuHistory().invoke();
                        return Unit.INSTANCE;
                    }
                    default: {
                        return Unit.INSTANCE;
                    }
                }
            }
            case 14: {
                Intrinsics.checkNotNullParameter(((Signature)object0), "it");
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "sign-tab", "history-tab", "selectsign", null, 8, null);
                SignatureScreenKt.access$SignatureScreen$lambda$0(this.x).getChangeSign().invoke(((Signature)object0));
                return Unit.INSTANCE;
            }
            case 15: {
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "sign-tab", "history-tab", "deletesign", null, 8, null);
                SignatureScreenKt.access$SignatureScreen$lambda$0(this.x).getDeleteHistory().invoke(((Number)object0).intValue());
                return Unit.INSTANCE;
            }
            case 16: {
                ((GraphicsLayerScope)object0).setAlpha(((Number)this.x.getValue()).floatValue());
                return Unit.INSTANCE;
            }
            case 17: {
                ((GraphicsLayerScope)object0).setAlpha(((Number)this.x.getValue()).floatValue());
                return Unit.INSTANCE;
            }
            case 18: {
                ((GraphicsLayerScope)object0).setAlpha(((Number)this.x.getValue()).floatValue());
                return Unit.INSTANCE;
            }
            case 19: {
                Intrinsics.checkNotNullParameter(((StickerGroup)object0), "it");
                String s = ((StickerGroup)object0).getName();
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "sticker-tab", s, null, null, 12, null);
                StickerScreenKt.access$StickerScreen$lambda$0(this.x).getOnSelectStickerGroup().invoke(((StickerGroup)object0));
                return Unit.INSTANCE;
            }
            case 20: {
                ((Function1)this.x.getValue()).invoke(Offset.box-impl(((Offset)object0).unbox-impl()));
                return Unit.INSTANCE;
            }
            case 21: {
                ((Function1)this.x.getValue()).invoke(((Number)object0).floatValue());
                return Unit.INSTANCE;
            }
            case 22: {
                return (Float)((Function1)this.x.getValue()).invoke(((Number)object0).floatValue());
            }
            default: {
                TextScreenKt.access$TextScreen$lambda$0(this.x).getUpdateTextData().invoke(((TextData)object0));
                return Unit.INSTANCE;
            }
        }
    }
}

