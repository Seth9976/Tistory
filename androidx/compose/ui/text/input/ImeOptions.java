package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.intl.LocaleList;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0019\b\u0007\u0018\u0000 82\u00020\u0001:\u00018BO\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000B\u0012\b\b\u0002\u0010\u000E\u001A\u00020\r\u00A2\u0006\u0004\b\u000F\u0010\u0010BG\b\u0017\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000B\u00A2\u0006\u0004\b\u000F\u0010\u0011B;\b\u0017\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u00A2\u0006\u0004\b\u000F\u0010\u0012JX\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014JP\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017JD\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001B\u001A\u00020\u00022\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001E\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010!\u001A\u00020 H\u0016\u00A2\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&R\u001D\u0010\u0005\u001A\u00020\u00048\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010\u001FR\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b*\u0010$\u001A\u0004\b+\u0010&R\u001D\u0010\b\u001A\u00020\u00078\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b,\u0010(\u001A\u0004\b-\u0010\u001FR\u001D\u0010\n\u001A\u00020\t8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b.\u0010(\u001A\u0004\b/\u0010\u001FR\u0019\u0010\f\u001A\u0004\u0018\u00010\u000B8\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R\u0017\u0010\u000E\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u00107\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u00069"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions;", "", "", "singleLine", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "capitalization", "autoCorrect", "Landroidx/compose/ui/text/input/KeyboardType;", "keyboardType", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "platformImeOptions", "Landroidx/compose/ui/text/intl/LocaleList;", "hintLocales", "<init>", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;Landroidx/compose/ui/text/intl/LocaleList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ZIZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-wBHncE4", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/ui/text/input/ImeOptions;", "copy", "copy-YTHSh70", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;)Landroidx/compose/ui/text/input/ImeOptions;", "copy-uxg59PA", "(ZIZII)Landroidx/compose/ui/text/input/ImeOptions;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Z", "getSingleLine", "()Z", "b", "I", "getCapitalization-IUNYP9k", "c", "getAutoCorrect", "d", "getKeyboardType-PjHm6EE", "e", "getImeAction-eUduSuo", "f", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "getPlatformImeOptions", "()Landroidx/compose/ui/text/input/PlatformImeOptions;", "g", "Landroidx/compose/ui/text/intl/LocaleList;", "getHintLocales", "()Landroidx/compose/ui/text/intl/LocaleList;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ImeOptions {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions$Companion;", "", "Landroidx/compose/ui/text/input/ImeOptions;", "Default", "Landroidx/compose/ui/text/input/ImeOptions;", "getDefault", "()Landroidx/compose/ui/text/input/ImeOptions;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final ImeOptions getDefault() {
            return ImeOptions.h;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final PlatformImeOptions f;
    public final LocaleList g;
    public static final ImeOptions h;

    static {
        ImeOptions.Companion = new Companion(null);
        ImeOptions.h = new ImeOptions(false, 0, false, 0, 0, null, null, 0x7F, null);
    }

    public ImeOptions(boolean z, int v, boolean z1, int v1, int v2, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v3 & 1) != 0) {
            z = false;
        }
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            z1 = true;
        }
        if((v3 & 8) != 0) {
            v1 = 1;
        }
        if((v3 & 16) != 0) {
            v2 = 1;
        }
        this(z, v, z1, v1, v2, null);
    }

    // 去混淆评级： 低(30)
    public ImeOptions(boolean z, int v, boolean z1, int v1, int v2, PlatformImeOptions platformImeOptions0, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v3 & 1) == 0 ? z : false), ((v3 & 2) == 0 ? v : 0), ((v3 & 4) == 0 ? z1 : true), ((v3 & 8) == 0 ? v1 : 1), ((v3 & 16) == 0 ? v2 : 1), ((v3 & 0x20) == 0 ? platformImeOptions0 : null), null);
    }

    // 去混淆评级： 低(30)
    public ImeOptions(boolean z, int v, boolean z1, int v1, int v2, PlatformImeOptions platformImeOptions0, LocaleList localeList0, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v3 & 1) == 0 ? z : false), ((v3 & 2) == 0 ? v : 0), ((v3 & 4) == 0 ? z1 : true), ((v3 & 8) == 0 ? v1 : 1), ((v3 & 16) == 0 ? v2 : 1), ((v3 & 0x20) == 0 ? platformImeOptions0 : null), ((v3 & 0x40) == 0 ? localeList0 : LocaleList.Companion.getEmpty()), null);
    }

    public ImeOptions(boolean z, int v, boolean z1, int v1, int v2, PlatformImeOptions platformImeOptions0, LocaleList localeList0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = z;
        this.b = v;
        this.c = z1;
        this.d = v1;
        this.e = v2;
        this.f = platformImeOptions0;
        this.g = localeList0;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional hintLocales parameter.")
    public ImeOptions(boolean z, int v, boolean z1, int v1, int v2, PlatformImeOptions platformImeOptions0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(z, v, z1, v1, v2, platformImeOptions0, LocaleList.Companion.getEmpty(), null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional platformImeOptions parameter.")
    public ImeOptions(boolean z, int v, boolean z1, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(z, v, z1, v1, v2, null, null, 0x40, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional hintLocales parameter.")
    public final ImeOptions copy-YTHSh70(boolean z, int v, boolean z1, int v1, int v2, PlatformImeOptions platformImeOptions0) {
        return new ImeOptions(z, v, z1, v1, v2, platformImeOptions0, this.g, null);
    }

    public static ImeOptions copy-YTHSh70$default(ImeOptions imeOptions0, boolean z, int v, boolean z1, int v1, int v2, PlatformImeOptions platformImeOptions0, int v3, Object object0) {
        if((v3 & 1) != 0) {
            z = imeOptions0.a;
        }
        if((v3 & 2) != 0) {
            v = imeOptions0.b;
        }
        if((v3 & 4) != 0) {
            z1 = imeOptions0.c;
        }
        if((v3 & 8) != 0) {
            v1 = imeOptions0.d;
        }
        if((v3 & 16) != 0) {
            v2 = imeOptions0.e;
        }
        if((v3 & 0x20) != 0) {
            platformImeOptions0 = imeOptions0.f;
        }
        return imeOptions0.copy-YTHSh70(z, v, z1, v1, v2, platformImeOptions0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional platformImeOptions parameter.")
    public final ImeOptions copy-uxg59PA(boolean z, int v, boolean z1, int v1, int v2) {
        return new ImeOptions(z, v, z1, v1, v2, this.f, this.g, null);
    }

    public static ImeOptions copy-uxg59PA$default(ImeOptions imeOptions0, boolean z, int v, boolean z1, int v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            z = imeOptions0.a;
        }
        if((v3 & 2) != 0) {
            v = imeOptions0.b;
        }
        if((v3 & 4) != 0) {
            z1 = imeOptions0.c;
        }
        if((v3 & 8) != 0) {
            v1 = imeOptions0.d;
        }
        if((v3 & 16) != 0) {
            v2 = imeOptions0.e;
        }
        return imeOptions0.copy-uxg59PA(z, v, z1, v1, v2);
    }

    @NotNull
    public final ImeOptions copy-wBHncE4(boolean z, int v, boolean z1, int v1, int v2, @Nullable PlatformImeOptions platformImeOptions0, @NotNull LocaleList localeList0) {
        return new ImeOptions(z, v, z1, v1, v2, platformImeOptions0, localeList0, null);
    }

    public static ImeOptions copy-wBHncE4$default(ImeOptions imeOptions0, boolean z, int v, boolean z1, int v1, int v2, PlatformImeOptions platformImeOptions0, LocaleList localeList0, int v3, Object object0) {
        if((v3 & 1) != 0) {
            z = imeOptions0.a;
        }
        if((v3 & 2) != 0) {
            v = imeOptions0.b;
        }
        if((v3 & 4) != 0) {
            z1 = imeOptions0.c;
        }
        if((v3 & 8) != 0) {
            v1 = imeOptions0.d;
        }
        if((v3 & 16) != 0) {
            v2 = imeOptions0.e;
        }
        if((v3 & 0x20) != 0) {
            platformImeOptions0 = imeOptions0.f;
        }
        if((v3 & 0x40) != 0) {
            localeList0 = imeOptions0.g;
        }
        return imeOptions0.copy-wBHncE4(z, v, z1, v1, v2, platformImeOptions0, localeList0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ImeOptions)) {
            return false;
        }
        if(this.a != ((ImeOptions)object0).a) {
            return false;
        }
        if(!KeyboardCapitalization.equals-impl0(this.b, ((ImeOptions)object0).b)) {
            return false;
        }
        if(this.c != ((ImeOptions)object0).c) {
            return false;
        }
        if(!KeyboardType.equals-impl0(this.d, ((ImeOptions)object0).d)) {
            return false;
        }
        if(!ImeAction.equals-impl0(this.e, ((ImeOptions)object0).e)) {
            return false;
        }
        return Intrinsics.areEqual(this.f, ((ImeOptions)object0).f) ? Intrinsics.areEqual(this.g, ((ImeOptions)object0).g) : false;
    }

    public final boolean getAutoCorrect() {
        return this.c;
    }

    public final int getCapitalization-IUNYP9k() {
        return this.b;
    }

    @NotNull
    public final LocaleList getHintLocales() {
        return this.g;
    }

    public final int getImeAction-eUduSuo() {
        return this.e;
    }

    public final int getKeyboardType-PjHm6EE() {
        return this.d;
    }

    @Nullable
    public final PlatformImeOptions getPlatformImeOptions() {
        return this.f;
    }

    public final boolean getSingleLine() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = a.e((KeyboardCapitalization.hashCode-impl(this.b) + Boolean.hashCode(this.a) * 0x1F) * 0x1F, 0x1F, this.c);
        int v1 = KeyboardType.hashCode-impl(this.d);
        int v2 = ImeAction.hashCode-impl(this.e);
        return this.f == null ? this.g.hashCode() + (v2 + (v1 + v) * 0x1F) * 961 : this.g.hashCode() + ((v2 + (v1 + v) * 0x1F) * 0x1F + this.f.hashCode()) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + KeyboardCapitalization.toString-impl(this.b) + ", autoCorrect=" + this.c + ", keyboardType=" + KeyboardType.toString-impl(this.d) + ", imeAction=" + ImeAction.toString-impl(this.e) + ", platformImeOptions=" + this.f + ", hintLocales=" + this.g + ')';
    }
}

