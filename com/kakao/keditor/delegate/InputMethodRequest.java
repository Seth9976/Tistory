package com.kakao.keditor.delegate;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/delegate/InputMethodRequest;", "", "()V", "Hide", "Show", "Lcom/kakao/keditor/delegate/InputMethodRequest$Hide;", "Lcom/kakao/keditor/delegate/InputMethodRequest$Show;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class InputMethodRequest {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/delegate/InputMethodRequest$Hide;", "Lcom/kakao/keditor/delegate/InputMethodRequest;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Hide extends InputMethodRequest {
        @NotNull
        public static final Hide INSTANCE;

        static {
            Hide.INSTANCE = new Hide();
        }

        private Hide() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/delegate/InputMethodRequest$Show;", "Lcom/kakao/keditor/delegate/InputMethodRequest;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Show extends InputMethodRequest {
        @NotNull
        public static final Show INSTANCE;

        static {
            Show.INSTANCE = new Show();
        }

        private Show() {
            super(null);
        }
    }

    private InputMethodRequest() {
    }

    public InputMethodRequest(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

