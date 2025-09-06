package com.kakao.keditor.plugin.attrs;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\b\t\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "Ljava/io/Serializable;", "()V", "Completed", "Failed", "OnLoading", "Ready", "Succeed", "Lcom/kakao/keditor/plugin/attrs/LoadingStatus$Completed;", "Lcom/kakao/keditor/plugin/attrs/LoadingStatus$OnLoading;", "Lcom/kakao/keditor/plugin/attrs/LoadingStatus$Ready;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class LoadingStatus implements Serializable {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/LoadingStatus$Completed;", "Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static class Completed extends LoadingStatus {
        public Completed() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/LoadingStatus$Failed;", "Lcom/kakao/keditor/plugin/attrs/LoadingStatus$Completed;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Failed extends Completed {
        @NotNull
        public static final Failed INSTANCE;

        static {
            Failed.INSTANCE = new Failed();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/LoadingStatus$OnLoading;", "Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class OnLoading extends LoadingStatus {
        @NotNull
        public static final OnLoading INSTANCE;

        static {
            OnLoading.INSTANCE = new OnLoading();
        }

        private OnLoading() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/LoadingStatus$Ready;", "Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Ready extends LoadingStatus {
        @NotNull
        public static final Ready INSTANCE;

        static {
            Ready.INSTANCE = new Ready();
        }

        private Ready() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/LoadingStatus$Succeed;", "Lcom/kakao/keditor/plugin/attrs/LoadingStatus$Completed;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Succeed extends Completed {
        @NotNull
        public static final Succeed INSTANCE;

        static {
            Succeed.INSTANCE = new Succeed();
        }
    }

    private LoadingStatus() {
    }

    public LoadingStatus(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

