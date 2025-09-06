package com.kakao.kandinsky.text.contract;

import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.core.kdphoto.Text;
import com.kakao.kandinsky.core.kdphoto.TextData;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u0082\u0001\r\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B¨\u0006\u001C"}, d2 = {"Lcom/kakao/kandinsky/text/contract/TextIntent;", "", "Cancel", "ChangeModeToControl", "ChangeModeToInput", "Confirm", "Init", "MoveSelectDeco", "RemoveAllDeco", "RemoveSelectDeco", "ScaleNRotateSelectDeco", "SelectDecoText", "UpdateContentBounds", "UpdatePhoto", "UpdateTextData", "Lcom/kakao/kandinsky/text/contract/TextIntent$Cancel;", "Lcom/kakao/kandinsky/text/contract/TextIntent$ChangeModeToControl;", "Lcom/kakao/kandinsky/text/contract/TextIntent$ChangeModeToInput;", "Lcom/kakao/kandinsky/text/contract/TextIntent$Confirm;", "Lcom/kakao/kandinsky/text/contract/TextIntent$Init;", "Lcom/kakao/kandinsky/text/contract/TextIntent$MoveSelectDeco;", "Lcom/kakao/kandinsky/text/contract/TextIntent$RemoveAllDeco;", "Lcom/kakao/kandinsky/text/contract/TextIntent$RemoveSelectDeco;", "Lcom/kakao/kandinsky/text/contract/TextIntent$ScaleNRotateSelectDeco;", "Lcom/kakao/kandinsky/text/contract/TextIntent$SelectDecoText;", "Lcom/kakao/kandinsky/text/contract/TextIntent$UpdateContentBounds;", "Lcom/kakao/kandinsky/text/contract/TextIntent$UpdatePhoto;", "Lcom/kakao/kandinsky/text/contract/TextIntent$UpdateTextData;", "text_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface TextIntent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/text/contract/TextIntent$Cancel;", "Lcom/kakao/kandinsky/text/contract/TextIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "text_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Cancel implements TextIntent {
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
            return 0xA4E2D16E;
        }

        @Override
        @NotNull
        public String toString() {
            return "Cancel";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/text/contract/TextIntent$ChangeModeToControl;", "Lcom/kakao/kandinsky/text/contract/TextIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "text_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeModeToControl implements TextIntent {
        public static final int $stable;
        @NotNull
        public static final ChangeModeToControl INSTANCE;

        static {
            ChangeModeToControl.INSTANCE = new ChangeModeToControl();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof ChangeModeToControl;
        }

        @Override
        public int hashCode() {
            return 0x63532FBB;
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeModeToControl";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0012\u001A\u00020\u00022\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/kakao/kandinsky/text/contract/TextIntent$ChangeModeToInput;", "Lcom/kakao/kandinsky/text/contract/TextIntent;", "", "new", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/kakao/kandinsky/text/contract/TextIntent$ChangeModeToInput;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getNew", "text_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeModeToInput implements TextIntent {
        public static final int $stable;
        public final boolean a;

        public ChangeModeToInput(boolean z) {
            this.a = z;
        }

        public final boolean component1() {
            return this.a;
        }

        @NotNull
        public final ChangeModeToInput copy(boolean z) {
            return new ChangeModeToInput(z);
        }

        public static ChangeModeToInput copy$default(ChangeModeToInput textIntent$ChangeModeToInput0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = textIntent$ChangeModeToInput0.a;
            }
            return textIntent$ChangeModeToInput0.copy(z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeModeToInput ? this.a == ((ChangeModeToInput)object0).a : false;
        }

        public final boolean getNew() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.a);
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeModeToInput(new=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/text/contract/TextIntent$Confirm;", "Lcom/kakao/kandinsky/text/contract/TextIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "text_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Confirm implements TextIntent {
        public static final int $stable;
        @NotNull
        public static final Confirm INSTANCE;

        static {
            Confirm.INSTANCE = new Confirm();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Confirm;
        }

        @Override
        public int hashCode() {
            return 257729100;
        }

        @Override
        @NotNull
        public String toString() {
            return "Confirm";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u001C\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0014\b\u0002\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0016\u001A\u00020\u00022\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u000BR#\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\r¨\u0006\u001E"}, d2 = {"Lcom/kakao/kandinsky/text/contract/TextIntent$Init;", "Lcom/kakao/kandinsky/text/contract/TextIntent;", "", "allowSystemFont", "", "", "", "fontResources", "<init>", "(ZLjava/util/Map;)V", "component1", "()Z", "component2", "()Ljava/util/Map;", "copy", "(ZLjava/util/Map;)Lcom/kakao/kandinsky/text/contract/TextIntent$Init;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getAllowSystemFont", "b", "Ljava/util/Map;", "getFontResources", "text_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Init implements TextIntent {
        public static final int $stable = 8;
        public final boolean a;
        public final Map b;

        public Init(boolean z, @NotNull Map map0) {
            Intrinsics.checkNotNullParameter(map0, "fontResources");
            super();
            this.a = z;
            this.b = map0;
        }

        public final boolean component1() {
            return this.a;
        }

        @NotNull
        public final Map component2() {
            return this.b;
        }

        @NotNull
        public final Init copy(boolean z, @NotNull Map map0) {
            Intrinsics.checkNotNullParameter(map0, "fontResources");
            return new Init(z, map0);
        }

        public static Init copy$default(Init textIntent$Init0, boolean z, Map map0, int v, Object object0) {
            if((v & 1) != 0) {
                z = textIntent$Init0.a;
            }
            if((v & 2) != 0) {
                map0 = textIntent$Init0.b;
            }
            return textIntent$Init0.copy(z, map0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Init)) {
                return false;
            }
            return this.a == ((Init)object0).a ? Intrinsics.areEqual(this.b, ((Init)object0).b) : false;
        }

        public final boolean getAllowSystemFont() {
            return this.a;
        }

        @NotNull
        public final Map getFontResources() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + Boolean.hashCode(this.a) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "Init(allowSystemFont=" + this.a + ", fontResources=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001A\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000BJ\'\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\tR\u001D\u0010\u0005\u001A\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\u000B\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006!"}, d2 = {"Lcom/kakao/kandinsky/text/contract/TextIntent$MoveSelectDeco;", "Lcom/kakao/kandinsky/text/contract/TextIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Text;", "text", "Landroidx/compose/ui/geometry/Offset;", "offset", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Text;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Text;", "component2-F1C5BW0", "()J", "component2", "copy-Uv8p0NA", "(Lcom/kakao/kandinsky/core/kdphoto/Text;J)Lcom/kakao/kandinsky/text/contract/TextIntent$MoveSelectDeco;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Text;", "getText", "b", "J", "getOffset-F1C5BW0", "text_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class MoveSelectDeco implements TextIntent {
        public static final int $stable;
        public final Text a;
        public final long b;

        public MoveSelectDeco(Text text0, long v, DefaultConstructorMarker defaultConstructorMarker0) {
            Intrinsics.checkNotNullParameter(text0, "text");
            super();
            this.a = text0;
            this.b = v;
        }

        @NotNull
        public final Text component1() {
            return this.a;
        }

        public final long component2-F1C5BW0() {
            return this.b;
        }

        @NotNull
        public final MoveSelectDeco copy-Uv8p0NA(@NotNull Text text0, long v) {
            Intrinsics.checkNotNullParameter(text0, "text");
            return new MoveSelectDeco(text0, v, null);
        }

        public static MoveSelectDeco copy-Uv8p0NA$default(MoveSelectDeco textIntent$MoveSelectDeco0, Text text0, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                text0 = textIntent$MoveSelectDeco0.a;
            }
            if((v1 & 2) != 0) {
                v = textIntent$MoveSelectDeco0.b;
            }
            return textIntent$MoveSelectDeco0.copy-Uv8p0NA(text0, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof MoveSelectDeco)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((MoveSelectDeco)object0).a) ? Offset.equals-impl0(this.b, ((MoveSelectDeco)object0).b) : false;
        }

        public final long getOffset-F1C5BW0() {
            return this.b;
        }

        @NotNull
        public final Text getText() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Offset.hashCode-impl(this.b) + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            String s = Offset.toString-impl(this.b);
            return "MoveSelectDeco(text=" + this.a + ", offset=" + s + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/text/contract/TextIntent$RemoveAllDeco;", "Lcom/kakao/kandinsky/text/contract/TextIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "text_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RemoveAllDeco implements TextIntent {
        public static final int $stable;
        @NotNull
        public static final RemoveAllDeco INSTANCE;

        static {
            RemoveAllDeco.INSTANCE = new RemoveAllDeco();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof RemoveAllDeco;
        }

        @Override
        public int hashCode() {
            return 0x1677D756;
        }

        @Override
        @NotNull
        public String toString() {
            return "RemoveAllDeco";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/text/contract/TextIntent$RemoveSelectDeco;", "Lcom/kakao/kandinsky/text/contract/TextIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Text;", "text", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Text;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Text;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/Text;)Lcom/kakao/kandinsky/text/contract/TextIntent$RemoveSelectDeco;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Text;", "getText", "text_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RemoveSelectDeco implements TextIntent {
        public static final int $stable;
        public final Text a;

        public RemoveSelectDeco(@NotNull Text text0) {
            Intrinsics.checkNotNullParameter(text0, "text");
            super();
            this.a = text0;
        }

        @NotNull
        public final Text component1() {
            return this.a;
        }

        @NotNull
        public final RemoveSelectDeco copy(@NotNull Text text0) {
            Intrinsics.checkNotNullParameter(text0, "text");
            return new RemoveSelectDeco(text0);
        }

        public static RemoveSelectDeco copy$default(RemoveSelectDeco textIntent$RemoveSelectDeco0, Text text0, int v, Object object0) {
            if((v & 1) != 0) {
                text0 = textIntent$RemoveSelectDeco0.a;
            }
            return textIntent$RemoveSelectDeco0.copy(text0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RemoveSelectDeco ? Intrinsics.areEqual(this.a, ((RemoveSelectDeco)object0).a) : false;
        }

        @NotNull
        public final Text getText() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "RemoveSelectDeco(text=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0016\u0010\u000E\u001A\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001AHÖ\u0003¢\u0006\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u000BR\u001D\u0010\u0005\u001A\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\rR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0010\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006("}, d2 = {"Lcom/kakao/kandinsky/text/contract/TextIntent$ScaleNRotateSelectDeco;", "Lcom/kakao/kandinsky/text/contract/TextIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Text;", "text", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Matrix;", "matrix", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Text;JLandroid/graphics/Matrix;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Text;", "component2-NH-jbRc", "()J", "component2", "component3", "()Landroid/graphics/Matrix;", "copy-12SF9DM", "(Lcom/kakao/kandinsky/core/kdphoto/Text;JLandroid/graphics/Matrix;)Lcom/kakao/kandinsky/text/contract/TextIntent$ScaleNRotateSelectDeco;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Text;", "getText", "b", "J", "getSize-NH-jbRc", "c", "Landroid/graphics/Matrix;", "getMatrix", "text_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ScaleNRotateSelectDeco implements TextIntent {
        public static final int $stable = 8;
        public final Text a;
        public final long b;
        public final Matrix c;

        public ScaleNRotateSelectDeco(Text text0, long v, Matrix matrix0, DefaultConstructorMarker defaultConstructorMarker0) {
            Intrinsics.checkNotNullParameter(text0, "text");
            Intrinsics.checkNotNullParameter(matrix0, "matrix");
            super();
            this.a = text0;
            this.b = v;
            this.c = matrix0;
        }

        @NotNull
        public final Text component1() {
            return this.a;
        }

        public final long component2-NH-jbRc() {
            return this.b;
        }

        @NotNull
        public final Matrix component3() {
            return this.c;
        }

        @NotNull
        public final ScaleNRotateSelectDeco copy-12SF9DM(@NotNull Text text0, long v, @NotNull Matrix matrix0) {
            Intrinsics.checkNotNullParameter(text0, "text");
            Intrinsics.checkNotNullParameter(matrix0, "matrix");
            return new ScaleNRotateSelectDeco(text0, v, matrix0, null);
        }

        public static ScaleNRotateSelectDeco copy-12SF9DM$default(ScaleNRotateSelectDeco textIntent$ScaleNRotateSelectDeco0, Text text0, long v, Matrix matrix0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                text0 = textIntent$ScaleNRotateSelectDeco0.a;
            }
            if((v1 & 2) != 0) {
                v = textIntent$ScaleNRotateSelectDeco0.b;
            }
            if((v1 & 4) != 0) {
                matrix0 = textIntent$ScaleNRotateSelectDeco0.c;
            }
            return textIntent$ScaleNRotateSelectDeco0.copy-12SF9DM(text0, v, matrix0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ScaleNRotateSelectDeco)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((ScaleNRotateSelectDeco)object0).a)) {
                return false;
            }
            return Size.equals-impl0(this.b, ((ScaleNRotateSelectDeco)object0).b) ? Intrinsics.areEqual(this.c, ((ScaleNRotateSelectDeco)object0).c) : false;
        }

        @NotNull
        public final Matrix getMatrix() {
            return this.c;
        }

        public final long getSize-NH-jbRc() {
            return this.b;
        }

        @NotNull
        public final Text getText() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() + (Size.hashCode-impl(this.b) + this.a.hashCode() * 0x1F) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            String s = Size.toString-impl(this.b);
            return "ScaleNRotateSelectDeco(text=" + this.a + ", size=" + s + ", matrix=" + this.c + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/text/contract/TextIntent$SelectDecoText;", "Lcom/kakao/kandinsky/text/contract/TextIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Text;", "text", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Text;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Text;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/Text;)Lcom/kakao/kandinsky/text/contract/TextIntent$SelectDecoText;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Text;", "getText", "text_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class SelectDecoText implements TextIntent {
        public static final int $stable;
        public final Text a;

        public SelectDecoText(@Nullable Text text0) {
            this.a = text0;
        }

        @Nullable
        public final Text component1() {
            return this.a;
        }

        @NotNull
        public final SelectDecoText copy(@Nullable Text text0) {
            return new SelectDecoText(text0);
        }

        public static SelectDecoText copy$default(SelectDecoText textIntent$SelectDecoText0, Text text0, int v, Object object0) {
            if((v & 1) != 0) {
                text0 = textIntent$SelectDecoText0.a;
            }
            return textIntent$SelectDecoText0.copy(text0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof SelectDecoText ? Intrinsics.areEqual(this.a, ((SelectDecoText)object0).a) : false;
        }

        @Nullable
        public final Text getText() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "SelectDecoText(text=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/text/contract/TextIntent$UpdateContentBounds;", "Lcom/kakao/kandinsky/text/contract/TextIntent;", "Landroidx/compose/ui/geometry/Rect;", "bounds", "<init>", "(Landroidx/compose/ui/geometry/Rect;)V", "component1", "()Landroidx/compose/ui/geometry/Rect;", "copy", "(Landroidx/compose/ui/geometry/Rect;)Lcom/kakao/kandinsky/text/contract/TextIntent$UpdateContentBounds;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/geometry/Rect;", "getBounds", "text_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateContentBounds implements TextIntent {
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

        public static UpdateContentBounds copy$default(UpdateContentBounds textIntent$UpdateContentBounds0, Rect rect0, int v, Object object0) {
            if((v & 1) != 0) {
                rect0 = textIntent$UpdateContentBounds0.a;
            }
            return textIntent$UpdateContentBounds0.copy(rect0);
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
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/text/contract/TextIntent$UpdatePhoto;", "Lcom/kakao/kandinsky/text/contract/TextIntent;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)Lcom/kakao/kandinsky/text/contract/TextIntent$UpdatePhoto;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "getPhoto", "text_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdatePhoto implements TextIntent {
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

        public static UpdatePhoto copy$default(UpdatePhoto textIntent$UpdatePhoto0, KDPhoto kDPhoto0, int v, Object object0) {
            if((v & 1) != 0) {
                kDPhoto0 = textIntent$UpdatePhoto0.a;
            }
            return textIntent$UpdatePhoto0.copy(kDPhoto0);
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
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/text/contract/TextIntent$UpdateTextData;", "Lcom/kakao/kandinsky/text/contract/TextIntent;", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "data", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/TextData;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/TextData;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/TextData;)Lcom/kakao/kandinsky/text/contract/TextIntent$UpdateTextData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "getData", "text_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateTextData implements TextIntent {
        public static final int $stable;
        public final TextData a;

        public UpdateTextData(@Nullable TextData textData0) {
            this.a = textData0;
        }

        @Nullable
        public final TextData component1() {
            return this.a;
        }

        @NotNull
        public final UpdateTextData copy(@Nullable TextData textData0) {
            return new UpdateTextData(textData0);
        }

        public static UpdateTextData copy$default(UpdateTextData textIntent$UpdateTextData0, TextData textData0, int v, Object object0) {
            if((v & 1) != 0) {
                textData0 = textIntent$UpdateTextData0.a;
            }
            return textIntent$UpdateTextData0.copy(textData0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateTextData ? Intrinsics.areEqual(this.a, ((UpdateTextData)object0).a) : false;
        }

        @Nullable
        public final TextData getData() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateTextData(data=" + this.a + ")";
        }
    }

}

