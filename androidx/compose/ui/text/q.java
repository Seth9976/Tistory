package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function1 {
    public static final q w;

    static {
        q.w = new q(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        Object object1 = ((List)object0).get(0);
        String s = null;
        e e0 = object1 == null ? null : ((e)object1);
        Intrinsics.checkNotNull(e0);
        Object object2 = ((List)object0).get(2);
        Integer integer0 = object2 == null ? null : ((Integer)object2);
        Intrinsics.checkNotNull(integer0);
        int v = integer0.intValue();
        Object object3 = ((List)object0).get(3);
        Integer integer1 = object3 == null ? null : ((Integer)object3);
        Intrinsics.checkNotNull(integer1);
        int v1 = integer1.intValue();
        Object object4 = ((List)object0).get(4);
        String s1 = object4 == null ? null : ((String)object4);
        Intrinsics.checkNotNull(s1);
        switch(e0.ordinal()) {
            case 0: {
                Object object5 = ((List)object0).get(1);
                Saver saver0 = SaversKt.getParagraphStyleSaver();
                if((!Intrinsics.areEqual(object5, Boolean.FALSE) || saver0 instanceof NonNullValueClassSaver) && object5 != null) {
                    s = (ParagraphStyle)saver0.restore(object5);
                }
                Intrinsics.checkNotNull(s);
                return new Range(s, v, v1, s1);
            }
            case 1: {
                Object object6 = ((List)object0).get(1);
                Saver saver1 = SaversKt.getSpanStyleSaver();
                if((!Intrinsics.areEqual(object6, Boolean.FALSE) || saver1 instanceof NonNullValueClassSaver) && object6 != null) {
                    s = (SpanStyle)saver1.restore(object6);
                }
                Intrinsics.checkNotNull(s);
                return new Range(s, v, v1, s1);
            }
            case 2: {
                Object object7 = ((List)object0).get(1);
                Saver saver2 = SaversKt.d;
                if((!Intrinsics.areEqual(object7, Boolean.FALSE) || saver2 instanceof NonNullValueClassSaver) && object7 != null) {
                    s = (VerbatimTtsAnnotation)saver2.restore(object7);
                }
                Intrinsics.checkNotNull(s);
                return new Range(s, v, v1, s1);
            }
            case 3: {
                Object object8 = ((List)object0).get(1);
                Saver saver3 = SaversKt.e;
                if((!Intrinsics.areEqual(object8, Boolean.FALSE) || saver3 instanceof NonNullValueClassSaver) && object8 != null) {
                    s = (UrlAnnotation)saver3.restore(object8);
                }
                Intrinsics.checkNotNull(s);
                return new Range(s, v, v1, s1);
            }
            case 4: {
                Object object9 = ((List)object0).get(1);
                Saver saver4 = SaversKt.f;
                if((!Intrinsics.areEqual(object9, Boolean.FALSE) || saver4 instanceof NonNullValueClassSaver) && object9 != null) {
                    s = (Url)saver4.restore(object9);
                }
                Intrinsics.checkNotNull(s);
                return new Range(s, v, v1, s1);
            }
            case 5: {
                Object object10 = ((List)object0).get(1);
                Saver saver5 = SaversKt.g;
                if((!Intrinsics.areEqual(object10, Boolean.FALSE) || saver5 instanceof NonNullValueClassSaver) && object10 != null) {
                    s = (Clickable)saver5.restore(object10);
                }
                Intrinsics.checkNotNull(s);
                return new Range(s, v, v1, s1);
            }
            case 6: {
                Object object11 = ((List)object0).get(1);
                if(object11 != null) {
                    s = (String)object11;
                }
                Intrinsics.checkNotNull(s);
                return new Range(s, v, v1, s1);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

