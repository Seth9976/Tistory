package com.kakao.tistory.presentation.view.comment;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.State;
import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.presentation.common.extension.Event;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class e extends SuspendLambda implements Function2 {
    public int a;
    public final ModalBottomSheetState b;
    public final CommentMenuItem c;
    public final CommentListViewModel d;
    public final Long e;
    public final CommentItem f;
    public final State g;

    public e(ModalBottomSheetState modalBottomSheetState0, CommentMenuItem commentMenuItem0, CommentListViewModel commentListViewModel0, Long long0, CommentItem commentItemType$CommentItem0, State state0, Continuation continuation0) {
        this.b = modalBottomSheetState0;
        this.c = commentMenuItem0;
        this.d = commentListViewModel0;
        this.e = long0;
        this.f = commentItemType$CommentItem0;
        this.g = state0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new e(this.b, this.c, this.d, this.e, this.f, this.g, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((e)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                if(this.b.hide(this) == object1) {
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
        Event event0 = CommentBottomSheetKt.access$CommentBottomSheet$lambda$0(this.g);
        if(event0 != null) {
            event0.getContentIfNotHandled();
        }
        switch(CommentBottomSheetKt.CommentBottomSheet.1.1.WhenMappings.$EnumSwitchMapping$0[this.c.ordinal()]) {
            case 1: {
                this.d.onClickDelete(this.e, this.f);
                return Unit.INSTANCE;
            }
            case 2: {
                this.d.onClickModify(this.f);
                return Unit.INSTANCE;
            }
            case 3: {
                this.d.onClickReport(this.f.getId());
                return Unit.INSTANCE;
            }
            case 4: {
                this.d.onClickPin(this.f.getId(), true);
                return Unit.INSTANCE;
            }
            case 5: {
                this.d.onClickPin(this.f.getId(), false);
                return Unit.INSTANCE;
            }
            default: {
                return Unit.INSTANCE;
            }
        }
    }
}

