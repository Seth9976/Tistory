package a;

import com.kakao.kandinsky.preview.PreviewAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class e1 extends Lambda implements Function2 {
    public final CoroutineScope a;
    public final PreviewAnimator b;

    public e1(CoroutineScope coroutineScope0, PreviewAnimator previewAnimator0) {
        this.a = coroutineScope0;
        this.b = previewAnimator0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        d1 d10 = new d1(this.b, ((Number)object0).intValue(), ((Number)object1).intValue(), null);
        BuildersKt.launch$default(this.a, null, null, d10, 3, null);
        return Unit.INSTANCE;
    }
}

