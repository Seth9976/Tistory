package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function2 {
    public static final p w;

    static {
        p.w = new p(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        e e0;
        Object object2 = ((Range)object1).getItem();
        if(object2 instanceof ParagraphStyle) {
            e0 = e.a;
        }
        else if(object2 instanceof SpanStyle) {
            e0 = e.b;
        }
        else if(object2 instanceof VerbatimTtsAnnotation) {
            e0 = e.c;
        }
        else if(object2 instanceof UrlAnnotation) {
            e0 = e.d;
        }
        else if(object2 instanceof Url) {
            e0 = e.e;
        }
        else {
            e0 = object2 instanceof Clickable ? e.f : e.g;
        }
        switch(e0.ordinal()) {
            case 0: {
                Object object3 = ((Range)object1).getItem();
                Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                return CollectionsKt__CollectionsKt.arrayListOf(new Object[]{e0, SaversKt.save(((ParagraphStyle)object3), SaversKt.getParagraphStyleSaver(), ((SaverScope)object0)), SaversKt.save(((Range)object1).getStart()), SaversKt.save(((Range)object1).getEnd()), SaversKt.save(((Range)object1).getTag())});
            }
            case 1: {
                Object object4 = ((Range)object1).getItem();
                Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                return CollectionsKt__CollectionsKt.arrayListOf(new Object[]{e0, SaversKt.save(((SpanStyle)object4), SaversKt.getSpanStyleSaver(), ((SaverScope)object0)), SaversKt.save(((Range)object1).getStart()), SaversKt.save(((Range)object1).getEnd()), SaversKt.save(((Range)object1).getTag())});
            }
            case 2: {
                Object object5 = ((Range)object1).getItem();
                Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                return CollectionsKt__CollectionsKt.arrayListOf(new Object[]{e0, SaversKt.save(((VerbatimTtsAnnotation)object5), SaversKt.d, ((SaverScope)object0)), SaversKt.save(((Range)object1).getStart()), SaversKt.save(((Range)object1).getEnd()), SaversKt.save(((Range)object1).getTag())});
            }
            case 3: {
                Object object6 = ((Range)object1).getItem();
                Intrinsics.checkNotNull(object6, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                return CollectionsKt__CollectionsKt.arrayListOf(new Object[]{e0, SaversKt.save(((UrlAnnotation)object6), SaversKt.e, ((SaverScope)object0)), SaversKt.save(((Range)object1).getStart()), SaversKt.save(((Range)object1).getEnd()), SaversKt.save(((Range)object1).getTag())});
            }
            case 4: {
                Object object7 = ((Range)object1).getItem();
                Intrinsics.checkNotNull(object7, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                return CollectionsKt__CollectionsKt.arrayListOf(new Object[]{e0, SaversKt.save(((Url)object7), SaversKt.f, ((SaverScope)object0)), SaversKt.save(((Range)object1).getStart()), SaversKt.save(((Range)object1).getEnd()), SaversKt.save(((Range)object1).getTag())});
            }
            case 5: {
                Object object8 = ((Range)object1).getItem();
                Intrinsics.checkNotNull(object8, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                return CollectionsKt__CollectionsKt.arrayListOf(new Object[]{e0, SaversKt.save(((Clickable)object8), SaversKt.g, ((SaverScope)object0)), SaversKt.save(((Range)object1).getStart()), SaversKt.save(((Range)object1).getEnd()), SaversKt.save(((Range)object1).getTag())});
            }
            case 6: {
                return CollectionsKt__CollectionsKt.arrayListOf(new Object[]{e0, SaversKt.save(((Range)object1).getItem()), SaversKt.save(((Range)object1).getStart()), SaversKt.save(((Range)object1).getEnd()), SaversKt.save(((Range)object1).getTag())});
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

