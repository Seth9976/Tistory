package com.kakao.tistory.presentation.view.comment;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.presentation.common.utils.ToastUtils;
import com.kakao.tistory.presentation.view.comment.contract.CommentListEvent.GoModify;
import com.kakao.tistory.presentation.view.comment.contract.CommentListEvent.SetActivityResult;
import com.kakao.tistory.presentation.view.comment.contract.CommentListEvent.ShowDialog;
import com.kakao.tistory.presentation.view.comment.contract.CommentListEvent.ShowToast;
import com.kakao.tistory.presentation.view.comment.contract.CommentListEvent;
import com.kakao.tistory.presentation.view.common.dialog.DialogUIModel;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

public final class b1 implements FlowCollector {
    public final CommentFragment a;

    public b1(CommentFragment commentFragment0) {
        this.a = commentFragment0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        if(((CommentListEvent)object0) instanceof ShowDialog) {
            FragmentActivity fragmentActivity0 = this.a.getActivity();
            if(fragmentActivity0 != null) {
                DialogUIModel dialogUIModel0 = ((ShowDialog)(((CommentListEvent)object0))).getDialogUIModel();
                TistoryDialog.INSTANCE.showOkCancel(fragmentActivity0, dialogUIModel0);
                return Unit.INSTANCE;
            }
        }
        else {
            if(((CommentListEvent)object0) instanceof ShowToast) {
                Context context0 = this.a.getContext();
                int v = ((ShowToast)(((CommentListEvent)object0))).getMessageResId();
                ToastUtils.show$default(ToastUtils.INSTANCE, context0, v, 0, 0, 12, null);
                return Unit.INSTANCE;
            }
            if(((CommentListEvent)object0) instanceof SetActivityResult) {
                FragmentActivity fragmentActivity1 = this.a.getActivity();
                if(fragmentActivity1 != null) {
                    fragmentActivity1.setResult(((SetActivityResult)(((CommentListEvent)object0))).getResultType().getCode());
                }
                if(((SetActivityResult)(((CommentListEvent)object0))).getFinish()) {
                    FragmentActivity fragmentActivity2 = this.a.getActivity();
                    if(fragmentActivity2 != null) {
                        fragmentActivity2.finish();
                        return Unit.INSTANCE;
                    }
                }
            }
            else if(((CommentListEvent)object0) instanceof GoModify) {
                CommentFragment.access$getNavViewModel(this.a).goModify(((GoModify)(((CommentListEvent)object0))).getBlogName(), ((GoModify)(((CommentListEvent)object0))).getEntryId(), ((GoModify)(((CommentListEvent)object0))).getGuestPassword(), ((GoModify)(((CommentListEvent)object0))).getCommentItem());
            }
        }
        return Unit.INSTANCE;
    }
}

