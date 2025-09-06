package b2;

import androidx.compose.ui.node.MyersDiffKt;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class i {
    public int a;
    public Object b;

    public i(int v) {
        this.b = new int[v];
    }

    public i(Object object0, int v) {
        this.b = object0;
        this.a = v;
        super();
    }

    public void a(int v, int v1, int v2) {
        int v3 = this.a;
        int[] arr_v = (int[])this.b;
        if(v3 + 3 >= arr_v.length) {
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length * 2);
            Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(this, newSize)");
            this.b = arr_v1;
        }
        int[] arr_v2 = (int[])this.b;
        arr_v2[v3] = v + v2;
        arr_v2[v3 + 1] = v1 + v2;
        arr_v2[v3 + 2] = v2;
        this.a = v3 + 3;
    }

    public void b(int v, int v1, int v2, int v3) {
        int v4 = this.a;
        int[] arr_v = (int[])this.b;
        if(v4 + 4 >= arr_v.length) {
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length * 2);
            Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(this, newSize)");
            this.b = arr_v1;
        }
        int[] arr_v2 = (int[])this.b;
        arr_v2[v4] = v;
        arr_v2[v4 + 1] = v1;
        arr_v2[v4 + 2] = v2;
        arr_v2[v4 + 3] = v3;
        this.a = v4 + 4;
    }

    public void c(int v, int v1) {
        if(v < v1) {
            int v2 = v - 3;
            for(int v3 = v; v3 < v1; v3 += 3) {
                int[] arr_v = (int[])this.b;
                int v4 = arr_v[v3];
                int v5 = arr_v[v1];
                if(v4 < v5 || v4 == v5 && arr_v[v3 + 1] <= arr_v[v1 + 1]) {
                    MyersDiffKt.access$swap(arr_v, v2 + 3, v3);
                    MyersDiffKt.access$swap(arr_v, v2 + 4, v3 + 1);
                    MyersDiffKt.access$swap(arr_v, v2 + 5, v3 + 2);
                    v2 += 3;
                }
            }
            int[] arr_v1 = (int[])this.b;
            MyersDiffKt.access$swap(arr_v1, v2 + 3, v1);
            MyersDiffKt.access$swap(arr_v1, v2 + 4, v1 + 1);
            MyersDiffKt.access$swap(arr_v1, v2 + 5, v1 + 2);
            this.c(v, v2);
            this.c(v2 + 6, v1);
        }
    }
}

