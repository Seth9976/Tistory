package com.kakao.tistory.presentation.viewmodel;

import com.kakao.keditor.plugin.attrs.item.Uploadable.DefaultImpls;
import com.kakao.keditor.plugin.pluginspec.image.ImageItem;
import com.kakao.tistory.domain.ErrorStatus;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.entity.entry.AttachedData;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.utils.CrashlyticsUtils;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class n1 extends SuspendLambda implements Function2 {
    public int a;
    public Object b;
    public final ImageItem c;
    public final EditorViewModel d;
    public final String e;

    public n1(ImageItem imageItem0, EditorViewModel editorViewModel0, String s, Continuation continuation0) {
        this.c = imageItem0;
        this.d = editorViewModel0;
        this.e = s;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new n1(this.c, this.d, this.e, continuation0);
        continuation1.b = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((n1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        CoroutineScope coroutineScope1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.b;
                CoroutineScopeKt.ensureActive(coroutineScope0);
                long v = new File(this.c.getPath()).length();
                CrashlyticsUtils.INSTANCE.logMessage("Upload Image Size : " + v);
                String s = this.c.getPath();
                this.b = coroutineScope0;
                this.a = 1;
                Object object2 = this.d.h.postBlogAttachImage(this.e, s, this);
                if(object2 == object1) {
                    return object1;
                }
                coroutineScope1 = coroutineScope0;
                object0 = object2;
                break;
            }
            case 1: {
                coroutineScope1 = (CoroutineScope)this.b;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ImageItem imageItem0 = this.c;
        EditorViewModel editorViewModel0 = this.d;
        if(((Result)object0) instanceof Success) {
            CoroutineScopeKt.ensureActive(coroutineScope1);
            imageItem0.uploadSucceed(((AttachedData)((Success)(((Result)object0))).getData()).getUrl());
            return Boxing.boxBoolean(true);
        }
        if(((Result)object0) instanceof Fail) {
            DefaultImpls.uploadFailed$default(imageItem0, null, 1, null);
            if(((Fail)(((Result)object0))).getErrorModel().getCode() == ErrorStatus.FILE_NOT_FOUND.getCode()) {
                editorViewModel0.u.postValue(new Event(Boxing.boxInt(string.label_dialog_deleted_image_upload_title)));
                return Boxing.boxBoolean(false);
            }
            editorViewModel0.u.postValue(new Event(Boxing.boxInt(string.label_dialog_image_upload_fail_title)));
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(true);
    }
}

