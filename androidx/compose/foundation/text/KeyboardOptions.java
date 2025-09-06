package androidx.compose.foundation.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b(\b\u0007\u0018\u0000 O2\u00020\u0001:\u0001OBU\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\r\u00A2\u0006\u0004\b\u000F\u0010\u0010BS\b\u0017\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0011\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\r\u00A2\u0006\u0004\b\u000F\u0010\u0012B1\b\u0017\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\u000F\u0010\u0013B=\b\u0017\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n\u00A2\u0006\u0004\b\u000F\u0010\u0014J\u0019\u0010\u0019\u001A\u00020\u00162\b\b\u0002\u0010\u0015\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018J^\u0010\u001C\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\r\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001BJ^\u0010\u001C\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0011\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001DJF\u0010\u001C\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0011\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FJ:\u0010\u001C\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0011\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\bH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010!J\u001A\u0010#\u001A\u00020\u00042\b\u0010\"\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b#\u0010$J\u000F\u0010&\u001A\u00020%H\u0016\u00A2\u0006\u0004\b&\u0010\'J\u000F\u0010)\u001A\u00020(H\u0016\u00A2\u0006\u0004\b)\u0010*J\u0017\u0010+\u001A\u00020\u00002\b\u0010\"\u001A\u0004\u0018\u00010\u0000\u00A2\u0006\u0004\b+\u0010,J\u0019\u0010.\u001A\u00020\u00002\b\u0010\"\u001A\u0004\u0018\u00010\u0000H\u0001\u00A2\u0006\u0004\b-\u0010,R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\'R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u00105R\u001D\u0010\u0007\u001A\u00020\u00068\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b6\u00100\u001A\u0004\b7\u0010\'R\u001D\u0010\t\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b8\u00100\u001A\u0004\b9\u0010\'R\u0019\u0010\u000B\u001A\u0004\u0018\u00010\n8\u0006\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=R\u0019\u0010\f\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b>\u00103\u001A\u0004\b?\u00105R\u0019\u0010\u000E\u001A\u0004\u0018\u00010\r8\u0006\u00A2\u0006\f\n\u0004\b@\u0010A\u001A\u0004\bB\u0010CR\u001A\u0010\u0011\u001A\u00020\u00048FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bF\u0010G\u001A\u0004\bD\u0010ER\u001A\u0010J\u001A\u00020\u00048FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bI\u0010G\u001A\u0004\bH\u0010ER\u001A\u0010L\u001A\u00020\b8@X\u0080\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bK\u0010\'R\u0014\u0010N\u001A\u00020\u00048@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bM\u0010E\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006P"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions;", "", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "capitalization", "", "autoCorrectEnabled", "Landroidx/compose/ui/text/input/KeyboardType;", "keyboardType", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "platformImeOptions", "showKeyboardOnFocus", "Landroidx/compose/ui/text/intl/LocaleList;", "hintLocales", "<init>", "(ILjava/lang/Boolean;IILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "autoCorrect", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "singleLine", "Landroidx/compose/ui/text/input/ImeOptions;", "toImeOptions$foundation_release", "(Z)Landroidx/compose/ui/text/input/ImeOptions;", "toImeOptions", "copy-INvB4aQ", "(ILjava/lang/Boolean;IILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/foundation/text/KeyboardOptions;", "copy", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/foundation/text/KeyboardOptions;", "copy-ij11fho", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;)Landroidx/compose/foundation/text/KeyboardOptions;", "copy-3m2b7yw", "(IZII)Landroidx/compose/foundation/text/KeyboardOptions;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "merge", "(Landroidx/compose/foundation/text/KeyboardOptions;)Landroidx/compose/foundation/text/KeyboardOptions;", "fillUnspecifiedValuesWith$foundation_release", "fillUnspecifiedValuesWith", "a", "I", "getCapitalization-IUNYP9k", "b", "Ljava/lang/Boolean;", "getAutoCorrectEnabled", "()Ljava/lang/Boolean;", "c", "getKeyboardType-PjHm6EE", "d", "getImeAction-eUduSuo", "e", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "getPlatformImeOptions", "()Landroidx/compose/ui/text/input/PlatformImeOptions;", "f", "getShowKeyboardOnFocus", "g", "Landroidx/compose/ui/text/intl/LocaleList;", "getHintLocales", "()Landroidx/compose/ui/text/intl/LocaleList;", "getAutoCorrect", "()Z", "getAutoCorrect$annotations", "()V", "getShouldShowKeyboardOnFocus", "getShouldShowKeyboardOnFocus$annotations", "shouldShowKeyboardOnFocus", "getImeActionOrDefault-eUduSuo$foundation_release", "imeActionOrDefault", "getShowKeyboardOnFocusOrDefault$foundation_release", "showKeyboardOnFocusOrDefault", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKeyboardOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardOptions.kt\nandroidx/compose/foundation/text/KeyboardOptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
public final class KeyboardOptions {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006R \u0010\t\u001A\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000B\u0010\b\u001A\u0004\b\n\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions$Companion;", "", "Landroidx/compose/foundation/text/KeyboardOptions;", "Default", "Landroidx/compose/foundation/text/KeyboardOptions;", "getDefault", "()Landroidx/compose/foundation/text/KeyboardOptions;", "getDefault$annotations", "()V", "SecureTextField", "getSecureTextField$foundation_release", "getSecureTextField$foundation_release$annotations", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KeyboardOptions getDefault() {
            return KeyboardOptions.h;
        }

        @Stable
        public static void getDefault$annotations() {
        }

        @NotNull
        public final KeyboardOptions getSecureTextField$foundation_release() {
            return KeyboardOptions.i;
        }

        @Stable
        public static void getSecureTextField$foundation_release$annotations() {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final PlatformImeOptions e;
    public final Boolean f;
    public final LocaleList g;
    public static final KeyboardOptions h;
    public static final KeyboardOptions i;

    static {
        KeyboardOptions.Companion = new Companion(null);
        KeyboardOptions.h = new KeyboardOptions(0, null, 0, 0, null, null, null, 0x7F, null);
        KeyboardOptions.i = new KeyboardOptions(0, Boolean.FALSE, 7, 0, null, null, null, 0x79, null);
    }

    // 去混淆评级： 低(35)
    public KeyboardOptions(int v, Boolean boolean0, int v1, int v2, PlatformImeOptions platformImeOptions0, Boolean boolean1, LocaleList localeList0, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v3 & 1) == 0 ? v : -1), ((v3 & 2) == 0 ? boolean0 : null), ((v3 & 4) == 0 ? v1 : 0), ((v3 & 8) == 0 ? v2 : -1), ((v3 & 16) == 0 ? platformImeOptions0 : null), ((v3 & 0x20) == 0 ? boolean1 : null), ((v3 & 0x40) == 0 ? localeList0 : null), null);
    }

    public KeyboardOptions(int v, Boolean boolean0, int v1, int v2, PlatformImeOptions platformImeOptions0, Boolean boolean1, LocaleList localeList0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = boolean0;
        this.c = v1;
        this.d = v2;
        this.e = platformImeOptions0;
        this.f = boolean1;
        this.g = localeList0;
    }

    public KeyboardOptions(int v, boolean z, int v1, int v2, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v3 & 1) != 0) {
            v = -1;
        }
        if((v3 & 2) != 0) {
            z = KeyboardOptions.h.a();
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = 1;
        }
        this(v, z, v1, v2, null);
    }

    public KeyboardOptions(int v, boolean z, int v1, int v2, PlatformImeOptions platformImeOptions0, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v3 & 1) != 0) {
            v = 0;
        }
        if((v3 & 2) != 0) {
            z = KeyboardOptions.h.a();
        }
        if((v3 & 4) != 0) {
            v1 = 1;
        }
        if((v3 & 8) != 0) {
            v2 = 1;
        }
        if((v3 & 16) != 0) {
            platformImeOptions0 = null;
        }
        this(v, z, v1, v2, platformImeOptions0, null);
    }

    // 去混淆评级： 低(30)
    public KeyboardOptions(int v, boolean z, int v1, int v2, PlatformImeOptions platformImeOptions0, Boolean boolean0, LocaleList localeList0, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v3 & 1) == 0 ? v : -1), z, ((v3 & 4) == 0 ? v1 : 0), ((v3 & 8) == 0 ? v2 : -1), ((v3 & 16) == 0 ? platformImeOptions0 : null), ((v3 & 0x20) == 0 ? boolean0 : null), ((v3 & 0x40) == 0 ? localeList0 : null), null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Please use the new constructor that takes optional autoCorrectEnabled parameter.", replaceWith = @ReplaceWith(expression = "KeyboardOptions(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus,hintLocales = hintLocales)", imports = {}))
    public KeyboardOptions(int v, boolean z, int v1, int v2, PlatformImeOptions platformImeOptions0, Boolean boolean0, LocaleList localeList0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, Boolean.valueOf(z), v1, v2, platformImeOptions0, boolean0, localeList0, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    public KeyboardOptions(int v, boolean z, int v1, int v2, PlatformImeOptions platformImeOptions0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, Boolean.valueOf(z), v1, v2, platformImeOptions0, Boolean.valueOf(KeyboardOptions.h.getShowKeyboardOnFocusOrDefault$foundation_release()), null, 0x40, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional platformImeOptions parameter.")
    public KeyboardOptions(int v, boolean z, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, Boolean.valueOf(z), v1, v2, null, null, null, 0x60, null);
    }

    public final boolean a() {
        return this.b == null ? true : this.b.booleanValue();
    }

    // 去混淆评级： 中等(90)
    public final boolean b() {
        return KeyboardCapitalization.equals-impl0(this.a, -1) && this.b == null && KeyboardType.equals-impl0(this.c, 0) && (ImeAction.equals-impl0(this.d, -1) && this.e == null && this.f == null && this.g == null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional platformImeOptions parameter.")
    public final KeyboardOptions copy-3m2b7yw(int v, boolean z, int v1, int v2) {
        return new KeyboardOptions(v, Boolean.valueOf(z), v1, v2, this.e, this.f, this.g, null);
    }

    public static KeyboardOptions copy-3m2b7yw$default(KeyboardOptions keyboardOptions0, int v, boolean z, int v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v = keyboardOptions0.a;
        }
        if((v3 & 2) != 0) {
            z = keyboardOptions0.a();
        }
        if((v3 & 4) != 0) {
            v1 = keyboardOptions0.c;
        }
        if((v3 & 8) != 0) {
            v2 = keyboardOptions0.d;
        }
        return keyboardOptions0.copy-3m2b7yw(v, z, v1, v2);
    }

    @NotNull
    public final KeyboardOptions copy-INvB4aQ(int v, @Nullable Boolean boolean0, int v1, int v2, @Nullable PlatformImeOptions platformImeOptions0, @Nullable Boolean boolean1, @Nullable LocaleList localeList0) {
        return new KeyboardOptions(v, boolean0, v1, v2, platformImeOptions0, boolean1, localeList0, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the copy function that takes an autoCorrectEnabled parameter.", replaceWith = @ReplaceWith(expression = "copy(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus ?: true,hintLocales = hintLocales)", imports = {}))
    public final KeyboardOptions copy-INvB4aQ(int v, boolean z, int v1, int v2, PlatformImeOptions platformImeOptions0, Boolean boolean0, LocaleList localeList0) {
        return new KeyboardOptions(v, Boolean.valueOf(z), v1, v2, platformImeOptions0, boolean0, localeList0, null);
    }

    public static KeyboardOptions copy-INvB4aQ$default(KeyboardOptions keyboardOptions0, int v, Boolean boolean0, int v1, int v2, PlatformImeOptions platformImeOptions0, Boolean boolean1, LocaleList localeList0, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v = keyboardOptions0.a;
        }
        if((v3 & 2) != 0) {
            boolean0 = keyboardOptions0.b;
        }
        if((v3 & 4) != 0) {
            v1 = keyboardOptions0.c;
        }
        if((v3 & 8) != 0) {
            v2 = keyboardOptions0.d;
        }
        if((v3 & 16) != 0) {
            platformImeOptions0 = keyboardOptions0.e;
        }
        Boolean boolean2 = (v3 & 0x20) == 0 ? boolean1 : null;
        return (v3 & 0x40) == 0 ? keyboardOptions0.copy-INvB4aQ(v, boolean0, v1, v2, platformImeOptions0, boolean2, localeList0) : keyboardOptions0.copy-INvB4aQ(v, boolean0, v1, v2, platformImeOptions0, boolean2, null);
    }

    public static KeyboardOptions copy-INvB4aQ$default(KeyboardOptions keyboardOptions0, int v, boolean z, int v1, int v2, PlatformImeOptions platformImeOptions0, Boolean boolean0, LocaleList localeList0, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v = keyboardOptions0.a;
        }
        if((v3 & 2) != 0) {
            z = keyboardOptions0.a();
        }
        if((v3 & 4) != 0) {
            v1 = keyboardOptions0.c;
        }
        if((v3 & 8) != 0) {
            v2 = keyboardOptions0.d;
        }
        if((v3 & 16) != 0) {
            platformImeOptions0 = keyboardOptions0.e;
        }
        if((v3 & 0x20) != 0) {
            boolean0 = Boolean.valueOf(keyboardOptions0.getShowKeyboardOnFocusOrDefault$foundation_release());
        }
        if((v3 & 0x40) != 0) {
            localeList0 = keyboardOptions0.g;
        }
        return keyboardOptions0.copy-INvB4aQ(v, z, v1, v2, platformImeOptions0, boolean0, localeList0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public final KeyboardOptions copy-ij11fho(int v, boolean z, int v1, int v2, PlatformImeOptions platformImeOptions0) {
        return new KeyboardOptions(v, Boolean.valueOf(z), v1, v2, platformImeOptions0, this.f, this.g, null);
    }

    public static KeyboardOptions copy-ij11fho$default(KeyboardOptions keyboardOptions0, int v, boolean z, int v1, int v2, PlatformImeOptions platformImeOptions0, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v = keyboardOptions0.a;
        }
        if((v3 & 2) != 0) {
            z = keyboardOptions0.a();
        }
        if((v3 & 4) != 0) {
            v1 = keyboardOptions0.c;
        }
        if((v3 & 8) != 0) {
            v2 = keyboardOptions0.d;
        }
        if((v3 & 16) != 0) {
            platformImeOptions0 = keyboardOptions0.e;
        }
        return keyboardOptions0.copy-ij11fho(v, z, v1, v2, platformImeOptions0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof KeyboardOptions)) {
            return false;
        }
        if(!KeyboardCapitalization.equals-impl0(this.a, ((KeyboardOptions)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((KeyboardOptions)object0).b)) {
            return false;
        }
        if(!KeyboardType.equals-impl0(this.c, ((KeyboardOptions)object0).c)) {
            return false;
        }
        if(!ImeAction.equals-impl0(this.d, ((KeyboardOptions)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((KeyboardOptions)object0).e)) {
            return false;
        }
        return Intrinsics.areEqual(this.f, ((KeyboardOptions)object0).f) ? Intrinsics.areEqual(this.g, ((KeyboardOptions)object0).g) : false;
    }

    @Stable
    @NotNull
    public final KeyboardOptions fillUnspecifiedValuesWith$foundation_release(@Nullable KeyboardOptions keyboardOptions0) {
        if(keyboardOptions0 != null && !keyboardOptions0.b() && !Intrinsics.areEqual(keyboardOptions0, this)) {
            if(this.b()) {
                return keyboardOptions0;
            }
            KeyboardCapitalization keyboardCapitalization0 = KeyboardCapitalization.box-impl(this.a);
            ImeAction imeAction0 = null;
            if(KeyboardCapitalization.equals-impl0(keyboardCapitalization0.unbox-impl(), -1)) {
                keyboardCapitalization0 = null;
            }
            int v = keyboardCapitalization0 == null ? keyboardOptions0.a : keyboardCapitalization0.unbox-impl();
            Boolean boolean0 = this.b == null ? keyboardOptions0.b : this.b;
            KeyboardType keyboardType0 = KeyboardType.box-impl(this.c);
            if(KeyboardType.equals-impl0(keyboardType0.unbox-impl(), 0)) {
                keyboardType0 = null;
            }
            int v1 = keyboardType0 == null ? keyboardOptions0.c : keyboardType0.unbox-impl();
            ImeAction imeAction1 = ImeAction.box-impl(this.d);
            if(!ImeAction.equals-impl0(imeAction1.unbox-impl(), -1)) {
                imeAction0 = imeAction1;
            }
            int v2 = imeAction0 == null ? keyboardOptions0.d : imeAction0.unbox-impl();
            PlatformImeOptions platformImeOptions0 = this.e == null ? keyboardOptions0.e : this.e;
            Boolean boolean1 = this.f == null ? keyboardOptions0.f : this.f;
            return this.g == null ? new KeyboardOptions(v, boolean0, v1, v2, platformImeOptions0, boolean1, keyboardOptions0.g, null) : new KeyboardOptions(v, boolean0, v1, v2, platformImeOptions0, boolean1, this.g, null);
        }
        return this;
    }

    public final boolean getAutoCorrect() {
        return this.a();
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Please use the autoCorrectEnabled property.")
    public static void getAutoCorrect$annotations() {
    }

    @Nullable
    public final Boolean getAutoCorrectEnabled() {
        return this.b;
    }

    public final int getCapitalization-IUNYP9k() {
        return this.a;
    }

    @Nullable
    public final LocaleList getHintLocales() {
        return this.g;
    }

    public final int getImeAction-eUduSuo() {
        return this.d;
    }

    public final int getImeActionOrDefault-eUduSuo$foundation_release() {
        ImeAction imeAction0 = ImeAction.box-impl(this.d);
        if(ImeAction.equals-impl0(imeAction0.unbox-impl(), -1)) {
            imeAction0 = null;
        }
        return imeAction0 == null ? 1 : imeAction0.unbox-impl();
    }

    public final int getKeyboardType-PjHm6EE() {
        return this.c;
    }

    @Nullable
    public final PlatformImeOptions getPlatformImeOptions() {
        return this.e;
    }

    public final boolean getShouldShowKeyboardOnFocus() {
        return this.f == null ? true : this.f.booleanValue();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Included for binary compatibility. Use showKeyboardOnFocus.")
    public static void getShouldShowKeyboardOnFocus$annotations() {
    }

    @Nullable
    public final Boolean getShowKeyboardOnFocus() {
        return this.f;
    }

    public final boolean getShowKeyboardOnFocusOrDefault$foundation_release() {
        return this.f == null ? true : this.f.booleanValue();
    }

    @Override
    public int hashCode() {
        int v = KeyboardCapitalization.hashCode-impl(this.a);
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = KeyboardType.hashCode-impl(this.c);
        int v4 = ImeAction.hashCode-impl(this.d);
        int v5 = this.e == null ? 0 : this.e.hashCode();
        int v6 = this.f == null ? 0 : this.f.hashCode();
        LocaleList localeList0 = this.g;
        if(localeList0 != null) {
            v1 = localeList0.hashCode();
        }
        return (((v4 + (v3 + (v * 0x1F + v2) * 0x1F) * 0x1F) * 0x1F + v5) * 0x1F + v6) * 0x1F + v1;
    }

    @NotNull
    public final KeyboardOptions merge(@Nullable KeyboardOptions keyboardOptions0) {
        if(keyboardOptions0 != null) {
            KeyboardOptions keyboardOptions1 = keyboardOptions0.fillUnspecifiedValuesWith$foundation_release(this);
            return keyboardOptions1 == null ? this : keyboardOptions1;
        }
        return this;
    }

    @NotNull
    public final ImeOptions toImeOptions$foundation_release(boolean z) {
        KeyboardCapitalization keyboardCapitalization0 = KeyboardCapitalization.box-impl(this.a);
        KeyboardType keyboardType0 = null;
        if(KeyboardCapitalization.equals-impl0(keyboardCapitalization0.unbox-impl(), -1)) {
            keyboardCapitalization0 = null;
        }
        int v = keyboardCapitalization0 == null ? 0 : keyboardCapitalization0.unbox-impl();
        boolean z1 = this.a();
        KeyboardType keyboardType1 = KeyboardType.box-impl(this.c);
        if(!KeyboardType.equals-impl0(keyboardType1.unbox-impl(), 0)) {
            keyboardType0 = keyboardType1;
        }
        int v1 = this.getImeActionOrDefault-eUduSuo$foundation_release();
        LocaleList localeList0 = this.g == null ? LocaleList.Companion.getEmpty() : this.g;
        return new ImeOptions(z, v, z1, (keyboardType0 == null ? 1 : keyboardType0.unbox-impl()), v1, this.e, localeList0, null);
    }

    public static ImeOptions toImeOptions$foundation_release$default(KeyboardOptions keyboardOptions0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = ImeOptions.Companion.getDefault().getSingleLine();
        }
        return keyboardOptions0.toImeOptions$foundation_release(z);
    }

    @Override
    @NotNull
    public String toString() {
        return "KeyboardOptions(capitalization=" + KeyboardCapitalization.toString-impl(this.a) + ", autoCorrectEnabled=" + this.b + ", keyboardType=" + KeyboardType.toString-impl(this.c) + ", imeAction=" + ImeAction.toString-impl(this.d) + ", platformImeOptions=" + this.e + "showKeyboardOnFocus=" + this.f + ", hintLocales=" + this.g + ')';
    }
}

