package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.ProtoEncoderDoNotUse;
import com.google.firebase.encoders.annotations.Encodable.Field;
import com.google.firebase.encoders.annotations.Encodable.Ignore;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ClientMetrics {
    public static final class Builder {
        public TimeWindow a;
        public List b;
        public GlobalMetrics c;
        public String d;

        public Builder() {
            this.a = null;
            this.b = new ArrayList();
            this.c = null;
            this.d = "";
        }

        public Builder addLogSourceMetrics(LogSourceMetrics logSourceMetrics0) {
            this.b.add(logSourceMetrics0);
            return this;
        }

        public ClientMetrics build() {
            return new ClientMetrics(this.a, Collections.unmodifiableList(this.b), this.c, this.d);
        }

        public Builder setAppNamespace(String s) {
            this.d = s;
            return this;
        }

        public Builder setGlobalMetrics(GlobalMetrics globalMetrics0) {
            this.c = globalMetrics0;
            return this;
        }

        public Builder setLogSourceMetricsList(List list0) {
            this.b = list0;
            return this;
        }

        public Builder setWindow(TimeWindow timeWindow0) {
            this.a = timeWindow0;
            return this;
        }
    }

    public final TimeWindow a;
    public final List b;
    public final GlobalMetrics c;
    public final String d;
    public static final ClientMetrics e;

    static {
        ClientMetrics.e = new Builder().build();
    }

    public ClientMetrics(TimeWindow timeWindow0, List list0, GlobalMetrics globalMetrics0, String s) {
        this.a = timeWindow0;
        this.b = list0;
        this.c = globalMetrics0;
        this.d = s;
    }

    @Protobuf(tag = 4)
    public String getAppNamespace() {
        return this.d;
    }

    public static ClientMetrics getDefaultInstance() {
        return ClientMetrics.e;
    }

    @Ignore
    public GlobalMetrics getGlobalMetrics() {
        return this.c == null ? GlobalMetrics.getDefaultInstance() : this.c;
    }

    @Field(name = "globalMetrics")
    @Protobuf(tag = 3)
    public GlobalMetrics getGlobalMetricsInternal() {
        return this.c;
    }

    @Field(name = "logSourceMetrics")
    @Protobuf(tag = 2)
    public List getLogSourceMetricsList() {
        return this.b;
    }

    @Ignore
    public TimeWindow getWindow() {
        return this.a == null ? TimeWindow.getDefaultInstance() : this.a;
    }

    @Field(name = "window")
    @Protobuf(tag = 1)
    public TimeWindow getWindowInternal() {
        return this.a;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public byte[] toByteArray() {
        return ProtoEncoderDoNotUse.encode(this);
    }

    public void writeTo(OutputStream outputStream0) throws IOException {
        ProtoEncoderDoNotUse.encode(this, outputStream0);
    }
}

