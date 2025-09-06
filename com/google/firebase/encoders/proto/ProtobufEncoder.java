package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import t8.a;

public class ProtobufEncoder {
    public static final class Builder implements EncoderConfig {
        public final HashMap a;
        public final HashMap b;
        public ObjectEncoder c;
        public static final a d;

        static {
            Builder.d = new a(2);
        }

        public Builder() {
            this.a = new HashMap();
            this.b = new HashMap();
            this.c = Builder.d;
        }

        public ProtobufEncoder build() {
            return new ProtobufEncoder(new HashMap(this.a), new HashMap(this.b), this.c);
        }

        @NonNull
        public Builder configureWith(@NonNull Configurator configurator0) {
            configurator0.configure(this);
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
        public Builder registerEncoder(@NonNull Class class0, @NonNull ObjectEncoder objectEncoder0) {
            this.a.put(class0, objectEncoder0);
            this.b.remove(class0);
            return this;
        }

        @NonNull
        public Builder registerEncoder(@NonNull Class class0, @NonNull ValueEncoder valueEncoder0) {
            this.b.put(class0, valueEncoder0);
            this.a.remove(class0);
            return this;
        }

        @NonNull
        public Builder registerFallbackEncoder(@NonNull ObjectEncoder objectEncoder0) {
            this.c = objectEncoder0;
            return this;
        }
    }

    public final HashMap a;
    public final HashMap b;
    public final ObjectEncoder c;

    public ProtobufEncoder(HashMap hashMap0, HashMap hashMap1, ObjectEncoder objectEncoder0) {
        this.a = hashMap0;
        this.b = hashMap1;
        this.c = objectEncoder0;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void encode(@NonNull Object object0, @NonNull OutputStream outputStream0) throws IOException {
        new c(outputStream0, this.a, this.b, this.c).g(object0);
    }

    @NonNull
    public byte[] encode(@NonNull Object object0) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            this.encode(object0, byteArrayOutputStream0);
        }
        catch(IOException unused_ex) {
        }
        return byteArrayOutputStream0.toByteArray();
    }
}

