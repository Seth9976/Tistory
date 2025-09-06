package a;

import b.b0;
import b.s;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n1 extends Lambda implements Function1 {
    public final b0 a;
    public final Function1 b;

    public n1(b0 b00, Function1 function10) {
        this.a = b00;
        this.b = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((List)object0), "indexList");
        Function1 function10 = this.b;
        b0 b00 = this.a;
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(((List)object0), 10));
        for(Object object1: ((List)object0)) {
            arrayList0.add(((KDPhoto)function10.invoke(b00.f.get(((Number)object1).intValue()))));
        }
        this.a.j.invoke(arrayList0);
        this.a.k.invoke(s.d);
        return Unit.INSTANCE;
    }
}

