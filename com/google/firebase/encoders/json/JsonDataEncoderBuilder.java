package com.google.firebase.encoders.json;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.f;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.util.Date;
import java.util.HashMap;
import t8.a;
import t8.b;
import t8.c;

public final class JsonDataEncoderBuilder implements EncoderConfig {
    public final HashMap a;
    public final HashMap b;
    public ObjectEncoder c;
    public boolean d;
    public static final a e;
    public static final b f;
    public static final b g;
    public static final c h;

    static {
        JsonDataEncoderBuilder.e = new a(0);
        JsonDataEncoderBuilder.f = new b(0);
        JsonDataEncoderBuilder.g = new b(1);
        JsonDataEncoderBuilder.h = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public JsonDataEncoderBuilder() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = JsonDataEncoderBuilder.e;
        this.d = false;
        this.registerEncoder(String.class, JsonDataEncoderBuilder.f);
        this.registerEncoder(Boolean.class, JsonDataEncoderBuilder.g);
        this.registerEncoder(Date.class, JsonDataEncoderBuilder.h);
    }

    @NonNull
    public DataEncoder build() {
        return new f(this, 29);
    }

    @NonNull
    public JsonDataEncoderBuilder configureWith(@NonNull Configurator configurator0) {
        configurator0.configure(this);
        return this;
    }

    @NonNull
    public JsonDataEncoderBuilder ignoreNullValues(boolean z) {
        this.d = z;
        return this;
    }

    @Override  // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public EncoderConfig registerEncoder(@NonNull Class class0, @NonNull ObjectEncoder objectEncoder0) {
        return this.registerEncoder(class0, objectEncoder0);
    }

    @Override  // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public EncoderConfig registerEncoder(@NonNull Class class0, @NonNull ValueEncoder valueEncoder0) {
        return this.registerEncoder(class0, valueEncoder0);
    }

    @NonNull
    public JsonDataEncoderBuilder registerEncoder(@NonNull Class class0, @NonNull ObjectEncoder objectEncoder0) {
        this.a.put(class0, objectEncoder0);
        this.b.remove(class0);
        return this;
    }

    @NonNull
    public JsonDataEncoderBuilder registerEncoder(@NonNull Class class0, @NonNull ValueEncoder valueEncoder0) {
        this.b.put(class0, valueEncoder0);
        this.a.remove(class0);
        return this;
    }

    @NonNull
    public JsonDataEncoderBuilder registerFallbackEncoder(@NonNull ObjectEncoder objectEncoder0) {
        this.c = objectEncoder0;
        return this;
    }
}

