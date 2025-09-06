package com.kakao.keditor.plugin.attrs.item;

import com.kakao.keditor.plugin.attrs.LoadingStatus.Completed;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Failed;
import com.kakao.keditor.plugin.attrs.LoadingStatus.OnLoading;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Succeed;
import com.kakao.keditor.plugin.attrs.LoadingStatus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001A\u00020\tH\u0016J\b\u0010\n\u001A\u00020\tH\u0016J\b\u0010\u000B\u001A\u00020\fH\u0016J\b\u0010\r\u001A\u00020\tH\u0016J\b\u0010\u000E\u001A\u00020\tH\u0016R\u0018\u0010\u0002\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000F"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/item/Loadable;", "", "loadingStatus", "Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "getLoadingStatus", "()Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "setLoadingStatus", "(Lcom/kakao/keditor/plugin/attrs/LoadingStatus;)V", "completedLoading", "", "failedLoading", "isNowLoading", "", "startedLoading", "succeedLoading", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface Loadable {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void completedLoading(@NotNull Loadable loadable0) {
            loadable0.setLoadingStatus(new Completed());
        }

        public static void failedLoading(@NotNull Loadable loadable0) {
            loadable0.setLoadingStatus(Failed.INSTANCE);
        }

        public static boolean isNowLoading(@NotNull Loadable loadable0) {
            return !(loadable0.getLoadingStatus() instanceof Completed);
        }

        public static void startedLoading(@NotNull Loadable loadable0) {
            loadable0.setLoadingStatus(OnLoading.INSTANCE);
        }

        public static void succeedLoading(@NotNull Loadable loadable0) {
            loadable0.setLoadingStatus(Succeed.INSTANCE);
        }
    }

    void completedLoading();

    void failedLoading();

    @NotNull
    LoadingStatus getLoadingStatus();

    boolean isNowLoading();

    void setLoadingStatus(@NotNull LoadingStatus arg1);

    void startedLoading();

    void succeedLoading();
}

