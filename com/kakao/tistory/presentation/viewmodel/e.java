package com.kakao.tistory.presentation.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.kakao.android.base.BaseKt;
import com.kakao.tistory.domain.entity.CategoryItem;
import com.kakao.tistory.presentation.R.string;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final BlogCategoryViewModel a;

    public e(BlogCategoryViewModel blogCategoryViewModel0) {
        this.a = blogCategoryViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        List list0 = (List)object0;
        MutableLiveData mutableLiveData0 = this.a.getCategories();
        if(this.a.getEditMode()) {
            Intrinsics.checkNotNull(list0);
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            for(Object object1: list0) {
                CategoryItem categoryItem0 = (CategoryItem)object1;
                if(categoryItem0.getId() == -3) {
                    categoryItem0 = new CategoryItem(0, null, BaseKt.getAppContext().getString(string.label_editor_setting_no_category_select), null, null, null, null, 0, 0, null, false, null, null, 0x1FFB, null);
                }
                arrayList0.add(categoryItem0);
            }
            list0 = CollectionsKt___CollectionsKt.toMutableList(arrayList0);
        }
        mutableLiveData0.setValue(list0);
        this.a.isShowProgress().setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}

