package androidx.compose.ui.text.intl;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000F\b\u0007\u0018\u0000 \u001E2\u00020\u0001:\u0001\u001EB\u0015\b\u0000\u0012\n\u0010\u0004\u001A\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\r\u0010\n\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u001A\u0010\u000E\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u000BR\u001B\u0010\u0004\u001A\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001A\u00020\u00078F¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u000BR\u0011\u0010\u001B\u001A\u00020\u00078F¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u000BR\u0011\u0010\u001D\u001A\u00020\u00078F¢\u0006\u0006\u001A\u0004\b\u001C\u0010\u000B¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/text/intl/Locale;", "", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "platformLocale", "<init>", "(Ljava/util/Locale;)V", "", "languageTag", "(Ljava/lang/String;)V", "toLanguageTag", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "a", "Ljava/util/Locale;", "getPlatformLocale", "()Ljava/util/Locale;", "getLanguage", "language", "getScript", "script", "getRegion", "region", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Locale {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0011\u0010\u0005\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/intl/Locale$Companion;", "", "Landroidx/compose/ui/text/intl/Locale;", "getCurrent", "()Landroidx/compose/ui/text/intl/Locale;", "current", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Locale getCurrent() {
            return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent().get(0);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final java.util.Locale a;

    static {
        Locale.Companion = new Companion(null);
    }

    public Locale(@NotNull String s) {
        this(PlatformLocaleKt.getPlatformLocaleDelegate().parseLanguageTag(s));
    }

    public Locale(@NotNull java.util.Locale locale0) {
        this.a = locale0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(!(object0 instanceof Locale)) {
            return false;
        }
        return this == object0 ? true : Intrinsics.areEqual(this.toLanguageTag(), ((Locale)object0).toLanguageTag());
    }

    @NotNull
    public final String getLanguage() {
        return this.a.getLanguage();
    }

    @NotNull
    public final java.util.Locale getPlatformLocale() {
        return this.a;
    }

    @NotNull
    public final String getRegion() {
        return PlatformLocale_jvmKt.getRegion(this.a);
    }

    @NotNull
    public final String getScript() {
        return this.a.getScript();
    }

    @Override
    public int hashCode() {
        return this.toLanguageTag().hashCode();
    }

    @NotNull
    public final String toLanguageTag() {
        return PlatformLocale_jvmKt.getLanguageTag(this.a);
    }

    @Override
    @NotNull
    public String toString() {
        return this.toLanguageTag();
    }
}

