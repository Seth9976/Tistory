package na;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.core.kdphoto.Decoration.Absolute;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.preview.ImagePreviewKt;
import com.kakao.kandinsky.utils.MatrixValues;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;

public final class f extends Lambda implements Function2 {
    public final State A;
    public final Function6 w;
    public final DecorationStatus x;
    public final ImmutableList y;
    public final Absolute z;

    public f(Function6 function60, DecorationStatus decorationStatus0, ImmutableList immutableList0, Absolute decoration$Absolute0, State state0) {
        this.w = function60;
        this.x = decorationStatus0;
        this.y = immutableList0;
        this.z = decoration$Absolute0;
        this.A = state0;
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
            ComposerKt.traceEventStart(-1939580827, v, -1, "com.kakao.kandinsky.preview.ImagePreview.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ImagePreview.kt:109)");
        }
        MatrixValues matrixValues0 = MatrixValues.box-impl(this.y);
        Rect rect0 = ImagePreviewKt.access$ImagePreview$lambda$12$lambda$6(this.A);
        this.w.invoke(this.x, matrixValues0, this.z, rect0, ((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

