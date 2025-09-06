package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function1 {
    public static final m w;

    static {
        m.w = new m(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        List list4;
        List list3;
        List list2;
        List list1;
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        Object object1 = ((List)object0).get(1);
        Saver saver0 = SaversKt.b;
        List list0 = null;
        if(Intrinsics.areEqual(object1, Boolean.FALSE) && !(saver0 instanceof NonNullValueClassSaver)) {
            list1 = null;
        }
        else if(object1 != null) {
            list1 = (List)saver0.restore(object1);
        }
        else {
            list1 = null;
        }
        Object object2 = ((List)object0).get(2);
        Saver saver1 = SaversKt.b;
        if(Intrinsics.areEqual(object2, Boolean.FALSE) && !(saver1 instanceof NonNullValueClassSaver)) {
            list2 = null;
        }
        else if(object2 != null) {
            list2 = (List)saver1.restore(object2);
        }
        else {
            list2 = null;
        }
        Object object3 = ((List)object0).get(0);
        String s = object3 == null ? null : ((String)object3);
        Intrinsics.checkNotNull(s);
        if(list1 == null) {
            list3 = null;
        }
        else {
            Collection collection0 = list1;
            if(collection0.isEmpty()) {
                collection0 = null;
            }
            list3 = (List)collection0;
        }
        if(list2 == null) {
            list4 = null;
        }
        else {
            Collection collection1 = list2;
            if(collection1.isEmpty()) {
                collection1 = null;
            }
            list4 = (List)collection1;
        }
        Object object4 = ((List)object0).get(3);
        Saver saver2 = SaversKt.b;
        if((!Intrinsics.areEqual(object4, Boolean.FALSE) || saver2 instanceof NonNullValueClassSaver) && object4 != null) {
            list0 = (List)saver2.restore(object4);
        }
        return new AnnotatedString(s, list3, list4, list0);
    }
}

