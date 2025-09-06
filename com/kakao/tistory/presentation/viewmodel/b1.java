package com.kakao.tistory.presentation.viewmodel;

import com.kakao.keditor.plugin.itemspec.opengraph.OpenGraphItem;
import com.kakao.tistory.domain.entity.entry.OpenGraphInfo;
import com.kakao.tistory.domain.entity.entry.OpenGraphVideoInfo;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class b1 extends SuspendLambda implements Function2 {
    public final Function1 a;
    public final OpenGraphItem b;
    public final OpenGraphInfo c;

    public b1(Function1 function10, OpenGraphItem openGraphItem0, OpenGraphInfo openGraphInfo0, Continuation continuation0) {
        this.a = function10;
        this.b = openGraphItem0;
        this.c = openGraphInfo0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new b1(this.a, this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Function1 function10 = this.a;
        OpenGraphItem openGraphItem0 = new OpenGraphItem();
        OpenGraphInfo openGraphInfo0 = this.c;
        openGraphItem0.setSourceUrl(this.b.getSourceUrl());
        String s = openGraphInfo0.getUrl();
        if(s == null) {
            s = "";
        }
        openGraphItem0.setUrl(s);
        openGraphItem0.setHost(openGraphInfo0.getHost());
        openGraphItem0.setResourceType(openGraphInfo0.getType());
        openGraphItem0.setTitle(openGraphInfo0.getTitle());
        List list0 = openGraphInfo0.getImage();
        Float float0 = null;
        openGraphItem0.setImage((list0 == null ? null : ((String)CollectionsKt___CollectionsKt.firstOrNull(list0))));
        openGraphItem0.setDesc(openGraphInfo0.getDescription());
        OpenGraphVideoInfo openGraphVideoInfo0 = openGraphInfo0.getVideo();
        openGraphItem0.setVideoWidth((openGraphVideoInfo0 == null ? null : Boxing.boxFloat(openGraphVideoInfo0.getScale_width())));
        OpenGraphVideoInfo openGraphVideoInfo1 = openGraphInfo0.getVideo();
        if(openGraphVideoInfo1 != null) {
            float0 = Boxing.boxFloat(openGraphVideoInfo1.getScale_height());
        }
        openGraphItem0.setVideoHeight(float0);
        function10.invoke(openGraphItem0);
        return Unit.INSTANCE;
    }
}

