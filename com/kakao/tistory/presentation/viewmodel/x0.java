package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.blog.entity.EntryCategoryVisibilityType;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.domain.entity.CategoryItem;
import com.kakao.tistory.domain.entity.CategoryItemListModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.editor.contract.Category;
import com.kakao.tistory.presentation.editor.contract.EditorChallenge;
import com.kakao.tistory.presentation.editor.contract.EditorChallengeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.o;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class x0 extends SuspendLambda implements Function2 {
    public int a;
    public final EditorViewModel b;
    public final int c;

    public x0(EditorViewModel editorViewModel0, int v, Continuation continuation0) {
        this.b = editorViewModel0;
        this.c = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new x0(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new x0(this.b, this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.b.isShowProgress().postValue(Boxing.boxBoolean(true));
                this.a = 1;
                object0 = this.b.g.getCategories(this.b.getBlogName(), this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        EditorViewModel editorViewModel0 = this.b;
        int v = this.c;
        if(((Result)object0) instanceof Success) {
            List list0 = ((CategoryItemListModel)((Success)(((Result)object0))).getData()).getItems();
            CategoryItem categoryItem0 = null;
            if(list0 != null) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object2: list0) {
                    List list1 = ((CategoryItem)object2).getChildren();
                    if(list1 == null) {
                        list1 = CollectionsKt__CollectionsKt.emptyList();
                    }
                    o.addAll(arrayList0, CollectionsKt___CollectionsKt.plus(list1, ((CategoryItem)object2)));
                }
                for(Object object3: arrayList0) {
                    if(((CategoryItem)object3).getId() == v) {
                        categoryItem0 = object3;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(categoryItem0 != null && categoryItem0.getVisibility() == EntryCategoryVisibilityType.PRIVATE.getValue()) {
                editorViewModel0.getEntryVisibilityType().postValue(EntryVisibilityType.PRIVATE);
            }
            editorViewModel0.getCategoryItem().postValue(categoryItem0);
            if(((Boolean)editorViewModel0.getNeedChallengeValidation().getValue()).booleanValue()) {
                EditorChallenge editorChallenge0 = (EditorChallenge)editorViewModel0.getChallenge().getValue();
                if(editorChallenge0 != null) {
                    Category category0 = editorChallenge0.getCategory();
                    if(category0 != null && !EditorChallengeKt.isValid(category0, categoryItem0)) {
                        editorViewModel0.E.postValue(new Event(Boxing.boxInt(category0.getInvalidMessage())));
                    }
                }
            }
            editorViewModel0.isShowProgress().postValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            editorViewModel0.isShowProgress().postValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }
}

