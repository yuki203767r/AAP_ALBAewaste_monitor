package org.tensorflow.lite.examples.objectdetection

//import retrofit2.Call
//import retrofit2.Callback

import android.app.Activity
import android.app.AlertDialog
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.graphics.Matrix
import android.net.Uri
import android.os.AsyncTask
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.core.content.FileProvider
import kotlinx.android.synthetic.main.activity_face_recognition.*
import kotlinx.android.synthetic.main.activity_face_recognition.view.*
import okhttp3.*
import org.json.JSONArray
import org.json.JSONObject
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.util.concurrent.TimeUnit


private const val FILE_NAME = "photo.jpg"
private const val REQUEST_CODE = 42
private lateinit var photoFile: File
private val url = "http://10.0.2.2:5000/recog"
private lateinit var pDialog:AlertDialog
private var imageHehe: ByteArrayOutputStream? = null
private lateinit var abc:String

class FaceRecognition : AppCompatActivity() {
//    private lateinit var pickImage: Button
    var file_path: String? = null
    private lateinit var countDownTimer:CountDownTimer
    private var timeLeftMilliSeconds:Long = 6000
    var timerRunning:Boolean? = null
    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_face_recognition)
        initDialog()
        startStop()
//        pickImage = findViewById(R.id.pickImage) as Button
        tv = findViewById(R.id.tv) as TextView

//        pickImage.setOnClickListener{
//            pickImage()
//        }
//
//        button_capture.setOnClickListener {
//            captureImage()
//
//        }
    }

    private fun startStop() {
        if (timerRunning == true){
            stopTimer()
        }
        else{
            startTimer()
        }
    }

    private fun stopTimer() {
        countDownTimer.cancel()
        timerRunning = false

    }

    private fun startTimer() {
        countDownTimer = object : CountDownTimer(timeLeftMilliSeconds, 1000) {
            override fun onFinish() {
                captureImage()

            }

            override fun onTick(p0: Long) {
                timeLeftMilliSeconds = p0
                updateTimer()
            }
        }.start()

        timerRunning = true

    }

    private fun updateTimer(){
        var seconds = timeLeftMilliSeconds % 60000/1000
        var timeLeftText = "" + seconds
        tv.text = timeLeftText
    }
    public fun pickImage(){
        var intentimage = Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intentimage,3)
    }


    private fun captureImage() {
        var takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        photoFile = getPhotoFile(FILE_NAME)
        val fileProvider = FileProvider.getUriForFile(this, "org.tensorflow.lite.examples.fileprovider", photoFile)
        takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, fileProvider)
        takePictureIntent.putExtra("android.intent.extras.CAMERA_FACING", 1)


        try{
//        if (takePictureIntent.resolveActivity(this.packageManager) != null) {

            startActivityForResult(takePictureIntent, REQUEST_CODE)
//        } else {
//            Toast.makeText(this, "Unable to open camera", Toast.LENGTH_SHORT).show()
//        }
        }
        catch (e: ActivityNotFoundException) {
            Log.d("hello",e.toString())
        }
    }

    private fun getPhotoFile(fileName: String): File {
        // Use `getExternalFilesDir` on Context to access package-specific directories.
        val storageDirectory = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        return File.createTempFile(fileName, ".jpg", storageDirectory)
    }


    private fun displayMessage(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    protected fun initDialog() {

//        pDialog = ProgressDialog(this)
//        pDialog.setMessage("Loading..")
//        pDialog.setCancelable(true)
        val llPadding = 30
        val ll = LinearLayout(this)
        ll.orientation = LinearLayout.HORIZONTAL
        ll.setPadding(llPadding, llPadding, llPadding, llPadding)
        ll.gravity = Gravity.CENTER
        var llParam = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        llParam.gravity = Gravity.CENTER
        ll.layoutParams = llParam

        val progressBar = ProgressBar(this)
        progressBar.isIndeterminate = true
        progressBar.setPadding(0, 0, llPadding, 0)
        progressBar.layoutParams = llParam

        llParam = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        llParam.gravity = Gravity.CENTER
        val tvText = TextView(this)
        tvText.text = "Loading ..."
        tvText.setTextColor(Color.parseColor("#000000"));
        tvText.setTextSize(20F);
        tvText.setLayoutParams(llParam);

        ll.addView(progressBar);
        ll.addView(tvText);

        var builder = AlertDialog.Builder(this)

        builder.setCancelable(true);
        builder.setView(ll);
        pDialog = builder.create()


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK) {
//            val takenImage = data?.extras?.get("data") as Bitmap
            Log.e("index", "index=" + photoFile.absolutePath);
            var takenImage = BitmapFactory.decodeFile(photoFile.absolutePath)
            val matrix: Matrix = Matrix()
            matrix.postRotate(0f)
            takenImage = Bitmap.createBitmap(takenImage, 0, 0, takenImage.width, takenImage.height, matrix, true)

            imageView.setImageBitmap(takenImage)
            var bo = ByteArrayOutputStream()

            takenImage.compress(Bitmap.CompressFormat.JPEG, 100, bo)
            imageHehe = bo

            this.file_path=photoFile.absolutePath;

            if(file_path!=null){
                UploadFile();
            }
            else{
                Toast.makeText(this@FaceRecognition, "Please Select File First", Toast.LENGTH_SHORT).show();
            }

//            tv.text = abc

                    //Your code goes here
//            postphoto(photoFile.absolutePath)



        }
        else if (resultCode == RESULT_OK && data!= null){
            var selectedImage = data.data
            var imageuri = getPhotoFile("test.jpg")

            var bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(),
                selectedImage);

            var bos = ByteArrayOutputStream()

            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bos)
            var bitmapdata = bos.toByteArray()
            var fos = FileOutputStream(imageuri)

            fos.write(bitmapdata)
            fos.flush()
            fos.close()


            Log.e("pickimage", imageuri.absolutePath);
