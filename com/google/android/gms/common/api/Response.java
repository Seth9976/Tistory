package com.google.android.gms.common.api;

import androidx.annotation.NonNull;

public class Response {
    public Result a;

    public Response() {
    }

    public Response(@NonNull Result result0) {
        this.a = result0;
    }

    @NonNull
    public Result getResult() {
        return this.a;
    }

    public void setResult(@NonNull Result result0) {
        this.a = result0;
    }
}

