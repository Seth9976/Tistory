package s;

import androidx.compose.animation.ContentTransform;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final Placeable w;
    public final ContentTransform x;

    public f(Placeable placeable0, ContentTransform contentTransform0) {
        this.w = placeable0;
        this.x = contentTransform0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = this.x.getTargetContentZIndex();
        ((PlacementScope)object0).place(this.w, 0, 0, f);
        return Unit.INSTANCE;
    }
}

