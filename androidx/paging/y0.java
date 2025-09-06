package androidx.paging;

import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class y0 extends SuspendLambda implements Function2 {
    public int o;
    public final PageEvent p;
    public final PagingDataPresenter q;
    public final PagingData r;

    public y0(PageEvent pageEvent0, PagingDataPresenter pagingDataPresenter0, PagingData pagingData0, Continuation continuation0) {
        this.p = pageEvent0;
        this.q = pagingDataPresenter0;
        this.r = pagingData0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new y0(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((y0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        boolean z = true;
        boolean z1 = false;
        PagingDataPresenter pagingDataPresenter0 = this.q;
        PageEvent pageEvent0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PagingData pagingData0 = this.r;
                if(pageEvent0 instanceof StaticList) {
                    List list0 = k.listOf(new TransformablePage(0, ((StaticList)pageEvent0).getData()));
                    if(((StaticList)pageEvent0).getSourceLoadStates() != null || ((StaticList)pageEvent0).getMediatorLoadStates() != null) {
                        z1 = true;
                    }
                    this.o = 1;
                    if(PagingDataPresenter.access$presentNewList(this.q, list0, 0, 0, z1, ((StaticList)pageEvent0).getSourceLoadStates(), ((StaticList)pageEvent0).getMediatorLoadStates(), pagingData0.getHintReceiver$paging_common_release(), this) == object1) {
                        return object1;
                    }
                }
                else if(pageEvent0 instanceof Insert && ((Insert)pageEvent0).getLoadType() == LoadType.REFRESH) {
                    this.o = 2;
                    if(PagingDataPresenter.access$presentNewList(this.q, ((Insert)pageEvent0).getPages(), ((Insert)pageEvent0).getPlaceholdersBefore(), ((Insert)pageEvent0).getPlaceholdersAfter(), true, ((Insert)pageEvent0).getSourceLoadStates(), ((Insert)pageEvent0).getMediatorLoadStates(), pagingData0.getHintReceiver$paging_common_release(), this) == object1) {
                        return object1;
                    }
                }
                else if(pageEvent0 instanceof Insert) {
                    PagingDataEvent pagingDataEvent0 = pagingDataPresenter0.d.processEvent(pageEvent0);
                    this.o = 3;
                    if(pagingDataPresenter0.presentPagingDataEvent(pagingDataEvent0, this) == object1) {
                        return object1;
                    }
                label_33:
                    pagingDataPresenter0.e.set(((Insert)pageEvent0).getSourceLoadStates(), ((Insert)pageEvent0).getMediatorLoadStates());
                    CombinedLoadStates combinedLoadStates0 = (CombinedLoadStates)pagingDataPresenter0.e.getStateFlow().getValue();
                    LoadStates loadStates0 = combinedLoadStates0 == null ? null : combinedLoadStates0.getSource();
                    if(loadStates0 == null) {
                        throw new IllegalStateException("PagingDataPresenter.combinedLoadStatesCollection.stateFlow should not hold null CombinedLoadStates after Insert event.");
                    }
                    boolean z2 = (((Insert)pageEvent0).getLoadType() != LoadType.PREPEND || !loadStates0.getPrepend().getEndOfPaginationReached()) && (((Insert)pageEvent0).getLoadType() != LoadType.APPEND || !loadStates0.getAppend().getEndOfPaginationReached());
                    Iterable iterable0 = ((Insert)pageEvent0).getPages();
                    if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                        for(Object object2: iterable0) {
                            if(!((TransformablePage)object2).getData().isEmpty()) {
                                z = false;
                                break;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    if(!z2) {
                        pagingDataPresenter0.h = false;
                    }
                    else if(pagingDataPresenter0.h || z) {
                        if(z || pagingDataPresenter0.i < pagingDataPresenter0.d.getPlaceholdersBefore() || pagingDataPresenter0.i > pagingDataPresenter0.d.getDataCount() + pagingDataPresenter0.d.getPlaceholdersBefore()) {
                            HintReceiver hintReceiver0 = pagingDataPresenter0.b;
                            if(hintReceiver0 != null) {
                                hintReceiver0.accessHint(pagingDataPresenter0.d.accessHintForPresenterIndex(pagingDataPresenter0.i));
                                break;
                            }
                        }
                        else {
                            pagingDataPresenter0.h = false;
                        }
                    }
                }
                else if(pageEvent0 instanceof Drop) {
                    PagingDataEvent pagingDataEvent1 = pagingDataPresenter0.d.processEvent(pageEvent0);
                    this.o = 4;
                    if(pagingDataPresenter0.presentPagingDataEvent(pagingDataEvent1, this) == object1) {
                        return object1;
                    }
                    pagingDataPresenter0.e.set(((Drop)pageEvent0).getLoadType(), false, NotLoading.Companion.getIncomplete$paging_common_release());
                    pagingDataPresenter0.h = false;
                }
                else if(pageEvent0 instanceof LoadStateUpdate) {
                    pagingDataPresenter0.e.set(((LoadStateUpdate)pageEvent0).getSource(), ((LoadStateUpdate)pageEvent0).getMediator());
                }
                break;
            }
            case 1: 
            case 2: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 3: {
                ResultKt.throwOnFailure(object0);
                goto label_33;
            }
            case 4: {
                ResultKt.throwOnFailure(object0);
                pagingDataPresenter0.e.set(((Drop)pageEvent0).getLoadType(), false, NotLoading.Companion.getIncomplete$paging_common_release());
                pagingDataPresenter0.h = false;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(pageEvent0 instanceof Insert || pageEvent0 instanceof Drop || pageEvent0 instanceof StaticList) {
            for(Object object3: pagingDataPresenter0.f) {
                ((Function0)object3).invoke();
            }
        }
        return Unit.INSTANCE;
    }
}

