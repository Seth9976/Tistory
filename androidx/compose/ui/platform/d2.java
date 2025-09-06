package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings.Global;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class d2 extends SuspendLambda implements Function2 {
    public ChannelIterator o;
    public int p;
    public Object q;
    public final ContentResolver r;
    public final Uri s;
    public final WindowRecomposer_androidKt.getAnimationScaleFlowFor.1.1.contentObserver.1 t;
    public final Channel u;
    public final Context v;

    public d2(ContentResolver contentResolver0, Uri uri0, WindowRecomposer_androidKt.getAnimationScaleFlowFor.1.1.contentObserver.1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$10, Channel channel0, Context context0, Continuation continuation0) {
        this.r = contentResolver0;
        this.s = uri0;
        this.t = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$10;
        this.u = channel0;
        this.v = context0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new d2(this.r, this.s, this.t, this.u, this.v, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d2)this.create(((FlowCollector)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        FlowCollector flowCollector1;
        ChannelIterator channelIterator0;
        FlowCollector flowCollector0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        WindowRecomposer_androidKt.getAnimationScaleFlowFor.1.1.contentObserver.1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$10 = this.t;
        ContentResolver contentResolver0 = this.r;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                flowCollector0 = (FlowCollector)this.q;
                contentResolver0.registerContentObserver(this.s, false, windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$10);
                try {
                    channelIterator0 = this.u.iterator();
                    goto label_18;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                channelIterator0 = this.o;
                flowCollector1 = (FlowCollector)this.q;
                try {
                    ResultKt.throwOnFailure(object0);
                    goto label_26;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 2: {
                channelIterator0 = this.o;
                flowCollector1 = (FlowCollector)this.q;
                try {
                    ResultKt.throwOnFailure(object0);
                    while(true) {
                        flowCollector0 = flowCollector1;
                    label_18:
                        this.q = flowCollector0;
                        this.o = channelIterator0;
                        this.p = 1;
                        Object object2 = channelIterator0.hasNext(this);
                        if(object2 == object1) {
                            return object1;
                        }
                        flowCollector1 = flowCollector0;
                        object0 = object2;
                    label_26:
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_38;
                        }
                        channelIterator0.next();
                        Float float0 = Boxing.boxFloat(Settings.Global.getFloat(this.v.getContentResolver(), "animator_duration_scale", 1.0f));
                        this.q = flowCollector1;
                        this.o = channelIterator0;
                        this.p = 2;
                        if(flowCollector1.emit(float0, this) != object1) {
                            continue;
                        }
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        contentResolver0.unregisterContentObserver(windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$10);
        throw throwable0;
    label_38:
        contentResolver0.unregisterContentObserver(windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$10);
        return Unit.INSTANCE;
    }
}

