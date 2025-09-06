package com.kakao.keditor.plugin.attrs;

import com.kakao.keditor.plugin.itemspec.EnumList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u0005\u0007\b\t\n\u000BB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001A\u00020\u0004H\u0016J\b\u0010\u0005\u001A\u00020\u0006H\u0016\u0082\u0001\u0004\f\r\u000E\u000F¨\u0006\u0010"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/Style;", "Lcom/kakao/keditor/plugin/attrs/ToAlignment;", "()V", "toAlignment", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "toCdm", "", "Center", "Companion", "Left", "Right", "UnUsedOnMobile", "Lcom/kakao/keditor/plugin/attrs/Style$Center;", "Lcom/kakao/keditor/plugin/attrs/Style$Left;", "Lcom/kakao/keditor/plugin/attrs/Style$Right;", "Lcom/kakao/keditor/plugin/attrs/Style$UnUsedOnMobile;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class Style implements ToAlignment {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/Style$Center;", "Lcom/kakao/keditor/plugin/attrs/Style;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Center extends Style {
        @NotNull
        public static final Center INSTANCE;

        static {
            Center.INSTANCE = new Center();
        }

        private Center() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\"\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006J\u000E\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\bH\u0016¨\u0006\t"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/Style$Companion;", "Lcom/kakao/keditor/plugin/itemspec/EnumList;", "()V", "byName", "Lcom/kakao/keditor/plugin/attrs/Style;", "name", "", "typeSet", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion implements EnumList {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Style byName(@Nullable String s) {
            Style style0 = Left.INSTANCE;
            if(!Intrinsics.areEqual(s, "alignStyle")) {
                style0 = Center.INSTANCE;
                if(!Intrinsics.areEqual(s, "alignStyle")) {
                    style0 = Right.INSTANCE;
                    if(!Intrinsics.areEqual(s, "alignStyle")) {
                        style0 = floatLeft.INSTANCE;
                        if(!Intrinsics.areEqual(s, "Style$UnUsedOnMobile")) {
                            style0 = floatRight.INSTANCE;
                            if(!Intrinsics.areEqual(s, "Style$UnUsedOnMobile")) {
                                style0 = widthContent.INSTANCE;
                                if(!Intrinsics.areEqual(s, "Style$UnUsedOnMobile")) {
                                    style0 = widthContentOuter.INSTANCE;
                                    if(!Intrinsics.areEqual(s, "Style$UnUsedOnMobile")) {
                                        return widthFull.INSTANCE;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return style0;
        }

        // 去混淆评级： 中等(60)
        @Override  // com.kakao.keditor.plugin.itemspec.EnumList
        @NotNull
        public Set typeSet() {
            return f0.setOf(new String[]{"alignStyle", "alignStyle", "alignStyle"});
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/Style$Left;", "Lcom/kakao/keditor/plugin/attrs/Style;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Left extends Style {
        @NotNull
        public static final Left INSTANCE;

        static {
            Left.INSTANCE = new Left();
        }

        private Left() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/Style$Right;", "Lcom/kakao/keditor/plugin/attrs/Style;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Right extends Style {
        @NotNull
        public static final Right INSTANCE;

        static {
            Right.INSTANCE = new Right();
        }

        private Right() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001A\u00020\u0004H\u0016\u0082\u0001\u0005\n\u000B\f\r\u000E¨\u0006\u000F"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/Style$UnUsedOnMobile;", "Lcom/kakao/keditor/plugin/attrs/Style;", "()V", "toCdm", "", "floatLeft", "floatRight", "widthContent", "widthContentOuter", "widthFull", "Lcom/kakao/keditor/plugin/attrs/Style$UnUsedOnMobile$floatLeft;", "Lcom/kakao/keditor/plugin/attrs/Style$UnUsedOnMobile$floatRight;", "Lcom/kakao/keditor/plugin/attrs/Style$UnUsedOnMobile$widthContent;", "Lcom/kakao/keditor/plugin/attrs/Style$UnUsedOnMobile$widthContentOuter;", "Lcom/kakao/keditor/plugin/attrs/Style$UnUsedOnMobile$widthFull;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class UnUsedOnMobile extends Style {
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001A\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/Style$UnUsedOnMobile$floatLeft;", "Lcom/kakao/keditor/plugin/attrs/Style$UnUsedOnMobile;", "()V", "toAlignment", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class floatLeft extends UnUsedOnMobile {
            @NotNull
            public static final floatLeft INSTANCE;

            static {
                floatLeft.INSTANCE = new floatLeft();
            }

            private floatLeft() {
                super(null);
            }

            @Override  // com.kakao.keditor.plugin.attrs.Style
            @NotNull
            public Alignment toAlignment() {
                return com.kakao.keditor.plugin.attrs.Alignment.Left.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001A\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/Style$UnUsedOnMobile$floatRight;", "Lcom/kakao/keditor/plugin/attrs/Style$UnUsedOnMobile;", "()V", "toAlignment", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class floatRight extends UnUsedOnMobile {
            @NotNull
            public static final floatRight INSTANCE;

            static {
                floatRight.INSTANCE = new floatRight();
            }

            private floatRight() {
                super(null);
            }

            @Override  // com.kakao.keditor.plugin.attrs.Style
            @NotNull
            public Alignment toAlignment() {
                return com.kakao.keditor.plugin.attrs.Alignment.Right.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001A\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/Style$UnUsedOnMobile$widthContent;", "Lcom/kakao/keditor/plugin/attrs/Style$UnUsedOnMobile;", "()V", "toAlignment", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class widthContent extends UnUsedOnMobile {
            @NotNull
            public static final widthContent INSTANCE;

            static {
                widthContent.INSTANCE = new widthContent();
            }

            private widthContent() {
                super(null);
            }

            @Override  // com.kakao.keditor.plugin.attrs.Style
            @NotNull
            public Alignment toAlignment() {
                return com.kakao.keditor.plugin.attrs.Alignment.Center.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001A\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/Style$UnUsedOnMobile$widthContentOuter;", "Lcom/kakao/keditor/plugin/attrs/Style$UnUsedOnMobile;", "()V", "toAlignment", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class widthContentOuter extends UnUsedOnMobile {
            @NotNull
            public static final widthContentOuter INSTANCE;

            static {
                widthContentOuter.INSTANCE = new widthContentOuter();
            }

            private widthContentOuter() {
                super(null);
            }

            @Override  // com.kakao.keditor.plugin.attrs.Style
            @NotNull
            public Alignment toAlignment() {
                return com.kakao.keditor.plugin.attrs.Alignment.Center.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001A\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/Style$UnUsedOnMobile$widthFull;", "Lcom/kakao/keditor/plugin/attrs/Style$UnUsedOnMobile;", "()V", "toAlignment", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class widthFull extends UnUsedOnMobile {
            @NotNull
            public static final widthFull INSTANCE;

            static {
                widthFull.INSTANCE = new widthFull();
            }

            private widthFull() {
                super(null);
            }

            @Override  // com.kakao.keditor.plugin.attrs.Style
            @NotNull
            public Alignment toAlignment() {
                return com.kakao.keditor.plugin.attrs.Alignment.Center.INSTANCE;
            }
        }

        private UnUsedOnMobile() {
            super(null);
        }

        public UnUsedOnMobile(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Override  // com.kakao.keditor.plugin.attrs.Style
        @NotNull
        public String toCdm() [...] // 潜在的解密器
    }

    @NotNull
    public static final Companion Companion;

    static {
        Style.Companion = new Companion(null);
    }

    private Style() {
    }

    public Style(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @Override  // com.kakao.keditor.plugin.attrs.ToAlignment
    @NotNull
    public Alignment toAlignment() {
        if(Intrinsics.areEqual(this, Center.INSTANCE)) {
            return com.kakao.keditor.plugin.attrs.Alignment.Center.INSTANCE;
        }
        return Intrinsics.areEqual(this, Right.INSTANCE) ? com.kakao.keditor.plugin.attrs.Alignment.Right.INSTANCE : com.kakao.keditor.plugin.attrs.Alignment.Left.INSTANCE;
    }

    @NotNull
    public String toCdm() [...] // 潜在的解密器
}

