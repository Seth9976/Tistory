package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001B\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u000B\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001E\u001A\u00020\nH\'J\u0010\u0010\u001F\u001A\u00020\u00002\u0006\u0010\u001E\u001A\u00020\nH\'J\u0010\u0010 \u001A\u00020\n2\u0006\u0010!\u001A\u00020\u0019H\'J\u0010\u0010\"\u001A\u00020\u00192\u0006\u0010\u001E\u001A\u00020\nH\'J\u0010\u0010#\u001A\u00020\u000F2\u0006\u0010\u001E\u001A\u00020\nH\'R \u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\bR\u001A\u0010\t\u001A\u00020\n8&X§\u0004¢\u0006\f\u0012\u0004\b\u000B\u0010\u0006\u001A\u0004\b\f\u0010\rR\u0014\u0010\u000E\u001A\u00020\u000F8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u0010R\u001A\u0010\u0011\u001A\u00020\u000F8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0006\u001A\u0004\b\u0011\u0010\u0010R\u001A\u0010\u0013\u001A\u00020\u00148&X§\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0006\u001A\u0004\b\u0016\u0010\u0017R\u001A\u0010\u0018\u001A\u00020\u00198&X§\u0004¢\u0006\f\u0012\u0004\b\u001A\u0010\u0006\u001A\u0004\b\u001B\u0010\u001C¨\u0006$"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "annotations", "", "", "getAnnotations$annotations", "()V", "getAnnotations", "()Ljava/util/List;", "elementsCount", "", "getElementsCount$annotations", "getElementsCount", "()I", "isInline", "", "()Z", "isNullable", "isNullable$annotations", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind$annotations", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "serialName", "", "getSerialName$annotations", "getSerialName", "()Ljava/lang/String;", "getElementAnnotations", "index", "getElementDescriptor", "getElementIndex", "name", "getElementName", "isElementOptional", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface SerialDescriptor {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @NotNull
        public static List getAnnotations(@NotNull SerialDescriptor serialDescriptor0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }

        @ExperimentalSerializationApi
        public static void getAnnotations$annotations() {
        }

        @ExperimentalSerializationApi
        public static void getElementsCount$annotations() {
        }

        @ExperimentalSerializationApi
        public static void getKind$annotations() {
        }

        @ExperimentalSerializationApi
        public static void getSerialName$annotations() {
        }

        public static boolean isInline(@NotNull SerialDescriptor serialDescriptor0) [...] // Inlined contents

        public static boolean isNullable(@NotNull SerialDescriptor serialDescriptor0) [...] // Inlined contents

        @ExperimentalSerializationApi
        public static void isNullable$annotations() {
        }
    }

    @NotNull
    List getAnnotations();

    @ExperimentalSerializationApi
    @NotNull
    List getElementAnnotations(int arg1);

    @ExperimentalSerializationApi
    @NotNull
    SerialDescriptor getElementDescriptor(int arg1);

    @ExperimentalSerializationApi
    int getElementIndex(@NotNull String arg1);

    @ExperimentalSerializationApi
    @NotNull
    String getElementName(int arg1);

    int getElementsCount();

    @NotNull
    SerialKind getKind();

    @NotNull
    String getSerialName();

    @ExperimentalSerializationApi
    boolean isElementOptional(int arg1);

    boolean isInline();

    boolean isNullable();
}

