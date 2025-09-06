package com.kakao.tistory.presentation.view.comment;

import com.kakao.tistory.presentation.common.IllegalFilmType;
import com.kakao.tistory.presentation.view.bottomsheet.ReportDialogFragment.Companion;
import com.kakao.tistory.presentation.view.bottomsheet.ReportDialogFragment;
import com.kakao.tistory.presentation.view.bottomsheet.ReportExtra;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h1 extends Lambda implements Function1 {
    public final CommentListViewModel a;
    public final CommentFragment b;

    public h1(CommentListViewModel commentListViewModel0, CommentFragment commentFragment0) {
        this.a = commentListViewModel0;
        this.b = commentFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ReportExtra)object0), "reportExtra");
        String s = this.a.getCommentTiara().getSection();
        String s1 = this.a.getCommentTiara().getPage();
        String s2 = ((ReportExtra)object0).getBlogName();
        Long long0 = ((ReportExtra)object0).getBlogId();
        long v = ((ReportExtra)object0).getEntryId();
        long v1 = ((ReportExtra)object0).getCommentId();
        Long long1 = ((ReportExtra)object0).getAuthorId();
        String s3 = ((ReportExtra)object0).getAuthorName();
        String s4 = ((ReportExtra)object0).getEntryTitle();
        IllegalFilmType illegalFilmType0 = this.b.getIllegalFilmType();
        Companion.newInstance$default(ReportDialogFragment.Companion, s, s1, s2, long0, v, long1, s3, s4, illegalFilmType0, v1, null, 0x400, null).show(this.b.getChildFragmentManager(), "ReportDialogFragment");
        return Unit.INSTANCE;
    }
}

