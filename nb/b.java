package nb;

import com.kakao.kphotopicker.picker.item.PhotoItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final PhotoItemView w;

    public b(PhotoItemView photoItemView0) {
        this.w = photoItemView0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.c.layerIndex.callOnClick();
        return Unit.INSTANCE;
    }
}

