package com.kakao.keditor.plugin.attrs;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/AlignmentType;", "Ljava/io/Serializable;", "()V", "Others", "Text", "Lcom/kakao/keditor/plugin/attrs/AlignmentType$Others;", "Lcom/kakao/keditor/plugin/attrs/AlignmentType$Text;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class AlignmentType implements Serializable {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/AlignmentType$Others;", "Lcom/kakao/keditor/plugin/attrs/AlignmentType;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Others extends AlignmentType {
        @NotNull
        public static final Others INSTANCE;

        static {
            Others.INSTANCE = new Others();
        }

        private Others() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/AlignmentType$Text;", "Lcom/kakao/keditor/plugin/attrs/AlignmentType;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Text extends AlignmentType {
        @NotNull
        public static final Text INSTANCE;

        static {
            Text.INSTANCE = new Text();
        }

        private Text() {
            super(null);
        }
    }

    private AlignmentType() {
    }

    public AlignmentType(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

