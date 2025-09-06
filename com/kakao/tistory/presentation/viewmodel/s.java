package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.entry.DaumLikeCategoryItem;
import com.kakao.tistory.domain.entity.entry.DaumLikeItem;
import com.kakao.tistory.domain.entity.entry.DaumLikeViewItemModel.DaumLikeCategoryTitle;
import com.kakao.tistory.domain.entity.entry.DaumLikeViewItemModel.PairChild;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function1 {
    public final DaumCategoryViewModel a;

    public s(DaumCategoryViewModel daumCategoryViewModel0) {
        this.a = daumCategoryViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DaumLikeCategoryItem)object0), "categoryItem");
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(new DaumLikeCategoryTitle(((DaumLikeCategoryItem)object0)));
        List list0 = ((DaumLikeCategoryItem)object0).getSubItems();
        if(list0 != null) {
            if(list0.isEmpty()) {
                list0 = null;
            }
            if(list0 != null) {
                for(Object object1: DaumCategoryViewModel.access$listToPair(this.a, list0)) {
                    arrayList0.add(new PairChild(((DaumLikeItem)((Pair)object1).getFirst()), ((DaumLikeItem)((Pair)object1).getSecond())));
                }
            }
        }
        return Observable.fromIterable(arrayList0);
    }
}

