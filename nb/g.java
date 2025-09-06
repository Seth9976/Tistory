package nb;

import com.kakao.kphotopicker.picker.item.VideoItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function0 {
    public final VideoItemView w;

    public g(VideoItemView videoItemView0) {
        this.w = videoItemView0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.c.layerIndex.callOnClick();
        return Unit.INSTANCE;
    }
}

