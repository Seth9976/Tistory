package a;

import b.b0;
import com.kakao.kandinsky.KandinskyActivity;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g1 extends Lambda implements Function2 {
    public final KandinskyActivity a;
    public final Function1 b;
    public final b0 c;

    public g1(KandinskyActivity kandinskyActivity0, Function1 function10, b0 b00) {
        this.a = kandinskyActivity0;
        this.b = function10;
        this.c = b00;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((KDPhoto)object0), "base");
        Intrinsics.checkNotNullParameter(((String)object1), "selectState");
        this.a.k = (String)object1;
        f1 f10 = new f1(((KDPhoto)object0));
        KandinskyActivity.a(this.b, this.c, f10);
        return Unit.INSTANCE;
    }
}

