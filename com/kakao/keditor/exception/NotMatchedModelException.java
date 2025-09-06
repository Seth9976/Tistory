package com.kakao.keditor.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/exception/NotMatchedModelException;", "Ljava/lang/IllegalArgumentException;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class NotMatchedModelException extends IllegalArgumentException {
    public NotMatchedModelException() {
        super("model is not matched with plugin");
    }
}

