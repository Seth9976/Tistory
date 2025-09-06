package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o1 extends Lambda implements Function1 {
    public final MentionVisualTransformation a;
    public final TextLayoutResult b;
    public final float c;
    public final long d;

    public o1(MentionVisualTransformation mentionVisualTransformation0, TextLayoutResult textLayoutResult0, float f, long v) {
        this.a = mentionVisualTransformation0;
        this.b = textLayoutResult0;
        this.c = f;
        this.d = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DrawScope)object0), "$this$drawBehind");
        float f = ((DrawScope)object0).toPx-0680j_4(4.0f);
        TextLayoutResult textLayoutResult0 = this.b;
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = this.a.getMentionIndices().iterator();
        while(iterator0.hasNext()) {
            int v = ((IntIterator)iterator0).nextInt();
            Rect rect0 = null;
            if(textLayoutResult0 != null) {
                try {
                    rect0 = textLayoutResult0.getBoundingBox(v);
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
            if(rect0 != null) {
                arrayList0.add(rect0);
            }
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object1: arrayList0) {
            Float float0 = ((Rect)object1).getTop();
            ArrayList arrayList1 = linkedHashMap0.get(float0);
            if(arrayList1 == null) {
                arrayList1 = new ArrayList();
                linkedHashMap0.put(float0, arrayList1);
            }
            arrayList1.add(object1);
        }
        float f1 = this.c;
        ArrayList arrayList2 = new ArrayList(linkedHashMap0.size());
        for(Object object2: linkedHashMap0.entrySet()) {
            List list0 = (List)((Map.Entry)object2).getValue();
            float f2 = ((Rect)CollectionsKt___CollectionsKt.first(list0)).getTop();
            float f3 = ((Rect)CollectionsKt___CollectionsKt.first(list0)).getBottom();
            Iterator iterator3 = list0.iterator();
            if(!iterator3.hasNext()) {
                throw new NoSuchElementException();
            }
            Object object3 = iterator3.next();
            float f4;
            for(f4 = ((Rect)object3).getLeft(); iterator3.hasNext(); f4 = Math.min(f4, ((Rect)object4).getLeft())) {
                Object object4 = iterator3.next();
            }
            Iterator iterator4 = list0.iterator();
            if(!iterator4.hasNext()) {
                throw new NoSuchElementException();
            }
            Object object5 = iterator4.next();
            float f5;
            for(f5 = ((Rect)object5).getRight(); iterator4.hasNext(); f5 = Math.max(f5, ((Rect)object6).getRight())) {
                Object object6 = iterator4.next();
            }
            arrayList2.add(new Rect(f4, Math.max(f2 + f1, 0.0f), f5, Math.max(f3 + f1, 0.0f)));
        }
        long v1 = this.d;
        for(Object object7: arrayList2) {
            DrawScope.drawRoundRect-u-Aw5IA$default(((DrawScope)object0), v1, ((Rect)object7).getTopLeft-F1C5BW0(), ((Rect)object7).getSize-NH-jbRc(), CornerRadiusKt.CornerRadius(f, f), null, 0.0f, null, 0, 0xF0, null);
        }
        return Unit.INSTANCE;
    }
}

