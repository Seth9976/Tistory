package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

public final class b implements NativeSessionFile {
    public final byte[] a;

    public b(byte[] arr_b) {
        this.a = arr_b;
    }

    @Override  // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public final File asFilePayload() {
        byte[] arr_b = this.a;
        if(arr_b != null && arr_b.length != 0) {
            try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(); GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(byteArrayOutputStream0)) {
                gZIPOutputStream0.write(arr_b);
                gZIPOutputStream0.finish();
                byte[] arr_b1 = byteArrayOutputStream0.toByteArray();
                return arr_b1 == null ? null : File.builder().setContents(arr_b1).setFilename("logs_file").build();
            }
            catch(IOException unused_ex) {
            }
        }
        return null;
    }

    @Override  // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public final String getReportsEndpointFilename() {
        return "logs";
    }

    @Override  // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public final InputStream getStream() {
        byte[] arr_b = this.a;
        return arr_b != null && arr_b.length != 0 ? new ByteArrayInputStream(arr_b) : null;
    }
}

