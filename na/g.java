package na;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.core.kdphoto.Decoration.Relative;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.preview.ImagePreviewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public final Function5 w;
    public final DecorationStatus x;
    public final Relative y;
    public final State z;

    public g(Function5 function50, DecorationStatus decorationStatus0, Relative decoration$Relative0, State state0) {
        this.w = function50;
        this.x = decorationStatus0;
        this.y = decoration$Relative0;
        this.z = state0;
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
            ComposerKt.traceEventStart(1091067486, v, -1, "com.kakao.kandinsky.preview.ImagePreview.<anonymous>.<anonymous>.<anonymous> (ImagePreview.kt:117)");
        }
        Rect rect0 = ImagePreviewKt.access$ImagePreview$lambda$12$lambda$6(this.z);
        this.w.invoke(this.x, this.y, rect0, ((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

