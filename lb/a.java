package lb;

import android.database.Cursor;
import com.kakao.kphotopicker.loader.MediaRepository;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class a extends SuspendLambda implements Function2 {
    public final MediaRepository o;
    public final Cursor p;
    public final List q;

    public a(MediaRepository mediaRepository0, Cursor cursor0, List list0, Continuation continuation0) {
        this.o = mediaRepository0;
        this.p = cursor0;
        this.q = list0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a(this.o, this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        int v = MediaRepository.access$getPageSize(this.o, this.p);
        Collection collection0 = MediaRepository.access$getScopeList(this.o, this.p, this.q.size(), v);
        return Boxing.boxBoolean(this.q.addAll(collection0));
    }
}

