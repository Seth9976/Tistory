package com.kakao.tistory.presentation.view.comment;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.paging.compose.LazyFoundationExtensionsKt;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Pin;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function1 {
    public final boolean a;
    public final LazyPagingItems b;
    public final int c;
    public final long d;
    public final Pin e;
    public final SoftwareKeyboardController f;
    public final CommentFragment g;
    public final FocusRequester h;

    public z(boolean z, LazyPagingItems lazyPagingItems0, int v, long v1, Pin commentItemUIModel$Pin0, SoftwareKeyboardController softwareKeyboardController0, CommentFragment commentFragment0, FocusRequester focusRequester0) {
        this.a = z;
        this.b = lazyPagingItems0;
        this.c = v;
        this.d = v1;
        this.e = commentItemUIModel$Pin0;
        this.f = softwareKeyboardController0;
        this.g = commentFragment0;
        this.h = focusRequester0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        if(this.a) {
            LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableLambdaKt.composableLambdaInstance(2016960137, true, new r(this.c, this.d)), 3, null);
        }
        if(this.a) {
            LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableLambdaKt.composableLambdaInstance(0xEA1B3200, true, new t(this.e, this.f, this.g)), 3, null);
        }
        LazyListScope.items$default(((LazyListScope)object0), this.b.getItemCount(), LazyFoundationExtensionsKt.itemKey(this.b, u.a), null, ComposableLambdaKt.composableLambdaInstance(-2023185545, true, new y(this.b, this.h, this.f, this.g)), 4, null);
        return Unit.INSTANCE;
    }
}

