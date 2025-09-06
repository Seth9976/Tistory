package a;

import b.b0;
import com.kakao.kandinsky.KandinskyActivity;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.selector.SelectorEvent.SingleSelector;
import com.kakao.kandinsky.selector.SelectorImageDate;
import com.kakao.kdtracker.KDTracker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b1 extends Lambda implements Function0 {
    public final KandinskyActivity a;
    public final Function1 b;
    public final b0 c;

    public b1(KandinskyActivity kandinskyActivity0, Function1 function10, b0 b00) {
        this.a = kandinskyActivity0;
        this.b = function10;
        this.c = b00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.k = null;
        KDTracker.clickEvent$default(KDTracker.INSTANCE, "imagelist", null, null, null, 14, null);
        Function1 function10 = this.b;
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(this.c.f, 10));
        int v = 0;
        for(Object object0: this.c.f) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList0.add(new SelectorImageDate(v, ((KDPhoto)object0).getOriginalUri(), ((KDPhoto)object0).isEdited()));
            ++v;
        }
        a1 a10 = new a1(this.c);
        function10.invoke(new SingleSelector(arrayList0, this.c.g, a10));
        return Unit.INSTANCE;
    }
}

