package androidx.compose.ui.text;

import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001C\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\n\u0010\u0005\u001A\u00060\u0006j\u0002`\u0007H&J\u001C\u0010\b\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\n\u0010\u0005\u001A\u00060\u0006j\u0002`\u0007H&J\u001C\u0010\t\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\n\u0010\u0005\u001A\u00060\u0006j\u0002`\u0007H&J\u001C\u0010\n\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\n\u0010\u0005\u001A\u00060\u0006j\u0002`\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/PlatformStringDelegate;", "", "capitalize", "", "string", "locale", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "decapitalize", "toLowerCase", "toUpperCase", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface PlatformStringDelegate {
    @NotNull
    String capitalize(@NotNull String arg1, @NotNull Locale arg2);

    @NotNull
    String decapitalize(@NotNull String arg1, @NotNull Locale arg2);

    @NotNull
    String toLowerCase(@NotNull String arg1, @NotNull Locale arg2);

    @NotNull
    String toUpperCase(@NotNull String arg1, @NotNull Locale arg2);
}

