package com.google.firebase.crashlytics.internal.common;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

public final class s implements NativeSessionFile {
    public final File a;
    public final String b;
    public final String c;

    public s(String s, String s1, File file0) {
        this.b = s;
        this.c = s1;
        this.a = file0;
    }

    @Override  // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File asFilePayload() {
        try {
            byte[] arr_b = new byte[0x2000];
            try(InputStream inputStream0 = this.getStream(); ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(); GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(byteArrayOutputStream0)) {
                if(inputStream0 != null) {
                    int v;
                    while((v = inputStream0.read(arr_b)) > 0) {
                        gZIPOutputStream0.write(arr_b, 0, v);
                    }
                    gZIPOutputStream0.finish();
                    byte[] arr_b1 = byteArrayOutputStream0.toByteArray();
                    return arr_b1 == null ? null : com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.builder().setContents(arr_b1).setFilename(this.b).build();
                }
            }
        }
        catch(IOException unused_ex) {
        }
        return null;
    }

    @Override  // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public final String getReportsEndpointFilename() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public final InputStream getStream() {
        File file0 = this.a;
        if(file0.exists() && file0.isFile()) {
            try {
                return new FileInputStream(file0);
            }
            catch(FileNotFoundException unused_ex) {
            }
        }
        return null;
    }
}

