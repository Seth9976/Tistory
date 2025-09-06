package androidx.core.provider;

import a5.b;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.compose.ui.text.android.j;
import androidx.core.content.res.FontResourcesParserCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class g {
    public static final j a;

    static {
        g.a = new j(1);
    }

    public static FontFamilyResult a(Context context0, CancellationSignal cancellationSignal0, FontRequest fontRequest0) {
        Cursor cursor0;
        ProviderInfo providerInfo0 = g.b(context0.getPackageManager(), fontRequest0, context0.getResources());
        if(providerInfo0 == null) {
            return new FontFamilyResult(1, null);
        }
        String s = providerInfo0.authority;
        ArrayList arrayList0 = new ArrayList();
        Uri uri0 = new Uri.Builder().scheme("content").authority(s).build();
        Uri uri1 = new Uri.Builder().scheme("content").authority(s).appendPath("file").build();
        FontProvider.ContentQueryWrapper fontProvider$ContentQueryWrapper0 = FontProvider.ContentQueryWrapper.make(context0, uri0);
        try {
            cursor0 = fontProvider$ContentQueryWrapper0.query(uri0, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{fontRequest0.getQuery()}, null, cancellationSignal0);
            if(cursor0 != null && cursor0.getCount() > 0) {
                int v1 = cursor0.getColumnIndex("result_code");
                ArrayList arrayList1 = new ArrayList();
                int v2 = cursor0.getColumnIndex("_id");
                int v3 = cursor0.getColumnIndex("file_id");
                int v4 = cursor0.getColumnIndex("font_ttc_index");
                int v5 = cursor0.getColumnIndex("font_weight");
                int v6 = cursor0.getColumnIndex("font_italic");
                while(cursor0.moveToNext()) {
                    int v7 = v1 == -1 ? 0 : cursor0.getInt(v1);
                    int v8 = v4 == -1 ? 0 : cursor0.getInt(v4);
                    arrayList1.add(new FontInfo((v3 == -1 ? ContentUris.withAppendedId(uri0, cursor0.getLong(v2)) : ContentUris.withAppendedId(uri1, cursor0.getLong(v3))), v8, (v5 == -1 ? 400 : cursor0.getInt(v5)), v6 != -1 && cursor0.getInt(v6) == 1, v7));
                }
                arrayList0 = arrayList1;
            }
        }
        finally {
            if(cursor0 != null) {
                cursor0.close();
            }
            fontProvider$ContentQueryWrapper0.close();
        }
        return new FontFamilyResult(0, ((FontInfo[])arrayList0.toArray(new FontInfo[0])));
    }

    public static ProviderInfo b(PackageManager packageManager0, FontRequest fontRequest0, Resources resources0) {
        String s = fontRequest0.getProviderAuthority();
        ProviderInfo providerInfo0 = packageManager0.resolveContentProvider(s, 0);
        if(providerInfo0 == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + s);
        }
        if(providerInfo0.packageName.equals(fontRequest0.getProviderPackage())) {
            Signature[] arr_signature = packageManager0.getPackageInfo(providerInfo0.packageName, 0x40).signatures;
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < arr_signature.length; ++v) {
                arrayList0.add(arr_signature[v].toByteArray());
            }
            j j0 = g.a;
            Collections.sort(arrayList0, j0);
            List list0 = fontRequest0.getCertificates() == null ? FontResourcesParserCompat.readCerts(resources0, fontRequest0.getCertificatesArrayResId()) : fontRequest0.getCertificates();
        alab1:
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                ArrayList arrayList1 = new ArrayList(((Collection)list0.get(v1)));
                Collections.sort(arrayList1, j0);
                if(arrayList0.size() == arrayList1.size()) {
                    int v2 = 0;
                    while(v2 < arrayList0.size()) {
                        if(!Arrays.equals(((byte[])arrayList0.get(v2)), ((byte[])arrayList1.get(v2)))) {
                            continue alab1;
                        }
                        ++v2;
                    }
                    return providerInfo0;
                }
            }
            return null;
        }
        StringBuilder stringBuilder0 = b.v("Found content provider ", s, ", but package was not ");
        stringBuilder0.append(fontRequest0.getProviderPackage());
        throw new PackageManager.NameNotFoundException(stringBuilder0.toString());
    }
}

