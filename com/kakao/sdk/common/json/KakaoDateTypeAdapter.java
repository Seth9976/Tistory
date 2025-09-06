package com.kakao.sdk.common.json;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001A\u00020\b2\b\u0010\u0006\u001A\u0004\u0018\u00010\u00052\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001B\u0010\r\u001A\u0004\u0018\u00010\u00022\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000ER\u0017\u0010\u0014\u001A\u00020\u000F8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/kakao/sdk/common/json/KakaoDateTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Ljava/util/Date;", "<init>", "()V", "Lcom/google/gson/stream/JsonWriter;", "out", "value", "", "write", "(Lcom/google/gson/stream/JsonWriter;Ljava/util/Date;)V", "Lcom/google/gson/stream/JsonReader;", "in", "read", "(Lcom/google/gson/stream/JsonReader;)Ljava/util/Date;", "Ljava/text/SimpleDateFormat;", "a", "Ljava/text/SimpleDateFormat;", "getFormat", "()Ljava/text/SimpleDateFormat;", "format", "common_release"}, k = 1, mv = {1, 4, 0})
public final class KakaoDateTypeAdapter extends TypeAdapter {
    public final SimpleDateFormat a;

    public KakaoDateTypeAdapter() {
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss\'Z\'", Locale.getDefault());
        simpleDateFormat0.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.a = simpleDateFormat0;
    }

    @NotNull
    public final SimpleDateFormat getFormat() {
        return this.a;
    }

    @Override  // com.google.gson.TypeAdapter
    public Object read(JsonReader jsonReader0) {
        return this.read(jsonReader0);
    }

    @Nullable
    public Date read(@Nullable JsonReader jsonReader0) {
        if((jsonReader0 == null ? null : jsonReader0.peek()) == JsonToken.NULL) {
            jsonReader0.nextNull();
            return null;
        }
        if((jsonReader0 == null ? null : jsonReader0.peek()) == JsonToken.STRING) {
            String s = jsonReader0.nextString();
            return this.a.parse(s);
        }
        return null;
    }

    @Override  // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter0, Object object0) {
        this.write(jsonWriter0, ((Date)object0));
    }

    public void write(@Nullable JsonWriter jsonWriter0, @Nullable Date date0) {
        if(date0 == null) {
            if(jsonWriter0 != null) {
                jsonWriter0.nullValue();
            }
            return;
        }
        if(jsonWriter0 != null) {
            jsonWriter0.value(this.a.format(date0));
        }
    }
}

