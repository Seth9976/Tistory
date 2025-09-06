package com.kakao.kandinsky.text.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.kandinsky.core.kdphoto.TextData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/kandinsky/text/contract/TextMode;", "", "Control", "Input", "Lcom/kakao/kandinsky/text/contract/TextMode$Control;", "Lcom/kakao/kandinsky/text/contract/TextMode$Input;", "text_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface TextMode {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/text/contract/TextMode$Control;", "Lcom/kakao/kandinsky/text/contract/TextMode;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "text_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Control implements TextMode {
        public static final int $stable;
        @NotNull
        public static final Control INSTANCE;

        static {
            Control.INSTANCE = new Control();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Control;
        }

        @Override
        public int hashCode() {
            return -18394000;
        }

        @Override
        @NotNull
        public String toString() {
            return "Control";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/text/contract/TextMode$Input;", "Lcom/kakao/kandinsky/text/contract/TextMode;", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "textData", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/TextData;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/TextData;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/TextData;)Lcom/kakao/kandinsky/text/contract/TextMode$Input;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "getTextData", "text_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Input implements TextMode {
        public static final int $stable;
        public final TextData a;

        public Input(@NotNull TextData textData0) {
            Intrinsics.checkNotNullParameter(textData0, "textData");
            super();
            this.a = textData0;
        }

        @NotNull
        public final TextData component1() {
            return this.a;
        }

        @NotNull
        public final Input copy(@NotNull TextData textData0) {
            Intrinsics.checkNotNullParameter(textData0, "textData");
            return new Input(textData0);
        }

        public static Input copy$default(Input textMode$Input0, TextData textData0, int v, Object object0) {
            if((v & 1) != 0) {
                textData0 = textMode$Input0.a;
            }
            return textMode$Input0.copy(textData0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Input ? Intrinsics.areEqual(this.a, ((Input)object0).a) : false;
        }

        @NotNull
        public final TextData getTextData() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "Input(textData=" + this.a + ")";
        }
    }

}

