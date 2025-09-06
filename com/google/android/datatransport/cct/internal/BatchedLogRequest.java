package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable.Field;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.util.List;
import s6.f;

@AutoValue
@Encodable
public abstract class BatchedLogRequest {
    @NonNull
    public static BatchedLogRequest create(@NonNull List list0) {
        return new f(list0);
    }

    @NonNull
    public static DataEncoder createDataEncoder() {
        return new JsonDataEncoderBuilder().configureWith(AutoBatchedLogRequestEncoder.CONFIG).ignoreNullValues(true).build();
    }

    @NonNull
    @Field(name = "logRequest")
    public abstract List getLogRequests();
}

