package com.kakao.keditor.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kakao/keditor/exception/MissingJsonConverterException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MissingJsonConverterException extends Exception {
    public MissingJsonConverterException() {
        super("Missing Json Converter. Add Gson or Moshi your project.");
    }
}

