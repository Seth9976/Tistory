package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;
import s6.i;

@AutoValue
public abstract class LogResponse {
    @NonNull
    public static LogResponse fromJson(@NonNull Reader reader0) throws IOException {
        try(JsonReader jsonReader0 = new JsonReader(reader0)) {
            jsonReader0.beginObject();
            while(true) {
                if(!jsonReader0.hasNext()) {
                    break;
                }
                if(jsonReader0.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader0.peek() == JsonToken.STRING ? new i(Long.parseLong(jsonReader0.nextString())) : new i(jsonReader0.nextLong());
                }
                jsonReader0.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        }
    }

    public abstract long getNextRequestWaitMillis();
}

