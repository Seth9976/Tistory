package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001R \u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007R\u001A\u0010\n\u001A\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u001A\u0010\u000E\u001A\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000E\u0010\u000B\u001A\u0004\b\u000F\u0010\rR\u001A\u0010\u0011\u001A\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/kakao/tistory/presentation/widget/dialog/TistoryComposeDialogKt$ShowDialogEventPreview$data$1", "Lcom/kakao/tistory/presentation/widget/dialog/AlertDialogData;", "Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "getOkCallback", "()Lkotlin/jvm/functions/Function0;", "okCallback", "", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "message", "getMessage", "", "showCancel", "Z", "getShowCancel", "()Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TistoryComposeDialogKt.ShowDialogEventPreview.data.1 implements AlertDialogData {
    public final y0 a;

    public TistoryComposeDialogKt.ShowDialogEventPreview.data.1(MutableState mutableState0) {
        this.a = new y0(mutableState0);
    }

    @Override  // com.kakao.tistory.presentation.widget.dialog.AlertDialogData
    @NotNull
    public String getMessage() {
        return "message";
    }

    @Override  // com.kakao.tistory.presentation.widget.dialog.AlertDialogData
    @Nullable
    public Integer getMessageRes() {
        return null;
    }

    @Override  // com.kakao.tistory.presentation.widget.dialog.AlertDialogData
    @NotNull
    public Function0 getOkCallback() {
        return this.a;
    }

    @Override  // com.kakao.tistory.presentation.widget.dialog.AlertDialogData
    public boolean getShowCancel() {
        return true;
    }

    @Override  // com.kakao.tistory.presentation.widget.dialog.AlertDialogData
    @NotNull
    public String getTitle() {
        return "title";
    }

    @Override  // com.kakao.tistory.presentation.widget.dialog.AlertDialogData
    @Nullable
    public Integer getTitleRes() {
        return null;
    }
}

