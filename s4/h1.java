package s4;

import androidx.paging.HintReceiver;
import androidx.paging.LoadStates;
import androidx.paging.PageStore;
import androidx.paging.PagingDataPresenter;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class h1 extends ContinuationImpl {
    public PagingDataPresenter o;
    public List p;
    public LoadStates q;
    public LoadStates r;
    public HintReceiver s;
    public PageStore t;
    public int u;
    public int v;
    public boolean w;
    public Object x;
    public final PagingDataPresenter y;
    public int z;

    public h1(PagingDataPresenter pagingDataPresenter0, Continuation continuation0) {
        this.y = pagingDataPresenter0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.x = object0;
        this.z |= 0x80000000;
        return PagingDataPresenter.access$presentNewList(this.y, null, 0, 0, false, null, null, null, this);
    }
}

