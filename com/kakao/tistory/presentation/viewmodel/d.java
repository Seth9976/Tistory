package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.CategoryItem;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;

public final class d extends Lambda implements Function1 {
    public final IntRef a;

    public d(IntRef ref$IntRef0) {
        this.a = ref$IntRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((CategoryItem)object0), "categoryItem");
        ArrayList arrayList0 = new ArrayList();
        int v = this.a.element;
        this.a.element = v + 1;
        ((CategoryItem)object0).setParentOrder(v);
        arrayList0.add(((CategoryItem)object0));
        List list0 = ((CategoryItem)object0).getChildren();
        if(list0 != null) {
            if(list0.isEmpty()) {
                list0 = null;
            }
            if(list0 != null) {
                int v1 = 0;
                for(Object object1: list0) {
                    ((CategoryItem)object1).setLastItem(v1 == list0.size() - 1);
                    ((CategoryItem)object1).setParentOrder(((CategoryItem)object0).getParentOrder());
                    ((CategoryItem)object1).setChildOrder(v1 + 1);
                    arrayList0.add(((CategoryItem)object1));
                    ++v1;
                }
            }
        }
        return Observable.fromIterable(arrayList0);
    }
}

