***FreeNotes***
The application which started with only a textView now is very near to it’s goal  or objective. According to us, the app is never completed because there is always a chance to update or add new features . We had developed a normal usable app but our goal is to make the app  a more general perspective app. The android studio contains an activity which has two components : kotlin file and xml file .

**Xml file** - Xml file contains all the code for the user interface . How user will see the graphics is done by this file

**Kotlin file** - Kotline file contains all the backend work done by it’s associated xml file

In our app , till now there is four xml file and four kotin file .The xml file names are activity_main, activity_book_preview, activity_bookdetail, item_detail . The kotlin file are Adapter, bookDetail,BookPreview,MainActivity and upload book.The each file has its own importance 







 


Kotlin file -
MainActivity.kt -
In this Activity we Are Fetching  various id from MainActivity xml file. This Activity contains an ArrayList which contains an objects of book_detail class. In this Activity, we had override some function’s such as onCreateOptionsMen, onQueryTextChange.  We have also added a search button and it’s code is in this MainActivity . Below is the ScreenShot of this Activity -

 

 

 

Adapter.kt
This file name is adapter and contain’s the code for an adapter. An Adapter object acts as a bridge between an AdapterView and the underlying data for that view. The Adapter provides access to the data items. The Adapter is also responsible for making a View for each item in the data set. The file contains a class called  ViewHolder class.The adapter override various functions such as onCreateViewHolder, onBindViewHolder, getItemCount. Each file has its own function’s and it’s code

 

 

UploadBook.kt
This file contains the code for uploading a book from a user android device . This file uses an explicit intent so that the user can select a book from it’s device. This also contain the code for  uploading a book on firebase .

 

 

And their are other kotlin file also such as book_detail , book_preview which does not contain so much data

 

XML file -
An XML file is an extensible markup language file, and it is used to structure data for storage and transport. In an XML file, there are both tags and text. The tags provide the structure to the data.

Below are the screenshots of the xml file’s

 

 

 

 


 

 

 

Download and upload rough code which we have used to develop our application -

For uploading File -

Uri file = Uri.fromFile(new File("path/to/images/rivers.jpg"));

StorageReference riversRef = storageRef.child("images/rivers.jpg");

 

riversRef.putFile(file)

    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {

        @Override

        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

            // Get a URL to the uploaded content

            Uri downloadUrl = taskSnapshot.getDownloadUrl();

        }

    })

    .addOnFailureListener(new OnFailureListener() {

        @Override

        public void onFailure(@NonNull Exception exception) {

            // Handle unsuccessful uploads

            // ...

        }

    });

 

For Downloading File -

 

File localFile = File.createTempFile("images", "jpg");

riversRef.getFile(localFile)

    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {

        @Override

        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {

            // Successfully downloaded data to local file

            // ...

        }

    }).addOnFailureListener(new OnFailureListener() {

        @Override

        public void onFailure(@NonNull Exception exception) {

            // Handle failed download

            // ...

        }

    });


