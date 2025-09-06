package aa;

import android.content.res.Configuration;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.IntSize;
import com.kakao.kandinsky.base.ui.KDAsyncImageKt;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.decoration.DecorationBoxKt;
import com.kakao.kandinsky.designsystem.common.KDSliderKt;
import com.kakao.kandinsky.signature.SignatureScreenKt;
import com.kakao.kandinsky.textedit.TextEditorKt;
import com.kakao.kandinsky.textedit.ui.TextStyleAndFontPanelKt;
import com.kakao.kandinsky.utils.Logger;
import com.kakao.kdtracker.KDTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.p;
import kotlinx.coroutines.flow.Flow;

public final class q extends Lambda implements Function1 {
    public final int w;
    public final MutableState x;

    public q(MutableState mutableState0, int v) {
        this.w = v;
        this.x = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                long v = Offset.plus-MK-Hz9U(DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$4(this.x), ((Offset)object0).unbox-impl());
                DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$5(this.x, v);
                return Unit.INSTANCE;
            }
            case 1: {
                SelectionContainerKt.access$SelectionContainer$lambda$2(this.x, ((Selection)object0));
                return Unit.INSTANCE;
            }
            case 2: {
                MutableState mutableState0 = this.x;
                if(!p.isBlank(((CharSequence)mutableState0.getValue()))) {
                    SemanticsPropertiesKt.error(((SemanticsPropertyReceiver)object0), ((String)mutableState0.getValue()));
                }
                return Unit.INSTANCE;
            }
            case 3: {
                TimePickerKt.access$TimeInputImpl$lambda$7(this.x, ((TextFieldValue)object0));
                return Unit.INSTANCE;
            }
            case 4: {
                TimePickerKt.access$TimeInputImpl$lambda$10(this.x, ((TextFieldValue)object0));
                return Unit.INSTANCE;
            }
            case 5: {
                this.x.setValue(((LayoutCoordinates)object0));
                return Unit.INSTANCE;
            }
            case 6: {
                Configuration configuration0 = new Configuration(((Configuration)object0));
                AndroidCompositionLocals_androidKt.access$ProvideAndroidCompositionLocals$lambda$2(this.x, configuration0);
                return Unit.INSTANCE;
            }
            case 7: {
                KDSliderKt.access$PreviewSlider$lambda$2(this.x, ((Number)object0).floatValue());
                return Unit.INSTANCE;
            }
            case 8: {
                KDSliderKt.access$PreviewSlider$lambda$2(this.x, ((Number)object0).floatValue());
                return Unit.INSTANCE;
            }
            case 9: {
                Intrinsics.checkNotNullParameter(((String)object0), "it");
                TextData textData0 = TextData.copy-A15cKkk$default(TextEditorKt.access$TextEditor$lambda$9(this.x), ((String)object0), 0L, 0.0f, 0L, 0.0f, 0L, 0L, false, false, false, 0, null, 0.0f, 0.0f, 0x3FFE, null);
                TextEditorKt.access$TextEditor$lambda$10(this.x, textData0);
                return Unit.INSTANCE;
            }
            case 10: {
                TextData textData1 = TextData.copy-A15cKkk$default(TextEditorKt.access$TextEditor$lambda$9(this.x), null, 0L, 0.0f, 0L, 0.0f, ((Size)object0).unbox-impl(), 0L, false, false, false, 0, null, 0.0f, 0.0f, 0x3FDF, null);
                TextEditorKt.access$TextEditor$lambda$10(this.x, textData1);
                return Unit.INSTANCE;
            }
            case 11: {
                boolean z = ((Boolean)object0).booleanValue();
                Logger.INSTANCE.log("keyboard visible change " + z);
                TextEditorKt.access$TextEditor$lambda$2(this.x, z);
                return Unit.INSTANCE;
            }
            case 12: {
                TextData textData2 = TextData.copy-A15cKkk$default(TextEditorKt.access$TextEditor$lambda$9(this.x), null, 0L, 0.0f, 0L, ((Number)object0).floatValue(), 0L, 0L, false, false, false, 0, null, 0.0f, 0.0f, 0x3FEF, null);
                TextEditorKt.access$TextEditor$lambda$10(this.x, textData2);
                return Unit.INSTANCE;
            }
            case 13: {
                TextData textData3 = TextData.copy-A15cKkk$default(TextEditorKt.access$TextEditor$lambda$9(this.x), null, 0L, 0.0f, ((Color)object0).unbox-impl(), 0.0f, 0L, 0L, false, false, false, 0, null, 0.0f, 0.0f, 0x3FF7, null);
                TextEditorKt.access$TextEditor$lambda$10(this.x, textData3);
                return Unit.INSTANCE;
            }
            case 14: {
                TextData textData4 = TextData.copy-A15cKkk$default(TextEditorKt.access$TextEditor$lambda$9(this.x), null, 0L, ((Number)object0).floatValue(), 0L, 0.0f, 0L, 0L, false, false, false, 0, null, 0.0f, 0.0f, 0x3FFB, null);
                TextEditorKt.access$TextEditor$lambda$10(this.x, textData4);
                return Unit.INSTANCE;
            }
            case 15: {
                TextData textData5 = TextData.copy-A15cKkk$default(TextEditorKt.access$TextEditor$lambda$9(this.x), null, ((Color)object0).unbox-impl(), 0.0f, 0L, 0.0f, 0L, 0L, false, false, false, 0, null, 0.0f, 0.0f, 0x3FFD, null);
                TextEditorKt.access$TextEditor$lambda$10(this.x, textData5);
                return Unit.INSTANCE;
            }
            case 16: {
                Intrinsics.checkNotNullParameter(((TextData)object0), "data");
                TextStyleAndFontPanelKt.access$TextStyleAndFontPanelPreview$lambda$2(this.x, ((TextData)object0));
                return Unit.INSTANCE;
            }
            case 17: {
                Intrinsics.checkNotNullParameter(((LayoutCoordinates)object0), "it");
                IntSize intSize0 = IntSize.box-impl(((LayoutCoordinates)object0).getSize-YbymL2g());
                KDAsyncImageKt.access$AsyncImage$lambda$4(this.x, intSize0);
                return Unit.INSTANCE;
            }
            case 18: {
                Intrinsics.checkNotNullParameter(((Flow)object0), "it");
                SignatureScreenKt.access$SignatureScreen$lambda$3(this.x, ((Flow)object0));
                return Unit.INSTANCE;
            }
            default: {
                if(((Boolean)object0).booleanValue()) {
                    KDTracker.clickEvent$default(KDTracker.INSTANCE, "footer", "cancel-historytab", null, null, 12, null);
                }
                SignatureScreenKt.access$SignatureScreen$lambda$3(this.x, null);
                return Unit.INSTANCE;
            }
        }
    }
}

