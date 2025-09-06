package coil.compose;

import androidx.compose.ui.graphics.painter.Painter;
import coil.request.NullRequestDataException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public final Painter w;
    public final Painter x;
    public final Painter y;

    public i(Painter painter0, Painter painter1, Painter painter2) {
        this.w = painter0;
        this.x = painter1;
        this.y = painter2;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        State asyncImagePainter$State0 = (State)object0;
        if(asyncImagePainter$State0 instanceof Loading) {
            Painter painter0 = this.w;
            asyncImagePainter$State0 = (Loading)asyncImagePainter$State0;
            if(painter0 != null) {
                return ((Loading)asyncImagePainter$State0).copy(painter0);
            }
        }
        else if(asyncImagePainter$State0 instanceof Error) {
            asyncImagePainter$State0 = (Error)asyncImagePainter$State0;
            if(((Error)asyncImagePainter$State0).getResult().getThrowable() instanceof NullRequestDataException) {
                Painter painter1 = this.x;
                if(painter1 != null) {
                    return Error.copy$default(((Error)asyncImagePainter$State0), painter1, null, 2, null);
                }
            }
            else {
                Painter painter2 = this.y;
                if(painter2 != null) {
                    return Error.copy$default(((Error)asyncImagePainter$State0), painter2, null, 2, null);
                }
            }
        }
        return asyncImagePainter$State0;
    }
}

