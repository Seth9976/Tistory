package com.kakao.tistory.presentation.view.comment;

import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyEvent.BackToList;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyEvent.SetActivityResult;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyEvent.ShowDialog;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyEvent;
import com.kakao.tistory.presentation.view.common.dialog.DialogUIModel;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

public final class d1 implements FlowCollector {
    public final CommentFragment a;

    public d1(CommentFragment commentFragment0) {
        this.a = commentFragment0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        if(((CommentModifyEvent)object0) instanceof ShowDialog) {
            FragmentActivity fragmentActivity0 = this.a.getActivity();
            if(fragmentActivity0 != null) {
                DialogUIModel dialogUIModel0 = ((ShowDialog)(((CommentModifyEvent)object0))).getDialogUIModel();
                TistoryDialog.INSTANCE.showOkCancel(fragmentActivity0, dialogUIModel0);
                return Unit.INSTANCE;
            }
        }
        else if(((CommentModifyEvent)object0) instanceof SetActivityResult) {
            FragmentActivity fragmentActivity1 = this.a.getActivity();
            if(fragmentActivity1 != null) {
                fragmentActivity1.setResult(((SetActivityResult)(((CommentModifyEvent)object0))).getResultType().getCode());
            }
            if(((SetActivityResult)(((CommentModifyEvent)object0))).getFinish()) {
                FragmentActivity fragmentActivity2 = this.a.getActivity();
                if(fragmentActivity2 != null) {
                    fragmentActivity2.finish();
                    return Unit.INSTANCE;
                }
            }
        }
        else if(((CommentModifyEvent)object0) instanceof BackToList) {
            CommentFragment.access$getNavViewModel(this.a).goList(((BackToList)(((CommentModifyEvent)object0))).getCommentId());
        }
        return Unit.INSTANCE;
    }
}

