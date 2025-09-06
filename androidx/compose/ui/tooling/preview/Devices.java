package androidx.compose.ui.tooling.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b0\b\u00C7\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000B\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u000B\u0010\u0004R\u0014\u0010\f\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000E\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u000E\u0010\u0004R\u0014\u0010\u000F\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u000F\u0010\u0004R\u0014\u0010\u0010\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001A\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001A\u0010\u0004R\u0014\u0010\u001B\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001B\u0010\u0004R\u0014\u0010\u001C\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001C\u0010\u0004R\u0014\u0010\u001D\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001D\u0010\u0004R\u0014\u0010\u001E\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001E\u0010\u0004R\u0014\u0010\u001F\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001F\u0010\u0004R\u0014\u0010 \u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b \u0010\u0004R\u0014\u0010!\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b!\u0010\u0004R\u0014\u0010\"\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\"\u0010\u0004R\u001A\u0010#\u001A\u00020\u00028\u0006X\u0087T\u00A2\u0006\f\n\u0004\b#\u0010\u0004\u0012\u0004\b$\u0010%R\u001A\u0010&\u001A\u00020\u00028\u0006X\u0087T\u00A2\u0006\f\n\u0004\b&\u0010\u0004\u0012\u0004\b\'\u0010%R\u001A\u0010(\u001A\u00020\u00028\u0006X\u0087T\u00A2\u0006\f\n\u0004\b(\u0010\u0004\u0012\u0004\b)\u0010%R\u001A\u0010*\u001A\u00020\u00028\u0006X\u0087T\u00A2\u0006\f\n\u0004\b*\u0010\u0004\u0012\u0004\b+\u0010%R\u0014\u0010,\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b,\u0010\u0004R\u0014\u0010-\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b-\u0010\u0004R\u0014\u0010.\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b.\u0010\u0004R\u0014\u0010/\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b/\u0010\u0004R\u0014\u00100\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b0\u0010\u0004R\u0014\u00101\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b1\u0010\u0004\u00A8\u00062"}, d2 = {"Landroidx/compose/ui/tooling/preview/Devices;", "", "", "DEFAULT", "Ljava/lang/String;", "NEXUS_7", "NEXUS_7_2013", "NEXUS_5", "NEXUS_6", "NEXUS_9", "NEXUS_10", "NEXUS_5X", "NEXUS_6P", "PIXEL_C", "PIXEL", "PIXEL_XL", "PIXEL_2", "PIXEL_2_XL", "PIXEL_3", "PIXEL_3_XL", "PIXEL_3A", "PIXEL_3A_XL", "PIXEL_4", "PIXEL_4_XL", "PIXEL_4A", "PIXEL_5", "PIXEL_6", "PIXEL_6_PRO", "PIXEL_6A", "PIXEL_7", "PIXEL_7_PRO", "PIXEL_7A", "PIXEL_FOLD", "PIXEL_TABLET", "AUTOMOTIVE_1024p", "WEAR_OS_LARGE_ROUND", "getWEAR_OS_LARGE_ROUND$annotations", "()V", "WEAR_OS_SMALL_ROUND", "getWEAR_OS_SMALL_ROUND$annotations", "WEAR_OS_SQUARE", "getWEAR_OS_SQUARE$annotations", "WEAR_OS_RECT", "getWEAR_OS_RECT$annotations", "PHONE", "FOLDABLE", "TABLET", "DESKTOP", "TV_720p", "TV_1080p", "ui-tooling-preview_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Devices {
    public static final int $stable = 0;
    @NotNull
    public static final String AUTOMOTIVE_1024p = "id:automotive_1024p_landscape";
    @NotNull
    public static final String DEFAULT = "";
    @NotNull
    public static final String DESKTOP = "spec:id=reference_desktop,shape=Normal,width=1920,height=1080,unit=dp,dpi=160";
    @NotNull
    public static final String FOLDABLE = "spec:id=reference_foldable,shape=Normal,width=673,height=841,unit=dp,dpi=420";
    @NotNull
    public static final Devices INSTANCE = null;
    @NotNull
    public static final String NEXUS_10 = "name:Nexus 10";
    @NotNull
    public static final String NEXUS_5 = "id:Nexus 5";
    @NotNull
    public static final String NEXUS_5X = "id:Nexus 5X";
    @NotNull
    public static final String NEXUS_6 = "id:Nexus 6";
    @NotNull
    public static final String NEXUS_6P = "id:Nexus 6P";
    @NotNull
    public static final String NEXUS_7 = "id:Nexus 7";
    @NotNull
    public static final String NEXUS_7_2013 = "id:Nexus 7 2013";
    @NotNull
    public static final String NEXUS_9 = "id:Nexus 9";
    @NotNull
    public static final String PHONE = "spec:id=reference_phone,shape=Normal,width=411,height=891,unit=dp,dpi=420";
    @NotNull
    public static final String PIXEL = "id:pixel";
    @NotNull
    public static final String PIXEL_2 = "id:pixel_2";
    @NotNull
    public static final String PIXEL_2_XL = "id:pixel_2_xl";
    @NotNull
    public static final String PIXEL_3 = "id:pixel_3";
    @NotNull
    public static final String PIXEL_3A = "id:pixel_3a";
    @NotNull
    public static final String PIXEL_3A_XL = "id:pixel_3a_xl";
    @NotNull
    public static final String PIXEL_3_XL = "id:pixel_3_xl";
    @NotNull
    public static final String PIXEL_4 = "id:pixel_4";
    @NotNull
    public static final String PIXEL_4A = "id:pixel_4a";
    @NotNull
    public static final String PIXEL_4_XL = "id:pixel_4_xl";
    @NotNull
    public static final String PIXEL_5 = "id:pixel_5";
    @NotNull
    public static final String PIXEL_6 = "id:pixel_6";
    @NotNull
    public static final String PIXEL_6A = "id:pixel_6a";
    @NotNull
    public static final String PIXEL_6_PRO = "id:pixel_6_pro";
    @NotNull
    public static final String PIXEL_7 = "id:pixel_7";
    @NotNull
    public static final String PIXEL_7A = "id:pixel_7a";
    @NotNull
    public static final String PIXEL_7_PRO = "id:pixel_7_pro";
    @NotNull
    public static final String PIXEL_C = "id:pixel_c";
    @NotNull
    public static final String PIXEL_FOLD = "id:pixel_fold";
    @NotNull
    public static final String PIXEL_TABLET = "id:pixel_tablet";
    @NotNull
    public static final String PIXEL_XL = "id:pixel_xl";
    @NotNull
    public static final String TABLET = "spec:id=reference_tablet,shape=Normal,width=1280,height=800,unit=dp,dpi=240";
    @NotNull
    public static final String TV_1080p = "spec:shape=Normal,width=1920,height=1080,unit=dp,dpi=420";
    @NotNull
    public static final String TV_720p = "spec:shape=Normal,width=1280,height=720,unit=dp,dpi=420";
    @NotNull
    public static final String WEAR_OS_LARGE_ROUND = "id:wearos_large_round";
    @NotNull
    public static final String WEAR_OS_RECT = "id:wearos_rect";
    @NotNull
    public static final String WEAR_OS_SMALL_ROUND = "id:wearos_small_round";
    @NotNull
    public static final String WEAR_OS_SQUARE = "id:wearos_square";

    static {
        Devices.INSTANCE = new Devices();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Deprecated(message = "Use [androidx.wear.tooling.preview.devices.WearDevices.LARGE_ROUND] from the wear:wear-tooling-preview library instead")
    public static void getWEAR_OS_LARGE_ROUND$annotations() {
    }

    @Deprecated(message = "Use [androidx.wear.tooling.preview.devices.WearDevices.RECT] from the wear:wear-tooling-preview library instead")
    public static void getWEAR_OS_RECT$annotations() {
    }

    @Deprecated(message = "Use [androidx.wear.tooling.preview.devices.WearDevices.SMALL_ROUND] from the wear:wear-tooling-preview library instead")
    public static void getWEAR_OS_SMALL_ROUND$annotations() {
    }

    @Deprecated(message = "Use [androidx.wear.tooling.preview.devices.WearDevices.SQUARE] from the wear:wear-tooling-preview library instead")
    public static void getWEAR_OS_SQUARE$annotations() {
    }
}

