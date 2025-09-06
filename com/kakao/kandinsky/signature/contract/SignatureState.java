package com.kakao.kandinsky.signature.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.kandinsky.core.kdphoto.TextData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureState;", "", "Image", "None", "Text", "TextEditor", "Lcom/kakao/kandinsky/signature/contract/SignatureState$Image;", "Lcom/kakao/kandinsky/signature/contract/SignatureState$None;", "Lcom/kakao/kandinsky/signature/contract/SignatureState$Text;", "Lcom/kakao/kandinsky/signature/contract/SignatureState$TextEditor;", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface SignatureState {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureState$Image;", "Lcom/kakao/kandinsky/signature/contract/SignatureState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Image implements SignatureState {
        public static final int $stable;
        @NotNull
        public static final Image INSTANCE;

        static {
            Image.INSTANCE = new Image();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Image;
        }

        @Override
        public int hashCode() {
            return 0xBBE45096;
        }

        @Override
        @NotNull
        public String toString() {
            return "Image";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureState$None;", "Lcom/kakao/kandinsky/signature/contract/SignatureState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class None implements SignatureState {
        public static final int $stable;
        @NotNull
        public static final None INSTANCE;

        static {
            None.INSTANCE = new None();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof None;
        }

        @Override
        public int hashCode() {
            return 1764406429;
        }

        @Override
        @NotNull
        public String toString() {
            return "None";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureState$Text;", "Lcom/kakao/kandinsky/signature/contract/SignatureState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Text implements SignatureState {
        public static final int $stable;
        @NotNull
        public static final Text INSTANCE;

        static {
            Text.INSTANCE = new Text();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Text;
        }

        @Override
        public int hashCode() {
            return 1764575890;
        }

        @Override
        @NotNull
        public String toString() {
            return "Text";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0018\u0010\n\u001A\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\t\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0016\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001A\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\tH\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0014JP\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u001A\b\u0002\u0010\n\u001A\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\tH\u00C6\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0017H\u00D6\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001B\u001A\u00020\u001AH\u00D6\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u001A\u0010\u001F\u001A\u00020\u00042\b\u0010\u001E\u001A\u0004\u0018\u00010\u001DH\u00D6\u0003\u00A2\u0006\u0004\b\u001F\u0010 R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\u0010R\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010\u0012R)\u0010\n\u001A\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\t8\u0006\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010\u0014\u00A8\u0006-"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureState$TextEditor;", "Lcom/kakao/kandinsky/signature/contract/SignatureState;", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "textData", "", "waterMark", "Lkotlin/Function0;", "", "onClose", "Lkotlin/Function2;", "onChange", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/TextData;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/TextData;", "component2", "()Z", "component3", "()Lkotlin/jvm/functions/Function0;", "component4", "()Lkotlin/jvm/functions/Function2;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/TextData;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)Lcom/kakao/kandinsky/signature/contract/SignatureState$TextEditor;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "getTextData", "b", "Z", "getWaterMark", "c", "Lkotlin/jvm/functions/Function0;", "getOnClose", "d", "Lkotlin/jvm/functions/Function2;", "getOnChange", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class TextEditor implements SignatureState {
        public static final int $stable;
        public final TextData a;
        public final boolean b;
        public final Function0 c;
        public final Function2 d;

        public TextEditor(@NotNull TextData textData0, boolean z, @NotNull Function0 function00, @NotNull Function2 function20) {
            Intrinsics.checkNotNullParameter(textData0, "textData");
            Intrinsics.checkNotNullParameter(function00, "onClose");
            Intrinsics.checkNotNullParameter(function20, "onChange");
            super();
            this.a = textData0;
            this.b = z;
            this.c = function00;
            this.d = function20;
        }

        @NotNull
        public final TextData component1() {
            return this.a;
        }

        public final boolean component2() {
            return this.b;
        }

        @NotNull
        public final Function0 component3() {
            return this.c;
        }

        @NotNull
        public final Function2 component4() {
            return this.d;
        }

        @NotNull
        public final TextEditor copy(@NotNull TextData textData0, boolean z, @NotNull Function0 function00, @NotNull Function2 function20) {
            Intrinsics.checkNotNullParameter(textData0, "textData");
            Intrinsics.checkNotNullParameter(function00, "onClose");
            Intrinsics.checkNotNullParameter(function20, "onChange");
            return new TextEditor(textData0, z, function00, function20);
        }

        public static TextEditor copy$default(TextEditor signatureState$TextEditor0, TextData textData0, boolean z, Function0 function00, Function2 function20, int v, Object object0) {
            if((v & 1) != 0) {
                textData0 = signatureState$TextEditor0.a;
            }
            if((v & 2) != 0) {
                z = signatureState$TextEditor0.b;
            }
            if((v & 4) != 0) {
                function00 = signatureState$TextEditor0.c;
            }
            if((v & 8) != 0) {
                function20 = signatureState$TextEditor0.d;
            }
            return signatureState$TextEditor0.copy(textData0, z, function00, function20);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof TextEditor)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((TextEditor)object0).a)) {
                return false;
            }
            if(this.b != ((TextEditor)object0).b) {
                return false;
            }
            return Intrinsics.areEqual(this.c, ((TextEditor)object0).c) ? Intrinsics.areEqual(this.d, ((TextEditor)object0).d) : false;
        }

        @NotNull
        public final Function2 getOnChange() {
            return this.d;
        }

        @NotNull
        public final Function0 getOnClose() {
            return this.c;
        }

        @NotNull
        public final TextData getTextData() {
            return this.a;
        }

        public final boolean getWaterMark() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.d.hashCode() + a.g(this.c, a.e(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            return "TextEditor(textData=" + this.a + ", waterMark=" + this.b + ", onClose=" + this.c + ", onChange=" + this.d + ")";
        }
    }

}

