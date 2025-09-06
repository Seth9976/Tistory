package jb;

import com.kakao.kphotopicker.PreviewFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function2 {
    public final int w;
    public final PreviewFragment x;

    public b0(PreviewFragment previewFragment0, int v) {
        this.w = v;
        this.x = previewFragment0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            PreviewFragment.access$showMaxCountOver(this.x, ((Number)object0).intValue(), ((Number)object1).intValue());
            return Unit.INSTANCE;
        }
        PreviewFragment.access$showMaxCountOver(this.x, ((Number)object0).intValue(), ((Number)object1).intValue());
        return Unit.INSTANCE;
    }
}

