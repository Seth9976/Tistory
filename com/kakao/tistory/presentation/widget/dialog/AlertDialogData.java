package com.kakao.tistory.presentation.widget.dialog;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001A\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001A\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u001C\u0010\n\u001A\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000B8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000ER\u0014\u0010\u000F\u001A\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001A\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0005R\u0016\u0010\u0015\u001A\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/presentation/widget/dialog/AlertDialogData;", "", "message", "", "getMessage", "()Ljava/lang/String;", "messageRes", "", "getMessageRes", "()Ljava/lang/Integer;", "okCallback", "Lkotlin/Function0;", "", "getOkCallback", "()Lkotlin/jvm/functions/Function0;", "showCancel", "", "getShowCancel", "()Z", "title", "getTitle", "titleRes", "getTitleRes", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface AlertDialogData {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Nullable
        public static String getMessage(@NotNull AlertDialogData alertDialogData0) {
            return null;
        }

        @Nullable
        public static Integer getMessageRes(@NotNull AlertDialogData alertDialogData0) [...] // Inlined contents

        @Nullable
        public static Function0 getOkCallback(@NotNull AlertDialogData alertDialogData0) {
            return null;
        }

        public static boolean getShowCancel(@NotNull AlertDialogData alertDialogData0) {
            return false;
        }

        @Nullable
        public static String getTitle(@NotNull AlertDialogData alertDialogData0) {
            return null;
        }

        @Nullable
        public static Integer getTitleRes(@NotNull AlertDialogData alertDialogData0) [...] // Inlined contents
    }

    @Nullable
    String getMessage();

    @Nullable
    Integer getMessageRes();

    @Nullable
    Function0 getOkCallback();

    boolean getShowCancel();

    @Nullable
    String getTitle();

    @Nullable
    Integer getTitleRes();
}

