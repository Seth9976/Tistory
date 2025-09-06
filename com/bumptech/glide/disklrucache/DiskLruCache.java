package com.bumptech.glide.disklrucache;

import a6.b;
import a6.d;
import a6.e;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class DiskLruCache implements Closeable {
    public final class Editor {
        public final a a;
        public final boolean[] b;
        public boolean c;
        public final DiskLruCache d;

        public Editor(a a0) {
            this.a = a0;
            this.b = a0.e ? null : new boolean[diskLruCache0.g];
        }

        public void abort() throws IOException {
            DiskLruCache.b(this.d, this, false);
        }

        public void abortUnlessCommitted() {
            if(!this.c) {
                try {
                    this.abort();
                }
                catch(IOException unused_ex) {
                }
            }
        }

        public void commit() throws IOException {
            DiskLruCache.b(this.d, this, true);
            this.c = true;
        }

        public File getFile(int v) throws IOException {
            synchronized(this.d) {
                a a0 = this.a;
                if(a0.f == this) {
                    if(!a0.e) {
                        this.b[v] = true;
                    }
                    File file0 = a0.d[v];
                    this.d.a.mkdirs();
                    return file0;
                }
            }
            throw new IllegalStateException();
        }

        public String getString(int v) throws IOException {
            synchronized(this.d) {
                a a0 = this.a;
                if(a0.f == this) {
                    if(!a0.e) {
                        return null;
                    }
                    try {
                        FileInputStream fileInputStream0 = new FileInputStream(this.a.c[v]);
                        return fileInputStream0 == null ? null : DiskLruCache.a(fileInputStream0);
                    }
                    catch(FileNotFoundException unused_ex) {
                        return null;
                    }
                }
            }
            throw new IllegalStateException();
        }

        public void set(int v, String s) throws IOException {
            OutputStreamWriter outputStreamWriter0 = null;
            try {
                outputStreamWriter0 = new OutputStreamWriter(new FileOutputStream(this.getFile(v)), e.b);
                outputStreamWriter0.write(s);
            }
            catch(Throwable throwable0) {
                if(outputStreamWriter0 == null) {
                    throw throwable0;
                }
                try {
                    outputStreamWriter0.close();
                    throw throwable0;
                }
                catch(RuntimeException runtimeException0) {
                }
                catch(Exception unused_ex) {
                    throw throwable0;
                }
                throw runtimeException0;
            }
            try {
                outputStreamWriter0.close();
            }
            catch(RuntimeException runtimeException1) {
                throw runtimeException1;
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public final class Value {
        public final String a;
        public final long b;
        public final long[] c;
        public final File[] d;
        public final DiskLruCache e;

        public Value(String s, long v, File[] arr_file, long[] arr_v) {
            this.a = s;
            this.b = v;
            this.d = arr_file;
            this.c = arr_v;
        }

        public Editor edit() throws IOException {
            return this.e.e(this.b, this.a);
        }

        public File getFile(int v) {
            return this.d[v];
        }

        public long getLength(int v) {
            return this.c[v];
        }

        public String getString(int v) throws IOException {
            return DiskLruCache.a(new FileInputStream(this.d[v]));
        }
    }

    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final int e;
    public long f;
    public final int g;
    public long h;
    public BufferedWriter i;
    public final LinkedHashMap j;
    public int k;
    public long l;
    public final ThreadPoolExecutor m;
    public final a6.a n;

    public DiskLruCache(File file0, int v, int v1, long v2) {
        this.h = 0L;
        this.j = new LinkedHashMap(0, 0.75f, true);
        this.l = 0L;
        this.m = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());  // 初始化器: Ljava/lang/Object;-><init>()V
        this.n = new a6.a(this, 0);
        this.a = file0;
        this.e = v;
        this.b = new File(file0, "journal");
        this.c = new File(file0, "journal.tmp");
        this.d = new File(file0, "journal.bkp");
        this.g = v1;
        this.f = v2;
    }

    public static String a(FileInputStream fileInputStream0) {
        try(InputStreamReader inputStreamReader0 = new InputStreamReader(fileInputStream0, e.b)) {
            StringWriter stringWriter0 = new StringWriter();
            char[] arr_c = new char[0x400];
            int v;
            while((v = inputStreamReader0.read(arr_c)) != -1) {
                stringWriter0.write(arr_c, 0, v);
            }
            return stringWriter0.toString();
        }
    }

    public static void b(DiskLruCache diskLruCache0, Editor diskLruCache$Editor0, boolean z) {
        synchronized(diskLruCache0) {
            a a0 = diskLruCache$Editor0.a;
            if(a0.f == diskLruCache$Editor0) {
                if(z && !a0.e) {
                    int v2 = 0;
                    while(v2 < diskLruCache0.g) {
                        if(diskLruCache$Editor0.b[v2]) {
                            if(!a0.d[v2].exists()) {
                                diskLruCache$Editor0.abort();
                                return;
                            }
                            ++v2;
                            continue;
                        }
                        diskLruCache$Editor0.abort();
                        throw new IllegalStateException("Newly created entry didn\'t create value for index " + v2);
                    }
                }
                for(int v1 = 0; v1 < diskLruCache0.g; ++v1) {
                    File file0 = a0.d[v1];
                    if(!z) {
                        DiskLruCache.d(file0);
                    }
                    else if(file0.exists()) {
                        File file1 = a0.c[v1];
                        file0.renameTo(file1);
                        long v3 = a0.b[v1];
                        long v4 = file1.length();
                        a0.b[v1] = v4;
                        diskLruCache0.h = diskLruCache0.h - v3 + v4;
                    }
                }
                ++diskLruCache0.k;
                a0.f = null;
                if((a0.e | z) == 0) {
                    diskLruCache0.j.remove(a0.a);
                    diskLruCache0.i.append("REMOVE");
                    diskLruCache0.i.append(' ');
                    diskLruCache0.i.append(a0.a);
                    diskLruCache0.i.append('\n');
                }
                else {
                    a0.e = true;
                    diskLruCache0.i.append("CLEAN");
                    diskLruCache0.i.append(' ');
                    diskLruCache0.i.append(a0.a);
                    diskLruCache0.i.append(a0.a());
                    diskLruCache0.i.append('\n');
                    if(z) {
                        long v5 = diskLruCache0.l;
                        diskLruCache0.l = v5 + 1L;
                        a0.g = v5;
                    }
                }
                DiskLruCache.f(diskLruCache0.i);
                if(diskLruCache0.h > diskLruCache0.f || diskLruCache0.g()) {
                    diskLruCache0.m.submit(diskLruCache0.n);
                }
                return;
            }
        }
        throw new IllegalStateException();
    }

    public static void c(BufferedWriter bufferedWriter0) {
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(strictMode$ThreadPolicy0).permitUnbufferedIo().build());
        try {
            bufferedWriter0.close();
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
    }

    @Override
    public void close() throws IOException {
        synchronized(this) {
            if(this.i == null) {
                return;
            }
            for(Object object0: new ArrayList(this.j.values())) {
                Editor diskLruCache$Editor0 = ((a)object0).f;
                if(diskLruCache$Editor0 != null) {
                    diskLruCache$Editor0.abort();
                }
            }
            this.m();
            DiskLruCache.c(this.i);
            this.i = null;
        }
    }

    public static void d(File file0) {
        if(file0.exists() && !file0.delete()) {
            throw new IOException();
        }
    }

    public void delete() throws IOException {
        this.close();
        e.a(this.a);
    }

    public final Editor e(long v, String s) {
        synchronized(this) {
            if(this.i != null) {
                a a0 = (a)this.j.get(s);
                if(Long.compare(v, -1L) != 0 && (a0 == null || a0.g != v)) {
                    return null;
                }
                if(a0 == null) {
                    a0 = new a(this, s);
                    this.j.put(s, a0);
                }
                else if(a0.f != null) {
                    return null;
                }
                Editor diskLruCache$Editor0 = new Editor(this, a0);
                a0.f = diskLruCache$Editor0;
                this.i.append("DIRTY");
                this.i.append(' ');
                this.i.append(s);
                this.i.append('\n');
                DiskLruCache.f(this.i);
                return diskLruCache$Editor0;
            }
        }
        throw new IllegalStateException("cache is closed");
    }

    public Editor edit(String s) throws IOException {
        return this.e(-1L, s);
    }

    public static void f(BufferedWriter bufferedWriter0) {
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(strictMode$ThreadPolicy0).permitUnbufferedIo().build());
        try {
            bufferedWriter0.flush();
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
    }

    public void flush() throws IOException {
        synchronized(this) {
            if(this.i != null) {
                this.m();
                DiskLruCache.f(this.i);
                return;
            }
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean g() {
        return this.k >= 2000 && this.k >= this.j.size();
    }

    public Value get(String s) throws IOException {
        synchronized(this) {
            if(this.i != null) {
                a a0 = (a)this.j.get(s);
                if(a0 == null) {
                    return null;
                }
                if(!a0.e) {
                    return null;
                }
                File[] arr_file = a0.c;
                for(int v1 = 0; v1 < arr_file.length; ++v1) {
                    if(!arr_file[v1].exists()) {
                        return null;
                    }
                }
                ++this.k;
                this.i.append("READ");
                this.i.append(' ');
                this.i.append(s);
                this.i.append('\n');
                if(this.g()) {
                    this.m.submit(this.n);
                }
                return new Value(this, s, a0.g, a0.c, a0.b);
            }
        }
        throw new IllegalStateException("cache is closed");
    }

    public File getDirectory() {
        return this.a;
    }

    public long getMaxSize() {
        synchronized(this) {
        }
        return this.f;
    }

    public final void h() {
        DiskLruCache.d(this.c);
        Iterator iterator0 = this.j.values().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            a a0 = (a)object0;
            int v = this.g;
            int v1 = 0;
            if(a0.f == null) {
                while(v1 < v) {
                    this.h += a0.b[v1];
                    ++v1;
                }
            }
            else {
                a0.f = null;
                while(v1 < v) {
                    DiskLruCache.d(a0.c[v1]);
                    DiskLruCache.d(a0.d[v1]);
                    ++v1;
                }
                iterator0.remove();
            }
        }
    }

    public final void i() {
        File file0 = this.b;
        d d0 = new d(new FileInputStream(file0), e.a);
        try {
            String s = d0.a();
            String s1 = d0.a();
            String s2 = d0.a();
            String s3 = d0.a();
            String s4 = d0.a();
            if(!"libcore.io.DiskLruCache".equals(s) || !"1".equals(s1) || !Integer.toString(this.e).equals(s2) || !Integer.toString(this.g).equals(s3) || !"".equals(s4)) {
                throw new IOException("unexpected journal header: [" + s + ", " + s1 + ", " + s3 + ", " + s4 + "]");
            }
            int v = 0;
            try {
                while(true) {
                    this.j(d0.a());
                    ++v;
                }
            }
            catch(EOFException unused_ex) {
            }
            this.k = v - this.j.size();
            if(d0.e == -1) {
                this.k();
            }
            else {
                this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file0, true), e.a));
            }
        }
        catch(Throwable throwable0) {
            goto label_24;
        }
        try {
            d0.close();
            return;
        }
        catch(RuntimeException runtimeException0) {
            throw runtimeException0;
        }
        catch(Exception unused_ex) {
            return;
        }
        try {
        label_24:
            d0.close();
            throw throwable0;
        }
        catch(RuntimeException runtimeException1) {
            throw runtimeException1;
        }
        catch(Exception unused_ex) {
            throw throwable0;
        }
    }

    public boolean isClosed() {
        synchronized(this) {
        }
        return this.i == null;
    }

    public final void j(String s) {
        String[] arr_s;
        String s1;
        int v = s.indexOf(0x20);
        if(v == -1) {
            throw new IOException("unexpected journal line: " + s);
        }
        int v1 = s.indexOf(0x20, v + 1);
        LinkedHashMap linkedHashMap0 = this.j;
        if(v1 == -1) {
            s1 = s.substring(v + 1);
            if(v == 6 && s.startsWith("REMOVE")) {
                linkedHashMap0.remove(s1);
                return;
            }
        }
        else {
            s1 = s.substring(v + 1, v1);
        }
        a a0 = (a)linkedHashMap0.get(s1);
        if(a0 == null) {
            a0 = new a(this, s1);
            linkedHashMap0.put(s1, a0);
        }
        if(v1 != -1 && v == 5 && s.startsWith("CLEAN")) {
            arr_s = s.substring(v1 + 1).split(" ");
            a0.e = true;
            a0.f = null;
            if(arr_s.length != a0.h.g) {
                throw new IOException("unexpected journal line: " + Arrays.toString(arr_s));
            }
            try {
                for(int v2 = 0; v2 < arr_s.length; ++v2) {
                    a0.b[v2] = Long.parseLong(arr_s[v2]);
                }
            }
            catch(NumberFormatException unused_ex) {
                throw new IOException("unexpected journal line: " + Arrays.toString(arr_s));
            }
            return;
        }
        if(v1 == -1 && v == 5 && s.startsWith("DIRTY")) {
            a0.f = new Editor(this, a0);
            return;
        }
        if(v1 == -1 && v == 4 && s.startsWith("READ")) {
            try {
                return;
            }
            catch(NumberFormatException unused_ex) {
                throw new IOException("unexpected journal line: " + Arrays.toString(arr_s));
            }
        }
        throw new IOException("unexpected journal line: " + s);
    }

    public final void k() {
        synchronized(this) {
            BufferedWriter bufferedWriter0 = this.i;
            if(bufferedWriter0 != null) {
                DiskLruCache.c(bufferedWriter0);
            }
            BufferedWriter bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), e.a));
            try {
                bufferedWriter1.write("libcore.io.DiskLruCache");
                bufferedWriter1.write("\n");
                bufferedWriter1.write("1");
                bufferedWriter1.write("\n");
                bufferedWriter1.write(Integer.toString(this.e));
                bufferedWriter1.write("\n");
                bufferedWriter1.write(Integer.toString(this.g));
                bufferedWriter1.write("\n");
                bufferedWriter1.write("\n");
                for(Object object0: this.j.values()) {
                    a a0 = (a)object0;
                    if(a0.f == null) {
                        bufferedWriter1.write("CLEAN " + a0.a + a0.a() + '\n');
                    }
                    else {
                        bufferedWriter1.write("DIRTY " + a0.a + '\n');
                    }
                }
            }
            finally {
                DiskLruCache.c(bufferedWriter1);
            }
            if(this.b.exists()) {
                DiskLruCache.l(this.b, this.d, true);
            }
            DiskLruCache.l(this.c, this.b, false);
            this.d.delete();
            this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), e.a));
        }
    }

    public static void l(File file0, File file1, boolean z) {
        if(z) {
            DiskLruCache.d(file1);
        }
        if(!file0.renameTo(file1)) {
            throw new IOException();
        }
    }

    public final void m() {
        while(this.h > this.f) {
            Object object0 = this.j.entrySet().iterator().next();
            this.remove(((String)((Map.Entry)object0).getKey()));
        }
    }

    public static DiskLruCache open(File file0, int v, int v1, long v2) throws IOException {
        if(v2 <= 0L) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if(v1 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file1 = new File(file0, "journal.bkp");
        if(file1.exists()) {
            File file2 = new File(file0, "journal");
            if(file2.exists()) {
                file1.delete();
            }
            else {
                DiskLruCache.l(file1, file2, false);
            }
        }
        DiskLruCache diskLruCache0 = new DiskLruCache(file0, v, v1, v2);
        if(diskLruCache0.b.exists()) {
            try {
                diskLruCache0.i();
                diskLruCache0.h();
                return diskLruCache0;
            }
            catch(IOException iOException0) {
                System.out.println("DiskLruCache " + file0 + " is corrupt: " + iOException0.getMessage() + ", removing");
                diskLruCache0.delete();
            }
        }
        file0.mkdirs();
        DiskLruCache diskLruCache1 = new DiskLruCache(file0, v, v1, v2);
        diskLruCache1.k();
        return diskLruCache1;
    }

    public boolean remove(String s) throws IOException {
        synchronized(this) {
            if(this.i != null) {
                a a0 = (a)this.j.get(s);
                if(a0 != null && a0.f == null) {
                    for(int v1 = 0; v1 < this.g; ++v1) {
                        File file0 = a0.c[v1];
                        if(file0.exists() && !file0.delete()) {
                            throw new IOException("failed to delete " + file0);
                        }
                        this.h -= a0.b[v1];
                        a0.b[v1] = 0L;
                    }
                    ++this.k;
                    this.i.append("REMOVE");
                    this.i.append(' ');
                    this.i.append(s);
                    this.i.append('\n');
                    this.j.remove(s);
                    if(this.g()) {
                        this.m.submit(this.n);
                    }
                    return true;
                }
                return false;
            }
        }
        throw new IllegalStateException("cache is closed");
    }

    public void setMaxSize(long v) {
        synchronized(this) {
            this.f = v;
            this.m.submit(this.n);
        }
    }

    public long size() {
        synchronized(this) {
        }
        return this.h;
    }
}

