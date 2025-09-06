package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import java.io.PrintStream;
import java.util.Arrays;

public class KeyFrameArray {
    public static class CustomArray {
        public final int[] a;
        public final CustomAttribute[] b;
        public int c;

        public CustomArray() {
            this.a = new int[101];
            this.b = new CustomAttribute[101];
            this.clear();
        }

        public void append(int v, CustomAttribute customAttribute0) {
            CustomAttribute[] arr_customAttribute = this.b;
            if(arr_customAttribute[v] != null) {
                this.remove(v);
            }
            arr_customAttribute[v] = customAttribute0;
            int v1 = this.c;
            this.c = v1 + 1;
            this.a[v1] = v;
            Arrays.sort(this.a);
        }

        public void clear() {
            Arrays.fill(this.a, 999);
            Arrays.fill(this.b, null);
            this.c = 0;
        }

        public void dump() {
            PrintStream printStream0 = System.out;
            printStream0.println("V: " + Arrays.toString(Arrays.copyOf(this.a, this.c)));
            printStream0.print("K: [");
            for(int v = 0; v < this.c; ++v) {
                System.out.print((v == 0 ? "" : ", ") + this.valueAt(v));
            }
            System.out.println("]");
        }

        public int keyAt(int v) {
            return this.a[v];
        }

        public void remove(int v) {
            int v3;
            this.b[v] = null;
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                v3 = this.c;
                if(v1 >= v3) {
                    break;
                }
                int[] arr_v = this.a;
                if(v == arr_v[v1]) {
                    arr_v[v1] = 999;
                    ++v2;
                }
                if(v1 != v2) {
                    arr_v[v1] = arr_v[v2];
                }
                ++v2;
            }
            this.c = v3 - 1;
        }

        public int size() {
            return this.c;
        }

        public CustomAttribute valueAt(int v) {
            return this.b[this.a[v]];
        }
    }

    public static class CustomVar {
        public final int[] a;
        public final CustomVariable[] b;
        public int c;

        public CustomVar() {
            this.a = new int[101];
            this.b = new CustomVariable[101];
            this.clear();
        }

        public void append(int v, CustomVariable customVariable0) {
            CustomVariable[] arr_customVariable = this.b;
            if(arr_customVariable[v] != null) {
                this.remove(v);
            }
            arr_customVariable[v] = customVariable0;
            int v1 = this.c;
            this.c = v1 + 1;
            this.a[v1] = v;
            Arrays.sort(this.a);
        }

        public void clear() {
            Arrays.fill(this.a, 999);
            Arrays.fill(this.b, null);
            this.c = 0;
        }

        public void dump() {
            PrintStream printStream0 = System.out;
            printStream0.println("V: " + Arrays.toString(Arrays.copyOf(this.a, this.c)));
            printStream0.print("K: [");
            for(int v = 0; v < this.c; ++v) {
                System.out.print((v == 0 ? "" : ", ") + this.valueAt(v));
            }
            System.out.println("]");
        }

        public int keyAt(int v) {
            return this.a[v];
        }

        public void remove(int v) {
            int v3;
            this.b[v] = null;
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                v3 = this.c;
                if(v1 >= v3) {
                    break;
                }
                int[] arr_v = this.a;
                if(v == arr_v[v1]) {
                    arr_v[v1] = 999;
                    ++v2;
                }
                if(v1 != v2) {
                    arr_v[v1] = arr_v[v2];
                }
                ++v2;
            }
            this.c = v3 - 1;
        }

        public int size() {
            return this.c;
        }

        public CustomVariable valueAt(int v) {
            return this.b[this.a[v]];
        }
    }

}

