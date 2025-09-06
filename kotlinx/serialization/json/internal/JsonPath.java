package kotlinx.serialization.json.internal;

import java.util.Arrays;
import jg.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000E\u001A\u00020\u00062\b\u0010\r\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0010\u001A\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0003J\r\u0010\u0011\u001A\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003J\r\u0010\u0013\u001A\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Lkotlinx/serialization/json/internal/JsonPath;", "", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "sd", "", "pushDescriptor", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "updateDescriptorIndex", "(I)V", "key", "updateCurrentMapKey", "(Ljava/lang/Object;)V", "resetCurrentMapKey", "popDescriptor", "", "getPath", "()Ljava/lang/String;", "toString", "jg/c", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class JsonPath {
    public Object[] a;
    public int[] b;
    public int c;

    public JsonPath() {
        this.a = new Object[8];
        int[] arr_v = new int[8];
        for(int v = 0; v < 8; ++v) {
            arr_v[v] = -1;
        }
        this.b = arr_v;
        this.c = -1;
    }

    @NotNull
    public final String getPath() [...] // 潜在的解密器

    public final void popDescriptor() {
        int v = this.c;
        int[] arr_v = this.b;
        if(arr_v[v] == -2) {
            arr_v[v] = -1;
            this.c = v - 1;
        }
        int v1 = this.c;
        if(v1 != -1) {
            this.c = v1 - 1;
        }
    }

    public final void pushDescriptor(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "sd");
        int v = this.c + 1;
        this.c = v;
        Object[] arr_object = this.a;
        if(v == arr_object.length) {
            Object[] arr_object1 = Arrays.copyOf(arr_object, v * 2);
            Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(...)");
            this.a = arr_object1;
            int[] arr_v = Arrays.copyOf(this.b, v * 2);
            Intrinsics.checkNotNullExpressionValue(arr_v, "copyOf(...)");
            this.b = arr_v;
        }
        this.a[v] = serialDescriptor0;
    }

    public final void resetCurrentMapKey() {
        int v = this.c;
        if(this.b[v] == -2) {
            this.a[v] = c.a;
        }
    }

    // 去混淆评级： 低(20)
    @Override
    @NotNull
    public String toString() {
        return "$";
    }

    public final void updateCurrentMapKey(@Nullable Object object0) {
        int v = this.c;
        if(this.b[v] != -2) {
            this.c = v + 1;
            Object[] arr_object = this.a;
            if(v + 1 == arr_object.length) {
                int v1 = (v + 1) * 2;
                Object[] arr_object1 = Arrays.copyOf(arr_object, v1);
                Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(...)");
                this.a = arr_object1;
                int[] arr_v = Arrays.copyOf(this.b, v1);
                Intrinsics.checkNotNullExpressionValue(arr_v, "copyOf(...)");
                this.b = arr_v;
            }
        }
        int v2 = this.c;
        this.a[v2] = object0;
        this.b[v2] = -2;
    }

    public final void updateDescriptorIndex(int v) {
        this.b[this.c] = v;
    }
}

