package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000E\b\u0007\u0018\u0000 \u001E2\u00020\u0001:\u0001\u001EB\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u001D\b\u0016\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\tB\u0013\b\u0016\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\u0004\u0010\nJ\u001A\u0010\f\u001A\u00020\u00022\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001A\u00020\u00002\b\u0010\u000B\u001A\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001D\u0010\u0003\u001A\u00020\u00028F¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001A\u0010\u0006\u001A\u0004\b\u0018\u0010\u0019R\u001D\u0010\b\u001A\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u0010\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle;", "", "", "includeFontPadding", "<init>", "(Z)V", "()V", "Landroidx/compose/ui/text/EmojiSupportMatch;", "emojiSupportMatch", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "merge", "(Landroidx/compose/ui/text/PlatformParagraphStyle;)Landroidx/compose/ui/text/PlatformParagraphStyle;", "a", "Z", "getIncludeFontPadding", "()Z", "getIncludeFontPadding$annotations", "b", "I", "getEmojiSupportMatch-_3YsG6Y", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PlatformParagraphStyle {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;", "", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "Default", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "getDefault", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final PlatformParagraphStyle getDefault() {
            return PlatformParagraphStyle.c;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final boolean a;
    public final int b;
    public static final PlatformParagraphStyle c;

    static {
        PlatformParagraphStyle.Companion = new Companion(null);
        PlatformParagraphStyle.c = new PlatformParagraphStyle();
    }

    public PlatformParagraphStyle() {
        this(0, false, null);
    }

    public PlatformParagraphStyle(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        this(v, null);
    }

    public PlatformParagraphStyle(int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = false;
        this.b = v;
    }

    public PlatformParagraphStyle(int v, boolean z, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        if((v1 & 2) != 0) {
            z = false;
        }
        this(v, z, null);
    }

    public PlatformParagraphStyle(int v, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = z;
        this.b = v;
    }

    public PlatformParagraphStyle(boolean z) {
        this.a = z;
        this.b = 0;
    }

    public PlatformParagraphStyle(boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = false;
        }
        this(z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PlatformParagraphStyle)) {
            return false;
        }
        return this.a == ((PlatformParagraphStyle)object0).a ? EmojiSupportMatch.equals-impl0(this.b, ((PlatformParagraphStyle)object0).b) : false;
    }

    public final int getEmojiSupportMatch-_3YsG6Y() {
        return this.b;
    }

    public final boolean getIncludeFontPadding() {
        return this.a;
    }

    public static void getIncludeFontPadding$annotations() {
    }

    @Override
    public int hashCode() {
        return EmojiSupportMatch.hashCode-impl(this.b) + Boolean.hashCode(this.a) * 0x1F;
    }

    @NotNull
    public final PlatformParagraphStyle merge(@Nullable PlatformParagraphStyle platformParagraphStyle0) {
        return platformParagraphStyle0 == null ? this : platformParagraphStyle0;
    }

    @Override
    @NotNull
    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + EmojiSupportMatch.toString-impl(this.b) + ')';
    }
}

