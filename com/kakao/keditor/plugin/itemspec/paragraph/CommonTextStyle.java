package com.kakao.keditor.plugin.itemspec.paragraph;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/CommonTextStyle;", "", "()V", "Bold", "Italic", "Strikethrough", "Underline", "Lcom/kakao/keditor/plugin/itemspec/paragraph/CommonTextStyle$Bold;", "Lcom/kakao/keditor/plugin/itemspec/paragraph/CommonTextStyle$Italic;", "Lcom/kakao/keditor/plugin/itemspec/paragraph/CommonTextStyle$Strikethrough;", "Lcom/kakao/keditor/plugin/itemspec/paragraph/CommonTextStyle$Underline;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class CommonTextStyle {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/CommonTextStyle$Bold;", "Lcom/kakao/keditor/plugin/itemspec/paragraph/CommonTextStyle;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Bold extends CommonTextStyle {
        @NotNull
        public static final Bold INSTANCE;

        static {
            Bold.INSTANCE = new Bold();
        }

        private Bold() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/CommonTextStyle$Italic;", "Lcom/kakao/keditor/plugin/itemspec/paragraph/CommonTextStyle;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Italic extends CommonTextStyle {
        @NotNull
        public static final Italic INSTANCE;

        static {
            Italic.INSTANCE = new Italic();
        }

        private Italic() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/CommonTextStyle$Strikethrough;", "Lcom/kakao/keditor/plugin/itemspec/paragraph/CommonTextStyle;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Strikethrough extends CommonTextStyle {
        @NotNull
        public static final Strikethrough INSTANCE;

        static {
            Strikethrough.INSTANCE = new Strikethrough();
        }

        private Strikethrough() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/CommonTextStyle$Underline;", "Lcom/kakao/keditor/plugin/itemspec/paragraph/CommonTextStyle;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Underline extends CommonTextStyle {
        @NotNull
        public static final Underline INSTANCE;

        static {
            Underline.INSTANCE = new Underline();
        }

        private Underline() {
            super(null);
        }
    }

    private CommonTextStyle() {
    }

    public CommonTextStyle(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

