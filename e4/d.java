package e4;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import wb.a;

public final class d {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public d(long v, byte[] arr_b, int v1, int v2) {
        this.a = v1;
        this.b = v2;
        this.c = v;
        this.d = arr_b;
    }

    public d(byte[] arr_b, int v, int v1) {
        this(-1L, arr_b, v, v1);
    }

    public static d a(String s) {
        byte[] arr_b = (s + "\u0000").getBytes(ExifInterface.d0);
        return new d(arr_b, 2, arr_b.length);
    }

    public static d b(long v, ByteOrder byteOrder0) {
        return d.c(new long[]{v}, byteOrder0);
    }

    public static d c(long[] arr_v, ByteOrder byteOrder0) {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[ExifInterface.U[4] * arr_v.length]);
        byteBuffer0.order(byteOrder0);
        for(int v = 0; v < arr_v.length; ++v) {
            byteBuffer0.putInt(((int)arr_v[v]));
        }
        return new d(byteBuffer0.array(), 4, arr_v.length);
    }

    public static d d(f[] arr_f, ByteOrder byteOrder0) {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[ExifInterface.U[5] * arr_f.length]);
        byteBuffer0.order(byteOrder0);
        for(int v = 0; v < arr_f.length; ++v) {
            f f0 = arr_f[v];
            byteBuffer0.putInt(((int)f0.a));
            byteBuffer0.putInt(((int)f0.b));
        }
        return new d(byteBuffer0.array(), 5, arr_f.length);
    }

    public static d e(int v, ByteOrder byteOrder0) {
        return d.f(new int[]{v}, byteOrder0);
    }

    public static d f(int[] arr_v, ByteOrder byteOrder0) {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[ExifInterface.U[3] * arr_v.length]);
        byteBuffer0.order(byteOrder0);
        for(int v = 0; v < arr_v.length; ++v) {
            byteBuffer0.putShort(((short)arr_v[v]));
        }
        return new d(byteBuffer0.array(), 3, arr_v.length);
    }

    public final double g(ByteOrder byteOrder0) {
        Serializable serializable0 = this.j(byteOrder0);
        if(serializable0 == null) {
            throw new NumberFormatException("NULL can\'t be converted to a double value");
        }
        if(serializable0 instanceof String) {
            return Double.parseDouble(((String)serializable0));
        }
        if(serializable0 instanceof long[]) {
            if(((long[])serializable0).length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            return (double)((long[])serializable0)[0];
        }
        if(serializable0 instanceof int[]) {
            if(((int[])serializable0).length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            return (double)((int[])serializable0)[0];
        }
        if(serializable0 instanceof double[]) {
            if(((double[])serializable0).length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            return ((double[])serializable0)[0];
        }
        if(!(serializable0 instanceof f[])) {
            throw new NumberFormatException("Couldn\'t find a double value");
        }
        if(((f[])serializable0).length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        return ((double)((f[])serializable0)[0].a) / ((double)((f[])serializable0)[0].b);
    }

    public final int h(ByteOrder byteOrder0) {
        Serializable serializable0 = this.j(byteOrder0);
        if(serializable0 == null) {
            throw new NumberFormatException("NULL can\'t be converted to a integer value");
        }
        if(serializable0 instanceof String) {
            return Integer.parseInt(((String)serializable0));
        }
        if(serializable0 instanceof long[]) {
            if(((long[])serializable0).length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            return (int)((long[])serializable0)[0];
        }
        if(!(serializable0 instanceof int[])) {
            throw new NumberFormatException("Couldn\'t find a integer value");
        }
        if(((int[])serializable0).length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        return ((int[])serializable0)[0];
    }

    public final String i(ByteOrder byteOrder0) {
        Serializable serializable0 = this.j(byteOrder0);
        if(serializable0 == null) {
            return null;
        }
        if(serializable0 instanceof String) {
            return (String)serializable0;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = 0;
        if(serializable0 instanceof long[]) {
            while(v < ((long[])serializable0).length) {
                stringBuilder0.append(((long[])serializable0)[v]);
                ++v;
                if(v != ((long[])serializable0).length) {
                    stringBuilder0.append(",");
                }
            }
            return stringBuilder0.toString();
        }
        if(serializable0 instanceof int[]) {
            while(v < ((int[])serializable0).length) {
                stringBuilder0.append(((int[])serializable0)[v]);
                ++v;
                if(v != ((int[])serializable0).length) {
                    stringBuilder0.append(",");
                }
            }
            return stringBuilder0.toString();
        }
        if(serializable0 instanceof double[]) {
            while(v < ((double[])serializable0).length) {
                stringBuilder0.append(((double[])serializable0)[v]);
                ++v;
                if(v != ((double[])serializable0).length) {
                    stringBuilder0.append(",");
                }
            }
            return stringBuilder0.toString();
        }
        if(serializable0 instanceof f[]) {
            while(v < ((f[])serializable0).length) {
                stringBuilder0.append(((f[])serializable0)[v].a);
                stringBuilder0.append('/');
                stringBuilder0.append(((f[])serializable0)[v].b);
                ++v;
                if(v != ((f[])serializable0).length) {
                    stringBuilder0.append(",");
                }
            }
            return stringBuilder0.toString();
        }
        return null;
    }

    public final Serializable j(ByteOrder byteOrder0) {
        Serializable serializable10;
        Serializable serializable9;
        Serializable serializable8;
        Serializable serializable7;
        Serializable serializable6;
        Serializable serializable5;
        Serializable serializable4;
        Serializable serializable3;
        Serializable serializable2;
        Serializable serializable1;
        Serializable serializable0;
        int v1;
        b b1;
        b b0;
        byte[] arr_b;
        int v = 0;
        try {
            arr_b = this.d;
            b0 = null;
            b1 = null;
            b1 = new b(arr_b);
            goto label_8;
        }
        catch(IOException iOException0) {
            goto label_132;
        }
        catch(Throwable throwable0) {
        }
        goto label_141;
        try {
        label_8:
            b1.c = byteOrder0;
            v1 = this.b;
            switch(this.a) {
                case 3: {
                    goto label_56;
                }
                case 4: {
                    goto label_66;
                }
                case 5: {
                    goto label_76;
                }
                case 1: 
                case 6: {
                    goto label_16;
                }
                case 2: 
                case 7: {
                    goto label_31;
                }
                case 8: {
                    goto label_86;
                }
                case 9: {
                    goto label_96;
                }
                case 10: {
                    goto label_106;
                }
                case 11: {
                    goto label_116;
                }
                case 12: {
                    goto label_126;
                }
            }
        }
        catch(IOException iOException0) {
            goto label_132;
        }
        catch(Throwable throwable0) {
            goto label_140;
        }
        try {
            b1.close();
        }
        catch(IOException iOException1) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException1);
        }
        return null;
        try {
        label_16:
            if(arr_b.length == 1) {
                int v2 = arr_b[0];
                if(v2 >= 0 && v2 <= 1) {
                    serializable0 = new String(new char[]{((char)(v2 + 0x30))});
                    goto label_20;
                }
            }
            goto label_25;
        }
        catch(IOException iOException0) {
            goto label_132;
        }
        catch(Throwable throwable0) {
            goto label_140;
        }
        try {
        label_20:
            b1.close();
        }
        catch(IOException iOException2) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException2);
        }
        return serializable0;
        try {
        label_25:
            serializable1 = new String(arr_b, ExifInterface.d0);
        }
        catch(IOException iOException0) {
            goto label_132;
        }
        catch(Throwable throwable0) {
            goto label_140;
        }
        try {
            b1.close();
        }
        catch(IOException iOException3) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException3);
        }
        return serializable1;
        try {
        label_31:
            if(v1 >= ExifInterface.V.length) {
                for(int v3 = 0; true; ++v3) {
                    byte[] arr_b1 = ExifInterface.V;
                    if(v3 >= arr_b1.length) {
                        v = arr_b1.length;
                        break;
                    }
                    if(arr_b[v3] != arr_b1[v3]) {
                        break;
                    }
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            while(v < v1) {
                int v4 = arr_b[v];
                if(v4 == 0) {
                    break;
                }
                if(v4 >= 0x20) {
                    stringBuilder0.append(((char)v4));
                }
                else {
                    stringBuilder0.append('?');
                }
                ++v;
            }
            serializable2 = stringBuilder0.toString();
        }
        catch(IOException iOException0) {
            goto label_132;
        }
        catch(Throwable throwable0) {
            goto label_140;
        }
        try {
            b1.close();
        }
        catch(IOException iOException4) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException4);
        }
        return serializable2;
        try {
        label_56:
            serializable3 = new int[v1];
            while(v < v1) {
                serializable3[v] = b1.readUnsignedShort();
                ++v;
            }
        }
        catch(IOException iOException0) {
            goto label_132;
        }
        catch(Throwable throwable0) {
            goto label_140;
        }
        try {
            b1.close();
        }
        catch(IOException iOException5) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException5);
        }
        return serializable3;
        try {
        label_66:
            serializable4 = new long[v1];
            while(v < v1) {
                serializable4[v] = ((long)b1.readInt()) & 0xFFFFFFFFL;
                ++v;
            }
        }
        catch(IOException iOException0) {
            goto label_132;
        }
        catch(Throwable throwable0) {
            goto label_140;
        }
        try {
            b1.close();
        }
        catch(IOException iOException6) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException6);
        }
        return serializable4;
        try {
        label_76:
            serializable5 = new f[v1];
            while(v < v1) {
                serializable5[v] = new f(((long)b1.readInt()) & 0xFFFFFFFFL, ((long)b1.readInt()) & 0xFFFFFFFFL);
                ++v;
            }
        }
        catch(IOException iOException0) {
            goto label_132;
        }
        catch(Throwable throwable0) {
            goto label_140;
        }
        try {
            b1.close();
        }
        catch(IOException iOException7) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException7);
        }
        return serializable5;
        try {
        label_86:
            serializable6 = new int[v1];
            while(v < v1) {
                serializable6[v] = b1.readShort();
                ++v;
            }
        }
        catch(IOException iOException0) {
            goto label_132;
        }
        catch(Throwable throwable0) {
            goto label_140;
        }
        try {
            b1.close();
        }
        catch(IOException iOException8) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException8);
        }
        return serializable6;
        try {
        label_96:
            serializable7 = new int[v1];
            while(v < v1) {
                serializable7[v] = b1.readInt();
                ++v;
            }
        }
        catch(IOException iOException0) {
            goto label_132;
        }
        catch(Throwable throwable0) {
            goto label_140;
        }
        try {
            b1.close();
        }
        catch(IOException iOException9) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException9);
        }
        return serializable7;
        try {
        label_106:
            serializable8 = new f[v1];
            while(v < v1) {
                serializable8[v] = new f(((long)b1.readInt()), ((long)b1.readInt()));
                ++v;
            }
        }
        catch(IOException iOException0) {
            goto label_132;
        }
        catch(Throwable throwable0) {
            goto label_140;
        }
        try {
            b1.close();
        }
        catch(IOException iOException10) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException10);
        }
        return serializable8;
        try {
        label_116:
            serializable9 = new double[v1];
            while(v < v1) {
                serializable9[v] = (double)b1.readFloat();
                ++v;
            }
        }
        catch(IOException iOException0) {
            goto label_132;
        }
        catch(Throwable throwable0) {
            goto label_140;
        }
        try {
            b1.close();
        }
        catch(IOException iOException11) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException11);
        }
        return serializable9;
        try {
            try {
            label_126:
                serializable10 = new double[v1];
                while(true) {
                    if(v >= v1) {
                        goto label_147;
                    }
                    serializable10[v] = b1.readDouble();
                    ++v;
                }
            }
            catch(IOException iOException0) {
            }
        label_132:
            Log.w("ExifInterface", "IOException occurred during reading a value", iOException0);
            if(b1 != null) {
                goto label_134;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_140;
        }
        try {
        label_134:
            b1.close();
            return null;
        }
        catch(IOException iOException12) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException12);
        }
        return null;
    label_140:
        b0 = b1;
    label_141:
        if(b0 != null) {
            try {
                b0.close();
            }
            catch(IOException iOException13) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException13);
            }
        }
        throw throwable0;
        try {
        label_147:
            b1.close();
        }
        catch(IOException iOException14) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException14);
        }
        return serializable10;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("(");
        stringBuilder0.append(ExifInterface.T[this.a]);
        stringBuilder0.append(", data length:");
        return a.c(this.d.length, ")", stringBuilder0);
    }
}

