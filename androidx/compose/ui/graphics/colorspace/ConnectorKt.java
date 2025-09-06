package androidx.compose.ui.graphics.colorspace;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A+\u0010\u0007\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0004\u001A\u00020\u0003H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000F"}, d2 = {"", "src", "dst", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "renderIntent", "connectorKey-YBCOT_4", "(III)I", "connectorKey", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "a", "Landroidx/collection/MutableIntObjectMap;", "getConnectors", "()Landroidx/collection/MutableIntObjectMap;", "Connectors", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/ConnectorKt\n*L\n1#1,349:1\n347#1:350\n347#1:351\n347#1:352\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/ConnectorKt\n*L\n336#1:350\n338#1:351\n340#1:352\n*E\n"})
public final class ConnectorKt {
    public static final MutableIntObjectMap a;

    // 去混淆评级： 低(20)
    static {
        Connector connector0 = Connector.Companion.identity$ui_graphics_release(ColorSpaces.INSTANCE.getSrgb());
        Connector connector1 = new Connector(ColorSpaces.INSTANCE.getSrgb(), ColorSpaces.INSTANCE.getOklab(), 0, null);
        Connector connector2 = new Connector(ColorSpaces.INSTANCE.getOklab(), ColorSpaces.INSTANCE.getSrgb(), 0, null);
        ConnectorKt.a = IntObjectMapKt.mutableIntObjectMapOf(ColorSpaces.INSTANCE.getSrgb().getId$ui_graphics_release() | ColorSpaces.INSTANCE.getSrgb().getId$ui_graphics_release() << 6, connector0, ColorSpaces.INSTANCE.getSrgb().getId$ui_graphics_release() | ColorSpaces.INSTANCE.getOklab().getId$ui_graphics_release() << 6, connector1, ColorSpaces.INSTANCE.getOklab().getId$ui_graphics_release() | ColorSpaces.INSTANCE.getSrgb().getId$ui_graphics_release() << 6, connector2);
    }

    public static final int connectorKey-YBCOT_4(int v, int v1, int v2) {
        return v | v1 << 6 | v2 << 12;
    }

    @NotNull
    public static final MutableIntObjectMap getConnectors() {
        return ConnectorKt.a;
    }
}

