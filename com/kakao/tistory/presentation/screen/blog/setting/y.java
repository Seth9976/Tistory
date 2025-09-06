package com.kakao.tistory.presentation.screen.blog.setting;

import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.repository.OldBlogRepository;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingEvent.Complete;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingEvent.Finish;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ShowErrorDialog;
import com.kakao.tistory.presentation.screen.blog.setting.tiara.BlogSettingTiara;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class y extends SuspendLambda implements Function2 {
    public int a;
    public final BlogInfo b;
    public final String c;
    public final BlogSettingViewModel d;
    public final String e;
    public final String f;
    public final String g;

    public y(BlogInfo blogInfo0, String s, BlogSettingViewModel blogSettingViewModel0, String s1, String s2, String s3, Continuation continuation0) {
        this.b = blogInfo0;
        this.c = s;
        this.d = blogSettingViewModel0;
        this.e = s1;
        this.f = s2;
        this.g = s3;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new y(this.b, this.c, this.d, this.e, this.f, this.g, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((y)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object2;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = this.b.getName();
                String s1 = this.b.getLogoImageUrl();
                if(s1 == null) {
                    s1 = "";
                }
                boolean z = !p.isBlank(s1) && (this.c == null || p.isBlank(this.c) || !Intrinsics.areEqual(this.c, s1));
                String s2 = null;
                String s3 = this.c == null || !p.isBlank(this.c) != 1 || Intrinsics.areEqual(this.c, s1) ? null : this.c;
                OldBlogRepository oldBlogRepository0 = this.d.f;
                String s4 = StringsKt__StringsKt.trim(this.e).toString();
                String s5 = StringsKt__StringsKt.trim(this.f).toString();
                if(!p.isBlank(s5)) {
                    s2 = s5;
                }
                this.a = 1;
                object2 = oldBlogRepository0.postBlogInfo(s, s4, s2, this.g, s3, z, this);
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
        BlogSettingViewModel blogSettingViewModel0 = this.d;
        BlogInfo blogInfo0 = this.b;
        String s6 = this.g;
        if(((Result)object2) instanceof Success) {
            Blog blog0 = (Blog)((Success)(((Result)object2))).getData();
            String s7 = blog0.getTitle();
            String s8 = blog0.getDescription();
            blogSettingViewModel0.sendEvent(new Complete(BlogInfo.copy$default(blogInfo0, 0L, null, null, (s7 == null ? "" : s7), (s8 == null ? "" : s8), 0L, null, null, null, null, false, false, 0, false, 0, 0, false, null, blog0.getLogoImageUrl(), s6, 0x3FFE7, null)));
            blogSettingViewModel0.g.updateBlog(((Blog)((Success)(((Result)object2))).getData()));
            blogSettingViewModel0.sendEvent(Finish.INSTANCE);
            BlogSettingTiara.INSTANCE.trackClickFinish();
            return Unit.INSTANCE;
        }
        if(((Result)object2) instanceof Fail) {
            blogSettingViewModel0.sendIntent(new ShowErrorDialog(((Fail)(((Result)object2))).getErrorModel()));
        }
        return Unit.INSTANCE;
    }
}

