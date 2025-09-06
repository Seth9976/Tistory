package cb;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.style.TextAlign;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.textedit.TextEditorKt;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final int w;
    public final String x;
    public final MutableState y;

    public e(String s, MutableState mutableState0, int v) {
        this.w = v;
        this.x = s;
        this.y = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                TextEditorKt.a(this.x, "bold", null);
                TextData textData1 = TextData.copy-A15cKkk$default(TextEditorKt.access$TextEditor$lambda$9(this.y), null, 0L, 0.0f, 0L, 0.0f, 0L, 0L, ((Boolean)object0).booleanValue(), false, false, 0, null, 0.0f, 0.0f, 0x3F7F, null);
                TextEditorKt.access$TextEditor$lambda$10(this.y, textData1);
                return Unit.INSTANCE;
            }
            case 1: {
                TextEditorKt.a(this.x, "italic", null);
                TextData textData2 = TextData.copy-A15cKkk$default(TextEditorKt.access$TextEditor$lambda$9(this.y), null, 0L, 0.0f, 0L, 0.0f, 0L, 0L, false, ((Boolean)object0).booleanValue(), false, 0, null, 0.0f, 0.0f, 0x3EFF, null);
                TextEditorKt.access$TextEditor$lambda$10(this.y, textData2);
                return Unit.INSTANCE;
            }
            case 2: {
                TextEditorKt.a(this.x, "underline", null);
                TextData textData3 = TextData.copy-A15cKkk$default(TextEditorKt.access$TextEditor$lambda$9(this.y), null, 0L, 0.0f, 0L, 0.0f, 0L, 0L, false, false, ((Boolean)object0).booleanValue(), 0, null, 0.0f, 0.0f, 0x3DFF, null);
                TextEditorKt.access$TextEditor$lambda$10(this.y, textData3);
                return Unit.INSTANCE;
            }
            default: {
                int v = ((TextAlign)object0).unbox-impl();
                String s = TextAlign.toString-impl(v).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(s, "toLowerCase(...)");
                TextEditorKt.access$trackerClickEvent(this.x, "align", s);
                TextData textData0 = TextData.copy-A15cKkk$default(TextEditorKt.access$TextEditor$lambda$9(this.y), null, 0L, 0.0f, 0L, 0.0f, 0L, 0L, false, false, false, v, null, 0.0f, 0.0f, 0x3BFF, null);
                TextEditorKt.access$TextEditor$lambda$10(this.y, textData0);
                return Unit.INSTANCE;
            }
        }
    }
}

