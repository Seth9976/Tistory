package com.kakao.tistory.presentation.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.editor.contract.EditorChallenge;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class m0 extends SuspendLambda implements Function2 {
    public int a;
    public final EditorViewModel b;
    public final boolean c;
    public final String d;
    public final Long e;
    public final String f;
    public final Integer g;
    public final EntryVisibilityType h;
    public final String i;
    public final String j;
    public final long k;
    public final String l;
    public final List m;
    public final Integer n;

    public m0(EditorViewModel editorViewModel0, boolean z, String s, Long long0, String s1, Integer integer0, EntryVisibilityType entryVisibilityType0, String s2, String s3, long v, String s4, List list0, Integer integer1, Continuation continuation0) {
        this.b = editorViewModel0;
        this.c = z;
        this.d = s;
        this.e = long0;
        this.f = s1;
        this.g = integer0;
        this.h = entryVisibilityType0;
        this.i = s2;
        this.j = s3;
        this.k = v;
        this.l = s4;
        this.m = list0;
        this.n = integer1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new m0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((m0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        int v;
        Object object2;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                EditorChallenge editorChallenge0 = (EditorChallenge)this.b.y0.getValue();
                this.a = 1;
                object2 = this.b.g.postNewEntry(this.d, this.e, this.f, this.g, this.h, this.i, this.j, Boxing.boxLong(this.k), ((int)this.c), this.l, this.m, this.n, (editorChallenge0 == null ? null : editorChallenge0.getChallengeCode()), this);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                object2 = object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        EditorViewModel editorViewModel0 = this.b;
        EntryVisibilityType entryVisibilityType0 = this.h;
        if(((Result)object2) instanceof Success) {
            EditorViewModel.access$stopAutoSaving(editorViewModel0);
            editorViewModel0.clearAutoSaved();
            Logger.INSTANCE.log("new entry : " + ((Success)(((Result)object2))));
            editorViewModel0.isShowProgress().postValue(Boxing.boxBoolean(false));
            MutableLiveData mutableLiveData0 = editorViewModel0.E;
            switch(entryVisibilityType0) {
                case 1: {
                    v = string.label_toast_finish_publish;
                    break;
                }
                case 2: {
                    v = string.label_toast_finish_protected;
                    break;
                }
                case 3: {
                    v = string.label_toast_finish_private;
                    break;
                }
                default: {
                    v = string.label_toast_finish_publish;
                }
            }
            mutableLiveData0.setValue(new Event(Boxing.boxInt(v)));
            Pair pair0 = (Pair)((Success)(((Result)object2))).getData();
            ((EntryItem)pair0.getFirst()).setPassword(((String)editorViewModel0.getPassword().getValue()));
            editorViewModel0.w.setValue(new Event(pair0));
            return Unit.INSTANCE;
        }
        if(((Result)object2) instanceof Fail) {
            editorViewModel0.showErrorDialog(((Fail)(((Result)object2))).getErrorModel());
            editorViewModel0.isShowProgress().postValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }
}