//            postphoto(imageuri.absolutePath)
            this.file_path=imageuri.absolutePath;

            if(file_path!=null){
                UploadFile();
            }
            else{
                Toast.makeText(this@FaceRecognition, "Please Select File First", Toast.LENGTH_SHORT).show();
            }
//            imageView.setImageBitmap(takenImage)
        }

        else {
            super.onActivityResult(requestCode, resultCode, data)
        }

    }



    private fun UploadFile() {
        val uploadTask = UploadTask(this)
        uploadTask.execute(file_path)

    }



    class UploadTask(val context: Context) : AsyncTask<String, String, String>() {
        var json = ""
        var person = ""
        var score = ""

        lateinit var objectjson:JSONObject
            override fun onPostExecute(s: String) {
                super.onPostExecute(s)
//            progressBar.setVisibility(View.GONE)
                hidepDialog()
                if (s.equals("true", ignoreCase = true)) {


                    Toast.makeText(context, "File uploaded", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Failed Upload", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onPreExecute() {
                super.onPreExecute()
//            progressBar.setVisibility(View.VISIBLE)
//            initDialog()
                showpDialog()
            }

            override fun doInBackground(vararg strings: String): String {
                return if (uploadFile(strings[0])) {

                    "true"

                } else {
                    "failed"
                }
            }


            protected fun showpDialog() {

                if (!pDialog.isShowing)
                    pDialog.show();
                var window = pDialog.getWindow();
                if (window != null) {
                    var layoutParams = WindowManager.LayoutParams();
                    layoutParams.copyFrom(pDialog.getWindow()?.getAttributes());
                    layoutParams.width = LinearLayout.LayoutParams.WRAP_CONTENT;
                    layoutParams.height = LinearLayout.LayoutParams.WRAP_CONTENT;
                    pDialog.getWindow()?.setAttributes(layoutParams);
                }

            }

            protected fun hidepDialog() {

                if (pDialog.isShowing) pDialog.dismiss()
            }


            private fun uploadFile(path: String): Boolean {
                val file = File(path)



                return try {
                    val requestBody: RequestBody =
                        MultipartBody.Builder().setType(MultipartBody.FORM)
                            .addFormDataPart(
                                "image",
                                file.name,
                                RequestBody.create(
                                    MediaType.parse("image/*"),
                                    imageHehe!!.toByteArray()

                                )
                            )
                            .build()

                    val request: Request = Request.Builder()
                        .url("http://10.0.2.2:80/recog")
                        .post(requestBody)
                        .build()

                    var client = OkHttpClient.Builder()
                        .connectTimeout(60, TimeUnit.SECONDS)
                        .writeTimeout(60, TimeUnit.SECONDS)
                        .build()


                    client.newCall(request).enqueue(object : Callback {
                        override fun onFailure(call: Call, e: IOException) {
                            e.printStackTrace()
                        }

                        @Throws(IOException::class)
                        override fun onResponse(call: Call, response: okhttp3.Response) {
                            var response = response.body()!!
                            json = response.string()
//                        json = JSONObject(response.body()?.toString())
                            Log.d("cool beans", json.toString())

                            val tv =
                                (context as Activity).findViewById<View>(R.id.tv) as TextView
                            context.runOnUiThread(java.lang.Runnable {
                                objectjson = JSONObject(json)
                                //RESULT
                                person = objectjson.getString("person")
                                score = objectjson.getString("score")

                                if (person in arrayOf("Celeste","Shaqilah","Yuki","Siqi","Adam Sandloer","Zendaya","Timothee"))
                                {
                                    tv.text = person
                                    val registeredUser = Intent(context, Registered::class.java)
                                    registeredUser.putExtra("person", person)
                                    registeredUser.putExtra("score", score)

                                    context.startActivity(registeredUser)
                                }else{
                                    val notRegisteredUser = Intent(context, NotRegistered::class.java)
                                    context.startActivity(notRegisteredUser)
                                }

                            })



                        }


                    })
                    return true
                } catch (e: java.lang.Exception) {
                    e.printStackTrace()
                    false
                }
            }


    }

    fun skipTo(view: View) {
        // Do something in response to button click
        val skipTo = Intent(this, DisposeEwaste::class.java)
        startActivity(skipTo)
    }

    fun registeredUser(view: View) {
        // Do something in response to button click
        val registeredUser = Intent(this, Registered::class.java)
//        registeredUser.putExtra(MediaStore.EXTRA_OUTPUT, )

        startActivity(registeredUser)
    }

    fun notRegisteredUser(view: View) {
        // Do something in response to button click
        val notRegisteredUser = Intent(this, NotRegistered::class.java)
        startActivity(notRegisteredUser)
    }

    private fun uritoFile(context:Context, uri: Uri, fileName:String):File?{
        context.contentResolver.openInputStream(uri)?.let{ inputStream ->
            var tempFile:File = getPhotoFile("test.jpg")
            var fileOutputStream = FileOutputStream(tempFile)

            inputStream.copyTo(fileOutputStream)
            inputStream.close()
            fileOutputStream.close()

            return tempFile
        }
            return null
    }



}