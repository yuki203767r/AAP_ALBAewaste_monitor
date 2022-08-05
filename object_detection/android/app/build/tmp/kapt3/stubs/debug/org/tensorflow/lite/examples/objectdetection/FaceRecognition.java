package org.tensorflow.lite.examples.objectdetection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\fH\u0004J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018J\"\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0012\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0006\u0010\t\u001a\u00020\fJ\u000e\u0010\"\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010#\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018J\"\u0010$\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/FaceRecognition;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "file_path", "", "getFile_path", "()Ljava/lang/String;", "setFile_path", "(Ljava/lang/String;)V", "pickImage", "Landroid/widget/Button;", "UploadFile", "", "captureImage", "displayMessage", "context", "Landroid/content/Context;", "message", "getPhotoFile", "Ljava/io/File;", "fileName", "initDialog", "notRegisteredUser", "view", "Landroid/view/View;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "registeredUser", "skipTo", "uritoFile", "uri", "Landroid/net/Uri;", "UploadTask", "app_debug"})
public final class FaceRecognition extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.Button pickImage;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String file_path;
    private java.util.HashMap _$_findViewCache;
    
    public FaceRecognition() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFile_path() {
        return null;
    }
    
    public final void setFile_path(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void pickImage() {
    }
    
    private final void captureImage() {
    }
    
    private final java.io.File getPhotoFile(java.lang.String fileName) {
        return null;
    }
    
    private final void displayMessage(android.content.Context context, java.lang.String message) {
    }
    
    protected final void initDialog() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void UploadFile() {
    }
    
    public final void skipTo(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void registeredUser(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void notRegisteredUser(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final java.io.File uritoFile(android.content.Context context, android.net.Uri uri, java.lang.String fileName) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J!\u0010\b\u001a\u00020\u00022\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\n\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0004J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\b\u0010\u0010\u001a\u00020\rH\u0014J\b\u0010\u0011\u001a\u00020\rH\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/FaceRecognition$UploadTask;", "Landroid/os/AsyncTask;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "doInBackground", "strings", "", "([Ljava/lang/String;)Ljava/lang/String;", "hidepDialog", "", "onPostExecute", "s", "onPreExecute", "showpDialog", "uploadFile", "", "path", "app_debug"})
    public static final class UploadTask extends android.os.AsyncTask<java.lang.String, java.lang.String, java.lang.String> {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        
        public UploadTask(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.NotNull()
        java.lang.String s) {
        }
        
        @java.lang.Override()
        protected void onPreExecute() {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.String doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... strings) {
            return null;
        }
        
        protected final void showpDialog() {
        }
        
        protected final void hidepDialog() {
        }
        
        private final boolean uploadFile(java.lang.String path) {
            return false;
        }
    }
}