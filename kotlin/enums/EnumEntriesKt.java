package kotlin.enums;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001A!\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0010\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\b\u001A2\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u000E\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00070\u0006H\u0001\u001A1\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u000E\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\f\u0010\b\u001A\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"enumEntries", "Lkotlin/enums/EnumEntries;", "T", "", "E", "entriesProvider", "Lkotlin/Function0;", "", "entries", "([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEnumEntries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumEntries.kt\nkotlin/enums/EnumEntriesKt\n+ 2 EnumEntriesJVM.kt\nkotlin/enums/EnumEntriesJVMKt\n*L\n1#1,91:1\n16#2:92\n*S KotlinDebug\n*F\n+ 1 EnumEntries.kt\nkotlin/enums/EnumEntriesKt\n*L\n31#1:92\n*E\n"})
public final class EnumEntriesKt {
    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.9")
    public static final EnumEntries enumEntries() {
        Intrinsics.reifiedOperationMarker(5, "T");
        return EnumEntriesKt.enumEntries(new Enum[0]);
    }

    @PublishedApi
    @SinceKotlin(version = "1.8")
    @NotNull
    public static final EnumEntries enumEntries(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "entriesProvider");
        return new a(((Enum[])function00.invoke()));
    }

    @PublishedApi
    @SinceKotlin(version = "1.8")
    @NotNull
    public static final EnumEntries enumEntries(@NotNull Enum[] arr_enum) [...] // Inlined contents
}

