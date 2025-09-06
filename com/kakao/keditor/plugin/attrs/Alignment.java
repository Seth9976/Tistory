package com.kakao.keditor.plugin.attrs;

import android.os.Build.VERSION;
import android.widget.TextView;
import com.kakao.keditor.plugin.itemspec.EnumList;
import java.io.Serializable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0005\u0012\u0013\u0014\u0015\u0016B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J\u0011\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0086\u0004J\u000E\u0010\b\u001A\u00020\u00002\u0006\u0010\t\u001A\u00020\nJ\u000E\u0010\u000B\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\nJ\u0006\u0010\r\u001A\u00020\u000EJ\b\u0010\u000F\u001A\u00020\fH\u0016J\b\u0010\u0010\u001A\u00020\u0011H\u0016\u0082\u0001\u0004\u0017\u0018\u0019\u001A¨\u0006\u001B"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/Alignment;", "Lcom/kakao/keditor/plugin/attrs/ToStyle;", "Ljava/io/Serializable;", "()V", "into", "", "editText", "Landroid/widget/TextView;", "next", "type", "Lcom/kakao/keditor/plugin/attrs/AlignmentType;", "toCdmValue", "", "toGravity", "", "toString", "toStyle", "Lcom/kakao/keditor/plugin/attrs/Style;", "Center", "Companion", "Justify", "Left", "Right", "Lcom/kakao/keditor/plugin/attrs/Alignment$Center;", "Lcom/kakao/keditor/plugin/attrs/Alignment$Justify;", "Lcom/kakao/keditor/plugin/attrs/Alignment$Left;", "Lcom/kakao/keditor/plugin/attrs/Alignment$Right;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class Alignment implements ToStyle, Serializable {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/Alignment$Center;", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Center extends Alignment {
        @NotNull
        public static final Center INSTANCE;

        static {
            Center.INSTANCE = new Center();
        }

        private Center() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001A\u00020\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001A\u00020\bJ\u000E\u0010\t\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bJ\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00060\u000BJ\u000E\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00060\u000BH\u0016¨\u0006\r"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/Alignment$Companion;", "Lcom/kakao/keditor/plugin/itemspec/EnumList;", "()V", "byNameText", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "name", "", "type", "Lcom/kakao/keditor/plugin/attrs/AlignmentType;", "defaultCDM", "textTypeSet", "", "typeSet", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion implements EnumList {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Alignment byNameText(@Nullable String s, @NotNull AlignmentType alignmentType0) {
            Intrinsics.checkNotNullParameter(alignmentType0, "type");
            Alignment alignment0 = Center.INSTANCE;
            if(!Intrinsics.areEqual(s, alignment0.toCdmValue(alignmentType0))) {
                alignment0 = Right.INSTANCE;
                if(!Intrinsics.areEqual(s, alignment0.toCdmValue(alignmentType0))) {
                    alignment0 = Left.INSTANCE;
                    if(!Intrinsics.areEqual(s, alignment0.toCdmValue(alignmentType0))) {
                        return Justify.INSTANCE;
                    }
                }
            }
            return alignment0;
        }

        @NotNull
        public final String defaultCDM(@NotNull AlignmentType alignmentType0) [...] // 潜在的解密器

        @NotNull
        public final Set textTypeSet() {
            return f0.setOf(new String[]{"left", "right", "justify", "center"});
        }

        @Override  // com.kakao.keditor.plugin.itemspec.EnumList
        @NotNull
        public Set typeSet() {
            return f0.setOf(new String[]{"alignLeft", "alignRight", "alignCenter"});
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/Alignment$Justify;", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Justify extends Alignment {
        @NotNull
        public static final Justify INSTANCE;

        static {
            Justify.INSTANCE = new Justify();
        }

        private Justify() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/Alignment$Left;", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Left extends Alignment {
        @NotNull
        public static final Left INSTANCE;

        static {
            Left.INSTANCE = new Left();
        }

        private Left() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/Alignment$Right;", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Right extends Alignment {
        @NotNull
        public static final Right INSTANCE;

        static {
            Right.INSTANCE = new Right();
        }

        private Right() {
            super(null);
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        Alignment.Companion = new Companion(null);
    }

    private Alignment() {
    }

    public Alignment(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    public final void into(@NotNull TextView textView0) {
        Intrinsics.checkNotNullParameter(textView0, "editText");
        textView0.setGravity(3);
        if(Build.VERSION.SDK_INT >= 29) {
            if(this instanceof Justify) {
                textView0.setJustificationMode(1);
                return;
            }
            textView0.setJustificationMode(0);
        }
    }

    @NotNull
    public final Alignment next(@NotNull AlignmentType alignmentType0) {
        Intrinsics.checkNotNullParameter(alignmentType0, "type");
        Alignment alignment0 = Center.INSTANCE;
        if(Intrinsics.areEqual(this, alignment0)) {
            return Right.INSTANCE;
        }
        if(Intrinsics.areEqual(this, Right.INSTANCE)) {
            return Intrinsics.areEqual(alignmentType0, Text.INSTANCE) ? Justify.INSTANCE : Left.INSTANCE;
        }
        return Intrinsics.areEqual(this, Justify.INSTANCE) ? Left.INSTANCE : alignment0;
    }

    @NotNull
    public final String toCdmValue(@NotNull AlignmentType alignmentType0) [...] // 潜在的解密器

    public final int toGravity() [...] // 潜在的解密器

    @Override
    @NotNull
    public String toString() [...] // 潜在的解密器

    @Override  // com.kakao.keditor.plugin.attrs.ToStyle
    @NotNull
    public Style toStyle() {
        if(this instanceof Left) {
            return com.kakao.keditor.plugin.attrs.Style.Left.INSTANCE;
        }
        return this instanceof Right ? com.kakao.keditor.plugin.attrs.Style.Right.INSTANCE : com.kakao.keditor.plugin.attrs.Style.Center.INSTANCE;
    }
}

