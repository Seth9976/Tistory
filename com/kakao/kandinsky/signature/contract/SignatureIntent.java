package com.kakao.kandinsky.signature.contract;

import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.core.kdphoto.TextData;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F !\"#$%¨\u0006&"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "", "Cancel", "ChangeSignature", "DeleteHistory", "EditSignature", "Init", "MoveSignature", "OnChangeImageSignatureAlpha", "OnClickConfirm", "OnClickMenuImage", "OnClickMenuText", "OnClickMultipleConfirm", "OnTextEditorClose", "RemoveSignature", "ScaleNRotateSelectSignature", "UpdateContentBounds", "UpdateImageSignature", "UpdatePhoto", "UpdateTextSignature", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent$Cancel;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent$ChangeSignature;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent$DeleteHistory;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent$EditSignature;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent$Init;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent$MoveSignature;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent$OnChangeImageSignatureAlpha;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent$OnClickConfirm;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent$OnClickMenuImage;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent$OnClickMenuText;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent$OnClickMultipleConfirm;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent$OnTextEditorClose;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent$RemoveSignature;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent$ScaleNRotateSelectSignature;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent$UpdateContentBounds;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent$UpdateImageSignature;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent$UpdatePhoto;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent$UpdateTextSignature;", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface SignatureIntent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureIntent$Cancel;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Cancel implements SignatureIntent {
        public static final int $stable;
        @NotNull
        public static final Cancel INSTANCE;

        static {
            Cancel.INSTANCE = new Cancel();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Cancel;
        }

        @Override
        public int hashCode() {
            return 1400871716;
        }

        @Override
        @NotNull
        public String toString() {
            return "Cancel";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureIntent$ChangeSignature;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Signature;", "signature", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Signature;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Signature;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/Signature;)Lcom/kakao/kandinsky/signature/contract/SignatureIntent$ChangeSignature;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Signature;", "getSignature", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeSignature implements SignatureIntent {
        public static final int $stable;
        public final Signature a;

        public ChangeSignature(@NotNull Signature signature0) {
            Intrinsics.checkNotNullParameter(signature0, "signature");
            super();
            this.a = signature0;
        }

        @NotNull
        public final Signature component1() {
            return this.a;
        }

        @NotNull
        public final ChangeSignature copy(@NotNull Signature signature0) {
            Intrinsics.checkNotNullParameter(signature0, "signature");
            return new ChangeSignature(signature0);
        }

        public static ChangeSignature copy$default(ChangeSignature signatureIntent$ChangeSignature0, Signature signature0, int v, Object object0) {
            if((v & 1) != 0) {
                signature0 = signatureIntent$ChangeSignature0.a;
            }
            return signatureIntent$ChangeSignature0.copy(signature0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeSignature ? Intrinsics.areEqual(this.a, ((ChangeSignature)object0).a) : false;
        }

        @NotNull
        public final Signature getSignature() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeSignature(signature=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureIntent$DeleteHistory;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "", "id", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/kakao/kandinsky/signature/contract/SignatureIntent$DeleteHistory;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getId", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class DeleteHistory implements SignatureIntent {
        public static final int $stable;
        public final int a;

        public DeleteHistory(int v) {
            this.a = v;
        }

        public final int component1() {
            return this.a;
        }

        @NotNull
        public final DeleteHistory copy(int v) {
            return new DeleteHistory(v);
        }

        public static DeleteHistory copy$default(DeleteHistory signatureIntent$DeleteHistory0, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = signatureIntent$DeleteHistory0.a;
            }
            return signatureIntent$DeleteHistory0.copy(v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof DeleteHistory ? this.a == ((DeleteHistory)object0).a : false;
        }

        public final int getId() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("DeleteHistory(id=");
            return a.c(this.a, ")", stringBuilder0);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureIntent$EditSignature;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Signature;", "signature", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Signature;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Signature;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/Signature;)Lcom/kakao/kandinsky/signature/contract/SignatureIntent$EditSignature;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Signature;", "getSignature", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class EditSignature implements SignatureIntent {
        public static final int $stable;
        public final Signature a;

        public EditSignature(@NotNull Signature signature0) {
            Intrinsics.checkNotNullParameter(signature0, "signature");
            super();
            this.a = signature0;
        }

        @NotNull
        public final Signature component1() {
            return this.a;
        }

        @NotNull
        public final EditSignature copy(@NotNull Signature signature0) {
            Intrinsics.checkNotNullParameter(signature0, "signature");
            return new EditSignature(signature0);
        }

        public static EditSignature copy$default(EditSignature signatureIntent$EditSignature0, Signature signature0, int v, Object object0) {
            if((v & 1) != 0) {
                signature0 = signatureIntent$EditSignature0.a;
            }
            return signatureIntent$EditSignature0.copy(signature0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof EditSignature ? Intrinsics.areEqual(this.a, ((EditSignature)object0).a) : false;
        }

        @NotNull
        public final Signature getSignature() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "EditSignature(signature=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u0000\n\u0002\b\u000E\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u001C\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JD\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\u0014\b\u0002\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000FJ\u0010\u0010\u0016\u001A\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001A\u0010\u001A\u001A\u00020\u00022\b\u0010\u0019\u001A\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u0003\u0010\rR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\u000FR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001D\u001A\u0004\b\"\u0010\rR#\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0012¨\u0006&"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureIntent$Init;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "", "isSingleImage", "", "defaultSignature", "allowSystemFont", "", "", "fontResources", "<init>", "(ZLjava/lang/String;ZLjava/util/Map;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/Map;", "copy", "(ZLjava/lang/String;ZLjava/util/Map;)Lcom/kakao/kandinsky/signature/contract/SignatureIntent$Init;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "Ljava/lang/String;", "getDefaultSignature", "c", "getAllowSystemFont", "d", "Ljava/util/Map;", "getFontResources", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Init implements SignatureIntent {
        public static final int $stable = 8;
        public final boolean a;
        public final String b;
        public final boolean c;
        public final Map d;

        public Init(boolean z, @NotNull String s, boolean z1, @NotNull Map map0) {
            Intrinsics.checkNotNullParameter(s, "defaultSignature");
            Intrinsics.checkNotNullParameter(map0, "fontResources");
            super();
            this.a = z;
            this.b = s;
            this.c = z1;
            this.d = map0;
        }

        public final boolean component1() {
            return this.a;
        }

        @NotNull
        public final String component2() {
            return this.b;
        }

        public final boolean component3() {
            return this.c;
        }

        @NotNull
        public final Map component4() {
            return this.d;
        }

        @NotNull
        public final Init copy(boolean z, @NotNull String s, boolean z1, @NotNull Map map0) {
            Intrinsics.checkNotNullParameter(s, "defaultSignature");
            Intrinsics.checkNotNullParameter(map0, "fontResources");
            return new Init(z, s, z1, map0);
        }

        public static Init copy$default(Init signatureIntent$Init0, boolean z, String s, boolean z1, Map map0, int v, Object object0) {
            if((v & 1) != 0) {
                z = signatureIntent$Init0.a;
            }
            if((v & 2) != 0) {
                s = signatureIntent$Init0.b;
            }
            if((v & 4) != 0) {
                z1 = signatureIntent$Init0.c;
            }
            if((v & 8) != 0) {
                map0 = signatureIntent$Init0.d;
            }
            return signatureIntent$Init0.copy(z, s, z1, map0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Init)) {
                return false;
            }
            if(this.a != ((Init)object0).a) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((Init)object0).b)) {
                return false;
            }
            return this.c == ((Init)object0).c ? Intrinsics.areEqual(this.d, ((Init)object0).d) : false;
        }

        public final boolean getAllowSystemFont() {
            return this.c;
        }

        @NotNull
        public final String getDefaultSignature() {
            return this.b;
        }

        @NotNull
        public final Map getFontResources() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return this.d.hashCode() + r0.a.e(q.c(Boolean.hashCode(this.a) * 0x1F, 0x1F, this.b), 0x1F, this.c);
        }

        public final boolean isSingleImage() {
            return this.a;
        }

        @Override
        @NotNull
        public String toString() {
            return "Init(isSingleImage=" + this.a + ", defaultSignature=" + this.b + ", allowSystemFont=" + this.c + ", fontResources=" + this.d + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001A\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u0007\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u001A"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureIntent$MoveSignature;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "Landroidx/compose/ui/geometry/Offset;", "offset", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-F1C5BW0", "()J", "component1", "copy-k-4lQ0M", "(J)Lcom/kakao/kandinsky/signature/contract/SignatureIntent$MoveSignature;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getOffset-F1C5BW0", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class MoveSignature implements SignatureIntent {
        public static final int $stable;
        public final long a;

        public MoveSignature(long v, DefaultConstructorMarker defaultConstructorMarker0) {
            this.a = v;
        }

        public final long component1-F1C5BW0() {
            return this.a;
        }

        @NotNull
        public final MoveSignature copy-k-4lQ0M(long v) {
            return new MoveSignature(v, null);
        }

        public static MoveSignature copy-k-4lQ0M$default(MoveSignature signatureIntent$MoveSignature0, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = signatureIntent$MoveSignature0.a;
            }
            return signatureIntent$MoveSignature0.copy-k-4lQ0M(v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof MoveSignature ? Offset.equals-impl0(this.a, ((MoveSignature)object0).a) : false;
        }

        public final long getOffset-F1C5BW0() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Offset.hashCode-impl(this.a);
        }

        @Override
        @NotNull
        public String toString() {
            return a.d("MoveSignature(offset=", Offset.toString-impl(this.a), ")");
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureIntent$OnChangeImageSignatureAlpha;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "", "alpha", "<init>", "(F)V", "component1", "()F", "copy", "(F)Lcom/kakao/kandinsky/signature/contract/SignatureIntent$OnChangeImageSignatureAlpha;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getAlpha", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class OnChangeImageSignatureAlpha implements SignatureIntent {
        public static final int $stable;
        public final float a;

        public OnChangeImageSignatureAlpha(float f) {
            this.a = f;
        }

        public final float component1() {
            return this.a;
        }

        @NotNull
        public final OnChangeImageSignatureAlpha copy(float f) {
            return new OnChangeImageSignatureAlpha(f);
        }

        public static OnChangeImageSignatureAlpha copy$default(OnChangeImageSignatureAlpha signatureIntent$OnChangeImageSignatureAlpha0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = signatureIntent$OnChangeImageSignatureAlpha0.a;
            }
            return signatureIntent$OnChangeImageSignatureAlpha0.copy(f);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof OnChangeImageSignatureAlpha ? Float.compare(this.a, ((OnChangeImageSignatureAlpha)object0).a) == 0 : false;
        }

        public final float getAlpha() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.a);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("OnChangeImageSignatureAlpha(alpha=");
            return androidx.room.a.h(this.a, ")", stringBuilder0);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureIntent$OnClickConfirm;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class OnClickConfirm implements SignatureIntent {
        public static final int $stable;
        @NotNull
        public static final OnClickConfirm INSTANCE;

        static {
            OnClickConfirm.INSTANCE = new OnClickConfirm();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof OnClickConfirm;
        }

        @Override
        public int hashCode() {
            return 0xF3599E41;
        }

        @Override
        @NotNull
        public String toString() {
            return "OnClickConfirm";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureIntent$OnClickMenuImage;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class OnClickMenuImage implements SignatureIntent {
        public static final int $stable;
        @NotNull
        public static final OnClickMenuImage INSTANCE;

        static {
            OnClickMenuImage.INSTANCE = new OnClickMenuImage();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof OnClickMenuImage;
        }

        @Override
        public int hashCode() {
            return 0x571F027D;
        }

        @Override
        @NotNull
        public String toString() {
            return "OnClickMenuImage";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureIntent$OnClickMenuText;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class OnClickMenuText implements SignatureIntent {
        public static final int $stable;
        @NotNull
        public static final OnClickMenuText INSTANCE;

        static {
            OnClickMenuText.INSTANCE = new OnClickMenuText();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof OnClickMenuText;
        }

        @Override
        public int hashCode() {
            return 0x76713FCB;
        }

        @Override
        @NotNull
        public String toString() {
            return "OnClickMenuText";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureIntent$OnClickMultipleConfirm;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class OnClickMultipleConfirm implements SignatureIntent {
        public static final int $stable;
        @NotNull
        public static final OnClickMultipleConfirm INSTANCE;

        static {
            OnClickMultipleConfirm.INSTANCE = new OnClickMultipleConfirm();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof OnClickMultipleConfirm;
        }

        @Override
        public int hashCode() {
            return -476410607;
        }

        @Override
        @NotNull
        public String toString() {
            return "OnClickMultipleConfirm";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureIntent$OnTextEditorClose;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "Lcom/kakao/kandinsky/signature/contract/SignatureState;", "state", "<init>", "(Lcom/kakao/kandinsky/signature/contract/SignatureState;)V", "component1", "()Lcom/kakao/kandinsky/signature/contract/SignatureState;", "copy", "(Lcom/kakao/kandinsky/signature/contract/SignatureState;)Lcom/kakao/kandinsky/signature/contract/SignatureIntent$OnTextEditorClose;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/signature/contract/SignatureState;", "getState", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class OnTextEditorClose implements SignatureIntent {
        public static final int $stable = 8;
        public final SignatureState a;

        public OnTextEditorClose(@NotNull SignatureState signatureState0) {
            Intrinsics.checkNotNullParameter(signatureState0, "state");
            super();
            this.a = signatureState0;
        }

        @NotNull
        public final SignatureState component1() {
            return this.a;
        }

        @NotNull
        public final OnTextEditorClose copy(@NotNull SignatureState signatureState0) {
            Intrinsics.checkNotNullParameter(signatureState0, "state");
            return new OnTextEditorClose(signatureState0);
        }

        public static OnTextEditorClose copy$default(OnTextEditorClose signatureIntent$OnTextEditorClose0, SignatureState signatureState0, int v, Object object0) {
            if((v & 1) != 0) {
                signatureState0 = signatureIntent$OnTextEditorClose0.a;
            }
            return signatureIntent$OnTextEditorClose0.copy(signatureState0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof OnTextEditorClose ? Intrinsics.areEqual(this.a, ((OnTextEditorClose)object0).a) : false;
        }

        @NotNull
        public final SignatureState getState() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "OnTextEditorClose(state=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureIntent$RemoveSignature;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RemoveSignature implements SignatureIntent {
        public static final int $stable;
        @NotNull
        public static final RemoveSignature INSTANCE;

        static {
            RemoveSignature.INSTANCE = new RemoveSignature();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof RemoveSignature;
        }

        @Override
        public int hashCode() {
            return 0x22F3472A;
        }

        @Override
        @NotNull
        public String toString() {
            return "RemoveSignature";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001A\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\'\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\f\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006!"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureIntent$ScaleNRotateSelectSignature;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Matrix;", "matrix", "<init>", "(JLandroid/graphics/Matrix;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-NH-jbRc", "()J", "component1", "component2", "()Landroid/graphics/Matrix;", "copy-TmRCtEA", "(JLandroid/graphics/Matrix;)Lcom/kakao/kandinsky/signature/contract/SignatureIntent$ScaleNRotateSelectSignature;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getSize-NH-jbRc", "b", "Landroid/graphics/Matrix;", "getMatrix", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ScaleNRotateSelectSignature implements SignatureIntent {
        public static final int $stable = 8;
        public final long a;
        public final Matrix b;

        public ScaleNRotateSelectSignature(long v, Matrix matrix0, DefaultConstructorMarker defaultConstructorMarker0) {
            Intrinsics.checkNotNullParameter(matrix0, "matrix");
            super();
            this.a = v;
            this.b = matrix0;
        }

        public final long component1-NH-jbRc() {
            return this.a;
        }

        @NotNull
        public final Matrix component2() {
            return this.b;
        }

        @NotNull
        public final ScaleNRotateSelectSignature copy-TmRCtEA(long v, @NotNull Matrix matrix0) {
            Intrinsics.checkNotNullParameter(matrix0, "matrix");
            return new ScaleNRotateSelectSignature(v, matrix0, null);
        }

        public static ScaleNRotateSelectSignature copy-TmRCtEA$default(ScaleNRotateSelectSignature signatureIntent$ScaleNRotateSelectSignature0, long v, Matrix matrix0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = signatureIntent$ScaleNRotateSelectSignature0.a;
            }
            if((v1 & 2) != 0) {
                matrix0 = signatureIntent$ScaleNRotateSelectSignature0.b;
            }
            return signatureIntent$ScaleNRotateSelectSignature0.copy-TmRCtEA(v, matrix0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ScaleNRotateSelectSignature)) {
                return false;
            }
            return Size.equals-impl0(this.a, ((ScaleNRotateSelectSignature)object0).a) ? Intrinsics.areEqual(this.b, ((ScaleNRotateSelectSignature)object0).b) : false;
        }

        @NotNull
        public final Matrix getMatrix() {
            return this.b;
        }

        public final long getSize-NH-jbRc() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + Size.hashCode-impl(this.a) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "ScaleNRotateSelectSignature(size=" + Size.toString-impl(this.a) + ", matrix=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureIntent$UpdateContentBounds;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "Landroidx/compose/ui/geometry/Rect;", "bounds", "<init>", "(Landroidx/compose/ui/geometry/Rect;)V", "component1", "()Landroidx/compose/ui/geometry/Rect;", "copy", "(Landroidx/compose/ui/geometry/Rect;)Lcom/kakao/kandinsky/signature/contract/SignatureIntent$UpdateContentBounds;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/geometry/Rect;", "getBounds", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateContentBounds implements SignatureIntent {
        public static final int $stable;
        public final Rect a;

        public UpdateContentBounds(@NotNull Rect rect0) {
            Intrinsics.checkNotNullParameter(rect0, "bounds");
            super();
            this.a = rect0;
        }

        @NotNull
        public final Rect component1() {
            return this.a;
        }

        @NotNull
        public final UpdateContentBounds copy(@NotNull Rect rect0) {
            Intrinsics.checkNotNullParameter(rect0, "bounds");
            return new UpdateContentBounds(rect0);
        }

        public static UpdateContentBounds copy$default(UpdateContentBounds signatureIntent$UpdateContentBounds0, Rect rect0, int v, Object object0) {
            if((v & 1) != 0) {
                rect0 = signatureIntent$UpdateContentBounds0.a;
            }
            return signatureIntent$UpdateContentBounds0.copy(rect0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateContentBounds ? Intrinsics.areEqual(this.a, ((UpdateContentBounds)object0).a) : false;
        }

        @NotNull
        public final Rect getBounds() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateContentBounds(bounds=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureIntent$UpdateImageSignature;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "", "uri", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/kandinsky/signature/contract/SignatureIntent$UpdateImageSignature;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUri", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateImageSignature implements SignatureIntent {
        public static final int $stable;
        public final String a;

        public UpdateImageSignature(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "uri");
            super();
            this.a = s;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final UpdateImageSignature copy(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "uri");
            return new UpdateImageSignature(s);
        }

        public static UpdateImageSignature copy$default(UpdateImageSignature signatureIntent$UpdateImageSignature0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = signatureIntent$UpdateImageSignature0.a;
            }
            return signatureIntent$UpdateImageSignature0.copy(s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateImageSignature ? Intrinsics.areEqual(this.a, ((UpdateImageSignature)object0).a) : false;
        }

        @NotNull
        public final String getUri() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return r0.a.o(new StringBuilder("UpdateImageSignature(uri="), this.a, ")");
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureIntent$UpdatePhoto;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)Lcom/kakao/kandinsky/signature/contract/SignatureIntent$UpdatePhoto;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "getPhoto", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdatePhoto implements SignatureIntent {
        public static final int $stable;
        public final KDPhoto a;

        public UpdatePhoto(@NotNull KDPhoto kDPhoto0) {
            Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
            super();
            this.a = kDPhoto0;
        }

        @NotNull
        public final KDPhoto component1() {
            return this.a;
        }

        @NotNull
        public final UpdatePhoto copy(@NotNull KDPhoto kDPhoto0) {
            Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
            return new UpdatePhoto(kDPhoto0);
        }

        public static UpdatePhoto copy$default(UpdatePhoto signatureIntent$UpdatePhoto0, KDPhoto kDPhoto0, int v, Object object0) {
            if((v & 1) != 0) {
                kDPhoto0 = signatureIntent$UpdatePhoto0.a;
            }
            return signatureIntent$UpdatePhoto0.copy(kDPhoto0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdatePhoto ? Intrinsics.areEqual(this.a, ((UpdatePhoto)object0).a) : false;
        }

        @NotNull
        public final KDPhoto getPhoto() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdatePhoto(photo=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0018\u001A\u00020\u00022\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\fR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001B\u001A\u0004\b!\u0010\n¨\u0006\""}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureIntent$UpdateTextSignature;", "Lcom/kakao/kandinsky/signature/contract/SignatureIntent;", "", "new", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "textData", "watermark", "<init>", "(ZLcom/kakao/kandinsky/core/kdphoto/TextData;Z)V", "component1", "()Z", "component2", "()Lcom/kakao/kandinsky/core/kdphoto/TextData;", "component3", "copy", "(ZLcom/kakao/kandinsky/core/kdphoto/TextData;Z)Lcom/kakao/kandinsky/signature/contract/SignatureIntent$UpdateTextSignature;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getNew", "b", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "getTextData", "c", "getWatermark", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateTextSignature implements SignatureIntent {
        public static final int $stable;
        public final boolean a;
        public final TextData b;
        public final boolean c;

        public UpdateTextSignature(boolean z, @NotNull TextData textData0, boolean z1) {
            Intrinsics.checkNotNullParameter(textData0, "textData");
            super();
            this.a = z;
            this.b = textData0;
            this.c = z1;
        }

        public final boolean component1() {
            return this.a;
        }

        @NotNull
        public final TextData component2() {
            return this.b;
        }

        public final boolean component3() {
            return this.c;
        }

        @NotNull
        public final UpdateTextSignature copy(boolean z, @NotNull TextData textData0, boolean z1) {
            Intrinsics.checkNotNullParameter(textData0, "textData");
            return new UpdateTextSignature(z, textData0, z1);
        }

        public static UpdateTextSignature copy$default(UpdateTextSignature signatureIntent$UpdateTextSignature0, boolean z, TextData textData0, boolean z1, int v, Object object0) {
            if((v & 1) != 0) {
                z = signatureIntent$UpdateTextSignature0.a;
            }
            if((v & 2) != 0) {
                textData0 = signatureIntent$UpdateTextSignature0.b;
            }
            if((v & 4) != 0) {
                z1 = signatureIntent$UpdateTextSignature0.c;
            }
            return signatureIntent$UpdateTextSignature0.copy(z, textData0, z1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof UpdateTextSignature)) {
                return false;
            }
            if(this.a != ((UpdateTextSignature)object0).a) {
                return false;
            }
            return Intrinsics.areEqual(this.b, ((UpdateTextSignature)object0).b) ? this.c == ((UpdateTextSignature)object0).c : false;
        }

        public final boolean getNew() {
            return this.a;
        }

        @NotNull
        public final TextData getTextData() {
            return this.b;
        }

        public final boolean getWatermark() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() + Boolean.hashCode(this.a) * 0x1F) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateTextSignature(new=" + this.a + ", textData=" + this.b + ", watermark=" + this.c + ")";
        }
    }

}

