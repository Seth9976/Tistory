package lb;

import android.database.Cursor;
import com.kakao.kphotopicker.loader.MediaRepository;
import com.kakao.kphotopicker.picker.Folder;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class b extends SuspendLambda implements Function2 {
    public List o;
    public Cursor p;
    public Closeable q;
    public MediaRepository r;
    public int s;
    public Object t;
    public final Folder u;
    public final MediaRepository v;

    public b(Folder folder0, MediaRepository mediaRepository0, Continuation continuation0) {
        this.u = folder0;
        this.v = mediaRepository0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new b(this.u, this.v, continuation0);
        continuation1.t = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b)this.create(((FlowCollector)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        FlowCollector flowCollector0;
        List list0;
        Closeable closeable1;
        Closeable closeable0;
        MediaRepository mediaRepository0;
        Closeable closeable2;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                flowCollector0 = (FlowCollector)this.t;
                Long long0 = this.u == null || this.u.isAllItemsFolder() ? null : Boxing.boxLong(this.u.getBucketId());
                list0 = new ArrayList();
                mediaRepository0 = this.v;
                closeable2 = MediaRepository.access$queryMediasBy(mediaRepository0, long0);
                if(closeable2 == null) {
                    return Unit.INSTANCE;
                }
                try {
                    if(((Cursor)closeable2).moveToFirst()) {
                        this.t = flowCollector0;
                        this.o = list0;
                        this.p = closeable2;
                        this.q = closeable2;
                        this.r = mediaRepository0;
                        this.s = 1;
                        if(flowCollector0.emit(list0, this) == object1) {
                            return object1;
                        }
                        goto label_48;
                    }
                    break;
                }
                catch(Throwable throwable1) {
                    closeable0 = closeable2;
                    throwable0 = throwable1;
                    throw throwable0;
                }
            label_48:
                closeable0 = closeable2;
                closeable1 = closeable0;
                try {
                    do {
                    label_50:
                        lb.a a0 = new lb.a(mediaRepository0, ((Cursor)closeable1), list0, null);
                        this.t = flowCollector0;
                        this.o = list0;
                        this.p = closeable1;
                        this.q = closeable0;
                        this.r = mediaRepository0;
                        this.s = 2;
                        if(BuildersKt.withContext(Dispatchers.getIO(), a0, this) == object1) {
                            return object1;
                        }
                    label_59:
                        this.t = flowCollector0;
                        this.o = list0;
                        this.p = closeable1;
                        this.q = closeable0;
                        this.r = mediaRepository0;
                        this.s = 3;
                        if(flowCollector0.emit(list0, this) == object1) {
                            return object1;
                        }
                    label_67:
                    }
                    while(((Cursor)closeable1).moveToNext());
                    closeable2 = closeable0;
                    break;
                }
                catch(Throwable throwable0) {
                }
                try {
                    throw throwable0;
                }
                catch(Throwable throwable2) {
                    CloseableKt.closeFinally(closeable0, throwable0);
                    throw throwable2;
                }
                closeable2 = closeable0;
                break;
            }
            case 1: {
                mediaRepository0 = this.r;
                closeable0 = this.q;
                closeable1 = this.p;
                list0 = this.o;
                flowCollector0 = (FlowCollector)this.t;
                ResultKt.throwOnFailure(object0);
                goto label_50;
            }
            case 2: {
                mediaRepository0 = this.r;
                closeable0 = this.q;
                closeable1 = this.p;
                list0 = this.o;
                flowCollector0 = (FlowCollector)this.t;
                ResultKt.throwOnFailure(object0);
                goto label_59;
            }
            case 3: {
                mediaRepository0 = this.r;
                closeable0 = this.q;
                closeable1 = this.p;
                list0 = this.o;
                flowCollector0 = (FlowCollector)this.t;
                ResultKt.throwOnFailure(object0);
                goto label_67;
            }
            case 4: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        CloseableKt.closeFinally(closeable2, null);
        this.t = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = 4;
        return flowCollector0.emit(list0, this) == object1 ? object1 : Unit.INSTANCE;
    }
}

