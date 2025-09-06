package eb;

import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.TextAlign;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.textedit.ui.TextInputKt;
import com.kakao.kandinsky.textedit.ui.TextStyleAndFontPanelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function1 {
    public final int w;
    public final Function1 x;
    public final MutableState y;

    public o(MutableState mutableState0, Function1 function10, int v) {
        this.w = v;
        this.y = mutableState0;
        this.x = function10;
        super(1);
    }

    public o(Function1 function10, MutableState mutableState0, int v) {
        this.w = v;
        this.x = function10;
        this.y = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((TextFieldValue)object0), "it");
                TextInputKt.access$TextInput_ca1Bfew$lambda$5(this.y, ((TextFieldValue)object0));
                String s = ((TextFieldValue)object0).getText();
                this.x.invoke(s);
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((TextLayoutResult)object0), "it");
                Rect rect0 = TextInputKt.access$getTextBounds(((TextLayoutResult)object0));
                TextInputKt.access$TextInput_ca1Bfew$lambda$9(this.y, rect0);
                Size size0 = Size.box-impl(TextInputKt.access$TextInput_ca1Bfew$lambda$8(this.y).getSize-NH-jbRc());
                this.x.invoke(size0);
                return Unit.INSTANCE;
            }
            case 2: {
                TextData textData0 = TextData.copy-A15cKkk$default(TextStyleAndFontPanelKt.access$TextStyleAndFontPanelPreview$lambda$1(this.y), null, 0L, 0.0f, 0L, 0.0f, 0L, 0L, ((Boolean)object0).booleanValue(), false, false, 0, null, 0.0f, 0.0f, 0x3F7F, null);
                this.x.invoke(textData0);
                return Unit.INSTANCE;
            }
            case 3: {
                TextData textData1 = TextData.copy-A15cKkk$default(TextStyleAndFontPanelKt.access$TextStyleAndFontPanelPreview$lambda$1(this.y), null, 0L, 0.0f, 0L, 0.0f, 0L, 0L, false, ((Boolean)object0).booleanValue(), false, 0, null, 0.0f, 0.0f, 0x3EFF, null);
                this.x.invoke(textData1);
                return Unit.INSTANCE;
            }
            case 4: {
                TextData textData2 = TextData.copy-A15cKkk$default(TextStyleAndFontPanelKt.access$TextStyleAndFontPanelPreview$lambda$1(this.y), null, 0L, 0.0f, 0L, 0.0f, 0L, 0L, false, false, ((Boolean)object0).booleanValue(), 0, null, 0.0f, 0.0f, 0x3DFF, null);
                this.x.invoke(textData2);
                return Unit.INSTANCE;
            }
            case 5: {
                TextData textData3 = TextData.copy-A15cKkk$default(TextStyleAndFontPanelKt.access$TextStyleAndFontPanelPreview$lambda$1(this.y), null, 0L, 0.0f, 0L, 0.0f, 0L, 0L, false, false, false, ((TextAlign)object0).unbox-impl(), null, 0.0f, 0.0f, 0x3BFF, null);
                this.x.invoke(textData3);
                return Unit.INSTANCE;
            }
            case 6: {
                TextData textData4 = TextData.copy-A15cKkk$default(TextStyleAndFontPanelKt.access$TextStyleAndFontPanelPreview$lambda$1(this.y), null, 0L, 0.0f, 0L, 0.0f, 0L, 0L, false, false, false, 0, ((Integer)object0), 0.0f, 0.0f, 0x37FF, null);
                this.x.invoke(textData4);
                return Unit.INSTANCE;
            }
            case 7: {
                this.y.setValue(((TextLayoutResult)object0));
                this.x.invoke(((TextLayoutResult)object0));
                return Unit.INSTANCE;
            }
            case 8: {
                this.y.setValue(((TextLayoutResult)object0));
                this.x.invoke(((TextLayoutResult)object0));
                return Unit.INSTANCE;
            }
            case 9: {
                Integer integer1 = ClickableTextKt.access$ClickableText_03UYbkw$getOffset(this.y, ((Offset)object0).unbox-impl());
                if(integer1 != null) {
                    this.x.invoke(integer1);
                }
                return Unit.INSTANCE;
            }
            default: {
                long v = ((Offset)object0).unbox-impl();
                TextLayoutResult textLayoutResult0 = (TextLayoutResult)this.y.getValue();
                if(textLayoutResult0 != null) {
                    Integer integer0 = textLayoutResult0.getOffsetForPosition-k-4lQ0M(v);
                    this.x.invoke(integer0);
                }
                return Unit.INSTANCE;
            }
        }
    }
}

