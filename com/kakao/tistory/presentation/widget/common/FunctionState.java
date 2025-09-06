package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000*\u000E\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004B\u000F\u0012\u0006\u0010\u0005\u001A\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00028\u0000¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001A\u00020\u0002¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/presentation/widget/common/FunctionState;", "Lkotlin/Function0;", "", "T", "", "value", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "onClick", "update", "invoke", "()V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FunctionState {
    public static final int $stable;
    public Function0 a;

    public FunctionState(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "value");
        super();
        this.a = function00;
    }

    public final void invoke() {
        this.a.invoke();
    }

    public final void update(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "onClick");
        this.a = function00;
    }
}

