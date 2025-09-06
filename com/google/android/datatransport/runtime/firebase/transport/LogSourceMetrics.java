package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.Encodable.Field;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LogSourceMetrics {
    public static final class Builder {
        public String a;
        public List b;

        public Builder() {
            this.a = "";
            this.b = new ArrayList();
        }

        public Builder addLogEventDropped(LogEventDropped logEventDropped0) {
            this.b.add(logEventDropped0);
            return this;
        }

        public LogSourceMetrics build() {
            return new LogSourceMetrics(this.a, Collections.unmodifiableList(this.b));
        }

        public Builder setLogEventDroppedList(List list0) {
            this.b = list0;
            return this;
        }

        public Builder setLogSource(String s) {
            this.a = s;
            return this;
        }
    }

    public final String a;
    public final List b;
    public static final LogSourceMetrics c;

    static {
        LogSourceMetrics.c = new Builder().build();
    }

    public LogSourceMetrics(String s, List list0) {
        this.a = s;
        this.b = list0;
    }

    public static LogSourceMetrics getDefaultInstance() {
        return LogSourceMetrics.c;
    }

    @Field(name = "logEventDropped")
    @Protobuf(tag = 2)
    public List getLogEventDroppedList() {
        return this.b;
    }

    @Protobuf(tag = 1)
    public String getLogSource() {
        return this.a;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}

