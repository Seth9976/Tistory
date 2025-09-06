package a;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import com.kakao.kandinsky.KandinskyActivity;
import com.kakao.kandinsky.preview.PreviewUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function1 {
    public final KandinskyActivity a;
    public final State b;
    public final State c;

    public s(KandinskyActivity kandinskyActivity0, State state0, State state1) {
        this.a = kandinskyActivity0;
        this.b = state0;
        this.c = state1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = ((Offset)object0).unbox-impl();
        if(((PreviewUiState)this.b.getValue()).getDisplayCropRect().contains-k-4lQ0M(v) && r.a[((b.s)this.c.getValue()).ordinal()] == 1) {
            this.a.b().getController().onClickEmptyArea-k-4lQ0M(v);
        }
        return Unit.INSTANCE;
    }
}

