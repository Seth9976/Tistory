package a;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.IntSize;
import com.kakao.kandinsky.utils.MatrixValues;
import kotlin.jvm.internal.Reflection;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuilder;

public abstract class o2 {
    public static final SerializersModule a;
    public static final Json b;

    static {
        SerializersModuleBuilder serializersModuleBuilder0 = new SerializersModuleBuilder();
        serializersModuleBuilder0.contextual(Reflection.getOrCreateKotlinClass(IntSize.class), c.a);
        serializersModuleBuilder0.contextual(Reflection.getOrCreateKotlinClass(Size.class), p2.a);
        serializersModuleBuilder0.contextual(Reflection.getOrCreateKotlinClass(Color.class), a.a);
        serializersModuleBuilder0.contextual(Reflection.getOrCreateKotlinClass(TextAlign.class), q2.a);
        serializersModuleBuilder0.contextual(Reflection.getOrCreateKotlinClass(Offset.class), m2.a);
        serializersModuleBuilder0.contextual(Reflection.getOrCreateKotlinClass(PersistentList.class), b.a);
        serializersModuleBuilder0.contextual(Reflection.getOrCreateKotlinClass(MatrixValues.class), l2.a);
        o2.a = serializersModuleBuilder0.build();
        o2.b = JsonKt.Json$default(null, n2.a, 1, null);
    }
}

